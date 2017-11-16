package com.tencent.mm.ay;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.g.b.af;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.blg;
import com.tencent.mm.protocal.c.blh;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import java.io.File;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private String clientId;
  private String eMk;
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public String gQT;
  private int gsL;
  private int gsM;
  private String username;
  
  private b(String paramString)
  {
    GMTrace.i(304003153920L, 2265);
    this.username = paramString;
    this.gsL = 0;
    this.gsM = 0;
    paramString = new StringBuilder();
    com.tencent.mm.kernel.h.xw();
    this.clientId = (com.tencent.mm.kernel.a.ww() + System.currentTimeMillis());
    GMTrace.o(304003153920L, 2265);
  }
  
  public b(String paramString1, String paramString2)
  {
    this(paramString1);
    GMTrace.i(303868936192L, 2264);
    this.eMk = paramString2;
    GMTrace.o(303868936192L, 2264);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(304540024832L, 2269);
    this.fUd = parame1;
    if ((this.eMk == null) || (this.eMk.length() == 0))
    {
      w.e("MicroMsg.NetSceneUploadCardImg", "imgPath is null or length = 0");
      GMTrace.o(304540024832L, 2269);
      return -1;
    }
    if (!com.tencent.mm.a.e.aZ(this.eMk))
    {
      w.e("MicroMsg.NetSceneUploadCardImg", "The img does not exist, imgPath = " + this.eMk);
      GMTrace.o(304540024832L, 2269);
      return -1;
    }
    if (this.gsL == 0) {
      this.gsL = ((int)new File(this.eMk).length());
    }
    parame1 = new b.a();
    parame1.gtF = new blg();
    parame1.gtG = new blh();
    parame1.uri = "/cgi-bin/micromsg-bin/uploadcardimg";
    parame1.gtE = 575;
    parame1.gtH = 0;
    parame1.gtI = 0;
    this.fUa = parame1.DA();
    int i = Math.min(this.gsL - this.gsM, 32768);
    parame1 = com.tencent.mm.a.e.c(this.eMk, this.gsM, i);
    if (parame1 == null)
    {
      w.e("MicroMsg.NetSceneUploadCardImg", "readFromFile error");
      GMTrace.o(304540024832L, 2269);
      return -1;
    }
    w.i("MicroMsg.NetSceneUploadCardImg", "doScene uploadLen:%d, total: %d", new Object[] { Integer.valueOf(parame1.length), Integer.valueOf(this.gsL) });
    blg localblg = (blg)this.fUa.gtC.gtK;
    localblg.ufM = this.username;
    localblg.tRC = this.gsL;
    localblg.tRD = this.gsM;
    localblg.ues = new azp().be(parame1);
    localblg.tRE = localblg.ues.uNN;
    localblg.tPP = this.clientId;
    i = a(parame, this.fUa, this);
    GMTrace.o(304540024832L, 2269);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(304271589376L, 2267);
    if ((this.eMk == null) || (this.eMk.length() == 0))
    {
      i = k.b.gun;
      GMTrace.o(304271589376L, 2267);
      return i;
    }
    int i = k.b.gum;
    GMTrace.o(304271589376L, 2267);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(304674242560L, 2270);
    w.d("MicroMsg.NetSceneUploadCardImg", "onGYNetEnd:%s, %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneUploadCardImg", "upload card img error");
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(304674242560L, 2270);
      return;
    }
    paramq = (blh)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    this.gQT = paramq.uEE;
    this.gsM = paramq.tRD;
    if (this.gsM < this.gsL)
    {
      if (a(this.gtW, this.fUd) < 0)
      {
        w.e("MicroMsg.NetSceneUploadCardImg", "doScene again failed");
        this.fUd.a(3, -1, "", this);
      }
      w.d("MicroMsg.NetSceneUploadCardImg", "doScene again");
      GMTrace.o(304674242560L, 2270);
      return;
    }
    if (!bg.nm(this.gQT))
    {
      paramq = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(this.username);
      if ((paramq != null) && ((int)paramq.fTq > 0) && (com.tencent.mm.l.a.eE(paramq.field_type)))
      {
        paramq.cG(this.gQT);
        ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().a(this.username, paramq);
      }
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(304674242560L, 2270);
  }
  
  public final int getType()
  {
    GMTrace.i(304137371648L, 2266);
    GMTrace.o(304137371648L, 2266);
    return 575;
  }
  
  protected final int vB()
  {
    GMTrace.i(304405807104L, 2268);
    GMTrace.o(304405807104L, 2268);
    return 100;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ay\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */