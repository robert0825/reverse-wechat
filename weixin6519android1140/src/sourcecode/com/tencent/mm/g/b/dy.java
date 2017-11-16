package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class dy
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fGW;
  private static final int fGX;
  private static final int fGY;
  private static final int fGZ;
  private static final int fHa;
  private static final int fHb;
  private static final int fHc;
  private static final int fHd;
  private static final int faG;
  private static final int fbu;
  private static final int fcK;
  private static final int fhk;
  private static final int fnX;
  private static final int frc;
  private static final int fzR;
  private static final int fzy;
  private static final int fzz;
  private boolean fGO;
  private boolean fGP;
  private boolean fGQ;
  private boolean fGR;
  private boolean fGS;
  private boolean fGT;
  private boolean fGU;
  private boolean fGV;
  private boolean fak;
  private boolean fbd;
  private boolean fcD;
  private boolean fgR;
  public long field_accessTime;
  public String field_appId;
  public int field_cacheType;
  public String field_configId;
  public long field_contentLength;
  public String field_contentMd5;
  public String field_contentType;
  public long field_createTime;
  public String field_domain;
  public long field_expireTime;
  public boolean field_isLatestVersion;
  public String field_localPath;
  public String field_packageId;
  public int field_protocol;
  public String field_url;
  public int field_urlMd5Hashcode;
  public String field_version;
  private boolean fnW;
  private boolean fqT;
  private boolean fyY;
  private boolean fyZ;
  private boolean fzr;
  
  static
  {
    GMTrace.i(4124242345984L, 30728);
    eZt = new String[] { "CREATE INDEX IF NOT EXISTS WebViewResourceCacheAppIdIndex ON WebViewResourceCache(appId)", "CREATE INDEX IF NOT EXISTS WebViewResourceCacheDomainIndex ON WebViewResourceCache(domain)", "CREATE INDEX IF NOT EXISTS WebViewResourceCachePackageIdIndex ON WebViewResourceCache(packageId)" };
    fGW = "urlMd5Hashcode".hashCode();
    fhk = "url".hashCode();
    fbu = "appId".hashCode();
    fGX = "domain".hashCode();
    fcK = "version".hashCode();
    fGY = "localPath".hashCode();
    fzz = "contentType".hashCode();
    fzy = "contentLength".hashCode();
    fGZ = "isLatestVersion".hashCode();
    faG = "createTime".hashCode();
    fHa = "accessTime".hashCode();
    frc = "expireTime".hashCode();
    fHb = "cacheType".hashCode();
    fnX = "configId".hashCode();
    fHc = "protocol".hashCode();
    fzR = "packageId".hashCode();
    fHd = "contentMd5".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4124242345984L, 30728);
  }
  
  public dy()
  {
    GMTrace.i(4123839692800L, 30725);
    this.fGO = true;
    this.fgR = true;
    this.fbd = true;
    this.fGP = true;
    this.fcD = true;
    this.fGQ = true;
    this.fyZ = true;
    this.fyY = true;
    this.fGR = true;
    this.fak = true;
    this.fGS = true;
    this.fqT = true;
    this.fGT = true;
    this.fnW = true;
    this.fGU = true;
    this.fzr = true;
    this.fGV = true;
    GMTrace.o(4123839692800L, 30725);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4123973910528L, 30726);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4123973910528L, 30726);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fGW == k) {
        this.field_urlMd5Hashcode = paramCursor.getInt(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fhk == k)
        {
          this.field_url = paramCursor.getString(i);
        }
        else if (fbu == k)
        {
          this.field_appId = paramCursor.getString(i);
        }
        else if (fGX == k)
        {
          this.field_domain = paramCursor.getString(i);
        }
        else if (fcK == k)
        {
          this.field_version = paramCursor.getString(i);
        }
        else if (fGY == k)
        {
          this.field_localPath = paramCursor.getString(i);
        }
        else if (fzz == k)
        {
          this.field_contentType = paramCursor.getString(i);
        }
        else if (fzy == k)
        {
          this.field_contentLength = paramCursor.getLong(i);
        }
        else
        {
          if (fGZ == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_isLatestVersion = bool;
              break;
            }
          }
          if (faG == k) {
            this.field_createTime = paramCursor.getLong(i);
          } else if (fHa == k) {
            this.field_accessTime = paramCursor.getLong(i);
          } else if (frc == k) {
            this.field_expireTime = paramCursor.getLong(i);
          } else if (fHb == k) {
            this.field_cacheType = paramCursor.getInt(i);
          } else if (fnX == k) {
            this.field_configId = paramCursor.getString(i);
          } else if (fHc == k) {
            this.field_protocol = paramCursor.getInt(i);
          } else if (fzR == k) {
            this.field_packageId = paramCursor.getString(i);
          } else if (fHd == k) {
            this.field_contentMd5 = paramCursor.getString(i);
          } else if (eZC == k) {
            this.vmr = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(4123973910528L, 30726);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4124108128256L, 30727);
    ContentValues localContentValues = new ContentValues();
    if (this.fGO) {
      localContentValues.put("urlMd5Hashcode", Integer.valueOf(this.field_urlMd5Hashcode));
    }
    if (this.fgR) {
      localContentValues.put("url", this.field_url);
    }
    if (this.fbd) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.fGP) {
      localContentValues.put("domain", this.field_domain);
    }
    if (this.fcD) {
      localContentValues.put("version", this.field_version);
    }
    if (this.fGQ) {
      localContentValues.put("localPath", this.field_localPath);
    }
    if (this.fyZ) {
      localContentValues.put("contentType", this.field_contentType);
    }
    if (this.fyY) {
      localContentValues.put("contentLength", Long.valueOf(this.field_contentLength));
    }
    if (this.fGR) {
      localContentValues.put("isLatestVersion", Boolean.valueOf(this.field_isLatestVersion));
    }
    if (this.fak) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.fGS) {
      localContentValues.put("accessTime", Long.valueOf(this.field_accessTime));
    }
    if (this.fqT) {
      localContentValues.put("expireTime", Long.valueOf(this.field_expireTime));
    }
    if (this.fGT) {
      localContentValues.put("cacheType", Integer.valueOf(this.field_cacheType));
    }
    if (this.fnW) {
      localContentValues.put("configId", this.field_configId);
    }
    if (this.fGU) {
      localContentValues.put("protocol", Integer.valueOf(this.field_protocol));
    }
    if (this.fzr) {
      localContentValues.put("packageId", this.field_packageId);
    }
    if (this.fGV) {
      localContentValues.put("contentMd5", this.field_contentMd5);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4124108128256L, 30727);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\dy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */