package com.tencent.mm.e.b;

import com.tencent.gmtrace.GMTrace;

public abstract class f
{
  protected int exG;
  protected a exY;
  protected int eyt;
  protected boolean mIsPause;
  
  public f()
  {
    GMTrace.i(4483006332928L, 33401);
    this.exG = -123456789;
    this.mIsPause = false;
    this.eyt = 0;
    GMTrace.o(4483006332928L, 33401);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(4483543203840L, 33405);
    this.exY = parama;
    GMTrace.o(4483543203840L, 33405);
  }
  
  public abstract void aC(boolean paramBoolean);
  
  public final void df(int paramInt)
  {
    GMTrace.i(4483677421568L, 33406);
    this.exG = paramInt;
    GMTrace.o(4483677421568L, 33406);
  }
  
  public abstract void pL();
  
  public abstract boolean qw();
  
  public final int qy()
  {
    GMTrace.i(4483811639296L, 33407);
    int i = this.eyt;
    GMTrace.o(4483811639296L, 33407);
    return i;
  }
  
  public static abstract interface a
  {
    public abstract void c(int paramInt, byte[] paramArrayOfByte);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\e\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */