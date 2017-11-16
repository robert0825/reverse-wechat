package com.tencent.mm.plugin.product.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d
{
  public List<String> nHU;
  
  public d()
  {
    GMTrace.i(5990271418368L, 44631);
    this.nHU = new ArrayList();
    PY();
    GMTrace.o(5990271418368L, 44631);
  }
  
  private void PY()
  {
    GMTrace.i(5990405636096L, 44632);
    this.nHU.clear();
    h.xz();
    Object localObject = (String)h.xy().xh().get(270340, "");
    w.d("MicroMsg.MallNewsManager", "data : " + (String)localObject);
    localObject = bg.g(((String)localObject).split(";")).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      if (!bg.nm(str)) {
        this.nHU.add(str);
      }
    }
    GMTrace.o(5990405636096L, 44632);
  }
  
  public final boolean aXr()
  {
    GMTrace.i(5990539853824L, 44633);
    w.d("MicroMsg.MallNewsManager", "notifyNewsMap.size : " + this.nHU.size());
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = this.nHU.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((!bg.nm(str)) && (!str.contains(";"))) {
        localStringBuffer.append(str);
      }
    }
    w.d("MicroMsg.MallNewsManager", "save data  : " + localStringBuffer.toString());
    h.xz();
    h.xy().xh().set(270340, localStringBuffer.toString());
    GMTrace.o(5990539853824L, 44633);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */