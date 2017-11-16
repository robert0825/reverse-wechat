package com.tencent.c.d.a;

import android.text.TextUtils;
import com.tencent.c.d.b.d.a;
import com.tencent.c.f.h;
import java.util.ArrayList;
import java.util.List;

public final class c
  implements b
{
  private final List<d.a> xRz = new ArrayList();
  
  public final void a(d.a parama)
  {
    if (parama.uid != 0) {}
    while ((TextUtils.isEmpty(parama.xRH)) || (!"u:r:zygote:s0".equals(parama.xRH)) || (TextUtils.isEmpty(parama.name)) || ("zygote".equals(parama.name)) || ("zygote64".equals(parama.name))) {
      return;
    }
    h.XW("JavaProcessAnalyzer match : " + parama.toString());
    this.xRz.add(parama);
  }
  
  public final boolean cns()
  {
    return this.xRz.size() > 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\d\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */