package com.tencent.mm.plugin.chatroom.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.a;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.protocal.c.yt;
import com.tencent.mm.protocal.c.yu;

public final class c
  extends a<yu>
{
  public c(String paramString)
  {
    GMTrace.i(9061307252736L, 67512);
    b.a locala = new b.a();
    yt localyt = new yt();
    localyt.ufz = paramString;
    locala.gtF = localyt;
    locala.gtG = new yu();
    locala.uri = "/cgi-bin/micromsg-bin/getchatroominfodetail";
    locala.gtE = 223;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    GMTrace.o(9061307252736L, 67512);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */