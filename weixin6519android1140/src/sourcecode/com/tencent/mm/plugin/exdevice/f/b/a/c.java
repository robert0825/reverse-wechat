package com.tencent.mm.plugin.exdevice.f.b.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.bs;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class c
  extends bs
{
  public static c.a fTp;
  
  static
  {
    GMTrace.i(11190805725184L, 83378);
    c.a locala = new c.a();
    locala.gZM = new Field[5];
    locala.columns = new String[6];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "appusername";
    locala.vmt.put("appusername", "TEXT");
    localStringBuilder.append(" appusername TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "rankID";
    locala.vmt.put("rankID", "TEXT");
    localStringBuilder.append(" rankID TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "username";
    locala.vmt.put("username", "TEXT");
    localStringBuilder.append(" username TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "step";
    locala.vmt.put("step", "INTEGER");
    localStringBuilder.append(" step INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "sort";
    locala.vmt.put("sort", "INTEGER default '0' ");
    localStringBuilder.append(" sort INTEGER default '0' ");
    locala.columns[5] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(11190805725184L, 83378);
  }
  
  public c()
  {
    GMTrace.i(11190403072000L, 83375);
    GMTrace.o(11190403072000L, 83375);
  }
  
  public final String toString()
  {
    GMTrace.i(11190671507456L, 83377);
    String str = "{" + "username: " + this.field_username + " step: " + this.field_step + " rankId: " + this.field_rankID + " appname: " + this.field_appusername;
    str = str + "}";
    GMTrace.o(11190671507456L, 83377);
    return str;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(11190537289728L, 83376);
    c.a locala = fTp;
    GMTrace.o(11190537289728L, 83376);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\f\b\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */