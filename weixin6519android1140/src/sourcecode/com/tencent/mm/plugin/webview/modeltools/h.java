package com.tencent.mm.plugin.webview.modeltools;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.dx;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class h
  extends dx
{
  public static c.a fTp;
  
  static
  {
    GMTrace.i(11979066441728L, 89251);
    c.a locala = new c.a();
    locala.gZM = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "host";
    locala.vmt.put("host", "TEXT");
    localStringBuilder.append(" host TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "expireTime";
    locala.vmt.put("expireTime", "LONG");
    localStringBuilder.append(" expireTime LONG");
    locala.columns[2] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(11979066441728L, 89251);
  }
  
  public h()
  {
    GMTrace.i(11978798006272L, 89249);
    GMTrace.o(11978798006272L, 89249);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(11978932224000L, 89250);
    c.a locala = fTp;
    GMTrace.o(11978932224000L, 89250);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\modeltools\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */