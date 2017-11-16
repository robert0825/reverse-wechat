package com.tencent.gmtrace;

import java.util.Arrays;

public class GMTraceBitSet
{
  private int bitNum;
  private byte[] boolFilter;
  
  public GMTraceBitSet(int paramInt)
  {
    this.bitNum = paramInt;
    if (paramInt % 8 == 0)
    {
      this.boolFilter = new byte[paramInt / 8];
      return;
    }
    this.boolFilter = new byte[paramInt / 8 + 1];
  }
  
  public void clear()
  {
    Arrays.fill(this.boolFilter, (byte)0);
  }
  
  public boolean get(int paramInt)
  {
    if (this.boolFilter == null) {}
    int i;
    do
    {
      return false;
      i = paramInt;
      if (paramInt >= this.bitNum) {
        i = paramInt % this.bitNum;
      }
      paramInt = i / 8;
      i = (byte)(1 << i % 8);
    } while ((this.boolFilter[paramInt] & i) <= 0);
    return true;
  }
  
  public void set(int paramInt)
  {
    if (this.boolFilter == null) {
      return;
    }
    int i = paramInt;
    if (paramInt >= this.bitNum) {
      i = paramInt % this.bitNum;
    }
    paramInt = i / 8;
    i = (byte)(1 << i % 8);
    this.boolFilter[paramInt] = ((byte)(i | this.boolFilter[paramInt]));
  }
  
  public void unset(int paramInt)
  {
    if (this.boolFilter == null) {
      return;
    }
    int i = paramInt;
    if (paramInt >= this.bitNum) {
      i = paramInt % this.bitNum;
    }
    paramInt = i / 8;
    i = (byte)(1 << i % 8 ^ 0xFFFFFFFF);
    this.boolFilter[paramInt] = ((byte)(i & this.boolFilter[paramInt]));
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\gmtrace\GMTraceBitSet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */