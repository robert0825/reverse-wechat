package com.tencent.mm.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.h;
import com.tencent.mm.protocal.c.ata;
import com.tencent.mm.protocal.c.atb;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class i
  extends l
{
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public i(String paramString)
  {
    this(paramString, null, null, -1, -1, -1);
    GMTrace.i(1454651736064L, 10838);
    GMTrace.o(1454651736064L, 10838);
  }
  
  public i(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(16670244470784L, 124203);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ata();
    ((b.a)localObject).gtG = new atb();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/paysubscribe";
    ((b.a)localObject).gtE = 421;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ata)this.fUa.gtC.gtK;
    ((ata)localObject).uIT = paramString1;
    ((ata)localObject).tYT = h.byp();
    ((ata)localObject).uIU = paramString3;
    if (!bg.nm(paramString2)) {
      ((ata)localObject).uIV = new com.tencent.mm.bm.b(paramString2.getBytes());
    }
    if (paramInt1 >= 0) {
      ((ata)localObject).uIW = paramInt1;
    }
    if (paramInt2 >= 0) {
      ((ata)localObject).tMZ = paramInt2;
    }
    if (paramInt3 >= 0) {
      ((ata)localObject).uIX = paramInt3;
    }
    GMTrace.o(16670244470784L, 124203);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1454920171520L, 10840);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(1454920171520L, 10840);
    return i;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(1455054389248L, 10841);
    w.d("MicroMsg.NetScenePaySubscribe", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    this.fUd.a(paramInt1, paramInt2, paramString, this);
    GMTrace.o(1455054389248L, 10841);
  }
  
  public final int getType()
  {
    GMTrace.i(1455188606976L, 10842);
    GMTrace.o(1455188606976L, 10842);
    return 421;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\c\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */