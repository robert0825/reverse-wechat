package com.tencent.mm.splash;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.f.a;

public class DexOptService
  extends Service
{
  private HandlerThread mHandlerThread;
  private Handler voj;
  private volatile boolean vok;
  private Handler vol;
  private volatile Throwable vom;
  
  public DexOptService()
  {
    GMTrace.i(19024960290816L, 141747);
    this.mHandlerThread = new HandlerThread("DexOpt-Thread");
    this.vok = false;
    this.vol = new Handler()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(19024289202176L, 141742);
        e.a("WxSplash.DexOptService", "dexopt process quit.", new Object[0]);
        DexOptService.this.stopSelf();
        GMTrace.o(19024289202176L, 141742);
      }
    };
    GMTrace.o(19024960290816L, 141747);
  }
  
  private boolean bRK()
  {
    GMTrace.i(19025228726272L, 141749);
    e.a("WxSplash.DexOptService", "doDexOpt start", new Object[0]);
    try
    {
      bool = a.at(getApplicationContext());
      e.a("WxSplash.DexOptService", "schedule to quit", new Object[0]);
      this.vol.removeCallbacksAndMessages(null);
      this.vol.sendEmptyMessageDelayed(0, 120000L);
      e.a("WxSplash.DexOptService", "doDexOpt done, result %s", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(19025228726272L, 141749);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        this.vom = localThrowable;
        boolean bool = false;
      }
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    GMTrace.i(19025497161728L, 141751);
    e.a("WxSplash.DexOptService", "onBind", new Object[0]);
    GMTrace.o(19025497161728L, 141751);
    return null;
  }
  
  public void onCreate()
  {
    GMTrace.i(19025094508544L, 141748);
    e.a("WxSplash.DexOptService", "onCreate", new Object[0]);
    super.onCreate();
    this.mHandlerThread.start();
    this.voj = new Handler(this.mHandlerThread.getLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(19027107774464L, 141763);
        if (DexOptService.a(DexOptService.this))
        {
          e.a("WxSplash.DexOptService", "dex opt progressing.", new Object[0]);
          GMTrace.o(19027107774464L, 141763);
          return;
        }
        DexOptService.a(DexOptService.this, true);
        if (DexOptService.b(DexOptService.this)) {
          DexOptService.bRL();
        }
        for (;;)
        {
          DexOptService.aDL();
          DexOptService.a(DexOptService.this, false);
          GMTrace.o(19027107774464L, 141763);
          return;
          DexOptService.bRM();
          DexOptService.c(DexOptService.this);
        }
      }
    };
    GMTrace.o(19025094508544L, 141748);
  }
  
  public void onDestroy()
  {
    GMTrace.i(19025631379456L, 141752);
    e.a("WxSplash.DexOptService", "onDestroy", new Object[0]);
    super.onDestroy();
    GMTrace.o(19025631379456L, 141752);
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    GMTrace.i(19025362944000L, 141750);
    this.voj.sendEmptyMessage(0);
    e.a("WxSplash.DexOptService", "onStartCommand", new Object[0]);
    paramInt1 = super.onStartCommand(paramIntent, paramInt1, paramInt2);
    GMTrace.o(19025362944000L, 141750);
    return paramInt1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\splash\DexOptService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */