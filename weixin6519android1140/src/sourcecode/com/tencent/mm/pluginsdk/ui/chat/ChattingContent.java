package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public class ChattingContent
  extends FrameLayout
{
  private int tAJ;
  private int tAK;
  
  public ChattingContent(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(994553364480L, 7410);
    this.tAJ = -1;
    this.tAK = 0;
    GMTrace.o(994553364480L, 7410);
  }
  
  public ChattingContent(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(994687582208L, 7411);
    this.tAJ = -1;
    this.tAK = 0;
    GMTrace.o(994687582208L, 7411);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(994956017664L, 7413);
    w.d("MicroMsg.ChattingContent", "jacks onLayout change: %B, l:%d, t:%d, r:%d, b:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(994956017664L, 7413);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(994821799936L, 7412);
    w.d("MicroMsg.ChattingContent", "jacks onMeasure  width:%d, height:%d", new Object[] { Integer.valueOf(View.MeasureSpec.getSize(paramInt1)), Integer.valueOf(View.MeasureSpec.getSize(paramInt2)) });
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(994821799936L, 7412);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\chat\ChattingContent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */