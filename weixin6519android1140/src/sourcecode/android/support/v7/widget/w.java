package android.support.v7.widget;

import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.support.v4.b.a.c;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class w
{
  public static final Rect Qt = new Rect();
  private static Class<?> Qu;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 18) {}
    try
    {
      Qu = Class.forName("android.graphics.Insets");
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
  }
  
  static PorterDuff.Mode aQ(int paramInt)
  {
    switch (paramInt)
    {
    }
    do
    {
      return null;
      return PorterDuff.Mode.SRC_OVER;
      return PorterDuff.Mode.SRC_IN;
      return PorterDuff.Mode.SRC_ATOP;
      return PorterDuff.Mode.MULTIPLY;
      return PorterDuff.Mode.SCREEN;
    } while (Build.VERSION.SDK_INT < 11);
    return PorterDuff.Mode.valueOf("ADD");
  }
  
  public static Rect m(Drawable paramDrawable)
  {
    if (Qu != null) {}
    for (;;)
    {
      Object localObject;
      Rect localRect;
      int j;
      String str;
      int i;
      try
      {
        paramDrawable = android.support.v4.b.a.a.h(paramDrawable);
        localObject = paramDrawable.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(paramDrawable, new Object[0]);
        if (localObject == null) {
          break label207;
        }
        localRect = new Rect();
        Field[] arrayOfField = Qu.getFields();
        int k = arrayOfField.length;
        j = 0;
        paramDrawable = localRect;
        if (j >= k) {
          break label211;
        }
        paramDrawable = arrayOfField[j];
        str = paramDrawable.getName();
        i = -1;
        switch (str.hashCode())
        {
        case 3317767: 
          if (!str.equals("left")) {
            break label255;
          }
          i = 0;
        }
      }
      catch (Exception paramDrawable) {}
      if (str.equals("top"))
      {
        i = 1;
        break label255;
        if (str.equals("right"))
        {
          i = 2;
          break label255;
          if (str.equals("bottom"))
          {
            i = 3;
            break label255;
            localRect.left = paramDrawable.getInt(localObject);
            break label288;
            label207:
            paramDrawable = Qt;
            label211:
            return paramDrawable;
            localRect.top = paramDrawable.getInt(localObject);
            break label288;
            localRect.right = paramDrawable.getInt(localObject);
            break label288;
            localRect.bottom = paramDrawable.getInt(localObject);
            break label288;
          }
        }
      }
      label255:
      switch (i)
      {
      }
      label288:
      j += 1;
    }
  }
  
  static void n(Drawable paramDrawable)
  {
    int[] arrayOfInt;
    if ((Build.VERSION.SDK_INT == 21) && ("android.graphics.drawable.VectorDrawable".equals(paramDrawable.getClass().getName())))
    {
      arrayOfInt = paramDrawable.getState();
      if ((arrayOfInt != null) && (arrayOfInt.length != 0)) {
        break label52;
      }
      paramDrawable.setState(al.dd);
    }
    for (;;)
    {
      paramDrawable.setState(arrayOfInt);
      return;
      label52:
      paramDrawable.setState(al.EMPTY_STATE_SET);
    }
  }
  
  public static boolean o(Drawable paramDrawable)
  {
    for (;;)
    {
      if ((paramDrawable instanceof LayerDrawable)) {
        return Build.VERSION.SDK_INT >= 16;
      }
      if ((paramDrawable instanceof InsetDrawable)) {
        return Build.VERSION.SDK_INT >= 14;
      }
      if ((paramDrawable instanceof StateListDrawable)) {
        return Build.VERSION.SDK_INT >= 8;
      }
      if ((paramDrawable instanceof GradientDrawable)) {
        return Build.VERSION.SDK_INT >= 14;
      }
      if ((paramDrawable instanceof DrawableContainer))
      {
        paramDrawable = paramDrawable.getConstantState();
        if (!(paramDrawable instanceof DrawableContainer.DrawableContainerState)) {
          break;
        }
        paramDrawable = ((DrawableContainer.DrawableContainerState)paramDrawable).getChildren();
        int j = paramDrawable.length;
        int i = 0;
        while (i < j)
        {
          if (!o(paramDrawable[i])) {
            return false;
          }
          i += 1;
        }
      }
      if ((paramDrawable instanceof c))
      {
        paramDrawable = ((c)paramDrawable).bp();
      }
      else if ((paramDrawable instanceof android.support.v7.c.a.a))
      {
        paramDrawable = ((android.support.v7.c.a.a)paramDrawable).mDrawable;
      }
      else
      {
        if (!(paramDrawable instanceof ScaleDrawable)) {
          break;
        }
        paramDrawable = ((ScaleDrawable)paramDrawable).getDrawable();
      }
    }
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */