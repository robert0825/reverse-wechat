package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class p
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fbu;
  private static final int fer;
  private static final int fes;
  private boolean fbd;
  private boolean fep;
  private boolean feq;
  public String field_appId;
  public long field_flag;
  public int field_sortId;
  
  static
  {
    GMTrace.i(4116860370944L, 30673);
    eZt = new String[0];
    fer = "flag".hashCode();
    fbu = "appId".hashCode();
    fes = "sortId".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4116860370944L, 30673);
  }
  
  public p()
  {
    GMTrace.i(4116457717760L, 30670);
    this.fep = true;
    this.fbd = true;
    this.feq = true;
    GMTrace.o(4116457717760L, 30670);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4116591935488L, 30671);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4116591935488L, 30671);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fer == k) {
        this.field_flag = paramCursor.getLong(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fbu == k) {
          this.field_appId = paramCursor.getString(i);
        } else if (fes == k) {
          this.field_sortId = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4116591935488L, 30671);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4116726153216L, 30672);
    ContentValues localContentValues = new ContentValues();
    if (this.fep) {
      localContentValues.put("flag", Long.valueOf(this.field_flag));
    }
    if (this.field_appId == null) {
      this.field_appId = "";
    }
    if (this.fbd) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.feq) {
      localContentValues.put("sortId", Integer.valueOf(this.field_sortId));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4116726153216L, 30672);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */