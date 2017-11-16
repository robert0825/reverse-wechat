package com.tencent.mm.storage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.dl;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import java.lang.reflect.Field;
import java.util.Map;

public final class bf
  extends dl
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(1568871022592L, 11689);
    c.a locala = new c.a();
    locala.gZM = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "msgId";
    locala.vmt.put("msgId", "LONG PRIMARY KEY ");
    localStringBuilder.append(" msgId LONG PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "msgId";
    locala.columns[1] = "cmsgId";
    locala.vmt.put("cmsgId", "TEXT");
    localStringBuilder.append(" cmsgId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "content";
    locala.vmt.put("content", "TEXT default '' ");
    localStringBuilder.append(" content TEXT default '' ");
    locala.columns[3] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(1568871022592L, 11689);
  }
  
  public bf()
  {
    GMTrace.i(1568602587136L, 11687);
    GMTrace.o(1568602587136L, 11687);
  }
  
  public final void UD(String paramString)
  {
    GMTrace.i(14589601251328L, 108701);
    if (bg.nm(paramString))
    {
      GMTrace.o(14589601251328L, 108701);
      return;
    }
    this.field_cmsgId = paramString;
    GMTrace.o(14589601251328L, 108701);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(1568736804864L, 11688);
    GMTrace.o(1568736804864L, 11688);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */