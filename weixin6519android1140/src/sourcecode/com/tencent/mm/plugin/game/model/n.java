package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.bi;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class n
  extends bi
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(12590562410496L, 93807);
    c.a locala = new c.a();
    locala.gZM = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "key";
    locala.vmt.put("key", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" key TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "key";
    locala.columns[1] = "value";
    locala.vmt.put("value", "BLOB");
    localStringBuilder.append(" value BLOB");
    locala.columns[2] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(12590562410496L, 93807);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(12590428192768L, 93806);
    c.a locala = fTp;
    GMTrace.o(12590428192768L, 93806);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */