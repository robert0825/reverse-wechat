package com.tencent.mm.plugin.qqmail.b;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.a.o;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class p
{
  private static SparseArray<String> nSV;
  public j nSQ;
  public c nSR;
  public e nSS;
  public Map<Long, d> nST;
  public Map<Long, b> nSU;
  Map<String, String> nSq;
  
  static
  {
    GMTrace.i(5456621731840L, 40655);
    nSV = null;
    GMTrace.o(5456621731840L, 40655);
  }
  
  public p(int paramInt, String paramString)
  {
    GMTrace.i(5454205812736L, 40637);
    this.nSq = new HashMap();
    this.nST = new HashMap();
    this.nSU = new HashMap();
    x.setHost("qqmail.weixin.qq.com:443");
    x.setUserAgent("weixin/" + paramString + "/0x" + Integer.toHexString(paramInt));
    reset();
    GMTrace.o(5454205812736L, 40637);
  }
  
  public static int a(d paramd)
  {
    GMTrace.i(16027073118208L, 119411);
    if (!paramd.nTe.nTd)
    {
      paramd.nTi.onSuccess(paramd.nTg.content, null);
      GMTrace.o(16027073118208L, 119411);
      return 0;
    }
    h.c localc = paramd.nTg;
    if (paramd.nTh == null)
    {
      paramd.nTi.onError(64534, "format error");
      GMTrace.o(16027073118208L, 119411);
      return 64534;
    }
    int i = bg.getInt((String)paramd.nTh.get(".Response.error.code"), 0);
    if (i == 0)
    {
      paramd.nTi.onSuccess(localc.content, paramd.nTh);
      GMTrace.o(16027073118208L, 119411);
      return 0;
    }
    paramd.nTi.onError(i, al(i, (String)paramd.nTh.get(".Response.error.message")));
    GMTrace.o(16027073118208L, 119411);
    return i;
  }
  
  public static String aYz()
  {
    GMTrace.i(5454608465920L, 40640);
    GMTrace.o(5454608465920L, 40640);
    return "https://qqmail.weixin.qq.com:443";
  }
  
  private static String al(int paramInt, String paramString)
  {
    GMTrace.i(5455682207744L, 40648);
    int i = 0;
    switch (paramInt)
    {
    default: 
      paramInt = i;
    }
    while (paramInt == 0)
    {
      GMTrace.o(5455682207744L, 40648);
      return paramString;
      paramInt = R.l.dOj;
      continue;
      paramInt = R.l.dOo;
      continue;
      paramInt = R.l.dOq;
      continue;
      paramInt = R.l.dOn;
      continue;
      paramInt = R.l.dOp;
      continue;
      paramInt = R.l.dOl;
      continue;
      paramInt = R.l.dOm;
    }
    paramString = a.X(ab.getContext(), paramInt);
    GMTrace.o(5455682207744L, 40648);
    return paramString;
  }
  
  public static String getDownloadPath()
  {
    GMTrace.i(5455145336832L, 40644);
    String str = com.tencent.mm.compatible.util.e.fRX;
    File localFile = new File(str);
    if (!localFile.exists()) {
      localFile.mkdir();
    }
    GMTrace.o(5455145336832L, 40644);
    return str;
  }
  
  private static String getLocalIp()
  {
    GMTrace.i(5455279554560L, 40645);
    try
    {
      InetAddress localInetAddress;
      do
      {
        localObject = NetworkInterface.getNetworkInterfaces();
        Enumeration localEnumeration;
        while (!localEnumeration.hasMoreElements())
        {
          if (!((Enumeration)localObject).hasMoreElements()) {
            break;
          }
          localEnumeration = ((NetworkInterface)((Enumeration)localObject).nextElement()).getInetAddresses();
        }
        localInetAddress = (InetAddress)localEnumeration.nextElement();
      } while (localInetAddress.isLoopbackAddress());
      Object localObject = localInetAddress.getHostAddress();
      GMTrace.o(5455279554560L, 40645);
      return (String)localObject;
    }
    catch (Exception localException)
    {
      GMTrace.o(5455279554560L, 40645);
      return null;
    }
    catch (SocketException localSocketException)
    {
      for (;;) {}
    }
  }
  
  public static String sR(int paramInt)
  {
    GMTrace.i(5455547990016L, 40647);
    if (nSV == null)
    {
      nSV = new SparseArray();
      localObject1 = HttpURLConnection.class.getDeclaredFields();
      int k = localObject1.length;
      int i = 0;
      while (i < k)
      {
        StringBuilder localStringBuilder = localObject1[i];
        int j = localStringBuilder.getModifiers();
        Object localObject2 = localStringBuilder.getName();
        if ((localObject2 != null) && (((String)localObject2).startsWith("HTTP_")) && (Modifier.isPublic(j)) && (Modifier.isFinal(j)) && (Modifier.isStatic(j))) {}
        try
        {
          int m = localStringBuilder.getInt(Integer.valueOf(0));
          localStringBuilder = new StringBuilder();
          localObject2 = ((String)localObject2).split("_");
          if (localObject2 != null)
          {
            j = 1;
            while (j < localObject2.length)
            {
              localStringBuilder.append(localObject2[j]).append(' ');
              j += 1;
            }
            localStringBuilder.append("error");
          }
          nSV.put(m, localStringBuilder.toString().toLowerCase());
        }
        catch (Exception localException)
        {
          for (;;) {}
        }
        i += 1;
      }
    }
    Object localObject1 = (String)nSV.get(paramInt);
    if (localObject1 == null)
    {
      localObject1 = al(paramInt, "request error");
      GMTrace.o(5455547990016L, 40647);
      return (String)localObject1;
    }
    GMTrace.o(5455547990016L, 40647);
    return (String)localObject1;
  }
  
  public final long a(final String paramString, int paramInt, Map<String, String> paramMap, h.d paramd, c paramc, a parama)
  {
    GMTrace.i(5454742683648L, 40641);
    Object localObject = paramMap;
    if (paramMap == null) {
      localObject = new HashMap();
    }
    ((Map)localObject).put("appname", "qqmail_weixin");
    ((Map)localObject).put("f", "xml");
    ((Map)localObject).put("charset", "utf-8");
    ((Map)localObject).put("clientip", getLocalIp());
    paramString = new d(paramString, new h.b(paramInt, (Map)localObject, getCookie(), paramd), parama);
    paramString.nTe = paramc;
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5476485955584L, 40803);
        p.b localb = new p.b(p.this, (byte)0);
        p.this.nST.put(Long.valueOf(paramString.id), paramString);
        p.this.nSU.put(Long.valueOf(paramString.id), localb);
        localb.b(paramString);
        GMTrace.o(5476485955584L, 40803);
      }
    });
    long l = paramString.id;
    GMTrace.o(5454742683648L, 40641);
    return l;
  }
  
  public final long a(String paramString, Map<String, String> paramMap, c paramc, a parama)
  {
    GMTrace.i(5454340030464L, 40638);
    long l = a(paramString, 1, paramMap, null, paramc, parama);
    GMTrace.o(5454340030464L, 40638);
    return l;
  }
  
  public final long b(String paramString, Map<String, String> paramMap, c paramc, a parama)
  {
    GMTrace.i(5454474248192L, 40639);
    long l = a(paramString, 0, paramMap, null, paramc, parama);
    GMTrace.o(5454474248192L, 40639);
    return l;
  }
  
  public final void cancel(long paramLong)
  {
    GMTrace.i(5454876901376L, 40642);
    b localb = (b)this.nSU.get(Long.valueOf(paramLong));
    if (localb != null)
    {
      localb.onCancelled();
      localb.cancel(true);
    }
    this.nSU.remove(Long.valueOf(paramLong));
    this.nST.remove(Long.valueOf(paramLong));
    GMTrace.o(5454876901376L, 40642);
  }
  
  public final Map<String, String> getCookie()
  {
    GMTrace.i(5455413772288L, 40646);
    at.AR();
    String str = (String)com.tencent.mm.y.c.xh().get(-1535680990, null);
    Map localMap = this.nSq;
    if (str == null) {}
    for (Object localObject = "";; localObject = str)
    {
      localMap.put("skey", localObject);
      at.AR();
      int i = bg.m(com.tencent.mm.y.c.xh().get(9, null), 0);
      this.nSq.put("uin", "o" + new o(i));
      w.d("MicroMsg.NormalMailAppService", "sKey:%b, uin:%d", new Object[] { Boolean.valueOf(bg.nm(str)), Integer.valueOf(i) });
      localObject = this.nSq;
      GMTrace.o(5455413772288L, 40646);
      return (Map<String, String>)localObject;
    }
  }
  
  public final void reset()
  {
    GMTrace.i(5455011119104L, 40643);
    x.EU(getDownloadPath());
    Object localObject = this.nSU.values().iterator();
    while (((Iterator)localObject).hasNext()) {
      ((b)((Iterator)localObject).next()).cancel(true);
    }
    this.nSU.clear();
    this.nST.clear();
    this.nSq.clear();
    at.AR();
    localObject = com.tencent.mm.y.c.zc();
    this.nSQ = new j((String)localObject + "addr/");
    this.nSR = new c((String)localObject + "draft/");
    this.nSS = new e((String)localObject + "http/", 0);
    GMTrace.o(5455011119104L, 40643);
  }
  
  public static abstract class a
  {
    public a()
    {
      GMTrace.i(5468969762816L, 40747);
      GMTrace.o(5468969762816L, 40747);
    }
    
    public void onComplete()
    {
      GMTrace.i(5469640851456L, 40752);
      GMTrace.o(5469640851456L, 40752);
    }
    
    public abstract void onError(int paramInt, String paramString);
    
    public void onProgress(int paramInt)
    {
      GMTrace.i(5469238198272L, 40749);
      GMTrace.o(5469238198272L, 40749);
    }
    
    public boolean onReady()
    {
      GMTrace.i(5469103980544L, 40748);
      GMTrace.o(5469103980544L, 40748);
      return true;
    }
    
    public abstract void onSuccess(String paramString, Map<String, String> paramMap);
  }
  
  private final class b
    extends AsyncTask<p.d, Integer, p.d>
    implements h.a
  {
    private h nSY;
    p.d nSZ;
    
    private b()
    {
      GMTrace.i(5447763361792L, 40589);
      GMTrace.o(5447763361792L, 40589);
    }
    
    public final void aYt()
    {
      GMTrace.i(5448031797248L, 40591);
      publishProgress(new Integer[] { Integer.valueOf(0) });
      GMTrace.o(5448031797248L, 40591);
    }
    
    public final boolean b(p.d paramd)
    {
      GMTrace.i(5447897579520L, 40590);
      if (!paramd.nTi.onReady())
      {
        GMTrace.o(5447897579520L, 40590);
        return false;
      }
      this.nSZ = paramd;
      super.execute(new p.d[] { paramd });
      GMTrace.o(5447897579520L, 40590);
      return true;
    }
    
    protected final void onCancelled()
    {
      GMTrace.i(5448166014976L, 40592);
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5463064182784L, 40703);
          if (p.b.a(p.b.this) != null) {
            p.b.a(p.b.this).cancel();
          }
          GMTrace.o(5463064182784L, 40703);
        }
        
        public final String toString()
        {
          GMTrace.i(5463198400512L, 40704);
          String str = super.toString() + "|onCancelled";
          GMTrace.o(5463198400512L, 40704);
          return str;
        }
      });
      super.onCancelled();
      GMTrace.o(5448166014976L, 40592);
    }
  }
  
  public static final class c
  {
    public boolean nTb;
    public boolean nTc;
    public boolean nTd;
    
    public c()
    {
      GMTrace.i(5465077448704L, 40718);
      this.nTb = false;
      this.nTc = true;
      this.nTd = true;
      GMTrace.o(5465077448704L, 40718);
    }
    
    public final void fromBundle(Bundle paramBundle)
    {
      GMTrace.i(5465345884160L, 40720);
      this.nTb = paramBundle.getBoolean("qqmail_httpoptions_expired");
      this.nTc = paramBundle.getBoolean("qqmail_httpoptions_needcache");
      this.nTd = paramBundle.getBoolean("qqmail_httpoptions_needparse");
      GMTrace.o(5465345884160L, 40720);
    }
    
    public final void toBundle(Bundle paramBundle)
    {
      GMTrace.i(5465211666432L, 40719);
      paramBundle.putBoolean("qqmail_httpoptions_expired", this.nTb);
      paramBundle.putBoolean("qqmail_httpoptions_needcache", this.nTc);
      paramBundle.putBoolean("qqmail_httpoptions_needparse", this.nTd);
      GMTrace.o(5465211666432L, 40719);
    }
  }
  
  private final class d
  {
    long id;
    p.c nTe;
    h.b nTf;
    h.c nTg;
    Map<String, String> nTh;
    p.a nTi;
    String uri;
    
    public d(String paramString, h.b paramb, p.a parama)
    {
      GMTrace.i(5476217520128L, 40801);
      this.id = System.currentTimeMillis();
      this.uri = paramString;
      this.nTf = paramb;
      this.nTi = parama;
      GMTrace.o(5476217520128L, 40801);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\b\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */