package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet.a.a;
import com.tencent.mm.plugin.wallet.a.c;
import com.tencent.mm.plugin.wallet.a.f;
import com.tencent.mm.plugin.wallet.a.g;
import com.tencent.mm.plugin.wallet.a.l;
import com.tencent.mm.plugin.wallet.a.q;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Orders
  implements Parcelable
{
  public static final Parcelable.Creator<Orders> CREATOR;
  public static int rhH;
  public static int rhI;
  public String eCQ;
  public String eHG;
  public String jPF;
  public String kBQ;
  public String nEr;
  public String nvc;
  public double oml;
  public int rcw;
  public String ree;
  public DeductInfo rhA;
  public long rhB;
  public long rhC;
  public int rhD;
  public int rhE;
  public int rhF;
  public String rhG;
  public long rhc;
  public double rhd;
  public double rhe;
  public int rhf;
  public String rhg;
  public int rhh;
  public String rhi;
  public String rhj;
  public String rhk;
  public String rhl;
  public int rhm;
  public boolean rhn;
  public String rho;
  public long rhp;
  public String rhq;
  public String rhr;
  public Set<String> rhs;
  public int rht;
  public String rhu;
  public List<Commodity> rhv;
  public f rhw;
  public int rhx;
  public String rhy;
  public String rhz;
  public String token;
  public String username;
  
  static
  {
    GMTrace.i(6879329648640L, 51255);
    CREATOR = new Parcelable.Creator() {};
    rhH = 0;
    rhI = 1;
    GMTrace.o(6879329648640L, 51255);
  }
  
  public Orders()
  {
    GMTrace.i(6877853253632L, 51244);
    this.eHG = "";
    this.token = "";
    this.jPF = "0";
    this.rhd = 0.0D;
    this.rhe = 0.0D;
    this.rhn = false;
    this.rho = "";
    this.kBQ = "";
    this.rhp = 0L;
    this.rhq = "";
    this.rhs = new HashSet();
    this.rht = 0;
    this.rhu = "";
    this.rhv = new ArrayList();
    this.rhw = new f();
    this.rhx = 0;
    this.rhy = "";
    this.rhz = "";
    this.rhD = 0;
    this.rhE = 0;
    this.rhF = 0;
    this.rhG = "";
    GMTrace.o(6877853253632L, 51244);
  }
  
  public Orders(Parcel paramParcel)
  {
    GMTrace.i(6879061213184L, 51253);
    this.eHG = "";
    this.token = "";
    this.jPF = "0";
    this.rhd = 0.0D;
    this.rhe = 0.0D;
    this.rhn = false;
    this.rho = "";
    this.kBQ = "";
    this.rhp = 0L;
    this.rhq = "";
    this.rhs = new HashSet();
    this.rht = 0;
    this.rhu = "";
    this.rhv = new ArrayList();
    this.rhw = new f();
    this.rhx = 0;
    this.rhy = "";
    this.rhz = "";
    this.rhD = 0;
    this.rhE = 0;
    this.rhF = 0;
    this.rhG = "";
    this.rhc = paramParcel.readLong();
    this.eHG = paramParcel.readString();
    this.token = paramParcel.readString();
    this.jPF = paramParcel.readString();
    this.rhd = paramParcel.readDouble();
    this.rcw = paramParcel.readInt();
    this.nEr = paramParcel.readString();
    this.oml = paramParcel.readDouble();
    this.rhe = paramParcel.readDouble();
    this.rhf = paramParcel.readInt();
    this.ree = paramParcel.readString();
    this.rhg = paramParcel.readString();
    this.rhh = paramParcel.readInt();
    this.rhi = paramParcel.readString();
    this.username = paramParcel.readString();
    this.eCQ = paramParcel.readString();
    this.nvc = paramParcel.readString();
    this.rhj = paramParcel.readString();
    this.rhk = paramParcel.readString();
    this.rhl = paramParcel.readString();
    this.rhm = paramParcel.readInt();
    if (paramParcel.readInt() == 1) {}
    for (;;)
    {
      this.rhn = bool;
      this.rho = paramParcel.readString();
      this.kBQ = paramParcel.readString();
      this.rhp = paramParcel.readLong();
      this.rhq = paramParcel.readString();
      paramParcel.readTypedList(this.rhv, Commodity.CREATOR);
      this.rhr = paramParcel.readString();
      this.rhs = Ke(this.rhr);
      this.rht = paramParcel.readInt();
      this.rhu = paramParcel.readString();
      this.rhA = ((DeductInfo)paramParcel.readParcelable(DeductInfo.class.getClassLoader()));
      this.rhD = paramParcel.readInt();
      this.rhE = paramParcel.readInt();
      GMTrace.o(6879061213184L, 51253);
      return;
      bool = false;
    }
  }
  
  private static HashSet<String> Ke(String paramString)
  {
    GMTrace.i(6878926995456L, 51252);
    HashSet localHashSet = new HashSet();
    if (!bg.nm(paramString))
    {
      paramString = paramString.split("\\|");
      int j = paramString.length;
      int i = 0;
      while (i < j)
      {
        localHashSet.add(paramString[i]);
        i += 1;
      }
      if (localHashSet.size() <= 0) {
        break label81;
      }
      localHashSet.retainAll(localHashSet);
    }
    for (;;)
    {
      GMTrace.o(6878926995456L, 51252);
      return localHashSet;
      label81:
      localHashSet.clear();
    }
  }
  
  public static Orders Q(JSONObject paramJSONObject)
  {
    GMTrace.i(6877987471360L, 51245);
    localOrders = null;
    if (paramJSONObject != null) {
      localOrders = new Orders();
    }
    try
    {
      localOrders.rhc = bg.Pv();
      localOrders.rhd = (paramJSONObject.getDouble("total_fee") / 100.0D);
      localOrders.jPF = paramJSONObject.getString("num");
      localOrders.rcw = paramJSONObject.optInt("bank_card_tag", 1);
      localOrders.nEr = paramJSONObject.optString("fee_type", "");
      localOrders.oml = (paramJSONObject.optDouble("charge_fee", 0.0D) / 100.0D);
      localOrders.rhe = (paramJSONObject.optDouble("fetch_fee", 0.0D) / 100.0D);
      localOrders.rhf = paramJSONObject.optInt("is_assign_userinfo_pay");
      localOrders.ree = paramJSONObject.optString("true_name");
      localOrders.rhg = paramJSONObject.optString("cre_id");
      localOrders.rhh = paramJSONObject.optInt("ce_type");
      localOrders.rhi = paramJSONObject.optString("assign_pay_info");
      localObject1 = paramJSONObject.getJSONArray("Array");
      localOrders.rhB = paramJSONObject.optLong("free_fee");
      localOrders.rhC = paramJSONObject.optLong("remain_fee");
      localOrders.rhD = paramJSONObject.optInt("not_support_bind_card", 0);
      localOrders.rhE = paramJSONObject.optInt("not_support_retry", 0);
      if (paramJSONObject.optInt("support_all_bank", 0) != 1) {
        break label903;
      }
      i = 1;
    }
    catch (JSONException paramJSONObject)
    {
      for (;;)
      {
        int i;
        int k;
        int j;
        Object localObject2;
        Commodity localCommodity;
        w.printErrStackTrace("MicroMsg.Orders", paramJSONObject, "", new Object[0]);
        continue;
        Object localObject1 = ((JSONObject)localObject1).optJSONObject("user_info");
        if (localObject1 == null)
        {
          w.e("MicroMsg.Orders", "user_info is null ");
        }
        else
        {
          localObject1 = ((JSONObject)localObject1).optJSONObject("touch_info");
          if (localObject1 == null)
          {
            w.e("MicroMsg.Orders", "touch_info is null ");
          }
          else
          {
            if (((com.tencent.mm.pluginsdk.k)com.tencent.mm.kernel.h.h(com.tencent.mm.pluginsdk.k.class)).azB())
            {
              i = ((JSONObject)localObject1).optInt("use_touch_pay", 0);
              localOrders.rht = i;
              localOrders.rhu = ((JSONObject)localObject1).optString("touch_forbidword");
              localObject2 = ((JSONObject)localObject1).optString("touch_challenge");
              if (1 != ((JSONObject)localObject1).optInt("need_change_auth_key")) {
                break label890;
              }
            }
            for (boolean bool = true;; bool = false)
            {
              r.riJ.llD = ((String)localObject2);
              r.riJ.llE = bool;
              w.i("MicroMsg.Orders", "hy: use_touch_pay is %s, challenge is: %s, is need change: %b", new Object[] { Integer.valueOf(localOrders.rht), localObject2, Boolean.valueOf(bool) });
              break;
              i = 0;
              break label785;
            }
            j += 1;
            continue;
            i = 0;
          }
        }
      }
    }
    if (i != 0) {
      localOrders.rhs = new HashSet();
    }
    k = ((JSONArray)localObject1).length();
    j = 0;
    if (j < k)
    {
      localObject2 = ((JSONArray)localObject1).getJSONObject(j);
      localCommodity = new Commodity();
      localCommodity.desc = ((JSONObject)localObject2).getString("desc");
      localCommodity.jWS = (((JSONObject)localObject2).getInt("fee") / 100.0D);
      localCommodity.nEi = ((JSONObject)localObject2).optInt("count", 1);
      localCommodity.nEk = ((JSONObject)localObject2).getString("pay_status");
      localCommodity.nEp = ((JSONObject)localObject2).optString("buy_bank_name");
      localCommodity.nEl = ((JSONObject)localObject2).getString("pay_status_name");
      localCommodity.nEf = ((JSONObject)localObject2).optString("spid");
      localCommodity.nEg = ((JSONObject)localObject2).optString("sp_name");
      localCommodity.nEn = ((JSONObject)localObject2).optInt("modify_timestamp");
      localCommodity.eRP = ((JSONObject)localObject2).getString("transaction_id");
      localCommodity.nEr = ((JSONObject)localObject2).optString("fee_type");
      if (bg.nm(localOrders.nEr)) {
        localOrders.nEr = localCommodity.nEr;
      }
      localCommodity.nEs = ((JSONObject)localObject2).optString("appusername");
      localCommodity.nDU = ((JSONObject)localObject2).optString("app_telephone");
      localOrders.rhv.add(localCommodity);
      if (i == 0)
      {
        localOrders.rhr = ((JSONObject)localObject2).optString("support_bank");
        localOrders.rhs = Ke(localOrders.rhr);
      }
    }
    else
    {
      if (paramJSONObject.has("is_open_fee_protocal")) {}
      for (localOrders.rhn = com.tencent.mm.wallet_core.ui.e.f(paramJSONObject, "is_open_fee_protocal");; localOrders.rhn = Bankcard.dw(localOrders.rcw, 2))
      {
        localOrders.rhw = R(paramJSONObject);
        localObject1 = paramJSONObject.optJSONObject("bindqueryresp");
        if (localObject1 != null) {
          break;
        }
        w.e("MicroMsg.Orders", "bindqueryresp is null ");
        localOrders.rhx = paramJSONObject.optInt("needbindcardtoshowfavinfo");
        localOrders.rhy = paramJSONObject.optString("discount_wording");
        localOrders.rhz = paramJSONObject.optString("favor_rule_wording");
        a(localOrders, paramJSONObject.optJSONObject("entrustpayinfo"));
        GMTrace.o(6877987471360L, 51245);
        return localOrders;
      }
    }
  }
  
  private static f R(JSONObject paramJSONObject)
  {
    GMTrace.i(6878121689088L, 51246);
    f localf = new f();
    paramJSONObject = paramJSONObject.optJSONObject("favinfo");
    if (paramJSONObject == null)
    {
      w.d("MicroMsg.Orders", "Parse getJsonObject(favinfo) null");
      GMTrace.o(6878121689088L, 51246);
      return localf;
    }
    localf.qXw = (paramJSONObject.optLong("tradeAmount") / 100.0D);
    localf.qXx = (paramJSONObject.optLong("totalFavAmount") / 100.0D);
    localf.qXy = (paramJSONObject.optLong("afterFavorTradeAmount") / 100.0D);
    localf.qXz = paramJSONObject.optString("favorComposeId");
    localf.qXC = paramJSONObject.optInt("useNaturalDefense");
    localf.qXD = paramJSONObject.optString("discountWording");
    localf.qXE = paramJSONObject.optString("favorRuleWording");
    localf.qXF = (paramJSONObject.optDouble("showFavorAmount", 0.0D) / 100.0D);
    localf.qXG = (paramJSONObject.optDouble("invariableFavorAmount", 0.0D) / 100.0D);
    localf.qXH = paramJSONObject.optInt("isVariableFavor");
    localf.qXI = paramJSONObject.optString("invariableFavorDesc");
    localf.qXJ = paramJSONObject.optString("variableFavorDesc");
    Object localObject1 = paramJSONObject.optJSONArray("tradeFavList");
    int i = 0;
    Object localObject3;
    Object localObject2;
    int j;
    Object localObject4;
    while (i < ((JSONArray)localObject1).length())
    {
      localObject3 = ((JSONArray)localObject1).getJSONObject(i);
      localObject2 = new q();
      ((q)localObject2).qYi = ((JSONObject)localObject3).optInt("favType");
      ((q)localObject2).qYj = ((JSONObject)localObject3).optInt("favSubType");
      ((q)localObject2).qYk = ((JSONObject)localObject3).optLong("favProperty");
      ((q)localObject2).qYl = ((JSONObject)localObject3).optString("favorTypeDesc");
      ((q)localObject2).qXt = ((JSONObject)localObject3).optString("favId");
      ((q)localObject2).qYm = ((JSONObject)localObject3).optString("favName");
      ((q)localObject2).qYn = ((JSONObject)localObject3).optString("favDesc");
      ((q)localObject2).qXu = ((JSONObject)localObject3).optString("favorUseManual");
      ((q)localObject2).qXv = ((JSONObject)localObject3).optString("favorRemarks");
      ((q)localObject2).qYo = (((JSONObject)localObject3).optLong("favPrice") / 100.0D);
      ((q)localObject2).qYp = (((JSONObject)localObject3).optLong("realFavFee") / 100.0D);
      ((q)localObject2).qYq = ((JSONObject)localObject3).optInt("needBankPay");
      ((q)localObject2).qYr = ((JSONObject)localObject3).optString("bankNo");
      ((q)localObject2).nEp = ((JSONObject)localObject3).optString("bankName");
      ((q)localObject2).qYs = ((JSONObject)localObject3).optString("bankLogoUrl");
      localObject3 = ((JSONObject)localObject3).optJSONArray("bind_serial_list");
      if ((localObject3 != null) && (((JSONArray)localObject3).length() > 0))
      {
        j = 0;
        while (j < ((JSONArray)localObject3).length())
        {
          localObject4 = ((JSONArray)localObject3).optString(j);
          ((q)localObject2).qYt.add(com.tencent.mm.bm.b.aX(((String)localObject4).getBytes()));
          j += 1;
        }
      }
      localf.qXA.add(localObject2);
      i += 1;
    }
    localObject1 = paramJSONObject.optJSONObject("favorComposeList");
    Object localObject5;
    if (localObject1 != null)
    {
      localf.qXB = new g();
      localObject1 = ((JSONObject)localObject1).optJSONArray("favorComposeInfo");
      i = 0;
      while (i < ((JSONArray)localObject1).length())
      {
        localObject3 = ((JSONArray)localObject1).getJSONObject(i);
        localObject2 = new com.tencent.mm.plugin.wallet.a.h();
        ((com.tencent.mm.plugin.wallet.a.h)localObject2).qXN = ((JSONObject)localObject3).optString("faovrComposeId");
        ((com.tencent.mm.plugin.wallet.a.h)localObject2).qXO = (((JSONObject)localObject3).optLong("totalFavorAmount") / 100.0D);
        ((com.tencent.mm.plugin.wallet.a.h)localObject2).qXy = (((JSONObject)localObject3).optLong("afterFavorTradeAmount") / 100.0D);
        ((com.tencent.mm.plugin.wallet.a.h)localObject2).qXF = (((JSONObject)localObject3).optDouble("showFavorAmount", 0.0D) / 100.0D);
        ((com.tencent.mm.plugin.wallet.a.h)localObject2).qXG = (((JSONObject)localObject3).optDouble("invariableFavorAmount", 0.0D) / 100.0D);
        ((com.tencent.mm.plugin.wallet.a.h)localObject2).qXH = ((JSONObject)localObject3).optInt("isVariableFavor");
        ((com.tencent.mm.plugin.wallet.a.h)localObject2).qXI = ((JSONObject)localObject3).optString("invariableFavorDesc");
        ((com.tencent.mm.plugin.wallet.a.h)localObject2).qXJ = ((JSONObject)localObject3).optString("variableFavorDesc");
        localObject3 = ((JSONObject)localObject3).optJSONArray("composeArray");
        j = 0;
        while (j < ((JSONArray)localObject3).length())
        {
          localObject4 = ((JSONArray)localObject3).getJSONObject(j);
          localObject5 = new com.tencent.mm.plugin.wallet.a.e();
          ((com.tencent.mm.plugin.wallet.a.e)localObject5).qXt = ((JSONObject)localObject4).optString("favId");
          ((com.tencent.mm.plugin.wallet.a.e)localObject5).qXu = ((JSONObject)localObject4).optString("favorUseManual");
          ((com.tencent.mm.plugin.wallet.a.e)localObject5).qXv = ((JSONObject)localObject4).optString("favorRemarks");
          ((com.tencent.mm.plugin.wallet.a.h)localObject2).qXP.add(localObject5);
          j += 1;
        }
        localf.qXB.qXL.add(localObject2);
        i += 1;
      }
    }
    localObject1 = new a();
    paramJSONObject = paramJSONObject.optJSONObject("bank_card_info");
    if (paramJSONObject != null)
    {
      localObject2 = paramJSONObject.optJSONArray("bind_serial_favor_info_list");
      if (localObject2 != null)
      {
        i = 0;
        while (i < ((JSONArray)localObject2).length())
        {
          localObject3 = new com.tencent.mm.plugin.wallet.a.b();
          localObject4 = ((JSONArray)localObject2).getJSONObject(i);
          ((com.tencent.mm.plugin.wallet.a.b)localObject3).nDu = ((JSONObject)localObject4).optString("bind_serial");
          localObject4 = ((JSONObject)localObject4).optJSONArray("bind_serial_favor_list");
          if ((localObject4 != null) && (((JSONArray)localObject4).length() > 0))
          {
            j = 0;
            while (j < ((JSONArray)localObject4).length())
            {
              localObject5 = new c();
              JSONObject localJSONObject = ((JSONArray)localObject4).optJSONObject(j);
              ((c)localObject5).qXr = localJSONObject.optString("favor_desc");
              ((c)localObject5).qXs = localJSONObject.optInt("is_default_show", 0);
              ((com.tencent.mm.plugin.wallet.a.b)localObject3).qXq.add(localObject5);
              j += 1;
            }
          }
          ((a)localObject1).qXo.add(localObject3);
          i += 1;
        }
      }
      paramJSONObject = paramJSONObject.optJSONObject("new_bind_card_info").optJSONArray("new_bind_card_favor_list");
      if ((paramJSONObject != null) && (paramJSONObject.length() > 0))
      {
        ((a)localObject1).qXp = new com.tencent.mm.plugin.wallet.a.k();
        i = 0;
        while (i < paramJSONObject.length())
        {
          localObject2 = new l();
          ((l)localObject2).qXr = paramJSONObject.optJSONObject(i).optString("favor_desc");
          ((a)localObject1).qXp.qXU.add(localObject2);
          i += 1;
        }
      }
    }
    localf.qXK = ((a)localObject1);
    GMTrace.o(6878121689088L, 51246);
    return localf;
  }
  
  public static Orders a(JSONObject paramJSONObject, Orders paramOrders)
  {
    GMTrace.i(6878255906816L, 51247);
    if ((paramJSONObject != null) && (paramOrders != null)) {}
    for (;;)
    {
      Object localObject1;
      int i;
      try
      {
        localObject1 = paramJSONObject.optJSONObject("appservice");
        if (localObject1 != null)
        {
          paramOrders.rhk = ((JSONObject)localObject1).optString("app_recommend_desc");
          paramOrders.rhl = ((JSONObject)localObject1).optString("app_telephone");
          paramOrders.rhm = ((JSONObject)localObject1).optInt("recommend_level", 2);
          paramOrders.kBQ = ((JSONObject)localObject1).optString("share_to_friends_url");
        }
        int j = paramOrders.rhm;
        localObject1 = paramOrders.rhv;
        paramOrders.rho = paramJSONObject.optString("pay_result_tips");
        JSONArray localJSONArray = paramJSONObject.getJSONArray("payresult");
        int k = localJSONArray.length();
        i = 0;
        if (i < k)
        {
          JSONObject localJSONObject = localJSONArray.getJSONObject(i);
          Object localObject2;
          if ((localObject1 != null) && (((List)localObject1).size() == 1))
          {
            localObject2 = (Commodity)((List)localObject1).get(0);
            ((Commodity)localObject2).rhR = new ArrayList();
            ((Commodity)localObject2).rhM = new ArrayList();
            ((Commodity)localObject2).eRP = localJSONObject.getString("transaction_id");
            a((Commodity)localObject2, localJSONObject, j);
          }
          else if (localObject1 != null)
          {
            localObject2 = localJSONObject.getString("transaction_id");
            Iterator localIterator = ((List)localObject1).iterator();
            if (localIterator.hasNext())
            {
              Commodity localCommodity = (Commodity)localIterator.next();
              if ((localObject2 == null) || (!((String)localObject2).equals(localCommodity.eRP))) {
                continue;
              }
              a(localCommodity, localJSONObject, j);
            }
          }
        }
      }
      catch (JSONException paramJSONObject)
      {
        w.printErrStackTrace("MicroMsg.Orders", paramJSONObject, "", new Object[0]);
      }
      for (;;)
      {
        GMTrace.o(6878255906816L, 51247);
        return paramOrders;
        localObject1 = paramJSONObject.optJSONObject("extinfo");
        if (localObject1 != null)
        {
          paramOrders.rhp = (((JSONObject)localObject1).optLong("fetch_pre_arrive_time") * 1000L);
          paramOrders.rhq = ((JSONObject)localObject1).optString("fetch_pre_arrive_time_wording");
        }
        paramOrders.rhF = paramJSONObject.optInt("is_use_new_paid_succ_page", 0);
        paramOrders.rhG = paramJSONObject.optString("pay_succ_btn_wording");
        continue;
        w.w("MicroMsg.Orders", "oldOrders is null");
      }
      i += 1;
    }
  }
  
  private static void a(Commodity paramCommodity, JSONObject paramJSONObject, int paramInt)
  {
    int i = 0;
    GMTrace.i(6878390124544L, 51248);
    paramCommodity.nEw = paramJSONObject.optString("discount");
    paramCommodity.nEk = paramJSONObject.getString("pay_status");
    paramCommodity.nEl = paramJSONObject.getString("pay_status_name");
    paramCommodity.nEp = paramJSONObject.optString("buy_bank_name");
    paramCommodity.nEn = paramJSONObject.optInt("pay_timestamp");
    paramCommodity.rhL = paramJSONObject.optString("card_tail");
    paramCommodity.rhm = paramInt;
    paramCommodity.rhN = paramJSONObject.optString("rateinfo");
    paramCommodity.rhO = paramJSONObject.optString("discount_rateinfo");
    paramCommodity.rhP = paramJSONObject.optString("original_feeinfo");
    if (paramJSONObject.has("total_fee")) {
      paramCommodity.jWS = (paramJSONObject.optDouble("total_fee", 0.0D) / 100.0D);
    }
    paramCommodity.rhJ = (paramJSONObject.optDouble("original_total_fee", -1.0D) / 100.0D);
    paramCommodity.nEr = paramJSONObject.optString("fee_type", "");
    Object localObject1 = paramJSONObject.optJSONObject("subscribe_biz_info");
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = new b();
      ((b)localObject2).type = rhH;
      ((b)localObject2).name = ((JSONObject)localObject1).optString("nickname");
      ((b)localObject2).nEs = ((JSONObject)localObject1).optString("username");
      paramCommodity.rhK = ((b)localObject2).nEs;
      ((b)localObject2).nIR = ((JSONObject)localObject1).optString("logo_round_url");
      ((b)localObject2).url = ((JSONObject)localObject1).optString("subscribe_biz_url");
      if ((!bg.nm(((b)localObject2).name)) && (!bg.nm(((b)localObject2).url)))
      {
        paramCommodity.rhR.add(localObject2);
        paramCommodity.rhS = true;
      }
    }
    localObject1 = paramJSONObject.getJSONArray("activity_info");
    int j = ((JSONArray)localObject1).length();
    paramInt = 0;
    Object localObject3;
    while (paramInt < j)
    {
      localObject2 = ((JSONArray)localObject1).getJSONObject(paramInt);
      localObject3 = new b();
      ((b)localObject3).type = rhI;
      ((b)localObject3).nIR = ((JSONObject)localObject2).optString("icon");
      ((b)localObject3).name = ((JSONObject)localObject2).optString("wording");
      ((b)localObject3).url = ((JSONObject)localObject2).optString("url");
      ((b)localObject3).rgT = ((JSONObject)localObject2).optString("btn_text");
      ((b)localObject3).rhZ = ((JSONObject)localObject2).optInt("type");
      ((b)localObject3).title = ((JSONObject)localObject2).optString("title");
      ((b)localObject3).rgN = ((JSONObject)localObject2).optLong("activity_id");
      ((b)localObject3).ria = ((JSONObject)localObject2).optInt("activity_type", 0);
      ((b)localObject3).ric = ((JSONObject)localObject2).optString("small_title");
      ((b)localObject3).rib = ((JSONObject)localObject2).optInt("award_id");
      ((b)localObject3).rgQ = ((JSONObject)localObject2).optInt("send_record_id");
      ((b)localObject3).rgR = ((JSONObject)localObject2).optInt("user_record_id");
      ((b)localObject3).rid = ((JSONObject)localObject2).optString("activity_tinyapp_username");
      ((b)localObject3).rie = ((JSONObject)localObject2).optString("activity_tinyapp_path");
      ((b)localObject3).rgS = ((JSONObject)localObject2).optLong("activity_mch_id");
      ((b)localObject3).rif = ((JSONObject)localObject2).optInt("activity_tinyapp_version");
      paramCommodity.rhR.add(localObject3);
      paramInt += 1;
    }
    localObject1 = paramJSONObject.optJSONObject("link_ativity_info");
    if (localObject1 != null)
    {
      paramCommodity.rhT.text = ((JSONObject)localObject1).optString("text");
      paramCommodity.rhT.url = ((JSONObject)localObject1).optString("url");
    }
    localObject1 = paramJSONObject.optJSONArray("discount_array");
    if (localObject1 != null)
    {
      j = ((JSONArray)localObject1).length();
      paramInt = i;
      while (paramInt < j)
      {
        localObject2 = ((JSONArray)localObject1).optJSONObject(paramInt);
        localObject3 = new DiscountInfo();
        if (localObject2 != null)
        {
          ((DiscountInfo)localObject3).rhY = ((JSONObject)localObject2).optDouble("payment_amount");
          ((DiscountInfo)localObject3).qXr = ((JSONObject)localObject2).optString("favor_desc");
          paramCommodity.rhM.add(localObject3);
        }
        paramInt += 1;
      }
    }
    paramJSONObject = paramJSONObject.optJSONObject("tinyapp_info");
    if (paramJSONObject != null)
    {
      if (paramCommodity.rhQ == null) {
        paramCommodity.rhQ = new RecommendTinyAppInfo();
      }
      paramCommodity.rhQ.rgV = paramJSONObject.optString("tinyapp_name");
      paramCommodity.rhQ.rgW = paramJSONObject.optString("tinyapp_logo");
      paramCommodity.rhQ.rgX = paramJSONObject.optString("tinyapp_desc");
      paramCommodity.rhQ.rgY = paramJSONObject.optString("tinyapp_username");
      paramCommodity.rhQ.rgZ = paramJSONObject.optString("tinyapp_path");
      paramCommodity.rhQ.rha = paramJSONObject.optString("activity_tinyapp_btn_text");
      paramCommodity.rhQ.rig = paramJSONObject.optLong("activity_id");
      paramCommodity.rhQ.rih = paramJSONObject.optLong("activity_type");
      paramCommodity.rhQ.rii = paramJSONObject.optLong("award_id");
      paramCommodity.rhQ.rij = paramJSONObject.optInt("send_record_id");
      paramCommodity.rhQ.rik = paramJSONObject.optInt("user_record_id");
      paramCommodity.rhQ.ril = paramJSONObject.optLong("activity_mch_id");
      paramCommodity.rhQ.rhb = paramJSONObject.optInt("tinyapp_version");
    }
    GMTrace.o(6878390124544L, 51248);
  }
  
  private static void a(Orders paramOrders, JSONObject paramJSONObject)
  {
    int i = 0;
    GMTrace.i(6878524342272L, 51249);
    if (paramJSONObject != null)
    {
      w.i("MicroMsg.Orders", "parseDeductInfo json is not null");
      paramOrders.rhA = new DeductInfo();
      paramOrders.rhA.title = paramJSONObject.optString("contract_title");
      paramOrders.rhA.desc = paramJSONObject.optString("contract_desc");
      paramOrders.rhA.rad = paramJSONObject.optInt("auto_deduct_flag", 0);
      paramOrders.rhA.rhU = paramJSONObject.optString("contract_url");
      paramOrders.rhA.rhW = paramJSONObject.optInt("is_select_pay_way", 0);
      paramOrders.rhA.qZv = paramJSONObject.optInt("deduct_show_type", 0);
      paramOrders.rhA.jzt = paramJSONObject.optString("button_wording", "");
      paramOrders.rhA.qZw = paramJSONObject.optString("deduct_rule_wording", "");
      paramOrders.rhA.rhX = paramJSONObject.optString("open_deduct_wording", "");
      paramJSONObject = paramJSONObject.optJSONArray("show_info");
      int j = paramJSONObject.length();
      if (j > 0)
      {
        paramOrders.rhA.rhV = new ArrayList();
        if (i < j)
        {
          JSONObject localJSONObject = paramJSONObject.optJSONObject(i);
          if (localJSONObject != null)
          {
            DeductShowInfo localDeductShowInfo = new DeductShowInfo();
            localDeductShowInfo.name = localJSONObject.optString("name");
            localDeductShowInfo.value = localJSONObject.optString("value");
            localDeductShowInfo.url = localJSONObject.optString("url");
            paramOrders.rhA.rhV.add(localDeductShowInfo);
          }
          for (;;)
          {
            i += 1;
            break;
            w.e("MicroMsg.Orders", "parseDeductInfo's showInfo get a null value from json,index=" + i);
          }
        }
        GMTrace.o(6878524342272L, 51249);
        return;
      }
      w.e("MicroMsg.Orders", "parseDeductInfo's showInfo len is " + j);
      GMTrace.o(6878524342272L, 51249);
      return;
    }
    w.i("MicroMsg.Orders", "parseDeductInfo json is null");
    GMTrace.o(6878524342272L, 51249);
  }
  
  public int describeContents()
  {
    GMTrace.i(6878792777728L, 51251);
    GMTrace.o(6878792777728L, 51251);
    return 0;
  }
  
  public String toString()
  {
    GMTrace.i(6878658560000L, 51250);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("reqKey:").append(this.eHG).append("\n");
    ((StringBuilder)localObject).append("token").append(this.token).append("\n");
    ((StringBuilder)localObject).append("num").append(this.jPF).append("\n");
    ((StringBuilder)localObject).append("totalFee").append(this.rhd).append("\n");
    localObject = ((StringBuilder)localObject).toString();
    GMTrace.o(6878658560000L, 51250);
    return (String)localObject;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(6879195430912L, 51254);
    paramParcel.writeLong(this.rhc);
    paramParcel.writeString(this.eHG);
    paramParcel.writeString(this.token);
    paramParcel.writeString(this.jPF);
    paramParcel.writeDouble(this.rhd);
    paramParcel.writeInt(this.rcw);
    paramParcel.writeString(this.nEr);
    paramParcel.writeDouble(this.oml);
    paramParcel.writeDouble(this.rhe);
    paramParcel.writeInt(this.rhf);
    paramParcel.writeString(this.ree);
    paramParcel.writeString(this.rhg);
    paramParcel.writeInt(this.rhh);
    paramParcel.writeString(this.rhi);
    paramParcel.writeString(this.username);
    paramParcel.writeString(this.eCQ);
    paramParcel.writeString(this.nvc);
    paramParcel.writeString(this.rhj);
    paramParcel.writeString(this.rhk);
    paramParcel.writeString(this.rhl);
    paramParcel.writeInt(this.rhm);
    if (this.rhn) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.rho);
      paramParcel.writeString(this.kBQ);
      paramParcel.writeLong(this.rhp);
      paramParcel.writeString(this.rhq);
      paramParcel.writeTypedList(this.rhv);
      paramParcel.writeString(this.rhr);
      paramParcel.writeInt(this.rht);
      paramParcel.writeString(this.rhu);
      paramParcel.writeParcelable(this.rhA, 1);
      paramParcel.writeInt(this.rhD);
      paramParcel.writeInt(this.rhE);
      GMTrace.o(6879195430912L, 51254);
      return;
    }
  }
  
  public static class Commodity
    implements Parcelable
  {
    public static final Parcelable.Creator<Commodity> CREATOR;
    public String desc;
    public String eRP;
    public double jWS;
    public String nDU;
    public String nEd;
    public String nEe;
    public String nEf;
    public String nEg;
    public String nEi;
    public String nEk;
    public String nEl;
    public int nEn;
    public String nEp;
    public String nEr;
    public String nEs;
    public String nEw;
    public double rhJ;
    public String rhK;
    public String rhL;
    public List<Orders.DiscountInfo> rhM;
    public String rhN;
    public String rhO;
    public String rhP;
    public Orders.RecommendTinyAppInfo rhQ;
    public List<Orders.b> rhR;
    public boolean rhS;
    public Orders.a rhT;
    public int rhm;
    
    static
    {
      GMTrace.i(6892348768256L, 51352);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(6892348768256L, 51352);
    }
    
    public Commodity()
    {
      GMTrace.i(6891946115072L, 51349);
      this.jWS = 0.0D;
      this.rhJ = 0.0D;
      this.rhM = new ArrayList();
      this.rhQ = null;
      this.rhR = new ArrayList();
      this.rhS = false;
      this.rhT = new Orders.a();
      GMTrace.o(6891946115072L, 51349);
    }
    
    public Commodity(Parcel paramParcel)
    {
      GMTrace.i(6892080332800L, 51350);
      this.jWS = 0.0D;
      this.rhJ = 0.0D;
      this.rhM = new ArrayList();
      this.rhQ = null;
      this.rhR = new ArrayList();
      this.rhS = false;
      this.rhT = new Orders.a();
      this.nEd = paramParcel.readString();
      this.nEe = paramParcel.readString();
      this.nEf = paramParcel.readString();
      this.nEg = paramParcel.readString();
      this.desc = paramParcel.readString();
      this.nEi = paramParcel.readString();
      this.jWS = paramParcel.readDouble();
      this.nEk = paramParcel.readString();
      this.nEl = paramParcel.readString();
      this.nEn = paramParcel.readInt();
      this.eRP = paramParcel.readString();
      this.nEp = paramParcel.readString();
      this.nEr = paramParcel.readString();
      this.nEs = paramParcel.readString();
      this.nDU = paramParcel.readString();
      this.rhL = paramParcel.readString();
      this.nEw = paramParcel.readString();
      paramParcel.readTypedList(this.rhM, Orders.DiscountInfo.CREATOR);
      this.rhN = paramParcel.readString();
      this.rhP = paramParcel.readString();
      this.rhQ = ((Orders.RecommendTinyAppInfo)paramParcel.readParcelable(Orders.RecommendTinyAppInfo.class.getClassLoader()));
      GMTrace.o(6892080332800L, 51350);
    }
    
    public int describeContents()
    {
      GMTrace.i(6891811897344L, 51348);
      GMTrace.o(6891811897344L, 51348);
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(6892214550528L, 51351);
      paramParcel.writeString(this.nEd);
      paramParcel.writeString(this.nEe);
      paramParcel.writeString(this.nEf);
      paramParcel.writeString(this.nEg);
      paramParcel.writeString(this.desc);
      paramParcel.writeString(this.nEi);
      paramParcel.writeDouble(this.jWS);
      paramParcel.writeString(this.nEk);
      paramParcel.writeString(this.nEl);
      paramParcel.writeInt(this.nEn);
      paramParcel.writeString(this.eRP);
      paramParcel.writeString(this.nEp);
      paramParcel.writeString(this.nEr);
      paramParcel.writeString(this.nEs);
      paramParcel.writeString(this.nDU);
      paramParcel.writeString(this.rhL);
      paramParcel.writeString(this.nEw);
      paramParcel.writeTypedList(this.rhM);
      paramParcel.writeString(this.rhN);
      paramParcel.writeString(this.rhP);
      paramParcel.writeParcelable(this.rhQ, 0);
      GMTrace.o(6892214550528L, 51351);
    }
  }
  
  public static class DeductInfo
    implements Parcelable
  {
    public static final Parcelable.Creator<DeductInfo> CREATOR;
    public String desc;
    public String jzt;
    public int qZv;
    public String qZw;
    public int rad;
    public String rhU;
    public List<Orders.DeductShowInfo> rhV;
    public int rhW;
    public String rhX;
    public String title;
    
    static
    {
      GMTrace.i(6891677679616L, 51347);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(6891677679616L, 51347);
    }
    
    public DeductInfo()
    {
      GMTrace.i(6891140808704L, 51343);
      this.rhV = new ArrayList();
      GMTrace.o(6891140808704L, 51343);
    }
    
    public DeductInfo(Parcel paramParcel)
    {
      GMTrace.i(6891275026432L, 51344);
      this.rhV = new ArrayList();
      this.title = paramParcel.readString();
      this.desc = paramParcel.readString();
      this.rad = paramParcel.readInt();
      this.rhU = paramParcel.readString();
      this.rhW = paramParcel.readInt();
      paramParcel.readTypedList(this.rhV, Orders.DeductShowInfo.CREATOR);
      this.qZv = paramParcel.readInt();
      this.jzt = paramParcel.readString();
      this.qZw = paramParcel.readString();
      this.rhX = paramParcel.readString();
      GMTrace.o(6891275026432L, 51344);
    }
    
    public int describeContents()
    {
      GMTrace.i(6891409244160L, 51345);
      GMTrace.o(6891409244160L, 51345);
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(6891543461888L, 51346);
      paramParcel.writeString(this.title);
      paramParcel.writeString(this.desc);
      paramParcel.writeInt(this.rad);
      paramParcel.writeString(this.rhU);
      paramParcel.writeInt(this.rhW);
      paramParcel.writeTypedList(this.rhV);
      paramParcel.writeInt(this.qZv);
      paramParcel.writeString(this.jzt);
      paramParcel.writeString(this.qZw);
      paramParcel.writeString(this.rhX);
      GMTrace.o(6891543461888L, 51346);
    }
  }
  
  public static class DeductShowInfo
    implements Parcelable
  {
    public static final Parcelable.Creator<DeductShowInfo> CREATOR;
    public String name;
    public String url;
    public String value;
    
    static
    {
      GMTrace.i(6864834134016L, 51147);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(6864834134016L, 51147);
    }
    
    public DeductShowInfo()
    {
      GMTrace.i(6864297263104L, 51143);
      GMTrace.o(6864297263104L, 51143);
    }
    
    protected DeductShowInfo(Parcel paramParcel)
    {
      GMTrace.i(6864431480832L, 51144);
      this.name = paramParcel.readString();
      this.value = paramParcel.readString();
      this.url = paramParcel.readString();
      GMTrace.o(6864431480832L, 51144);
    }
    
    public int describeContents()
    {
      GMTrace.i(6864565698560L, 51145);
      GMTrace.o(6864565698560L, 51145);
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(6864699916288L, 51146);
      paramParcel.writeString(this.name);
      paramParcel.writeString(this.value);
      paramParcel.writeString(this.url);
      GMTrace.o(6864699916288L, 51146);
    }
  }
  
  public static class DiscountInfo
    implements Parcelable
  {
    public static final Parcelable.Creator<DiscountInfo> CREATOR;
    public String qXr;
    public double rhY;
    
    static
    {
      GMTrace.i(6886711623680L, 51310);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(6886711623680L, 51310);
    }
    
    public DiscountInfo()
    {
      GMTrace.i(6886174752768L, 51306);
      GMTrace.o(6886174752768L, 51306);
    }
    
    public DiscountInfo(Parcel paramParcel)
    {
      GMTrace.i(6886308970496L, 51307);
      this.rhY = paramParcel.readDouble();
      this.qXr = paramParcel.readString();
      GMTrace.o(6886308970496L, 51307);
    }
    
    public int describeContents()
    {
      GMTrace.i(6886443188224L, 51308);
      GMTrace.o(6886443188224L, 51308);
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(6886577405952L, 51309);
      paramParcel.writeDouble(this.rhY);
      paramParcel.writeString(this.qXr);
      GMTrace.o(6886577405952L, 51309);
    }
  }
  
  public static class RecommendTinyAppInfo
    implements Parcelable
  {
    public static final Parcelable.Creator<RecommendTinyAppInfo> CREATOR;
    public String rgV;
    public String rgW;
    public String rgX;
    public String rgY;
    public String rgZ;
    public String rha;
    public int rhb;
    public long rig;
    public long rih;
    public long rii;
    public int rij;
    public int rik;
    public long ril;
    
    static
    {
      GMTrace.i(6865773658112L, 51154);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(6865773658112L, 51154);
    }
    
    public RecommendTinyAppInfo()
    {
      GMTrace.i(6865236787200L, 51150);
      GMTrace.o(6865236787200L, 51150);
    }
    
    public RecommendTinyAppInfo(Parcel paramParcel)
    {
      GMTrace.i(6865371004928L, 51151);
      this.rgV = paramParcel.readString();
      this.rgW = paramParcel.readString();
      this.rgX = paramParcel.readString();
      this.rgY = paramParcel.readString();
      this.rgZ = paramParcel.readString();
      this.rhb = paramParcel.readInt();
      GMTrace.o(6865371004928L, 51151);
    }
    
    public int describeContents()
    {
      GMTrace.i(6865505222656L, 51152);
      GMTrace.o(6865505222656L, 51152);
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(6865639440384L, 51153);
      paramParcel.writeString(this.rgV);
      paramParcel.writeString(this.rgW);
      paramParcel.writeString(this.rgX);
      paramParcel.writeString(this.rgY);
      paramParcel.writeString(this.rgZ);
      paramParcel.writeInt(this.rhb);
      GMTrace.o(6865639440384L, 51153);
    }
  }
  
  public static final class a
  {
    public String text;
    public String url;
    
    public a()
    {
      GMTrace.i(6889261760512L, 51329);
      this.text = "";
      this.url = "";
      GMTrace.o(6889261760512L, 51329);
    }
  }
  
  public static final class b
  {
    public String nEs;
    public String nIR;
    public String name;
    public long rgN;
    public int rgQ;
    public int rgR;
    public long rgS;
    public String rgT;
    public int rhZ;
    public int ria;
    public int rib;
    public String ric;
    public String rid;
    public String rie;
    public int rif;
    public String title;
    public int type;
    public String url;
    
    public b()
    {
      GMTrace.i(6869129101312L, 51179);
      GMTrace.o(6869129101312L, 51179);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\Orders.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */