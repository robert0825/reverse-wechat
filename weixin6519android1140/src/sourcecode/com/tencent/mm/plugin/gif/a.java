package com.tencent.mm.plugin.gif;

import android.graphics.drawable.Drawable;
import com.tencent.gmtrace.GMTrace;

public abstract class a
  extends Drawable
  implements com.tencent.mm.ui.f.b.a
{
  public a()
  {
    GMTrace.i(20136417296384L, 150028);
    GMTrace.o(20136417296384L, 150028);
  }
  
  public abstract void recycle();
  
  public abstract void reset();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\gif\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */