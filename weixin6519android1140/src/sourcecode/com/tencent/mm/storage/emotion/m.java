package com.tencent.mm.storage.emotion;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.au;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class m
  extends au
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(1548738363392L, 11539);
    c.a locala = new c.a();
    locala.gZM = new Field[7];
    locala.columns = new String[8];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "prodcutID";
    locala.vmt.put("prodcutID", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" prodcutID TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "prodcutID";
    locala.columns[1] = "totalCount";
    locala.vmt.put("totalCount", "INTEGER");
    localStringBuilder.append(" totalCount INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "continuCount";
    locala.vmt.put("continuCount", "INTEGER");
    localStringBuilder.append(" continuCount INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "flag";
    locala.vmt.put("flag", "INTEGER");
    localStringBuilder.append(" flag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "modifyTime";
    locala.vmt.put("modifyTime", "LONG");
    localStringBuilder.append(" modifyTime LONG");
    localStringBuilder.append(", ");
    locala.columns[5] = "showTipsTime";
    locala.vmt.put("showTipsTime", "LONG");
    localStringBuilder.append(" showTipsTime LONG");
    localStringBuilder.append(", ");
    locala.columns[6] = "setFlagTime";
    locala.vmt.put("setFlagTime", "LONG");
    localStringBuilder.append(" setFlagTime LONG");
    locala.columns[7] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(1548738363392L, 11539);
  }
  
  public m()
  {
    GMTrace.i(1548469927936L, 11537);
    GMTrace.o(1548469927936L, 11537);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(1548604145664L, 11538);
    GMTrace.o(1548604145664L, 11538);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\emotion\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */