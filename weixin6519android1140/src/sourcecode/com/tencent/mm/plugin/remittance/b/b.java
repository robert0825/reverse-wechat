package com.tencent.mm.plugin.remittance.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends i<a>
{
  public static final String[] fTX;
  private static final String[] hpt;
  private e fTZ;
  
  static
  {
    GMTrace.i(10801708531712L, 80479);
    fTX = new String[] { i.a(a.fTp, "DelayTransferRecord") };
    hpt = new String[] { "*", "rowid" };
    GMTrace.o(10801708531712L, 80479);
  }
  
  public b(e parame)
  {
    super(parame, a.fTp, "DelayTransferRecord", null);
    GMTrace.i(10801440096256L, 80477);
    this.fTZ = parame;
    GMTrace.o(10801440096256L, 80477);
  }
  
  public final a FA(String paramString)
  {
    GMTrace.i(10801574313984L, 80478);
    if (bg.nm(paramString))
    {
      w.i("MicroMsg.AARecordStorage", "empty transferId");
      GMTrace.o(10801574313984L, 80478);
      return null;
    }
    paramString = this.fTZ.a("DelayTransferRecord", hpt, "transferId=?", new String[] { paramString }, null, null, null, 2);
    try
    {
      if (paramString.moveToFirst())
      {
        a locala = new a();
        locala.b(paramString);
        if (paramString != null) {
          paramString.close();
        }
        GMTrace.o(10801574313984L, 80478);
        return locala;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.AARecordStorage", localException, "", new Object[0]);
        if (paramString != null) {
          paramString.close();
        }
      }
    }
    finally
    {
      if (paramString == null) {
        break label160;
      }
      paramString.close();
    }
    GMTrace.o(10801574313984L, 80478);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */