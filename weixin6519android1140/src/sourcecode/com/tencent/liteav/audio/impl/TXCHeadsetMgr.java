package com.tencent.liteav.audio.impl;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile.ServiceListener;
import android.content.BroadcastReceiver;
import android.content.Context;

public class TXCHeadsetMgr
{
  private static final String TAG = TXCHeadsetMgr.class.getSimpleName();
  private BluetoothHeadset mBluetoothHeadset;
  private Context mContext;
  private BroadcastReceiver mEraPhoneReceiver;
  private BluetoothProfile.ServiceListener mProfileListener;
  private boolean mRegistered = false;
  
  public TXCHeadsetMgr(Context paramContext) {}
  
  private void checkBTHeadsetState(BluetoothDevice paramBluetoothDevice) {}
  
  public void register() {}
  
  public void unRegister() {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\audio\impl\TXCHeadsetMgr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */