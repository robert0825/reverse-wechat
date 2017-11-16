package android.support.v4.view.b;

import android.graphics.Path;
import android.os.Build.VERSION;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

public final class e
{
  public static Interpolator b(Path paramPath)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return new PathInterpolator(paramPath);
    }
    return new f(paramPath);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\android\support\v4\view\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */