package com.tencent.mm.plugin.card.sharecard.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.cx;
import com.tencent.mm.protocal.c.bdp;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class n
  extends cx
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(5071819505664L, 37788);
    c.a locala = new c.a();
    locala.gZM = new Field[5];
    locala.columns = new String[6];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "card_id";
    locala.vmt.put("card_id", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" card_id TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "card_id";
    locala.columns[1] = "state_flag";
    locala.vmt.put("state_flag", "INTEGER");
    localStringBuilder.append(" state_flag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "update_time";
    locala.vmt.put("update_time", "LONG");
    localStringBuilder.append(" update_time LONG");
    localStringBuilder.append(", ");
    locala.columns[3] = "seq";
    locala.vmt.put("seq", "LONG");
    localStringBuilder.append(" seq LONG");
    localStringBuilder.append(", ");
    locala.columns[4] = "retryCount";
    locala.vmt.put("retryCount", "INTEGER");
    localStringBuilder.append(" retryCount INTEGER");
    locala.columns[5] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(5071819505664L, 37788);
  }
  
  public n()
  {
    GMTrace.i(5071148417024L, 37783);
    GMTrace.o(5071148417024L, 37783);
  }
  
  public static n b(bdp parambdp)
  {
    GMTrace.i(5071685287936L, 37787);
    n localn = new n();
    localn.field_card_id = parambdp.eTJ;
    localn.field_update_time = parambdp.ubf;
    localn.field_state_flag = parambdp.jAW;
    localn.field_seq = parambdp.uPF;
    localn.field_retryCount = 10;
    GMTrace.o(5071685287936L, 37787);
    return localn;
  }
  
  public final boolean equals(Object paramObject)
  {
    GMTrace.i(5071416852480L, 37785);
    if (!(paramObject instanceof n))
    {
      GMTrace.o(5071416852480L, 37785);
      return false;
    }
    paramObject = (n)paramObject;
    if (this.field_card_id == ((n)paramObject).field_card_id)
    {
      GMTrace.o(5071416852480L, 37785);
      return true;
    }
    GMTrace.o(5071416852480L, 37785);
    return false;
  }
  
  public final int hashCode()
  {
    GMTrace.i(5071551070208L, 37786);
    if (this.field_card_id == null)
    {
      GMTrace.o(5071551070208L, 37786);
      return 0;
    }
    int i = this.field_card_id.hashCode();
    GMTrace.o(5071551070208L, 37786);
    return i;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(5071282634752L, 37784);
    c.a locala = fTp;
    GMTrace.o(5071282634752L, 37784);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\sharecard\model\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */