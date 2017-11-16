package com.tencent.mm.plugin.wallet_core.c;

import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wallet_core.model.p;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.o;
import com.tencent.mm.wallet_core.g.a.h;
import com.tencent.mm.wallet_core.ui.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class l
  extends h
{
  public String jwL;
  public String mTimeStamp;
  public String olm;
  public List<ElementQuery> rcu;
  public ElementQuery rcv;
  private int rcw;
  private int rcx;
  private int rcy;
  public Profession[] rcz;
  
  public l()
  {
    this(3, null, null, null, null, -1, -1);
    GMTrace.i(7037035479040L, 52430);
    GMTrace.o(7037035479040L, 52430);
  }
  
  private l(int paramInt1, String paramString1, String paramString2, PayInfo paramPayInfo, String paramString3, int paramInt2, int paramInt3)
  {
    GMTrace.i(7037169696768L, 52431);
    this.rcu = null;
    this.rcv = null;
    this.mTimeStamp = null;
    this.jwL = null;
    this.olm = null;
    this.rcw = 3;
    this.rcz = null;
    this.jwL = paramString2;
    this.rcw = 3;
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    a(paramPayInfo, localHashMap1, localHashMap2);
    localHashMap1.put("req_key", paramString1);
    localHashMap1.put("flag", "4");
    localHashMap1.put("card_id", paramString2);
    if (paramInt3 > 0)
    {
      localHashMap1.put("realname_scene", String.valueOf(paramInt3));
      w.i("MicroMsg.NetSenceTenPayBase", "realname_scene=%d", new Object[] { Integer.valueOf(paramInt3) });
    }
    if (paramInt2 == 8) {
      localHashMap1.put("scene", "1003");
    }
    localHashMap1.put("bank_card_tag", "3");
    localHashMap1.put("token", paramString3);
    x(localHashMap1);
    if (o.clM())
    {
      localHashMap2.put("uuid_for_bindcard", o.clO());
      localHashMap2.put("bindcard_scene", o.clN());
    }
    ap(localHashMap2);
    GMTrace.o(7037169696768L, 52431);
  }
  
  public l(String paramString1, String paramString2, PayInfo paramPayInfo)
  {
    this(3, paramString1, paramString2, paramPayInfo, null, -1, -1);
    GMTrace.i(7036632825856L, 52427);
    GMTrace.o(7036632825856L, 52427);
  }
  
  public l(String paramString1, String paramString2, PayInfo paramPayInfo, int paramInt)
  {
    this(3, paramString1, paramString2, paramPayInfo, null, -1, paramInt);
    GMTrace.i(7036767043584L, 52428);
    GMTrace.o(7036767043584L, 52428);
  }
  
  public l(String paramString1, String paramString2, PayInfo paramPayInfo, String paramString3, int paramInt1, int paramInt2)
  {
    this(3, paramString1, paramString2, paramPayInfo, paramString3, paramInt1, paramInt2);
    GMTrace.i(7036901261312L, 52429);
    GMTrace.o(7036901261312L, 52429);
  }
  
  public final int Bb()
  {
    GMTrace.i(7037572349952L, 52434);
    GMTrace.o(7037572349952L, 52434);
    return 1505;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7037438132224L, 52433);
    this.rcu = new ArrayList();
    label68:
    Object localObject2;
    for (;;)
    {
      ElementQuery localElementQuery;
      String str;
      try
      {
        this.mTimeStamp = paramJSONObject.optString("time_stamp");
        paramString = paramJSONObject.optString("bank_type");
        if (bg.nm(this.olm)) {
          break label975;
        }
        paramString = this.olm;
        localObject1 = paramJSONObject.getJSONArray("Array");
        i = ((JSONArray)localObject1).length();
        paramInt = 0;
        if (paramInt >= i) {
          break;
        }
        localObject2 = ((JSONArray)localObject1).getJSONObject(paramInt);
        localElementQuery = new ElementQuery();
        localElementQuery.gvP = ((JSONObject)localObject2);
        localElementQuery.mhU = ((JSONObject)localObject2).optString("bank_name");
        localElementQuery.nDt = ((JSONObject)localObject2).optString("bank_type");
        localElementQuery.rfV = ((JSONObject)localObject2).optString("bankacc_type_name");
        localElementQuery.rfX = ((JSONObject)localObject2).optString("bank_phone");
        localElementQuery.rga = ((JSONObject)localObject2).optString("forbid_word");
        localElementQuery.rfZ = ((JSONObject)localObject2).optString("bank_recommend_desc");
        localElementQuery.rfY = ((JSONObject)localObject2).optString("bank_app_user_name");
        localElementQuery.rfU = ((JSONObject)localObject2).optInt("bankacc_type", 1);
        localElementQuery.rfN = e.f((JSONObject)localObject2, "canModifyName");
        localElementQuery.rfO = e.f((JSONObject)localObject2, "canModifyCreID");
        localElementQuery.rfS = "0".equals(((JSONObject)localObject2).optString("is_sure"));
        localElementQuery.rfP = "1".equals(((JSONObject)localObject2).optString("needCVV"));
        localElementQuery.rfQ = "1".equals(((JSONObject)localObject2).optString("needValiDate"));
        localElementQuery.rfM = ((JSONObject)localObject2).optString("time_stamp");
        localElementQuery.rfR = ((JSONObject)localObject2).optString("uesr_name");
        localElementQuery.rfW = ((JSONObject)localObject2).optString("bank_flag");
        localElementQuery.rgb = e.f((JSONObject)localObject2, "needFirstName");
        localElementQuery.rgc = e.f((JSONObject)localObject2, "needLastName");
        localElementQuery.rgd = e.f((JSONObject)localObject2, "needCountry");
        localElementQuery.rge = e.f((JSONObject)localObject2, "needArea");
        localElementQuery.rgf = e.f((JSONObject)localObject2, "needCity");
        localElementQuery.rgg = e.f((JSONObject)localObject2, "needAddress");
        localElementQuery.rgh = e.f((JSONObject)localObject2, "needZip");
        localElementQuery.rgi = e.f((JSONObject)localObject2, "needPhone");
        localElementQuery.rgj = e.f((JSONObject)localObject2, "needEmail");
        localElementQuery.rgm = e.f((JSONObject)localObject2, "needShowProtocol");
        localElementQuery.rgk = ((JSONObject)localObject2).optString("support_cre_type");
        localElementQuery.rcw = ((JSONObject)localObject2).optInt("bank_card_tag", 1);
        if (localElementQuery.rcw != 1) {
          break label639;
        }
        if (!e.f((JSONObject)localObject2, "IsSaveYfq"))
        {
          localElementQuery.rfT = 0;
          str = ((JSONObject)localObject2).optString("support_micropay");
          if (!TextUtils.isEmpty(str)) {
            break label669;
          }
          localElementQuery.rgn = true;
          localElementQuery.rel = ((JSONObject)localObject2).optString("arrive_type");
          if (Bankcard.dw(this.rcw, localElementQuery.rcw)) {
            this.rcu.add(localElementQuery);
          }
          if ((paramString == null) || (!paramString.equals(localElementQuery.nDt))) {
            break label978;
          }
          this.rcv = localElementQuery;
          break label978;
        }
        if (e.f((JSONObject)localObject2, "canReturnYfq"))
        {
          localElementQuery.rfT = 4;
          continue;
        }
        localElementQuery.rfT = 3;
      }
      catch (JSONException paramString)
      {
        w.printErrStackTrace("MicroMsg.NetSenceTenPayBase", paramString, "", new Object[0]);
        GMTrace.o(7037438132224L, 52433);
        return;
      }
      continue;
      label639:
      if (((JSONObject)localObject2).optInt("auth_mode") == 1)
      {
        localElementQuery.rfT = 1;
      }
      else
      {
        localElementQuery.rfT = 2;
        continue;
        label669:
        if ("1".equals(str)) {
          localElementQuery.rgn = true;
        } else if ("0".equals(str)) {
          localElementQuery.rgn = false;
        }
      }
    }
    paramString = new SparseArray();
    Object localObject1 = paramJSONObject.getJSONArray("cre_type_map");
    int i = ((JSONArray)localObject1).length();
    paramInt = 0;
    label735:
    if (paramInt < i)
    {
      localObject2 = ((JSONArray)localObject1).getJSONObject(paramInt);
      int j = ((JSONObject)localObject2).optInt("key", 0);
      if (j > 0) {
        paramString.put(j, ((JSONObject)localObject2).getString("val"));
      }
    }
    else
    {
      localObject1 = n.byF();
      localObject2 = this.rcu;
      ((p)localObject1).riI = paramString;
      ((p)localObject1).rcu = ((List)localObject2);
      this.rcx = paramJSONObject.optInt("need_area");
      this.rcy = paramJSONObject.optInt("need_profession");
      if ((this.rcv != null) && (this.rcv.rcw != 1))
      {
        w.i("MicroMsg.NetSenceTenPayBase", "oversea card, no need area and profession");
        this.rcx = 0;
        this.rcy = 0;
      }
      paramString = paramJSONObject.optJSONArray("profession_array");
      if (paramString != null)
      {
        this.rcz = new Profession[paramString.length()];
        paramInt = 0;
      }
    }
    for (;;)
    {
      if (paramInt < paramString.length())
      {
        paramJSONObject = paramString.optJSONObject(paramInt);
        if (paramJSONObject != null)
        {
          localObject1 = paramJSONObject.optString("profession_name");
          i = paramJSONObject.optInt("profession_type");
          if (!bg.nm((String)localObject1))
          {
            paramJSONObject = new Profession((String)localObject1, i);
            this.rcz[paramInt] = paramJSONObject;
          }
          else
          {
            w.i("MicroMsg.NetSenceTenPayBase", "empty profession_name!");
          }
        }
      }
      else
      {
        GMTrace.o(7037438132224L, 52433);
        return;
        label975:
        break;
        label978:
        paramInt += 1;
        break label68;
        paramInt += 1;
        break label735;
      }
      paramInt += 1;
    }
  }
  
  public final int aoD()
  {
    GMTrace.i(7037303914496L, 52432);
    GMTrace.o(7037303914496L, 52432);
    return 73;
  }
  
  public final boolean bxX()
  {
    GMTrace.i(7037840785408L, 52436);
    if (this.rcx == 1)
    {
      GMTrace.o(7037840785408L, 52436);
      return true;
    }
    GMTrace.o(7037840785408L, 52436);
    return false;
  }
  
  public final boolean bxY()
  {
    GMTrace.i(7037975003136L, 52437);
    if (this.rcy == 1)
    {
      GMTrace.o(7037975003136L, 52437);
      return true;
    }
    GMTrace.o(7037975003136L, 52437);
    return false;
  }
  
  public final String getUri()
  {
    GMTrace.i(7037706567680L, 52435);
    GMTrace.o(7037706567680L, 52435);
    return "/cgi-bin/mmpay-bin/tenpay/elementquerynew";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\c\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */