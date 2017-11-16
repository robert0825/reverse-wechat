package com.tencent.mm.plugin.soter_mp.a;

import android.app.Activity;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.soter_mp.b.d;
import com.tencent.mm.plugin.soter_mp.b.e;
import com.tencent.mm.plugin.soter_mp.ui.SoterAuthenticationUI;
import com.tencent.mm.plugin.soter_mp.ui.SoterAuthenticationUI.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.i;
import java.lang.ref.WeakReference;

public abstract class c
{
  protected d qqd;
  protected e qqe;
  protected WeakReference<Activity> qqf;
  
  public c(WeakReference<Activity> paramWeakReference, d paramd, e parame)
  {
    GMTrace.i(7079582498816L, 52747);
    this.qqd = null;
    this.qqe = null;
    this.qqf = null;
    this.qqd = paramd;
    this.qqe = parame;
    this.qqf = paramWeakReference;
    GMTrace.o(7079582498816L, 52747);
  }
  
  protected static void a(i parami)
  {
    GMTrace.i(7080924676096L, 52757);
    if (parami == null)
    {
      w.e("MicroMsg.SoterMpBaseController", "hy: dialog is null.");
      GMTrace.o(7080924676096L, 52757);
      return;
    }
    if (SoterAuthenticationUI.qqk != null)
    {
      bqJ();
      SoterAuthenticationUI.qqk.obtainMessage(6, parami).sendToTarget();
      GMTrace.o(7080924676096L, 52757);
      return;
    }
    w.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
    GMTrace.o(7080924676096L, 52757);
  }
  
  protected static void bqJ()
  {
    GMTrace.i(7080387805184L, 52753);
    if (SoterAuthenticationUI.qqk != null)
    {
      SoterAuthenticationUI.qqk.obtainMessage(5).sendToTarget();
      GMTrace.o(7080387805184L, 52753);
      return;
    }
    w.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
    GMTrace.o(7080387805184L, 52753);
  }
  
  protected final void bqK()
  {
    GMTrace.i(7080522022912L, 52754);
    if (SoterAuthenticationUI.qqk != null)
    {
      bqJ();
      SoterAuthenticationUI.qqk.obtainMessage(0, this.qqe).sendToTarget();
      GMTrace.o(7080522022912L, 52754);
      return;
    }
    w.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
    GMTrace.o(7080522022912L, 52754);
  }
  
  protected final void bqL()
  {
    GMTrace.i(7080656240640L, 52755);
    if (SoterAuthenticationUI.qqk != null)
    {
      bqJ();
      SoterAuthenticationUI.qqk.obtainMessage(1, this.qqe).sendToTarget();
      GMTrace.o(7080656240640L, 52755);
      return;
    }
    w.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
    GMTrace.o(7080656240640L, 52755);
  }
  
  protected final void bqM()
  {
    GMTrace.i(7080790458368L, 52756);
    if (SoterAuthenticationUI.qqk != null)
    {
      bqJ();
      SoterAuthenticationUI.qqk.obtainMessage(2, this.qqe).sendToTarget();
      GMTrace.o(7080790458368L, 52756);
      return;
    }
    w.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
    GMTrace.o(7080790458368L, 52756);
  }
  
  public abstract void cP();
  
  public abstract void onPause();
  
  public abstract void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt);
  
  public abstract void onResume();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\soter_mp\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */