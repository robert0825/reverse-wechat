package com.tencent.mm.plugin.downloader;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.kernel.api.bucket.d;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.downloader.e.b;

public final class a
  implements d, com.tencent.mm.plugin.downloader.b.a
{
  private b kdT;
  
  public a()
  {
    GMTrace.i(18589960634368L, 138506);
    GMTrace.o(18589960634368L, 138506);
  }
  
  public final void onDataBaseClosed(g paramg1, g paramg2)
  {
    GMTrace.i(18590229069824L, 138508);
    GMTrace.o(18590229069824L, 138508);
  }
  
  public final void onDataBaseOpened(g paramg1, g paramg2)
  {
    GMTrace.i(18590094852096L, 138507);
    this.kdT = new b(paramg1);
    GMTrace.o(18590094852096L, 138507);
  }
  
  public final b yQ()
  {
    GMTrace.i(18590363287552L, 138509);
    h.xz();
    h.xw().wG();
    b localb = this.kdT;
    GMTrace.o(18590363287552L, 138509);
    return localb;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\downloader\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */