package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class bd
  extends c
{
  private static final int eZC;
  private static final int eZI;
  private static final int eZW;
  public static final String[] eZt;
  private static final int fbb;
  private static final int fbu;
  private static final int fds;
  private static final int fmd;
  private static final int fpA;
  private static final int fpB;
  private static final int fpC;
  private static final int fpD;
  private static final int fpE;
  private static final int fpF;
  private static final int fpG;
  private static final int fpH;
  private static final int fpI;
  private static final int fpJ;
  private static final int fpK;
  private static final int fpL;
  private static final int fpM;
  private static final int fpN;
  private static final int fpO;
  private static final int fpw;
  private static final int fpx;
  private static final int fpy;
  private static final int fpz;
  private boolean eZF;
  private boolean eZO;
  private boolean faZ;
  private boolean fbd;
  private boolean fcW;
  public String field_appId;
  public boolean field_autoDownload;
  public boolean field_autoInstall;
  public String field_channelId;
  public long field_downloadId;
  public String field_downloadUrl;
  public int field_downloadUrlHashCode;
  public long field_downloadedSize;
  public int field_downloaderType;
  public int field_errCode;
  public String field_fileName;
  public String field_filePath;
  public long field_fileSize;
  public int field_fileType;
  public String field_md5;
  public String field_packageName;
  public int field_scene;
  public String field_secondaryUrl;
  public boolean field_showNotification;
  public long field_startSize;
  public int field_startState;
  public long field_startTime;
  public int field_status;
  public long field_sysDownloadId;
  public long field_totalSize;
  private boolean flE;
  private boolean fpc;
  private boolean fpd;
  private boolean fpe;
  private boolean fpf;
  private boolean fpg;
  private boolean fph;
  private boolean fpi;
  private boolean fpj;
  private boolean fpk;
  private boolean fpl;
  private boolean fpm;
  private boolean fpn;
  private boolean fpo;
  private boolean fpp;
  private boolean fpq;
  private boolean fpr;
  private boolean fpt;
  private boolean fpu;
  private boolean fpv;
  
  static
  {
    GMTrace.i(4150683238400L, 30925);
    eZt = new String[0];
    fpw = "downloadId".hashCode();
    fpx = "downloadUrl".hashCode();
    fpy = "secondaryUrl".hashCode();
    fpz = "fileSize".hashCode();
    fpA = "fileName".hashCode();
    fpB = "filePath".hashCode();
    fpC = "fileType".hashCode();
    eZI = "status".hashCode();
    fmd = "md5".hashCode();
    fpD = "autoInstall".hashCode();
    fpE = "showNotification".hashCode();
    fpF = "sysDownloadId".hashCode();
    fpG = "downloaderType".hashCode();
    fbu = "appId".hashCode();
    fpH = "downloadUrlHashCode".hashCode();
    fds = "packageName".hashCode();
    fpI = "downloadedSize".hashCode();
    fpJ = "totalSize".hashCode();
    fpK = "autoDownload".hashCode();
    fpL = "channelId".hashCode();
    fbb = "scene".hashCode();
    fpM = "errCode".hashCode();
    eZW = "startTime".hashCode();
    fpN = "startSize".hashCode();
    fpO = "startState".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4150683238400L, 30925);
  }
  
  public bd()
  {
    GMTrace.i(4150280585216L, 30922);
    this.fpc = true;
    this.fpd = true;
    this.fpe = true;
    this.fpf = true;
    this.fpg = true;
    this.fph = true;
    this.fpi = true;
    this.eZF = true;
    this.flE = true;
    this.fpj = true;
    this.fpk = true;
    this.fpl = true;
    this.fpm = true;
    this.fbd = true;
    this.fpn = true;
    this.fcW = true;
    this.fpo = true;
    this.fpp = true;
    this.fpq = true;
    this.fpr = true;
    this.faZ = true;
    this.fpt = true;
    this.eZO = true;
    this.fpu = true;
    this.fpv = true;
    GMTrace.o(4150280585216L, 30922);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4150414802944L, 30923);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4150414802944L, 30923);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fpw == k)
      {
        this.field_downloadId = paramCursor.getLong(i);
        this.fpc = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fpx == k)
        {
          this.field_downloadUrl = paramCursor.getString(i);
        }
        else if (fpy == k)
        {
          this.field_secondaryUrl = paramCursor.getString(i);
        }
        else if (fpz == k)
        {
          this.field_fileSize = paramCursor.getLong(i);
        }
        else if (fpA == k)
        {
          this.field_fileName = paramCursor.getString(i);
        }
        else if (fpB == k)
        {
          this.field_filePath = paramCursor.getString(i);
        }
        else if (fpC == k)
        {
          this.field_fileType = paramCursor.getInt(i);
        }
        else if (eZI == k)
        {
          this.field_status = paramCursor.getInt(i);
        }
        else if (fmd == k)
        {
          this.field_md5 = paramCursor.getString(i);
        }
        else
        {
          boolean bool;
          if (fpD == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (bool = true;; bool = false)
            {
              this.field_autoInstall = bool;
              break;
            }
          }
          if (fpE == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (bool = true;; bool = false)
            {
              this.field_showNotification = bool;
              break;
            }
          }
          if (fpF == k)
          {
            this.field_sysDownloadId = paramCursor.getLong(i);
          }
          else if (fpG == k)
          {
            this.field_downloaderType = paramCursor.getInt(i);
          }
          else if (fbu == k)
          {
            this.field_appId = paramCursor.getString(i);
          }
          else if (fpH == k)
          {
            this.field_downloadUrlHashCode = paramCursor.getInt(i);
          }
          else if (fds == k)
          {
            this.field_packageName = paramCursor.getString(i);
          }
          else if (fpI == k)
          {
            this.field_downloadedSize = paramCursor.getLong(i);
          }
          else if (fpJ == k)
          {
            this.field_totalSize = paramCursor.getLong(i);
          }
          else
          {
            if (fpK == k)
            {
              if (paramCursor.getInt(i) != 0) {}
              for (bool = true;; bool = false)
              {
                this.field_autoDownload = bool;
                break;
              }
            }
            if (fpL == k) {
              this.field_channelId = paramCursor.getString(i);
            } else if (fbb == k) {
              this.field_scene = paramCursor.getInt(i);
            } else if (fpM == k) {
              this.field_errCode = paramCursor.getInt(i);
            } else if (eZW == k) {
              this.field_startTime = paramCursor.getLong(i);
            } else if (fpN == k) {
              this.field_startSize = paramCursor.getLong(i);
            } else if (fpO == k) {
              this.field_startState = paramCursor.getInt(i);
            } else if (eZC == k) {
              this.vmr = paramCursor.getLong(i);
            }
          }
        }
      }
    }
    GMTrace.o(4150414802944L, 30923);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4150549020672L, 30924);
    ContentValues localContentValues = new ContentValues();
    if (this.fpc) {
      localContentValues.put("downloadId", Long.valueOf(this.field_downloadId));
    }
    if (this.field_downloadUrl == null) {
      this.field_downloadUrl = "";
    }
    if (this.fpd) {
      localContentValues.put("downloadUrl", this.field_downloadUrl);
    }
    if (this.field_secondaryUrl == null) {
      this.field_secondaryUrl = "";
    }
    if (this.fpe) {
      localContentValues.put("secondaryUrl", this.field_secondaryUrl);
    }
    if (this.fpf) {
      localContentValues.put("fileSize", Long.valueOf(this.field_fileSize));
    }
    if (this.field_fileName == null) {
      this.field_fileName = "";
    }
    if (this.fpg) {
      localContentValues.put("fileName", this.field_fileName);
    }
    if (this.field_filePath == null) {
      this.field_filePath = "";
    }
    if (this.fph) {
      localContentValues.put("filePath", this.field_filePath);
    }
    if (this.fpi) {
      localContentValues.put("fileType", Integer.valueOf(this.field_fileType));
    }
    if (this.eZF) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.field_md5 == null) {
      this.field_md5 = "";
    }
    if (this.flE) {
      localContentValues.put("md5", this.field_md5);
    }
    if (this.fpj) {
      localContentValues.put("autoInstall", Boolean.valueOf(this.field_autoInstall));
    }
    if (this.fpk) {
      localContentValues.put("showNotification", Boolean.valueOf(this.field_showNotification));
    }
    if (this.fpl) {
      localContentValues.put("sysDownloadId", Long.valueOf(this.field_sysDownloadId));
    }
    if (this.fpm) {
      localContentValues.put("downloaderType", Integer.valueOf(this.field_downloaderType));
    }
    if (this.field_appId == null) {
      this.field_appId = "";
    }
    if (this.fbd) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.fpn) {
      localContentValues.put("downloadUrlHashCode", Integer.valueOf(this.field_downloadUrlHashCode));
    }
    if (this.field_packageName == null) {
      this.field_packageName = "";
    }
    if (this.fcW) {
      localContentValues.put("packageName", this.field_packageName);
    }
    if (this.fpo) {
      localContentValues.put("downloadedSize", Long.valueOf(this.field_downloadedSize));
    }
    if (this.fpp) {
      localContentValues.put("totalSize", Long.valueOf(this.field_totalSize));
    }
    if (this.fpq) {
      localContentValues.put("autoDownload", Boolean.valueOf(this.field_autoDownload));
    }
    if (this.field_channelId == null) {
      this.field_channelId = "";
    }
    if (this.fpr) {
      localContentValues.put("channelId", this.field_channelId);
    }
    if (this.faZ) {
      localContentValues.put("scene", Integer.valueOf(this.field_scene));
    }
    if (this.fpt) {
      localContentValues.put("errCode", Integer.valueOf(this.field_errCode));
    }
    if (this.eZO) {
      localContentValues.put("startTime", Long.valueOf(this.field_startTime));
    }
    if (this.fpu) {
      localContentValues.put("startSize", Long.valueOf(this.field_startSize));
    }
    if (this.fpv) {
      localContentValues.put("startState", Integer.valueOf(this.field_startState));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4150549020672L, 30924);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */