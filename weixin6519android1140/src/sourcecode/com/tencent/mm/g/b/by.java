package com.tencent.mm.g.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class by
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int ftH;
  private static final int ftI;
  public long field_liftTime;
  public int field_logId;
  
  static
  {
    GMTrace.i(4132966498304L, 30793);
    eZt = new String[0];
    ftH = "logId".hashCode();
    ftI = "liftTime".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4132966498304L, 30793);
  }
  
  public static c.a qM()
  {
    GMTrace.i(4132832280576L, 30792);
    c.a locala = new c.a();
    locala.gZM = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "logId";
    locala.vmt.put("logId", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" logId INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "logId";
    locala.columns[1] = "liftTime";
    locala.vmt.put("liftTime", "LONG");
    localStringBuilder.append(" liftTime LONG");
    locala.columns[2] = "rowid";
    locala.vmu = localStringBuilder.toString();
    GMTrace.o(4132832280576L, 30792);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\by.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */