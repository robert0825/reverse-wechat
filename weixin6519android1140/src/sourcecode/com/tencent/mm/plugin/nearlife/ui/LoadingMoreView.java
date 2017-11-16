package com.tencent.mm.plugin.nearlife.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;

public class LoadingMoreView
  extends LinearLayout
{
  private Context context;
  private ImageView eKZ;
  protected LinearLayout jCz;
  
  public LoadingMoreView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12567208525824L, 93633);
    this.context = paramContext;
    paramContext = LayoutInflater.from(this.context).inflate(R.i.cAL, this, true);
    this.eKZ = ((ImageView)findViewById(R.h.bJZ));
    this.jCz = ((LinearLayout)paramContext.findViewById(R.h.bKD));
    this.jCz.setVisibility(0);
    paramContext = new RotateAnimation(0.0F, 359.0F, 1, 0.5F, 1, 0.5F);
    paramContext.setDuration(1000L);
    paramContext.setRepeatCount(-1);
    paramContext.setInterpolator(new LinearInterpolator());
    this.eKZ.startAnimation(paramContext);
    GMTrace.o(12567208525824L, 93633);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nearlife\ui\LoadingMoreView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */