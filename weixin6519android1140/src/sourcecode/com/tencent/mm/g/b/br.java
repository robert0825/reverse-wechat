package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class br
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fem;
  private static final int fsT;
  private static final int fsW;
  private boolean fei;
  public String field_appusername;
  public int field_score;
  public String field_title;
  private boolean fsQ;
  private boolean fsV;
  
  static
  {
    GMTrace.i(4156051947520L, 30965);
    eZt = new String[0];
    fsT = "appusername".hashCode();
    fem = "title".hashCode();
    fsW = "score".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4156051947520L, 30965);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4155783512064L, 30963);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4155783512064L, 30963);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fsT == k) {
        this.field_appusername = paramCursor.getString(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fem == k) {
          this.field_title = paramCursor.getString(i);
        } else if (fsW == k) {
          this.field_score = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4155783512064L, 30963);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4155917729792L, 30964);
    ContentValues localContentValues = new ContentValues();
    if (this.fsQ) {
      localContentValues.put("appusername", this.field_appusername);
    }
    if (this.fei) {
      localContentValues.put("title", this.field_title);
    }
    if (this.fsV) {
      localContentValues.put("score", Integer.valueOf(this.field_score));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4155917729792L, 30964);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\g\b\br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */