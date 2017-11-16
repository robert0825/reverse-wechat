package com.tencent.mm.storage.emotion;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.aq;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class e
  extends aq
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(1539477340160L, 11470);
    c.a locala = new c.a();
    locala.gZM = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "groupID";
    locala.vmt.put("groupID", "TEXT");
    localStringBuilder.append(" groupID TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "desc";
    locala.vmt.put("desc", "TEXT");
    localStringBuilder.append(" desc TEXT");
    locala.columns[2] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(1539477340160L, 11470);
  }
  
  public e()
  {
    GMTrace.i(1539074686976L, 11467);
    GMTrace.o(1539074686976L, 11467);
  }
  
  public e(String paramString1, String paramString2)
  {
    GMTrace.i(1539208904704L, 11468);
    this.field_groupID = paramString1;
    this.field_desc = paramString2;
    GMTrace.o(1539208904704L, 11468);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(1539343122432L, 11469);
    GMTrace.o(1539343122432L, 11469);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\emotion\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */