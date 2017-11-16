package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class at
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int faO;
  private static final int fle;
  private boolean fas;
  public byte[] field_content;
  public String field_productID;
  private boolean fkE;
  
  static
  {
    GMTrace.i(4111223226368L, 30631);
    eZt = new String[0];
    fle = "productID".hashCode();
    faO = "content".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4111223226368L, 30631);
  }
  
  public at()
  {
    GMTrace.i(4110820573184L, 30628);
    this.fkE = true;
    this.fas = true;
    GMTrace.o(4110820573184L, 30628);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4110954790912L, 30629);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4110954790912L, 30629);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fle == k)
      {
        this.field_productID = paramCursor.getString(i);
        this.fkE = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (faO == k) {
          this.field_content = paramCursor.getBlob(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4110954790912L, 30629);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4111089008640L, 30630);
    ContentValues localContentValues = new ContentValues();
    if (this.fkE) {
      localContentValues.put("productID", this.field_productID);
    }
    if (this.fas) {
      localContentValues.put("content", this.field_content);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4111089008640L, 30630);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */