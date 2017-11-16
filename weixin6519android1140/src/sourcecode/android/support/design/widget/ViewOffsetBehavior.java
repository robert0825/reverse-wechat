package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

class ViewOffsetBehavior<V extends View>
  extends CoordinatorLayout.Behavior<V>
{
  private z kR;
  private int kS = 0;
  private int kT = 0;
  
  public ViewOffsetBehavior() {}
  
  public ViewOffsetBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public int I()
  {
    if (this.kR != null) {
      return this.kR.kW;
    }
    return 0;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt)
  {
    d(paramCoordinatorLayout, paramV, paramInt);
    if (this.kR == null) {
      this.kR = new z(paramV);
    }
    this.kR.ay();
    if (this.kS != 0)
    {
      this.kR.f(this.kS);
      this.kS = 0;
    }
    if (this.kT != 0)
    {
      paramCoordinatorLayout = this.kR;
      paramInt = this.kT;
      if (paramCoordinatorLayout.kX != paramInt)
      {
        paramCoordinatorLayout.kX = paramInt;
        paramCoordinatorLayout.az();
      }
      this.kT = 0;
    }
    return true;
  }
  
  protected void d(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt)
  {
    paramCoordinatorLayout.e(paramV, paramInt);
  }
  
  public boolean f(int paramInt)
  {
    if (this.kR != null) {
      return this.kR.f(paramInt);
    }
    this.kS = paramInt;
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\widget\ViewOffsetBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */