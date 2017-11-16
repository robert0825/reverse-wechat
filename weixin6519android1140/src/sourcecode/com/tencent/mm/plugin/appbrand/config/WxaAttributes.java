package com.tencent.mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ed;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class WxaAttributes
  extends ed
{
  public static final c.a hIP;
  public static final String hRr;
  private a hRC;
  private c hRD;
  private d hRE;
  private List<WxaEntryInfo> hRF;
  private b hRG;
  
  static
  {
    GMTrace.i(15537983717376L, 115767);
    c.a locala = new c.a();
    locala.gZM = new Field[19];
    locala.columns = new String[20];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "usernameHash";
    locala.vmt.put("usernameHash", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" usernameHash INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "usernameHash";
    locala.columns[1] = "username";
    locala.vmt.put("username", "TEXT");
    localStringBuilder.append(" username TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "appId";
    locala.vmt.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "nickname";
    locala.vmt.put("nickname", "TEXT");
    localStringBuilder.append(" nickname TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "brandIconURL";
    locala.vmt.put("brandIconURL", "TEXT");
    localStringBuilder.append(" brandIconURL TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "roundedSquareIconURL";
    locala.vmt.put("roundedSquareIconURL", "TEXT");
    localStringBuilder.append(" roundedSquareIconURL TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "bigHeadURL";
    locala.vmt.put("bigHeadURL", "TEXT");
    localStringBuilder.append(" bigHeadURL TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "smallHeadURL";
    locala.vmt.put("smallHeadURL", "TEXT");
    localStringBuilder.append(" smallHeadURL TEXT");
    localStringBuilder.append(", ");
    locala.columns[8] = "signature";
    locala.vmt.put("signature", "TEXT");
    localStringBuilder.append(" signature TEXT");
    localStringBuilder.append(", ");
    locala.columns[9] = "appOpt";
    locala.vmt.put("appOpt", "INTEGER default '0' ");
    localStringBuilder.append(" appOpt INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[10] = "registerSource";
    locala.vmt.put("registerSource", "TEXT");
    localStringBuilder.append(" registerSource TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "appInfo";
    locala.vmt.put("appInfo", "TEXT");
    localStringBuilder.append(" appInfo TEXT");
    localStringBuilder.append(", ");
    locala.columns[12] = "versionInfo";
    locala.vmt.put("versionInfo", "TEXT");
    localStringBuilder.append(" versionInfo TEXT");
    localStringBuilder.append(", ");
    locala.columns[13] = "bindWxaInfo";
    locala.vmt.put("bindWxaInfo", "TEXT");
    localStringBuilder.append(" bindWxaInfo TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "dynamicInfo";
    locala.vmt.put("dynamicInfo", "TEXT");
    localStringBuilder.append(" dynamicInfo TEXT");
    localStringBuilder.append(", ");
    locala.columns[15] = "reserved";
    locala.vmt.put("reserved", "TEXT");
    localStringBuilder.append(" reserved TEXT");
    localStringBuilder.append(", ");
    locala.columns[16] = "syncTimeSecond";
    locala.vmt.put("syncTimeSecond", "LONG default '0' ");
    localStringBuilder.append(" syncTimeSecond LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[17] = "syncVersion";
    locala.vmt.put("syncVersion", "TEXT");
    localStringBuilder.append(" syncVersion TEXT");
    localStringBuilder.append(", ");
    locala.columns[18] = "bizMenu";
    locala.vmt.put("bizMenu", "TEXT");
    localStringBuilder.append(" bizMenu TEXT");
    locala.columns[19] = "rowid";
    locala.vmu = localStringBuilder.toString();
    hIP = locala;
    hRr = i.a(locala, "WxaAttributesTable");
    GMTrace.o(15537983717376L, 115767);
  }
  
  public WxaAttributes()
  {
    GMTrace.i(15537178411008L, 115761);
    this.hRF = null;
    GMTrace.o(15537178411008L, 115761);
  }
  
  private List<WxaAttributes.b.a> e(JSONArray paramJSONArray)
  {
    GMTrace.i(20075616665600L, 149575);
    Object localObject;
    if (paramJSONArray != null)
    {
      ArrayList localArrayList = new ArrayList();
      try
      {
        int j = paramJSONArray.length();
        int i = 0;
        for (;;)
        {
          localObject = localArrayList;
          if (i >= j) {
            break;
          }
          localObject = paramJSONArray.getJSONObject(i);
          WxaAttributes.b.a locala = new WxaAttributes.b.a();
          locala.name = ((JSONObject)localObject).optString("name", "");
          locala.type = ((JSONObject)localObject).optInt("type");
          JSONObject localJSONObject = new JSONObject(((JSONObject)localObject).optString("value", ""));
          locala.userName = localJSONObject.optString("userName", "");
          locala.eAw = localJSONObject.optString("pagePath", "");
          locala.version = localJSONObject.optInt("version");
          locala.hRQ = e(((JSONObject)localObject).optJSONArray("sub_button_list"));
          localArrayList.add(locala);
          i += 1;
        }
        localObject = null;
      }
      catch (JSONException paramJSONArray)
      {
        GMTrace.o(20075616665600L, 149575);
        return null;
      }
    }
    GMTrace.o(20075616665600L, 149575);
    return (List<WxaAttributes.b.a>)localObject;
  }
  
  public final a UD()
  {
    GMTrace.i(15537446846464L, 115763);
    if ((this.hRC == null) && (!bg.nm(this.field_appInfo))) {}
    try
    {
      localObject = new JSONObject(this.field_appInfo);
      this.hRC = new a();
      JSONObject localJSONObject = ((JSONObject)localObject).optJSONObject("RunningFlagInfo");
      if (localJSONObject != null)
      {
        this.hRC.hML = localJSONObject.optLong("RunningFlag");
        this.hRC.hRH = localJSONObject.optString("AppOpenForbiddenUrl");
      }
      localJSONObject = ((JSONObject)localObject).optJSONObject("Network");
      if (localJSONObject != null)
      {
        this.hRC.hRJ = s.f(localJSONObject.optJSONArray("RequestDomain"));
        this.hRC.hRK = s.f(localJSONObject.optJSONArray("WsRequestDomain"));
        this.hRC.hRL = s.f(localJSONObject.optJSONArray("UploadDomain"));
        this.hRC.hRM = s.f(localJSONObject.optJSONArray("DownloadDomain"));
      }
      this.hRC.hRN = ((JSONObject)localObject).optString("Template");
      this.hRC.hRI = ((JSONObject)localObject).optInt("WechatPluginApp", 0);
      this.hRC.hRO = ((JSONObject)localObject).optString("fromBusinessUsername");
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject;
        this.hRC = null;
      }
    }
    localObject = this.hRC;
    GMTrace.o(15537446846464L, 115763);
    return (a)localObject;
  }
  
  public final c UE()
  {
    int i = 0;
    GMTrace.i(15537581064192L, 115764);
    if (this.hRD == null) {
      try
      {
        Object localObject1 = new JSONObject(this.field_dynamicInfo);
        Object localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new JSONObject();
        }
        this.hRD = new c();
        Object localObject3 = ((JSONObject)localObject2).optJSONObject("NewSetting");
        localObject1 = localObject3;
        if (localObject3 == null) {
          localObject1 = new JSONObject();
        }
        this.hRD.hRR.hRT = ((JSONObject)localObject1).optInt("MaxLocalstorageSize", 5);
        this.hRD.hRR.hRU = ((JSONObject)localObject1).optInt("MaxCodeSize", 5);
        this.hRD.hRR.hQP = ((JSONObject)localObject1).optInt("ExpendedMaxWebviewDepth", 5);
        this.hRD.hRR.hQQ = ((JSONObject)localObject1).optInt("MaxBackgroundLifespan", 600);
        this.hRD.hRR.hQR = ((JSONObject)localObject1).optInt("MaxRequestConcurrent", 5);
        this.hRD.hRR.hQS = ((JSONObject)localObject1).optInt("MaxUploadConcurrent", 5);
        this.hRD.hRR.hQT = ((JSONObject)localObject1).optInt("MaxDownloadConcurrent", 5);
        this.hRD.hRR.hQU = ((JSONObject)localObject1).optInt("MaxWebsocketConnect", 2);
        this.hRD.hRR.hRV = ((JSONObject)localObject1).optInt("MaxFileStorageSize", 10);
        this.hRD.hRR.hRW = ((JSONObject)localObject1).optInt("BackgroundNetworkInterruptedTimeout", 5);
        localObject3 = this.hRD.hRR;
        if (((JSONObject)localObject1).optInt("CanKeepAliveByAudioPlay", 0) > 0)
        {
          bool = true;
          ((WxaAttributes.c.a)localObject3).hRd = bool;
          this.hRD.hRR.hRe = ((JSONObject)localObject1).optInt("LifeSpanBeforeSuspend", 5);
          this.hRD.hRR.hRf = ((JSONObject)localObject1).optInt("LifeSpanAfterSuspend", 300);
          localObject1 = ((JSONObject)localObject2).optJSONArray("NewCategories");
          if (localObject1 == null) {
            break label433;
          }
          this.hRD.hRS = new LinkedList();
          while (i < ((JSONArray)localObject1).length())
          {
            localObject2 = ((JSONArray)localObject1).optJSONObject(i);
            if (localObject2 != null) {
              this.hRD.hRS.add(new Pair(((JSONObject)localObject2).optString("first"), ((JSONObject)localObject2).optString("second")));
            }
            i += 1;
          }
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          localc = null;
          continue;
          boolean bool = false;
        }
      }
    }
    label433:
    c localc = this.hRD;
    GMTrace.o(15537581064192L, 115764);
    return localc;
  }
  
  public final d UF()
  {
    GMTrace.i(15537715281920L, 115765);
    if ((this.hRE == null) && (!bg.nm(this.field_versionInfo))) {}
    try
    {
      Object localObject = new JSONObject(this.field_versionInfo);
      this.hRE = new d();
      this.hRE.eVc = ((JSONObject)localObject).optInt("AppVersion", 0);
      this.hRE.hRY = ((JSONObject)localObject).optInt("VersionState", -1);
      this.hRE.hIw = ((JSONObject)localObject).optString("VersionMD5");
      localObject = this.hRE;
      GMTrace.o(15537715281920L, 115765);
      return (d)localObject;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        this.hRE = null;
      }
    }
  }
  
  public final List<WxaEntryInfo> UG()
  {
    GMTrace.i(15537849499648L, 115766);
    if ((this.hRF == null) && (!bg.nm(this.field_bindWxaInfo))) {
      try
      {
        JSONArray localJSONArray = new JSONObject(this.field_bindWxaInfo).optJSONArray("bizEntryInfo");
        if (localJSONArray != null)
        {
          this.hRF = new LinkedList();
          int i = 0;
          while (i < localJSONArray.length())
          {
            JSONObject localJSONObject = localJSONArray.optJSONObject(i);
            if (localJSONObject != null)
            {
              String str = localJSONObject.optString("username");
              if (!bg.nm(str))
              {
                WxaEntryInfo localWxaEntryInfo = new WxaEntryInfo();
                localWxaEntryInfo.username = str;
                localWxaEntryInfo.title = localJSONObject.optString("title");
                localWxaEntryInfo.iconUrl = localJSONObject.optString("icon_url");
                this.hRF.add(localWxaEntryInfo);
              }
            }
            i += 1;
          }
        }
        localList = this.hRF;
      }
      catch (Exception localException)
      {
        this.hRF = null;
      }
    }
    List localList;
    GMTrace.o(15537849499648L, 115766);
    return localList;
  }
  
  public final b UH()
  {
    GMTrace.i(20075482447872L, 149574);
    if ((this.hRG == null) && (!bg.nm(this.field_bizMenu))) {}
    try
    {
      Object localObject = new JSONObject(this.field_bizMenu);
      this.hRG = new b();
      this.hRG.gwj = ((JSONObject)localObject).optInt("interactive_mode", 0);
      this.hRG.type = ((JSONObject)localObject).optInt("type", 0);
      this.hRG.hRP = e(((JSONObject)localObject).optJSONArray("button_list"));
      localObject = this.hRG;
      GMTrace.o(20075482447872L, 149574);
      return (b)localObject;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        this.hRG = null;
      }
    }
  }
  
  public final String toString()
  {
    GMTrace.i(18659485417472L, 139024);
    String str = "WxaAttributes{field_username='" + this.field_username + '\'' + ", field_appId='" + this.field_appId + '\'' + ", field_nickname='" + this.field_nickname + '\'' + ", field_brandIconURL='" + this.field_brandIconURL + '\'' + ", field_roundedSquareIconURL='" + this.field_roundedSquareIconURL + '\'' + ", field_bigHeadURL='" + this.field_bigHeadURL + '\'' + ", field_smallHeadURL='" + this.field_smallHeadURL + '\'' + ", field_signature='" + this.field_signature + '\'' + ", field_appOpt=" + this.field_appOpt + ", field_registerSource='" + this.field_registerSource + '\'' + ", field_appInfo='" + this.field_appInfo + '\'' + ", field_versionInfo='" + this.field_versionInfo + '\'' + ", field_bindWxaInfo='" + this.field_bindWxaInfo + '\'' + ", field_dynamicInfo='" + this.field_dynamicInfo + '\'' + ", field_bizMenu='" + this.field_bizMenu + '\'' + '}';
    GMTrace.o(18659485417472L, 139024);
    return str;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(15537312628736L, 115762);
    c.a locala = hIP;
    GMTrace.o(15537312628736L, 115762);
    return locala;
  }
  
  public static final class WxaEntryInfo
    implements Parcelable
  {
    public static final Parcelable.Creator<WxaEntryInfo> CREATOR;
    public String hRX;
    public String iconUrl;
    public String title;
    public String username;
    
    static
    {
      GMTrace.i(17509910577152L, 130459);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(17509910577152L, 130459);
    }
    
    public WxaEntryInfo()
    {
      GMTrace.i(17509642141696L, 130457);
      GMTrace.o(17509642141696L, 130457);
    }
    
    protected WxaEntryInfo(Parcel paramParcel)
    {
      GMTrace.i(17509776359424L, 130458);
      this.username = paramParcel.readString();
      this.title = paramParcel.readString();
      this.hRX = paramParcel.readString();
      this.iconUrl = paramParcel.readString();
      GMTrace.o(17509776359424L, 130458);
    }
    
    public final int describeContents()
    {
      GMTrace.i(17509373706240L, 130455);
      GMTrace.o(17509373706240L, 130455);
      return 0;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(17509507923968L, 130456);
      paramParcel.writeString(this.username);
      paramParcel.writeString(this.title);
      paramParcel.writeString(this.hRX);
      paramParcel.writeString(this.iconUrl);
      GMTrace.o(17509507923968L, 130456);
    }
  }
  
  public static final class a
  {
    public long hML;
    public String hRH;
    public int hRI;
    public List<String> hRJ;
    public List<String> hRK;
    public List<String> hRL;
    public List<String> hRM;
    public String hRN;
    public String hRO;
    
    public a()
    {
      GMTrace.i(15536775757824L, 115758);
      this.hML = 0L;
      this.hRI = 0;
      GMTrace.o(15536775757824L, 115758);
    }
  }
  
  public static final class b
  {
    public int gwj;
    public List<a> hRP;
    public int type;
    
    public b()
    {
      GMTrace.i(20075885101056L, 149577);
      GMTrace.o(20075885101056L, 149577);
    }
    
    public static final class a
    {
      public String eAw;
      public List<a> hRQ;
      public String name;
      public int type;
      public String userName;
      public int version;
      
      public a()
      {
        GMTrace.i(20075750883328L, 149576);
        GMTrace.o(20075750883328L, 149576);
      }
    }
  }
  
  public static final class c
  {
    public a hRR;
    public List<Pair<String, String>> hRS;
    
    public c()
    {
      GMTrace.i(15539325894656L, 115777);
      this.hRR = new a();
      GMTrace.o(15539325894656L, 115777);
    }
    
    public static final class a
    {
      public int hQP;
      public int hQQ;
      public int hQR;
      public int hQS;
      public int hQT;
      public int hQU;
      public int hRT;
      public int hRU;
      public int hRV;
      public int hRW;
      public boolean hRd;
      public int hRe;
      public int hRf;
      
      public a()
      {
        GMTrace.i(15539728547840L, 115780);
        GMTrace.o(15539728547840L, 115780);
      }
    }
  }
  
  public static final class d
  {
    public int eVc;
    public String hIw;
    public int hRY;
    
    public d()
    {
      GMTrace.i(15539460112384L, 115778);
      GMTrace.o(15539460112384L, 115778);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\appbrand\config\WxaAttributes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */