package com.d.a.a;

import android.os.Handler;

abstract class e
{
  private a aDM;
  public long aDN;
  public final Handler handler;
  
  e(Handler paramHandler)
  {
    if (paramHandler != null) {}
    for (;;)
    {
      this.handler = paramHandler;
      return;
      paramHandler = new Handler();
    }
  }
  
  final void a(long paramLong1, long paramLong2)
  {
    stop();
    this.aDN = paramLong1;
    this.aDM = new a();
    a locala = this.aDM;
    if ((locala.started) || (locala.aDO)) {
      return;
    }
    locala.aDP.handler.postDelayed(locala, paramLong2);
    locala.started = true;
  }
  
  abstract void nG();
  
  final void stop()
  {
    if (this.aDM != null)
    {
      a locala = this.aDM;
      locala.aDO = true;
      locala.aDP.handler.removeCallbacks(locala);
    }
  }
  
  private final class a
    implements Runnable
  {
    boolean aDO;
    boolean started;
    
    public a() {}
    
    public final void run()
    {
      if (this.aDO) {
        return;
      }
      e.this.nG();
      e.this.handler.postDelayed(this, e.this.aDN);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\d\a\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */