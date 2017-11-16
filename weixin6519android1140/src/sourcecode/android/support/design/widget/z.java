package android.support.design.widget;

import android.view.View;

final class z
{
  private int kU;
  private int kV;
  int kW;
  int kX;
  private final View mView;
  
  public z(View paramView)
  {
    this.mView = paramView;
  }
  
  public final void ay()
  {
    this.kU = this.mView.getTop();
    this.kV = this.mView.getLeft();
    az();
  }
  
  final void az()
  {
    android.support.v4.view.z.j(this.mView, this.kW - (this.mView.getTop() - this.kU));
    android.support.v4.view.z.k(this.mView, this.kX - (this.mView.getLeft() - this.kV));
  }
  
  public final boolean f(int paramInt)
  {
    if (this.kW != paramInt)
    {
      this.kW = paramInt;
      az();
      return true;
    }
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\widget\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */