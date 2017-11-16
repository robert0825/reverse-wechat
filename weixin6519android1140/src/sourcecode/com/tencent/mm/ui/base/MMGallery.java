package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Gallery;
import com.tencent.gmtrace.GMTrace;

public class MMGallery
  extends Gallery
{
  public MMGallery(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3267664805888L, 24346);
    setStaticTransformationsEnabled(true);
    GMTrace.o(3267664805888L, 24346);
  }
  
  public MMGallery(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3267799023616L, 24347);
    setStaticTransformationsEnabled(true);
    GMTrace.o(3267799023616L, 24347);
  }
  
  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    GMTrace.i(3267933241344L, 24348);
    if (paramFloat1 > 0.0F) {
      onKeyDown(21, null);
    }
    for (;;)
    {
      GMTrace.o(3267933241344L, 24348);
      return true;
      onKeyDown(22, null);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\base\MMGallery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */