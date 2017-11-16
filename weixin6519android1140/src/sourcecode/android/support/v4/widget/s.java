package android.support.v4.widget;

import android.widget.TextView;
import java.lang.reflect.Field;

final class s
{
  static Field DV;
  static boolean DW;
  static Field DX;
  static boolean DY;
  
  static int a(Field paramField, TextView paramTextView)
  {
    try
    {
      int i = paramField.getInt(paramTextView);
      return i;
    }
    catch (IllegalAccessException paramTextView)
    {
      new StringBuilder("Could not retrieve value of ").append(paramField.getName()).append(" field.");
    }
    return -1;
  }
  
  static Field o(String paramString)
  {
    Object localObject = null;
    try
    {
      Field localField = TextView.class.getDeclaredField(paramString);
      localObject = localField;
      localField.setAccessible(true);
      return localField;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      new StringBuilder("Could not retrieve ").append(paramString).append(" field.");
    }
    return (Field)localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\widget\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */