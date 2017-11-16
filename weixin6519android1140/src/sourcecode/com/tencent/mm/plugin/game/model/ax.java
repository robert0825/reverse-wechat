package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.game.c.cf;
import com.tencent.mm.plugin.game.c.cg;
import com.tencent.mm.sdk.platformtools.w;

public final class ax
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  public final b kzP;
  
  public ax(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    GMTrace.i(12633243648000L, 94125);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new cf();
    ((b.a)localObject).gtG = new cg();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/newsubscribenewgame";
    ((b.a)localObject).gtE = 1219;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.kzP = ((b.a)localObject).DA();
    localObject = (cf)this.kzP.gtC.gtK;
    ((cf)localObject).lPg = paramString1;
    ((cf)localObject).lQJ = paramString2;
    ((cf)localObject).lPf = paramString3;
    ((cf)localObject).lPu = paramBoolean;
    GMTrace.o(12633243648000L, 94125);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12633377865728L, 94126);
    this.fUd = parame1;
    int i = a(parame, this.kzP, this);
    GMTrace.o(12633377865728L, 94126);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12633512083456L, 94127);
    w.i("MicroMsg.NetSceneGameSubscription", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12633512083456L, 94127);
  }
  
  public final int getType()
  {
    GMTrace.i(15646565859328L, 116576);
    GMTrace.o(15646565859328L, 116576);
    return 1219;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */