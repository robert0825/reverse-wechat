package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class dj
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
  public String field_canvasId;
  public String field_canvasXml;
  public long field_createTime;
  
  static
  {
    GMTrace.i(20975278096384L, 156278);
    eZt = new String[0];
    fgH = "canvasId".hashCode();
    fgI = "canvasXml".hashCode();
    faG = "createTime".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(20975278096384L, 156278);
  }
  
  public dj()
  {
    GMTrace.i(20974875443200L, 156275);
    this.fgF = true;
    this.fgG = true;
    this.fak = true;
    GMTrace.o(20974875443200L, 156275);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(20975009660928L, 156276);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(20975009660928L, 156276);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fgH == k)
      {
        this.field_canvasId = paramCursor.getString(i);
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
    GMTrace.o(20975009660928L, 156276);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(20975143878656L, 156277);
    ContentValues localContentValues = new ContentValues();
    if (this.fgF) {
      localContentValues.put("canvasId", this.field_canvasId);
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
    GMTrace.o(20975143878656L, 156277);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\dj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */