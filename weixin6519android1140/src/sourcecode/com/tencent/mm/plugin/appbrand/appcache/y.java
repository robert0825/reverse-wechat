package com.tencent.mm.plugin.appbrand.appcache;

import android.content.ContentValues;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.pluginsdk.j.a.d.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class y
{
  private static volatile y hKp;
  private final Map<String, Map<a, Boolean>> hKq;
  private final q hKr;
  
  static
  {
    GMTrace.i(10609777180672L, 79049);
    hKp = null;
    GMTrace.o(10609777180672L, 79049);
  }
  
  public y()
  {
    GMTrace.i(10608032350208L, 79036);
    this.hKq = new android.support.v4.e.a();
    this.hKr = new q();
    GMTrace.o(10608032350208L, 79036);
  }
  
  private static y SY()
  {
    GMTrace.i(10608166567936L, 79037);
    if (((com.tencent.mm.plugin.appbrand.a.a)h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RZ() == null)
    {
      hKp = null;
      GMTrace.o(10608166567936L, 79037);
      return null;
    }
    if (hKp == null) {}
    try
    {
      if (hKp == null) {
        hKp = new y();
      }
      y localy = hKp;
      GMTrace.o(10608166567936L, 79037);
      return localy;
    }
    finally {}
  }
  
  static void a(String paramString1, String paramString2, y.a.b paramb)
  {
    GMTrace.i(19996428206080L, 148985);
    if (SY() == null)
    {
      w.e("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadFail, get instance null !!!");
      GMTrace.o(19996428206080L, 148985);
      return;
    }
    a(paramString1, paramString2, paramb, null);
    GMTrace.o(19996428206080L, 148985);
  }
  
  static void a(String paramString1, String paramString2, y.a.b paramb, y.a.a parama)
  {
    GMTrace.i(15543620861952L, 115809);
    paramString1 = ot(paramString1);
    if (paramString1 != null)
    {
      paramString1 = paramString1.keySet().iterator();
      while (paramString1.hasNext())
      {
        a locala = (a)paramString1.next();
        if (locala != null) {
          locala.a(paramString2, paramb, parama);
        }
      }
      GMTrace.o(15543620861952L, 115809);
      return;
    }
    w.d("MicroMsg.AppBrandWxaPkgUpdater", "callback, null callback appId = %s", new Object[] { paramString2 });
    GMTrace.o(15543620861952L, 115809);
  }
  
  static void a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, g.a parama)
  {
    GMTrace.i(19996562423808L, 148986);
    boolean bool = c.a.fI(paramInt2);
    if (SY() == null)
    {
      w.e("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadComplete, get instance null !!!");
      GMTrace.o(19996562423808L, 148986);
      return;
    }
    if (bg.nm(paramString3))
    {
      w.e("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadComplete, filePath is null or nil");
      a(paramString1, paramString2, y.a.b.hKv, null);
      parama.Sx();
      GMTrace.o(19996562423808L, 148986);
      return;
    }
    if (!new File(paramString3).exists())
    {
      w.e("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadComplete, pkg file not exists");
      a(paramString1, paramString2, y.a.b.hKv, null);
      parama.Sx();
      GMTrace.o(19996562423808L, 148986);
      return;
    }
    if (((com.tencent.mm.plugin.appbrand.a.a)h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RZ() == null)
    {
      w.e("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadComplete, WxaPkgStorage is null");
      aB(paramString1, paramString2);
      GMTrace.o(19996562423808L, 148986);
      return;
    }
    if (!bool) {}
    for (int i = paramInt1;; i = 1)
    {
      localObject2 = ((com.tencent.mm.plugin.appbrand.a.a)h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RZ().a(paramString2, i, paramInt2, new String[0]);
      if (localObject2 != null) {
        break;
      }
      w.e("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadComplete, no manifest record!!! with given appId(%s) version(%d) debugType(%d)", new Object[] { paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      a(paramString1, paramString2, y.a.b.hKu, null);
      GMTrace.o(19996562423808L, 148986);
      return;
    }
    parama.Sy();
    Object localObject1 = new File(paramString3);
    Object localObject2 = ((t)localObject2).field_versionMd5;
    if (!bool)
    {
      String str = com.tencent.mm.a.g.h((File)localObject1);
      if (!bg.nl((String)localObject2).equals(str))
      {
        w.e("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadComplete, record.md5(%s) != file.md5(%s)", new Object[] { localObject2, str });
        bool = false;
      }
    }
    for (;;)
    {
      parama.bV(bool);
      if (bool) {
        break;
      }
      b.deleteFile(paramString3);
      a(paramString1, paramString2, y.a.b.hKx, null);
      GMTrace.o(19996562423808L, 148986);
      return;
      localObject2 = new p((File)localObject1);
      if (!((p)localObject2).hJn)
      {
        ((p)localObject2).close();
        w.e("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadComplete, pkg invalid");
        ((File)localObject1).delete();
        bool = false;
      }
      else if (!((p)localObject2).SH())
      {
        ((p)localObject2).close();
        w.e("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadComplete, pkg readInfo failed");
        ((File)localObject1).delete();
        bool = false;
      }
      else
      {
        ((p)localObject2).close();
        bool = true;
      }
    }
    parama = ((com.tencent.mm.plugin.appbrand.a.a)h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RZ();
    if (!bg.nm(paramString2)) {
      if (!c.a.fI(paramInt2)) {
        break label651;
      }
    }
    label651:
    for (int j = 1;; j = i)
    {
      localObject1 = new ContentValues(1);
      ((ContentValues)localObject1).put("pkgPath", paramString3);
      if (parama.hKn.update("AppBrandWxaPkgManifestRecord", (ContentValues)localObject1, String.format("%s=? and %s=? and %s=?", new Object[] { "appId", "debugType", "version" }), new String[] { paramString2, String.valueOf(paramInt2), String.valueOf(j) }) > 0) {}
      for (bool = true;; bool = false)
      {
        w.i("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadComplete, update ret = %b, appId = %s, debugType = %d, pkgVersion = %d, String filePath = %s", new Object[] { Boolean.valueOf(bool), paramString2, Integer.valueOf(paramInt2), Integer.valueOf(i), paramString3 });
        a(paramString1, paramString2, y.a.b.hKt, new y.a.a(paramString2, paramString3, paramInt1, paramInt2));
        GMTrace.o(19996562423808L, 148986);
        return;
      }
    }
  }
  
  public static boolean a(r paramr, a parama)
  {
    GMTrace.i(19996293988352L, 148984);
    if (SY() == null)
    {
      w.e("MicroMsg.AppBrandWxaPkgUpdater", "startDownloadPkg, get null updater instance!!!");
      GMTrace.o(19996293988352L, 148984);
      return false;
    }
    String str = paramr.tpD;
    Object localObject;
    if ((!bg.nm(str)) && (parama != null))
    {
      localObject = SY();
      if (localObject != null) {
        break label106;
      }
    }
    for (;;)
    {
      int i = SY().hKr.b(paramr);
      if ((i != 0) && (i != 2))
      {
        a(paramr.tpD, paramr.appId, y.a.b.hKz, null);
        GMTrace.o(19996293988352L, 148984);
        return false;
        try
        {
          label106:
          Map localMap = (Map)((y)localObject).hKq.get(str);
          localObject = localMap;
          if (localMap == null)
          {
            localObject = new HashMap();
            SY().hKq.put(str, localObject);
          }
          ((Map)localObject).put(parama, Boolean.valueOf(true));
        }
        finally {}
      }
    }
    GMTrace.o(19996293988352L, 148984);
    return true;
  }
  
  public static boolean a(String paramString1, int paramInt1, int paramInt2, String paramString2, a parama)
  {
    Object localObject2 = null;
    GMTrace.i(17655671029760L, 131545);
    if (SY() == null)
    {
      w.e("MicroMsg.AppBrandWxaPkgUpdater", "startDownloadPkg, get null updater instance!!!");
      GMTrace.o(17655671029760L, 131545);
      return false;
    }
    Object localObject1 = localObject2;
    if (!bg.nm(paramString1))
    {
      if (!bg.nm(paramString2)) {
        break label109;
      }
      localObject1 = localObject2;
    }
    while (localObject1 == null)
    {
      w.e("MicroMsg.AppBrandWxaPkgUpdater", "startDownloadPkg, create Null request, appId %s, pkgType %d, pkgVersion %d, url %s", new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString2 });
      GMTrace.o(17655671029760L, 131545);
      return false;
      switch (paramInt1)
      {
      default: 
        localObject1 = localObject2;
        break;
      case 0: 
        localObject1 = new r(paramString1, paramInt1, paramInt2, paramString2);
        break;
      case 10000: 
      case 10001: 
      case 10002: 
      case 10100: 
      case 10101: 
      case 10102: 
        localObject1 = new z(paramString2, paramString1, paramInt2, paramInt1);
        break;
      case 1: 
      case 2: 
      case 999: 
        label109:
        localObject1 = new q.b(paramString1, paramString2, paramInt1);
      }
    }
    boolean bool = a((r)localObject1, parama);
    GMTrace.o(17655671029760L, 131545);
    return bool;
  }
  
  public static boolean a(String paramString, int paramInt, a parama)
  {
    GMTrace.i(15543218208768L, 115806);
    boolean bool = a("@LibraryAppId", 0, paramInt, paramString, parama);
    GMTrace.o(15543218208768L, 115806);
    return bool;
  }
  
  public static boolean a(String paramString1, int paramInt, String paramString2, a parama)
  {
    GMTrace.i(17655805247488L, 131546);
    boolean bool = a(paramString1, paramInt, 1, paramString2, parama);
    GMTrace.o(17655805247488L, 131546);
    return bool;
  }
  
  public static boolean a(String paramString, a parama)
  {
    GMTrace.i(10608300785664L, 79038);
    boolean bool = a("@LibraryAppId", 999, paramString, parama);
    GMTrace.o(10608300785664L, 79038);
    return bool;
  }
  
  static void aB(String paramString1, String paramString2)
  {
    GMTrace.i(17655536812032L, 131544);
    a(paramString1, paramString2, y.a.b.hKz, null);
    GMTrace.o(17655536812032L, 131544);
  }
  
  static Map<a, Boolean> ot(String paramString)
  {
    GMTrace.i(16161425063936L, 120412);
    y localy;
    if (!bg.nm(paramString))
    {
      localy = SY();
      if (localy != null) {}
    }
    else
    {
      GMTrace.o(16161425063936L, 120412);
      return null;
    }
    try
    {
      paramString = (Map)localy.hKq.remove(paramString);
      GMTrace.o(16161425063936L, 120412);
      return paramString;
    }
    finally {}
  }
  
  public static void shutdown()
  {
    GMTrace.i(17655402594304L, 131543);
    try
    {
      y localy = hKp;
      hKp = null;
      if (localy != null) {
        localy.hKr.hJu.shutdown();
      }
      GMTrace.o(17655402594304L, 131543);
      return;
    }
    finally {}
  }
  
  public static abstract interface a
  {
    public abstract void a(String paramString, b paramb, a parama);
    
    public static final class a
    {
      public final String appId;
      public final String filePath;
      public final int hKs;
      public final int version;
      
      public a(String paramString1, String paramString2, int paramInt1, int paramInt2)
      {
        GMTrace.i(10606421737472L, 79024);
        this.appId = paramString1;
        this.filePath = paramString2;
        this.version = paramInt1;
        this.hKs = paramInt2;
        GMTrace.o(10606421737472L, 79024);
      }
    }
    
    public static enum b
    {
      public final int code;
      
      static
      {
        GMTrace.i(10606019084288L, 79021);
        hKt = new b("OK", 0, 0);
        hKu = new b("FAILED", 1, 101);
        hKv = new b("LOCAL_FILE_NOT_FOUND", 2, 102);
        hKw = new b("PKG_INTEGRITY_FAILED", 3, 104);
        hKx = new b("PKG_INVALID", 4, 105);
        hKy = new b("SEVER_FILE_NOT_FOUND", 5, 106);
        hKz = new b("ENV_ERR", 6, 200);
        hKA = new b[] { hKt, hKu, hKv, hKw, hKx, hKy, hKz };
        GMTrace.o(10606019084288L, 79021);
      }
      
      private b(int paramInt)
      {
        GMTrace.i(10605884866560L, 79020);
        this.code = paramInt;
        GMTrace.o(10605884866560L, 79020);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\appcache\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */