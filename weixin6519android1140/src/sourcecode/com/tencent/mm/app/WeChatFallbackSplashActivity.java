package com.tencent.mm.app;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.splash.d.a;
import com.tencent.mm.splash.d.b;
import com.tencent.mm.splash.e;

public class WeChatFallbackSplashActivity
  extends Activity
{
  private Runnable esZ;
  private Handler mHandler;
  
  public WeChatFallbackSplashActivity()
  {
    GMTrace.i(19014088654848L, 141666);
    this.esZ = new Runnable()
    {
      private long eta;
      
      public final void run()
      {
        GMTrace.i(19015028178944L, 141673);
        if (this.eta == -1L) {
          this.eta = System.currentTimeMillis();
        }
        if (!WeChatFallbackSplashActivity.pl())
        {
          if (System.currentTimeMillis() - this.eta >= 80000L)
          {
            e.a("MicroMsg.FallbackSplash", "checkIfMainProcessStartupDone timeout", new Object[0]);
            WeChatFallbackSplashActivity.this.finish();
            WeChatFallbackSplashActivity.this.overridePendingTransition(d.a.aLj, d.a.aLt);
            GMTrace.o(19015028178944L, 141673);
            return;
          }
          WeChatFallbackSplashActivity.b(WeChatFallbackSplashActivity.this).postDelayed(WeChatFallbackSplashActivity.a(WeChatFallbackSplashActivity.this), 100L);
          GMTrace.o(19015028178944L, 141673);
          return;
        }
        e.a("MicroMsg.FallbackSplash", "checkIfMainProcessStartupDone true", new Object[0]);
        WeChatFallbackSplashActivity.this.finish();
        WeChatFallbackSplashActivity.this.overridePendingTransition(d.a.aLj, d.a.aLt);
        GMTrace.o(19015028178944L, 141673);
      }
    };
    GMTrace.o(19014088654848L, 141666);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(19014357090304L, 141668);
    e.a("MicroMsg.FallbackSplash", "block onBackPressed", new Object[0]);
    GMTrace.o(19014357090304L, 141668);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19014222872576L, 141667);
    super.onCreate(paramBundle);
    setContentView(d.b.vop);
    e.a("MicroMsg.FallbackSplash", "onCreate", new Object[0]);
    paramBundle = new HandlerThread("splash-activity");
    paramBundle.start();
    this.mHandler = new Handler(paramBundle.getLooper());
    this.mHandler.postDelayed(this.esZ, 100L);
    GMTrace.o(19014222872576L, 141667);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\app\WeChatFallbackSplashActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */