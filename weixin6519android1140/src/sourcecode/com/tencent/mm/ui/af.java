package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import java.lang.reflect.Method;

public final class af
{
  @TargetApi(17)
  public static boolean fe(Context paramContext)
  {
    GMTrace.i(21009235181568L, 156531);
    Display localDisplay = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    Point localPoint = new Point();
    localDisplay.getSize(localPoint);
    paramContext = ff(paramContext);
    int i = Math.max(localPoint.y, localPoint.x);
    if (Math.max(paramContext.y, paramContext.x) > i)
    {
      GMTrace.o(21009235181568L, 156531);
      return true;
    }
    GMTrace.o(21009235181568L, 156531);
    return false;
  }
  
  private static Point ff(Context paramContext)
  {
    GMTrace.i(21009100963840L, 156530);
    Point localPoint = new Point();
    paramContext = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    if (Build.VERSION.SDK_INT >= 17) {
      paramContext.getRealSize(localPoint);
    }
    for (;;)
    {
      GMTrace.o(21009100963840L, 156530);
      return localPoint;
      if (Build.VERSION.SDK_INT >= 14) {
        try
        {
          Method localMethod = Display.class.getMethod("getRawHeight", new Class[0]);
          localPoint.x = ((Integer)Display.class.getMethod("getRawWidth", new Class[0]).invoke(paramContext, new Object[0])).intValue();
          localPoint.y = ((Integer)localMethod.invoke(paramContext, new Object[0])).intValue();
        }
        catch (Exception localException) {}
      } else {
        paramContext.getSize(localPoint);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */