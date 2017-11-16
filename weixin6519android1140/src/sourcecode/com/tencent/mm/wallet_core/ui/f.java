package com.tencent.mm.wallet_core.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.e.a.b;
import com.tencent.mm.wallet_core.g.a.l;

public final class f
{
  private static int kwP;
  private static int kxb;
  private static String kxc;
  
  static
  {
    GMTrace.i(1504714948608L, 11211);
    kxb = 0;
    kwP = 0;
    kxc = null;
    GMTrace.o(1504714948608L, 11211);
  }
  
  public static void a(final WalletBaseUI paramWalletBaseUI, int paramInt1, int paramInt2, String paramString, k paramk, boolean paramBoolean)
  {
    GMTrace.i(1504312295424L, 11208);
    String str = paramString;
    if (bg.nm(paramString)) {
      str = paramWalletBaseUI.getString(a.i.tgK);
    }
    boolean bool1 = true;
    if ((paramk instanceof com.tencent.mm.wallet_core.c.h)) {
      bool1 = ((com.tencent.mm.wallet_core.c.h)paramk).aVo();
    }
    if ((paramk instanceof com.tencent.mm.wallet_core.c.f)) {
      bool1 = ((com.tencent.mm.wallet_core.c.f)paramk).eUj;
    }
    for (;;)
    {
      w.i("MicroMsg.WalletDispatcher", "dispatch errType:%d errCode %s ,errMsg: %s, isBlock %s scene: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), str, Boolean.valueOf(bool1), paramk });
      boolean bool2;
      if ((!(paramk instanceof l)) && (!(paramk instanceof b)))
      {
        if (!(paramk instanceof com.tencent.mm.wallet_core.c.h)) {
          break label516;
        }
        paramString = (com.tencent.mm.wallet_core.c.h)paramk;
        if (paramString.xDl != null) {
          break label479;
        }
        bool2 = false;
        if (bool2)
        {
          w.d("MicroMsg.WalletDispatcher", "order pay end!!!");
          Bundle localBundle = paramWalletBaseUI.ui;
          localBundle.putInt("intent_pay_end_errcode", paramInt2);
          localBundle.putString("intent_pay_app_url", paramString.xDm);
          localBundle.putString("intent_wap_pay_jump_url", paramString.xDn);
          localBundle.putBoolean("intent_pay_end", true);
          a.j(paramWalletBaseUI, localBundle);
        }
        int j = 1;
        int i = j;
        if (bool1)
        {
          i = j;
          if (com.tencent.mm.wallet_core.d.e.a(paramWalletBaseUI, paramk, paramInt1, paramInt2, str)) {
            i = 0;
          }
        }
        if (i == 0) {
          break label506;
        }
        if (((paramWalletBaseUI.cmp() == null) || (!paramWalletBaseUI.cmq().d(paramInt1, paramInt2, str, paramk))) && (!paramWalletBaseUI.d(paramInt1, paramInt2, str, (com.tencent.mm.wallet_core.c.h)paramk)) && (bool1))
        {
          if ((paramInt1 == 0) && (paramInt2 == 0)) {
            break label496;
          }
          kxb = paramInt1;
          kwP = paramInt2;
          kxc = str;
          w.d("MicroMsg.WalletDispatcher", "wallet base consume this response in the end!");
        }
      }
      label322:
      if (paramBoolean)
      {
        w.d("MicroMsg.WalletDispatcher", "scenes & forcescenes isEmpty! %s", new Object[] { Boolean.valueOf(bool1) });
        if (kwP != 0)
        {
          w.e("MicroMsg.WalletDispatcher", "showAlert! mErrCode : " + kwP);
          if ((paramk instanceof com.tencent.mm.wallet_core.c.h))
          {
            paramString = ((com.tencent.mm.wallet_core.c.h)paramk).clH();
            if (!bg.nm(paramString))
            {
              w.i("MicroMsg.WalletDispatcher", "error_detail_url is not null ");
              com.tencent.mm.ui.base.h.a(paramWalletBaseUI.vKB.vKW, kxc, null, paramWalletBaseUI.getResources().getString(a.i.tbz), paramWalletBaseUI.getResources().getString(a.i.cTM), true, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  GMTrace.i(1461631057920L, 10890);
                  paramAnonymousDialogInterface = new Intent();
                  paramAnonymousDialogInterface.putExtra("rawUrl", this.xFb);
                  com.tencent.mm.bj.d.b(paramWalletBaseUI.vKB.vKW, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramAnonymousDialogInterface);
                  e.EQ(3);
                  f.c(paramWalletBaseUI);
                  GMTrace.o(1461631057920L, 10890);
                }
              }, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  GMTrace.i(1505788690432L, 11219);
                  f.c(this.xFa);
                  GMTrace.o(1505788690432L, 11219);
                }
              });
              e.EQ(4);
            }
          }
          for (paramInt1 = 1;; paramInt1 = 0)
          {
            if (paramInt1 == 0) {
              break label603;
            }
            GMTrace.o(1504312295424L, 11208);
            return;
            label479:
            bool2 = "1".equals(paramString.xDl.trim());
            break;
            label496:
            w.d("MicroMsg.WalletDispatcher", "wallet this response havn't error!");
            break label322;
            label506:
            w.d("MicroMsg.WalletDispatcher", "wallet base consume this response before subclass!");
            break label322;
            label516:
            if (((paramWalletBaseUI.cmp() != null) && (paramWalletBaseUI.cmq().d(paramInt1, paramInt2, str, paramk))) || (paramWalletBaseUI.d(paramInt1, paramInt2, str, paramk)) || (!bool1)) {
              break label322;
            }
            if ((paramInt1 != 0) || (paramInt2 != 0))
            {
              kxb = paramInt1;
              kwP = paramInt2;
              kxc = str;
              w.d("MicroMsg.WalletDispatcher", "wallet base consume this response in the end!");
              break label322;
            }
            w.d("MicroMsg.WalletDispatcher", "wallet other scene this response havn't error!");
            break label322;
          }
          label603:
          w.i("MicroMsg.WalletDispatcher", "error_detail_url is null ");
          com.tencent.mm.ui.base.h.a(paramWalletBaseUI.vKB.vKW, kxc, null, false, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(1468610379776L, 10942);
              f.c(this.xFa);
              GMTrace.o(1468610379776L, 10942);
            }
          });
          GMTrace.o(1504312295424L, 11208);
          return;
        }
        if (!paramWalletBaseUI.aNj()) {
          paramWalletBaseUI.sv(0);
        }
      }
      GMTrace.o(1504312295424L, 11208);
      return;
    }
  }
  
  public static void c(WalletBaseUI paramWalletBaseUI)
  {
    GMTrace.i(16013114474496L, 119307);
    if (kxb == 1000) {
      switch (kwP)
      {
      case 2: 
      default: 
        if ((paramWalletBaseUI.aNg()) || (paramWalletBaseUI.cml() != 0)) {
          paramWalletBaseUI.finish();
        }
        break;
      }
    }
    for (;;)
    {
      kxb = 0;
      kwP = 0;
      kxc = null;
      GMTrace.o(16013114474496L, 119307);
      return;
      a.c(paramWalletBaseUI.vKB.vKW, paramWalletBaseUI.ui, kwP);
      continue;
      if (!paramWalletBaseUI.aNj()) {
        paramWalletBaseUI.sv(0);
      }
      paramWalletBaseUI.so(0);
      continue;
      paramWalletBaseUI.so(0);
      continue;
      a.k(paramWalletBaseUI.vKB.vKW, kwP);
    }
  }
  
  public static void cmn()
  {
    GMTrace.i(1504446513152L, 11209);
    kxb = 0;
    kwP = 0;
    kxc = null;
    GMTrace.o(1504446513152L, 11209);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\ui\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */