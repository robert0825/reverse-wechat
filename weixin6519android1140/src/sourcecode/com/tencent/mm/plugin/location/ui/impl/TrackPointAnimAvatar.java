package com.tencent.mm.plugin.location.ui.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;

public class TrackPointAnimAvatar
  extends RelativeLayout
{
  private ImageView gDc;
  private Context mContext;
  private LinearLayout mEJ;
  private Animation mEK;
  private Animation mEL;
  
  public TrackPointAnimAvatar(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(9691996356608L, 72211);
    this.mContext = paramContext;
    init();
    GMTrace.o(9691996356608L, 72211);
  }
  
  public TrackPointAnimAvatar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9691862138880L, 72210);
    this.mContext = paramContext;
    init();
    GMTrace.o(9691862138880L, 72210);
  }
  
  private void init()
  {
    GMTrace.i(9692130574336L, 72212);
    View localView = View.inflate(this.mContext, R.i.cHc, this);
    this.mEJ = ((LinearLayout)localView.findViewById(R.h.bdX));
    this.gDc = ((ImageView)localView.findViewById(R.h.bdW));
    this.mEK = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 1, -0.5F);
    this.mEK.setDuration(500L);
    this.mEK.setFillAfter(true);
    this.mEL = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, -0.5F, 1, 0.0F);
    this.mEL.setDuration(500L);
    this.mEL.setFillAfter(true);
    this.mEK.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(9697767718912L, 72254);
        TrackPointAnimAvatar.this.bringToFront();
        TrackPointAnimAvatar.b(TrackPointAnimAvatar.this).startAnimation(TrackPointAnimAvatar.a(TrackPointAnimAvatar.this));
        GMTrace.o(9697767718912L, 72254);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(9697633501184L, 72253);
        GMTrace.o(9697633501184L, 72253);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(9697499283456L, 72252);
        GMTrace.o(9697499283456L, 72252);
      }
    });
    this.mEL.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(9685419687936L, 72162);
        TrackPointAnimAvatar.this.bringToFront();
        TrackPointAnimAvatar.b(TrackPointAnimAvatar.this).startAnimation(TrackPointAnimAvatar.c(TrackPointAnimAvatar.this));
        GMTrace.o(9685419687936L, 72162);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(9685285470208L, 72161);
        GMTrace.o(9685285470208L, 72161);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(9685151252480L, 72160);
        GMTrace.o(9685151252480L, 72160);
      }
    });
    GMTrace.o(9692130574336L, 72212);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\impl\TrackPointAnimAvatar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */