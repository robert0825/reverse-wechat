package com.tencent.mm.plugin.appbrand.config;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.l;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

@Deprecated
final class n
  extends l
{
  public static final c.a hJW;
  
  static
  {
    GMTrace.i(17270063497216L, 128672);
    c.a locala = new c.a();
    locala.gZM = new Field[16];
    locala.columns = new String[17];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "appIdHashCode";
    locala.vmt.put("appIdHashCode", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" appIdHashCode INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "appIdHashCode";
    locala.columns[1] = "appId";
    locala.vmt.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "appIcon";
    locala.vmt.put("appIcon", "TEXT");
    localStringBuilder.append(" appIcon TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "appName";
    locala.vmt.put("appName", "TEXT");
    localStringBuilder.append(" appName TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "BigHeadImgUrl";
    locala.vmt.put("BigHeadImgUrl", "TEXT");
    localStringBuilder.append(" BigHeadImgUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "appInfo";
    locala.vmt.put("appInfo", "BLOB");
    localStringBuilder.append(" appInfo BLOB");
    localStringBuilder.append(", ");
    locala.columns[6] = "versionInfo";
    locala.vmt.put("versionInfo", "BLOB");
    localStringBuilder.append(" versionInfo BLOB");
    localStringBuilder.append(", ");
    locala.columns[7] = "bindInfo";
    locala.vmt.put("bindInfo", "BLOB");
    localStringBuilder.append(" bindInfo BLOB");
    localStringBuilder.append(", ");
    locala.columns[8] = "brandId";
    locala.vmt.put("brandId", "TEXT");
    localStringBuilder.append(" brandId TEXT");
    localStringBuilder.append(", ");
    locala.columns[9] = "brandFlag";
    locala.vmt.put("brandFlag", "INTEGER default '0' ");
    localStringBuilder.append(" brandFlag INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[10] = "signature";
    locala.vmt.put("signature", "TEXT");
    localStringBuilder.append(" signature TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "AppOpt";
    locala.vmt.put("AppOpt", "INTEGER default '0' ");
    localStringBuilder.append(" AppOpt INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[12] = "syncAttrVersion";
    locala.vmt.put("syncAttrVersion", "TEXT");
    localStringBuilder.append(" syncAttrVersion TEXT");
    localStringBuilder.append(", ");
    locala.columns[13] = "lastSyncAttrTimeInSecond";
    locala.vmt.put("lastSyncAttrTimeInSecond", "LONG default '0' ");
    localStringBuilder.append(" lastSyncAttrTimeInSecond LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[14] = "debugEnabled";
    locala.vmt.put("debugEnabled", "INTEGER default 'false' ");
    localStringBuilder.append(" debugEnabled INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[15] = "roundedSquareIcon";
    locala.vmt.put("roundedSquareIcon", "TEXT");
    localStringBuilder.append(" roundedSquareIcon TEXT");
    locala.columns[16] = "rowid";
    locala.vmu = localStringBuilder.toString();
    hJW = locala;
    GMTrace.o(17270063497216L, 128672);
  }
  
  n()
  {
    GMTrace.i(17269795061760L, 128670);
    GMTrace.o(17269795061760L, 128670);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(17269929279488L, 128671);
    c.a locala = hJW;
    GMTrace.o(17269929279488L, 128671);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\config\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */