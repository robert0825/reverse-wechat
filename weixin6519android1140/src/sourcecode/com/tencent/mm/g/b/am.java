package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class am
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fbQ;
  private static final int fbu;
  private static final int fca;
  private static final int fkB;
  private static final int fkC;
  private static final int fkD;
  private boolean fbN;
  private boolean fbW;
  private boolean fbd;
  public String field_appId;
  public String field_cacheKey;
  public String field_data;
  public String field_id;
  public int field_interval;
  public long field_updateTime;
  private boolean fkA;
  private boolean fky;
  private boolean fkz;
  
  static
  {
    GMTrace.i(17763313647616L, 132347);
    eZt = new String[0];
    fkB = "id".hashCode();
    fkC = "cacheKey".hashCode();
    fbu = "appId".hashCode();
    fbQ = "data".hashCode();
    fkD = "interval".hashCode();
    fca = "updateTime".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(17763313647616L, 132347);
  }
  
  public am()
  {
    GMTrace.i(17762910994432L, 132344);
    this.fky = true;
    this.fkz = true;
    this.fbd = true;
    this.fbN = true;
    this.fkA = true;
    this.fbW = true;
    GMTrace.o(17762910994432L, 132344);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(17763045212160L, 132345);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(17763045212160L, 132345);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fkB == k) {
        this.field_id = paramCursor.getString(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fkC == k) {
          this.field_cacheKey = paramCursor.getString(i);
        } else if (fbu == k) {
          this.field_appId = paramCursor.getString(i);
        } else if (fbQ == k) {
          this.field_data = paramCursor.getString(i);
        } else if (fkD == k) {
          this.field_interval = paramCursor.getInt(i);
        } else if (fca == k) {
          this.field_updateTime = paramCursor.getLong(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(17763045212160L, 132345);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(17763179429888L, 132346);
    ContentValues localContentValues = new ContentValues();
    if (this.fky) {
      localContentValues.put("id", this.field_id);
    }
    if (this.fkz) {
      localContentValues.put("cacheKey", this.field_cacheKey);
    }
    if (this.fbd) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.fbN) {
      localContentValues.put("data", this.field_data);
    }
    if (this.fkA) {
      localContentValues.put("interval", Integer.valueOf(this.field_interval));
    }
    if (this.fbW) {
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(17763179429888L, 132346);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */