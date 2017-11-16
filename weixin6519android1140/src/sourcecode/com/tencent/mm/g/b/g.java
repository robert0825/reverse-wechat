package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class g
  extends c
{
  private static final int eZC;
  private static final int eZI;
  public static final String[] eZt;
  private static final int faG;
  private static final int faJ;
  private static final int fbA;
  private static final int fbB;
  private static final int fbC;
  private static final int fbD;
  private static final int fbE;
  private static final int fbF;
  private static final int fbG;
  private static final int fbH;
  private static final int fbI;
  private static final int fbJ;
  private static final int fbK;
  private static final int fbu;
  private static final int fbv;
  private static final int fbw;
  private static final int fbx;
  private static final int fby;
  private static final int fbz;
  private boolean eZF;
  private boolean fak;
  private boolean fan;
  private boolean fbd;
  private boolean fbe;
  private boolean fbf;
  private boolean fbg;
  private boolean fbh;
  private boolean fbi;
  private boolean fbj;
  private boolean fbk;
  private boolean fbl;
  private boolean fbm;
  private boolean fbn;
  private boolean fbo;
  private boolean fbp;
  private boolean fbq;
  private boolean fbr;
  private boolean fbs;
  private boolean fbt;
  public String field_appId;
  public String field_clientAppDataId;
  public long field_createTime;
  public String field_fakeAeskey;
  public String field_fakeSignature;
  public String field_fileFullPath;
  public String field_fullXml;
  public boolean field_isUpload;
  public int field_isUseCdn;
  public long field_lastModifyTime;
  public String field_mediaId;
  public String field_mediaSvrId;
  public long field_msgInfoId;
  public long field_netTimes;
  public long field_offset;
  public long field_sdkVer;
  public String field_signature;
  public long field_status;
  public long field_totalLen;
  public long field_type;
  
  static
  {
    GMTrace.i(4171621203968L, 31081);
    eZt = new String[0];
    fbu = "appId".hashCode();
    fbv = "sdkVer".hashCode();
    fbw = "mediaSvrId".hashCode();
    fbx = "mediaId".hashCode();
    fby = "clientAppDataId".hashCode();
    faJ = "type".hashCode();
    fbz = "totalLen".hashCode();
    fbA = "offset".hashCode();
    eZI = "status".hashCode();
    fbB = "isUpload".hashCode();
    faG = "createTime".hashCode();
    fbC = "lastModifyTime".hashCode();
    fbD = "fileFullPath".hashCode();
    fbE = "fullXml".hashCode();
    fbF = "msgInfoId".hashCode();
    fbG = "netTimes".hashCode();
    fbH = "isUseCdn".hashCode();
    fbI = "signature".hashCode();
    fbJ = "fakeAeskey".hashCode();
    fbK = "fakeSignature".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4171621203968L, 31081);
  }
  
  public g()
  {
    GMTrace.i(4171218550784L, 31078);
    this.fbd = true;
    this.fbe = true;
    this.fbf = true;
    this.fbg = true;
    this.fbh = true;
    this.fan = true;
    this.fbi = true;
    this.fbj = true;
    this.eZF = true;
    this.fbk = true;
    this.fak = true;
    this.fbl = true;
    this.fbm = true;
    this.fbn = true;
    this.fbo = true;
    this.fbp = true;
    this.fbq = true;
    this.fbr = true;
    this.fbs = true;
    this.fbt = true;
    GMTrace.o(4171218550784L, 31078);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4171352768512L, 31079);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4171352768512L, 31079);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
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
        if (fbv == k)
        {
          this.field_sdkVer = paramCursor.getLong(i);
        }
        else if (fbw == k)
        {
          this.field_mediaSvrId = paramCursor.getString(i);
        }
        else if (fbx == k)
        {
          this.field_mediaId = paramCursor.getString(i);
        }
        else if (fby == k)
        {
          this.field_clientAppDataId = paramCursor.getString(i);
        }
        else if (faJ == k)
        {
          this.field_type = paramCursor.getLong(i);
        }
        else if (fbz == k)
        {
          this.field_totalLen = paramCursor.getLong(i);
        }
        else if (fbA == k)
        {
          this.field_offset = paramCursor.getLong(i);
        }
        else if (eZI == k)
        {
          this.field_status = paramCursor.getLong(i);
        }
        else
        {
          if (fbB == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_isUpload = bool;
              break;
            }
          }
          if (faG == k) {
            this.field_createTime = paramCursor.getLong(i);
          } else if (fbC == k) {
            this.field_lastModifyTime = paramCursor.getLong(i);
          } else if (fbD == k) {
            this.field_fileFullPath = paramCursor.getString(i);
          } else if (fbE == k) {
            this.field_fullXml = paramCursor.getString(i);
          } else if (fbF == k) {
            this.field_msgInfoId = paramCursor.getLong(i);
          } else if (fbG == k) {
            this.field_netTimes = paramCursor.getLong(i);
          } else if (fbH == k) {
            this.field_isUseCdn = paramCursor.getInt(i);
          } else if (fbI == k) {
            this.field_signature = paramCursor.getString(i);
          } else if (fbJ == k) {
            this.field_fakeAeskey = paramCursor.getString(i);
          } else if (fbK == k) {
            this.field_fakeSignature = paramCursor.getString(i);
          } else if (eZC == k) {
            this.vmr = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(4171352768512L, 31079);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4171486986240L, 31080);
    ContentValues localContentValues = new ContentValues();
    if (this.fbd) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.fbe) {
      localContentValues.put("sdkVer", Long.valueOf(this.field_sdkVer));
    }
    if (this.fbf) {
      localContentValues.put("mediaSvrId", this.field_mediaSvrId);
    }
    if (this.fbg) {
      localContentValues.put("mediaId", this.field_mediaId);
    }
    if (this.fbh) {
      localContentValues.put("clientAppDataId", this.field_clientAppDataId);
    }
    if (this.fan) {
      localContentValues.put("type", Long.valueOf(this.field_type));
    }
    if (this.fbi) {
      localContentValues.put("totalLen", Long.valueOf(this.field_totalLen));
    }
    if (this.fbj) {
      localContentValues.put("offset", Long.valueOf(this.field_offset));
    }
    if (this.eZF) {
      localContentValues.put("status", Long.valueOf(this.field_status));
    }
    if (this.fbk) {
      localContentValues.put("isUpload", Boolean.valueOf(this.field_isUpload));
    }
    if (this.fak) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.fbl) {
      localContentValues.put("lastModifyTime", Long.valueOf(this.field_lastModifyTime));
    }
    if (this.fbm) {
      localContentValues.put("fileFullPath", this.field_fileFullPath);
    }
    if (this.fbn) {
      localContentValues.put("fullXml", this.field_fullXml);
    }
    if (this.fbo) {
      localContentValues.put("msgInfoId", Long.valueOf(this.field_msgInfoId));
    }
    if (this.fbp) {
      localContentValues.put("netTimes", Long.valueOf(this.field_netTimes));
    }
    if (this.fbq) {
      localContentValues.put("isUseCdn", Integer.valueOf(this.field_isUseCdn));
    }
    if (this.fbr) {
      localContentValues.put("signature", this.field_signature);
    }
    if (this.fbs) {
      localContentValues.put("fakeAeskey", this.field_fakeAeskey);
    }
    if (this.fbt) {
      localContentValues.put("fakeSignature", this.field_fakeSignature);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4171486986240L, 31080);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */