package com.tencent.mm.pluginsdk.ui.emoji;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;

public class ChattingEmojiView
  extends MMEmojiView
{
  public ChattingEmojiView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(1195074650112L, 8904);
    this.tBY = true;
    GMTrace.o(1195074650112L, 8904);
  }
  
  public ChattingEmojiView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1195208867840L, 8905);
    this.tBY = true;
    GMTrace.o(1195208867840L, 8905);
  }
  
  public ChattingEmojiView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1195343085568L, 8906);
    this.tBY = true;
    GMTrace.o(1195343085568L, 8906);
  }
  
  public void draw(Canvas paramCanvas)
  {
    GMTrace.i(1195477303296L, 8907);
    super.draw(paramCanvas);
    GMTrace.o(1195477303296L, 8907);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\emoji\ChattingEmojiView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */