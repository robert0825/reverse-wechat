package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;

abstract class p
  extends w
{
  public p(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(18272938360832L, 136144);
    super.setHorizontallyScrolling(true);
    GMTrace.o(18272938360832L, 136144);
  }
  
  public final boolean acL()
  {
    GMTrace.i(18273475231744L, 136148);
    GMTrace.o(18273475231744L, 136148);
    return false;
  }
  
  public boolean canScrollVertically(int paramInt)
  {
    GMTrace.i(19867444969472L, 148024);
    GMTrace.o(19867444969472L, 148024);
    return false;
  }
  
  public void setGravity(int paramInt)
  {
    GMTrace.i(18273072578560L, 136145);
    super.setGravity(paramInt & 0xFFFFFFAF & 0xFFFFFFCF | 0x10);
    GMTrace.o(18273072578560L, 136145);
  }
  
  public final void setInputType(int paramInt)
  {
    GMTrace.i(18273341014016L, 136147);
    super.setInputType(0xFFFDFFFF & paramInt);
    GMTrace.o(18273341014016L, 136147);
  }
  
  public final void setSingleLine(boolean paramBoolean)
  {
    GMTrace.i(18273206796288L, 136146);
    GMTrace.o(18273206796288L, 136146);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */