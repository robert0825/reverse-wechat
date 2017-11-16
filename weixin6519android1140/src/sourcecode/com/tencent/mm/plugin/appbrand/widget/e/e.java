package com.tencent.mm.plugin.appbrand.widget.e;

import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.compat.a.b.d;

public abstract class e
{
  b.d iRn;
  AnimatorSet iRo;
  long mDuration;
  
  protected e(b.d paramd, long paramLong)
  {
    GMTrace.i(19861942042624L, 147983);
    this.iRn = paramd;
    this.mDuration = paramLong;
    this.iRo = new AnimatorSet();
    GMTrace.o(19861942042624L, 147983);
  }
  
  public final void a(Animator.AnimatorListener paramAnimatorListener)
  {
    GMTrace.i(15433025454080L, 114985);
    this.iRo.addListener(paramAnimatorListener);
    GMTrace.o(15433025454080L, 114985);
  }
  
  public void adF()
  {
    GMTrace.i(15432757018624L, 114983);
    this.iRo.start();
    GMTrace.o(15432757018624L, 114983);
  }
  
  protected abstract ValueAnimator kl(int paramInt);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\e\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */