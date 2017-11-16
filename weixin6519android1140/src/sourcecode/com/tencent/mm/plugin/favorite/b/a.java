package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ax;
import com.tencent.mm.sdk.e.c.a;

public final class a
  extends ax
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(6277228920832L, 46769);
    fTp = ax.qM();
    GMTrace.o(6277228920832L, 46769);
  }
  
  public a()
  {
    GMTrace.i(6276557832192L, 46764);
    GMTrace.o(6276557832192L, 46764);
  }
  
  public final boolean axC()
  {
    GMTrace.i(6276826267648L, 46766);
    if (this.field_dataType == 4)
    {
      GMTrace.o(6276826267648L, 46766);
      return true;
    }
    GMTrace.o(6276826267648L, 46766);
    return false;
  }
  
  public final float getProgress()
  {
    GMTrace.i(6277094703104L, 46768);
    float f = Math.max(0.0F, Math.min(99.0F, this.field_offset / this.field_totalLen) * 100.0F);
    GMTrace.o(6277094703104L, 46768);
    return f;
  }
  
  public final boolean isFinished()
  {
    GMTrace.i(6276960485376L, 46767);
    if (this.field_status == 3)
    {
      GMTrace.o(6276960485376L, 46767);
      return true;
    }
    GMTrace.o(6276960485376L, 46767);
    return false;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(6276692049920L, 46765);
    c.a locala = fTp;
    GMTrace.o(6276692049920L, 46765);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */