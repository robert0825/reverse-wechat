package com.tencent.mm.storage.emotion;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.as;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class i
  extends as
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(1555449249792L, 11589);
    c.a locala = new c.a();
    locala.gZM = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "productID";
    locala.vmt.put("productID", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" productID TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "productID";
    locala.columns[1] = "content";
    locala.vmt.put("content", "BLOB default '' ");
    localStringBuilder.append(" content BLOB default '' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "lan";
    locala.vmt.put("lan", "TEXT default '' ");
    localStringBuilder.append(" lan TEXT default '' ");
    locala.columns[3] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(1555449249792L, 11589);
  }
  
  public i()
  {
    GMTrace.i(1555180814336L, 11587);
    GMTrace.o(1555180814336L, 11587);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(1555315032064L, 11588);
    c.a locala = fTp;
    GMTrace.o(1555315032064L, 11588);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\emotion\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */