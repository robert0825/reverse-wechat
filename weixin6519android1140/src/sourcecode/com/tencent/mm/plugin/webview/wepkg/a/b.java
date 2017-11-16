package com.tencent.mm.plugin.webview.wepkg.a;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.plugin.webview.wepkg.model.WepkgPreloadFile;
import com.tencent.mm.plugin.webview.wepkg.utils.d;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.ArrayList;
import java.util.List;

public class b
  extends i<a>
{
  public static final String[] fTX;
  private static volatile b rWX;
  private final g goN;
  public final boolean rFD;
  
  static
  {
    GMTrace.i(15197339123712L, 113229);
    fTX = new String[] { i.a(a.hJW, "WepkgPreloadFiles") };
    rWX = null;
    GMTrace.o(15197339123712L, 113229);
  }
  
  private b(g paramg)
  {
    super(paramg, a.hJW, "WepkgPreloadFiles", a.eZt);
    GMTrace.i(15196668035072L, 113224);
    this.goN = paramg;
    if (paramg != null) {}
    for (boolean bool = true;; bool = false)
    {
      this.rFD = bool;
      if (!this.rFD) {
        w.e("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "storage can not work!!!");
      }
      GMTrace.o(15196668035072L, 113224);
      return;
    }
  }
  
  public static b bGc()
  {
    GMTrace.i(15196533817344L, 113223);
    b localb;
    if (!at.AU())
    {
      localb = new b(null);
      GMTrace.o(15196533817344L, 113223);
      return localb;
    }
    if (rWX == null) {}
    try
    {
      if ((rWX == null) || (!rWX.rFD))
      {
        at.AR();
        rWX = new b(c.yH());
      }
      localb = rWX;
      GMTrace.o(15196533817344L, 113223);
      return localb;
    }
    finally {}
  }
  
  public final List<WepkgPreloadFile> MG(String paramString)
  {
    GMTrace.i(15196936470528L, 113226);
    if ((!this.rFD) || (bg.nm(paramString)))
    {
      GMTrace.o(15196936470528L, 113226);
      return null;
    }
    Object localObject = String.format("select * from %s where %s=?", new Object[] { "WepkgPreloadFiles", "pkgId" });
    paramString = rawQuery((String)localObject, new String[] { paramString });
    w.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "getPreLoadFileList queryStr:%s", new Object[] { localObject });
    if (paramString == null)
    {
      w.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "cursor is null");
      GMTrace.o(15196936470528L, 113226);
      return null;
    }
    if (paramString.moveToFirst())
    {
      localObject = new ArrayList();
      do
      {
        WepkgPreloadFile localWepkgPreloadFile = new WepkgPreloadFile();
        a locala = new a();
        locala.b(paramString);
        localWepkgPreloadFile.a(locala);
        ((List)localObject).add(localWepkgPreloadFile);
      } while (paramString.moveToNext());
      paramString.close();
      w.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "record list size:%s", new Object[] { Integer.valueOf(((List)localObject).size()) });
      GMTrace.o(15196936470528L, 113226);
      return (List<WepkgPreloadFile>)localObject;
    }
    paramString.close();
    w.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "no record");
    GMTrace.o(15196936470528L, 113226);
    return null;
  }
  
  public final boolean MH(String paramString)
  {
    GMTrace.i(15197070688256L, 113227);
    if ((!this.rFD) || (bg.nm(paramString)))
    {
      GMTrace.o(15197070688256L, 113227);
      return false;
    }
    a locala = new a();
    locala.field_pkgId = paramString;
    boolean bool = super.a(locala, new String[] { "pkgId" });
    w.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "deleteRecordByPkgid pkgid:%s, ret:%s", new Object[] { paramString, Boolean.valueOf(bool) });
    GMTrace.o(15197070688256L, 113227);
    return bool;
  }
  
  public final a et(String paramString1, String paramString2)
  {
    GMTrace.i(15196802252800L, 113225);
    if ((!this.rFD) || (bg.nm(paramString1)) || (bg.nm(paramString2)))
    {
      GMTrace.o(15196802252800L, 113225);
      return null;
    }
    Object localObject = d.ex(paramString1, paramString2);
    localObject = rawQuery(String.format("select * from %s where %s=?", new Object[] { "WepkgPreloadFiles", "key" }), new String[] { localObject });
    if (((Cursor)localObject).moveToFirst())
    {
      paramString1 = new a();
      paramString1.b((Cursor)localObject);
      ((Cursor)localObject).close();
      w.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "getRecordByRid exist record in DB, pkgid:%s, rid:%s, version:%s", new Object[] { paramString1.field_pkgId, paramString1.field_rid, paramString1.field_version });
      GMTrace.o(15196802252800L, 113225);
      return paramString1;
    }
    w.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "getRecordByRid pkgid:%s, rid:%s, no record in DB", new Object[] { paramString1, paramString2 });
    ((Cursor)localObject).close();
    GMTrace.o(15196802252800L, 113225);
    return null;
  }
  
  public final boolean g(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    GMTrace.i(15197204905984L, 113228);
    if ((!this.rFD) || (bg.nm(paramString1)) || (bg.nm(paramString2)))
    {
      GMTrace.o(15197204905984L, 113228);
      return false;
    }
    a locala = et(paramString1, paramString2);
    if (locala == null)
    {
      GMTrace.o(15197204905984L, 113228);
      return false;
    }
    locala.field_completeDownload = paramBoolean;
    locala.field_filePath = paramString3;
    boolean bool = super.c(locala, new String[0]);
    w.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "updateDownloadCompleteState pkgid:%s, rid:%s, completeDownload:%s, filePath:%s, ret:%s", new Object[] { paramString1, paramString2, Boolean.valueOf(paramBoolean), paramString3, Boolean.valueOf(bool) });
    GMTrace.o(15197204905984L, 113228);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */