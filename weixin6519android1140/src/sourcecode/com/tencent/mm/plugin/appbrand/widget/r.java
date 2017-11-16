package com.tencent.mm.plugin.appbrand.widget;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ee;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class r
  extends ee
{
  public static c.a hJW;
  
  static
  {
    GMTrace.i(19990119972864L, 148938);
    c.a locala = new c.a();
    locala.gZM = new Field[3];
    locala.columns = new String[4];
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
    locala.columns[2] = "openDebug";
    locala.vmt.put("openDebug", "INTEGER");
    localStringBuilder.append(" openDebug INTEGER");
    locala.columns[3] = "rowid";
    locala.vmu = localStringBuilder.toString();
    hJW = locala;
    GMTrace.o(19990119972864L, 148938);
  }
  
  public r()
  {
    GMTrace.i(19989851537408L, 148936);
    GMTrace.o(19989851537408L, 148936);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(19989985755136L, 148937);
    c.a locala = hJW;
    GMTrace.o(19989985755136L, 148937);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */