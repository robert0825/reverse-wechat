package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class ai
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fjQ;
  private static final int fjR;
  public String field_contactName;
  public String field_labelId;
  private boolean fjO;
  private boolean fjP;
  
  static
  {
    GMTrace.i(4132161191936L, 30787);
    eZt = new String[0];
    fjQ = "labelId".hashCode();
    fjR = "contactName".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4132161191936L, 30787);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4131892756480L, 30785);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4131892756480L, 30785);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fjQ == k) {
        this.field_labelId = paramCursor.getString(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fjR == k) {
          this.field_contactName = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4131892756480L, 30785);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4132026974208L, 30786);
    ContentValues localContentValues = new ContentValues();
    if (this.fjO) {
      localContentValues.put("labelId", this.field_labelId);
    }
    if (this.fjP) {
      localContentValues.put("contactName", this.field_contactName);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4132026974208L, 30786);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\g\b\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */