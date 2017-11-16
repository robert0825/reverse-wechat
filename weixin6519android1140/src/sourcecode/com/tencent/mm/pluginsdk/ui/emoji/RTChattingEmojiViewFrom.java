package com.tencent.mm.pluginsdk.ui.emoji;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;

public class RTChattingEmojiViewFrom
  extends RTChattingEmojiView
{
  public RTChattingEmojiViewFrom(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1194671996928L, 8901);
    MP();
    GMTrace.o(1194671996928L, 8901);
  }
  
  public RTChattingEmojiViewFrom(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1194806214656L, 8902);
    MP();
    GMTrace.o(1194806214656L, 8902);
  }
  
  public final void MP()
  {
    GMTrace.i(1194940432384L, 8903);
    super.MP();
    this.tCo.gravity = 3;
    addView(this.tCl, this.tCo);
    GMTrace.o(1194940432384L, 8903);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\emoji\RTChattingEmojiViewFrom.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */