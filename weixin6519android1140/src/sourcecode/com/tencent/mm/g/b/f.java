package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class f
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int faE;
  private static final int fbb;
  private static final int fbc;
  private boolean faZ;
  private boolean fai;
  private boolean fba;
  public int field_scene;
  public String field_ticket;
  public String field_userName;
  
  static
  {
    GMTrace.i(4172292292608L, 31086);
    eZt = new String[0];
    faE = "userName".hashCode();
    fbb = "scene".hashCode();
    fbc = "ticket".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4172292292608L, 31086);
  }
  
  public f()
  {
    GMTrace.i(4171755421696L, 31082);
    this.fai = true;
    this.faZ = true;
    this.fba = true;
    GMTrace.o(4171755421696L, 31082);
  }
  
  public static c.a qM()
  {
    GMTrace.i(4171889639424L, 31083);
    c.a locala = new c.a();
    locala.gZM = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "userName";
    locala.vmt.put("userName", "TEXT");
    localStringBuilder.append(" userName TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "scene";
    locala.vmt.put("scene", "INTEGER");
    localStringBuilder.append(" scene INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "ticket";
    locala.vmt.put("ticket", "TEXT");
    localStringBuilder.append(" ticket TEXT");
    locala.columns[3] = "rowid";
    locala.vmu = localStringBuilder.toString();
    GMTrace.o(4171889639424L, 31083);
    return locala;
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4172023857152L, 31084);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4172023857152L, 31084);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (faE == k) {
        this.field_userName = paramCursor.getString(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fbb == k) {
          this.field_scene = paramCursor.getInt(i);
        } else if (fbc == k) {
          this.field_ticket = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4172023857152L, 31084);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4172158074880L, 31085);
    ContentValues localContentValues = new ContentValues();
    if (this.fai) {
      localContentValues.put("userName", this.field_userName);
    }
    if (this.faZ) {
      localContentValues.put("scene", Integer.valueOf(this.field_scene));
    }
    if (this.fba) {
      localContentValues.put("ticket", this.field_ticket);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4172158074880L, 31085);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */