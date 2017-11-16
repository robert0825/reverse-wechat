package com.tencent.mm.pluginsdk.model.app;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.p;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class n
  extends p
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(784771055616L, 5847);
    c.a locala = new c.a();
    locala.gZM = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "flag";
    locala.vmt.put("flag", "LONG default '0' ");
    localStringBuilder.append(" flag LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[1] = "appId";
    locala.vmt.put("appId", "TEXT default '' ");
    localStringBuilder.append(" appId TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "sortId";
    locala.vmt.put("sortId", "INTEGER default '0' ");
    localStringBuilder.append(" sortId INTEGER default '0' ");
    locala.columns[3] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(784771055616L, 5847);
  }
  
  public n()
  {
    GMTrace.i(784636837888L, 5846);
    GMTrace.o(784636837888L, 5846);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(784502620160L, 5845);
    c.a locala = fTp;
    GMTrace.o(784502620160L, 5845);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */