package com.tencent.mm.plugin.ipcall.a.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.bw;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class i
  extends bw
{
  public static c.a fTp;
  
  static
  {
    GMTrace.i(11580708225024L, 86283);
    c.a locala = new c.a();
    locala.gZM = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "countryCode";
    locala.vmt.put("countryCode", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" countryCode INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "countryCode";
    locala.columns[1] = "callTimeCount";
    locala.vmt.put("callTimeCount", "LONG");
    localStringBuilder.append(" callTimeCount LONG");
    localStringBuilder.append(", ");
    locala.columns[2] = "lastCallTime";
    locala.vmt.put("lastCallTime", "LONG");
    localStringBuilder.append(" lastCallTime LONG");
    locala.columns[3] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(11580708225024L, 86283);
  }
  
  public i()
  {
    GMTrace.i(11580439789568L, 86281);
    GMTrace.o(11580439789568L, 86281);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(11580574007296L, 86282);
    c.a locala = fTp;
    GMTrace.o(11580574007296L, 86282);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\g\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */