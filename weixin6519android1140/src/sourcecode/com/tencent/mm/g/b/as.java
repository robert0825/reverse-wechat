package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class as
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int faO;
  private static final int fle;
  private static final int fmP;
  private boolean fas;
  public byte[] field_content;
  public String field_lan;
  public String field_productID;
  private boolean fkE;
  private boolean fmO;
  
  static
  {
    GMTrace.i(4173366034432L, 31094);
    eZt = new String[0];
    fle = "productID".hashCode();
    faO = "content".hashCode();
    fmP = "lan".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4173366034432L, 31094);
  }
  
  public as()
  {
    GMTrace.i(4172963381248L, 31091);
    this.fkE = true;
    this.fas = true;
    this.fmO = true;
    GMTrace.o(4172963381248L, 31091);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4173097598976L, 31092);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4173097598976L, 31092);
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
        } else if (fmP == k) {
          this.field_lan = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4173097598976L, 31092);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4173231816704L, 31093);
    ContentValues localContentValues = new ContentValues();
    if (this.fkE) {
      localContentValues.put("productID", this.field_productID);
    }
    if (this.fas) {
      localContentValues.put("content", this.field_content);
    }
    if (this.field_lan == null) {
      this.field_lan = "";
    }
    if (this.fmO) {
      localContentValues.put("lan", this.field_lan);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4173231816704L, 31093);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */