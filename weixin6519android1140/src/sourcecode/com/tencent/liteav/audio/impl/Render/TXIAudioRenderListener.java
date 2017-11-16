package com.tencent.liteav.audio.impl.Render;

public abstract interface TXIAudioRenderListener
{
  public abstract void OnAudioNeedRender();
  
  public abstract long getCacheDuration();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\audio\impl\Render\TXIAudioRenderListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */