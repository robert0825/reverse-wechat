package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class bw
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int ftu;
  private static final int ftv;
  private static final int ftw;
  public long field_callTimeCount;
  public int field_countryCode;
  public long field_lastCallTime;
  private boolean ftr;
  private boolean fts;
  private boolean ftt;
  
  static
  {
    GMTrace.i(4144777658368L, 30881);
    eZt = new String[0];
    ftu = "countryCode".hashCode();
    ftv = "callTimeCount".hashCode();
    ftw = "lastCallTime".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4144777658368L, 30881);
  }
  
  public bw()
  {
    GMTrace.i(4144375005184L, 30878);
    this.ftr = true;
    this.fts = true;
    this.ftt = true;
    GMTrace.o(4144375005184L, 30878);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4144509222912L, 30879);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4144509222912L, 30879);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (ftu == k)
      {
        this.field_countryCode = paramCursor.getInt(i);
        this.ftr = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (ftv == k) {
          this.field_callTimeCount = paramCursor.getLong(i);
        } else if (ftw == k) {
          this.field_lastCallTime = paramCursor.getLong(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4144509222912L, 30879);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4144643440640L, 30880);
    ContentValues localContentValues = new ContentValues();
    if (this.ftr) {
      localContentValues.put("countryCode", Integer.valueOf(this.field_countryCode));
    }
    if (this.fts) {
      localContentValues.put("callTimeCount", Long.valueOf(this.field_callTimeCount));
    }
    if (this.ftt) {
      localContentValues.put("lastCallTime", Long.valueOf(this.field_lastCallTime));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4144643440640L, 30880);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\bw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */