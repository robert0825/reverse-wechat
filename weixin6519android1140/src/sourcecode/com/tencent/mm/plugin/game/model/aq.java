package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.game.c.aj;
import com.tencent.mm.plugin.game.c.ak;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;

public final class aq
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private final b kzP;
  
  public aq()
  {
    GMTrace.i(16559246409728L, 123376);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new aj();
    ((b.a)localObject).gtG = new ak();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/getgamecenterglobalsetting";
    ((b.a)localObject).gtE = 1311;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.kzP = ((b.a)localObject).DA();
    localObject = (aj)this.kzP.gtC.gtK;
    ((aj)localObject).lQJ = v.bPK();
    ((aj)localObject).gCG = bg.bQT();
    ((aj)localObject).lQK = f.eqV;
    w.i("MicroMsg.NetSceneGetGameGlobalConfig", "lang=%s, country=%s, releaseChannel=%s", new Object[] { ((aj)localObject).lQJ, ((aj)localObject).gCG, Integer.valueOf(((aj)localObject).lQK) });
    GMTrace.o(16559246409728L, 123376);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(16559649062912L, 123379);
    this.fUd = parame1;
    int i = a(parame, this.kzP, this);
    GMTrace.o(16559649062912L, 123379);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(16559380627456L, 123377);
    w.i("MicroMsg.NetSceneGetGameGlobalConfig", "errType = " + paramInt2 + ", errCode = " + paramInt3 + ", errMsg = " + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(16559380627456L, 123377);
      return;
    }
    paramq = (ak)((b)paramq).gtD.gtK;
    if (paramq == null)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(16559380627456L, 123377);
      return;
    }
    SubCoreGameCenter.aGj().a("pb_game_global_config", paramq);
    g.aFi().QP();
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(16559380627456L, 123377);
  }
  
  public final int getType()
  {
    GMTrace.i(16559514845184L, 123378);
    GMTrace.o(16559514845184L, 123378);
    return 1311;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */