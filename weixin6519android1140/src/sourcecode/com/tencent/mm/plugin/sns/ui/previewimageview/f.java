package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;

public final class f
{
  public static int a(ViewGroup paramViewGroup, float paramFloat1, float paramFloat2)
  {
    GMTrace.i(15973251809280L, 119010);
    int i = paramViewGroup.getChildCount() - 1;
    while (i >= 0)
    {
      if (c(paramViewGroup.getChildAt(i), paramFloat1, paramFloat2))
      {
        GMTrace.o(15973251809280L, 119010);
        return i;
      }
      i -= 1;
    }
    GMTrace.o(15973251809280L, 119010);
    return -1;
  }
  
  public static boolean c(View paramView, float paramFloat1, float paramFloat2)
  {
    GMTrace.i(15973386027008L, 119011);
    if ((paramFloat1 >= paramView.getLeft()) && (paramFloat1 <= paramView.getRight()) && (paramFloat2 >= paramView.getTop()) && (paramFloat2 <= paramView.getBottom()))
    {
      GMTrace.o(15973386027008L, 119011);
      return true;
    }
    GMTrace.o(15973386027008L, 119011);
    return false;
  }
  
  public static float cH(View paramView)
  {
    GMTrace.i(15972983373824L, 119008);
    float f = Math.abs((paramView.getRight() - paramView.getLeft()) / 2);
    GMTrace.o(15972983373824L, 119008);
    return f;
  }
  
  public static float cI(View paramView)
  {
    GMTrace.i(15973117591552L, 119009);
    float f = Math.abs((paramView.getBottom() - paramView.getTop()) / 2);
    GMTrace.o(15973117591552L, 119009);
    return f;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\previewimageview\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */