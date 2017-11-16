package com.tencent.mm.plugin.webview.wepkg.a;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.plugin.webview.wepkg.model.WepkgVersion;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.List;

public class d
  extends i<c>
{
  public static final String[] fTX;
  private static volatile d rWY;
  private final g goN;
  public final boolean rFD;
  
  static
  {
    GMTrace.i(12404133986304L, 92418);
    fTX = new String[] { i.a(c.hJW, "WepkgVersion") };
    rWY = null;
    GMTrace.o(12404133986304L, 92418);
  }
  
  private d(g paramg)
  {
    super(paramg, c.hJW, "WepkgVersion", c.eZt);
    GMTrace.i(12403194462208L, 92411);
    this.goN = paramg;
    if (paramg != null) {}
    for (boolean bool = true;; bool = false)
    {
      this.rFD = bool;
      if (!this.rFD) {
        w.e("MicroMsg.Wepkg.WepkgVersionStorage", "storage can not work!!!");
      }
      GMTrace.o(12403194462208L, 92411);
      return;
    }
  }
  
  public static d bGd()
  {
    GMTrace.i(12403060244480L, 92410);
    d locald;
    if (!at.AU())
    {
      locald = new d(null);
      GMTrace.o(12403060244480L, 92410);
      return locald;
    }
    if (rWY == null) {}
    try
    {
      if ((rWY == null) || (!rWY.rFD))
      {
        at.AR();
        rWY = new d(com.tencent.mm.y.c.yH());
      }
      locald = rWY;
      GMTrace.o(12403060244480L, 92410);
      return locald;
    }
    finally {}
  }
  
  public final boolean MH(String paramString)
  {
    GMTrace.i(12403597115392L, 92414);
    if ((!this.rFD) || (bg.nm(paramString)))
    {
      GMTrace.o(12403597115392L, 92414);
      return false;
    }
    c localc = new c();
    localc.field_pkgId = paramString;
    boolean bool = super.a(localc, new String[0]);
    w.i("MicroMsg.Wepkg.WepkgVersionStorage", "deleteRecordByPkgid pkgid:%s, ret:%s", new Object[] { paramString, Boolean.valueOf(bool) });
    GMTrace.o(12403597115392L, 92414);
    return bool;
  }
  
  public final c MI(String paramString)
  {
    GMTrace.i(12403328679936L, 92412);
    if ((!this.rFD) || (bg.nm(paramString)))
    {
      GMTrace.o(12403328679936L, 92412);
      return null;
    }
    Cursor localCursor = rawQuery(String.format("select * from %s where %s=?", new Object[] { "WepkgVersion", "pkgId" }), new String[] { paramString });
    if (localCursor.moveToFirst())
    {
      paramString = new c();
      paramString.b(localCursor);
      localCursor.close();
      w.i("MicroMsg.Wepkg.WepkgVersionStorage", "getRecordByPkgid exist record in DB, pkgid:%s, version:%s", new Object[] { paramString.field_pkgId, paramString.field_version });
      GMTrace.o(12403328679936L, 92412);
      return paramString;
    }
    w.i("MicroMsg.Wepkg.WepkgVersionStorage", "getRecordByPkgid pkgid:%s, no record in DB", new Object[] { paramString });
    localCursor.close();
    GMTrace.o(12403328679936L, 92412);
    return null;
  }
  
  public final c MJ(String paramString)
  {
    GMTrace.i(15195728510976L, 113217);
    if ((!this.rFD) || (bg.nm(paramString)))
    {
      GMTrace.o(15195728510976L, 113217);
      return null;
    }
    Cursor localCursor = rawQuery(String.format("select * from %s where %s=? and %s=0", new Object[] { "WepkgVersion", "pkgId", "disable" }), new String[] { paramString });
    if (localCursor.moveToFirst())
    {
      paramString = new c();
      paramString.b(localCursor);
      localCursor.close();
      w.i("MicroMsg.Wepkg.WepkgVersionStorage", "getRecordByPkgidWithAble exist record in DB, pkgid:%s, version:%s, disableWvCache:%s, clearPkgTime:%s, checkIntervalTime:%s, domain:%s, bigPackageReady:%s, preloadFilesReady:%s, preloadFilesAtomic:%s, disable:%s", new Object[] { paramString.field_pkgId, paramString.field_version, Boolean.valueOf(paramString.field_disableWvCache), Long.valueOf(paramString.field_clearPkgTime), Long.valueOf(paramString.field_checkIntervalTime), paramString.field_domain, Boolean.valueOf(paramString.field_bigPackageReady), Boolean.valueOf(paramString.field_preloadFilesReady), Boolean.valueOf(paramString.field_preloadFilesAtomic), Boolean.valueOf(paramString.field_disable) });
      paramString.field_accessTime = com.tencent.mm.plugin.webview.wepkg.utils.d.abz();
      super.c(paramString, new String[0]);
      GMTrace.o(15195728510976L, 113217);
      return paramString;
    }
    w.i("MicroMsg.Wepkg.WepkgVersionStorage", "getRecordByPkgidWithAble pkgid:%s, no record in DB", new Object[] { paramString });
    localCursor.close();
    GMTrace.o(15195728510976L, 113217);
    return null;
  }
  
  public final boolean MK(String paramString)
  {
    GMTrace.i(12403731333120L, 92415);
    if (!this.rFD)
    {
      GMTrace.o(12403731333120L, 92415);
      return false;
    }
    c localc = MI(paramString);
    if (localc == null)
    {
      GMTrace.o(12403731333120L, 92415);
      return false;
    }
    localc.field_nextCheckTime = (com.tencent.mm.plugin.webview.wepkg.utils.d.abz() + localc.field_checkIntervalTime);
    boolean bool = super.c(localc, new String[0]);
    w.i("MicroMsg.Wepkg.WepkgVersionStorage", "updateCheckTime pkgid:%s, ret:%s", new Object[] { paramString, Boolean.valueOf(bool) });
    GMTrace.o(12403731333120L, 92415);
    return bool;
  }
  
  public final boolean ML(String paramString)
  {
    GMTrace.i(15196265381888L, 113221);
    if ((!this.rFD) || (bg.nm(paramString)))
    {
      GMTrace.o(15196265381888L, 113221);
      return false;
    }
    w.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord addAutoDownloadCount ret:%s", new Object[] { Boolean.valueOf(eZ("WepkgVersion", String.format("update %s set %s=%s+1 where %s='%s'", new Object[] { "WepkgVersion", "autoDownloadCount", "autoDownloadCount", "pkgId", paramString }))) });
    GMTrace.o(15196265381888L, 113221);
    return true;
  }
  
  public final boolean MM(String paramString)
  {
    GMTrace.i(15196399599616L, 113222);
    if ((!this.rFD) || (bg.nm(paramString)))
    {
      GMTrace.o(15196399599616L, 113222);
      return false;
    }
    c localc = MI(paramString);
    if (localc == null)
    {
      GMTrace.o(15196399599616L, 113222);
      return true;
    }
    localc.field_disable = true;
    boolean bool = super.c(localc, new String[0]);
    w.i("MicroMsg.Wepkg.WepkgVersionStorage", "setWepkgDisable pkgid:%s, ret:%s", new Object[] { paramString, Boolean.valueOf(bool) });
    GMTrace.o(15196399599616L, 113222);
    return bool;
  }
  
  public final boolean MN(String paramString)
  {
    GMTrace.i(15642405109760L, 116545);
    if ((!this.rFD) || (bg.nm(paramString)))
    {
      GMTrace.o(15642405109760L, 116545);
      return false;
    }
    c localc = MI(paramString);
    if (localc == null)
    {
      GMTrace.o(15642405109760L, 116545);
      return false;
    }
    localc.field_createTime = 0L;
    boolean bool = super.c(localc, new String[0]);
    w.i("MicroMsg.Wepkg.WepkgVersionStorage", "updateCreateTimeToZero pkgid:%s, ret:%s", new Object[] { paramString, Boolean.valueOf(bool) });
    GMTrace.o(15642405109760L, 116545);
    return bool;
  }
  
  public final boolean a(String paramString, boolean paramBoolean, long paramLong1, long paramLong2)
  {
    GMTrace.i(12403865550848L, 92416);
    if (!this.rFD)
    {
      GMTrace.o(12403865550848L, 92416);
      return false;
    }
    c localc = MI(paramString);
    if (localc == null)
    {
      GMTrace.o(12403865550848L, 92416);
      return false;
    }
    localc.field_disableWvCache = paramBoolean;
    localc.field_clearPkgTime = paramLong1;
    localc.field_nextCheckTime = (localc.field_nextCheckTime - localc.field_checkIntervalTime + paramLong2);
    localc.field_checkIntervalTime = paramLong2;
    localc.field_disable = false;
    boolean bool = super.c(localc, new String[0]);
    w.i("MicroMsg.Wepkg.WepkgVersionStorage", "updateConfigInfo pkgid:%s, disableWvCache:%s, clearPkgTime:%s, checkIntervalTime:%s, ret:%s", new Object[] { paramString, Boolean.valueOf(paramBoolean), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Boolean.valueOf(bool) });
    GMTrace.o(12403865550848L, 92416);
    return bool;
  }
  
  public final boolean aJ(String paramString, boolean paramBoolean)
  {
    GMTrace.i(15196131164160L, 113220);
    if ((!this.rFD) || (bg.nm(paramString)))
    {
      GMTrace.o(15196131164160L, 113220);
      return false;
    }
    c localc = MI(paramString);
    if (localc == null)
    {
      GMTrace.o(15196131164160L, 113220);
      return false;
    }
    localc.field_preloadFilesReady = paramBoolean;
    boolean bool = super.c(localc, new String[0]);
    w.i("MicroMsg.Wepkg.WepkgVersionStorage", "updatePreloadFilesReady pkgid:%s, preloadFilesReady:%b, ret:%s", new Object[] { paramString, Boolean.valueOf(paramBoolean), Boolean.valueOf(bool) });
    GMTrace.o(15196131164160L, 113220);
    return bool;
  }
  
  public final List<WepkgVersion> bGe()
  {
    GMTrace.i(15195862728704L, 113218);
    if (!this.rFD)
    {
      GMTrace.o(15195862728704L, 113218);
      return null;
    }
    Object localObject = String.format("select * from %s where %s < ? - %s", new Object[] { "WepkgVersion", "accessTime", "clearPkgTime" });
    Cursor localCursor = rawQuery((String)localObject, new String[] { String.valueOf(com.tencent.mm.plugin.webview.wepkg.utils.d.abz()) });
    w.i("MicroMsg.Wepkg.WepkgVersionStorage", "getNeedCleanRecords queryStr:%s", new Object[] { localObject });
    if (localCursor == null)
    {
      w.i("MicroMsg.Wepkg.WepkgVersionStorage", "cursor is null");
      GMTrace.o(15195862728704L, 113218);
      return null;
    }
    if (localCursor.moveToFirst())
    {
      localObject = new ArrayList();
      do
      {
        WepkgVersion localWepkgVersion = new WepkgVersion();
        c localc = new c();
        localc.b(localCursor);
        localWepkgVersion.a(localc);
        ((List)localObject).add(localWepkgVersion);
      } while (localCursor.moveToNext());
      localCursor.close();
      w.i("MicroMsg.Wepkg.WepkgVersionStorage", "record list size:%s", new Object[] { Integer.valueOf(((List)localObject).size()) });
      GMTrace.o(15195862728704L, 113218);
      return (List<WepkgVersion>)localObject;
    }
    localCursor.close();
    w.i("MicroMsg.Wepkg.WepkgVersionStorage", "no record");
    GMTrace.o(15195862728704L, 113218);
    return null;
  }
  
  public final boolean q(String paramString1, String paramString2, boolean paramBoolean)
  {
    GMTrace.i(15195996946432L, 113219);
    if ((!this.rFD) || (bg.nm(paramString1)))
    {
      GMTrace.o(15195996946432L, 113219);
      return false;
    }
    c localc = MI(paramString1);
    if (localc == null)
    {
      GMTrace.o(15195996946432L, 113219);
      return false;
    }
    localc.field_bigPackageReady = paramBoolean;
    localc.field_pkgPath = paramString2;
    boolean bool = super.c(localc, new String[0]);
    w.i("MicroMsg.Wepkg.WepkgVersionStorage", "updateBigPackageReady pkgid:%s, pkgPath:%s, bigPackageReady:%b, ret:%s", new Object[] { paramString1, paramString2, Boolean.valueOf(paramBoolean), Boolean.valueOf(bool) });
    GMTrace.o(15195996946432L, 113219);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */