package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class i
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fbM;
  private static final int fbQ;
  private static final int fbR;
  private static final int fbS;
  private boolean fbL;
  private boolean fbN;
  private boolean fbO;
  private boolean fbP;
  public String field_data;
  public String field_dataType;
  public String field_key;
  public int field_size;
  
  static
  {
    GMTrace.i(4119007854592L, 30689);
    eZt = new String[0];
    fbM = "key".hashCode();
    fbQ = "data".hashCode();
    fbR = "dataType".hashCode();
    fbS = "size".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4119007854592L, 30689);
  }
  
  public i()
  {
    GMTrace.i(4118605201408L, 30686);
    this.fbL = true;
    this.fbN = true;
    this.fbO = true;
    this.fbP = true;
    GMTrace.o(4118605201408L, 30686);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4118739419136L, 30687);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4118739419136L, 30687);
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
        if (fbQ == k) {
          this.field_data = paramCursor.getString(i);
        } else if (fbR == k) {
          this.field_dataType = paramCursor.getString(i);
        } else if (fbS == k) {
          this.field_size = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4118739419136L, 30687);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4118873636864L, 30688);
    ContentValues localContentValues = new ContentValues();
    if (this.fbL) {
      localContentValues.put("key", this.field_key);
    }
    if (this.fbN) {
      localContentValues.put("data", this.field_data);
    }
    if (this.fbO) {
      localContentValues.put("dataType", this.field_dataType);
    }
    if (this.fbP) {
      localContentValues.put("size", Integer.valueOf(this.field_size));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4118873636864L, 30688);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */