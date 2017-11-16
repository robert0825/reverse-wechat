package com.tencent.mm.plugin.sns.storage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.dc;
import com.tencent.mm.protocal.c.bgm;
import com.tencent.mm.protocal.c.tf;
import com.tencent.mm.protocal.c.ut;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.Map;

public final class k
  extends dc
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(8185939230720L, 60990);
    c.a locala = new c.a();
    locala.gZM = new Field[16];
    locala.columns = new String[17];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "userName";
    locala.vmt.put("userName", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" userName TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "userName";
    locala.columns[1] = "md5";
    locala.vmt.put("md5", "TEXT");
    localStringBuilder.append(" md5 TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "newerIds";
    locala.vmt.put("newerIds", "TEXT");
    localStringBuilder.append(" newerIds TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "bgId";
    locala.vmt.put("bgId", "TEXT");
    localStringBuilder.append(" bgId TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "bgUrl";
    locala.vmt.put("bgUrl", "TEXT");
    localStringBuilder.append(" bgUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "older_bgId";
    locala.vmt.put("older_bgId", "TEXT");
    localStringBuilder.append(" older_bgId TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "local_flag";
    locala.vmt.put("local_flag", "INTEGER");
    localStringBuilder.append(" local_flag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[7] = "istyle";
    locala.vmt.put("istyle", "INTEGER");
    localStringBuilder.append(" istyle INTEGER");
    localStringBuilder.append(", ");
    locala.columns[8] = "iFlag";
    locala.vmt.put("iFlag", "INTEGER");
    localStringBuilder.append(" iFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "icount";
    locala.vmt.put("icount", "INTEGER");
    localStringBuilder.append(" icount INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "faultS";
    locala.vmt.put("faultS", "BLOB");
    localStringBuilder.append(" faultS BLOB");
    localStringBuilder.append(", ");
    locala.columns[11] = "snsBgId";
    locala.vmt.put("snsBgId", "LONG");
    localStringBuilder.append(" snsBgId LONG");
    localStringBuilder.append(", ");
    locala.columns[12] = "snsuser";
    locala.vmt.put("snsuser", "BLOB");
    localStringBuilder.append(" snsuser BLOB");
    localStringBuilder.append(", ");
    locala.columns[13] = "adsession";
    locala.vmt.put("adsession", "BLOB");
    localStringBuilder.append(" adsession BLOB");
    localStringBuilder.append(", ");
    locala.columns[14] = "lastFirstPageRequestErrCode";
    locala.vmt.put("lastFirstPageRequestErrCode", "INTEGER");
    localStringBuilder.append(" lastFirstPageRequestErrCode INTEGER");
    localStringBuilder.append(", ");
    locala.columns[15] = "lastFirstPageRequestErrType";
    locala.vmt.put("lastFirstPageRequestErrType", "INTEGER");
    localStringBuilder.append(" lastFirstPageRequestErrType INTEGER");
    locala.columns[16] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(8185939230720L, 60990);
  }
  
  public k()
  {
    GMTrace.i(8185133924352L, 60984);
    GMTrace.o(8185133924352L, 60984);
  }
  
  public final void blM()
  {
    GMTrace.i(8185402359808L, 60986);
    this.field_local_flag &= 0xFFFFFFFD;
    GMTrace.o(8185402359808L, 60986);
  }
  
  public final boolean blN()
  {
    GMTrace.i(8185536577536L, 60987);
    if ((this.field_local_flag & 0x2) > 0)
    {
      GMTrace.o(8185536577536L, 60987);
      return true;
    }
    GMTrace.o(8185536577536L, 60987);
    return false;
  }
  
  public final bgm blO()
  {
    GMTrace.i(8185670795264L, 60988);
    try
    {
      bgm localbgm = (bgm)new bgm().aD(this.field_snsuser);
      GMTrace.o(8185670795264L, 60988);
      return localbgm;
    }
    catch (Exception localException)
    {
      GMTrace.o(8185670795264L, 60988);
    }
    return null;
  }
  
  public final tf blP()
  {
    GMTrace.i(8185805012992L, 60989);
    new ut();
    localObject1 = new tf();
    Object localObject2 = localObject1;
    if (!bg.bq(this.field_faultS)) {}
    try
    {
      localObject2 = (ut)new ut().aD(this.field_faultS);
      if (((ut)localObject2).umX.size() <= 0) {
        break label95;
      }
      localObject2 = (tf)((ut)localObject2).umX.getFirst();
      localObject1 = localObject2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject3 = localObject1;
      }
    }
    localObject2 = localObject1;
    GMTrace.o(8185805012992L, 60989);
    return (tf)localObject2;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(8185268142080L, 60985);
    c.a locala = fTp;
    GMTrace.o(8185268142080L, 60985);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */