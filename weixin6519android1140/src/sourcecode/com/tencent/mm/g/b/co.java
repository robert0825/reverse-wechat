package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class co
  extends c
{
  private static final int eZC;
  private static final int eZI;
  public static final String[] eZt;
  private static final int faJ;
  private static final int fbA;
  private static final int fbx;
  private static final int fbz;
  private static final int fmu;
  private static final int fnR;
  private static final int fnT;
  private static final int fnU;
  private static final int foa;
  private static final int fow;
  private static final int fpC;
  private static final int fpM;
  private static final int fyG;
  private static final int fyH;
  private boolean eZF;
  private boolean fan;
  private boolean fbg;
  private boolean fbi;
  private boolean fbj;
  public String field_cdnKey;
  public String field_cdnUrl;
  public String field_dataId;
  public int field_errCode;
  public int field_fileType;
  public boolean field_isThumb;
  public int field_localId;
  public String field_mediaId;
  public int field_offset;
  public String field_path;
  public int field_recordLocalId;
  public int field_status;
  public String field_toUser;
  public int field_totalLen;
  public int field_type;
  private boolean flV;
  private boolean fnM;
  private boolean fnO;
  private boolean fnP;
  private boolean fnY;
  private boolean foi;
  private boolean fpi;
  private boolean fpt;
  private boolean fyE;
  private boolean fyF;
  
  static
  {
    GMTrace.i(4175513518080L, 31110);
    eZt = new String[] { "CREATE INDEX IF NOT EXISTS record_localid_index ON RecordCDNInfo(recordLocalId)" };
    foa = "localId".hashCode();
    fyG = "recordLocalId".hashCode();
    fow = "toUser".hashCode();
    fnR = "dataId".hashCode();
    fbx = "mediaId".hashCode();
    fnU = "path".hashCode();
    fmu = "cdnUrl".hashCode();
    fnT = "cdnKey".hashCode();
    fbz = "totalLen".hashCode();
    fyH = "isThumb".hashCode();
    fbA = "offset".hashCode();
    faJ = "type".hashCode();
    fpC = "fileType".hashCode();
    eZI = "status".hashCode();
    fpM = "errCode".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4175513518080L, 31110);
  }
  
  public co()
  {
    GMTrace.i(4175110864896L, 31107);
    this.fnY = true;
    this.fyE = true;
    this.foi = true;
    this.fnM = true;
    this.fbg = true;
    this.fnP = true;
    this.flV = true;
    this.fnO = true;
    this.fbi = true;
    this.fyF = true;
    this.fbj = true;
    this.fan = true;
    this.fpi = true;
    this.eZF = true;
    this.fpt = true;
    GMTrace.o(4175110864896L, 31107);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4175245082624L, 31108);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4175245082624L, 31108);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (foa == k)
      {
        this.field_localId = paramCursor.getInt(i);
        this.fnY = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fyG == k)
        {
          this.field_recordLocalId = paramCursor.getInt(i);
        }
        else if (fow == k)
        {
          this.field_toUser = paramCursor.getString(i);
        }
        else if (fnR == k)
        {
          this.field_dataId = paramCursor.getString(i);
        }
        else if (fbx == k)
        {
          this.field_mediaId = paramCursor.getString(i);
        }
        else if (fnU == k)
        {
          this.field_path = paramCursor.getString(i);
        }
        else if (fmu == k)
        {
          this.field_cdnUrl = paramCursor.getString(i);
        }
        else if (fnT == k)
        {
          this.field_cdnKey = paramCursor.getString(i);
        }
        else if (fbz == k)
        {
          this.field_totalLen = paramCursor.getInt(i);
        }
        else
        {
          if (fyH == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_isThumb = bool;
              break;
            }
          }
          if (fbA == k) {
            this.field_offset = paramCursor.getInt(i);
          } else if (faJ == k) {
            this.field_type = paramCursor.getInt(i);
          } else if (fpC == k) {
            this.field_fileType = paramCursor.getInt(i);
          } else if (eZI == k) {
            this.field_status = paramCursor.getInt(i);
          } else if (fpM == k) {
            this.field_errCode = paramCursor.getInt(i);
          } else if (eZC == k) {
            this.vmr = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(4175245082624L, 31108);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4175379300352L, 31109);
    ContentValues localContentValues = new ContentValues();
    if (this.fnY) {
      localContentValues.put("localId", Integer.valueOf(this.field_localId));
    }
    if (this.fyE) {
      localContentValues.put("recordLocalId", Integer.valueOf(this.field_recordLocalId));
    }
    if (this.field_toUser == null) {
      this.field_toUser = "";
    }
    if (this.foi) {
      localContentValues.put("toUser", this.field_toUser);
    }
    if (this.fnM) {
      localContentValues.put("dataId", this.field_dataId);
    }
    if (this.fbg) {
      localContentValues.put("mediaId", this.field_mediaId);
    }
    if (this.fnP) {
      localContentValues.put("path", this.field_path);
    }
    if (this.flV) {
      localContentValues.put("cdnUrl", this.field_cdnUrl);
    }
    if (this.fnO) {
      localContentValues.put("cdnKey", this.field_cdnKey);
    }
    if (this.fbi) {
      localContentValues.put("totalLen", Integer.valueOf(this.field_totalLen));
    }
    if (this.fyF) {
      localContentValues.put("isThumb", Boolean.valueOf(this.field_isThumb));
    }
    if (this.fbj) {
      localContentValues.put("offset", Integer.valueOf(this.field_offset));
    }
    if (this.fan) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.fpi) {
      localContentValues.put("fileType", Integer.valueOf(this.field_fileType));
    }
    if (this.eZF) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.fpt) {
      localContentValues.put("errCode", Integer.valueOf(this.field_errCode));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4175379300352L, 31109);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\co.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */