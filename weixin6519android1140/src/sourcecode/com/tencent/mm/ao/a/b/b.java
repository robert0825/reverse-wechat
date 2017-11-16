package com.tencent.mm.ao.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;

public final class b
  implements com.tencent.mm.ao.a.c.b
{
  public b()
  {
    GMTrace.i(13718125543424L, 102208);
    GMTrace.o(13718125543424L, 102208);
  }
  
  public final com.tencent.mm.ao.a.d.b ks(String paramString)
  {
    GMTrace.i(13718259761152L, 102209);
    w.d("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data from url:%s", new Object[] { paramString });
    try
    {
      paramString = (HttpURLConnection)new URL(paramString).openConnection();
      paramString.setConnectTimeout(15000);
      paramString.setReadTimeout(20000);
      if (paramString == null) {
        w.i("MicroMsg.imageload.DefaultImageDownloader.HttpClientFactory", "open connection failed.");
      }
      if (paramString.getResponseCode() >= 300)
      {
        paramString.disconnect();
        w.w("MicroMsg.imageload.DefaultImageDownloader.HttpClientFactory", "dz[httpURLConnectionGet 300]");
        GMTrace.o(13718259761152L, 102209);
        return null;
      }
      Object localObject = paramString.getInputStream();
      String str = paramString.getContentType();
      localObject = e.h((InputStream)localObject);
      paramString.disconnect();
      paramString = new com.tencent.mm.ao.a.d.b((byte[])localObject, str);
      GMTrace.o(13718259761152L, 102209);
      return paramString;
    }
    catch (InterruptedException paramString)
    {
      w.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", new Object[] { bg.f(paramString) });
      paramString = new com.tencent.mm.ao.a.d.b(null, null);
      GMTrace.o(13718259761152L, 102209);
      return paramString;
    }
    catch (UnknownHostException paramString)
    {
      for (;;)
      {
        w.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", new Object[] { bg.f(paramString) });
      }
    }
    catch (SSLHandshakeException paramString)
    {
      for (;;)
      {
        w.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", new Object[] { bg.f(paramString) });
      }
    }
    catch (SocketException paramString)
    {
      for (;;)
      {
        w.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", new Object[] { bg.f(paramString) });
      }
    }
    catch (SocketTimeoutException paramString)
    {
      for (;;)
      {
        w.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", new Object[] { bg.f(paramString) });
      }
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        w.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", new Object[] { bg.f(paramString) });
      }
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", new Object[] { bg.f(paramString) });
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\a\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */