package com.tencent.mm.app;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.splash.SplashActivity;
import com.tencent.mm.splash.d.b;
import com.tencent.mm.splash.e;

public class WeChatSplashActivity
  extends SplashActivity
{
  public WeChatSplashActivity()
  {
    GMTrace.i(19013820219392L, 141664);
    GMTrace.o(19013820219392L, 141664);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19013954437120L, 141665);
    super.onCreate(paramBundle);
    setContentView(d.b.vop);
    e.bRY();
    GMTrace.o(19013954437120L, 141665);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\app\WeChatSplashActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */