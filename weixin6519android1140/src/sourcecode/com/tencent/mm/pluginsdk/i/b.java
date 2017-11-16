package com.tencent.mm.pluginsdk.i;

import android.app.Activity;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import java.util.HashSet;
import java.util.Set;

public abstract class b
  implements e
{
  public Activity activity;
  Set<Integer> tpq;
  
  public b(Activity paramActivity)
  {
    GMTrace.i(700616540160L, 5220);
    this.tpq = new HashSet();
    this.activity = paramActivity;
    GMTrace.o(700616540160L, 5220);
  }
  
  public final boolean a(o paramo)
  {
    GMTrace.i(700750757888L, 5221);
    if (paramo.action == 0)
    {
      GMTrace.o(700750757888L, 5221);
      return false;
    }
    switch (paramo.action)
    {
    case 3: 
    default: 
      GMTrace.o(700750757888L, 5221);
      return false;
    case 1: 
      bool = b(paramo);
      GMTrace.o(700750757888L, 5221);
      return bool;
    case 2: 
      bool = c(paramo);
      GMTrace.o(700750757888L, 5221);
      return bool;
    case 4: 
      bool = d(paramo);
      GMTrace.o(700750757888L, 5221);
      return bool;
    }
    boolean bool = e(paramo);
    GMTrace.o(700750757888L, 5221);
    return bool;
  }
  
  public abstract boolean b(o paramo);
  
  public abstract boolean c(o paramo);
  
  public abstract boolean d(o paramo);
  
  public abstract boolean e(o paramo);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\i\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */