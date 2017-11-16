package com.tencent.mm.plugin.voiceprint.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.sdk.platformtools.w;

public class VoiceTipInfoView
  extends LinearLayout
{
  TextView izE;
  public ProgressBar ktM;
  boolean qDI;
  private boolean qDJ;
  private TextView qDK;
  private boolean qDL;
  private float qDM;
  TextView qDi;
  
  public VoiceTipInfoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12521842933760L, 93295);
    this.qDI = false;
    this.qDJ = false;
    this.qDL = false;
    this.qDM = 0.0F;
    paramContext = LayoutInflater.from(paramContext).inflate(R.i.cHC, this, true);
    this.ktM = ((ProgressBar)paramContext.findViewById(R.h.bKy));
    btt();
    this.izE = ((TextView)paramContext.findViewById(R.h.clD));
    this.qDi = ((TextView)paramContext.findViewById(R.h.clF));
    this.qDK = ((TextView)paramContext.findViewById(R.h.clE));
    reset();
    GMTrace.o(12521842933760L, 93295);
  }
  
  public final void JN(String paramString)
  {
    GMTrace.i(12522379804672L, 93299);
    this.qDi.setText(paramString);
    this.qDi.setVisibility(0);
    GMTrace.o(12522379804672L, 93299);
  }
  
  public final void bts()
  {
    GMTrace.i(12522111369216L, 93297);
    w.d("MicroMsg.VoiceTipInfoView", "mProgressBar show");
    this.ktM.setVisibility(0);
    GMTrace.o(12522111369216L, 93297);
  }
  
  public final void btt()
  {
    GMTrace.i(12522245586944L, 93298);
    w.d("MicroMsg.VoiceTipInfoView", "mProgressBar hide");
    this.ktM.setVisibility(8);
    GMTrace.o(12522245586944L, 93298);
  }
  
  public final void btu()
  {
    GMTrace.i(12522648240128L, 93301);
    w.d("MicroMsg.VoiceTipInfoView", "showTitle, titleTv.getVisibility:%d, mAnimingTitle:%b", new Object[] { Integer.valueOf(this.izE.getVisibility()), Boolean.valueOf(this.qDI) });
    if (((this.izE.getVisibility() == 4) || (this.izE.getVisibility() == 8)) && (!this.qDI))
    {
      this.izE.clearAnimation();
      this.qDI = true;
      TextView localTextView = this.izE;
      Object localObject = getContext();
      a.a local2 = new a.a()
      {
        public final void btk()
        {
          GMTrace.i(12533251440640L, 93380);
          GMTrace.o(12533251440640L, 93380);
        }
        
        public final void btl()
        {
          GMTrace.i(12533385658368L, 93381);
          VoiceTipInfoView.a(VoiceTipInfoView.this).setVisibility(0);
          VoiceTipInfoView.b(VoiceTipInfoView.this);
          GMTrace.o(12533385658368L, 93381);
        }
      };
      localObject = AnimationUtils.loadAnimation((Context)localObject, R.a.aLs);
      ((Animation)localObject).setDuration(300L);
      ((Animation)localObject).setFillAfter(true);
      ((Animation)localObject).setRepeatCount(0);
      ((Animation)localObject).setAnimationListener(new a.4(local2));
      localTextView.startAnimation((Animation)localObject);
      GMTrace.o(12522648240128L, 93301);
      return;
    }
    w.d("MicroMsg.VoiceTipInfoView", "showTitle, directly set to VISIBLE");
    this.izE.clearAnimation();
    this.izE.setVisibility(0);
    this.izE.invalidate();
    GMTrace.o(12522648240128L, 93301);
  }
  
  public final void btv()
  {
    GMTrace.i(12522782457856L, 93302);
    this.qDi.setVisibility(8);
    GMTrace.o(12522782457856L, 93302);
  }
  
  public final void btw()
  {
    GMTrace.i(12522916675584L, 93303);
    if ((this.qDK.getVisibility() == 4) && (!this.qDL))
    {
      this.qDK.clearAnimation();
      this.qDL = true;
      TextView localTextView = this.qDK;
      getContext();
      a.a local4 = new a.a()
      {
        public final void btk()
        {
          GMTrace.i(12521574498304L, 93293);
          GMTrace.o(12521574498304L, 93293);
        }
        
        public final void btl()
        {
          GMTrace.i(12521708716032L, 93294);
          VoiceTipInfoView.c(VoiceTipInfoView.this).setVisibility(0);
          VoiceTipInfoView.d(VoiceTipInfoView.this);
          GMTrace.o(12521708716032L, 93294);
        }
      };
      TranslateAnimation localTranslateAnimation = new TranslateAnimation(1, -1.0F, 1, 0.0F, 1, 0.0F, 1, 0.0F);
      localTranslateAnimation.setDuration(200L);
      localTranslateAnimation.setFillAfter(true);
      localTranslateAnimation.setRepeatCount(0);
      localTranslateAnimation.setAnimationListener(new a.5(local4));
      localTextView.startAnimation(localTranslateAnimation);
      GMTrace.o(12522916675584L, 93303);
      return;
    }
    this.qDK.clearAnimation();
    this.qDK.setVisibility(0);
    GMTrace.o(12522916675584L, 93303);
  }
  
  public final void btx()
  {
    GMTrace.i(12523050893312L, 93304);
    if ((this.qDK.getVisibility() == 0) && (!this.qDL))
    {
      this.qDK.clearAnimation();
      this.qDL = true;
      a.a(this.qDK, getContext(), new a.a()
      {
        public final void btk()
        {
          GMTrace.i(12507615854592L, 93189);
          GMTrace.o(12507615854592L, 93189);
        }
        
        public final void btl()
        {
          GMTrace.i(12507750072320L, 93190);
          VoiceTipInfoView.c(VoiceTipInfoView.this).setVisibility(4);
          VoiceTipInfoView.d(VoiceTipInfoView.this);
          GMTrace.o(12507750072320L, 93190);
        }
      });
      GMTrace.o(12523050893312L, 93304);
      return;
    }
    this.qDK.clearAnimation();
    this.qDK.setVisibility(4);
    GMTrace.o(12523050893312L, 93304);
  }
  
  public final void reset()
  {
    GMTrace.i(12521977151488L, 93296);
    this.qDi.setTextSize(0, getContext().getResources().getDimension(R.f.aTh));
    this.qDM = this.qDi.getTextSize();
    this.qDi.clearAnimation();
    w.d("MicroMsg.VoiceTipInfoView", "mTipSize %f", new Object[] { Float.valueOf(this.qDM) });
    GMTrace.o(12521977151488L, 93296);
  }
  
  public final void wb(int paramInt)
  {
    GMTrace.i(12522514022400L, 93300);
    this.izE.setText(paramInt);
    this.izE.setVisibility(0);
    GMTrace.o(12522514022400L, 93300);
  }
  
  public final void wc(int paramInt)
  {
    GMTrace.i(12523185111040L, 93305);
    this.qDK.setText(paramInt);
    GMTrace.o(12523185111040L, 93305);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\ui\VoiceTipInfoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */