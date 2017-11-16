package com.tencent.mm.storage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.c;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import java.lang.reflect.Field;
import java.util.Map;

public final class a
  extends c
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(1567394627584L, 11678);
    c.a locala = new c.a();
    locala.gZM = new Field[8];
    locala.columns = new String[9];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "abtestkey";
    locala.vmt.put("abtestkey", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" abtestkey TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "abtestkey";
    locala.columns[1] = "value";
    locala.vmt.put("value", "TEXT");
    localStringBuilder.append(" value TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "expId";
    locala.vmt.put("expId", "TEXT");
    localStringBuilder.append(" expId TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "sequence";
    locala.vmt.put("sequence", "LONG");
    localStringBuilder.append(" sequence LONG");
    localStringBuilder.append(", ");
    locala.columns[4] = "prioritylevel";
    locala.vmt.put("prioritylevel", "INTEGER");
    localStringBuilder.append(" prioritylevel INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "startTime";
    locala.vmt.put("startTime", "LONG");
    localStringBuilder.append(" startTime LONG");
    localStringBuilder.append(", ");
    locala.columns[6] = "endTime";
    locala.vmt.put("endTime", "LONG");
    localStringBuilder.append(" endTime LONG");
    localStringBuilder.append(", ");
    locala.columns[7] = "noReport";
    locala.vmt.put("noReport", "INTEGER");
    localStringBuilder.append(" noReport INTEGER");
    locala.columns[8] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(1567394627584L, 11678);
  }
  
  public a()
  {
    GMTrace.i(1566991974400L, 11675);
    GMTrace.o(1566991974400L, 11675);
  }
  
  public final boolean isValid()
  {
    GMTrace.i(1567260409856L, 11677);
    long l = bg.Pu();
    if ((l >= this.field_startTime) && (l < this.field_endTime))
    {
      GMTrace.o(1567260409856L, 11677);
      return true;
    }
    GMTrace.o(1567260409856L, 11677);
    return false;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(1567126192128L, 11676);
    c.a locala = fTp;
    GMTrace.o(1567126192128L, 11676);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */