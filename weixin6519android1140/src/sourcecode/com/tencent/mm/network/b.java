package com.tencent.mm.network;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public final class b
{
  public static a hgj;
  
  public static int a(u paramu)
  {
    GMTrace.i(13656116953088L, 101746);
    try
    {
      int i = paramu.getResponseCode();
      if (i != 200)
      {
        GMTrace.o(13656116953088L, 101746);
        return -1;
      }
      GMTrace.o(13656116953088L, 101746);
      return 0;
    }
    catch (Exception paramu)
    {
      w.e("MicroMsg.GprsSetting", "exception:%s", new Object[] { bg.f(paramu) });
      GMTrace.o(13656116953088L, 101746);
    }
    return -3;
  }
  
  public static int a(boolean paramBoolean, List<String> paramList, String paramString)
  {
    GMTrace.i(13655714299904L, 101743);
    if (hgj == null)
    {
      GMTrace.o(13655714299904L, 101743);
      return -1;
    }
    try
    {
      int i = hgj.wW().a(paramString, paramBoolean, paramList);
      GMTrace.o(13655714299904L, 101743);
      return i;
    }
    catch (Exception paramList)
    {
      w.e("MicroMsg.GprsSetting", "exception:%s", new Object[] { bg.f(paramList) });
      GMTrace.o(13655714299904L, 101743);
    }
    return -1;
  }
  
  public static u a(String paramString, b paramb)
  {
    GMTrace.i(13655982735360L, 101745);
    b localb = paramb;
    if (paramb == null) {
      localb = new b(paramString);
    }
    w.i("MicroMsg.GprsSetting", "hy: url redirect host: %s, url: %s, ip: %s, dns_type: %d", new Object[] { localb.host, localb.url, localb.ip, Integer.valueOf(localb.hgk) });
    paramString = new u(localb.url, localb.hgk);
    paramString.hhi = localb.ip;
    if (1 == localb.hgk)
    {
      paramString.setRequestProperty("Host", localb.host);
      paramString.setRequestProperty("X-Online-Host", localb.host);
    }
    GMTrace.o(13655982735360L, 101745);
    return paramString;
  }
  
  public static void a(a parama)
  {
    GMTrace.i(13655580082176L, 101742);
    w.i("MicroMsg.GprsSetting", "sethostimpl %b, [%s]", new Object[] { Boolean.valueOf(false), bg.bQW() });
    hgj = parama;
    GMTrace.o(13655580082176L, 101742);
  }
  
  public static InputStream k(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(13655848517632L, 101744);
    paramString = a(paramString, null);
    paramString.setConnectTimeout(paramInt1);
    paramString.setReadTimeout(paramInt2);
    paramString.setRequestMethod("GET");
    if (a(paramString) != 0)
    {
      GMTrace.o(13655848517632L, 101744);
      return null;
    }
    paramString = paramString.getInputStream();
    GMTrace.o(13655848517632L, 101744);
    return paramString;
  }
  
  public static v mX(String paramString)
  {
    GMTrace.i(13656251170816L, 101747);
    paramString = new v(paramString);
    GMTrace.o(13656251170816L, 101747);
    return paramString;
  }
  
  public static abstract interface a
  {
    public abstract e wW();
  }
  
  public static final class b
  {
    public int hgk;
    private ArrayList<String> hgl;
    public String hgm;
    public boolean hgn;
    private boolean hgo;
    public String host;
    public String ip;
    URL url;
    
    public b(String paramString)
    {
      GMTrace.i(13705106423808L, 102111);
      this.host = null;
      this.url = null;
      this.ip = "";
      this.hgk = 0;
      this.hgl = new ArrayList();
      this.hgn = false;
      this.hgo = false;
      this.hgm = paramString;
      try
      {
        this.url = new URL(paramString);
        this.host = this.url.getHost();
        Object localObject = new ArrayList();
        if ((b.hgj == null) || (b.hgj.wW() == null))
        {
          if (b.hgj == null) {}
          for (paramString = "-1";; paramString = b.hgj.wW())
          {
            w.e("MicroMsg.GprsSetting", "UrlRedirct ERR:AUTOAUTH NULL:%s  [%s]", new Object[] { paramString, bg.bQW() });
            GMTrace.o(13705106423808L, 102111);
            return;
          }
        }
        this.hgk = b.hgj.wW().getHostByName(this.host, (List)localObject);
        w.d("MicroMsg.GprsSetting", "[Arth.302] dnsType:%d  host:%s url:%s", new Object[] { Integer.valueOf(this.hgk), this.host, paramString });
        if (((ArrayList)localObject).size() <= 0)
        {
          this.hgk = 0;
          GMTrace.o(13705106423808L, 102111);
          return;
        }
        int i = this.hgk;
        if (1 != i)
        {
          GMTrace.o(13705106423808L, 102111);
          return;
        }
        localObject = (String)((ArrayList)localObject).get((int)(bg.Pv() % ((ArrayList)localObject).size()));
        this.ip = ((String)localObject);
        this.url = new URL(paramString.replaceFirst(this.host, (String)localObject));
        GMTrace.o(13705106423808L, 102111);
        return;
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.GprsSetting", "exception:%s", new Object[] { bg.f(paramString) });
        GMTrace.o(13705106423808L, 102111);
      }
    }
    
    public b(String paramString, boolean paramBoolean)
    {
      GMTrace.i(13705240641536L, 102112);
      this.host = null;
      this.url = null;
      this.ip = "";
      this.hgk = 0;
      this.hgl = new ArrayList();
      this.hgn = false;
      this.hgo = false;
      this.hgn = paramBoolean;
      this.hgm = paramString;
      try
      {
        this.url = new URL(paramString);
        this.host = this.url.getHost();
        if ((b.hgj == null) || (b.hgj.wW() == null))
        {
          if (b.hgj == null) {}
          for (paramString = "-1";; paramString = b.hgj.wW())
          {
            w.e("MicroMsg.GprsSetting", "UrlRedirct ERR:AUTOAUTH NULL:%s  [%s]", new Object[] { paramString, bg.bQW() });
            GMTrace.o(13705240641536L, 102112);
            return;
          }
        }
        this.hgk = b.hgj.wW().a(this.host, paramBoolean, this.hgl);
        Random localRandom = new Random();
        localRandom.setSeed(bg.Pv());
        Collections.shuffle(this.hgl, localRandom);
        w.d("MicroMsg.GprsSetting", "[Arth.302] dnsType:%d  host:%s url:%s ips:%s", new Object[] { Integer.valueOf(this.hgk), this.host, paramString, this.hgl });
        if (this.hgl.size() <= 0)
        {
          this.hgk = 0;
          GMTrace.o(13705240641536L, 102112);
          return;
        }
        int i = this.hgk;
        if (1 != i)
        {
          GMTrace.o(13705240641536L, 102112);
          return;
        }
        this.ip = ((String)this.hgl.remove(0));
        this.url = new URL(paramString.replaceFirst(this.host, this.ip));
        GMTrace.o(13705240641536L, 102112);
        return;
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.GprsSetting", "exception:%s", new Object[] { bg.f(paramString) });
        GMTrace.o(13705240641536L, 102112);
      }
    }
    
    private boolean Oy()
    {
      GMTrace.i(17536083034112L, 130654);
      this.ip = ((String)this.hgl.remove(0));
      try
      {
        this.url = new URL(this.hgm.replaceFirst(this.host, this.ip));
        GMTrace.o(17536083034112L, 130654);
        return true;
      }
      catch (MalformedURLException localMalformedURLException)
      {
        GMTrace.o(17536083034112L, 130654);
      }
      return false;
    }
    
    public final boolean Ox()
    {
      GMTrace.i(17535948816384L, 130653);
      if (!this.hgn)
      {
        if ((!this.hgl.isEmpty()) && (Oy()))
        {
          this.hgl.clear();
          GMTrace.o(17535948816384L, 130653);
          return true;
        }
        this.hgn = true;
        this.hgk = b.hgj.wW().a(this.host, this.hgn, this.hgl);
        Random localRandom = new Random();
        localRandom.setSeed(bg.Pv());
        Collections.shuffle(this.hgl, localRandom);
      }
      if ((!this.hgl.isEmpty()) && (Oy()))
      {
        this.hgl.clear();
        GMTrace.o(17535948816384L, 130653);
        return true;
      }
      if (!this.hgo)
      {
        this.hgo = true;
        try
        {
          this.url = new URL(this.hgm);
          GMTrace.o(17535948816384L, 130653);
          return true;
        }
        catch (MalformedURLException localMalformedURLException)
        {
          GMTrace.o(17535948816384L, 130653);
          return false;
        }
      }
      GMTrace.o(17535948816384L, 130653);
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\network\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */