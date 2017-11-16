package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

final class d
{
  private static Field Av;
  private static boolean Aw;
  
  static Drawable a(CompoundButton paramCompoundButton)
  {
    if (!Aw) {}
    try
    {
      Field localField = CompoundButton.class.getDeclaredField("mButtonDrawable");
      Av = localField;
      localField.setAccessible(true);
      Aw = true;
      if (Av != null) {
        try
        {
          paramCompoundButton = (Drawable)Av.get(paramCompoundButton);
          return paramCompoundButton;
        }
        catch (IllegalAccessException paramCompoundButton)
        {
          Av = null;
        }
      }
      return null;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\widget\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */