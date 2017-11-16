package com.tencent.mm.bd.a;

import com.tencent.gmtrace.GMTrace;

public final class a
{
  int hfE;
  int hfF;
  int hfG;
  short[] hfH;
  
  public a(int paramInt)
  {
    GMTrace.i(4383685214208L, 32661);
    this.hfE = 0;
    this.hfF = 0;
    this.hfG = 0;
    int i = paramInt;
    if (paramInt <= 1) {
      i = 512;
    }
    this.hfH = new short[i];
    GMTrace.o(4383685214208L, 32661);
  }
  
  final int b(short[] paramArrayOfShort, int paramInt)
  {
    GMTrace.i(4383819431936L, 32662);
    if (paramInt > paramArrayOfShort.length) {
      paramInt = paramArrayOfShort.length;
    }
    for (;;)
    {
      if (paramInt == 0)
      {
        GMTrace.o(4383819431936L, 32662);
        return 0;
      }
      int i = this.hfH.length;
      if (paramInt < this.hfG)
      {
        if (paramInt > i - this.hfE) {
          break label123;
        }
        System.arraycopy(this.hfH, this.hfE, paramArrayOfShort, 0, paramInt);
        this.hfE += paramInt;
        if (this.hfE < i) {}
      }
      label123:
      int j;
      for (this.hfE = 0;; this.hfE = j)
      {
        this.hfG -= paramInt;
        GMTrace.o(4383819431936L, 32662);
        return paramInt;
        paramInt = this.hfG;
        break;
        i -= this.hfE;
        System.arraycopy(this.hfH, this.hfE, paramArrayOfShort, 0, i);
        j = paramInt - i;
        System.arraycopy(this.hfH, 0, paramArrayOfShort, i, j);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bd\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */