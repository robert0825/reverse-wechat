package com.tencent.mm.modelappbrand;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.az.e.b;
import com.tencent.mm.g.a.ht;
import com.tencent.mm.g.a.ht.a;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.all;
import com.tencent.mm.protocal.c.brd;
import com.tencent.mm.protocal.c.bre;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class m
  extends com.tencent.mm.az.a
  implements k
{
  private com.tencent.mm.ad.e fXo;
  private final com.tencent.mm.ad.b grb;
  private bre grc;
  
  public m(e.b paramb)
  {
    GMTrace.i(14451088556032L, 107669);
    this.gRa = paramb.eBj;
    this.vq = paramb.offset;
    this.gRb = paramb.scene;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new brd();
    ((b.a)localObject).gtG = new bre();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/wxaapp/weappsearch";
    ((b.a)localObject).gtE = 1162;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.grb = ((b.a)localObject).DA();
    localObject = (brd)this.grb.gtC.gtK;
    all localall = CO();
    ((brd)localObject).jib = paramb.gRj;
    ((brd)localObject).uqq = paramb.eBj;
    ((brd)localObject).tWu = paramb.offset;
    ((brd)localObject).tXx = paramb.gRm;
    ((brd)localObject).vaU = paramb.gRs;
    ht localht = new ht();
    com.tencent.mm.sdk.b.a.vgX.m(localht);
    ((brd)localObject).vaT = localht.eLh.eLi;
    if (localall != null)
    {
      ((brd)localObject).vaV = localall.tYy;
      ((brd)localObject).vaW = localall.tYz;
    }
    ((brd)localObject).vaX = b.gqW;
    ((brd)localObject).vba = paramb.gRo;
    ((brd)localObject).vbb = paramb.gRt;
    ((brd)localObject).vbc = paramb.gRu;
    ((brd)localObject).vaY = b.gqX;
    ((brd)localObject).uJY = paramb.gRk;
    w.i("MicroMsg.NetSceneWeAppSearch", "NetSceneWeAppSearch oreh SessionID : %s, KeywordID : %s, LocationX : %s, LocationY : %s", new Object[] { ((brd)localObject).vaX, ((brd)localObject).vaY, Double.valueOf(((brd)localObject).vaV), Double.valueOf(((brd)localObject).vaW) });
    GMTrace.o(14451088556032L, 107669);
  }
  
  private static all CO()
  {
    GMTrace.i(12926240948224L, 96308);
    try
    {
      at.AR();
      Object localObject = (String)c.xh().get(67591, null);
      if (localObject != null)
      {
        all localall = new all();
        localObject = ((String)localObject).split(",");
        localall.ujb = Integer.valueOf(localObject[0]).intValue();
        localall.uje = Integer.valueOf(localObject[1]).intValue();
        localall.tYz = (Integer.valueOf(localObject[2]).intValue() / 1000000.0F);
        localall.tYy = (Integer.valueOf(localObject[3]).intValue() / 1000000.0F);
        w.i("MicroMsg.NetSceneWeAppSearch", "lbs location is not null, %f, %f", new Object[] { Float.valueOf(localall.tYz), Float.valueOf(localall.tYy) });
        GMTrace.o(12926240948224L, 96308);
        return localall;
      }
      w.i("MicroMsg.NetSceneWeAppSearch", "lbs location is null, lbsContent is null!");
      GMTrace.o(12926240948224L, 96308);
      return null;
    }
    catch (Exception localException)
    {
      w.i("MicroMsg.NetSceneWeAppSearch", "lbs location is null, reason %s", new Object[] { localException.getMessage() });
      GMTrace.o(12926240948224L, 96308);
    }
    return null;
  }
  
  public final String CM()
  {
    GMTrace.i(12925972512768L, 96306);
    if (this.grc != null)
    {
      String str = this.grc.tWC;
      GMTrace.o(12925972512768L, 96306);
      return str;
    }
    GMTrace.o(12925972512768L, 96306);
    return "";
  }
  
  public final int CN()
  {
    GMTrace.i(12926106730496L, 96307);
    if (this.grc != null)
    {
      int i = this.grc.vbd;
      GMTrace.o(12926106730496L, 96307);
      return i;
    }
    GMTrace.o(12926106730496L, 96307);
    return 0;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12925838295040L, 96305);
    w.i("MicroMsg.NetSceneWeAppSearch", "doScene");
    this.fXo = parame1;
    int i = a(parame, this.grb, this);
    GMTrace.o(12925838295040L, 96305);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12925569859584L, 96303);
    w.i("MicroMsg.NetSceneWeAppSearch", "onGYNetEnd, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.grc = ((bre)this.grb.gtD.gtK);
    if (this.grc != null) {
      w.v("MicroMsg.NetSceneWeAppSearch", "return data\n%s", new Object[] { this.grc.tWC });
    }
    if (this.fXo != null) {
      this.fXo.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(12925569859584L, 96303);
  }
  
  public final int getType()
  {
    GMTrace.i(15657169059840L, 116655);
    GMTrace.o(15657169059840L, 116655);
    return 1162;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelappbrand\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */