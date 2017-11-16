package com.tencent.mm.plugin.ipcall.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public abstract class a
  implements e
{
  protected int errCode;
  protected int errType;
  public c miY;
  public a mjC;
  
  public a()
  {
    GMTrace.i(11614128439296L, 86532);
    this.errType = 0;
    this.errCode = 0;
    GMTrace.o(11614128439296L, 86532);
  }
  
  public abstract int Fd();
  
  public void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(11615336398848L, 86541);
    w.d("MicroMsg.BaseIPCallService", "onSceneEnd, errType: %d, errCode: %d, scene.getType: %d, serviceType: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramk.getType()), Integer.valueOf(Fd()) });
    this.errType = paramInt1;
    this.errCode = paramInt2;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (this.mjC != null) {
        this.mjC.a(Fd(), paramk, paramInt1, paramInt2);
      }
      GMTrace.o(11615336398848L, 86541);
      return;
    }
    if (this.mjC != null) {
      this.mjC.b(Fd(), paramk, paramInt1, paramInt2);
    }
    GMTrace.o(11615336398848L, 86541);
  }
  
  public void a(c paramc)
  {
    GMTrace.i(11615067963392L, 86539);
    w.d("MicroMsg.BaseIPCallService", "start service, type: %d", new Object[] { Integer.valueOf(Fd()) });
    this.miY = paramc;
    b(this.miY);
    GMTrace.o(11615067963392L, 86539);
  }
  
  public abstract int[] aIA();
  
  public abstract void aIB();
  
  public abstract void b(c paramc);
  
  public void destroy()
  {
    GMTrace.i(11614396874752L, 86534);
    int[] arrayOfInt = aIA();
    int j = arrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      int k = arrayOfInt[i];
      at.wS().b(k, this);
      i += 1;
    }
    this.mjC = null;
    onDestroy();
    GMTrace.o(11614396874752L, 86534);
  }
  
  public void init()
  {
    GMTrace.i(11614262657024L, 86533);
    int[] arrayOfInt = aIA();
    int j = arrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      int k = arrayOfInt[i];
      at.wS().a(k, this);
      i += 1;
    }
    aIB();
    GMTrace.o(11614262657024L, 86533);
  }
  
  public abstract void onDestroy();
  
  public static abstract interface a
  {
    public abstract void a(int paramInt1, Object paramObject, int paramInt2, int paramInt3);
    
    public abstract void b(int paramInt1, Object paramObject, int paramInt2, int paramInt3);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */