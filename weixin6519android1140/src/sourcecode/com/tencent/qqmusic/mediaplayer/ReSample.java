package com.tencent.qqmusic.mediaplayer;

class ReSample
{
  private static void interpolate(BufferInfo paramBufferInfo1, BufferInfo paramBufferInfo2, long paramLong1, long paramLong2)
  {
    int m = Math.round(1.0F * paramBufferInfo1.bufferSize / (float)paramLong1 * (float)paramLong2);
    float f1 = m / paramBufferInfo1.bufferSize;
    paramBufferInfo2.setShortBufferCapacity(m);
    paramBufferInfo2.bufferSize = m;
    int i = 0;
    while (i < m)
    {
      float f2 = i / f1;
      int n = (int)f2;
      int k = n + 1;
      int j = k;
      if (k >= paramBufferInfo1.bufferSize) {
        j = paramBufferInfo1.bufferSize - 1;
      }
      float f3 = paramBufferInfo1.shortBuffer[j] - paramBufferInfo1.shortBuffer[n];
      float f4 = n;
      paramBufferInfo2.shortBuffer[i] = ((short)(int)(f3 * (f2 - f4) + paramBufferInfo1.shortBuffer[n]));
      i += 1;
    }
  }
  
  static void reSample(BufferInfo paramBufferInfo1, BufferInfo paramBufferInfo2, long paramLong1, long paramLong2)
  {
    if ((paramBufferInfo1 == null) || (paramBufferInfo1.shortBuffer == null) || (paramBufferInfo1.bufferSize <= 0) || (paramBufferInfo2 == null)) {
      return;
    }
    if ((paramLong1 == paramLong2) || (paramLong2 <= 0L) || (paramLong1 <= 0L))
    {
      paramBufferInfo1.copy(paramBufferInfo2);
      return;
    }
    interpolate(paramBufferInfo1, paramBufferInfo2, paramLong1, paramLong2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\ReSample.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */