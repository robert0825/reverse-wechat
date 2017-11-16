package com.tencent.mm.plugin.emoji.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.cs;
import com.tencent.mm.sdk.b.a;
import java.util.HashMap;
import java.util.Map;

public final class d
{
  private cs kkl;
  public final Map<String, Integer> kkm;
  
  public d()
  {
    GMTrace.i(11307306713088L, 84246);
    this.kkm = new HashMap();
    this.kkl = new cs();
    GMTrace.o(11307306713088L, 84246);
  }
  
  public final void f(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    GMTrace.i(11307440930816L, 84247);
    this.kkl.eDZ.eEa = paramString1;
    this.kkl.eDZ.status = paramInt1;
    this.kkl.eDZ.progress = paramInt2;
    this.kkl.eDZ.eEb = paramString2;
    a.vgX.m(this.kkl);
    if (paramInt1 == 6)
    {
      if ((paramInt2 < 0) || (paramInt2 >= 100))
      {
        this.kkm.remove(paramString1);
        GMTrace.o(11307440930816L, 84247);
        return;
      }
      this.kkm.put(paramString1, Integer.valueOf(paramInt2));
      GMTrace.o(11307440930816L, 84247);
      return;
    }
    this.kkm.remove(paramString1);
    GMTrace.o(11307440930816L, 84247);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\model\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */