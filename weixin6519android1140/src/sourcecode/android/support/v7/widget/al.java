package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v4.b.b;
import android.util.TypedValue;

final class al
{
  static final int[] EMPTY_STATE_SET = new int[0];
  static final int[] FOCUSED_STATE_SET;
  static final int[] PRESSED_STATE_SET;
  static final int[] SELECTED_STATE_SET;
  private static final ThreadLocal<TypedValue> Yl = new ThreadLocal();
  static final int[] Ym;
  static final int[] Yn;
  private static final int[] Yo = new int[1];
  static final int[] dd;
  static final int[] hW = { -16842910 };
  
  static
  {
    FOCUSED_STATE_SET = new int[] { 16842908 };
    Ym = new int[] { 16843518 };
    PRESSED_STATE_SET = new int[] { 16842919 };
    dd = new int[] { 16842912 };
    SELECTED_STATE_SET = new int[] { 16842913 };
    Yn = new int[] { -16842919, -16842908 };
  }
  
  static int a(Context paramContext, int paramInt, float paramFloat)
  {
    paramInt = i(paramContext, paramInt);
    return b.i(paramInt, Math.round(Color.alpha(paramInt) * paramFloat));
  }
  
  public static int i(Context paramContext, int paramInt)
  {
    Yo[0] = paramInt;
    paramContext = paramContext.obtainStyledAttributes(null, Yo);
    try
    {
      paramInt = paramContext.getColor(0, 0);
      return paramInt;
    }
    finally
    {
      paramContext.recycle();
    }
  }
  
  public static ColorStateList j(Context paramContext, int paramInt)
  {
    Yo[0] = paramInt;
    paramContext = paramContext.obtainStyledAttributes(null, Yo);
    try
    {
      ColorStateList localColorStateList = paramContext.getColorStateList(0);
      return localColorStateList;
    }
    finally
    {
      paramContext.recycle();
    }
  }
  
  public static int k(Context paramContext, int paramInt)
  {
    Object localObject = j(paramContext, paramInt);
    if ((localObject != null) && (((ColorStateList)localObject).isStateful())) {
      return ((ColorStateList)localObject).getColorForState(hW, ((ColorStateList)localObject).getDefaultColor());
    }
    TypedValue localTypedValue = (TypedValue)Yl.get();
    localObject = localTypedValue;
    if (localTypedValue == null)
    {
      localObject = new TypedValue();
      Yl.set(localObject);
    }
    paramContext.getTheme().resolveAttribute(16842803, (TypedValue)localObject, true);
    return a(paramContext, paramInt, ((TypedValue)localObject).getFloat());
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */