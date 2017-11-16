package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class d
  extends c
{
  private static final int eZC;
  private static final int eZT;
  private static final int eZU;
  private static final int eZV;
  private static final int eZW;
  private static final int eZX;
  public static final String[] eZt;
  private static final int fad;
  private static final int fae;
  private static final int faf;
  private static final int fag;
  private boolean eZL;
  private boolean eZM;
  private boolean eZN;
  private boolean eZO;
  private boolean eZP;
  private boolean eZZ;
  private boolean faa;
  private boolean fab;
  private boolean fac;
  public String field_business;
  public long field_endTime;
  public String field_expId;
  public String field_layerId;
  public boolean field_needReport;
  public int field_prioritylevel;
  public String field_rawXML;
  public long field_sequence;
  public long field_startTime;
  
  static
  {
    GMTrace.i(4132698062848L, 30791);
    eZt = new String[0];
    fad = "layerId".hashCode();
    fae = "business".hashCode();
    eZT = "expId".hashCode();
    eZU = "sequence".hashCode();
    eZV = "prioritylevel".hashCode();
    eZW = "startTime".hashCode();
    eZX = "endTime".hashCode();
    faf = "needReport".hashCode();
    fag = "rawXML".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4132698062848L, 30791);
  }
  
  public d()
  {
    GMTrace.i(4132295409664L, 30788);
    this.eZZ = true;
    this.faa = true;
    this.eZL = true;
    this.eZM = true;
    this.eZN = true;
    this.eZO = true;
    this.eZP = true;
    this.fab = true;
    this.fac = true;
    GMTrace.o(4132295409664L, 30788);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4132429627392L, 30789);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4132429627392L, 30789);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fad == k)
      {
        this.field_layerId = paramCursor.getString(i);
        this.eZZ = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fae == k)
        {
          this.field_business = paramCursor.getString(i);
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
          if (faf == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_needReport = bool;
              break;
            }
          }
          if (fag == k) {
            this.field_rawXML = paramCursor.getString(i);
          } else if (eZC == k) {
            this.vmr = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(4132429627392L, 30789);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4132563845120L, 30790);
    ContentValues localContentValues = new ContentValues();
    if (this.eZZ) {
      localContentValues.put("layerId", this.field_layerId);
    }
    if (this.faa) {
      localContentValues.put("business", this.field_business);
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
    if (this.fab) {
      localContentValues.put("needReport", Boolean.valueOf(this.field_needReport));
    }
    if (this.field_rawXML == null) {
      this.field_rawXML = "";
    }
    if (this.fac) {
      localContentValues.put("rawXML", this.field_rawXML);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4132563845120L, 30790);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */