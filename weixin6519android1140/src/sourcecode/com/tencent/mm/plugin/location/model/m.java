package com.tencent.mm.plugin.location.model;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.y;
import java.io.IOException;

public final class m
  implements com.tencent.mm.bn.a.a
{
  private Bitmap jvJ;
  y<String, Bitmap> mxQ;
  
  public m()
  {
    GMTrace.i(9641664708608L, 71836);
    this.jvJ = null;
    this.mxQ = new y(20);
    try
    {
      this.jvJ = BackwardSupportUtil.b.a(ab.getContext().getAssets().open("avatar/default_nor_avatar.png"), com.tencent.mm.br.a.getDensity(null));
      this.jvJ = d.a(this.jvJ, false, this.jvJ.getWidth() >> 1);
      GMTrace.o(9641664708608L, 71836);
      return;
    }
    catch (IOException localIOException)
    {
      w.printErrStackTrace("MicroMsg.TrackAvatarCacheService", localIOException, "", new Object[0]);
      GMTrace.o(9641664708608L, 71836);
    }
  }
  
  public final Bitmap Bf(String paramString)
  {
    GMTrace.i(9641798926336L, 71837);
    if (bg.nm(paramString))
    {
      GMTrace.o(9641798926336L, 71837);
      return null;
    }
    w.d("MicroMsg.TrackAvatarCacheService", "getAvatar, tag = %s, cacheSize = %d", new Object[] { paramString, Integer.valueOf(this.mxQ.size()) });
    paramString = (Bitmap)this.mxQ.get(paramString);
    if ((paramString != null) && (!paramString.isRecycled()))
    {
      GMTrace.o(9641798926336L, 71837);
      return paramString;
    }
    GMTrace.o(9641798926336L, 71837);
    return null;
  }
  
  public final void o(String paramString, Bitmap paramBitmap)
  {
    GMTrace.i(9641933144064L, 71838);
    if (this.mxQ.get(paramString) != null)
    {
      Bitmap localBitmap = (Bitmap)this.mxQ.get(paramString);
      if (!localBitmap.isRecycled()) {
        localBitmap.recycle();
      }
      this.mxQ.remove(paramString);
    }
    this.mxQ.put(paramString, paramBitmap);
    w.d("MicroMsg.TrackAvatarCacheService", "updateCache, tag = %s, cacheSize = %d", new Object[] { paramString, Integer.valueOf(this.mxQ.size()) });
    GMTrace.o(9641933144064L, 71838);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\model\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */