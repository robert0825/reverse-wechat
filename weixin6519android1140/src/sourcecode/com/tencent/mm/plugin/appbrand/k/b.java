package com.tencent.mm.plugin.appbrand.k;

import com.tencent.mm.kernel.c.a;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import java.util.List;

public abstract interface b
  extends a
{
  public abstract void S(List<String> paramList);
  
  public abstract void a(String paramString, a parama);
  
  public abstract WxaAttributes pn(String paramString);
  
  public abstract void po(String paramString);
  
  public static abstract interface a
  {
    public abstract void b(WxaAttributes paramWxaAttributes);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\appbrand\k\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */