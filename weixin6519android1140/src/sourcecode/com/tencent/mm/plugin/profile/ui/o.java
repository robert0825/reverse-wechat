package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;

final class o
  implements HelperHeaderPreference.a
{
  private final Context context;
  
  public o(Context paramContext)
  {
    GMTrace.i(6813697179648L, 50766);
    this.context = paramContext;
    GMTrace.o(6813697179648L, 50766);
  }
  
  public final void a(HelperHeaderPreference paramHelperHeaderPreference)
  {
    GMTrace.i(6813965615104L, 50768);
    paramHelperHeaderPreference.gD(true);
    GMTrace.o(6813965615104L, 50768);
  }
  
  public final CharSequence getHint()
  {
    GMTrace.i(6813831397376L, 50767);
    String str = this.context.getString(R.l.djx);
    GMTrace.o(6813831397376L, 50767);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */