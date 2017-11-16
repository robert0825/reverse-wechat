package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class bs
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fcc;
  private static final int flr;
  private static final int fsS;
  private static final int fsT;
  private static final int fsY;
  private boolean fcb;
  public String field_appusername;
  public String field_rankID;
  public int field_sort;
  public int field_step;
  public String field_username;
  private boolean fkR;
  private boolean fsP;
  private boolean fsQ;
  private boolean fsX;
  
  static
  {
    GMTrace.i(4133503369216L, 30797);
    eZt = new String[0];
    fsT = "appusername".hashCode();
    fsS = "rankID".hashCode();
    fcc = "username".hashCode();
    fsY = "step".hashCode();
    flr = "sort".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4133503369216L, 30797);
  }
  
  public bs()
  {
    GMTrace.i(4133100716032L, 30794);
    this.fsQ = true;
    this.fsP = true;
    this.fcb = true;
    this.fsX = true;
    this.fkR = true;
    GMTrace.o(4133100716032L, 30794);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4133234933760L, 30795);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4133234933760L, 30795);
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
        if (fsS == k) {
          this.field_rankID = paramCursor.getString(i);
        } else if (fcc == k) {
          this.field_username = paramCursor.getString(i);
        } else if (fsY == k) {
          this.field_step = paramCursor.getInt(i);
        } else if (flr == k) {
          this.field_sort = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4133234933760L, 30795);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4133369151488L, 30796);
    ContentValues localContentValues = new ContentValues();
    if (this.fsQ) {
      localContentValues.put("appusername", this.field_appusername);
    }
    if (this.fsP) {
      localContentValues.put("rankID", this.field_rankID);
    }
    if (this.fcb) {
      localContentValues.put("username", this.field_username);
    }
    if (this.fsX) {
      localContentValues.put("step", Integer.valueOf(this.field_step));
    }
    if (this.fkR) {
      localContentValues.put("sort", Integer.valueOf(this.field_sort));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4133369151488L, 30796);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\g\b\bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */