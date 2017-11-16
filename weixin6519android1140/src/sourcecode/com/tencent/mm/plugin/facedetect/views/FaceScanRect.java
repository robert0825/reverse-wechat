package com.tencent.mm.plugin.facedetect.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.facedetect.a.b;
import com.tencent.mm.plugin.facedetect.a.c;
import com.tencent.mm.plugin.facedetect.a.e;
import com.tencent.mm.plugin.facedetect.a.g;
import com.tencent.mm.sdk.platformtools.w;

public class FaceScanRect
  extends RelativeLayout
{
  public View kZL;
  private ImageView kZM;
  private ImageView kZN;
  private ImageView kZO;
  private ImageView kZP;
  private ImageView kZQ;
  private ImageView kZR;
  private ImageView kZS;
  private ImageView kZT;
  public ImageView[] kZU;
  private ScaleAnimation kZV;
  private ScaleAnimation kZW;
  private ScaleAnimation kZX;
  private ScaleAnimation kZY;
  public TranslateAnimation kZZ;
  public b laa;
  public ViewGroup lab;
  public View lac;
  public int lad;
  
  public FaceScanRect(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(5932020924416L, 44197);
    GMTrace.o(5932020924416L, 44197);
  }
  
  public FaceScanRect(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(5932155142144L, 44198);
    this.kZL = null;
    this.kZM = null;
    this.kZN = null;
    this.kZO = null;
    this.kZP = null;
    this.kZQ = null;
    this.kZR = null;
    this.kZS = null;
    this.kZT = null;
    this.kZU = null;
    this.kZV = null;
    this.kZW = null;
    this.kZX = null;
    this.kZY = null;
    this.kZZ = null;
    this.laa = null;
    this.lab = null;
    this.lac = null;
    LayoutInflater.from(paramContext).inflate(a.g.kQu, this, true);
    this.kZL = findViewById(a.e.kPX);
    this.kZM = ((ImageView)findViewById(a.e.kPV));
    this.kZN = ((ImageView)findViewById(a.e.kPW));
    this.kZO = ((ImageView)findViewById(a.e.kPS));
    this.kZP = ((ImageView)findViewById(a.e.kPR));
    this.kZQ = ((ImageView)findViewById(a.e.kPU));
    this.kZR = ((ImageView)findViewById(a.e.kPT));
    this.kZS = ((ImageView)findViewById(a.e.kPP));
    this.kZT = ((ImageView)findViewById(a.e.kPQ));
    this.lac = findViewById(a.e.kPG);
    this.lab = ((ViewGroup)findViewById(a.e.kPD));
    this.kZU = new ImageView[] { this.kZM, this.kZN, this.kZO, this.kZP, this.kZQ, this.kZR, this.kZS, this.kZT };
    this.lad = a.lag;
    this.kZZ = new TranslateAnimation(2, 0.0F, 2, 1.0F, 2, 0.0F, 2, 0.0F);
    this.kZZ.setRepeatCount(-1);
    this.kZZ.setRepeatMode(1);
    this.kZZ.setDuration(1000L);
    GMTrace.o(5932155142144L, 44198);
  }
  
  public final void b(Animation.AnimationListener paramAnimationListener)
  {
    GMTrace.i(14534571982848L, 108291);
    if (this.lad == a.laf)
    {
      w.w("MicroMsg.FaceScanRect", "hy: already closed");
      if (paramAnimationListener != null) {
        paramAnimationListener.onAnimationEnd(null);
      }
      GMTrace.o(14534571982848L, 108291);
      return;
    }
    this.lad = a.laf;
    int i = getWidth();
    int j = getHeight();
    int k = getResources().getDimensionPixelSize(a.c.kPj);
    int m = getResources().getDimensionPixelSize(a.c.kPk);
    float f1 = (i - k * 2 - m * 2 + m) / m;
    float f2 = (j - k * 2 - m * 2 + m) / m;
    w.i("MicroMsg.FaceScanRect", "hy: horizontalScale : %f, verticalScale : %f", new Object[] { Float.valueOf(f1), Float.valueOf(f2) });
    this.kZV = new ScaleAnimation(1.0F, f1, 1.0F, 1.0F, 1, 0.0F, 1, 0.0F);
    this.kZV.setFillAfter(true);
    this.kZV.setDuration(1500L);
    this.kZV.setInterpolator(getContext(), 17563654);
    this.kZV.setAnimationListener(paramAnimationListener);
    this.kZW = new ScaleAnimation(1.0F, f1, 1.0F, 1.0F, 1, 1.0F, 1, 0.0F);
    this.kZW.setFillAfter(true);
    this.kZW.setDuration(1500L);
    this.kZW.setInterpolator(getContext(), 17563654);
    this.kZX = new ScaleAnimation(1.0F, 1.0F, 1.0F, f2, 1, 0.0F, 1, 0.0F);
    this.kZX.setFillAfter(true);
    this.kZX.setDuration(1500L);
    this.kZX.setInterpolator(getContext(), 17563654);
    this.kZY = new ScaleAnimation(1.0F, 1.0F, 1.0F, f2, 1, 0.0F, 1, 1.0F);
    this.kZY.setFillAfter(true);
    this.kZY.setDuration(1500L);
    this.kZY.setInterpolator(getContext(), 17563654);
    this.kZM.startAnimation(this.kZV);
    this.kZP.startAnimation(this.kZY);
    this.kZQ.startAnimation(this.kZX);
    this.kZT.startAnimation(this.kZW);
    this.lac.setVisibility(8);
    this.kZL.setBackground(null);
    this.lac.clearAnimation();
    paramAnimationListener = this.kZU;
    j = paramAnimationListener.length;
    i = 0;
    while (i < j)
    {
      paramAnimationListener[i].setBackgroundColor(getResources().getColor(a.b.kPf));
      i += 1;
    }
    GMTrace.o(14534571982848L, 108291);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(5932289359872L, 44199);
    super.onMeasure(paramInt1, paramInt2);
    if (this.laa != null) {
      this.laa.awY();
    }
    GMTrace.o(5932289359872L, 44199);
  }
  
  private static enum a
  {
    static
    {
      GMTrace.i(5932692013056L, 44202);
      lae = 1;
      laf = 2;
      lag = 3;
      lah = new int[] { lae, laf, lag };
      GMTrace.o(5932692013056L, 44202);
    }
  }
  
  public static abstract interface b
  {
    public abstract void awY();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\views\FaceScanRect.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */