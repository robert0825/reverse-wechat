package com.tencent.qqmusic.mediaplayer;

abstract interface PlayerCallback
{
  public abstract void playThreadStart();
  
  public abstract void playerEnded();
  
  public abstract void playerException(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract void playerPaused();
  
  public abstract void playerPrepared();
  
  public abstract void playerSeeked();
  
  public abstract void playerStarted();
  
  public abstract void playerStopped();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\PlayerCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */