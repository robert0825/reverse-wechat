package com.tencent.mm.af.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.w;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import java.lang.reflect.Field;
import java.util.Map;

public final class j
  extends w
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(4558034042880L, 33960);
    c.a locala = new c.a();
    locala.gZM = new Field[10];
    locala.columns = new String[11];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "userId";
    locala.vmt.put("userId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" userId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "userId";
    locala.columns[1] = "userName";
    locala.vmt.put("userName", "TEXT default '' ");
    localStringBuilder.append(" userName TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "userNamePY";
    locala.vmt.put("userNamePY", "TEXT default '' ");
    localStringBuilder.append(" userNamePY TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "brandUserName";
    locala.vmt.put("brandUserName", "TEXT default '' ");
    localStringBuilder.append(" brandUserName TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[4] = "UserVersion";
    locala.vmt.put("UserVersion", "INTEGER default '-1' ");
    localStringBuilder.append(" UserVersion INTEGER default '-1' ");
    localStringBuilder.append(", ");
    locala.columns[5] = "needToUpdate";
    locala.vmt.put("needToUpdate", "INTEGER default 'true' ");
    localStringBuilder.append(" needToUpdate INTEGER default 'true' ");
    localStringBuilder.append(", ");
    locala.columns[6] = "headImageUrl";
    locala.vmt.put("headImageUrl", "TEXT");
    localStringBuilder.append(" headImageUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "profileUrl";
    locala.vmt.put("profileUrl", "TEXT");
    localStringBuilder.append(" profileUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[8] = "bitFlag";
    locala.vmt.put("bitFlag", "INTEGER default '0' ");
    localStringBuilder.append(" bitFlag INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[9] = "addMemberUrl";
    locala.vmt.put("addMemberUrl", "TEXT");
    localStringBuilder.append(" addMemberUrl TEXT");
    locala.columns[10] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(4558034042880L, 33960);
  }
  
  public j()
  {
    GMTrace.i(4557497171968L, 33956);
    GMTrace.o(4557497171968L, 33956);
  }
  
  public final boolean FV()
  {
    GMTrace.i(4557899825152L, 33959);
    if (this.field_needToUpdate)
    {
      GMTrace.o(4557899825152L, 33959);
      return true;
    }
    if ((bg.nm(this.field_profileUrl)) && (bg.nm(this.field_headImageUrl)))
    {
      GMTrace.o(4557899825152L, 33959);
      return true;
    }
    if ((bg.nm(this.field_userNamePY)) && (!bg.nm(this.field_userName)))
    {
      GMTrace.o(4557899825152L, 33959);
      return true;
    }
    GMTrace.o(4557899825152L, 33959);
    return false;
  }
  
  public final boolean fN(int paramInt)
  {
    GMTrace.i(4557765607424L, 33958);
    if ((this.field_bitFlag & paramInt) != 0)
    {
      GMTrace.o(4557765607424L, 33958);
      return true;
    }
    GMTrace.o(4557765607424L, 33958);
    return false;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(4557631389696L, 33957);
    c.a locala = fTp;
    GMTrace.o(4557631389696L, 33957);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */