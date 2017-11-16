package com.tencent.mm.modelgeo;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.vy;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private String eJI;
  public final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public d(double paramDouble1, double paramDouble2)
  {
    GMTrace.i(491371102208L, 3661);
    this.eJI = "";
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new vx();
    ((b.a)localObject).gtG = new vy();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getaddress";
    ((b.a)localObject).gtE = 655;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (vx)this.fUa.gtC.gtK;
    ((vx)localObject).tWn = paramDouble1;
    ((vx)localObject).tWm = paramDouble2;
    GMTrace.o(491371102208L, 3661);
  }
  
  public final Addr Iu()
  {
    int i = 0;
    GMTrace.i(491907973120L, 3665);
    if (bg.nm(this.eJI))
    {
      GMTrace.o(491907973120L, 3665);
      return null;
    }
    Addr localAddr = new Addr();
    for (;;)
    {
      try
      {
        w.d("MicroMsg.NetSceneGetAddress", "tofutest retJson: %s", new Object[] { this.eJI });
        Object localObject = new JSONObject(this.eJI);
        localAddr.gEI = ((JSONObject)localObject).optString("request_id");
        localObject = ((JSONObject)localObject).getJSONArray("results");
        localAddr.gEy = ((JSONArray)localObject).getJSONObject(1).getString("address_name");
        JSONObject localJSONObject = ((JSONArray)localObject).getJSONObject(0);
        localAddr.gEz = localJSONObject.getString("p");
        localAddr.gEA = localJSONObject.getString("c");
        localAddr.gEC = localJSONObject.getString("d");
        localAddr.gED = "";
        localAddr.gEE = "";
        localAddr.gEF = "";
        int j = ((JSONArray)localObject).length();
        if (i < j) {
          try
          {
            localJSONObject = ((JSONArray)localObject).getJSONObject(i);
            String str = localJSONObject.getString("dtype");
            if ("ST".equals(str))
            {
              localAddr.gEE = localJSONObject.getString("name");
              if (!"FORMAT_ADDRESS".equals(str)) {
                break label306;
              }
              localAddr.gEG = localJSONObject.getString("rough_address_name");
              break label306;
            }
            if (!"ST_NO".equals(str)) {
              continue;
            }
            localAddr.gEF = localJSONObject.getString("name");
            continue;
            if (bg.nm(localAddr.gEF)) {
              continue;
            }
          }
          catch (Exception localException2) {}
        }
        localAddr.gEE = "";
        GMTrace.o(491907973120L, 3665);
        return localAddr;
      }
      catch (Exception localException1)
      {
        GMTrace.o(491907973120L, 3665);
        return null;
      }
      label306:
      i += 1;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(491639537664L, 3663);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(491639537664L, 3663);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(491773755392L, 3664);
    w.d("MicroMsg.NetSceneGetAddress", "onGYNetEnd errType %d errCode%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.eJI = ((vy)((b)paramq).gtD.gtK).uov;
      w.d("MicroMsg.NetSceneGetAddress", this.eJI);
      if (this.fUd != null) {
        this.fUd.a(paramInt2, paramInt3, paramString, this);
      }
      GMTrace.o(491773755392L, 3664);
      return;
    }
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(491773755392L, 3664);
  }
  
  public final int getType()
  {
    GMTrace.i(491505319936L, 3662);
    GMTrace.o(491505319936L, 3662);
    return 655;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelgeo\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */