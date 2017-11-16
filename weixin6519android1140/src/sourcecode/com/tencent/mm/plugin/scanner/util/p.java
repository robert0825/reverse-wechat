package com.tencent.mm.plugin.scanner.util;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.pluginsdk.p.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class p
{
  public static String oBw;
  public static String oBx;
  public static String oBy;
  
  static
  {
    GMTrace.i(6182605422592L, 46064);
    oBw = "title";
    oBx = "tip";
    oBy = "buttonTitle";
    GMTrace.o(6182605422592L, 46064);
  }
  
  public static int FZ(String paramString)
  {
    GMTrace.i(6181531680768L, 46056);
    if (paramString == null)
    {
      GMTrace.o(6181531680768L, 46056);
      return 0;
    }
    if (("EAN-13".equals(paramString)) || ("EAN_13".equals(paramString)))
    {
      GMTrace.o(6181531680768L, 46056);
      return 4;
    }
    if (("EAN-8".equals(paramString)) || ("EAN_8".equals(paramString)))
    {
      GMTrace.o(6181531680768L, 46056);
      return 3;
    }
    if ("EAN-2".equals(paramString))
    {
      GMTrace.o(6181531680768L, 46056);
      return 1;
    }
    if ("EAN-5".equals(paramString))
    {
      GMTrace.o(6181531680768L, 46056);
      return 2;
    }
    if (("UPC-A".equals(paramString)) || ("UPC_A".equals(paramString)))
    {
      GMTrace.o(6181531680768L, 46056);
      return 5;
    }
    if (("UPC-E".equals(paramString)) || ("UPC_E".equals(paramString)))
    {
      GMTrace.o(6181531680768L, 46056);
      return 6;
    }
    if (("CODE-39".equals(paramString)) || ("CODE_39".equals(paramString)))
    {
      GMTrace.o(6181531680768L, 46056);
      return 9;
    }
    if (("CODE-93".equals(paramString)) || ("CODE_93".equals(paramString)))
    {
      GMTrace.o(6181531680768L, 46056);
      return 10;
    }
    if (("CODE-128".equals(paramString)) || ("CODE_128".equals(paramString)))
    {
      GMTrace.o(6181531680768L, 46056);
      return 11;
    }
    if ("COMPOSITE".equals(paramString))
    {
      GMTrace.o(6181531680768L, 46056);
      return 12;
    }
    if (("I/25".equals(paramString)) || ("ITF".equals(paramString)))
    {
      GMTrace.o(6181531680768L, 46056);
      return 13;
    }
    if ("DATABAR".equals(paramString))
    {
      GMTrace.o(6181531680768L, 46056);
      return 7;
    }
    if ("DATABAR-EXP".equals(paramString))
    {
      GMTrace.o(6181531680768L, 46056);
      return 8;
    }
    if ("RSS_14".equals(paramString))
    {
      GMTrace.o(6181531680768L, 46056);
      return 15;
    }
    if ("RSS_EXPANDED".equals(paramString))
    {
      GMTrace.o(6181531680768L, 46056);
      return 16;
    }
    if ("MAXICODE".equals(paramString))
    {
      GMTrace.o(6181531680768L, 46056);
      return 18;
    }
    if ("PDF_417".equals(paramString))
    {
      GMTrace.o(6181531680768L, 46056);
      return 20;
    }
    if ("QR_CODE".equals(paramString))
    {
      GMTrace.o(6181531680768L, 46056);
      return 19;
    }
    if ("CODABAR".equals(paramString))
    {
      GMTrace.o(6181531680768L, 46056);
      return 17;
    }
    if ("ISBN10".equals(paramString))
    {
      GMTrace.o(6181531680768L, 46056);
      return 14;
    }
    if ("DATA_MATRIX".equals(paramString))
    {
      GMTrace.o(6181531680768L, 46056);
      return 21;
    }
    if ("WX_CODE".equals(paramString))
    {
      GMTrace.o(6181531680768L, 46056);
      return 22;
    }
    GMTrace.o(6181531680768L, 46056);
    return 0;
  }
  
  public static a Ga(String paramString)
  {
    GMTrace.i(6181934333952L, 46059);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(6181934333952L, 46059);
      return null;
    }
    try
    {
      paramString = new JSONObject(paramString);
      a locala = new a();
      locala.jxF = paramString.optString("card_tp_id");
      locala.jxG = paramString.optInt("card_type");
      locala.eTK = paramString.optString("card_ext");
      GMTrace.o(6181934333952L, 46059);
      return locala;
    }
    catch (JSONException paramString)
    {
      w.printErrStackTrace("MicroMsg.ScannerUtil", paramString, "", new Object[0]);
      GMTrace.o(6181934333952L, 46059);
    }
    return null;
  }
  
  public static ArrayList<a> Gb(String paramString)
  {
    GMTrace.i(6182068551680L, 46060);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(6182068551680L, 46060);
      return null;
    }
    try
    {
      paramString = new JSONObject(paramString).optJSONArray("card_list");
      if ((paramString == null) || (paramString.length() == 0))
      {
        w.e("MicroMsg.ScannerUtil", "parseCardListItemArray cardItemListJson is null");
        GMTrace.o(6182068551680L, 46060);
        return null;
      }
      ArrayList localArrayList = new ArrayList();
      int i = 0;
      while (i < paramString.length())
      {
        JSONObject localJSONObject = paramString.optJSONObject(i);
        a locala = new a();
        locala.jxF = localJSONObject.optString("card_tp_id");
        locala.jxG = localJSONObject.optInt("card_type");
        locala.eTK = localJSONObject.optString("card_ext");
        localArrayList.add(locala);
        i += 1;
      }
      GMTrace.o(6182068551680L, 46060);
      return localArrayList;
    }
    catch (JSONException paramString)
    {
      w.printErrStackTrace("MicroMsg.ScannerUtil", paramString, "", new Object[0]);
      GMTrace.o(6182068551680L, 46060);
    }
    return null;
  }
  
  public static boolean P(ArrayList<a> paramArrayList)
  {
    GMTrace.i(6182202769408L, 46061);
    if ((paramArrayList == null) || (paramArrayList.size() == 0))
    {
      w.e("MicroMsg.ScannerUtil", "list == null || list.size() == 0");
      GMTrace.o(6182202769408L, 46061);
      return false;
    }
    int i = 0;
    while (i < paramArrayList.size())
    {
      a locala = (a)paramArrayList.get(i);
      if ((locala != null) && (lE(locala.jxG)))
      {
        GMTrace.o(6182202769408L, 46061);
        return true;
      }
      i += 1;
    }
    GMTrace.o(6182202769408L, 46061);
    return false;
  }
  
  public static void at(Context paramContext, String paramString)
  {
    GMTrace.i(6182336987136L, 46062);
    h.a(paramContext, paramString, null, false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(6168378343424L, 45958);
        paramAnonymousDialogInterface.dismiss();
        GMTrace.o(6168378343424L, 45958);
      }
    });
    GMTrace.o(6182336987136L, 46062);
  }
  
  public static float cS(int paramInt1, int paramInt2)
  {
    GMTrace.i(6181665898496L, 46057);
    if (paramInt2 >= paramInt1 * 3)
    {
      GMTrace.o(6181665898496L, 46057);
      return 0.5F;
    }
    GMTrace.o(6181665898496L, 46057);
    return 1.0F;
  }
  
  public static String dy(String paramString1, String paramString2)
  {
    GMTrace.i(6182471204864L, 46063);
    Object localObject2 = g.ut().getValue("ScanBookWording");
    w.i("MicroMsg.ScannerUtil", "scan image dynamic wording: " + bg.nl((String)localObject2));
    Object localObject1 = paramString2;
    if (!bg.nm((String)localObject2))
    {
      localObject2 = ((String)localObject2).split("&");
      localObject1 = paramString2;
      if (localObject2 != null)
      {
        localObject1 = new HashMap();
        int i = 0;
        while (i < localObject2.length)
        {
          String[] arrayOfString = localObject2[i].split("=");
          if (arrayOfString.length == 2) {
            ((Map)localObject1).put(arrayOfString[0], arrayOfString[1]);
          }
          i += 1;
        }
        paramString1 = (String)((Map)localObject1).get(paramString1);
        localObject1 = paramString2;
        if (!bg.nm(paramString1)) {
          localObject1 = paramString1;
        }
      }
    }
    GMTrace.o(6182471204864L, 46063);
    return (String)localObject1;
  }
  
  public static boolean lE(int paramInt)
  {
    GMTrace.i(6181800116224L, 46058);
    p.c localc = com.tencent.mm.pluginsdk.p.a.tlZ;
    if (localc != null)
    {
      boolean bool = localc.lE(paramInt);
      GMTrace.o(6181800116224L, 46058);
      return bool;
    }
    GMTrace.o(6181800116224L, 46058);
    return false;
  }
  
  public static final class a
  {
    public String eTK;
    public String jxF;
    public int jxG;
    
    public a()
    {
      GMTrace.i(6160325279744L, 45898);
      GMTrace.o(6160325279744L, 45898);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\util\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */