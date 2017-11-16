package com.tencent.mm.pluginsdk.ui.emoji;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;

public class RTChattingEmojiViewTo
  extends RTChattingEmojiView
{
  public RTChattingEmojiViewTo(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1194000908288L, 8896);
    MP();
    GMTrace.o(1194000908288L, 8896);
  }
  
  public RTChattingEmojiViewTo(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1194135126016L, 8897);
    MP();
    GMTrace.o(1194135126016L, 8897);
  }
  
  public final void MP()
  {
    GMTrace.i(1194269343744L, 8898);
    super.MP();
    this.tCo.gravity = 5;
    addView(this.tCl, this.tCo);
    GMTrace.o(1194269343744L, 8898);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\emoji\RTChattingEmojiViewTo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */