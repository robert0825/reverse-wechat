package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class b
  extends c
{
  private static final int eZC;
  private static final int eZG;
  private static final int eZH;
  private static final int eZI;
  public static final String[] eZt;
  private static final int eZz;
  private boolean eZD;
  private boolean eZE;
  private boolean eZF;
  private boolean eZv;
  public String field_billNo;
  public boolean field_insertmsg;
  public long field_localMsgId;
  public int field_status;
  
  static
  {
    GMTrace.i(4125316087808L, 30736);
    eZt = new String[0];
    eZG = "billNo".hashCode();
    eZz = "insertmsg".hashCode();
    eZH = "localMsgId".hashCode();
    eZI = "status".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4125316087808L, 30736);
  }
  
  public b()
  {
    GMTrace.i(4124913434624L, 30733);
    this.eZD = true;
    this.eZv = true;
    this.eZE = true;
    this.eZF = true;
    GMTrace.o(4124913434624L, 30733);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4125047652352L, 30734);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4125047652352L, 30734);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (eZG == k)
      {
        this.field_billNo = paramCursor.getString(i);
        this.eZD = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (eZz == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (boolean bool = true;; bool = false)
          {
            this.field_insertmsg = bool;
            break;
          }
        }
        if (eZH == k) {
          this.field_localMsgId = paramCursor.getLong(i);
        } else if (eZI == k) {
          this.field_status = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4125047652352L, 30734);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4125181870080L, 30735);
    ContentValues localContentValues = new ContentValues();
    if (this.eZD) {
      localContentValues.put("billNo", this.field_billNo);
    }
    if (this.eZv) {
      localContentValues.put("insertmsg", Boolean.valueOf(this.field_insertmsg));
    }
    if (this.eZE) {
      localContentValues.put("localMsgId", Long.valueOf(this.field_localMsgId));
    }
    if (this.eZF) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4125181870080L, 30735);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */