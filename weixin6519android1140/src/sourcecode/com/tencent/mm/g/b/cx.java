package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class cx
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fBf;
  private static final int fBg;
  private static final int fBh;
  private static final int fhf;
  private static final int fyv;
  private boolean fBc;
  private boolean fBd;
  private boolean fBe;
  private boolean fgM;
  public String field_card_id;
  public int field_retryCount;
  public long field_seq;
  public int field_state_flag;
  public long field_update_time;
  private boolean fyt;
  
  static
  {
    GMTrace.i(4144240787456L, 30877);
    eZt = new String[0];
    fhf = "card_id".hashCode();
    fBf = "state_flag".hashCode();
    fBg = "update_time".hashCode();
    fBh = "seq".hashCode();
    fyv = "retryCount".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4144240787456L, 30877);
  }
  
  public cx()
  {
    GMTrace.i(4143838134272L, 30874);
    this.fgM = true;
    this.fBc = true;
    this.fBd = true;
    this.fBe = true;
    this.fyt = true;
    GMTrace.o(4143838134272L, 30874);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4143972352000L, 30875);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4143972352000L, 30875);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fhf == k)
      {
        this.field_card_id = paramCursor.getString(i);
        this.fgM = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fBf == k) {
          this.field_state_flag = paramCursor.getInt(i);
        } else if (fBg == k) {
          this.field_update_time = paramCursor.getLong(i);
        } else if (fBh == k) {
          this.field_seq = paramCursor.getLong(i);
        } else if (fyv == k) {
          this.field_retryCount = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4143972352000L, 30875);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4144106569728L, 30876);
    ContentValues localContentValues = new ContentValues();
    if (this.fgM) {
      localContentValues.put("card_id", this.field_card_id);
    }
    if (this.fBc) {
      localContentValues.put("state_flag", Integer.valueOf(this.field_state_flag));
    }
    if (this.fBd) {
      localContentValues.put("update_time", Long.valueOf(this.field_update_time));
    }
    if (this.fBe) {
      localContentValues.put("seq", Long.valueOf(this.field_seq));
    }
    if (this.fyt) {
      localContentValues.put("retryCount", Integer.valueOf(this.field_retryCount));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4144106569728L, 30876);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\cx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */