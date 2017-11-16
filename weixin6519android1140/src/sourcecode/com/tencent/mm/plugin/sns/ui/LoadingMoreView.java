package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;

public class LoadingMoreView
  extends LinearLayout
{
  private Context context;
  private ImageView eKZ;
  protected LinearLayout jCA;
  protected LinearLayout jCz;
  protected LinearLayout pTA;
  protected LinearLayout pTB;
  protected TextView pTC;
  
  public LoadingMoreView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(8714891296768L, 64931);
    this.context = paramContext;
    init();
    GMTrace.o(8714891296768L, 64931);
  }
  
  public LoadingMoreView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8714757079040L, 64930);
    this.context = paramContext;
    init();
    GMTrace.o(8714757079040L, 64930);
  }
  
  private void init()
  {
    GMTrace.i(8715025514496L, 64932);
    Object localObject = LayoutInflater.from(this.context).inflate(i.g.pfX, this, true);
    this.eKZ = ((ImageView)findViewById(i.f.bdG));
    this.jCz = ((LinearLayout)((View)localObject).findViewById(i.f.bKD));
    this.jCA = ((LinearLayout)((View)localObject).findViewById(i.f.bKB));
    this.pTA = ((LinearLayout)((View)localObject).findViewById(i.f.pei));
    this.pTB = ((LinearLayout)((View)localObject).findViewById(i.f.pbG));
    this.pTC = ((TextView)((View)localObject).findViewById(i.f.pbH));
    this.jCz.setVisibility(0);
    this.jCA.setVisibility(8);
    this.pTA.setVisibility(8);
    this.pTB.setVisibility(8);
    localObject = new RotateAnimation(0.0F, 359.0F, 1, 0.5F, 1, 0.5F);
    ((Animation)localObject).setDuration(1000L);
    ((Animation)localObject).setRepeatCount(-1);
    ((Animation)localObject).setInterpolator(new LinearInterpolator());
    this.eKZ.startAnimation((Animation)localObject);
    GMTrace.o(8715025514496L, 64932);
  }
  
  public final void hY(boolean paramBoolean)
  {
    GMTrace.i(8715159732224L, 64933);
    this.jCz.setVisibility(8);
    if (paramBoolean)
    {
      this.pTA.setVisibility(0);
      this.jCA.setVisibility(8);
    }
    for (;;)
    {
      this.pTB.setVisibility(8);
      GMTrace.o(8715159732224L, 64933);
      return;
      this.jCA.setVisibility(0);
      this.pTA.setVisibility(8);
    }
  }
  
  public final void vh(int paramInt)
  {
    GMTrace.i(8715293949952L, 64934);
    this.jCz.setVisibility(8);
    this.pTA.setVisibility(8);
    this.jCA.setVisibility(8);
    this.pTB.setVisibility(0);
    if (paramInt == 2001)
    {
      this.pTC.setText(getContext().getResources().getString(i.j.pks));
      GMTrace.o(8715293949952L, 64934);
      return;
    }
    if (paramInt == 2003)
    {
      this.pTC.setText(getContext().getResources().getString(i.j.piJ));
      GMTrace.o(8715293949952L, 64934);
      return;
    }
    if (paramInt == 2004) {
      this.pTC.setText(getContext().getResources().getString(i.j.pkt));
    }
    GMTrace.o(8715293949952L, 64934);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\LoadingMoreView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */