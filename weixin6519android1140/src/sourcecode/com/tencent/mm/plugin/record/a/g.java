package com.tencent.mm.plugin.record.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.co;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class g
  extends co
  implements f.a
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(7495791673344L, 55848);
    c.a locala = new c.a();
    locala.gZM = new Field[15];
    locala.columns = new String[16];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "localId";
    locala.vmt.put("localId", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" localId INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "localId";
    locala.columns[1] = "recordLocalId";
    locala.vmt.put("recordLocalId", "INTEGER");
    localStringBuilder.append(" recordLocalId INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "toUser";
    locala.vmt.put("toUser", "TEXT default '' ");
    localStringBuilder.append(" toUser TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "dataId";
    locala.vmt.put("dataId", "TEXT");
    localStringBuilder.append(" dataId TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "mediaId";
    locala.vmt.put("mediaId", "TEXT");
    localStringBuilder.append(" mediaId TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "path";
    locala.vmt.put("path", "TEXT");
    localStringBuilder.append(" path TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "cdnUrl";
    locala.vmt.put("cdnUrl", "TEXT");
    localStringBuilder.append(" cdnUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "cdnKey";
    locala.vmt.put("cdnKey", "TEXT");
    localStringBuilder.append(" cdnKey TEXT");
    localStringBuilder.append(", ");
    locala.columns[8] = "totalLen";
    locala.vmt.put("totalLen", "INTEGER default '0' ");
    localStringBuilder.append(" totalLen INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[9] = "isThumb";
    locala.vmt.put("isThumb", "INTEGER default 'false' ");
    localStringBuilder.append(" isThumb INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[10] = "offset";
    locala.vmt.put("offset", "INTEGER default '0' ");
    localStringBuilder.append(" offset INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[11] = "type";
    locala.vmt.put("type", "INTEGER default '0' ");
    localStringBuilder.append(" type INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[12] = "fileType";
    locala.vmt.put("fileType", "INTEGER default '5' ");
    localStringBuilder.append(" fileType INTEGER default '5' ");
    localStringBuilder.append(", ");
    locala.columns[13] = "status";
    locala.vmt.put("status", "INTEGER default '0' ");
    localStringBuilder.append(" status INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[14] = "errCode";
    locala.vmt.put("errCode", "INTEGER default '0' ");
    localStringBuilder.append(" errCode INTEGER default '0' ");
    locala.columns[15] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(7495791673344L, 55848);
  }
  
  public g()
  {
    GMTrace.i(7495254802432L, 55844);
    GMTrace.o(7495254802432L, 55844);
  }
  
  public final int baI()
  {
    GMTrace.i(7495523237888L, 55846);
    int i = this.field_localId;
    GMTrace.o(7495523237888L, 55846);
    return i;
  }
  
  public final String toString()
  {
    GMTrace.i(7495657455616L, 55847);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("localid[").append(this.field_localId).append("]\n");
    ((StringBuilder)localObject).append("recordId[").append(this.field_recordLocalId).append("]\n");
    ((StringBuilder)localObject).append("mediaId[").append(this.field_mediaId).append("]\n");
    ((StringBuilder)localObject).append("dataId[").append(this.field_dataId).append("]\n");
    ((StringBuilder)localObject).append("path[").append(this.field_path).append("]\n");
    ((StringBuilder)localObject).append("cdnurl[").append(this.field_cdnUrl).append("]\n");
    ((StringBuilder)localObject).append("cdnkey[").append(this.field_cdnKey).append("]\n");
    ((StringBuilder)localObject).append("type[").append(this.field_type).append("]\n");
    ((StringBuilder)localObject).append("errCode[").append(this.field_errCode).append("]\n");
    ((StringBuilder)localObject).append("fileType[").append(this.field_fileType).append("]\n");
    ((StringBuilder)localObject).append("isThumb[").append(this.field_isThumb).append("]\n");
    ((StringBuilder)localObject).append("status[").append(this.field_status).append("]\n");
    ((StringBuilder)localObject).append("totalLen[").append(this.field_totalLen).append("]\n");
    ((StringBuilder)localObject).append("offset[").append(this.field_offset).append("]\n");
    ((StringBuilder)localObject).append("toUser[").append(this.field_toUser).append("]\n");
    localObject = ((StringBuilder)localObject).toString();
    GMTrace.o(7495657455616L, 55847);
    return (String)localObject;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(7495389020160L, 55845);
    c.a locala = fTp;
    GMTrace.o(7495389020160L, 55845);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\record\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */