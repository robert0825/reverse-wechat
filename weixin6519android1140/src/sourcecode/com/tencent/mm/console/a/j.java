package com.tencent.mm.console.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.p.aa;
import com.tencent.mm.pluginsdk.p.w.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;

public final class j
  implements a
{
  static
  {
    GMTrace.i(18811419885568L, 140156);
    b.a(new j(), new String[] { "//wear" });
    GMTrace.o(18811419885568L, 140156);
  }
  
  public j()
  {
    GMTrace.i(18811017232384L, 140153);
    GMTrace.o(18811017232384L, 140153);
  }
  
  public static void init()
  {
    GMTrace.i(18811151450112L, 140154);
    GMTrace.o(18811151450112L, 140154);
  }
  
  public final boolean a(Context paramContext, String[] paramArrayOfString)
  {
    int i = 0;
    GMTrace.i(18811285667840L, 140155);
    if (w.getLogLevel() > 1)
    {
      GMTrace.o(18811285667840L, 140155);
      return false;
    }
    if (paramArrayOfString.length < 2)
    {
      GMTrace.o(18811285667840L, 140155);
      return true;
    }
    paramArrayOfString = paramArrayOfString[1];
    switch (paramArrayOfString.hashCode())
    {
    default: 
      i = -1;
      label86:
      switch (i)
      {
      }
      break;
    }
    for (;;)
    {
      GMTrace.o(18811285667840L, 140155);
      return true;
      if (!paramArrayOfString.equals("log")) {
        break;
      }
      break label86;
      if (!paramArrayOfString.equals("version")) {
        break;
      }
      i = 1;
      break label86;
      if (!paramArrayOfString.equals("reconnect")) {
        break;
      }
      i = 2;
      break label86;
      p.aa.tmk.bBp();
      continue;
      paramArrayOfString = new TextView(paramContext);
      paramArrayOfString.setText(p.aa.tmk.bBo());
      paramArrayOfString.setGravity(19);
      paramArrayOfString.setTextSize(1, 10.0F);
      paramArrayOfString.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
      paramArrayOfString.setTextColor(-16711936);
      paramArrayOfString.setTypeface(Typeface.MONOSPACE);
      i = paramContext.getResources().getDimensionPixelSize(R.f.aQq);
      paramArrayOfString.setPadding(i, i, i, i);
      h.a(paramContext, null, paramArrayOfString, null);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\console\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */