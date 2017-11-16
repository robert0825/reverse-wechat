package com.tencent.mm.plugin.wallet_ecard.a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.atz;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.d.e;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public final class b
{
  public static void a(int paramInt, Context paramContext, com.tencent.mm.wallet_core.b.a parama)
  {
    GMTrace.i(19592164409344L, 145973);
    w.i("MicroMsg.ECardUtil", "start open ecard process， scene: %s", new Object[] { Integer.valueOf(paramInt) });
    Bundle localBundle = new Bundle();
    localBundle.putInt(a.rrd, paramInt);
    com.tencent.mm.wallet_core.a.a((Activity)paramContext, com.tencent.mm.plugin.wallet_ecard.b.a.class, localBundle, parama);
    GMTrace.o(19592164409344L, 145973);
  }
  
  public static boolean a(WalletBaseUI paramWalletBaseUI, k paramk, int paramInt1, String paramString1, int paramInt2, String paramString2)
  {
    GMTrace.i(19592030191616L, 145972);
    if (paramInt2 == 0) {}
    for (;;)
    {
      w.i("MicroMsg.ECardUtil", "finalRetCode: %s, finalRetMsg: %s", new Object[] { Integer.valueOf(paramInt1), paramString1 });
      boolean bool = e.a(paramWalletBaseUI, paramk, 1000, paramInt1, paramString1);
      GMTrace.o(19592030191616L, 145972);
      return bool;
      paramInt1 = paramInt2;
      paramString1 = paramString2;
    }
  }
  
  public static boolean a(final WalletBaseUI paramWalletBaseUI, atz paramatz)
  {
    GMTrace.i(19591761756160L, 145970);
    if (paramatz == null) {
      w.i("MicroMsg.ECardUtil", "no popItem");
    }
    do
    {
      do
      {
        GMTrace.o(19591761756160L, 145970);
        return false;
      } while (bg.nm(paramatz.uJs));
      if ((!bg.nm(paramatz.qYy)) && (!bg.nm(paramatz.uJt)))
      {
        w.i("MicroMsg.ECardUtil", "show guide info 1");
        h.a(paramWalletBaseUI, paramatz.uJs, "", paramatz.qYy, paramatz.uJt, false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(19592432844800L, 145975);
            WalletBaseUI localWalletBaseUI;
            String str;
            Object localObject;
            if (!bg.nm(this.rru.uga))
            {
              localWalletBaseUI = paramWalletBaseUI;
              str = this.rru.uga;
              localObject = this.rrw;
              w.i("MicroMsg.ECardUtil", "url: %s", new Object[] { str });
              if (!bg.nm(str))
              {
                if (!str.startsWith("native.")) {
                  break label152;
                }
                w.i("MicroMsg.ECardUtil", "goto native");
                if (((localObject != null) && (((b.a)localObject).bAc())) || (str.equals("native.qryacctdesc")) || (str.equals("native.openecardauth")) || (str.equals("native.cancloseecard")) || (!str.equals("native.withdraw"))) {}
              }
            }
            for (;;)
            {
              paramAnonymousDialogInterface.dismiss();
              GMTrace.o(19592432844800L, 145975);
              return;
              label152:
              w.d("MicroMsg.ECardUtil", "url: %s", new Object[] { str });
              localObject = new Intent();
              ((Intent)localObject).putExtra("rawUrl", str);
              ((Intent)localObject).putExtra("showShare", false);
              d.b(localWalletBaseUI, "webview", ".ui.tools.WebViewUI", (Intent)localObject);
            }
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(19590553796608L, 145961);
            com.tencent.mm.wallet_core.b localb;
            if (this.rru.uJu == a.rqZ)
            {
              w.i("MicroMsg.ECardUtil", "do end process");
              localb = paramWalletBaseUI.cmp();
              if (localb != null) {
                localb.b(paramWalletBaseUI, new Bundle());
              }
            }
            for (;;)
            {
              paramAnonymousDialogInterface.dismiss();
              GMTrace.o(19590553796608L, 145961);
              return;
              paramWalletBaseUI.finish();
              continue;
              if (this.rru.uJu == a.rrc)
              {
                w.i("MicroMsg.ECardUtil", "back bank list");
                localb = paramWalletBaseUI.cmp();
                if (localb != null) {
                  localb.c(paramWalletBaseUI, 100);
                } else {
                  paramWalletBaseUI.finish();
                }
              }
            }
          }
        });
        GMTrace.o(19591761756160L, 145970);
        return true;
      }
    } while (bg.nm(paramatz.uJt));
    w.i("MicroMsg.ECardUtil", "show guide info 2");
    h.a(paramWalletBaseUI, paramatz.uJs, "", paramatz.uJt, false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(19591493320704L, 145968);
        com.tencent.mm.wallet_core.b localb;
        if (this.rru.uJu == a.rqZ)
        {
          w.i("MicroMsg.ECardUtil", "do end process");
          localb = paramWalletBaseUI.cmp();
          if (localb != null) {
            localb.b(paramWalletBaseUI, new Bundle());
          }
        }
        for (;;)
        {
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(19591493320704L, 145968);
          return;
          paramWalletBaseUI.finish();
          continue;
          if (this.rru.uJu == a.rrc)
          {
            w.i("MicroMsg.ECardUtil", "back bank list");
            localb = paramWalletBaseUI.cmp();
            if (localb != null) {
              localb.c(paramWalletBaseUI, 100);
            } else {
              paramWalletBaseUI.finish();
            }
          }
        }
      }
    });
    GMTrace.o(19591761756160L, 145970);
    return true;
  }
  
  public static String c(Context paramContext, String... paramVarArgs)
  {
    GMTrace.i(19591895973888L, 145971);
    paramContext = paramContext.getString(a.i.tgK);
    int i;
    if (paramVarArgs.length > 0)
    {
      int j = paramVarArgs.length;
      i = 0;
      if (i < j)
      {
        String str = paramVarArgs[i];
        if (!bg.nm(str)) {
          paramContext = str;
        }
      }
    }
    for (;;)
    {
      GMTrace.o(19591895973888L, 145971);
      return paramContext;
      i += 1;
      break;
    }
  }
  
  public static abstract interface a
  {
    public abstract boolean bAc();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_ecard\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */