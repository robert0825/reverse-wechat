package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.KeyboardLinearLayout;

public class WebViewKeyboardLinearLayout
  extends KeyboardLinearLayout
{
  private boolean mHasInit;
  private int mHeight;
  private boolean rJK;
  private int rJL;
  public int rJM;
  private int rJN;
  
  public WebViewKeyboardLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12279579934720L, 91490);
    this.mHasInit = false;
    GMTrace.o(12279579934720L, 91490);
  }
  
  public WebViewKeyboardLinearLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(12279714152448L, 91491);
    this.mHasInit = false;
    GMTrace.o(12279714152448L, 91491);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(12279848370176L, 91492);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(12279848370176L, 91492);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(12279982587904L, 91493);
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(12279982587904L, 91493);
  }
  
  protected final void xP(int paramInt)
  {
    GMTrace.i(12280116805632L, 91494);
    w.d("MicroMsg.WebViewKeyboardLinearLayout", "onLayout : b: " + paramInt + " mHasInit: " + this.mHasInit + " mHasKeyboard: " + this.rJK);
    Rect localRect = new Rect();
    getWindowVisibleDisplayFrame(localRect);
    int i = getRootView().getHeight();
    if (!this.mHasInit)
    {
      this.mHasInit = true;
      this.mHeight = paramInt;
      w.i("MicroMsg.WebViewKeyboardLinearLayout", "init height:%d", new Object[] { Integer.valueOf(this.mHeight) });
      oD(-1);
      this.rJN = (i - localRect.bottom);
    }
    w.d("MicroMsg.WebViewKeyboardLinearLayout", "onLayout, current rect = %s", new Object[] { localRect.toString() });
    i = localRect.height();
    this.mHeight = i;
    w.d("MicroMsg.WebViewKeyboardLinearLayout", "onLayout, usableHeightNow = %d, previousUsableHeight = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(this.rJL) });
    if (this.rJL != i)
    {
      int j = getRootView().getHeight() - this.rJN - localRect.top;
      int k = j - i;
      if (k <= j / 4) {
        break label304;
      }
      this.rJK = true;
      this.rJM = k;
      oD(-3);
      w.w("MicroMsg.WebViewKeyboardLinearLayout", "onLayout, show keyboard!! mHeight: " + this.mHeight + " b: " + paramInt + " mKBHeight: " + this.rJM);
    }
    for (;;)
    {
      this.rJL = i;
      GMTrace.o(12280116805632L, 91494);
      return;
      label304:
      this.rJK = false;
      oD(-2);
      w.w("MicroMsg.WebViewKeyboardLinearLayout", "onLayout, hide keyboard!! mHeight: " + this.mHeight + " b: " + paramInt);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\WebViewKeyboardLinearLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */