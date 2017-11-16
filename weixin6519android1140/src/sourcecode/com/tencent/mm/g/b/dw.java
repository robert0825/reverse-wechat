package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class dw
  extends c
{
  private static final int eZC;
  private static final int eZS;
  public static final String[] eZt;
  private static final int fGK;
  private static final int fGL;
  private static final int fbS;
  private static final int fbu;
  private static final int frc;
  private static final int frh;
  private boolean eZK;
  private boolean fGI;
  private boolean fGJ;
  private boolean fbP;
  private boolean fbd;
  public String field_appId;
  public String field_appIdKey;
  public long field_expireTime;
  public long field_size;
  public long field_timeStamp;
  public String field_value;
  public String field_weight;
  private boolean fqT;
  private boolean fqY;
  
  static
  {
    GMTrace.i(19250446073856L, 143427);
    eZt = new String[0];
    fbu = "appId".hashCode();
    fGK = "appIdKey".hashCode();
    eZS = "value".hashCode();
    frh = "weight".hashCode();
    frc = "expireTime".hashCode();
    fGL = "timeStamp".hashCode();
    fbS = "size".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(19250446073856L, 143427);
  }
  
  public dw()
  {
    GMTrace.i(19250043420672L, 143424);
    this.fbd = true;
    this.fGI = true;
    this.eZK = true;
    this.fqY = true;
    this.fqT = true;
    this.fGJ = true;
    this.fbP = true;
    GMTrace.o(19250043420672L, 143424);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(19250177638400L, 143425);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(19250177638400L, 143425);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fbu == k) {
        this.field_appId = paramCursor.getString(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fGK == k)
        {
          this.field_appIdKey = paramCursor.getString(i);
          this.fGI = true;
        }
        else if (eZS == k)
        {
          this.field_value = paramCursor.getString(i);
        }
        else if (frh == k)
        {
          this.field_weight = paramCursor.getString(i);
        }
        else if (frc == k)
        {
          this.field_expireTime = paramCursor.getLong(i);
        }
        else if (fGL == k)
        {
          this.field_timeStamp = paramCursor.getLong(i);
        }
        else if (fbS == k)
        {
          this.field_size = paramCursor.getLong(i);
        }
        else if (eZC == k)
        {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(19250177638400L, 143425);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(19250311856128L, 143426);
    ContentValues localContentValues = new ContentValues();
    if (this.fbd) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.fGI) {
      localContentValues.put("appIdKey", this.field_appIdKey);
    }
    if (this.eZK) {
      localContentValues.put("value", this.field_value);
    }
    if (this.fqY) {
      localContentValues.put("weight", this.field_weight);
    }
    if (this.fqT) {
      localContentValues.put("expireTime", Long.valueOf(this.field_expireTime));
    }
    if (this.fGJ) {
      localContentValues.put("timeStamp", Long.valueOf(this.field_timeStamp));
    }
    if (this.fbP) {
      localContentValues.put("size", Long.valueOf(this.field_size));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(19250311856128L, 143426);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\dw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */