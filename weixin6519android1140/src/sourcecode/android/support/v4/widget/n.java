package android.support.v4.widget;

import android.widget.PopupWindow;
import java.lang.reflect.Field;

final class n
{
  private static Field CE;
  
  static
  {
    try
    {
      Field localField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
      CE = localField;
      localField.setAccessible(true);
      return;
    }
    catch (NoSuchFieldException localNoSuchFieldException) {}
  }
  
  static void a(PopupWindow paramPopupWindow, boolean paramBoolean)
  {
    if (CE != null) {}
    try
    {
      CE.set(paramPopupWindow, Boolean.valueOf(paramBoolean));
      return;
    }
    catch (IllegalAccessException paramPopupWindow) {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\widget\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */