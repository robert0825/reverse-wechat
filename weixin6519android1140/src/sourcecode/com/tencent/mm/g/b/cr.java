package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class cr
  extends c
{
  private static final int eZC;
  private static final int eZI;
  public static final String[] eZt;
  private static final int faX;
  private static final int fbu;
  private static final int fhk;
  private static final int fmd;
  private static final int fpB;
  private static final int fpz;
  private static final int frc;
  private static final int fzA;
  private static final int fzB;
  private static final int fzC;
  private static final int fzD;
  private static final int fzE;
  private static final int fzF;
  private static final int fzG;
  private static final int fzH;
  private static final int fzI;
  private static final int fzJ;
  private static final int fzK;
  private static final int fzL;
  private static final int fzM;
  private static final int fzN;
  private static final int fzO;
  private static final int fzP;
  private static final int fzQ;
  private static final int fzR;
  private static final int fzs;
  private static final int fzt;
  private static final int fzu;
  private static final int fzv;
  private static final int fzw;
  private static final int fzx;
  private static final int fzy;
  private static final int fzz;
  private boolean eZF;
  private boolean faB;
  private boolean fbd;
  private boolean fgR;
  public int field_EID;
  public String field_appId;
  public long field_contentLength;
  public String field_contentType;
  public boolean field_deleted;
  public byte[] field_eccSignature;
  public String field_encryptKey;
  public long field_expireTime;
  public boolean field_fileCompress;
  public boolean field_fileEncrypt;
  public String field_filePath;
  public long field_fileSize;
  public boolean field_fileUpdated;
  public String field_fileVersion;
  public String field_groupId1;
  public String field_groupId2;
  public int field_keyVersion;
  public int field_maxRetryTimes;
  public String field_md5;
  public boolean field_needRetry;
  public int field_networkType;
  public String field_originalMd5;
  public String field_packageId;
  public int field_priority;
  public long field_reportId;
  public int field_resType;
  public int field_retryTimes;
  public String field_sampleId;
  public int field_status;
  public int field_subType;
  public String field_url;
  public String field_urlKey;
  public int field_urlKey_hashcode;
  public int field_wvCacheType;
  private boolean flE;
  private boolean fpf;
  private boolean fph;
  private boolean fqT;
  private boolean fyS;
  private boolean fyT;
  private boolean fyU;
  private boolean fyV;
  private boolean fyW;
  private boolean fyX;
  private boolean fyY;
  private boolean fyZ;
  private boolean fza;
  private boolean fzb;
  private boolean fzc;
  private boolean fzd;
  private boolean fze;
  private boolean fzf;
  private boolean fzg;
  private boolean fzh;
  private boolean fzi;
  private boolean fzj;
  private boolean fzk;
  private boolean fzl;
  private boolean fzm;
  private boolean fzn;
  private boolean fzo;
  private boolean fzp;
  private boolean fzq;
  private boolean fzr;
  
  static
  {
    GMTrace.i(4171084333056L, 31077);
    eZt = new String[0];
    fzs = "urlKey_hashcode".hashCode();
    fzt = "urlKey".hashCode();
    fhk = "url".hashCode();
    fzu = "fileVersion".hashCode();
    fzv = "networkType".hashCode();
    fzw = "maxRetryTimes".hashCode();
    fzx = "retryTimes".hashCode();
    fpB = "filePath".hashCode();
    eZI = "status".hashCode();
    fzy = "contentLength".hashCode();
    fzz = "contentType".hashCode();
    frc = "expireTime".hashCode();
    fmd = "md5".hashCode();
    fzA = "groupId1".hashCode();
    fzB = "groupId2".hashCode();
    fzC = "priority".hashCode();
    fzD = "fileUpdated".hashCode();
    fzE = "deleted".hashCode();
    fzF = "resType".hashCode();
    faX = "subType".hashCode();
    fzG = "reportId".hashCode();
    fzH = "sampleId".hashCode();
    fzI = "eccSignature".hashCode();
    fzJ = "originalMd5".hashCode();
    fzK = "fileCompress".hashCode();
    fzL = "fileEncrypt".hashCode();
    fzM = "encryptKey".hashCode();
    fzN = "keyVersion".hashCode();
    fzO = "EID".hashCode();
    fpz = "fileSize".hashCode();
    fzP = "needRetry".hashCode();
    fbu = "appId".hashCode();
    fzQ = "wvCacheType".hashCode();
    fzR = "packageId".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4171084333056L, 31077);
  }
  
  public cr()
  {
    GMTrace.i(4170681679872L, 31074);
    this.fyS = true;
    this.fyT = true;
    this.fgR = true;
    this.fyU = true;
    this.fyV = true;
    this.fyW = true;
    this.fyX = true;
    this.fph = true;
    this.eZF = true;
    this.fyY = true;
    this.fyZ = true;
    this.fqT = true;
    this.flE = true;
    this.fza = true;
    this.fzb = true;
    this.fzc = true;
    this.fzd = true;
    this.fze = true;
    this.fzf = true;
    this.faB = true;
    this.fzg = true;
    this.fzh = true;
    this.fzi = true;
    this.fzj = true;
    this.fzk = true;
    this.fzl = true;
    this.fzm = true;
    this.fzn = true;
    this.fzo = true;
    this.fpf = true;
    this.fzp = true;
    this.fbd = true;
    this.fzq = true;
    this.fzr = true;
    GMTrace.o(4170681679872L, 31074);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4170815897600L, 31075);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4170815897600L, 31075);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fzs == k)
      {
        this.field_urlKey_hashcode = paramCursor.getInt(i);
        this.fyS = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fzt == k)
        {
          this.field_urlKey = paramCursor.getString(i);
        }
        else if (fhk == k)
        {
          this.field_url = paramCursor.getString(i);
        }
        else if (fzu == k)
        {
          this.field_fileVersion = paramCursor.getString(i);
        }
        else if (fzv == k)
        {
          this.field_networkType = paramCursor.getInt(i);
        }
        else if (fzw == k)
        {
          this.field_maxRetryTimes = paramCursor.getInt(i);
        }
        else if (fzx == k)
        {
          this.field_retryTimes = paramCursor.getInt(i);
        }
        else if (fpB == k)
        {
          this.field_filePath = paramCursor.getString(i);
        }
        else if (eZI == k)
        {
          this.field_status = paramCursor.getInt(i);
        }
        else if (fzy == k)
        {
          this.field_contentLength = paramCursor.getLong(i);
        }
        else if (fzz == k)
        {
          this.field_contentType = paramCursor.getString(i);
        }
        else if (frc == k)
        {
          this.field_expireTime = paramCursor.getLong(i);
        }
        else if (fmd == k)
        {
          this.field_md5 = paramCursor.getString(i);
        }
        else if (fzA == k)
        {
          this.field_groupId1 = paramCursor.getString(i);
        }
        else if (fzB == k)
        {
          this.field_groupId2 = paramCursor.getString(i);
        }
        else if (fzC == k)
        {
          this.field_priority = paramCursor.getInt(i);
        }
        else
        {
          boolean bool;
          if (fzD == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (bool = true;; bool = false)
            {
              this.field_fileUpdated = bool;
              break;
            }
          }
          if (fzE == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (bool = true;; bool = false)
            {
              this.field_deleted = bool;
              break;
            }
          }
          if (fzF == k)
          {
            this.field_resType = paramCursor.getInt(i);
          }
          else if (faX == k)
          {
            this.field_subType = paramCursor.getInt(i);
          }
          else if (fzG == k)
          {
            this.field_reportId = paramCursor.getLong(i);
          }
          else if (fzH == k)
          {
            this.field_sampleId = paramCursor.getString(i);
          }
          else if (fzI == k)
          {
            this.field_eccSignature = paramCursor.getBlob(i);
          }
          else if (fzJ == k)
          {
            this.field_originalMd5 = paramCursor.getString(i);
          }
          else
          {
            if (fzK == k)
            {
              if (paramCursor.getInt(i) != 0) {}
              for (bool = true;; bool = false)
              {
                this.field_fileCompress = bool;
                break;
              }
            }
            if (fzL == k)
            {
              if (paramCursor.getInt(i) != 0) {}
              for (bool = true;; bool = false)
              {
                this.field_fileEncrypt = bool;
                break;
              }
            }
            if (fzM == k)
            {
              this.field_encryptKey = paramCursor.getString(i);
            }
            else if (fzN == k)
            {
              this.field_keyVersion = paramCursor.getInt(i);
            }
            else if (fzO == k)
            {
              this.field_EID = paramCursor.getInt(i);
            }
            else if (fpz == k)
            {
              this.field_fileSize = paramCursor.getLong(i);
            }
            else
            {
              if (fzP == k)
              {
                if (paramCursor.getInt(i) != 0) {}
                for (bool = true;; bool = false)
                {
                  this.field_needRetry = bool;
                  break;
                }
              }
              if (fbu == k) {
                this.field_appId = paramCursor.getString(i);
              } else if (fzQ == k) {
                this.field_wvCacheType = paramCursor.getInt(i);
              } else if (fzR == k) {
                this.field_packageId = paramCursor.getString(i);
              } else if (eZC == k) {
                this.vmr = paramCursor.getLong(i);
              }
            }
          }
        }
      }
    }
    GMTrace.o(4170815897600L, 31075);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4170950115328L, 31076);
    ContentValues localContentValues = new ContentValues();
    if (this.fyS) {
      localContentValues.put("urlKey_hashcode", Integer.valueOf(this.field_urlKey_hashcode));
    }
    if (this.fyT) {
      localContentValues.put("urlKey", this.field_urlKey);
    }
    if (this.fgR) {
      localContentValues.put("url", this.field_url);
    }
    if (this.fyU) {
      localContentValues.put("fileVersion", this.field_fileVersion);
    }
    if (this.fyV) {
      localContentValues.put("networkType", Integer.valueOf(this.field_networkType));
    }
    if (this.fyW) {
      localContentValues.put("maxRetryTimes", Integer.valueOf(this.field_maxRetryTimes));
    }
    if (this.fyX) {
      localContentValues.put("retryTimes", Integer.valueOf(this.field_retryTimes));
    }
    if (this.fph) {
      localContentValues.put("filePath", this.field_filePath);
    }
    if (this.eZF) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.fyY) {
      localContentValues.put("contentLength", Long.valueOf(this.field_contentLength));
    }
    if (this.fyZ) {
      localContentValues.put("contentType", this.field_contentType);
    }
    if (this.fqT) {
      localContentValues.put("expireTime", Long.valueOf(this.field_expireTime));
    }
    if (this.flE) {
      localContentValues.put("md5", this.field_md5);
    }
    if (this.fza) {
      localContentValues.put("groupId1", this.field_groupId1);
    }
    if (this.fzb) {
      localContentValues.put("groupId2", this.field_groupId2);
    }
    if (this.fzc) {
      localContentValues.put("priority", Integer.valueOf(this.field_priority));
    }
    if (this.fzd) {
      localContentValues.put("fileUpdated", Boolean.valueOf(this.field_fileUpdated));
    }
    if (this.fze) {
      localContentValues.put("deleted", Boolean.valueOf(this.field_deleted));
    }
    if (this.fzf) {
      localContentValues.put("resType", Integer.valueOf(this.field_resType));
    }
    if (this.faB) {
      localContentValues.put("subType", Integer.valueOf(this.field_subType));
    }
    if (this.fzg) {
      localContentValues.put("reportId", Long.valueOf(this.field_reportId));
    }
    if (this.fzh) {
      localContentValues.put("sampleId", this.field_sampleId);
    }
    if (this.fzi) {
      localContentValues.put("eccSignature", this.field_eccSignature);
    }
    if (this.fzj) {
      localContentValues.put("originalMd5", this.field_originalMd5);
    }
    if (this.fzk) {
      localContentValues.put("fileCompress", Boolean.valueOf(this.field_fileCompress));
    }
    if (this.fzl) {
      localContentValues.put("fileEncrypt", Boolean.valueOf(this.field_fileEncrypt));
    }
    if (this.fzm) {
      localContentValues.put("encryptKey", this.field_encryptKey);
    }
    if (this.fzn) {
      localContentValues.put("keyVersion", Integer.valueOf(this.field_keyVersion));
    }
    if (this.fzo) {
      localContentValues.put("EID", Integer.valueOf(this.field_EID));
    }
    if (this.fpf) {
      localContentValues.put("fileSize", Long.valueOf(this.field_fileSize));
    }
    if (this.fzp) {
      localContentValues.put("needRetry", Boolean.valueOf(this.field_needRetry));
    }
    if (this.fbd) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.fzq) {
      localContentValues.put("wvCacheType", Integer.valueOf(this.field_wvCacheType));
    }
    if (this.fzr) {
      localContentValues.put("packageId", this.field_packageId);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4170950115328L, 31076);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\cr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */