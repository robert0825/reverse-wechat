package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.v.a.f;
import com.tencent.mm.v.a.h;
import com.tencent.mm.v.a.m;

public class MMDotView
  extends LinearLayout
{
  int fMw;
  public int wbw;
  public int wbx;
  
  public MMDotView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3370475585536L, 25112);
    this.fMw = 9;
    this.wbw = a.f.gcH;
    this.wbx = a.f.aYL;
    init(paramContext, paramAttributeSet);
    GMTrace.o(3370475585536L, 25112);
  }
  
  @TargetApi(11)
  public MMDotView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3370341367808L, 25111);
    this.fMw = 9;
    this.wbw = a.f.gcH;
    this.wbx = a.f.aYL;
    init(paramContext, paramAttributeSet);
    GMTrace.o(3370341367808L, 25111);
  }
  
  private void init(Context paramContext, AttributeSet paramAttributeSet)
  {
    GMTrace.i(3370609803264L, 25113);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.m.enO);
    int i = paramContext.getResourceId(a.m.ggP, 0);
    paramContext.recycle();
    BU(i);
    GMTrace.o(3370609803264L, 25113);
  }
  
  public final void BU(int paramInt)
  {
    GMTrace.i(3370744020992L, 25114);
    w.v("MicroMsg.MMDotView", "setDotCount:%d", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt < 0)
    {
      GMTrace.o(3370744020992L, 25114);
      return;
    }
    int i = paramInt;
    if (paramInt > this.fMw)
    {
      w.i("MicroMsg.MMDotView", "large than max count");
      i = this.fMw;
    }
    removeAllViews();
    while (i != 0)
    {
      localImageView = (ImageView)View.inflate(getContext(), a.h.gfM, null);
      localImageView.setImageResource(this.wbw);
      addView(localImageView);
      i -= 1;
    }
    ImageView localImageView = (ImageView)getChildAt(0);
    if (localImageView != null) {
      localImageView.setImageResource(this.wbx);
    }
    GMTrace.o(3370744020992L, 25114);
  }
  
  public final void BV(int paramInt)
  {
    GMTrace.i(3370878238720L, 25115);
    w.v("MicroMsg.MMDotView", "setSelectedDot:target index is %d", new Object[] { Integer.valueOf(paramInt) });
    int i;
    if (paramInt >= getChildCount()) {
      i = getChildCount() - 1;
    }
    for (;;)
    {
      w.v("MicroMsg.MMDotView", "setSelectedDot:after adjust index is %d", new Object[] { Integer.valueOf(i) });
      paramInt = 0;
      while (paramInt < getChildCount())
      {
        ((ImageView)getChildAt(paramInt)).setImageResource(this.wbw);
        paramInt += 1;
      }
      i = paramInt;
      if (paramInt < 0) {
        i = 0;
      }
    }
    ImageView localImageView = (ImageView)getChildAt(i);
    if (localImageView != null) {
      localImageView.setImageResource(this.wbx);
    }
    GMTrace.o(3370878238720L, 25115);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\MMDotView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */