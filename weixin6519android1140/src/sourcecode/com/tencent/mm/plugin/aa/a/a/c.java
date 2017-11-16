package com.tencent.mm.plugin.aa.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.a;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.protocal.c.x;

public final class c
  extends a<x>
{
  public c(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(15032519753728L, 112001);
    b.a locala = new b.a();
    com.tencent.mm.protocal.c.w localw = new com.tencent.mm.protocal.c.w();
    localw.aCN = paramInt1;
    localw.offset = paramInt2;
    localw.type = paramInt3;
    locala.gtF = localw;
    locala.gtG = new x();
    locala.uri = "/cgi-bin/mmpay-bin/newaaquerylist";
    locala.gtE = 1676;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CgiAAQueryList", "CgiAAQueryList, limit: %s, offset: %s, type: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    GMTrace.o(15032519753728L, 112001);
  }
  
  public c(int paramInt1, int paramInt2, int paramInt3, String paramString1, int paramInt4, int paramInt5, String paramString2)
  {
    GMTrace.i(15032385536000L, 112000);
    b.a locala = new b.a();
    com.tencent.mm.protocal.c.w localw = new com.tencent.mm.protocal.c.w();
    localw.aCN = paramInt1;
    localw.offset = paramInt2;
    localw.type = paramInt3;
    localw.tMN = paramString1;
    localw.tMO = paramInt4;
    localw.tMP = paramInt5;
    localw.tMQ = paramString2;
    locala.gtF = localw;
    locala.gtG = new x();
    locala.uri = "/cgi-bin/mmpay-bin/newaaquerylist";
    locala.gtE = 1676;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CgiAAQueryList", "CgiAAQueryList, limit: %s, offset: %s, type: %s, bill_id: %s, trans_id: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString1, paramString2 });
    GMTrace.o(15032385536000L, 112000);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\aa\a\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */