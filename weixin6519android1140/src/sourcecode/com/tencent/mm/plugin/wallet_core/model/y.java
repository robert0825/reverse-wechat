package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.dr;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class y
  extends dr
{
  public static c.a fTp;
  
  static
  {
    GMTrace.i(6902280880128L, 51426);
    c.a locala = new c.a();
    locala.gZM = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "pref_key";
    locala.vmt.put("pref_key", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" pref_key TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "pref_key";
    locala.columns[1] = "pref_title";
    locala.vmt.put("pref_title", "TEXT");
    localStringBuilder.append(" pref_title TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "pref_url";
    locala.vmt.put("pref_url", "TEXT");
    localStringBuilder.append(" pref_url TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "is_show";
    locala.vmt.put("is_show", "INTEGER default '1' ");
    localStringBuilder.append(" is_show INTEGER default '1' ");
    locala.columns[4] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(6902280880128L, 51426);
  }
  
  public y()
  {
    GMTrace.i(6902012444672L, 51424);
    GMTrace.o(6902012444672L, 51424);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(6902146662400L, 51425);
    c.a locala = fTp;
    GMTrace.o(6902146662400L, 51425);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */