package com.tencent.mm.plugin.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.api.e;
import com.tencent.mm.kernel.b.b;
import com.tencent.mm.kernel.h;

public final class a
  implements e, b
{
  private static a hwM;
  private com.tencent.mm.storage.g hwN;
  
  private a()
  {
    GMTrace.i(18730755031040L, 139555);
    GMTrace.o(18730755031040L, 139555);
  }
  
  public static a Re()
  {
    try
    {
      GMTrace.i(18730889248768L, 139556);
      if (hwM == null) {
        hwM = new a();
      }
      a locala = hwM;
      GMTrace.o(18730889248768L, 139556);
      return locala;
    }
    finally {}
  }
  
  public final void onDataBaseClosed(com.tencent.mm.bu.g paramg1, com.tencent.mm.bu.g paramg2)
  {
    GMTrace.i(18731291901952L, 139559);
    GMTrace.o(18731291901952L, 139559);
  }
  
  public final void onDataBaseOpened(com.tencent.mm.bu.g paramg1, com.tencent.mm.bu.g paramg2)
  {
    GMTrace.i(18731157684224L, 139558);
    this.hwN = new com.tencent.mm.storage.g(paramg1);
    GMTrace.o(18731157684224L, 139558);
  }
  
  public final com.tencent.mm.storage.g zu()
  {
    GMTrace.i(18731023466496L, 139557);
    h.xw().wG();
    com.tencent.mm.storage.g localg = this.hwN;
    GMTrace.o(18731023466496L, 139557);
    return localg;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */