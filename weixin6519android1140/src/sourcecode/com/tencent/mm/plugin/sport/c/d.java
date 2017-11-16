package com.tencent.mm.plugin.sport.c;

import android.os.Build;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.brl;
import com.tencent.mm.protocal.c.brm;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ba;

public final class d
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private b gMj;
  brm qqE;
  
  public d()
  {
    GMTrace.i(16729702924288L, 124646);
    Object localObject = new b.a();
    ((b.a)localObject).gtE = 1947;
    ((b.a)localObject).uri = "/cgi-bin/mmoc-bin/hardware/getwxsportconfig";
    ((b.a)localObject).gtF = new brl();
    ((b.a)localObject).gtG = new brm();
    this.gMj = ((b.a)localObject).DA();
    localObject = (brl)this.gMj.gtC.gtK;
    ((brl)localObject).jhm = com.tencent.mm.protocal.d.tJA;
    ((brl)localObject).tSz = ba.bUs();
    ((brl)localObject).tWE = Build.BRAND;
    ((brl)localObject).tWD = Build.MODEL;
    ((brl)localObject).vbi = com.tencent.mm.protocal.d.tJx;
    ((brl)localObject).tWF = com.tencent.mm.protocal.d.tJy;
    ((brl)localObject).tWG = com.tencent.mm.protocal.d.tJz;
    ((brl)localObject).vbj = "0x26051334";
    ((brl)localObject).vbk = Build.MANUFACTURER;
    w.i("MicroMsg.Sport.NetSceneGetWeSportConfig", "request params=[%s, %s, %s, %s, %s, %s, %s, %s, %s]", new Object[] { ((brl)localObject).tSz, ((brl)localObject).tWE, ((brl)localObject).tWD, ((brl)localObject).jhm, ((brl)localObject).tWG, ((brl)localObject).tWF, ((brl)localObject).tWG, ((brl)localObject).vbj, ((brl)localObject).vbk });
    GMTrace.o(16729702924288L, 124646);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(16729971359744L, 124648);
    this.fUd = parame1;
    int i = a(parame, this.gMj, this);
    GMTrace.o(16729971359744L, 124648);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(16730105577472L, 124649);
    w.i("MicroMsg.Sport.NetSceneGetWeSportConfig", "onGYNetEnd %d %d %d %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(16730105577472L, 124649);
      return;
    }
    this.qqE = ((brm)this.gMj.gtD.gtK);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(16730105577472L, 124649);
  }
  
  public final int getType()
  {
    GMTrace.i(16729837142016L, 124647);
    GMTrace.o(16729837142016L, 124647);
    return 1947;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sport\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */