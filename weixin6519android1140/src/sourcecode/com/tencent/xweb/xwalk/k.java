package com.tencent.xweb.xwalk;

import android.content.Context;
import com.tencent.xweb.xwalk.a.e;
import org.xwalk.core.XWalkInitializer;
import org.xwalk.core.XWalkInitializer.XWalkInitListener;
import org.xwalk.core.XWalkUpdater;
import org.xwalk.core.XWalkUpdater.XWalkBackgroundUpdateListener;

public final class k
  implements XWalkInitializer.XWalkInitListener, XWalkUpdater.XWalkBackgroundUpdateListener
{
  Context mContext;
  XWalkInitializer ypL;
  XWalkUpdater ypM;
  
  public k(Context paramContext)
  {
    this.mContext = paramContext;
    this.ypL = new XWalkInitializer(this, paramContext);
    this.ypM = new XWalkUpdater(this, paramContext);
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
  
  public static final class a {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\xweb\xwalk\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */