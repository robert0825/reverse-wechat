package com.tencent.mm.plugin.radar.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.k;
import com.tencent.mm.plugin.radar.a.e.a;

public class RadarStateChooseView
  extends RelativeLayout
{
  boolean oaV;
  Animation oaW;
  Animation oaX;
  boolean oaY;
  public e.a oaZ;
  
  public RadarStateChooseView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8915144146944L, 66423);
    this.oaV = false;
    this.oaW = null;
    this.oaX = null;
    this.oaY = true;
    this.oaZ = e.a.nZW;
    GMTrace.o(8915144146944L, 66423);
  }
  
  public RadarStateChooseView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8915278364672L, 66424);
    this.oaV = false;
    this.oaW = null;
    this.oaX = null;
    this.oaY = true;
    this.oaZ = e.a.nZW;
    GMTrace.o(8915278364672L, 66424);
  }
  
  final void aZU()
  {
    GMTrace.i(8915546800128L, 66426);
    switch (3.obb[this.oaZ.ordinal()])
    {
    default: 
      setVisibility(4);
      GMTrace.o(8915546800128L, 66426);
      return;
    case 1: 
      setVisibility(4);
      GMTrace.o(8915546800128L, 66426);
      return;
    }
    setBackgroundResource(R.k.cOt);
    setVisibility(0);
    GMTrace.o(8915546800128L, 66426);
  }
  
  final void init()
  {
    GMTrace.i(8915412582400L, 66425);
    if (this.oaW == null)
    {
      this.oaW = AnimationUtils.loadAnimation(getContext(), R.a.aLK);
      this.oaW.setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          GMTrace.i(8916620541952L, 66434);
          GMTrace.o(8916620541952L, 66434);
        }
        
        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
          GMTrace.i(8916754759680L, 66435);
          GMTrace.o(8916754759680L, 66435);
        }
        
        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
          GMTrace.i(8916486324224L, 66433);
          GMTrace.o(8916486324224L, 66433);
        }
      });
    }
    if (this.oaX == null)
    {
      this.oaX = AnimationUtils.loadAnimation(getContext(), R.a.aLJ);
      this.oaX.setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          GMTrace.i(8906285776896L, 66357);
          RadarStateChooseView.a(RadarStateChooseView.this);
          RadarStateChooseView.this.setVisibility(8);
          GMTrace.o(8906285776896L, 66357);
        }
        
        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
          GMTrace.i(8906419994624L, 66358);
          GMTrace.o(8906419994624L, 66358);
        }
        
        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
          GMTrace.i(8906151559168L, 66356);
          GMTrace.o(8906151559168L, 66356);
        }
      });
    }
    GMTrace.o(8915412582400L, 66425);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\radar\ui\RadarStateChooseView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */