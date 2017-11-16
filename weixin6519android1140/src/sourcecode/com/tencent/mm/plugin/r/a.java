package com.tencent.mm.plugin.r;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.kernel.api.bucket.d;
import com.tencent.mm.kernel.h;
import com.tencent.mm.storage.at;

public final class a
  implements d, com.tencent.mm.plugin.r.a.a
{
  private at mUp;
  
  public a()
  {
    GMTrace.i(16421270585344L, 122348);
    GMTrace.o(16421270585344L, 122348);
  }
  
  public final void onDataBaseClosed(g paramg1, g paramg2)
  {
    GMTrace.i(16422075891712L, 122354);
    GMTrace.o(16422075891712L, 122354);
  }
  
  public final void onDataBaseOpened(g paramg1, g paramg2)
  {
    GMTrace.i(16421673238528L, 122351);
    this.mUp = new at(paramg1);
    GMTrace.o(16421673238528L, 122351);
  }
  
  public final at yR()
  {
    GMTrace.i(16421404803072L, 122349);
    h.xz();
    h.xw().wG();
    at localat = this.mUp;
    GMTrace.o(16421404803072L, 122349);
    return localat;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\r\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */