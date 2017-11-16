package com.tencent.mm.plugin.location_soso;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.plugin.p.c;
import com.tencent.mm.plugin.p.c.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.v;
import com.tencent.tencentmap.mapsdk.map.MapActivity;

@com.tencent.mm.ui.base.a(19)
public class SoSoProxyUI
  extends MapActivity
{
  protected static final String TAG = "MicroMsg.SoSoProxyUI";
  private com.tencent.mm.plugin.p.a basemapUI;
  
  public SoSoProxyUI()
  {
    GMTrace.i(5444810571776L, 40567);
    GMTrace.o(5444810571776L, 40567);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(5445347442688L, 40571);
    if (this.basemapUI.dispatchKeyEvent(paramKeyEvent))
    {
      GMTrace.o(5445347442688L, 40571);
      return true;
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(5445347442688L, 40571);
    return bool;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(5445213224960L, 40570);
    if (this.basemapUI.dispatchTouchEvent(paramMotionEvent))
    {
      GMTrace.o(5445213224960L, 40570);
      return true;
    }
    boolean bool = super.dispatchTouchEvent(paramMotionEvent);
    GMTrace.o(5445213224960L, 40570);
    return bool;
  }
  
  public void finish()
  {
    GMTrace.i(5446421184512L, 40579);
    super.finish();
    GMTrace.o(5446421184512L, 40579);
  }
  
  public Resources getResources()
  {
    GMTrace.i(5446286966784L, 40578);
    if ((getAssets() != null) && (ab.getResources() != null))
    {
      localResources = ab.getResources();
      GMTrace.o(5446286966784L, 40578);
      return localResources;
    }
    Resources localResources = super.getResources();
    GMTrace.o(5446286966784L, 40578);
    return localResources;
  }
  
  public Object getSystemService(String paramString)
  {
    GMTrace.i(5446152749056L, 40577);
    Object localObject = super.getSystemService(paramString);
    if ((getAssets() != null) && ("layout_inflater".equals(paramString)))
    {
      paramString = v.b((LayoutInflater)localObject);
      GMTrace.o(5446152749056L, 40577);
      return paramString;
    }
    GMTrace.o(5446152749056L, 40577);
    return localObject;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(5446018531328L, 40576);
    this.basemapUI.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(5446018531328L, 40576);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(5445079007232L, 40569);
    this.basemapUI.onBackPressed();
    GMTrace.o(5445079007232L, 40569);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool1 = true;
    GMTrace.i(5444944789504L, 40568);
    w.i("MicroMsg.SoSoProxyUI", "SoSoProxyUI onCreate");
    super.onCreate(paramBundle);
    int i = getIntent().getIntExtra("intent_map_key", -1);
    if (c.a.mEV == null) {
      for (;;)
      {
        try
        {
          boolean bool2 = b.foreground;
          if (paramBundle == null) {
            continue;
          }
          w.e("MicroMsg.SoSoProxyUI", "summerasyncinit not init activity foreground[%b] savedInstanceState[%b], activity[%s, %d]", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1), getClass().getSimpleName(), Integer.valueOf(hashCode()) });
          finish();
        }
        catch (Throwable paramBundle)
        {
          w.printErrStackTrace("MicroMsg.SoSoProxyUI", paramBundle, "summerasyncinit finish:", new Object[0]);
          continue;
        }
        g.ork.a(598L, 20L, 1L, false);
        GMTrace.o(5444944789504L, 40568);
        return;
        bool1 = false;
      }
    }
    this.basemapUI = c.a.mEV.d(this, i);
    if (this.basemapUI == null)
    {
      finish();
      GMTrace.o(5444944789504L, 40568);
      return;
    }
    this.basemapUI.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().setStatusBarColor(getResources().getColor(R.e.aPb));
    }
    GMTrace.o(5444944789504L, 40568);
  }
  
  public void onDestroy()
  {
    GMTrace.i(5445884313600L, 40575);
    if (this.basemapUI != null) {
      this.basemapUI.onDestroy();
    }
    super.onDestroy();
    GMTrace.o(5445884313600L, 40575);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(5445481660416L, 40572);
    if ((paramInt == 82) && (paramKeyEvent.getAction() == 1))
    {
      this.basemapUI.aLp();
      GMTrace.o(5445481660416L, 40572);
      return true;
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(5445481660416L, 40572);
    return bool;
  }
  
  public void onPause()
  {
    GMTrace.i(5445750095872L, 40574);
    super.onPause();
    this.basemapUI.onPause();
    GMTrace.o(5445750095872L, 40574);
  }
  
  public void onResume()
  {
    GMTrace.i(5445615878144L, 40573);
    super.onResume();
    this.basemapUI.onResume();
    GMTrace.o(5445615878144L, 40573);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location_soso\SoSoProxyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */