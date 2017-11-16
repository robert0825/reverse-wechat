package com.tencent.mm.plugin.qqmail.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class h
{
  protected static String host;
  protected static int itI;
  protected static String log;
  protected static String nSn;
  
  static
  {
    GMTrace.i(5450850369536L, 40612);
    host = "";
    log = "weixin/android";
    nSn = "";
    itI = 0;
    GMTrace.o(5450850369536L, 40612);
  }
  
  public h()
  {
    GMTrace.i(5449642409984L, 40603);
    GMTrace.o(5449642409984L, 40603);
  }
  
  public static void EU(String paramString)
  {
    GMTrace.i(5450045063168L, 40606);
    nSn = paramString;
    GMTrace.o(5450045063168L, 40606);
  }
  
  protected static Map<String, String> EV(String paramString)
  {
    GMTrace.i(5450716151808L, 40611);
    HashMap localHashMap = new HashMap();
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(5450716151808L, 40611);
      return localHashMap;
    }
    paramString = paramString.split(";");
    int j = paramString.length;
    int i = 0;
    while (i < j)
    {
      String[] arrayOfString = paramString[i].split("=");
      if (arrayOfString.length == 2) {
        localHashMap.put(arrayOfString[0], arrayOfString[1]);
      }
      i += 1;
    }
    GMTrace.o(5450716151808L, 40611);
    return localHashMap;
  }
  
  protected static String G(Map<String, String> paramMap)
  {
    GMTrace.i(5450581934080L, 40610);
    if ((paramMap == null) || (paramMap.size() == 0))
    {
      GMTrace.o(5450581934080L, 40610);
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramMap.keySet().iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localStringBuilder.append(URLEncoder.encode(str, "utf-8")).append('=').append(URLEncoder.encode((String)paramMap.get(str), "utf-8"));
      i += 1;
      if (paramMap.size() > i) {
        localStringBuilder.append("; ");
      }
    }
    paramMap = localStringBuilder.toString();
    GMTrace.o(5450581934080L, 40610);
    return paramMap;
  }
  
  protected static String c(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    GMTrace.i(5450447716352L, 40609);
    StringBuilder localStringBuilder = new StringBuilder();
    if ((!paramString2.startsWith("http://")) && (!paramString2.startsWith("https://"))) {
      localStringBuilder.append(paramString1 + host);
    }
    localStringBuilder.append(paramString2);
    if (paramMap == null)
    {
      paramString1 = localStringBuilder.toString();
      GMTrace.o(5450447716352L, 40609);
      return paramString1;
    }
    localStringBuilder.append('?');
    paramString2 = paramMap.keySet().iterator();
    int i = 1;
    if (paramString2.hasNext())
    {
      String str1 = (String)paramString2.next();
      String str2 = (String)paramMap.get(str1);
      if (i != 0) {}
      for (paramString1 = "";; paramString1 = "&")
      {
        localStringBuilder.append(paramString1).append(URLEncoder.encode(str1, "utf-8")).append('=').append(URLEncoder.encode(bg.nl(str2), "utf-8"));
        i = 0;
        break;
      }
    }
    paramString1 = localStringBuilder.toString();
    GMTrace.o(5450447716352L, 40609);
    return paramString1;
  }
  
  public static void setHost(String paramString)
  {
    GMTrace.i(5449776627712L, 40604);
    x.host = paramString;
    GMTrace.o(5449776627712L, 40604);
  }
  
  public static void setUserAgent(String paramString)
  {
    GMTrace.i(5449910845440L, 40605);
    x.log = paramString;
    GMTrace.o(5449910845440L, 40605);
  }
  
  public abstract c a(String paramString1, String paramString2, b paramb, a parama);
  
  public abstract void cancel();
  
  public static abstract interface a
  {
    public abstract void aYt();
  }
  
  public static final class b
  {
    int nSo;
    Map<String, String> nSp;
    Map<String, String> nSq;
    h.d nSr;
    
    public b(int paramInt, Map<String, String> paramMap1, Map<String, String> paramMap2, h.d paramd)
    {
      GMTrace.i(5449105539072L, 40599);
      this.nSo = paramInt;
      this.nSp = paramMap1;
      this.nSq = paramMap2;
      this.nSr = paramd;
      GMTrace.o(5449105539072L, 40599);
    }
    
    public final String toString()
    {
      GMTrace.i(5449239756800L, 40600);
      StringBuilder localStringBuilder = new StringBuilder("Request method:").append(this.nSo).append(", params:");
      if (this.nSp != null)
      {
        localObject = this.nSp;
        localStringBuilder = localStringBuilder.append(localObject).append(", cookie:");
        if (this.nSq == null) {
          break label90;
        }
      }
      label90:
      for (Object localObject = this.nSq;; localObject = "")
      {
        localObject = localObject;
        GMTrace.o(5449239756800L, 40600);
        return (String)localObject;
        localObject = "";
        break;
      }
    }
  }
  
  public static final class c
  {
    String content;
    Map<String, String> nSq;
    int status;
    
    public c(int paramInt, Map<String, String> paramMap, String paramString)
    {
      GMTrace.i(5452863635456L, 40627);
      this.status = 0;
      this.status = paramInt;
      this.nSq = paramMap;
      this.content = paramString;
      GMTrace.o(5452863635456L, 40627);
    }
    
    public final String toString()
    {
      GMTrace.i(5452997853184L, 40628);
      StringBuilder localStringBuilder = new StringBuilder("Response status:").append(this.status).append(", cookie:");
      Object localObject;
      if (this.nSq != null)
      {
        localObject = this.nSq;
        localObject = localStringBuilder.append(localObject).append(", content length :");
        if (this.content == null) {
          break label93;
        }
      }
      label93:
      for (int i = this.content.length();; i = 0)
      {
        localObject = i;
        GMTrace.o(5452997853184L, 40628);
        return (String)localObject;
        localObject = "";
        break;
      }
    }
  }
  
  public static final class d
  {
    String eJB;
    String filePath;
    
    public d(String paramString1, String paramString2)
    {
      GMTrace.i(5473801601024L, 40783);
      this.eJB = paramString1;
      this.filePath = paramString2;
      GMTrace.o(5473801601024L, 40783);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */