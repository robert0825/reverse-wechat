package com.tencent.mm.plugin.wallet_core.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.y;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class h
  extends i<y>
{
  public static final String[] fTX;
  public e fTZ;
  
  static
  {
    GMTrace.i(6916642177024L, 51533);
    fTX = new String[] { i.a(y.fTp, "WalletPrefInfo") };
    GMTrace.o(6916642177024L, 51533);
  }
  
  public h(e parame)
  {
    super(parame, y.fTp, "WalletPrefInfo", null);
    GMTrace.i(6916507959296L, 51532);
    this.fTZ = parame;
    GMTrace.o(6916507959296L, 51532);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\d\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */