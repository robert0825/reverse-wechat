package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;

public class MMImageView
  extends ImageView
{
  public MMImageView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(2074200768512L, 15454);
    GMTrace.o(2074200768512L, 15454);
  }
  
  public MMImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(2074334986240L, 15455);
    GMTrace.o(2074334986240L, 15455);
  }
  
  public MMImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(2074469203968L, 15456);
    GMTrace.o(2074469203968L, 15456);
  }
  
  @TargetApi(14)
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    GMTrace.i(2074603421696L, 15457);
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(MMImageView.class.getName());
    GMTrace.o(2074603421696L, 15457);
  }
  
  @TargetApi(14)
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    GMTrace.i(2074737639424L, 15458);
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(MMImageView.class.getName());
    GMTrace.o(2074737639424L, 15458);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\MMImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */