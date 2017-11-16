package com.tencent.mm.plugin.aa.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.a;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.protocal.c.b;
import com.tencent.mm.protocal.c.c;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends a<c>
{
  public d(String paramString1, String paramString2)
  {
    GMTrace.i(5599697829888L, 41721);
    b.a locala = new b.a();
    b localb = new b();
    localb.tLZ = paramString1;
    localb.tMa = paramString2;
    locala.gtF = localb;
    locala.gtG = new c();
    locala.uri = "/cgi-bin/mmpay-bin/newaaclosenotify";
    locala.gtE = 1672;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    w.i("MicroMsg.CgiCloseAAUrgeNotify", "CgiCloseAAUrgeNotify, billNo: %s, chatroom: %s", new Object[] { paramString1, paramString2 });
    GMTrace.o(5599697829888L, 41721);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\aa\a\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */