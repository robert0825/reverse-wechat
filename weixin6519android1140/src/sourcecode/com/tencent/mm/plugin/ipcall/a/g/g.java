package com.tencent.mm.plugin.ipcall.a.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.bv;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class g
  extends bv
{
  public static c.a fTp;
  
  static
  {
    GMTrace.i(11578426523648L, 86266);
    c.a locala = new c.a();
    locala.gZM = new Field[7];
    locala.columns = new String[8];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "svrId";
    locala.vmt.put("svrId", "LONG PRIMARY KEY ");
    localStringBuilder.append(" svrId LONG PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "svrId";
    locala.columns[1] = "isRead";
    locala.vmt.put("isRead", "SHORT default '0' ");
    localStringBuilder.append(" isRead SHORT default '0' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "title";
    locala.vmt.put("title", "TEXT");
    localStringBuilder.append(" title TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "content";
    locala.vmt.put("content", "TEXT");
    localStringBuilder.append(" content TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "pushTime";
    locala.vmt.put("pushTime", "LONG");
    localStringBuilder.append(" pushTime LONG");
    localStringBuilder.append(", ");
    locala.columns[5] = "msgType";
    locala.vmt.put("msgType", "INTEGER");
    localStringBuilder.append(" msgType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "descUrl";
    locala.vmt.put("descUrl", "TEXT");
    localStringBuilder.append(" descUrl TEXT");
    locala.columns[7] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(11578426523648L, 86266);
  }
  
  public g()
  {
    GMTrace.i(11578158088192L, 86264);
    GMTrace.o(11578158088192L, 86264);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(11578292305920L, 86265);
    c.a locala = fTp;
    GMTrace.o(11578292305920L, 86265);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\g\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */