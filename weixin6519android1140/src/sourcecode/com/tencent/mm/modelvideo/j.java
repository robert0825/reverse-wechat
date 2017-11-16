package com.tencent.mm.modelvideo;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.cy;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class j
  extends cy
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(333262618624L, 2483);
    c.a locala = new c.a();
    locala.gZM = new Field[8];
    locala.columns = new String[9];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "localId";
    locala.vmt.put("localId", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" localId INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "localId";
    locala.columns[1] = "fileName";
    locala.vmt.put("fileName", "TEXT");
    localStringBuilder.append(" fileName TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "fileNameHash";
    locala.vmt.put("fileNameHash", "INTEGER");
    localStringBuilder.append(" fileNameHash INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "fileMd5";
    locala.vmt.put("fileMd5", "TEXT default '' ");
    localStringBuilder.append(" fileMd5 TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[4] = "fileLength";
    locala.vmt.put("fileLength", "LONG default '0' ");
    localStringBuilder.append(" fileLength LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[5] = "fileStatus";
    locala.vmt.put("fileStatus", "INTEGER default '0' ");
    localStringBuilder.append(" fileStatus INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[6] = "fileDuration";
    locala.vmt.put("fileDuration", "INTEGER default '0' ");
    localStringBuilder.append(" fileDuration INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[7] = "createTime";
    locala.vmt.put("createTime", "LONG default '0' ");
    localStringBuilder.append(" createTime LONG default '0' ");
    locala.columns[8] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(333262618624L, 2483);
  }
  
  public j()
  {
    GMTrace.i(332859965440L, 2480);
    GMTrace.o(332859965440L, 2480);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(332994183168L, 2481);
    c.a locala = fTp;
    GMTrace.o(332994183168L, 2481);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvideo\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */