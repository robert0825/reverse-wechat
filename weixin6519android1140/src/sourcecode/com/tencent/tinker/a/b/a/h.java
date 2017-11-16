package com.tencent.tinker.a.b.a;

public final class h
  extends a
{
  public short[] ydW;
  
  public h(int paramInt)
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException("initSize < 0");
    }
    this.ydW = new short[paramInt];
  }
  
  public final void a(short paramShort1, short paramShort2, short paramShort3)
  {
    c(paramShort1);
    c(paramShort2);
    c(paramShort3);
  }
  
  public final void b(short paramShort1, short paramShort2)
  {
    c(paramShort1);
    c(paramShort2);
  }
  
  public final void c(short paramShort)
  {
    int i = this.ydO;
    if (this.ydW.length - i <= 0)
    {
      short[] arrayOfShort = new short[this.ydW.length + (this.ydW.length >> 1)];
      System.arraycopy(this.ydW, 0, arrayOfShort, 0, i);
      this.ydW = arrayOfShort;
    }
    this.ydW[this.ydO] = paramShort;
    cqD();
  }
  
  public final void writeInt(int paramInt)
  {
    c((short)paramInt);
    c((short)(paramInt >> 16));
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tinker\a\b\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */