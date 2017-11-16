package android.support.v4.b.a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.f;

public final class k
{
  public static i a(Resources paramResources, Bitmap paramBitmap)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return new j(paramResources, paramBitmap);
    }
    return new a(paramResources, paramBitmap);
  }
  
  private static final class a
    extends i
  {
    a(Resources paramResources, Bitmap paramBitmap)
    {
      super(paramBitmap);
    }
    
    final void a(int paramInt1, int paramInt2, int paramInt3, Rect paramRect1, Rect paramRect2)
    {
      f.apply(paramInt1, paramInt2, paramInt3, paramRect1, paramRect2, 0);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\b\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */