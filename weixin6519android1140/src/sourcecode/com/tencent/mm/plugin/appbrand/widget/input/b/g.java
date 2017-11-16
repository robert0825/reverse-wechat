package com.tencent.mm.plugin.appbrand.widget.input.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.widget.input.y;

public enum g
{
  static
  {
    GMTrace.i(17282948399104L, 128768);
    iQN = new g("LEFT", 0);
    iQO = new g("RIGHT", 1);
    iQP = new g("CENTER", 2);
    iQQ = new g[] { iQN, iQO, iQP };
    GMTrace.o(17282948399104L, 128768);
  }
  
  private g()
  {
    GMTrace.i(17282545745920L, 128765);
    GMTrace.o(17282545745920L, 128765);
  }
  
  public static g sX(String paramString)
  {
    GMTrace.i(17282679963648L, 128766);
    paramString = d.g(paramString, g.class);
    g localg = iQN;
    if (paramString == null) {
      paramString = localg;
    }
    for (;;)
    {
      paramString = (g)paramString;
      GMTrace.o(17282679963648L, 128766);
      return paramString;
    }
  }
  
  public final void a(y paramy)
  {
    GMTrace.i(18286091698176L, 136242);
    if (paramy == null)
    {
      GMTrace.o(18286091698176L, 136242);
      return;
    }
    switch (1.iQR[ordinal()])
    {
    }
    for (;;)
    {
      GMTrace.o(18286091698176L, 136242);
      return;
      paramy.adc();
      GMTrace.o(18286091698176L, 136242);
      return;
      paramy.ade();
      GMTrace.o(18286091698176L, 136242);
      return;
      paramy.adf();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */