package com.tencent.mm.plugin.aa.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a
  extends com.tencent.mm.g.b.a
{
  public static c.a fTp;
  
  static
  {
    GMTrace.i(5587886669824L, 41633);
    c.a locala = new c.a();
    locala.gZM = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "payMsgId";
    locala.vmt.put("payMsgId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" payMsgId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "payMsgId";
    locala.columns[1] = "insertmsg";
    locala.vmt.put("insertmsg", "INTEGER");
    localStringBuilder.append(" insertmsg INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "chatroom";
    locala.vmt.put("chatroom", "TEXT");
    localStringBuilder.append(" chatroom TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "msgId";
    locala.vmt.put("msgId", "LONG");
    localStringBuilder.append(" msgId LONG");
    locala.columns[4] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(5587886669824L, 41633);
  }
  
  public a()
  {
    GMTrace.i(5587618234368L, 41631);
    GMTrace.o(5587618234368L, 41631);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(5587752452096L, 41632);
    c.a locala = fTp;
    GMTrace.o(5587752452096L, 41632);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\aa\a\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */