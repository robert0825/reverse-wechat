package com.tencent.mm.plugin.wallet_core.model;

import android.content.Context;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.List;

public final class p
{
  public List<ElementQuery> rcu;
  public SparseArray<String> riI;
  
  public p()
  {
    GMTrace.i(6862820868096L, 51132);
    this.riI = null;
    this.rcu = null;
    GMTrace.o(6862820868096L, 51132);
  }
  
  public final String J(Context paramContext, int paramInt)
  {
    GMTrace.i(6862955085824L, 51133);
    if (this.riI != null)
    {
      String str = (String)this.riI.get(paramInt);
      if (!bg.nm(str))
      {
        GMTrace.o(6862955085824L, 51133);
        return str;
      }
    }
    paramContext = paramContext.getString(a.i.tam);
    GMTrace.o(6862955085824L, 51133);
    return paramContext;
  }
  
  public final ElementQuery Kf(String paramString)
  {
    GMTrace.i(6863089303552L, 51134);
    if ((this.rcu != null) && (this.rcu.size() != 0))
    {
      Iterator localIterator = this.rcu.iterator();
      while (localIterator.hasNext())
      {
        ElementQuery localElementQuery = (ElementQuery)localIterator.next();
        if ((localElementQuery.nDt != null) && (localElementQuery.nDt.equals(paramString)))
        {
          GMTrace.o(6863089303552L, 51134);
          return localElementQuery;
        }
      }
      w.w("MicroMsg.WalletBankElementManager", "hy: not found given banktype: %s", new Object[] { paramString });
      GMTrace.o(6863089303552L, 51134);
      return null;
    }
    w.w("MicroMsg.WalletBankElementManager", "hy: no element from given banktype");
    GMTrace.o(6863089303552L, 51134);
    return null;
  }
  
  public final ElementQuery Kg(String paramString)
  {
    GMTrace.i(6863223521280L, 51135);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.WalletBankElementManager", "hy: bindSerail given is null");
      GMTrace.o(6863223521280L, 51135);
      return null;
    }
    if ((this.rcu != null) && (this.rcu.size() != 0))
    {
      Iterator localIterator = this.rcu.iterator();
      while (localIterator.hasNext())
      {
        ElementQuery localElementQuery = (ElementQuery)localIterator.next();
        if (paramString.equals(localElementQuery.nDu))
        {
          GMTrace.o(6863223521280L, 51135);
          return localElementQuery;
        }
      }
      w.w("MicroMsg.WalletBankElementManager", "hy: not found given element query");
      GMTrace.o(6863223521280L, 51135);
      return null;
    }
    w.w("MicroMsg.WalletBankElementManager", "hy: element list is null. get element failed");
    GMTrace.o(6863223521280L, 51135);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */