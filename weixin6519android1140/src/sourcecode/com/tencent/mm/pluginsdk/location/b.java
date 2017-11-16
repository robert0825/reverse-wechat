package com.tencent.mm.pluginsdk.location;

import com.tencent.gmtrace.GMTrace;

public final class b
{
  public int eMn;
  public float gEJ;
  public float gEK;
  public int scene;
  public long tmw;
  
  public b(long paramLong, float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    GMTrace.i(1250238136320L, 9315);
    this.gEJ = paramFloat1;
    this.gEK = paramFloat2;
    this.eMn = paramInt1;
    this.scene = paramInt2;
    this.tmw = paramLong;
    GMTrace.o(1250238136320L, 9315);
  }
  
  public final String toString()
  {
    GMTrace.i(1250372354048L, 9316);
    String str = String.format("%d-%d-%d", new Object[] { Integer.valueOf((int)(this.gEJ * 1000000.0F)), Integer.valueOf((int)(this.gEK * 1000000.0F)), Integer.valueOf(this.eMn) });
    GMTrace.o(1250372354048L, 9316);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\location\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */