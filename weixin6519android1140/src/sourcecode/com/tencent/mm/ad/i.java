package com.tencent.mm.ad;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.i.c;
import com.tencent.mm.protocal.i.c.a;
import com.tencent.mm.protocal.k.d;

public abstract class i
  implements q
{
  private k.d gtS;
  public boolean gtT;
  
  public i()
  {
    GMTrace.i(13424859807744L, 100023);
    this.gtT = false;
    GMTrace.o(13424859807744L, 100023);
  }
  
  public abstract k.d AY();
  
  public final k.d DC()
  {
    GMTrace.i(13424994025472L, 100024);
    if (this.gtS == null)
    {
      this.gtS = AY();
      locald = this.gtS;
      locald.tKl = p.ta();
      locald.tKk = d.DEVICE_TYPE;
      locald.tKj = d.tJC;
      locald.dp(i.c.a.tJY.AW());
    }
    k.d locald = this.gtS;
    GMTrace.o(13424994025472L, 100024);
    return locald;
  }
  
  public final boolean DD()
  {
    GMTrace.i(13425396678656L, 100027);
    boolean bool = this.gtT;
    GMTrace.o(13425396678656L, 100027);
    return bool;
  }
  
  public int Dz()
  {
    GMTrace.i(13425262460928L, 100026);
    GMTrace.o(13425262460928L, 100026);
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ad\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */