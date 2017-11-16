package com.tencent.mm.plugin.card.model;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  public String gjg;
  public String jty;
  public String jxF;
  public int jxG;
  public String jxH;
  public String jxI;
  public String jxJ;
  public String jxK;
  public String jxL;
  public int jxM;
  public String jxN;
  public int jxO;
  public String jxP;
  public String jxQ;
  public String jxR;
  public boolean jxS;
  public String title;
  public String userName;
  
  public a()
  {
    GMTrace.i(4916663812096L, 36632);
    GMTrace.o(4916663812096L, 36632);
  }
  
  private static LinkedList<a> a(JSONArray paramJSONArray, boolean paramBoolean)
  {
    GMTrace.i(4917066465280L, 36635);
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0))
    {
      GMTrace.o(4917066465280L, 36635);
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    while (i < paramJSONArray.length())
    {
      JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
      a locala = new a();
      locala.jxF = localJSONObject.optString("card_tp_id");
      locala.jxG = localJSONObject.optInt("card_type");
      locala.gjg = localJSONObject.optString("color");
      locala.jxH = localJSONObject.optString("logo_url");
      locala.title = localJSONObject.optString("title");
      locala.jxI = localJSONObject.optString("sub_title");
      locala.jxJ = localJSONObject.optString("aux_title");
      locala.jxK = localJSONObject.optString("encrypt_code");
      locala.userName = localJSONObject.optString("from_user_name");
      locala.jxL = localJSONObject.optString("app_id");
      locala.jxM = localJSONObject.optInt("end_time");
      locala.jxN = localJSONObject.optString("card_user_id");
      locala.jxO = localJSONObject.optInt("choose_optional");
      locala.jxQ = localJSONObject.optString("invoice_item");
      locala.jxR = localJSONObject.optString("invoice_status");
      locala.jxP = localJSONObject.optString("invoice_title");
      locala.jxS = paramBoolean;
      localLinkedList.add(locala);
      i += 1;
    }
    GMTrace.o(4917066465280L, 36635);
    return localLinkedList;
  }
  
  public static LinkedList<a> tS(String paramString)
  {
    GMTrace.i(4916798029824L, 36633);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(4916798029824L, 36633);
      return null;
    }
    try
    {
      paramString = a(new JSONObject(paramString).optJSONArray("available_cards"), false);
      GMTrace.o(4916798029824L, 36633);
      return paramString;
    }
    catch (JSONException paramString)
    {
      w.printErrStackTrace("MicroMsg.AvailableCardItem", paramString, "", new Object[0]);
      GMTrace.o(4916798029824L, 36633);
    }
    return null;
  }
  
  public static LinkedList<a> tT(String paramString)
  {
    GMTrace.i(4916932247552L, 36634);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(4916932247552L, 36634);
      return null;
    }
    try
    {
      paramString = a(new JSONObject(paramString).optJSONArray("available_share_cards"), true);
      GMTrace.o(4916932247552L, 36634);
      return paramString;
    }
    catch (JSONException paramString)
    {
      w.printErrStackTrace("MicroMsg.AvailableCardItem", paramString, "", new Object[0]);
      GMTrace.o(4916932247552L, 36634);
    }
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\card\model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */