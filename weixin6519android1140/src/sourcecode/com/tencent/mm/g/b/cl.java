package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class cl
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fyu;
  private static final int fyv;
  public String field_cardUserId;
  public int field_retryCount;
  private boolean fys;
  private boolean fyt;
  
  static
  {
    GMTrace.i(4146925142016L, 30897);
    eZt = new String[0];
    fyu = "cardUserId".hashCode();
    fyv = "retryCount".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4146925142016L, 30897);
  }
  
  public cl()
  {
    GMTrace.i(4146522488832L, 30894);
    this.fys = true;
    this.fyt = true;
    GMTrace.o(4146522488832L, 30894);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4146656706560L, 30895);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4146656706560L, 30895);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fyu == k)
      {
        this.field_cardUserId = paramCursor.getString(i);
        this.fys = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fyv == k) {
          this.field_retryCount = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4146656706560L, 30895);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4146790924288L, 30896);
    ContentValues localContentValues = new ContentValues();
    if (this.fys) {
      localContentValues.put("cardUserId", this.field_cardUserId);
    }
    if (this.fyt) {
      localContentValues.put("retryCount", Integer.valueOf(this.field_retryCount));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4146790924288L, 30896);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\cl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */