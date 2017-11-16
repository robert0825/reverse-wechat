package com.tencent.mm.plugin.exdevice.f.b.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.br;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class b
  extends br
{
  public static c.a fTp;
  
  static
  {
    GMTrace.i(11190268854272L, 83374);
    c.a locala = new c.a();
    locala.gZM = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "appusername";
    locala.vmt.put("appusername", "TEXT");
    localStringBuilder.append(" appusername TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "title";
    locala.vmt.put("title", "TEXT");
    localStringBuilder.append(" title TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "score";
    locala.vmt.put("score", "INTEGER");
    localStringBuilder.append(" score INTEGER");
    locala.columns[3] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(11190268854272L, 83374);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(11190134636544L, 83373);
    c.a locala = fTp;
    GMTrace.o(11190134636544L, 83373);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\f\b\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */