package com.tencent.mm.pluginsdk.model.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.y.at;

public final class v
  implements t
{
  public k eEg;
  public r hsU;
  public Context mContext;
  public a toe;
  
  public v(Context paramContext, a parama)
  {
    GMTrace.i(827854946304L, 6168);
    this.mContext = paramContext;
    this.toe = parama;
    GMTrace.o(827854946304L, 6168);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, w paramw)
  {
    GMTrace.i(827989164032L, 6169);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LoadAppInfoAfterLogin", "OnScenEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    an.aGk().b(7, this);
    if ((this.hsU != null) && (this.hsU.isShowing()))
    {
      this.hsU.dismiss();
      this.hsU = null;
    }
    if (this.toe != null) {
      this.toe.bsT();
    }
    g.bJw();
    GMTrace.o(827989164032L, 6169);
  }
  
  public static abstract interface a
  {
    public abstract void bsT();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */