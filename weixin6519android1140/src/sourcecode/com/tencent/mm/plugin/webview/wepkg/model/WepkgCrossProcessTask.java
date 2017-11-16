package com.tencent.mm.plugin.webview.wepkg.model;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.wepkg.a.a;
import com.tencent.mm.plugin.webview.wepkg.a.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WepkgCrossProcessTask
  extends BaseWepkgProcessTask
{
  public static final Parcelable.Creator<WepkgCrossProcessTask> CREATOR;
  public Runnable hYr;
  public int nJ;
  public WepkgVersion rYm;
  public List<WepkgVersion> rYn;
  public WepkgPreloadFile rYo;
  public List<WepkgPreloadFile> rYp;
  public String rYq;
  
  static
  {
    GMTrace.i(15177474899968L, 113081);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(15177474899968L, 113081);
  }
  
  public WepkgCrossProcessTask()
  {
    GMTrace.i(15176535375872L, 113074);
    this.nJ = -1;
    this.rYm = new WepkgVersion();
    this.rYn = new ArrayList();
    this.rYo = new WepkgPreloadFile();
    this.rYp = new ArrayList();
    GMTrace.o(15176535375872L, 113074);
  }
  
  public WepkgCrossProcessTask(Parcel paramParcel)
  {
    GMTrace.i(15176669593600L, 113075);
    f(paramParcel);
    GMTrace.o(15176669593600L, 113075);
  }
  
  public final void RY()
  {
    Object localObject2 = null;
    Object localObject1 = null;
    boolean bool2 = false;
    boolean bool3 = true;
    boolean bool4 = true;
    boolean bool5 = true;
    boolean bool1 = true;
    GMTrace.i(15176803811328L, 113076);
    label229:
    Object localObject3;
    Object localObject4;
    switch (this.nJ)
    {
    default: 
    case 1001: 
    case 3001: 
    case 3003: 
    case 3004: 
    case 3005: 
    case 3006: 
    case 2001: 
    case 2002: 
    case 4001: 
    case 4002: 
    case 2003: 
      label1344:
      do
      {
        xC();
        GMTrace.o(15176803811328L, 113076);
        return;
        for (;;)
        {
          this.eAO = bool1;
          break;
          if (this.rYm == null) {
            break;
          }
          localObject1 = com.tencent.mm.plugin.webview.wepkg.a.d.bGd().MI(this.rYm.rYG);
          if (localObject1 != null)
          {
            this.rYm.a((com.tencent.mm.plugin.webview.wepkg.a.c)localObject1);
          }
          else
          {
            this.rYm = null;
            break;
            if (this.rYm == null) {
              break;
            }
            bool1 = com.tencent.mm.plugin.webview.wepkg.a.d.bGd().MK(this.rYm.rYG);
            continue;
            if (this.rYm == null) {
              break;
            }
            bool1 = com.tencent.mm.plugin.webview.wepkg.a.d.bGd().a(this.rYm.rYG, this.rYm.rYW, this.rYm.rYX, this.rYm.rYY);
            continue;
            if (this.rYm == null) {
              break;
            }
            bool1 = com.tencent.mm.plugin.webview.wepkg.a.d.bGd().q(this.rYm.rYG, this.rYm.hKI, this.rYm.rZc);
            continue;
            if (this.rYm == null) {
              break;
            }
            bool1 = com.tencent.mm.plugin.webview.wepkg.a.d.bGd().aJ(this.rYm.rYG, this.rYm.rZd);
            continue;
            if ((this.rYm != null) && (!bg.nm(this.rYm.rYG)))
            {
              localObject1 = this.rYm.rYG;
              com.tencent.mm.plugin.webview.wepkg.a.d.bGd().MH((String)localObject1);
              b.bGc().MH((String)localObject1);
              g.MV((String)localObject1);
            }
            else
            {
              localObject1 = com.tencent.mm.plugin.webview.wepkg.a.d.bGd();
              if (((com.tencent.mm.plugin.webview.wepkg.a.d)localObject1).rFD)
              {
                w.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord clearWepkg ret:%s", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.webview.wepkg.a.d)localObject1).eZ("WepkgVersion", String.format("delete from %s", new Object[] { "WepkgVersion" }))) });
                w.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgPreloadFilesRecord clearWepkg ret:%s", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.webview.wepkg.a.d)localObject1).eZ("WepkgPreloadFiles", String.format("delete from %s", new Object[] { "WepkgPreloadFiles" }))) });
              }
              com.tencent.mm.plugin.webview.wepkg.utils.d.xB().A(new g.2());
              break;
              if ((this.rYm == null) || (bg.nm(this.rYm.rYG))) {
                break;
              }
              localObject1 = this.rYm.rYG;
              com.tencent.mm.plugin.webview.wepkg.a.d.bGd().MH((String)localObject1);
              b.bGc().MH((String)localObject1);
              localObject1 = com.tencent.mm.plugin.webview.wepkg.a.d.bGd();
              localObject2 = this.rYm;
              localObject3 = new com.tencent.mm.plugin.webview.wepkg.a.c();
              ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_pkgId = ((WepkgVersion)localObject2).rYG;
              ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_appId = ((WepkgVersion)localObject2).appId;
              ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_version = ((WepkgVersion)localObject2).version;
              ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_pkgPath = ((WepkgVersion)localObject2).hKI;
              ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_disableWvCache = ((WepkgVersion)localObject2).rYW;
              ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_clearPkgTime = ((WepkgVersion)localObject2).rYX;
              ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_checkIntervalTime = ((WepkgVersion)localObject2).rYY;
              ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_packMethod = ((WepkgVersion)localObject2).rYZ;
              ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_domain = ((WepkgVersion)localObject2).eYR;
              ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_md5 = ((WepkgVersion)localObject2).eDW;
              ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_downloadUrl = ((WepkgVersion)localObject2).downloadUrl;
              ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_pkgSize = ((WepkgVersion)localObject2).rZa;
              ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_downloadNetType = ((WepkgVersion)localObject2).rYt;
              ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_nextCheckTime = ((WepkgVersion)localObject2).rZb;
              ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_createTime = ((WepkgVersion)localObject2).hcs;
              ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_charset = ((WepkgVersion)localObject2).charset;
              ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_bigPackageReady = ((WepkgVersion)localObject2).rZc;
              ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_preloadFilesReady = ((WepkgVersion)localObject2).rZd;
              ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_preloadFilesAtomic = ((WepkgVersion)localObject2).rZe;
              ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_totalDownloadCount = ((WepkgVersion)localObject2).rZf;
              if ((!((com.tencent.mm.plugin.webview.wepkg.a.d)localObject1).rFD) || (bg.nm(((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_pkgId)))
              {
                if (!bg.cc(this.rYp)) {
                  localObject1 = this.rYp.iterator();
                }
              }
              else {
                for (;;)
                {
                  if (!((Iterator)localObject1).hasNext()) {
                    break label1344;
                  }
                  localObject2 = (WepkgPreloadFile)((Iterator)localObject1).next();
                  if (localObject2 != null)
                  {
                    localObject3 = b.bGc();
                    localObject4 = new a();
                    ((a)localObject4).field_key = ((WepkgPreloadFile)localObject2).amf;
                    ((a)localObject4).field_pkgId = ((WepkgPreloadFile)localObject2).rYG;
                    ((a)localObject4).field_version = ((WepkgPreloadFile)localObject2).version;
                    ((a)localObject4).field_filePath = ((WepkgPreloadFile)localObject2).filePath;
                    ((a)localObject4).field_rid = ((WepkgPreloadFile)localObject2).rYr;
                    ((a)localObject4).field_mimeType = ((WepkgPreloadFile)localObject2).mimeType;
                    ((a)localObject4).field_md5 = ((WepkgPreloadFile)localObject2).eDW;
                    ((a)localObject4).field_downloadUrl = ((WepkgPreloadFile)localObject2).downloadUrl;
                    ((a)localObject4).field_size = ((WepkgPreloadFile)localObject2).size;
                    ((a)localObject4).field_downloadNetType = ((WepkgPreloadFile)localObject2).rYt;
                    ((a)localObject4).field_completeDownload = ((WepkgPreloadFile)localObject2).rYH;
                    ((a)localObject4).field_createTime = ((WepkgPreloadFile)localObject2).hcs;
                    if (((b)localObject3).rFD)
                    {
                      if (((b)localObject3).et(((a)localObject4).field_pkgId, ((a)localObject4).field_rid) == null)
                      {
                        ((a)localObject4).field_createTime = com.tencent.mm.plugin.webview.wepkg.utils.d.abz();
                        bool2 = ((b)localObject3).b((com.tencent.mm.sdk.e.c)localObject4);
                        w.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "insertPreloadFile pkgid:%s, version:%s, rid:%s, ret:%s", new Object[] { ((a)localObject4).field_pkgId, ((a)localObject4).field_version, ((a)localObject4).field_rid, Boolean.valueOf(bool2) });
                        continue;
                        if (((com.tencent.mm.plugin.webview.wepkg.a.d)localObject1).MI(((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_pkgId) == null)
                        {
                          ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_nextCheckTime = (com.tencent.mm.plugin.webview.wepkg.utils.d.abz() + ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_checkIntervalTime);
                          ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_createTime = com.tencent.mm.plugin.webview.wepkg.utils.d.abz();
                          ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_accessTime = com.tencent.mm.plugin.webview.wepkg.utils.d.abz();
                          bool2 = ((com.tencent.mm.plugin.webview.wepkg.a.d)localObject1).b((com.tencent.mm.sdk.e.c)localObject3);
                          w.i("MicroMsg.Wepkg.WepkgVersionStorage", "insertPkgVersion pkgid:%s, version:%s, ret:%s", new Object[] { ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_pkgId, ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_version, Boolean.valueOf(bool2) });
                          break;
                        }
                        ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_nextCheckTime = (com.tencent.mm.plugin.webview.wepkg.utils.d.abz() + ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_checkIntervalTime);
                        bool2 = ((com.tencent.mm.plugin.webview.wepkg.a.d)localObject1).a((com.tencent.mm.sdk.e.c)localObject3);
                        w.i("MicroMsg.Wepkg.WepkgVersionStorage", "replacePkgVersion pkgid:%s, version:%s, ret:%s", new Object[] { ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_pkgId, ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject3).field_version, Boolean.valueOf(bool2) });
                        break;
                      }
                      bool2 = ((b)localObject3).a((com.tencent.mm.sdk.e.c)localObject4);
                      w.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "relacePreloadFile pkgid:%s, version:%s, rid:%s, ret:%s", new Object[] { ((a)localObject4).field_pkgId, ((a)localObject4).field_version, ((a)localObject4).field_rid, Boolean.valueOf(bool2) });
                    }
                  }
                }
              }
              continue;
              if ((this.rYm == null) || (bg.nm(this.rYm.rYG))) {
                break;
              }
              localObject2 = b.bGc();
              localObject4 = this.rYm.rYG;
              if ((!((b)localObject2).rFD) && (bg.nm((String)localObject4))) {}
              for (;;)
              {
                this.rYp = ((List)localObject1);
                break;
                localObject3 = String.format("select * from %s where %s=? and %s=0", new Object[] { "WepkgPreloadFiles", "pkgId", "completeDownload" });
                localObject2 = ((b)localObject2).rawQuery((String)localObject3, new String[] { localObject4 });
                w.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "getNeedDownloadPreLoadFileList queryStr:%s", new Object[] { localObject3 });
                if (localObject2 == null)
                {
                  w.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "cursor is null");
                }
                else if (((Cursor)localObject2).moveToFirst())
                {
                  localObject1 = new ArrayList();
                  do
                  {
                    localObject3 = new WepkgPreloadFile();
                    localObject4 = new a();
                    ((a)localObject4).b((Cursor)localObject2);
                    ((WepkgPreloadFile)localObject3).a((a)localObject4);
                    ((List)localObject1).add(localObject3);
                  } while (((Cursor)localObject2).moveToNext());
                  ((Cursor)localObject2).close();
                  w.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "record list size:%s", new Object[] { Integer.valueOf(((List)localObject1).size()) });
                }
                else
                {
                  ((Cursor)localObject2).close();
                  w.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "no record");
                }
              }
              if (this.rYo == null) {
                break;
              }
              bool1 = b.bGc().g(this.rYo.rYG, this.rYo.rYr, this.rYo.filePath, this.rYo.rYH);
            }
          }
        }
      } while (this.rYm == null);
      localObject1 = com.tencent.mm.plugin.webview.wepkg.a.d.bGd();
      if (!((com.tencent.mm.plugin.webview.wepkg.a.d)localObject1).rFD) {
        localObject1 = null;
      }
      for (;;)
      {
        label1682:
        if (bg.nm((String)localObject1))
        {
          localObject3 = b.bGc();
          if (!((b)localObject3).rFD)
          {
            localObject1 = localObject2;
            label1707:
            if (bg.nm((String)localObject1))
            {
              localObject2 = com.tencent.mm.plugin.webview.wepkg.a.d.bGd();
              if (((com.tencent.mm.plugin.webview.wepkg.a.d)localObject2).rFD)
              {
                w.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord resetAutoDownloadCount ret:%s", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.webview.wepkg.a.d)localObject2).eZ("WepkgVersion", String.format("update %s set %s=0", new Object[] { "WepkgVersion", "autoDownloadCount" }))) });
                w.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgPreloadFilesRecord resetAutoDownloadCount ret:%s", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.webview.wepkg.a.d)localObject2).eZ("WepkgPreloadFiles", String.format("update %s set %s=0", new Object[] { "WepkgPreloadFiles", "autoDownloadCount" }))) });
              }
            }
            this.rYm.rYG = ((String)localObject1);
            break;
            localObject3 = ((com.tencent.mm.plugin.webview.wepkg.a.d)localObject1).rawQuery(String.format("select * from %s where %s=0 and %s=1 and %s<1 and %s<?", new Object[] { "WepkgVersion", "bigPackageReady", "preloadFilesAtomic", "autoDownloadCount", "packageDownloadCount" }), new String[] { "3" });
            if (localObject3 == null)
            {
              localObject1 = null;
              continue;
            }
            if (((Cursor)localObject3).moveToFirst())
            {
              i = ((Cursor)localObject3).getCount();
              if (i <= 1) {
                break label3317;
              }
            }
          }
        }
      }
    }
    label2760:
    label3304:
    label3312:
    label3317:
    for (int i = bg.eb(i - 1, 0);; i = 0)
    {
      ((Cursor)localObject3).move(i);
      localObject4 = new com.tencent.mm.plugin.webview.wepkg.a.c();
      ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject4).b((Cursor)localObject3);
      ((Cursor)localObject3).close();
      ((com.tencent.mm.plugin.webview.wepkg.a.d)localObject1).ML(((com.tencent.mm.plugin.webview.wepkg.a.c)localObject4).field_pkgId);
      w.i("MicroMsg.Wepkg.WepkgVersionStorage", "randomNeedDownloadPkgid exist record in DB, pkgid:%s, version:%s, bigPackageReady:false, preloadFilesAtomic:true", new Object[] { ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject4).field_pkgId, ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject4).field_version });
      localObject1 = ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject4).field_pkgId;
      break label1682;
      ((Cursor)localObject3).close();
      localObject3 = ((com.tencent.mm.plugin.webview.wepkg.a.d)localObject1).rawQuery(String.format("select * from %s where %s=0 and %s<1 and %s<?", new Object[] { "WepkgVersion", "bigPackageReady", "autoDownloadCount", "packageDownloadCount" }), new String[] { "3" });
      if (localObject3 == null)
      {
        localObject1 = null;
        break label1682;
      }
      if (((Cursor)localObject3).moveToFirst())
      {
        i = ((Cursor)localObject3).getCount();
        if (i <= 1) {
          break label3312;
        }
      }
      for (i = bg.eb(i - 1, 0);; i = 0)
      {
        ((Cursor)localObject3).move(i);
        localObject4 = new com.tencent.mm.plugin.webview.wepkg.a.c();
        ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject4).b((Cursor)localObject3);
        ((Cursor)localObject3).close();
        ((com.tencent.mm.plugin.webview.wepkg.a.d)localObject1).ML(((com.tencent.mm.plugin.webview.wepkg.a.c)localObject4).field_pkgId);
        w.i("MicroMsg.Wepkg.WepkgVersionStorage", "randomNeedDownloadPkgid exist record in DB, pkgid:%s, version:%s, bigPackageReady:false, preloadFilesAtomic:false", new Object[] { ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject4).field_pkgId, ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject4).field_version });
        localObject1 = ((com.tencent.mm.plugin.webview.wepkg.a.c)localObject4).field_pkgId;
        break label1682;
        ((Cursor)localObject3).close();
        w.i("MicroMsg.Wepkg.WepkgVersionStorage", "randomNeedDownloadPkgid no download record in DB");
        localObject1 = null;
        break label1682;
        localObject4 = ((b)localObject3).rawQuery(String.format("select * from %s where %s=0 and %s<1 and %s<?", new Object[] { "WepkgPreloadFiles", "completeDownload", "autoDownloadCount", "fileDownloadCount" }), new String[] { "3" });
        localObject1 = localObject2;
        if (localObject4 == null) {
          break label1707;
        }
        if (((Cursor)localObject4).moveToFirst())
        {
          i = ((Cursor)localObject4).getCount();
          if (i <= 1) {
            break label3304;
          }
        }
        for (i = bg.eb(i - 1, 0);; i = 0)
        {
          ((Cursor)localObject4).move(i);
          localObject1 = new a();
          ((a)localObject1).b((Cursor)localObject4);
          ((Cursor)localObject4).close();
          localObject2 = ((a)localObject1).field_pkgId;
          localObject4 = ((a)localObject1).field_rid;
          if ((!((b)localObject3).rFD) || (bg.nm((String)localObject2)) || (bg.nm((String)localObject4))) {}
          for (;;)
          {
            w.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "randomNeedDownloadPkgid exist record in DB, pkgid:%s, version:%s, rid:%s", new Object[] { ((a)localObject1).field_pkgId, ((a)localObject1).field_version, ((a)localObject1).field_rid });
            localObject1 = ((a)localObject1).field_pkgId;
            break;
            w.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "WepkgPreloadFilesRecord addAutoDownloadCount ret:%s", new Object[] { Boolean.valueOf(((b)localObject3).eZ("WepkgPreloadFiles", String.format("update %s set %s=%s+1 where %s='%s' and %s='%s'", new Object[] { "WepkgPreloadFiles", "autoDownloadCount", "autoDownloadCount", "pkgId", localObject2, "rid", localObject4 }))) });
          }
          ((Cursor)localObject4).close();
          w.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "randomNeedDownloadPkgid no download record in DB");
          localObject1 = localObject2;
          break label1707;
          if (this.rYm == null) {
            break;
          }
          this.rYp = b.bGc().MG(this.rYm.rYG);
          break label229;
          if (this.rYo == null) {
            break;
          }
          localObject1 = b.bGc().et(this.rYo.rYG, this.rYo.rYr);
          if (localObject1 != null)
          {
            this.rYo.a((a)localObject1);
            break label229;
          }
          this.rYo = null;
          break;
          if (this.rYm == null) {
            break;
          }
          bool1 = com.tencent.mm.plugin.webview.wepkg.a.d.bGd().MM(this.rYm.rYG);
          break label229;
          if (this.rYm == null) {
            break;
          }
          localObject1 = com.tencent.mm.plugin.webview.wepkg.a.d.bGd().MJ(this.rYm.rYG);
          if (localObject1 != null)
          {
            this.rYm.a((com.tencent.mm.plugin.webview.wepkg.a.c)localObject1);
            break label229;
          }
          this.rYm = null;
          break;
          this.rYn = com.tencent.mm.plugin.webview.wepkg.a.d.bGd().bGe();
          break label229;
          if (this.rYm == null) {
            break;
          }
          bool1 = com.tencent.mm.plugin.webview.wepkg.a.d.bGd().MN(this.rYm.rYG);
          break label229;
          if (this.rYm == null) {
            break;
          }
          localObject1 = com.tencent.mm.plugin.webview.wepkg.a.d.bGd();
          localObject2 = this.rYm.rYG;
          bool1 = bool2;
          if (((com.tencent.mm.plugin.webview.wepkg.a.d)localObject1).rFD) {
            if (!bg.nm((String)localObject2)) {
              break label2760;
            }
          }
          for (bool1 = bool2;; bool1 = true)
          {
            this.eAO = bool1;
            break;
            w.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord addTotalDownloadCount ret:%s", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.webview.wepkg.a.d)localObject1).eZ("WepkgVersion", String.format("update %s set %s=%s+1 where %s='%s'", new Object[] { "WepkgVersion", "totalDownloadCount", "totalDownloadCount", "pkgId", localObject2 }))) });
          }
          if (this.rYm == null) {
            break;
          }
          localObject1 = com.tencent.mm.plugin.webview.wepkg.a.d.bGd();
          localObject2 = this.rYm.rYG;
          if ((!((com.tencent.mm.plugin.webview.wepkg.a.d)localObject1).rFD) || (bg.nm((String)localObject2))) {}
          for (bool1 = false;; bool1 = bool3)
          {
            this.eAO = bool1;
            break;
            w.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord addPackageDownloadCount ret:%s", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.webview.wepkg.a.d)localObject1).eZ("WepkgVersion", String.format("update %s set %s=%s+1 where %s='%s'", new Object[] { "WepkgVersion", "packageDownloadCount", "packageDownloadCount", "pkgId", localObject2 }))) });
          }
          if (this.rYm == null) {
            break;
          }
          localObject1 = com.tencent.mm.plugin.webview.wepkg.a.d.bGd();
          localObject2 = this.rYm.rYG;
          if ((!((com.tencent.mm.plugin.webview.wepkg.a.d)localObject1).rFD) || (bg.nm((String)localObject2))) {}
          for (bool1 = false;; bool1 = bool4)
          {
            this.eAO = bool1;
            break;
            w.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord resetPackageDownloadCount ret:%s", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.webview.wepkg.a.d)localObject1).eZ("WepkgVersion", String.format("update %s set %s=0 where %s='%s'", new Object[] { "WepkgVersion", "packageDownloadCount", "pkgId", localObject2 }))) });
          }
          if (this.rYo == null) {
            break;
          }
          localObject1 = b.bGc();
          localObject2 = this.rYo.rYG;
          localObject3 = this.rYo.rYr;
          if ((!((b)localObject1).rFD) || (bg.nm((String)localObject2)) || (bg.nm((String)localObject3))) {}
          for (bool1 = false;; bool1 = bool5)
          {
            this.eAO = bool1;
            break;
            w.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "WepkgPreloadFilesRecord addFileDownloadCount ret:%s", new Object[] { Boolean.valueOf(((b)localObject1).eZ("WepkgPreloadFiles", String.format("update %s set %s=%s+1 where %s='%s' and %s='%s'", new Object[] { "WepkgPreloadFiles", "fileDownloadCount", "fileDownloadCount", "pkgId", localObject2, "rid", localObject3 }))) });
          }
          if (this.rYo == null) {
            break;
          }
          localObject1 = b.bGc();
          localObject2 = this.rYo.rYG;
          if ((!((b)localObject1).rFD) || (bg.nm((String)localObject2)))
          {
            bool1 = false;
            break label229;
          }
          w.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "WepkgPreloadFilesRecord resetFileDownloadCount ret:%s", new Object[] { Boolean.valueOf(((b)localObject1).eZ("WepkgPreloadFiles", String.format("update %s set %s=0 where %s='%s'", new Object[] { "WepkgPreloadFiles", "fileDownloadCount", "pkgId", localObject2 }))) });
          break label229;
        }
        break label1707;
      }
    }
  }
  
  public final void VK()
  {
    GMTrace.i(15176938029056L, 113077);
    if (this.hYr != null) {
      this.hYr.run();
    }
    GMTrace.o(15176938029056L, 113077);
  }
  
  public final void j(Parcel paramParcel)
  {
    GMTrace.i(15177072246784L, 113078);
    this.nJ = paramParcel.readInt();
    this.rYm = ((WepkgVersion)paramParcel.readParcelable(WepkgVersion.class.getClassLoader()));
    if (this.rYn == null) {
      this.rYn = new ArrayList();
    }
    paramParcel.readList(this.rYn, WepkgVersion.class.getClassLoader());
    this.rYo = ((WepkgPreloadFile)paramParcel.readParcelable(WepkgPreloadFile.class.getClassLoader()));
    if (this.rYp == null) {
      this.rYp = new ArrayList();
    }
    paramParcel.readList(this.rYp, WepkgPreloadFile.class.getClassLoader());
    this.rYq = paramParcel.readString();
    GMTrace.o(15177072246784L, 113078);
  }
  
  public final void v(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(15177206464512L, 113079);
    paramParcel.writeInt(this.nJ);
    paramParcel.writeParcelable(this.rYm, paramInt);
    paramParcel.writeList(this.rYn);
    paramParcel.writeParcelable(this.rYo, paramInt);
    paramParcel.writeList(this.rYp);
    paramParcel.writeString(this.rYq);
    GMTrace.o(15177206464512L, 113079);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\model\WepkgCrossProcessTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */