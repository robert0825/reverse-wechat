package com.tencent.mm.plugin.webview.modelcache;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.dv;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.Map;

final class g
  extends dv
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(12350983766016L, 92022);
    c.a locala = new c.a();
    locala.gZM = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "disable";
    locala.vmt.put("disable", "INTEGER default 'false' ");
    localStringBuilder.append(" disable INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[1] = "configId";
    locala.vmt.put("configId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" configId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "configId";
    locala.columns[2] = "configUrl";
    locala.vmt.put("configUrl", "TEXT");
    localStringBuilder.append(" configUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "configResources";
    locala.vmt.put("configResources", "TEXT");
    localStringBuilder.append(" configResources TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "configCrc32";
    locala.vmt.put("configCrc32", "LONG");
    localStringBuilder.append(" configCrc32 LONG");
    localStringBuilder.append(", ");
    locala.columns[5] = "isFromXml";
    locala.vmt.put("isFromXml", "INTEGER default 'false' ");
    localStringBuilder.append(" isFromXml INTEGER default 'false' ");
    locala.columns[6] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(12350983766016L, 92022);
  }
  
  g()
  {
    GMTrace.i(12350581112832L, 92019);
    GMTrace.o(12350581112832L, 92019);
  }
  
  public final String toString()
  {
    GMTrace.i(12350849548288L, 92021);
    localObject1 = new StringBuilder(getClass().getSimpleName() + " {");
    try
    {
      Field[] arrayOfField = getClass().getSuperclass().getDeclaredFields();
      int j = arrayOfField.length;
      int i = 0;
      while (i < j)
      {
        Field localField = arrayOfField[i];
        if (localField.getName().startsWith("field_"))
        {
          localField.setAccessible(true);
          Object localObject2 = localField.get(this);
          ((StringBuilder)localObject1).append(localField.getName().replaceFirst("field_", "")).append(" = ").append(localObject2).append(", ");
        }
        i += 1;
      }
      return (String)localObject1;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      w.printErrStackTrace("MicroMsg.WebViewCacheResConfigMap", localIllegalAccessException, "", new Object[0]);
      localObject1 = " }";
      GMTrace.o(12350849548288L, 92021);
    }
  }
  
  protected final c.a uw()
  {
    GMTrace.i(12350715330560L, 92020);
    c.a locala = fTp;
    GMTrace.o(12350715330560L, 92020);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\modelcache\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */