package com.tencent.mm.plugin.freewifi;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.freewifi.f.b;
import com.tencent.mm.plugin.freewifi.g.f;
import com.tencent.mm.plugin.freewifi.model.c;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class k
{
  public static Map<String, String> lor;
  public String bssid;
  public String eCE;
  public String eCF;
  public int ePH;
  public String jNb;
  public long loA;
  public int los;
  public String lot;
  public String lou;
  public String lov;
  public int low;
  public long lox;
  public String loy;
  public String loz;
  public int result;
  public String ssid;
  
  static
  {
    GMTrace.i(7263863439360L, 54120);
    lor = new HashMap() {};
    GMTrace.o(7263863439360L, 54120);
  }
  
  public k()
  {
    GMTrace.i(7261044867072L, 54099);
    GMTrace.o(7261044867072L, 54099);
  }
  
  public static a aAB()
  {
    GMTrace.i(7261179084800L, 54100);
    a locala = new a();
    GMTrace.o(7261179084800L, 54100);
    return locala;
  }
  
  public static String yo(String paramString)
  {
    GMTrace.i(7260910649344L, 54098);
    paramString = m.yr((String)lor.get(paramString));
    GMTrace.o(7260910649344L, 54098);
    return paramString;
  }
  
  public final k aAC()
  {
    GMTrace.i(7261313302528L, 54101);
    g.ork.i(12804, new Object[] { m.yr(this.ssid), m.yr(this.bssid), m.yr(this.eCF), m.yr(this.eCE), Integer.valueOf(this.los), m.yr(this.lot), m.yr(this.lou), m.yr(this.lov), Integer.valueOf(this.low), Long.valueOf(this.lox), m.yr(this.loy), Integer.valueOf(this.result), Integer.valueOf(this.ePH), m.yr(this.loz), Long.valueOf(this.loA), m.yr(this.jNb) });
    GMTrace.o(7261313302528L, 54101);
    return this;
  }
  
  public final k b(final Intent paramIntent, boolean paramBoolean)
  {
    GMTrace.i(7261447520256L, 54102);
    for (;;)
    {
      try
      {
        i = m.E(paramIntent);
        if (i != 31)
        {
          GMTrace.o(7261447520256L, 54102);
          return this;
        }
        localObject = new JSONObject();
      }
      catch (Exception paramIntent)
      {
        final int i;
        final Object localObject;
        String str;
        w.e("MicroMsg.FreeWifi.FreeWifiQualityReporter", "reportWifiServer() write to local file exception. " + m.e(paramIntent));
        continue;
        paramIntent.putExtra("ConstantsFreeWifi.FREE_WIFI_REPORT_WIFI_SERVER_JSON", localJSONException + "," + (String)localObject);
        continue;
      }
      try
      {
        ((JSONObject)localObject).put("ssid", this.ssid);
        ((JSONObject)localObject).put("bssid", this.bssid);
        ((JSONObject)localObject).put("clientMac", this.eCF);
        ((JSONObject)localObject).put("apKey", this.eCE);
        ((JSONObject)localObject).put("qrtype", this.los);
        ((JSONObject)localObject).put("mpShopId", this.lot);
        ((JSONObject)localObject).put("mpAppId", this.lou);
        ((JSONObject)localObject).put("sessionKey", this.lov);
        ((JSONObject)localObject).put("protocolType", this.low);
        ((JSONObject)localObject).put("stageCode", this.lox);
        ((JSONObject)localObject).put("stageName", this.loy);
        ((JSONObject)localObject).put("result", this.result);
        ((JSONObject)localObject).put("channel", this.ePH);
        ((JSONObject)localObject).put("mpUserName", this.loz);
        ((JSONObject)localObject).put("timeCost", this.loA);
        ((JSONObject)localObject).put("resultMsg", this.jNb);
        ((JSONObject)localObject).put("logCurrentTimeMillis", System.currentTimeMillis());
        localObject = ((JSONObject)localObject).toString();
        str = paramIntent.getStringExtra("ConstantsFreeWifi.FREE_WIFI_REPORT_WIFI_SERVER_JSON");
        if (m.yp(str))
        {
          paramIntent.putExtra("ConstantsFreeWifi.FREE_WIFI_REPORT_WIFI_SERVER_JSON", (String)localObject);
          final long l = System.currentTimeMillis();
          localObject = paramIntent.getStringExtra("ConstantsFreeWifi.FREE_WIFI_REPORT_WIFI_SERVER_ID");
          paramIntent = paramIntent.getStringExtra("ConstantsFreeWifi.FREE_WIFI_REPORT_WIFI_SERVER_JSON");
          if (paramBoolean) {
            j.aBi().aAR().post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(7148436193280L, 53260);
                j.aBg().a(localObject, i, paramIntent, l);
                if (m.aAI()) {
                  b.nU(1);
                }
                GMTrace.o(7148436193280L, 53260);
              }
            });
          }
          GMTrace.o(7261447520256L, 54102);
          return this;
        }
      }
      catch (JSONException localJSONException)
      {
        w.e("MicroMsg.FreeWifi.FreeWifiQualityReporter", "JSONException e. " + m.e(localJSONException));
      }
    }
  }
  
  public static final class a
  {
    public String bssid;
    public String eCE;
    public String eCF;
    public int ePH;
    public String jNb;
    private long loA;
    private int los;
    public String lot;
    public String lou;
    public String lov;
    public int low;
    public long lox;
    public String loy;
    public String loz;
    public int result;
    public String ssid;
    
    public a()
    {
      GMTrace.i(7128169316352L, 53109);
      GMTrace.o(7128169316352L, 53109);
    }
    
    public final k aAD()
    {
      GMTrace.i(7128303534080L, 53110);
      k localk = new k();
      localk.ssid = this.ssid;
      localk.bssid = this.bssid;
      localk.eCF = this.eCF;
      localk.eCE = this.eCE;
      localk.los = this.los;
      localk.lot = this.lot;
      localk.lou = this.lou;
      localk.lov = this.lov;
      localk.low = this.low;
      localk.lox = Integer.valueOf("1" + String.format("%03d", new Object[] { Integer.valueOf(this.low) }) + String.format("%03d", new Object[] { Long.valueOf(this.lox) })).intValue();
      localk.loy = this.loy;
      localk.result = this.result;
      localk.ePH = this.ePH;
      localk.loz = this.loz;
      localk.loA = this.loA;
      localk.jNb = this.jNb;
      GMTrace.o(7128303534080L, 53110);
      return localk;
    }
  }
  
  public static enum b
  {
    public long lpi;
    String lpj;
    public String name;
    
    static
    {
      GMTrace.i(7264400310272L, 54124);
      loF = new b("GetFrontPage", 0, 10L, "getFrontPage", "a");
      loG = new b("GetFrontPageReturn", 1, 11L, "getFrontpageReturn", "ar");
      loH = new b("GetFrontPageReturnDataCheck", 2, 12L, "getFrontPageReturnDataCheck", "ard");
      loI = new b("AddNetwork", 3, 20L, "addNetwork", "n");
      loJ = new b("GetBackPage", 4, 30L, "getBackPage", "b");
      loK = new b("GetBackPageReturn", 5, 31L, "getBackPageReturn", "br");
      loL = new b("GetBackPage33", 6, 32L, "getBackPage33", "b33");
      loM = new b("GetBackPage33Return", 7, 33L, "getBackPage33Return", "b33r");
      loN = new b("BackpageFinished", 8, 40L, "backpageFinished", "bf");
      loO = new b("QinghuaiBackpageFinished", 9, 50L, "qinghuaiBackpageFinished", "qbf");
      loP = new b("ScanNearFieldWifiAndReport", 10, 110L, "scanNearFieldWifiAndReport", "sc");
      loQ = new b("GetThreeOneLock", 11, 290L, "getThreeOneLock", "31lk");
      loR = new b("GetPortalApInfo", 12, 300L, "getPortalApInfo", "o");
      loS = new b("GetPortalApInfoReturn", 13, 301L, "getPortalApInfoReturn", "or");
      loT = new b("GetPortalApInfoReturnDataCheck", 14, 302L, "getPortalApInfoReturnDataCheck", "ord");
      loU = new b("FrontPageUIClosed", 15, 303L, "frontPageUIClosed", "af");
      loV = new b("FrontPageUIClosedByGoBack", 16, 311L, "frontPageUIClosedByGoBack", "afg");
      loW = new b("FrontPageUIClosedByGoSuc", 17, 312L, "frontPageUIClosedByGoSuc", "afs");
      loX = new b("FrontPageUIClosedByGoContactInfoUI", 18, 313L, "frontPageUIClosedByGoContactInfoUI", "afc");
      loY = new b("ThreeOneAuth", 19, 305L, "threeOneAuth", "31a");
      loZ = new b("ThreeTwoAuth", 20, 306L, "threeTwoAuth", "32a");
      lpa = new b("ThreeTwoBlack", 21, 307L, "threeTwoAuthBlack", "32ab");
      lpb = new b("ThreeThreeAuth", 22, 308L, "threeThreeAuth", "33a");
      lpc = new b("GetPcFrontPage", 23, 210L, "getPcFrontPage", "pca");
      lpd = new b("GetPcFrontPageReturn", 24, 211L, "getPcFrontPageReturn", "pcar");
      lpe = new b("SetPcLoginUserInfo", 25, 212L, "setPcLoginUserInfo", "pcset");
      lpf = new b("SetPcLoginUserInfoReturn", 26, 212L, "setPcLoginUserInfoReturn", "pcsetr");
      lpg = new b("ManufacturerConnectLoading", 27, 500L, "manufacturerConnectLoading", "mld");
      lph = new b("CopyPwdPageUIClosedByGoBack", 28, 600L, "CopyPwdPageUIClosedByGoBack", "cpg");
      lpk = new b[] { loF, loG, loH, loI, loJ, loK, loL, loM, loN, loO, loP, loQ, loR, loS, loT, loU, loV, loW, loX, loY, loZ, lpa, lpb, lpc, lpd, lpe, lpf, lpg, lph };
      GMTrace.o(7264400310272L, 54124);
    }
    
    private b(long paramLong, String paramString1, String paramString2)
    {
      GMTrace.i(7264266092544L, 54123);
      if ((paramLong > 999L) || (paramLong < 0L)) {
        throw new IllegalArgumentException("code must be between 0 and 999");
      }
      this.lpi = paramLong;
      this.name = paramString1;
      this.lpj = paramString2;
      GMTrace.o(7264266092544L, 54123);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */