package com.tencent.mm.plugin.address.c;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class b
  implements e
{
  public HashSet<k> huj;
  public HashSet<k> huk;
  public Dialog hul;
  private a huy;
  private Set<Integer> huz;
  private Context mContext;
  
  public b(Context paramContext, a parama)
  {
    GMTrace.i(12785446551552L, 95259);
    this.huy = null;
    this.huj = new HashSet();
    this.huk = new HashSet();
    this.hul = null;
    this.huz = new HashSet();
    this.mContext = paramContext;
    this.huy = parama;
    GMTrace.o(12785446551552L, 95259);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    int i = 1;
    GMTrace.i(12785983422464L, 95263);
    if (this.huk.contains(paramk))
    {
      this.huk.remove(paramk);
      w.d("MicroMsg.WalletNetSceneMgr", "has find scene ");
    }
    for (;;)
    {
      if ((this.huk.isEmpty()) && (this.huj.isEmpty()) && (this.hul != null))
      {
        this.hul.dismiss();
        this.hul = null;
      }
      if ((i != 0) && (this.huy != null)) {
        this.huy.e(paramInt1, paramInt2, paramString, paramk);
      }
      GMTrace.o(12785983422464L, 95263);
      return;
      if (this.huj.contains(paramk))
      {
        this.huj.remove(paramk);
        w.d("MicroMsg.WalletNetSceneMgr", "has find forcescenes ");
      }
      else
      {
        i = 0;
      }
    }
  }
  
  public final void g(k paramk)
  {
    GMTrace.i(12785580769280L, 95260);
    w.d("MicroMsg.WalletNetSceneMgr", "isShowProgress true");
    this.huk.add(paramk);
    if ((this.hul == null) || ((this.hul != null) && (!this.hul.isShowing())))
    {
      if (this.hul != null) {
        this.hul.dismiss();
      }
      this.hul = h.a(this.mContext, "", true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(12786251857920L, 95265);
          if ((b.this.hul != null) && (b.this.huj.isEmpty()))
          {
            b.this.hul.dismiss();
            paramAnonymousDialogInterface = b.this.huk.iterator();
            while (paramAnonymousDialogInterface.hasNext())
            {
              k localk = (k)paramAnonymousDialogInterface.next();
              at.wS().c(localk);
            }
            b.this.huk.clear();
          }
          GMTrace.o(12786251857920L, 95265);
        }
      });
    }
    at.wS().a(paramk, 0);
    GMTrace.o(12785580769280L, 95260);
  }
  
  public final void hN(int paramInt)
  {
    GMTrace.i(12785714987008L, 95261);
    this.huz.add(Integer.valueOf(paramInt));
    at.wS().a(paramInt, this);
    GMTrace.o(12785714987008L, 95261);
  }
  
  public final void hO(int paramInt)
  {
    GMTrace.i(12785849204736L, 95262);
    at.wS().b(paramInt, this);
    this.huz.remove(Integer.valueOf(paramInt));
    if (this.huz.isEmpty())
    {
      if (this.hul != null)
      {
        this.hul.dismiss();
        this.hul = null;
      }
      Iterator localIterator = this.huj.iterator();
      k localk;
      while (localIterator.hasNext())
      {
        localk = (k)localIterator.next();
        at.wS().c(localk);
      }
      localIterator = this.huk.iterator();
      while (localIterator.hasNext())
      {
        localk = (k)localIterator.next();
        at.wS().c(localk);
      }
      this.huj.clear();
      this.huk.clear();
      this.huy = null;
      this.mContext = null;
    }
    GMTrace.o(12785849204736L, 95262);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */