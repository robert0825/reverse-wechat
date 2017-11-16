package com.tencent.mm.storage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.cj;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class aw
  extends cj
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(1533034889216L, 11422);
    c.a locala = new c.a();
    locala.gZM = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "appId";
    locala.vmt.put("appId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" appId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "appId";
    locala.columns[1] = "packageName";
    locala.vmt.put("packageName", "TEXT");
    localStringBuilder.append(" packageName TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "status";
    locala.vmt.put("status", "INTEGER default '0' ");
    localStringBuilder.append(" status INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "sceneFlag";
    locala.vmt.put("sceneFlag", "INTEGER default '0' ");
    localStringBuilder.append(" sceneFlag INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[4] = "msgTypeFlag";
    locala.vmt.put("msgTypeFlag", "INTEGER default '0' ");
    localStringBuilder.append(" msgTypeFlag INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[5] = "msgState";
    locala.vmt.put("msgState", "INTEGER default '0' ");
    localStringBuilder.append(" msgState INTEGER default '0' ");
    locala.columns[6] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(1533034889216L, 11422);
  }
  
  public aw()
  {
    GMTrace.i(1532900671488L, 11421);
    GMTrace.o(1532900671488L, 11421);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(1532766453760L, 11420);
    c.a locala = fTp;
    GMTrace.o(1532766453760L, 11420);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\storage\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */