package com.tencent.mm.storage.emotion;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ar;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class g
  extends ar
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(1538940469248L, 11466);
    c.a locala = new c.a();
    locala.gZM = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "designerIDAndType";
    locala.vmt.put("designerIDAndType", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" designerIDAndType TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "designerIDAndType";
    locala.columns[1] = "content";
    locala.vmt.put("content", "BLOB default '' ");
    localStringBuilder.append(" content BLOB default '' ");
    locala.columns[2] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(1538940469248L, 11466);
  }
  
  public g()
  {
    GMTrace.i(1538672033792L, 11464);
    GMTrace.o(1538672033792L, 11464);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(1538806251520L, 11465);
    GMTrace.o(1538806251520L, 11465);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\emotion\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */