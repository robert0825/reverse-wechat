package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ad;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class k
  extends ad
{
  public static c.a fTp;
  
  static
  {
    GMTrace.i(18908861956096L, 140882);
    c.a locala = new c.a();
    locala.gZM = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "code_id";
    locala.vmt.put("code_id", "TEXT");
    localStringBuilder.append(" code_id TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "card_id";
    locala.vmt.put("card_id", "TEXT");
    localStringBuilder.append(" card_id TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "code";
    locala.vmt.put("code", "TEXT");
    localStringBuilder.append(" code TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "status";
    locala.vmt.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    locala.columns[4] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(18908861956096L, 140882);
  }
  
  public k()
  {
    GMTrace.i(18908593520640L, 140880);
    GMTrace.o(18908593520640L, 140880);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(18908727738368L, 140881);
    c.a locala = fTp;
    GMTrace.o(18908727738368L, 140881);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */