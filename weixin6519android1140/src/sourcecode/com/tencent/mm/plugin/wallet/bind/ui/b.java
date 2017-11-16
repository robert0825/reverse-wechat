package com.tencent.mm.plugin.wallet.bind.ui;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.storage.t;

public final class b
{
  public static boolean a(Bankcard paramBankcard)
  {
    GMTrace.i(7685575540736L, 57262);
    if (paramBankcard == null)
    {
      GMTrace.o(7685575540736L, 57262);
      return false;
    }
    h.xz();
    Object localObject1 = (String)h.xy().xh().get(196659, null);
    if (TextUtils.isEmpty((CharSequence)localObject1))
    {
      GMTrace.o(7685575540736L, 57262);
      return true;
    }
    localObject1 = ((String)localObject1).split("&");
    if ((localObject1 == null) || (localObject1.length == 0))
    {
      GMTrace.o(7685575540736L, 57262);
      return true;
    }
    int i = 0;
    while (i < localObject1.length)
    {
      Object localObject2 = localObject1[i];
      if ((localObject2 != null) && (((String)localObject2).equals(paramBankcard.field_bankcardType)))
      {
        GMTrace.o(7685575540736L, 57262);
        return false;
      }
      i += 1;
    }
    GMTrace.o(7685575540736L, 57262);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\bind\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */