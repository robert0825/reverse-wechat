package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class ea
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fHn;
  private static final int fHo;
  private static final int fHp;
  private static final int fHq;
  private static final int fHr;
  private static final int fHs;
  private static final int fHt;
  private static final int faG;
  private static final int fbM;
  private static final int fbS;
  private static final int fcK;
  private static final int fmd;
  private static final int fpB;
  private static final int fpx;
  private boolean fHg;
  private boolean fHh;
  private boolean fHi;
  private boolean fHj;
  private boolean fHk;
  private boolean fHl;
  private boolean fHm;
  private boolean fak;
  private boolean fbL;
  private boolean fbP;
  private boolean fcD;
  public int field_autoDownloadCount;
  public boolean field_completeDownload;
  public long field_createTime;
  public int field_downloadNetType;
  public String field_downloadUrl;
  public int field_fileDownloadCount;
  public String field_filePath;
  public String field_key;
  public String field_md5;
  public String field_mimeType;
  public String field_pkgId;
  public String field_rid;
  public int field_size;
  public String field_version;
  private boolean flE;
  private boolean fpd;
  private boolean fph;
  
  static
  {
    GMTrace.i(15004199813120L, 111790);
    eZt = new String[0];
    fbM = "key".hashCode();
    fHn = "pkgId".hashCode();
    fcK = "version".hashCode();
    fpB = "filePath".hashCode();
    fHo = "rid".hashCode();
    fHp = "mimeType".hashCode();
    fmd = "md5".hashCode();
    fpx = "downloadUrl".hashCode();
    fbS = "size".hashCode();
    fHq = "downloadNetType".hashCode();
    fHr = "completeDownload".hashCode();
    faG = "createTime".hashCode();
    fHs = "autoDownloadCount".hashCode();
    fHt = "fileDownloadCount".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(15004199813120L, 111790);
  }
  
  public ea()
  {
    GMTrace.i(15003797159936L, 111787);
    this.fbL = true;
    this.fHg = true;
    this.fcD = true;
    this.fph = true;
    this.fHh = true;
    this.fHi = true;
    this.flE = true;
    this.fpd = true;
    this.fbP = true;
    this.fHj = true;
    this.fHk = true;
    this.fak = true;
    this.fHl = true;
    this.fHm = true;
    GMTrace.o(15003797159936L, 111787);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(15003931377664L, 111788);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(15003931377664L, 111788);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fbM == k)
      {
        this.field_key = paramCursor.getString(i);
        this.fbL = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fHn == k)
        {
          this.field_pkgId = paramCursor.getString(i);
        }
        else if (fcK == k)
        {
          this.field_version = paramCursor.getString(i);
        }
        else if (fpB == k)
        {
          this.field_filePath = paramCursor.getString(i);
        }
        else if (fHo == k)
        {
          this.field_rid = paramCursor.getString(i);
        }
        else if (fHp == k)
        {
          this.field_mimeType = paramCursor.getString(i);
        }
        else if (fmd == k)
        {
          this.field_md5 = paramCursor.getString(i);
        }
        else if (fpx == k)
        {
          this.field_downloadUrl = paramCursor.getString(i);
        }
        else if (fbS == k)
        {
          this.field_size = paramCursor.getInt(i);
        }
        else if (fHq == k)
        {
          this.field_downloadNetType = paramCursor.getInt(i);
        }
        else
        {
          if (fHr == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_completeDownload = bool;
              break;
            }
          }
          if (faG == k) {
            this.field_createTime = paramCursor.getLong(i);
          } else if (fHs == k) {
            this.field_autoDownloadCount = paramCursor.getInt(i);
          } else if (fHt == k) {
            this.field_fileDownloadCount = paramCursor.getInt(i);
          } else if (eZC == k) {
            this.vmr = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(15003931377664L, 111788);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(15004065595392L, 111789);
    ContentValues localContentValues = new ContentValues();
    if (this.fbL) {
      localContentValues.put("key", this.field_key);
    }
    if (this.fHg) {
      localContentValues.put("pkgId", this.field_pkgId);
    }
    if (this.fcD) {
      localContentValues.put("version", this.field_version);
    }
    if (this.fph) {
      localContentValues.put("filePath", this.field_filePath);
    }
    if (this.fHh) {
      localContentValues.put("rid", this.field_rid);
    }
    if (this.fHi) {
      localContentValues.put("mimeType", this.field_mimeType);
    }
    if (this.flE) {
      localContentValues.put("md5", this.field_md5);
    }
    if (this.fpd) {
      localContentValues.put("downloadUrl", this.field_downloadUrl);
    }
    if (this.fbP) {
      localContentValues.put("size", Integer.valueOf(this.field_size));
    }
    if (this.fHj) {
      localContentValues.put("downloadNetType", Integer.valueOf(this.field_downloadNetType));
    }
    if (this.fHk) {
      localContentValues.put("completeDownload", Boolean.valueOf(this.field_completeDownload));
    }
    if (this.fak) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.fHl) {
      localContentValues.put("autoDownloadCount", Integer.valueOf(this.field_autoDownloadCount));
    }
    if (this.fHm) {
      localContentValues.put("fileDownloadCount", Integer.valueOf(this.field_fileDownloadCount));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(15004065595392L, 111789);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\ea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */