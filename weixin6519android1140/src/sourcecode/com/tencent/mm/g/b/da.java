package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class da
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fBF;
  private static final int fbM;
  private boolean fBy;
  private boolean fbL;
  public String field_key;
  public int field_position;
  
  static
  {
    GMTrace.i(4145314529280L, 30885);
    eZt = new String[0];
    fbM = "key".hashCode();
    fBF = "position".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4145314529280L, 30885);
  }
  
  public da()
  {
    GMTrace.i(4144911876096L, 30882);
    this.fbL = true;
    this.fBy = true;
    GMTrace.o(4144911876096L, 30882);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4145046093824L, 30883);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4145046093824L, 30883);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fbM == k)
      {
        this.field_key = paramCursor.getString(i);
        this.fbL = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fBF == k) {
          this.field_position = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4145046093824L, 30883);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4145180311552L, 30884);
    ContentValues localContentValues = new ContentValues();
    if (this.fbL) {
      localContentValues.put("key", this.field_key);
    }
    if (this.fBy) {
      localContentValues.put("position", Integer.valueOf(this.field_position));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4145180311552L, 30884);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\da.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */