package com.tencent.e;

public abstract class d<T extends e>
{
  public final Object mLock = new Object();
  public int oSX;
  public T[] yjD = Gi(20);
  
  public d(int paramInt) {}
  
  public abstract T[] Gi(int paramInt);
  
  public abstract T cqW();
  
  public T cqX()
  {
    e locale = null;
    synchronized (this.mLock)
    {
      if (this.oSX > 0)
      {
        this.oSX -= 1;
        locale = this.yjD[this.oSX];
        this.yjD[this.oSX] = null;
      }
      return locale;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\e\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */