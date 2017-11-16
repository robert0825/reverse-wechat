package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.dz;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class ae
  extends dz
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(12000407060480L, 89410);
    c.a locala = new c.a();
    locala.gZM = new Field[5];
    locala.columns = new String[6];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "recordId";
    locala.vmt.put("recordId", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" recordId INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "recordId";
    locala.columns[1] = "appId";
    locala.vmt.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "domin";
    locala.vmt.put("domin", "TEXT");
    localStringBuilder.append(" domin TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "key";
    locala.vmt.put("key", "TEXT");
    localStringBuilder.append(" key TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "value";
    locala.vmt.put("value", "TEXT");
    localStringBuilder.append(" value TEXT");
    locala.columns[5] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(12000407060480L, 89410);
  }
  
  public ae()
  {
    GMTrace.i(12000138625024L, 89408);
    GMTrace.o(12000138625024L, 89408);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(12000272842752L, 89409);
    c.a locala = fTp;
    GMTrace.o(12000272842752L, 89409);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */