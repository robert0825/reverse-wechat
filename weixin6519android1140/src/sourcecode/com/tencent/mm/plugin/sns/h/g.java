package com.tencent.mm.plugin.sns.h;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsns.b;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.Vector;

public abstract class g
{
  private Vector<b> pBW;
  
  public g()
  {
    GMTrace.i(8881723932672L, 66174);
    this.pBW = new Vector();
    GMTrace.o(8881723932672L, 66174);
  }
  
  public final b a(b paramb)
  {
    GMTrace.i(8881858150400L, 66175);
    this.pBW.add(paramb);
    GMTrace.o(8881858150400L, 66175);
    return paramb;
  }
  
  public final boolean b(b paramb)
  {
    GMTrace.i(8881992368128L, 66176);
    Iterator localIterator = this.pBW.iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      if (localb.gVC == paramb.gVC) {
        this.pBW.remove(localb);
      }
    }
    for (boolean bool = true;; bool = false)
    {
      this.pBW.add(paramb);
      GMTrace.o(8881992368128L, 66176);
      return bool;
    }
  }
  
  public final b br(Object paramObject)
  {
    GMTrace.i(8882126585856L, 66177);
    if (paramObject == null)
    {
      GMTrace.o(8882126585856L, 66177);
      return null;
    }
    try
    {
      Iterator localIterator = this.pBW.iterator();
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        if (paramObject.equals(localb.gVz))
        {
          this.pBW.remove(localb);
          GMTrace.o(8882126585856L, 66177);
          return localb;
        }
      }
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.Ss_log_base_helper", "report by key " + localException.getMessage() + " " + paramObject);
      GMTrace.o(8882126585856L, 66177);
    }
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\h\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */