package com.tencent.mm.plugin.remittance.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.cq;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class c
  extends cq
{
  public static c.a fTp;
  
  static
  {
    GMTrace.i(18054700335104L, 134518);
    c.a locala = new c.a();
    locala.gZM = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "transferId";
    locala.vmt.put("transferId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" transferId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "transferId";
    locala.columns[1] = "locaMsgId";
    locala.vmt.put("locaMsgId", "LONG");
    localStringBuilder.append(" locaMsgId LONG");
    localStringBuilder.append(", ");
    locala.columns[2] = "receiveStatus";
    locala.vmt.put("receiveStatus", "INTEGER default '-1' ");
    localStringBuilder.append(" receiveStatus INTEGER default '-1' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "isSend";
    locala.vmt.put("isSend", "INTEGER");
    localStringBuilder.append(" isSend INTEGER");
    locala.columns[4] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(18054700335104L, 134518);
  }
  
  public c()
  {
    GMTrace.i(18054431899648L, 134516);
    GMTrace.o(18054431899648L, 134516);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(18054566117376L, 134517);
    c.a locala = fTp;
    GMTrace.o(18054566117376L, 134517);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */