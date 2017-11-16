package com.tencent.mm.plugin.aa.a.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;

public final class d
  extends i<c>
{
  public static final String[] fTX;
  private static final String[] hpt;
  public static Map<String, c> hpu;
  private e fTZ;
  
  static
  {
    GMTrace.i(5587081363456L, 41627);
    fTX = new String[] { i.a(c.fTp, "AARecord") };
    hpt = new String[] { "*", "rowid" };
    hpu = new HashMap();
    GMTrace.o(5587081363456L, 41627);
  }
  
  public d(e parame)
  {
    super(parame, c.fTp, "AARecord", null);
    GMTrace.i(5586812928000L, 41625);
    this.fTZ = parame;
    GMTrace.o(5586812928000L, 41625);
  }
  
  public final boolean a(c paramc)
  {
    GMTrace.i(18433999634432L, 137344);
    if ((paramc != null) && (hpu.containsKey(paramc.field_billNo))) {
      hpu.put(paramc.field_billNo, paramc);
    }
    boolean bool = super.b(paramc);
    GMTrace.o(18433999634432L, 137344);
    return bool;
  }
  
  public final boolean a(c paramc, String... paramVarArgs)
  {
    GMTrace.i(18434133852160L, 137345);
    if ((paramc != null) && (hpu.containsKey(paramc.field_billNo))) {
      hpu.remove(paramc.field_billNo);
    }
    boolean bool = super.a(paramc, paramVarArgs);
    GMTrace.o(18434133852160L, 137345);
    return bool;
  }
  
  public final boolean b(c paramc)
  {
    GMTrace.i(18434268069888L, 137346);
    if ((paramc != null) && (hpu.containsKey(paramc.field_billNo))) {
      hpu.put(paramc.field_billNo, paramc);
    }
    boolean bool = super.a(paramc);
    GMTrace.o(18434268069888L, 137346);
    return bool;
  }
  
  public final c nv(String paramString)
  {
    GMTrace.i(5586947145728L, 41626);
    if (bg.nm(paramString))
    {
      GMTrace.o(5586947145728L, 41626);
      return null;
    }
    paramString = this.fTZ.a("AARecord", hpt, "billNo=?", new String[] { paramString }, null, null, null, 2);
    try
    {
      if (paramString.moveToFirst())
      {
        c localc = new c();
        localc.b(paramString);
        if (paramString != null) {
          paramString.close();
        }
        GMTrace.o(5586947145728L, 41626);
        return localc;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.AARecordStorage", "getRecordByBillno error: %s", new Object[] { localException.getMessage() });
        if (paramString != null) {
          paramString.close();
        }
      }
    }
    finally
    {
      if (paramString == null) {
        break label159;
      }
      paramString.close();
    }
    GMTrace.o(5586947145728L, 41626);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\aa\a\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */