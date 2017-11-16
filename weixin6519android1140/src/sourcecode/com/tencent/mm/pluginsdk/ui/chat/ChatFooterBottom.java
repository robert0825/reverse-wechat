package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public class ChatFooterBottom
  extends FrameLayout
{
  boolean eWb;
  
  public ChatFooterBottom(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(978447237120L, 7290);
    this.eWb = false;
    GMTrace.o(978447237120L, 7290);
  }
  
  public ChatFooterBottom(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(978581454848L, 7291);
    this.eWb = false;
    GMTrace.o(978581454848L, 7291);
  }
  
  public void draw(Canvas paramCanvas)
  {
    GMTrace.i(978715672576L, 7292);
    super.draw(paramCanvas);
    GMTrace.o(978715672576L, 7292);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(979118325760L, 7295);
    super.onDraw(paramCanvas);
    GMTrace.o(979118325760L, 7295);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(978984108032L, 7294);
    w.d("MicroMsg.ChatFooterBottom", "jacks onLayout change: %B, l:%d, t:%d, r:%d, b:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(978984108032L, 7294);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(978849890304L, 7293);
    w.d("MicroMsg.ChatFooterBottom", "jacks onMeasure  width:%d, height:%d, isHide: %B", new Object[] { Integer.valueOf(View.MeasureSpec.getSize(paramInt1)), Integer.valueOf(View.MeasureSpec.getSize(paramInt2)), Boolean.valueOf(this.eWb) });
    if (this.eWb)
    {
      setVisibility(8);
      paramInt1 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
      paramInt2 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
    }
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(978849890304L, 7293);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(979252543488L, 7296);
    w.d("MicroMsg.ChatFooterBottom", "jacks onSizeChanged  w:%d, h:%d, oldw:%d, oldh:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(979252543488L, 7296);
  }
  
  public void setVisibility(int paramInt)
  {
    GMTrace.i(979520978944L, 7298);
    if (paramInt == 0) {
      this.eWb = false;
    }
    super.setVisibility(paramInt);
    GMTrace.o(979520978944L, 7298);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\chat\ChatFooterBottom.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */