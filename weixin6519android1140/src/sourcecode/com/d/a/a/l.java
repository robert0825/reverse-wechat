package com.d.a.a;

import java.util.Arrays;

final class l
{
  float aFI;
  long aFM;
  private final float[] aFN = new float[3];
  private int aFO;
  private long aFP;
  long aFQ;
  
  final void a(float paramFloat, int paramInt, long paramLong)
  {
    long l = paramLong - this.aFP;
    if (l > this.aFM)
    {
      Arrays.fill(this.aFN, 0.0F);
      this.aFO = 0;
      this.aFP = 0L;
      this.aFQ = 0L;
      this.aFI = 0.0F;
      this.aFN[0] = this.aFN[1];
      this.aFN[1] = this.aFN[2];
      this.aFN[2] = paramFloat;
      if (this.aFN[2] != 0.0F)
      {
        if (this.aFN[0] == 0.0F) {
          break label196;
        }
        paramFloat = (this.aFN[0] + this.aFN[1] + this.aFN[2]) / 3.0F;
      }
    }
    for (;;)
    {
      float f = y.aJQ;
      this.aFI = (paramInt / (paramFloat + this.aFN[2] * 3.0F) * f + y.aJR * (paramInt - this.aFO) / (this.aFO + paramInt + 1));
      this.aFO = paramInt;
      this.aFP = paramLong;
      return;
      this.aFQ = (l + this.aFQ);
      break;
      label196:
      if (this.aFN[1] != 0.0F) {
        paramFloat = (this.aFN[1] + this.aFN[2]) / 2.0F;
      } else {
        paramFloat = this.aFN[2];
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\d\a\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */