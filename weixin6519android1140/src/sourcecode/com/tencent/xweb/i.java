package com.tencent.xweb;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.xwalk.core.XWalkEnvironment;

public final class i
{
  private static i ynl = null;
  public Context ynm;
  public WebView.c ynn = WebView.c.ynE;
  public boolean yno = false;
  public boolean ynp = false;
  public f.a ynq = f.a.ync;
  public boolean ynr = false;
  
  public static i crW()
  {
    return ynl;
  }
  
  public static void ip(Context paramContext)
  {
    boolean bool2 = false;
    if (ynl != null) {
      return;
    }
    Object localObject = new i();
    ynl = (i)localObject;
    ((i)localObject).ynm = paramContext;
    XWalkEnvironment.init(paramContext);
    localObject = paramContext.getSharedPreferences("wcwebview", 0).getString("HardCodeWebView", "WV_KIND_NONE");
    try
    {
      ynl.ynn = WebView.c.valueOf((String)localObject);
      ynl.ynp = paramContext.getSharedPreferences("wcwebview", 0).getBoolean("bShowVersion", false);
      localObject = paramContext.getSharedPreferences("wcwebview", 0).getString("V8type", "RT_TYPE_AUTO");
      try
      {
        ynl.ynq = f.a.valueOf((String)localObject);
        ynl.yno = XWalkEnvironment.getSharedPreferences().getBoolean("ENABLEREMOTEDEBUG", false);
        paramContext = XWalkEnvironment.getTestDownLoadUrl(paramContext);
        localObject = ynl;
        boolean bool1 = bool2;
        if (paramContext != null)
        {
          bool1 = bool2;
          if (!paramContext.isEmpty()) {
            bool1 = true;
          }
        }
        ((i)localObject).ynr = bool1;
        return;
      }
      catch (Exception localException1)
      {
        for (;;) {}
      }
    }
    catch (Exception localException2)
    {
      for (;;) {}
    }
  }
  
  public final void nh(boolean paramBoolean)
  {
    if (paramBoolean == this.yno) {
      return;
    }
    this.yno = paramBoolean;
    XWalkEnvironment.getSharedPreferences().edit().putBoolean("ENABLEREMOTEDEBUG", paramBoolean).commit();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\xweb\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */