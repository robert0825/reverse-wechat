package com.tencent.xweb.sys;

import android.content.Context;
import android.webkit.CookieSyncManager;
import com.tencent.xweb.a.a.b;

public final class b
  implements a.b
{
  CookieSyncManager ynS;
  
  public final void init(Context paramContext)
  {
    this.ynS = CookieSyncManager.createInstance(paramContext);
  }
  
  public final void sync()
  {
    if (this.ynS != null) {
      this.ynS.sync();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\xweb\sys\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */