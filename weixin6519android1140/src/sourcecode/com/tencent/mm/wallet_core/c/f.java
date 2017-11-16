package com.tencent.mm.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f
  extends com.tencent.mm.wallet_core.g.a.h
{
  public boolean eUj;
  private int xDf;
  private a xDg;
  
  public f(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(1452906905600L, 10825);
    this.xDf = 0;
    this.eUj = true;
    this.xDg = null;
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    this.xDf = 1;
    an(localHashMap1);
    localHashMap1.put("type", com.tencent.mm.compatible.util.p.encode("1"));
    localHashMap1.put("true_name", com.tencent.mm.compatible.util.p.encode(paramString2));
    localHashMap1.put("id_no", com.tencent.mm.compatible.util.p.encode(paramString1));
    localHashMap1.put("id_type", com.tencent.mm.compatible.util.p.encode(String.valueOf(paramInt)));
    x(localHashMap1);
    ap(localHashMap2);
    GMTrace.o(1452906905600L, 10825);
  }
  
  public f(String paramString1, String paramString2, a parama, boolean paramBoolean)
  {
    GMTrace.i(1453041123328L, 10826);
    this.xDf = 0;
    this.eUj = true;
    this.xDg = null;
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    this.eUj = paramBoolean;
    this.xDf = 2;
    an(localHashMap1);
    localHashMap1.put("type", com.tencent.mm.compatible.util.p.encode("2"));
    localHashMap1.put("crt_sms", com.tencent.mm.compatible.util.p.encode(paramString1));
    localHashMap1.put("reqkey", com.tencent.mm.compatible.util.p.encode(paramString2));
    this.xDg = parama;
    x(localHashMap1);
    ap(localHashMap2);
    GMTrace.o(1453041123328L, 10826);
  }
  
  private static void an(Map<String, String> paramMap)
  {
    GMTrace.i(1452772687872L, 10824);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xw();
    String str1 = o.getString(com.tencent.mm.kernel.a.ww());
    String str2 = com.tencent.mm.compatible.d.p.getDeviceID(ab.getContext());
    byte[] arrayOfByte = new byte[16];
    Object localObject2 = n.clL().getBytes();
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (localObject2.length > 0) {}
    }
    else
    {
      localObject1 = System.currentTimeMillis().getBytes();
    }
    int j = 0;
    int i = 0;
    int k;
    do
    {
      arrayOfByte[i] = localObject1[j];
      k = i + 1;
      j += 1;
      i = j;
      if (j >= localObject1.length) {
        i = 0;
      }
      j = i;
      i = k;
    } while (k < 16);
    Object localObject1 = new String(arrayOfByte);
    localObject2 = aa.RP(str1 + str2);
    String str3 = aa.RP(str1 + (String)localObject2 + new String(arrayOfByte));
    w.i("MicroMsg.NetSceneGendigitalcert", "salt " + new String(arrayOfByte));
    w.i("MicroMsg.NetSceneGendigitalcert", "crt_csr uin: %s: devideid: %s crt: %s", new Object[] { str1, str2, str3 });
    str1 = a.clF().getCertApplyCSR(str3);
    try
    {
      paramMap.put("sn_salt", com.tencent.mm.compatible.util.p.encode((String)localObject1));
      paramMap.put("crt_csr", com.tencent.mm.compatible.util.p.encode(str1));
      paramMap.put("crt_device_id", localObject2);
      paramMap.put("device_os", d.DEVICE_TYPE);
      paramMap.put("device_name", d.tJy);
      GMTrace.o(1452772687872L, 10824);
      return;
    }
    catch (Exception paramMap)
    {
      GMTrace.o(1452772687872L, 10824);
    }
  }
  
  public final int Bb()
  {
    GMTrace.i(1453309558784L, 10828);
    GMTrace.o(1453309558784L, 10828);
    return 1580;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(1453577994240L, 10830);
    w.i("MicroMsg.NetSceneGendigitalcert", "errCode %d errMsg %s", new Object[] { Integer.valueOf(paramInt), paramString });
    for (;;)
    {
      try
      {
        paramString = paramJSONObject.optString("crt_crt");
        paramJSONObject = paramJSONObject.optString("crt_no");
        g.ork.a(414L, 0L, 1L, true);
        boolean bool = a.clF().importCert(paramJSONObject, paramString);
        r.Xs(paramJSONObject);
        if (bool)
        {
          g.ork.a(414L, 1L, 1L, true);
          w.i("MicroMsg.NetSceneGendigitalcert", "importCert crt_crt success");
          if (this.xDf == 1)
          {
            g.ork.i(13731, new Object[] { Integer.valueOf(3) });
            w.i("MicroMsg.NetSceneGendigitalcert", "_crt_crt %s _crt_no %s", new Object[] { aa.RP(paramString), paramJSONObject });
            GMTrace.o(1453577994240L, 10830);
          }
        }
        else
        {
          g.ork.a(414L, 2L, 1L, true);
          w.e("MicroMsg.NetSceneGendigitalcert", "importCert crt_crt fail");
          continue;
        }
        if (this.xDf != 2) {
          continue;
        }
      }
      catch (Exception paramString)
      {
        w.printErrStackTrace("MicroMsg.NetSceneGendigitalcert", paramString, "", new Object[0]);
        GMTrace.o(1453577994240L, 10830);
        return;
      }
      g.ork.i(13731, new Object[] { Integer.valueOf(7) });
    }
  }
  
  public final void a(c paramc, JSONObject paramJSONObject)
  {
    GMTrace.i(1453712211968L, 10831);
    a.clF().clG();
    if (paramc.errCode != 0)
    {
      if (this.xDf != 1) {
        break label91;
      }
      g.ork.i(13731, new Object[] { Integer.valueOf(4) });
    }
    for (;;)
    {
      if ((this.xDg != null) && ((!this.eUj) || (paramc.errCode == 0))) {
        this.xDg.bzY();
      }
      GMTrace.o(1453712211968L, 10831);
      return;
      label91:
      if (this.xDf == 2) {
        g.ork.i(13731, new Object[] { Integer.valueOf(8) });
      }
    }
  }
  
  public final boolean aVo()
  {
    GMTrace.i(1453846429696L, 10832);
    boolean bool = this.eUj;
    GMTrace.o(1453846429696L, 10832);
    return bool;
  }
  
  public final int aoD()
  {
    GMTrace.i(1453175341056L, 10827);
    GMTrace.o(1453175341056L, 10827);
    return 1580;
  }
  
  public final String getUri()
  {
    GMTrace.i(1453443776512L, 10829);
    GMTrace.o(1453443776512L, 10829);
    return "/cgi-bin/mmpay-bin/tenpay/gendigitalcert";
  }
  
  public static abstract interface a
  {
    public abstract void bzY();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */