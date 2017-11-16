package com.tencent.mm.plugin.recharge.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.mall.c;
import com.tencent.mm.protocal.c.abf;
import com.tencent.mm.protocal.c.abg;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public String htr;
  public String odH;
  public String odI;
  public int odO;
  public MallRechargeProduct odR;
  public List<MallRechargeProduct> odS;
  public String odT;
  
  public d(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    GMTrace.i(7857642668032L, 58544);
    this.odR = null;
    this.odS = null;
    this.odI = null;
    this.odH = paramString1;
    this.odO = paramInt;
    this.htr = paramString5;
    this.odT = paramString2;
    paramString5 = new b.a();
    paramString5.gtF = new abf();
    paramString5.gtG = new abg();
    paramString5.uri = "/cgi-bin/micromsg-bin/getlatestpayproductinfo";
    paramString5.gtE = 497;
    paramString5.gtH = 229;
    paramString5.gtI = 1000000229;
    this.fUa = paramString5.DA();
    paramString5 = (abf)this.fUa.gtC.gtK;
    paramString5.umF = paramString1;
    paramString5.umG = paramString3;
    paramString5.urE = paramString2;
    paramString5.umH = paramString4;
    paramString5.ugx = c.bzi().Km(paramString1);
    w.d("MicroMsg.NetSceneGetLatestPayProductInfo", String.format("funcId:%s, appId:%s, productId:%s, remark:%s", new Object[] { paramString1, paramString3, paramString2, paramString4 }));
    GMTrace.o(7857642668032L, 58544);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7858045321216L, 58547);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(7858045321216L, 58547);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(7857776885760L, 58545);
    w.d("MicroMsg.NetSceneGetLatestPayProductInfo", "errCode " + paramInt3 + ", errMsg " + paramString);
    paramArrayOfByte = (abg)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    w.d("MicroMsg.NetSceneGetLatestPayProductInfo", "resp.OurterRemark " + paramArrayOfByte.umK);
    paramq = paramArrayOfByte.umK;
    this.odI = "";
    if (!bg.nm(paramq))
    {
      paramq = paramq.split("&");
      if ((paramq != null) && (paramq.length > 0))
      {
        paramInt1 = 1;
        int i = 0;
        if (i < paramq.length)
        {
          String[] arrayOfString = paramq[i].split("=");
          int j = paramInt1;
          if (arrayOfString.length == 2)
          {
            if (paramInt1 != 0) {
              break label232;
            }
            this.odI += " ";
          }
          for (;;)
          {
            this.odI += arrayOfString[1];
            j = paramInt1;
            i += 1;
            paramInt1 = j;
            break;
            label232:
            paramInt1 = 0;
          }
        }
      }
    }
    if (!bg.nm(paramArrayOfByte.urG)) {}
    try
    {
      paramq = new JSONObject(paramArrayOfByte.urG);
      this.odS = b.a(this.odH, paramq.optJSONArray("product_info"));
      if ((paramInt2 == 0) && (paramInt3 == 0))
      {
        paramq = paramArrayOfByte.urF;
        w.d("MicroMsg.NetSceneGetLatestPayProductInfo", "resp.Product " + paramq);
        if (bg.nm(paramq)) {}
      }
    }
    catch (JSONException paramq)
    {
      try
      {
        this.odR = b.d(this.odH, new JSONObject(paramq));
        this.odR.odI = this.odI;
        w.d("MicroMsg.NetSceneGetLatestPayProductInfo", String.format("OutErrCode : %d ,OutErrMsg : %s , WxErrCode : %d , WxErrMsg : %s", new Object[] { Integer.valueOf(paramArrayOfByte.umI), paramArrayOfByte.umJ, Integer.valueOf(paramArrayOfByte.umL), paramArrayOfByte.umM }));
        paramInt1 = paramInt3;
        if (paramInt3 == 0)
        {
          if (paramArrayOfByte.umL != 0) {
            paramInt1 = paramArrayOfByte.umL;
          }
        }
        else
        {
          paramq = paramString;
          if (bg.nm(paramString))
          {
            if (bg.nm(paramArrayOfByte.umM)) {
              break label526;
            }
            paramq = paramArrayOfByte.umM;
          }
          this.fUd.a(paramInt2, paramInt1, paramq, this);
          GMTrace.o(7857776885760L, 58545);
          return;
          paramq = paramq;
          w.printErrStackTrace("MicroMsg.NetSceneGetLatestPayProductInfo", paramq, "", new Object[0]);
        }
      }
      catch (JSONException paramq)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.NetSceneGetLatestPayProductInfo", paramq, "", new Object[0]);
          continue;
          paramInt1 = paramArrayOfByte.umI;
          continue;
          label526:
          paramq = paramArrayOfByte.umJ;
        }
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(7857911103488L, 58546);
    GMTrace.o(7857911103488L, 58546);
    return 497;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\recharge\model\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */