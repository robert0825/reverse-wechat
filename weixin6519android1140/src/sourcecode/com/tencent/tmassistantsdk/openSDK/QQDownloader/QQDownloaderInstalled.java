package com.tencent.tmassistantsdk.openSDK.QQDownloader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.tmassistantsdk.util.TMLog;

public class QQDownloaderInstalled
  extends BroadcastReceiver
{
  private static final String TAG = "QQDownloaderInstalled";
  protected static QQDownloaderInstalled mInstance = null;
  protected boolean isRegisted = false;
  protected IQQDownloaderInstalled mListener = null;
  
  public static QQDownloaderInstalled getInstance()
  {
    try
    {
      if (mInstance == null) {
        mInstance = new QQDownloaderInstalled();
      }
      QQDownloaderInstalled localQQDownloaderInstalled = mInstance;
      return localQQDownloaderInstalled;
    }
    finally {}
  }
  
  public void onReceive(final Context paramContext, Intent paramIntent)
  {
    TMLog.i("QQDownloaderInstalled", "onReceive!");
    new Thread()
    {
      public void run()
      {
        if (QQDownloaderInstalled.this.mListener != null) {
          QQDownloaderInstalled.this.mListener.onQQDownloaderInstalled(paramContext);
        }
      }
    }.start();
  }
  
  public void registeListener(IQQDownloaderInstalled paramIQQDownloaderInstalled)
  {
    this.mListener = paramIQQDownloaderInstalled;
  }
  
  public void registeReceiver(Context paramContext)
  {
    if (!this.isRegisted) {
      TMLog.i("QQDownloaderInstalled", "registeReceiver   context" + paramContext + "  receiver:" + this);
    }
    try
    {
      this.isRegisted = true;
      return;
    }
    catch (Throwable paramContext)
    {
      TMLog.i("QQDownloaderInstalled", "registeReceiver exception!!!");
      this.isRegisted = false;
      w.printErrStackTrace("QQDownloaderInstalled", paramContext, "", new Object[0]);
    }
  }
  
  public void unRegisteReceiver(Context paramContext)
  {
    if ((paramContext == null) || (mInstance == null)) {}
    while (!this.isRegisted) {
      return;
    }
    TMLog.i("QQDownloaderInstalled", "realy unRegisteReceiver  context:" + paramContext + "  receiver:" + this);
    try
    {
      this.isRegisted = false;
      return;
    }
    catch (Throwable paramContext)
    {
      TMLog.i("QQDownloaderInstalled", "unRegisteReceiver exception!!!");
      this.isRegisted = false;
      w.printErrStackTrace("QQDownloaderInstalled", paramContext, "", new Object[0]);
    }
  }
  
  public void unregisteListener()
  {
    this.mListener = null;
  }
  
  public static abstract interface IQQDownloaderInstalled
  {
    public abstract void onQQDownloaderInstalled(Context paramContext);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tmassistantsdk\openSDK\QQDownloader\QQDownloaderInstalled.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */