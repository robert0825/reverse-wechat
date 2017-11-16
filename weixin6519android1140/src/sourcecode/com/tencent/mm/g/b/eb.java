package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class eb
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fGD;
  private static final int fGX;
  private static final int fHG;
  private static final int fHH;
  private static final int fHI;
  private static final int fHJ;
  private static final int fHK;
  private static final int fHL;
  private static final int fHM;
  private static final int fHN;
  private static final int fHO;
  private static final int fHP;
  private static final int fHQ;
  private static final int fHR;
  private static final int fHa;
  private static final int fHn;
  private static final int fHq;
  private static final int fHs;
  private static final int faG;
  private static final int fbu;
  private static final int fcK;
  private static final int fcN;
  private static final int fmd;
  private static final int fpx;
  private boolean fGP;
  private boolean fGS;
  private boolean fGy;
  private boolean fHA;
  private boolean fHB;
  private boolean fHC;
  private boolean fHD;
  private boolean fHE;
  private boolean fHF;
  private boolean fHg;
  private boolean fHj;
  private boolean fHl;
  private boolean fHu;
  private boolean fHv;
  private boolean fHw;
  private boolean fHx;
  private boolean fHy;
  private boolean fHz;
  private boolean fak;
  private boolean fbd;
  private boolean fcD;
  private boolean fcG;
  public long field_accessTime;
  public String field_appId;
  public int field_autoDownloadCount;
  public boolean field_bigPackageReady;
  public String field_charset;
  public long field_checkIntervalTime;
  public long field_clearPkgTime;
  public long field_createTime;
  public boolean field_disable;
  public boolean field_disableWvCache;
  public String field_domain;
  public int field_downloadNetType;
  public String field_downloadUrl;
  public String field_md5;
  public long field_nextCheckTime;
  public int field_packMethod;
  public int field_packageDownloadCount;
  public String field_pkgId;
  public String field_pkgPath;
  public int field_pkgSize;
  public boolean field_preloadFilesAtomic;
  public boolean field_preloadFilesReady;
  public int field_totalDownloadCount;
  public String field_version;
  private boolean flE;
  private boolean fpd;
  
  static
  {
    GMTrace.i(4121692209152L, 30709);
    eZt = new String[0];
    fHn = "pkgId".hashCode();
    fbu = "appId".hashCode();
    fcK = "version".hashCode();
    fcN = "pkgPath".hashCode();
    fHG = "disableWvCache".hashCode();
    fHH = "clearPkgTime".hashCode();
    fHI = "checkIntervalTime".hashCode();
    fHJ = "packMethod".hashCode();
    fGX = "domain".hashCode();
    fmd = "md5".hashCode();
    fpx = "downloadUrl".hashCode();
    fHK = "pkgSize".hashCode();
    fHq = "downloadNetType".hashCode();
    fHL = "nextCheckTime".hashCode();
    faG = "createTime".hashCode();
    fHa = "accessTime".hashCode();
    fHM = "charset".hashCode();
    fHN = "bigPackageReady".hashCode();
    fHO = "preloadFilesReady".hashCode();
    fHP = "preloadFilesAtomic".hashCode();
    fHs = "autoDownloadCount".hashCode();
    fGD = "disable".hashCode();
    fHQ = "totalDownloadCount".hashCode();
    fHR = "packageDownloadCount".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4121692209152L, 30709);
  }
  
  public eb()
  {
    GMTrace.i(4121289555968L, 30706);
    this.fHg = true;
    this.fbd = true;
    this.fcD = true;
    this.fcG = true;
    this.fHu = true;
    this.fHv = true;
    this.fHw = true;
    this.fHx = true;
    this.fGP = true;
    this.flE = true;
    this.fpd = true;
    this.fHy = true;
    this.fHj = true;
    this.fHz = true;
    this.fak = true;
    this.fGS = true;
    this.fHA = true;
    this.fHB = true;
    this.fHC = true;
    this.fHD = true;
    this.fHl = true;
    this.fGy = true;
    this.fHE = true;
    this.fHF = true;
    GMTrace.o(4121289555968L, 30706);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4121423773696L, 30707);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4121423773696L, 30707);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fHn == k)
      {
        this.field_pkgId = paramCursor.getString(i);
        this.fHg = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fbu == k)
        {
          this.field_appId = paramCursor.getString(i);
        }
        else if (fcK == k)
        {
          this.field_version = paramCursor.getString(i);
        }
        else if (fcN == k)
        {
          this.field_pkgPath = paramCursor.getString(i);
        }
        else
        {
          boolean bool;
          if (fHG == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (bool = true;; bool = false)
            {
              this.field_disableWvCache = bool;
              break;
            }
          }
          if (fHH == k)
          {
            this.field_clearPkgTime = paramCursor.getLong(i);
          }
          else if (fHI == k)
          {
            this.field_checkIntervalTime = paramCursor.getLong(i);
          }
          else if (fHJ == k)
          {
            this.field_packMethod = paramCursor.getInt(i);
          }
          else if (fGX == k)
          {
            this.field_domain = paramCursor.getString(i);
          }
          else if (fmd == k)
          {
            this.field_md5 = paramCursor.getString(i);
          }
          else if (fpx == k)
          {
            this.field_downloadUrl = paramCursor.getString(i);
          }
          else if (fHK == k)
          {
            this.field_pkgSize = paramCursor.getInt(i);
          }
          else if (fHq == k)
          {
            this.field_downloadNetType = paramCursor.getInt(i);
          }
          else if (fHL == k)
          {
            this.field_nextCheckTime = paramCursor.getLong(i);
          }
          else if (faG == k)
          {
            this.field_createTime = paramCursor.getLong(i);
          }
          else if (fHa == k)
          {
            this.field_accessTime = paramCursor.getLong(i);
          }
          else if (fHM == k)
          {
            this.field_charset = paramCursor.getString(i);
          }
          else
          {
            if (fHN == k)
            {
              if (paramCursor.getInt(i) != 0) {}
              for (bool = true;; bool = false)
              {
                this.field_bigPackageReady = bool;
                break;
              }
            }
            if (fHO == k)
            {
              if (paramCursor.getInt(i) != 0) {}
              for (bool = true;; bool = false)
              {
                this.field_preloadFilesReady = bool;
                break;
              }
            }
            if (fHP == k)
            {
              if (paramCursor.getInt(i) != 0) {}
              for (bool = true;; bool = false)
              {
                this.field_preloadFilesAtomic = bool;
                break;
              }
            }
            if (fHs == k)
            {
              this.field_autoDownloadCount = paramCursor.getInt(i);
            }
            else
            {
              if (fGD == k)
              {
                if (paramCursor.getInt(i) != 0) {}
                for (bool = true;; bool = false)
                {
                  this.field_disable = bool;
                  break;
                }
              }
              if (fHQ == k) {
                this.field_totalDownloadCount = paramCursor.getInt(i);
              } else if (fHR == k) {
                this.field_packageDownloadCount = paramCursor.getInt(i);
              } else if (eZC == k) {
                this.vmr = paramCursor.getLong(i);
              }
            }
          }
        }
      }
    }
    GMTrace.o(4121423773696L, 30707);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4121557991424L, 30708);
    ContentValues localContentValues = new ContentValues();
    if (this.fHg) {
      localContentValues.put("pkgId", this.field_pkgId);
    }
    if (this.fbd) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.fcD) {
      localContentValues.put("version", this.field_version);
    }
    if (this.fcG) {
      localContentValues.put("pkgPath", this.field_pkgPath);
    }
    if (this.fHu) {
      localContentValues.put("disableWvCache", Boolean.valueOf(this.field_disableWvCache));
    }
    if (this.fHv) {
      localContentValues.put("clearPkgTime", Long.valueOf(this.field_clearPkgTime));
    }
    if (this.fHw) {
      localContentValues.put("checkIntervalTime", Long.valueOf(this.field_checkIntervalTime));
    }
    if (this.fHx) {
      localContentValues.put("packMethod", Integer.valueOf(this.field_packMethod));
    }
    if (this.fGP) {
      localContentValues.put("domain", this.field_domain);
    }
    if (this.flE) {
      localContentValues.put("md5", this.field_md5);
    }
    if (this.fpd) {
      localContentValues.put("downloadUrl", this.field_downloadUrl);
    }
    if (this.fHy) {
      localContentValues.put("pkgSize", Integer.valueOf(this.field_pkgSize));
    }
    if (this.fHj) {
      localContentValues.put("downloadNetType", Integer.valueOf(this.field_downloadNetType));
    }
    if (this.fHz) {
      localContentValues.put("nextCheckTime", Long.valueOf(this.field_nextCheckTime));
    }
    if (this.fak) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.fGS) {
      localContentValues.put("accessTime", Long.valueOf(this.field_accessTime));
    }
    if (this.field_charset == null) {
      this.field_charset = "UTF-8";
    }
    if (this.fHA) {
      localContentValues.put("charset", this.field_charset);
    }
    if (this.fHB) {
      localContentValues.put("bigPackageReady", Boolean.valueOf(this.field_bigPackageReady));
    }
    if (this.fHC) {
      localContentValues.put("preloadFilesReady", Boolean.valueOf(this.field_preloadFilesReady));
    }
    if (this.fHD) {
      localContentValues.put("preloadFilesAtomic", Boolean.valueOf(this.field_preloadFilesAtomic));
    }
    if (this.fHl) {
      localContentValues.put("autoDownloadCount", Integer.valueOf(this.field_autoDownloadCount));
    }
    if (this.fGy) {
      localContentValues.put("disable", Boolean.valueOf(this.field_disable));
    }
    if (this.fHE) {
      localContentValues.put("totalDownloadCount", Integer.valueOf(this.field_totalDownloadCount));
    }
    if (this.fHF) {
      localContentValues.put("packageDownloadCount", Integer.valueOf(this.field_packageDownloadCount));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4121557991424L, 30708);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\eb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */