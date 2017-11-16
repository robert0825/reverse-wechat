package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class bj
  extends c
{
  private static final int eZC;
  private static final int eZS;
  public static final String[] eZt;
  private static final int fbM;
  private boolean eZK;
  private boolean fbL;
  public String field_key;
  public byte[] field_value;
  
  static
  {
    GMTrace.i(4151220109312L, 30929);
    eZt = new String[0];
    fbM = "key".hashCode();
    eZS = "value".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4151220109312L, 30929);
  }
  
  public bj()
  {
    GMTrace.i(4150817456128L, 30926);
    this.fbL = true;
    this.eZK = true;
    GMTrace.o(4150817456128L, 30926);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4150951673856L, 30927);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4150951673856L, 30927);
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
          this.field_value = paramCursor.getBlob(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4150951673856L, 30927);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4151085891584L, 30928);
    ContentValues localContentValues = new ContentValues();
    if (this.fbL) {
      localContentValues.put("key", this.field_key);
    }
    if (this.eZK) {
      localContentValues.put("value", this.field_value);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4151085891584L, 30928);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */