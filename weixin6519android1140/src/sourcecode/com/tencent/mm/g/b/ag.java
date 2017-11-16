package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class ag
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fcc;
  private static final int fjD;
  private boolean fcb;
  public byte[] field_cmdbuf;
  public String field_username;
  private boolean fjC;
  
  static
  {
    GMTrace.i(13361777475584L, 99553);
    eZt = new String[0];
    fcc = "username".hashCode();
    fjD = "cmdbuf".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(13361777475584L, 99553);
  }
  
  public ag()
  {
    GMTrace.i(13361374822400L, 99550);
    this.fcb = true;
    this.fjC = true;
    GMTrace.o(13361374822400L, 99550);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(13361509040128L, 99551);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(13361509040128L, 99551);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fcc == k)
      {
        this.field_username = paramCursor.getString(i);
        this.fcb = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fjD == k) {
          this.field_cmdbuf = paramCursor.getBlob(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(13361509040128L, 99551);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(13361643257856L, 99552);
    ContentValues localContentValues = new ContentValues();
    if (this.field_username == null) {
      this.field_username = "";
    }
    if (this.fcb) {
      localContentValues.put("username", this.field_username);
    }
    if (this.fjC) {
      localContentValues.put("cmdbuf", this.field_cmdbuf);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(13361643257856L, 99552);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\g\b\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */