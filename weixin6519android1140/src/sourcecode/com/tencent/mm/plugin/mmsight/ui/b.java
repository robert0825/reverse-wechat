package com.tencent.mm.plugin.mmsight.ui;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class b
{
  private int duration;
  public aj gOu;
  public boolean isStart;
  private float nid;
  private float nie;
  public float nif;
  long nig;
  public float nih;
  public a nii;
  private Runnable nij;
  
  public b(float paramFloat1, float paramFloat2, int paramInt)
  {
    GMTrace.i(7391370280960L, 55070);
    this.gOu = null;
    this.nid = 0.0F;
    this.nij = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7390699192320L, 55065);
        b.this.aQy();
        if (b.this.isStart)
        {
          if (b.this.nih < b.this.nif)
          {
            b.this.gOu.post(this);
            GMTrace.o(7390699192320L, 55065);
            return;
          }
          b.this.isStart = false;
          w.i("MicroMsg.ProgressHandlerAnimator", "reach end, currentValue: %s, end: %s", new Object[] { Float.valueOf(b.this.nih), Float.valueOf(b.this.nif) });
          if (b.this.nii != null)
          {
            b.this.nii.onAnimationEnd();
            GMTrace.o(7390699192320L, 55065);
          }
        }
        else
        {
          w.i("MicroMsg.ProgressHandlerAnimator", "isStart is false now");
        }
        GMTrace.o(7390699192320L, 55065);
      }
    };
    this.nie = paramFloat1;
    this.nif = paramFloat2;
    this.duration = paramInt;
    if (paramFloat2 > paramFloat1) {
      this.nid = ((paramFloat2 - paramFloat1) / this.duration * 20.0F);
    }
    w.i("MicroMsg.ProgressHandlerAnimator", "create ProgressHandlerAnimator, start: %s, end: %s, duration: %s, updateStep: %s", new Object[] { Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Integer.valueOf(paramInt), Float.valueOf(this.nid) });
    this.isStart = false;
    this.nig = 0L;
    this.gOu = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(7380498644992L, 54989);
        b.this.aQy();
        if (b.this.isStart)
        {
          if (b.this.nih < b.this.nif)
          {
            GMTrace.o(7380498644992L, 54989);
            return true;
          }
          b.this.isStart = false;
          w.i("MicroMsg.ProgressHandlerAnimator", "reach end, currentValue: %s, end: %s, callback: %s", new Object[] { Float.valueOf(b.this.nih), Float.valueOf(b.this.nif), b.this.nii });
          if (b.this.nii != null) {
            b.this.nii.onAnimationEnd();
          }
          GMTrace.o(7380498644992L, 54989);
          return false;
        }
        w.i("MicroMsg.ProgressHandlerAnimator", "isStart is false now");
        GMTrace.o(7380498644992L, 54989);
        return false;
      }
    }, true);
    GMTrace.o(7391370280960L, 55070);
  }
  
  public final void aQy()
  {
    GMTrace.i(16040494891008L, 119511);
    w.d("MicroMsg.ProgressHandlerAnimator", "updateImpl, currentValue: %s", new Object[] { Float.valueOf(this.nih) });
    this.nih = ((float)bg.aI(this.nig) / this.duration * (this.nif - this.nie));
    if (this.nii != null) {
      this.nii.ah(this.nih);
    }
    GMTrace.o(16040494891008L, 119511);
  }
  
  public static abstract interface a
  {
    public abstract void ah(float paramFloat);
    
    public abstract void onAnimationEnd();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */