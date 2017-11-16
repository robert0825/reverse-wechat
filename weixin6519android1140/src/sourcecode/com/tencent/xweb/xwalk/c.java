package com.tencent.xweb.xwalk;

import android.content.Context;
import com.tencent.xweb.a.a.b;
import org.xwalk.core.XWalkCookieManager;

public final class c
  implements a.b
{
  XWalkCookieManager ypm = new XWalkCookieManager();
  
  public final void init(Context paramContext) {}
  
  public final void sync()
  {
    if (this.ypm != null) {
      this.ypm.flushCookieStore();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\xweb\xwalk\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */