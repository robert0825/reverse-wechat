package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class s
  extends c
{
  private static final int eZC;
  private static final int eZW;
  private static final int eZX;
  public static final String[] eZt;
  private static final int fex;
  private boolean eZO;
  private boolean eZP;
  private boolean feu;
  public long field_endTime;
  public String field_sessionName;
  public long field_startTime;
  
  static
  {
    GMTrace.i(17945044451328L, 133701);
    eZt = new String[0];
    fex = "sessionName".hashCode();
    eZW = "startTime".hashCode();
    eZX = "endTime".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(17945044451328L, 133701);
  }
  
  public s()
  {
    GMTrace.i(17944641798144L, 133698);
    this.feu = true;
    this.eZO = true;
    this.eZP = true;
    GMTrace.o(17944641798144L, 133698);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(17944776015872L, 133699);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(17944776015872L, 133699);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fex == k) {
        this.field_sessionName = paramCursor.getString(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (eZW == k) {
          this.field_startTime = paramCursor.getLong(i);
        } else if (eZX == k) {
          this.field_endTime = paramCursor.getLong(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(17944776015872L, 133699);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(17944910233600L, 133700);
    ContentValues localContentValues = new ContentValues();
    if (this.field_sessionName == null) {
      this.field_sessionName = "";
    }
    if (this.feu) {
      localContentValues.put("sessionName", this.field_sessionName);
    }
    if (this.eZO) {
      localContentValues.put("startTime", Long.valueOf(this.field_startTime));
    }
    if (this.eZP) {
      localContentValues.put("endTime", Long.valueOf(this.field_endTime));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(17944910233600L, 133700);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */