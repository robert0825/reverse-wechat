package com.tencent.mm.storage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.r;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class k
  extends r
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(17949876289536L, 133737);
    c.a locala = new c.a();
    locala.gZM = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "msgListDataId";
    locala.vmt.put("msgListDataId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" msgListDataId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "msgListDataId";
    locala.columns[1] = "sessionName";
    locala.vmt.put("sessionName", "TEXT default '' ");
    localStringBuilder.append(" sessionName TEXT default '' ");
    locala.columns[2] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(17949876289536L, 133737);
  }
  
  public k()
  {
    GMTrace.i(17949607854080L, 133735);
    GMTrace.o(17949607854080L, 133735);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(17949742071808L, 133736);
    c.a locala = fTp;
    GMTrace.o(17949742071808L, 133736);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */