package com.tencent.mm.plugin.appbrand.widget.b;

import android.view.MotionEvent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class b
{
  public static String B(MotionEvent paramMotionEvent)
  {
    GMTrace.i(18847524454400L, 140425);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("MotionEvent { action=").append(actionToString(paramMotionEvent.getAction()));
    int j = paramMotionEvent.getPointerCount();
    int i = 0;
    while (i < j)
    {
      localStringBuilder.append(", x[").append(i).append("]=").append(paramMotionEvent.getX(i));
      localStringBuilder.append(", y[").append(i).append("]=").append(paramMotionEvent.getY(i));
      i += 1;
    }
    localStringBuilder.append(", downTime=").append(paramMotionEvent.getDownTime());
    localStringBuilder.append(" }");
    paramMotionEvent = localStringBuilder.toString();
    GMTrace.o(18847524454400L, 140425);
    return paramMotionEvent;
  }
  
  public static void a(String paramString1, String paramString2, MotionEvent paramMotionEvent)
  {
    GMTrace.i(19882611572736L, 148137);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString2).append(' ');
    localStringBuilder.append("[apptouch] MotionEvent { action=").append(actionToString(paramMotionEvent.getAction()));
    int j = paramMotionEvent.getPointerCount();
    int i = 0;
    while (i < j)
    {
      localStringBuilder.append(", x[").append(i).append("]=").append(paramMotionEvent.getX(i));
      localStringBuilder.append(", y[").append(i).append("]=").append(paramMotionEvent.getY(i));
      i += 1;
    }
    localStringBuilder.append(", downTime=").append(paramMotionEvent.getDownTime());
    localStringBuilder.append(" }");
    if (w.getLogLevel() <= 1) {
      w.v(paramString1, localStringBuilder.toString());
    }
    GMTrace.o(19882611572736L, 148137);
  }
  
  private static String actionToString(int paramInt)
  {
    GMTrace.i(18847658672128L, 140426);
    int i;
    switch (paramInt)
    {
    case 5: 
    case 6: 
    default: 
      i = (0xFF00 & paramInt) >> 8;
      switch (paramInt & 0xFF)
      {
      default: 
        str = Integer.toString(paramInt);
        GMTrace.o(18847658672128L, 140426);
        return str;
      }
    case 0: 
      GMTrace.o(18847658672128L, 140426);
      return "ACTION_DOWN";
    case 1: 
      GMTrace.o(18847658672128L, 140426);
      return "ACTION_UP";
    case 3: 
      GMTrace.o(18847658672128L, 140426);
      return "ACTION_CANCEL";
    case 4: 
      GMTrace.o(18847658672128L, 140426);
      return "ACTION_OUTSIDE";
    case 2: 
      GMTrace.o(18847658672128L, 140426);
      return "ACTION_MOVE";
    case 7: 
      GMTrace.o(18847658672128L, 140426);
      return "ACTION_HOVER_MOVE";
    case 8: 
      GMTrace.o(18847658672128L, 140426);
      return "ACTION_SCROLL";
    case 9: 
      GMTrace.o(18847658672128L, 140426);
      return "ACTION_HOVER_ENTER";
    case 10: 
      GMTrace.o(18847658672128L, 140426);
      return "ACTION_HOVER_EXIT";
    case 11: 
      GMTrace.o(18847658672128L, 140426);
      return "ACTION_BUTTON_PRESS";
    }
    GMTrace.o(18847658672128L, 140426);
    return "ACTION_BUTTON_RELEASE";
    String str = "ACTION_POINTER_DOWN(" + i + ")";
    GMTrace.o(18847658672128L, 140426);
    return str;
    str = "ACTION_POINTER_UP(" + i + ")";
    GMTrace.o(18847658672128L, 140426);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */