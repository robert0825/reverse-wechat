package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class au
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fdt;
  private static final int fer;
  private static final int fmV;
  private static final int fmW;
  private static final int fmX;
  private static final int fmY;
  private static final int fmZ;
  private boolean fcX;
  private boolean fep;
  public int field_continuCount;
  public int field_flag;
  public long field_modifyTime;
  public String field_prodcutID;
  public long field_setFlagTime;
  public long field_showTipsTime;
  public int field_totalCount;
  private boolean fmQ;
  private boolean fmR;
  private boolean fmS;
  private boolean fmT;
  private boolean fmU;
  
  static
  {
    GMTrace.i(4119544725504L, 30693);
    eZt = new String[0];
    fmV = "prodcutID".hashCode();
    fmW = "totalCount".hashCode();
    fmX = "continuCount".hashCode();
    fer = "flag".hashCode();
    fdt = "modifyTime".hashCode();
    fmY = "showTipsTime".hashCode();
    fmZ = "setFlagTime".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4119544725504L, 30693);
  }
  
  public au()
  {
    GMTrace.i(4119142072320L, 30690);
    this.fmQ = true;
    this.fmR = true;
    this.fmS = true;
    this.fep = true;
    this.fcX = true;
    this.fmT = true;
    this.fmU = true;
    GMTrace.o(4119142072320L, 30690);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4119276290048L, 30691);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4119276290048L, 30691);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fmV == k)
      {
        this.field_prodcutID = paramCursor.getString(i);
        this.fmQ = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fmW == k) {
          this.field_totalCount = paramCursor.getInt(i);
        } else if (fmX == k) {
          this.field_continuCount = paramCursor.getInt(i);
        } else if (fer == k) {
          this.field_flag = paramCursor.getInt(i);
        } else if (fdt == k) {
          this.field_modifyTime = paramCursor.getLong(i);
        } else if (fmY == k) {
          this.field_showTipsTime = paramCursor.getLong(i);
        } else if (fmZ == k) {
          this.field_setFlagTime = paramCursor.getLong(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4119276290048L, 30691);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4119410507776L, 30692);
    ContentValues localContentValues = new ContentValues();
    if (this.fmQ) {
      localContentValues.put("prodcutID", this.field_prodcutID);
    }
    if (this.fmR) {
      localContentValues.put("totalCount", Integer.valueOf(this.field_totalCount));
    }
    if (this.fmS) {
      localContentValues.put("continuCount", Integer.valueOf(this.field_continuCount));
    }
    if (this.fep) {
      localContentValues.put("flag", Integer.valueOf(this.field_flag));
    }
    if (this.fcX) {
      localContentValues.put("modifyTime", Long.valueOf(this.field_modifyTime));
    }
    if (this.fmT) {
      localContentValues.put("showTipsTime", Long.valueOf(this.field_showTipsTime));
    }
    if (this.fmU) {
      localContentValues.put("setFlagTime", Long.valueOf(this.field_setFlagTime));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4119410507776L, 30692);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */