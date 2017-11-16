package com.tencent.mm.plugin.webview.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.dw;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a
  extends dw
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(19464389132288L, 145021);
    c.a locala = new c.a();
    locala.gZM = new Field[7];
    locala.columns = new String[8];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "appId";
    locala.vmt.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "appIdKey";
    locala.vmt.put("appIdKey", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" appIdKey TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "appIdKey";
    locala.columns[2] = "value";
    locala.vmt.put("value", "TEXT");
    localStringBuilder.append(" value TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "weight";
    locala.vmt.put("weight", "TEXT");
    localStringBuilder.append(" weight TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "expireTime";
    locala.vmt.put("expireTime", "LONG");
    localStringBuilder.append(" expireTime LONG");
    localStringBuilder.append(", ");
    locala.columns[5] = "timeStamp";
    locala.vmt.put("timeStamp", "LONG");
    localStringBuilder.append(" timeStamp LONG");
    localStringBuilder.append(", ");
    locala.columns[6] = "size";
    locala.vmt.put("size", "LONG");
    localStringBuilder.append(" size LONG");
    locala.columns[7] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(19464389132288L, 145021);
  }
  
  public a()
  {
    GMTrace.i(19464120696832L, 145019);
    GMTrace.o(19464120696832L, 145019);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(19464254914560L, 145020);
    c.a locala = fTp;
    GMTrace.o(19464254914560L, 145020);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */