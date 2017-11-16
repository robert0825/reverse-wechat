package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.text.style.ParagraphStyle;
import com.tencent.gmtrace.GMTrace;

public final class r
  implements ParagraphStyle
{
  public final q sgO;
  public final ParagraphStyle shv;
  
  public r(q paramq, ParagraphStyle paramParagraphStyle)
  {
    GMTrace.i(20631814930432L, 153719);
    this.sgO = paramq;
    this.shv = paramParagraphStyle;
    GMTrace.o(20631814930432L, 153719);
  }
  
  public final String toString()
  {
    GMTrace.i(20631949148160L, 153720);
    String str = this.sgO.name() + " - " + this.shv.getClass().getSimpleName();
    GMTrace.o(20631949148160L, 153720);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\spans\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */