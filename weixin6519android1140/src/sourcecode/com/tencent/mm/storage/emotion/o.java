package com.tencent.mm.storage.emotion;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.bl;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class o
  extends bl
{
  public static c.a fTp;
  
  static
  {
    GMTrace.i(1547127750656L, 11527);
    c.a locala = new c.a();
    locala.gZM = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "reqType";
    locala.vmt.put("reqType", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" reqType TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "reqType";
    locala.columns[1] = "cache";
    locala.vmt.put("cache", "BLOB default '' ");
    localStringBuilder.append(" cache BLOB default '' ");
    locala.columns[2] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(1547127750656L, 11527);
  }
  
  public o(Cursor paramCursor)
  {
    GMTrace.i(1546993532928L, 11526);
    if (paramCursor == null)
    {
      GMTrace.o(1546993532928L, 11526);
      return;
    }
    b(paramCursor);
    GMTrace.o(1546993532928L, 11526);
  }
  
  public o(String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(1546859315200L, 11525);
    this.field_reqType = paramString;
    this.field_cache = paramArrayOfByte;
    GMTrace.o(1546859315200L, 11525);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(1546725097472L, 11524);
    GMTrace.o(1546725097472L, 11524);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\emotion\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */