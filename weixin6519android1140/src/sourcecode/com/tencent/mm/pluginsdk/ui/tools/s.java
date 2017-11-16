package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.util.Base64;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import android.widget.Toast;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.ag.a.h;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ar;
import com.tencent.mm.sdk.platformtools.ar.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.WebView;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import junit.framework.Assert;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.JSEXECUTECHECK})
public final class s
{
  private static ar hjb;
  private static final Pattern tIk;
  private static final Map<String, String> tIl;
  private static final Map<String, String> tIm;
  
  static
  {
    GMTrace.i(1078707879936L, 8037);
    hjb = null;
    tIk = Pattern.compile("data:(image|img)/\\S+;base64,\\S+");
    Object localObject = new ArrayList();
    ((ArrayList)localObject).add(new Pair("silk", "audio/silk"));
    ((ArrayList)localObject).add(new Pair("jpg", "image/jpg"));
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    localObject = ((ArrayList)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      Pair localPair = (Pair)((Iterator)localObject).next();
      localHashMap1.put(localPair.first, localPair.second);
      localHashMap2.put(localPair.second, localPair.first);
    }
    tIl = Collections.unmodifiableMap(localHashMap1);
    tIm = Collections.unmodifiableMap(localHashMap2);
    GMTrace.o(1078707879936L, 8037);
  }
  
  public static String OV(String paramString)
  {
    GMTrace.i(1078573662208L, 8036);
    if (bg.nm(paramString))
    {
      GMTrace.o(1078573662208L, 8036);
      return null;
    }
    String str2 = (String)tIm.get(paramString.toLowerCase());
    String str1 = str2;
    if (bg.nm(str2)) {
      str1 = MimeTypeMap.getSingleton().getExtensionFromMimeType(paramString);
    }
    GMTrace.o(1078573662208L, 8036);
    return str1;
  }
  
  public static boolean PI(String paramString)
  {
    GMTrace.i(1075352436736L, 8012);
    if (paramString == null)
    {
      GMTrace.o(1075352436736L, 8012);
      return false;
    }
    boolean bool = paramString.toLowerCase().contains(" MicroMessenger/".trim().toLowerCase());
    GMTrace.o(1075352436736L, 8012);
    return bool;
  }
  
  public static final String PJ(String paramString)
  {
    GMTrace.i(1076963049472L, 8024);
    if (!bg.nm(paramString)) {
      try
      {
        String str = URLEncoder.encode(paramString, "utf-8");
        GMTrace.o(1076963049472L, 8024);
        return str;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        w.e("MicroMsg.WebViewUtil", "URLEncode fail, throw : %s", new Object[] { localUnsupportedEncodingException.getMessage() });
      }
    }
    GMTrace.o(1076963049472L, 8024);
    return paramString;
  }
  
  public static final String PK(String paramString)
  {
    GMTrace.i(1077097267200L, 8025);
    if (!bg.nm(paramString))
    {
      try
      {
        byte[] arrayOfByte = paramString.getBytes("utf-8");
        paramString = arrayOfByte;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        for (;;)
        {
          paramString = paramString.getBytes();
          w.e("MicroMsg.WebViewUtil", "getBytes fail, throw : %s", new Object[] { localUnsupportedEncodingException.getMessage() });
        }
      }
      paramString = Base64.encodeToString(paramString, 2);
      GMTrace.o(1077097267200L, 8025);
      return paramString;
    }
    GMTrace.o(1077097267200L, 8025);
    return paramString;
  }
  
  public static String PL(String paramString)
  {
    GMTrace.i(1077499920384L, 8028);
    if (bg.nm(paramString))
    {
      GMTrace.o(1077499920384L, 8028);
      return null;
    }
    if (!tIk.matcher(paramString).matches())
    {
      GMTrace.o(1077499920384L, 8028);
      return null;
    }
    paramString = paramString.substring(paramString.indexOf("base64,") + 7).trim();
    GMTrace.o(1077499920384L, 8028);
    return paramString;
  }
  
  public static Boolean PM(String paramString)
  {
    GMTrace.i(1077768355840L, 8030);
    if ((paramString != null) && (paramString.startsWith("Refused to frame")))
    {
      paramString = paramString.split("'");
      if ((paramString.length > 1) && (paramString[1].equalsIgnoreCase("weixinpreinject://iframe")))
      {
        GMTrace.o(1077768355840L, 8030);
        return Boolean.valueOf(true);
      }
    }
    GMTrace.o(1077768355840L, 8030);
    return Boolean.valueOf(false);
  }
  
  public static Boolean PN(String paramString)
  {
    GMTrace.i(1077902573568L, 8031);
    if ((paramString != null) && (paramString.startsWith("Refused to frame")))
    {
      paramString = paramString.split("'");
      if ((paramString.length > 1) && (paramString[1].equalsIgnoreCase("weixinping://iframe")))
      {
        GMTrace.o(1077902573568L, 8031);
        return Boolean.valueOf(true);
      }
    }
    GMTrace.o(1077902573568L, 8031);
    return Boolean.valueOf(false);
  }
  
  public static String PO(String paramString)
  {
    GMTrace.i(1078036791296L, 8032);
    String str2 = "";
    String str1 = str2;
    if (paramString != null)
    {
      str1 = str2;
      if (paramString.startsWith("Refused to frame"))
      {
        paramString = paramString.split("'");
        str1 = str2;
        if (paramString.length > 2) {
          str1 = paramString[1];
        }
      }
    }
    GMTrace.o(1078036791296L, 8032);
    return str1;
  }
  
  public static String PP(String paramString)
  {
    GMTrace.i(1078171009024L, 8033);
    if (bg.nm(paramString))
    {
      GMTrace.o(1078171009024L, 8033);
      return null;
    }
    String str2 = (String)tIl.get(paramString.toLowerCase());
    String str1 = str2;
    if (bg.nm(str2))
    {
      str1 = str2;
      if (!bg.nm(paramString)) {
        str1 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(paramString);
      }
    }
    GMTrace.o(1078171009024L, 8033);
    return str1;
  }
  
  public static String PQ(String paramString)
  {
    GMTrace.i(1078305226752L, 8034);
    paramString = PP(PR(paramString));
    GMTrace.o(1078305226752L, 8034);
    return paramString;
  }
  
  public static String PR(String paramString)
  {
    GMTrace.i(1078439444480L, 8035);
    if (bg.nm(paramString))
    {
      GMTrace.o(1078439444480L, 8035);
      return null;
    }
    int i = paramString.lastIndexOf('.');
    if ((i < 0) || (i >= paramString.length() - 1))
    {
      GMTrace.o(1078439444480L, 8035);
      return null;
    }
    paramString = paramString.substring(i + 1);
    GMTrace.o(1078439444480L, 8035);
    return paramString;
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    GMTrace.i(1075755089920L, 8015);
    if (hjb == null) {
      hjb = new ar(1, "webview-save-image", 1);
    }
    hjb.c(new c(paramContext, paramString1, paramString2, paramBoolean));
    GMTrace.o(1075755089920L, 8015);
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean, b paramb)
  {
    GMTrace.i(1075889307648L, 8016);
    if (hjb == null) {
      hjb = new ar(1, "webview-save-image", 1);
    }
    hjb.c(new c(paramContext, paramString1, paramString2, paramBoolean, 1, paramb));
    GMTrace.o(1075889307648L, 8016);
  }
  
  public static void a(WebView paramWebView)
  {
    GMTrace.i(20094138712064L, 149713);
    if (paramWebView == null)
    {
      GMTrace.o(20094138712064L, 149713);
      return;
    }
    w.d("MicroMsg.WebViewUtil", "initPingIFrame");
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1067433590784L, 7953);
        this.tIn.evaluateJavascript("javascript:var ping_iframe = document.getElementById('ping_iframe');if (ping_iframe === null) {ping_iframe = document.createElement('iframe');ping_iframe.id = 'ping_iframe';ping_iframe.style.display = 'none';document.documentElement.appendChild(ping_iframe);ping_iframe.src = ' weixinping://iframe ' }", null);
        GMTrace.o(1067433590784L, 7953);
      }
    });
    GMTrace.o(20094138712064L, 149713);
  }
  
  public static void a(WebView paramWebView, String paramString1, String paramString2)
  {
    GMTrace.i(20094407147520L, 149715);
    a(paramWebView, paramString1, paramString2, true);
    GMTrace.o(20094407147520L, 149715);
  }
  
  public static void a(final WebView paramWebView, final String paramString1, final String paramString2, boolean paramBoolean)
  {
    GMTrace.i(20094541365248L, 149716);
    if ((paramWebView == null) || (bg.nm(paramString1)) || (bg.nm(paramString2)))
    {
      w.e("MicroMsg.WebViewUtil", "getJsResult fail, invalid argument, scheme = %s, jsCode = %s", new Object[] { paramString1, paramString2 });
      GMTrace.o(20094541365248L, 149716);
      return;
    }
    w.d("MicroMsg.WebViewUtil", "getJsResult, scheme = %s, jsCode = %s", new Object[] { paramString1, paramString2 });
    b(paramWebView);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1138032115712L, 8479);
        if (this.tIo)
        {
          paramWebView.evaluateJavascript("javascript:document.getElementById('_edw_iframe_').src = '" + paramString1 + "' + " + paramString2, null);
          GMTrace.o(1138032115712L, 8479);
          return;
        }
        paramWebView.evaluateJavascript("javascript:console.log('" + paramString1 + "' + " + paramString2 + ")", null);
        GMTrace.o(1138032115712L, 8479);
      }
    });
    GMTrace.o(20094541365248L, 149716);
  }
  
  public static String aZ(Context paramContext, String paramString)
  {
    GMTrace.i(1075218219008L, 8011);
    Object localObject = "MicroMsg.WebViewUtil, appendUserAgent fail, context is null, stack = " + bg.bQW();
    boolean bool;
    if (paramContext != null)
    {
      bool = true;
      Assert.assertTrue((String)localObject, bool);
      if (paramString != null) {
        break label214;
      }
    }
    label214:
    for (paramString = " MicroMessenger/";; paramString = paramString + " MicroMessenger/")
    {
      localObject = getPackageInfo(paramContext, ab.getPackageName());
      paramContext = paramString;
      if (localObject != null)
      {
        paramContext = paramString + f.ab(null, d.tJC);
        paramContext = paramContext + "." + ((PackageInfo)localObject).versionCode;
      }
      paramString = am.eu(ab.getContext());
      paramContext = paramContext + " NetType/" + paramString;
      paramContext = paramContext + " Language/" + com.tencent.mm.sdk.platformtools.v.eq(ab.getContext());
      w.i("MicroMsg.WebViewUtil", "appendUserAgent, uaStr = " + paramContext);
      GMTrace.o(1075218219008L, 8011);
      return paramContext;
      bool = false;
      break;
    }
  }
  
  public static final String af(Map<String, Object> paramMap)
  {
    GMTrace.i(1076828831744L, 8023);
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramMap.get(str);
      if ((!bg.nm(str)) && (localObject != null) && ((!(localObject instanceof String)) || (!bg.nm((String)localObject))))
      {
        if (localStringBuilder.length() > 0) {
          localStringBuilder.append("&");
        }
        localStringBuilder.append(str);
        localStringBuilder.append("=");
        localStringBuilder.append(localObject);
      }
    }
    paramMap = localStringBuilder.toString();
    GMTrace.o(1076828831744L, 8023);
    return paramMap;
  }
  
  public static void b(WebView paramWebView)
  {
    GMTrace.i(20094272929792L, 149714);
    w.d("MicroMsg.WebViewUtil", "initIFrame");
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1140045381632L, 8494);
        this.tIn.evaluateJavascript("javascript:var edw_iframe = document.getElementById('_edw_iframe_');if (edw_iframe === null) {edw_iframe = document.createElement('iframe');edw_iframe.id = '_edw_iframe_';edw_iframe.style.display = 'none';document.documentElement.appendChild(edw_iframe);}", null);
        GMTrace.o(1140045381632L, 8494);
      }
    });
    GMTrace.o(20094272929792L, 149714);
  }
  
  public static String bCt()
  {
    GMTrace.i(1077634138112L, 8029);
    Object localObject = (ConnectivityManager)ab.getContext().getSystemService("connectivity");
    if (localObject == null)
    {
      GMTrace.o(1077634138112L, 8029);
      return "no";
    }
    localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
    if (localObject == null)
    {
      GMTrace.o(1077634138112L, 8029);
      return "no";
    }
    if (((NetworkInfo)localObject).getType() == 1)
    {
      GMTrace.o(1077634138112L, 8029);
      return "WIFI";
    }
    w.d("MicroMsg.WebViewUtil", "activeNetInfo extra=%s, type=%d, %s", new Object[] { ((NetworkInfo)localObject).getExtraInfo(), Integer.valueOf(((NetworkInfo)localObject).getType()), ((NetworkInfo)localObject).getExtraInfo() });
    if (((NetworkInfo)localObject).getExtraInfo() != null)
    {
      localObject = ((NetworkInfo)localObject).getExtraInfo().toLowerCase();
      GMTrace.o(1077634138112L, 8029);
      return (String)localObject;
    }
    GMTrace.o(1077634138112L, 8029);
    return "no";
  }
  
  public static String bNx()
  {
    i = 0;
    GMTrace.i(1077365702656L, 8027);
    try
    {
      int j = com.tencent.mm.compatible.d.v.tq();
      i = j;
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        w.e("MicroMsg.WebViewUtil", "getSelfIp, call NetworkDetailInfo.getNetType(), exp = %s", new Object[] { localException1 });
      }
      if (i != 1) {
        break label77;
      }
      Object localObject1 = dY(ab.getContext());
      GMTrace.o(1077365702656L, 8027);
      return (String)localObject1;
      InetAddress localInetAddress;
      try
      {
        do
        {
          localObject1 = NetworkInterface.getNetworkInterfaces();
          Object localObject2;
          while (!((Enumeration)localObject2).hasMoreElements())
          {
            do
            {
              if (!((Enumeration)localObject1).hasMoreElements()) {
                break;
              }
              localObject2 = (NetworkInterface)((Enumeration)localObject1).nextElement();
            } while (localObject2 == null);
            localObject2 = ((NetworkInterface)localObject2).getInetAddresses();
          }
          localInetAddress = (InetAddress)((Enumeration)localObject2).nextElement();
        } while ((localInetAddress == null) || (localInetAddress.isLoopbackAddress()) || (!(localInetAddress instanceof Inet4Address)));
        if (bg.nm(localInetAddress.getHostAddress()))
        {
          GMTrace.o(1077365702656L, 8027);
          return "127.0.0.1";
        }
      }
      catch (Exception localException2)
      {
        GMTrace.o(1077365702656L, 8027);
        return "127.0.0.1";
      }
      String str = localInetAddress.getHostAddress();
      GMTrace.o(1077365702656L, 8027);
      return str;
    }
    if (i == 0)
    {
      GMTrace.o(1077365702656L, 8027);
      return "127.0.0.1";
    }
  }
  
  private static String dY(Context paramContext)
  {
    GMTrace.i(1077231484928L, 8026);
    paramContext = (WifiManager)paramContext.getSystemService("wifi");
    try
    {
      paramContext = paramContext.getConnectionInfo();
      if (paramContext == null)
      {
        GMTrace.o(1077231484928L, 8026);
        return "127.0.0.1";
      }
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        paramContext = null;
      }
      int i = paramContext.getIpAddress();
      paramContext = String.format("%d.%d.%d.%d", new Object[] { Integer.valueOf(i & 0xFF), Integer.valueOf(i >> 8 & 0xFF), Integer.valueOf(i >> 16 & 0xFF), Integer.valueOf(i >> 24 & 0xFF) });
      GMTrace.o(1077231484928L, 8026);
    }
    return paramContext;
  }
  
  public static boolean eK(String paramString1, String paramString2)
  {
    GMTrace.i(1075486654464L, 8013);
    if ((paramString1 == null) || (paramString2 == null) || (paramString1.length() < 0) || (paramString2.length() < 0))
    {
      GMTrace.o(1075486654464L, 8013);
      return false;
    }
    if (paramString2.length() > paramString1.length())
    {
      GMTrace.o(1075486654464L, 8013);
      return false;
    }
    if (paramString2.equalsIgnoreCase(paramString1.substring(0, paramString2.length())))
    {
      GMTrace.o(1075486654464L, 8013);
      return true;
    }
    GMTrace.o(1075486654464L, 8013);
    return false;
  }
  
  public static String eL(String paramString1, String paramString2)
  {
    GMTrace.i(20094675582976L, 149717);
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)))
    {
      w.e("MicroMsg.WebViewUtil", "genJsCode fail, invalid argument, scheme = %s, jsCode = %s", new Object[] { paramString1, paramString2 });
      GMTrace.o(20094675582976L, 149717);
      return null;
    }
    w.d("MicroMsg.WebViewUtil", "genJsCode, scheme = %s, jsCode = %s", new Object[] { paramString1, paramString2 });
    paramString1 = "document.getElementById('_edw_iframe_').src = '" + paramString1 + "' + " + paramString2;
    GMTrace.o(20094675582976L, 149717);
    return paramString1;
  }
  
  public static PackageInfo getPackageInfo(Context paramContext, String paramString)
  {
    GMTrace.i(1075620872192L, 8014);
    if (paramString == null)
    {
      w.e("MicroMsg.WebViewUtil", "getPackageInfo fail, packageName is null");
      GMTrace.o(1075620872192L, 8014);
      return null;
    }
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0);
      GMTrace.o(1075620872192L, 8014);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      w.printErrStackTrace("MicroMsg.WebViewUtil", paramContext, "", new Object[0]);
      GMTrace.o(1075620872192L, 8014);
    }
    return null;
  }
  
  public static final class a
  {
    private static final Pattern tIq;
    public final String charset;
    public final String mimeType;
    
    static
    {
      GMTrace.i(1141521776640L, 8505);
      tIq = Pattern.compile("([a-zA-Z*-.0-9]+/[a-zA-Z*-.0-9]+)");
      GMTrace.o(1141521776640L, 8505);
    }
    
    private a(String paramString1, String paramString2)
    {
      GMTrace.i(1141119123456L, 8502);
      this.mimeType = paramString1;
      this.charset = paramString2;
      GMTrace.o(1141119123456L, 8502);
    }
    
    public static a PS(String paramString)
    {
      String str = null;
      GMTrace.i(1141387558912L, 8504);
      if (bg.nm(paramString))
      {
        GMTrace.o(1141387558912L, 8504);
        return null;
      }
      Object localObject = tIq.matcher(paramString);
      if (!((Matcher)localObject).find())
      {
        GMTrace.o(1141387558912L, 8504);
        return null;
      }
      localObject = ((Matcher)localObject).group(0);
      if (paramString.contains("charset=")) {
        str = paramString.substring(paramString.indexOf("charset=") + 8).trim();
      }
      paramString = str;
      if (bg.nm(str)) {
        paramString = "UTF-8";
      }
      paramString = new a((String)localObject, paramString);
      GMTrace.o(1141387558912L, 8504);
      return paramString;
    }
    
    public final String toString()
    {
      GMTrace.i(1141253341184L, 8503);
      String str = "ContentType{mimeType='" + this.mimeType + '\'' + ", charset='" + this.charset + '\'' + '}';
      GMTrace.o(1141253341184L, 8503);
      return str;
    }
  }
  
  public static abstract interface b
  {
    public abstract void qU(String paramString);
  }
  
  private static final class c
    implements ar.a
  {
    private static Pattern tIr;
    private static Pattern tIs;
    private Context context;
    private String gQW;
    private String imagePath;
    private int opType;
    private String tIt;
    private String tIu;
    private boolean tIv;
    private s.b tIw;
    
    static
    {
      GMTrace.i(1132663406592L, 8439);
      tIr = Pattern.compile("image/[A-Za-z0-9]+");
      tIs = Pattern.compile("filename=[A-Za-z0-9@.]+.[A-Za-z0-9]+");
      GMTrace.o(1132663406592L, 8439);
    }
    
    public c(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
    {
      this(paramContext, paramString1, paramString2, paramBoolean, 0, null);
      GMTrace.i(1131723882496L, 8432);
      GMTrace.o(1131723882496L, 8432);
    }
    
    public c(Context paramContext, String paramString1, String paramString2, boolean paramBoolean, int paramInt, s.b paramb)
    {
      GMTrace.i(1131858100224L, 8433);
      this.context = paramContext;
      this.gQW = paramString1;
      this.tIu = paramString2;
      this.tIv = paramBoolean;
      this.opType = paramInt;
      this.tIw = paramb;
      GMTrace.o(1131858100224L, 8433);
    }
    
    private void a(String paramString1, String paramString2, InputStream paramInputStream)
    {
      GMTrace.i(1132394971136L, 8437);
      w.i("MicroMsg.WebViewUtil", "contentType = %s, dispositionType = %s", new Object[] { paramString1, paramString2 });
      Object localObject2 = null;
      Object localObject1 = localObject2;
      if (!bg.nm(paramString1))
      {
        paramString1 = tIr.matcher(paramString1);
        localObject1 = localObject2;
        if (paramString1.find()) {
          localObject1 = paramString1.group().substring(paramString1.group().lastIndexOf('/') + 1);
        }
      }
      paramString1 = (String)localObject1;
      if (bg.nm((String)localObject1))
      {
        paramString1 = (String)localObject1;
        if (!bg.nm(paramString2))
        {
          paramString2 = tIs.matcher(paramString2);
          paramString1 = (String)localObject1;
          if (paramString2.find()) {
            paramString1 = paramString2.group().substring(paramString2.group().lastIndexOf('.') + 1);
          }
        }
      }
      paramString2 = paramString1;
      int i;
      if (bg.nm(paramString1))
      {
        paramString1 = new q(this.gQW);
        i = paramString1.aBm.lastIndexOf('.');
        if (i != -1) {
          break label230;
        }
      }
      label230:
      for (paramString2 = "jpg";; paramString2 = paramString1.aBm.substring(i + 1))
      {
        this.imagePath = k.nd(paramString2);
        paramString1 = new FileOutputStream(this.imagePath);
        paramString2 = new byte[' '];
        for (;;)
        {
          i = paramInputStream.read(paramString2);
          if (i == -1) {
            break;
          }
          paramString1.write(paramString2, 0, i);
        }
      }
      try
      {
        paramString1.flush();
        paramString1.close();
        if (this.opType == 0)
        {
          this.tIt = this.context.getString(a.h.dmf, new Object[] { k.Pk() });
          k.b(this.imagePath, this.context);
        }
        GMTrace.o(1132394971136L, 8437);
        return;
      }
      catch (Exception paramString1)
      {
        for (;;)
        {
          w.e("MicroMsg.WebViewUtil", "close os failed : %s", new Object[] { paramString1.getMessage() });
        }
      }
    }
    
    private static void a(HttpURLConnection paramHttpURLConnection, InputStream paramInputStream)
    {
      GMTrace.i(1132260753408L, 8436);
      if (paramHttpURLConnection != null) {
        paramHttpURLConnection.disconnect();
      }
      if (paramInputStream != null) {
        try
        {
          paramInputStream.close();
          GMTrace.o(1132260753408L, 8436);
          return;
        }
        catch (Exception paramHttpURLConnection)
        {
          w.printErrStackTrace("MicroMsg.WebViewUtil", paramHttpURLConnection, "", new Object[0]);
        }
      }
      GMTrace.o(1132260753408L, 8436);
    }
    
    /* Error */
    private void bNy()
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore 4
      //   3: aconst_null
      //   4: astore 5
      //   6: aconst_null
      //   7: astore_3
      //   8: ldc2_w 203
      //   11: sipush 8435
      //   14: invokestatic 35	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   17: new 206	java/net/URL
      //   20: dup
      //   21: aload_0
      //   22: getfield 68	com/tencent/mm/pluginsdk/ui/tools/s$c:gQW	Ljava/lang/String;
      //   25: invokespecial 207	java/net/URL:<init>	(Ljava/lang/String;)V
      //   28: invokevirtual 211	java/net/URL:openConnection	()Ljava/net/URLConnection;
      //   31: checkcast 191	java/net/HttpURLConnection
      //   34: astore_2
      //   35: aload 5
      //   37: astore_3
      //   38: aload_2
      //   39: ldc -43
      //   41: invokevirtual 216	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
      //   44: aload 5
      //   46: astore_3
      //   47: aload_2
      //   48: ldc -38
      //   50: aload_0
      //   51: getfield 70	com/tencent/mm/pluginsdk/ui/tools/s$c:tIu	Ljava/lang/String;
      //   54: invokevirtual 222	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   57: aload 5
      //   59: astore_3
      //   60: aload_2
      //   61: iconst_1
      //   62: invokevirtual 226	java/net/HttpURLConnection:setAllowUserInteraction	(Z)V
      //   65: aload 5
      //   67: astore_3
      //   68: aload_2
      //   69: invokevirtual 230	java/net/HttpURLConnection:getResponseCode	()I
      //   72: istore_1
      //   73: iload_1
      //   74: sipush 200
      //   77: if_icmpeq +141 -> 218
      //   80: iload_1
      //   81: sipush 301
      //   84: if_icmpeq +10 -> 94
      //   87: iload_1
      //   88: sipush 302
      //   91: if_icmpne +95 -> 186
      //   94: aload 5
      //   96: astore_3
      //   97: aload_2
      //   98: ldc -24
      //   100: invokevirtual 235	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
      //   103: astore 6
      //   105: aload 6
      //   107: astore 4
      //   109: aload 6
      //   111: ifnonnull +14 -> 125
      //   114: aload 5
      //   116: astore_3
      //   117: aload_2
      //   118: ldc -19
      //   120: invokevirtual 235	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
      //   123: astore 4
      //   125: aload 5
      //   127: astore_3
      //   128: ldc 84
      //   130: ldc -17
      //   132: iconst_1
      //   133: anewarray 4	java/lang/Object
      //   136: dup
      //   137: iconst_0
      //   138: aload 4
      //   140: aastore
      //   141: invokestatic 91	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   144: aload 5
      //   146: astore_3
      //   147: aload 4
      //   149: invokestatic 97	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
      //   152: ifne +34 -> 186
      //   155: aload 5
      //   157: astore_3
      //   158: aload_0
      //   159: aload 4
      //   161: putfield 68	com/tencent/mm/pluginsdk/ui/tools/s$c:gQW	Ljava/lang/String;
      //   164: aload 5
      //   166: astore_3
      //   167: aload_0
      //   168: invokespecial 241	com/tencent/mm/pluginsdk/ui/tools/s$c:bNy	()V
      //   171: aload_2
      //   172: aconst_null
      //   173: invokestatic 243	com/tencent/mm/pluginsdk/ui/tools/s$c:a	(Ljava/net/HttpURLConnection;Ljava/io/InputStream;)V
      //   176: ldc2_w 203
      //   179: sipush 8435
      //   182: invokestatic 52	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   185: return
      //   186: aload 5
      //   188: astore_3
      //   189: aload_0
      //   190: aload_0
      //   191: getfield 66	com/tencent/mm/pluginsdk/ui/tools/s$c:context	Landroid/content/Context;
      //   194: getstatic 246	com/tencent/mm/plugin/ag/a$h:qzD	I
      //   197: invokevirtual 248	android/content/Context:getString	(I)Ljava/lang/String;
      //   200: putfield 174	com/tencent/mm/pluginsdk/ui/tools/s$c:tIt	Ljava/lang/String;
      //   203: aload_2
      //   204: aconst_null
      //   205: invokestatic 243	com/tencent/mm/pluginsdk/ui/tools/s$c:a	(Ljava/net/HttpURLConnection;Ljava/io/InputStream;)V
      //   208: ldc2_w 203
      //   211: sipush 8435
      //   214: invokestatic 52	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   217: return
      //   218: aload 5
      //   220: astore_3
      //   221: aload_2
      //   222: invokevirtual 251	java/net/HttpURLConnection:getContentType	()Ljava/lang/String;
      //   225: astore 6
      //   227: aload 5
      //   229: astore_3
      //   230: aload_2
      //   231: invokevirtual 255	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
      //   234: astore 4
      //   236: aload 4
      //   238: astore_3
      //   239: aload_0
      //   240: aload 6
      //   242: aload_2
      //   243: ldc_w 257
      //   246: invokevirtual 235	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
      //   249: aload 4
      //   251: invokespecial 259	com/tencent/mm/pluginsdk/ui/tools/s$c:a	(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V
      //   254: aload_2
      //   255: aload 4
      //   257: invokestatic 243	com/tencent/mm/pluginsdk/ui/tools/s$c:a	(Ljava/net/HttpURLConnection;Ljava/io/InputStream;)V
      //   260: ldc2_w 203
      //   263: sipush 8435
      //   266: invokestatic 52	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   269: return
      //   270: astore 4
      //   272: aconst_null
      //   273: astore_2
      //   274: ldc 84
      //   276: ldc_w 261
      //   279: iconst_1
      //   280: anewarray 4	java/lang/Object
      //   283: dup
      //   284: iconst_0
      //   285: aload 4
      //   287: invokevirtual 183	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   290: aastore
      //   291: invokestatic 186	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   294: aload_3
      //   295: aload_2
      //   296: invokestatic 243	com/tencent/mm/pluginsdk/ui/tools/s$c:a	(Ljava/net/HttpURLConnection;Ljava/io/InputStream;)V
      //   299: ldc2_w 203
      //   302: sipush 8435
      //   305: invokestatic 52	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   308: return
      //   309: astore_2
      //   310: aconst_null
      //   311: astore 5
      //   313: aload 4
      //   315: astore_3
      //   316: aload 5
      //   318: astore 4
      //   320: aload 4
      //   322: aload_3
      //   323: invokestatic 243	com/tencent/mm/pluginsdk/ui/tools/s$c:a	(Ljava/net/HttpURLConnection;Ljava/io/InputStream;)V
      //   326: aload_2
      //   327: athrow
      //   328: astore 5
      //   330: aload_2
      //   331: astore 4
      //   333: aload 5
      //   335: astore_2
      //   336: goto -16 -> 320
      //   339: astore 4
      //   341: aload_2
      //   342: astore 5
      //   344: aload 4
      //   346: astore_2
      //   347: aload_3
      //   348: astore 4
      //   350: aload 5
      //   352: astore_3
      //   353: goto -33 -> 320
      //   356: astore 4
      //   358: aconst_null
      //   359: astore 5
      //   361: aload_2
      //   362: astore_3
      //   363: aload 5
      //   365: astore_2
      //   366: goto -92 -> 274
      //   369: astore 6
      //   371: aload 4
      //   373: astore_3
      //   374: aload_2
      //   375: astore 5
      //   377: aload 6
      //   379: astore 4
      //   381: aload_3
      //   382: astore_2
      //   383: aload 5
      //   385: astore_3
      //   386: goto -112 -> 274
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	389	0	this	c
      //   72	20	1	i	int
      //   34	262	2	localHttpURLConnection	HttpURLConnection
      //   309	22	2	localObject1	Object
      //   335	48	2	localObject2	Object
      //   7	379	3	localObject3	Object
      //   1	255	4	localObject4	Object
      //   270	44	4	localException1	Exception
      //   318	14	4	localObject5	Object
      //   339	6	4	localObject6	Object
      //   348	1	4	localObject7	Object
      //   356	16	4	localException2	Exception
      //   379	1	4	localObject8	Object
      //   4	313	5	localObject9	Object
      //   328	6	5	localObject10	Object
      //   342	42	5	localObject11	Object
      //   103	138	6	str	String
      //   369	9	6	localException3	Exception
      // Exception table:
      //   from	to	target	type
      //   17	35	270	java/lang/Exception
      //   17	35	309	finally
      //   38	44	328	finally
      //   47	57	328	finally
      //   60	65	328	finally
      //   68	73	328	finally
      //   97	105	328	finally
      //   117	125	328	finally
      //   128	144	328	finally
      //   147	155	328	finally
      //   158	164	328	finally
      //   167	171	328	finally
      //   189	203	328	finally
      //   221	227	328	finally
      //   230	236	328	finally
      //   239	254	328	finally
      //   274	294	339	finally
      //   38	44	356	java/lang/Exception
      //   47	57	356	java/lang/Exception
      //   60	65	356	java/lang/Exception
      //   68	73	356	java/lang/Exception
      //   97	105	356	java/lang/Exception
      //   117	125	356	java/lang/Exception
      //   128	144	356	java/lang/Exception
      //   147	155	356	java/lang/Exception
      //   158	164	356	java/lang/Exception
      //   167	171	356	java/lang/Exception
      //   189	203	356	java/lang/Exception
      //   221	227	356	java/lang/Exception
      //   230	236	356	java/lang/Exception
      //   239	254	369	java/lang/Exception
    }
    
    /* Error */
    public final boolean Dj()
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore 5
      //   3: aconst_null
      //   4: astore_3
      //   5: aconst_null
      //   6: astore_2
      //   7: aconst_null
      //   8: astore 6
      //   10: aconst_null
      //   11: astore 7
      //   13: aconst_null
      //   14: astore 4
      //   16: ldc2_w 263
      //   19: sipush 8438
      //   22: invokestatic 35	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   25: aload_0
      //   26: getfield 72	com/tencent/mm/pluginsdk/ui/tools/s$c:tIv	Z
      //   29: ifne +28 -> 57
      //   32: aload_0
      //   33: aload_0
      //   34: getfield 66	com/tencent/mm/pluginsdk/ui/tools/s$c:context	Landroid/content/Context;
      //   37: getstatic 267	com/tencent/mm/plugin/ag/a$h:qzE	I
      //   40: invokevirtual 248	android/content/Context:getString	(I)Ljava/lang/String;
      //   43: putfield 174	com/tencent/mm/pluginsdk/ui/tools/s$c:tIt	Ljava/lang/String;
      //   46: ldc2_w 263
      //   49: sipush 8438
      //   52: invokestatic 52	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   55: iconst_1
      //   56: ireturn
      //   57: aload_0
      //   58: getfield 68	com/tencent/mm/pluginsdk/ui/tools/s$c:gQW	Ljava/lang/String;
      //   61: invokestatic 97	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
      //   64: ifeq +14 -> 78
      //   67: ldc2_w 263
      //   70: sipush 8438
      //   73: invokestatic 52	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   76: iconst_0
      //   77: ireturn
      //   78: aload_0
      //   79: getfield 68	com/tencent/mm/pluginsdk/ui/tools/s$c:gQW	Ljava/lang/String;
      //   82: invokestatic 272	android/webkit/URLUtil:isDataUrl	(Ljava/lang/String;)Z
      //   85: ifeq +265 -> 350
      //   88: aload_0
      //   89: ldc -125
      //   91: invokestatic 137	com/tencent/mm/pluginsdk/ui/tools/k:nd	(Ljava/lang/String;)Ljava/lang/String;
      //   94: putfield 139	com/tencent/mm/pluginsdk/ui/tools/s$c:imagePath	Ljava/lang/String;
      //   97: aload 5
      //   99: astore_2
      //   100: aload_0
      //   101: getfield 68	com/tencent/mm/pluginsdk/ui/tools/s$c:gQW	Ljava/lang/String;
      //   104: ldc_w 274
      //   107: invokevirtual 278	java/lang/String:indexOf	(Ljava/lang/String;)I
      //   110: istore_1
      //   111: iload_1
      //   112: ifle +21 -> 133
      //   115: aload 5
      //   117: astore_2
      //   118: aload_0
      //   119: aload_0
      //   120: getfield 68	com/tencent/mm/pluginsdk/ui/tools/s$c:gQW	Ljava/lang/String;
      //   123: iload_1
      //   124: bipush 7
      //   126: iadd
      //   127: invokevirtual 121	java/lang/String:substring	(I)Ljava/lang/String;
      //   130: putfield 68	com/tencent/mm/pluginsdk/ui/tools/s$c:gQW	Ljava/lang/String;
      //   133: aload 5
      //   135: astore_2
      //   136: new 141	java/io/FileOutputStream
      //   139: dup
      //   140: aload_0
      //   141: getfield 139	com/tencent/mm/pluginsdk/ui/tools/s$c:imagePath	Ljava/lang/String;
      //   144: invokespecial 142	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
      //   147: astore_3
      //   148: aload_0
      //   149: getfield 68	com/tencent/mm/pluginsdk/ui/tools/s$c:gQW	Ljava/lang/String;
      //   152: iconst_0
      //   153: invokestatic 284	android/util/Base64:decode	(Ljava/lang/String;I)[B
      //   156: astore_2
      //   157: aload_2
      //   158: ifnull +8 -> 166
      //   161: aload_3
      //   162: aload_2
      //   163: invokevirtual 287	java/io/FileOutputStream:write	([B)V
      //   166: aload_3
      //   167: invokevirtual 155	java/io/FileOutputStream:flush	()V
      //   170: aload_3
      //   171: invokevirtual 158	java/io/FileOutputStream:close	()V
      //   174: aload_0
      //   175: aload_0
      //   176: getfield 66	com/tencent/mm/pluginsdk/ui/tools/s$c:context	Landroid/content/Context;
      //   179: getstatic 163	com/tencent/mm/plugin/ag/a$h:dmf	I
      //   182: iconst_1
      //   183: anewarray 4	java/lang/Object
      //   186: dup
      //   187: iconst_0
      //   188: invokestatic 166	com/tencent/mm/pluginsdk/ui/tools/k:Pk	()Ljava/lang/String;
      //   191: aastore
      //   192: invokevirtual 172	android/content/Context:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
      //   195: putfield 174	com/tencent/mm/pluginsdk/ui/tools/s$c:tIt	Ljava/lang/String;
      //   198: aload_0
      //   199: getfield 139	com/tencent/mm/pluginsdk/ui/tools/s$c:imagePath	Ljava/lang/String;
      //   202: aload_0
      //   203: getfield 66	com/tencent/mm/pluginsdk/ui/tools/s$c:context	Landroid/content/Context;
      //   206: invokestatic 178	com/tencent/mm/pluginsdk/ui/tools/k:b	(Ljava/lang/String;Landroid/content/Context;)V
      //   209: aload_3
      //   210: invokevirtual 158	java/io/FileOutputStream:close	()V
      //   213: ldc2_w 263
      //   216: sipush 8438
      //   219: invokestatic 52	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   222: iconst_1
      //   223: ireturn
      //   224: astore_2
      //   225: ldc 84
      //   227: ldc_w 289
      //   230: iconst_1
      //   231: anewarray 4	java/lang/Object
      //   234: dup
      //   235: iconst_0
      //   236: aload_2
      //   237: invokevirtual 183	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   240: aastore
      //   241: invokestatic 186	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   244: goto -31 -> 213
      //   247: astore_2
      //   248: aload 4
      //   250: astore_3
      //   251: aload_2
      //   252: astore 4
      //   254: aload_3
      //   255: astore_2
      //   256: ldc 84
      //   258: ldc_w 291
      //   261: iconst_1
      //   262: anewarray 4	java/lang/Object
      //   265: dup
      //   266: iconst_0
      //   267: aload 4
      //   269: invokevirtual 183	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   272: aastore
      //   273: invokestatic 186	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   276: aload_3
      //   277: ifnull -64 -> 213
      //   280: aload_3
      //   281: invokevirtual 158	java/io/FileOutputStream:close	()V
      //   284: goto -71 -> 213
      //   287: astore_2
      //   288: ldc 84
      //   290: ldc_w 289
      //   293: iconst_1
      //   294: anewarray 4	java/lang/Object
      //   297: dup
      //   298: iconst_0
      //   299: aload_2
      //   300: invokevirtual 183	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   303: aastore
      //   304: invokestatic 186	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   307: goto -94 -> 213
      //   310: astore 4
      //   312: aload_2
      //   313: astore_3
      //   314: aload 4
      //   316: astore_2
      //   317: aload_3
      //   318: ifnull +7 -> 325
      //   321: aload_3
      //   322: invokevirtual 158	java/io/FileOutputStream:close	()V
      //   325: aload_2
      //   326: athrow
      //   327: astore_3
      //   328: ldc 84
      //   330: ldc_w 289
      //   333: iconst_1
      //   334: anewarray 4	java/lang/Object
      //   337: dup
      //   338: iconst_0
      //   339: aload_3
      //   340: invokevirtual 183	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   343: aastore
      //   344: invokestatic 186	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   347: goto -22 -> 325
      //   350: aload_0
      //   351: getfield 68	com/tencent/mm/pluginsdk/ui/tools/s$c:gQW	Ljava/lang/String;
      //   354: invokestatic 294	android/webkit/URLUtil:isHttpsUrl	(Ljava/lang/String;)Z
      //   357: ifeq +336 -> 693
      //   360: new 206	java/net/URL
      //   363: dup
      //   364: aload_0
      //   365: getfield 68	com/tencent/mm/pluginsdk/ui/tools/s$c:gQW	Ljava/lang/String;
      //   368: invokespecial 207	java/net/URL:<init>	(Ljava/lang/String;)V
      //   371: invokevirtual 211	java/net/URL:openConnection	()Ljava/net/URLConnection;
      //   374: checkcast 296	javax/net/ssl/HttpsURLConnection
      //   377: astore 4
      //   379: aload 6
      //   381: astore_2
      //   382: aload 7
      //   384: astore_3
      //   385: aload 4
      //   387: ldc -43
      //   389: invokevirtual 297	javax/net/ssl/HttpsURLConnection:setRequestMethod	(Ljava/lang/String;)V
      //   392: aload 6
      //   394: astore_2
      //   395: aload 7
      //   397: astore_3
      //   398: aload 4
      //   400: ldc -38
      //   402: aload_0
      //   403: getfield 70	com/tencent/mm/pluginsdk/ui/tools/s$c:tIu	Ljava/lang/String;
      //   406: invokevirtual 298	javax/net/ssl/HttpsURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   409: aload 6
      //   411: astore_2
      //   412: aload 7
      //   414: astore_3
      //   415: aload 4
      //   417: iconst_1
      //   418: invokevirtual 299	javax/net/ssl/HttpsURLConnection:setAllowUserInteraction	(Z)V
      //   421: aload 6
      //   423: astore_2
      //   424: aload 7
      //   426: astore_3
      //   427: aload 4
      //   429: invokevirtual 300	javax/net/ssl/HttpsURLConnection:getResponseCode	()I
      //   432: istore_1
      //   433: iload_1
      //   434: sipush 200
      //   437: if_icmpeq +152 -> 589
      //   440: iload_1
      //   441: sipush 301
      //   444: if_icmpeq +10 -> 454
      //   447: iload_1
      //   448: sipush 302
      //   451: if_icmpne +109 -> 560
      //   454: aload 6
      //   456: astore_2
      //   457: aload 7
      //   459: astore_3
      //   460: aload 4
      //   462: ldc -24
      //   464: invokevirtual 301	javax/net/ssl/HttpsURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
      //   467: astore 8
      //   469: aload 8
      //   471: astore 5
      //   473: aload 8
      //   475: ifnonnull +18 -> 493
      //   478: aload 6
      //   480: astore_2
      //   481: aload 7
      //   483: astore_3
      //   484: aload 4
      //   486: ldc -19
      //   488: invokevirtual 301	javax/net/ssl/HttpsURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
      //   491: astore 5
      //   493: aload 6
      //   495: astore_2
      //   496: aload 7
      //   498: astore_3
      //   499: ldc 84
      //   501: ldc -17
      //   503: iconst_1
      //   504: anewarray 4	java/lang/Object
      //   507: dup
      //   508: iconst_0
      //   509: aload 5
      //   511: aastore
      //   512: invokestatic 91	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   515: aload 6
      //   517: astore_2
      //   518: aload 7
      //   520: astore_3
      //   521: aload 5
      //   523: invokestatic 97	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
      //   526: ifne +34 -> 560
      //   529: aload 6
      //   531: astore_2
      //   532: aload 7
      //   534: astore_3
      //   535: aload_0
      //   536: aload 5
      //   538: putfield 68	com/tencent/mm/pluginsdk/ui/tools/s$c:gQW	Ljava/lang/String;
      //   541: aload 6
      //   543: astore_2
      //   544: aload 7
      //   546: astore_3
      //   547: aload_0
      //   548: invokespecial 241	com/tencent/mm/pluginsdk/ui/tools/s$c:bNy	()V
      //   551: aload 4
      //   553: aconst_null
      //   554: invokestatic 243	com/tencent/mm/pluginsdk/ui/tools/s$c:a	(Ljava/net/HttpURLConnection;Ljava/io/InputStream;)V
      //   557: goto -344 -> 213
      //   560: aload 6
      //   562: astore_2
      //   563: aload 7
      //   565: astore_3
      //   566: aload_0
      //   567: aload_0
      //   568: getfield 66	com/tencent/mm/pluginsdk/ui/tools/s$c:context	Landroid/content/Context;
      //   571: getstatic 246	com/tencent/mm/plugin/ag/a$h:qzD	I
      //   574: invokevirtual 248	android/content/Context:getString	(I)Ljava/lang/String;
      //   577: putfield 174	com/tencent/mm/pluginsdk/ui/tools/s$c:tIt	Ljava/lang/String;
      //   580: aload 4
      //   582: aconst_null
      //   583: invokestatic 243	com/tencent/mm/pluginsdk/ui/tools/s$c:a	(Ljava/net/HttpURLConnection;Ljava/io/InputStream;)V
      //   586: goto -373 -> 213
      //   589: aload 6
      //   591: astore_2
      //   592: aload 7
      //   594: astore_3
      //   595: aload 4
      //   597: invokevirtual 302	javax/net/ssl/HttpsURLConnection:getContentType	()Ljava/lang/String;
      //   600: astore 8
      //   602: aload 6
      //   604: astore_2
      //   605: aload 7
      //   607: astore_3
      //   608: aload 4
      //   610: invokevirtual 303	javax/net/ssl/HttpsURLConnection:getInputStream	()Ljava/io/InputStream;
      //   613: astore 5
      //   615: aload 5
      //   617: astore_2
      //   618: aload 5
      //   620: astore_3
      //   621: aload_0
      //   622: aload 8
      //   624: aload 4
      //   626: ldc_w 257
      //   629: invokevirtual 301	javax/net/ssl/HttpsURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
      //   632: aload 5
      //   634: invokespecial 259	com/tencent/mm/pluginsdk/ui/tools/s$c:a	(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V
      //   637: aload 4
      //   639: aload 5
      //   641: invokestatic 243	com/tencent/mm/pluginsdk/ui/tools/s$c:a	(Ljava/net/HttpURLConnection;Ljava/io/InputStream;)V
      //   644: goto -431 -> 213
      //   647: astore 4
      //   649: aconst_null
      //   650: astore_2
      //   651: ldc 84
      //   653: ldc_w 305
      //   656: iconst_1
      //   657: anewarray 4	java/lang/Object
      //   660: dup
      //   661: iconst_0
      //   662: aload 4
      //   664: invokevirtual 183	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   667: aastore
      //   668: invokestatic 186	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   671: aload_2
      //   672: aload_3
      //   673: invokestatic 243	com/tencent/mm/pluginsdk/ui/tools/s$c:a	(Ljava/net/HttpURLConnection;Ljava/io/InputStream;)V
      //   676: goto -463 -> 213
      //   679: astore 4
      //   681: aconst_null
      //   682: astore 5
      //   684: aload 5
      //   686: aload_2
      //   687: invokestatic 243	com/tencent/mm/pluginsdk/ui/tools/s$c:a	(Ljava/net/HttpURLConnection;Ljava/io/InputStream;)V
      //   690: aload 4
      //   692: athrow
      //   693: aload_0
      //   694: invokespecial 241	com/tencent/mm/pluginsdk/ui/tools/s$c:bNy	()V
      //   697: goto -484 -> 213
      //   700: astore_3
      //   701: aload 4
      //   703: astore 5
      //   705: aload_3
      //   706: astore 4
      //   708: goto -24 -> 684
      //   711: astore 4
      //   713: aload_2
      //   714: astore 5
      //   716: aload_3
      //   717: astore_2
      //   718: goto -34 -> 684
      //   721: astore 5
      //   723: aload 4
      //   725: astore_2
      //   726: aload 5
      //   728: astore 4
      //   730: goto -79 -> 651
      //   733: astore_2
      //   734: goto -417 -> 317
      //   737: astore 4
      //   739: goto -485 -> 254
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	742	0	this	c
      //   110	342	1	i	int
      //   6	157	2	localObject1	Object
      //   224	13	2	localException1	Exception
      //   247	5	2	localException2	Exception
      //   255	1	2	localObject2	Object
      //   287	26	2	localException3	Exception
      //   316	410	2	localObject3	Object
      //   733	1	2	localObject4	Object
      //   4	318	3	localObject5	Object
      //   327	13	3	localException4	Exception
      //   384	289	3	localObject6	Object
      //   700	17	3	localObject7	Object
      //   14	254	4	localException5	Exception
      //   310	5	4	localObject8	Object
      //   377	261	4	localHttpsURLConnection	javax.net.ssl.HttpsURLConnection
      //   647	16	4	localException6	Exception
      //   679	23	4	localObject9	Object
      //   706	1	4	localObject10	Object
      //   711	13	4	localObject11	Object
      //   728	1	4	localException7	Exception
      //   737	1	4	localException8	Exception
      //   1	714	5	localObject12	Object
      //   721	6	5	localException9	Exception
      //   8	595	6	localObject13	Object
      //   11	595	7	localObject14	Object
      //   467	156	8	str	String
      // Exception table:
      //   from	to	target	type
      //   209	213	224	java/lang/Exception
      //   100	111	247	java/lang/Exception
      //   118	133	247	java/lang/Exception
      //   136	148	247	java/lang/Exception
      //   280	284	287	java/lang/Exception
      //   100	111	310	finally
      //   118	133	310	finally
      //   136	148	310	finally
      //   256	276	310	finally
      //   321	325	327	java/lang/Exception
      //   360	379	647	java/lang/Exception
      //   360	379	679	finally
      //   385	392	700	finally
      //   398	409	700	finally
      //   415	421	700	finally
      //   427	433	700	finally
      //   460	469	700	finally
      //   484	493	700	finally
      //   499	515	700	finally
      //   521	529	700	finally
      //   535	541	700	finally
      //   547	551	700	finally
      //   566	580	700	finally
      //   595	602	700	finally
      //   608	615	700	finally
      //   621	637	700	finally
      //   651	671	711	finally
      //   385	392	721	java/lang/Exception
      //   398	409	721	java/lang/Exception
      //   415	421	721	java/lang/Exception
      //   427	433	721	java/lang/Exception
      //   460	469	721	java/lang/Exception
      //   484	493	721	java/lang/Exception
      //   499	515	721	java/lang/Exception
      //   521	529	721	java/lang/Exception
      //   535	541	721	java/lang/Exception
      //   547	551	721	java/lang/Exception
      //   566	580	721	java/lang/Exception
      //   595	602	721	java/lang/Exception
      //   608	615	721	java/lang/Exception
      //   621	637	721	java/lang/Exception
      //   148	157	733	finally
      //   161	166	733	finally
      //   166	209	733	finally
      //   148	157	737	java/lang/Exception
      //   161	166	737	java/lang/Exception
      //   166	209	737	java/lang/Exception
    }
    
    public final boolean Dk()
    {
      GMTrace.i(1131992317952L, 8434);
      if (1 == this.opType)
      {
        this.tIw.qU(this.imagePath);
        GMTrace.o(1131992317952L, 8434);
        return true;
      }
      if (!bg.nm(this.tIt)) {
        Toast.makeText(this.context, this.tIt, 1).show();
      }
      for (;;)
      {
        GMTrace.o(1131992317952L, 8434);
        return true;
        Toast.makeText(this.context, this.context.getString(a.h.qzD), 1).show();
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\tools\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */