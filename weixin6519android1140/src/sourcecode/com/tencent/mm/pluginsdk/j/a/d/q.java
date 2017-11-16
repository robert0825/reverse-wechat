package com.tencent.mm.pluginsdk.j.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.cr;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.Map;

public final class q
  extends cr
{
  public static final c.a fTp;
  
  static
  {
    GMTrace.i(884092174336L, 6587);
    c.a locala = new c.a();
    locala.gZM = new Field[34];
    locala.columns = new String[35];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "urlKey_hashcode";
    locala.vmt.put("urlKey_hashcode", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" urlKey_hashcode INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "urlKey_hashcode";
    locala.columns[1] = "urlKey";
    locala.vmt.put("urlKey", "TEXT");
    localStringBuilder.append(" urlKey TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "url";
    locala.vmt.put("url", "TEXT");
    localStringBuilder.append(" url TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "fileVersion";
    locala.vmt.put("fileVersion", "TEXT");
    localStringBuilder.append(" fileVersion TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "networkType";
    locala.vmt.put("networkType", "INTEGER default '2' ");
    localStringBuilder.append(" networkType INTEGER default '2' ");
    localStringBuilder.append(", ");
    locala.columns[5] = "maxRetryTimes";
    locala.vmt.put("maxRetryTimes", "INTEGER default '3' ");
    localStringBuilder.append(" maxRetryTimes INTEGER default '3' ");
    localStringBuilder.append(", ");
    locala.columns[6] = "retryTimes";
    locala.vmt.put("retryTimes", "INTEGER default '3' ");
    localStringBuilder.append(" retryTimes INTEGER default '3' ");
    localStringBuilder.append(", ");
    locala.columns[7] = "filePath";
    locala.vmt.put("filePath", "TEXT");
    localStringBuilder.append(" filePath TEXT");
    localStringBuilder.append(", ");
    locala.columns[8] = "status";
    locala.vmt.put("status", "INTEGER default '0' ");
    localStringBuilder.append(" status INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[9] = "contentLength";
    locala.vmt.put("contentLength", "LONG default '0' ");
    localStringBuilder.append(" contentLength LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[10] = "contentType";
    locala.vmt.put("contentType", "TEXT");
    localStringBuilder.append(" contentType TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "expireTime";
    locala.vmt.put("expireTime", "LONG default '0' ");
    localStringBuilder.append(" expireTime LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[12] = "md5";
    locala.vmt.put("md5", "TEXT");
    localStringBuilder.append(" md5 TEXT");
    localStringBuilder.append(", ");
    locala.columns[13] = "groupId1";
    locala.vmt.put("groupId1", "TEXT");
    localStringBuilder.append(" groupId1 TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "groupId2";
    locala.vmt.put("groupId2", "TEXT");
    localStringBuilder.append(" groupId2 TEXT");
    localStringBuilder.append(", ");
    locala.columns[15] = "priority";
    locala.vmt.put("priority", "INTEGER default '0' ");
    localStringBuilder.append(" priority INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[16] = "fileUpdated";
    locala.vmt.put("fileUpdated", "INTEGER");
    localStringBuilder.append(" fileUpdated INTEGER");
    localStringBuilder.append(", ");
    locala.columns[17] = "deleted";
    locala.vmt.put("deleted", "INTEGER default 'false' ");
    localStringBuilder.append(" deleted INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[18] = "resType";
    locala.vmt.put("resType", "INTEGER");
    localStringBuilder.append(" resType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[19] = "subType";
    locala.vmt.put("subType", "INTEGER");
    localStringBuilder.append(" subType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[20] = "reportId";
    locala.vmt.put("reportId", "LONG");
    localStringBuilder.append(" reportId LONG");
    localStringBuilder.append(", ");
    locala.columns[21] = "sampleId";
    locala.vmt.put("sampleId", "TEXT");
    localStringBuilder.append(" sampleId TEXT");
    localStringBuilder.append(", ");
    locala.columns[22] = "eccSignature";
    locala.vmt.put("eccSignature", "BLOB");
    localStringBuilder.append(" eccSignature BLOB");
    localStringBuilder.append(", ");
    locala.columns[23] = "originalMd5";
    locala.vmt.put("originalMd5", "TEXT");
    localStringBuilder.append(" originalMd5 TEXT");
    localStringBuilder.append(", ");
    locala.columns[24] = "fileCompress";
    locala.vmt.put("fileCompress", "INTEGER default 'false' ");
    localStringBuilder.append(" fileCompress INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[25] = "fileEncrypt";
    locala.vmt.put("fileEncrypt", "INTEGER default 'false' ");
    localStringBuilder.append(" fileEncrypt INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[26] = "encryptKey";
    locala.vmt.put("encryptKey", "TEXT");
    localStringBuilder.append(" encryptKey TEXT");
    localStringBuilder.append(", ");
    locala.columns[27] = "keyVersion";
    locala.vmt.put("keyVersion", "INTEGER default '0' ");
    localStringBuilder.append(" keyVersion INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[28] = "EID";
    locala.vmt.put("EID", "INTEGER");
    localStringBuilder.append(" EID INTEGER");
    localStringBuilder.append(", ");
    locala.columns[29] = "fileSize";
    locala.vmt.put("fileSize", "LONG");
    localStringBuilder.append(" fileSize LONG");
    localStringBuilder.append(", ");
    locala.columns[30] = "needRetry";
    locala.vmt.put("needRetry", "INTEGER default '1' ");
    localStringBuilder.append(" needRetry INTEGER default '1' ");
    localStringBuilder.append(", ");
    locala.columns[31] = "appId";
    locala.vmt.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[32] = "wvCacheType";
    locala.vmt.put("wvCacheType", "INTEGER");
    localStringBuilder.append(" wvCacheType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[33] = "packageId";
    locala.vmt.put("packageId", "TEXT");
    localStringBuilder.append(" packageId TEXT");
    locala.columns[34] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(884092174336L, 6587);
  }
  
  public q()
  {
    GMTrace.i(883689521152L, 6584);
    GMTrace.o(883689521152L, 6584);
  }
  
  public final String toString()
  {
    GMTrace.i(883823738880L, 6585);
    localObject1 = new StringBuilder("ResDownloaderRecord {");
    try
    {
      Field[] arrayOfField = getClass().getSuperclass().getDeclaredFields();
      int j = arrayOfField.length;
      int i = 0;
      while (i < j)
      {
        Field localField2 = arrayOfField[i];
        if (localField2.getName().startsWith("field_"))
        {
          localField2.setAccessible(true);
          Object localObject2 = localField2.get(this);
          ((StringBuilder)localObject1).append(localField2.getName().replaceFirst("field_", "")).append(" = ").append(localObject2).append(", ");
        }
        i += 1;
      }
      try
      {
        Field localField1 = getClass().getSuperclass().getSuperclass().getField("systemRowid");
        localField1.setAccessible(true);
        ((StringBuilder)localObject1).append("systemRowid = ").append(localField1.get(this));
        localObject1 = " }";
        GMTrace.o(883823738880L, 6585);
        return (String)localObject1;
      }
      catch (IllegalAccessException localIllegalAccessException2)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.ResDownloaderRecord", localIllegalAccessException2, "", new Object[0]);
        }
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.ResDownloaderRecord", localNoSuchFieldException, "", new Object[0]);
        }
      }
    }
    catch (IllegalAccessException localIllegalAccessException1)
    {
      w.printErrStackTrace("MicroMsg.ResDownloaderRecord", localIllegalAccessException1, "", new Object[0]);
    }
  }
  
  protected final c.a uw()
  {
    GMTrace.i(883957956608L, 6586);
    c.a locala = fTp;
    GMTrace.o(883957956608L, 6586);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\j\a\d\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */