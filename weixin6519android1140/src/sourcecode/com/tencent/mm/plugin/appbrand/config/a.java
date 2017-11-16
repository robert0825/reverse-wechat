package com.tencent.mm.plugin.appbrand.config;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.n.h;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a
{
  public d hPA;
  public b hPB;
  public boolean hPC;
  public JSONObject hPD;
  public String hPE;
  public a hPy;
  private Map<String, c> hPz;
  
  public a()
  {
    GMTrace.i(10573806829568L, 78781);
    this.hPC = true;
    GMTrace.o(10573806829568L, 78781);
  }
  
  private static <T extends f> T a(JSONObject paramJSONObject, Class<T> paramClass, f paramf)
  {
    GMTrace.i(17266305400832L, 128644);
    try
    {
      f localf = (f)paramClass.newInstance();
      paramClass = paramJSONObject;
      if (paramJSONObject == null) {
        paramClass = f.hPX;
      }
      paramJSONObject = paramClass.optJSONObject("window");
      paramClass = paramJSONObject;
      if (paramJSONObject == null) {
        paramClass = f.hPX;
      }
      paramJSONObject = paramf;
      if (paramf == null) {
        paramJSONObject = f.hPW;
      }
      localf.hPN = paramClass.optString("navigationBarTitleText", paramJSONObject.hPN);
      localf.hPO = paramClass.optString("navigationBarTextStyle", paramJSONObject.hPO);
      localf.hPP = paramClass.optString("navigationBarBackgroundColor", paramJSONObject.hPP);
      localf.hPK = paramClass.optString("backgroundColor", paramJSONObject.hPK);
      localf.hPU = paramClass.optBoolean("enablePullDownRefresh", paramJSONObject.hPU);
      localf.hPV = paramClass.optString("backgroundTextStyle", paramJSONObject.hPV);
      localf.hPT = paramClass.optBoolean("enableFullScreen", paramJSONObject.hPT);
      paramf = paramClass.optJSONObject("navigationBarRightButton");
      paramClass = paramf;
      if (paramf == null) {
        paramClass = f.hPX;
      }
      localf.hPS = paramClass.optBoolean("hide", paramJSONObject.hPS);
      localf.hPQ = paramClass.optString("text", paramJSONObject.hPQ);
      localf.hPR = paramClass.optString("iconPath", paramJSONObject.hPR);
      GMTrace.o(17266305400832L, 128644);
      return localf;
    }
    catch (Exception paramJSONObject)
    {
      GMTrace.o(17266305400832L, 128644);
    }
    return null;
  }
  
  private static Map<String, c> a(JSONObject paramJSONObject, a parama)
  {
    GMTrace.i(10574343700480L, 78785);
    HashMap localHashMap = new HashMap();
    if (paramJSONObject == null)
    {
      GMTrace.o(10574343700480L, 78785);
      return localHashMap;
    }
    Iterator localIterator = paramJSONObject.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, b(paramJSONObject.optJSONObject(str), parama));
    }
    GMTrace.o(10574343700480L, 78785);
    return localHashMap;
  }
  
  private static c b(JSONObject paramJSONObject, a parama)
  {
    GMTrace.i(10574477918208L, 78786);
    paramJSONObject = (c)a(paramJSONObject, c.class, parama);
    GMTrace.o(10574477918208L, 78786);
    return paramJSONObject;
  }
  
  private static d e(JSONObject paramJSONObject)
  {
    GMTrace.i(10574612135936L, 78787);
    Object localObject = paramJSONObject;
    if (paramJSONObject == null) {
      localObject = new JSONObject();
    }
    paramJSONObject = new d();
    paramJSONObject.hPI = ((JSONObject)localObject).optString("position");
    paramJSONObject.gjg = ((JSONObject)localObject).optString("color");
    paramJSONObject.hPJ = ((JSONObject)localObject).optString("selectedColor");
    paramJSONObject.hPK = ((JSONObject)localObject).optString("backgroundColor");
    paramJSONObject.hPL = ((JSONObject)localObject).optString("borderStyle");
    try
    {
      localObject = ((JSONObject)localObject).getJSONArray("list");
      int i = 0;
      while (i < ((JSONArray)localObject).length())
      {
        ArrayList localArrayList = paramJSONObject.eOM;
        JSONObject localJSONObject = ((JSONArray)localObject).getJSONObject(i);
        e locale = new e();
        locale.url = localJSONObject.optString("pagePath");
        locale.text = localJSONObject.optString("text");
        locale.eQA = localJSONObject.optString("iconData");
        locale.hPM = localJSONObject.optString("selectedIconData");
        localArrayList.add(locale);
        i += 1;
      }
      return paramJSONObject;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandAppConfig", localException.getMessage());
      GMTrace.o(10574612135936L, 78787);
    }
  }
  
  public static a h(e parame)
  {
    GMTrace.i(20753550409728L, 154626);
    parame = pe(com.tencent.mm.plugin.appbrand.appcache.w.a(parame, "app-config.json"));
    GMTrace.o(20753550409728L, 154626);
    return parame;
  }
  
  private static a pe(String paramString)
  {
    GMTrace.i(17266171183104L, 128643);
    a locala = new a();
    try
    {
      paramString = new JSONObject(paramString);
      locala.hPE = paramString.optString("entryPagePath");
      locala.hPD = paramString;
      locala.hPy = ((a)a(paramString.optJSONObject("global"), a.class, null));
      locala.hPz = a(paramString.optJSONObject("page"), locala.hPy);
      locala.hPA = e(paramString.optJSONObject("tabBar"));
      JSONObject localJSONObject2 = paramString.optJSONObject("networkTimeout");
      b localb = new b();
      JSONObject localJSONObject1 = localJSONObject2;
      if (localJSONObject2 == null) {
        localJSONObject1 = new JSONObject();
      }
      localb.eXU = localJSONObject1.optInt("request");
      localb.hPF = localJSONObject1.optInt("connectSocket");
      localb.hPH = localJSONObject1.optInt("downloadFile");
      localb.hPG = localJSONObject1.optInt("uploadFile");
      locala.hPB = localb;
      locala.hPC = paramString.optBoolean("preloadEnabled", true);
      GMTrace.o(17266171183104L, 128643);
      return locala;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandAppConfig", paramString.getMessage());
        paramString = new JSONObject();
      }
    }
  }
  
  public final String Uq()
  {
    GMTrace.i(10574075265024L, 78783);
    if (!bg.nm(this.hPE))
    {
      String str = this.hPE;
      GMTrace.o(10574075265024L, 78783);
      return str;
    }
    GMTrace.o(10574075265024L, 78783);
    return "index.html";
  }
  
  public final c pd(String paramString)
  {
    GMTrace.i(10573941047296L, 78782);
    if (this.hPz.containsKey(paramString))
    {
      paramString = (c)this.hPz.get(paramString);
      GMTrace.o(10573941047296L, 78782);
      return paramString;
    }
    paramString = b(null, this.hPy);
    GMTrace.o(10573941047296L, 78782);
    return paramString;
  }
  
  public static class a
    extends a.f
  {
    public a()
    {
      GMTrace.i(10585752207360L, 78870);
      GMTrace.o(10585752207360L, 78870);
    }
  }
  
  public static final class b
  {
    public int eXU;
    public int hPF;
    public int hPG;
    public int hPH;
    
    public b()
    {
      GMTrace.i(10577564925952L, 78809);
      GMTrace.o(10577564925952L, 78809);
    }
  }
  
  public static class c
    extends a.f
  {
    public c()
    {
      GMTrace.i(10585617989632L, 78869);
      GMTrace.o(10585617989632L, 78869);
    }
  }
  
  public static final class d
  {
    public ArrayList<a.e> eOM;
    public String gjg;
    public String hPI;
    public String hPJ;
    public String hPK;
    public String hPL;
    
    public d()
    {
      GMTrace.i(10581054586880L, 78835);
      this.eOM = new ArrayList();
      GMTrace.o(10581054586880L, 78835);
    }
    
    public final boolean pf(String paramString)
    {
      GMTrace.i(10581188804608L, 78836);
      Iterator localIterator = this.eOM.iterator();
      while (localIterator.hasNext()) {
        if (((a.e)localIterator.next()).url.equals(h.sv(paramString)))
        {
          GMTrace.o(10581188804608L, 78836);
          return true;
        }
      }
      GMTrace.o(10581188804608L, 78836);
      return false;
    }
  }
  
  public static final class e
  {
    public String eQA;
    public String hPM;
    public String text;
    public String url;
    
    public e()
    {
      GMTrace.i(10573672611840L, 78780);
      GMTrace.o(10573672611840L, 78780);
    }
  }
  
  private static abstract class f
  {
    static final f hPW;
    static final JSONObject hPX;
    public String hPK;
    public String hPN;
    public String hPO;
    public String hPP;
    public String hPQ;
    public String hPR;
    public boolean hPS;
    public boolean hPT;
    public boolean hPU;
    public String hPV;
    
    static
    {
      GMTrace.i(17265365876736L, 128637);
      hPW = new f() {};
      hPX = new JSONObject();
      GMTrace.o(17265365876736L, 128637);
    }
    
    public f()
    {
      GMTrace.i(17265231659008L, 128636);
      this.hPS = false;
      this.hPT = false;
      this.hPU = false;
      GMTrace.o(17265231659008L, 128636);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\config\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */