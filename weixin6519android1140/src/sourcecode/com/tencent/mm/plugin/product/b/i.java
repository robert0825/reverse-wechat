package com.tencent.mm.plugin.product.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.acq;
import com.tencent.mm.protocal.c.acr;
import com.tencent.mm.protocal.c.px;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class i
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public String mUrl;
  public LinkedList<px> nIa;
  
  public i(String paramString1, String paramString2)
  {
    GMTrace.i(5988258152448L, 44616);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new acq();
    ((b.a)localObject).gtG = new acr();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getproductdiscount";
    ((b.a)localObject).gtE = 579;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (acq)this.fUa.gtC.gtK;
    ((acq)localObject).tYP = paramString1;
    this.mUrl = paramString2;
    ((acq)localObject).lPM = paramString2;
    GMTrace.o(5988258152448L, 44616);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5988660805632L, 44619);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5988660805632L, 44619);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5988392370176L, 44617);
    paramArrayOfByte = (acr)((b)paramq).gtD.gtK;
    if ((paramInt2 == 0) && (paramInt3 == 0) && (paramArrayOfByte.tYQ == 0))
    {
      w.d("MicroMsg.NetSceneMallGetProductDiscount", "resp.ProductInfo " + paramArrayOfByte.usK);
      try
      {
        paramq = new JSONObject(paramArrayOfByte.usK).optJSONArray("discount_list");
        if (paramq != null)
        {
          this.nIa = new LinkedList();
          int i = paramq.length();
          paramInt1 = 0;
          while (paramInt1 < i)
          {
            JSONObject localJSONObject = paramq.getJSONObject(paramInt1);
            px localpx = new px();
            localpx.eBt = localJSONObject.getString("title");
            localpx.tXI = localJSONObject.getInt("fee");
            this.nIa.add(localpx);
            paramInt1 += 1;
          }
        }
        paramInt1 = paramInt3;
      }
      catch (Exception paramq) {}
    }
    paramq = paramString;
    if (paramInt3 == 0)
    {
      paramInt1 = paramInt3;
      paramq = paramString;
      if (paramArrayOfByte.tYQ != 0)
      {
        paramInt1 = paramArrayOfByte.tYQ;
        paramq = paramArrayOfByte.tYR;
      }
    }
    w.d("MicroMsg.NetSceneMallGetProductDiscount", "errCode " + paramInt1 + ", errMsg " + paramq);
    this.fUd.a(paramInt2, paramInt1, paramq, this);
    GMTrace.o(5988392370176L, 44617);
  }
  
  public final int getType()
  {
    GMTrace.i(5988526587904L, 44618);
    GMTrace.o(5988526587904L, 44618);
    return 579;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */