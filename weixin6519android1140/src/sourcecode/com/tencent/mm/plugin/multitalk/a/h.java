package com.tencent.mm.plugin.multitalk.a;

import android.app.Activity;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.as.a;

public final class h
{
  private boolean nmT;
  private boolean nmU;
  
  public h()
  {
    GMTrace.i(4737885798400L, 35300);
    GMTrace.o(4737885798400L, 35300);
  }
  
  public final void reset()
  {
    GMTrace.i(4738288451584L, 35303);
    this.nmU = false;
    this.nmT = false;
    GMTrace.o(4738288451584L, 35303);
  }
  
  public final void x(Activity paramActivity)
  {
    GMTrace.i(4738020016128L, 35301);
    if (!this.nmT)
    {
      this.nmT = true;
      a.a(paramActivity, R.l.dJZ, null);
    }
    GMTrace.o(4738020016128L, 35301);
  }
  
  public final void y(Activity paramActivity)
  {
    GMTrace.i(4738154233856L, 35302);
    if (!this.nmU)
    {
      this.nmU = true;
      a.a(paramActivity, R.l.eiP, null);
    }
    GMTrace.o(4738154233856L, 35302);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */