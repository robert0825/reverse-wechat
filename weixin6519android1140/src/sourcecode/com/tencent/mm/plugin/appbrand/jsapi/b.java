package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.loader.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import junit.framework.Assert;

public abstract class b
{
  private String hXp;
  private Integer hXq;
  
  public b()
  {
    GMTrace.i(10427777941504L, 77693);
    Assert.assertTrue("Must declare NAME and CTRL_INDEX in subclasses", true);
    GMTrace.o(10427777941504L, 77693);
  }
  
  private Integer VP()
  {
    GMTrace.i(10428180594688L, 77696);
    Object localObject;
    if (this.hXq == null) {
      localObject = new c(this, "CTRL_INDEX", null);
    }
    try
    {
      this.hXq = ((Integer)((c)localObject).get());
      localObject = this.hXq;
      GMTrace.o(10428180594688L, 77696);
      return (Integer)localObject;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.AppBrand.BaseJsApi", "getCtrlIndex exp = %s", new Object[] { bg.f(localException) });
      }
    }
  }
  
  public final int VO()
  {
    GMTrace.i(10428046376960L, 77695);
    int i = bg.a(VP(), -1);
    GMTrace.o(10428046376960L, 77695);
    return i;
  }
  
  public final String getName()
  {
    GMTrace.i(10427912159232L, 77694);
    Object localObject;
    if (bg.nm(this.hXp)) {
      localObject = new c(this, "NAME", null);
    }
    try
    {
      this.hXp = ((String)((c)localObject).get());
      localObject = this.hXp;
      GMTrace.o(10427912159232L, 77694);
      return (String)localObject;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.AppBrand.BaseJsApi", "getName exp = %s", new Object[] { bg.f(localException) });
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */