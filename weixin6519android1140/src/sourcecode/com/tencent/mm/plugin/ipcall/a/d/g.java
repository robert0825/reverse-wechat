package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.afm;
import com.tencent.mm.protocal.c.afn;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.io.IOException;

public final class g
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  private afm mlJ;
  public afn mlK;
  
  public g(int paramInt)
  {
    GMTrace.i(11585674280960L, 86320);
    this.fUa = null;
    this.mlJ = null;
    this.mlK = null;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new afm();
    ((b.a)localObject).gtG = new afn();
    ((b.a)localObject).gtE = 257;
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getwechatoutcoupons";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    this.mlJ = ((afm)this.fUa.gtC.gtK);
    this.mlJ.tOG = paramInt;
    localObject = this.mlJ;
    at.AR();
    ((afm)localObject).uvc = ((Integer)c.xh().get(w.a.vsp, Integer.valueOf(0))).intValue();
    localObject = this.mlJ;
    at.AR();
    ((afm)localObject).uvd = ((Integer)c.xh().get(w.a.vsd, Integer.valueOf(0))).intValue();
    w.i("MicroMsg.NetSceneIPCallGetWeChatOutCoupons", "NetSceneIPCallGetWeChatOutCoupons Scene:%d, RechargeWordingVersion:%d,AccountActivityWordingVersion:%d", new Object[] { Integer.valueOf(this.mlJ.tOG), Integer.valueOf(this.mlJ.uvc), Integer.valueOf(this.mlJ.uvd) });
    GMTrace.o(11585674280960L, 86320);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11585942716416L, 86322);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11585942716416L, 86322);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11586076934144L, 86323);
    w.i("MicroMsg.NetSceneIPCallGetWeChatOutCoupons", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mlK = ((afn)((b)paramq).gtD.gtK);
    if (((paramInt2 == 0) || (paramInt3 == 0)) && (paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = this.mlK;
      if (paramq != null) {
        w.i("MicroMsg.IPCallUtil", "[royle]begin save response,Balance:%s,PVWording:%s,Coupons:%s,Wording:%s,Title:%s,Desc:%s,ImgPath:%s,UrlPath:%s,SmsDesc:%s,PackageMsg:%s", new Object[] { paramq.uvh, paramq.uvi, paramq.uve, paramq.mmS, paramq.eBt, paramq.lPj, paramq.uvf, paramq.uvg, paramq.uvj, paramq.uvp });
      }
    }
    try
    {
      at.AR();
      c.xh().a(w.a.vtj, bg.bs(paramq.toByteArray()));
      if (this.fUd != null) {
        this.fUd.a(paramInt2, paramInt3, paramString, this);
      }
      GMTrace.o(11586076934144L, 86323);
      return;
    }
    catch (IOException paramq)
    {
      for (;;)
      {
        w.i("MicroMsg.IPCallUtil", "[royle]save exception:%s", new Object[] { paramq.getMessage() });
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(11585808498688L, 86321);
    GMTrace.o(11585808498688L, 86321);
    return 257;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\d\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */