package com.tencent.mm.plugin.luckymoney.b;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.wallet_core.c.l;
import com.tencent.mm.wallet_core.d.c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class i
  implements e, com.tencent.mm.wallet_core.d.b
{
  private String fXf;
  public r hsU;
  public HashSet<k> huj;
  public HashSet<k> huk;
  private Set<Integer> huz;
  private Context mContext;
  private c mIP;
  
  public i(Context paramContext, c paramc)
  {
    GMTrace.i(9733201199104L, 72518);
    this.mIP = null;
    this.huj = new HashSet();
    this.huk = new HashSet();
    this.hsU = null;
    this.huz = new HashSet();
    this.mContext = paramContext;
    this.mIP = paramc;
    GMTrace.o(9733201199104L, 72518);
  }
  
  private void k(k paramk)
  {
    GMTrace.i(9734274940928L, 72526);
    if ((paramk != null) && ((paramk instanceof l))) {
      ((l)paramk).fXf = this.fXf;
    }
    GMTrace.o(9734274940928L, 72526);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(9734006505472L, 72524);
    int i;
    if (this.huk.contains(paramk))
    {
      this.huk.remove(paramk);
      w.d("MicroMsg.WalletNetSceneMgr", "has find scene ");
      i = 1;
    }
    for (;;)
    {
      if ((this.huk.isEmpty()) && (this.huj.isEmpty())) {
        if (this.hsU != null)
        {
          this.hsU.dismiss();
          this.hsU = null;
        }
      }
      for (boolean bool = true;; bool = false)
      {
        if ((i != 0) && (this.mIP != null)) {
          this.mIP.b(paramInt1, paramInt2, paramString, paramk, bool);
        }
        GMTrace.o(9734006505472L, 72524);
        return;
        if (!this.huj.contains(paramk)) {
          break label160;
        }
        this.huj.remove(paramk);
        w.d("MicroMsg.WalletNetSceneMgr", "has find forcescenes ");
        i = 1;
        break;
      }
      label160:
      i = 0;
    }
  }
  
  public final void a(k paramk, boolean paramBoolean)
  {
    GMTrace.i(9733335416832L, 72519);
    k(paramk);
    this.huj.add(paramk);
    if ((paramBoolean) && ((this.hsU == null) || ((this.hsU != null) && (!this.hsU.isShowing()))))
    {
      if (this.hsU != null) {
        this.hsU.dismiss();
      }
      this.hsU = com.tencent.mm.ui.base.h.a(this.mContext, this.mContext.getString(a.i.bKJ), false, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(9746220318720L, 72615);
          i.this.aMc();
          GMTrace.o(9746220318720L, 72615);
        }
      });
    }
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(paramk, 0);
    GMTrace.o(9733335416832L, 72519);
  }
  
  public final void aMc()
  {
    GMTrace.i(9733603852288L, 72521);
    if (this.hsU != null)
    {
      this.hsU.dismiss();
      this.hsU = null;
    }
    Iterator localIterator = this.huj.iterator();
    k localk;
    while (localIterator.hasNext())
    {
      localk = (k)localIterator.next();
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.c(localk);
    }
    localIterator = this.huk.iterator();
    while (localIterator.hasNext())
    {
      localk = (k)localIterator.next();
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.c(localk);
    }
    this.huj.clear();
    this.huk.clear();
    GMTrace.o(9733603852288L, 72521);
  }
  
  public final boolean aMd()
  {
    GMTrace.i(9734140723200L, 72525);
    if ((this.huk.isEmpty()) && (this.huj.isEmpty()))
    {
      GMTrace.o(9734140723200L, 72525);
      return false;
    }
    GMTrace.o(9734140723200L, 72525);
    return true;
  }
  
  public final void aMe()
  {
    GMTrace.i(9734409158656L, 72527);
    if ((this.hsU != null) && (this.hsU.isShowing())) {
      this.hsU.dismiss();
    }
    GMTrace.o(9734409158656L, 72527);
  }
  
  public final void b(k paramk, boolean paramBoolean)
  {
    GMTrace.i(9733469634560L, 72520);
    w.d("MicroMsg.WalletNetSceneMgr", "isShowProgress " + paramBoolean);
    k(paramk);
    this.huk.add(paramk);
    if ((paramBoolean) && ((this.hsU == null) || ((this.hsU != null) && (!this.hsU.isShowing()))))
    {
      if (this.hsU != null) {
        this.hsU.dismiss();
      }
      this.hsU = com.tencent.mm.ui.base.h.a(this.mContext, this.mContext.getString(a.i.bKJ), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(9734946029568L, 72531);
          if ((i.this.hsU != null) && (i.this.huj.isEmpty()))
          {
            i.this.hsU.dismiss();
            paramAnonymousDialogInterface = i.this.huk.iterator();
            while (paramAnonymousDialogInterface.hasNext())
            {
              k localk = (k)paramAnonymousDialogInterface.next();
              com.tencent.mm.kernel.h.xz();
              com.tencent.mm.kernel.h.xx().fYr.c(localk);
            }
            i.this.huk.clear();
          }
          GMTrace.o(9734946029568L, 72531);
        }
      });
    }
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(paramk, 0);
    GMTrace.o(9733469634560L, 72520);
  }
  
  public final void hN(int paramInt)
  {
    GMTrace.i(9733738070016L, 72522);
    this.huz.add(Integer.valueOf(paramInt));
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(paramInt, this);
    GMTrace.o(9733738070016L, 72522);
  }
  
  public final void hO(int paramInt)
  {
    GMTrace.i(9733872287744L, 72523);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(paramInt, this);
    this.huz.remove(Integer.valueOf(paramInt));
    if (this.huz.isEmpty())
    {
      aMc();
      this.mIP = null;
      this.mContext = null;
    }
    GMTrace.o(9733872287744L, 72523);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */