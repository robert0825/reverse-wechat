package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class du
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fGx;
  private static final int fbu;
  private boolean fGw;
  private boolean fbd;
  public String field_appId;
  public long field_occupation;
  
  static
  {
    GMTrace.i(4165715623936L, 31037);
    eZt = new String[0];
    fbu = "appId".hashCode();
    fGx = "occupation".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4165715623936L, 31037);
  }
  
  public du()
  {
    GMTrace.i(4165178753024L, 31033);
    this.fbd = true;
    this.fGw = true;
    GMTrace.o(4165178753024L, 31033);
  }
  
  public static c.a qM()
  {
    GMTrace.i(4165312970752L, 31034);
    c.a locala = new c.a();
    locala.gZM = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "appId";
    locala.vmt.put("appId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" appId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "appId";
    locala.columns[1] = "occupation";
    locala.vmt.put("occupation", "LONG");
    localStringBuilder.append(" occupation LONG");
    locala.columns[2] = "rowid";
    locala.vmu = localStringBuilder.toString();
    GMTrace.o(4165312970752L, 31034);
    return locala;
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4165447188480L, 31035);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4165447188480L, 31035);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fbu == k)
      {
        this.field_appId = paramCursor.getString(i);
        this.fbd = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fGx == k) {
          this.field_occupation = paramCursor.getLong(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4165447188480L, 31035);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4165581406208L, 31036);
    ContentValues localContentValues = new ContentValues();
    if (this.fbd) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.fGw) {
      localContentValues.put("occupation", Long.valueOf(this.field_occupation));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4165581406208L, 31036);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\du.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */