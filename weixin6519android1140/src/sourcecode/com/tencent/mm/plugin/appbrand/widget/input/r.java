package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.gmtrace.GMTrace;

public final class r
  extends p
{
  public r(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(17640907079680L, 131435);
    GMTrace.o(17640907079680L, 131435);
  }
  
  public final void acN()
  {
    GMTrace.i(18253342572544L, 135998);
    ad.cb(this).restartInput(this);
    GMTrace.o(18253342572544L, 135998);
  }
  
  public final View acl()
  {
    GMTrace.i(18253074137088L, 135996);
    v localv = v.bW(this);
    GMTrace.o(18253074137088L, 135996);
    return localv;
  }
  
  public final void cQ(boolean paramBoolean)
  {
    GMTrace.i(18253208354816L, 135997);
    adg();
    int i = getInputType() | 0x1;
    if (paramBoolean) {
      i |= 0x80;
    }
    for (;;)
    {
      setInputType(i);
      super.cQ(paramBoolean);
      adh();
      GMTrace.o(18253208354816L, 135997);
      return;
      i &= 0xFF7F;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */