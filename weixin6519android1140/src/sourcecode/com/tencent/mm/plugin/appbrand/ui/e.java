package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.widget.b;
import com.tencent.mm.plugin.appbrand.widget.q;
import com.tencent.mm.plugin.appbrand.widget.q.a;

public final class e
  extends LinearLayout
  implements q.a
{
  public final String hyD;
  private final a[] iCZ;
  private final SparseArray<b> iDa;
  private final SparseArray<b> iDb;
  private int iDc;
  
  public e(Context paramContext, String paramString)
  {
    super(paramContext);
    GMTrace.i(15513019219968L, 115581);
    this.hyD = paramString;
    this.iDa = new SparseArray();
    this.iDb = new SparseArray();
    this.iCZ = new a[4];
    setClickable(false);
    int i = getContext().getResources().getDisplayMetrics().widthPixels;
    int j = a.fromDPToPix(getContext(), 10);
    int k = a.fromDPToPix(getContext(), 4);
    paramContext = new FrameLayout.LayoutParams(i * 3 / 5, -2);
    paramContext.gravity = 53;
    setLayoutParams(paramContext);
    aaU();
    setPadding(j, j, j, j);
    setOrientation(1);
    paramContext = new GradientDrawable();
    paramContext.setCornerRadius(k);
    paramContext.setColor(-652403418);
    setBackground(paramContext);
    paramContext = new LinearLayout.LayoutParams(-1, -2);
    paramString = new LinearLayout.LayoutParams(-1, 2);
    TextView localTextView = new TextView(getContext());
    View localView = new View(getContext());
    localTextView.setTextColor(-1);
    localTextView.setLayoutParams(paramContext);
    localTextView.setTextSize(1, 14.0F);
    localTextView.setText(getContext().getString(o.i.hFY));
    addView(localTextView);
    paramString.setMargins(0, a.fromDPToPix(getContext(), 10), 0, 0);
    localView.setLayoutParams(paramString);
    localView.setBackgroundColor(1728053247);
    addView(localView);
    aaV();
    q.j((Activity)getContext()).a(this);
    GMTrace.o(15513019219968L, 115581);
  }
  
  private void aaU()
  {
    GMTrace.i(18193749901312L, 135554);
    if ((getLayoutParams() != null) && ((getLayoutParams() instanceof ViewGroup.MarginLayoutParams)))
    {
      ((ViewGroup.MarginLayoutParams)getLayoutParams()).topMargin = (b.bX(getContext()) + this.iDc);
      requestLayout();
    }
    GMTrace.o(18193749901312L, 135554);
  }
  
  private void aaV()
  {
    GMTrace.i(15513153437696L, 115582);
    int i = 0;
    while (i < 4)
    {
      a locala = new a(getContext());
      locala.setText(getContext().getString(com.tencent.mm.plugin.appbrand.performance.b.ixe[i]));
      this.iCZ[i] = locala;
      addView(locala);
      i += 1;
    }
    GMTrace.o(15513153437696L, 115582);
  }
  
  public final void D(final int paramInt, final String paramString)
  {
    GMTrace.i(15513287655424L, 115583);
    d.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20695568351232L, 154194);
        e.a(e.this, paramInt, paramString);
        GMTrace.o(20695568351232L, 154194);
      }
    });
    GMTrace.o(15513287655424L, 115583);
  }
  
  public final void bn(final String paramString1, final String paramString2)
  {
    GMTrace.i(15513421873152L, 115584);
    d.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(15504831938560L, 115520);
        e.a(e.this, paramString1, paramString2);
        GMTrace.o(15504831938560L, 115520);
      }
    });
    GMTrace.o(15513421873152L, 115584);
  }
  
  public final void jD(int paramInt)
  {
    GMTrace.i(18193884119040L, 135555);
    this.iDc = paramInt;
    aaU();
    GMTrace.o(18193884119040L, 135555);
  }
  
  private final class a
    extends TextView
  {
    public a(Context paramContext)
    {
      super();
      GMTrace.i(15527917387776L, 115692);
      this$1 = new LinearLayout.LayoutParams(-1, -2);
      int i = a.fromDPToPix(getContext(), 5);
      e.this.setMargins(0, i, 0, i);
      setLayoutParams(e.this);
      setTextSize(1, 12.0F);
      setTextColor(-7171438);
      GMTrace.o(15527917387776L, 115692);
    }
  }
  
  private final class b
    extends TextView
  {
    private String mTitle;
    private String mValue;
    
    public b(Context paramContext)
    {
      super();
      GMTrace.i(15514227179520L, 115590);
      setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
      setTextSize(1, 12.0F);
      setTextColor(-419430401);
      GMTrace.o(15514227179520L, 115590);
    }
    
    private void update()
    {
      GMTrace.i(15514361397248L, 115591);
      setText(String.format("%s: %s", new Object[] { this.mTitle, this.mValue }));
      GMTrace.o(15514361397248L, 115591);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */