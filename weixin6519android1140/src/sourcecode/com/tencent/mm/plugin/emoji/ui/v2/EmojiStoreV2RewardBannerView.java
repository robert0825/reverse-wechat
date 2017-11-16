package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.gif.MMAnimateView;

public class EmojiStoreV2RewardBannerView
  extends MMAnimateView
{
  float fy;
  
  public EmojiStoreV2RewardBannerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11489305952256L, 85602);
    this.fy = 0.75F;
    GMTrace.o(11489305952256L, 85602);
  }
  
  public EmojiStoreV2RewardBannerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(11489440169984L, 85603);
    this.fy = 0.75F;
    GMTrace.o(11489440169984L, 85603);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(11489574387712L, 85604);
    paramInt2 = getRight() - getLeft() - getPaddingRight() - getPaddingLeft();
    int i = (int)(paramInt2 * this.fy);
    if (paramInt2 != 0)
    {
      paramInt1 = i;
      if (i != 0) {}
    }
    else
    {
      paramInt2 = getContext().getResources().getDisplayMetrics().widthPixels;
      paramInt1 = (int)(paramInt2 * this.fy);
    }
    setMeasuredDimension(paramInt2, paramInt1);
    GMTrace.o(11489574387712L, 85604);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\v2\EmojiStoreV2RewardBannerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */