package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aqr;
import com.tencent.mm.protocal.c.aqs;

public final class r
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public final b fUa;
  private com.tencent.mm.ad.e fXo;
  public String rEq;
  public Object tag;
  
  public r(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(18181133434880L, 135460);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new aqr();
    ((b.a)localObject).gtG = new aqs();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/oauth_authorize";
    ((b.a)localObject).gtE = 1254;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.rEq = paramString1;
    this.fUa = ((b.a)localObject).DA();
    localObject = (aqr)this.fUa.gtC.gtK;
    ((aqr)localObject).uGP = paramString1;
    ((aqr)localObject).uGS = paramString2;
    ((aqr)localObject).scene = paramInt;
    GMTrace.o(18181133434880L, 135460);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(18181536088064L, 135463);
    this.fXo = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(18181536088064L, 135463);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(18181267652608L, 135461);
    this.fXo.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(18181267652608L, 135461);
  }
  
  public final int getType()
  {
    GMTrace.i(18181401870336L, 135462);
    GMTrace.o(18181401870336L, 135462);
    return 1254;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\model\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */