package android.support.v4.view;

import android.view.WindowInsets;

final class aq
  extends ap
{
  final WindowInsets yX;
  
  aq(WindowInsets paramWindowInsets)
  {
    this.yX = paramWindowInsets;
  }
  
  public final ap bZ()
  {
    return new aq(this.yX.consumeSystemWindowInsets());
  }
  
  public final ap e(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return new aq(this.yX.replaceSystemWindowInsets(paramInt1, paramInt2, paramInt3, paramInt4));
  }
  
  public final int getSystemWindowInsetBottom()
  {
    return this.yX.getSystemWindowInsetBottom();
  }
  
  public final int getSystemWindowInsetLeft()
  {
    return this.yX.getSystemWindowInsetLeft();
  }
  
  public final int getSystemWindowInsetRight()
  {
    return this.yX.getSystemWindowInsetRight();
  }
  
  public final int getSystemWindowInsetTop()
  {
    return this.yX.getSystemWindowInsetTop();
  }
  
  public final boolean isConsumed()
  {
    return this.yX.isConsumed();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\view\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */