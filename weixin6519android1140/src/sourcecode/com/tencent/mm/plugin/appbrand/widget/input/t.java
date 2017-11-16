package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.appbrand.o.c;
import com.tencent.mm.plugin.appbrand.o.e;
import com.tencent.mm.plugin.appbrand.o.f;

public final class t
  extends LinearLayout
{
  private static final int iMf;
  private boolean iMS;
  a iMT;
  u iMU;
  EditText jZ;
  
  static
  {
    GMTrace.i(18285286391808L, 136236);
    iMf = o.f.hAU;
    GMTrace.o(18285286391808L, 136236);
  }
  
  private t(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(18284078432256L, 136227);
    this.iMS = false;
    super.setId(iMf);
    setOrientation(1);
    setBackgroundResource(o.c.aOz);
    paramContext = new ViewGroup.LayoutParams(-1, a.fromDPToPix(getContext(), 30));
    Object localObject = new RelativeLayout(getContext());
    ((RelativeLayout)localObject).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18280991424512L, 136204);
        t.a(t.this);
        t.this.setVisibility(8);
        GMTrace.o(18280991424512L, 136204);
      }
    });
    ((RelativeLayout)localObject).setBackgroundResource(o.e.hAz);
    ImageView localImageView = new ImageView(getContext());
    localImageView.setImageResource(o.e.hAy);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams.addRule(13);
    ((RelativeLayout)localObject).addView(localImageView, localLayoutParams);
    addView((View)localObject, paramContext);
    paramContext = new ViewGroup.LayoutParams(-1, a.fromDPToPix(getContext(), 240));
    localObject = new u(getContext());
    this.iMU = ((u)localObject);
    addView((View)localObject, paramContext);
    GMTrace.o(18284078432256L, 136227);
  }
  
  public static t bU(View paramView)
  {
    GMTrace.i(18283809996800L, 136225);
    paramView = (t)paramView.getRootView().findViewById(iMf);
    GMTrace.o(18283809996800L, 136225);
    return paramView;
  }
  
  public static t bV(View paramView)
  {
    GMTrace.i(18283944214528L, 136226);
    Object localObject2 = bU(paramView);
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject2 = l.bQ(paramView);
      if (localObject2 == null)
      {
        GMTrace.o(18283944214528L, 136226);
        return null;
      }
      localObject1 = new t(paramView.getContext());
      ((l)localObject2).g((View)localObject1, false);
    }
    GMTrace.o(18283944214528L, 136226);
    return (t)localObject1;
  }
  
  private void onDone()
  {
    GMTrace.i(18284212649984L, 136228);
    if ((!this.iMS) && (this.iMT != null))
    {
      this.iMS = true;
      this.iMT.onDone();
      this.iMS = false;
    }
    GMTrace.o(18284212649984L, 136228);
  }
  
  final void acP()
  {
    GMTrace.i(18284749520896L, 136232);
    if (this.jZ != null)
    {
      this.jZ.clearFocus();
      this.jZ = null;
      this.iMT = null;
      this.iMS = false;
    }
    GMTrace.o(18284749520896L, 136232);
  }
  
  protected final void onDetachedFromWindow()
  {
    GMTrace.i(18285017956352L, 136234);
    super.onDetachedFromWindow();
    removeAllViews();
    GMTrace.o(18285017956352L, 136234);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(18284883738624L, 136233);
    if (isShown()) {
      paramInt2 = View.MeasureSpec.makeMeasureSpec(a.fromDPToPix(getContext(), 270), 1073741824);
    }
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(18284883738624L, 136233);
  }
  
  public final void setId(int paramInt)
  {
    GMTrace.i(18284346867712L, 136229);
    GMTrace.o(18284346867712L, 136229);
  }
  
  public final void setInputEditText(EditText paramEditText)
  {
    GMTrace.i(18284615303168L, 136231);
    this.jZ = paramEditText;
    this.iMU.setInputEditText(paramEditText);
    GMTrace.o(18284615303168L, 136231);
  }
  
  public final void setVisibility(int paramInt)
  {
    GMTrace.i(18284481085440L, 136230);
    if ((getVisibility() == paramInt) && ((getVisibility() == 0) || (getVisibility() == 8)))
    {
      GMTrace.o(18284481085440L, 136230);
      return;
    }
    if (paramInt != 0)
    {
      super.setVisibility(8);
      onDone();
      GMTrace.o(18284481085440L, 136230);
      return;
    }
    super.setVisibility(paramInt);
    GMTrace.o(18284481085440L, 136230);
  }
  
  public static abstract interface a
  {
    public abstract void onDone();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */