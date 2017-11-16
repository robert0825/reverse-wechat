package com.d.a.a;

import android.net.wifi.ScanResult;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.List;

abstract class b
  extends a
{
  private z aDE;
  
  b()
  {
    super(new d[] { ab.oh(), r.nN(), u.ob(), k.nJ() });
  }
  
  private void b(p paramp)
  {
    if (this.aDE != null) {}
    try
    {
      this.aDE.execute(new a(this, paramp));
      return;
    }
    catch (Exception paramp) {}
  }
  
  k.a a(d.a parama)
  {
    if (parama == null) {
      return null;
    }
    return new k.a(Math.max(parama.aDL, 10000L));
  }
  
  abstract void a(double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, float paramFloat, long paramLong1, long paramLong2);
  
  abstract void a(float paramFloat1, float paramFloat2, int paramInt, float paramFloat3, float paramFloat4, float paramFloat5, long paramLong);
  
  abstract void a(int paramInt, String paramString, long paramLong1, long paramLong2);
  
  void a(Handler paramHandler, d.a parama)
  {
    if (paramHandler == null) {
      try
      {
        throw new Exception("CoreAssembly: master thread handler must be specified and cannot be null");
      }
      finally {}
    }
    this.aDE = z.b(paramHandler);
    super.a(paramHandler, parama);
  }
  
  final void a(Handler paramHandler, Handler[] paramArrayOfHandler)
  {
    paramArrayOfHandler[0] = paramHandler;
    paramArrayOfHandler[1] = null;
    paramArrayOfHandler[2] = paramHandler;
    paramArrayOfHandler[3] = paramHandler;
  }
  
  final void a(d.a parama, d.a[] paramArrayOfa)
  {
    paramArrayOfa[0] = parama;
    paramArrayOfa[1] = null;
    paramArrayOfa[2] = null;
    paramArrayOfa[3] = a(parama);
  }
  
  public void a(p paramp)
  {
    switch (paramp.what)
    {
    default: 
      return;
    case 101: 
      a(((ab.a)paramp).aKj, paramp.aGz, paramp.aGA);
      return;
    case 201: 
      b(paramp);
      return;
    case 202: 
      b(paramp);
      return;
    case 301: 
      paramp = (u.e)paramp;
      a(paramp.x, paramp.y, paramp.aJb, paramp.aIZ, paramp.aJa, paramp.aFH, paramp.aGA);
      return;
    }
    paramp = (k.b)paramp;
    a(paramp.lat, paramp.lng, Double.valueOf(paramp.aFF).intValue(), Math.round(paramp.aFG), Math.round(paramp.aFH), paramp.aFJ, paramp.aFK, paramp.aFI, paramp.aFL, paramp.aGA);
  }
  
  abstract void a(x paramx, long paramLong1, long paramLong2);
  
  abstract void a(List<ScanResult> paramList, long paramLong1, long paramLong2);
  
  private static final class a
    implements Runnable
  {
    private final WeakReference<b> aDF;
    private final p aDG;
    
    public a(b paramb, p paramp)
    {
      if ((paramb == null) || (paramp == null)) {
        throw new Exception("CoreAssembly: HandleMsgTask: null arg");
      }
      this.aDF = new WeakReference(paramb);
      this.aDG = paramp;
    }
    
    public final void run()
    {
      b localb = (b)this.aDF.get();
      if (localb != null) {}
      switch (this.aDG.what)
      {
      default: 
        return;
      }
      r.f localf = (r.f)this.aDG;
      if (localf.aGY == 1)
      {
        localb.a(localf.aGZ, localf.aGz, localf.aGA);
        return;
      }
      localb.a(localf.aGY, localf.message, localf.aGz, localf.aGA);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\d\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */