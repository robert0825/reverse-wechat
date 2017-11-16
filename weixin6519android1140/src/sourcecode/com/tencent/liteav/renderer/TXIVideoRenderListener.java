package com.tencent.liteav.renderer;

import android.graphics.SurfaceTexture;

public abstract interface TXIVideoRenderListener
{
  public abstract void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture);
  
  public abstract void onSurfaceTextureDestroy(SurfaceTexture paramSurfaceTexture);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\renderer\TXIVideoRenderListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */