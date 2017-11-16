package com.tencent.mm.storage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.q;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class i
  extends q
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(17946520846336L, 133712);
    c.a locala = new c.a();
    locala.gZM = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "deviceId";
    locala.vmt.put("deviceId", "TEXT default '' ");
    localStringBuilder.append(" deviceId TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[1] = "sessionName";
    locala.vmt.put("sessionName", "TEXT default '' ");
    localStringBuilder.append(" sessionName TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "moveTime";
    locala.vmt.put("moveTime", "BLOB default '' ");
    localStringBuilder.append(" moveTime BLOB default '' ");
    locala.columns[3] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(17946520846336L, 133712);
  }
  
  public i()
  {
    GMTrace.i(17946252410880L, 133710);
    GMTrace.o(17946252410880L, 133710);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(17946386628608L, 133711);
    c.a locala = fTp;
    GMTrace.o(17946386628608L, 133711);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */