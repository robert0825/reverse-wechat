package com.tencent.mm.network;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public final class v
{
  public HttpsURLConnection hhk;
  
  public v(String paramString)
  {
    this(new URL(paramString));
    GMTrace.i(13646721712128L, 101676);
    GMTrace.o(13646721712128L, 101676);
  }
  
  private v(URL paramURL)
  {
    GMTrace.i(13646855929856L, 101677);
    this.hhk = null;
    try
    {
      this.hhk = ((HttpsURLConnection)paramURL.openConnection());
      GMTrace.o(13646855929856L, 101677);
      return;
    }
    catch (MalformedURLException paramURL)
    {
      w.e("MicroMsg.MMHttpsUrlConnection", "MalformedURLException : %s", new Object[] { paramURL.getMessage() });
      w.e("MicroMsg.MMHttpsUrlConnection", "exception:%s", new Object[] { bg.f(paramURL) });
      GMTrace.o(13646855929856L, 101677);
      return;
    }
    catch (IOException paramURL)
    {
      w.e("MicroMsg.MMHttpsUrlConnection", "IOException : %s", new Object[] { paramURL.getMessage() });
      w.e("MicroMsg.MMHttpsUrlConnection", "exception:%s", new Object[] { bg.f(paramURL) });
      GMTrace.o(13646855929856L, 101677);
      return;
    }
    catch (Exception paramURL)
    {
      w.e("MicroMsg.MMHttpsUrlConnection", "Exception :" + paramURL.getMessage());
      w.e("MicroMsg.MMHttpsUrlConnection", "exception:%s", new Object[] { bg.f(paramURL) });
      GMTrace.o(13646855929856L, 101677);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\network\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */