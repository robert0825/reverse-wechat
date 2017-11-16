package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class m
  extends c
{
  private static final int eZC;
  private static final int eZW;
  private static final int eZX;
  public static final String[] eZt;
  private static final int faG;
  private static final int fbu;
  private static final int fcK;
  private static final int fcL;
  private static final int fcM;
  private static final int fcN;
  private static final int fcO;
  private static final int fcP;
  private static final int fcQ;
  private boolean eZO;
  private boolean eZP;
  private boolean fak;
  private boolean fbd;
  private boolean fcD;
  private boolean fcE;
  private boolean fcF;
  private boolean fcG;
  private boolean fcH;
  private boolean fcI;
  private boolean fcJ;
  public String field_appId;
  public long field_createTime;
  public int field_debugType;
  public String field_downloadURL;
  public long field_endTime;
  public String field_pkgPath;
  public int field_resourceCount;
  public long field_startTime;
  public int field_version;
  public String field_versionMd5;
  public int field_versionState;
  
  static
  {
    GMTrace.i(4157796777984L, 30978);
    eZt = new String[] { "CREATE INDEX IF NOT EXISTS AppBrandWxaPkgManifestRecordPkgPathIndex ON AppBrandWxaPkgManifestRecord(pkgPath)" };
    fbu = "appId".hashCode();
    fcK = "version".hashCode();
    fcL = "versionMd5".hashCode();
    fcM = "versionState".hashCode();
    fcN = "pkgPath".hashCode();
    faG = "createTime".hashCode();
    fcO = "resourceCount".hashCode();
    fcP = "debugType".hashCode();
    fcQ = "downloadURL".hashCode();
    eZW = "startTime".hashCode();
    eZX = "endTime".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4157796777984L, 30978);
  }
  
  public m()
  {
    GMTrace.i(4157394124800L, 30975);
    this.fbd = true;
    this.fcD = true;
    this.fcE = true;
    this.fcF = true;
    this.fcG = true;
    this.fak = true;
    this.fcH = true;
    this.fcI = true;
    this.fcJ = true;
    this.eZO = true;
    this.eZP = true;
    GMTrace.o(4157394124800L, 30975);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4157528342528L, 30976);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4157528342528L, 30976);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fbu == k) {
        this.field_appId = paramCursor.getString(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fcK == k) {
          this.field_version = paramCursor.getInt(i);
        } else if (fcL == k) {
          this.field_versionMd5 = paramCursor.getString(i);
        } else if (fcM == k) {
          this.field_versionState = paramCursor.getInt(i);
        } else if (fcN == k) {
          this.field_pkgPath = paramCursor.getString(i);
        } else if (faG == k) {
          this.field_createTime = paramCursor.getLong(i);
        } else if (fcO == k) {
          this.field_resourceCount = paramCursor.getInt(i);
        } else if (fcP == k) {
          this.field_debugType = paramCursor.getInt(i);
        } else if (fcQ == k) {
          this.field_downloadURL = paramCursor.getString(i);
        } else if (eZW == k) {
          this.field_startTime = paramCursor.getLong(i);
        } else if (eZX == k) {
          this.field_endTime = paramCursor.getLong(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4157528342528L, 30976);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4157662560256L, 30977);
    ContentValues localContentValues = new ContentValues();
    if (this.fbd) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.fcD) {
      localContentValues.put("version", Integer.valueOf(this.field_version));
    }
    if (this.fcE) {
      localContentValues.put("versionMd5", this.field_versionMd5);
    }
    if (this.fcF) {
      localContentValues.put("versionState", Integer.valueOf(this.field_versionState));
    }
    if (this.fcG) {
      localContentValues.put("pkgPath", this.field_pkgPath);
    }
    if (this.fak) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.fcH) {
      localContentValues.put("resourceCount", Integer.valueOf(this.field_resourceCount));
    }
    if (this.fcI) {
      localContentValues.put("debugType", Integer.valueOf(this.field_debugType));
    }
    if (this.fcJ) {
      localContentValues.put("downloadURL", this.field_downloadURL);
    }
    if (this.eZO) {
      localContentValues.put("startTime", Long.valueOf(this.field_startTime));
    }
    if (this.eZP) {
      localContentValues.put("endTime", Long.valueOf(this.field_endTime));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4157662560256L, 30977);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */