package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.cl;
import com.tencent.mm.protocal.c.jw;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class aj
  extends cl
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(4907402788864L, 36563);
    c.a locala = new c.a();
    locala.gZM = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "cardUserId";
    locala.vmt.put("cardUserId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" cardUserId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "cardUserId";
    locala.columns[1] = "retryCount";
    locala.vmt.put("retryCount", "INTEGER");
    localStringBuilder.append(" retryCount INTEGER");
    locala.columns[2] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(4907402788864L, 36563);
  }
  
  public aj()
  {
    GMTrace.i(4906731700224L, 36558);
    GMTrace.o(4906731700224L, 36558);
  }
  
  public static aj a(jw paramjw)
  {
    GMTrace.i(4907268571136L, 36562);
    aj localaj = new aj();
    localaj.field_cardUserId = paramjw.uar;
    GMTrace.o(4907268571136L, 36562);
    return localaj;
  }
  
  public final boolean equals(Object paramObject)
  {
    GMTrace.i(4907000135680L, 36560);
    if (!(paramObject instanceof aj))
    {
      GMTrace.o(4907000135680L, 36560);
      return false;
    }
    paramObject = (aj)paramObject;
    if (this.field_cardUserId == ((aj)paramObject).field_cardUserId)
    {
      GMTrace.o(4907000135680L, 36560);
      return true;
    }
    GMTrace.o(4907000135680L, 36560);
    return false;
  }
  
  public final int hashCode()
  {
    GMTrace.i(4907134353408L, 36561);
    if (this.field_cardUserId == null)
    {
      GMTrace.o(4907134353408L, 36561);
      return 0;
    }
    int i = this.field_cardUserId.hashCode();
    GMTrace.o(4907134353408L, 36561);
    return i;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(4906865917952L, 36559);
    c.a locala = fTp;
    GMTrace.o(4906865917952L, 36559);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */