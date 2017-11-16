package com.tencent.mm.plugin.appbrand.jsapi.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a
{
  public static boolean icY;
  public static j icZ;
  public static int ida;
  private static Map<String, JSONObject> idb;
  private static JSONArray idc;
  private static JSONArray idd;
  
  static
  {
    GMTrace.i(14332976955392L, 106789);
    icY = false;
    icZ = null;
    ida = 0;
    GMTrace.o(14332976955392L, 106789);
  }
  
  public static Map<String, JSONObject> Ws()
  {
    GMTrace.i(14331903213568L, 106781);
    if (idb == null) {
      idb = new ConcurrentHashMap();
    }
    Map localMap = idb;
    GMTrace.o(14331903213568L, 106781);
    return localMap;
  }
  
  public static void Wt()
  {
    GMTrace.i(14332037431296L, 106782);
    if (idb != null)
    {
      idb.clear();
      idb = null;
    }
    GMTrace.o(14332037431296L, 106782);
  }
  
  public static j Wu()
  {
    GMTrace.i(18211198205952L, 135684);
    j localj = icZ;
    GMTrace.o(18211198205952L, 135684);
    return localj;
  }
  
  public static int Wv()
  {
    GMTrace.i(18211466641408L, 135686);
    int i = ida;
    GMTrace.o(18211466641408L, 135686);
    return i;
  }
  
  public static void Ww()
  {
    GMTrace.i(16283965849600L, 121325);
    if (idc != null) {
      idc = null;
    }
    GMTrace.o(16283965849600L, 121325);
  }
  
  public static void Wx()
  {
    GMTrace.i(14332440084480L, 106785);
    if (idd != null) {
      idd = null;
    }
    GMTrace.o(14332440084480L, 106785);
  }
  
  public static void e(j paramj)
  {
    GMTrace.i(18211332423680L, 135685);
    icZ = paramj;
    GMTrace.o(18211332423680L, 135685);
  }
  
  private static String f(j paramj)
  {
    GMTrace.i(14332574302208L, 106786);
    paramj = "JsApi#BluetoothSessionId" + paramj.hashCode();
    GMTrace.o(14332574302208L, 106786);
    return paramj;
  }
  
  public static u.b g(j paramj)
  {
    GMTrace.i(14332708519936L, 106787);
    String str = f(paramj);
    u.b localb = u.Av().gw(str);
    paramj = localb;
    if (localb == null)
    {
      w.d("MicroMsg.JsApiBluetoothUtil", "getDataStore true!");
      paramj = u.Av().p(str, true);
    }
    GMTrace.o(14332708519936L, 106787);
    return paramj;
  }
  
  public static void h(j paramj)
  {
    GMTrace.i(14332842737664L, 106788);
    paramj = f(paramj);
    paramj = u.Av().gx(paramj);
    if (paramj != null)
    {
      paramj.recycle();
      w.d("MicroMsg.JsApiBluetoothUtil", "removeDataKeyValueSet!");
    }
    GMTrace.o(14332842737664L, 106788);
  }
  
  public static void iD(int paramInt)
  {
    GMTrace.i(18211600859136L, 135687);
    ida = paramInt;
    GMTrace.o(18211600859136L, 135687);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */