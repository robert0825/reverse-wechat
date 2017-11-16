package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class cq
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int ffa;
  private static final int fkt;
  private static final int fyQ;
  private static final int fyR;
  private boolean feM;
  public boolean field_isSend;
  public long field_locaMsgId;
  public int field_receiveStatus;
  public String field_transferId;
  private boolean fks;
  private boolean fyO;
  private boolean fyP;
  
  static
  {
    GMTrace.i(17943433838592L, 133689);
    eZt = new String[0];
    fkt = "transferId".hashCode();
    fyQ = "locaMsgId".hashCode();
    fyR = "receiveStatus".hashCode();
    ffa = "isSend".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(17943433838592L, 133689);
  }
  
  public cq()
  {
    GMTrace.i(17943031185408L, 133686);
    this.fks = true;
    this.fyO = true;
    this.fyP = true;
    this.feM = true;
    GMTrace.o(17943031185408L, 133686);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(17943165403136L, 133687);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(17943165403136L, 133687);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fkt == k)
      {
        this.field_transferId = paramCursor.getString(i);
        this.fks = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fyQ == k)
        {
          this.field_locaMsgId = paramCursor.getLong(i);
        }
        else if (fyR == k)
        {
          this.field_receiveStatus = paramCursor.getInt(i);
        }
        else
        {
          if (ffa == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_isSend = bool;
              break;
            }
          }
          if (eZC == k) {
            this.vmr = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(17943165403136L, 133687);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(17943299620864L, 133688);
    ContentValues localContentValues = new ContentValues();
    if (this.fks) {
      localContentValues.put("transferId", this.field_transferId);
    }
    if (this.fyO) {
      localContentValues.put("locaMsgId", Long.valueOf(this.field_locaMsgId));
    }
    if (this.fyP) {
      localContentValues.put("receiveStatus", Integer.valueOf(this.field_receiveStatus));
    }
    if (this.feM) {
      localContentValues.put("isSend", Boolean.valueOf(this.field_isSend));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(17943299620864L, 133688);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\g\b\cq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */