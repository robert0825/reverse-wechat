package com.tencent.mm.af;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.z;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class g
  extends z
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(4552262680576L, 33917);
    c.a locala = new c.a();
    locala.gZM = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "openId";
    locala.vmt.put("openId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" openId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "openId";
    locala.columns[1] = "brandUsername";
    locala.vmt.put("brandUsername", "TEXT default '' ");
    localStringBuilder.append(" brandUsername TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "headImgUrl";
    locala.vmt.put("headImgUrl", "TEXT");
    localStringBuilder.append(" headImgUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "nickname";
    locala.vmt.put("nickname", "TEXT");
    localStringBuilder.append(" nickname TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "kfType";
    locala.vmt.put("kfType", "INTEGER");
    localStringBuilder.append(" kfType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "updateTime";
    locala.vmt.put("updateTime", "LONG");
    localStringBuilder.append(" updateTime LONG");
    locala.columns[6] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(4552262680576L, 33917);
  }
  
  public g()
  {
    GMTrace.i(4551994245120L, 33915);
    GMTrace.o(4551994245120L, 33915);
  }
  
  public g(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, long paramLong)
  {
    GMTrace.i(4552128462848L, 33916);
    this.field_openId = paramString1;
    this.field_brandUsername = paramString2;
    this.field_headImgUrl = paramString3;
    this.field_nickname = paramString4;
    this.field_kfType = paramInt;
    this.field_updateTime = paramLong;
    GMTrace.o(4552128462848L, 33916);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(4551860027392L, 33914);
    c.a locala = fTp;
    GMTrace.o(4551860027392L, 33914);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */