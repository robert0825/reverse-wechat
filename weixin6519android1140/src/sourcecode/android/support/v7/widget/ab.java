package android.support.v7.widget;

import android.view.View;

public abstract class ab
{
  protected final RecyclerView.h SH;
  int SI = Integer.MIN_VALUE;
  
  public ab(RecyclerView.h paramh)
  {
    this.SH = paramh;
  }
  
  public abstract int aV(View paramView);
  
  public abstract int aW(View paramView);
  
  public abstract int aX(View paramView);
  
  public abstract int aY(View paramView);
  
  public abstract void ba(int paramInt);
  
  public final int fg()
  {
    if (Integer.MIN_VALUE == this.SI) {
      return 0;
    }
    return fj() - this.SI;
  }
  
  public abstract int fh();
  
  public abstract int fi();
  
  public abstract int fj();
  
  public abstract int fk();
  
  public abstract int getEnd();
  
  public abstract int getEndPadding();
  
  public abstract int getMode();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */