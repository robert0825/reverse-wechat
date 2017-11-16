package com.tencent.mm.plugin.appbrand.config;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.h;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class b
  extends h
{
  public static final c.a hJW;
  
  static
  {
    GMTrace.i(10578638667776L, 78817);
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
    locala.vmt.put("value", "TEXT");
    localStringBuilder.append(" value TEXT");
    locala.columns[2] = "rowid";
    locala.vmu = localStringBuilder.toString();
    hJW = locala;
    GMTrace.o(10578638667776L, 78817);
  }
  
  public b()
  {
    GMTrace.i(10578370232320L, 78815);
    GMTrace.o(10578370232320L, 78815);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(10578504450048L, 78816);
    c.a locala = hJW;
    GMTrace.o(10578504450048L, 78816);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\config\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */