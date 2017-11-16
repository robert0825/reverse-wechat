package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class be
  extends c
{
  private static final int eZC;
  private static final int eZS;
  public static final String[] eZt;
  private static final int fbM;
  private static final int fdt;
  private boolean eZK;
  private boolean fbL;
  private boolean fcX;
  public String field_key;
  public long field_modifyTime;
  public String field_value;
  
  static
  {
    GMTrace.i(4128000442368L, 30756);
    eZt = new String[0];
    fbM = "key".hashCode();
    eZS = "value".hashCode();
    fdt = "modifyTime".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4128000442368L, 30756);
  }
  
  public be()
  {
    GMTrace.i(4127597789184L, 30753);
    this.fbL = true;
    this.eZK = true;
    this.fcX = true;
    GMTrace.o(4127597789184L, 30753);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4127732006912L, 30754);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4127732006912L, 30754);
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
        if (eZS == k) {
          this.field_value = paramCursor.getString(i);
        } else if (fdt == k) {
          this.field_modifyTime = paramCursor.getLong(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4127732006912L, 30754);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4127866224640L, 30755);
    ContentValues localContentValues = new ContentValues();
    if (this.fbL) {
      localContentValues.put("key", this.field_key);
    }
    if (this.eZK) {
      localContentValues.put("value", this.field_value);
    }
    if (this.fcX) {
      localContentValues.put("modifyTime", Long.valueOf(this.field_modifyTime));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4127866224640L, 30755);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\g\b\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */