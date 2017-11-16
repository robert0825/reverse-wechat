package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;

public class InitCallBackLayout
  extends FrameLayout
{
  private boolean hasDrawed;
  private en vOB;
  
  public InitCallBackLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(2111110643712L, 15729);
    GMTrace.o(2111110643712L, 15729);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(2111244861440L, 15730);
    super.onDraw(paramCanvas);
    if (!this.hasDrawed)
    {
      this.hasDrawed = true;
      if (this.vOB != null) {
        this.vOB.aDr();
      }
    }
    GMTrace.o(2111244861440L, 15730);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\chatting\InitCallBackLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */