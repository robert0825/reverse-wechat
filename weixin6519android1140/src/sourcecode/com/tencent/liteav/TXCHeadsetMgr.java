package com.tencent.liteav;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.bluetooth.BluetoothProfile.ServiceListener;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.tencent.liteav.audio.impl.TXCAudioJNI;
import com.tencent.liteav.audio.impl.TXCAudioPlayerWrapper;
import com.tencent.liteav.basic.log.TXCLog;
import java.util.List;

public class TXCHeadsetMgr
{
  public static final String TAG = TXCHeadsetMgr.class.getSimpleName();
  public BluetoothHeadset mBluetoothHeadset;
  private Context mContext;
  private BroadcastReceiver mEraPhoneReceiver;
  private BluetoothProfile.ServiceListener mProfileListener;
  private boolean mRegistered = false;
  
  public TXCHeadsetMgr(Context paramContext)
  {
    this.mContext = paramContext;
    this.mEraPhoneReceiver = new BroadcastReceiver()
    {
      public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        if (paramAnonymousIntent.getAction().equals("android.intent.action.HEADSET_PLUG")) {
          if (paramAnonymousIntent.hasExtra("state"))
          {
            if (paramAnonymousIntent.getIntExtra("state", 0) != 0) {
              break label49;
            }
            TXCAudioJNI.setHeadsetOn(false);
            TXCLog.d(TXCHeadsetMgr.TAG, "耳机拔出");
            TXCAudioPlayerWrapper.setSpeakerphoneOn(paramAnonymousContext, true);
          }
        }
        label49:
        do
        {
          do
          {
            return;
          } while (1 != paramAnonymousIntent.getIntExtra("state", 0));
          TXCAudioJNI.setHeadsetOn(true);
          TXCLog.d(TXCHeadsetMgr.TAG, "耳机插入");
          TXCAudioPlayerWrapper.setSpeakerphoneOn(paramAnonymousContext, false);
          return;
          paramAnonymousContext = (BluetoothDevice)paramAnonymousIntent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        } while ((paramAnonymousContext == null) || (TXCHeadsetMgr.this.mBluetoothHeadset == null));
        try
        {
          Thread.sleep(500L);
          TXCHeadsetMgr.this.checkBTHeadsetState(paramAnonymousContext);
          return;
        }
        catch (InterruptedException paramAnonymousIntent)
        {
          for (;;) {}
        }
      }
    };
    this.mProfileListener = new BluetoothProfile.ServiceListener()
    {
      public void onServiceConnected(int paramAnonymousInt, BluetoothProfile paramAnonymousBluetoothProfile)
      {
        if (paramAnonymousInt == 1)
        {
          TXCHeadsetMgr.this.mBluetoothHeadset = ((BluetoothHeadset)paramAnonymousBluetoothProfile);
          paramAnonymousBluetoothProfile = TXCHeadsetMgr.this.mBluetoothHeadset.getConnectedDevices();
          if ((paramAnonymousBluetoothProfile != null) && (paramAnonymousBluetoothProfile.size() > 0))
          {
            paramAnonymousBluetoothProfile = (BluetoothDevice)paramAnonymousBluetoothProfile.get(0);
            TXCHeadsetMgr.this.checkBTHeadsetState(paramAnonymousBluetoothProfile);
          }
        }
      }
      
      public void onServiceDisconnected(int paramAnonymousInt)
      {
        if (paramAnonymousInt == 1) {
          TXCHeadsetMgr.this.mBluetoothHeadset = null;
        }
      }
    };
    TXCAudioJNI.setHeadsetOn(((AudioManager)this.mContext.getSystemService("audio")).isWiredHeadsetOn());
    this.mRegistered = false;
  }
  
  public void checkBTHeadsetState(BluetoothDevice paramBluetoothDevice)
  {
    if ((paramBluetoothDevice == null) || (this.mBluetoothHeadset == null)) {
      return;
    }
    int i = this.mBluetoothHeadset.getConnectionState(paramBluetoothDevice);
    TXCLog.d(TAG, "蓝牙耳机状态：" + i);
    switch (i)
    {
    case 1: 
    default: 
      return;
    case 0: 
      TXCAudioJNI.setHeadsetOn(false);
      TXCLog.d(TAG, "蓝牙耳机拔出");
      TXCAudioPlayerWrapper.setSpeakerphoneOn(this.mContext, true);
      return;
    }
    TXCAudioJNI.setHeadsetOn(true);
    TXCLog.d(TAG, "蓝牙耳机插入");
    TXCAudioPlayerWrapper.setSpeakerphoneOn(this.mContext, false);
  }
  
  public void register()
  {
    if (this.mRegistered)
    {
      TXCLog.w(TAG, " repeate register headset, ignore");
      return;
    }
    Object localObject = new IntentFilter();
    ((IntentFilter)localObject).addAction("android.intent.action.HEADSET_PLUG");
    ((IntentFilter)localObject).addAction("android.bluetooth.device.action.ACL_CONNECTED");
    ((IntentFilter)localObject).addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
    ((IntentFilter)localObject).addAction("android.bluetooth.adapter.action.STATE_CHANGED");
    this.mContext.registerReceiver(this.mEraPhoneReceiver, (IntentFilter)localObject);
    localObject = BluetoothAdapter.getDefaultAdapter();
    if (localObject != null) {
      ((BluetoothAdapter)localObject).getProfileProxy(this.mContext, this.mProfileListener, 1);
    }
    this.mRegistered = true;
  }
  
  public void unRegister()
  {
    if (!this.mRegistered) {
      TXCLog.w(TAG, " invalid unregister headset, ignore");
    }
    BluetoothAdapter localBluetoothAdapter;
    do
    {
      return;
      this.mRegistered = false;
      this.mContext.unregisterReceiver(this.mEraPhoneReceiver);
      localBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    } while (localBluetoothAdapter == null);
    localBluetoothAdapter.closeProfileProxy(1, this.mBluetoothHeadset);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\liteav\TXCHeadsetMgr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */