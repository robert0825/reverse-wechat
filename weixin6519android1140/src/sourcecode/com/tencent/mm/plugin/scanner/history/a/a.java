package com.tencent.mm.plugin.scanner.history.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ct;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a
  extends ct
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(6044763815936L, 45037);
    c.a locala = new c.a();
    locala.gZM = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "productId";
    locala.vmt.put("productId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" productId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "productId";
    locala.columns[1] = "xmlContent";
    locala.vmt.put("xmlContent", "TEXT");
    localStringBuilder.append(" xmlContent TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "ScanTime";
    locala.vmt.put("ScanTime", "LONG");
    localStringBuilder.append(" ScanTime LONG");
    localStringBuilder.append(", ");
    locala.columns[3] = "funcType";
    locala.vmt.put("funcType", "INTEGER");
    localStringBuilder.append(" funcType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "qrcodeUrl";
    locala.vmt.put("qrcodeUrl", "TEXT");
    localStringBuilder.append(" qrcodeUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "scene";
    locala.vmt.put("scene", "INTEGER");
    localStringBuilder.append(" scene INTEGER");
    locala.columns[6] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(6044763815936L, 45037);
  }
  
  public a()
  {
    GMTrace.i(6044495380480L, 45035);
    GMTrace.o(6044495380480L, 45035);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(6044629598208L, 45036);
    c.a locala = fTp;
    GMTrace.o(6044629598208L, 45036);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\history\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */