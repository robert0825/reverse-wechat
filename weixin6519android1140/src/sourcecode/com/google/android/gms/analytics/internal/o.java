package com.google.android.gms.analytics.internal;

public abstract class o
  extends n
{
  private boolean acN;
  private boolean acO;
  
  protected o(q paramq)
  {
    super(paramq);
  }
  
  protected abstract void hS();
  
  protected final void iC()
  {
    if (!isInitialized()) {
      throw new IllegalStateException("Not initialized");
    }
  }
  
  public final void iD()
  {
    hS();
    this.acN = true;
  }
  
  public final boolean isInitialized()
  {
    return (this.acN) && (!this.acO);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\internal\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */