package com.tencent.mm.pluginsdk.ui;

import com.tencent.gmtrace.GMTrace;

public abstract interface h
{
  public abstract void MR();
  
  public abstract void MS();
  
  public abstract int MU();
  
  public abstract boolean T(float paramFloat);
  
  public abstract void XF();
  
  public abstract int XG();
  
  public abstract int XH();
  
  public abstract int XI();
  
  public abstract void XJ();
  
  public abstract boolean Xi();
  
  public abstract void a(g paramg);
  
  public abstract void a(d paramd);
  
  public abstract void b(boolean paramBoolean, String paramString, int paramInt);
  
  public abstract boolean iN(int paramInt);
  
  public abstract boolean isPlaying();
  
  public abstract boolean o(int paramInt, boolean paramBoolean);
  
  public abstract boolean pause();
  
  public abstract void setMute(boolean paramBoolean);
  
  public abstract void start();
  
  public abstract void stop();
  
  public static abstract interface a
  {
    public abstract void O(String paramString, boolean paramBoolean);
  }
  
  public static abstract interface b
  {
    public abstract void Xq();
    
    public abstract void Xr();
    
    public abstract void Xs();
    
    public abstract void Xt();
    
    public abstract void Xu();
    
    public abstract void Xv();
    
    public abstract void bs(int paramInt1, int paramInt2);
    
    public abstract void w(String paramString, int paramInt1, int paramInt2);
  }
  
  public static abstract interface c
  {
    public abstract void A(int paramInt, String paramString);
    
    public abstract void a(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean);
  }
  
  public static enum d
  {
    static
    {
      GMTrace.i(17470182129664L, 130163);
      ttx = new d("DEFAULT", 0);
      tty = new d("FILL", 1);
      ttz = new d("CONTAIN", 2);
      ttA = new d("COVER", 3);
      ttB = new d[] { ttx, tty, ttz, ttA };
      GMTrace.o(17470182129664L, 130163);
    }
    
    private d()
    {
      GMTrace.i(17470047911936L, 130162);
      GMTrace.o(17470047911936L, 130162);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */