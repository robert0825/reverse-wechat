package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class dx
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fGN;
  private static final int frc;
  private boolean fGM;
  public long field_expireTime;
  public String field_host;
  private boolean fqT;
  
  static
  {
    GMTrace.i(4128537313280L, 30760);
    eZt = new String[0];
    fGN = "host".hashCode();
    frc = "expireTime".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4128537313280L, 30760);
  }
  
  public dx()
  {
    GMTrace.i(4128134660096L, 30757);
    this.fGM = true;
    this.fqT = true;
    GMTrace.o(4128134660096L, 30757);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4128268877824L, 30758);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4128268877824L, 30758);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fGN == k) {
        this.field_host = paramCursor.getString(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (frc == k) {
          this.field_expireTime = paramCursor.getLong(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4128268877824L, 30758);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4128403095552L, 30759);
    ContentValues localContentValues = new ContentValues();
    if (this.fGM) {
      localContentValues.put("host", this.field_host);
    }
    if (this.fqT) {
      localContentValues.put("expireTime", Long.valueOf(this.field_expireTime));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4128403095552L, 30759);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\dx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */