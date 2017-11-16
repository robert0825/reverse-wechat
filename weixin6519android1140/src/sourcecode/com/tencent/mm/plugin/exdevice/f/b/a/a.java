package com.tencent.mm.plugin.exdevice.f.b.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.bo;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a
  extends bo
{
  public static c.a fTp;
  
  static
  {
    GMTrace.i(11191745249280L, 83385);
    c.a locala = new c.a();
    locala.gZM = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "username";
    locala.vmt.put("username", "TEXT");
    localStringBuilder.append(" username TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "championUrl";
    locala.vmt.put("championUrl", "TEXT");
    localStringBuilder.append(" championUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "championMotto";
    locala.vmt.put("championMotto", "TEXT");
    localStringBuilder.append(" championMotto TEXT");
    locala.columns[3] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(11191745249280L, 83385);
  }
  
  public a()
  {
    GMTrace.i(11191476813824L, 83383);
    GMTrace.o(11191476813824L, 83383);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(11191611031552L, 83384);
    c.a locala = fTp;
    GMTrace.o(11191611031552L, 83384);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\f\b\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */