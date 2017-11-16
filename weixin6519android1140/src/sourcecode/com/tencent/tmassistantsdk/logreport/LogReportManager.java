package com.tencent.tmassistantsdk.logreport;

import com.tencent.mm.sdk.platformtools.w;
import com.tencent.tmassistantsdk.downloadservice.DownloadHelper;
import com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver;
import com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver.INetworkChangedObserver;
import com.tencent.tmassistantsdk.util.TMLog;

public class LogReportManager
{
  public static final Class<?>[] REPORT_MANAGERS = { DownloadReportManager.class, TipsInfoReportManager.class, UpdateInfoReportManager.class };
  private static final String TAG = "LogReportManager";
  private static LogReportManager mInstance = null;
  private final NetworkMonitorReceiver.INetworkChangedObserver mNetworkChangedObserver = new NetworkMonitorReceiver.INetworkChangedObserver()
  {
    public void onNetworkChanged()
    {
      TMLog.i("LogReportManager", "onNetworkChanged,netState:" + DownloadHelper.getNetStatus());
      Class[] arrayOfClass = LogReportManager.REPORT_MANAGERS;
      int j = arrayOfClass.length;
      int i = 0;
      for (;;)
      {
        if (i < j)
        {
          Class localClass = arrayOfClass[i];
          try
          {
            if (localClass.equals(DownloadReportManager.class)) {
              DownloadReportManager.getInstance().resetMaxReportCount();
            } else if (localClass.equals(TipsInfoReportManager.class)) {
              TipsInfoReportManager.getInstance().resetMaxReportCount();
            }
          }
          catch (Exception localException)
          {
            w.printErrStackTrace("LogReportManager", localException, "", new Object[0]);
          }
        }
        if (DownloadHelper.isNetworkConncted()) {
          DownloadHelper.getNetStatus().equalsIgnoreCase("wifi");
        }
        return;
        i += 1;
      }
    }
  };
  
  private LogReportManager()
  {
    NetworkMonitorReceiver.getInstance().addNetworkChangedObserver(this.mNetworkChangedObserver);
  }
  
  public static LogReportManager getInstance()
  {
    try
    {
      if (mInstance == null) {
        mInstance = new LogReportManager();
      }
      LogReportManager localLogReportManager = mInstance;
      return localLogReportManager;
    }
    finally {}
  }
  
  public void cancleReport()
  {
    Class[] arrayOfClass = REPORT_MANAGERS;
    int j = arrayOfClass.length;
    int i = 0;
    for (;;)
    {
      if (i < j)
      {
        Class localClass = arrayOfClass[i];
        try
        {
          if (localClass.equals(DownloadReportManager.class)) {
            DownloadReportManager.getInstance().cancleRequest();
          } else if (localClass.equals(TipsInfoReportManager.class)) {
            TipsInfoReportManager.getInstance().cancleRequest();
          }
        }
        catch (Exception localException)
        {
          w.printErrStackTrace("LogReportManager", localException, "", new Object[0]);
        }
      }
      return;
      i += 1;
    }
  }
  
  public void destory()
  {
    Class[] arrayOfClass = REPORT_MANAGERS;
    int j = arrayOfClass.length;
    int i = 0;
    for (;;)
    {
      if (i < j)
      {
        Class localClass = arrayOfClass[i];
        try
        {
          if (localClass.equals(DownloadReportManager.class)) {
            DownloadReportManager.getInstance().destroy();
          } else if (localClass.equals(TipsInfoReportManager.class)) {
            TipsInfoReportManager.getInstance().destroy();
          }
        }
        catch (Exception localException)
        {
          w.printErrStackTrace("LogReportManager", localException, "", new Object[0]);
        }
      }
      NetworkMonitorReceiver.getInstance().removeNetworkChangedObserver(this.mNetworkChangedObserver);
      return;
      i += 1;
    }
  }
  
  public void reportLog()
  {
    Class[] arrayOfClass = REPORT_MANAGERS;
    int j = arrayOfClass.length;
    int i = 0;
    for (;;)
    {
      if (i < j)
      {
        Class localClass = arrayOfClass[i];
        try
        {
          if (localClass.equals(DownloadReportManager.class)) {
            DownloadReportManager.getInstance().reportLogData();
          } else if (localClass.equals(TipsInfoReportManager.class)) {
            TipsInfoReportManager.getInstance().reportLogData();
          }
        }
        catch (Exception localException)
        {
          w.printErrStackTrace("LogReportManager", localException, "", new Object[0]);
        }
        if (localException.equals(UpdateInfoReportManager.class)) {
          UpdateInfoReportManager.getInstance().reportLogData();
        }
      }
      else
      {
        return;
      }
      i += 1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tmassistantsdk\logreport\LogReportManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */