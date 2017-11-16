package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class bx
  extends c
{
  private static final int eZC;
  private static final int eZI;
  public static final String[] eZt;
  private static final int ftC;
  private static final int ftD;
  private static final int ftE;
  private static final int ftF;
  private static final int ftG;
  private boolean eZF;
  public long field_addressId;
  public long field_calltime;
  public long field_duration;
  public int field_phoneType;
  public String field_phonenumber;
  public int field_status;
  private boolean ftA;
  private boolean ftB;
  private boolean ftx;
  private boolean fty;
  private boolean ftz;
  
  static
  {
    GMTrace.i(4167326236672L, 31049);
    eZt = new String[0];
    ftC = "phonenumber".hashCode();
    ftD = "calltime".hashCode();
    ftE = "duration".hashCode();
    eZI = "status".hashCode();
    ftF = "addressId".hashCode();
    ftG = "phoneType".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4167326236672L, 31049);
  }
  
  public bx()
  {
    GMTrace.i(4166923583488L, 31046);
    this.ftx = true;
    this.fty = true;
    this.ftz = true;
    this.eZF = true;
    this.ftA = true;
    this.ftB = true;
    GMTrace.o(4166923583488L, 31046);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4167057801216L, 31047);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4167057801216L, 31047);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (ftC == k) {
        this.field_phonenumber = paramCursor.getString(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (ftD == k) {
          this.field_calltime = paramCursor.getLong(i);
        } else if (ftE == k) {
          this.field_duration = paramCursor.getLong(i);
        } else if (eZI == k) {
          this.field_status = paramCursor.getInt(i);
        } else if (ftF == k) {
          this.field_addressId = paramCursor.getLong(i);
        } else if (ftG == k) {
          this.field_phoneType = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4167057801216L, 31047);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4167192018944L, 31048);
    ContentValues localContentValues = new ContentValues();
    if (this.ftx) {
      localContentValues.put("phonenumber", this.field_phonenumber);
    }
    if (this.fty) {
      localContentValues.put("calltime", Long.valueOf(this.field_calltime));
    }
    if (this.ftz) {
      localContentValues.put("duration", Long.valueOf(this.field_duration));
    }
    if (this.eZF) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.ftA) {
      localContentValues.put("addressId", Long.valueOf(this.field_addressId));
    }
    if (this.ftB) {
      localContentValues.put("phoneType", Integer.valueOf(this.field_phoneType));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4167192018944L, 31048);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\bx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */