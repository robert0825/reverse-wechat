package com.tencent.mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.c;
import com.tencent.mm.plugin.appbrand.o.f;

public final class a
  extends g
{
  private static final int iMf;
  
  static
  {
    GMTrace.i(10131559415808L, 75486);
    iMf = o.f.hBg;
    GMTrace.o(10131559415808L, 75486);
  }
  
  public a(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(10130888327168L, 75481);
    super.setId(iMf);
    setBackgroundResource(o.c.aNW);
    setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(10130619891712L, 75479);
        a.this.hide();
        GMTrace.o(10130619891712L, 75479);
      }
    });
    GMTrace.o(10130888327168L, 75481);
  }
  
  public static a cc(View paramView)
  {
    GMTrace.i(10130754109440L, 75480);
    paramView = (a)paramView.getRootView().findViewById(iMf);
    GMTrace.o(10130754109440L, 75480);
    return paramView;
  }
  
  public final void hide()
  {
    GMTrace.i(10131425198080L, 75485);
    super.hide();
    GMTrace.o(10131425198080L, 75485);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(10131022544896L, 75482);
    if (isShown())
    {
      if ((getParent() != null) && ((getParent() instanceof ViewGroup))) {}
      for (int i = ((ViewGroup)getParent()).getMeasuredHeight(); i > 0; i = 0)
      {
        bE(paramInt1, View.MeasureSpec.makeMeasureSpec(i, 1073741824));
        GMTrace.o(10131022544896L, 75482);
        return;
      }
    }
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(10131022544896L, 75482);
  }
  
  public final void setId(int paramInt)
  {
    GMTrace.i(10131156762624L, 75483);
    GMTrace.o(10131156762624L, 75483);
  }
  
  public final void show()
  {
    GMTrace.i(10131290980352L, 75484);
    super.show();
    GMTrace.o(10131290980352L, 75484);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\picker\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */