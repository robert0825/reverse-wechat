package com.tencent.mm.modelappbrand;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.g.a.ht;
import com.tencent.mm.g.a.ht.a;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.brf;
import com.tencent.mm.protocal.c.brg;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class n
  extends com.tencent.mm.az.b
  implements k
{
  private com.tencent.mm.ad.e fXo;
  private com.tencent.mm.ad.b grb;
  private brg grd;
  
  public n(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(14451356991488L, 107671);
    this.gRc = paramString;
    this.gRb = paramInt1;
    this.gQZ = paramInt2;
    if (!bg.nm(paramString))
    {
      w.i("MicroMsg.NetSceneWeAppSuggest", "Constructors: query = %s", new Object[] { paramString });
      Object localObject = new b.a();
      ((b.a)localObject).gtE = 1173;
      ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/wxaapp/weappsearchsuggestion";
      ((b.a)localObject).gtF = new brf();
      ((b.a)localObject).gtG = new brg();
      this.grb = ((b.a)localObject).DA();
      localObject = (brf)this.grb.gtC.gtK;
      ((brf)localObject).eQb = paramString;
      paramString = new ht();
      a.vgX.m(paramString);
      ((brf)localObject).vaT = paramString.eLh.eLi;
      at.AR();
      paramString = c.xh().get(w.a.vws, null);
      if ((paramString != null) && ((paramString instanceof String))) {
        ((brf)localObject).vbe = ((String)paramString);
      }
      ((brf)localObject).vaX = b.gqW;
      ((brf)localObject).vaY = b.gqX;
      GMTrace.o(14451356991488L, 107671);
      return;
    }
    w.e("MicroMsg.NetSceneWeAppSuggest", "keyword is unavailable");
    GMTrace.o(14451356991488L, 107671);
  }
  
  public final String CM()
  {
    GMTrace.i(12934294011904L, 96368);
    if (this.grd != null)
    {
      String str = this.grd.tWC;
      GMTrace.o(12934294011904L, 96368);
      return str;
    }
    GMTrace.o(12934294011904L, 96368);
    return "";
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12934159794176L, 96367);
    this.fXo = parame1;
    int i = a(parame, this.grb, this);
    GMTrace.o(12934159794176L, 96367);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12933891358720L, 96365);
    w.i("MicroMsg.NetSceneWeAppSuggest", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fXo.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(12933891358720L, 96365);
      return;
    }
    this.grd = ((brg)this.grb.gtD.gtK);
    if (this.grd != null) {
      w.v("MicroMsg.NetSceneWeAppSuggest", "return data\n%s", new Object[] { this.grd.tWC });
    }
    this.fXo.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12933891358720L, 96365);
  }
  
  public final int getType()
  {
    GMTrace.i(15658645454848L, 116666);
    GMTrace.o(15658645454848L, 116666);
    return 1173;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelappbrand\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */