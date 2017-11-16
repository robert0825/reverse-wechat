package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class k
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fbZ;
  private static final int fca;
  private static final int fcc;
  private boolean fbV;
  private boolean fbW;
  private boolean fcb;
  public long field_updateTime;
  public String field_username;
  public int field_versionType;
  
  static
  {
    GMTrace.i(4139140513792L, 30839);
    eZt = new String[] { "CREATE INDEX IF NOT EXISTS AppBrandStarAppUpdateTimeIndex ON AppBrandStarApp(updateTime)" };
    fcc = "username".hashCode();
    fbZ = "versionType".hashCode();
    fca = "updateTime".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4139140513792L, 30839);
  }
  
  public k()
  {
    GMTrace.i(4138737860608L, 30836);
    this.fcb = true;
    this.fbV = true;
    this.fbW = true;
    GMTrace.o(4138737860608L, 30836);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4138872078336L, 30837);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4138872078336L, 30837);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fcc == k) {
        this.field_username = paramCursor.getString(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fbZ == k) {
          this.field_versionType = paramCursor.getInt(i);
        } else if (fca == k) {
          this.field_updateTime = paramCursor.getLong(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4138872078336L, 30837);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4139006296064L, 30838);
    ContentValues localContentValues = new ContentValues();
    if (this.fcb) {
      localContentValues.put("username", this.field_username);
    }
    if (this.fbV) {
      localContentValues.put("versionType", Integer.valueOf(this.field_versionType));
    }
    if (this.fbW) {
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4139006296064L, 30838);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */