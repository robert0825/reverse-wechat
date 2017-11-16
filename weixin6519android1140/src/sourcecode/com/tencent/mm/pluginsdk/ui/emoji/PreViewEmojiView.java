package com.tencent.mm.pluginsdk.ui.emoji;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;

public class PreViewEmojiView
  extends MMEmojiView
{
  public int mSize;
  
  public PreViewEmojiView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1198295875584L, 8928);
    this.mSize = 0;
    GMTrace.o(1198295875584L, 8928);
  }
  
  public PreViewEmojiView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1198430093312L, 8929);
    this.mSize = 0;
    GMTrace.o(1198430093312L, 8929);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(1198564311040L, 8930);
    super.onMeasure(paramInt1, paramInt2);
    if (this.mSize > 0) {
      setMeasuredDimension(this.mSize, this.mSize);
    }
    GMTrace.o(1198564311040L, 8930);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\emoji\PreViewEmojiView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */