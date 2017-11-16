package com.tencent.mm.plugin.wallet_core.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.q;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class d
  extends i<q>
{
  public static final String[] fTX;
  public e fTZ;
  
  static
  {
    GMTrace.i(6912481427456L, 51502);
    fTX = new String[] { i.a(q.fTp, "WalletBulletin") };
    GMTrace.o(6912481427456L, 51502);
  }
  
  public d(e parame)
  {
    super(parame, q.fTp, "WalletBulletin", null);
    GMTrace.i(6912347209728L, 51501);
    this.fTZ = parame;
    GMTrace.o(6912347209728L, 51501);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\d\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */