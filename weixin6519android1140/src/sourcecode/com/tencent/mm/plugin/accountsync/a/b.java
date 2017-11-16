package com.tencent.mm.plugin.accountsync.a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.f;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.y.at;

public final class b
  implements e, f
{
  public Context context;
  public k eEg;
  private ae handler;
  public r hsU;
  public a hsV;
  
  public b(Context paramContext, a parama)
  {
    GMTrace.i(7852542394368L, 58506);
    this.handler = new ae(Looper.getMainLooper());
    this.context = paramContext;
    this.hsV = parama;
    GMTrace.o(7852542394368L, 58506);
  }
  
  public final void a(final int paramInt1, int paramInt2, k paramk)
  {
    GMTrace.i(7852676612096L, 58507);
    if (paramInt2 != 0) {}
    for (paramInt1 = (int)(paramInt1 * 100L / paramInt2);; paramInt1 = 0)
    {
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7852408176640L, 58505);
          if (b.this.hsU != null) {
            b.this.hsU.setMessage(b.this.context.getString(R.l.cTt) + paramInt1 + "%");
          }
          GMTrace.o(7852408176640L, 58505);
        }
      });
      GMTrace.o(7852676612096L, 58507);
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7852810829824L, 58508);
    if (paramk.getType() == 139)
    {
      at.wS().b(139, this);
      if ((paramInt2 != 0) || (paramInt1 != 0)) {
        break label93;
      }
      this.hsV.Qv();
    }
    for (;;)
    {
      if (this.hsU != null) {
        this.hsU.dismiss();
      }
      GMTrace.o(7852810829824L, 58508);
      return;
      if (paramk.getType() != 138) {
        break;
      }
      at.wS().b(138, this);
      break;
      label93:
      w.e("MicroMsg.DoInit", "do init failed, err=" + paramInt1 + "," + paramInt2);
      this.hsV.Qv();
    }
  }
  
  public static abstract interface a
  {
    public abstract void Qv();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\accountsync\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */