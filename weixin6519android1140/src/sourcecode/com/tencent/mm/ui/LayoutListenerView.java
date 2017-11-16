package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public class LayoutListenerView
  extends FrameLayout
{
  private String TAG;
  a vKj;
  
  public LayoutListenerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(2538728325120L, 18915);
    this.TAG = "MicroMsg.LayoutListenerView";
    GMTrace.o(2538728325120L, 18915);
  }
  
  @TargetApi(14)
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    GMTrace.i(2539399413760L, 18920);
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    w.d(this.TAG, "jacks onInitializeAccessibilityEvent");
    GMTrace.o(2539399413760L, 18920);
  }
  
  @TargetApi(14)
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    GMTrace.i(2539130978304L, 18918);
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    w.d(this.TAG, "jacks onInitializeAccessibilityNodeInfo");
    GMTrace.o(2539130978304L, 18918);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(2538862542848L, 18916);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(2538862542848L, 18916);
  }
  
  @TargetApi(14)
  public void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    GMTrace.i(2539265196032L, 18919);
    super.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    w.d(this.TAG, "jacks onPopulateAccessibilityEvent");
    GMTrace.o(2539265196032L, 18919);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(2538996760576L, 18917);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.vKj != null) {
      this.vKj.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    GMTrace.o(2538996760576L, 18917);
  }
  
  public static abstract interface a
  {
    public abstract void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\LayoutListenerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */