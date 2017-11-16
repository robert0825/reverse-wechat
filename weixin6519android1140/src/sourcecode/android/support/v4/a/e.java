package android.support.v4.a;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

final class e
  implements c
{
  public final g aB()
  {
    return new a();
  }
  
  public final void v(View paramView) {}
  
  private static final class a
    implements g
  {
    List<b> dT = new ArrayList();
    public long mDuration = 200L;
    List<d> mM = new ArrayList();
    View mN;
    public float mO = 0.0F;
    private boolean mP = false;
    private boolean mQ = false;
    public Runnable mR = new Runnable()
    {
      public final void run()
      {
        float f = (float)(e.a.this.mN.getDrawingTime() - e.a.this.mStartTime) * 1.0F / (float)e.a.this.mDuration;
        if ((f > 1.0F) || (e.a.this.mN.getParent() == null)) {
          f = 1.0F;
        }
        e.a.this.mO = f;
        e.a locala = e.a.this;
        int i = locala.mM.size() - 1;
        while (i >= 0)
        {
          ((d)locala.mM.get(i)).b(locala);
          i -= 1;
        }
        if (e.a.this.mO >= 1.0F)
        {
          e.a.this.aD();
          return;
        }
        e.a.this.mN.postDelayed(e.a.this.mR, 16L);
      }
    };
    public long mStartTime;
    
    public final void a(b paramb)
    {
      this.dT.add(paramb);
    }
    
    public final void a(d paramd)
    {
      this.mM.add(paramd);
    }
    
    public final void aD()
    {
      int i = this.dT.size() - 1;
      while (i >= 0)
      {
        ((b)this.dT.get(i)).a(this);
        i -= 1;
      }
    }
    
    public final void cancel()
    {
      if (this.mQ) {
        return;
      }
      this.mQ = true;
      if (this.mP)
      {
        int i = this.dT.size() - 1;
        while (i >= 0)
        {
          ((b)this.dT.get(i)).aC();
          i -= 1;
        }
      }
      aD();
    }
    
    public final float getAnimatedFraction()
    {
      return this.mO;
    }
    
    public final void setDuration(long paramLong)
    {
      if (!this.mP) {
        this.mDuration = paramLong;
      }
    }
    
    public final void start()
    {
      if (this.mP) {
        return;
      }
      this.mP = true;
      int i = this.dT.size() - 1;
      while (i >= 0)
      {
        this.dT.get(i);
        i -= 1;
      }
      this.mO = 0.0F;
      this.mStartTime = this.mN.getDrawingTime();
      this.mN.postDelayed(this.mR, 16L);
    }
    
    public final void w(View paramView)
    {
      this.mN = paramView;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */