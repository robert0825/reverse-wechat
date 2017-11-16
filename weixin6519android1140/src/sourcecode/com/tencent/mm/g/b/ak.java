package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class ak
  extends c
{
  private static final int eZB;
  private static final int eZC;
  public static final String[] eZt;
  private static final int fkt;
  private boolean eZx;
  public long field_msgId;
  public String field_transferId;
  private boolean fks;
  
  static
  {
    GMTrace.i(4147998883840L, 30905);
    eZt = new String[0];
    eZB = "msgId".hashCode();
    fkt = "transferId".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4147998883840L, 30905);
  }
  
  public ak()
  {
    GMTrace.i(4147596230656L, 30902);
    this.eZx = true;
    this.fks = true;
    GMTrace.o(4147596230656L, 30902);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4147730448384L, 30903);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4147730448384L, 30903);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (eZB == k)
      {
        this.field_msgId = paramCursor.getLong(i);
        this.eZx = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fkt == k) {
          this.field_transferId = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4147730448384L, 30903);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4147864666112L, 30904);
    ContentValues localContentValues = new ContentValues();
    if (this.eZx) {
      localContentValues.put("msgId", Long.valueOf(this.field_msgId));
    }
    if (this.fks) {
      localContentValues.put("transferId", this.field_transferId);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4147864666112L, 30904);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\g\b\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */