package com.tencent.mm.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.r;
import java.util.ArrayList;
import java.util.Iterator;

public class SplashActivity
  extends Activity
{
  private boolean voJ;
  
  public SplashActivity()
  {
    GMTrace.i(19015162396672L, 141674);
    this.voJ = false;
    GMTrace.o(19015162396672L, 141674);
  }
  
  final void bSa()
  {
    GMTrace.i(19124549844992L, 142489);
    if (e.vot.b(this, new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19024020766720L, 141740);
        SplashActivity.c(SplashActivity.this);
        GMTrace.o(19024020766720L, 141740);
      }
    })) {
      bSb();
    }
    GMTrace.o(19124549844992L, 142489);
  }
  
  final void bSb()
  {
    GMTrace.i(19016101920768L, 141681);
    if (this.voJ)
    {
      GMTrace.o(19016101920768L, 141681);
      return;
    }
    this.voJ = true;
    if (!isFinishing())
    {
      setResult(-100);
      int i = getIntent().getIntExtra("hashcode", 0);
      Iterator localIterator = e.voq.iterator();
      while (localIterator.hasNext())
      {
        f localf = (f)localIterator.next();
        if (i == localf.hashCode())
        {
          localf.recreate();
          e.a("WxSplash.SplashActivity", "do recreate", new Object[0]);
        }
      }
      finish();
      overridePendingTransition(d.a.aLj, d.a.voo);
      GMTrace.o(19016101920768L, 141681);
      return;
    }
    onBackPressed();
    GMTrace.o(19016101920768L, 141681);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19015296614400L, 141675);
    super.onCreate(paramBundle);
    e.a(this);
    e.a("WxSplash.SplashActivity", "onCreate", new Object[0]);
    if (!e.bRQ())
    {
      e.a("WxSplash.SplashActivity", "no need splash, finish", new Object[0]);
      finish();
    }
    if (e.voA != null) {
      e.voA.c(this);
    }
    GMTrace.o(19015296614400L, 141675);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(19015699267584L, 141678);
    super.onDestroy();
    e.b(this);
    e.a("WxSplash.SplashActivity", "onDestroy", new Object[0]);
    GMTrace.o(19015699267584L, 141678);
  }
  
  protected void onPause()
  {
    GMTrace.i(19015565049856L, 141677);
    e.a("WxSplash.SplashActivity", "onPause", new Object[0]);
    r.bIX();
    super.onPause();
    GMTrace.o(19015565049856L, 141677);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(19015833485312L, 141679);
    if (e.vot != null) {
      e.vot.a(this, paramInt, paramArrayOfString, paramArrayOfInt);
    }
    GMTrace.o(19015833485312L, 141679);
  }
  
  protected void onResume()
  {
    GMTrace.i(19015430832128L, 141676);
    super.onResume();
    e.a("WxSplash.SplashActivity", "onResume", new Object[0]);
    GMTrace.o(19015430832128L, 141676);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\splash\SplashActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */