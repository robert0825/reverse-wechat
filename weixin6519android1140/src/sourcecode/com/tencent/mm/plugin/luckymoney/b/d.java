package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;

public final class d
{
  c mIa;
  
  public d()
  {
    GMTrace.i(9744878141440L, 72605);
    init();
    GMTrace.o(9744878141440L, 72605);
  }
  
  private void init()
  {
    GMTrace.i(9745012359168L, 72606);
    this.mIa = new c();
    h.xz();
    String str = (String)h.xy().xh().get(356355, null);
    if (bg.nm(str))
    {
      this.mIa.mHR = 2000.0D;
      this.mIa.mHQ = 100;
      this.mIa.mHV = 200.0D;
      this.mIa.mHW = 0.01D;
      this.mIa.mHU = 200.0D;
    }
    for (;;)
    {
      w.i("MicroMsg.LuckyMoneyConfigManager", "LuckyMoneyConfig init maxTotalAmount:" + this.mIa.mHR + " maxTotalNum:" + this.mIa.mHQ + " perGroupMaxValue:" + this.mIa.mHV + " perMinValue:" + this.mIa.mHW + " perPersonMaxValue:" + this.mIa.mHU);
      GMTrace.o(9745012359168L, 72606);
      return;
      try
      {
        this.mIa.aD(str.getBytes("ISO-8859-1"));
      }
      catch (Exception localException)
      {
        w.w("MicroMsg.LuckyMoneyConfigManager", "parseConfig exp, " + localException.getLocalizedMessage());
        this.mIa.mHR = 2000.0D;
        this.mIa.mHQ = 100;
        this.mIa.mHV = 200.0D;
        this.mIa.mHW = 0.01D;
        this.mIa.mHU = 200.0D;
      }
    }
  }
  
  public final c aMb()
  {
    GMTrace.i(9745280794624L, 72608);
    if (this.mIa == null) {
      init();
    }
    c localc = this.mIa;
    GMTrace.o(9745280794624L, 72608);
    return localc;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */