package com.tencent.mm.plugin.sns.storage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.aa;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class c
  extends aa
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(16641119223808L, 123986);
    c.a locala = new c.a();
    locala.gZM = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "canvasId";
    locala.vmt.put("canvasId", "LONG PRIMARY KEY ");
    localStringBuilder.append(" canvasId LONG PRIMARY KEY ");
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
    GMTrace.o(16641119223808L, 123986);
  }
  
  public c()
  {
    GMTrace.i(16640850788352L, 123984);
    GMTrace.o(16640850788352L, 123984);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(16640985006080L, 123985);
    c.a locala = fTp;
    GMTrace.o(16640985006080L, 123985);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */