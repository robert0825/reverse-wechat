package com.tencent.mm.cache;

import android.graphics.Canvas;

public abstract interface d<T>
  extends Cloneable
{
  public abstract void a(Canvas paramCanvas, boolean paramBoolean);
  
  public abstract void aI(boolean paramBoolean);
  
  public abstract int aJ(boolean paramBoolean);
  
  public abstract void add(T paramT);
  
  public abstract void c(Canvas paramCanvas);
  
  public abstract void onCreate();
  
  public abstract void onDestroy();
  
  public abstract void pW();
  
  public abstract T pop();
  
  public abstract void rS();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\cache\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */