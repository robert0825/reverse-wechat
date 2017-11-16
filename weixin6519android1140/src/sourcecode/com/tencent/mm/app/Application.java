package com.tencent.mm.app;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.recovery.Recovery;
import com.tencent.recovery.RecoveryLogic;
import com.tencent.tinker.loader.app.TinkerApplication;

public class Application
  extends TinkerApplication
{
  static
  {
    GMTrace.i(14011659714560L, 104395);
    Recovery.eE();
    GMTrace.o(14011659714560L, 104395);
  }
  
  public Application()
  {
    super(7, "com.tencent.mm.app.MMApplicationLike", "com.tencent.tinker.loader.TinkerLoader", true);
    GMTrace.i(14011257061376L, 104392);
    GMTrace.o(14011257061376L, 104392);
  }
  
  protected void attachBaseContext(Context paramContext)
  {
    GMTrace.i(14011525496832L, 104394);
    Recovery.a(this, paramContext);
    if (RecoveryLogic.cni())
    {
      super.attachBaseContext(paramContext);
      GMTrace.o(14011525496832L, 104394);
      return;
    }
    super.attachBaseContext(paramContext);
    GMTrace.o(14011525496832L, 104394);
  }
  
  public void onCreate()
  {
    GMTrace.i(14011391279104L, 104393);
    if (!RecoveryLogic.cni()) {
      super.onCreate();
    }
    Recovery.cne();
    GMTrace.o(14011391279104L, 104393);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\app\Application.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */