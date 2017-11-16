package com.tencent.mm.plugin.appbrand.h;

import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.HttpSetting;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.config.a.b;
import com.tencent.mm.protocal.c.ane;
import com.tencent.mm.sdk.platformtools.bg;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import org.json.JSONObject;

public enum i
{
  static
  {
    GMTrace.i(10672859512832L, 79519);
    its = new i[0];
    GMTrace.o(10672859512832L, 79519);
  }
  
  public static int a(AppBrandSysConfig paramAppBrandSysConfig, com.tencent.mm.plugin.appbrand.config.a parama, int paramInt)
  {
    int k = 0;
    GMTrace.i(10672322641920L, 79515);
    int i;
    int j;
    switch (paramInt)
    {
    default: 
      i = 0;
      paramInt = 0;
      if ((paramInt > 0) && (i <= 0))
      {
        j = paramInt;
        GMTrace.o(10672322641920L, 79515);
        return j;
      }
      break;
    case 0: 
      label59:
      i = parama.hPB.eXU;
      if ((paramAppBrandSysConfig.hRh == null) || (paramAppBrandSysConfig.hRh.hQg == null)) {}
      break;
    }
    for (paramInt = paramAppBrandSysConfig.hRh.hQg.hQr;; paramInt = 0)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandNetworkUtil", "request apptimeout %d, systimeout %d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) });
      j = paramInt;
      paramInt = i;
      i = j;
      break;
      i = parama.hPB.hPF;
      if ((paramAppBrandSysConfig.hRh != null) && (paramAppBrandSysConfig.hRh.hQg != null)) {}
      for (paramInt = paramAppBrandSysConfig.hRh.hQg.hQr;; paramInt = 0)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandNetworkUtil", "socket apptimeout %d, systimeout %d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) });
        j = paramInt;
        paramInt = i;
        i = j;
        break;
        i = parama.hPB.hPH;
        if ((paramAppBrandSysConfig.hRh != null) && (paramAppBrandSysConfig.hRh.hQg != null)) {}
        for (paramInt = paramAppBrandSysConfig.hRh.hQg.hQt;; paramInt = 0)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandNetworkUtil", "download apptimeout %d, systimeout %d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) });
          j = paramInt;
          paramInt = i;
          i = j;
          break;
          i = parama.hPB.hPG;
          if ((paramAppBrandSysConfig.hRh != null) && (paramAppBrandSysConfig.hRh.hQg != null)) {}
          for (paramInt = paramAppBrandSysConfig.hRh.hQg.hQs;; paramInt = 0)
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandNetworkUtil", "upload apptimeout %d, systimeout %d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) });
            j = paramInt;
            paramInt = i;
            i = j;
            break;
            if ((paramInt <= 0) && (i > 0))
            {
              j = i;
              break label59;
            }
            j = k;
            if (paramInt <= 0) {
              break label59;
            }
            j = k;
            if (i <= 0) {
              break label59;
            }
            j = Math.min(paramInt, i);
            break label59;
          }
        }
      }
    }
  }
  
  public static Map<String, String> a(JSONObject paramJSONObject, AppBrandSysConfig paramAppBrandSysConfig)
  {
    GMTrace.i(10672188424192L, 79514);
    paramJSONObject = o(paramJSONObject);
    Object localObject1 = paramJSONObject;
    Object localObject2;
    if (paramAppBrandSysConfig.hRh != null)
    {
      localObject2 = paramAppBrandSysConfig.hRh.hQg;
      localObject1 = paramJSONObject;
      if (localObject2 != null)
      {
        if (((AppBrandGlobalSystemConfig.HttpSetting)localObject2).mode != 1) {
          break label299;
        }
        localObject1 = paramJSONObject;
        if (((AppBrandGlobalSystemConfig.HttpSetting)localObject2).hQp != null)
        {
          localObject1 = ((AppBrandGlobalSystemConfig.HttpSetting)localObject2).hQp;
          if ((localObject1 != null) && (!((ArrayList)localObject1).isEmpty())) {
            break label226;
          }
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandNetworkUtil", "filterHttpHeaderBlackList fail, headerMap is null or blacklist is null or nil.");
        }
      }
    }
    for (;;)
    {
      localObject1 = paramJSONObject;
      label226:
      String str1;
      label299:
      do
      {
        do
        {
          ((Map)localObject1).remove("referer");
          localObject2 = "";
          paramJSONObject = (JSONObject)localObject2;
          if (paramAppBrandSysConfig.hRh != null)
          {
            paramJSONObject = (JSONObject)localObject2;
            if (paramAppBrandSysConfig.hRh.hQg != null) {
              paramJSONObject = paramAppBrandSysConfig.hRh.hQg.hQv;
            }
          }
          localObject2 = paramJSONObject;
          if (bg.nm(paramJSONObject)) {
            localObject2 = "servicewechat.com";
          }
          paramJSONObject = new StringBuilder();
          paramJSONObject.append("https://");
          paramJSONObject.append((String)localObject2);
          paramJSONObject.append("/");
          paramJSONObject.append(paramAppBrandSysConfig.appId);
          paramJSONObject.append("/");
          paramJSONObject.append(com.tencent.mm.plugin.appbrand.a.nK(paramAppBrandSysConfig.appId).hRg.hKC);
          paramJSONObject.append("/page-frame.html");
          ((Map)localObject1).put("referer", paramJSONObject.toString());
          GMTrace.o(10672188424192L, 79514);
          return (Map<String, String>)localObject1;
          localObject1 = ((ArrayList)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (String)((Iterator)localObject1).next();
            if (localObject2 != null)
            {
              localObject2 = ((String)localObject2).toLowerCase();
              str1 = (String)paramJSONObject.remove(localObject2);
              if (str1 != null) {
                com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AppBrandNetworkUtil", "remove key %s value %s", new Object[] { localObject2, str1 });
              }
            }
          }
          break;
          localObject1 = paramJSONObject;
        } while (((AppBrandGlobalSystemConfig.HttpSetting)localObject2).mode != 2);
        localObject1 = paramJSONObject;
      } while (((AppBrandGlobalSystemConfig.HttpSetting)localObject2).hQq == null);
      localObject2 = ((AppBrandGlobalSystemConfig.HttpSetting)localObject2).hQq;
      if (localObject2 == null)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandNetworkUtil", "filterHttpHeaderWhiteList fail");
      }
      else
      {
        localObject1 = new HashMap();
        localObject2 = ((ArrayList)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          str1 = (String)((Iterator)localObject2).next();
          if (str1 != null)
          {
            str1 = str1.toLowerCase();
            String str2 = (String)paramJSONObject.get(str1);
            if (str2 != null)
            {
              com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AppBrandNetworkUtil", "add item, key(%s), value(%s)", new Object[] { str1, str2 });
              ((Map)localObject1).put(str1, str2);
            }
          }
        }
        paramJSONObject = (JSONObject)localObject1;
      }
    }
  }
  
  public static void a(HttpURLConnection paramHttpURLConnection, final ArrayList<String> paramArrayList)
  {
    GMTrace.i(15563082432512L, 115954);
    if (paramHttpURLConnection == null)
    {
      GMTrace.o(15563082432512L, 115954);
      return;
    }
    HostnameVerifier localHostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();
    ((HttpsURLConnection)paramHttpURLConnection).setHostnameVerifier(new HostnameVerifier()
    {
      public final boolean verify(String paramAnonymousString, SSLSession paramAnonymousSSLSession)
      {
        GMTrace.i(15564827262976L, 115967);
        if ((this.itt.verify(paramAnonymousString, paramAnonymousSSLSession)) || (i.b(paramArrayList, paramAnonymousString)))
        {
          GMTrace.o(15564827262976L, 115967);
          return true;
        }
        GMTrace.o(15564827262976L, 115967);
        return false;
      }
    });
    GMTrace.o(15563082432512L, 115954);
  }
  
  public static boolean a(AppBrandSysConfig paramAppBrandSysConfig, boolean paramBoolean)
  {
    GMTrace.i(20765764222976L, 154717);
    if (paramBoolean)
    {
      com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AppBrandNetworkUtil", "skipCheck Domains");
      GMTrace.o(20765764222976L, 154717);
      return false;
    }
    if (((paramAppBrandSysConfig.hRg.hKB != 1) && (paramAppBrandSysConfig.hRg.hKB != 2)) || (!paramAppBrandSysConfig.hQL))
    {
      GMTrace.o(20765764222976L, 154717);
      return true;
    }
    GMTrace.o(20765764222976L, 154717);
    return false;
  }
  
  public static boolean a(ArrayList<String> paramArrayList, String paramString)
  {
    GMTrace.i(10672054206464L, 79513);
    if (bg.nm(paramString))
    {
      GMTrace.o(10672054206464L, 79513);
      return false;
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandNetworkUtil", "url " + paramString);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandNetworkUtil", "configUrl size " + paramArrayList.size());
    Object localObject1 = ru(paramString);
    paramString = (String)((HashMap)localObject1).get("host");
    String str1 = (String)((HashMap)localObject1).get("scheme");
    localObject1 = (String)((HashMap)localObject1).get("port");
    if ((bg.nm(paramString)) || (bg.nm(str1)))
    {
      GMTrace.o(10672054206464L, 79513);
      return false;
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandNetworkUtil", "host %s  scheme %s port %s", new Object[] { paramString, str1, localObject1 });
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      String str2 = (String)paramArrayList.next();
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandNetworkUtil", "configUrl " + str2);
      Object localObject2 = ru(str2);
      str2 = (String)((HashMap)localObject2).get("host");
      String str3 = (String)((HashMap)localObject2).get("scheme");
      localObject2 = (String)((HashMap)localObject2).get("port");
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandNetworkUtil", "confighost %s  configscheme %s configport %s", new Object[] { str2, str3, localObject2 });
      if ((paramString.equalsIgnoreCase(str2)) && (str1.equalsIgnoreCase(str3)) && (((String)localObject1).equalsIgnoreCase((String)localObject2)))
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandNetworkUtil", "match!!");
        GMTrace.o(10672054206464L, 79513);
        return true;
      }
    }
    GMTrace.o(10672054206464L, 79513);
    return false;
  }
  
  public static String c(HttpURLConnection paramHttpURLConnection)
  {
    GMTrace.i(10672591077376L, 79517);
    if (paramHttpURLConnection == null)
    {
      GMTrace.o(10672591077376L, 79517);
      return "";
    }
    URL localURL = paramHttpURLConnection.getURL();
    if (localURL == null)
    {
      GMTrace.o(10672591077376L, 79517);
      return "";
    }
    String str2 = paramHttpURLConnection.getHeaderField("Location");
    String str1 = str2;
    if (str2 == null) {
      str1 = paramHttpURLConnection.getHeaderField("location");
    }
    if (str1 == null)
    {
      GMTrace.o(10672591077376L, 79517);
      return null;
    }
    try
    {
      paramHttpURLConnection = localURL.toURI().resolve(str1).toString();
      GMTrace.o(10672591077376L, 79517);
      return paramHttpURLConnection;
    }
    catch (URISyntaxException paramHttpURLConnection)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandNetworkUtil", "resolve url error %s", new Object[] { paramHttpURLConnection.getMessage() });
      GMTrace.o(10672591077376L, 79517);
    }
    return str1;
  }
  
  public static boolean jd(int paramInt)
  {
    GMTrace.i(10672456859648L, 79516);
    if ((paramInt == 302) || (paramInt == 301))
    {
      GMTrace.o(10672456859648L, 79516);
      return true;
    }
    GMTrace.o(10672456859648L, 79516);
    return false;
  }
  
  private static Map<String, String> o(JSONObject paramJSONObject)
  {
    GMTrace.i(10671785771008L, 79511);
    localHashMap = new HashMap();
    try
    {
      paramJSONObject = paramJSONObject.optJSONObject("header");
      if (paramJSONObject != null)
      {
        Iterator localIterator = paramJSONObject.keys();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          if (str != null) {
            localHashMap.put(str.toLowerCase(), paramJSONObject.getString(str));
          }
        }
      }
      return localHashMap;
    }
    catch (Exception paramJSONObject)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandNetworkUtil", "get header error, exception : %s", new Object[] { paramJSONObject });
      GMTrace.o(10671785771008L, 79511);
    }
  }
  
  public static Map<String, String> p(JSONObject paramJSONObject)
  {
    GMTrace.i(10671919988736L, 79512);
    localHashMap = new HashMap();
    try
    {
      paramJSONObject = paramJSONObject.optJSONObject("formData");
      if (paramJSONObject != null)
      {
        Iterator localIterator = paramJSONObject.keys();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          localHashMap.put(str, paramJSONObject.getString(str));
        }
      }
      return localHashMap;
    }
    catch (Exception paramJSONObject)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandNetworkUtil", "get form error, exception : %s", new Object[] { paramJSONObject });
      GMTrace.o(10671919988736L, 79512);
    }
  }
  
  private static HashMap<String, String> ru(String paramString)
  {
    GMTrace.i(10671651553280L, 79510);
    String str = "";
    Object localObject3 = "";
    Object localObject1 = str;
    for (;;)
    {
      try
      {
        Object localObject4 = Uri.parse(paramString);
        localObject1 = str;
        paramString = ((Uri)localObject4).getHost();
        localObject1 = paramString;
        str = ((Uri)localObject4).getScheme();
        localObject1 = str;
        int i;
      }
      catch (Exception localException1)
      {
        try
        {
          i = ((Uri)localObject4).getPort();
          str = String.valueOf(i);
          localObject3 = new HashMap();
          ((HashMap)localObject3).put("host", paramString);
          ((HashMap)localObject3).put("scheme", localObject1);
          ((HashMap)localObject3).put("port", str);
          GMTrace.o(10671651553280L, 79510);
          return (HashMap<String, String>)localObject3;
        }
        catch (Exception localException2)
        {
          Object localObject2;
          for (;;) {}
        }
        localException1 = localException1;
        localObject4 = "";
        paramString = (String)localObject1;
        localObject1 = localObject4;
      }
      tmp123_120[0] = localException1.getMessage();
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandNetworkUtil", "message %s", tmp123_120);
      localObject2 = localObject3;
    }
  }
  
  public static SSLContext rv(String paramString)
  {
    GMTrace.i(15563216650240L, 115955);
    paramString = rw(paramString);
    if (paramString == null)
    {
      GMTrace.o(15563216650240L, 115955);
      return null;
    }
    try
    {
      SSLContext localSSLContext = SSLContext.getInstance("TLS");
      localSSLContext.init(null, new TrustManager[] { paramString }, null);
      GMTrace.o(15563216650240L, 115955);
      return localSSLContext;
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandNetworkUtil", "SSLContext init error: " + paramString);
      GMTrace.o(15563216650240L, 115955);
    }
    return null;
  }
  
  /* Error */
  public static l rw(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 445
    //   3: ldc_w 447
    //   6: invokestatic 20	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: invokestatic 451	com/tencent/mm/plugin/appbrand/h/i:rx	(Ljava/lang/String;)Ljava/util/LinkedList;
    //   13: astore_1
    //   14: aload_1
    //   15: invokevirtual 454	java/util/LinkedList:isEmpty	()Z
    //   18: ifeq +14 -> 32
    //   21: ldc2_w 445
    //   24: ldc_w 447
    //   27: invokestatic 25	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   30: aconst_null
    //   31: areturn
    //   32: new 456	com/tencent/mm/plugin/appbrand/h/l
    //   35: dup
    //   36: invokespecial 457	com/tencent/mm/plugin/appbrand/h/l:<init>	()V
    //   39: astore_0
    //   40: aload_1
    //   41: invokevirtual 458	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   44: astore_1
    //   45: aload_1
    //   46: invokeinterface 205 1 0
    //   51: ifeq +114 -> 165
    //   54: aload_1
    //   55: invokeinterface 209 1 0
    //   60: checkcast 460	java/io/InputStream
    //   63: astore_2
    //   64: aload_0
    //   65: getfield 464	com/tencent/mm/plugin/appbrand/h/l:itE	Ljava/security/KeyStore;
    //   68: ifnonnull +15 -> 83
    //   71: ldc_w 466
    //   74: ldc_w 468
    //   77: invokestatic 130	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   80: goto -35 -> 45
    //   83: ldc_w 470
    //   86: invokestatic 475	java/security/cert/CertificateFactory:getInstance	(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;
    //   89: astore_3
    //   90: aload_3
    //   91: aload_2
    //   92: invokevirtual 479	java/security/cert/CertificateFactory:generateCertificate	(Ljava/io/InputStream;)Ljava/security/cert/Certificate;
    //   95: astore_3
    //   96: aload_2
    //   97: invokevirtual 482	java/io/InputStream:close	()V
    //   100: aload_0
    //   101: getfield 464	com/tencent/mm/plugin/appbrand/h/l:itE	Ljava/security/KeyStore;
    //   104: new 154	java/lang/StringBuilder
    //   107: dup
    //   108: invokespecial 157	java/lang/StringBuilder:<init>	()V
    //   111: aload_3
    //   112: checkcast 484	java/security/cert/X509Certificate
    //   115: invokevirtual 488	java/security/cert/X509Certificate:getSubjectDN	()Ljava/security/Principal;
    //   118: invokevirtual 444	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   121: invokevirtual 192	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   124: aload_3
    //   125: invokevirtual 494	java/security/KeyStore:setCertificateEntry	(Ljava/lang/String;Ljava/security/cert/Certificate;)V
    //   128: goto -83 -> 45
    //   131: astore_2
    //   132: ldc_w 466
    //   135: new 154	java/lang/StringBuilder
    //   138: dup
    //   139: ldc_w 496
    //   142: invokespecial 276	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   145: aload_2
    //   146: invokevirtual 444	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   149: invokevirtual 192	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   152: invokestatic 130	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   155: goto -110 -> 45
    //   158: astore_3
    //   159: aload_2
    //   160: invokevirtual 482	java/io/InputStream:close	()V
    //   163: aload_3
    //   164: athrow
    //   165: aload_0
    //   166: invokevirtual 498	com/tencent/mm/plugin/appbrand/h/l:init	()V
    //   169: ldc2_w 445
    //   172: ldc_w 447
    //   175: invokestatic 25	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   178: aload_0
    //   179: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	180	0	paramString	String
    //   13	42	1	localObject1	Object
    //   63	34	2	localInputStream	InputStream
    //   131	29	2	localException	Exception
    //   89	36	3	localObject2	Object
    //   158	6	3	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   83	90	131	java/lang/Exception
    //   96	128	131	java/lang/Exception
    //   159	165	131	java/lang/Exception
    //   90	96	158	finally
  }
  
  private static LinkedList<InputStream> rx(String paramString)
  {
    GMTrace.i(15563485085696L, 115957);
    localLinkedList = new LinkedList();
    Object localObject = com.tencent.mm.plugin.appbrand.appcache.w.e(com.tencent.mm.plugin.appbrand.a.nI(paramString), "cer");
    if (localObject == null)
    {
      GMTrace.o(15563485085696L, 115957);
      return localLinkedList;
    }
    try
    {
      paramString = new ane();
      paramString.aD((byte[])localObject);
      localObject = paramString.uBX;
      if (localObject == null)
      {
        GMTrace.o(15563485085696L, 115957);
        return localLinkedList;
      }
      paramString = paramString.uBX.iterator();
      while (paramString.hasNext()) {
        localLinkedList.add(new ByteArrayInputStream(((b)paramString.next()).tJp));
      }
      return localLinkedList;
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandNetworkUtil", "parse error: " + paramString);
      GMTrace.o(15563485085696L, 115957);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\h\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */