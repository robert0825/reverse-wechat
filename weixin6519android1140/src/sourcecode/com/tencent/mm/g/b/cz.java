package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class cz
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fBA;
  private static final int fBB;
  private static final int fBC;
  private static final int fBD;
  private static final int fBE;
  private static final int fBF;
  private static final int fBz;
  private static final int fbM;
  private static final int fer;
  private static final int fpA;
  private boolean fBs;
  private boolean fBt;
  private boolean fBu;
  private boolean fBv;
  private boolean fBw;
  private boolean fBx;
  private boolean fBy;
  private boolean fbL;
  private boolean fep;
  public String field_cnValue;
  public int field_eggIndex;
  public String field_enValue;
  public String field_fileName;
  public int field_flag;
  public String field_key;
  public int field_position;
  public String field_qqValue;
  public String field_thValue;
  public String field_twValue;
  private boolean fpg;
  
  static
  {
    GMTrace.i(4151756980224L, 30933);
    eZt = new String[0];
    fbM = "key".hashCode();
    fBz = "cnValue".hashCode();
    fBA = "qqValue".hashCode();
    fBB = "twValue".hashCode();
    fBC = "enValue".hashCode();
    fBD = "thValue".hashCode();
    fpA = "fileName".hashCode();
    fBE = "eggIndex".hashCode();
    fBF = "position".hashCode();
    fer = "flag".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4151756980224L, 30933);
  }
  
  public cz()
  {
    GMTrace.i(4151354327040L, 30930);
    this.fbL = true;
    this.fBs = true;
    this.fBt = true;
    this.fBu = true;
    this.fBv = true;
    this.fBw = true;
    this.fpg = true;
    this.fBx = true;
    this.fBy = true;
    this.fep = true;
    GMTrace.o(4151354327040L, 30930);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4151488544768L, 30931);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4151488544768L, 30931);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
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
        if (fBz == k) {
          this.field_cnValue = paramCursor.getString(i);
        } else if (fBA == k) {
          this.field_qqValue = paramCursor.getString(i);
        } else if (fBB == k) {
          this.field_twValue = paramCursor.getString(i);
        } else if (fBC == k) {
          this.field_enValue = paramCursor.getString(i);
        } else if (fBD == k) {
          this.field_thValue = paramCursor.getString(i);
        } else if (fpA == k) {
          this.field_fileName = paramCursor.getString(i);
        } else if (fBE == k) {
          this.field_eggIndex = paramCursor.getInt(i);
        } else if (fBF == k) {
          this.field_position = paramCursor.getInt(i);
        } else if (fer == k) {
          this.field_flag = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4151488544768L, 30931);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4151622762496L, 30932);
    ContentValues localContentValues = new ContentValues();
    if (this.fbL) {
      localContentValues.put("key", this.field_key);
    }
    if (this.fBs) {
      localContentValues.put("cnValue", this.field_cnValue);
    }
    if (this.fBt) {
      localContentValues.put("qqValue", this.field_qqValue);
    }
    if (this.fBu) {
      localContentValues.put("twValue", this.field_twValue);
    }
    if (this.fBv) {
      localContentValues.put("enValue", this.field_enValue);
    }
    if (this.fBw) {
      localContentValues.put("thValue", this.field_thValue);
    }
    if (this.fpg) {
      localContentValues.put("fileName", this.field_fileName);
    }
    if (this.fBx) {
      localContentValues.put("eggIndex", Integer.valueOf(this.field_eggIndex));
    }
    if (this.fBy) {
      localContentValues.put("position", Integer.valueOf(this.field_position));
    }
    if (this.fep) {
      localContentValues.put("flag", Integer.valueOf(this.field_flag));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4151622762496L, 30932);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\cz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */