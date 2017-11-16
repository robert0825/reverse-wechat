package com.tencent.mm.plugin.order.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class b
{
  public HashSet<String> nEa;
  
  public b()
  {
    GMTrace.i(6627402973184L, 49378);
    this.nEa = new HashSet();
    ayE();
    GMTrace.o(6627402973184L, 49378);
  }
  
  private void ayE()
  {
    GMTrace.i(6627537190912L, 49379);
    this.nEa.clear();
    h.xz();
    Iterator localIterator = bg.g(((String)h.xy().xh().get(204803, "")).split(";")).iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((!bg.nm(str)) && (!this.nEa.contains(str))) {
        this.nEa.add(str);
      }
    }
    h.xz();
    h.xy().xh().set(204817, Integer.valueOf(this.nEa.size()));
    w.d("MicroMsg.WalletOrdersManager", "notifyTrans.size() : " + this.nEa.size());
    GMTrace.o(6627537190912L, 49379);
  }
  
  public final void GH()
  {
    GMTrace.i(6627671408640L, 49380);
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = this.nEa.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!bg.nm(str)) {
        localStringBuffer.append(str + ";");
      }
    }
    h.xz();
    h.xy().xh().set(204803, localStringBuffer.toString());
    GMTrace.o(6627671408640L, 49380);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */