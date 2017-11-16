package com.tencent.mm.wallet_core.c;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.c.at;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public abstract class h
  extends l
{
  public com.tencent.mm.ad.b fUa;
  public e fUd;
  public int rft;
  public String rfu;
  public int rfv;
  public String rfw;
  public int rfx;
  public String xDl;
  public String xDm;
  public String xDn;
  public boolean xDo;
  protected String xDp;
  public boolean xDq;
  private Map<String, String> xDr;
  
  public h()
  {
    GMTrace.i(1447001325568L, 10781);
    this.xDl = "";
    this.xDm = "";
    this.xDn = "";
    this.xDo = false;
    this.rft = 0;
    this.rfu = "";
    this.rfv = 0;
    this.rfw = "";
    this.rfx = 0;
    this.xDq = false;
    this.xDr = new HashMap();
    GMTrace.o(1447001325568L, 10781);
  }
  
  public abstract String Kb(String paramString);
  
  public abstract void a(int paramInt, String paramString, JSONObject paramJSONObject);
  
  public abstract void a(com.tencent.mm.ad.b paramb, azp paramazp);
  
  public final void a(PayInfo paramPayInfo, Map<String, String> paramMap1, Map<String, String> paramMap2)
  {
    GMTrace.i(1448746156032L, 10794);
    a(paramPayInfo, paramMap1, paramMap2, false);
    GMTrace.o(1448746156032L, 10794);
  }
  
  public final void a(PayInfo paramPayInfo, Map<String, String> paramMap1, Map<String, String> paramMap2, boolean paramBoolean)
  {
    GMTrace.i(1448880373760L, 10795);
    Object localObject = paramMap2;
    if (paramMap2 == null) {
      localObject = new HashMap();
    }
    if (paramPayInfo == null)
    {
      w.e("MicroMsg.NetScenePayBase", "Cmd : " + bxK() + ", payInfo is null");
      ((Map)localObject).put("devicename", Build.MODEL);
      ap((Map)localObject);
      GMTrace.o(1448880373760L, 10795);
      return;
    }
    paramMap1.put("req_key", paramPayInfo.eHG);
    paramMap1.put("partner_id", paramPayInfo.partnerId);
    paramMap1.put("pay_sign", paramPayInfo.eXm);
    if (paramPayInfo.tIH >= 0) {
      paramMap1.put("auto_deduct_flag", paramPayInfo.tIH);
    }
    if (paramPayInfo.ePL > 0) {
      paramMap1.put("pay_scene", paramPayInfo.ePL);
    }
    if (paramPayInfo.ePM >= 0) {
      paramMap1.put("bindbankscene", paramPayInfo.ePM);
    }
    if (!bg.nm(paramPayInfo.tII)) {
      paramMap1.put("deduct_bank_type", paramPayInfo.tII);
    }
    if (!bg.nm(paramPayInfo.tIJ)) {
      paramMap1.put("deduct_bind_serial", paramPayInfo.tIJ);
    }
    if (paramBoolean) {
      paramMap1.put("use_touch", "0");
    }
    for (;;)
    {
      paramMap1.put("fp_identify_num", paramPayInfo.tIE);
      if (!TextUtils.isEmpty(paramPayInfo.eJR)) {
        paramMap1.put("encrypted_pay_info", URLEncoder.encode(paramPayInfo.eJR));
      }
      if (!TextUtils.isEmpty(paramPayInfo.eJS)) {
        paramMap1.put("encrypted_rsa_sign", URLEncoder.encode(paramPayInfo.eJS));
      }
      ((Map)localObject).put("uuid", paramPayInfo.lOv);
      ((Map)localObject).put("appid", paramPayInfo.appId);
      ((Map)localObject).put("appsource", paramPayInfo.rse);
      ((Map)localObject).put("channel", paramPayInfo.ePH);
      ((Map)localObject).put("devicename", Build.MODEL);
      ((Map)localObject).put("soter_req", paramPayInfo.ePr);
      GMTrace.o(1448880373760L, 10795);
      return;
      paramMap1.put("use_touch", paramPayInfo.tID);
    }
  }
  
  public void a(c paramc, JSONObject paramJSONObject)
  {
    GMTrace.i(1447403978752L, 10784);
    GMTrace.o(1447403978752L, 10784);
  }
  
  public final int aMh()
  {
    GMTrace.i(1449551462400L, 10800);
    int i = bxK();
    GMTrace.o(1449551462400L, 10800);
    return i;
  }
  
  public boolean aVn()
  {
    GMTrace.i(1449417244672L, 10799);
    this.gtX = bg.Pw();
    this.gtY = -1;
    this.aCN = -99;
    GMTrace.o(1449417244672L, 10799);
    return false;
  }
  
  public boolean aVo()
  {
    GMTrace.i(1449819897856L, 10802);
    GMTrace.o(1449819897856L, 10802);
    return true;
  }
  
  public String aWg()
  {
    GMTrace.i(1449148809216L, 10797);
    GMTrace.o(1449148809216L, 10797);
    return null;
  }
  
  public final void ao(Map<String, String> paramMap)
  {
    GMTrace.i(1448209285120L, 10790);
    paramMap.remove("uin");
    if (this.xDr == null) {
      this.xDr = new HashMap();
    }
    if (this.xDr != null) {
      this.xDr.remove("uin");
    }
    Object[] arrayOfObject = paramMap.keySet().toArray();
    int i = 0;
    while (i < arrayOfObject.length)
    {
      Object localObject = arrayOfObject[i];
      String str = (String)paramMap.get(localObject);
      if (this.xDr.containsKey(localObject)) {
        this.xDr.remove(localObject);
      }
      this.xDr.put((String)localObject, str);
      i += 1;
    }
    x(this.xDr);
    GMTrace.o(1448209285120L, 10790);
  }
  
  public final void ap(Map<String, String> paramMap)
  {
    GMTrace.i(1448611938304L, 10793);
    z(false, false);
    if (paramMap != null)
    {
      Object localObject1 = com.tencent.mm.plugin.wallet_core.model.h.byp();
      if (localObject1 != null)
      {
        w.i("MicroMsg.NetScenePayBase", "location found");
        paramMap.put("province", ((at)localObject1).fjk);
        if (!paramMap.containsKey("city")) {
          paramMap.put("city", ((at)localObject1).fjl);
        }
        paramMap.put("location_timestamp", ((at)localObject1).tOQ);
        paramMap.put("encrypt_key", ((at)localObject1).tOU);
        paramMap.put("encrypt_userinfo", ((at)localObject1).tOT);
      }
      localObject1 = paramMap.keySet().toArray();
      Arrays.sort((Object[])localObject1);
      StringBuilder localStringBuilder = new StringBuilder();
      int i = 0;
      int k;
      for (int j = 0; i < localObject1.length; j = k)
      {
        Object localObject2 = localObject1[i];
        String str = (String)paramMap.get(localObject2);
        k = j;
        if (!bg.nm(str))
        {
          if (j != 0) {
            localStringBuilder.append("&");
          }
          localStringBuilder.append(localObject2);
          localStringBuilder.append("=");
          localStringBuilder.append(str);
          k = 1;
        }
        i += 1;
      }
      if (com.tencent.mm.sdk.a.b.bPq()) {
        w.d("MicroMsg.NetScenePayBase", "Cmd : " + bxK() + ", wxreq = " + localStringBuilder.toString());
      }
      w.d("MicroMsg.NetScenePayBase", "wxreq: " + localStringBuilder.toString());
      paramMap = localStringBuilder.toString().getBytes();
      paramMap = new azp().be(paramMap);
      b(this.fUa, paramMap);
    }
    GMTrace.o(1448611938304L, 10793);
  }
  
  public abstract void b(com.tencent.mm.ad.b paramb, azp paramazp);
  
  public void b(StringBuilder paramStringBuilder, String paramString)
  {
    GMTrace.i(1448477720576L, 10792);
    paramStringBuilder.append(paramString);
    GMTrace.o(1448477720576L, 10792);
  }
  
  public boolean bbt()
  {
    GMTrace.i(1449283026944L, 10798);
    GMTrace.o(1449283026944L, 10798);
    return false;
  }
  
  public abstract int bxK();
  
  public final String clH()
  {
    GMTrace.i(1449685680128L, 10801);
    String str = this.xDp;
    GMTrace.o(1449685680128L, 10801);
    return str;
  }
  
  public abstract m d(com.tencent.mm.ad.b paramb);
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(1449014591488L, 10796);
    int j = paramInt1;
    int i = paramInt2;
    if (com.tencent.mm.platformtools.r.hld)
    {
      j = paramInt1;
      i = paramInt2;
      if (1686 == bxK())
      {
        j = 3;
        i = -1;
      }
    }
    w.i("MicroMsg.NetScenePayBase", "cgi: %d, rrType %d, rrCgi %s, PayCgicmd %s, errType %d, errCode %d, errMsg %s, this: %s ", new Object[] { Integer.valueOf(getType()), Integer.valueOf(paramq.getType()), paramq.getUri(), Integer.valueOf(bxK()), Integer.valueOf(j), Integer.valueOf(i), paramString, toString() });
    Object localObject = d((com.tencent.mm.ad.b)paramq);
    paramInt2 = ((m)localObject).uwY;
    String str3 = ((m)localObject).uwZ;
    int k = ((m)localObject).xDt;
    String str1 = ((m)localObject).kBl;
    paramq = ab.getContext().getString(a.i.tbj);
    localJSONObject = null;
    localObject = n.b(((m)localObject).uwX);
    if (!bg.nm((String)localObject)) {}
    for (;;)
    {
      try
      {
        localJSONObject = new JSONObject((String)localObject);
      }
      catch (Exception localException2)
      {
        String str2;
        localJSONObject = null;
        continue;
      }
      try
      {
        this.xDp = localJSONObject.optString("error_detail_url");
        paramInt1 = localJSONObject.getInt("retcode");
        localObject = localJSONObject.optString("retmsg");
        paramq = (q)localObject;
        try
        {
          this.xDl = localJSONObject.optString("pay_flag");
          this.xDm = localJSONObject.optString("return_url");
          this.xDn = localJSONObject.optString("wappay_jumped_url");
          this.rft = localJSONObject.optInt("is_gen_cert");
          this.rfu = localJSONObject.optString("crt_token");
          this.rfv = localJSONObject.optInt("is_hint_crt");
          localObject = localJSONObject.optJSONObject("crt_wording");
          if (localObject != null)
          {
            this.rfw = ((JSONObject)localObject).toString();
            this.rfx = localJSONObject.optInt("is_ignore_crt");
            if (localJSONObject.optInt("del_cert", 0) != 0)
            {
              r.clT();
              localObject = r.clS();
              w.i("MicroMsg.NetScenePayBase", "clean token %s", new Object[] { localObject });
              r.clT().Xt((String)localObject);
            }
            this.xDq = true;
            if (com.tencent.mm.sdk.a.b.bPq()) {
              w.i("MicroMsg.NetScenePayBase", "RP:hy: FOR UNIT TEST: cgi: %d, cmd: %d, errType: %d, errCode: %d, errMsg: %s, platRet: %d, platMsg: %s, biz_ErrType: %d, biz_ErrMsg: %s, retcode: %d, retMsg: %s, json: %s this %s", new Object[] { Integer.valueOf(getType()), Integer.valueOf(bxK()), Integer.valueOf(j), Integer.valueOf(i), paramString, Integer.valueOf(paramInt2), str3, Integer.valueOf(k), str1, Integer.valueOf(paramInt1), paramq, localJSONObject, toString() });
            }
            localObject = new c(j, i, paramString);
            if ((j != 0) || (i != 0)) {
              continue;
            }
            if (paramInt2 == 0) {
              continue;
            }
            w.w("MicroMsg.NetScenePayBase", "hy: resolve busi error: plat ret is error");
            ((c)localObject).c(1000, paramInt2, str3, 1);
            if (localJSONObject == null) {
              continue;
            }
            if (((((c)localObject).errType != 0) || (((c)localObject).errCode != 0)) && (!bbt())) {
              continue;
            }
            a(((c)localObject).errCode, ((c)localObject).eAR, localJSONObject);
            a((c)localObject, localJSONObject);
            if (!this.xDo) {
              continue;
            }
            w.d("MicroMsg.NetScenePayBase", "hy: user consumed the call back");
            GMTrace.o(1449014591488L, 10796);
            return;
          }
          this.rfw = "";
          continue;
          w.w("MicroMsg.NetScenePayBase", "hy: json resolve error: error when resolving error code : " + localException1.toString());
        }
        catch (Exception localException1) {}
      }
      catch (Exception localException3)
      {
        continue;
      }
      paramInt1 = 55447;
      str2 = ab.getContext().getString(a.i.tcn);
      continue;
      w.w("MicroMsg.NetScenePayBase", "hy: respString is null");
      paramInt1 = 55448;
      continue;
      if (k != 0)
      {
        w.w("MicroMsg.NetScenePayBase", "hy: resolve busi error: errType is error");
        ((c)localObject).c(1000, k, str2, 2);
      }
      else if (paramInt1 != 0)
      {
        w.w("MicroMsg.NetScenePayBase", "hy: resolve busi error: retCode is error");
        if ((paramInt1 != 55447) && (paramInt1 != 55448)) {
          ((c)localObject).c(1000, paramInt1, paramq, 2);
        } else {
          ((c)localObject).c(1000, 2, paramq, 2);
        }
      }
      else
      {
        w.i("MicroMsg.NetScenePayBase", "hy: all's OK");
        continue;
        w.w("MicroMsg.NetScenePayBase", "hy: resolve system error.");
        paramString = bh.q(paramString, "e");
        if (paramString != null)
        {
          w.d("MicroMsg.NetScenePayBase", "hy: CDN error!");
          ((c)localObject).eAR = ((String)paramString.get(".e.Content"));
        }
        else if ((i == -1) || (i == 65036))
        {
          w.w("MicroMsg.NetScenePayBase", "hy: network error");
          ((c)localObject).eAR = ab.getContext().getString(a.i.tcN);
        }
        else
        {
          w.w("MicroMsg.NetScenePayBase", "hy: unknown system error");
          ((c)localObject).eAR = ab.getContext().getString(a.i.tbj);
          continue;
          w.i("MicroMsg.NetScenePayBase", "hy: ret code is not ok and should not resolve when error");
          continue;
          w.i("MicroMsg.NetScenePayBase", "hy: no json object when doing business");
        }
      }
    }
    this.fUd.a(((c)localObject).errType, ((c)localObject).errCode, ((c)localObject).eAR, this);
    GMTrace.o(1449014591488L, 10796);
  }
  
  public final void x(Map<String, String> paramMap)
  {
    GMTrace.i(1448343502848L, 10791);
    Object localObject1 = paramMap;
    if (paramMap == null) {
      localObject1 = new HashMap();
    }
    if (localObject1 != null) {
      ((Map)localObject1).remove("uin");
    }
    this.xDr = ((Map)localObject1);
    z(true, true);
    StringBuilder localStringBuilder;
    if (localObject1 != null)
    {
      paramMap = ((Map)localObject1).keySet().toArray();
      Arrays.sort(paramMap);
      localStringBuilder = new StringBuilder();
      int i = 0;
      int k;
      for (int j = 0; i < paramMap.length; j = k)
      {
        Object localObject2 = paramMap[i];
        String str = (String)((Map)localObject1).get(localObject2);
        k = j;
        if (!bg.nm(str))
        {
          if (j != 0) {
            localStringBuilder.append("&");
          }
          localStringBuilder.append(localObject2);
          localStringBuilder.append("=");
          b(localStringBuilder, str);
          k = 1;
        }
        i += 1;
      }
      if (!com.tencent.mm.sdk.a.b.bPq()) {
        break label389;
      }
      w.v("MicroMsg.NetScenePayBase", "RQ: Cmd : " + bxK() + ", req = " + localStringBuilder.toString() + " " + toString() + " " + bg.bQW().toString());
      localObject1 = Kb(localStringBuilder.toString());
      if (j == 0) {
        break label444;
      }
    }
    label389:
    label444:
    for (paramMap = "&";; paramMap = "")
    {
      localStringBuilder.append(paramMap);
      localStringBuilder.append("WCPaySign");
      localStringBuilder.append("=");
      localStringBuilder.append((String)localObject1);
      paramMap = localStringBuilder.toString().getBytes();
      paramMap = new azp().be(paramMap);
      a(this.fUa, paramMap);
      w.i("MicroMsg.NetScenePayBase", "setRequestData getPayCgicmd: %s type: %s this: %s cgi %s ", new Object[] { Integer.valueOf(bxK()), Integer.valueOf(getType()), toString(), this.fUa.uri });
      GMTrace.o(1448343502848L, 10791);
      return;
      w.d("MicroMsg.NetScenePayBase", "RQ: Cmd : " + bxK() + ", req = " + localStringBuilder.toString() + " " + toString());
      break;
    }
  }
  
  public abstract void z(boolean paramBoolean1, boolean paramBoolean2);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\c\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */