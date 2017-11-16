package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class ck
  extends c
{
  private static final int eZB;
  private static final int eZC;
  public static final String[] eZt;
  private static final int fre;
  private static final int fyr;
  private boolean eZx;
  public String field_isRead;
  public String field_msgContentXml;
  public String field_msgId;
  private boolean fqV;
  private boolean fyq;
  
  static
  {
    GMTrace.i(4112968056832L, 30644);
    eZt = new String[0];
    eZB = "msgId".hashCode();
    fyr = "msgContentXml".hashCode();
    fre = "isRead".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4112968056832L, 30644);
  }
  
  public ck()
  {
    GMTrace.i(4112565403648L, 30641);
    this.eZx = true;
    this.fyq = true;
    this.fqV = true;
    GMTrace.o(4112565403648L, 30641);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4112699621376L, 30642);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4112699621376L, 30642);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (eZB == k)
      {
        this.field_msgId = paramCursor.getString(i);
        this.eZx = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fyr == k) {
          this.field_msgContentXml = paramCursor.getString(i);
        } else if (fre == k) {
          this.field_isRead = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4112699621376L, 30642);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4112833839104L, 30643);
    ContentValues localContentValues = new ContentValues();
    if (this.eZx) {
      localContentValues.put("msgId", this.field_msgId);
    }
    if (this.fyq) {
      localContentValues.put("msgContentXml", this.field_msgContentXml);
    }
    if (this.fqV) {
      localContentValues.put("isRead", this.field_isRead);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4112833839104L, 30643);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\ck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */