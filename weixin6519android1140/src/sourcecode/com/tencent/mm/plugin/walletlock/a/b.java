package com.tencent.mm.plugin.walletlock.a;

import android.app.Activity;
import android.content.Intent;
import com.tencent.mm.kernel.c.a;

public abstract interface b
  extends a
{
  public abstract void L(Activity paramActivity);
  
  public abstract void a(Activity paramActivity, b paramb);
  
  public abstract void a(Activity paramActivity, b paramb, a parama);
  
  public abstract void b(Activity paramActivity, int paramInt1, int paramInt2);
  
  public abstract void b(Activity paramActivity, Intent paramIntent, int paramInt);
  
  public abstract b bAq();
  
  public abstract boolean bAr();
  
  public abstract boolean bAs();
  
  public abstract void c(Activity paramActivity, Intent paramIntent);
  
  public abstract void h(Activity paramActivity, int paramInt);
  
  public abstract void i(Activity paramActivity, int paramInt);
  
  public abstract void init();
  
  public abstract void xc(int paramInt);
  
  public static abstract interface a {}
  
  public static abstract interface b
  {
    public abstract boolean M(Activity paramActivity);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\walletlock\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */