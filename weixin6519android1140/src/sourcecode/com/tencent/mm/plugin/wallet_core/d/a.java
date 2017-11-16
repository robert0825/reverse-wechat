package com.tencent.mm.plugin.wallet_core.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.j;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class a
  extends i<j>
{
  public static final String[] fTX;
  public e fTZ;
  
  static
  {
    GMTrace.i(6913689387008L, 51511);
    fTX = new String[] { i.a(j.fTp, "LoanEntryInfo") };
    GMTrace.o(6913689387008L, 51511);
  }
  
  public a(e parame)
  {
    super(parame, j.fTp, "LoanEntryInfo", null);
    GMTrace.i(6913555169280L, 51510);
    this.fTZ = parame;
    GMTrace.o(6913555169280L, 51510);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */