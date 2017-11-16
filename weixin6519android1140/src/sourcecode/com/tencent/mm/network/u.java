package com.tencent.mm.network;

import com.tencent.gmtrace.GMTrace;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class u
{
  public int hgk;
  public HttpURLConnection hhh;
  public String hhi;
  private Map<String, List<String>> hhj;
  public URL url;
  
  public u(URL paramURL, int paramInt)
  {
    GMTrace.i(13697321795584L, 102053);
    this.hhj = null;
    this.url = paramURL;
    this.hgk = paramInt;
    this.hhh = ((HttpURLConnection)this.url.openConnection());
    if (1 == this.hgk) {
      this.hhh.setInstanceFollowRedirects(false);
    }
    GMTrace.o(13697321795584L, 102053);
  }
  
  public final void OK()
  {
    GMTrace.i(13698395537408L, 102061);
    this.hhh.setDoInput(true);
    GMTrace.o(13698395537408L, 102061);
  }
  
  public final void OL()
  {
    GMTrace.i(13698529755136L, 102062);
    this.hhh.setDoOutput(true);
    GMTrace.o(13698529755136L, 102062);
  }
  
  public final void connect()
  {
    GMTrace.i(13697724448768L, 102056);
    if ((1 == this.hgk) && (this.hhj == null)) {
      this.hhj = this.hhh.getRequestProperties();
    }
    this.hhh.connect();
    GMTrace.o(13697724448768L, 102056);
  }
  
  public final String getHeaderField(String paramString)
  {
    GMTrace.i(13697992884224L, 102058);
    if ((1 == this.hgk) && (this.hhj == null)) {
      this.hhj = this.hhh.getRequestProperties();
    }
    paramString = this.hhh.getHeaderField(paramString);
    GMTrace.o(13697992884224L, 102058);
    return paramString;
  }
  
  public final Map<String, List<String>> getHeaderFields()
  {
    GMTrace.i(13697858666496L, 102057);
    if ((1 == this.hgk) && (this.hhj == null)) {
      this.hhj = this.hhh.getRequestProperties();
    }
    Map localMap = this.hhh.getHeaderFields();
    GMTrace.o(13697858666496L, 102057);
    return localMap;
  }
  
  public final InputStream getInputStream()
  {
    GMTrace.i(13698127101952L, 102059);
    if (1 == this.hgk)
    {
      if (this.hhj == null) {
        this.hhj = this.hhh.getRequestProperties();
      }
      getResponseCode();
    }
    InputStream localInputStream = this.hhh.getInputStream();
    GMTrace.o(13698127101952L, 102059);
    return localInputStream;
  }
  
  public final OutputStream getOutputStream()
  {
    GMTrace.i(13698261319680L, 102060);
    if (1 == this.hgk)
    {
      if (this.hhj == null) {
        this.hhj = this.hhh.getRequestProperties();
      }
      getResponseCode();
    }
    OutputStream localOutputStream = this.hhh.getOutputStream();
    GMTrace.o(13698261319680L, 102060);
    return localOutputStream;
  }
  
  public final int getResponseCode()
  {
    GMTrace.i(13697456013312L, 102054);
    int i;
    for (;;)
    {
      if ((1 == this.hgk) && (this.hhj == null)) {
        this.hhj = this.hhh.getRequestProperties();
      }
      i = this.hhh.getResponseCode();
      if ((1 != this.hgk) || (302 != i)) {
        break;
      }
      Object localObject = this.hhh.getHeaderField("Location");
      if (localObject == null)
      {
        GMTrace.o(13697456013312L, 102054);
        return i;
      }
      this.url = new URL(this.url, (String)localObject);
      this.hhh = ((HttpURLConnection)this.url.openConnection());
      this.hhh.setInstanceFollowRedirects(false);
      if (this.hhj != null)
      {
        localObject = this.hhj.keySet().iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          if ((!str.equals("Host")) && (!str.equals("X-Online-Host")))
          {
            List localList = (List)this.hhj.get(str);
            i = 0;
            while (i < localList.size())
            {
              this.hhh.setRequestProperty(str, (String)localList.get(i));
              i += 1;
            }
          }
        }
      }
      this.hhh.setRequestProperty("Host", this.url.getHost());
      this.hhh.setRequestProperty("X-Online-Host", this.url.getHost());
    }
    GMTrace.o(13697456013312L, 102054);
    return i;
  }
  
  public final void mY(String paramString)
  {
    GMTrace.i(13699200843776L, 102067);
    this.hhh.setRequestProperty("Referer", paramString);
    GMTrace.o(13699200843776L, 102067);
  }
  
  public final void setConnectTimeout(int paramInt)
  {
    GMTrace.i(13698932408320L, 102065);
    this.hhh.setConnectTimeout(paramInt);
    GMTrace.o(13698932408320L, 102065);
  }
  
  public final void setReadTimeout(int paramInt)
  {
    GMTrace.i(13699066626048L, 102066);
    this.hhh.setReadTimeout(paramInt);
    GMTrace.o(13699066626048L, 102066);
  }
  
  public final void setRequestMethod(String paramString)
  {
    GMTrace.i(13697590231040L, 102055);
    this.hhh.setRequestMethod(paramString);
    GMTrace.o(13697590231040L, 102055);
  }
  
  public final void setRequestProperty(String paramString1, String paramString2)
  {
    GMTrace.i(13698663972864L, 102063);
    this.hhh.setRequestProperty(paramString1, paramString2);
    GMTrace.o(13698663972864L, 102063);
  }
  
  public final void setUseCaches(boolean paramBoolean)
  {
    GMTrace.i(13698798190592L, 102064);
    this.hhh.setUseCaches(paramBoolean);
    GMTrace.o(13698798190592L, 102064);
  }
  
  public final String toString()
  {
    GMTrace.i(13699335061504L, 102068);
    String str = this.hhh.toString();
    GMTrace.o(13699335061504L, 102068);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\network\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */