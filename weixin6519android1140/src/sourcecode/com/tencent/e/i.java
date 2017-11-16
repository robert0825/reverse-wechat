package com.tencent.e;

import android.content.Context;
import com.tencent.e.b.d;
import com.tencent.pb.common.c.c;

public final class i
{
  private static i yjQ;
  private boolean mP;
  private Context sN;
  
  private static i cqZ()
  {
    if (yjQ == null) {}
    try
    {
      if (yjQ == null) {
        yjQ = new i();
      }
      return yjQ;
    }
    finally {}
  }
  
  public static void ik(Context paramContext)
  {
    i locali = cqZ();
    if (!locali.mP)
    {
      locali.sN = paramContext;
      paramContext = new d("EventCenter", com.tencent.e.a.b.class.getName());
    }
    try
    {
      paramContext = f.a(paramContext);
      if (paramContext != null) {
        paramContext.start();
      }
      return;
    }
    catch (Throwable paramContext)
    {
      c.k("service", new Object[] { paramContext });
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\e\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */