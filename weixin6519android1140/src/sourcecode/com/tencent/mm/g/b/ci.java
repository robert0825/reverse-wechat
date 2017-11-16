package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class ci
  extends c
{
  private static final int eZC;
  private static final int eZI;
  public static final String[] eZt;
  private static final int fyh;
  private static final int fyi;
  private static final int fyj;
  private boolean eZF;
  public String field_ack_key;
  public long field_receive_time;
  public String field_reqkey;
  public int field_status;
  private boolean fye;
  private boolean fyf;
  private boolean fyg;
  
  static
  {
    GMTrace.i(15355044954112L, 114404);
    eZt = new String[0];
    fyh = "reqkey".hashCode();
    fyi = "ack_key".hashCode();
    eZI = "status".hashCode();
    fyj = "receive_time".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(15355044954112L, 114404);
  }
  
  public ci()
  {
    GMTrace.i(15354642300928L, 114401);
    this.fye = true;
    this.fyf = true;
    this.eZF = true;
    this.fyg = true;
    GMTrace.o(15354642300928L, 114401);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(15354776518656L, 114402);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(15354776518656L, 114402);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fyh == k)
      {
        this.field_reqkey = paramCursor.getString(i);
        this.fye = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fyi == k) {
          this.field_ack_key = paramCursor.getString(i);
        } else if (eZI == k) {
          this.field_status = paramCursor.getInt(i);
        } else if (fyj == k) {
          this.field_receive_time = paramCursor.getLong(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(15354776518656L, 114402);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(15354910736384L, 114403);
    ContentValues localContentValues = new ContentValues();
    if (this.fye) {
      localContentValues.put("reqkey", this.field_reqkey);
    }
    if (this.fyf) {
      localContentValues.put("ack_key", this.field_ack_key);
    }
    if (this.eZF) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.fyg) {
      localContentValues.put("receive_time", Long.valueOf(this.field_receive_time));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(15354910736384L, 114403);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\ci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */