package android.support.v7.view;

import android.support.v4.view.ai;
import android.support.v4.view.ai.g;
import android.support.v4.view.am;
import android.support.v4.view.an;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public final class h
{
  public am Ji;
  boolean Jj;
  private final an Jk = new an()
  {
    private boolean Jl = false;
    private int Jm = 0;
    
    public final void p(View paramAnonymousView)
    {
      if (this.Jl) {}
      do
      {
        return;
        this.Jl = true;
      } while (h.this.Ji == null);
      h.this.Ji.p(null);
    }
    
    public final void q(View paramAnonymousView)
    {
      int i = this.Jm + 1;
      this.Jm = i;
      if (i == h.this.ln.size())
      {
        if (h.this.Ji != null) {
          h.this.Ji.q(null);
        }
        this.Jm = 0;
        this.Jl = false;
        h.this.Jj = false;
      }
    }
  };
  public final ArrayList<ai> ln = new ArrayList();
  private long mDuration = -1L;
  private Interpolator mInterpolator;
  
  public final h a(ai paramai)
  {
    if (!this.Jj) {
      this.ln.add(paramai);
    }
    return this;
  }
  
  public final h a(ai paramai1, ai paramai2)
  {
    this.ln.add(paramai1);
    paramai1 = (View)paramai1.yK.get();
    if (paramai1 != null) {}
    for (long l = ai.yO.ar(paramai1);; l = 0L)
    {
      paramai2.e(l);
      this.ln.add(paramai2);
      return this;
    }
  }
  
  public final h b(am paramam)
  {
    if (!this.Jj) {
      this.Ji = paramam;
    }
    return this;
  }
  
  public final h c(Interpolator paramInterpolator)
  {
    if (!this.Jj) {
      this.mInterpolator = paramInterpolator;
    }
    return this;
  }
  
  public final void cancel()
  {
    if (!this.Jj) {
      return;
    }
    Iterator localIterator = this.ln.iterator();
    while (localIterator.hasNext()) {
      ((ai)localIterator.next()).cancel();
    }
    this.Jj = false;
  }
  
  public final h dj()
  {
    if (!this.Jj) {
      this.mDuration = 250L;
    }
    return this;
  }
  
  public final void start()
  {
    if (this.Jj) {
      return;
    }
    Iterator localIterator = this.ln.iterator();
    while (localIterator.hasNext())
    {
      ai localai = (ai)localIterator.next();
      if (this.mDuration >= 0L) {
        localai.d(this.mDuration);
      }
      if (this.mInterpolator != null) {
        localai.b(this.mInterpolator);
      }
      if (this.Ji != null) {
        localai.a(this.Jk);
      }
      localai.start();
    }
    this.Jj = true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\view\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */