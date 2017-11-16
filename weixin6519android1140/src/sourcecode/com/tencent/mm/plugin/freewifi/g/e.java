package com.tencent.mm.plugin.freewifi.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.bg;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class e
  extends bg
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(7156086603776L, 53317);
    c.a locala = new c.a();
    locala.gZM = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "id";
    locala.vmt.put("id", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" id TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "id";
    locala.columns[1] = "protocolNumber";
    locala.vmt.put("protocolNumber", "INTEGER");
    localStringBuilder.append(" protocolNumber INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "logContent";
    locala.vmt.put("logContent", "TEXT");
    localStringBuilder.append(" logContent TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "createTime";
    locala.vmt.put("createTime", "LONG");
    localStringBuilder.append(" createTime LONG");
    locala.columns[4] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(7156086603776L, 53317);
  }
  
  public e()
  {
    GMTrace.i(7155818168320L, 53315);
    GMTrace.o(7155818168320L, 53315);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(7155952386048L, 53316);
    c.a locala = fTp;
    GMTrace.o(7155952386048L, 53316);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\g\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */