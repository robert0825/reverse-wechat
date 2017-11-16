package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class ac
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fhB;
  private static final int fhC;
  private static final int fhD;
  private static final int fhE;
  private static final int fhF;
  private static final int fhG;
  private static final int fhf;
  private boolean fgM;
  private boolean fhA;
  private boolean fhv;
  private boolean fhw;
  private boolean fhx;
  private boolean fhy;
  private boolean fhz;
  public String field_card_id;
  public int field_expire_time_interval;
  public long field_fetch_time;
  public int field_lower_bound;
  public boolean field_need_insert_show_timestamp;
  public int field_show_expire_interval;
  public String field_show_timestamp_encrypt_key;
  
  static
  {
    GMTrace.i(18824841658368L, 140256);
    eZt = new String[0];
    fhf = "card_id".hashCode();
    fhB = "lower_bound".hashCode();
    fhC = "need_insert_show_timestamp".hashCode();
    fhD = "show_timestamp_encrypt_key".hashCode();
    fhE = "expire_time_interval".hashCode();
    fhF = "show_expire_interval".hashCode();
    fhG = "fetch_time".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(18824841658368L, 140256);
  }
  
  public ac()
  {
    GMTrace.i(18824439005184L, 140253);
    this.fgM = true;
    this.fhv = true;
    this.fhw = true;
    this.fhx = true;
    this.fhy = true;
    this.fhz = true;
    this.fhA = true;
    GMTrace.o(18824439005184L, 140253);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(18824573222912L, 140254);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(18824573222912L, 140254);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
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
        if (fhB == k)
        {
          this.field_lower_bound = paramCursor.getInt(i);
        }
        else
        {
          if (fhC == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_need_insert_show_timestamp = bool;
              break;
            }
          }
          if (fhD == k) {
            this.field_show_timestamp_encrypt_key = paramCursor.getString(i);
          } else if (fhE == k) {
            this.field_expire_time_interval = paramCursor.getInt(i);
          } else if (fhF == k) {
            this.field_show_expire_interval = paramCursor.getInt(i);
          } else if (fhG == k) {
            this.field_fetch_time = paramCursor.getLong(i);
          } else if (eZC == k) {
            this.vmr = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(18824573222912L, 140254);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(18824707440640L, 140255);
    ContentValues localContentValues = new ContentValues();
    if (this.fgM) {
      localContentValues.put("card_id", this.field_card_id);
    }
    if (this.fhv) {
      localContentValues.put("lower_bound", Integer.valueOf(this.field_lower_bound));
    }
    if (this.fhw) {
      localContentValues.put("need_insert_show_timestamp", Boolean.valueOf(this.field_need_insert_show_timestamp));
    }
    if (this.fhx) {
      localContentValues.put("show_timestamp_encrypt_key", this.field_show_timestamp_encrypt_key);
    }
    if (this.fhy) {
      localContentValues.put("expire_time_interval", Integer.valueOf(this.field_expire_time_interval));
    }
    if (this.fhz) {
      localContentValues.put("show_expire_interval", Integer.valueOf(this.field_show_expire_interval));
    }
    if (this.fhA) {
      localContentValues.put("fetch_time", Long.valueOf(this.field_fetch_time));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(18824707440640L, 140255);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */