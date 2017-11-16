package com.tencent.mm.plugin.remittance.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ak;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a
  extends ak
{
  public static c.a fTp;
  
  static
  {
    GMTrace.i(10802111184896L, 80482);
    c.a locala = new c.a();
    locala.gZM = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "msgId";
    locala.vmt.put("msgId", "LONG PRIMARY KEY ");
    localStringBuilder.append(" msgId LONG PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "msgId";
    locala.columns[1] = "transferId";
    locala.vmt.put("transferId", "TEXT");
    localStringBuilder.append(" transferId TEXT");
    locala.columns[2] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(10802111184896L, 80482);
  }
  
  public a()
  {
    GMTrace.i(10801842749440L, 80480);
    GMTrace.o(10801842749440L, 80480);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(10801976967168L, 80481);
    c.a locala = fTp;
    GMTrace.o(10801976967168L, 80481);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */