package com.tencent.mm.plugin.wallet.pay.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.gs;
import com.tencent.mm.g.a.gs.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.ui.g;

public final class a
{
  private Dialog hul;
  private Context mContext;
  public a qYN;
  
  public a(Context paramContext, a parama)
  {
    GMTrace.i(7791339110400L, 58050);
    this.hul = null;
    this.qYN = null;
    this.mContext = paramContext;
    this.qYN = parama;
    GMTrace.o(7791339110400L, 58050);
  }
  
  public final void a(boolean paramBoolean, int paramInt, String paramString)
  {
    GMTrace.i(7791607545856L, 58052);
    final gs localgs = new gs();
    localgs.eJN = null;
    localgs.eJM.eJO = paramBoolean;
    if ((paramBoolean) && ((this.hul == null) || ((this.hul != null) && (!this.hul.isShowing()))))
    {
      if (this.hul != null) {
        this.hul.dismiss();
      }
      this.hul = g.a(this.mContext, false, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(7807042584576L, 58167);
          a.this.bxl();
          GMTrace.o(7807042584576L, 58167);
        }
      });
    }
    localgs.eJM.eJP = paramInt;
    localgs.eJM.eJQ = paramString;
    localgs.eDO = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7795097206784L, 58078);
        w.i("MicroMsg.RegenFingerPrintRsaKey", "GenFingerPrintRsaKeyEvent callback");
        gs.b localb = localgs.eJN;
        if ((localb != null) && (localb.eFN))
        {
          w.i("MicroMsg.RegenFingerPrintRsaKey", "GenFingerPrintRsaKeyEvent callback, result.isSuccess is true");
          a.this.bxl();
          if (a.this.qYN != null)
          {
            a.this.qYN.c(localb.eFN, localb.eJR, localb.eJS);
            GMTrace.o(7795097206784L, 58078);
          }
        }
        else
        {
          if ((localb != null) && (!localb.eFN))
          {
            a.this.bxl();
            if (a.this.qYN != null) {
              a.this.qYN.c(localb.eFN, localb.eJR, localb.eJS);
            }
            w.e("MicroMsg.RegenFingerPrintRsaKey", "GenFingerPrintRsaKeyEvent callback, result.isSuccess is false");
            GMTrace.o(7795097206784L, 58078);
            return;
          }
          w.i("MicroMsg.RegenFingerPrintRsaKey", "GenFingerPrintRsaKeyEvent callback, result == null");
        }
        GMTrace.o(7795097206784L, 58078);
      }
    };
    com.tencent.mm.sdk.b.a.vgX.a(localgs, Looper.getMainLooper());
    GMTrace.o(7791607545856L, 58052);
  }
  
  public final void bxl()
  {
    GMTrace.i(7791741763584L, 58053);
    if (this.hul != null)
    {
      this.hul.dismiss();
      this.hul = null;
    }
    GMTrace.o(7791741763584L, 58053);
  }
  
  public final void release()
  {
    GMTrace.i(7791473328128L, 58051);
    this.qYN = null;
    this.mContext = null;
    GMTrace.o(7791473328128L, 58051);
  }
  
  public static abstract interface a
  {
    public abstract void c(boolean paramBoolean, String paramString1, String paramString2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pay\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */