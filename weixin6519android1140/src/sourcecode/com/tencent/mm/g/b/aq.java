package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class aq
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fmH;
  private static final int fmL;
  public String field_desc;
  public String field_groupID;
  private boolean fmD;
  private boolean fmK;
  
  static
  {
    GMTrace.i(4127463571456L, 30752);
    eZt = new String[0];
    fmL = "groupID".hashCode();
    fmH = "desc".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4127463571456L, 30752);
  }
  
  public aq()
  {
    GMTrace.i(4127060918272L, 30749);
    this.fmK = true;
    this.fmD = true;
    GMTrace.o(4127060918272L, 30749);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4127195136000L, 30750);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4127195136000L, 30750);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fmL == k) {
        this.field_groupID = paramCursor.getString(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fmH == k) {
          this.field_desc = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4127195136000L, 30750);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4127329353728L, 30751);
    ContentValues localContentValues = new ContentValues();
    if (this.fmK) {
      localContentValues.put("groupID", this.field_groupID);
    }
    if (this.fmD) {
      localContentValues.put("desc", this.field_desc);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4127329353728L, 30751);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */