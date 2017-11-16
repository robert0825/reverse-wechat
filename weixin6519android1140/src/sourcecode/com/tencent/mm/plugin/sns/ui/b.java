package com.tencent.mm.plugin.sns.ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public final class b
{
  private int Vu;
  public final Context context;
  private ae mHandler;
  public int mHeight;
  public int mWidth;
  private int pNc;
  public int pNd;
  public int pNe;
  int pNf;
  int pNg;
  private float pNh;
  private float pNi;
  public float pNj;
  float pNk;
  public int pNl;
  public int pNm;
  public int pNn;
  public int pNo;
  public int pNp;
  public int pNq;
  public int pNr;
  public int pNs;
  public int pNt;
  public int pNu;
  public int pNv;
  public int pNw;
  
  public b(Context paramContext)
  {
    GMTrace.i(8489808166912L, 63254);
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
    this.pNk = 1.0F;
    this.pNl = 0;
    this.pNm = 0;
    this.pNn = 0;
    this.pNo = 0;
    this.pNp = 0;
    this.pNq = 300;
    this.pNr = 0;
    this.pNs = 1;
    this.pNt = 2;
    this.pNu = 3;
    this.pNv = 4;
    this.pNw = this.pNr;
    this.mHandler = new ae();
    this.context = paramContext;
    GMTrace.o(8489808166912L, 63254);
  }
  
  @TargetApi(16)
  public final void a(final View paramView1, final LinkedList<View> paramLinkedList, View paramView2, final b paramb)
  {
    GMTrace.i(20054812917760L, 149420);
    if ((Build.VERSION.SDK_INT < 12) || (paramView1 == null) || (this.pNw == this.pNt) || (this.pNw == this.pNv) || (this.pNw == this.pNu))
    {
      GMTrace.o(20054812917760L, 149420);
      return;
    }
    i(paramView1, false);
    e.dH(this.context);
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
    paramView2 = paramLinkedList.iterator();
    while (paramView2.hasNext()) {
      ((View)paramView2.next()).setAlpha(0.0F);
    }
    paramView1.animate().setDuration(this.pNq).setInterpolator(new DecelerateInterpolator(1.2F)).scaleX(1.0F).scaleY(1.0F).translationX(0.0F).translationY(0.0F).setListener(new Animator.AnimatorListener()
    {
      public final void onAnimationCancel(Animator paramAnonymousAnimator)
      {
        GMTrace.i(8717978304512L, 64954);
        b.this.pNw = b.this.pNu;
        GMTrace.o(8717978304512L, 64954);
      }
      
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        GMTrace.i(8717844086784L, 64953);
        if (paramb != null) {
          paramb.onAnimationEnd();
        }
        b.this.pNw = b.this.pNu;
        ((WindowManager)b.this.context.getSystemService("window")).getDefaultDisplay().getHeight();
        paramView1.setTranslationY(0.0F);
        paramAnonymousAnimator = paramLinkedList.iterator();
        while (paramAnonymousAnimator.hasNext())
        {
          View localView = (View)paramAnonymousAnimator.next();
          localView.setVisibility(0);
          localView.setTranslationY(100.0F);
          localView.setAlpha(0.0F);
          localView.animate().setDuration(b.this.pNq / 2).setInterpolator(new DecelerateInterpolator(1.2F)).translationY(0.0F).alpha(1.0F).setListener(new Animator.AnimatorListener()
          {
            public final void onAnimationCancel(Animator paramAnonymous2Animator)
            {
              GMTrace.i(8471420338176L, 63117);
              b.this.pNw = b.this.pNu;
              GMTrace.o(8471420338176L, 63117);
            }
            
            public final void onAnimationEnd(Animator paramAnonymous2Animator)
            {
              GMTrace.i(8471286120448L, 63116);
              if (b.1.this.pNx != null) {
                b.1.this.pNx.onAnimationEnd();
              }
              b.this.pNw = b.this.pNu;
              GMTrace.o(8471286120448L, 63116);
            }
            
            public final void onAnimationRepeat(Animator paramAnonymous2Animator)
            {
              GMTrace.i(8471554555904L, 63118);
              GMTrace.o(8471554555904L, 63118);
            }
            
            public final void onAnimationStart(Animator paramAnonymous2Animator)
            {
              GMTrace.i(8471151902720L, 63115);
              if (b.1.this.pNx != null) {
                b.1.this.pNx.onAnimationStart();
              }
              b.this.pNw = b.this.pNt;
              GMTrace.o(8471151902720L, 63115);
            }
          });
        }
        GMTrace.o(8717844086784L, 64953);
      }
      
      public final void onAnimationRepeat(Animator paramAnonymousAnimator)
      {
        GMTrace.i(8718112522240L, 64955);
        GMTrace.o(8718112522240L, 64955);
      }
      
      public final void onAnimationStart(Animator paramAnonymousAnimator)
      {
        GMTrace.i(8717709869056L, 64952);
        if (paramb != null) {
          paramb.onAnimationStart();
        }
        b.this.pNw = b.this.pNt;
        GMTrace.o(8717709869056L, 64952);
      }
    });
    this.mHandler.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8502156197888L, 63346);
        if (b.this.pNw == b.this.pNr)
        {
          w.i("MicroMsg.ImagePreviewAnimation", "dancy enter Animation not Start!");
          paramView1.requestLayout();
          Iterator localIterator = paramLinkedList.iterator();
          while (localIterator.hasNext()) {
            ((View)localIterator.next()).requestLayout();
          }
        }
        GMTrace.o(8502156197888L, 63346);
      }
    }, this.pNq);
    GMTrace.o(20054812917760L, 149420);
  }
  
  final void i(View paramView, boolean paramBoolean)
  {
    GMTrace.i(8490076602368L, 63256);
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
      if ((this.pNm != 0) || (this.pNn != 0) || (this.pNo != 0) || (this.pNp != 0)) {}
      for (float f1 = 1.1F;; f1 = 1.0F)
      {
        if (paramBoolean)
        {
          if ((this.pNd != 0) && (this.pNe != 0))
          {
            this.pNh = (this.mWidth / this.pNd);
            this.pNi = (this.mHeight / this.pNe);
          }
          f1 = 1.0F;
        }
        float f2;
        if (this.pNh > this.pNi)
        {
          this.pNj = (this.pNh * f1);
          this.pNg = ((int)(this.pNg - (k * this.pNj - this.mHeight * f1) / 2.0F));
          this.pNg = ((int)(this.pNg - this.mHeight * (f1 - 1.0F) / 2.0F - this.pNl * this.pNj / 2.0F));
          this.pNf = ((int)(this.pNf - this.mWidth * (f1 - 1.0F) / 2.0F));
          if ((this.pNe == 0) || (this.pNc >= (k - this.pNe) / 2)) {
            break label567;
          }
          f2 = this.pNg;
        }
        for (this.pNg = ((int)((f1 - 1.0F) * this.mHeight / 2.0F + f2));; this.pNg = ((int)(this.pNg - (f1 - 1.0F) * this.mHeight / 2.0F))) {
          label567:
          do
          {
            if ((this.mWidth == 0) && (this.mHeight == 0))
            {
              this.pNj = 0.5F;
              this.pNk = 0.0F;
              this.pNf = ((int)(this.pNf - j * this.pNj / 2.0F));
              this.pNg = ((int)(this.pNg - k * this.pNj / 2.0F - this.pNl * this.pNj / 2.0F));
            }
            GMTrace.o(8490076602368L, 63256);
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
      }
      k = i;
    }
  }
  
  public final void p(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(8489942384640L, 63255);
    this.Vu = paramInt1;
    this.pNc = paramInt2;
    this.mWidth = paramInt3;
    this.mHeight = paramInt4;
    GMTrace.o(8489942384640L, 63255);
  }
  
  @TargetApi(18)
  public static abstract interface a {}
  
  public static abstract interface b
  {
    public abstract void onAnimationEnd();
    
    public abstract void onAnimationStart();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */