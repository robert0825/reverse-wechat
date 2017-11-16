package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.y.q;

final class r
  implements HelperHeaderPreference.a
{
  private Context context;
  
  public r(Context paramContext)
  {
    GMTrace.i(6733032325120L, 50165);
    this.context = paramContext;
    GMTrace.o(6733032325120L, 50165);
  }
  
  public final void a(HelperHeaderPreference paramHelperHeaderPreference)
  {
    GMTrace.i(6733300760576L, 50167);
    if ((q.zP() & 0x1000000) == 0) {}
    for (boolean bool = true;; bool = false)
    {
      paramHelperHeaderPreference.gD(bool);
      GMTrace.o(6733300760576L, 50167);
      return;
    }
  }
  
  public final CharSequence getHint()
  {
    GMTrace.i(6733166542848L, 50166);
    String str = this.context.getString(R.l.djP);
    GMTrace.o(6733166542848L, 50166);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */