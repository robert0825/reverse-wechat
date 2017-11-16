package com.tencent.xweb.x5;

import android.content.Context;
import com.tencent.smtt.sdk.CookieSyncManager;
import com.tencent.xweb.a.a.b;

public final class e
  implements a.b
{
  CookieSyncManager yow;
  
  public final void init(Context paramContext)
  {
    this.yow = CookieSyncManager.createInstance(paramContext);
  }
  
  public final void sync()
  {
    if (this.yow != null) {
      this.yow.sync();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\xweb\x5\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */