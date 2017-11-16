package com.tencent.mm.plugin.appbrand.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.o.e;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.o.h;

public final class AppBrandOptionButton
  extends FrameLayout
{
  public boolean iJk;
  public View iJl;
  private View iJm;
  public TextView iJn;
  public ImageButton iJo;
  
  public AppBrandOptionButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(17275163770880L, 128710);
    this.iJk = true;
    init(paramContext);
    GMTrace.o(17275163770880L, 128710);
  }
  
  public AppBrandOptionButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(17275297988608L, 128711);
    this.iJk = true;
    init(paramContext);
    GMTrace.o(17275297988608L, 128711);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(17275432206336L, 128712);
    setBackgroundResource(o.e.aTq);
    this.iJl = LayoutInflater.from(paramContext).inflate(o.g.geF, this, false);
    this.iJm = this.iJl.findViewById(o.f.divider);
    this.iJn = ((TextView)this.iJl.findViewById(o.f.bcH));
    this.iJn.setMaxLines(1);
    this.iJn.setClickable(false);
    this.iJn.setBackground(null);
    View localView = this.iJl.findViewById(o.f.gcT);
    if (localView != null) {
      localView.setVisibility(8);
    }
    addView(this.iJl, new FrameLayout.LayoutParams(-2, -1, 17));
    this.iJl.setVisibility(8);
    this.iJo = new ImageButton(paramContext);
    this.iJo.setClickable(false);
    this.iJo.setBackground(null);
    addView(this.iJo, new FrameLayout.LayoutParams(getResources().getDimensionPixelSize(o.d.aTi), -1, 17));
    GMTrace.o(17275432206336L, 128712);
  }
  
  public final void setColor(int paramInt)
  {
    GMTrace.i(18247436992512L, 135954);
    this.iJn.setTextColor(paramInt);
    this.iJm.setBackgroundColor(android.support.v4.b.b.i(paramInt, 77));
    if ((this.iJo.getDrawable() == null) || ((this.iJo.getDrawable() instanceof com.tencent.mm.svg.a.b)))
    {
      this.iJo.setImageResource(o.h.hDE);
      this.iJo.setColorFilter(paramInt, PorterDuff.Mode.SRC_ATOP);
    }
    GMTrace.o(18247436992512L, 135954);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\AppBrandOptionButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */