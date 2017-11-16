package com.tencent.b.a.a;

import android.content.Context;

public abstract class q
{
  protected Context context = null;
  
  protected q(Context paramContext)
  {
    this.context = paramContext;
  }
  
  protected abstract void a(a parama);
  
  public final void b(a parama)
  {
    if (parama == null) {}
    while (!checkPermission()) {
      return;
    }
    a(parama);
  }
  
  public final void b(g paramg)
  {
    if (paramg == null) {}
    do
    {
      return;
      paramg = paramg.toString();
    } while (!checkPermission());
    write(s.encode(paramg));
  }
  
  protected abstract boolean checkPermission();
  
  protected abstract String oi();
  
  protected abstract a oj();
  
  public final g op()
  {
    g localg = null;
    if (checkPermission()) {}
    for (String str = s.decode(oi());; str = null)
    {
      if (str != null) {
        localg = g.aT(str);
      }
      return localg;
    }
  }
  
  public final a oq()
  {
    if (checkPermission()) {
      return oj();
    }
    return null;
  }
  
  protected abstract void write(String paramString);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\b\a\a\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */