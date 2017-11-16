package com.tencent.mm.pluginsdk.model.app;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.g;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class b
  extends g
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(803024666624L, 5983);
    c.a locala = new c.a();
    locala.gZM = new Field[20];
    locala.columns = new String[21];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "appId";
    locala.vmt.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "sdkVer";
    locala.vmt.put("sdkVer", "LONG");
    localStringBuilder.append(" sdkVer LONG");
    localStringBuilder.append(", ");
    locala.columns[2] = "mediaSvrId";
    locala.vmt.put("mediaSvrId", "TEXT");
    localStringBuilder.append(" mediaSvrId TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "mediaId";
    locala.vmt.put("mediaId", "TEXT");
    localStringBuilder.append(" mediaId TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "clientAppDataId";
    locala.vmt.put("clientAppDataId", "TEXT");
    localStringBuilder.append(" clientAppDataId TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "type";
    locala.vmt.put("type", "LONG");
    localStringBuilder.append(" type LONG");
    localStringBuilder.append(", ");
    locala.columns[6] = "totalLen";
    locala.vmt.put("totalLen", "LONG");
    localStringBuilder.append(" totalLen LONG");
    localStringBuilder.append(", ");
    locala.columns[7] = "offset";
    locala.vmt.put("offset", "LONG");
    localStringBuilder.append(" offset LONG");
    localStringBuilder.append(", ");
    locala.columns[8] = "status";
    locala.vmt.put("status", "LONG");
    localStringBuilder.append(" status LONG");
    localStringBuilder.append(", ");
    locala.columns[9] = "isUpload";
    locala.vmt.put("isUpload", "INTEGER");
    localStringBuilder.append(" isUpload INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "createTime";
    locala.vmt.put("createTime", "LONG");
    localStringBuilder.append(" createTime LONG");
    localStringBuilder.append(", ");
    locala.columns[11] = "lastModifyTime";
    locala.vmt.put("lastModifyTime", "LONG");
    localStringBuilder.append(" lastModifyTime LONG");
    localStringBuilder.append(", ");
    locala.columns[12] = "fileFullPath";
    locala.vmt.put("fileFullPath", "TEXT");
    localStringBuilder.append(" fileFullPath TEXT");
    localStringBuilder.append(", ");
    locala.columns[13] = "fullXml";
    locala.vmt.put("fullXml", "TEXT");
    localStringBuilder.append(" fullXml TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "msgInfoId";
    locala.vmt.put("msgInfoId", "LONG");
    localStringBuilder.append(" msgInfoId LONG");
    localStringBuilder.append(", ");
    locala.columns[15] = "netTimes";
    locala.vmt.put("netTimes", "LONG");
    localStringBuilder.append(" netTimes LONG");
    localStringBuilder.append(", ");
    locala.columns[16] = "isUseCdn";
    locala.vmt.put("isUseCdn", "INTEGER");
    localStringBuilder.append(" isUseCdn INTEGER");
    localStringBuilder.append(", ");
    locala.columns[17] = "signature";
    locala.vmt.put("signature", "TEXT");
    localStringBuilder.append(" signature TEXT");
    localStringBuilder.append(", ");
    locala.columns[18] = "fakeAeskey";
    locala.vmt.put("fakeAeskey", "TEXT");
    localStringBuilder.append(" fakeAeskey TEXT");
    localStringBuilder.append(", ");
    locala.columns[19] = "fakeSignature";
    locala.vmt.put("fakeSignature", "TEXT");
    localStringBuilder.append(" fakeSignature TEXT");
    locala.columns[20] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(803024666624L, 5983);
  }
  
  public b()
  {
    GMTrace.i(802756231168L, 5981);
    this.field_netTimes = 0L;
    GMTrace.o(802756231168L, 5981);
  }
  
  public final boolean aDI()
  {
    GMTrace.i(802890448896L, 5982);
    if (this.field_totalLen <= 0L)
    {
      GMTrace.o(802890448896L, 5982);
      return false;
    }
    if (this.field_offset == this.field_totalLen)
    {
      GMTrace.o(802890448896L, 5982);
      return true;
    }
    GMTrace.o(802890448896L, 5982);
    return false;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(802622013440L, 5980);
    c.a locala = fTp;
    GMTrace.o(802622013440L, 5980);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */