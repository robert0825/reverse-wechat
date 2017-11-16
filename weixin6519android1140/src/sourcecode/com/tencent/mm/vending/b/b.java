package com.tencent.mm.vending.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.vending.h.d;
import junit.framework.Assert;

public final class b<_Callback>
  implements com.tencent.mm.vending.e.a
{
  public d esx;
  private int mPriority;
  private a xxD;
  public _Callback xxE;
  private int xxF;
  
  public b(_Callback param_Callback, a parama)
  {
    GMTrace.i(273133076480L, 2035);
    this.mPriority = -1;
    Assert.assertNotNull("Callback should not be null!", param_Callback);
    this.xxF = param_Callback.hashCode();
    this.xxE = param_Callback;
    this.xxD = parama;
    GMTrace.o(273133076480L, 2035);
  }
  
  public final b<_Callback> a(com.tencent.mm.vending.e.b paramb)
  {
    GMTrace.i(272998858752L, 2034);
    Assert.assertNotNull(paramb);
    paramb.a(this);
    GMTrace.o(272998858752L, 2034);
    return this;
  }
  
  public final void dead()
  {
    GMTrace.i(273535729664L, 2038);
    Assert.assertNotNull(this.xxD);
    this.xxD.b(this);
    GMTrace.o(273535729664L, 2038);
  }
  
  public final boolean equals(Object paramObject)
  {
    GMTrace.i(273401511936L, 2037);
    if ((paramObject != null) && (paramObject.hashCode() == this.xxF))
    {
      GMTrace.o(273401511936L, 2037);
      return true;
    }
    GMTrace.o(273401511936L, 2037);
    return false;
  }
  
  public final int hashCode()
  {
    GMTrace.i(273267294208L, 2036);
    int i = this.xxF;
    GMTrace.o(273267294208L, 2036);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\vending\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */