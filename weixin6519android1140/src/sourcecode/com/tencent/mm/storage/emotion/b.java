package com.tencent.mm.storage.emotion;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ap;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class b
  extends ap
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(1551288500224L, 11558);
    c.a locala = new c.a();
    locala.gZM = new Field[7];
    locala.columns = new String[8];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "md5_lang";
    locala.vmt.put("md5_lang", "TEXT PRIMARY KEY  COLLATE NOCASE ");
    localStringBuilder.append(" md5_lang TEXT PRIMARY KEY  COLLATE NOCASE ");
    localStringBuilder.append(", ");
    locala.vms = "md5_lang";
    locala.columns[1] = "md5";
    locala.vmt.put("md5", "TEXT COLLATE NOCASE ");
    localStringBuilder.append(" md5 TEXT COLLATE NOCASE ");
    localStringBuilder.append(", ");
    locala.columns[2] = "lang";
    locala.vmt.put("lang", "TEXT COLLATE NOCASE ");
    localStringBuilder.append(" lang TEXT COLLATE NOCASE ");
    localStringBuilder.append(", ");
    locala.columns[3] = "desc";
    locala.vmt.put("desc", "TEXT");
    localStringBuilder.append(" desc TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "groupId";
    locala.vmt.put("groupId", "TEXT default '' ");
    localStringBuilder.append(" groupId TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[5] = "click_flag";
    locala.vmt.put("click_flag", "INTEGER");
    localStringBuilder.append(" click_flag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "download_flag";
    locala.vmt.put("download_flag", "INTEGER");
    localStringBuilder.append(" download_flag INTEGER");
    locala.columns[7] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(1551288500224L, 11558);
  }
  
  public b()
  {
    GMTrace.i(1550885847040L, 11555);
    GMTrace.o(1550885847040L, 11555);
  }
  
  public final String GS()
  {
    GMTrace.i(1551154282496L, 11557);
    if (this.field_md5 == null)
    {
      GMTrace.o(1551154282496L, 11557);
      return "";
    }
    String str = this.field_md5;
    GMTrace.o(1551154282496L, 11557);
    return str;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(1551020064768L, 11556);
    GMTrace.o(1551020064768L, 11556);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\emotion\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */