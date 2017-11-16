package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class dz
  extends c
{
  private static final int eZC;
  private static final int eZS;
  public static final String[] eZt;
  private static final int fHf;
  private static final int fbM;
  private static final int fbX;
  private static final int fbu;
  private boolean eZK;
  private boolean fHe;
  private boolean fbL;
  private boolean fbT;
  private boolean fbd;
  public String field_appId;
  public String field_domin;
  public String field_key;
  public int field_recordId;
  public String field_value;
  
  static
  {
    GMTrace.i(4172829163520L, 31090);
    eZt = new String[0];
    fbX = "recordId".hashCode();
    fbu = "appId".hashCode();
    fHf = "domin".hashCode();
    fbM = "key".hashCode();
    eZS = "value".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4172829163520L, 31090);
  }
  
  public dz()
  {
    GMTrace.i(4172426510336L, 31087);
    this.fbT = true;
    this.fbd = true;
    this.fHe = true;
    this.fbL = true;
    this.eZK = true;
    GMTrace.o(4172426510336L, 31087);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4172560728064L, 31088);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4172560728064L, 31088);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fbX == k)
      {
        this.field_recordId = paramCursor.getInt(i);
        this.fbT = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fbu == k) {
          this.field_appId = paramCursor.getString(i);
        } else if (fHf == k) {
          this.field_domin = paramCursor.getString(i);
        } else if (fbM == k) {
          this.field_key = paramCursor.getString(i);
        } else if (eZS == k) {
          this.field_value = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4172560728064L, 31088);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4172694945792L, 31089);
    ContentValues localContentValues = new ContentValues();
    if (this.fbT) {
      localContentValues.put("recordId", Integer.valueOf(this.field_recordId));
    }
    if (this.fbd) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.fHe) {
      localContentValues.put("domin", this.field_domin);
    }
    if (this.fbL) {
      localContentValues.put("key", this.field_key);
    }
    if (this.eZK) {
      localContentValues.put("value", this.field_value);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4172694945792L, 31089);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\dz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */