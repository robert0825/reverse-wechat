package com.tencent.xweb.xwalk.a;

import android.content.Context;
import org.xwalk.core.XWalkEnvironment;
import org.xwalk.core.XWalkInitializer;
import org.xwalk.core.XWalkInitializer.XWalkInitListener;
import org.xwalk.core.XWalkUpdater;
import org.xwalk.core.XWalkUpdater.XWalkBackgroundUpdateListener;

public final class d
  implements XWalkInitializer.XWalkInitListener, XWalkUpdater.XWalkBackgroundUpdateListener
{
  public static boolean yqt = true;
  private static boolean yqu = false;
  private static d yqv;
  Context mContext;
  XWalkInitializer ypL;
  XWalkUpdater ypM;
  
  private d(Context paramContext)
  {
    this.mContext = paramContext;
    this.ypL = new XWalkInitializer(this, paramContext);
    this.ypM = new XWalkUpdater(this, paramContext);
  }
  
  public static boolean ir(Context paramContext)
  {
    if (yqu) {
      return yqu;
    }
    yqu = true;
    yqv = new d(paramContext);
    XWalkEnvironment.init(paramContext);
    if (XWalkEnvironment.isDownloadMode())
    {
      paramContext = yqv;
      if (!yqt) {
        new e(paramContext.ypM).execute(new String[0]);
      }
      if (paramContext.ypL.tryInitSync())
      {
        com.tencent.xweb.util.e.csi();
        XWalkInitializer.addXWalkInitializeLog("initSync Sucsess");
        return true;
      }
      return false;
    }
    return false;
  }
  
  public static boolean isXWalkReady()
  {
    if ((!yqu) || (yqv == null)) {
      return false;
    }
    return yqv.ypL.isXWalkReady();
  }
  
  public final void onXWalkInitCancelled() {}
  
  public final void onXWalkInitCompleted() {}
  
  public final void onXWalkInitFailed() {}
  
  public final void onXWalkInitStarted() {}
  
  public final void onXWalkUpdateCancelled() {}
  
  public final void onXWalkUpdateCompleted() {}
  
  public final void onXWalkUpdateFailed(int paramInt)
  {
    e.Gs(paramInt);
  }
  
  public final void onXWalkUpdateProgress(int paramInt) {}
  
  public final void onXWalkUpdateStarted() {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\xweb\xwalk\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */