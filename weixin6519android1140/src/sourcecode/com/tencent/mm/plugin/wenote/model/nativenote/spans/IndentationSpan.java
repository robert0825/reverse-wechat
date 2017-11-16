package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.text.style.LeadingMarginSpan.Standard;
import com.tencent.gmtrace.GMTrace;

public class IndentationSpan
  extends LeadingMarginSpan.Standard
  implements f<Integer>, g<Integer>
{
  private final boolean sgU;
  private final int sgV;
  
  private IndentationSpan(int paramInt, boolean paramBoolean)
  {
    super(paramInt);
    GMTrace.i(20634096631808L, 153736);
    this.sgV = paramInt;
    this.sgU = paramBoolean;
    GMTrace.o(20634096631808L, 153736);
  }
  
  public int getLeadingMargin(boolean paramBoolean)
  {
    GMTrace.i(20634230849536L, 153737);
    if (this.sgU)
    {
      GMTrace.o(20634230849536L, 153737);
      return 0;
    }
    int i = this.sgV;
    GMTrace.o(20634230849536L, 153737);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\spans\IndentationSpan.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */