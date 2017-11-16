package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;

public final class ad
{
  public int rjq;
  
  public ad()
  {
    GMTrace.i(6909662855168L, 51481);
    this.rjq = 0;
    h.xz();
    this.rjq = ((Integer)h.xy().xh().get(196660, Integer.valueOf(0))).intValue();
    w.i("MicroMsg.WalletSwitchConfig", "WalletSwitchConfig2 " + this.rjq);
    GMTrace.o(6909662855168L, 51481);
  }
  
  public ad(int paramInt)
  {
    GMTrace.i(6909528637440L, 51480);
    this.rjq = 0;
    h.xz();
    h.xy().xh().set(196660, Integer.valueOf(paramInt));
    this.rjq = paramInt;
    w.i("MicroMsg.WalletSwitchConfig", "WalletSwitchConfig1 " + paramInt);
    GMTrace.o(6909528637440L, 51480);
  }
  
  public final boolean byK()
  {
    GMTrace.i(6909797072896L, 51482);
    if ((this.rjq & 0x2) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.WalletSwitchConfig", "isMicroPayOn, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.rjq) });
      GMTrace.o(6909797072896L, 51482);
      return bool;
    }
  }
  
  public final boolean byL()
  {
    GMTrace.i(6909931290624L, 51483);
    if ((this.rjq & 0x80) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.WalletSwitchConfig", "isSupportScanBankCard, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.rjq) });
      GMTrace.o(6909931290624L, 51483);
      return bool;
    }
  }
  
  public final boolean byM()
  {
    GMTrace.i(6910065508352L, 51484);
    if ((this.rjq & 0x100) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.WalletSwitchConfig", "isSupportTouchPay, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.rjq) });
      GMTrace.o(6910065508352L, 51484);
      return bool;
    }
  }
  
  public final boolean byN()
  {
    GMTrace.i(6910199726080L, 51485);
    if ((this.rjq & 0x800) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.WalletSwitchConfig", "isSupporSwitchWalletCurrency, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.rjq) });
      GMTrace.o(6910199726080L, 51485);
      return bool;
    }
  }
  
  public final boolean byO()
  {
    GMTrace.i(20888439226368L, 155631);
    if ((this.rjq & 0x10000) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.WalletSwitchConfig", "isShowH5TradeDetail, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.rjq) });
      GMTrace.o(20888439226368L, 155631);
      return bool;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */