package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.y.q;

final class p
  implements HelperHeaderPreference.a
{
  private Context context;
  
  public p(Context paramContext)
  {
    GMTrace.i(6719878987776L, 50067);
    this.context = paramContext;
    GMTrace.o(6719878987776L, 50067);
  }
  
  public final void a(HelperHeaderPreference paramHelperHeaderPreference)
  {
    GMTrace.i(6720147423232L, 50069);
    if ((q.zP() & 0x2000) == 0) {}
    for (boolean bool = true;; bool = false)
    {
      paramHelperHeaderPreference.gD(bool);
      GMTrace.o(6720147423232L, 50069);
      return;
    }
  }
  
  public final CharSequence getHint()
  {
    GMTrace.i(6720013205504L, 50068);
    String str = this.context.getString(R.l.djm);
    GMTrace.o(6720013205504L, 50068);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */