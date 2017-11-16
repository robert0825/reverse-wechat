package com.tencent.mm.plugin.offline.c;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.offline.a.r.f;
import com.tencent.mm.plugin.offline.a.r.h;
import com.tencent.mm.plugin.offline.j;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.Orders.DiscountInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders.RecommendTinyAppInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders.b;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.bf;
import com.tencent.mm.y.bf.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  public static String jwL;
  public static String nDe;
  public static String nDf;
  public static int nDg;
  public static String nDh;
  public static String nDi;
  public static String nDj;
  public static int nDk;
  public static int nDl;
  public static long nDm;
  public static boolean nDn;
  public static String nDo;
  public static String nDp;
  private static Comparator<Bankcard> nDq;
  private static Comparator<a> nDr;
  
  static
  {
    GMTrace.i(6250385375232L, 46569);
    nDe = "";
    nDf = "";
    nDg = 1;
    nDh = "";
    nDi = "";
    nDj = "";
    nDk = 1;
    nDl = 0;
    nDm = 0L;
    nDn = false;
    jwL = "";
    nDo = "";
    nDp = "";
    nDq = new Comparator() {};
    nDr = new Comparator() {};
    GMTrace.o(6250385375232L, 46569);
  }
  
  public static void C(Activity paramActivity)
  {
    GMTrace.i(6246493061120L, 46540);
    a(paramActivity, "freeze", paramActivity.getString(a.i.thv), 0, -1);
    GMTrace.o(6246493061120L, 46540);
  }
  
  public static void D(Activity paramActivity)
  {
    GMTrace.i(6246627278848L, 46541);
    com.tencent.mm.plugin.offline.k.aVi();
    String str = com.tencent.mm.plugin.offline.k.sf(196640);
    int i;
    if ((TextUtils.isEmpty(str)) || (!uE(str)))
    {
      i = 0;
      if (i <= 0) {
        break label73;
      }
      i *= 100;
    }
    for (;;)
    {
      a(paramActivity, "create", "", i, -1);
      GMTrace.o(6246627278848L, 46541);
      return;
      i = Integer.valueOf(str).intValue();
      break;
      label73:
      i = 20000;
    }
  }
  
  public static Orders E(Map<String, String> paramMap)
  {
    GMTrace.i(6245687754752L, 46534);
    Orders localOrders = new Orders();
    Orders.Commodity localCommodity = new Orders.Commodity();
    localCommodity.nEd = ((String)paramMap.get(".sysmsg.paymsg.user_roll.buy_uin"));
    localCommodity.nEe = ((String)paramMap.get(".sysmsg.paymsg.user_roll.buy_name"));
    localCommodity.nEf = ((String)paramMap.get(".sysmsg.paymsg.user_roll.sale_uin"));
    localCommodity.nEg = ((String)paramMap.get(".sysmsg.paymsg.user_roll.sale_name"));
    localCommodity.eRP = ((String)paramMap.get(".sysmsg.paymsg.user_roll.trans_id"));
    localCommodity.desc = ((String)paramMap.get(".sysmsg.paymsg.user_roll.goods_name"));
    localCommodity.jWS = (bg.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.pay_num"), -1) / 100.0D);
    localCommodity.nEk = ((String)paramMap.get(".sysmsg.paymsg.user_roll.trade_state"));
    localCommodity.nEl = ((String)paramMap.get(".sysmsg.paymsg.user_roll.trade_state_name"));
    localCommodity.nEp = ((String)paramMap.get(".sysmsg.paymsg.user_roll.buy_bank_name"));
    localCommodity.nEw = ((String)paramMap.get(".sysmsg.paymsg.user_roll.discount"));
    localCommodity.nEn = bg.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.modify_timestamp"), 0);
    localCommodity.nEr = ((String)paramMap.get(".sysmsg.paymsg.user_roll.fee_type"));
    localCommodity.nEs = ((String)paramMap.get(".sysmsg.paymsg.user_roll.appusername"));
    localCommodity.nDU = ((String)paramMap.get(".sysmsg.paymsg.user_roll.app_telephone"));
    localCommodity.rhJ = (bg.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.buy_bank_name"), -1) / 100.0D);
    Object localObject1 = new Orders.b();
    ((Orders.b)localObject1).name = ((String)paramMap.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.nickname"));
    ((Orders.b)localObject1).nEs = ((String)paramMap.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.username"));
    ((Orders.b)localObject1).type = Orders.rhH;
    localCommodity.rhK = ((Orders.b)localObject1).nEs;
    ((Orders.b)localObject1).nIR = ((String)paramMap.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.logo_round_url"));
    ((Orders.b)localObject1).url = ((String)paramMap.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.subscribe_biz_url"));
    int j = bg.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.recommend_level"), 1);
    localCommodity.rhm = j;
    localCommodity.rhN = ((String)paramMap.get(".sysmsg.paymsg.user_roll.rateinfo"));
    localCommodity.rhO = ((String)paramMap.get(".sysmsg.paymsg.user_roll.discount_rateinfo"));
    localCommodity.rhP = ((String)paramMap.get(".sysmsg.paymsg.user_roll.original_feeinfo"));
    if (!bg.nm(((Orders.b)localObject1).name))
    {
      localCommodity.rhS = true;
      localCommodity.rhR.add(localObject1);
    }
    int i = 0;
    Orders.b localb;
    String str1;
    Object localObject2;
    String str2;
    String str3;
    String str4;
    String str5;
    String str6;
    String str7;
    String str8;
    String str9;
    String str10;
    String str11;
    String str12;
    String str13;
    String str14;
    if (i < 255)
    {
      localb = new Orders.b();
      if (i == 0)
      {
        localObject1 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.icon");
        str1 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.wording");
        localObject2 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.url");
        str2 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.btn_text");
        str3 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.type");
        str4 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.title");
        str5 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_type");
        str6 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_id");
        str7 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.send_record_id");
        str8 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.award_id");
        str9 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.user_record_id");
        str10 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.small_title");
        str11 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_tinyapp_username");
        str12 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_tinyapp_path");
        str13 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_mch_id");
        str14 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_tinyapp_version");
        label739:
        if (!bg.nm(str1)) {
          break label2014;
        }
        w.i("MicroMsg.WalletOfflineUtil", "hy: activity end. total size: %d", new Object[] { Integer.valueOf(i + 1) });
      }
    }
    else
    {
      localObject1 = (String)paramMap.get(".sysmsg.paymsg.user_roll.link_ativity_info.text");
      str1 = (String)paramMap.get(".sysmsg.paymsg.user_roll.link_ativity_info.url");
      localCommodity.rhT.text = ((String)localObject1);
      localCommodity.rhT.url = str1;
      localObject1 = (String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_name");
      str1 = (String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_logo");
      localObject2 = (String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_desc");
      str2 = (String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_username");
      str3 = (String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_path");
      if ((!bg.nm((String)localObject1)) && (!bg.nm(str1)) && (!bg.nm((String)localObject2)) && (!bg.nm(str2)))
      {
        localCommodity.rhQ = new Orders.RecommendTinyAppInfo();
        localCommodity.rhQ.rgV = ((String)localObject1);
        localCommodity.rhQ.rgW = str1;
        localCommodity.rhQ.rgX = ((String)localObject2);
        localCommodity.rhQ.rgY = str2;
        localCommodity.rhQ.rgZ = str3;
        localCommodity.rhQ.rha = ((String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.activity_tinyapp_btn_text"));
        localCommodity.rhQ.rig = bg.getLong((String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.activity_id"), 0L);
        localCommodity.rhQ.rih = bg.getLong((String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.activity_type"), 0L);
        localCommodity.rhQ.rij = bg.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.send_record_id"), 0);
        localCommodity.rhQ.rik = bg.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.user_record_id"), 0);
        localCommodity.rhQ.ril = bg.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.activity_mch_id"), 0);
        localCommodity.rhQ.rii = bg.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.award_id"), 0);
        localCommodity.rhQ.rhb = bg.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_version"), 0);
      }
      localOrders.rhv = new ArrayList();
      localOrders.rhv.add(localCommodity);
      localOrders.rhF = bg.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.is_use_new_paid_succ_page"), 0);
      localOrders.rhG = ((String)paramMap.get(".sysmsg.paymsg.user_roll.pay_succ_btn_wording"));
      localOrders.rho = ((String)paramMap.get(".sysmsg.paymsg.user_roll.trade_state_name"));
      localOrders.rhm = j;
      localOrders.eHG = ((String)paramMap.get(".sysmsg.req_key"));
      localCommodity.rhJ = (bg.getDouble((String)paramMap.get(".sysmsg.paymsg.user_roll.original_total_fee"), -1.0D) / 100.0D);
      if (TextUtils.isEmpty((String)paramMap.get(".sysmsg.paymsg.user_roll.discount_array.record.favor_desc"))) {
        break label2244;
      }
      i = 0;
      label1315:
      if (i != 0) {
        break label2185;
      }
    }
    label2014:
    label2185:
    for (localObject1 = "";; localObject1 = String.valueOf(i))
    {
      str1 = ".sysmsg.paymsg.user_roll.discount_array.record" + (String)localObject1 + ".favor_desc";
      localObject1 = ".sysmsg.paymsg.user_roll.discount_array.record" + (String)localObject1 + ".payment_amount";
      if ((TextUtils.isEmpty((CharSequence)paramMap.get(str1))) || (TextUtils.isEmpty((CharSequence)paramMap.get(localObject1)))) {
        break label2193;
      }
      localObject2 = new Orders.DiscountInfo();
      ((Orders.DiscountInfo)localObject2).qXr = ((String)paramMap.get(str1));
      ((Orders.DiscountInfo)localObject2).rhY = bg.getDouble((String)paramMap.get(localObject1), 0.0D);
      localCommodity.rhM.add(localObject2);
      i += 1;
      break label1315;
      localObject1 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".icon");
      str1 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".wording");
      localObject2 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".url");
      str2 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".btn_text");
      str3 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".type");
      str4 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".title");
      str5 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".activity_type");
      str6 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".activity_id");
      str7 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".send_record_id");
      str8 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".award_id");
      str9 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".user_record_id");
      str10 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".small_title");
      str11 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".activity_tinyapp_username");
      str12 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".activity_tinyapp_path");
      str13 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".activity_mch_id");
      str14 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + i + ".activity_tinyapp_version");
      break label739;
      localb.nIR = ((String)localObject1);
      localb.name = str1;
      localb.url = ((String)localObject2);
      localb.rgT = str2;
      localb.type = Orders.rhI;
      localb.rhZ = bg.getInt(str3, 0);
      localb.title = str4;
      localb.ria = bg.getInt(str5, 0);
      localb.rgN = bg.getLong(str6, 0L);
      localb.rgQ = bg.getInt(str7, 0);
      localb.rib = bg.getInt(str8, 0);
      localb.rgR = bg.getInt(str9, 0);
      localb.ric = str10;
      localb.rid = str11;
      localb.rie = str12;
      localb.rgS = bg.getLong(str13, 0L);
      localb.rif = bg.getInt(str14, 0);
      localCommodity.rhR.add(localb);
      i += 1;
      break;
    }
    label2193:
    w.e("MicroMsg.WalletOfflineUtil", "favor_desc_key is " + str1 + ", payment_amount_key is " + (String)localObject1 + ", break");
    for (;;)
    {
      GMTrace.o(6245687754752L, 46534);
      return localOrders;
      label2244:
      w.e("MicroMsg.WalletOfflineUtil", ".sysmsg.paymsg.user_roll.discount_array.record.favor_desc value is empty");
    }
  }
  
  public static void E(Activity paramActivity)
  {
    GMTrace.i(6248774762496L, 46557);
    com.tencent.mm.ui.base.h.bm(paramActivity, paramActivity.getResources().getString(a.i.tht));
    if (!TextUtils.isEmpty(aWl())) {
      ap(paramActivity, aWl());
    }
    GMTrace.o(6248774762496L, 46557);
  }
  
  public static void Eh(String paramString)
  {
    GMTrace.i(6244614012928L, 46526);
    com.tencent.mm.plugin.offline.k.aVi();
    com.tencent.mm.plugin.offline.k.ai(196631, paramString);
    GMTrace.o(6244614012928L, 46526);
  }
  
  public static void Ei(String paramString)
  {
    GMTrace.i(6245285101568L, 46531);
    w.i("MicroMsg.WalletOfflineUtil", "setSelectBindSerial %s %s", new Object[] { paramString, bg.bQW().toString() });
    com.tencent.mm.plugin.offline.k.aVi();
    com.tencent.mm.plugin.offline.k.ai(196633, paramString);
    GMTrace.o(6245285101568L, 46531);
  }
  
  private static void Ej(String paramString)
  {
    GMTrace.i(6247835238400L, 46550);
    com.tencent.mm.plugin.offline.k.aVi();
    com.tencent.mm.plugin.offline.k.ai(196656, paramString);
    nDh = paramString;
    GMTrace.o(6247835238400L, 46550);
  }
  
  public static LinkedList<a> Ek(String paramString)
  {
    GMTrace.i(6248103673856L, 46552);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(6248103673856L, 46552);
      return null;
    }
    try
    {
      paramString = o(new JSONArray(paramString));
      GMTrace.o(6248103673856L, 46552);
      return paramString;
    }
    catch (JSONException paramString)
    {
      w.printErrStackTrace("MicroMsg.WalletOfflineUtil", paramString, "", new Object[0]);
      GMTrace.o(6248103673856L, 46552);
    }
    return null;
  }
  
  public static void El(String paramString)
  {
    GMTrace.i(6248640544768L, 46556);
    com.tencent.mm.plugin.offline.k.aVi();
    com.tencent.mm.plugin.offline.k.ai(196616, paramString);
    GMTrace.o(6248640544768L, 46556);
  }
  
  public static void Em(String paramString)
  {
    GMTrace.i(6249177415680L, 46560);
    com.tencent.mm.plugin.offline.k.aVi();
    com.tencent.mm.plugin.offline.k.ai(196615, paramString);
    nDj = paramString;
    GMTrace.o(6249177415680L, 46560);
  }
  
  private static LinkedList<b> En(String paramString)
  {
    GMTrace.i(6249311633408L, 46561);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(6249311633408L, 46561);
      return null;
    }
    try
    {
      paramString = p(new JSONArray(paramString));
      GMTrace.o(6249311633408L, 46561);
      return paramString;
    }
    catch (JSONException paramString)
    {
      w.printErrStackTrace("MicroMsg.WalletOfflineUtil", paramString, "", new Object[0]);
      GMTrace.o(6249311633408L, 46561);
    }
    return null;
  }
  
  public static String Eo(String paramString)
  {
    GMTrace.i(6249848504320L, 46565);
    LinkedList localLinkedList = En(aWn());
    if (localLinkedList == null)
    {
      GMTrace.o(6249848504320L, 46565);
      return "";
    }
    int i = 0;
    b localb;
    if (i < localLinkedList.size())
    {
      localb = (b)localLinkedList.get(i);
      if ((localb == null) || (!paramString.equals(localb.nDt))) {}
    }
    for (paramString = localb.nDw;; paramString = "")
    {
      GMTrace.o(6249848504320L, 46565);
      return paramString;
      i += 1;
      break;
    }
  }
  
  public static String Ep(String paramString)
  {
    int j = 0;
    GMTrace.i(6249982722048L, 46566);
    Object localObject = Ek(aWi());
    LinkedList localLinkedList = En(aWn());
    if ((localObject == null) || (localLinkedList == null) || (((LinkedList)localObject).size() == 0) || (localLinkedList.size() == 0))
    {
      w.e("MicroMsg.WalletOfflineUtil", "getBankLogoUrl() cardList == null || cardLogoList == null || cardList.size() == 0 || cardLogoList.size() == 0");
      GMTrace.o(6249982722048L, 46566);
      return "";
    }
    int i = 0;
    a locala;
    if (i < ((LinkedList)localObject).size())
    {
      locala = (a)((LinkedList)localObject).get(i);
      if ((locala == null) || (!paramString.equals(locala.nDu))) {}
    }
    for (paramString = locala.nDt;; paramString = "")
    {
      if (TextUtils.isEmpty(paramString))
      {
        w.e("MicroMsg.WalletOfflineUtil", "getBankLogoUrl() bank_type == null, can not find this bank_type");
        GMTrace.o(6249982722048L, 46566);
        return "";
        i += 1;
        break;
      }
      i = j;
      if (i < localLinkedList.size())
      {
        localObject = (b)localLinkedList.get(i);
        if ((localObject == null) || (!paramString.equals(((b)localObject).nDt))) {}
      }
      for (paramString = ((b)localObject).nDw;; paramString = "")
      {
        GMTrace.o(6249982722048L, 46566);
        return paramString;
        i += 1;
        break;
      }
    }
  }
  
  public static void Eq(String paramString)
  {
    GMTrace.i(16582734512128L, 123551);
    com.tencent.mm.kernel.h.xy().xh().a(w.a.vyb, paramString);
    GMTrace.o(16582734512128L, 123551);
  }
  
  public static void Er(String paramString)
  {
    GMTrace.i(16583002947584L, 123553);
    com.tencent.mm.kernel.h.xy().xh().a(w.a.vyJ, paramString);
    GMTrace.o(16583002947584L, 123553);
  }
  
  public static void Es(String paramString)
  {
    GMTrace.i(16583539818496L, 123557);
    com.tencent.mm.kernel.h.xy().xh().a(w.a.vyL, paramString);
    GMTrace.o(16583539818496L, 123557);
  }
  
  public static void a(Activity paramActivity, int paramInt1, int paramInt2)
  {
    GMTrace.i(6246090407936L, 46537);
    PayInfo localPayInfo = new PayInfo();
    localPayInfo.ePM = 5;
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("key_pay_info", localPayInfo);
    localBundle.putBoolean("key_need_bind_response", true);
    localBundle.putInt("key_bind_scene", 5);
    localBundle.putInt("key_offline_add_fee", paramInt1);
    if (paramInt2 >= 0) {
      localBundle.putInt("key_entry_scene", paramInt2);
    }
    if (!com.tencent.mm.plugin.wallet_core.model.n.byx().byS())
    {
      if (com.tencent.mm.plugin.wallet_core.model.n.byx().byP())
      {
        localBundle.putBoolean("key_is_bind_bankcard", true);
        com.tencent.mm.wallet_core.a.a(paramActivity, com.tencent.mm.plugin.offline.d.class, localBundle);
        GMTrace.o(6246090407936L, 46537);
        return;
      }
      if (com.tencent.mm.plugin.wallet_core.model.n.byx().byT())
      {
        localBundle.putBoolean("key_is_bind_bankcard", true);
        com.tencent.mm.wallet_core.a.a(paramActivity, com.tencent.mm.plugin.offline.d.class, localBundle);
        GMTrace.o(6246090407936L, 46537);
        return;
      }
    }
    com.tencent.mm.wallet_core.a.a(paramActivity, com.tencent.mm.plugin.offline.c.class, localBundle);
    GMTrace.o(6246090407936L, 46537);
  }
  
  public static void a(Activity paramActivity, r.f paramf)
  {
    GMTrace.i(15384707072000L, 114625);
    w.i("MicroMsg.WalletOfflineUtil", "hy: whole pay msg coming. direct parse");
    if ((paramf == null) || (paramf.nBu == null))
    {
      w.e("MicroMsg.WalletOfflineUtil", "order == null");
      GMTrace.o(15384707072000L, 114625);
      return;
    }
    if (!aVT())
    {
      GMTrace.o(15384707072000L, 114625);
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("key_orders", paramf.nBu);
    localBundle.putInt("key_pay_type", 2);
    if (paramf.eXW != null)
    {
      RealnameGuideHelper localRealnameGuideHelper = new RealnameGuideHelper();
      localRealnameGuideHelper.a(paramf.eXW.eXD, paramf.eXW.eXE, paramf.eXW.eXF, paramf.eXW.eXG, paramf.eXW.eXH, 8);
      localBundle.putParcelable("key_realname_guide_helper", localRealnameGuideHelper);
    }
    com.tencent.mm.wallet_core.a.a(paramActivity, j.class, localBundle);
    GMTrace.o(15384707072000L, 114625);
  }
  
  public static void a(Activity paramActivity, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(6245821972480L, 46535);
    w.i("MicroMsg.WalletOfflineUtil", "hy: only transid coming. do old way");
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.WalletOfflineUtil", "transid == null");
      GMTrace.o(6245821972480L, 46535);
      return;
    }
    if (!aVT())
    {
      GMTrace.o(6245821972480L, 46535);
      return;
    }
    Bundle localBundle = new Bundle();
    if ((paramk instanceof com.tencent.mm.plugin.offline.a.e))
    {
      paramk = ((com.tencent.mm.plugin.offline.a.e)paramk).nAD;
      if (paramk != null) {
        localBundle.putParcelable("key_realname_guide_helper", paramk);
      }
    }
    localBundle.putString("key_trans_id", paramString);
    localBundle.putInt("key_pay_type", 2);
    com.tencent.mm.wallet_core.a.a(paramActivity, j.class, localBundle);
    GMTrace.o(6245821972480L, 46535);
  }
  
  private static void a(Activity paramActivity, String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    GMTrace.i(6246358843392L, 46539);
    Bundle localBundle = new Bundle();
    localBundle.putString("oper", paramString1);
    localBundle.putInt("offline_chg_fee", paramInt1);
    localBundle.putString("pwd_tips", paramString2);
    if (paramInt2 >= 0) {
      localBundle.putInt("offline_from_scene", paramInt2);
    }
    com.tencent.mm.wallet_core.a.a(paramActivity, com.tencent.mm.plugin.offline.h.class, localBundle);
    GMTrace.o(6246358843392L, 46539);
  }
  
  public static boolean aVS()
  {
    GMTrace.i(6242869182464L, 46513);
    com.tencent.mm.plugin.offline.k.aVi();
    String str = com.tencent.mm.plugin.offline.k.sf(196630);
    if ((str != null) && (str.equals("1")))
    {
      GMTrace.o(6242869182464L, 46513);
      return true;
    }
    GMTrace.o(6242869182464L, 46513);
    return false;
  }
  
  public static boolean aVT()
  {
    GMTrace.i(6243003400192L, 46514);
    com.tencent.mm.plugin.offline.k.aVi();
    String str = com.tencent.mm.plugin.offline.k.sf(196641);
    if ((str != null) && (str.equals("1")))
    {
      GMTrace.o(6243003400192L, 46514);
      return true;
    }
    GMTrace.o(6243003400192L, 46514);
    return false;
  }
  
  public static Bankcard aVU()
  {
    GMTrace.i(6243137617920L, 46515);
    Object localObject2 = aWc();
    w.i("MicroMsg.WalletOfflineUtil", "step 1 getSelectedBindBankCard %s", new Object[] { localObject2 });
    Object localObject1 = com.tencent.mm.plugin.wallet_core.model.n.byx().iT(true);
    int i = 0;
    while ((!TextUtils.isEmpty((CharSequence)localObject2)) && (i < ((List)localObject1).size()))
    {
      Bankcard localBankcard = (Bankcard)((List)localObject1).get(i);
      if ((localBankcard != null) && (((String)localObject2).equals(localBankcard.field_bindSerial)))
      {
        w.i("MicroMsg.WalletOfflineUtil", "step 2 micropay: %s, forbidword: %s", new Object[] { Boolean.valueOf(localBankcard.field_support_micropay), localBankcard.field_forbidWord });
        if (localBankcard.field_support_micropay)
        {
          GMTrace.o(6243137617920L, 46515);
          return localBankcard;
        }
      }
      i += 1;
    }
    w.i("MicroMsg.WalletOfflineUtil", "step 3 clear default bindserial");
    Ei("");
    localObject2 = aVW();
    if ((localObject2 != null) && (bg.nm(((Bankcard)localObject2).field_forbidWord)))
    {
      w.i("MicroMsg.WalletOfflineUtil", "do change main card: %s", new Object[] { ((Bankcard)localObject2).field_bankcardType });
      GMTrace.o(6243137617920L, 46515);
      return (Bankcard)localObject2;
    }
    i = 0;
    while (i < ((List)localObject1).size())
    {
      localObject2 = (Bankcard)((List)localObject1).get(i);
      if ((localObject2 != null) && (((Bankcard)localObject2).field_support_micropay) && (!((Bankcard)localObject2).byd()))
      {
        w.i("MicroMsg.WalletOfflineUtil", "do change first card: %s", new Object[] { ((Bankcard)localObject2).field_bankcardType });
        GMTrace.o(6243137617920L, 46515);
        return (Bankcard)localObject2;
      }
      i += 1;
    }
    localObject1 = com.tencent.mm.plugin.wallet_core.model.n.byx().qUy;
    if ((localObject1 != null) && (((Bankcard)localObject1).field_support_micropay))
    {
      w.i("MicroMsg.WalletOfflineUtil", "do change balance: %s", new Object[] { ((Bankcard)localObject1).field_bankcardType });
      GMTrace.o(6243137617920L, 46515);
      return (Bankcard)localObject1;
    }
    localObject1 = com.tencent.mm.plugin.wallet_core.model.n.byx().rjy;
    if ((localObject1 != null) && (((Bankcard)localObject1).field_support_micropay) && (bg.nm(((Bankcard)localObject1).field_forbidWord)))
    {
      w.i("MicroMsg.WalletOfflineUtil", "do change balance: %s", new Object[] { ((Bankcard)localObject1).field_bankcardType });
      GMTrace.o(6243137617920L, 46515);
      return (Bankcard)localObject1;
    }
    GMTrace.o(6243137617920L, 46515);
    return null;
  }
  
  public static Bankcard aVV()
  {
    GMTrace.i(6243271835648L, 46516);
    Object localObject = aVU();
    if ((localObject != null) && (((Bankcard)localObject).field_support_micropay) && (bg.nm(((Bankcard)localObject).field_forbidWord)))
    {
      GMTrace.o(6243271835648L, 46516);
      return (Bankcard)localObject;
    }
    localObject = com.tencent.mm.plugin.wallet_core.model.n.byx().iL(true);
    int i = 0;
    while (i < ((List)localObject).size())
    {
      Bankcard localBankcard = (Bankcard)((List)localObject).get(i);
      if ((localBankcard != null) && (localBankcard.field_support_micropay))
      {
        GMTrace.o(6243271835648L, 46516);
        return localBankcard;
      }
      i += 1;
    }
    GMTrace.o(6243271835648L, 46516);
    return null;
  }
  
  public static Bankcard aVW()
  {
    GMTrace.i(6243406053376L, 46517);
    Bankcard localBankcard = com.tencent.mm.plugin.wallet_core.model.n.byx().a(null, null, true, true);
    if (localBankcard == null) {
      w.e("MicroMsg.WalletOfflineUtil", "defaultBankcards == null");
    }
    GMTrace.o(6243406053376L, 46517);
    return localBankcard;
  }
  
  public static int aVX()
  {
    GMTrace.i(6243540271104L, 46518);
    int i = com.tencent.mm.plugin.wallet_core.model.n.byx().iL(true).size();
    GMTrace.o(6243540271104L, 46518);
    return i;
  }
  
  public static List<Bankcard> aVY()
  {
    GMTrace.i(6243808706560L, 46520);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = com.tencent.mm.plugin.wallet_core.model.n.byx().iT(true);
    int i = 0;
    while (i < localArrayList2.size())
    {
      localArrayList1.add((Bankcard)localArrayList2.get(i));
      i += 1;
    }
    w.i("MicroMsg.WalletOfflineUtil", "getOfflineBindBankCardList() list size is " + localArrayList1.size());
    GMTrace.o(6243808706560L, 46520);
    return localArrayList1;
  }
  
  public static int aVZ()
  {
    GMTrace.i(6243942924288L, 46521);
    com.tencent.mm.plugin.offline.k.aVi();
    String str = com.tencent.mm.plugin.offline.k.sf(196629);
    if ((TextUtils.isEmpty(str)) || (!uE(str)))
    {
      GMTrace.o(6243942924288L, 46521);
      return 0;
    }
    int i = Integer.valueOf(str).intValue();
    GMTrace.o(6243942924288L, 46521);
    return i;
  }
  
  public static String aWa()
  {
    GMTrace.i(6244345577472L, 46524);
    com.tencent.mm.plugin.offline.k.aVi();
    String str = com.tencent.mm.plugin.offline.k.sf(196632);
    GMTrace.o(6244345577472L, 46524);
    return str;
  }
  
  public static String aWb()
  {
    GMTrace.i(6244479795200L, 46525);
    com.tencent.mm.plugin.offline.k.aVi();
    String str = com.tencent.mm.plugin.offline.k.sf(196631);
    GMTrace.o(6244479795200L, 46525);
    return str;
  }
  
  public static String aWc()
  {
    GMTrace.i(6245150883840L, 46530);
    com.tencent.mm.plugin.offline.k.aVi();
    String str = com.tencent.mm.plugin.offline.k.sf(196633);
    GMTrace.o(6245150883840L, 46530);
    return str;
  }
  
  public static void aWd()
  {
    GMTrace.i(6245419319296L, 46532);
    w.i("MicroMsg.WalletOfflineUtil", "clear offline data");
    com.tencent.mm.plugin.offline.k.aVi();
    com.tencent.mm.plugin.offline.k.ai(196630, "0");
    com.tencent.mm.plugin.offline.k.aVi();
    com.tencent.mm.plugin.offline.k.ai(196626, "");
    com.tencent.mm.plugin.offline.k.aVi();
    com.tencent.mm.plugin.offline.k.ai(196627, "");
    com.tencent.mm.plugin.offline.k.aVi();
    com.tencent.mm.plugin.offline.k.ai(196628, "");
    com.tencent.mm.plugin.offline.k.aVi();
    com.tencent.mm.plugin.offline.k.ai(196617, "");
    com.tencent.mm.plugin.offline.k.aVi();
    com.tencent.mm.plugin.offline.k.ai(196632, "");
    com.tencent.mm.plugin.offline.k.aVi();
    com.tencent.mm.plugin.offline.k.ai(196641, "");
    com.tencent.mm.plugin.offline.k.aVi();
    com.tencent.mm.plugin.offline.k.ai(196647, "");
    com.tencent.mm.plugin.offline.k.aVi();
    com.tencent.mm.plugin.offline.k.ai(196649, "");
    i("", "", "", "");
    com.tencent.mm.plugin.offline.k.aVi();
    com.tencent.mm.plugin.offline.k.ai(196629, "0");
    Eh("");
    com.tencent.mm.plugin.offline.k.aVi();
    com.tencent.mm.plugin.offline.k.aVj().nBg = null;
    com.tencent.mm.plugin.offline.k.aVi();
    com.tencent.mm.plugin.offline.k.aVl();
    com.tencent.mm.plugin.offline.k.aVi();
    String str = com.tencent.mm.plugin.offline.k.sf(196617);
    com.tencent.mm.wallet_core.c.a.clF();
    com.tencent.mm.wallet_core.c.a.clearToken(str);
    Em("");
    Ej("");
    GMTrace.o(6245419319296L, 46532);
  }
  
  public static void aWe()
  {
    GMTrace.i(6246895714304L, 46543);
    com.tencent.mm.plugin.offline.k.aVi();
    com.tencent.mm.plugin.offline.k.ai(196643, "1");
    GMTrace.o(6246895714304L, 46543);
  }
  
  public static int aWf()
  {
    GMTrace.i(6247164149760L, 46545);
    com.tencent.mm.plugin.offline.k.aVi();
    String str = com.tencent.mm.plugin.offline.k.sf(196644);
    if ((TextUtils.isEmpty(str)) || (!uE(str)))
    {
      GMTrace.o(6247164149760L, 46545);
      return 0;
    }
    int i = Integer.valueOf(str).intValue();
    GMTrace.o(6247164149760L, 46545);
    return i;
  }
  
  public static String aWg()
  {
    GMTrace.i(6247298367488L, 46546);
    if (!TextUtils.isEmpty(nDe))
    {
      str = nDe;
      GMTrace.o(6247298367488L, 46546);
      return str;
    }
    aWj();
    if (TextUtils.isEmpty(nDe)) {
      w.e("MicroMsg.WalletOfflineUtil", "token is null");
    }
    String str = nDe;
    GMTrace.o(6247298367488L, 46546);
    return str;
  }
  
  public static String aWh()
  {
    GMTrace.i(6247566802944L, 46548);
    if (!TextUtils.isEmpty(nDf))
    {
      str = nDf;
      GMTrace.o(6247566802944L, 46548);
      return str;
    }
    aWj();
    if (TextUtils.isEmpty(nDf)) {
      w.e("MicroMsg.WalletOfflineUtil", "offline_token_v2 is null");
    }
    String str = nDf;
    GMTrace.o(6247566802944L, 46548);
    return str;
  }
  
  public static String aWi()
  {
    GMTrace.i(6247701020672L, 46549);
    if (!TextUtils.isEmpty(nDh))
    {
      str = nDh;
      GMTrace.o(6247701020672L, 46549);
      return str;
    }
    if (TextUtils.isEmpty(nDh))
    {
      com.tencent.mm.plugin.offline.k.aVi();
      str = com.tencent.mm.plugin.offline.k.sf(196656);
      nDh = str;
      GMTrace.o(6247701020672L, 46549);
      return str;
    }
    if (TextUtils.isEmpty(nDh)) {
      w.e("MicroMsg.WalletOfflineUtil", "offline_card_list is null");
    }
    String str = nDh;
    GMTrace.o(6247701020672L, 46549);
    return str;
  }
  
  private static void aWj()
  {
    GMTrace.i(6247969456128L, 46551);
    com.tencent.mm.kernel.h.xx().fYr.a(new bf(new bf.a()
    {
      public final void a(com.tencent.mm.network.e paramAnonymouse)
      {
        GMTrace.i(6241795440640L, 46505);
        if ((paramAnonymouse == null) || (paramAnonymouse.DY() == null))
        {
          w.e("MicroMsg.WalletOfflineUtil", "doLocalProxyScene dispatcher == null || dispatcher.getAccInfo() == null");
          GMTrace.o(6241795440640L, 46505);
          return;
        }
        byte[] arrayOfByte = paramAnonymouse.DY().ii("offline_token");
        if (arrayOfByte != null) {
          a.nDe = new String(arrayOfByte);
        }
        arrayOfByte = paramAnonymouse.DY().ii("offline_token_V2");
        if (arrayOfByte != null) {
          a.nDf = new String(arrayOfByte);
        }
        paramAnonymouse = paramAnonymouse.DY().ii("offline_key_list");
        if (paramAnonymouse != null) {
          a.nDi = new String(paramAnonymouse);
        }
        GMTrace.o(6241795440640L, 46505);
      }
    }), 0);
    GMTrace.o(6247969456128L, 46551);
  }
  
  public static String aWk()
  {
    GMTrace.i(6248372109312L, 46554);
    com.tencent.mm.plugin.offline.k.aVi();
    String str = com.tencent.mm.plugin.offline.k.sf(196647);
    GMTrace.o(6248372109312L, 46554);
    return str;
  }
  
  private static String aWl()
  {
    GMTrace.i(6248506327040L, 46555);
    com.tencent.mm.plugin.offline.k.aVi();
    String str = com.tencent.mm.plugin.offline.k.sf(196616);
    GMTrace.o(6248506327040L, 46555);
    return str;
  }
  
  public static boolean aWm()
  {
    int j = 0;
    GMTrace.i(6248908980224L, 46558);
    ArrayList localArrayList = com.tencent.mm.plugin.wallet_core.model.n.byx().iL(true);
    Object localObject = Ek(aWi());
    if ((localObject == null) || (localArrayList.size() != ((LinkedList)localObject).size()))
    {
      GMTrace.o(6248908980224L, 46558);
      return false;
    }
    Collections.sort((List)localObject, nDr);
    Collections.sort(localArrayList, nDq);
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    while (i < ((LinkedList)localObject).size())
    {
      localStringBuilder.append(((a)((LinkedList)localObject).get(i)).nDu);
      i += 1;
    }
    localObject = new StringBuilder();
    i = j;
    while (i < localArrayList.size())
    {
      ((StringBuilder)localObject).append(((Bankcard)localArrayList.get(i)).field_bindSerial);
      i += 1;
    }
    boolean bool = aa.RP(localStringBuilder.toString()).equals(aa.RP(((StringBuilder)localObject).toString()));
    GMTrace.o(6248908980224L, 46558);
    return bool;
  }
  
  private static String aWn()
  {
    GMTrace.i(6249043197952L, 46559);
    if (TextUtils.isEmpty(nDj))
    {
      com.tencent.mm.plugin.offline.k.aVi();
      str = com.tencent.mm.plugin.offline.k.sf(196615);
      nDj = str;
      GMTrace.o(6249043197952L, 46559);
      return str;
    }
    String str = nDj;
    GMTrace.o(6249043197952L, 46559);
    return str;
  }
  
  public static int aWo()
  {
    GMTrace.i(6249580068864L, 46563);
    com.tencent.mm.plugin.offline.k.aVi();
    String str = com.tencent.mm.plugin.offline.k.sf(196649);
    if ((TextUtils.isEmpty(str)) || (!uE(str)))
    {
      GMTrace.o(6249580068864L, 46563);
      return 0;
    }
    int i = Integer.valueOf(str).intValue();
    GMTrace.o(6249580068864L, 46563);
    return i;
  }
  
  public static boolean aWp()
  {
    GMTrace.i(6249714286592L, 46564);
    String str = aWa();
    if (TextUtils.isEmpty(str))
    {
      GMTrace.o(6249714286592L, 46564);
      return false;
    }
    long l1 = aWo();
    long l2 = Long.valueOf(str).longValue();
    if (System.currentTimeMillis() / 1000L - l2 >= l1)
    {
      GMTrace.o(6249714286592L, 46564);
      return true;
    }
    GMTrace.o(6249714286592L, 46564);
    return false;
  }
  
  public static String aWq()
  {
    GMTrace.i(16582868729856L, 123552);
    Object localObject = com.tencent.mm.kernel.h.xy().xh().get(w.a.vyb, "");
    if (localObject != null)
    {
      localObject = (String)localObject;
      GMTrace.o(16582868729856L, 123552);
      return (String)localObject;
    }
    GMTrace.o(16582868729856L, 123552);
    return null;
  }
  
  public static String aWr()
  {
    GMTrace.i(16583137165312L, 123554);
    Object localObject = com.tencent.mm.kernel.h.xy().xh().get(w.a.vyJ, "");
    if (localObject != null)
    {
      localObject = (String)localObject;
      GMTrace.o(16583137165312L, 123554);
      return (String)localObject;
    }
    GMTrace.o(16583137165312L, 123554);
    return null;
  }
  
  public static int aWs()
  {
    GMTrace.i(16583405600768L, 123556);
    Object localObject = com.tencent.mm.kernel.h.xy().xh().get(w.a.vyK, null);
    if (localObject != null) {}
    for (int i = ((Integer)localObject).intValue();; i = 0)
    {
      int j = i;
      if (i < 0) {
        j = 0;
      }
      GMTrace.o(16583405600768L, 123556);
      return j;
    }
  }
  
  public static String aWt()
  {
    GMTrace.i(16583674036224L, 123558);
    Object localObject = com.tencent.mm.kernel.h.xy().xh().get(w.a.vyL, "");
    if (localObject != null)
    {
      localObject = (String)localObject;
      GMTrace.o(16583674036224L, 123558);
      return (String)localObject;
    }
    GMTrace.o(16583674036224L, 123558);
    return null;
  }
  
  public static boolean aWu()
  {
    GMTrace.i(16583942471680L, 123560);
    boolean bool2 = false;
    Object localObject = com.tencent.mm.y.c.c.Ct().er("100232");
    if (((com.tencent.mm.storage.c)localObject).isValid())
    {
      localObject = ((com.tencent.mm.storage.c)localObject).bSg();
      if ((((Map)localObject).containsKey("open")) && ("1".equals(((Map)localObject).get("open")))) {
        w.e("MicroMsg.WalletOfflineUtil", "deprecated abtest 100232 enabled.");
      }
    }
    localObject = com.tencent.mm.y.c.c.Ct().er("100261");
    boolean bool1 = bool2;
    if (((com.tencent.mm.storage.c)localObject).isValid())
    {
      localObject = ((com.tencent.mm.storage.c)localObject).bSg();
      bool1 = bool2;
      if (((Map)localObject).containsKey("open"))
      {
        bool1 = bool2;
        if ("1".equals(((Map)localObject).get("open"))) {
          bool1 = true;
        }
      }
    }
    w.v("MicroMsg.WalletOfflineUtil", "isPosEnabled: " + bool1);
    GMTrace.o(16583942471680L, 123560);
    return bool1;
  }
  
  private static void ap(Context paramContext, String paramString)
  {
    GMTrace.i(6244882448384L, 46528);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", false);
    com.tencent.mm.bj.d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
    GMTrace.o(6244882448384L, 46528);
  }
  
  public static void b(Activity paramActivity, String paramString)
  {
    GMTrace.i(6246761496576L, 46542);
    com.tencent.mm.ui.base.h.a(paramActivity, false, paramString, "", paramActivity.getString(a.i.thA), paramActivity.getString(a.i.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(6242600747008L, 46511);
        a.aWd();
        a.D(this.na);
        this.na.finish();
        GMTrace.o(6242600747008L, 46511);
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(6241258569728L, 46501);
        this.na.finish();
        GMTrace.o(6241258569728L, 46501);
      }
    });
    GMTrace.o(6246761496576L, 46542);
  }
  
  public static boolean cR(Context paramContext)
  {
    GMTrace.i(15384841289728L, 114626);
    Object localObject = ((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1);
    if ((localObject != null) && (!((List)localObject).isEmpty()))
    {
      localObject = ((ActivityManager.RunningTaskInfo)((List)localObject).get(0)).topActivity;
      w.d("MicroMsg.WalletOfflineUtil", "topActivity:" + ((ComponentName)localObject).flattenToString());
      if (!((ComponentName)localObject).getPackageName().equals(paramContext.getPackageName()))
      {
        w.i("MicroMsg.WalletOfflineUtil", "is in backGround.");
        GMTrace.o(15384841289728L, 114626);
        return false;
      }
    }
    if (((KeyguardManager)ab.getContext().getSystemService("keyguard")).inKeyguardRestrictedInputMode())
    {
      GMTrace.o(15384841289728L, 114626);
      return false;
    }
    w.i("MicroMsg.WalletOfflineUtil", "is in foreGround.");
    GMTrace.o(15384841289728L, 114626);
    return true;
  }
  
  public static void cX(Context paramContext)
  {
    GMTrace.i(6244748230656L, 46527);
    String str = v.bPK();
    if ("zh_CN".equals(str)) {
      str = paramContext.getString(a.i.sYP);
    }
    for (;;)
    {
      ap(paramContext, str);
      GMTrace.o(6244748230656L, 46527);
      return;
      if ("zh_TW".equals(str)) {
        str = paramContext.getString(a.i.sYS);
      } else if ("zh_HK".equals(str)) {
        str = paramContext.getString(a.i.sYR);
      } else {
        str = paramContext.getResources().getString(a.i.sYQ);
      }
    }
  }
  
  public static void e(Activity paramActivity, int paramInt)
  {
    GMTrace.i(6245956190208L, 46536);
    a(paramActivity, paramInt, -1);
    GMTrace.o(6245956190208L, 46536);
  }
  
  public static void f(Activity paramActivity, int paramInt)
  {
    GMTrace.i(6246224625664L, 46538);
    a(paramActivity, "create", paramActivity.getString(a.i.ths), 0, paramInt);
    GMTrace.o(6246224625664L, 46538);
  }
  
  public static int getNetworkType(Context paramContext)
  {
    GMTrace.i(16583808253952L, 123559);
    int i;
    if (am.isConnected(paramContext)) {
      if (am.isWifi(paramContext)) {
        i = 1;
      }
    }
    for (;;)
    {
      GMTrace.o(16583808253952L, 123559);
      return i;
      if (am.is2G(paramContext))
      {
        i = 2;
      }
      else if (am.is3G(paramContext))
      {
        i = 3;
      }
      else if (am.is4G(paramContext))
      {
        i = 4;
      }
      else
      {
        i = 0;
        continue;
        i = -1;
      }
    }
  }
  
  public static List<Bankcard> gy(boolean paramBoolean)
  {
    GMTrace.i(6243674488832L, 46519);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = com.tencent.mm.plugin.wallet_core.model.n.byx().iL(true);
    int i = 0;
    if (i < localArrayList2.size())
    {
      Bankcard localBankcard = (Bankcard)localArrayList2.get(i);
      if (paramBoolean) {
        localArrayList1.add(localBankcard);
      }
      for (;;)
      {
        i += 1;
        break;
        localArrayList1.add(localBankcard);
      }
    }
    w.i("MicroMsg.WalletOfflineUtil", "getBindBankCardList() list size is " + localArrayList1.size());
    GMTrace.o(6243674488832L, 46519);
    return localArrayList1;
  }
  
  public static void i(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(6247432585216L, 46547);
    nDe = paramString1;
    nDf = paramString2;
    nDh = paramString3;
    nDi = paramString4;
    Ej(nDh);
    com.tencent.mm.kernel.h.xx().fYr.a(new bf(new bf.a()
    {
      public final void a(com.tencent.mm.network.e paramAnonymouse)
      {
        GMTrace.i(6242063876096L, 46507);
        if ((paramAnonymouse == null) || (paramAnonymouse.DY() == null))
        {
          GMTrace.o(6242063876096L, 46507);
          return;
        }
        if (a.nDe != null) {
          paramAnonymouse.DY().g("offline_token", a.nDe.getBytes());
        }
        if (a.nDf != null) {
          paramAnonymouse.DY().g("offline_token_V2", a.nDf.getBytes());
        }
        if (a.nDi != null) {
          paramAnonymouse.DY().g("offline_key_list", a.nDi.getBytes());
        }
        GMTrace.o(6242063876096L, 46507);
      }
    }), 0);
    GMTrace.o(6247432585216L, 46547);
  }
  
  private static LinkedList<a> o(JSONArray paramJSONArray)
  {
    GMTrace.i(6248237891584L, 46553);
    if (paramJSONArray.length() == 0)
    {
      GMTrace.o(6248237891584L, 46553);
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    while (i < paramJSONArray.length())
    {
      JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
      if (localJSONObject != null)
      {
        a locala = new a();
        locala.nDs = localJSONObject.optInt("card_id");
        locala.nDt = localJSONObject.optString("bank_type");
        locala.nDu = localJSONObject.optString("bind_serial");
        locala.nDv = localJSONObject.optString("forbid_word");
        localLinkedList.add(locala);
      }
      i += 1;
    }
    GMTrace.o(6248237891584L, 46553);
    return localLinkedList;
  }
  
  private static LinkedList<b> p(JSONArray paramJSONArray)
  {
    GMTrace.i(6249445851136L, 46562);
    if (paramJSONArray.length() == 0)
    {
      GMTrace.o(6249445851136L, 46562);
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    while (i < paramJSONArray.length())
    {
      JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
      if (localJSONObject != null)
      {
        b localb = new b();
        localb.nDt = localJSONObject.optString("bank_type");
        localb.nDw = localJSONObject.optString("icon_url");
        localLinkedList.add(localb);
      }
      i += 1;
    }
    GMTrace.o(6249445851136L, 46562);
    return localLinkedList;
  }
  
  public static void sj(int paramInt)
  {
    GMTrace.i(6244077142016L, 46522);
    com.tencent.mm.plugin.offline.k.aVi();
    com.tencent.mm.plugin.offline.k.ai(196640, String.valueOf(paramInt));
    GMTrace.o(6244077142016L, 46522);
  }
  
  public static void sk(int paramInt)
  {
    GMTrace.i(6244211359744L, 46523);
    com.tencent.mm.plugin.offline.k.aVi();
    com.tencent.mm.plugin.offline.k.ai(196642, String.valueOf(paramInt));
    GMTrace.o(6244211359744L, 46523);
  }
  
  public static void sl(int paramInt)
  {
    GMTrace.i(6247029932032L, 46544);
    com.tencent.mm.plugin.offline.k.aVi();
    com.tencent.mm.plugin.offline.k.ai(196644, String.valueOf(paramInt));
    GMTrace.o(6247029932032L, 46544);
  }
  
  public static void sm(int paramInt)
  {
    GMTrace.i(16583271383040L, 123555);
    int i = paramInt;
    if (paramInt < 0) {
      i = 0;
    }
    com.tencent.mm.kernel.h.xy().xh().a(w.a.vyK, Integer.valueOf(i));
    GMTrace.o(16583271383040L, 123555);
  }
  
  public static boolean uE(String paramString)
  {
    GMTrace.i(6245016666112L, 46529);
    if (paramString == null)
    {
      GMTrace.o(6245016666112L, 46529);
      return false;
    }
    boolean bool = Pattern.compile("[0-9]*").matcher(paramString).matches();
    GMTrace.o(6245016666112L, 46529);
    return bool;
  }
  
  public static final class a
  {
    public int nDs;
    public String nDt;
    public String nDu;
    public String nDv;
    
    public a()
    {
      GMTrace.i(6242734964736L, 46512);
      GMTrace.o(6242734964736L, 46512);
    }
  }
  
  public static final class b
  {
    public String nDt;
    public String nDw;
    
    public b()
    {
      GMTrace.i(6240990134272L, 46499);
      GMTrace.o(6240990134272L, 46499);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\offline\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */