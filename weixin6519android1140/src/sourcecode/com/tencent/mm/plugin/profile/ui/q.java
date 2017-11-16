package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;

final class q
  implements HelperHeaderPreference.a
{
  private Context context;
  
  public q(Context paramContext)
  {
    GMTrace.i(6758667911168L, 50356);
    this.context = paramContext;
    GMTrace.o(6758667911168L, 50356);
  }
  
  public final void a(HelperHeaderPreference paramHelperHeaderPreference)
  {
    GMTrace.i(6758936346624L, 50358);
    if ((com.tencent.mm.y.q.zP() & 0x8000) == 0) {}
    for (boolean bool = true;; bool = false)
    {
      paramHelperHeaderPreference.gD(bool);
      GMTrace.o(6758936346624L, 50358);
      return;
    }
  }
  
  public final CharSequence getHint()
  {
    GMTrace.i(6758802128896L, 50357);
    String str = this.context.getString(R.l.djv);
    GMTrace.o(6758802128896L, 50357);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */