package com.tencent.mm.y;

import com.tencent.gmtrace.GMTrace;

@Deprecated
public abstract interface ak
{
  public static final class a
  {
    public static ak.b gmX;
    public static ak.e gmY;
    public static ak.c gmZ;
    public static ak.f gna;
    
    public static ak.b AB()
    {
      GMTrace.i(616864677888L, 4596);
      ak.b localb = gmX;
      GMTrace.o(616864677888L, 4596);
      return localb;
    }
  }
  
  public static abstract interface b
  {
    public abstract void K(String paramString1, String paramString2);
    
    public abstract void L(String paramString1, String paramString2);
    
    public abstract void a(String paramString1, String paramString2, a parama);
    
    public abstract void gJ(String paramString);
    
    public static abstract interface a
    {
      public abstract void r(String paramString, boolean paramBoolean);
    }
  }
  
  public static abstract interface c
  {
    public abstract void AC();
    
    public abstract String fr(int paramInt);
    
    public abstract String fs(int paramInt);
    
    public abstract boolean ft(int paramInt);
    
    public abstract String m(int paramInt, boolean paramBoolean);
  }
  
  public static abstract interface d
  {
    public abstract void j(String paramString, long paramLong);
  }
  
  public static abstract interface e
  {
    public abstract void aI(int paramInt1, int paramInt2);
  }
  
  public static abstract interface f
  {
    public abstract void AD();
    
    public abstract boolean R(long paramLong);
    
    public abstract void a(ak.d paramd);
    
    public abstract void b(ak.d paramd);
    
    public abstract void gK(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */