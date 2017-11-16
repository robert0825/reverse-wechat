package com.tencent.mm.plugin.wallet_payu.pay.ui;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.ui.e;
import java.util.ArrayList;

public final class a
  extends e
{
  public a(Context paramContext, ArrayList<Bankcard> paramArrayList, int paramInt, Orders paramOrders)
  {
    super(paramContext, paramArrayList, paramInt, paramOrders);
    GMTrace.i(7986760122368L, 59506);
    GMTrace.o(7986760122368L, 59506);
  }
  
  public final int getCount()
  {
    GMTrace.i(7986894340096L, 59507);
    if ((this.qTU != null) && (this.qTU.size() != 0))
    {
      int i = this.qTU.size();
      GMTrace.o(7986894340096L, 59507);
      return i;
    }
    GMTrace.o(7986894340096L, 59507);
    return 1;
  }
  
  public final Bankcard wL(int paramInt)
  {
    GMTrace.i(7987028557824L, 59508);
    Bankcard localBankcard;
    if ((this.qTU != null) && (this.qTU.size() != 0))
    {
      localBankcard = (Bankcard)this.qTU.get(paramInt);
      GMTrace.o(7987028557824L, 59508);
      return localBankcard;
    }
    if (paramInt != getCount() - 1)
    {
      localBankcard = (Bankcard)this.qTU.get(paramInt);
      GMTrace.o(7987028557824L, 59508);
      return localBankcard;
    }
    GMTrace.o(7987028557824L, 59508);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\pay\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */