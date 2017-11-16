package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.d;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i;
import com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI;
import com.tencent.mm.sdk.platformtools.w;

public abstract class a
  extends i
{
  public boolean pDJ;
  protected boolean pDK;
  public boolean pDL;
  private BroadcastReceiver sU;
  
  public a(Context paramContext, s params, ViewGroup paramViewGroup)
  {
    super(paramContext, params, paramViewGroup);
    GMTrace.i(17096922628096L, 127382);
    this.pDK = SnsAdNativeLandingPagesUI.pXf;
    this.sU = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(17131685019648L, 127641);
        if (("com.tencent.mm.adlanding.close_exposure_voice".equals(paramAnonymousIntent.getAction())) && (!a.this.bkM().pEz.equals(paramAnonymousIntent.getStringExtra("para_id"))))
        {
          paramAnonymousContext = a.this;
          if (paramAnonymousContext.pDL) {
            paramAnonymousContext.bkk();
          }
        }
        GMTrace.o(17131685019648L, 127641);
      }
    };
    d.l(this.context).a(this.sU, new IntentFilter("com.tencent.mm.adlanding.close_exposure_voice"));
    w.v("AbsVideoPlayComp", "register receiver " + this.sU);
    GMTrace.o(17096922628096L, 127382);
  }
  
  public void O(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(17097593716736L, 127387);
    super.O(paramInt1, paramInt2, paramInt3);
    GMTrace.o(17097593716736L, 127387);
  }
  
  public void bkk()
  {
    GMTrace.i(17097056845824L, 127383);
    this.pDJ = false;
    GMTrace.o(17097056845824L, 127383);
  }
  
  public void bkl()
  {
    GMTrace.i(17097191063552L, 127384);
    super.bkl();
    d.l(this.context).unregisterReceiver(this.sU);
    this.pDL = true;
    w.v("AbsVideoPlayComp", "unregister receiver " + this.sU);
    GMTrace.o(17097191063552L, 127384);
  }
  
  public void bkm()
  {
    GMTrace.i(17097325281280L, 127385);
    super.bkm();
    this.pDL = true;
    GMTrace.o(17097325281280L, 127385);
  }
  
  public void bkn()
  {
    GMTrace.i(17097459499008L, 127386);
    super.bkn();
    this.pDL = false;
    GMTrace.o(17097459499008L, 127386);
  }
  
  public void bko()
  {
    GMTrace.i(17097727934464L, 127388);
    this.pDJ = true;
    GMTrace.o(17097727934464L, 127388);
  }
  
  public final void bkp()
  {
    GMTrace.i(17097862152192L, 127389);
    Intent localIntent = new Intent("com.tencent.mm.adlanding.close_exposure_voice");
    localIntent.putExtra("para_id", bkM().pEz);
    d.l(this.context).a(localIntent);
    GMTrace.o(17097862152192L, 127389);
  }
  
  protected final void bkq()
  {
    GMTrace.i(17098130587648L, 127391);
    super.bkq();
    if (!this.pDK)
    {
      bkk();
      GMTrace.o(17098130587648L, 127391);
      return;
    }
    bko();
    GMTrace.o(17098130587648L, 127391);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */