package com.tencent.mm.plugin.api.recordView;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView.SurfaceTextureListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMTextureView;

class MMSightRecordTextureView
  extends MMTextureView
  implements TextureView.SurfaceTextureListener
{
  private int hwT;
  private int hwU;
  private d hxu;
  private c hxv;
  
  public MMSightRecordTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(20188091121664L, 150413);
    setSurfaceTextureListener(this);
    GMTrace.o(20188091121664L, 150413);
  }
  
  public MMSightRecordTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(20187956903936L, 150412);
    setSurfaceTextureListener(this);
    GMTrace.o(20187956903936L, 150412);
  }
  
  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    GMTrace.i(20188359557120L, 150415);
    w.i("MicroMsg.MMSightRecordTextureViewImpl", "onSurfaceTextureAvailable, surface: %s, width: %s, height: %s", new Object[] { paramSurfaceTexture, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.hwT = paramInt1;
    this.hwU = paramInt2;
    this.hxu = new d();
    this.hxv = new c(paramSurfaceTexture, this.hxu);
    this.hxu.bj(paramInt1, paramInt2);
    this.hxv.hxx = true;
    this.hxv.start();
    GMTrace.o(20188359557120L, 150415);
  }
  
  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    GMTrace.i(20188627992576L, 150417);
    this.hxv.hxx = false;
    try
    {
      this.hxv.join();
      this.hxv = null;
      GMTrace.o(20188627992576L, 150417);
      return false;
    }
    catch (InterruptedException paramSurfaceTexture)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.MMSightRecordTextureViewImpl", paramSurfaceTexture, "onSurfaceTextureDestroyed error: %s", new Object[] { paramSurfaceTexture.getMessage() });
      }
    }
  }
  
  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    GMTrace.i(20188493774848L, 150416);
    w.i("MicroMsg.MMSightRecordTextureViewImpl", "onSurfaceTextureSizeChanged, surface: %s, width: %s, height: %s", new Object[] { paramSurfaceTexture, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.hwT = paramInt1;
    this.hwU = paramInt2;
    this.hxu.bj(paramInt1, paramInt2);
    GMTrace.o(20188493774848L, 150416);
  }
  
  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    GMTrace.i(20188762210304L, 150418);
    GMTrace.o(20188762210304L, 150418);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\api\recordView\MMSightRecordTextureView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */