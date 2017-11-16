package com.tencent.mm.plugin.aa.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.a;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.protocal.c.r;
import com.tencent.mm.protocal.c.s;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends a<s>
{
  public b(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(5597281910784L, 41703);
    b.a locala = new b.a();
    r localr = new r();
    localr.tLZ = paramString1;
    localr.tMa = paramString2;
    localr.scene = paramInt;
    locala.gtF = localr;
    locala.gtG = new s();
    locala.uri = "/cgi-bin/mmpay-bin/newaapayurge";
    locala.gtE = 1644;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    w.i("MicroMsg.CgiAAPayUrge", "CgiAAPayUrge, billNo: %s, chatroom: %s, scene: %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt) });
    GMTrace.o(5597281910784L, 41703);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\aa\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */