package com.tencent.mm.plugin.aa.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.b;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class c
  extends b
{
  public static c.a fTp;
  
  static
  {
    GMTrace.i(5586678710272L, 41624);
    c.a locala = new c.a();
    locala.gZM = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "billNo";
    locala.vmt.put("billNo", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" billNo TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "billNo";
    locala.columns[1] = "insertmsg";
    locala.vmt.put("insertmsg", "INTEGER");
    localStringBuilder.append(" insertmsg INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "localMsgId";
    locala.vmt.put("localMsgId", "LONG");
    localStringBuilder.append(" localMsgId LONG");
    localStringBuilder.append(", ");
    locala.columns[3] = "status";
    locala.vmt.put("status", "INTEGER default '-1' ");
    localStringBuilder.append(" status INTEGER default '-1' ");
    locala.columns[4] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(5586678710272L, 41624);
  }
  
  public c()
  {
    GMTrace.i(5586410274816L, 41622);
    GMTrace.o(5586410274816L, 41622);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(5586544492544L, 41623);
    c.a locala = fTp;
    GMTrace.o(5586544492544L, 41623);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\aa\a\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */