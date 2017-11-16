package com.tencent.mm.storage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.dg;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class bb
  extends dg
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(13293997522944L, 99048);
    c.a locala = new c.a();
    locala.gZM = new Field[5];
    locala.columns = new String[6];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "encryptUsername";
    locala.vmt.put("encryptUsername", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" encryptUsername TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "encryptUsername";
    locala.columns[1] = "conRemark";
    locala.vmt.put("conRemark", "TEXT default '' ");
    localStringBuilder.append(" conRemark TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "contactLabels";
    locala.vmt.put("contactLabels", "TEXT default '' ");
    localStringBuilder.append(" contactLabels TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "conDescription";
    locala.vmt.put("conDescription", "TEXT default '' ");
    localStringBuilder.append(" conDescription TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[4] = "conPhone";
    locala.vmt.put("conPhone", "TEXT default '' ");
    localStringBuilder.append(" conPhone TEXT default '' ");
    locala.columns[5] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(13293997522944L, 99048);
  }
  
  public bb()
  {
    GMTrace.i(13293729087488L, 99046);
    this.field_encryptUsername = "";
    this.field_conRemark = "";
    GMTrace.o(13293729087488L, 99046);
  }
  
  public bb(String paramString)
  {
    this();
    GMTrace.i(13293460652032L, 99044);
    this.field_conRemark = "";
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    this.field_encryptUsername = str;
    GMTrace.o(13293460652032L, 99044);
  }
  
  public bb(String paramString1, String paramString2)
  {
    this();
    GMTrace.i(13293594869760L, 99045);
    String str = paramString1;
    if (paramString1 == null) {
      str = "";
    }
    this.field_encryptUsername = str;
    paramString1 = paramString2;
    if (paramString2 == null) {
      paramString1 = "";
    }
    this.field_conRemark = paramString1;
    GMTrace.o(13293594869760L, 99045);
  }
  
  protected final Object clone()
  {
    GMTrace.i(13293863305216L, 99047);
    Object localObject = super.clone();
    GMTrace.o(13293863305216L, 99047);
    return localObject;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(13293326434304L, 99043);
    c.a locala = fTp;
    GMTrace.o(13293326434304L, 99043);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */