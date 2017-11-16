package com.tencent.tmassistantsdk.downloadservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Message;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.tmassistantsdk.util.GlobalUtil;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.ArrayList;
import java.util.Iterator;

public class NetworkMonitorReceiver
  extends BroadcastReceiver
{
  protected static final int MSG_DELAY_TIME = 3500;
  protected static final int MSG_resumeDownloadTime = 67;
  protected static final String TAG = "NetworkMonitorReceiver";
  protected static NetworkMonitorReceiver mInstance = null;
  protected boolean isRegisterReceiver = false;
  protected final ae mNetworkChangedHandler = new ae()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      switch (paramAnonymousMessage.what)
      {
      default: 
        return;
      }
      NetworkMonitorReceiver.this.notifyNetworkChanged();
    }
  };
  ArrayList<INetworkChangedObserver> mObs = new ArrayList();
  
  public static NetworkMonitorReceiver getInstance()
  {
    try
    {
      if (mInstance == null) {
        mInstance = new NetworkMonitorReceiver();
      }
      NetworkMonitorReceiver localNetworkMonitorReceiver = mInstance;
      return localNetworkMonitorReceiver;
    }
    finally {}
  }
  
  public void addNetworkChangedObserver(INetworkChangedObserver paramINetworkChangedObserver)
  {
    if ((!this.mObs.contains(paramINetworkChangedObserver)) && (paramINetworkChangedObserver != null)) {
      this.mObs.add(paramINetworkChangedObserver);
    }
  }
  
  public void notifyNetworkChanged()
  {
    Iterator localIterator = this.mObs.iterator();
    while (localIterator.hasNext()) {
      ((INetworkChangedObserver)localIterator.next()).onNetworkChanged();
    }
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    TMLog.i("NetworkMonitorReceiver", "network changed!");
    this.mNetworkChangedHandler.removeMessages(67);
    paramContext = Message.obtain();
    paramContext.what = 67;
    this.mNetworkChangedHandler.sendMessageDelayed(paramContext, 3500L);
  }
  
  public void registerReceiver()
  {
    Context localContext = GlobalUtil.getInstance().getContext();
    if (localContext == null) {
      return;
    }
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    try
    {
      localContext.registerReceiver(this, localIntentFilter);
      this.isRegisterReceiver = true;
      return;
    }
    catch (Throwable localThrowable)
    {
      this.isRegisterReceiver = false;
      w.printErrStackTrace("NetworkMonitorReceiver", localThrowable, "", new Object[0]);
    }
  }
  
  public void removeNetworkChangedObserver(INetworkChangedObserver paramINetworkChangedObserver)
  {
    if (paramINetworkChangedObserver != null) {
      this.mObs.remove(paramINetworkChangedObserver);
    }
  }
  
  public void unregisterReceiver()
  {
    if (mInstance == null) {}
    for (;;)
    {
      return;
      Context localContext = GlobalUtil.getInstance().getContext();
      if (localContext != null) {
        try
        {
          if (this.isRegisterReceiver)
          {
            localContext.unregisterReceiver(this);
            this.isRegisterReceiver = false;
            return;
          }
        }
        catch (Throwable localThrowable)
        {
          w.printErrStackTrace("NetworkMonitorReceiver", localThrowable, "", new Object[0]);
        }
      }
    }
  }
  
  public static abstract interface INetworkChangedObserver
  {
    public abstract void onNetworkChanged();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tmassistantsdk\downloadservice\NetworkMonitorReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */