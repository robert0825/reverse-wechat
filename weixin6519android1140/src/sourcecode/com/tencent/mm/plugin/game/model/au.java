package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.agv;
import com.tencent.mm.protocal.c.agw;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;

public final class au
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private String appId;
  private com.tencent.mm.ad.e fUd;
  final b kzP;
  
  public au(String paramString)
  {
    GMTrace.i(18031346450432L, 134344);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new agv();
    ((b.a)localObject).gtG = new agw();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/gethvgamemenu";
    ((b.a)localObject).gtE = 1369;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.appId = paramString;
    this.kzP = ((b.a)localObject).DA();
    localObject = (agv)this.kzP.gtC.gtK;
    ((agv)localObject).lQJ = v.bPK();
    ((agv)localObject).gCG = bg.bQT();
    ((agv)localObject).lQa = paramString;
    w.i("MicroMsg.NetSceneHVGameGetMenu", "lang=%s, country=%s, appid=%s", new Object[] { ((agv)localObject).lQJ, ((agv)localObject).gCG, ((agv)localObject).lQa });
    GMTrace.o(18031346450432L, 134344);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(18031749103616L, 134347);
    this.fUd = parame1;
    int i = a(parame, this.kzP, this);
    GMTrace.o(18031749103616L, 134347);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(18031480668160L, 134345);
    w.i("MicroMsg.NetSceneHVGameGetMenu", "errType = " + paramInt2 + ", errCode = " + paramInt3 + ", errMsg = " + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(18031480668160L, 134345);
      return;
    }
    if ((agw)((b)paramq).gtD.gtK == null)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(18031480668160L, 134345);
      return;
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(18031480668160L, 134345);
  }
  
  public final int getType()
  {
    GMTrace.i(18031614885888L, 134346);
    GMTrace.o(18031614885888L, 134346);
    return 1369;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */