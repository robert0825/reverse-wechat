package com.tencent.mm.plugin.qqmail.b;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

public final class g
  extends h
{
  private HttpClient nSj;
  private HttpRequestBase nSk;
  private HttpResponse nSl;
  private boolean nSm;
  private int result;
  
  public g()
  {
    GMTrace.i(5463332618240L, 40705);
    this.nSj = null;
    this.nSk = null;
    this.nSl = null;
    this.result = 0;
    this.nSm = false;
    GMTrace.o(5463332618240L, 40705);
  }
  
  private static void a(h.b paramb, HttpRequestBase paramHttpRequestBase)
  {
    GMTrace.i(5463735271424L, 40708);
    if (paramb.nSp == null)
    {
      GMTrace.o(5463735271424L, 40708);
      return;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramb.nSp.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new BasicNameValuePair(str, (String)paramb.nSp.get(str)));
    }
    ((HttpPost)paramHttpRequestBase).setEntity(new UrlEncodedFormEntity(localArrayList, "utf-8"));
    GMTrace.o(5463735271424L, 40708);
  }
  
  public final h.c a(String paramString1, String paramString2, h.b paramb, h.a parama)
  {
    GMTrace.i(5463466835968L, 40706);
    w.d("MicroMsg.URLConnectionUtil", "uri=" + paramString2 + ", " + paramb);
    for (;;)
    {
      Object localObject2;
      try
      {
        this.nSm = false;
        this.nSj = new DefaultHttpClient();
        if (paramb.nSo != 0) {
          continue;
        }
        if (paramb.nSo != 0) {
          continue;
        }
        localObject1 = paramb.nSp;
        this.nSk = new HttpGet(c(paramString1, paramString2, (Map)localObject1));
        this.nSk.addHeader("User-Agent", log);
        this.nSk.addHeader("Host", host);
        System.setProperty("http.keepAlive", "false");
        this.nSk.addHeader("Accept-Charset", "utf-8");
        this.nSk.addHeader("Accept-Encoding", "compress;q=0.5, gzip;q=1.0");
        this.nSk.addHeader("Content-Type", "text/html");
        this.nSk.addHeader("Cookie", G(paramb.nSq));
        if (paramb.nSo == 1) {
          a(paramb, this.nSk);
        }
        this.nSl = this.nSj.execute(this.nSk);
        this.result = this.nSl.getStatusLine().getStatusCode();
        localObject1 = null;
        localObject2 = null;
        localHttpEntity = null;
        if (this.nSl.getFirstHeader("set-cookie") == null) {
          break label1316;
        }
        paramString1 = this.nSl.getFirstHeader("set-cookie").getValue();
        if (this.nSl.getFirstHeader("Content-Encoding") != null) {
          localObject1 = this.nSl.getFirstHeader("Content-Encoding").getValue();
        }
        if (this.nSl.getFirstHeader("Content-Disposition") != null) {
          localObject2 = this.nSl.getFirstHeader("Content-Disposition").getValue();
        }
        if ((localObject2 == null) || (!((String)localObject2).contains("attachment;")) || (!paramString2.contains("download"))) {
          continue;
        }
        i = 1;
      }
      catch (UnsupportedEncodingException paramString1)
      {
        paramString1 = new h.c(55535, null, "unsupported ecoding");
        if (this.nSj == null) {
          continue;
        }
        this.nSj.getConnectionManager().shutdown();
        GMTrace.o(5463466835968L, 40706);
        return paramString1;
        localObject1 = null;
        continue;
        i = 0;
        continue;
        localHttpEntity = this.nSl.getEntity();
        localHttpEntity.getContentLength();
        localObject2 = localHttpEntity.getContent();
        if ((localObject1 == null) || (!((String)localObject1).contains("gzip"))) {
          break label1309;
        }
        localObject1 = new GZIPInputStream((InputStream)localObject2);
        if (i == 0) {
          continue;
        }
        localObject2 = nSn;
        StringBuilder localStringBuilder = new StringBuilder();
        if (paramb.nSp.get("default_attach_name") != null) {
          continue;
        }
        paramb = Long.valueOf(System.currentTimeMillis());
        paramb = new FileOutputStream(new File((String)localObject2, paramb), true);
        localObject2 = new byte['Ѐ'];
        if (this.nSm) {
          continue;
        }
        j = ((InputStream)localObject1).read((byte[])localObject2);
        if (j <= 0) {
          continue;
        }
        paramb.write((byte[])localObject2, 0, j);
        paramb.flush();
        parama.aYt();
        continue;
      }
      catch (UnknownHostException paramString1)
      {
        paramString1 = new h.c(55531, null, "unknow host");
        if (this.nSj == null) {
          continue;
        }
        this.nSj.getConnectionManager().shutdown();
        GMTrace.o(5463466835968L, 40706);
        return paramString1;
        paramb = (Serializable)paramb.nSp.get("default_attach_name");
        continue;
        paramb = new ByteArrayOutputStream();
        continue;
      }
      catch (ClientProtocolException paramString1)
      {
        HttpEntity localHttpEntity;
        paramString1 = new h.c(55534, null, "client protocol error");
        if (this.nSj == null) {
          continue;
        }
        this.nSj.getConnectionManager().shutdown();
        GMTrace.o(5463466835968L, 40706);
        return paramString1;
        if (!this.nSm) {
          continue;
        }
        paramb.flush();
        paramb.close();
        if (this.nSj == null) {
          continue;
        }
        this.nSj.getConnectionManager().shutdown();
        GMTrace.o(5463466835968L, 40706);
        return null;
        int j = this.result;
        parama = EV(paramString1);
        if (i == 0) {
          continue;
        }
        paramString1 = "";
        paramString1 = new h.c(j, parama, paramString1);
        paramb.flush();
        paramb.close();
        localHttpEntity.consumeContent();
        w.d("MicroMsg.URLConnectionUtil", "uri=" + paramString2 + ", " + paramString1);
        if (this.nSj == null) {
          continue;
        }
        this.nSj.getConnectionManager().shutdown();
        GMTrace.o(5463466835968L, 40706);
        return paramString1;
        paramString1 = new String(((ByteArrayOutputStream)paramb).toByteArray());
        continue;
      }
      catch (IllegalStateException paramString1)
      {
        paramString1 = new h.c(55533, null, "illegal state");
        if (this.nSj == null) {
          continue;
        }
        this.nSj.getConnectionManager().shutdown();
        GMTrace.o(5463466835968L, 40706);
        return paramString1;
      }
      catch (FileNotFoundException paramString1)
      {
        paramString1 = new h.c(55532, null, "output file not found");
        if (this.nSj == null) {
          continue;
        }
        this.nSj.getConnectionManager().shutdown();
        GMTrace.o(5463466835968L, 40706);
        return paramString1;
      }
      catch (Exception paramString1)
      {
        w.printErrStackTrace("MicroMsg.URLConnectionUtil", paramString1, "http unavailable", new Object[0]);
        if (this.result != 0) {
          continue;
        }
        i = 503;
        paramString1 = new h.c(i, null, null);
        if (this.nSj == null) {
          continue;
        }
        this.nSj.getConnectionManager().shutdown();
        GMTrace.o(5463466835968L, 40706);
        return paramString1;
        i = this.result;
        continue;
      }
      catch (OutOfMemoryError paramString1)
      {
        w.printErrStackTrace("MicroMsg.URLConnectionUtil", paramString1, "http unavailable", new Object[0]);
        if (this.result != 0) {
          continue;
        }
        int i = 503;
        paramString1 = new h.c(i, null, null);
        if (this.nSj == null) {
          continue;
        }
        this.nSj.getConnectionManager().shutdown();
        GMTrace.o(5463466835968L, 40706);
        return paramString1;
        i = this.result;
        continue;
      }
      finally
      {
        if (this.nSj == null) {
          continue;
        }
        this.nSj.getConnectionManager().shutdown();
      }
      if (i == 0)
      {
        localObject2 = localHttpEntity;
        if (this.nSl.getFirstHeader("Content-Length") != null) {
          localObject2 = this.nSl.getFirstHeader("Content-Length").getValue();
        }
        if ((!TextUtils.isEmpty((CharSequence)localObject2)) && (bg.getInt((String)localObject2, 0) > 5242880L))
        {
          paramString1 = new h.c(55536, null, "mail content to large");
          if (this.nSj != null) {
            this.nSj.getConnectionManager().shutdown();
          }
          GMTrace.o(5463466835968L, 40706);
          return paramString1;
          localObject1 = null;
          continue;
          if (paramb.nSo == 0)
          {
            localObject1 = paramb.nSp;
            this.nSk = new HttpPost(c(paramString1, paramString2, (Map)localObject1));
            continue;
          }
        }
      }
      label1309:
      Object localObject1 = localObject2;
      continue;
      label1316:
      paramString1 = null;
    }
  }
  
  public final void cancel()
  {
    GMTrace.i(5463601053696L, 40707);
    w.d("MicroMsg.URLConnectionUtil", "cancel conection.");
    this.nSm = true;
    if ((this.nSk != null) && (!this.nSk.isAborted())) {
      this.nSk.abort();
    }
    if (this.nSj != null) {
      this.nSj.getConnectionManager().shutdown();
    }
    GMTrace.o(5463601053696L, 40707);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */