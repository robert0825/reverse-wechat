package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class de
  extends c
{
  private static final int eZC;
  private static final int eZS;
  public static final String[] eZt;
  private static final int fCB;
  private static final int fCC;
  private static final int fCD;
  private static final int fbA;
  private boolean eZK;
  private boolean fCA;
  private boolean fCy;
  private boolean fCz;
  private boolean fbj;
  public int field_errorcount;
  public int field_logsize;
  public long field_logtime;
  public int field_offset;
  public byte[] field_value;
  
  static
  {
    GMTrace.i(4131758538752L, 30784);
    eZt = new String[] { "CREATE INDEX IF NOT EXISTS snsreport_kv_logtime ON SnsReportKv(logtime)" };
    fCB = "logtime".hashCode();
    fbA = "offset".hashCode();
    fCC = "logsize".hashCode();
    fCD = "errorcount".hashCode();
    eZS = "value".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4131758538752L, 30784);
  }
  
  public de()
  {
    GMTrace.i(4131355885568L, 30781);
    this.fCy = true;
    this.fbj = true;
    this.fCz = true;
    this.fCA = true;
    this.eZK = true;
    GMTrace.o(4131355885568L, 30781);
  }
  
  public void b(Cursor paramCursor)
  {
    GMTrace.i(4131490103296L, 30782);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4131490103296L, 30782);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fCB == k) {
        this.field_logtime = paramCursor.getLong(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fbA == k) {
          this.field_offset = paramCursor.getInt(i);
        } else if (fCC == k) {
          this.field_logsize = paramCursor.getInt(i);
        } else if (fCD == k) {
          this.field_errorcount = paramCursor.getInt(i);
        } else if (eZS == k) {
          this.field_value = paramCursor.getBlob(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4131490103296L, 30782);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4131624321024L, 30783);
    ContentValues localContentValues = new ContentValues();
    if (this.fCy) {
      localContentValues.put("logtime", Long.valueOf(this.field_logtime));
    }
    if (this.fbj) {
      localContentValues.put("offset", Integer.valueOf(this.field_offset));
    }
    if (this.fCz) {
      localContentValues.put("logsize", Integer.valueOf(this.field_logsize));
    }
    if (this.fCA) {
      localContentValues.put("errorcount", Integer.valueOf(this.field_errorcount));
    }
    if (this.eZK) {
      localContentValues.put("value", this.field_value);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4131624321024L, 30783);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\de.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */