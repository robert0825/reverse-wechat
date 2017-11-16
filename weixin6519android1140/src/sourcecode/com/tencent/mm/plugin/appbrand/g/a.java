package com.tencent.mm.plugin.appbrand.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.brh;
import com.tencent.mm.protocal.c.bri;
import com.tencent.mm.protocal.c.brj;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.Locale;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fXo;
  private b grb;
  private bri isE;
  
  public a()
  {
    GMTrace.i(10554076823552L, 78634);
    b.a locala = new b.a();
    locala.gtF = new brh();
    locala.gtG = new bri();
    locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/weappsearchtitle";
    locala.gtE = 1170;
    locala.gtH = 0;
    locala.gtI = 0;
    this.grb = locala.DA();
    GMTrace.o(10554076823552L, 78634);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10554345259008L, 78636);
    w.i("MicroMsg.NetSceneGetWeAppSearchTitle", "doScene");
    this.fXo = parame1;
    int i = a(parame, this.grb, this);
    GMTrace.o(10554345259008L, 78636);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10554479476736L, 78637);
    w.i("MicroMsg.NetSceneGetWeAppSearchTitle", "onGYNetEnd, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.isE = ((bri)this.grb.gtD.gtK);
    if (this.fXo != null) {
      this.fXo.a(paramInt2, paramInt3, paramString, this);
    }
    if (this.isE.vbf == null)
    {
      GMTrace.o(10554479476736L, 78637);
      return;
    }
    paramString = h.xy().xh();
    paramString.a(w.a.vwq, Locale.getDefault().getLanguage());
    paramString.a(w.a.vwr, this.isE.vbf.mmS);
    paramString.a(w.a.vws, this.isE.vbf.vbe);
    paramString.a(w.a.vwt, Long.valueOf(System.currentTimeMillis()));
    GMTrace.o(10554479476736L, 78637);
  }
  
  public final int getType()
  {
    GMTrace.i(15528320040960L, 115695);
    GMTrace.o(15528320040960L, 115695);
    return 1170;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\g\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */