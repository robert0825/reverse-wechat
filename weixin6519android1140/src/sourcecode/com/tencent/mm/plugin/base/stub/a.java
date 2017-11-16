package com.tencent.mm.plugin.base.stub;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.j;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.q;

public final class a
  extends d
{
  public a(Context paramContext, String paramString1, String paramString2, d.a parama)
  {
    super(paramContext, paramString1, paramString2, parama);
    GMTrace.i(12839804731392L, 95664);
    GMTrace.o(12839804731392L, 95664);
  }
  
  protected final void Pj()
  {
    GMTrace.i(12839938949120L, 95665);
    h.a(this.context, R.l.dAA, R.l.cUG, false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(12830543708160L, 95595);
        paramAnonymousDialogInterface = p.a.tma;
        if (paramAnonymousDialogInterface != null) {
          paramAnonymousDialogInterface.L(a.this.openId, q.zH(), a.this.appId);
        }
        a.this.jjc.dl(false);
        GMTrace.o(12830543708160L, 95595);
      }
    });
    GMTrace.o(12839938949120L, 95665);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\base\stub\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */