package com.tencent.mm.af.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.v;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class f
  extends v
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(4564073840640L, 34005);
    c.a locala = new c.a();
    locala.gZM = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "brandUserName";
    locala.vmt.put("brandUserName", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" brandUserName TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "brandUserName";
    locala.columns[1] = "userId";
    locala.vmt.put("userId", "TEXT");
    localStringBuilder.append(" userId TEXT");
    locala.columns[2] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(4564073840640L, 34005);
  }
  
  public f()
  {
    GMTrace.i(4563805405184L, 34003);
    GMTrace.o(4563805405184L, 34003);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(4563939622912L, 34004);
    c.a locala = fTp;
    GMTrace.o(4563939622912L, 34004);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */