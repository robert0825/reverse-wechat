package com.tencent.mm.plugin.shake.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.shake.a.a.b;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class j
  extends b
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(6503385792512L, 48454);
    c.a locala = new c.a();
    locala.gZM = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "username";
    locala.vmt.put("username", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" username TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "username";
    locala.columns[1] = "lastshaketime";
    locala.vmt.put("lastshaketime", "INTEGER default '0' ");
    localStringBuilder.append(" lastshaketime INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "isshowed";
    locala.vmt.put("isshowed", "INTEGER default 'false' ");
    localStringBuilder.append(" isshowed INTEGER default 'false' ");
    locala.columns[3] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(6503385792512L, 48454);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(6503251574784L, 48453);
    c.a locala = fTp;
    GMTrace.o(6503251574784L, 48453);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\shake\b\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */