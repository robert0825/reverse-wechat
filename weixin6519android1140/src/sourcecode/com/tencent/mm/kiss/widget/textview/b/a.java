package com.tencent.mm.kiss.widget.textview.b;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class a
{
  private static boolean fXO;
  private static boolean gbW;
  private static Constructor<StaticLayout> gbX;
  private static Object gbY;
  
  public a()
  {
    GMTrace.i(431778430976L, 3217);
    GMTrace.o(431778430976L, 3217);
  }
  
  public static StaticLayout a(CharSequence paramCharSequence, int paramInt1, int paramInt2, TextPaint paramTextPaint, int paramInt3, Layout.Alignment paramAlignment, float paramFloat1, float paramFloat2, boolean paramBoolean, TextUtils.TruncateAt paramTruncateAt, int paramInt4, int paramInt5)
  {
    try
    {
      GMTrace.i(432046866432L, 3219);
      xX();
      if (gbW) {
        throw new IllegalStateException("initialize error, cannot create StaticLayout");
      }
    }
    finally {}
    try
    {
      Object localObject = gbY;
      paramCharSequence = (StaticLayout)gbX.newInstance(new Object[] { paramCharSequence, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramTextPaint, Integer.valueOf(paramInt3), paramAlignment, localObject, Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Boolean.valueOf(paramBoolean), paramTruncateAt, Integer.valueOf(paramInt4), Integer.valueOf(paramInt5) });
      GMTrace.o(432046866432L, 3219);
      return paramCharSequence;
    }
    catch (Exception paramCharSequence)
    {
      throw new IllegalStateException("Error creating StaticLayout with max lines: " + paramCharSequence.getCause());
    }
  }
  
  public static StaticLayout a(CharSequence paramCharSequence, int paramInt1, int paramInt2, TextPaint paramTextPaint, int paramInt3, Layout.Alignment paramAlignment, TextDirectionHeuristic paramTextDirectionHeuristic, float paramFloat1, float paramFloat2, boolean paramBoolean, TextUtils.TruncateAt paramTruncateAt, int paramInt4, int paramInt5)
  {
    try
    {
      GMTrace.i(432181084160L, 3220);
      xX();
      if (gbW) {
        throw new IllegalStateException("initialize error, cannot create StaticLayout");
      }
    }
    finally {}
    try
    {
      paramCharSequence = (StaticLayout)gbX.newInstance(new Object[] { paramCharSequence, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramTextPaint, Integer.valueOf(paramInt3), paramAlignment, paramTextDirectionHeuristic, Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Boolean.valueOf(paramBoolean), paramTruncateAt, Integer.valueOf(paramInt4), Integer.valueOf(paramInt5) });
      GMTrace.o(432181084160L, 3220);
      return paramCharSequence;
    }
    catch (Exception paramCharSequence)
    {
      throw new IllegalStateException("Error creating StaticLayout with max lines: " + paramCharSequence.getCause());
    }
  }
  
  @TargetApi(18)
  private static void xX()
  {
    for (;;)
    {
      Object localObject1;
      try
      {
        GMTrace.i(431912648704L, 3218);
        if (fXO)
        {
          GMTrace.o(431912648704L, 3218);
          return;
        }
      }
      finally {}
      try
      {
        if (Build.VERSION.SDK_INT < 18) {
          break label192;
        }
        localObject1 = TextDirectionHeuristic.class;
        gbY = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        localObject1 = StaticLayout.class.getDeclaredConstructor(new Class[] { CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, localObject1, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE });
        gbX = (Constructor)localObject1;
        ((Constructor)localObject1).setAccessible(true);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        Object localObject4;
        Class localClass;
        w.e("StaticTextView.StaticLayoutWithMaxLines", "StaticLayout constructor with max lines not found.", new Object[] { localNoSuchMethodException });
        gbW = true;
        fXO = true;
        continue;
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        w.e("StaticTextView.StaticLayoutWithMaxLines", "TextDirectionHeuristic class not found.", new Object[] { localClassNotFoundException });
        gbW = true;
        fXO = true;
        continue;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        w.e("StaticTextView.StaticLayoutWithMaxLines", "TextDirectionHeuristics.FIRSTSTRONG_LTR not found.", new Object[] { localNoSuchFieldException });
        gbW = true;
        fXO = true;
        continue;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        w.e("StaticTextView.StaticLayoutWithMaxLines", "TextDirectionHeuristics.FIRSTSTRONG_LTR not accessible.", new Object[] { localIllegalAccessException });
        gbW = true;
        fXO = true;
        continue;
      }
      catch (Exception localException)
      {
        w.e("StaticTextView.StaticLayoutWithMaxLines", "Other error.", new Object[] { localException });
        gbW = true;
        fXO = true;
        continue;
      }
      finally
      {
        fXO = true;
      }
      w.i("StaticTextView.StaticLayoutWithMaxLines", "ensureInitialized finish, sInitialError: " + gbW);
      GMTrace.o(431912648704L, 3218);
      continue;
      label192:
      localObject4 = a.class.getClassLoader();
      localClass = ((ClassLoader)localObject4).loadClass("android.text.TextDirectionHeuristic");
      localObject4 = ((ClassLoader)localObject4).loadClass("android.text.TextDirectionHeuristics");
      gbY = ((Class)localObject4).getField("FIRSTSTRONG_LTR").get(localObject4);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\kiss\widget\textview\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */