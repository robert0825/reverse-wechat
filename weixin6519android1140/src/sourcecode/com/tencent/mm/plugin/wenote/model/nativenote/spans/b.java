package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.text.style.StyleSpan;
import com.tencent.gmtrace.GMTrace;

public final class b
  extends e<Boolean, BoldSpan>
{
  public b()
  {
    GMTrace.i(20628191051776L, 153692);
    GMTrace.o(20628191051776L, 153692);
  }
  
  public final int bIq()
  {
    GMTrace.i(20628459487232L, 153694);
    GMTrace.o(20628459487232L, 153694);
    return 0;
  }
  
  public final boolean bv(Object paramObject)
  {
    GMTrace.i(20628325269504L, 153693);
    if (((paramObject instanceof BoldSpan)) || (((paramObject instanceof StyleSpan)) && (((StyleSpan)paramObject).getStyle() == 1)))
    {
      GMTrace.o(20628325269504L, 153693);
      return true;
    }
    GMTrace.o(20628325269504L, 153693);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\spans\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */