package com.tencent.mm.plugin.recharge.model;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet.a.d;
import com.tencent.mm.plugin.wallet.a.m;
import com.tencent.mm.plugin.wallet.a.n;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.asg;
import com.tencent.mm.protocal.c.ash;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class f
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public String appId;
  public int cmdId;
  public String desc;
  public String eAR;
  public int errCode;
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public String nLL;
  public boolean odZ;
  public ArrayList<n> oea;
  public ArrayList<n> oeb;
  public d oec;
  public d oed;
  public d oee;
  public d oef;
  public d oeg;
  public m oeh;
  public List<a> oei;
  public boolean oej;
  
  public f(String paramString)
  {
    this(paramString, 0);
    GMTrace.i(7856300490752L, 58534);
    GMTrace.o(7856300490752L, 58534);
  }
  
  public f(String paramString, int paramInt)
  {
    GMTrace.i(7856434708480L, 58535);
    this.nLL = "";
    this.appId = "";
    this.odZ = false;
    this.desc = "";
    this.errCode = 0;
    this.eAR = "";
    this.oej = false;
    this.nLL = paramString;
    paramString = new b.a();
    paramString.gtF = new asg();
    paramString.gtG = new ash();
    paramString.uri = "/cgi-bin/mmpay-bin/paychargeproxy";
    paramString.gtE = 1571;
    paramString.gtH = 0;
    paramString.gtI = 0;
    this.fUa = paramString.DA();
    paramString = (asg)this.fUa.gtC.gtK;
    paramString.uei = paramInt;
    this.cmdId = paramInt;
    w.i("MicroMsg.NetScenePayChargeProxy", "cmdId: %d", new Object[] { Integer.valueOf(paramInt) });
    if (!bg.nm(this.nLL))
    {
      w.i("MicroMsg.NetScenePayChargeProxy", "hy: requesting phone num: %s", new Object[] { this.nLL });
      paramString.uIm = String.format("phone=%s", new Object[] { this.nLL });
    }
    GMTrace.o(7856434708480L, 58535);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7856703143936L, 58537);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(7856703143936L, 58537);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(7856837361664L, 58538);
    w.i("MicroMsg.NetScenePayChargeProxy", "hy: NetScenePayChargeProxy end: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.errCode = paramInt3;
    Object localObject;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (ash)((b)paramq).gtD.gtK;
      n localn;
      try
      {
        paramq = new JSONObject(paramq.uIn);
        w.d("MicroMsg.NetScenePayChargeProxy", "tofutest: json: %s", new Object[] { paramq.toString() });
        this.appId = paramq.optString("appId");
        this.errCode = paramq.optInt("errCode", -1);
        this.eAR = paramq.optString("errMsg", ab.getContext().getString(a.i.tcn));
        if (this.errCode < 0) {}
        for (this.odZ = true;; this.odZ = false)
        {
          this.desc = paramq.optString("desc");
          paramArrayOfByte = paramq.optJSONArray("productList");
          if (paramArrayOfByte == null) {
            break label494;
          }
          this.oea = new ArrayList();
          this.oeb = new ArrayList();
          paramInt1 = 0;
          if (paramInt1 >= paramArrayOfByte.length()) {
            break label504;
          }
          localObject = paramArrayOfByte.getJSONObject(paramInt1);
          localn = new n();
          localn.desc = ((JSONObject)localObject).optString("desc", "");
          localn.id = ((JSONObject)localObject).optString("id", "");
          localn.name = ((JSONObject)localObject).optString("name", "");
          localn.status = ((JSONObject)localObject).optInt("status", 0);
          localn.url = ((JSONObject)localObject).optString("url", "");
          localn.type = ((JSONObject)localObject).optInt("type");
          localn.qXV = ((JSONObject)localObject).optString("typeName");
          localn.qXX = ((JSONObject)localObject).optString("isColor", "0");
          localn.qXY = ((JSONObject)localObject).optString("colorCode", "0");
          localn.qXZ = ((JSONObject)localObject).optInt("isReConfirm", 0);
          if (localn.type != 1) {
            break;
          }
          this.oea.add(localn);
          break label1312;
        }
        this.fUd.a(paramInt2, paramInt3, paramString, this);
      }
      catch (Exception paramq)
      {
        w.e("MicroMsg.NetScenePayChargeProxy", "hy: exception occurred when parsing json: %s", new Object[] { paramq.toString() });
        this.odZ = true;
        this.eAR = ab.getContext().getString(a.i.tcn);
      }
      label445:
      GMTrace.o(7856837361664L, 58538);
      return;
      localn.qXW = ((JSONObject)localObject).optString("productAttr");
      this.oeb.add(localn);
      break label1312;
      label494:
      this.oea = null;
      this.oeb = null;
      label504:
      localObject = paramq.optJSONObject("weSim");
      if (localObject != null)
      {
        paramArrayOfByte = ((JSONObject)localObject).optString("url");
        localObject = ((JSONObject)localObject).optString("name");
        if ((bg.nm(paramArrayOfByte)) || (bg.nm((String)localObject)))
        {
          w.w("MicroMsg.NetScenePayChargeProxy", "tf: weSim is missing");
          this.oef = null;
        }
      }
      else
      {
        label568:
        localObject = paramq.optJSONObject("wxRemind");
        if (localObject != null)
        {
          paramArrayOfByte = ((JSONObject)localObject).optString("url");
          localObject = ((JSONObject)localObject).optString("name");
          if ((!bg.nm(paramArrayOfByte)) && (!bg.nm((String)localObject))) {
            break label996;
          }
          w.w("MicroMsg.NetScenePayChargeProxy", "hy: remind unicom unnecessary element missing");
        }
        this.oec = null;
        label632:
        localObject = paramq.optJSONObject("wxCard");
        if (localObject != null)
        {
          paramArrayOfByte = ((JSONObject)localObject).optString("url");
          localObject = ((JSONObject)localObject).optString("name");
          if ((!bg.nm(paramArrayOfByte)) && (!bg.nm((String)localObject))) {
            break label1028;
          }
          w.w("MicroMsg.NetScenePayChargeProxy", "hy: phone card necessary element missing");
        }
        this.oed = null;
        label696:
        localObject = paramq.optJSONObject("wxWt");
        if (localObject != null)
        {
          paramArrayOfByte = ((JSONObject)localObject).optString("url");
          localObject = ((JSONObject)localObject).optString("name");
          if ((!bg.nm(paramArrayOfByte)) && (!bg.nm((String)localObject))) {
            break label1060;
          }
          w.w("MicroMsg.NetScenePayChargeProxy", "hy: phone hall necessary element missing");
        }
        this.oee = null;
        label760:
        paramArrayOfByte = paramq.optJSONObject("banner");
        if (paramArrayOfByte == null) {
          break label1092;
        }
        this.oeh = new m();
        this.oeh.id = paramArrayOfByte.getInt("id");
        this.oeh.name = paramArrayOfByte.optString("name");
        this.oeh.url = paramArrayOfByte.optString("url");
        label831:
        localObject = paramq.optJSONObject("headEnter");
        if (localObject != null)
        {
          paramArrayOfByte = ((JSONObject)localObject).optString("name");
          localObject = ((JSONObject)localObject).optString("url");
          if ((!bg.nm(paramArrayOfByte)) && (!bg.nm((String)localObject))) {
            break label1100;
          }
          w.w("MicroMsg.NetScenePayChargeProxy", "tf: headEnter is missing");
        }
        this.oeg = null;
      }
      for (;;)
      {
        paramq = paramq.optJSONArray("numberList");
        if (paramq == null) {
          break label1255;
        }
        if (bg.nm(this.nLL)) {
          this.oej = true;
        }
        if (paramq.length() > 0) {
          break label1132;
        }
        w.w("MicroMsg.NetScenePayChargeProxy", "number length is short! %s", new Object[] { Integer.valueOf(paramq.length()) });
        this.oei = null;
        break;
        this.oef = new d();
        this.oef.url = paramArrayOfByte;
        this.oef.name = ((String)localObject);
        break label568;
        label996:
        this.oec = new d();
        this.oec.url = paramArrayOfByte;
        this.oec.name = ((String)localObject);
        break label632;
        label1028:
        this.oed = new d();
        this.oed.url = paramArrayOfByte;
        this.oed.name = ((String)localObject);
        break label696;
        label1060:
        this.oee = new d();
        this.oee.url = paramArrayOfByte;
        this.oee.name = ((String)localObject);
        break label760;
        label1092:
        this.oeh = null;
        break label831;
        label1100:
        this.oeg = new d();
        this.oeg.name = paramArrayOfByte;
        this.oeg.url = ((String)localObject);
      }
      label1132:
      this.oei = new ArrayList();
      paramInt1 = 0;
    }
    for (;;)
    {
      if (paramInt1 < paramq.length())
      {
        localObject = paramq.optJSONObject(paramInt1);
        if (localObject != null)
        {
          paramArrayOfByte = ((JSONObject)localObject).optString("number");
          localObject = ((JSONObject)localObject).optString("desc");
          if (!bg.nm(paramArrayOfByte))
          {
            paramArrayOfByte = new a(paramArrayOfByte, "", (String)localObject, 2);
            this.oei.add(paramArrayOfByte);
          }
        }
      }
      else
      {
        w.i("MicroMsg.NetScenePayChargeProxy", "number list: %s", new Object[] { Integer.valueOf(this.oei.size()) });
        break label445;
        label1255:
        this.oei = null;
        w.w("MicroMsg.NetScenePayChargeProxy", "empty numberList");
        break label445;
        this.odZ = true;
        paramq = paramString;
        if (bg.nm(paramString)) {
          paramq = ab.getContext().getString(a.i.tbj);
        }
        this.eAR = paramq;
        paramString = paramq;
        break label445;
        label1312:
        paramInt1 += 1;
        break;
      }
      paramInt1 += 1;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(7856568926208L, 58536);
    GMTrace.o(7856568926208L, 58536);
    return 1571;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\recharge\model\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */