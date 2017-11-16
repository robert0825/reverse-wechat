package com.tencent.mm.pluginsdk.ui.emoji;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.gif.MMAnimateView;

public class BannerEmojiView
  extends MMAnimateView
{
  public BannerEmojiView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1192390295552L, 8884);
    GMTrace.o(1192390295552L, 8884);
  }
  
  public BannerEmojiView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1192524513280L, 8885);
    GMTrace.o(1192524513280L, 8885);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(1192658731008L, 8886);
    paramInt2 = getRight() - getLeft() - getPaddingRight() - getPaddingLeft();
    int i = paramInt2 / 2;
    if (paramInt2 != 0)
    {
      paramInt1 = i;
      if (i != 0) {}
    }
    else
    {
      paramInt2 = getContext().getResources().getDisplayMetrics().widthPixels;
      paramInt1 = paramInt2 / 2;
    }
    setMeasuredDimension(paramInt2, paramInt1);
    GMTrace.o(1192658731008L, 8886);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\emoji\BannerEmojiView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */