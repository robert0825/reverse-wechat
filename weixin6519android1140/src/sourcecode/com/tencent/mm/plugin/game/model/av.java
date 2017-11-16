package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.game.c.ah;
import com.tencent.mm.plugin.game.c.ai;
import com.tencent.mm.sdk.platformtools.w;

public final class av
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private final b kzP;
  
  public av(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3)
  {
    GMTrace.i(12614184730624L, 93983);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ah();
    ((b.a)localObject).gtG = new ai();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/gamereport";
    ((b.a)localObject).gtE = 1223;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.kzP = ((b.a)localObject).DA();
    localObject = (ah)this.kzP.gtC.gtK;
    ((ah)localObject).lPg = paramString1;
    ((ah)localObject).lQF = paramInt1;
    ((ah)localObject).lQG = paramInt2;
    ((ah)localObject).lQH = paramString2;
    ((ah)localObject).lQI = paramString3;
    ((ah)localObject).lQE = ((int)(System.currentTimeMillis() / 1000L));
    GMTrace.o(12614184730624L, 93983);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12614453166080L, 93985);
    this.fUd = parame1;
    int i = a(parame, this.kzP, this);
    GMTrace.o(12614453166080L, 93985);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12614587383808L, 93986);
    w.i("MicroMsg.NetSceneGetGameIndex", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12614587383808L, 93986);
  }
  
  public final int getType()
  {
    GMTrace.i(15645626335232L, 116569);
    GMTrace.o(15645626335232L, 116569);
    return 1223;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */