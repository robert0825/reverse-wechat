package com.tencent.mm.plugin.order.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ck;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a
  extends ck
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(6633979641856L, 49427);
    c.a locala = new c.a();
    locala.gZM = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "msgId";
    locala.vmt.put("msgId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" msgId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "msgId";
    locala.columns[1] = "msgContentXml";
    locala.vmt.put("msgContentXml", "TEXT");
    localStringBuilder.append(" msgContentXml TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "isRead";
    locala.vmt.put("isRead", "TEXT");
    localStringBuilder.append(" isRead TEXT");
    locala.columns[3] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(6633979641856L, 49427);
  }
  
  public a()
  {
    GMTrace.i(6633711206400L, 49425);
    GMTrace.o(6633711206400L, 49425);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(6633845424128L, 49426);
    c.a locala = fTp;
    GMTrace.o(6633845424128L, 49426);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */