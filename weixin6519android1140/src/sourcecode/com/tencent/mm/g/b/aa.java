package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class aa
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int faG;
  private static final int fgH;
  private static final int fgI;
  private boolean fak;
  private boolean fgF;
  private boolean fgG;
  public long field_canvasId;
  public String field_canvasXml;
  public long field_createTime;
  
  static
  {
    GMTrace.i(16688498081792L, 124339);
    eZt = new String[0];
    fgH = "canvasId".hashCode();
    fgI = "canvasXml".hashCode();
    faG = "createTime".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(16688498081792L, 124339);
  }
  
  public aa()
  {
    GMTrace.i(16688095428608L, 124336);
    this.fgF = true;
    this.fgG = true;
    this.fak = true;
    GMTrace.o(16688095428608L, 124336);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(16688229646336L, 124337);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(16688229646336L, 124337);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fgH == k)
      {
        this.field_canvasId = paramCursor.getLong(i);
        this.fgF = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fgI == k) {
          this.field_canvasXml = paramCursor.getString(i);
        } else if (faG == k) {
          this.field_createTime = paramCursor.getLong(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(16688229646336L, 124337);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(16688363864064L, 124338);
    ContentValues localContentValues = new ContentValues();
    if (this.fgF) {
      localContentValues.put("canvasId", Long.valueOf(this.field_canvasId));
    }
    if (this.fgG) {
      localContentValues.put("canvasXml", this.field_canvasXml);
    }
    if (this.fak) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(16688363864064L, 124338);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */