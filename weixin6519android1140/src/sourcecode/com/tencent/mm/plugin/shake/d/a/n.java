package com.tencent.mm.plugin.shake.d.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.shake.a.a.c;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class n
  extends c
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(6610357321728L, 49251);
    c.a locala = new c.a();
    locala.gZM = new Field[5];
    locala.columns = new String[6];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "username";
    locala.vmt.put("username", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" username TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "username";
    locala.columns[1] = "deeplink";
    locala.vmt.put("deeplink", "TEXT default '' ");
    localStringBuilder.append(" deeplink TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "title";
    locala.vmt.put("title", "TEXT default '' ");
    localStringBuilder.append(" title TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "iconurl";
    locala.vmt.put("iconurl", "TEXT default '' ");
    localStringBuilder.append(" iconurl TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[4] = "createtime";
    locala.vmt.put("createtime", "LONG default '' ");
    localStringBuilder.append(" createtime LONG default '' ");
    locala.columns[5] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(6610357321728L, 49251);
  }
  
  public n()
  {
    GMTrace.i(6610088886272L, 49249);
    GMTrace.o(6610088886272L, 49249);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(6610223104000L, 49250);
    c.a locala = fTp;
    GMTrace.o(6610223104000L, 49250);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\shake\d\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */