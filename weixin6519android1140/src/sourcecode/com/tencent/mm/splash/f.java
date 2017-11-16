package com.tencent.mm.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;

final class f
  extends Activity
{
  f()
  {
    GMTrace.i(19023081242624L, 141733);
    GMTrace.o(19023081242624L, 141733);
  }
  
  protected final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(19023752331264L, 141738);
    if (paramInt1 == 100)
    {
      if (paramInt2 != -100)
      {
        onBackPressed();
        GMTrace.o(19023752331264L, 141738);
      }
    }
    else
    {
      finish();
      e.a("WxSplash.SplashHackActivity", "unknown request code.", new Object[0]);
    }
    GMTrace.o(19023752331264L, 141738);
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19023215460352L, 141734);
    super.onCreate(paramBundle);
    e.a("WxSplash.SplashHackActivity", "onCreate", new Object[0]);
    setVisible(false);
    paramBundle = new Intent(this, e.bRX());
    paramBundle.putExtra("hashcode", hashCode());
    startActivityForResult(paramBundle, 100);
    GMTrace.o(19023215460352L, 141734);
  }
  
  protected final void onDestroy()
  {
    GMTrace.i(19023618113536L, 141737);
    e.a("WxSplash.SplashHackActivity", "onDestroy", new Object[0]);
    setVisible(true);
    super.onDestroy();
    GMTrace.o(19023618113536L, 141737);
  }
  
  protected final void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(19125220933632L, 142494);
    e.a("WxSplash.SplashHackActivity", "onNewIntent.", new Object[0]);
    if ((e.vot != null) && (e.vot.j(paramIntent))) {
      finish();
    }
    GMTrace.o(19125220933632L, 142494);
  }
  
  protected final void onPause()
  {
    GMTrace.i(19023483895808L, 141736);
    e.a("WxSplash.SplashHackActivity", "onPause", new Object[0]);
    super.onPause();
    GMTrace.o(19023483895808L, 141736);
  }
  
  protected final void onResume()
  {
    GMTrace.i(19023349678080L, 141735);
    super.onResume();
    e.a("WxSplash.SplashHackActivity", "onResume", new Object[0]);
    GMTrace.o(19023349678080L, 141735);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\splash\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */