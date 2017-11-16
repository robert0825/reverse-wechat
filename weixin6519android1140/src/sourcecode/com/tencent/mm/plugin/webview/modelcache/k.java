package com.tencent.mm.plugin.webview.modelcache;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.LinkedList;
import java.util.List;

public final class k
  extends i<f>
{
  private static volatile k rFN;
  private final e fTZ;
  public final boolean rFD;
  
  static
  {
    GMTrace.i(12352862814208L, 92036);
    rFN = null;
    GMTrace.o(12352862814208L, 92036);
  }
  
  private k(e parame)
  {
    super(parame, f.fTp, "WebViewResourceCache", null);
    GMTrace.i(12351654854656L, 92027);
    this.fTZ = parame;
    if (parame != null) {}
    for (boolean bool = true;; bool = false)
    {
      this.rFD = bool;
      if (!this.rFD) {
        w.e("MicroMsg.WebViewCacheResStorage", "storage can not work!!!");
      }
      GMTrace.o(12351654854656L, 92027);
      return;
    }
  }
  
  private boolean a(f paramf)
  {
    GMTrace.i(12352191725568L, 92031);
    if (!this.rFD)
    {
      GMTrace.o(12352191725568L, 92031);
      return false;
    }
    if (bg.nm(paramf.field_url))
    {
      w.d("MicroMsg.WebViewCacheResStorage", "insertWebViewCacheRes, url is null or nil");
      GMTrace.o(12352191725568L, 92031);
      return false;
    }
    String str = aa.RP(paramf.field_url);
    if (bg.nm(str))
    {
      w.e("MicroMsg.WebViewCacheResStorage", "insertWebViewCacheRes, get md5 is null or nil , url = %s", new Object[] { paramf.field_url });
      GMTrace.o(12352191725568L, 92031);
      return false;
    }
    paramf.field_urlMd5Hashcode = str.hashCode();
    long l = bg.Pu();
    paramf.field_accessTime = l;
    paramf.field_createTime = l;
    boolean bool = a(paramf, false);
    GMTrace.o(12352191725568L, 92031);
    return bool;
  }
  
  public static List<d.a> bCI()
  {
    GMTrace.i(12351386419200L, 92025);
    LinkedList localLinkedList = new LinkedList();
    String str = i.a(f.fTp, "WebViewResourceCache");
    localLinkedList.add(new d.a("WEBVIEW_RESOURCE_CACHE_TABLE".hashCode(), new String[] { str }));
    GMTrace.o(12351386419200L, 92025);
    return localLinkedList;
  }
  
  public static k bCJ()
  {
    GMTrace.i(12351520636928L, 92026);
    k localk;
    if (!at.AU())
    {
      localk = new k(null);
      GMTrace.o(12351520636928L, 92026);
      return localk;
    }
    if (rFN == null) {}
    try
    {
      if ((rFN == null) || (!rFN.rFD))
      {
        at.AR();
        rFN = new k(c.yH());
      }
      localk = rFN;
      GMTrace.o(12351520636928L, 92026);
      return localk;
    }
    finally {}
  }
  
  static String xz(int paramInt)
  {
    GMTrace.i(12351789072384L, 92028);
    String str = "1=1";
    if ((!b.a.xv(paramInt)) || (!b.a.xu(paramInt))) {
      str = String.format(" %s=%s ", new Object[] { "protocol", Integer.valueOf(paramInt) });
    }
    GMTrace.o(12351789072384L, 92028);
    return str;
  }
  
  public final boolean b(f paramf)
  {
    GMTrace.i(12352594378752L, 92034);
    if (!this.rFD)
    {
      GMTrace.o(12352594378752L, 92034);
      return false;
    }
    if (bg.nm(paramf.field_url))
    {
      w.d("MicroMsg.WebViewCacheResStorage", "updateWebViewCacheRes, url is null or nil");
      GMTrace.o(12352594378752L, 92034);
      return false;
    }
    long l = bg.Pu();
    paramf.field_accessTime = l;
    paramf.field_createTime = l;
    w.d("MicroMsg.WebViewCacheResStorage", "updateWebViewCacheRes, record = " + paramf);
    boolean bool = a(paramf, false, new String[] { "urlMd5Hashcode", "appId", "domain", "cacheType", "packageId" });
    GMTrace.o(12352594378752L, 92034);
    return bool;
  }
  
  public final boolean checkIsCached(String paramString, int paramInt)
  {
    GMTrace.i(12352057507840L, 92030);
    if (!this.rFD)
    {
      GMTrace.o(12352057507840L, 92030);
      return false;
    }
    if (bg.nm(paramString))
    {
      GMTrace.o(12352057507840L, 92030);
      return false;
    }
    paramString = rawQuery(String.format("select * from %s where %s=? and %s", new Object[] { "WebViewResourceCache", "urlMd5Hashcode", xz(paramInt) }), new String[] { String.valueOf(aa.RP(paramString).hashCode()) });
    if (paramString == null)
    {
      GMTrace.o(12352057507840L, 92030);
      return false;
    }
    if (paramString.getCount() > 0)
    {
      paramString.close();
      GMTrace.o(12352057507840L, 92030);
      return true;
    }
    paramString.close();
    GMTrace.o(12352057507840L, 92030);
    return false;
  }
  
  public final boolean insert(f paramf, int paramInt1, int paramInt2)
  {
    GMTrace.i(12352325943296L, 92032);
    boolean bool = a(paramf);
    GMTrace.o(12352325943296L, 92032);
    return bool;
  }
  
  public final List<f> l(String paramString, String... paramVarArgs)
  {
    GMTrace.i(12351923290112L, 92029);
    paramString = rawQuery(paramString, paramVarArgs);
    if (paramString == null)
    {
      GMTrace.o(12351923290112L, 92029);
      return null;
    }
    if (paramString.moveToFirst())
    {
      paramVarArgs = new LinkedList();
      do
      {
        f localf = new f();
        localf.b(paramString);
        paramVarArgs.add(localf);
      } while (paramString.moveToNext());
      paramString.close();
      GMTrace.o(12351923290112L, 92029);
      return paramVarArgs;
    }
    paramString.close();
    GMTrace.o(12351923290112L, 92029);
    return null;
  }
  
  public final boolean update(f paramf, int paramInt1, int paramInt2)
  {
    GMTrace.i(12352460161024L, 92033);
    boolean bool = b(paramf);
    GMTrace.o(12352460161024L, 92033);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\modelcache\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */