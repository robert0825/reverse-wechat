package com.tencent.mm.pluginsdk.ui.emoji;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.gif.MMAnimateView;

public class StoreBannerEmojiView
  extends MMAnimateView
{
  private static String TAG;
  
  static
  {
    GMTrace.i(1193195601920L, 8890);
    TAG = "MicroMsg.emoji.StoreBannerEmojiView";
    GMTrace.o(1193195601920L, 8890);
  }
  
  public StoreBannerEmojiView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1192792948736L, 8887);
    GMTrace.o(1192792948736L, 8887);
  }
  
  public StoreBannerEmojiView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1192927166464L, 8888);
    GMTrace.o(1192927166464L, 8888);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(1193061384192L, 8889);
    Object localObject = getContext();
    int[] arrayOfInt = new int[2];
    if ((localObject instanceof Activity))
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      ((Activity)localObject).getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
      arrayOfInt[0] = localDisplayMetrics.widthPixels;
      arrayOfInt[1] = localDisplayMetrics.heightPixels;
    }
    int i;
    int j;
    for (;;)
    {
      i = arrayOfInt[0];
      j = i * 3 / 8 + 1;
      if ((i > 0) && (j > 0)) {
        break;
      }
      super.onMeasure(paramInt1, paramInt2);
      GMTrace.o(1193061384192L, 8889);
      return;
      localObject = ((WindowManager)((Context)localObject).getSystemService("window")).getDefaultDisplay();
      arrayOfInt[0] = ((Display)localObject).getWidth();
      arrayOfInt[1] = ((Display)localObject).getHeight();
    }
    setMeasuredDimension(i, j);
    GMTrace.o(1193061384192L, 8889);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\emoji\StoreBannerEmojiView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */