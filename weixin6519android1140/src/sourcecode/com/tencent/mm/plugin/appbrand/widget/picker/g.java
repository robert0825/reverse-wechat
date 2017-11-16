package com.tencent.mm.plugin.appbrand.widget.picker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.appbrand.o.c;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.o.j;

public class g
  extends RelativeLayout
{
  private static final int iRV;
  private final int iRO;
  private final int iRP;
  public i iRQ;
  FrameLayout iRR;
  public a iRS;
  private boolean iRT;
  public b iRU;
  
  static
  {
    GMTrace.i(10129814585344L, 75473);
    iRV = Color.parseColor("#F9F9F9");
    GMTrace.o(10129814585344L, 75473);
  }
  
  public g(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(10128338190336L, 75462);
    this.iRO = a.fromDPToPix(paramContext, 48);
    this.iRP = a.fromDPToPix(paramContext, 240);
    setClickable(true);
    setLongClickable(true);
    paramContext = new RelativeLayout.LayoutParams(-1, this.iRP);
    paramContext.addRule(12);
    Object localObject = new FrameLayout(getContext());
    ((FrameLayout)localObject).setId(o.f.hBh);
    ((FrameLayout)localObject).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(10113708457984L, 75353);
        GMTrace.o(10113708457984L, 75353);
      }
    });
    ((FrameLayout)localObject).setBackgroundColor(iRV);
    this.iRR = ((FrameLayout)localObject);
    addView((View)localObject, paramContext);
    paramContext = new RelativeLayout.LayoutParams(-1, this.iRO);
    paramContext.addRule(2, o.f.hBh);
    localObject = new RelativeLayout(getContext());
    View localView = bG(o.i.diu, o.c.aNQ);
    localView.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(10124848529408L, 75436);
        g localg = g.this;
        if (g.c(g.this) == null) {}
        for (paramAnonymousView = null;; paramAnonymousView = g.c(g.this).adJ())
        {
          g.a(localg, true, paramAnonymousView);
          GMTrace.o(10124848529408L, 75436);
          return;
        }
      }
    });
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -1);
    localLayoutParams.addRule(11);
    ((RelativeLayout)localObject).addView(localView, localLayoutParams);
    localView = bG(o.i.dis, o.c.aNb);
    localView.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(10118540296192L, 75389);
        g.a(g.this, false, null);
        GMTrace.o(10118540296192L, 75389);
      }
    });
    localLayoutParams = new RelativeLayout.LayoutParams(-2, -1);
    localLayoutParams.addRule(9);
    ((RelativeLayout)localObject).addView(localView, localLayoutParams);
    ((RelativeLayout)localObject).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(10125385400320L, 75440);
        GMTrace.o(10125385400320L, 75440);
      }
    });
    ((RelativeLayout)localObject).setBackgroundColor(iRV);
    addView((View)localObject, paramContext);
    GMTrace.o(10128338190336L, 75462);
  }
  
  private View bG(int paramInt1, int paramInt2)
  {
    GMTrace.i(10129277714432L, 75469);
    TextView localTextView = new TextView(new ContextThemeWrapper(getContext(), o.j.hGY));
    localTextView.setTextColor(getResources().getColor(paramInt2));
    localTextView.setText(paramInt1);
    localTextView.setGravity(17);
    GMTrace.o(10129277714432L, 75469);
    return localTextView;
  }
  
  private void e(boolean paramBoolean, Object paramObject)
  {
    GMTrace.i(17287914455040L, 128805);
    if ((!this.iRT) && (this.iRS != null))
    {
      this.iRT = true;
      this.iRS.d(paramBoolean, paramObject);
      this.iRT = false;
    }
    GMTrace.o(17287914455040L, 128805);
  }
  
  final void adM()
  {
    GMTrace.i(17287780237312L, 128804);
    this.iRS = null;
    this.iRU = null;
    GMTrace.o(17287780237312L, 128804);
  }
  
  @SuppressLint({"WrongCall"})
  protected final void bE(int paramInt1, int paramInt2)
  {
    GMTrace.i(10129009278976L, 75467);
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(10129009278976L, 75467);
  }
  
  public void hide()
  {
    GMTrace.i(10128740843520L, 75465);
    super.setVisibility(8);
    e(false, null);
    if (this.iRQ != null) {
      this.iRQ.adH();
    }
    GMTrace.o(10128740843520L, 75465);
  }
  
  protected void onDetachedFromWindow()
  {
    GMTrace.i(10129411932160L, 75470);
    super.onDetachedFromWindow();
    adM();
    removeAllViews();
    GMTrace.o(10129411932160L, 75470);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(10129143496704L, 75468);
    if (!isShown())
    {
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
      GMTrace.o(10129143496704L, 75468);
      return;
    }
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(this.iRO + this.iRP, 1073741824));
    GMTrace.o(10129143496704L, 75468);
  }
  
  public void setVisibility(int paramInt)
  {
    GMTrace.i(10128875061248L, 75466);
    if (paramInt != 0)
    {
      hide();
      GMTrace.o(10128875061248L, 75466);
      return;
    }
    super.setVisibility(paramInt);
    GMTrace.o(10128875061248L, 75466);
  }
  
  public void show()
  {
    GMTrace.i(10128606625792L, 75464);
    if (this.iRQ == null)
    {
      setVisibility(8);
      GMTrace.o(10128606625792L, 75464);
      return;
    }
    setVisibility(0);
    if (this.iRQ != null) {
      this.iRQ.a(this);
    }
    GMTrace.o(10128606625792L, 75464);
  }
  
  public static abstract interface a<T>
  {
    public abstract void d(boolean paramBoolean, T paramT);
  }
  
  public static abstract interface b<T>
  {
    public abstract void aO(T paramT);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\picker\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */