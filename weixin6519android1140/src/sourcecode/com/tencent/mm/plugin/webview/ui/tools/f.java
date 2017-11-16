package com.tencent.mm.plugin.webview.ui.tools;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.MMWebView;

public final class f
  implements LogoWebViewWrapper.b
{
  static final int rKb;
  public boolean hPU;
  a rJX;
  ImageView rJY;
  LogoWebViewWrapper rJZ;
  int rKa;
  private boolean rKc;
  private boolean rKd;
  private int rKe;
  private float rKf;
  private ValueAnimator rKg;
  public ViewPropertyAnimator rKh;
  private float rKi;
  private View rKj;
  View rKk;
  private TextView rKl;
  private boolean rKm;
  public boolean rKn;
  
  static
  {
    GMTrace.i(12126840160256L, 90352);
    rKb = R.g.bbY;
    GMTrace.o(12126840160256L, 90352);
  }
  
  public f()
  {
    GMTrace.i(12125229547520L, 90340);
    this.rKa = 0;
    this.hPU = false;
    this.rKc = false;
    this.rKd = false;
    this.rKe = 0;
    this.rKf = 0.0F;
    this.rKm = true;
    this.rKn = false;
    GMTrace.o(12125229547520L, 90340);
  }
  
  public final void O(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(12126034853888L, 90346);
    Object localObject;
    String str1;
    if (this.rJY == null)
    {
      localObject = "null";
      if (this.rJY != null) {
        break label112;
      }
      str1 = "null";
      label30:
      if (this.rJY != null) {
        break label127;
      }
    }
    label112:
    label127:
    for (String str2 = "null";; str2 = String.valueOf(this.rJY.getAlpha()))
    {
      w.v("MicroMsg.WebViewPullDownLogoDelegate", "onOverScrollOffset, offset = %d, pointerDown = %b, refreshImage.visibility = %s, refreshImage.drawable = %s, refreshImage.alpha = %s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean), localObject, str1, str2 });
      if (this.hPU) {
        break label142;
      }
      GMTrace.o(12126034853888L, 90346);
      return;
      localObject = String.valueOf(this.rJY.getVisibility());
      break;
      str1 = this.rJY.getDrawable().toString();
      break label30;
    }
    label142:
    if (paramInt == 0) {
      this.rKd = false;
    }
    if (this.rJY == null)
    {
      GMTrace.o(12126034853888L, 90346);
      return;
    }
    if (!paramBoolean)
    {
      if ((Math.abs(paramInt) > this.rKa) && (!this.rKc))
      {
        w.d("MicroMsg.WebViewPullDownLogoDelegate", "startLoading()");
        startLoading();
        GMTrace.o(12126034853888L, 90346);
        return;
      }
      if (this.rKc) {
        GMTrace.o(12126034853888L, 90346);
      }
    }
    else
    {
      if (Math.abs(paramInt) < this.rKa) {
        break label476;
      }
      if (this.rJZ != null) {
        this.rJZ.rIs = this.rKa;
      }
    }
    if ((this.rJY != null) && (this.rJY.getAlpha() < 1.0F) && (this.rKh == null) && (paramBoolean))
    {
      w.d("MicroMsg.WebViewPullDownLogoDelegate", "refreshImage alpha to 1.0f");
      this.rKh = this.rJY.animate().alpha(1.0F).setDuration(500L);
      this.rKh.setListener(new AnimatorListenerAdapter()
      {
        public final void onAnimationCancel(Animator paramAnonymousAnimator)
        {
          GMTrace.i(12123484717056L, 90327);
          super.onAnimationCancel(paramAnonymousAnimator);
          f.this.rKh = null;
          GMTrace.o(12123484717056L, 90327);
        }
        
        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          GMTrace.i(12123618934784L, 90328);
          super.onAnimationEnd(paramAnonymousAnimator);
          f.this.rKh = null;
          GMTrace.o(12123618934784L, 90328);
        }
      });
      this.rKh.start();
    }
    int i;
    if (!this.rKd)
    {
      i = -paramInt - this.rKe;
      if (Math.abs(paramInt) < this.rKa) {
        break label494;
      }
      i *= 5;
    }
    for (;;)
    {
      this.rKe = (-paramInt);
      float f1 = this.rJY.getHeight() / 2.0F;
      float f2 = this.rJY.getWidth() / 2.0F;
      this.rKf -= i;
      this.rJY.setScaleType(ImageView.ScaleType.MATRIX);
      localObject = this.rJY.getImageMatrix();
      ((Matrix)localObject).postRotate(-i, f2, f1);
      this.rJY.setImageMatrix((Matrix)localObject);
      this.rJY.setImageResource(rKb);
      this.rJY.invalidate();
      GMTrace.o(12126034853888L, 90346);
      return;
      label476:
      if (this.rJZ == null) {
        break;
      }
      this.rJZ.rIs = 0;
      break;
      label494:
      i *= 2;
    }
  }
  
  public final void a(MMWebView paramMMWebView)
  {
    GMTrace.i(16926331895808L, 126111);
    paramMMWebView.xrW = this.rJZ;
    paramMMWebView.cjm();
    if (Build.VERSION.SDK_INT <= 10) {
      this.rJZ.bDA().setBackgroundColor(this.rJZ.getResources().getColor(R.e.aPo));
    }
    LogoWebViewWrapper localLogoWebViewWrapper = this.rJZ;
    localLogoWebViewWrapper.bDA();
    if (localLogoWebViewWrapper.rIk != null)
    {
      localLogoWebViewWrapper.jPc = paramMMWebView;
      localLogoWebViewWrapper.rIk.addView(localLogoWebViewWrapper.jPc);
    }
    boolean bool = paramMMWebView.isX5Kernel;
    this.rKm = bool;
    if ((this.rKk != null) && (!bool))
    {
      ((ImageView)this.rKk.findViewById(R.h.coM)).setVisibility(8);
      ((TextView)this.rKk.findViewById(R.h.bHr)).setText("");
    }
    if ((this.rKm) && (!this.rKn))
    {
      jw(false);
      if (this.rKk != null)
      {
        this.rKk.setVisibility(0);
        GMTrace.o(16926331895808L, 126111);
      }
    }
    else
    {
      jw(true);
    }
    GMTrace.o(16926331895808L, 126111);
  }
  
  public final void bDO()
  {
    GMTrace.i(12125363765248L, 90341);
    this.hPU = false;
    stopLoading();
    if ((this.rKm) && (this.rKk != null) && (!this.rKn))
    {
      jw(false);
      this.rJZ.rIs = 0;
      this.rKk.setVisibility(0);
    }
    GMTrace.o(12125363765248L, 90341);
  }
  
  public final void bDP()
  {
    GMTrace.i(16926466113536L, 126112);
    if (this.rKk != null) {
      this.rKk.setVisibility(8);
    }
    GMTrace.o(16926466113536L, 126112);
  }
  
  public final void cP(View paramView)
  {
    GMTrace.i(16926197678080L, 126110);
    this.rJZ = ((LogoWebViewWrapper)paramView.findViewById(R.h.bLB));
    this.rJY = ((ImageView)paramView.findViewById(R.h.cnQ));
    this.rKj = paramView.findViewById(R.h.cnP);
    if (this.rKj != null)
    {
      this.rKk = this.rKj.findViewById(R.h.coL);
      this.rKl = ((TextView)this.rKk.findViewById(R.h.coN));
    }
    this.rKa = BackwardSupportUtil.b.a(this.rJZ.getContext(), 72.0F);
    if (this.rJY == null)
    {
      paramView = "null";
      if (this.rJZ != null) {
        break label189;
      }
    }
    label189:
    for (String str = "null";; str = String.valueOf(this.rJZ.getId()))
    {
      w.d("MicroMsg.WebViewPullDownLogoDelegate", "refreshImage.id = %s, logoWrapper.id = %s", new Object[] { paramView, str });
      w.d("MicroMsg.WebViewPullDownLogoDelegate", "LOADING_LOGO_HEIGHT = %d", new Object[] { Integer.valueOf(this.rKa) });
      GMTrace.o(16926197678080L, 126110);
      return;
      paramView = String.valueOf(this.rJY.getId());
      break;
    }
  }
  
  public final float getStartLoadingStep()
  {
    GMTrace.i(12126169071616L, 90347);
    float f = this.rKi;
    GMTrace.o(12126169071616L, 90347);
    return f;
  }
  
  public final void jw(boolean paramBoolean)
  {
    GMTrace.i(12126437507072L, 90349);
    if ((this.rJZ != null) && (this.rJZ.rIq != paramBoolean))
    {
      this.rJZ.jw(paramBoolean);
      if (this.rKk != null) {
        this.rKk.setVisibility(8);
      }
      this.rKn = paramBoolean;
    }
    GMTrace.o(12126437507072L, 90349);
  }
  
  public final void qT(String paramString)
  {
    GMTrace.i(12126571724800L, 90350);
    if ((!this.rKm) || (this.rKn))
    {
      jw(true);
      if ((this.rKk != null) && (this.rKk.getVisibility() == 0)) {
        this.rKk.setVisibility(8);
      }
      GMTrace.o(12126571724800L, 90350);
      return;
    }
    if (this.rKl != null)
    {
      if (!bg.nm(paramString))
      {
        paramString = Uri.parse(paramString).getHost();
        if (!bg.nm(paramString))
        {
          paramString = this.rKl.getContext().getString(R.l.ekk, new Object[] { paramString });
          this.rKl.setVisibility(0);
          this.rKl.setText(paramString);
          jw(false);
          GMTrace.o(12126571724800L, 90350);
          return;
        }
      }
      this.rKl.setVisibility(8);
    }
    GMTrace.o(12126571724800L, 90350);
  }
  
  public final void release()
  {
    GMTrace.i(12125766418432L, 90344);
    if (this.rJZ != null)
    {
      LogoWebViewWrapper localLogoWebViewWrapper = this.rJZ;
      if (localLogoWebViewWrapper.rIk != null)
      {
        localLogoWebViewWrapper.rIk.removeView(localLogoWebViewWrapper.jPc);
        localLogoWebViewWrapper.jPc = null;
      }
      localLogoWebViewWrapper = this.rJZ;
      localLogoWebViewWrapper.rIu = null;
      localLogoWebViewWrapper.rIt = null;
    }
    if (this.rKj != null) {
      ((ViewGroup)this.rKj).removeAllViews();
    }
    this.rJZ = null;
    this.rJY = null;
    this.rKe = 0;
    if (this.rKg != null)
    {
      this.rKg.cancel();
      this.rKg = null;
    }
    GMTrace.o(12125766418432L, 90344);
  }
  
  public final void setStartLoadingStep(float paramFloat)
  {
    float f2 = 0.0F;
    GMTrace.i(12126303289344L, 90348);
    this.rKi = paramFloat;
    this.rJY.setScaleType(ImageView.ScaleType.MATRIX);
    Matrix localMatrix = this.rJY.getImageMatrix();
    float f1;
    if (this.rJY == null)
    {
      f1 = 0.0F;
      if (this.rJY != null) {
        break label95;
      }
    }
    for (;;)
    {
      localMatrix.setRotate(paramFloat, f1, f2);
      this.rKf = paramFloat;
      this.rJY.invalidate();
      GMTrace.o(12126303289344L, 90348);
      return;
      f1 = this.rJY.getWidth() / 2.0F;
      break;
      label95:
      f2 = this.rJY.getHeight() / 2.0F;
    }
  }
  
  public final void startLoading()
  {
    GMTrace.i(12125497982976L, 90342);
    if (this.rKc)
    {
      GMTrace.o(12125497982976L, 90342);
      return;
    }
    if ((this.rJY == null) || (this.rJZ == null))
    {
      GMTrace.o(12125497982976L, 90342);
      return;
    }
    this.rKc = true;
    this.rJZ.jw(true);
    this.rJY.clearAnimation();
    if (this.rKg != null) {
      this.rKg.cancel();
    }
    this.rKg = ObjectAnimator.ofFloat(this, "startLoadingStep", new float[] { this.rKf + 0.0F, this.rKf + 354.0F });
    this.rKg.setDuration(960L);
    this.rKg.setRepeatMode(1);
    this.rKg.setRepeatCount(-1);
    this.rKg.setInterpolator(new LinearInterpolator());
    this.rKg.start();
    if (this.rJX != null) {
      this.rJX.bDQ();
    }
    GMTrace.o(12125497982976L, 90342);
  }
  
  public final void stopLoading()
  {
    GMTrace.i(12125632200704L, 90343);
    if (!this.rKc)
    {
      GMTrace.o(12125632200704L, 90343);
      return;
    }
    w.d("MicroMsg.WebViewPullDownLogoDelegate", "stopLoading()");
    this.rKd = true;
    this.rKc = false;
    if ((this.rJZ != null) && (this.hPU)) {
      this.rJZ.jw(false);
    }
    if (this.rKg != null) {
      this.rKg.cancel();
    }
    if (this.rJZ != null) {
      this.rJZ.O(0, 250L);
    }
    if (this.rJY != null)
    {
      w.d("MicroMsg.WebViewPullDownLogoDelegate", "refreshImage, alpha to 0f");
      this.rJY.animate().alpha(0.0F).setDuration(500L).start();
    }
    GMTrace.o(12125632200704L, 90343);
  }
  
  public final void xQ(int paramInt)
  {
    GMTrace.i(12125900636160L, 90345);
    if (this.rKj != null) {
      this.rKj.setBackgroundColor(paramInt);
    }
    GMTrace.o(12125900636160L, 90345);
  }
  
  public static abstract interface a
  {
    public abstract void bDQ();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */