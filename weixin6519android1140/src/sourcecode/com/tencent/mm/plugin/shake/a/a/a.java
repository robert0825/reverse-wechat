package com.tencent.mm.plugin.shake.a.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class a
  extends c
{
  private static final int eZC;
  private static final int eZI;
  public static final String[] eZt;
  private static final int faJ;
  private static final int fem;
  private static final int fmH;
  private static final int fme;
  private static final int fmj;
  private static final int fmk;
  private static final int fml;
  private static final int foH;
  private static final int foV;
  private static final int ftO;
  private static final int oLX;
  private static final int oLY;
  private boolean eZF;
  private boolean fan;
  private boolean fei;
  public long field_createtime;
  public String field_desc;
  public String field_reserved1;
  public String field_reserved2;
  public int field_reserved3;
  public byte[] field_reservedBuf;
  public int field_status;
  public int field_subtype;
  public long field_svrid;
  public String field_tag;
  public String field_thumburl;
  public String field_title;
  public int field_type;
  private boolean flF;
  private boolean flK;
  private boolean flL;
  private boolean flM;
  private boolean fmD;
  private boolean foF;
  private boolean foL;
  private boolean ftJ;
  private boolean oLV;
  private boolean oLW;
  
  static
  {
    GMTrace.i(6617605079040L, 49305);
    eZt = new String[0];
    fme = "svrid".hashCode();
    faJ = "type".hashCode();
    foH = "subtype".hashCode();
    ftO = "createtime".hashCode();
    foV = "tag".hashCode();
    eZI = "status".hashCode();
    fem = "title".hashCode();
    fmH = "desc".hashCode();
    oLX = "thumburl".hashCode();
    fmj = "reserved1".hashCode();
    fmk = "reserved2".hashCode();
    fml = "reserved3".hashCode();
    oLY = "reservedBuf".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(6617605079040L, 49305);
  }
  
  public a()
  {
    GMTrace.i(6617202425856L, 49302);
    this.flF = true;
    this.fan = true;
    this.foF = true;
    this.ftJ = true;
    this.foL = true;
    this.eZF = true;
    this.fei = true;
    this.fmD = true;
    this.oLV = true;
    this.flK = true;
    this.flL = true;
    this.flM = true;
    this.oLW = true;
    GMTrace.o(6617202425856L, 49302);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(6617336643584L, 49303);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(6617336643584L, 49303);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fme == k)
      {
        this.field_svrid = paramCursor.getLong(i);
        this.flF = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (faJ == k) {
          this.field_type = paramCursor.getInt(i);
        } else if (foH == k) {
          this.field_subtype = paramCursor.getInt(i);
        } else if (ftO == k) {
          this.field_createtime = paramCursor.getLong(i);
        } else if (foV == k) {
          this.field_tag = paramCursor.getString(i);
        } else if (eZI == k) {
          this.field_status = paramCursor.getInt(i);
        } else if (fem == k) {
          this.field_title = paramCursor.getString(i);
        } else if (fmH == k) {
          this.field_desc = paramCursor.getString(i);
        } else if (oLX == k) {
          this.field_thumburl = paramCursor.getString(i);
        } else if (fmj == k) {
          this.field_reserved1 = paramCursor.getString(i);
        } else if (fmk == k) {
          this.field_reserved2 = paramCursor.getString(i);
        } else if (fml == k) {
          this.field_reserved3 = paramCursor.getInt(i);
        } else if (oLY == k) {
          this.field_reservedBuf = paramCursor.getBlob(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(6617336643584L, 49303);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(6617470861312L, 49304);
    ContentValues localContentValues = new ContentValues();
    if (this.flF) {
      localContentValues.put("svrid", Long.valueOf(this.field_svrid));
    }
    if (this.fan) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.foF) {
      localContentValues.put("subtype", Integer.valueOf(this.field_subtype));
    }
    if (this.ftJ) {
      localContentValues.put("createtime", Long.valueOf(this.field_createtime));
    }
    if (this.foL) {
      localContentValues.put("tag", this.field_tag);
    }
    if (this.eZF) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.fei) {
      localContentValues.put("title", this.field_title);
    }
    if (this.fmD) {
      localContentValues.put("desc", this.field_desc);
    }
    if (this.oLV) {
      localContentValues.put("thumburl", this.field_thumburl);
    }
    if (this.flK) {
      localContentValues.put("reserved1", this.field_reserved1);
    }
    if (this.flL) {
      localContentValues.put("reserved2", this.field_reserved2);
    }
    if (this.flM) {
      localContentValues.put("reserved3", Integer.valueOf(this.field_reserved3));
    }
    if (this.oLW) {
      localContentValues.put("reservedBuf", this.field_reservedBuf);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(6617470861312L, 49304);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\shake\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */