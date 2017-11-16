package com.tencent.mm.bc;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.aw;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class f
  extends aw
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(1422842134528L, 10601);
    c.a locala = new c.a();
    locala.gZM = new Field[8];
    locala.columns = new String[9];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "msgContent";
    locala.vmt.put("msgContent", "TEXT default '' ");
    localStringBuilder.append(" msgContent TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[1] = "isSend";
    locala.vmt.put("isSend", "INTEGER default '0' ");
    localStringBuilder.append(" isSend INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "talker";
    locala.vmt.put("talker", "TEXT default '' ");
    localStringBuilder.append(" talker TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "encryptTalker";
    locala.vmt.put("encryptTalker", "TEXT default '' ");
    localStringBuilder.append(" encryptTalker TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[4] = "svrId";
    locala.vmt.put("svrId", "LONG default '0' ");
    localStringBuilder.append(" svrId LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[5] = "type";
    locala.vmt.put("type", "INTEGER default '0' ");
    localStringBuilder.append(" type INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[6] = "createTime";
    locala.vmt.put("createTime", "LONG default '0' ");
    localStringBuilder.append(" createTime LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[7] = "chatroomName";
    locala.vmt.put("chatroomName", "TEXT default '' ");
    localStringBuilder.append(" chatroomName TEXT default '' ");
    locala.columns[8] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(1422842134528L, 10601);
  }
  
  public f()
  {
    GMTrace.i(1422439481344L, 10598);
    GMTrace.o(1422439481344L, 10598);
  }
  
  public final boolean MC()
  {
    GMTrace.i(1422707916800L, 10600);
    if (this.field_isSend % 2 == 0)
    {
      GMTrace.o(1422707916800L, 10600);
      return true;
    }
    GMTrace.o(1422707916800L, 10600);
    return false;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(1422573699072L, 10599);
    c.a locala = fTp;
    GMTrace.o(1422573699072L, 10599);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bc\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */