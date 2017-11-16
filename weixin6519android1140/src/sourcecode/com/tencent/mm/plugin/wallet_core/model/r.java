package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.d.a.c.h;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.security.Signature;

public enum r
{
  public String llD;
  public boolean llE;
  private Signature riK;
  public h riL;
  
  static
  {
    GMTrace.i(6904025710592L, 51439);
    riJ = new r("IML");
    riM = new r[] { riJ };
    GMTrace.o(6904025710592L, 51439);
  }
  
  private r()
  {
    GMTrace.i(6903757275136L, 51437);
    this.llD = null;
    this.llE = false;
    this.riK = null;
    this.riL = null;
    GMTrace.o(6903757275136L, 51437);
  }
  
  public final void reset()
  {
    GMTrace.i(6903891492864L, 51438);
    w.i("MicroMsg.WalletFingerprintVerifyManager", "hy: start reset");
    this.riK = null;
    this.llD = null;
    this.llE = false;
    GMTrace.o(6903891492864L, 51438);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */