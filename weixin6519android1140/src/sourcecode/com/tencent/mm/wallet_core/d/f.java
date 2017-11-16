package com.tencent.mm.wallet_core.d;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.n;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.l;
import com.tencent.mm.wallet_core.g.a.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.g;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class f
  implements e, b
{
  public String fXf;
  public HashSet<com.tencent.mm.ad.k> huj;
  public HashSet<com.tencent.mm.ad.k> huk;
  public Dialog hul;
  private Set<Integer> huz;
  public Context mContext;
  private c mIP;
  public Bundle ui;
  private a xDQ;
  
  public f(Context paramContext, c paramc)
  {
    GMTrace.i(1435995471872L, 10699);
    this.mIP = null;
    this.huj = new HashSet();
    this.huk = new HashSet();
    this.hul = null;
    this.huz = new HashSet();
    this.mContext = paramContext;
    this.mIP = paramc;
    this.xDQ = new a(this);
    GMTrace.o(1435995471872L, 10699);
  }
  
  private boolean k(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(1436934995968L, 10706);
    w.i("MicroMsg.WalletNetSceneMgr", "onSceneEnd scene is " + paramk.toString());
    w.d("MicroMsg.WalletNetSceneMgr", "tofutest: errType: %d, errCode: %d, errMsg: %s, %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Boolean.valueOf(r.hlg) });
    if ((r.hlg) && ((paramk instanceof i)) && (!((i)paramk).xEm) && (!((i)paramk).bxj()))
    {
      paramString = (i)paramk;
      w.i("MicroMsg.WalletNetSceneMgr", "test do delay query order");
      this.xDQ.b(paramString);
      GMTrace.o(1436934995968L, 10706);
      return true;
    }
    if (!(paramk instanceof i))
    {
      GMTrace.o(1436934995968L, 10706);
      return false;
    }
    if (((i)paramk).bxj())
    {
      GMTrace.o(1436934995968L, 10706);
      return false;
    }
    if (((i)paramk).xEm)
    {
      w.i("MicroMsg.WalletNetSceneMgr", "getHasRetried pass");
      GMTrace.o(1436934995968L, 10706);
      return false;
    }
    paramString = (i)paramk;
    boolean bool2 = this.xDQ.a(paramString);
    if (!paramString.xDq) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      w.d("MicroMsg.WalletNetSceneMgr", "shouldRetry, network: %B, server: %B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((!bool2) && (!bool1)) {
        break;
      }
      w.i("MicroMsg.WalletNetSceneMgr", "doing delay order query retry");
      this.xDQ.b(paramString);
      GMTrace.o(1436934995968L, 10706);
      return true;
    }
    GMTrace.o(1436934995968L, 10706);
    return false;
  }
  
  private void q(com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(1437471866880L, 10710);
    if ((paramk != null) && ((paramk instanceof l)))
    {
      ((l)paramk).fXf = this.fXf;
      if (this.ui != null)
      {
        ((l)paramk).ui = this.ui;
        GMTrace.o(1437471866880L, 10710);
        return;
      }
      if ((this.mContext instanceof WalletBaseUI)) {
        ((l)paramk).ui = ((WalletBaseUI)this.mContext).ui;
      }
    }
    GMTrace.o(1437471866880L, 10710);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(1437069213696L, 10707);
    int i;
    if (this.huk.contains(paramk))
    {
      w.d("MicroMsg.WalletNetSceneMgr", "has find scene ");
      if (!k(paramInt1, paramInt2, paramString, paramk))
      {
        w.i("MicroMsg.WalletNetSceneMgr", "Not need delay query order,remove scene");
        this.huk.remove(paramk);
        i = 1;
      }
    }
    for (;;)
    {
      if ((this.huk.isEmpty()) && (this.huj.isEmpty())) {
        bxl();
      }
      for (boolean bool = true;; bool = false)
      {
        if ((i != 0) && (this.mIP != null)) {
          this.mIP.b(paramInt1, paramInt2, paramString, paramk, bool);
        }
        GMTrace.o(1437069213696L, 10707);
        return;
        w.i("MicroMsg.WalletNetSceneMgr", "do delay order query.break off!");
        GMTrace.o(1437069213696L, 10707);
        return;
        if (!this.huj.contains(paramk)) {
          break label219;
        }
        w.d("MicroMsg.WalletNetSceneMgr", "has find forcescenes ");
        if (!k(paramInt1, paramInt2, paramString, paramk))
        {
          this.huj.remove(paramk);
          w.i("MicroMsg.WalletNetSceneMgr", "Not need delay query order,remove scene");
          i = 1;
          break;
        }
        w.i("MicroMsg.WalletNetSceneMgr", "do delay order query.break off!");
        GMTrace.o(1437069213696L, 10707);
        return;
      }
      label219:
      i = 0;
    }
  }
  
  public final void a(com.tencent.mm.ad.k paramk, boolean paramBoolean)
  {
    GMTrace.i(1436129689600L, 10700);
    q(paramk);
    this.huj.add(paramk);
    if ((paramBoolean) && ((this.hul == null) || ((this.hul != null) && (!this.hul.isShowing()))))
    {
      if (this.hul != null) {
        this.hul.dismiss();
      }
      if (this.mContext == null)
      {
        w.w("MicroMsg.WalletNetSceneMgr", "activity has destroyed!!!");
        GMTrace.o(1436129689600L, 10700);
        return;
      }
      this.hul = g.a(this.mContext, false, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(1439350915072L, 10724);
          f.this.aMc();
          GMTrace.o(1439350915072L, 10724);
        }
      });
    }
    if ((r.hlg) && ((paramk instanceof com.tencent.mm.wallet_core.g.a.h)) && ((((com.tencent.mm.wallet_core.g.a.h)paramk).getUri().contains("authen")) || (((com.tencent.mm.wallet_core.g.a.h)paramk).getUri().contains("verify")))) {
      ((com.tencent.mm.wallet_core.g.a.h)paramk).cme();
    }
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(paramk, 0);
    GMTrace.o(1436129689600L, 10700);
  }
  
  public final void a(com.tencent.mm.ad.k paramk, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(19128173723648L, 142516);
    w.d("MicroMsg.WalletNetSceneMgr", "isShowProgress " + paramBoolean);
    q(paramk);
    this.huk.add(paramk);
    if ((paramBoolean) && ((this.hul == null) || ((this.hul != null) && (!this.hul.isShowing()))))
    {
      if (this.hul != null) {
        this.hul.dismiss();
      }
      if (this.mContext == null)
      {
        w.w("MicroMsg.WalletNetSceneMgr", "activity has destroyed!!!");
        GMTrace.o(19128173723648L, 142516);
        return;
      }
      if (paramInt != 1) {
        break label162;
      }
      this.hul = g.a(this.mContext, false, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(1437740302336L, 10712);
          if ((f.this.hul != null) && (f.this.huj.isEmpty()))
          {
            f.this.hul.dismiss();
            paramAnonymousDialogInterface = f.this.huk.iterator();
            while (paramAnonymousDialogInterface.hasNext())
            {
              com.tencent.mm.ad.k localk = (com.tencent.mm.ad.k)paramAnonymousDialogInterface.next();
              com.tencent.mm.kernel.h.xz();
              com.tencent.mm.kernel.h.xx().fYr.c(localk);
            }
            f.this.huk.clear();
          }
          GMTrace.o(1437740302336L, 10712);
        }
      });
    }
    for (;;)
    {
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a(paramk, 0);
      GMTrace.o(19128173723648L, 142516);
      return;
      label162:
      if (paramInt == 2)
      {
        this.hul = g.a(this.mContext, this.mContext.getString(a.i.teF), false, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(1440693092352L, 10734);
            if ((f.this.hul != null) && (f.this.huj.isEmpty()))
            {
              f.this.hul.dismiss();
              paramAnonymousDialogInterface = f.this.huk.iterator();
              while (paramAnonymousDialogInterface.hasNext())
              {
                com.tencent.mm.ad.k localk = (com.tencent.mm.ad.k)paramAnonymousDialogInterface.next();
                com.tencent.mm.kernel.h.xz();
                com.tencent.mm.kernel.h.xx().fYr.c(localk);
              }
              f.this.huk.clear();
            }
            GMTrace.o(1440693092352L, 10734);
          }
        });
      }
      else if (paramInt == 3)
      {
        this.hul = g.b(this.mContext, "验证中", new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(1439619350528L, 10726);
            if ((f.this.hul != null) && (f.this.huj.isEmpty()))
            {
              f.this.hul.dismiss();
              paramAnonymousDialogInterface = f.this.huk.iterator();
              while (paramAnonymousDialogInterface.hasNext())
              {
                com.tencent.mm.ad.k localk = (com.tencent.mm.ad.k)paramAnonymousDialogInterface.next();
                com.tencent.mm.kernel.h.xz();
                com.tencent.mm.kernel.h.xx().fYr.c(localk);
              }
              f.this.huk.clear();
            }
            GMTrace.o(1439619350528L, 10726);
          }
        });
      }
      else
      {
        w.i("MicroMsg.WalletNetSceneMgr", "unknown dialog type: %d", new Object[] { Integer.valueOf(paramInt) });
        this.hul = g.a(this.mContext, false, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(19128039505920L, 142515);
            if ((f.this.hul != null) && (f.this.huj.isEmpty()))
            {
              f.this.hul.dismiss();
              paramAnonymousDialogInterface = f.this.huk.iterator();
              while (paramAnonymousDialogInterface.hasNext())
              {
                com.tencent.mm.ad.k localk = (com.tencent.mm.ad.k)paramAnonymousDialogInterface.next();
                com.tencent.mm.kernel.h.xz();
                com.tencent.mm.kernel.h.xx().fYr.c(localk);
              }
              f.this.huk.clear();
            }
            GMTrace.o(19128039505920L, 142515);
          }
        });
      }
    }
  }
  
  public final void aMc()
  {
    GMTrace.i(1436398125056L, 10702);
    if (this.hul != null)
    {
      this.hul.dismiss();
      this.hul = null;
    }
    Iterator localIterator = this.huj.iterator();
    com.tencent.mm.ad.k localk;
    while (localIterator.hasNext())
    {
      localk = (com.tencent.mm.ad.k)localIterator.next();
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.c(localk);
    }
    localIterator = this.huk.iterator();
    while (localIterator.hasNext())
    {
      localk = (com.tencent.mm.ad.k)localIterator.next();
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.c(localk);
    }
    this.huj.clear();
    this.huk.clear();
    GMTrace.o(1436398125056L, 10702);
  }
  
  public final boolean aMd()
  {
    GMTrace.i(1437337649152L, 10709);
    if ((this.huk.isEmpty()) && (this.huj.isEmpty()))
    {
      GMTrace.o(1437337649152L, 10709);
      return false;
    }
    GMTrace.o(1437337649152L, 10709);
    return true;
  }
  
  public final void aMe()
  {
    GMTrace.i(1436800778240L, 10705);
    bxl();
    GMTrace.o(1436800778240L, 10705);
  }
  
  public final void bxl()
  {
    GMTrace.i(1437203431424L, 10708);
    if (this.hul != null)
    {
      this.hul.dismiss();
      this.hul = null;
    }
    GMTrace.o(1437203431424L, 10708);
  }
  
  public final void hN(int paramInt)
  {
    GMTrace.i(1436532342784L, 10703);
    this.huz.add(Integer.valueOf(paramInt));
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(paramInt, this);
    GMTrace.o(1436532342784L, 10703);
  }
  
  public final void hO(int paramInt)
  {
    GMTrace.i(1436666560512L, 10704);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(paramInt, this);
    this.huz.remove(Integer.valueOf(paramInt));
    if (this.huz.isEmpty())
    {
      aMc();
      this.mIP = null;
      this.mContext = null;
    }
    GMTrace.o(1436666560512L, 10704);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\d\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */