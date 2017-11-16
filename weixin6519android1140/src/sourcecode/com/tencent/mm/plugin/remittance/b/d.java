package com.tencent.mm.plugin.remittance.b;

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
    GMTrace.i(18054297681920L, 134515);
    fTX = new String[] { i.a(c.fTp, "RemittanceRecord") };
    hpt = new String[] { "*", "rowid" };
    hpu = new HashMap();
    GMTrace.o(18054297681920L, 134515);
  }
  
  public d(e parame)
  {
    super(parame, c.fTp, "RemittanceRecord", null);
    GMTrace.i(18053492375552L, 134509);
    this.fTZ = parame;
    GMTrace.o(18053492375552L, 134509);
  }
  
  public final c FB(String paramString)
  {
    GMTrace.i(18053626593280L, 134510);
    if (bg.nm(paramString))
    {
      GMTrace.o(18053626593280L, 134510);
      return null;
    }
    paramString = this.fTZ.a("RemittanceRecord", hpt, "transferId=?", new String[] { paramString }, null, null, null, 2);
    try
    {
      if (paramString.moveToFirst())
      {
        c localc = new c();
        localc.b(paramString);
        paramString.close();
        GMTrace.o(18053626593280L, 134510);
        return localc;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.RemittanceSendRecordStorage", localException, "getRecordByTransferId error: %s", new Object[] { localException.getMessage() });
        paramString.close();
      }
    }
    finally
    {
      paramString.close();
    }
    GMTrace.o(18053626593280L, 134510);
    return null;
  }
  
  public final boolean a(c paramc)
  {
    GMTrace.i(18053760811008L, 134511);
    if ((paramc != null) && (hpu.containsKey(paramc.field_transferId))) {
      hpu.put(paramc.field_transferId, paramc);
    }
    boolean bool = super.a(paramc);
    GMTrace.o(18053760811008L, 134511);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */