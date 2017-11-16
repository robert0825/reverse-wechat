package android.support.v4.view;

import android.graphics.Rect;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

final class ad
{
  private static ThreadLocal<Rect> xy;
  
  static Rect bN()
  {
    if (xy == null) {
      xy = new ThreadLocal();
    }
    Rect localRect2 = (Rect)xy.get();
    Rect localRect1 = localRect2;
    if (localRect2 == null)
    {
      localRect1 = new Rect();
      xy.set(localRect1);
    }
    localRect1.setEmpty();
    return localRect1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\view\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */