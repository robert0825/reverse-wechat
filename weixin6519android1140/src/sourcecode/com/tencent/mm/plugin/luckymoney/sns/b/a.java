package com.tencent.mm.plugin.luckymoney.sns.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;

public final class a
{
  public static int aMs()
  {
    GMTrace.i(9891309682688L, 73696);
    h.xz();
    int i = ((Integer)h.xy().xh().get(w.a.vtI, Integer.valueOf(0))).intValue();
    GMTrace.o(9891309682688L, 73696);
    return i;
  }
  
  public static String aMt()
  {
    GMTrace.i(9891578118144L, 73698);
    h.xz();
    String str = (String)h.xy().xh().get(w.a.vtN, "");
    GMTrace.o(9891578118144L, 73698);
    return str;
  }
  
  public static String aMu()
  {
    GMTrace.i(9891712335872L, 73699);
    h.xz();
    String str = (String)h.xy().xh().get(w.a.vtO, "");
    GMTrace.o(9891712335872L, 73699);
    return str;
  }
  
  public static void pX(int paramInt)
  {
    GMTrace.i(9891443900416L, 73697);
    h.xz();
    h.xy().xh().a(w.a.vtI, Integer.valueOf(paramInt));
    h.xz();
    h.xy().xh().kL(true);
    GMTrace.o(9891443900416L, 73697);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\sns\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */