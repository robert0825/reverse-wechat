package com.tencent.mm.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;

public class DrawedCallBackLinearLayout
  extends LinearLayout
{
  public final boolean DEBUG;
  public final String TAG;
  public a xpy;
  
  public DrawedCallBackLinearLayout(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(1639872200704L, 12218);
    this.DEBUG = true;
    this.TAG = "MicroMsg.TestTimeForChatting";
    GMTrace.o(1639872200704L, 12218);
  }
  
  public DrawedCallBackLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1640006418432L, 12219);
    this.DEBUG = true;
    this.TAG = "MicroMsg.TestTimeForChatting";
    GMTrace.o(1640006418432L, 12219);
  }
  
  @TargetApi(11)
  public DrawedCallBackLinearLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1640140636160L, 12220);
    this.DEBUG = true;
    this.TAG = "MicroMsg.TestTimeForChatting";
    GMTrace.o(1640140636160L, 12220);
  }
  
  public void dispatchDraw(Canvas paramCanvas)
  {
    GMTrace.i(1640409071616L, 12222);
    super.dispatchDraw(paramCanvas);
    if (this.xpy != null)
    {
      this.xpy.aDr();
      this.xpy = null;
    }
    GMTrace.o(1640409071616L, 12222);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(1640274853888L, 12221);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(1640274853888L, 12221);
  }
  
  public static abstract interface a
  {
    public abstract void aDr();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\DrawedCallBackLinearLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */