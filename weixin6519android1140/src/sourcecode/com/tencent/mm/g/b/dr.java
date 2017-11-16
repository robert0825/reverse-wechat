package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class dr
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fFI;
  private static final int fFJ;
  private static final int fFK;
  private static final int fFL;
  private boolean fFE;
  private boolean fFF;
  private boolean fFG;
  private boolean fFH;
  public int field_is_show;
  public String field_pref_key;
  public String field_pref_title;
  public String field_pref_url;
  
  static
  {
    GMTrace.i(4167863107584L, 31053);
    eZt = new String[0];
    fFI = "pref_key".hashCode();
    fFJ = "pref_title".hashCode();
    fFK = "pref_url".hashCode();
    fFL = "is_show".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4167863107584L, 31053);
  }
  
  public dr()
  {
    GMTrace.i(4167460454400L, 31050);
    this.fFE = true;
    this.fFF = true;
    this.fFG = true;
    this.fFH = true;
    GMTrace.o(4167460454400L, 31050);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4167594672128L, 31051);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4167594672128L, 31051);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fFI == k)
      {
        this.field_pref_key = paramCursor.getString(i);
        this.fFE = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fFJ == k) {
          this.field_pref_title = paramCursor.getString(i);
        } else if (fFK == k) {
          this.field_pref_url = paramCursor.getString(i);
        } else if (fFL == k) {
          this.field_is_show = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4167594672128L, 31051);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4167728889856L, 31052);
    ContentValues localContentValues = new ContentValues();
    if (this.fFE) {
      localContentValues.put("pref_key", this.field_pref_key);
    }
    if (this.fFF) {
      localContentValues.put("pref_title", this.field_pref_title);
    }
    if (this.fFG) {
      localContentValues.put("pref_url", this.field_pref_url);
    }
    if (this.fFH) {
      localContentValues.put("is_show", Integer.valueOf(this.field_is_show));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4167728889856L, 31052);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\dr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */