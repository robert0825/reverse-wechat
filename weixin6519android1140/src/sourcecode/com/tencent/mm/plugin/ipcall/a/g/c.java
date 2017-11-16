package com.tencent.mm.plugin.ipcall.a.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.bu;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;

public final class c
  extends bu
{
  public static c.a fTp;
  public ArrayList<String> mmP;
  
  static
  {
    GMTrace.i(11576950128640L, 86255);
    c.a locala = new c.a();
    locala.gZM = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "wechatUsername";
    locala.vmt.put("wechatUsername", "TEXT");
    localStringBuilder.append(" wechatUsername TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "systemAddressBookUsername";
    locala.vmt.put("systemAddressBookUsername", "TEXT");
    localStringBuilder.append(" systemAddressBookUsername TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "contactId";
    locala.vmt.put("contactId", "TEXT");
    localStringBuilder.append(" contactId TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "sortKey";
    locala.vmt.put("sortKey", "TEXT");
    localStringBuilder.append(" sortKey TEXT");
    locala.columns[4] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(11576950128640L, 86255);
  }
  
  public c()
  {
    GMTrace.i(11576547475456L, 86252);
    GMTrace.o(11576547475456L, 86252);
  }
  
  public static boolean cD(String paramString1, String paramString2)
  {
    GMTrace.i(11576815910912L, 86254);
    if ((paramString1 == null) && (paramString2 != null))
    {
      GMTrace.o(11576815910912L, 86254);
      return false;
    }
    if ((paramString1 != null) && (!paramString1.equals(paramString2)))
    {
      GMTrace.o(11576815910912L, 86254);
      return false;
    }
    GMTrace.o(11576815910912L, 86254);
    return true;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(11576681693184L, 86253);
    c.a locala = fTp;
    GMTrace.o(11576681693184L, 86253);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\g\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */