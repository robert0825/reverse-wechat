package com.tencent.xweb.x5.sdk;

import android.content.Context;
import com.tencent.smtt.sdk.l;
import com.tencent.smtt.sdk.l.a;

public final class g
  implements b
{
  public final boolean a(Context paramContext, boolean paramBoolean1, boolean paramBoolean2, f.a parama)
  {
    if (parama == null) {
      return l.a(paramContext, paramBoolean1, paramBoolean2, null);
    }
    return l.a(paramContext, paramBoolean1, paramBoolean2, new a(parama));
  }
  
  public final boolean col()
  {
    return l.col();
  }
  
  public final boolean isDownloading()
  {
    return l.isDownloading();
  }
  
  public final void r(Context paramContext, boolean paramBoolean)
  {
    l.r(paramContext, paramBoolean);
  }
  
  public final void stopDownload() {}
  
  private static final class a
    implements l.a
  {
    f.a yoX;
    
    public a(f.a parama)
    {
      this.yoX = parama;
    }
    
    public final void g(boolean paramBoolean, int paramInt)
    {
      if (this.yoX != null) {
        this.yoX.g(paramBoolean, paramInt);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\xweb\x5\sdk\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */