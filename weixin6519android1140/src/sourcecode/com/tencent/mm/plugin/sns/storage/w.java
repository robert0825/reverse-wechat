package com.tencent.mm.plugin.sns.storage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.dj;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class w
  extends dj
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(20837704925184L, 155253);
    c.a locala = new c.a();
    locala.gZM = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "canvasId";
    locala.vmt.put("canvasId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" canvasId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "canvasId";
    locala.columns[1] = "canvasXml";
    locala.vmt.put("canvasXml", "TEXT");
    localStringBuilder.append(" canvasXml TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "createTime";
    locala.vmt.put("createTime", "LONG");
    localStringBuilder.append(" createTime LONG");
    locala.columns[3] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(20837704925184L, 155253);
  }
  
  public w()
  {
    GMTrace.i(20837436489728L, 155251);
    GMTrace.o(20837436489728L, 155251);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(20837570707456L, 155252);
    c.a locala = fTp;
    GMTrace.o(20837570707456L, 155252);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */