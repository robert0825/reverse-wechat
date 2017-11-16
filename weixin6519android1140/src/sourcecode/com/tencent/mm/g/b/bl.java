package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class bl
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int frl;
  private static final int frm;
  public byte[] field_cache;
  public String field_reqType;
  private boolean frj;
  private boolean frk;
  
  static
  {
    GMTrace.i(4173902905344L, 31098);
    eZt = new String[0];
    frl = "reqType".hashCode();
    frm = "cache".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4173902905344L, 31098);
  }
  
  public bl()
  {
    GMTrace.i(4173500252160L, 31095);
    this.frj = true;
    this.frk = true;
    GMTrace.o(4173500252160L, 31095);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4173634469888L, 31096);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4173634469888L, 31096);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (frl == k)
      {
        this.field_reqType = paramCursor.getString(i);
        this.frj = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (frm == k) {
          this.field_cache = paramCursor.getBlob(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4173634469888L, 31096);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4173768687616L, 31097);
    ContentValues localContentValues = new ContentValues();
    if (this.frj) {
      localContentValues.put("reqType", this.field_reqType);
    }
    if (this.frk) {
      localContentValues.put("cache", this.field_cache);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4173768687616L, 31097);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\bl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */