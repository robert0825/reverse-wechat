package com.tencent.mm.ui.tools;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;

public final class g
{
  private int Vu;
  private final Context context;
  private ae mHandler;
  public int mHeight;
  public int mWidth;
  private int pNc;
  public int pNd;
  public int pNe;
  private int pNf;
  private int pNg;
  private float pNh;
  private float pNi;
  public float pNj;
  float pNk;
  public int pNl;
  public int pNm;
  public int pNn;
  public int pNo;
  public int pNp;
  private int pNq;
  public int pNr;
  public int pNs;
  public int pNt;
  public int pNu;
  public int pNv;
  public int pNw;
  public float xhk;
  private float xhl;
  public float xhm;
  private int xhn;
  public int xho;
  private int xhp;
  
  public g(Context paramContext)
  {
    GMTrace.i(1941862088704L, 14468);
    this.Vu = 0;
    this.pNc = 0;
    this.mWidth = 0;
    this.mHeight = 0;
    this.pNd = 0;
    this.pNe = 0;
    this.pNf = 0;
    this.pNg = 0;
    this.pNh = 0.0F;
    this.pNi = 0.0F;
    this.pNj = 0.0F;
    this.xhk = 0.0F;
    this.xhl = 1.0F;
    this.xhm = 1.0F;
    this.xhn = 0;
    this.xho = 0;
    this.pNk = 1.0F;
    this.pNl = 0;
    this.pNm = 0;
    this.pNn = 0;
    this.pNo = 0;
    this.pNp = 0;
    this.pNq = 300;
    this.xhp = 10;
    this.pNr = 0;
    this.pNs = 1;
    this.pNt = 2;
    this.pNu = 3;
    this.pNv = 4;
    this.pNw = this.pNr;
    this.mHandler = new ae();
    this.context = paramContext;
    GMTrace.o(1941862088704L, 14468);
  }
  
  private void i(View paramView, boolean paramBoolean)
  {
    GMTrace.i(1942398959616L, 14472);
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    if ((this.Vu == 0) && (this.pNc == 0))
    {
      this.Vu = (paramView.getWidth() / 2);
      this.pNc = (paramView.getHeight() / 2);
    }
    this.pNf = (this.Vu - arrayOfInt[0]);
    this.pNg = (this.pNc - arrayOfInt[1]);
    int j = paramView.getWidth();
    int i = paramView.getHeight();
    int k;
    if ((j == 0) || (i == 0))
    {
      i = this.pNd;
      k = this.pNe;
      j = i;
    }
    for (;;)
    {
      if ((j != 0) && (k != 0))
      {
        this.pNh = (this.mWidth / j);
        this.pNi = (this.mHeight / k);
      }
      float f1 = this.xhl;
      if ((this.pNm != 0) || (this.pNn != 0) || (this.pNo != 0) || (this.pNp != 0)) {
        f1 = 1.1F;
      }
      float f2;
      if (paramBoolean)
      {
        f2 = 1.0F;
        f1 = f2;
        if (this.pNd != 0)
        {
          f1 = f2;
          if (this.pNe != 0)
          {
            this.pNh = (this.mWidth / this.pNd);
            this.pNi = (this.mHeight / this.pNe);
            f1 = f2;
          }
        }
      }
      if (this.xhm != 1.0D)
      {
        this.pNf += arrayOfInt[0];
        this.pNg += arrayOfInt[1];
        this.pNj = (this.pNh * this.xhm);
        this.xhk = this.pNj;
        this.pNg = ((int)(this.pNg - this.xho * this.pNj));
        this.pNf = ((int)(this.pNf - this.xhn * this.pNj));
        GMTrace.o(1942398959616L, 14472);
        return;
      }
      if (this.pNh > this.pNi)
      {
        this.pNj = (this.pNh * f1);
        this.pNg = ((int)(this.pNg - (k * this.pNj - this.mHeight * f1) / 2.0F));
        this.pNg = ((int)(this.pNg - this.mHeight * (f1 - 1.0F) / 2.0F - this.pNl * this.pNj / 2.0F));
        this.pNf = ((int)(this.pNf - this.mWidth * (f1 - 1.0F) / 2.0F));
        if ((this.pNe == 0) || (this.pNc >= (k - this.pNe) / 2)) {
          break label693;
        }
        f2 = this.pNg;
      }
      for (this.pNg = ((int)((f1 - 1.0F) * this.mHeight / 2.0F + f2));; this.pNg = ((int)(this.pNg - (f1 - 1.0F) * this.mHeight / 2.0F))) {
        label693:
        do
        {
          if ((this.mWidth == 0) && (this.mHeight == 0))
          {
            this.pNj = 0.5F;
            this.pNk = 0.0F;
            this.pNf = ((int)(this.pNf - j * this.pNj / 2.0F));
            this.pNg = ((int)(this.pNg - k * this.pNj / 2.0F - this.pNl * this.pNj / 2.0F));
          }
          GMTrace.o(1942398959616L, 14472);
          return;
          this.pNj = (this.pNi * f1);
          this.pNf = ((int)(this.pNf - (j * this.pNj - this.mWidth * f1) / 2.0F));
          if ((this.pNe == 0) || (this.pNe >= k)) {
            break;
          }
          this.pNg = ((int)(this.pNg - (k * this.pNj - this.mHeight * f1) / 2.0F));
          break;
        } while ((this.pNe == 0) || (this.pNc + this.mHeight <= (this.pNe + k) / 2));
      }
      k = i;
    }
  }
  
  @TargetApi(16)
  public final void a(final View paramView1, View paramView2, final b paramb)
  {
    GMTrace.i(1942533177344L, 14473);
    if ((Build.VERSION.SDK_INT < 12) || (paramView1 == null) || (this.pNw == this.pNt) || (this.pNw == this.pNv) || (this.pNw == this.pNu))
    {
      GMTrace.o(1942533177344L, 14473);
      return;
    }
    i(paramView1, false);
    paramView1.setPivotX(0.0F);
    paramView1.setPivotY(0.0F);
    paramView1.setScaleX(this.pNj);
    paramView1.setScaleY(this.pNj);
    paramView1.setTranslationX(this.pNf);
    paramView1.setTranslationY(this.pNg);
    if (paramView2 != null)
    {
      paramView2.setAlpha(0.0F);
      paramView2.animate().setDuration(this.pNq).setInterpolator(new DecelerateInterpolator(1.2F)).alpha(1.0F);
    }
    paramView1.animate().setDuration(this.pNq).setInterpolator(new DecelerateInterpolator(1.2F)).scaleX(1.0F).scaleY(1.0F).translationX(0.0F).translationY(0.0F).setListener(new Animator.AnimatorListener()
    {
      public final void onAnimationCancel(Animator paramAnonymousAnimator)
      {
        GMTrace.i(1921863647232L, 14319);
        g.this.pNw = g.this.pNu;
        GMTrace.o(1921863647232L, 14319);
      }
      
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        GMTrace.i(1921729429504L, 14318);
        if (paramb != null) {
          paramb.onAnimationEnd();
        }
        g.this.pNw = g.this.pNu;
        GMTrace.o(1921729429504L, 14318);
      }
      
      public final void onAnimationRepeat(Animator paramAnonymousAnimator)
      {
        GMTrace.i(1921997864960L, 14320);
        GMTrace.o(1921997864960L, 14320);
      }
      
      public final void onAnimationStart(Animator paramAnonymousAnimator)
      {
        GMTrace.i(1921595211776L, 14317);
        if (paramb != null) {
          paramb.onAnimationStart();
        }
        g.this.pNw = g.this.pNt;
        GMTrace.o(1921595211776L, 14317);
      }
    });
    this.mHandler.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2062926479360L, 15370);
        if (g.this.pNw == g.this.pNr)
        {
          w.i("MicroMsg.ImagePreviewAnimation", "dancy enter Animation not Start!");
          paramView1.requestLayout();
        }
        GMTrace.o(2062926479360L, 15370);
      }
    }, this.xhp);
    GMTrace.o(1942533177344L, 14473);
  }
  
  @TargetApi(16)
  public final void a(final View paramView1, View paramView2, final b paramb, final a parama)
  {
    GMTrace.i(1942667395072L, 14474);
    if ((Build.VERSION.SDK_INT < 12) || (paramView1 == null) || (this.pNw == this.pNt) || (this.pNw == this.pNv) || (this.pNw == this.pNs))
    {
      w.i("MicroMsg.ImagePreviewAnimation", "ExitAnimation not run! animationState: %s , gallery:%s", new Object[] { Integer.valueOf(this.pNw), paramView1 });
      GMTrace.o(1942667395072L, 14474);
      return;
    }
    i(paramView1, true);
    if (paramView2 != null) {
      paramView2.animate().setDuration(200L).setInterpolator(new DecelerateInterpolator(1.2F)).alpha(0.0F);
    }
    paramView2 = new AnimationSet(true);
    parama = new ScaleAnimation(this.pNj, this.pNj, paramView1, parama)
    {
      protected final void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
      {
        GMTrace.i(2008970952704L, 14968);
        int k;
        int i;
        int n;
        int i1;
        if ((g.this.pNd != 0) && (g.this.pNe != 0) && (g.this.xhm == 1.0F))
        {
          Rect localRect = new Rect();
          paramView1.getGlobalVisibleRect(localRect);
          int m = (localRect.right - localRect.left) / 2;
          int j = (localRect.bottom - localRect.top + g.this.pNl) / 2;
          k = (int)(((g.this.pNd - g.this.mWidth) * (1.0F - paramAnonymousFloat) + g.this.mWidth) / (1.0F - (1.0F - g.this.pNj) * paramAnonymousFloat));
          i = (int)(((g.this.pNe - g.this.mHeight) * (1.0F - paramAnonymousFloat) + g.this.mHeight) / (1.0F - (1.0F - g.this.pNj) * paramAnonymousFloat));
          if (g.this.xhm != 1.0F)
          {
            g.this.pNj = (g.this.xhk / g.this.xhm);
            i = localRect.right;
            i = localRect.left;
            m = (localRect.right + localRect.left) / 2;
            j = g.this.xho - localRect.top + (int)(g.this.pNe / 2.0F);
            k = (int)(((g.this.pNd - g.this.mWidth) * (1.0F - paramAnonymousFloat) + g.this.mWidth) / (1.0F - (1.0F - g.this.pNj) * paramAnonymousFloat));
            i = (int)(((g.this.pNe - g.this.mHeight) * (1.0F - paramAnonymousFloat) + g.this.mHeight) / (1.0F - (1.0F - g.this.pNj) * paramAnonymousFloat));
          }
          n = (int)(m - k / 2 + g.this.pNm * paramAnonymousFloat / (1.0F - (1.0F - g.this.pNj) * paramAnonymousFloat));
          i1 = (int)(j - i / 2 - g.this.pNl * (1.0F - paramAnonymousFloat) / 2.0F + g.this.pNo * paramAnonymousFloat / (1.0F - (1.0F - g.this.pNj) * paramAnonymousFloat));
          k = (int)(k / 2 + m - g.this.pNn * paramAnonymousFloat / (1.0F - (1.0F - g.this.pNj) * paramAnonymousFloat));
          i = (int)(i / 2 + j - g.this.pNp * paramAnonymousFloat / (1.0F - (1.0F - g.this.pNj) * paramAnonymousFloat));
          if (Build.VERSION.SDK_INT < 21) {
            break label569;
          }
          paramView1.setClipBounds(new Rect(n, i1, k, i));
        }
        for (;;)
        {
          super.applyTransformation(paramAnonymousFloat, paramAnonymousTransformation);
          GMTrace.o(2008970952704L, 14968);
          return;
          label569:
          if (Build.VERSION.SDK_INT >= 18) {
            if (parama != null) {
              parama.q(n, i1, k, i);
            } else {
              paramView1.setClipBounds(new Rect(n + paramView1.getScrollX(), i1, k + paramView1.getScrollX(), i));
            }
          }
        }
      }
    };
    parama.setDuration(200L);
    parama.setInterpolator(new DecelerateInterpolator(1.2F));
    paramView2.addAnimation(parama);
    parama = new TranslateAnimation(0.0F, this.pNf, 0.0F, this.pNg);
    parama.setDuration(200L);
    parama.setInterpolator(new DecelerateInterpolator(1.2F));
    paramView2.addAnimation(parama);
    parama = new AlphaAnimation(1.0F, this.pNk);
    parama.setDuration(200L);
    parama.setInterpolator(new DecelerateInterpolator(1.2F));
    paramView2.addAnimation(parama);
    paramView2.setFillAfter(true);
    paramView2.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(1928171880448L, 14366);
        w.i("MicroMsg.ImagePreviewAnimation", "ExitAnimation end!");
        if (paramb != null) {
          paramb.onAnimationEnd();
        }
        g.this.pNw = g.this.pNs;
        GMTrace.o(1928171880448L, 14366);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(1928306098176L, 14367);
        GMTrace.o(1928306098176L, 14367);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(1928037662720L, 14365);
        w.i("MicroMsg.ImagePreviewAnimation", "ExitAnimation start!");
        if (paramb != null) {
          paramb.onAnimationStart();
        }
        g.this.pNw = g.this.pNv;
        GMTrace.o(1928037662720L, 14365);
      }
    });
    paramView1.startAnimation(paramView2);
    GMTrace.o(1942667395072L, 14474);
  }
  
  public final void eC(int paramInt1, int paramInt2)
  {
    GMTrace.i(1942130524160L, 14470);
    this.pNd = paramInt1;
    this.pNe = paramInt2;
    GMTrace.o(1942130524160L, 14470);
  }
  
  public final void eD(int paramInt1, int paramInt2)
  {
    GMTrace.i(1942264741888L, 14471);
    this.xhn = paramInt1;
    this.xho = paramInt2;
    GMTrace.o(1942264741888L, 14471);
  }
  
  public final void p(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(1941996306432L, 14469);
    this.Vu = paramInt1;
    this.pNc = paramInt2;
    this.mWidth = paramInt3;
    this.mHeight = paramInt4;
    GMTrace.o(1941996306432L, 14469);
  }
  
  @TargetApi(18)
  public static abstract interface a
  {
    public abstract void q(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  }
  
  public static abstract interface b
  {
    public abstract void onAnimationEnd();
    
    public abstract void onAnimationStart();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\tools\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */