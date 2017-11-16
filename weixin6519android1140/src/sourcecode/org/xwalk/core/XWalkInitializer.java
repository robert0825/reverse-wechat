package org.xwalk.core;

import android.content.Context;
import android.content.SharedPreferences;

public class XWalkInitializer
{
  private static final String TAG = "XWalkLib";
  public Context mContext;
  public XWalkInitListener mInitListener;
  public boolean mIsXWalkReady;
  
  public XWalkInitializer(XWalkInitListener paramXWalkInitListener, Context paramContext)
  {
    this.mInitListener = paramXWalkInitListener;
    this.mContext = paramContext;
    XWalkLibraryLoader.prepareToInit(this.mContext);
  }
  
  public static void addXWalkInitializeLog(String paramString)
  {
    XWalkEnvironment.addXWalkInitializeLog(paramString);
  }
  
  public static void addXWalkInitializeLog(String paramString1, String paramString2)
  {
    XWalkEnvironment.addXWalkInitializeLog(paramString1, paramString2);
  }
  
  public static String getXWalkInitializeLog()
  {
    SharedPreferences localSharedPreferences = XWalkEnvironment.getSharedPreferencesForLog();
    if (localSharedPreferences == null) {
      return "";
    }
    return localSharedPreferences.getString("log", "");
  }
  
  public boolean initAsync_remove()
  {
    if (this.mIsXWalkReady) {
      return false;
    }
    if ((XWalkLibraryLoader.isInitializing()) || (XWalkLibraryLoader.isDownloading()))
    {
      Log.i("XWalkLib", "Other initialization or download is proceeding");
      return false;
    }
    Log.i("XWalkLib", "Initialized by XWalkInitializer");
    this.mInitListener.onXWalkInitStarted();
    return true;
  }
  
  public boolean isDownloadMode()
  {
    return (this.mIsXWalkReady) && (XWalkEnvironment.isDownloadMode());
  }
  
  public boolean isSharedMode()
  {
    return (this.mIsXWalkReady) && (XWalkLibraryLoader.isSharedLibrary());
  }
  
  public boolean isXWalkReady()
  {
    return this.mIsXWalkReady;
  }
  
  public boolean tryInitSync()
  {
    if (!XWalkEnvironment.hasAvailableVersion()) {
      if (XWalkEnvironment.getAvailableVersion() == -1) {
        addXWalkInitializeLog("no available version ,need download");
      }
    }
    for (;;)
    {
      return false;
      addXWalkInitializeLog("sdk not support this apk, need update new");
      return false;
      if (XWalkCoreWrapper.attachXWalkCore(XWalkEnvironment.getAvailableVersion()) == 1) {}
      for (int i = 1; i != 0; i = 0)
      {
        XWalkCoreWrapper.dockXWalkCore();
        this.mIsXWalkReady = true;
        XWalkLibraryLoader.finishInit(this.mContext);
        this.mInitListener.onXWalkInitCompleted();
        return true;
      }
    }
  }
  
  public static abstract interface XWalkInitListener
  {
    public abstract void onXWalkInitCancelled();
    
    public abstract void onXWalkInitCompleted();
    
    public abstract void onXWalkInitFailed();
    
    public abstract void onXWalkInitStarted();
  }
  
  private class XWalkLibraryListener
    implements XWalkLibraryLoader.ActivateListener, XWalkLibraryLoader.DecompressListener
  {
    private XWalkLibraryListener() {}
    
    public void onActivateCompleted()
    {
      XWalkInitializer.this.mIsXWalkReady = true;
      XWalkLibraryLoader.finishInit(XWalkInitializer.this.mContext);
      XWalkInitializer.this.mInitListener.onXWalkInitCompleted();
    }
    
    public void onActivateFailed()
    {
      XWalkInitializer.this.mInitListener.onXWalkInitFailed();
    }
    
    public void onActivateStarted() {}
    
    public void onDecompressCancelled()
    {
      XWalkInitializer.this.mInitListener.onXWalkInitCancelled();
    }
    
    public void onDecompressCompleted() {}
    
    public void onDecompressStarted() {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\org\xwalk\core\XWalkInitializer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */