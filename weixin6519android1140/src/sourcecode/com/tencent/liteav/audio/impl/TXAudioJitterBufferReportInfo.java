package com.tencent.liteav.audio.impl;

public class TXAudioJitterBufferReportInfo
{
  public int mLoadCnt = 0;
  public int mLoadMaxTime = 0;
  public int mLoadTime = 0;
  public int mNoDataCnt = 0;
  public int mSpeedCnt = 0;
  
  public void init()
  {
    this.mLoadTime = 0;
    this.mLoadCnt = 0;
    this.mLoadMaxTime = 0;
    this.mSpeedCnt = 0;
    this.mNoDataCnt = 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\audio\impl\TXAudioJitterBufferReportInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */