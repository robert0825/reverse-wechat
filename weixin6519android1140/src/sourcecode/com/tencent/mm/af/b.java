package com.tencent.mm.af;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.x;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class b
  extends x
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(4540988391424L, 33833);
    c.a locala = new c.a();
    locala.gZM = new Field[8];
    locala.columns = new String[9];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "userName";
    locala.vmt.put("userName", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" userName TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "userName";
    locala.columns[1] = "qyUin";
    locala.vmt.put("qyUin", "INTEGER");
    localStringBuilder.append(" qyUin INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "userUin";
    locala.vmt.put("userUin", "INTEGER");
    localStringBuilder.append(" userUin INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "userFlag";
    locala.vmt.put("userFlag", "INTEGER");
    localStringBuilder.append(" userFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "wwExposeTimes";
    locala.vmt.put("wwExposeTimes", "INTEGER");
    localStringBuilder.append(" wwExposeTimes INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "wwMaxExposeTimes";
    locala.vmt.put("wwMaxExposeTimes", "INTEGER");
    localStringBuilder.append(" wwMaxExposeTimes INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "wwCorpId";
    locala.vmt.put("wwCorpId", "LONG");
    localStringBuilder.append(" wwCorpId LONG");
    localStringBuilder.append(", ");
    locala.columns[7] = "wwUserVid";
    locala.vmt.put("wwUserVid", "LONG");
    localStringBuilder.append(" wwUserVid LONG");
    locala.columns[8] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(4540988391424L, 33833);
  }
  
  public b()
  {
    GMTrace.i(4540719955968L, 33831);
    GMTrace.o(4540719955968L, 33831);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(4540854173696L, 33832);
    c.a locala = fTp;
    GMTrace.o(4540854173696L, 33832);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */