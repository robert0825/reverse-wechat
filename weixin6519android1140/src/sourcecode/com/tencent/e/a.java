package com.tencent.e;

import java.util.HashMap;

public final class a
  implements com.tencent.e.b.a
{
  private g yjB;
  private boolean yjC = true;
  
  protected a(g paramg)
  {
    this.yjB = paramg;
  }
  
  public final void t(String paramString, Object paramObject)
  {
    if (!this.yjC) {
      return;
    }
    f localf = f.cqY();
    if (paramObject == null) {
      throw new h("TpfServiceCenter|registerService|name or service should not be null");
    }
    synchronized (localf.yjI)
    {
      localf.yjG.put(paramString, paramObject);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */