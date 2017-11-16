package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.game.c.al;
import com.tencent.mm.plugin.game.c.am;
import com.tencent.mm.sdk.platformtools.w;

public final class ap
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  public final b kzP;
  
  public ap(String paramString1, String paramString2, boolean paramBoolean)
  {
    GMTrace.i(12625727455232L, 94069);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new al();
    ((b.a)localObject).gtG = new am();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/newgetgamedetail";
    ((b.a)localObject).gtE = 1217;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.kzP = ((b.a)localObject).DA();
    localObject = (al)this.kzP.gtC.gtK;
    ((al)localObject).lQJ = paramString1;
    ((al)localObject).lPg = paramString2;
    ((al)localObject).lQS = paramBoolean;
    ((al)localObject).lQU = true;
    GMTrace.o(12625727455232L, 94069);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12625861672960L, 94070);
    this.fUd = parame1;
    int i = a(parame, this.kzP, this);
    GMTrace.o(12625861672960L, 94070);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12625995890688L, 94071);
    w.i("MicroMsg.NetSceneGetGameDetailNew", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12625995890688L, 94071);
  }
  
  public final int getType()
  {
    GMTrace.i(15646297423872L, 116574);
    GMTrace.o(15646297423872L, 116574);
    return 1217;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */