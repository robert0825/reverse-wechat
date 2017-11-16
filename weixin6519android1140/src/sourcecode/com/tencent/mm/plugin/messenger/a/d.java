package com.tencent.mm.plugin.messenger.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.c.b;
import com.tencent.mm.sdk.platformtools.w;

public final class d
{
  public static c mUt;
  
  public static c aOe()
  {
    GMTrace.i(18652237660160L, 138970);
    if (mUt == null) {
      mUt = new b();
    }
    if ((mUt instanceof b)) {
      w.w("MicroMsg.SendMsgMgrFactory", "we are using dummy SendMsgMgr!!");
    }
    c localc = mUt;
    GMTrace.o(18652237660160L, 138970);
    return localc;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\messenger\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */