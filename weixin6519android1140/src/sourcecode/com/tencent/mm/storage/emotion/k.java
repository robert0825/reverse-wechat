package com.tencent.mm.storage.emotion;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.at;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class k
  extends at
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(1555851902976L, 11592);
    c.a locala = new c.a();
    locala.gZM = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "productID";
    locala.vmt.put("productID", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" productID TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "productID";
    locala.columns[1] = "content";
    locala.vmt.put("content", "BLOB default '' ");
    localStringBuilder.append(" content BLOB default '' ");
    locala.columns[2] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(1555851902976L, 11592);
  }
  
  public k()
  {
    GMTrace.i(1555583467520L, 11590);
    GMTrace.o(1555583467520L, 11590);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(1555717685248L, 11591);
    GMTrace.o(1555717685248L, 11591);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\emotion\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */