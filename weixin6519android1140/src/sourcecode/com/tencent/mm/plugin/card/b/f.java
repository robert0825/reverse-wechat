package com.tencent.mm.plugin.card.b;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.protocal.c.agi;
import com.tencent.mm.protocal.c.au;
import com.tencent.mm.protocal.c.bdu;
import com.tencent.mm.protocal.c.bik;
import com.tencent.mm.protocal.c.bmp;
import com.tencent.mm.protocal.c.jm;
import com.tencent.mm.protocal.c.jo;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.protocal.c.jz;
import com.tencent.mm.protocal.c.np;
import com.tencent.mm.protocal.c.pu;
import com.tencent.mm.protocal.c.pv;
import com.tencent.mm.protocal.c.ql;
import com.tencent.mm.protocal.c.ul;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
{
  public static void a(CardInfo paramCardInfo, String paramString)
  {
    GMTrace.i(5048465620992L, 37614);
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.CardInfoParser", "parserCardItemJson jsonContent is null");
      GMTrace.o(5048465620992L, 37614);
      return;
    }
    try
    {
      a(paramCardInfo, new JSONObject(paramString));
      GMTrace.o(5048465620992L, 37614);
      return;
    }
    catch (JSONException paramCardInfo)
    {
      w.printErrStackTrace("MicroMsg.CardInfoParser", paramCardInfo, "", new Object[0]);
      GMTrace.o(5048465620992L, 37614);
    }
  }
  
  private static void a(CardInfo paramCardInfo, JSONObject paramJSONObject)
  {
    GMTrace.i(5048599838720L, 37615);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.CardInfoParser", "parserCardItemJson json is null");
      GMTrace.o(5048599838720L, 37615);
      return;
    }
    paramCardInfo.field_card_id = ux(paramJSONObject.optString("card_id"));
    paramCardInfo.field_card_tp_id = ux(paramJSONObject.optString("card_tp_id"));
    paramCardInfo.field_delete_state_flag = paramJSONObject.optInt("state_flag");
    paramCardInfo.field_updateTime = paramJSONObject.optInt("update_time");
    paramCardInfo.field_updateSeq = paramJSONObject.optLong("sequence");
    paramCardInfo.field_from_username = paramJSONObject.optString("from_username");
    paramCardInfo.field_begin_time = paramJSONObject.optLong("begin_time", 0L);
    paramCardInfo.field_end_time = paramJSONObject.optLong("end_time", 0L);
    paramCardInfo.jxK = paramJSONObject.optString("encrypt_code");
    JSONObject localJSONObject2 = paramJSONObject.optJSONObject("card_data_info");
    JSONObject localJSONObject1 = paramJSONObject.optJSONObject("card_tp_info");
    paramJSONObject = paramJSONObject.optJSONObject("share_info");
    paramCardInfo.jyM = r(localJSONObject2);
    paramCardInfo.jyL = s(localJSONObject1);
    paramCardInfo.jyN = t(paramJSONObject);
    if (paramCardInfo.jyL != null)
    {
      paramJSONObject = paramCardInfo.jyL;
      paramCardInfo.jyL = paramJSONObject;
    }
    try
    {
      paramCardInfo.field_cardTpInfoData = paramJSONObject.toByteArray();
      paramCardInfo.field_block_mask = Integer.toString(paramCardInfo.jyL.tZP);
      paramCardInfo.field_card_type = paramCardInfo.jyL.jxG;
      if (TextUtils.isEmpty(paramCardInfo.field_card_tp_id)) {
        paramCardInfo.field_card_tp_id = paramCardInfo.jyL.jxF;
      }
      if ((paramCardInfo.field_begin_time == 0L) && (localJSONObject1 != null)) {
        paramCardInfo.field_begin_time = localJSONObject1.optLong("begin_time");
      }
      if ((paramCardInfo.field_end_time == 0L) && (localJSONObject1 != null)) {
        paramCardInfo.field_end_time = localJSONObject1.optLong("end_time");
      }
      if (paramCardInfo.jyL.uan != null) {
        paramCardInfo.field_is_dynamic = paramCardInfo.jyL.uan.ugq;
      }
      if (paramCardInfo.jyM != null)
      {
        paramCardInfo.a(paramCardInfo.jyM);
        paramCardInfo.field_status = paramCardInfo.jyM.status;
      }
      if (paramCardInfo.jyN != null)
      {
        paramJSONObject = paramCardInfo.jyN;
        paramCardInfo.jyN = paramJSONObject;
      }
    }
    catch (Exception paramJSONObject)
    {
      try
      {
        paramCardInfo.field_shareInfoData = paramJSONObject.toByteArray();
        paramCardInfo.field_local_updateTime = ((int)(System.currentTimeMillis() / 1000L));
        GMTrace.o(5048599838720L, 37615);
        return;
        paramJSONObject = paramJSONObject;
        w.e("MicroMsg.CardInfo", "setCardTpInfo fail, ex = %s", new Object[] { paramJSONObject.getMessage() });
      }
      catch (Exception paramJSONObject)
      {
        for (;;)
        {
          w.e("MicroMsg.CardInfo", "setShareInfo fail, ex = %s", new Object[] { paramJSONObject.getMessage() });
          w.printErrStackTrace("MicroMsg.CardInfo", paramJSONObject, "", new Object[0]);
        }
      }
    }
  }
  
  public static void a(ShareCardInfo paramShareCardInfo, String paramString)
  {
    GMTrace.i(5048062967808L, 37611);
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.CardInfoParser", "parserShareCardItemJson jsonContent is null");
      GMTrace.o(5048062967808L, 37611);
      return;
    }
    try
    {
      a(paramShareCardInfo, new JSONObject(paramString).optJSONObject("share_card"));
      GMTrace.o(5048062967808L, 37611);
      return;
    }
    catch (JSONException paramShareCardInfo)
    {
      w.printErrStackTrace("MicroMsg.CardInfoParser", paramShareCardInfo, "", new Object[0]);
      w.e("MicroMsg.CardInfoParser", paramShareCardInfo.getMessage());
      GMTrace.o(5048062967808L, 37611);
    }
  }
  
  public static void a(ShareCardInfo paramShareCardInfo, JSONObject paramJSONObject)
  {
    GMTrace.i(5048197185536L, 37612);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.CardInfoParser", "parserShareCardItemJson json is null");
      GMTrace.o(5048197185536L, 37612);
      return;
    }
    paramShareCardInfo.field_card_id = ux(paramJSONObject.optString("card_id"));
    paramShareCardInfo.field_card_tp_id = ux(paramJSONObject.optString("card_tp_id"));
    paramShareCardInfo.field_app_id = paramJSONObject.optString("app_id");
    paramShareCardInfo.field_consumer = paramJSONObject.optString("consumer");
    paramShareCardInfo.field_share_time = paramJSONObject.optInt("share_time");
    paramShareCardInfo.field_updateTime = paramJSONObject.optInt("update_time");
    paramShareCardInfo.field_status = paramJSONObject.optInt("state_flag");
    paramShareCardInfo.field_updateSeq = paramJSONObject.optLong("sequence");
    paramShareCardInfo.field_from_username = paramJSONObject.optString("from_user_name");
    paramShareCardInfo.field_begin_time = paramJSONObject.optLong("begin_time");
    paramShareCardInfo.field_end_time = paramJSONObject.optInt("end_time");
    JSONObject localJSONObject2 = paramJSONObject.optJSONObject("card_data_info");
    JSONObject localJSONObject1 = paramJSONObject.optJSONObject("card_tp_info");
    paramJSONObject = paramJSONObject.optJSONObject("share_info");
    paramShareCardInfo.jyM = r(localJSONObject2);
    paramShareCardInfo.jyL = s(localJSONObject1);
    paramShareCardInfo.jyN = t(paramJSONObject);
    if (paramShareCardInfo.jyM != null) {
      paramShareCardInfo.a(paramShareCardInfo.jyM);
    }
    if (paramShareCardInfo.jyL != null)
    {
      paramJSONObject = paramShareCardInfo.jyL;
      paramShareCardInfo.jyL = paramJSONObject;
    }
    try
    {
      paramShareCardInfo.field_cardTpInfoData = paramJSONObject.toByteArray();
      paramShareCardInfo.field_end_time = localJSONObject1.optInt("end_time");
      paramShareCardInfo.field_begin_time = localJSONObject1.optInt("begin_time");
      if (paramShareCardInfo.jyN != null)
      {
        paramJSONObject = paramShareCardInfo.jyN;
        paramShareCardInfo.jyN = paramJSONObject;
      }
    }
    catch (Exception paramJSONObject)
    {
      try
      {
        paramShareCardInfo.field_shareInfoData = paramJSONObject.toByteArray();
        paramShareCardInfo.field_local_updateTime = ((int)(System.currentTimeMillis() / 1000L));
        GMTrace.o(5048197185536L, 37612);
        return;
        paramJSONObject = paramJSONObject;
        w.e("MicroMsg.ShareCardInfo", "setCardTpInfo fail, ex = %s", new Object[] { paramJSONObject.getMessage() });
      }
      catch (Exception paramJSONObject)
      {
        for (;;)
        {
          w.e("MicroMsg.ShareCardInfo", "setShareInfo fail, ex = %s", new Object[] { paramJSONObject.getMessage() });
          w.printErrStackTrace("MicroMsg.ShareCardInfo", paramJSONObject, "", new Object[0]);
        }
      }
    }
  }
  
  private static LinkedList<jz> k(JSONArray paramJSONArray)
  {
    GMTrace.i(5049002491904L, 37618);
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0))
    {
      GMTrace.o(5049002491904L, 37618);
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    while (i < paramJSONArray.length())
    {
      JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
      jz localjz = new jz();
      localjz.title = localJSONObject.optString("title");
      localjz.jxI = localJSONObject.optString("sub_title");
      localjz.jBl = localJSONObject.optString("tips");
      localjz.url = localJSONObject.optString("url");
      localjz.uaJ = localJSONObject.optLong("show_flag");
      localjz.uaK = localJSONObject.optString("primary_color");
      localjz.uaL = localJSONObject.optString("secondary_color");
      localjz.nDw = localJSONObject.optString("icon_url");
      localjz.tZx = localJSONObject.optString("app_brand_user_name");
      localjz.tZy = localJSONObject.optString("app_brand_pass");
      localLinkedList.add(localjz);
      i += 1;
    }
    GMTrace.o(5049002491904L, 37618);
    return localLinkedList;
  }
  
  private static LinkedList<np> l(JSONArray paramJSONArray)
  {
    GMTrace.i(5049270927360L, 37620);
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0))
    {
      GMTrace.o(5049270927360L, 37620);
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    while (i < paramJSONArray.length())
    {
      np localnp = u(paramJSONArray.getJSONObject(i));
      if (localnp != null) {
        localLinkedList.add(localnp);
      }
      i += 1;
    }
    GMTrace.o(5049270927360L, 37620);
    return localLinkedList;
  }
  
  private static LinkedList<au> m(JSONArray paramJSONArray)
  {
    GMTrace.i(5049539362816L, 37622);
    LinkedList localLinkedList = new LinkedList();
    if (paramJSONArray != null)
    {
      int i = 0;
      for (;;)
      {
        if (i < paramJSONArray.length()) {
          try
          {
            au localau = new au();
            JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
            localau.text = localJSONObject.optString("text");
            localau.url = localJSONObject.optString("url");
            localLinkedList.add(localau);
            i += 1;
          }
          catch (JSONException localJSONException)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.CardInfoParser", localJSONException, "", new Object[0]);
            }
          }
        }
      }
    }
    GMTrace.o(5049539362816L, 37622);
    return localLinkedList;
  }
  
  private static jm r(JSONObject paramJSONObject)
  {
    Object localObject2 = null;
    GMTrace.i(5048868274176L, 37617);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.CardInfoParser", "parserCardDataInfo json is null");
      GMTrace.o(5048868274176L, 37617);
      return null;
    }
    jm localjm = new jm();
    for (;;)
    {
      try
      {
        localjm.status = paramJSONObject.optInt("status");
        localjm.tYY = paramJSONObject.optInt("init_balance");
        localjm.tYZ = paramJSONObject.optInt("init_bonus");
        localObject1 = paramJSONObject.optJSONArray("cell_list0");
        if (localObject1 != null) {
          localjm.tZa = k((JSONArray)localObject1);
        }
        localObject1 = paramJSONObject.optJSONArray("cell_list1");
        if (localObject1 != null) {
          localjm.tZb = k((JSONArray)localObject1);
        }
        localObject1 = paramJSONObject.optJSONArray("cell_list2");
        if (localObject1 != null) {
          localjm.tZc = k((JSONArray)localObject1);
        }
        localJSONArray = paramJSONObject.optJSONArray("acceptors");
        if (localJSONArray != null)
        {
          localObject1 = localObject2;
          if (localJSONArray != null)
          {
            if (localJSONArray.length() != 0) {
              continue;
            }
            localObject1 = localObject2;
          }
          localjm.tZd = ((LinkedList)localObject1);
        }
        localjm.tZe = paramJSONObject.optInt("avail_num");
        localjm.tZf = paramJSONObject.optInt("code_type");
        localjm.code = paramJSONObject.optString("code");
        localObject1 = paramJSONObject.optJSONArray("secondary_fields");
        if (localObject1 != null) {
          localjm.tZg = l((JSONArray)localObject1);
        }
        localjm.tZh = paramJSONObject.optLong("stock_num");
        localjm.tZi = paramJSONObject.optInt("limit_num");
        localjm.tZj = paramJSONObject.optString("user_report_url");
        localObject1 = paramJSONObject.optJSONObject("third_field");
        if (localObject1 != null) {
          localjm.tZk = u((JSONObject)localObject1);
        }
        localjm.tZl = m(paramJSONObject.optJSONArray("action_sheets"));
        localObject1 = paramJSONObject.optJSONObject("card_list_field");
        if (localObject1 != null) {
          localjm.tZm = u((JSONObject)localObject1);
        }
        localObject1 = paramJSONObject.optJSONObject("operate_field");
        if (localObject1 != null) {
          localjm.tZn = u((JSONObject)localObject1);
        }
        localObject1 = paramJSONObject.optJSONObject("limit_field");
        if (localObject1 != null) {
          localjm.tZo = u((JSONObject)localObject1);
        }
        localObject1 = paramJSONObject.optJSONObject("detail_table");
        if (localObject1 != null) {
          localjm.tZp = x((JSONObject)localObject1);
        }
        localjm.tZq = paramJSONObject.optString("background_pic_url");
        localObject1 = paramJSONObject.optJSONObject("gifting_info_cell");
        if (localObject1 != null) {
          localjm.tZr = u((JSONObject)localObject1);
        }
        localjm.tZs = paramJSONObject.optString("sign_number");
        localObject1 = paramJSONObject.optJSONObject("unavailable_qrcode_field");
        if (localObject1 != null) {
          localjm.tZt = u((JSONObject)localObject1);
        }
        localjm.tZu = paramJSONObject.optBoolean("is_commom_card");
      }
      catch (JSONException paramJSONObject)
      {
        Object localObject1;
        JSONArray localJSONArray;
        int i;
        w.printErrStackTrace("MicroMsg.CardInfoParser", paramJSONObject, "", new Object[0]);
        continue;
      }
      GMTrace.o(5048868274176L, 37617);
      return localjm;
      localObject1 = new LinkedList();
      i = 0;
      if (i < localJSONArray.length())
      {
        ((LinkedList)localObject1).add((String)localJSONArray.get(i));
        i += 1;
      }
    }
  }
  
  public static ju s(JSONObject paramJSONObject)
  {
    Object localObject2 = null;
    GMTrace.i(5049136709632L, 37619);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.CardInfoParser", "parserCardTpInfo json is null");
      GMTrace.o(5049136709632L, 37619);
      return null;
    }
    ju localju = new ju();
    Object localObject1;
    Object localObject3;
    for (;;)
    {
      try
      {
        localju.jxF = paramJSONObject.optString("card_tp_id");
        localju.jxH = paramJSONObject.optString("logo_url");
        localju.eSd = paramJSONObject.optString("appid");
        localju.tZF = paramJSONObject.optString("app_username");
        localju.tZG = paramJSONObject.optInt("card_category");
        localju.jxG = paramJSONObject.optInt("card_type");
        localju.jyT = paramJSONObject.optString("brand_name");
        localju.title = paramJSONObject.optString("title");
        localju.jxI = paramJSONObject.optString("sub_title");
        localju.gjg = paramJSONObject.optString("color");
        localju.jWE = paramJSONObject.optString("notice");
        localju.tZH = paramJSONObject.optString("service_phone");
        localju.tZK = paramJSONObject.optString("image_text_url");
        localju.tZL = paramJSONObject.optString("source_icon");
        localju.aEe = paramJSONObject.optString("source");
        localObject1 = paramJSONObject.optJSONArray("primary_fields");
        if (localObject1 != null) {
          localju.tZI = l((JSONArray)localObject1);
        }
        localObject1 = paramJSONObject.optJSONArray("introduce_fields");
        if (localObject1 != null) {
          localju.tZJ = l((JSONArray)localObject1);
        }
        localju.tZM = paramJSONObject.optInt("shop_count");
        localju.tZN = paramJSONObject.optString("limit_wording");
        localju.jyS = paramJSONObject.optString("card_type_name");
        localju.tZO = paramJSONObject.optString("h5_show_url");
        localju.tZP = paramJSONObject.optInt("block_mask");
        localju.tZQ = paramJSONObject.optString("middle_icon");
        localju.tZR = paramJSONObject.optString("accept_wording");
        localju.tZS = paramJSONObject.optLong("control_flag");
        localju.tZT = paramJSONObject.optString("advertise_wording");
        localju.tZU = paramJSONObject.optString("advertise_url");
        localju.tZV = paramJSONObject.optString("public_service_name");
        localObject3 = paramJSONObject.optJSONObject("announcement");
        if (localObject3 != null) {
          continue;
        }
        w.e("MicroMsg.CardInfoParser", "parserannoucement json is null");
        localObject1 = null;
        localju.tZW = ((jo)localObject1);
        localju.tZX = paramJSONObject.optString("public_service_tip");
        localju.tZY = paramJSONObject.optString("primary_sub_title");
        localju.tZZ = paramJSONObject.optInt("gen_type");
        localju.uaa = v(paramJSONObject.optJSONObject("detail_struct"));
        localObject3 = paramJSONObject.optJSONObject("use_condition");
        if (localObject3 != null) {
          continue;
        }
        w.e("MicroMsg.CardInfoParser", "parserUseCondition json is null");
        localObject1 = null;
        localju.uab = ((bmp)localObject1);
        localObject3 = paramJSONObject.optJSONObject("follow_box");
        if (localObject3 != null) {
          break label1109;
        }
        w.e("MicroMsg.CardInfoParser", "parserFollowBox json is null");
        localObject1 = null;
        label531:
        localju.uac = ((ul)localObject1);
        localObject3 = paramJSONObject.optJSONObject("guidance");
        if (localObject3 != null) {
          break label1182;
        }
        w.e("MicroMsg.CardInfoParser", "parserActionSheet json is null");
        localObject1 = null;
        label561:
        localju.uad = ((au)localObject1);
        localju.uae = paramJSONObject.optInt("need_direct_jump", 0);
        localju.uaf = paramJSONObject.optInt("is_acceptable", 0);
        localju.uag = paramJSONObject.optString("unacceptable_wording");
        localju.uah = paramJSONObject.optInt("has_hongbao", 0);
        localju.uai = paramJSONObject.optString("accept_ui_title");
        localju.uaj = paramJSONObject.optInt("show_accept_view", 0);
        localObject1 = paramJSONObject.optJSONObject("brand_field");
        if (localObject1 != null) {
          localju.uak = u((JSONObject)localObject1);
        }
        localju.ual = paramJSONObject.optString("shop_name");
        localObject1 = paramJSONObject.optJSONObject("pay_and_qrcode_field");
        if (localObject1 != null) {
          localju.uam = u((JSONObject)localObject1);
        }
        localObject3 = paramJSONObject.optJSONObject("dynamic_qr_code_info");
        if (localObject3 != null)
        {
          if (localObject3 != null) {
            break label1217;
          }
          w.e("MicroMsg.CardInfoParser", "parserDynamicQrCodeInfo json is null");
          localObject1 = localObject2;
          label726:
          localju.uan = ((ql)localObject1);
        }
        localju.uao = paramJSONObject.optBoolean("is_card_code_exposed");
        localju.uap = paramJSONObject.optInt("qrcode_correct_level");
        localju.uaq = paramJSONObject.optBoolean("dismiss_qrcode_icon_on_card");
      }
      catch (JSONException paramJSONObject)
      {
        w.printErrStackTrace("MicroMsg.CardInfoParser", paramJSONObject, "", new Object[0]);
        continue;
        localObject1 = new bmp();
        ((bmp)localObject1).title = ((JSONObject)localObject3).optString("title");
        localJSONArray = ((JSONObject)localObject3).optJSONArray("outer_tag_list");
        if (localJSONArray == null) {
          break label973;
        }
      }
      GMTrace.o(5049136709632L, 37619);
      return localju;
      localObject1 = new jo();
      ((jo)localObject1).type = ((JSONObject)localObject3).optInt("type");
      ((jo)localObject1).text = ((JSONObject)localObject3).optString("text");
      ((jo)localObject1).url = ((JSONObject)localObject3).optString("url");
      ((jo)localObject1).oNd = ((JSONObject)localObject3).optInt("endtime");
      ((jo)localObject1).bsx = ((JSONObject)localObject3).optInt("create_time");
      ((jo)localObject1).tZv = ((JSONObject)localObject3).optString("thumb_url");
    }
    int i;
    label935:
    bik localbik;
    if (localJSONArray.length() > 0)
    {
      ((bmp)localObject1).uWz = new LinkedList();
      i = 0;
      if (i < localJSONArray.length())
      {
        localbik = w(localJSONArray.optJSONObject(i));
        if (localbik == null) {
          break label1315;
        }
        ((bmp)localObject1).uWz.add(localbik);
        break label1315;
      }
    }
    else
    {
      label973:
      w.e("MicroMsg.CardInfoParser", "parserUseCondition outer_tag_list is null");
    }
    JSONArray localJSONArray = ((JSONObject)localObject3).optJSONArray("inner_tag_list");
    if ((localJSONArray != null) && (localJSONArray.length() > 0))
    {
      ((bmp)localObject1).uWA = new LinkedList();
      i = 0;
    }
    for (;;)
    {
      if (i < localJSONArray.length())
      {
        localbik = w(localJSONArray.optJSONObject(i));
        if (localbik != null)
        {
          ((bmp)localObject1).uWA.add(localbik);
          break label1322;
          w.e("MicroMsg.CardInfoParser", "parserUseCondition inner_tag_list is null");
        }
      }
      else
      {
        localObject3 = ((JSONObject)localObject3).optJSONArray("detail_field");
        if ((localObject3 != null) && (((JSONArray)localObject3).length() > 0))
        {
          ((bmp)localObject1).uWB = l((JSONArray)localObject3);
          break;
        }
        w.e("MicroMsg.CardInfoParser", "parserUseCondition detail_field is null");
        break;
        label1109:
        localObject1 = new ul();
        ((ul)localObject1).text = ((JSONObject)localObject3).optString("text");
        ((ul)localObject1).umN = ((JSONObject)localObject3).optInt("follow");
        w.i("MicroMsg.CardInfoParser", "follow:" + ((ul)localObject1).umN + "　text:" + ((ul)localObject1).text);
        break label531;
        label1182:
        localObject1 = new au();
        ((au)localObject1).text = ((JSONObject)localObject3).optString("text");
        ((au)localObject1).url = ((JSONObject)localObject3).optString("url");
        break label561;
        label1217:
        localObject1 = new ql();
        ((ql)localObject1).ugq = ((JSONObject)localObject3).optBoolean("is_dynamic");
        ((ql)localObject1).ugr = ((JSONObject)localObject3).optBoolean("can_refresh");
        ((ql)localObject1).ugs = ((JSONObject)localObject3).optString("refresh_wording");
        w.i("MicroMsg.CardInfoParser", "is_dynamic:" + ((ql)localObject1).ugq + "　can_refresh:" + ((ql)localObject1).ugr + "　refresh_wording:" + ((ql)localObject1).ugs);
        break label726;
        label1315:
        i += 1;
        break label935;
      }
      label1322:
      i += 1;
    }
  }
  
  private static bdu t(JSONObject paramJSONObject)
  {
    GMTrace.i(5049405145088L, 37621);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.CardInfoParser", "parserShareInfo json is null");
      GMTrace.o(5049405145088L, 37621);
      return null;
    }
    bdu localbdu = new bdu();
    localbdu.uPK = paramJSONObject.optString("gift_msg_title");
    GMTrace.o(5049405145088L, 37621);
    return localbdu;
  }
  
  private static np u(JSONObject paramJSONObject)
  {
    agi localagi = null;
    GMTrace.i(5049673580544L, 37623);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.CardInfoParser", "parserThirdFiled json is null");
      GMTrace.o(5049673580544L, 37623);
      return null;
    }
    np localnp = new np();
    localnp.title = paramJSONObject.optString("title");
    localnp.jxJ = paramJSONObject.optString("aux_title");
    localnp.jxI = paramJSONObject.optString("sub_title");
    localnp.url = paramJSONObject.optString("url");
    localnp.uaJ = paramJSONObject.optLong("show_flag");
    localnp.uaK = paramJSONObject.optString("primary_color");
    localnp.uaL = paramJSONObject.optString("secondary_color");
    localnp.nDw = paramJSONObject.optString("icon_url");
    JSONObject localJSONObject = paramJSONObject.optJSONObject("gifting_info");
    if (localJSONObject != null)
    {
      if (localJSONObject != null) {
        break label192;
      }
      w.e("MicroMsg.CardInfoParser", "parserGiftInfo json is null");
    }
    for (;;)
    {
      localnp.uep = localagi;
      localnp.tZx = paramJSONObject.optString("app_brand_user_name");
      localnp.tZy = paramJSONObject.optString("app_brand_pass");
      GMTrace.o(5049673580544L, 37623);
      return localnp;
      label192:
      w.d("MicroMsg.CardInfoParser", "parserGitfInfo:%s", new Object[] { localJSONObject });
      localagi = new agi();
      localagi.tNN = o.bj(localJSONObject.optString("biz_uin"));
      localagi.tNO = localJSONObject.optString("order_id");
    }
  }
  
  public static ArrayList<ShareCardInfo> uv(String paramString)
  {
    GMTrace.i(5047928750080L, 37610);
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.CardInfoParser", "parseShareCardArray jsonContent is null");
      GMTrace.o(5047928750080L, 37610);
      return null;
    }
    try
    {
      paramString = new JSONObject(paramString).optJSONArray("card_list");
      if ((paramString == null) || (paramString.length() == 0))
      {
        w.e("MicroMsg.CardInfoParser", "parseShareCardArray cardItemListJson is null");
        GMTrace.o(5047928750080L, 37610);
        return null;
      }
      ArrayList localArrayList = new ArrayList();
      int i = 0;
      while (i < paramString.length())
      {
        JSONObject localJSONObject = paramString.optJSONObject(i);
        ShareCardInfo localShareCardInfo = new ShareCardInfo();
        a(localShareCardInfo, localJSONObject);
        localArrayList.add(localShareCardInfo);
        i += 1;
      }
      GMTrace.o(5047928750080L, 37610);
      return localArrayList;
    }
    catch (JSONException paramString)
    {
      w.printErrStackTrace("MicroMsg.CardInfoParser", paramString, "", new Object[0]);
      GMTrace.o(5047928750080L, 37610);
    }
    return null;
  }
  
  public static ArrayList<CardInfo> uw(String paramString)
  {
    GMTrace.i(5048331403264L, 37613);
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.CardInfoParser", "parseCardArray jsonContent is null");
      GMTrace.o(5048331403264L, 37613);
      return null;
    }
    try
    {
      paramString = new JSONObject(paramString).optJSONArray("card_array");
      if ((paramString == null) || (paramString.length() == 0))
      {
        w.e("MicroMsg.CardInfoParser", "parseCardArray cardItemListJson is null");
        GMTrace.o(5048331403264L, 37613);
        return null;
      }
      ArrayList localArrayList = new ArrayList();
      int i = 0;
      while (i < paramString.length())
      {
        JSONObject localJSONObject = paramString.optJSONObject(i);
        CardInfo localCardInfo = new CardInfo();
        a(localCardInfo, localJSONObject);
        localArrayList.add(localCardInfo);
        i += 1;
      }
      GMTrace.o(5048331403264L, 37613);
      return localArrayList;
    }
    catch (JSONException paramString)
    {
      w.printErrStackTrace("MicroMsg.CardInfoParser", paramString, "", new Object[0]);
      GMTrace.o(5048331403264L, 37613);
    }
    return null;
  }
  
  private static String ux(String paramString)
  {
    GMTrace.i(5048734056448L, 37616);
    if ((TextUtils.isEmpty(paramString)) || ("null".equals(paramString)))
    {
      GMTrace.o(5048734056448L, 37616);
      return "";
    }
    GMTrace.o(5048734056448L, 37616);
    return paramString;
  }
  
  private static pu v(JSONObject paramJSONObject)
  {
    GMTrace.i(5049807798272L, 37624);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.CardInfoParser", "parserDetailStruct json is null");
      GMTrace.o(5049807798272L, 37624);
      return null;
    }
    pu localpu = new pu();
    localpu.title = paramJSONObject.optString("title");
    localpu.url = paramJSONObject.optString("url");
    localpu.desc = paramJSONObject.optString("abstract");
    localpu.nIw = paramJSONObject.optString("detail");
    localpu.ufQ = paramJSONObject.optString("ad_title");
    JSONArray localJSONArray = paramJSONObject.optJSONArray("icon_url_list");
    if ((localJSONArray != null) && (localJSONArray.length() > 0))
    {
      LinkedList localLinkedList = new LinkedList();
      int i = 0;
      for (;;)
      {
        if (i >= localJSONArray.length()) {
          break label204;
        }
        paramJSONObject = "";
        try
        {
          String str = localJSONArray.getString(i);
          paramJSONObject = str;
        }
        catch (JSONException localJSONException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.CardInfoParser", localJSONException, "", new Object[0]);
            w.e("MicroMsg.CardInfoParser", "getMessage:" + localJSONException.getMessage());
          }
        }
        localLinkedList.add(paramJSONObject);
        i += 1;
      }
      label204:
      localpu.ufP = localLinkedList;
    }
    for (;;)
    {
      GMTrace.o(5049807798272L, 37624);
      return localpu;
      w.e("MicroMsg.CardInfoParser", "parserDetailStruct icon_url_list is null");
    }
  }
  
  private static bik w(JSONObject paramJSONObject)
  {
    GMTrace.i(5049942016000L, 37625);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.CardInfoParser", "parserUseCondition json is null");
      GMTrace.o(5049942016000L, 37625);
      return null;
    }
    bik localbik = new bik();
    localbik.tag = paramJSONObject.optString("tag");
    localbik.gjg = paramJSONObject.optString("color");
    GMTrace.o(5049942016000L, 37625);
    return localbik;
  }
  
  private static pv x(JSONObject paramJSONObject)
  {
    GMTrace.i(5050076233728L, 37626);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.CardInfoParser", "parserDetailTable json is null");
      GMTrace.o(5050076233728L, 37626);
      return null;
    }
    pv localpv = new pv();
    localpv.title = paramJSONObject.optString("title");
    localpv.jxI = paramJSONObject.optString("sub_title");
    localpv.ufR = paramJSONObject.optInt("show_num", 0);
    paramJSONObject = paramJSONObject.optJSONArray("rows");
    if ((paramJSONObject != null) && (paramJSONObject.length() > 0)) {}
    for (;;)
    {
      try
      {
        localpv.ufS = l(paramJSONObject);
        GMTrace.o(5050076233728L, 37626);
        return localpv;
      }
      catch (JSONException paramJSONObject)
      {
        w.printErrStackTrace("MicroMsg.CardInfoParser", paramJSONObject, "", new Object[0]);
        w.e("MicroMsg.CardInfoParser", paramJSONObject.getMessage());
        continue;
      }
      w.e("MicroMsg.CardInfoParser", "parserDetailTable jsonArray is  null");
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */