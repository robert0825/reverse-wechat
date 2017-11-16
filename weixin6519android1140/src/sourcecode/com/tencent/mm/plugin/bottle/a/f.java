package com.tencent.mm.plugin.bottle.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.h;
import com.tencent.mm.ac.i;
import com.tencent.mm.ac.n;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.g.b.af;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ats;
import com.tencent.mm.protocal.c.att;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import java.util.Map;

public final class f
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  boolean joZ;
  
  public f()
  {
    GMTrace.i(7595649662976L, 56592);
    this.joZ = false;
    b.a locala = new b.a();
    locala.gtF = new ats();
    locala.gtG = new att();
    locala.uri = "/cgi-bin/micromsg-bin/pickbottle";
    locala.gtE = 155;
    locala.gtH = 54;
    locala.gtI = 1000000054;
    this.fUa = locala.DA();
    GMTrace.o(7595649662976L, 56592);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7595783880704L, 56593);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(7595783880704L, 56593);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(7596052316160L, 56595);
    w.d("MicroMsg.NetScenePickBottle", "onGYNetEnd type:" + paramInt2 + " code:" + paramInt3);
    if ((paramInt2 == 4) && ((paramInt3 == 63534) || (paramInt3 == -56)))
    {
      c.lc(0);
      c.ld(0);
    }
    paramArrayOfByte = (att)this.fUa.gtD.gtK;
    if (paramInt2 == 4) {
      switch (paramInt3)
      {
      default: 
        c.ld(paramArrayOfByte.upm);
        c.lc(paramArrayOfByte.upl);
      }
    }
    String str;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.joZ = true;
      w.d("MicroMsg.NetScenePickBottle", "bottle pack:pack:" + paramArrayOfByte.upm + " throw:" + paramArrayOfByte.upl);
      paramq = null;
      if (paramArrayOfByte.uHz != null) {
        paramq = paramArrayOfByte.uHz.split(":");
      }
      x localx;
      if ((paramq != null) && (paramq.length >= 2))
      {
        str = paramq[0];
        at.AR();
        paramq = com.tencent.mm.y.c.yK().TE(str);
        if ((paramq == null) || (!paramq.field_username.equals(str)))
        {
          localx = new x();
          localx.setUsername(str);
          if (paramArrayOfByte.jio != null) {
            break label855;
          }
          paramq = "";
          localx.cl(paramq);
          localx.dn(3);
          paramq = new h();
          paramq.username = str;
          paramq.fiZ = 3;
          paramq.bi(true);
          paramq.eQl = -1;
        }
      }
      try
      {
        Map localMap = bh.q(paramArrayOfByte.urj, "userinfo");
        if (localMap != null)
        {
          localx.jdMethod_do(bg.getInt((String)localMap.get(".userinfo.$sex"), 0));
          localx.cy((String)localMap.get(".userinfo.$signature"));
          localx.cE(RegionCodeDecoder.ai((String)localMap.get(".userinfo.$country"), (String)localMap.get(".userinfo.$province"), (String)localMap.get(".userinfo.$city")));
          w.d("MicroMsg.NetScenePickBottle", "user:" + str + " sig:" + localx.signature + " sex" + localx.fja + " city:" + localx.getCity() + " prov:" + localx.getProvince());
          paramq.gsU = ((String)localMap.get(".userinfo.$bigheadimgurl"));
          paramq.gsT = ((String)localMap.get(".userinfo.$smallheadimgurl"));
          paramq.eQl = -1;
          w.d("MicroMsg.NetScenePickBottle", "dkhurl user:[%s] big:[%s] sm:[%s]", new Object[] { str, paramq.Do(), paramq.Dp() });
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.NetScenePickBottle", "Set Contact failed " + localException.getMessage() + " user:" + str);
        }
      }
      at.AR();
      com.tencent.mm.y.c.yK().P(localx);
      n.Di().a(paramq);
      w.d("MicroMsg.NetScenePickBottle", "getBottleType " + paramArrayOfByte.uJj);
      w.d("MicroMsg.NetScenePickBottle", "getMsgType " + paramArrayOfByte.lQc);
      w.d("MicroMsg.NetScenePickBottle", "getBottleInfo " + paramArrayOfByte.uHz);
      w.d("MicroMsg.NetScenePickBottle", "getUserInfo " + paramArrayOfByte.urj);
      w.d("MicroMsg.NetScenePickBottle", "getNickName " + paramArrayOfByte.jio);
      w.d("MicroMsg.NetScenePickBottle", "getUserStatus " + paramArrayOfByte.uJk);
      w.d("MicroMsg.NetScenePickBottle", "getThrowCount " + paramArrayOfByte.upl);
      w.d("MicroMsg.NetScenePickBottle", "getPickCount " + paramArrayOfByte.upm);
      w.d("MicroMsg.NetScenePickBottle", "getDistance " + paramArrayOfByte.uJl);
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(7596052316160L, 56595);
      return;
      label855:
      paramq = paramArrayOfByte.jio;
      break;
      if (paramInt3 == -56)
      {
        c.ld(paramArrayOfByte.upm);
        c.ld(paramArrayOfByte.upl);
      }
    }
  }
  
  final att ahw()
  {
    GMTrace.i(7596186533888L, 56596);
    att localatt = (att)this.fUa.gtD.gtK;
    GMTrace.o(7596186533888L, 56596);
    return localatt;
  }
  
  public final int getType()
  {
    GMTrace.i(7595918098432L, 56594);
    GMTrace.o(7595918098432L, 56594);
    return 155;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\bottle\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */