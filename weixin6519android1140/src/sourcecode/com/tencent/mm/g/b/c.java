package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;

public abstract class c
  extends com.tencent.mm.sdk.e.c
{
  private static final int eZC;
  private static final int eZR;
  private static final int eZS;
  private static final int eZT;
  private static final int eZU;
  private static final int eZV;
  private static final int eZW;
  private static final int eZX;
  private static final int eZY;
  public static final String[] eZt;
  private boolean eZJ;
  private boolean eZK;
  private boolean eZL;
  private boolean eZM;
  private boolean eZN;
  private boolean eZO;
  private boolean eZP;
  private boolean eZQ;
  public String field_abtestkey;
  public long field_endTime;
  public String field_expId;
  public boolean field_noReport;
  public int field_prioritylevel;
  public long field_sequence;
  public long field_startTime;
  public String field_value;
  
  static
  {
    GMTrace.i(4137798336512L, 30829);
    eZt = new String[0];
    eZR = "abtestkey".hashCode();
    eZS = "value".hashCode();
    eZT = "expId".hashCode();
    eZU = "sequence".hashCode();
    eZV = "prioritylevel".hashCode();
    eZW = "startTime".hashCode();
    eZX = "endTime".hashCode();
    eZY = "noReport".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4137798336512L, 30829);
  }
  
  public c()
  {
    GMTrace.i(4137395683328L, 30826);
    this.eZJ = true;
    this.eZK = true;
    this.eZL = true;
    this.eZM = true;
    this.eZN = true;
    this.eZO = true;
    this.eZP = true;
    this.eZQ = true;
    GMTrace.o(4137395683328L, 30826);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4137529901056L, 30827);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4137529901056L, 30827);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (eZR == k)
      {
        this.field_abtestkey = paramCursor.getString(i);
        this.eZJ = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (eZS == k)
        {
          this.field_value = paramCursor.getString(i);
        }
        else if (eZT == k)
        {
          this.field_expId = paramCursor.getString(i);
        }
        else if (eZU == k)
        {
          this.field_sequence = paramCursor.getLong(i);
        }
        else if (eZV == k)
        {
          this.field_prioritylevel = paramCursor.getInt(i);
        }
        else if (eZW == k)
        {
          this.field_startTime = paramCursor.getLong(i);
        }
        else if (eZX == k)
        {
          this.field_endTime = paramCursor.getLong(i);
        }
        else
        {
          if (eZY == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_noReport = bool;
              break;
            }
          }
          if (eZC == k) {
            this.vmr = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(4137529901056L, 30827);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4137664118784L, 30828);
    ContentValues localContentValues = new ContentValues();
    if (this.eZJ) {
      localContentValues.put("abtestkey", this.field_abtestkey);
    }
    if (this.eZK) {
      localContentValues.put("value", this.field_value);
    }
    if (this.eZL) {
      localContentValues.put("expId", this.field_expId);
    }
    if (this.eZM) {
      localContentValues.put("sequence", Long.valueOf(this.field_sequence));
    }
    if (this.eZN) {
      localContentValues.put("prioritylevel", Integer.valueOf(this.field_prioritylevel));
    }
    if (this.eZO) {
      localContentValues.put("startTime", Long.valueOf(this.field_startTime));
    }
    if (this.eZP) {
      localContentValues.put("endTime", Long.valueOf(this.field_endTime));
    }
    if (this.eZQ) {
      localContentValues.put("noReport", Boolean.valueOf(this.field_noReport));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4137664118784L, 30828);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */