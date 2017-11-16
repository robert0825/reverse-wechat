package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class al
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fkw;
  private static final int fkx;
  public int field_bakLogId;
  public String field_valueStr;
  private boolean fku;
  private boolean fkv;
  
  static
  {
    GMTrace.i(13104079437824L, 97633);
    eZt = new String[0];
    fkw = "bakLogId".hashCode();
    fkx = "valueStr".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(13104079437824L, 97633);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(13103811002368L, 97631);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(13103811002368L, 97631);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fkw == k) {
        this.field_bakLogId = paramCursor.getInt(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fkx == k) {
          this.field_valueStr = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(13103811002368L, 97631);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(13103945220096L, 97632);
    ContentValues localContentValues = new ContentValues();
    if (this.fku) {
      localContentValues.put("bakLogId", Integer.valueOf(this.field_bakLogId));
    }
    if (this.fkv) {
      localContentValues.put("valueStr", this.field_valueStr);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(13103945220096L, 97632);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */