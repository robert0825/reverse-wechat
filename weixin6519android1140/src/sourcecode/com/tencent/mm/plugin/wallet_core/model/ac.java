package com.tencent.mm.plugin.wallet_core.model;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;

public final class ac
{
  public ArrayList<Bankcard> rjo;
  public String rjp;
  
  public ac()
  {
    GMTrace.i(6868189577216L, 51172);
    this.rjo = new ArrayList();
    GMTrace.o(6868189577216L, 51172);
  }
  
  public final Bankcard Ki(String paramString)
  {
    GMTrace.i(6868323794944L, 51173);
    Bankcard localBankcard;
    if (this.rjo.size() > 0)
    {
      Iterator localIterator = this.rjo.iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localBankcard = (Bankcard)localIterator.next();
      } while (!localBankcard.field_bindSerial.equals(paramString));
    }
    for (paramString = localBankcard;; paramString = null)
    {
      if (paramString == null) {
        w.e("MicroMsg.WalletRepaymentBankcardMgr", "getBankcardBySerialNo return null");
      }
      for (;;)
      {
        GMTrace.o(6868323794944L, 51173);
        return paramString;
        w.i("MicroMsg.WalletRepaymentBankcardMgr", "getBankcardBySerialNo succ");
        continue;
        w.e("MicroMsg.WalletRepaymentBankcardMgr", "repayment bankcard list size is 0");
        paramString = null;
      }
    }
  }
  
  public final boolean byI()
  {
    GMTrace.i(6868458012672L, 51174);
    if (this.rjo.size() > 0)
    {
      GMTrace.o(6868458012672L, 51174);
      return true;
    }
    GMTrace.o(6868458012672L, 51174);
    return false;
  }
  
  public final Bankcard byJ()
  {
    GMTrace.i(6868592230400L, 51175);
    if (byI())
    {
      if (!TextUtils.isEmpty(this.rjp))
      {
        localBankcard = Ki(this.rjp);
        GMTrace.o(6868592230400L, 51175);
        return localBankcard;
      }
      w.i("MicroMsg.WalletRepaymentBankcardMgr", "last_use_card_serialno is empty,return the first one");
      Bankcard localBankcard = (Bankcard)this.rjo.get(0);
      GMTrace.o(6868592230400L, 51175);
      return localBankcard;
    }
    w.e("MicroMsg.WalletRepaymentBankcardMgr", "Repayment card list is null");
    GMTrace.o(6868592230400L, 51175);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */