package com.tencent.mm.storage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.di;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class bd
  extends di
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(1592090689536L, 11862);
    c.a locala = new c.a();
    locala.gZM = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "openId";
    locala.vmt.put("openId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" openId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "openId";
    locala.columns[1] = "appId";
    locala.vmt.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "username";
    locala.vmt.put("username", "TEXT");
    localStringBuilder.append(" username TEXT");
    locala.columns[3] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(1592090689536L, 11862);
  }
  
  public bd()
  {
    GMTrace.i(1591822254080L, 11860);
    GMTrace.o(1591822254080L, 11860);
  }
  
  public bd(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(1591956471808L, 11861);
    this.field_appId = paramString1;
    this.field_username = paramString2;
    this.field_openId = paramString3;
    GMTrace.o(1591956471808L, 11861);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(1591688036352L, 11859);
    c.a locala = fTp;
    GMTrace.o(1591688036352L, 11859);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\storage\bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */