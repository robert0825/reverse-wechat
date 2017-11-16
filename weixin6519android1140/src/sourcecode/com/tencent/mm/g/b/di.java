package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class di
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fbu;
  private static final int fcc;
  private static final int fdA;
  private boolean fbd;
  private boolean fcb;
  private boolean fde;
  public String field_appId;
  public String field_openId;
  public String field_username;
  
  static
  {
    GMTrace.i(4146388271104L, 30893);
    eZt = new String[0];
    fdA = "openId".hashCode();
    fbu = "appId".hashCode();
    fcc = "username".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4146388271104L, 30893);
  }
  
  public di()
  {
    GMTrace.i(4145985617920L, 30890);
    this.fde = true;
    this.fbd = true;
    this.fcb = true;
    GMTrace.o(4145985617920L, 30890);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4146119835648L, 30891);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4146119835648L, 30891);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fdA == k)
      {
        this.field_openId = paramCursor.getString(i);
        this.fde = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fbu == k) {
          this.field_appId = paramCursor.getString(i);
        } else if (fcc == k) {
          this.field_username = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4146119835648L, 30891);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4146254053376L, 30892);
    ContentValues localContentValues = new ContentValues();
    if (this.fde) {
      localContentValues.put("openId", this.field_openId);
    }
    if (this.fbd) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.fcb) {
      localContentValues.put("username", this.field_username);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4146254053376L, 30892);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\g\b\di.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */