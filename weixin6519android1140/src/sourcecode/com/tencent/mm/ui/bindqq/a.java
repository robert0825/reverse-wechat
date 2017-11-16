package com.tencent.mm.ui.bindqq;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.jo;
import com.tencent.mm.g.a.jo.a;
import com.tencent.mm.sdk.b.c;

public final class a
  extends c<jo>
  implements b.a
{
  private jo wog;
  
  public a()
  {
    GMTrace.i(1888980303872L, 14074);
    this.vhf = jo.class.getName().hashCode();
    GMTrace.o(1888980303872L, 14074);
  }
  
  public final void cbo()
  {
    GMTrace.i(1889248739328L, 14076);
    if ((this.wog != null) && (this.wog.eNs.eNv != null))
    {
      this.wog.eNt.eDb = false;
      this.wog.eNs.eNv.run();
      this.wog = null;
    }
    GMTrace.o(1889248739328L, 14076);
  }
  
  public final boolean v(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(1889114521600L, 14075);
    if (this.wog == null)
    {
      GMTrace.o(1889114521600L, 14075);
      return false;
    }
    if (this.wog.eNs.eNv == null)
    {
      this.wog = null;
      GMTrace.o(1889114521600L, 14075);
      return false;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.wog.eNt.eDb = true;
      this.wog.eNs.eNv.run();
      this.wog = null;
      GMTrace.o(1889114521600L, 14075);
      return true;
    }
    this.wog.eNt.eDb = false;
    this.wog.eNs.eNv.run();
    this.wog = null;
    GMTrace.o(1889114521600L, 14075);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\bindqq\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */