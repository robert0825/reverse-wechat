package com.tencent.mm.modelmulti;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.abb;
import com.tencent.mm.protocal.c.abc;
import com.tencent.mm.sdk.platformtools.w;

public final class f
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public String content;
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public int gMk;
  public String title;
  
  public f(int paramInt)
  {
    GMTrace.i(394331684864L, 2938);
    this.title = "";
    this.content = "";
    this.gMk = 0;
    b.a locala = new b.a();
    locala.gtF = new abb();
    locala.gtG = new abc();
    locala.uri = "/cgi-bin/micromsg-bin/getinvitefriendsmsg";
    locala.gtE = 1803;
    this.fUa = locala.DA();
    ((abb)this.fUa.gtC.gtK).ury = paramInt;
    this.gMk = paramInt;
    GMTrace.o(394331684864L, 2938);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(394734338048L, 2941);
    w.d("MicroMsg.NetSceneGetInviteFriendsMsg", "doScene");
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(394734338048L, 2941);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(394465902592L, 2939);
    w.d("MicroMsg.NetSceneGetInviteFriendsMsg", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (abc)this.fUa.gtD.gtK;
      this.title = paramq.urz;
      this.content = paramq.urA;
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(394465902592L, 2939);
      return;
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(394465902592L, 2939);
  }
  
  public final int getType()
  {
    GMTrace.i(394600120320L, 2940);
    GMTrace.o(394600120320L, 2940);
    return 1803;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\modelmulti\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */