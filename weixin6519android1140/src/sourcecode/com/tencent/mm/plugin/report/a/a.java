package com.tencent.mm.plugin.report.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.al;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a
  extends al
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(13108777058304L, 97668);
    c.a locala = new c.a();
    locala.gZM = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "bakLogId";
    locala.vmt.put("bakLogId", "INTEGER");
    localStringBuilder.append(" bakLogId INTEGER");
    localStringBuilder.append(", ");
    locala.columns[1] = "valueStr";
    locala.vmt.put("valueStr", "TEXT");
    localStringBuilder.append(" valueStr TEXT");
    locala.columns[2] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(13108777058304L, 97668);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(13108642840576L, 97667);
    c.a locala = fTp;
    GMTrace.o(13108642840576L, 97667);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */