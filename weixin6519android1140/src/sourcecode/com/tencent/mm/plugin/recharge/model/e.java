package com.tencent.mm.plugin.recharge.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ace;
import com.tencent.mm.protocal.c.acf;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public String odH;
  public ArrayList<MallRechargeProduct> odU;
  public String odV;
  public String odW;
  public String odX;
  public String odY;
  
  public e(String paramString)
  {
    GMTrace.i(7854153007104L, 58518);
    this.odU = null;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ace();
    ((b.a)localObject).gtG = new acf();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getpayfunctionproductlist";
    ((b.a)localObject).gtE = 496;
    ((b.a)localObject).gtH = 228;
    ((b.a)localObject).gtI = 1000000228;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ace)this.fUa.gtC.gtK;
    this.odH = paramString;
    ((ace)localObject).umF = paramString;
    GMTrace.o(7854153007104L, 58518);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7854555660288L, 58521);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(7854555660288L, 58521);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(7854287224832L, 58519);
    w.d("MicroMsg.NetSceneGetPayFunctionProductList", "errType " + paramInt2 + ", errCode " + paramInt3 + ", errMsg " + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (acf)((com.tencent.mm.ad.b)paramq).gtD.gtK;
      paramArrayOfByte = paramq.urG;
      w.d("MicroMsg.NetSceneGetPayFunctionProductList", "resp.ProductList " + paramArrayOfByte);
      if (bg.nm(paramArrayOfByte)) {}
    }
    try
    {
      paramArrayOfByte = new JSONObject(paramArrayOfByte);
      this.odU = b.a(this.odH, paramArrayOfByte.getJSONArray("pay_product_list"));
      if (bg.nm(paramq.usD)) {}
    }
    catch (JSONException paramArrayOfByte)
    {
      try
      {
        paramq = new JSONObject(paramq.usD);
        this.odV = paramq.optString("balance_link");
        this.odX = paramq.optString("recharge_link");
        this.odW = paramq.optString("balance_wording");
        this.odY = paramq.optString("recharge_wording");
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(7854287224832L, 58519);
        return;
        paramArrayOfByte = paramArrayOfByte;
        w.printErrStackTrace("MicroMsg.NetSceneGetPayFunctionProductList", paramArrayOfByte, "", new Object[0]);
      }
      catch (JSONException paramq)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.NetSceneGetPayFunctionProductList", paramq, "", new Object[0]);
        }
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(7854421442560L, 58520);
    GMTrace.o(7854421442560L, 58520);
    return 496;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\recharge\model\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */