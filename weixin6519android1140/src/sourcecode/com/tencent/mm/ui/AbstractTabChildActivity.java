package com.tencent.mm.ui;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public abstract class AbstractTabChildActivity
  extends ActionBarActivity
{
  public AbstractTabChildActivity()
  {
    GMTrace.i(3464427995136L, 25812);
    GMTrace.o(3464427995136L, 25812);
  }
  
  public static abstract class a
    extends u
    implements l
  {
    private Bundle pWX;
    protected boolean vFA;
    protected boolean vFB;
    private boolean vFu;
    private boolean vFv;
    private boolean vFw;
    protected boolean vFx;
    protected boolean vFy;
    protected boolean vFz;
    
    public a()
    {
      GMTrace.i(3089960534016L, 23022);
      this.vFy = false;
      this.vFz = false;
      this.vFB = false;
      GMTrace.o(3089960534016L, 23022);
    }
    
    public abstract void bVJ();
    
    public abstract void bVK();
    
    public abstract void bVL();
    
    public abstract void bVM();
    
    public abstract void bVN();
    
    public abstract void bVO();
    
    public abstract void bVP();
    
    public abstract void bVQ();
    
    public abstract void bVR();
    
    public final void bVS()
    {
      GMTrace.i(3091705364480L, 23035);
      bVQ();
      this.vFw = true;
      GMTrace.o(3091705364480L, 23035);
    }
    
    public final void bVT()
    {
      GMTrace.i(15337999302656L, 114277);
      GMTrace.o(15337999302656L, 114277);
    }
    
    public final void bVU()
    {
      GMTrace.i(3092242235392L, 23039);
      this.vFz = true;
      GMTrace.o(3092242235392L, 23039);
    }
    
    public final void bVV()
    {
      GMTrace.i(3092510670848L, 23041);
      if (!this.vFy)
      {
        GMTrace.o(3092510670848L, 23041);
        return;
      }
      if (this.vFv)
      {
        bVJ();
        this.vFv = false;
      }
      for (;;)
      {
        this.vFB = true;
        long l = System.currentTimeMillis();
        if (this.vFw)
        {
          this.vFw = false;
          bVR();
        }
        bVK();
        w.d("MicroMsg.INIT", "KEVIN " + toString() + " OnTabResume last : " + (System.currentTimeMillis() - l));
        this.vFx = true;
        this.vFy = false;
        GMTrace.o(3092510670848L, 23041);
        return;
        if (this.vFu)
        {
          if (this.vFB) {
            bVO();
          }
          bVJ();
          w.v("MicroMsg.INIT", "KEVIN tab onRecreate " + toString());
          this.vFu = false;
        }
      }
    }
    
    public boolean bmX()
    {
      GMTrace.i(3093047541760L, 23045);
      GMTrace.o(3093047541760L, 23045);
      return false;
    }
    
    public int getLayoutId()
    {
      GMTrace.i(3090363187200L, 23025);
      GMTrace.o(3090363187200L, 23025);
      return 0;
    }
    
    public final void onActivityCreated(Bundle paramBundle)
    {
      GMTrace.i(3090228969472L, 23024);
      super.onActivityCreated(paramBundle);
      this.vFv = true;
      this.pWX = paramBundle;
      GMTrace.o(3090228969472L, 23024);
    }
    
    public void onDestroy()
    {
      GMTrace.i(3092913324032L, 23044);
      if (this.vFB) {
        bVO();
      }
      super.onDestroy();
      GMTrace.o(3092913324032L, 23044);
    }
    
    public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
    {
      GMTrace.i(3091839582208L, 23036);
      if ((paramInt == 4) && (paramKeyEvent.getAction() == 0))
      {
        GMTrace.o(3091839582208L, 23036);
        return false;
      }
      boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
      GMTrace.o(3091839582208L, 23036);
      return bool;
    }
    
    public void onPause()
    {
      GMTrace.i(3092376453120L, 23040);
      super.onPause();
      this.vFA = true;
      if (this.vFA)
      {
        if (!this.vFx)
        {
          this.vFA = false;
          GMTrace.o(3092376453120L, 23040);
          return;
        }
        long l = System.currentTimeMillis();
        bVM();
        w.d("MicroMsg.INIT", "KEVIN " + toString() + " onTabPause last : " + (System.currentTimeMillis() - l));
        this.vFx = false;
        this.vFA = false;
      }
      GMTrace.o(3092376453120L, 23040);
    }
    
    public void onResume()
    {
      GMTrace.i(3092108017664L, 23038);
      super.onResume();
      LauncherUI localLauncherUI = LauncherUI.bXe();
      if ((localLauncherUI == null) || (!localLauncherUI.vJm))
      {
        GMTrace.o(3092108017664L, 23038);
        return;
      }
      this.vFy = true;
      if (this.vFz)
      {
        bVV();
        this.vFz = false;
      }
      GMTrace.o(3092108017664L, 23038);
    }
    
    public final void onStart()
    {
      GMTrace.i(3092779106304L, 23043);
      super.onStart();
      LauncherUI localLauncherUI = LauncherUI.bXe();
      if ((localLauncherUI == null) || (!localLauncherUI.vJm))
      {
        GMTrace.o(3092779106304L, 23043);
        return;
      }
      bVL();
      GMTrace.o(3092779106304L, 23043);
    }
    
    public final void onStop()
    {
      GMTrace.i(3092644888576L, 23042);
      super.onStop();
      bVN();
      GMTrace.o(3092644888576L, 23042);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\AbstractTabChildActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */