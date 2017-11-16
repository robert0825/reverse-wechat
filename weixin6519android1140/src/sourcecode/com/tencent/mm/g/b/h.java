package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class h
  extends c
{
  private static final int eZC;
  private static final int eZS;
  public static final String[] eZt;
  private static final int fbM;
  private boolean eZK;
  private boolean fbL;
  public String field_key;
  public String field_value;
  
  static
  {
    GMTrace.i(4164507664384L, 31028);
    eZt = new String[0];
    fbM = "key".hashCode();
    eZS = "value".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4164507664384L, 31028);
  }
  
  public h()
  {
    GMTrace.i(4164105011200L, 31025);
    this.fbL = true;
    this.eZK = true;
    GMTrace.o(4164105011200L, 31025);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4164239228928L, 31026);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4164239228928L, 31026);
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
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4164239228928L, 31026);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4164373446656L, 31027);
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
    GMTrace.o(4164373446656L, 31027);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */