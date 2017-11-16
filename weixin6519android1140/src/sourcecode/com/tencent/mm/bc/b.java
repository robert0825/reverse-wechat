package com.tencent.mm.bc;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.av;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class b
  extends av
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(1421768392704L, 10593);
    c.a locala = new c.a();
    locala.gZM = new Field[17];
    locala.columns = new String[18];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "talker";
    locala.vmt.put("talker", "TEXT default '0'  PRIMARY KEY ");
    localStringBuilder.append(" talker TEXT default '0'  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "talker";
    locala.columns[1] = "encryptTalker";
    locala.vmt.put("encryptTalker", "TEXT default '' ");
    localStringBuilder.append(" encryptTalker TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "displayName";
    locala.vmt.put("displayName", "TEXT default '' ");
    localStringBuilder.append(" displayName TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "state";
    locala.vmt.put("state", "INTEGER default '0' ");
    localStringBuilder.append(" state INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[4] = "lastModifiedTime";
    locala.vmt.put("lastModifiedTime", "LONG default '0' ");
    localStringBuilder.append(" lastModifiedTime LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[5] = "isNew";
    locala.vmt.put("isNew", "INTEGER default '0' ");
    localStringBuilder.append(" isNew INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[6] = "addScene";
    locala.vmt.put("addScene", "INTEGER default '0' ");
    localStringBuilder.append(" addScene INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[7] = "fmsgSysRowId";
    locala.vmt.put("fmsgSysRowId", "LONG default '0' ");
    localStringBuilder.append(" fmsgSysRowId LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[8] = "fmsgIsSend";
    locala.vmt.put("fmsgIsSend", "INTEGER default '0' ");
    localStringBuilder.append(" fmsgIsSend INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[9] = "fmsgType";
    locala.vmt.put("fmsgType", "INTEGER default '0' ");
    localStringBuilder.append(" fmsgType INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[10] = "fmsgContent";
    locala.vmt.put("fmsgContent", "TEXT default '' ");
    localStringBuilder.append(" fmsgContent TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[11] = "recvFmsgType";
    locala.vmt.put("recvFmsgType", "INTEGER default '0' ");
    localStringBuilder.append(" recvFmsgType INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[12] = "contentFromUsername";
    locala.vmt.put("contentFromUsername", "TEXT default '' ");
    localStringBuilder.append(" contentFromUsername TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[13] = "contentNickname";
    locala.vmt.put("contentNickname", "TEXT default '' ");
    localStringBuilder.append(" contentNickname TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[14] = "contentPhoneNumMD5";
    locala.vmt.put("contentPhoneNumMD5", "TEXT default '' ");
    localStringBuilder.append(" contentPhoneNumMD5 TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[15] = "contentFullPhoneNumMD5";
    locala.vmt.put("contentFullPhoneNumMD5", "TEXT default '' ");
    localStringBuilder.append(" contentFullPhoneNumMD5 TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[16] = "contentVerifyContent";
    locala.vmt.put("contentVerifyContent", "TEXT default '' ");
    localStringBuilder.append(" contentVerifyContent TEXT default '' ");
    locala.columns[17] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(1421768392704L, 10593);
  }
  
  public b()
  {
    GMTrace.i(1421499957248L, 10591);
    GMTrace.o(1421499957248L, 10591);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(1421634174976L, 10592);
    c.a locala = fTp;
    GMTrace.o(1421634174976L, 10592);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bc\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */