package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class v
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int feQ;
  private static final int ffC;
  private boolean feC;
  private boolean ffB;
  public String field_brandUserName;
  public String field_userId;
  
  static
  {
    GMTrace.i(4139677384704L, 30843);
    eZt = new String[0];
    feQ = "brandUserName".hashCode();
    ffC = "userId".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4139677384704L, 30843);
  }
  
  public v()
  {
    GMTrace.i(4139274731520L, 30840);
    this.feC = true;
    this.ffB = true;
    GMTrace.o(4139274731520L, 30840);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4139408949248L, 30841);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4139408949248L, 30841);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (feQ == k)
      {
        this.field_brandUserName = paramCursor.getString(i);
        this.feC = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (ffC == k) {
          this.field_userId = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4139408949248L, 30841);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4139543166976L, 30842);
    ContentValues localContentValues = new ContentValues();
    if (this.feC) {
      localContentValues.put("brandUserName", this.field_brandUserName);
    }
    if (this.ffB) {
      localContentValues.put("userId", this.field_userId);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4139543166976L, 30842);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */