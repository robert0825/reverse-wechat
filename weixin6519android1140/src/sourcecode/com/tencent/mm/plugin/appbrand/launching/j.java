package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.cb;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class j
  extends cb
{
  static final c.a hIP;
  public transient boolean iql;
  
  static
  {
    GMTrace.i(15444299743232L, 115069);
    c.a locala = new c.a();
    locala.gZM = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "appIdHash";
    locala.vmt.put("appIdHash", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" appIdHash INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "appIdHash";
    locala.columns[1] = "appId";
    locala.vmt.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "launchAction";
    locala.vmt.put("launchAction", "BLOB");
    localStringBuilder.append(" launchAction BLOB");
    localStringBuilder.append(", ");
    locala.columns[3] = "jsapiInfo";
    locala.vmt.put("jsapiInfo", "BLOB");
    localStringBuilder.append(" jsapiInfo BLOB");
    localStringBuilder.append(", ");
    locala.columns[4] = "hostInfo";
    locala.vmt.put("hostInfo", "BLOB");
    localStringBuilder.append(" hostInfo BLOB");
    localStringBuilder.append(", ");
    locala.columns[5] = "actionsheetInfo";
    locala.vmt.put("actionsheetInfo", "BLOB");
    localStringBuilder.append(" actionsheetInfo BLOB");
    locala.columns[6] = "rowid";
    locala.vmu = localStringBuilder.toString();
    hIP = locala;
    GMTrace.o(15444299743232L, 115069);
  }
  
  public j()
  {
    GMTrace.i(15444031307776L, 115067);
    GMTrace.o(15444031307776L, 115067);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(15444165525504L, 115068);
    c.a locala = hIP;
    GMTrace.o(15444165525504L, 115068);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\launching\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */