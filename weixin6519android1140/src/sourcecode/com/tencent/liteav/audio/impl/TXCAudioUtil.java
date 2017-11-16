package com.tencent.liteav.audio.impl;

public class TXCAudioUtil
{
  private static int[] sampleRateArray = { 96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350 };
  
  public static int byteArrayToInt(byte[] paramArrayOfByte)
  {
    return paramArrayOfByte[0] & 0xFF | (paramArrayOfByte[1] & 0xFF) << 8 | (paramArrayOfByte[2] & 0xFF) << 16 | (paramArrayOfByte[3] & 0xFF) << 24;
  }
  
  public static int getSampelRate(int paramInt)
  {
    if ((paramInt >= sampleRateArray.length) || (paramInt < 0)) {
      return 0;
    }
    return sampleRateArray[paramInt];
  }
  
  public static int getSampleRateIndex(int paramInt)
  {
    int i = 0;
    while ((i < sampleRateArray.length) && (sampleRateArray[i] != paramInt)) {
      i += 1;
    }
    paramInt = i;
    if (i >= sampleRateArray.length) {
      paramInt = -1;
    }
    return paramInt;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\audio\impl\TXCAudioUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */