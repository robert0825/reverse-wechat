package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bae;
import com.tencent.mm.protocal.c.baf;

public final class t
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public final b fUa;
  private com.tencent.mm.ad.e fXo;
  
  public t(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    GMTrace.i(18178449080320L, 135440);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bae();
    ((b.a)localObject).gtG = new baf();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/sdk_oauth_authorize";
    ((b.a)localObject).gtE = 1388;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bae)this.fUa.gtC.gtK;
    ((bae)localObject).eSd = paramString1;
    ((bae)localObject).scope = paramString2;
    ((bae)localObject).state = paramString3;
    ((bae)localObject).uOd = paramString4;
    ((bae)localObject).uOe = paramString5;
    GMTrace.o(18178449080320L, 135440);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(18178851733504L, 135443);
    this.fXo = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(18178851733504L, 135443);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(18178583298048L, 135441);
    this.fXo.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(18178583298048L, 135441);
  }
  
  public final int getType()
  {
    GMTrace.i(18178717515776L, 135442);
    GMTrace.o(18178717515776L, 135442);
    return 1388;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webview\model\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */