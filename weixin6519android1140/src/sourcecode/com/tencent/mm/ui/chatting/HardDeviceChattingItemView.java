package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;

public class HardDeviceChattingItemView
  extends LinearLayout
{
  private boolean mHasInit;
  
  public HardDeviceChattingItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(2263179329536L, 16862);
    GMTrace.o(2263179329536L, 16862);
  }
  
  public void onFinishInflate()
  {
    GMTrace.i(2263313547264L, 16863);
    super.onFinishInflate();
    if (!this.mHasInit) {
      this.mHasInit = true;
    }
    GMTrace.o(2263313547264L, 16863);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\HardDeviceChattingItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */