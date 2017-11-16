package com.tencent.mm.plugin.wallet_ecard.b;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_core.c.l;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI;
import com.tencent.mm.plugin.wallet_ecard.a.c;
import com.tencent.mm.plugin.wallet_ecard.a.e;
import com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI;
import com.tencent.mm.plugin.wallet_ecard.ui.WalletECardCheckOtherCardUI;
import com.tencent.mm.plugin.wallet_ecard.ui.WalletECardElementInputUI;
import com.tencent.mm.plugin.wallet_ecard.ui.WalletECardFinishUI;
import com.tencent.mm.plugin.wallet_ecard.ui.WalletOpenECardProxyUI;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.arl;
import com.tencent.mm.protocal.c.arn;
import com.tencent.mm.protocal.c.arq;
import com.tencent.mm.protocal.c.en;
import com.tencent.mm.protocal.c.gc;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.d.f;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class a
  extends com.tencent.mm.wallet_core.b
{
  public a()
  {
    GMTrace.i(19572031750144L, 145823);
    GMTrace.o(19572031750144L, 145823);
  }
  
  public final com.tencent.mm.wallet_core.b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(19572165967872L, 145824);
    c(paramActivity, WalletOpenECardProxyUI.class, paramBundle);
    w.i("MicroMsg.OpenECardProcess", "start open ecard: %s", new Object[] { Integer.valueOf(bAe()) });
    GMTrace.o(19572165967872L, 145824);
    return this;
  }
  
  public final com.tencent.mm.wallet_core.d.d a(MMActivity paramMMActivity, f paramf)
  {
    GMTrace.i(19573508145152L, 145834);
    if ((paramMMActivity instanceof WalletCheckPwdUI))
    {
      paramMMActivity = new b(paramMMActivity, paramf);
      GMTrace.o(19573508145152L, 145834);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletVerifyCodeUI))
    {
      paramMMActivity = new e(paramMMActivity, paramf);
      GMTrace.o(19573508145152L, 145834);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletECardBindCardListUI))
    {
      paramMMActivity = new c(paramMMActivity, paramf);
      GMTrace.o(19573508145152L, 145834);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletECardCheckOtherCardUI))
    {
      paramMMActivity = new a(paramMMActivity, paramf);
      GMTrace.o(19573508145152L, 145834);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletECardElementInputUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf);
      GMTrace.o(19573508145152L, 145834);
      return paramMMActivity;
    }
    paramMMActivity = super.a(paramMMActivity, paramf);
    GMTrace.o(19573508145152L, 145834);
    return paramMMActivity;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(19572300185600L, 145825);
    if ((paramActivity instanceof WalletCheckPwdUI))
    {
      c(paramActivity, WalletECardBindCardListUI.class, null);
      GMTrace.o(19572300185600L, 145825);
      return;
    }
    if ((paramActivity instanceof WalletECardBindCardListUI))
    {
      if (this.ler.getInt(com.tencent.mm.plugin.wallet_ecard.a.a.rrf, com.tencent.mm.plugin.wallet_ecard.a.a.rrs) == com.tencent.mm.plugin.wallet_ecard.a.a.rrs)
      {
        if (paramBundle.getBoolean(com.tencent.mm.plugin.wallet_ecard.a.a.rro))
        {
          paramBundle.putBoolean("key_need_confirm_finish", true);
          b(paramActivity, WalletVerifyCodeUI.class, paramBundle);
          GMTrace.o(19572300185600L, 145825);
          return;
        }
        c(paramActivity, WalletECardFinishUI.class, null);
        GMTrace.o(19572300185600L, 145825);
        return;
      }
      c(paramActivity, WalletECardCheckOtherCardUI.class, null);
      GMTrace.o(19572300185600L, 145825);
      return;
    }
    if (!(paramActivity instanceof WalletVerifyCodeUI)) {
      if ((paramActivity instanceof WalletECardCheckOtherCardUI))
      {
        boolean bool1 = paramBundle.getBoolean(com.tencent.mm.plugin.wallet_ecard.a.a.rrp, false);
        boolean bool2 = paramBundle.getBoolean(com.tencent.mm.plugin.wallet_ecard.a.a.rro);
        w.i("MicroMsg.OpenECardProcess", "input card elem: %s, verify sms: %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        if (bool1)
        {
          c(paramActivity, WalletECardElementInputUI.class, null);
          GMTrace.o(19572300185600L, 145825);
          return;
        }
        if (bool2)
        {
          paramBundle.putBoolean("key_need_confirm_finish", true);
          b(paramActivity, WalletVerifyCodeUI.class, paramBundle);
          GMTrace.o(19572300185600L, 145825);
        }
      }
      else
      {
        if (!(paramActivity instanceof WalletECardElementInputUI)) {
          break label286;
        }
        if (paramBundle.getBoolean(com.tencent.mm.plugin.wallet_ecard.a.a.rro))
        {
          paramBundle.putBoolean("key_need_confirm_finish", true);
          b(paramActivity, WalletVerifyCodeUI.class, paramBundle);
          GMTrace.o(19572300185600L, 145825);
          return;
        }
      }
    }
    c(paramActivity, WalletECardFinishUI.class, null);
    label286:
    GMTrace.o(19572300185600L, 145825);
  }
  
  public final String aAd()
  {
    GMTrace.i(19572837056512L, 145829);
    GMTrace.o(19572837056512L, 145829);
    return "OpenECardProcess";
  }
  
  public final int b(MMActivity paramMMActivity, int paramInt)
  {
    GMTrace.i(19572971274240L, 145830);
    paramInt = a.i.sTl;
    GMTrace.o(19572971274240L, 145830);
    return paramInt;
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(19572568621056L, 145827);
    w.i("MicroMsg.OpenECardProcess", "end process: %s", new Object[] { paramActivity });
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    paramBundle = new Intent(paramActivity, WalletOpenECardProxyUI.class);
    paramBundle.putExtras(localBundle);
    a(paramActivity, WalletOpenECardProxyUI.class, localBundle.getInt("key_process_result_code", -1), paramBundle, true);
    GMTrace.o(19572568621056L, 145827);
  }
  
  public final String bAd()
  {
    GMTrace.i(19573239709696L, 145832);
    String str = this.ler.getString(com.tencent.mm.plugin.wallet_ecard.a.a.rre);
    GMTrace.o(19573239709696L, 145832);
    return str;
  }
  
  public final int bAe()
  {
    GMTrace.i(19573373927424L, 145833);
    int i = this.ler.getInt(com.tencent.mm.plugin.wallet_ecard.a.a.rrd);
    GMTrace.o(19573373927424L, 145833);
    return i;
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(19572434403328L, 145826);
    if (paramInt == 100)
    {
      w.i("MicroMsg.OpenECardProcess", "back to card list");
      paramInt = bAe();
      String str1 = bAd();
      String str2 = (String)this.ler.get("key_pwd1");
      this.ler.clear();
      this.ler.putInt(com.tencent.mm.plugin.wallet_ecard.a.a.rrd, paramInt);
      this.ler.putString(com.tencent.mm.plugin.wallet_ecard.a.a.rre, str1);
      this.ler.putString("key_pwd1", str2);
      a(paramActivity, WalletECardBindCardListUI.class, 0);
      GMTrace.o(19572434403328L, 145826);
      return;
    }
    if ((paramActivity instanceof WalletVerifyCodeUI))
    {
      if (this.ler.getInt(com.tencent.mm.plugin.wallet_ecard.a.a.rrf) == com.tencent.mm.plugin.wallet_ecard.a.a.rrs)
      {
        a(paramActivity, WalletECardBindCardListUI.class, 0);
        GMTrace.o(19572434403328L, 145826);
        return;
      }
      a(paramActivity, WalletECardCheckOtherCardUI.class, 0);
    }
    GMTrace.o(19572434403328L, 145826);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(19572702838784L, 145828);
    GMTrace.o(19572702838784L, 145828);
    return false;
  }
  
  public final boolean g(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(19573105491968L, 145831);
    w.d("MicroMsg.OpenECardProcess", "intercept");
    paramBundle.putInt("key_process_result_code", 0);
    boolean bool = super.g(paramActivity, paramBundle);
    GMTrace.o(19573105491968L, 145831);
    return bool;
  }
  
  private final class a
    extends com.tencent.mm.wallet_core.d.d
  {
    public a(MMActivity paramMMActivity, f paramf)
    {
      super(paramf);
      GMTrace.i(19571629096960L, 145820);
      GMTrace.o(19571629096960L, 145820);
    }
    
    public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
    {
      GMTrace.i(19571897532416L, 145822);
      if ((paramk instanceof l))
      {
        paramk = (l)paramk;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramString = new Bundle();
          if ((paramk.rcv != null) && (paramk.rcv.rfS))
          {
            paramString = a.w(a.this).getString(com.tencent.mm.plugin.wallet_ecard.a.a.rrj);
            str = a.x(a.this).getString(com.tencent.mm.plugin.wallet_ecard.a.a.rrk);
            paramk = paramk.rcv.nDt;
            a.y(a.this).putString(com.tencent.mm.plugin.wallet_ecard.a.a.rrl, paramk);
            this.xDO.hN(1985);
            paramString = new com.tencent.mm.plugin.wallet_ecard.a.d("WEB_DEBIT", a.this.bAd(), paramString, str, paramk, a.this.bAe(), false);
            this.xDO.a(paramString, true);
          }
        }
      }
      while (!(paramk instanceof com.tencent.mm.plugin.wallet_ecard.a.d)) {
        for (;;)
        {
          String str;
          GMTrace.o(19571897532416L, 145822);
          return false;
          paramString.putBoolean(com.tencent.mm.plugin.wallet_ecard.a.a.rrp, true);
          a.this.a(this.xDN, 0, paramString);
          continue;
          w.w("MicroMsg.OpenECardProcess", "net error: %s", new Object[] { paramk });
          paramString = com.tencent.mm.plugin.wallet_ecard.a.b.c(this.xDN, new String[] { paramString });
          h.b(this.xDN, paramString, "", false);
        }
      }
      this.xDO.hO(1985);
      paramk = (com.tencent.mm.plugin.wallet_ecard.a.d)paramk;
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        if (paramk.rry.jzH == 0)
        {
          paramString = new Bundle();
          paramString.putBoolean(com.tencent.mm.plugin.wallet_ecard.a.a.rrp, false);
          if ((paramk.rry.tUo != null) && (!bg.nm(paramk.rry.tUo.title)))
          {
            w.i("MicroMsg.OpenECardProcess", "no need verify sms");
            paramString.putBoolean(com.tencent.mm.plugin.wallet_ecard.a.a.rro, false);
            a.z(a.this).putString(com.tencent.mm.plugin.wallet_ecard.a.a.rrr, paramk.rry.tUo.title);
            a.this.a(this.xDN, 0, paramString);
          }
        }
      }
      for (;;)
      {
        GMTrace.o(19571897532416L, 145822);
        return true;
        w.i("MicroMsg.OpenECardProcess", "need verfiy sms");
        paramString.putBoolean(com.tencent.mm.plugin.wallet_ecard.a.a.rro, true);
        paramString.putString(com.tencent.mm.plugin.wallet_ecard.a.a.rrm, paramk.rry.tUm);
        paramString.putString(com.tencent.mm.plugin.wallet_ecard.a.a.rrn, paramk.rry.uHJ);
        break;
        if ((!com.tencent.mm.plugin.wallet_ecard.a.b.a((WalletBaseUI)this.xDN, paramk.rry.tUn)) && (!com.tencent.mm.plugin.wallet_ecard.a.b.a((WalletBaseUI)this.xDN, paramk, paramk.jWs, paramk.jWt, paramk.rry.jzH, paramk.rry.jzI)))
        {
          paramString = com.tencent.mm.plugin.wallet_ecard.a.b.c(this.xDN, new String[] { paramk.rry.jzI, paramk.jWt, paramString });
          h.b(this.xDN, paramString, "", false);
          continue;
          w.w("MicroMsg.OpenECardProcess", "net error: %s", new Object[] { paramk });
          paramString = com.tencent.mm.plugin.wallet_ecard.a.b.c(this.xDN, new String[] { paramString });
          h.b(this.xDN, paramString, "", false);
        }
      }
    }
    
    public final boolean j(Object... paramVarArgs)
    {
      GMTrace.i(19571763314688L, 145821);
      String str = (String)paramVarArgs[0];
      paramVarArgs = (String)paramVarArgs[1];
      a.u(a.this).putString(com.tencent.mm.plugin.wallet_ecard.a.a.rrj, str);
      a.v(a.this).putString(com.tencent.mm.plugin.wallet_ecard.a.a.rrk, paramVarArgs);
      paramVarArgs = new l("", str, null);
      this.xDO.a(paramVarArgs, true);
      GMTrace.o(19571763314688L, 145821);
      return true;
    }
  }
  
  private final class b
    extends com.tencent.mm.wallet_core.d.d
  {
    public b(MMActivity paramMMActivity, f paramf)
    {
      super(paramf);
      GMTrace.i(19571092226048L, 145816);
      GMTrace.o(19571092226048L, 145816);
    }
    
    public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
    {
      GMTrace.i(19571360661504L, 145818);
      if ((paramk instanceof e))
      {
        this.xDO.hO(1958);
        paramk = (e)paramk;
        if ((paramInt1 == 0) && (paramInt2 == 0)) {
          if (paramk.rrC.jzH == 0)
          {
            paramString = new Bundle();
            w.i("MicroMsg.OpenECardProcess", "req_serial: %s", new Object[] { paramk.rrC.tUl });
            a.c(a.this).putString(com.tencent.mm.plugin.wallet_ecard.a.a.rre, paramk.rrC.tUl);
            a.this.a(this.xDN, 0, paramString);
          }
        }
        for (;;)
        {
          GMTrace.o(19571360661504L, 145818);
          return true;
          if ((!com.tencent.mm.plugin.wallet_ecard.a.b.a((WalletBaseUI)this.xDN, paramk.rrC.tUn)) && (!com.tencent.mm.plugin.wallet_ecard.a.b.a((WalletBaseUI)this.xDN, paramk, paramk.jWs, paramk.jWt, paramk.rrC.jzH, paramk.rrC.jzI)))
          {
            paramString = com.tencent.mm.plugin.wallet_ecard.a.b.c(this.xDN, new String[] { paramk.rrC.jzI, paramk.jWt, paramString });
            h.a(this.xDN, paramString, "", false, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(19577668894720L, 145865);
                a.this.b(a.b.this.xDN, null);
                GMTrace.o(19577668894720L, 145865);
              }
            });
            continue;
            w.w("MicroMsg.OpenECardProcess", "net error: %s", new Object[] { paramk });
            paramString = com.tencent.mm.plugin.wallet_ecard.a.b.c(this.xDN, new String[] { paramString });
            h.a(this.xDN, paramString, "", false, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(19577937330176L, 145867);
                a.this.b(a.b.this.xDN, null);
                GMTrace.o(19577937330176L, 145867);
              }
            });
          }
        }
      }
      GMTrace.o(19571360661504L, 145818);
      return false;
    }
    
    public final boolean j(Object... paramVarArgs)
    {
      GMTrace.i(19571226443776L, 145817);
      paramVarArgs = (String)paramVarArgs[0];
      int i = a.a(a.this).getInt(com.tencent.mm.plugin.wallet_ecard.a.a.rrd);
      this.xDO.hN(1958);
      e locale = new e("WEB_DEBIT", paramVarArgs, i);
      this.xDO.a(locale, true);
      a.b(a.this).putString("key_pwd1", paramVarArgs);
      GMTrace.o(19571226443776L, 145817);
      return true;
    }
    
    public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
    {
      GMTrace.i(19571494879232L, 145819);
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      w.i("MicroMsg.OpenECardProcess", "reqCode: %s, resCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      paramIntent = new Bundle();
      paramIntent.putInt("key_process_result_code", 0);
      a.this.b(this.xDN, paramIntent);
      GMTrace.o(19571494879232L, 145819);
    }
  }
  
  private final class c
    extends com.tencent.mm.wallet_core.d.d
  {
    public c(MMActivity paramMMActivity, f paramf)
    {
      super(paramf);
      GMTrace.i(19578071547904L, 145868);
      GMTrace.o(19578071547904L, 145868);
    }
    
    public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
    {
      GMTrace.i(19578339983360L, 145870);
      if ((paramk instanceof com.tencent.mm.plugin.wallet_ecard.a.d))
      {
        this.xDO.hO(1985);
        paramk = (com.tencent.mm.plugin.wallet_ecard.a.d)paramk;
        if ((paramInt1 == 0) && (paramInt2 == 0)) {
          if (paramk.rry.jzH == 0)
          {
            a.e(a.this).putInt(com.tencent.mm.plugin.wallet_ecard.a.a.rrf, com.tencent.mm.plugin.wallet_ecard.a.a.rrs);
            a.f(a.this).putString(com.tencent.mm.plugin.wallet_ecard.a.a.rrg, paramk.rrz);
            a.g(a.this).putString(com.tencent.mm.plugin.wallet_ecard.a.a.rrh, paramk.rrA);
            a.h(a.this).putString(com.tencent.mm.plugin.wallet_ecard.a.a.rri, paramk.rrB);
            paramString = new Bundle();
            if ((paramk.rry.tUo != null) && (!bg.nm(paramk.rry.tUo.title)))
            {
              w.i("MicroMsg.OpenECardProcess", "no need verify sms");
              paramString.putBoolean(com.tencent.mm.plugin.wallet_ecard.a.a.rro, false);
              a.i(a.this).putString(com.tencent.mm.plugin.wallet_ecard.a.a.rrr, paramk.rry.tUo.title);
              a.this.a(this.xDN, 0, paramString);
            }
          }
        }
        for (;;)
        {
          GMTrace.o(19578339983360L, 145870);
          return true;
          w.i("MicroMsg.OpenECardProcess", "need verfiy sms");
          paramString.putBoolean(com.tencent.mm.plugin.wallet_ecard.a.a.rro, true);
          paramString.putString(com.tencent.mm.plugin.wallet_ecard.a.a.rrm, paramk.rry.tUm);
          paramString.putString(com.tencent.mm.plugin.wallet_ecard.a.a.rrn, paramk.rry.uHJ);
          break;
          if ((!com.tencent.mm.plugin.wallet_ecard.a.b.a((WalletBaseUI)this.xDN, paramk.rry.tUn)) && (!com.tencent.mm.plugin.wallet_ecard.a.b.a((WalletBaseUI)this.xDN, paramk, paramk.jWs, paramk.jWt, paramk.rry.jzH, paramk.rry.jzI)))
          {
            paramString = com.tencent.mm.plugin.wallet_ecard.a.b.c(this.xDN, new String[] { paramk.rry.jzI, paramk.jWt, paramString });
            h.b(this.xDN, paramString, "", false);
            continue;
            w.w("MicroMsg.OpenECardProcess", "net error: %s", new Object[] { paramk });
            paramString = com.tencent.mm.plugin.wallet_ecard.a.b.c(this.xDN, new String[] { paramString });
            h.b(this.xDN, paramString, "", false);
          }
        }
      }
      GMTrace.o(19578339983360L, 145870);
      return false;
    }
    
    public final boolean j(Object... paramVarArgs)
    {
      GMTrace.i(19578205765632L, 145869);
      paramVarArgs = (en)paramVarArgs[0];
      String str = a.d(a.this).getString(com.tencent.mm.plugin.wallet_ecard.a.a.rre, "");
      if (paramVarArgs == null)
      {
        w.w("MicroMsg.OpenECardProcess", "empty bank item");
        GMTrace.o(19578205765632L, 145869);
        return false;
      }
      this.xDO.hN(1985);
      paramVarArgs = new com.tencent.mm.plugin.wallet_ecard.a.d("WEB_DEBIT", str, paramVarArgs.tTp, paramVarArgs.rcs, paramVarArgs.nDt, a.this.bAe(), true);
      this.xDO.a(paramVarArgs, true);
      GMTrace.o(19578205765632L, 145869);
      return true;
    }
  }
  
  private final class d
    extends com.tencent.mm.wallet_core.d.d
  {
    public d(MMActivity paramMMActivity, f paramf)
    {
      super(paramf);
      GMTrace.i(19570689572864L, 145813);
      GMTrace.o(19570689572864L, 145813);
    }
    
    public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
    {
      GMTrace.i(19570958008320L, 145815);
      if ((paramk instanceof com.tencent.mm.plugin.wallet_ecard.a.d))
      {
        this.xDO.hO(1985);
        paramk = (com.tencent.mm.plugin.wallet_ecard.a.d)paramk;
        if ((paramInt1 == 0) && (paramInt2 == 0)) {
          if (paramk.rry.jzH == 0)
          {
            paramString = new Bundle();
            if ((paramk.rry.tUo != null) && (!bg.nm(paramk.rry.tUo.title)))
            {
              w.i("MicroMsg.OpenECardProcess", "no need verify sms");
              paramString.putBoolean(com.tencent.mm.plugin.wallet_ecard.a.a.rro, false);
              a.C(a.this).putString(com.tencent.mm.plugin.wallet_ecard.a.a.rrr, paramk.rry.tUo.title);
              a.this.a(this.xDN, 0, paramString);
            }
          }
        }
        for (;;)
        {
          GMTrace.o(19570958008320L, 145815);
          return true;
          w.i("MicroMsg.OpenECardProcess", "need verfiy sms");
          paramString.putBoolean(com.tencent.mm.plugin.wallet_ecard.a.a.rro, true);
          paramString.putString(com.tencent.mm.plugin.wallet_ecard.a.a.rrm, paramk.rry.tUm);
          paramString.putString(com.tencent.mm.plugin.wallet_ecard.a.a.rrn, paramk.rry.uHJ);
          break;
          if ((!com.tencent.mm.plugin.wallet_ecard.a.b.a((WalletBaseUI)this.xDN, paramk.rry.tUn)) && (!com.tencent.mm.plugin.wallet_ecard.a.b.a((WalletBaseUI)this.xDN, paramk, paramk.jWs, paramk.jWt, paramk.rry.jzH, paramk.rry.jzI)))
          {
            paramString = com.tencent.mm.plugin.wallet_ecard.a.b.c(this.xDN, new String[] { paramk.rry.jzI, paramk.jWt, paramString });
            h.b(this.xDN, paramString, "", false);
            continue;
            w.w("MicroMsg.OpenECardProcess", "net error: %s", new Object[] { paramk });
            paramString = com.tencent.mm.plugin.wallet_ecard.a.b.c(this.xDN, new String[] { paramString });
            h.b(this.xDN, paramString, "", false);
          }
        }
      }
      GMTrace.o(19570958008320L, 145815);
      return false;
    }
    
    public final boolean j(Object... paramVarArgs)
    {
      GMTrace.i(19570823790592L, 145814);
      paramVarArgs = ((ElementQuery)paramVarArgs[0]).nDt;
      String str1 = a.A(a.this).getString(com.tencent.mm.plugin.wallet_ecard.a.a.rrj);
      String str2 = a.B(a.this).getString(com.tencent.mm.plugin.wallet_ecard.a.a.rrk);
      this.xDO.hN(1985);
      paramVarArgs = new com.tencent.mm.plugin.wallet_ecard.a.d("WEB_DEBIT", a.this.bAd(), str1, str2, paramVarArgs, a.this.bAe(), false);
      this.xDO.a(paramVarArgs, true);
      GMTrace.o(19570823790592L, 145814);
      return true;
    }
  }
  
  private final class e
    extends com.tencent.mm.wallet_core.d.d
  {
    public e(MMActivity paramMMActivity, f paramf)
    {
      super(paramf);
      GMTrace.i(19569884266496L, 145807);
      GMTrace.o(19569884266496L, 145807);
    }
    
    public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
    {
      GMTrace.i(19570421137408L, 145811);
      if ((paramk instanceof c))
      {
        this.xDO.hO(1986);
        paramk = (c)paramk;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          if (paramk.rrx.jzH != 0) {
            break label160;
          }
          paramString = new Bundle();
          if ((paramk.rrx.tUo != null) && (!bg.nm(paramk.rrx.tUo.title)))
          {
            w.i("MicroMsg.OpenECardProcess", "succ title: %s", new Object[] { paramk.rrx.tUo.title });
            a.t(a.this).putString(com.tencent.mm.plugin.wallet_ecard.a.a.rrr, paramk.rrx.tUo.title);
          }
          a.this.a(this.xDN, 0, paramString);
        }
        for (;;)
        {
          GMTrace.o(19570421137408L, 145811);
          return true;
          label160:
          if (!com.tencent.mm.plugin.wallet_ecard.a.b.a((WalletBaseUI)this.xDN, paramk.rrx.tUn))
          {
            paramString = com.tencent.mm.plugin.wallet_ecard.a.b.c(this.xDN, new String[] { paramk.rrx.jzI, paramString });
            h.b(this.xDN, paramString, "", false);
          }
        }
      }
      if ((paramk instanceof com.tencent.mm.plugin.wallet_ecard.a.d))
      {
        this.xDO.hO(1985);
        paramk = (com.tencent.mm.plugin.wallet_ecard.a.d)paramk;
        if ((paramInt1 == 0) && (paramInt2 == 0)) {
          if (paramk.rry.jzH == 0) {
            this.xDN.getIntent().putExtra(com.tencent.mm.plugin.wallet_ecard.a.a.rrm, paramk.rry.tUm);
          }
        }
        for (;;)
        {
          GMTrace.o(19570421137408L, 145811);
          return true;
          if ((!com.tencent.mm.plugin.wallet_ecard.a.b.a((WalletBaseUI)this.xDN, paramk.rry.tUn)) && (!com.tencent.mm.plugin.wallet_ecard.a.b.a((WalletBaseUI)this.xDN, paramk, paramk.jWs, paramk.jWt, paramk.rry.jzH, paramk.rry.jzI)))
          {
            paramString = com.tencent.mm.plugin.wallet_ecard.a.b.c(this.xDN, new String[] { paramk.rry.jzI, paramk.jWt, paramString });
            h.b(this.xDN, paramString, "", false);
            continue;
            w.w("MicroMsg.OpenECardProcess", "net error: %s", new Object[] { paramk });
            paramString = com.tencent.mm.plugin.wallet_ecard.a.b.c(this.xDN, new String[] { paramString });
            h.b(this.xDN, paramString, "", false);
          }
        }
      }
      GMTrace.o(19570421137408L, 145811);
      return false;
    }
    
    public final boolean j(Object... paramVarArgs)
    {
      GMTrace.i(19570286919680L, 145810);
      a.q(a.this).getString("key_pwd1");
      paramVarArgs = a.r(a.this).getString("key_verify_code");
      String str = a.this.bAd();
      int i = a.s(a.this).getInt(com.tencent.mm.plugin.wallet_ecard.a.a.rrd);
      paramVarArgs = new c("WEB_DEBIT", str, paramVarArgs, this.xDN.getIntent().getStringExtra(com.tencent.mm.plugin.wallet_ecard.a.a.rrm), i);
      this.xDO.hN(1986);
      this.xDO.a(paramVarArgs, true, 3);
      GMTrace.o(19570286919680L, 145810);
      return true;
    }
    
    public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
    {
      GMTrace.i(19570555355136L, 145812);
      w.i("MicroMsg.OpenECardProcess", "reqCode: %s, resCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      a.this.b(this.xDN, new Bundle());
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      GMTrace.o(19570555355136L, 145812);
    }
    
    public final boolean q(Object... paramVarArgs)
    {
      GMTrace.i(19570152701952L, 145809);
      int i = a.j(a.this).getInt(com.tencent.mm.plugin.wallet_ecard.a.a.rrf);
      paramVarArgs = a.this.bAd();
      w.i("MicroMsg.OpenECardProcess", "bind action: %s", new Object[] { Integer.valueOf(i) });
      if (i == com.tencent.mm.plugin.wallet_ecard.a.a.rrs) {}
      for (paramVarArgs = new com.tencent.mm.plugin.wallet_ecard.a.d("WEB_DEBIT", paramVarArgs, a.k(a.this).getString(com.tencent.mm.plugin.wallet_ecard.a.a.rrg), a.l(a.this).getString(com.tencent.mm.plugin.wallet_ecard.a.a.rrh), a.m(a.this).getString(com.tencent.mm.plugin.wallet_ecard.a.a.rri), a.this.bAe(), true, true);; paramVarArgs = new com.tencent.mm.plugin.wallet_ecard.a.d("WEB_DEBIT", paramVarArgs, a.n(a.this).getString(com.tencent.mm.plugin.wallet_ecard.a.a.rrj), a.o(a.this).getString(com.tencent.mm.plugin.wallet_ecard.a.a.rrk), a.p(a.this).getString(com.tencent.mm.plugin.wallet_ecard.a.a.rrl), a.this.bAe(), false, true))
      {
        this.xDO.hN(1985);
        this.xDO.a(paramVarArgs, true);
        GMTrace.o(19570152701952L, 145809);
        return true;
      }
    }
    
    public final CharSequence se(int paramInt)
    {
      GMTrace.i(19570018484224L, 145808);
      String str = this.xDN.getIntent().getStringExtra(com.tencent.mm.plugin.wallet_ecard.a.a.rrn);
      GMTrace.o(19570018484224L, 145808);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_ecard\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */