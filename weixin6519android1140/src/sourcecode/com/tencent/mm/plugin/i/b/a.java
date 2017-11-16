package com.tencent.mm.plugin.i.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ec;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a
  extends ec
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(20657987387392L, 153914);
    c.a locala = new c.a();
    locala.gZM = new Field[7];
    locala.columns = new String[8];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "msgId";
    locala.vmt.put("msgId", "LONG");
    localStringBuilder.append(" msgId LONG");
    localStringBuilder.append(", ");
    locala.columns[1] = "username";
    locala.vmt.put("username", "TEXT");
    localStringBuilder.append(" username TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "msgType";
    locala.vmt.put("msgType", "INTEGER");
    localStringBuilder.append(" msgType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "msgSubType";
    locala.vmt.put("msgSubType", "INTEGER");
    localStringBuilder.append(" msgSubType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "path";
    locala.vmt.put("path", "TEXT");
    localStringBuilder.append(" path TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "size";
    locala.vmt.put("size", "LONG");
    localStringBuilder.append(" size LONG");
    localStringBuilder.append(", ");
    locala.columns[6] = "msgtime";
    locala.vmt.put("msgtime", "LONG");
    localStringBuilder.append(" msgtime LONG");
    locala.columns[7] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(20657987387392L, 153914);
  }
  
  public a()
  {
    GMTrace.i(20657450516480L, 153910);
    GMTrace.o(20657450516480L, 153910);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(20657718951936L, 153912);
    super.b(paramCursor);
    GMTrace.o(20657718951936L, 153912);
  }
  
  public final String toString()
  {
    GMTrace.i(20657853169664L, 153913);
    String str = "{  sys row id: " + this.vmr + " msg id : " + this.field_msgId + " msg talker: " + this.field_username + " msg type : " + this.field_msgType + " msg sub type : " + this.field_msgSubType + " path : " + this.field_path + " size : " + this.field_size + " msgtime : " + this.field_msgtime + " } ";
    GMTrace.o(20657853169664L, 153913);
    return str;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(20657584734208L, 153911);
    c.a locala = fTp;
    GMTrace.o(20657584734208L, 153911);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\i\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */