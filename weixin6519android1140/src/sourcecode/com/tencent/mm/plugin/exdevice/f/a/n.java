package com.tencent.mm.plugin.exdevice.f.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bkt;
import com.tencent.mm.protocal.c.bku;
import com.tencent.mm.sdk.platformtools.w;

public final class n
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public int kCt;
  public int kCu;
  public int opType;
  
  public n(int paramInt1, int paramInt2)
  {
    GMTrace.i(11187047628800L, 83350);
    this.fUd = null;
    this.fUa = null;
    this.opType = paramInt1;
    this.kCt = paramInt2;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bkt();
    ((b.a)localObject).gtG = new bku();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/rank/updateranksetting";
    ((b.a)localObject).gtE = 1044;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bkt)this.fUa.gtC.gtK;
    ((bkt)localObject).eSe = this.opType;
    ((bkt)localObject).eQl = this.kCt;
    GMTrace.o(11187047628800L, 83350);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11187316064256L, 83352);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11187316064256L, 83352);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11187450281984L, 83353);
    w.d("MicroMsg.NetSceneUpdateRankSetting", "hy: scene end. errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      this.kCu = ((bku)this.fUa.gtD.gtK).eQl;
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(11187450281984L, 83353);
  }
  
  public final int getType()
  {
    GMTrace.i(11187181846528L, 83351);
    GMTrace.o(11187181846528L, 83351);
    return 1044;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\f\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */