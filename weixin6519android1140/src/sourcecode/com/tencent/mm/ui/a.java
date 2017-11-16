package com.tencent.mm.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.preference.i;

public abstract class a
  extends i
  implements l
{
  private Bundle pWX;
  protected boolean vFA;
  private boolean vFu;
  private boolean vFv;
  private boolean vFw;
  private boolean vFx;
  protected boolean vFy;
  protected boolean vFz;
  
  public a()
  {
    GMTrace.i(2071919067136L, 15437);
    this.vFy = false;
    this.vFz = false;
    GMTrace.o(2071919067136L, 15437);
  }
  
  protected abstract void bVJ();
  
  protected abstract void bVK();
  
  protected abstract void bVL();
  
  protected abstract void bVM();
  
  protected abstract void bVN();
  
  protected abstract void bVO();
  
  public final void bVS()
  {
    GMTrace.i(2073261244416L, 15447);
    bVQ();
    this.vFw = true;
    GMTrace.o(2073261244416L, 15447);
  }
  
  public final void bVU()
  {
    GMTrace.i(2073529679872L, 15449);
    this.vFz = true;
    GMTrace.o(2073529679872L, 15449);
  }
  
  public final void bVV()
  {
    GMTrace.i(2073395462144L, 15448);
    if (!this.vFy)
    {
      GMTrace.o(2073395462144L, 15448);
      return;
    }
    if (this.vFv)
    {
      bVJ();
      this.vFv = false;
    }
    for (;;)
    {
      long l = System.currentTimeMillis();
      if (this.vFw)
      {
        bVR();
        this.vFw = false;
      }
      bVK();
      w.d("MicroMsg.INIT", "KEVIN " + toString() + " OnTabResume last : " + (System.currentTimeMillis() - l));
      this.vFx = true;
      this.vFy = false;
      GMTrace.o(2073395462144L, 15448);
      return;
      if (this.vFu)
      {
        bVO();
        bVJ();
        w.v("MicroMsg.INIT", "KEVIN tab onRecreate ");
        this.vFu = false;
      }
    }
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    GMTrace.i(2072858591232L, 15444);
    super.onActivityCreated(paramBundle);
    this.pWX = paramBundle;
    this.vFv = true;
    GMTrace.o(2072858591232L, 15444);
  }
  
  public void onDestroy()
  {
    GMTrace.i(2074066550784L, 15453);
    bVO();
    super.onDestroy();
    GMTrace.o(2074066550784L, 15453);
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2072992808960L, 15445);
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 0))
    {
      GMTrace.o(2072992808960L, 15445);
      return false;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2072992808960L, 15445);
    return bool;
  }
  
  public final void onPause()
  {
    GMTrace.i(2073663897600L, 15450);
    super.onPause();
    this.vFA = true;
    if (this.vFA)
    {
      if (!this.vFx)
      {
        this.vFA = false;
        GMTrace.o(2073663897600L, 15450);
        return;
      }
      long l = System.currentTimeMillis();
      bVM();
      w.d("MicroMsg.INIT", "KEVIN " + toString() + " onTabPause last : " + (System.currentTimeMillis() - l));
      this.vFx = false;
      this.vFA = false;
    }
    GMTrace.o(2073663897600L, 15450);
  }
  
  public final void onResume()
  {
    GMTrace.i(2073127026688L, 15446);
    super.onResume();
    bVT();
    LauncherUI localLauncherUI = LauncherUI.bXe();
    if ((localLauncherUI == null) || (!localLauncherUI.vJm))
    {
      GMTrace.o(2073127026688L, 15446);
      return;
    }
    this.vFy = true;
    if (this.vFz)
    {
      bVV();
      this.vFz = false;
    }
    GMTrace.o(2073127026688L, 15446);
  }
  
  public final void onStart()
  {
    GMTrace.i(2073932333056L, 15452);
    super.onStart();
    LauncherUI localLauncherUI = LauncherUI.bXe();
    if ((localLauncherUI == null) || (!localLauncherUI.vJm))
    {
      GMTrace.o(2073932333056L, 15452);
      return;
    }
    bVL();
    GMTrace.o(2073932333056L, 15452);
  }
  
  public final void onStop()
  {
    GMTrace.i(2073798115328L, 15451);
    super.onStop();
    bVN();
    GMTrace.o(2073798115328L, 15451);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */