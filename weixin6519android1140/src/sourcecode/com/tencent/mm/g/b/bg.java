package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class bg
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int faG;
  private static final int fkB;
  private static final int fqr;
  private static final int fqs;
  private boolean fak;
  public long field_createTime;
  public String field_id;
  public String field_logContent;
  public int field_protocolNumber;
  private boolean fky;
  private boolean fqp;
  private boolean fqq;
  
  static
  {
    GMTrace.i(4120618467328L, 30701);
    eZt = new String[0];
    fkB = "id".hashCode();
    fqr = "protocolNumber".hashCode();
    fqs = "logContent".hashCode();
    faG = "createTime".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4120618467328L, 30701);
  }
  
  public bg()
  {
    GMTrace.i(4120215814144L, 30698);
    this.fky = true;
    this.fqp = true;
    this.fqq = true;
    this.fak = true;
    GMTrace.o(4120215814144L, 30698);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4120350031872L, 30699);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4120350031872L, 30699);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fkB == k)
      {
        this.field_id = paramCursor.getString(i);
        this.fky = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fqr == k) {
          this.field_protocolNumber = paramCursor.getInt(i);
        } else if (fqs == k) {
          this.field_logContent = paramCursor.getString(i);
        } else if (faG == k) {
          this.field_createTime = paramCursor.getLong(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4120350031872L, 30699);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4120484249600L, 30700);
    ContentValues localContentValues = new ContentValues();
    if (this.fky) {
      localContentValues.put("id", this.field_id);
    }
    if (this.fqp) {
      localContentValues.put("protocolNumber", Integer.valueOf(this.field_protocolNumber));
    }
    if (this.fqq) {
      localContentValues.put("logContent", this.field_logContent);
    }
    if (this.fak) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4120484249600L, 30700);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\g\b\bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */