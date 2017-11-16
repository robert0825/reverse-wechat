package com.tencent.mm.plugin.wallet_core.model;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.wallet_core.ui.e.a;
import com.tencent.mm.wallet_core.ui.e.c;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class aa
{
  public static b a(JSONObject paramJSONObject, boolean paramBoolean)
  {
    int i = 0;
    GMTrace.i(6900804485120L, 51415);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.WalletQueryBankcardParser", "getBalanceFetchInfo(), json is null");
      GMTrace.o(6900804485120L, 51415);
      return null;
    }
    w.e("MicroMsg.WalletQueryBankcardParser", "getBalanceFetchInfo(), json is valid");
    b localb = new b();
    localb.rev = paramJSONObject.optString("fetch_charge_title");
    w.i("MicroMsg.WalletQueryBankcardParser", "fetch_charge_title:" + localb.rev);
    if (paramBoolean)
    {
      w.i("MicroMsg.WalletQueryBankcardParser", "isBindQuery true");
      localb.qUg = paramJSONObject.optInt("is_cal_charge", 0);
      localb.qUf = paramJSONObject.optInt("is_show_charge", 0);
      localb.qUh = paramJSONObject.optInt("is_full_fetch_direct", 0);
      localb.qUi = (paramJSONObject.optDouble("min_charge_fee", 0.0D) / 100.0D);
      localb.omp = (paramJSONObject.optDouble("remain_fee", 0.0D) / 100.0D);
      w.i("MicroMsg.WalletQueryBankcardParser", " is_cal_charge:" + localb.qUg + " is_show_charge:" + localb.qUf + " min_charge_fee:" + localb.qUi + " remain_fee:" + localb.omp + " is_full_fetch_direct:" + localb.qUh);
      paramJSONObject = paramJSONObject.optJSONArray("item");
      if ((paramJSONObject == null) || (paramJSONObject.length() <= 0)) {
        break label461;
      }
      localb.rew = new LinkedList();
      label255:
      if (i >= paramJSONObject.length()) {
        break label424;
      }
      JSONObject localJSONObject = paramJSONObject.optJSONObject(i);
      if (localJSONObject == null) {
        break label395;
      }
      b.a locala = new b.a();
      locala.amf = localJSONObject.optString("key");
      locala.value = localJSONObject.optString("value");
      w.i("MicroMsg.WalletQueryBankcardParser", "feeItem.key is " + locala.amf + " , feeItem.value is " + locala.value);
      if ((!TextUtils.isEmpty(locala.amf)) && (!TextUtils.isEmpty(locala.value))) {
        localb.rew.add(locala);
      }
    }
    for (;;)
    {
      i += 1;
      break label255;
      w.i("MicroMsg.WalletQueryBankcardParser", "isBindQuery false");
      break;
      label395:
      w.e("MicroMsg.WalletQueryBankcardParser", "item index " + i + " is empty");
    }
    label424:
    w.i("MicroMsg.WalletQueryBankcardParser", "itemsList size is " + localb.rew.size());
    for (;;)
    {
      GMTrace.o(6900804485120L, 51415);
      return localb;
      label461:
      w.e("MicroMsg.WalletQueryBankcardParser", "getBalanceFetchInfo(), itemJsonArray is null");
    }
  }
  
  public static void a(JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(6900670267392L, 51414);
    w.i("MicroMsg.WalletQueryBankcardParser", "parseQueryBankcard()");
    try
    {
      l = paramJSONObject.optLong("time_stamp");
      if (l <= 0L) {
        break label1279;
      }
      com.tencent.mm.wallet_core.c.n.setTimeStamp(String.valueOf(l));
    }
    catch (Exception paramJSONObject)
    {
      try
      {
        long l;
        Object localObject3 = ((JSONObject)localObject3).optJSONArray("bankinfo_array");
        if (localObject3 == null) {
          break label1459;
        }
        k = ((JSONArray)localObject3).length();
        i = 0;
        while (i < k)
        {
          localObject5 = new c();
          localJSONObject = ((JSONArray)localObject3).getJSONObject(i);
          ((c)localObject5).nDu = localJSONObject.optString("bind_serial");
          ((c)localObject5).rex = localJSONObject.optString("polling_forbid_word");
          localLinkedList.add(localObject5);
          i += 1;
        }
        w.w("MicroMsg.WalletQueryBankcardParser", "no time_stamp at WalletQueryBankcardParser.");
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.WalletQueryBankcardParser", localException, "", new Object[0]);
      }
      paramJSONObject = paramJSONObject;
      w.e("MicroMsg.WalletQueryBankcardParser", "parseQueryBankcard Exception :" + paramJSONObject.getMessage());
      w.printErrStackTrace("MicroMsg.WalletQueryBankcardParser", paramJSONObject, "", new Object[0]);
      GMTrace.o(6900670267392L, 51414);
      return;
    }
    Object localObject1 = paramJSONObject.getJSONObject("user_info");
    w.i("MicroMsg.WalletQueryBankcardParser", "getUserInfo()");
    ae localae = new ae();
    Object localObject2;
    label428:
    ArrayList localArrayList1;
    ArrayList localArrayList2;
    label554:
    label812:
    label854:
    label963:
    int j;
    if ((localObject1 != null) && (((JSONObject)localObject1).length() > 0))
    {
      localae.field_is_reg = ((JSONObject)localObject1).getInt("is_reg");
      localae.field_true_name = ((JSONObject)localObject1).optString("true_name");
      localae.field_cre_type = ((JSONObject)localObject1).optInt("cre_type", -1);
      localae.field_main_card_bind_serialno = ((JSONObject)localObject1).optString("last_card_bind_serialno");
      localae.field_cre_name = ((JSONObject)localObject1).optString("cre_name");
      localae.field_ftf_pay_url = ((JSONObject)localObject1).optString("transfer_url");
      localae.field_reset_passwd_flag = ((JSONObject)localObject1).optString("reset_passwd_flag");
      localae.field_find_passwd_url = ((JSONObject)localObject1).optString("reset_passwd_url");
      n.byx();
      af.Kk(localae.field_main_card_bind_serialno);
      localae.field_isDomesticUser = "2".equals(((JSONObject)localObject1).optString("icard_user_flag", "2"));
      localObject2 = ((JSONObject)localObject1).optJSONObject("touch_info");
      if (localObject2 != null)
      {
        localae.field_is_open_touch = ((JSONObject)localObject2).optInt("is_open_touch", 0);
        w.i("MicroMsg.WalletQueryBankcardParser", "getUserInfo field_is_open_touch() is " + localae.field_is_open_touch);
        localae.field_lct_wording = ((JSONObject)localObject1).optString("lct_wording");
        localae.field_lct_url = ((JSONObject)localObject1).optString("lct_url");
        w.i("MicroMsg.WalletQueryBankcardParser", "field_lct_wording: " + localae.field_lct_wording + ", field_lct_url:" + localae.field_lct_url);
        localae.field_lqt_state = ((JSONObject)localObject1).optInt("lqt_state", -1);
        w.i("MicroMsg.WalletQueryBankcardParser", "field_lqt_state: %s", new Object[] { Integer.valueOf(localae.field_lqt_state) });
        if ((paramInt != 0) && (paramInt != 3) && (paramInt != 4)) {
          break label2110;
        }
        h.xz();
        h.xy().xh().a(w.a.vzi, Integer.valueOf(localae.field_lqt_state));
        h.xz();
        h.xy().xh().a(w.a.vzj, localae.field_lct_wording);
        break label2110;
        localae.field_switchConfig = paramJSONObject.getJSONObject("switch_info").getInt("switch_bit");
        localae.field_paymenu_use_new = paramJSONObject.optInt("paymenu_use_new");
        w.i("MicroMsg.WalletQueryBankcardParser", "parseQueryBankcard, paymenu_use_new: %s", new Object[] { Integer.valueOf(localae.field_paymenu_use_new) });
        localObject1 = paramJSONObject.optString("support_bank_word");
        h.xz();
        h.xy().xh().a(w.a.vqH, bg.nl((String)localObject1));
        localArrayList1 = r(paramJSONObject.optJSONArray("Array"));
        localArrayList2 = s(paramJSONObject.optJSONArray("virtual_card_array"));
        localObject2 = paramJSONObject.optJSONObject("balance_info");
        if (localObject2 != null) {
          break label2118;
        }
        localObject1 = "";
        w.i("MicroMsg.WalletQueryBankcardParser", "Bankcard getBalance %s", new Object[] { localObject1 });
        if ((localObject2 == null) || (((JSONObject)localObject2).length() <= 0)) {
          break label1415;
        }
        localObject1 = new Bankcard((byte)0);
        l = ((JSONObject)localObject2).optLong("balance_version", -1L);
        localObject3 = new e.a()
        {
          public final void K(Map<String, Object> paramAnonymousMap)
          {
            GMTrace.i(6876913729536L, 51237);
            if (paramAnonymousMap != null)
            {
              long l1 = bg.a((Long)paramAnonymousMap.get("wallet_balance_version"), -1L);
              long l2 = bg.a((Long)paramAnonymousMap.get("wallet_balance_last_update_time"), -1L);
              if ((l2 < 0L) || (l1 < 0L) || (l2 + this.rjd > bg.Pw()) || (this.rje >= l1))
              {
                com.tencent.mm.wallet_core.ui.e.a(new e.c[] { new e.c("wallet_balance_version", Long.valueOf(this.rje)), new e.c("wallet_balance_last_update_time", Long.valueOf(bg.Pw())), new e.c("wallet_balance", Double.valueOf(this.rjb / 100.0D)) });
                this.rjf.reK = (this.rjb / 100.0D);
                GMTrace.o(6876913729536L, 51237);
                return;
              }
              w.w("MicroMsg.WalletQueryBankcardParser", "hy: new balance comes but last msg is not timeout and balance version is smaller than before");
            }
            GMTrace.o(6876913729536L, 51237);
          }
        };
        com.tencent.mm.wallet_core.ui.e.a(new String[] { "wallet_balance_version", "wallet_balance_last_update_time", "wallet_balance" }, (e.a)localObject3);
        ((Bankcard)localObject1).reK = (((JSONObject)localObject2).optInt("avail_balance") / 100.0D);
        ((Bankcard)localObject1).reL = ((JSONObject)localObject2).optString("balance_show_wording");
        ((Bankcard)localObject1).reO = ((JSONObject)localObject2).optString("max_fetch_wording");
        ((Bankcard)localObject1).reP = ((JSONObject)localObject2).optString("avail_fetch_wording");
        ((Bankcard)localObject1).reM = (((JSONObject)localObject2).optInt("fetch_balance") / 100.0D);
        ((Bankcard)localObject1).field_cardType |= Bankcard.reB;
        ((Bankcard)localObject1).field_bankcardType = ((JSONObject)localObject2).optString("balance_bank_type");
        ((Bankcard)localObject1).field_bindSerial = ((JSONObject)localObject2).optString("balance_bind_serial");
        ((Bankcard)localObject1).field_forbidWord = ((JSONObject)localObject2).optString("balance_forbid_word");
        if (bg.nm(((Bankcard)localObject1).field_forbidWord)) {
          break label1406;
        }
        ((Bankcard)localObject1).field_bankcardState = 8;
        ((Bankcard)localObject1).field_fetchArriveTime = ((JSONObject)localObject2).optLong("fetch_arrive_time");
        ((Bankcard)localObject1).field_mobile = ((JSONObject)localObject2).optString("mobile");
        if (((JSONObject)localObject2).optInt("support_micropay", 0) != 1) {
          break label2125;
        }
        bool = true;
        ((Bankcard)localObject1).field_support_micropay = bool;
        w.i("MicroMsg.WalletQueryBankcardParser", "getBalance() support_micropay:" + ((JSONObject)localObject2).optInt("support_micropay", 0));
        ((Bankcard)localObject1).reN = ((JSONObject)localObject2).optString("balance_list_url");
        localObject3 = ab.getContext().getString(a.i.sZe);
        ((Bankcard)localObject1).field_desc = ((String)localObject3);
        ((Bankcard)localObject1).field_bankName = ((String)localObject3);
        ((Bankcard)localObject1).field_bankcardTail = "10000";
        ((Bankcard)localObject1).field_forbid_title = ((JSONObject)localObject2).optString("forbid_title");
        ((Bankcard)localObject1).field_forbid_url = ((JSONObject)localObject2).optString("forbid_url");
        j = paramJSONObject.optInt("query_cache_time");
        w.i("MicroMsg.WalletQueryBankcardParser", "hy: cache time: %d", new Object[] { Integer.valueOf(j) });
        localObject2 = paramJSONObject.optJSONArray("history_card_array");
        if ((localObject2 == null) || (((JSONArray)localObject2).length() <= 0)) {
          break label1429;
        }
        localObject2 = d.byh().N(((JSONArray)localObject2).getJSONObject(0));
        ((Bankcard)localObject2).field_cardType |= Bankcard.reC;
      }
    }
    label1076:
    label1094:
    LinkedList localLinkedList;
    int i;
    JSONObject localJSONObject;
    for (;;)
    {
      localObject3 = paramJSONObject.optJSONArray("balance_notice");
      localObject5 = paramJSONObject.optJSONArray("fetch_notice");
      if (localObject3 == null) {
        break label2131;
      }
      localObject3 = bg.aq(((JSONArray)localObject3).toString(), "");
      if (localObject5 == null) {
        break label2139;
      }
      localObject5 = bg.aq(((JSONArray)localObject5).toString(), "");
      w.i("MicroMsg.WalletQueryBankcardParser", "hy: balance notice: %s, fetchNotice: %s", new Object[] { localObject3, localObject5 });
      h.xz();
      h.xy().xh().a(w.a.vqF, localObject3);
      h.xz();
      h.xy().xh().a(w.a.vqG, localObject5);
      h.xz();
      h.xy().xh().kL(true);
      localObject3 = paramJSONObject.optJSONObject("bank_priority");
      localLinkedList = new LinkedList();
      if (localObject3 == null) {
        break label1459;
      }
      int k;
      label1279:
      w.e("MicroMsg.WalletQueryBankcardParser", "touch_info is null ");
      if (!n.byx().byU()) {
        break label2113;
      }
      i = 1;
      label1357:
      localae.field_is_open_touch = i;
      w.e("MicroMsg.WalletQueryBankcardParser", "old field_is_open_touch is " + localae.field_is_open_touch);
      break;
      w.e("MicroMsg.WalletQueryBankcardParser", "getUserInfo() json == null or json.length() == 0");
      localae = null;
      break label428;
      label1406:
      ((Bankcard)localObject1).field_bankcardState = 0;
      break label812;
      label1415:
      w.i("MicroMsg.WalletQueryBankcardParser", "getBalance() json == null or json.length() == 0");
      localObject1 = null;
      break label963;
      label1429:
      w.e("MicroMsg.WalletQueryBankcardParser", "getHistroyBankcard() json == null or json.length() == 0");
      localObject2 = null;
    }
    label1459:
    paramJSONObject.optString("query_order_time");
    Object localObject5 = paramJSONObject.optJSONObject("loan_entry_info");
    Object localObject4;
    if (localObject5 == null)
    {
      w.e("MicroMsg.WalletQueryBankcardParser", "getLoanEntryInfo json is null");
      localObject4 = null;
      localJSONObject = paramJSONObject.optJSONObject("fetch_info");
      localObject5 = n.byx().rjw;
      w.d("MicroMsg.WalletQueryBankcardParser", "fetchInfo: %s", new Object[] { localObject5 });
      if (localJSONObject == null) {
        break label1822;
      }
      localObject5 = a(localJSONObject, true);
    }
    for (;;)
    {
      localJSONObject = paramJSONObject.optJSONObject("lqt_info");
      if (localJSONObject != null) {
        break label1833;
      }
      w.e("MicroMsg.WalletQueryBankcardParser", "getLqtInfo, json object is null!");
      paramJSONObject = null;
      label1563:
      n.byx().a(localae, localArrayList1, localArrayList2, (Bankcard)localObject1, (Bankcard)localObject2, (j)localObject4, (b)localObject5, paramJSONObject, j, paramInt, localLinkedList);
      GMTrace.o(6900670267392L, 51414);
      return;
      w.i("MicroMsg.WalletQueryBankcardParser", "getLoanEntryInfo()");
      localObject4 = new j();
      ((j)localObject4).field_title = ((JSONObject)localObject5).optString("title");
      ((j)localObject4).field_loan_jump_url = ((JSONObject)localObject5).optString("loan_jump_url");
      w.i("MicroMsg.WalletQueryBankcardParser", "getLoanEntryInfo() field_loan_jump_url:" + ((j)localObject4).field_loan_jump_url);
      ((j)localObject4).field_is_show_entry = ((JSONObject)localObject5).optInt("is_show_entry", 0);
      ((j)localObject4).field_tips = ((JSONObject)localObject5).optString("tips");
      ((j)localObject4).field_is_overdue = ((JSONObject)localObject5).optInt("is_overdue", 0);
      if (((JSONObject)localObject5).has("available_otb")) {
        ((j)localObject4).field_available_otb = com.tencent.mm.wallet_core.ui.e.d(((JSONObject)localObject5).optDouble("available_otb") / 100.0D, "CNY");
      }
      if (((JSONObject)localObject5).has("index")) {
        ((j)localObject4).field_red_dot_index = ((JSONObject)localObject5).optInt("index");
      }
      w.i("MicroMsg.WalletQueryBankcardParser", "getLoanEntryInfo() field_index:" + ((j)localObject4).field_red_dot_index + "  field_is_overdue:" + ((j)localObject4).field_is_overdue + "  field_is_show_entry:" + ((j)localObject4).field_is_show_entry);
      break;
      label1822:
      w.e("MicroMsg.WalletQueryBankcardParser", "parseQueryBankcard() fetch_info is null");
    }
    label1833:
    w.i("MicroMsg.WalletQueryBankcardParser", "now get getLqtInfo: %s", new Object[] { localJSONObject.toString() });
    paramJSONObject = new Bankcard((byte)0);
    paramJSONObject.field_bankcardType = localJSONObject.optString("lqt_bank_type");
    paramJSONObject.field_bindSerial = localJSONObject.optString("lqt_bind_serial");
    paramJSONObject.field_bankName = localJSONObject.optString("lqt_bank_name");
    paramJSONObject.reK = (localJSONObject.optLong("total_balance") / 100.0D);
    paramJSONObject.reM = (localJSONObject.optLong("avail_balance") / 100.0D);
    paramJSONObject.reS = new e();
    paramJSONObject.reS.nvc = localJSONObject.optString("lqt_logo_url");
    paramJSONObject.field_forbidWord = localJSONObject.optString("lqt_forbid_word");
    paramJSONObject.field_forbid_title = localJSONObject.optString("forbid_title");
    paramJSONObject.field_forbid_url = localJSONObject.optString("forbid_url");
    paramJSONObject.reL = localJSONObject.optString("lqt_show_wording");
    paramJSONObject.field_mobile = localJSONObject.optString("mobile");
    if (localJSONObject.optInt("support_micropay", 0) == 1) {}
    for (boolean bool = true;; bool = false)
    {
      paramJSONObject.field_support_micropay = bool;
      paramJSONObject.field_cardType |= Bankcard.reE;
      if (bg.nm(paramJSONObject.field_bankName)) {
        paramJSONObject.field_bankName = ab.getContext().getString(a.i.tcM);
      }
      paramJSONObject.field_desc = paramJSONObject.field_bankName;
      if (!bg.nm(paramJSONObject.field_forbidWord))
      {
        paramJSONObject.field_bankcardState = 8;
        break label1563;
      }
      paramJSONObject.field_bankcardState = 0;
      break label1563;
      label2110:
      break;
      label2113:
      i = 0;
      break label1357;
      label2118:
      localObject1 = localObject2;
      break label554;
      label2125:
      bool = false;
      break label854;
      label2131:
      localObject4 = "";
      break label1076;
      label2139:
      localObject5 = "";
      break label1094;
    }
  }
  
  private static ArrayList<Bankcard> r(JSONArray paramJSONArray)
  {
    GMTrace.i(6900938702848L, 51416);
    w.i("MicroMsg.WalletQueryBankcardParser", "getBankcards()");
    ArrayList localArrayList = new ArrayList();
    if ((paramJSONArray != null) && (paramJSONArray.length() > 0))
    {
      int j = paramJSONArray.length();
      int i = 0;
      if (i < j)
      {
        Object localObject = paramJSONArray.getJSONObject(i);
        localObject = d.byh().N((JSONObject)localObject);
        if (localObject != null)
        {
          if (!((Bankcard)localObject).byd()) {
            break label102;
          }
          ((Bankcard)localObject).field_desc = ((Bankcard)localObject).field_bankName;
        }
        for (;;)
        {
          localArrayList.add(localObject);
          i += 1;
          break;
          label102:
          if (((Bankcard)localObject).byf()) {
            ((Bankcard)localObject).field_desc = ab.getContext().getString(a.i.tbh, new Object[] { ((Bankcard)localObject).field_bankName, ((Bankcard)localObject).field_bankcardTail });
          } else if (((Bankcard)localObject).byc()) {
            ((Bankcard)localObject).field_desc = ab.getContext().getString(a.i.thF, new Object[] { ((Bankcard)localObject).field_bankName, ((Bankcard)localObject).field_bankcardTail });
          } else {
            ((Bankcard)localObject).field_desc = ab.getContext().getString(a.i.tbw, new Object[] { ((Bankcard)localObject).field_bankName, ((Bankcard)localObject).field_bankcardTail });
          }
        }
      }
    }
    GMTrace.o(6900938702848L, 51416);
    return localArrayList;
  }
  
  private static ArrayList<Bankcard> s(JSONArray paramJSONArray)
  {
    GMTrace.i(6901072920576L, 51417);
    ArrayList localArrayList = new ArrayList();
    if ((paramJSONArray != null) && (paramJSONArray.length() > 0))
    {
      int j = paramJSONArray.length();
      int i = 0;
      if (i < j)
      {
        JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
        Bankcard localBankcard = new Bankcard();
        localBankcard.field_cardType |= Bankcard.reA;
        localBankcard.field_bankName = localJSONObject.getString("bank_name");
        localBankcard.field_bankcardType = localJSONObject.getString("bank_type");
        localBankcard.field_bankcardTypeName = localJSONObject.optString("bankacc_type_name");
        localBankcard.reG = localJSONObject.getString("card_id");
        localBankcard.field_bizUsername = localJSONObject.getString("app_username");
        localBankcard.field_wxcreditState = localJSONObject.getInt("card_status");
        if (localBankcard.field_wxcreditState != 2) {}
        for (localBankcard.field_bankcardState = 9;; localBankcard.field_bankcardState = 0)
        {
          localBankcard.field_desc = ab.getContext().getString(a.i.thF, new Object[] { localBankcard.field_bankName, localBankcard.field_bankcardTail });
          localBankcard.reS = new e();
          localBankcard.reS.nvc = localJSONObject.getString("logo_url");
          localBankcard.reS.reU = localJSONObject.getString("background_logo_url");
          localBankcard.reS.reV = localJSONObject.getString("big_logo_url");
          localArrayList.add(localBankcard);
          i += 1;
          break;
        }
      }
    }
    GMTrace.o(6901072920576L, 51417);
    return localArrayList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */