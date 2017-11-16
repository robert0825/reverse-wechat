package com.tencent.mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class AppBrandGlobalSystemConfig
  implements Parcelable
{
  public static final Parcelable.Creator<AppBrandGlobalSystemConfig> CREATOR;
  private static volatile AppBrandGlobalSystemConfig hPY;
  private static final AppBrandGlobalSystemConfig hPZ;
  public int hQa;
  public int hQb;
  public int hQc;
  public int hQd;
  public int hQe;
  public String hQf;
  public HttpSetting hQg;
  public int[] hQh;
  public int hQi;
  public int hQj;
  public int hQk;
  public int hQl;
  public int hQm;
  public int hQn;
  
  static
  {
    GMTrace.i(10573538394112L, 78779);
    AppBrandGlobalSystemConfig localAppBrandGlobalSystemConfig = new AppBrandGlobalSystemConfig();
    hPZ = localAppBrandGlobalSystemConfig;
    localAppBrandGlobalSystemConfig.hQb = 5;
    hPZ.hQc = 300;
    hPZ.hQd = 10;
    hPZ.hQe = 1048576;
    hPZ.hQh = a.hQo;
    hPZ.hQi = 10;
    hPZ.hQj = 1800;
    hPZ.hQk = 307200;
    hPZ.hQl = 25;
    hPZ.hQm = 10485760;
    hPZ.hQn = 314572800;
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10573538394112L, 78779);
  }
  
  private AppBrandGlobalSystemConfig()
  {
    GMTrace.i(10572867305472L, 78774);
    this.hQa = Integer.MAX_VALUE;
    GMTrace.o(10572867305472L, 78774);
  }
  
  public AppBrandGlobalSystemConfig(Parcel paramParcel)
  {
    GMTrace.i(10573269958656L, 78777);
    this.hQa = Integer.MAX_VALUE;
    this.hQa = paramParcel.readInt();
    this.hQb = paramParcel.readInt();
    this.hQc = paramParcel.readInt();
    this.hQd = paramParcel.readInt();
    this.hQe = paramParcel.readInt();
    this.hQf = paramParcel.readString();
    this.hQg = ((HttpSetting)paramParcel.readParcelable(HttpSetting.class.getClassLoader()));
    this.hQh = paramParcel.createIntArray();
    this.hQm = paramParcel.readInt();
    this.hQn = paramParcel.readInt();
    GMTrace.o(10573269958656L, 78777);
  }
  
  static void Ur()
  {
    try
    {
      GMTrace.i(18346758111232L, 136694);
      hPY = null;
      GMTrace.o(18346758111232L, 136694);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  static String Us()
  {
    GMTrace.i(20049712644096L, 149382);
    Object localObject = new File(e.ghw.replace("/data/user/0", "/data/data"), "wxaapp/res/");
    if (!((File)localObject).exists()) {
      ((File)localObject).mkdirs();
    }
    localObject = new File((File)localObject, "AppService.conf").getAbsolutePath();
    GMTrace.o(20049712644096L, 149382);
    return (String)localObject;
  }
  
  /* Error */
  private static AppBrandGlobalSystemConfig Ut()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_0
    //   2: ldc 2
    //   4: monitorenter
    //   5: ldc2_w 185
    //   8: ldc -69
    //   10: invokestatic 51	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   13: getstatic 137	com/tencent/mm/plugin/appbrand/config/AppBrandGlobalSystemConfig:hPY	Lcom/tencent/mm/plugin/appbrand/config/AppBrandGlobalSystemConfig;
    //   16: astore_1
    //   17: aload_1
    //   18: ifnonnull +112 -> 130
    //   21: invokestatic 189	com/tencent/mm/plugin/appbrand/config/AppBrandGlobalSystemConfig:Us	()Ljava/lang/String;
    //   24: invokestatic 195	com/tencent/mm/a/e:be	(Ljava/lang/String;)Ljava/lang/String;
    //   27: astore_1
    //   28: aload_1
    //   29: invokestatic 201	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   32: ifeq +91 -> 123
    //   35: aconst_null
    //   36: astore_1
    //   37: ldc2_w 185
    //   40: ldc -69
    //   42: invokestatic 91	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   45: ldc 2
    //   47: monitorexit
    //   48: aload_1
    //   49: areturn
    //   50: astore_1
    //   51: getstatic 207	com/tencent/mm/pluginsdk/j/a/b/b$c:tqk	Lcom/tencent/mm/pluginsdk/j/a/b/b;
    //   54: astore_1
    //   55: getstatic 207	com/tencent/mm/pluginsdk/j/a/b/b$c:tqk	Lcom/tencent/mm/pluginsdk/j/a/b/b;
    //   58: astore_2
    //   59: getstatic 213	com/tencent/mm/pluginsdk/j/a/d/o$a:trx	Lcom/tencent/mm/pluginsdk/j/a/d/o;
    //   62: bipush 38
    //   64: iconst_1
    //   65: invokestatic 219	com/tencent/mm/pluginsdk/j/a/b/i:dU	(II)Ljava/lang/String;
    //   68: invokevirtual 225	com/tencent/mm/pluginsdk/j/a/d/o:OO	(Ljava/lang/String;)Lcom/tencent/mm/pluginsdk/j/a/d/q;
    //   71: astore_2
    //   72: aload_2
    //   73: ifnonnull +17 -> 90
    //   76: aload_1
    //   77: bipush 38
    //   79: iconst_1
    //   80: iload_0
    //   81: iconst_0
    //   82: invokevirtual 231	com/tencent/mm/pluginsdk/j/a/b/b:e	(IIIZ)V
    //   85: aconst_null
    //   86: astore_1
    //   87: goto -59 -> 28
    //   90: aload_2
    //   91: getfield 236	com/tencent/mm/pluginsdk/j/a/d/q:field_fileVersion	Ljava/lang/String;
    //   94: iconst_0
    //   95: invokestatic 240	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   98: istore_0
    //   99: goto -23 -> 76
    //   102: astore_1
    //   103: ldc -14
    //   105: ldc -12
    //   107: iconst_1
    //   108: anewarray 4	java/lang/Object
    //   111: dup
    //   112: iconst_0
    //   113: aload_1
    //   114: aastore
    //   115: invokestatic 249	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   118: aconst_null
    //   119: astore_1
    //   120: goto -92 -> 28
    //   123: aload_1
    //   124: invokestatic 253	com/tencent/mm/plugin/appbrand/config/AppBrandGlobalSystemConfig:ph	(Ljava/lang/String;)Lcom/tencent/mm/plugin/appbrand/config/AppBrandGlobalSystemConfig;
    //   127: putstatic 137	com/tencent/mm/plugin/appbrand/config/AppBrandGlobalSystemConfig:hPY	Lcom/tencent/mm/plugin/appbrand/config/AppBrandGlobalSystemConfig;
    //   130: getstatic 137	com/tencent/mm/plugin/appbrand/config/AppBrandGlobalSystemConfig:hPY	Lcom/tencent/mm/plugin/appbrand/config/AppBrandGlobalSystemConfig;
    //   133: astore_1
    //   134: ldc2_w 185
    //   137: ldc -69
    //   139: invokestatic 91	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   142: goto -97 -> 45
    //   145: astore_1
    //   146: ldc 2
    //   148: monitorexit
    //   149: aload_1
    //   150: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   1	98	0	i	int
    //   16	33	1	localObject1	Object
    //   50	1	1	localFileNotFoundException	java.io.FileNotFoundException
    //   54	33	1	localb	com.tencent.mm.pluginsdk.j.a.b.b
    //   102	12	1	localIOException	java.io.IOException
    //   119	15	1	localObject2	Object
    //   145	5	1	localObject3	Object
    //   58	33	2	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   21	28	50	java/io/FileNotFoundException
    //   21	28	102	java/io/IOException
    //   5	17	145	finally
    //   21	28	145	finally
    //   28	35	145	finally
    //   37	45	145	finally
    //   51	72	145	finally
    //   76	85	145	finally
    //   90	99	145	finally
    //   103	118	145	finally
    //   123	130	145	finally
    //   130	142	145	finally
  }
  
  public static AppBrandGlobalSystemConfig Uu()
  {
    GMTrace.i(10572598870016L, 78772);
    AppBrandGlobalSystemConfig localAppBrandGlobalSystemConfig = Ut();
    if (localAppBrandGlobalSystemConfig == null)
    {
      localAppBrandGlobalSystemConfig = hPZ;
      GMTrace.o(10572598870016L, 78772);
      return localAppBrandGlobalSystemConfig;
    }
    GMTrace.o(10572598870016L, 78772);
    return localAppBrandGlobalSystemConfig;
  }
  
  private static AppBrandGlobalSystemConfig ph(String paramString)
  {
    GMTrace.i(10572733087744L, 78773);
    w.d("MicroMsg.AppBrandGlobalSystemConfig", "parse json = %s", new Object[] { paramString });
    AppBrandGlobalSystemConfig localAppBrandGlobalSystemConfig;
    Object localObject2;
    int i;
    try
    {
      paramString = new JSONObject(paramString);
      localAppBrandGlobalSystemConfig = new AppBrandGlobalSystemConfig();
      localObject1 = paramString.optJSONObject("HTTPSetting");
      if (localObject1 == null) {
        break label349;
      }
      localAppBrandGlobalSystemConfig.hQg = new HttpSetting();
      localObject2 = ((JSONObject)localObject1).optString("HTTPHeaderMode", "");
      if (((String)localObject2).equals("BlackList")) {
        localAppBrandGlobalSystemConfig.hQg.mode = 1;
      }
      for (;;)
      {
        localObject2 = ((JSONObject)localObject1).optJSONArray("HeaderBlackList");
        if (localObject2 == null) {
          break;
        }
        localAppBrandGlobalSystemConfig.hQg.hQp = new ArrayList();
        i = 0;
        while (i < ((JSONArray)localObject2).length())
        {
          localAppBrandGlobalSystemConfig.hQg.hQp.add(((JSONArray)localObject2).getString(i));
          i += 1;
        }
        if (((String)localObject2).equals("WhiteList")) {
          localAppBrandGlobalSystemConfig.hQg.mode = 2;
        }
      }
      localObject2 = ((JSONObject)localObject1).optJSONArray("HeaderWhiteList");
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.AppBrandGlobalSystemConfig", "parse exception = %s", new Object[] { bg.f(paramString) });
      GMTrace.o(10572733087744L, 78773);
      return null;
    }
    if (localObject2 != null)
    {
      localAppBrandGlobalSystemConfig.hQg.hQq = new ArrayList();
      i = 0;
      while (i < ((JSONArray)localObject2).length())
      {
        localAppBrandGlobalSystemConfig.hQg.hQq.add(((JSONArray)localObject2).getString(i));
        i += 1;
      }
    }
    localAppBrandGlobalSystemConfig.hQg.hQr = ((JSONObject)localObject1).optInt("WebsocketMaxTimeoutMS", -1);
    localAppBrandGlobalSystemConfig.hQg.hQs = ((JSONObject)localObject1).optInt("UploadMaxTimeoutMS", -1);
    localAppBrandGlobalSystemConfig.hQg.hQt = ((JSONObject)localObject1).optInt("DownloadMaxTimeoutMS", -1);
    localAppBrandGlobalSystemConfig.hQg.hQu = ((JSONObject)localObject1).optInt("RequestMaxTimeoutMS", -1);
    localAppBrandGlobalSystemConfig.hQg.hQv = ((JSONObject)localObject1).optString("HTTPHeaderReferer");
    label349:
    localAppBrandGlobalSystemConfig.hQf = paramString.optString("CDNBaseURL");
    localAppBrandGlobalSystemConfig.hQb = paramString.optInt("AppMaxRunningCount", 5);
    localAppBrandGlobalSystemConfig.hQc = paramString.optInt("TempFileSizeLimitTotal", 300);
    localAppBrandGlobalSystemConfig.hQd = paramString.optInt("DownloadFileSizeLimit", 10);
    localAppBrandGlobalSystemConfig.hQe = paramString.optInt("MaxLocalStorageItemSize", 1048576);
    localAppBrandGlobalSystemConfig.hQm = paramString.optInt("NativeBufferSizeLimitByte", 10485760);
    localAppBrandGlobalSystemConfig.hQn = paramString.optInt("NativeBufferQueueLimitByte", 314572800);
    Object localObject1 = paramString.optJSONArray("SyncLaunchSceneList");
    if (localObject1 != null)
    {
      localAppBrandGlobalSystemConfig.hQh = new int[((JSONArray)localObject1).length()];
      i = 0;
      while (i < ((JSONArray)localObject1).length())
      {
        localAppBrandGlobalSystemConfig.hQh[i] = ((JSONArray)localObject1).optInt(i, 0);
        i += 1;
      }
    }
    if (localAppBrandGlobalSystemConfig.hQh == null) {
      localAppBrandGlobalSystemConfig.hQh = a.hQo;
    }
    localAppBrandGlobalSystemConfig.hQi = paramString.optInt("StarNumberLimitation", 10);
    localAppBrandGlobalSystemConfig.hQj = paramString.optInt("WidgetImageFlowLimitDuration", 1800);
    localAppBrandGlobalSystemConfig.hQk = paramString.optInt("WidgetImageFlowLimitMaxSize", 307200);
    localAppBrandGlobalSystemConfig.hQl = paramString.optInt("WidgetDrawMinInterval", 25);
    GMTrace.o(10572733087744L, 78773);
    return localAppBrandGlobalSystemConfig;
  }
  
  public final int describeContents()
  {
    GMTrace.i(10573001523200L, 78775);
    GMTrace.o(10573001523200L, 78775);
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(10573135740928L, 78776);
    paramParcel.writeInt(this.hQa);
    paramParcel.writeInt(this.hQb);
    paramParcel.writeInt(this.hQc);
    paramParcel.writeInt(this.hQd);
    paramParcel.writeInt(this.hQe);
    paramParcel.writeString(this.hQf);
    paramParcel.writeParcelable(this.hQg, paramInt);
    paramParcel.writeIntArray(this.hQh);
    paramParcel.writeInt(this.hQm);
    paramParcel.writeInt(this.hQn);
    GMTrace.o(10573135740928L, 78776);
  }
  
  public static final class HttpSetting
    implements Parcelable
  {
    public static final Parcelable.Creator<HttpSetting> CREATOR;
    public ArrayList<String> hQp;
    public ArrayList<String> hQq;
    public int hQr;
    public int hQs;
    public int hQt;
    public int hQu;
    public String hQv;
    public int mode;
    
    static
    {
      GMTrace.i(10571525128192L, 78764);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(10571525128192L, 78764);
    }
    
    public HttpSetting()
    {
      GMTrace.i(10570988257280L, 78760);
      GMTrace.o(10570988257280L, 78760);
    }
    
    HttpSetting(Parcel paramParcel)
    {
      GMTrace.i(10571390910464L, 78763);
      this.mode = paramParcel.readInt();
      this.hQp = paramParcel.createStringArrayList();
      this.hQq = paramParcel.createStringArrayList();
      this.hQr = paramParcel.readInt();
      this.hQs = paramParcel.readInt();
      this.hQt = paramParcel.readInt();
      this.hQu = paramParcel.readInt();
      this.hQv = paramParcel.readString();
      GMTrace.o(10571390910464L, 78763);
    }
    
    public final int describeContents()
    {
      GMTrace.i(10571122475008L, 78761);
      GMTrace.o(10571122475008L, 78761);
      return 0;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(10571256692736L, 78762);
      paramParcel.writeInt(this.mode);
      paramParcel.writeStringList(this.hQp);
      paramParcel.writeStringList(this.hQq);
      paramParcel.writeInt(this.hQr);
      paramParcel.writeInt(this.hQs);
      paramParcel.writeInt(this.hQt);
      paramParcel.writeInt(this.hQu);
      paramParcel.writeString(this.hQv);
      GMTrace.o(10571256692736L, 78762);
    }
  }
  
  public static abstract interface a
  {
    public static final int[] hQo;
    
    static
    {
      GMTrace.i(15538117935104L, 115768);
      hQo = new int[0];
      GMTrace.o(15538117935104L, 115768);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\config\AppBrandGlobalSystemConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */