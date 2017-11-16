package com.tencent.mm.sdk.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class b
{
  protected final String log;
  
  public b()
  {
    GMTrace.i(13978105282560L, 104145);
    this.log = "weixin/android";
    GMTrace.o(13978105282560L, 104145);
  }
  
  public static Map<String, String> EV(String paramString)
  {
    GMTrace.i(13978373718016L, 104147);
    HashMap localHashMap = new HashMap();
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(13978373718016L, 104147);
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
    GMTrace.o(13978373718016L, 104147);
    return localHashMap;
  }
  
  public abstract void a(b paramb, c paramc);
  
  public final void a(final b paramb, final c paramc, final ae paramae)
  {
    GMTrace.i(21020106817536L, 156612);
    e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(13977971064832L, 104144);
        b.this.a(paramb, paramc);
        if (paramae != null)
        {
          paramae.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(13978642153472L, 104149);
              b.1.this.vhi.onComplete();
              GMTrace.o(13978642153472L, 104149);
            }
          });
          GMTrace.o(13977971064832L, 104144);
          return;
        }
        paramc.onComplete();
        GMTrace.o(13977971064832L, 104144);
      }
    }, getClass().getName());
    GMTrace.o(21020106817536L, 156612);
  }
  
  public static final class a
  {
    public String filePath;
  }
  
  public static final class b
  {
    public String host;
    public int itI;
    public int nSo;
    public Map<String, String> nSp;
    public Map<String, String> nSq;
    public String uri;
    public String vhl;
    public b.a vhm;
    
    public b()
    {
      GMTrace.i(13977434193920L, 104140);
      this.nSo = 0;
      this.nSp = null;
      this.nSq = null;
      this.vhm = null;
      GMTrace.o(13977434193920L, 104140);
    }
    
    public final String getUrl()
    {
      GMTrace.i(13977568411648L, 104141);
      StringBuilder localStringBuilder = new StringBuilder();
      if ((!this.uri.startsWith("http://")) && (!this.uri.startsWith("https://"))) {
        localStringBuilder.append(this.vhl + this.host);
      }
      localStringBuilder.append(this.uri);
      if (this.nSp == null)
      {
        str1 = localStringBuilder.toString();
        GMTrace.o(13977568411648L, 104141);
        return str1;
      }
      localStringBuilder.append('?');
      Iterator localIterator = this.nSp.keySet().iterator();
      int i = 1;
      if (localIterator.hasNext())
      {
        String str2 = (String)localIterator.next();
        String str3 = (String)this.nSp.get(str2);
        if (i != 0) {}
        for (str1 = "";; str1 = "&")
        {
          localStringBuilder.append(str1).append(URLEncoder.encode(str2, "utf-8")).append('=').append(URLEncoder.encode(bg.nl(str3), "utf-8"));
          i = 0;
          break;
        }
      }
      String str1 = localStringBuilder.toString();
      GMTrace.o(13977568411648L, 104141);
      return str1;
    }
    
    public final String toString()
    {
      GMTrace.i(13977702629376L, 104142);
      try
      {
        String str = getUrl();
        GMTrace.o(13977702629376L, 104142);
        return str;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        w.printErrStackTrace("MicroMsg.HttpWrapperBase", localUnsupportedEncodingException, "", new Object[0]);
        GMTrace.o(13977702629376L, 104142);
      }
      return "";
    }
  }
  
  public static class c
  {
    public String content;
    public Map<String, String> nSq;
    public int status;
    public b.a vhm;
    
    public c(int paramInt, Map<String, String> paramMap, String paramString)
    {
      GMTrace.i(13978776371200L, 104150);
      this.status = 0;
      this.status = 0;
      this.nSq = null;
      this.content = paramString;
      GMTrace.o(13978776371200L, 104150);
    }
    
    public void onComplete()
    {
      GMTrace.i(13979044806656L, 104152);
      GMTrace.o(13979044806656L, 104152);
    }
    
    public String toString()
    {
      GMTrace.i(13978910588928L, 104151);
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
        GMTrace.o(13978910588928L, 104151);
        return (String)localObject;
        localObject = "";
        break;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\sdk\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */