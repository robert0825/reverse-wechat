package com.tencent.mm.plugin.ab.a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.n;
import com.tencent.mm.az.e;
import com.tencent.mm.g.a.gt;
import com.tencent.mm.g.a.gt.b;
import com.tencent.mm.g.a.kt;
import com.tencent.mm.g.a.og;
import com.tencent.mm.g.a.y;
import com.tencent.mm.modelsimple.l;
import com.tencent.mm.modelsimple.z;
import com.tencent.mm.plugin.scanner.ui.ProductUI;
import com.tencent.mm.plugin.scanner.ui.VcardContactUI;
import com.tencent.mm.plugin.scanner.util.p.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.wallet.g;
import com.tencent.mm.protocal.c.ahp;
import com.tencent.mm.protocal.c.vn;
import com.tencent.mm.protocal.c.vo;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

public final class c
{
  private static void a(a parama, int paramInt1, String paramString, int paramInt2)
  {
    GMTrace.i(6673573871616L, 49722);
    w.d("MicroMsg.scanner.GetA8KeyRedirect", "actionCode = %s, url = %s", new Object[] { Integer.valueOf(paramInt1), paramString });
    final gt localgt = new gt();
    localgt.eJT.actionCode = paramInt1;
    localgt.eJT.result = paramString;
    localgt.eJT.context = parama.getContext();
    paramString = new Bundle();
    paramString.putInt("pay_channel", paramInt2);
    localgt.eJT.eJV = paramString;
    localgt.eDO = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6672634347520L, 49715);
        if ((this.nZa == null) || (localgt == null) || (localgt.eJU == null))
        {
          GMTrace.o(6672634347520L, 49715);
          return;
        }
        if (localgt.eJU.ret == 1)
        {
          this.nZa.gL(true);
          GMTrace.o(6672634347520L, 49715);
          return;
        }
        if (localgt.eJU.ret == 2) {
          this.nZa.gL(false);
        }
        GMTrace.o(6672634347520L, 49715);
      }
    };
    a.vgX.a(localgt, Looper.myLooper());
    GMTrace.o(6673573871616L, 49722);
  }
  
  public static boolean a(final a parama, final l paraml, DialogInterface.OnClickListener paramOnClickListener, final String paramString, final int paramInt1, final int paramInt2, final Runnable paramRunnable, Bundle paramBundle)
  {
    GMTrace.i(16141695057920L, 120265);
    if ((parama == null) || (parama.getContext() == null))
    {
      w.e("MicroMsg.scanner.GetA8KeyRedirect", "handleGetA8KeyRedirect, null redirectContext");
      GMTrace.o(16141695057920L, 120265);
      return false;
    }
    int i = paraml.Le();
    int j = ((vn)paraml.fUa.gtC.gtK).uco;
    w.i("MicroMsg.scanner.GetA8KeyRedirect", "actionCode : %s, codeType : %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
    w.i("MicroMsg.scanner.GetA8KeyRedirect", "source=" + paramInt1);
    Intent localIntent = new Intent();
    localIntent.putExtra("geta8key_scene", paramInt1);
    localIntent.putExtra("KPublisherId", "qrcode");
    localIntent.putExtra("prePublishId", "qrcode");
    com.tencent.mm.pluginsdk.wallet.h.zJ(sY(paramInt1));
    switch (i)
    {
    case 5: 
    case 13: 
    case 19: 
    default: 
      w.d("MicroMsg.scanner.GetA8KeyRedirect", "getA8key-not_catch: action code = " + paraml.Le());
      GMTrace.o(16141695057920L, 120265);
      return false;
    case 1: 
      w.d("MicroMsg.scanner.GetA8KeyRedirect", "getA8key-text: " + paraml.rc());
      localIntent.putExtra("data", paraml.rc());
      localIntent.putExtra("showShare", false);
      if (paramInt2 == 2) {
        localIntent.putExtra("stastic_scene", 13);
      }
      for (;;)
      {
        localIntent.putExtra("pay_channel", sY(paramInt1));
        localIntent.putExtra("geta8key_session_id", paraml.Lk());
        com.tencent.mm.plugin.scanner.b.hnH.j(localIntent, parama.getContext());
        new ae(Looper.getMainLooper()).postDelayed(paramRunnable, 200L);
        GMTrace.o(16141695057920L, 120265);
        return true;
        if (paramInt2 == 1) {
          localIntent.putExtra("stastic_scene", 14);
        } else {
          localIntent.putExtra("stastic_scene", 11);
        }
      }
    case 2: 
      w.d("MicroMsg.scanner.GetA8KeyRedirect", "getA8key-webview: " + paraml.Lc());
      paramRunnable = parama.getContext();
      paramBundle = parama.getContext();
      i = R.l.dOT;
      if (!bg.nm(paramString)) {}
      for (;;)
      {
        com.tencent.mm.ui.base.h.a(paramRunnable, paramBundle.getString(i, new Object[] { paramString }), parama.getContext().getString(R.l.cUG), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(6672097476608L, 49711);
            this.val$intent.putExtra("title", paraml.getTitle());
            this.val$intent.putExtra("rawUrl", paraml.Lc());
            if (paramInt2 == 2) {
              this.val$intent.putExtra("stastic_scene", 13);
            }
            for (;;)
            {
              this.val$intent.putExtra("pay_channel", c.sY(paramInt1));
              this.val$intent.putExtra("geta8key_session_id", paraml.Lk());
              this.val$intent.putExtra("geta8key_cookie", paraml.Ll());
              com.tencent.mm.plugin.scanner.b.hnH.j(this.val$intent, parama.getContext());
              GMTrace.o(6672097476608L, 49711);
              return;
              if (paramInt2 == 1) {
                this.val$intent.putExtra("stastic_scene", 14);
              } else {
                this.val$intent.putExtra("stastic_scene", 11);
              }
            }
          }
        }, paramOnClickListener);
        GMTrace.o(16141695057920L, 120265);
        return true;
        paramString = paraml.Lc();
      }
    case 7: 
      w.i("MicroMsg.scanner.GetA8KeyRedirect", "getA8key-webview_no_notice: reqUrl : %s,  fullUrl : %s, shareUrl : %s", new Object[] { paraml.Ld(), paraml.Lc(), paraml.Lg() });
      localIntent.putExtra("title", paraml.getTitle());
      localIntent.putExtra("rawUrl", paraml.Lc());
      localIntent.putExtra("k_share_url", paraml.Lg());
      if (paramInt2 == 2)
      {
        localIntent.putExtra("stastic_scene", 13);
        paramInt2 = sY(paramInt1);
        w.i("MicroMsg.scanner.GetA8KeyRedirect", "start webview with channel : " + paramInt2);
        localIntent.putExtra("pay_channel", sY(paramInt1));
        localIntent.putExtra("geta8key_session_id", paraml.Lk());
        localIntent.putExtra("geta8key_cookie", paraml.Ll());
        paraml = paraml.Lj();
        if (bg.cc(paraml)) {
          break label1004;
        }
        paramOnClickListener = paraml.iterator();
        while (paramOnClickListener.hasNext())
        {
          paramString = (ahp)paramOnClickListener.next();
          if ((paramString == null) || (bg.nm(paramString.tVN)) || (bg.nm(paramString.oqQ))) {
            w.e("MicroMsg.scanner.GetA8KeyRedirect", "http header has null value");
          }
        }
      }
      break;
    }
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      if (paramInt1 == 0)
      {
        paramOnClickListener = new String[paraml.size()];
        paramString = new String[paraml.size()];
        paramInt1 = 0;
        for (;;)
        {
          if (paramInt1 < paraml.size())
          {
            Object localObject = (ahp)paraml.get(paramInt1);
            paramBundle = ((ahp)localObject).tVN;
            localObject = ((ahp)localObject).oqQ;
            w.i("MicroMsg.scanner.GetA8KeyRedirect", "http header index = %d, key = %s, value = %s", new Object[] { Integer.valueOf(paramInt1), paramBundle, localObject });
            paramOnClickListener[paramInt1] = paramBundle;
            paramString[paramInt1] = localObject;
            paramInt1 += 1;
            continue;
            if (paramInt2 == 1)
            {
              localIntent.putExtra("stastic_scene", 14);
              break;
            }
            localIntent.putExtra("stastic_scene", 11);
            break;
          }
        }
        localIntent.putExtra("geta8key_result_http_header_key_list", paramOnClickListener);
        localIntent.putExtra("geta8key_result_http_header_value_list", paramString);
        localIntent.putExtra("k_has_http_header", true);
      }
      label1004:
      com.tencent.mm.plugin.scanner.b.hnH.j(localIntent, parama.getContext());
      new ae(Looper.getMainLooper()).postDelayed(paramRunnable, 200L);
      GMTrace.o(16141695057920L, 120265);
      return true;
      w.d("MicroMsg.scanner.GetA8KeyRedirect", "getA8key-special_webview: " + paraml.Lc());
      localIntent.putExtra("rawUrl", paraml.Lc());
      localIntent.putExtra("pay_channel", sY(paramInt1));
      localIntent.putExtra("showShare", false);
      localIntent.putExtra("show_bottom", false);
      localIntent.putExtra("isWebwx", false);
      localIntent.putExtra("geta8key_session_id", paraml.Lk());
      localIntent.putExtra("geta8key_cookie", paraml.Ll());
      com.tencent.mm.plugin.scanner.b.hnH.j(localIntent, parama.getContext());
      GMTrace.o(16141695057920L, 120265);
      return true;
      GMTrace.o(16141695057920L, 120265);
      return false;
      paramString = paraml.Lc();
      w.d("MicroMsg.scanner.GetA8KeyRedirect", "getA8key-app: " + paramString);
      if ((paramString == null) || (paramString.length() == 0))
      {
        w.e("MicroMsg.scanner.GetA8KeyRedirect", "getA8key-app, fullUrl is null");
        GMTrace.o(16141695057920L, 120265);
        return false;
      }
      paraml = parama.getContext().getString(R.l.dOS);
      if (paramString.startsWith("http")) {
        paraml = parama.getContext().getString(R.l.dOT, new Object[] { paramString });
      }
      paramString = Uri.parse(paramString);
      if (paramString != null)
      {
        paramString = new Intent("android.intent.action.VIEW", paramString);
        paramString.addFlags(268435456);
        if (bg.j(parama.getContext(), paramString))
        {
          com.tencent.mm.ui.base.h.a(parama.getContext(), paraml, parama.getContext().getString(R.l.cUG), false, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(6669278904320L, 49690);
              this.nZa.getContext().startActivity(paramString);
              GMTrace.o(6669278904320L, 49690);
            }
          }, paramOnClickListener);
          GMTrace.o(16141695057920L, 120265);
          return true;
        }
      }
      GMTrace.o(16141695057920L, 120265);
      return false;
      paraml = paraml.rc();
      w.d("MicroMsg.scanner.GetA8KeyRedirect", "get vcard from server: " + paraml);
      if (!bg.nm(paraml)) {
        paramString = new com.tencent.mm.plugin.scanner.a.p();
      }
      try
      {
        paramString.FN(paraml);
        paramString = new Intent(parama.getContext(), VcardContactUI.class);
        parama.getContext().startActivity(paramString);
        parama.gL(false);
        GMTrace.o(16141695057920L, 120265);
        return true;
      }
      catch (XmlPullParserException paramString)
      {
        w.e("MicroMsg.scanner.GetA8KeyRedirect", "parser vcardxml err: " + paramString.getMessage() + " " + paraml);
        w.printErrStackTrace("MicroMsg.scanner.GetA8KeyRedirect", paramString, "", new Object[0]);
        com.tencent.mm.ui.base.h.a(parama.getContext(), parama.getContext().getString(R.l.dPa), parama.getContext().getString(R.l.cUG), false, paramOnClickListener);
        GMTrace.o(16141695057920L, 120265);
        return true;
      }
      catch (IOException paramString)
      {
        for (;;)
        {
          w.e("MicroMsg.scanner.GetA8KeyRedirect", "parser vcardxml err: " + paramString.getMessage() + " " + paraml);
          w.printErrStackTrace("MicroMsg.scanner.GetA8KeyRedirect", paramString, "", new Object[0]);
        }
      }
      w.d("MicroMsg.scanner.GetA8KeyRedirect", "ftf pay url:" + paraml.Lc());
      g.a(parama.getContext(), 1, paraml.Lc(), sY(paramInt1), null);
      new ae(Looper.getMainLooper()).postDelayed(paramRunnable, 200L);
      GMTrace.o(16141695057920L, 120265);
      return true;
      paramOnClickListener = new Bundle();
      paramOnClickListener.putInt("key_scene", 5);
      boolean bool = com.tencent.mm.plugin.scanner.b.hnH.b(parama.getContext(), paraml.Lc(), paramOnClickListener);
      GMTrace.o(16141695057920L, 120265);
      return bool;
      a(parama, i, paraml.Lc(), sY(paramInt1));
      new ae(Looper.getMainLooper()).postDelayed(paramRunnable, 200L);
      GMTrace.o(16141695057920L, 120265);
      return true;
      a(parama, i, paraml.Lc(), sY(paramInt1));
      GMTrace.o(16141695057920L, 120265);
      return true;
      paramOnClickListener = paraml.Lc();
      paraml = paramOnClickListener;
      if (paramOnClickListener != null) {
        paraml = paramOnClickListener.replace("wxpd://", "");
      }
      paramOnClickListener = new Intent();
      paramOnClickListener.putExtra("key_product_id", paraml);
      paramOnClickListener.putExtra("key_product_scene", 7);
      com.tencent.mm.bj.d.b(parama.getContext(), "product", ".ui.MallProductUI", paramOnClickListener);
      GMTrace.o(16141695057920L, 120265);
      return true;
      paramOnClickListener = new Intent();
      paramOnClickListener.setClass(parama.getContext(), ProductUI.class);
      paramOnClickListener.putExtra("key_ProductUI_getProductInfoScene", 5);
      paramOnClickListener.putExtra("key_Qrcode_Url", paraml.Lc());
      parama.getContext().startActivity(paramOnClickListener);
      GMTrace.o(16141695057920L, 120265);
      return true;
      paramOnClickListener = paraml.Lc();
      parama = new Intent().setClassName(ab.getContext(), "com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.BakchatPcUsbService");
      paraml = bg.z(ab.getContext(), parama);
      if (paraml != null) {
        parama = paraml;
      }
      for (;;)
      {
        ab.getContext().startService(parama.putExtra("url", paramOnClickListener).putExtra("isFromWifi", true));
        w.d("MicroMsg.scanner.GetA8KeyRedirect", "GET_CONNECT_INFO start end");
        GMTrace.o(16141695057920L, 120265);
        return true;
      }
      paraml = com.tencent.mm.plugin.scanner.util.p.Ga(paraml.Lc());
      if (paraml == null) {
        w.e("MicroMsg.scanner.GetA8KeyRedirect", "item == null");
      }
      for (;;)
      {
        GMTrace.o(16141695057920L, 120265);
        return false;
        if (com.tencent.mm.plugin.scanner.util.p.lE(paraml.jxG)) {
          break;
        }
        com.tencent.mm.plugin.scanner.util.p.at(parama.getContext(), parama.getContext().getString(R.l.ddo));
      }
      paramOnClickListener = new Intent();
      paramOnClickListener.putExtra("key_card_id", paraml.jxF);
      paramOnClickListener.putExtra("key_card_ext", paraml.eTK);
      paramOnClickListener.putExtra("key_from_scene", 0);
      if (paramInt2 == 2) {
        paramOnClickListener.putExtra("key_stastic_scene", 13);
      }
      for (;;)
      {
        com.tencent.mm.bj.d.b(parama.getContext(), "card", ".ui.CardDetailUI", paramOnClickListener);
        w.d("MicroMsg.scanner.GetA8KeyRedirect", "MMSCAN_QRCODE_CARD start end");
        break;
        if (paramInt2 == 1) {
          paramOnClickListener.putExtra("key_stastic_scene", 14);
        } else {
          paramOnClickListener.putExtra("key_stastic_scene", 11);
        }
      }
      paraml = paraml.Lc();
      paramOnClickListener = com.tencent.mm.plugin.scanner.util.p.Gb(paraml);
      if ((paramOnClickListener == null) || (paramOnClickListener.size() == 0)) {
        w.e("MicroMsg.scanner.GetA8KeyRedirect", "list == null || list.size() == 0");
      }
      for (;;)
      {
        GMTrace.o(16141695057920L, 120265);
        return false;
        if (com.tencent.mm.plugin.scanner.util.p.P(paramOnClickListener)) {
          break;
        }
        com.tencent.mm.plugin.scanner.util.p.at(parama.getContext(), parama.getContext().getString(R.l.ddo));
      }
      paramOnClickListener = new Intent();
      paramOnClickListener.putExtra("key_from_scene", 0);
      paramOnClickListener.putExtra("src_username", "");
      paramOnClickListener.putExtra("js_url", "");
      paramOnClickListener.putExtra("key_in_card_list", paraml);
      if (paramInt2 == 2) {
        paramOnClickListener.putExtra("key_stastic_scene", 13);
      }
      for (;;)
      {
        com.tencent.mm.bj.d.b(parama.getContext(), "card", ".ui.CardAddEntranceUI", paramOnClickListener);
        w.d("MicroMsg.scanner.GetA8KeyRedirect", "MMSCAN_QRCODE_MULTIPLE_CARD start end");
        break;
        if (paramInt2 == 1) {
          paramOnClickListener.putExtra("key_stastic_scene", 14);
        } else {
          paramOnClickListener.putExtra("key_stastic_scene", 11);
        }
      }
      paramRunnable = new Intent();
      paramRunnable.putExtra("free_wifi_url", paraml.Lc());
      paramString = (vo)paraml.fUa.gtD.gtK;
      if ((paramString == null) || (paramString.tMU == null))
      {
        w.e("MicroMsg.NetSceneGetA8Key", "get mid failed");
        paramString = null;
        paramRunnable.putExtra("free_wifi_mid", paramString);
        paramString = (vo)paraml.fUa.gtD.gtK;
        if ((paramString != null) && (paramString.SSID != null)) {
          break label2611;
        }
        w.e("MicroMsg.NetSceneGetA8Key", "get ssid failed");
        paramString = null;
        label2510:
        paramRunnable.putExtra("free_wifi_ssid", paramString);
        paramRunnable.putExtra("free_wifi_source", 1);
        paramRunnable.putExtra("free_wifi_ap_key", paraml.Lc());
        at.AR();
        if (com.tencent.mm.y.c.xh().get(303104, null) == null) {
          break label2619;
        }
        com.tencent.mm.ui.base.h.a(parama.getContext(), R.l.dxB, R.l.cUG, R.l.dxQ, R.l.cSk, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(6671292170240L, 49705);
            com.tencent.mm.bj.d.b(this.nZa.getContext(), "freewifi", ".ui.FreeWifiEntryUI", paramRunnable);
            this.nZa.gL(false);
            GMTrace.o(6671292170240L, 49705);
          }
        }, paramOnClickListener);
      }
      for (;;)
      {
        GMTrace.o(16141695057920L, 120265);
        return true;
        paramString = paramString.tMU;
        break;
        label2611:
        paramString = paramString.SSID;
        break label2510;
        label2619:
        com.tencent.mm.bj.d.b(parama.getContext(), "freewifi", ".ui.FreeWifiEntryUI", paramRunnable);
        parama.gL(false);
      }
      w.d("MicroMsg.scanner.GetA8KeyRedirect", "getA8key-emoticon full url: " + paraml.Lc());
      parama = new z(paraml.Lc());
      at.wS().a(parama, 0);
      GMTrace.o(16141695057920L, 120265);
      return true;
      parama = new og();
      parama.eTi.eTj = paramString;
      a.vgX.m(parama);
      GMTrace.o(16141695057920L, 120265);
      return true;
      parama = paraml.Lc();
      if (bg.nm(parama))
      {
        w.e("MicroMsg.scanner.GetA8KeyRedirect", "onStartCommand url is null");
        GMTrace.o(16141695057920L, 120265);
        return true;
      }
      w.i("MicroMsg.scanner.GetA8KeyRedirect", "summerbak start url, url:%s", new Object[] { parama });
      paraml = new y();
      paraml.eAV.url = parama;
      a.vgX.m(paraml);
      w.i("MicroMsg.scanner.GetA8KeyRedirect", "publish BackupGetA8keyRedirectEvent");
      GMTrace.o(16141695057920L, 120265);
      return true;
      paraml = paraml.Lc();
      w.i("MicroMsg.scanner.GetA8KeyRedirect", "fullURL: " + paraml);
      paramOnClickListener = parama.getContext();
      w.i("MicroMsg.scanner.GetA8KeyRedirect", "processAppBrandFullURL, fullURL: " + paraml);
      paramString = Uri.parse(paraml);
      if ((paramString.getQueryParameter("search_query") != null) && (paramString.getQueryParameter("search_query").length() > 0))
      {
        paramOnClickListener = paramString.getQueryParameter("search_query");
        paramRunnable = paramString.getQueryParameter("appid");
        paramBundle = paramString.getQueryParameter("search_extInfo");
        paramInt1 = bg.getInt(paramString.getQueryParameter("debug"), 0);
        paramInt2 = bg.getInt(paramString.getQueryParameter("version"), 0);
        paramString = new kt();
        paramString.eOU.scene = 1;
        paramString.eOU.appId = paramRunnable;
        paramString.eOU.type = paramInt1;
        paramString.eOU.version = paramInt2;
        paramString.eOU.eOV = paramOnClickListener;
        paramString.eOU.url = paraml;
        paramString.eOU.eOW = paramBundle;
        a.vgX.m(paramString);
        paramString = e.Kv();
        paramString.putExtra("ftsbizscene", 99999);
        paramString.putExtra("ftsQuery", paramOnClickListener);
        paramString.putExtra("ftsqrcodestring", paraml);
        paraml = e.a(300, false, 262144);
        paraml.put("query", paramOnClickListener);
        paraml.put("sessionid", e.gN(bg.Sy((String)paraml.get("scene"))));
        paramString.putExtra("rawUrl", e.n(paraml));
        com.tencent.mm.bj.d.b(ab.getContext(), "webview", ".ui.tools.fts.FTSWebViewUI", paramString);
        parama.gL(false);
        GMTrace.o(16141695057920L, 120265);
        return true;
      }
      if (paramInt2 == 2)
      {
        if (j == 22) {}
        for (paramInt1 = 1048;; paramInt1 = 1012)
        {
          ((com.tencent.mm.plugin.appbrand.k.d)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.d.class)).b(paramOnClickListener, paraml, paramInt1, paramBundle);
          break;
        }
      }
      if (paramInt2 == 1)
      {
        if (j == 22) {}
        for (paramInt1 = 1049;; paramInt1 = 1013) {
          break;
        }
      }
      if (j == 22) {}
      for (paramInt1 = 1047;; paramInt1 = 1011) {
        break;
      }
    }
  }
  
  protected static int sY(int paramInt)
  {
    GMTrace.i(6673708089344L, 49723);
    if ((paramInt == 30) || (paramInt == 37) || (paramInt == 38) || (paramInt == 40))
    {
      GMTrace.o(6673708089344L, 49723);
      return 13;
    }
    if ((paramInt == 4) || (paramInt == 47))
    {
      GMTrace.o(6673708089344L, 49723);
      return 12;
    }
    if (paramInt == 34)
    {
      GMTrace.o(6673708089344L, 49723);
      return 24;
    }
    GMTrace.o(6673708089344L, 49723);
    return 0;
  }
  
  public static abstract interface a
  {
    public abstract void gL(boolean paramBoolean);
    
    public abstract Context getContext();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ab\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */