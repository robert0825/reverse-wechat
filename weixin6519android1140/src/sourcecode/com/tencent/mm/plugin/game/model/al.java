package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.game.c.af;
import com.tencent.mm.plugin.game.c.ag;
import com.tencent.mm.sdk.platformtools.w;

public final class al
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  public final b kzP;
  
  public al(String paramString)
  {
    this(paramString, 0, 0);
    GMTrace.i(12594991595520L, 93840);
    GMTrace.o(12594991595520L, 93840);
  }
  
  public al(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(12595125813248L, 93841);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new af();
    ((b.a)localObject).gtG = new ag();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/gamemsgblock";
    ((b.a)localObject).gtE = 1221;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.kzP = ((b.a)localObject).DA();
    localObject = (af)this.kzP.gtC.gtK;
    ((af)localObject).lPg = paramString;
    ((af)localObject).lQC = paramInt1;
    ((af)localObject).lQD = paramInt2;
    GMTrace.o(12595125813248L, 93841);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12595260030976L, 93842);
    this.fUd = parame1;
    int i = a(parame, this.kzP, this);
    GMTrace.o(12595260030976L, 93842);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12595394248704L, 93843);
    w.i("MicroMsg.NetSceneGameMsgBlock", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12595394248704L, 93843);
  }
  
  public final int getType()
  {
    GMTrace.i(15645357899776L, 116567);
    GMTrace.o(15645357899776L, 116567);
    return 1221;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */