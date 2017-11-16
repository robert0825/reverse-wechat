package com.tencent.tmassistantsdk.openSDK;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.HandlerThread;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.ArrayList;
import java.util.Iterator;

public class DownloadStateChangedReceiver
  extends BroadcastReceiver
{
  private static final String TAG = "DownloadStateChangedReceiver";
  protected static DownloadStateChangedReceiver mInstance = null;
  protected ae handler = null;
  protected HandlerThread handlerThread = new HandlerThread("downloadStateChangedThread");
  protected boolean isRegisted = false;
  ArrayList<IDownloadStateChangedListener> mListeners = new ArrayList();
  
  public DownloadStateChangedReceiver()
  {
    this.handlerThread.start();
    this.handler = new ae(this.handlerThread.getLooper());
  }
  
  public static DownloadStateChangedReceiver getInstance()
  {
    try
    {
      if (mInstance == null) {
        mInstance = new DownloadStateChangedReceiver();
      }
      DownloadStateChangedReceiver localDownloadStateChangedReceiver = mInstance;
      return localDownloadStateChangedReceiver;
    }
    finally {}
  }
  
  public void addDownloadStateChangedListener(IDownloadStateChangedListener paramIDownloadStateChangedListener)
  {
    if ((paramIDownloadStateChangedListener != null) && (!this.mListeners.contains(paramIDownloadStateChangedListener))) {
      this.mListeners.add(paramIDownloadStateChangedListener);
    }
  }
  
  public void onReceive(Context paramContext, final Intent paramIntent)
  {
    if (this.handler != null) {
      this.handler.post(new Runnable()
      {
        public void run()
        {
          TMQQDownloaderStateChangeParam localTMQQDownloaderStateChangeParam = new TMQQDownloaderStateChangeParam();
          localTMQQDownloaderStateChangeParam.hostPackageName = paramIntent.getStringExtra("hostPackageName");
          localTMQQDownloaderStateChangeParam.hostVersion = paramIntent.getStringExtra("hostVersion");
          localTMQQDownloaderStateChangeParam.taskId = paramIntent.getStringExtra("taskId");
          localTMQQDownloaderStateChangeParam.errorCode = bg.getInt(paramIntent.getStringExtra("errorCode"), 0);
          localTMQQDownloaderStateChangeParam.errorMsg = paramIntent.getStringExtra("errorMsg");
          localTMQQDownloaderStateChangeParam.state = bg.getInt(paramIntent.getStringExtra("state"), 0);
          Object localObject = new TMQQDownloaderOpenSDKParam();
          ((TMQQDownloaderOpenSDKParam)localObject).SNGAppId = paramIntent.getStringExtra("sngAppId");
          ((TMQQDownloaderOpenSDKParam)localObject).taskAppId = paramIntent.getStringExtra("taskAppId");
          ((TMQQDownloaderOpenSDKParam)localObject).taskApkId = paramIntent.getStringExtra("taskApkId");
          ((TMQQDownloaderOpenSDKParam)localObject).taskPackageName = paramIntent.getStringExtra("taskPackageName");
          ((TMQQDownloaderOpenSDKParam)localObject).taskVersion = bg.getInt(paramIntent.getStringExtra("taskVersion"), 0);
          ((TMQQDownloaderOpenSDKParam)localObject).via = paramIntent.getStringExtra("via");
          ((TMQQDownloaderOpenSDKParam)localObject).uin = paramIntent.getStringExtra("uin");
          ((TMQQDownloaderOpenSDKParam)localObject).uinType = paramIntent.getStringExtra("uinType");
          localTMQQDownloaderStateChangeParam.param = ((TMQQDownloaderOpenSDKParam)localObject);
          localObject = DownloadStateChangedReceiver.this.mListeners.iterator();
          while (((Iterator)localObject).hasNext()) {
            ((IDownloadStateChangedListener)((Iterator)localObject).next()).onDownloadStateChanged(localTMQQDownloaderStateChangeParam);
          }
        }
      });
    }
  }
  
  public void registeReceiver(Context paramContext)
  {
    IntentFilter localIntentFilter;
    if (!this.isRegisted)
    {
      TMLog.i("DownloadStateChangedReceiver", "registeReceiver   context" + paramContext + "  receiver:" + this);
      localIntentFilter = new IntentFilter("com.tencent.assistantOpenSDK.downloadStateChange.action");
    }
    try
    {
      TMLog.i("DownloadStateChangedReceiver", String.valueOf(paramContext.registerReceiver(this, localIntentFilter)));
      this.isRegisted = true;
      return;
    }
    catch (Throwable paramContext)
    {
      TMLog.i("DownloadStateChangedReceiver", "registeReceiver exception!!!");
      this.isRegisted = false;
      w.printErrStackTrace("DownloadStateChangedReceiver", paramContext, "", new Object[0]);
    }
  }
  
  public void removeDownloadStateChangedListener(IDownloadStateChangedListener paramIDownloadStateChangedListener)
  {
    if (paramIDownloadStateChangedListener != null) {
      this.mListeners.remove(paramIDownloadStateChangedListener);
    }
  }
  
  public void unRegisteReceiver(Context paramContext)
  {
    if ((paramContext == null) || (mInstance == null)) {}
    while (!this.isRegisted) {
      return;
    }
    TMLog.i("DownloadStateChangedReceiver", "realy unRegisteReceiver  context:" + paramContext + "  receiver:" + this);
    try
    {
      paramContext.unregisterReceiver(this);
      this.isRegisted = false;
      return;
    }
    catch (Throwable paramContext)
    {
      TMLog.i("DownloadStateChangedReceiver", "unRegisteReceiver exception!!!");
      this.isRegisted = false;
      w.printErrStackTrace("DownloadStateChangedReceiver", paramContext, "", new Object[0]);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tmassistantsdk\openSDK\DownloadStateChangedReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */