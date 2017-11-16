package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class ee
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fIt;
  private static final int fbu;
  private static final int fvC;
  private boolean fIs;
  private boolean fbd;
  public String field_appId;
  public int field_appIdHash;
  public boolean field_openDebug;
  private boolean fvx;
  
  static
  {
    GMTrace.i(17945581322240L, 133705);
    eZt = new String[0];
    fvC = "appIdHash".hashCode();
    fbu = "appId".hashCode();
    fIt = "openDebug".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(17945581322240L, 133705);
  }
  
  public ee()
  {
    GMTrace.i(17945178669056L, 133702);
    this.fvx = true;
    this.fbd = true;
    this.fIs = true;
    GMTrace.o(17945178669056L, 133702);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(17945312886784L, 133703);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(17945312886784L, 133703);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fvC == k)
      {
        this.field_appIdHash = paramCursor.getInt(i);
        this.fvx = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fbu == k)
        {
          this.field_appId = paramCursor.getString(i);
        }
        else
        {
          if (fIt == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_openDebug = bool;
              break;
            }
          }
          if (eZC == k) {
            this.vmr = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(17945312886784L, 133703);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(17945447104512L, 133704);
    ContentValues localContentValues = new ContentValues();
    if (this.fvx) {
      localContentValues.put("appIdHash", Integer.valueOf(this.field_appIdHash));
    }
    if (this.fbd) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.fIs) {
      localContentValues.put("openDebug", Boolean.valueOf(this.field_openDebug));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(17945447104512L, 133704);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\ee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */