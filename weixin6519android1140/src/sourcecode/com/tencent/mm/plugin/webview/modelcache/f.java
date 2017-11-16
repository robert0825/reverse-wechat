package com.tencent.mm.plugin.webview.modelcache;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.dy;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.Map;

public final class f
  extends dy
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(12348836282368L, 92006);
    c.a locala = new c.a();
    locala.gZM = new Field[17];
    locala.columns = new String[18];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "urlMd5Hashcode";
    locala.vmt.put("urlMd5Hashcode", "INTEGER");
    localStringBuilder.append(" urlMd5Hashcode INTEGER");
    localStringBuilder.append(", ");
    locala.columns[1] = "url";
    locala.vmt.put("url", "TEXT");
    localStringBuilder.append(" url TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "appId";
    locala.vmt.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "domain";
    locala.vmt.put("domain", "TEXT");
    localStringBuilder.append(" domain TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "version";
    locala.vmt.put("version", "TEXT");
    localStringBuilder.append(" version TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "localPath";
    locala.vmt.put("localPath", "TEXT");
    localStringBuilder.append(" localPath TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "contentType";
    locala.vmt.put("contentType", "TEXT");
    localStringBuilder.append(" contentType TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "contentLength";
    locala.vmt.put("contentLength", "LONG");
    localStringBuilder.append(" contentLength LONG");
    localStringBuilder.append(", ");
    locala.columns[8] = "isLatestVersion";
    locala.vmt.put("isLatestVersion", "INTEGER");
    localStringBuilder.append(" isLatestVersion INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "createTime";
    locala.vmt.put("createTime", "LONG");
    localStringBuilder.append(" createTime LONG");
    localStringBuilder.append(", ");
    locala.columns[10] = "accessTime";
    locala.vmt.put("accessTime", "LONG");
    localStringBuilder.append(" accessTime LONG");
    localStringBuilder.append(", ");
    locala.columns[11] = "expireTime";
    locala.vmt.put("expireTime", "LONG default '0' ");
    localStringBuilder.append(" expireTime LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[12] = "cacheType";
    locala.vmt.put("cacheType", "INTEGER");
    localStringBuilder.append(" cacheType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[13] = "configId";
    locala.vmt.put("configId", "TEXT");
    localStringBuilder.append(" configId TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "protocol";
    locala.vmt.put("protocol", "INTEGER");
    localStringBuilder.append(" protocol INTEGER");
    localStringBuilder.append(", ");
    locala.columns[15] = "packageId";
    locala.vmt.put("packageId", "TEXT");
    localStringBuilder.append(" packageId TEXT");
    localStringBuilder.append(", ");
    locala.columns[16] = "contentMd5";
    locala.vmt.put("contentMd5", "TEXT");
    localStringBuilder.append(" contentMd5 TEXT");
    locala.columns[17] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(12348836282368L, 92006);
  }
  
  public f()
  {
    GMTrace.i(12348433629184L, 92003);
    GMTrace.o(12348433629184L, 92003);
  }
  
  public final String toString()
  {
    GMTrace.i(12348702064640L, 92005);
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
      w.printErrStackTrace("MicroMsg.WebViewCacheRes", localIllegalAccessException, "", new Object[0]);
      localObject1 = " }";
      GMTrace.o(12348702064640L, 92005);
    }
  }
  
  protected final c.a uw()
  {
    GMTrace.i(12348567846912L, 92004);
    c.a locala = fTp;
    GMTrace.o(12348567846912L, 92004);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\modelcache\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */