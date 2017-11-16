package com.tencent.mm.plugin.wallet_core.model.mall;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.protocal.d;
import com.tencent.mm.s.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
{
  public static int rjO;
  public static int rjP;
  public static int rjQ;
  
  static
  {
    GMTrace.i(6884698357760L, 51295);
    rjO = 65280;
    rjP = 621019136;
    rjQ = 637534720;
    GMTrace.o(6884698357760L, 51295);
  }
  
  public static void bM(List<a> paramList)
  {
    GMTrace.i(6884161486848L, 51291);
    if ((paramList == null) || (paramList.size() <= 0))
    {
      w.w("MicroMsg.MallLogic", "func[setBannerRedDotClick] actList null or empty");
      GMTrace.o(6884161486848L, 51291);
      return;
    }
    int i = ((a)paramList.get(0)).rjG;
    w.d("MicroMsg.MallLogic", "func[setBannerRedDotClick], lastClickedListMaxId" + i);
    h.xz();
    h.xy().xh().set(270342, Integer.valueOf(i));
    h.xz();
    h.xy().xh().kL(true);
    GMTrace.o(6884161486848L, 51291);
  }
  
  public static String bzh()
  {
    GMTrace.i(6884429922304L, 51293);
    Object localObject = (TelephonyManager)ab.getContext().getSystemService("phone");
    if (localObject != null) {}
    for (localObject = ((TelephonyManager)localObject).getNetworkCountryIso();; localObject = "")
    {
      GMTrace.o(6884429922304L, 51293);
      return (String)localObject;
    }
  }
  
  public static ArrayList<MallNews> t(JSONArray paramJSONArray)
  {
    GMTrace.i(6883758833664L, 51288);
    try
    {
      ArrayList localArrayList = new ArrayList();
      int j = paramJSONArray.length();
      int i = 0;
      while (i < j)
      {
        JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
        MallNews localMallNews = new MallNews(localJSONObject.optString("activity_jump_funcid"));
        localMallNews.rjW = localJSONObject.optString("activity_icon_link");
        localMallNews.rjU = localJSONObject.optString("activity_msg_content");
        localMallNews.rjY = localJSONObject.optString("activity_tips");
        localArrayList.add(localMallNews);
        i += 1;
      }
      GMTrace.o(6883758833664L, 51288);
      return localArrayList;
    }
    catch (JSONException paramJSONArray)
    {
      w.printErrStackTrace("MicroMsg.MallLogic", paramJSONArray, "", new Object[0]);
      GMTrace.o(6883758833664L, 51288);
    }
    return null;
  }
  
  public static ArrayList<a> u(JSONArray paramJSONArray)
  {
    GMTrace.i(6883893051392L, 51289);
    try
    {
      ArrayList localArrayList = new ArrayList();
      int j = paramJSONArray.length();
      int i = 0;
      while (i < j)
      {
        JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
        a locala = new a();
        locala.rjG = localJSONObject.optInt("banner_id");
        locala.rjH = localJSONObject.optString("banner_title");
        locala.rjI = localJSONObject.optString("banner_link");
        localArrayList.add(locala);
        i += 1;
      }
      GMTrace.o(6883893051392L, 51289);
      return localArrayList;
    }
    catch (JSONException paramJSONArray)
    {
      w.w("MicroMsg.MallLogic", "func[parseBannerActList], exp:" + paramJSONArray.getMessage());
      GMTrace.o(6883893051392L, 51289);
    }
    return null;
  }
  
  public static SparseArray<String> v(JSONArray paramJSONArray)
  {
    int i = 0;
    GMTrace.i(6884027269120L, 51290);
    try
    {
      SparseArray localSparseArray = new SparseArray();
      while (i < paramJSONArray.length())
      {
        JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
        int j = localJSONObject.optInt("type_id", 0);
        if (j != 0) {
          localSparseArray.put(j, localJSONObject.optString("type_name"));
        }
        i += 1;
      }
      GMTrace.o(6884027269120L, 51290);
      return localSparseArray;
    }
    catch (JSONException paramJSONArray)
    {
      w.w("MicroMsg.MallLogic", "func[parseBannerActList], exp:" + paramJSONArray.getMessage());
      GMTrace.o(6884027269120L, 51290);
    }
    return null;
  }
  
  public static ArrayList<MallFunction> w(JSONArray paramJSONArray)
  {
    GMTrace.i(6884295704576L, 51292);
    try
    {
      ArrayList localArrayList = new ArrayList();
      int k = paramJSONArray.length();
      w.d("MicroMsg.MallLogic", "functions.jsonArray.length : " + k);
      int i = 0;
      Object localObject1;
      for (;;)
      {
        localObject1 = localArrayList;
        if (i >= k) {
          break;
        }
        Object localObject2 = paramJSONArray.getJSONObject(i);
        localObject1 = new MallFunction();
        ((MallFunction)localObject1).odH = ((JSONObject)localObject2).getString("func_id");
        ((MallFunction)localObject1).eVy = ((JSONObject)localObject2).getString("func_name");
        ((MallFunction)localObject1).rjJ = ((JSONObject)localObject2).optString("func_icon_url");
        ((MallFunction)localObject1).mRS = ((JSONObject)localObject2).optString("hd_icon_url");
        ((MallFunction)localObject1).mRT = ((JSONObject)localObject2).optString("func_foregroud_icon_url");
        ((MallFunction)localObject1).eYm = ((JSONObject)localObject2).optString("native_url");
        ((MallFunction)localObject1).mci = ((JSONObject)localObject2).optString("h5_url");
        ((MallFunction)localObject1).type = ((JSONObject)localObject2).optInt("property_type", 0);
        ((MallFunction)localObject1).rjM = ((JSONObject)localObject2).optString("third_party_disclaimer");
        ((MallFunction)localObject1).rjN = ((JSONObject)localObject2).optInt("download_restrict", 0);
        Object localObject3 = ((JSONObject)localObject2).optJSONArray("remark_name_list");
        if (localObject3 != null)
        {
          ((MallFunction)localObject1).rjK = new ArrayList();
          int m = ((JSONArray)localObject3).length();
          int j = 0;
          while (j < m)
          {
            ((MallFunction)localObject1).rjK.add(((JSONArray)localObject3).getString(j));
            j += 1;
          }
        }
        localObject3 = ((JSONObject)localObject2).optJSONArray("activity_info_list");
        if ((localObject3 != null) && (((JSONArray)localObject3).length() != 0))
        {
          localObject2 = ((MallFunction)localObject1).odH;
          localObject3 = ((JSONArray)localObject3).getJSONObject(0);
          localObject2 = new MallNews((String)localObject2);
          ((MallNews)localObject2).qrG = ((JSONObject)localObject3).optString("activity_id");
          ((MallNews)localObject2).eEU = ((JSONObject)localObject3).optString("activity_ticket");
          ((MallNews)localObject2).rjU = ((JSONObject)localObject3).optString("activity_msg_content");
          ((MallNews)localObject2).rjV = ((JSONObject)localObject3).optString("activity_link");
          ((MallNews)localObject2).rjW = ((JSONObject)localObject3).optString("activity_icon_link");
          ((MallNews)localObject2).rjX = ((JSONObject)localObject3).optInt("activity_expired_time");
          ((MallNews)localObject2).rjY = ((JSONObject)localObject3).optString("activity_tips");
          ((MallNews)localObject2).rhZ = ((JSONObject)localObject3).optInt("activity_type");
          ((MallNews)localObject2).rkb = ((JSONObject)localObject3).optString("activity_url");
          ((MallNews)localObject2).rjZ = ((JSONObject)localObject3).optInt("is_msg_reserved");
          ((MallFunction)localObject1).rjL = ((MallNews)localObject2);
        }
        localArrayList.add(localObject1);
        i += 1;
      }
      return (ArrayList<MallFunction>)localObject1;
    }
    catch (JSONException paramJSONArray)
    {
      w.printErrStackTrace("MicroMsg.MallLogic", paramJSONArray, "", new Object[0]);
      localObject1 = null;
      GMTrace.o(6884295704576L, 51292);
    }
  }
  
  public static void wR(int paramInt)
  {
    GMTrace.i(6884564140032L, 51294);
    if ((d.tJC & rjO) == paramInt)
    {
      h.xz();
      i = ((Integer)h.xy().xh().get(270343, Integer.valueOf(0))).intValue();
      if (paramInt != i) {
        w.d("MicroMsg.MallLogic", "Mall reddot show, targetV=" + paramInt + ", clickedV=" + i);
      }
    }
    for (int i = 1;; i = 0)
    {
      if ((i != 0) && (q.zN()))
      {
        w.d("MicroMsg.MallLogic", "Show mall entry redot");
        c.vK().k(262156, true);
        h.xz();
        h.xy().xh().set(270343, Integer.valueOf(paramInt));
        h.xz();
        h.xy().xh().a(w.a.vyy, Long.valueOf(System.currentTimeMillis()));
      }
      GMTrace.o(6884564140032L, 51294);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\mall\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */