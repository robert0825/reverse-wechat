package com.tencent.mm.modelmulti;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.auc;
import com.tencent.mm.protocal.c.aud;
import com.tencent.mm.protocal.c.bjz;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.j.a;

public final class i
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  private int gMk;
  
  public i(int paramInt, String paramString)
  {
    GMTrace.i(411511554048L, 3066);
    this.gMk = 0;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new auc();
    ((b.a)localObject).gtG = new aud();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/postinvitefriendsmsg";
    ((b.a)localObject).gtE = 1804;
    this.fUa = ((b.a)localObject).DA();
    auc localauc = (auc)this.fUa.gtC.gtK;
    localauc.ury = paramInt;
    localauc.urA = paramString;
    if ((paramInt & 0x10) > 0)
    {
      a locala = new a();
      localObject = new bjz();
      if (locala.xms == null) {
        break label191;
      }
      paramString = (String)localObject;
      if (!bg.nm(locala.xms.token))
      {
        ((bjz)localObject).uUQ = locala.xms.token;
        ((bjz)localObject).uUR = locala.xms.uDu;
      }
    }
    label191:
    for (paramString = (String)localObject;; paramString = null)
    {
      localauc.uJw = paramString;
      this.gMk = paramInt;
      GMTrace.o(411511554048L, 3066);
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(411914207232L, 3069);
    w.d("MicroMsg.NetScenePostInviteFriendsMsg", "doScene");
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(411914207232L, 3069);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(411645771776L, 3067);
    w.d("MicroMsg.NetScenePostInviteFriendsMsg", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(411645771776L, 3067);
      return;
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(411645771776L, 3067);
  }
  
  public final int getType()
  {
    GMTrace.i(411779989504L, 3068);
    GMTrace.o(411779989504L, 3068);
    return 1804;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\modelmulti\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */