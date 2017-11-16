package com.tencent.mm.pluginsdk;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.g.a.bt;
import com.tencent.mm.g.a.hj;
import com.tencent.mm.g.a.hj.a;
import com.tencent.mm.modelsimple.ai;
import com.tencent.mm.modelsimple.l;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.c.bjv;
import com.tencent.mm.protocal.c.ci;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aq;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.b;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.ak.b.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import com.tencent.mm.y.u.b;
import com.tencent.mm.y.x;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class d
{
  public static String tlN;
  private static final Map<String, Long> tlO;
  
  static
  {
    GMTrace.i(1240708677632L, 9244);
    tlN = "";
    HashMap localHashMap = new HashMap();
    tlO = localHashMap;
    localHashMap.put("weixin://", Long.valueOf(0L));
    tlO.put("weixin://dl/stickers", Long.valueOf(1L));
    tlO.put("weixin://dl/games", Long.valueOf(2L));
    tlO.put("weixin://dl/moments", Long.valueOf(4L));
    tlO.put("weixin://dl/add", Long.valueOf(8L));
    tlO.put("weixin://dl/shopping", Long.valueOf(16L));
    tlO.put("weixin://dl/groupchat", Long.valueOf(32L));
    tlO.put("weixin://dl/scan", Long.valueOf(64L));
    tlO.put("weixin://dl/profile", Long.valueOf(128L));
    tlO.put("weixin://dl/settings", Long.valueOf(256L));
    tlO.put("weixin://dl/general", Long.valueOf(512L));
    tlO.put("weixin://dl/help", Long.valueOf(1024L));
    tlO.put("weixin://dl/notifications", Long.valueOf(2048L));
    tlO.put("weixin://dl/terms", Long.valueOf(4096L));
    tlO.put("weixin://dl/chat", Long.valueOf(8192L));
    tlO.put("weixin://dl/features", Long.valueOf(16384L));
    tlO.put("weixin://dl/clear", Long.valueOf(32768L));
    tlO.put("weixin://dl/feedback", Long.valueOf(65536L));
    tlO.put("weixin://dl/faq", Long.valueOf(131072L));
    tlO.put("weixin://dl/recommendation", Long.valueOf(262144L));
    tlO.put("weixin://dl/groups", Long.valueOf(524288L));
    tlO.put("weixin://dl/tags", Long.valueOf(1048576L));
    tlO.put("weixin://dl/officialaccounts", Long.valueOf(2097152L));
    tlO.put("weixin://dl/posts", Long.valueOf(4194304L));
    tlO.put("weixin://dl/favorites", Long.valueOf(8388608L));
    tlO.put("weixin://dl/privacy", Long.valueOf(16777216L));
    tlO.put("weixin://dl/security", Long.valueOf(33554432L));
    tlO.put("weixin://dl/wallet", Long.valueOf(67108864L));
    tlO.put("weixin://dl/businessPay", Long.valueOf(134217728L));
    tlO.put("weixin://dl/businessPay/", Long.valueOf(134217728L));
    tlO.put("weixin://dl/wechatout", Long.valueOf(268435456L));
    tlO.put("weixin://dl/protection", Long.valueOf(1073741824L));
    tlO.put("weixin://dl/card", Long.valueOf(2147483648L));
    tlO.put("weixin://dl/about", Long.valueOf(1125899906842624L));
    tlO.put("weixin://dl/blacklist", Long.valueOf(4294967296L));
    tlO.put("weixin://dl/textsize", Long.valueOf(8589934592L));
    tlO.put("weixin://dl/sight", Long.valueOf(17179869184L));
    tlO.put("weixin://dl/languages", Long.valueOf(34359738368L));
    tlO.put("weixin://dl/chathistory", Long.valueOf(68719476736L));
    tlO.put("weixin://dl/bindqq", Long.valueOf(137438953472L));
    tlO.put("weixin://dl/bindmobile", Long.valueOf(274877906944L));
    tlO.put("weixin://dl/bindemail", Long.valueOf(549755813888L));
    tlO.put("weixin://dl/securityassistant", Long.valueOf(1099511627776L));
    tlO.put("weixin://dl/broadcastmessage", Long.valueOf(2199023255552L));
    tlO.put("weixin://dl/setname", Long.valueOf(4398046511104L));
    tlO.put("weixin://dl/myQRcode", Long.valueOf(8796093022208L));
    tlO.put("weixin://dl/myaddress", Long.valueOf(17592186044416L));
    tlO.put("weixin://dl/hidemoments", Long.valueOf(35184372088832L));
    tlO.put("weixin://dl/blockmoments", Long.valueOf(70368744177664L));
    tlO.put("weixin://dl/stickersetting", Long.valueOf(140737488355328L));
    tlO.put("weixin://dl/log", Long.valueOf(281474976710656L));
    tlO.put("weixin://dl/wechatoutcoupon", Long.valueOf(562949953421312L));
    tlO.put("weixin://dl/wechatoutshare", Long.valueOf(18014398509481984L));
    tlO.put("weixin://dl/personalemoticon", Long.valueOf(4503599627370496L));
    tlO.put("weixin://dl/designeremoji", Long.valueOf(9007199254740992L));
    tlO.put("weixin://dl/sightdraft", Long.valueOf(576460752303423488L));
    tlO.put("weixin://dl/jumpWxa/", Long.valueOf(576460752303423489L));
    GMTrace.o(1240708677632L, 9244);
  }
  
  private static void M(Context paramContext, int paramInt)
  {
    GMTrace.i(1240171806720L, 9240);
    String str;
    if ((!f.vhv) && (v.bPK().equals("zh_CN"))) {
      str = paramContext.getString(R.l.ekG);
    }
    for (;;)
    {
      w.d("MicroMsg.DeepLinkHelper", "using faq webpage");
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", str);
      localIntent.putExtra("show_feedback", false);
      localIntent.putExtra("geta8key_session_id", paramInt);
      com.tencent.mm.bj.d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
      GMTrace.o(1240171806720L, 9240);
      return;
      if (v.bPK().equals("zh_HK")) {
        str = paramContext.getString(R.l.ekH);
      } else if (v.bPK().equals("zh_TW")) {
        str = paramContext.getString(R.l.ekI);
      } else {
        str = paramContext.getString(R.l.ekJ);
      }
    }
  }
  
  public static boolean NW(String paramString)
  {
    GMTrace.i(1238426976256L, 9227);
    paramString = Oa(paramString);
    if ((tlO.containsKey(paramString)) || (NX(paramString)))
    {
      GMTrace.o(1238426976256L, 9227);
      return true;
    }
    GMTrace.o(1238426976256L, 9227);
    return false;
  }
  
  public static boolean NX(String paramString)
  {
    GMTrace.i(1238561193984L, 9228);
    if ((!bg.nm(paramString)) && (paramString.startsWith("weixin://dl/business")))
    {
      GMTrace.o(1238561193984L, 9228);
      return true;
    }
    GMTrace.o(1238561193984L, 9228);
    return false;
  }
  
  private static boolean NY(String paramString)
  {
    GMTrace.i(1238963847168L, 9231);
    if (((paramString.equals("weixin://dl/wechatout")) || (paramString.equals("weixin://dl/wechatoutcoupon")) || (paramString.equals("weixin://dl/wechatoutshare"))) && (!Boolean.valueOf(com.tencent.mm.plugin.ipcall.d.aHT()).booleanValue()))
    {
      paramString = new Intent();
      paramString.setFlags(268435456);
      paramString.setClassName(ab.getContext(), "com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
      paramString.putExtra("rawUrl", "https://support.weixin.qq.com/deeplink/noaccess#wechat_redirect");
      ab.getContext().startActivity(paramString);
      GMTrace.o(1238963847168L, 9231);
      return true;
    }
    GMTrace.o(1238963847168L, 9231);
    return false;
  }
  
  public static boolean NZ(String paramString)
  {
    GMTrace.i(1239500718080L, 9235);
    boolean bool = a(null, paramString, 0, null, (int)System.currentTimeMillis(), new byte[0], null);
    GMTrace.o(1239500718080L, 9235);
    return bool;
  }
  
  private static String Oa(String paramString)
  {
    GMTrace.i(1240306024448L, 9241);
    String str = null;
    if (!bg.nm(paramString))
    {
      paramString = Uri.parse(paramString);
      str = paramString.getScheme() + "://" + paramString.getHost() + paramString.getPath();
    }
    GMTrace.o(1240306024448L, 9241);
    return str;
  }
  
  public static void a(Context paramContext, String paramString, int paramInt, Bundle paramBundle, a parama)
  {
    GMTrace.i(20404986970112L, 152029);
    a(paramContext, paramString, paramInt, paramBundle, parama, null, null);
    GMTrace.o(20404986970112L, 152029);
  }
  
  public static void a(final Context paramContext, final String paramString1, final int paramInt, Bundle paramBundle, final a parama, String paramString2, String paramString3)
  {
    GMTrace.i(20404852752384L, 152028);
    LinkedList localLinkedList = new LinkedList();
    ci localci = new ci();
    if ((!bg.nm(paramString2)) && (!bg.nm(paramString3)))
    {
      w.i("MicroMsg.DeepLinkHelper", "package name = %s, package signature = %s", new Object[] { paramString2, paramString3 });
      localci.tQt = paramString2;
      localci.signature = paramString3;
      localLinkedList.add(localci);
    }
    if (NY(paramString1))
    {
      GMTrace.o(20404852752384L, 152028);
      return;
    }
    paramString2 = new ai(paramString1, paramInt, localLinkedList);
    paramContext = new e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(898721906688L, 6696);
        at.wS().b(1200, this);
        w.i("MicroMsg.DeepLinkHelper", "doTicketsDeepLink: errType = %s; errCode = %s; errMsg = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
        boolean bool2 = false;
        boolean bool3 = false;
        boolean bool1 = bool3;
        String str;
        if (paramAnonymousk != null)
        {
          bool1 = bool3;
          if ((paramAnonymousk instanceof ai))
          {
            str = ((ai)paramAnonymousk).LL();
            if (!d.NW(str)) {
              break label310;
            }
          }
        }
        for (bool1 = bool2;; bool1 = true)
        {
          try
          {
            w.i("MicroMsg.DeepLinkHelper", "doTicketsDeepLink: deepLinkUri = %s", new Object[] { str });
            bool1 = bool2;
            w.i("MicroMsg.DeepLinkHelper", "doTicketsDeepLink gotoUri extraData: %s", new Object[] { this.tlQ });
            bool1 = bool2;
            bool2 = d.a(paramContext, str, paramInt, this.tlQ, paramString1);
            bool1 = bool2;
            g.ork.i(11405, new Object[] { paramString1, Integer.valueOf(paramInt), Integer.valueOf(1), str });
            bool1 = bool2;
          }
          catch (Exception localException)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.DeepLinkHelper", localException, "", new Object[] { "" });
              g.ork.i(11405, new Object[] { paramString1, Integer.valueOf(paramInt), Integer.valueOf(0), str });
            }
          }
          if (parama != null) {
            parama.a(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString, paramAnonymousk, bool1);
          }
          GMTrace.o(898721906688L, 6696);
          return;
          label310:
          w.i("MicroMsg.DeepLinkHelper", "doTicketsDeepLink: translate failed");
          Intent localIntent = new Intent();
          localIntent.setFlags(268435456);
          localIntent.setClassName(ab.getContext(), "com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
          localIntent.putExtra("rawUrl", "https://support.weixin.qq.com/deeplink/noaccess#wechat_redirect");
          localIntent.putExtra("showShare", false);
          w.i("MicroMsg.DeepLinkHelper", "doTicketsDeepLink goto WebViewUI extraData: %s", new Object[] { this.tlQ });
          if (this.tlQ != null) {
            localIntent.putExtras(this.tlQ);
          }
          ab.getContext().startActivity(localIntent);
          g.ork.i(11405, new Object[] { paramString1, Integer.valueOf(paramInt), Integer.valueOf(0), str });
        }
      }
    };
    at.wS().a(1200, paramContext);
    at.wS().a(paramString2, 0);
    GMTrace.o(20404852752384L, 152028);
  }
  
  public static void a(Context paramContext, String paramString, int paramInt, a parama)
  {
    GMTrace.i(1239366500352L, 9234);
    a(paramContext, paramString, paramInt, null, parama, null, null);
    GMTrace.o(1239366500352L, 9234);
  }
  
  public static void a(Context paramContext, String paramString1, int paramInt, a parama, String paramString2, String paramString3)
  {
    GMTrace.i(1239232282624L, 9233);
    a(paramContext, paramString1, paramInt, null, parama, paramString2, paramString3);
    GMTrace.o(1239232282624L, 9233);
  }
  
  public static void a(Context paramContext, final String paramString1, final String paramString2, final int paramInt, String paramString3, final a parama)
  {
    GMTrace.i(1239098064896L, 9232);
    if (bg.nm(paramString1)) {
      paramString1 = paramString3;
    }
    while (NY(paramString1))
    {
      GMTrace.o(1239098064896L, 9232);
      return;
    }
    paramString3 = new l(paramString1, paramString2, paramInt, (int)System.currentTimeMillis(), new byte[0]);
    paramContext = new e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(1234132008960L, 9195);
        at.wS().b(233, this);
        w.i("MicroMsg.DeepLinkHelper", "[oneliang][doDeepLink][onSceneEnd]:errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
        boolean bool2 = false;
        boolean bool3 = false;
        boolean bool1 = bool3;
        l locall;
        String str;
        if (paramAnonymousk != null)
        {
          bool1 = bool3;
          if ((paramAnonymousk instanceof l))
          {
            locall = (l)paramAnonymousk;
            w.d("MicroMsg.DeepLinkHelper", "bitset:" + locall.Li());
            long l = locall.Li();
            str = locall.Lc();
            if (!d.aa(str, l)) {
              break label344;
            }
          }
        }
        for (bool1 = bool2;; bool1 = true)
        {
          try
          {
            w.i("MicroMsg.DeepLinkHelper", "[oneliang] uri: %s", new Object[] { str });
            bool1 = bool2;
            bool2 = d.a(this.val$context, locall.Lk(), locall.Ll(), str);
            bool1 = bool2;
            g.ork.i(11405, new Object[] { str, Integer.valueOf(1), Integer.valueOf(paramInt), paramString2, bg.nl(paramString1) });
            bool1 = bool2;
          }
          catch (Exception localException)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.DeepLinkHelper", localException, "", new Object[] { "" });
              g.ork.i(11405, new Object[] { str, Integer.valueOf(0), Integer.valueOf(paramInt), paramString2, bg.nl(paramString1) });
            }
          }
          if (parama != null) {
            parama.a(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString, paramAnonymousk, bool1);
          }
          GMTrace.o(1234132008960L, 9195);
          return;
          label344:
          w.i("MicroMsg.DeepLinkHelper", "[oneliang] no permission");
          Intent localIntent = new Intent();
          localIntent.setFlags(268435456);
          localIntent.setClassName(ab.getContext(), "com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
          localIntent.putExtra("rawUrl", "https://support.weixin.qq.com/deeplink/noaccess#wechat_redirect");
          localIntent.putExtra("geta8key_session_id", localException.Lk());
          localIntent.putExtra("geta8key_cookie", localException.Ll());
          ab.getContext().startActivity(localIntent);
          g.ork.i(11405, new Object[] { str, Integer.valueOf(0), Integer.valueOf(paramInt), paramString2, bg.nl(paramString1) });
        }
      }
    };
    at.wS().a(233, paramContext);
    at.wS().a(paramString3, 0);
    GMTrace.o(1239098064896L, 9232);
  }
  
  public static boolean a(Context paramContext, int paramInt, byte[] paramArrayOfByte, String paramString)
  {
    GMTrace.i(20405121187840L, 152030);
    boolean bool = a(paramContext, paramString, 0, null, paramInt, paramArrayOfByte, null);
    GMTrace.o(20405121187840L, 152030);
    return bool;
  }
  
  private static boolean a(final Context paramContext, String paramString1, int paramInt1, Bundle paramBundle, int paramInt2, byte[] paramArrayOfByte, String paramString2)
  {
    GMTrace.i(20405389623296L, 152032);
    Object localObject1 = Oa(paramString1);
    if (bg.nm((String)localObject1))
    {
      GMTrace.o(20405389623296L, 152032);
      return false;
    }
    long l;
    Object localObject2;
    if (tlO.containsKey(localObject1))
    {
      l = ((Long)tlO.get(localObject1)).longValue();
      w.i("MicroMsg.DeepLinkHelper", "gotoUri, deepLinkMap contains uri, result = %d", new Object[] { Long.valueOf(l) });
      paramBundle = null;
      localObject2 = new Intent();
      ((Intent)localObject2).setFlags(268435456);
      if (l == 0L)
      {
        paramBundle = "com.tencent.mm.ui.LauncherUI";
        localObject1 = localObject2;
        if (bg.nm(paramBundle)) {
          break label3153;
        }
        ((Intent)localObject1).setClassName(ab.getContext(), paramBundle);
        if (paramContext == null) {
          break label3112;
        }
      }
    }
    for (;;)
    {
      String str1;
      int i;
      try
      {
        paramContext.startActivity((Intent)localObject1);
        GMTrace.o(20405389623296L, 152032);
        return true;
        if (l == 1L)
        {
          paramBundle = "com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI";
          g.ork.i(12065, new Object[] { Integer.valueOf(7) });
          localObject1 = localObject2;
          break;
        }
        if (l == 2L)
        {
          ((Intent)localObject2).putExtra("from_deeplink", true);
          ((Intent)localObject2).putExtra("game_report_from_scene", 6);
          paramBundle = "com.tencent.mm.plugin.game.ui.GameCenterUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 4L)
        {
          if ((q.zP() & 0x8000) == 0)
          {
            paramInt1 = 1;
            localObject1 = localObject2;
            if (paramInt1 == 0) {
              break;
            }
            paramBundle = "com.tencent.mm.plugin.sns.ui.En_424b8e16";
            ((Intent)localObject2).putExtra("sns_timeline_NeedFirstLoadint", true);
            localObject1 = localObject2;
            break;
          }
          paramInt1 = 0;
          continue;
        }
        if (l == 8L)
        {
          paramBundle = "com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 16L)
        {
          paramString1 = new hj();
          com.tencent.mm.sdk.b.a.vgX.m(paramString1);
          paramString1 = paramString1.eKH.url;
          localObject1 = localObject2;
          if (bg.nm(paramString1)) {
            break;
          }
          ((Intent)localObject2).putExtra("rawUrl", paramString1);
          ((Intent)localObject2).putExtra("useJs", true);
          ((Intent)localObject2).putExtra("vertical_scroll", true);
          ((Intent)localObject2).putExtra("geta8key_session_id", paramInt2);
          ((Intent)localObject2).putExtra("geta8key_cookie", paramArrayOfByte);
          paramBundle = "com.tencent.mm.plugin.webview.ui.tools.WebViewUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 32L)
        {
          ((Intent)localObject2).putExtra("titile", ab.getContext().getString(R.l.cRo));
          ((Intent)localObject2).putExtra("list_type", 0);
          ((Intent)localObject2).putExtra("list_attr", com.tencent.mm.ui.contact.s.q(new int[] { com.tencent.mm.ui.contact.s.wTl, 256, 512 }));
          paramBundle = "com.tencent.mm.ui.contact.SelectContactUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 64L)
        {
          paramBundle = "com.tencent.mm.plugin.scanner.ui.BaseScanUI";
          ((Intent)localObject2).putExtra("animation_pop_in", true);
          localObject1 = localObject2;
          break;
        }
        if (l == 128L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 256L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 512L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 1024L)
        {
          M(ab.getContext(), paramInt2);
          localObject1 = localObject2;
          break;
        }
        if (l == 2048L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 4096L)
        {
          ((Intent)localObject2).putExtra("title", ab.getContext().getResources().getString(R.l.dOC));
          ((Intent)localObject2).putExtra("rawUrl", ab.getContext().getResources().getString(R.l.efA));
          ((Intent)localObject2).putExtra("showShare", false);
          ((Intent)localObject2).putExtra("geta8key_session_id", paramInt2);
          ((Intent)localObject2).putExtra("geta8key_cookie", paramArrayOfByte);
          paramBundle = "com.tencent.mm.plugin.webview.ui.tools.WebViewUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 8192L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsChattingUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 16384L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsPluginsUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 32768L)
        {
          paramBundle = "com.tencent.mm.plugin.clean.ui.CleanUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 65536L) {
          try
          {
            paramInt1 = paramString1.indexOf("?");
            if (paramInt1 <= 0) {
              break label4175;
            }
            paramString1 = paramString1.substring(paramInt1 + 1);
            com.tencent.mm.kernel.h.xw();
            paramInt1 = com.tencent.mm.kernel.a.ww();
            paramString2 = URLEncoder.encode(com.tencent.mm.protocal.d.tJA, "utf-8");
            localObject1 = URLEncoder.encode(bg.bQP(), "utf-8");
            str1 = URLEncoder.encode(p.sZ(), "utf-8");
            String str2 = URLEncoder.encode(com.tencent.mm.protocal.d.tJv, "utf-8");
            String str3 = URLEncoder.encode(com.tencent.mm.protocal.d.tJw, "utf-8");
            String str4 = URLEncoder.encode(com.tencent.mm.protocal.d.tJx, "utf-8");
            String str5 = URLEncoder.encode(at.wN(), "utf-8");
            String str6 = URLEncoder.encode(bg.eF(ab.getContext()), "utf-8");
            paramString2 = new StringBuilder("&uin=").append(paramInt1).append("&deviceName=").append(paramString2).append("&timeZone=").append((String)localObject1).append("&imei=").append(str1).append("&deviceBrand=").append(str2).append("&deviceModel=").append(str3).append("&ostype=").append(str4).append("&clientSeqID=").append(str5).append("&signature=").append(str6).append("&scene=");
            if (bg.nm(paramString1))
            {
              paramInt1 = 0;
              paramString2 = paramInt1;
              paramString1 = "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=feedback/index" + "&version=" + com.tencent.mm.protocal.d.tJC + "&lang=" + v.eq(ab.getContext()) + "&" + bg.nl(paramString1) + paramString2;
              ((Intent)localObject2).putExtra("showShare", false);
              ((Intent)localObject2).putExtra("rawUrl", paramString1);
              ((Intent)localObject2).putExtra("neverGetA8Key", true);
              ((Intent)localObject2).putExtra("geta8key_session_id", paramInt2);
              ((Intent)localObject2).putExtra("geta8key_cookie", paramArrayOfByte);
              ((Intent)localObject2).putExtra("hardcode_jspermission", JsapiPermissionWrapper.tJP);
              ((Intent)localObject2).putExtra("hardcode_general_ctrl", GeneralControlWrapper.tJM);
              paramBundle = "com.tencent.mm.plugin.webview.ui.tools.WebViewUI";
              localObject1 = localObject2;
              break;
            }
            paramInt1 = 1;
            continue;
          }
          catch (UnsupportedEncodingException paramString1)
          {
            w.e("MicroMsg.DeepLinkHelper", "[oneliang]UnsupportedEncodingException:%s", new Object[] { paramString1.getMessage() });
            localObject1 = localObject2;
          }
        }
        if (l == 131072L)
        {
          com.tencent.mm.kernel.h.xw();
          paramInt1 = com.tencent.mm.kernel.a.ww();
          at.AR();
          i = bg.e((Integer)com.tencent.mm.y.c.xh().get(12304, null));
          paramString1 = ab.getContext().getString(R.l.eaK, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(i) });
          ((Intent)localObject2).putExtra("showShare", false);
          ((Intent)localObject2).putExtra("rawUrl", paramString1);
          ((Intent)localObject2).putExtra("geta8key_session_id", paramInt2);
          ((Intent)localObject2).putExtra("geta8key_cookie", paramArrayOfByte);
          paramBundle = "com.tencent.mm.plugin.webview.ui.tools.WebViewUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 262144L)
        {
          paramBundle = "com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 524288L)
        {
          paramBundle = "com.tencent.mm.ui.contact.ChatroomContactUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 1048576L)
        {
          paramBundle = "com.tencent.mm.plugin.label.ui.ContactLabelManagerUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 2097152L)
        {
          paramBundle = "com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 268435456L)
        {
          ((Intent)localObject2).putExtra("IPCallAddressUI_KFrom", 1);
          com.tencent.mm.bj.d.b(ab.getContext(), "ipcall", ".ui.IPCallAddressUI", (Intent)localObject2);
          GMTrace.o(20405389623296L, 152032);
          return true;
        }
        if (l == 4194304L)
        {
          at.AR();
          ((Intent)localObject2).putExtra("sns_userName", (String)com.tencent.mm.y.c.xh().get(2, null));
          ((Intent)localObject2).addFlags(67108864);
          at.AR();
          paramInt1 = bg.a((Integer)com.tencent.mm.y.c.xh().get(68389, null), 0);
          at.AR();
          com.tencent.mm.y.c.xh().set(68389, Integer.valueOf(paramInt1 + 1));
          paramBundle = "com.tencent.mm.plugin.sns.ui.SnsUserUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 8388608L)
        {
          paramBundle = "com.tencent.mm.plugin.favorite.ui.FavoriteIndexUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 16777216L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 33554432L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 67108864L)
        {
          paramBundle = "com.tencent.mm.plugin.mall.ui.MallIndexUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 134217728L)
        {
          if ((paramContext != null) && (!bg.nm(paramString1)) && (paramString1.startsWith("weixin://dl/businessPay")))
          {
            paramArrayOfByte = Uri.parse(paramString1);
            if (paramArrayOfByte == null) {
              continue;
            }
            paramString1 = paramArrayOfByte.getQueryParameter("reqkey");
            paramString2 = paramArrayOfByte.getQueryParameter("appid");
            if (!bg.nm(paramString1))
            {
              paramArrayOfByte = new PayInfo();
              paramArrayOfByte.eHG = paramString1;
              paramArrayOfByte.appId = paramString2;
              paramArrayOfByte.ePL = 36;
              paramArrayOfByte.lNA = false;
              localObject1 = new Intent();
              ((Intent)localObject1).putExtra("key_pay_info", paramArrayOfByte);
              if (q.zR())
              {
                com.tencent.mm.bj.d.b(paramContext, "wallet_payu", ".pay.ui.WalletPayUPayUI", (Intent)localObject1, 1);
                break;
              }
              com.tencent.mm.bj.d.b(paramContext, "wallet", ".pay.ui.WalletPayUI", (Intent)localObject1, 1);
              break;
            }
            w.w("MicroMsg.DeepLinkHelper", "reqkey null");
          }
          localObject1 = null;
          break;
          w.w("MicroMsg.DeepLinkHelper", "payUri null");
          continue;
        }
        if (l == 1073741824L)
        {
          paramBundle = "com.tencent.mm.plugin.safedevice.ui.MySafeDeviceListUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 2147483648L)
        {
          paramBundle = "com.tencent.mm.plugin.card.ui.CardHomePageUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 4294967296L)
        {
          ((Intent)localObject2).putExtra("filter_type", x.gA(ab.getContext().getString(R.l.dBp)).getType());
          ((Intent)localObject2).putExtra("titile", ab.getContext().getString(R.l.eah));
          ((Intent)localObject2).putExtra("list_attr", 32768);
          paramBundle = "com.tencent.mm.ui.contact.SelectSpecialContactUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 8589934592L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 17179869184L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 34359738368L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsLanguageUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 68719476736L)
        {
          paramBundle = "com.tencent.mm.plugin.backup.backupmoveui.BackupUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 137438953472L)
        {
          ((Intent)localObject2).setClassName(ab.getContext(), "com.tencent.mm.ui.bindqq.BindQQUI");
          MMWizardActivity.A(paramContext, (Intent)localObject2);
          GMTrace.o(20405389623296L, 152032);
          return true;
        }
        if (l == 274877906944L)
        {
          ((Intent)localObject2).setClassName(ab.getContext(), "com.tencent.mm.ui.bindmobile.BindMContactIntroUI");
          MMWizardActivity.A(paramContext, (Intent)localObject2);
          GMTrace.o(20405389623296L, 152032);
          return true;
        }
        if (l == 549755813888L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 1099511627776L)
        {
          com.tencent.mm.bj.d.b(ab.getContext(), "profile", ".ui.ContactInfoUI", ((Intent)localObject2).putExtra("Contact_User", "qqsync"));
          GMTrace.o(20405389623296L, 152032);
          return true;
        }
        if (l == 2199023255552L)
        {
          paramBundle = "com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 4398046511104L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 8796093022208L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 17592186044416L)
        {
          ((Intent)localObject2).putExtra("launch_from_webview", false);
          com.tencent.mm.bj.d.a(ab.getContext(), "address", ".ui.WalletSelectAddrUI", (Intent)localObject2, true);
          GMTrace.o(20405389623296L, 152032);
          return true;
        }
        if (l == 35184372088832L)
        {
          ((Intent)localObject2).putExtra("k_sns_tag_id", 4L);
          ((Intent)localObject2).putExtra("k_sns_from_settings_about_sns", 1);
          com.tencent.mm.bj.d.b(ab.getContext(), "sns", ".ui.SnsBlackDetailUI", (Intent)localObject2);
          GMTrace.o(20405389623296L, 152032);
          return true;
        }
        if (l == 70368744177664L)
        {
          ((Intent)localObject2).putExtra("k_sns_tag_id", 5L);
          ((Intent)localObject2).putExtra("k_sns_from_settings_about_sns", 2);
          ((Intent)localObject2).putExtra("k_tag_detail_sns_block_scene", 8);
          com.tencent.mm.bj.d.b(ab.getContext(), "sns", ".ui.SnsTagDetailUI", (Intent)localObject2);
          localObject1 = localObject2;
          break;
        }
        if (l == 140737488355328L)
        {
          paramBundle = "com.tencent.mm.plugin.emoji.ui.EmojiMineUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 281474976710656L)
        {
          paramContext = new bt();
          paramContext.eCY.eDa = "//uplog";
          paramContext.eCY.context = ab.getContext();
          com.tencent.mm.sdk.b.a.vgX.m(paramContext);
          GMTrace.o(20405389623296L, 152032);
          return true;
        }
        if (l == 562949953421312L)
        {
          ((Intent)localObject2).putExtra("IPCallAddressUI_KFrom", 1);
          com.tencent.mm.bj.d.b(ab.getContext(), "ipcall", ".ui.IPCallAddressUI", (Intent)localObject2);
          com.tencent.mm.bj.d.b(ab.getContext(), "ipcall", ".ui.IPCallShareCouponUI", (Intent)localObject2);
          GMTrace.o(20405389623296L, 152032);
          return true;
        }
        if (l == 18014398509481984L)
        {
          ((Intent)localObject2).putExtra("IPCallAddressUI_KFrom", 1);
          com.tencent.mm.bj.d.b(ab.getContext(), "ipcall", ".ui.IPCallAddressUI", (Intent)localObject2);
          com.tencent.mm.bj.d.b(ab.getContext(), "ipcall", ".ui.IPCallShareCouponUI", (Intent)localObject2);
          com.tencent.mm.bj.d.b(ab.getContext(), "ipcall", ".ui.IPCallShareCouponCardUI", (Intent)localObject2);
          localObject1 = localObject2;
          break;
        }
        if (l == 576460752303423488L)
        {
          ((Intent)localObject2).putExtra("IPCallAddressUI_KFrom", 1);
          ((Intent)localObject2).setClassName(ab.getContext(), "com.tencent.mm.plugin.sight.draft.ui.SightDraftUI");
          ab.getContext().startActivity((Intent)localObject2);
          localObject1 = localObject2;
          break;
        }
        if (l == 1125899906842624L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI";
          localObject1 = localObject2;
          break;
        }
        if (l == 4503599627370496L)
        {
          ((Intent)localObject2).putExtra("emoji_tab", 1);
          paramBundle = "com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI";
          g.ork.i(12065, new Object[] { Integer.valueOf(7) });
          localObject1 = localObject2;
          break;
        }
        if (l == 9007199254740992L)
        {
          paramBundle = "com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI";
          localObject1 = localObject2;
          break;
        }
        localObject1 = localObject2;
        if (l != 576460752303423489L) {
          break;
        }
        paramArrayOfByte = Uri.parse(paramString1);
        paramString1 = paramArrayOfByte.getQueryParameter("appid");
        paramBundle = paramArrayOfByte.getQueryParameter("userName");
        paramArrayOfByte = paramArrayOfByte.getQueryParameter("path");
        paramInt2 = 0;
        localObject1 = com.tencent.mm.y.u.Av().p("key_data_center_session_id", false);
        if (localObject1 != null) {
          paramInt2 = ((Integer)((u.b)localObject1).get("key_launch_miniprogram_type", Integer.valueOf(0))).intValue();
        }
        w.i("MicroMsg.DeepLinkHelper", "appid = %s, userName = %s, path = %s, translateLinkScene = %d, type = %d", new Object[] { paramString1, paramBundle, paramArrayOfByte, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        com.tencent.mm.y.u.Av().gx("key_data_center_session_id");
        localObject1 = new AppBrandStatObject();
        ((AppBrandStatObject)localObject1).eAv = URLEncoder.encode(paramString2);
        if (paramInt1 == 2)
        {
          ((AppBrandStatObject)localObject1).scene = 1065;
          ((com.tencent.mm.plugin.appbrand.k.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.c.class)).a(paramContext, paramBundle, null, paramInt2, 0, paramArrayOfByte, (AppBrandStatObject)localObject1);
          GMTrace.o(20405389623296L, 152032);
          return true;
        }
        if (paramInt1 == 1)
        {
          ((AppBrandStatObject)localObject1).scene = 1069;
          ((AppBrandStatObject)localObject1).eAv = paramString1;
          ((com.tencent.mm.plugin.appbrand.k.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.c.class)).a(paramContext, paramBundle, null, paramInt2, 0, paramArrayOfByte, (AppBrandStatObject)localObject1, paramString1);
          continue;
        }
        if (paramInt1 == 6)
        {
          ((AppBrandStatObject)localObject1).scene = 1007;
          ((com.tencent.mm.plugin.appbrand.k.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.c.class)).a(paramContext, paramBundle, null, paramInt2, 0, paramArrayOfByte, (AppBrandStatObject)localObject1);
          continue;
        }
        if (paramInt1 == 7)
        {
          ((AppBrandStatObject)localObject1).scene = 1008;
          ((com.tencent.mm.plugin.appbrand.k.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.c.class)).a(paramContext, paramBundle, null, paramInt2, 0, paramArrayOfByte, (AppBrandStatObject)localObject1);
          continue;
        }
        ((AppBrandStatObject)localObject1).scene = 1000;
        ((com.tencent.mm.plugin.appbrand.k.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.c.class)).a(paramContext, paramBundle, null, 0, 0, paramArrayOfByte, (AppBrandStatObject)localObject1);
        continue;
        label3112:
        ab.getContext().startActivity((Intent)localObject1);
        b.B(ab.getContext(), (Intent)localObject1);
        continue;
      }
      catch (Exception paramContext)
      {
        w.printErrStackTrace("MicroMsg.DeepLinkHelper", paramContext, "", new Object[] { "" });
        continue;
      }
      label3153:
      GMTrace.o(20405389623296L, 152032);
      return false;
      if (((String)localObject1).startsWith("weixin://dl/businessTempSession/"))
      {
        paramString2 = new Intent();
        paramString2.setFlags(268435456);
        localObject1 = Uri.parse(paramString1);
        if (localObject1 == null)
        {
          w.e("MicroMsg.DeepLinkHelper", "tempsession uri is null");
          GMTrace.o(20405389623296L, 152032);
          return false;
        }
        localObject2 = ((Uri)localObject1).getQueryParameter("sessionFrom");
        str1 = ((Uri)localObject1).getQueryParameter("showtype");
        paramArrayOfByte = ((Uri)localObject1).getQueryParameter("username");
        paramBundle = paramArrayOfByte;
        if (bg.nm(paramArrayOfByte)) {
          paramBundle = ((Uri)localObject1).getQueryParameter("userName");
        }
        if (bg.nm(paramBundle))
        {
          w.e("MicroMsg.DeepLinkHelper", "tempsession user is null");
          GMTrace.o(20405389623296L, 152032);
          return false;
        }
        i = bg.getInt(bg.nl(((Uri)localObject1).getQueryParameter("scene")), 0);
        paramInt2 = paramInt1;
        if (i != 0)
        {
          paramInt2 = paramInt1;
          if (paramInt1 == 4)
          {
            w.i("MicroMsg.DeepLinkHelper", "Jsapi assign scene to " + i);
            paramInt2 = i;
          }
        }
        w.i("MicroMsg.DeepLinkHelper", "tempsession jump, %s, %s, %s, %s, %s.", new Object[] { paramBundle, localObject2, Integer.valueOf(paramInt2), paramString1, str1 });
        paramString2.setClassName(ab.getContext(), "com.tencent.mm.ui.chatting.En_5b8fbb1e");
        paramString2.putExtra("Chat_User", paramBundle);
        paramString2.putExtra("finish_direct", true);
        paramString2.putExtra("key_is_temp_session", true);
        paramString2.putExtra("key_temp_session_from", (String)localObject2);
        paramString2.putExtra("key_temp_session_scene", paramInt2);
        paramString2.putExtra("key_temp_session_show_type", bg.getInt(str1, 0));
        at.AR();
        paramString1 = com.tencent.mm.y.c.yK().TE(paramBundle);
        if ((paramString1 == null) || ((int)paramString1.fTq <= 0)) {
          ak.a.gmX.a(paramBundle, "", new ak.b.a()
          {
            public final void r(String paramAnonymousString, boolean paramAnonymousBoolean)
            {
              GMTrace.i(1235071533056L, 9202);
              if (!paramAnonymousBoolean)
              {
                w.e("MicroMsg.DeepLinkHelper", "getContact fail, %s", new Object[] { paramAnonymousString });
                GMTrace.o(1235071533056L, 9202);
                return;
              }
              this.val$intent.putExtra("Chat_User", paramAnonymousString);
              try
              {
                if (paramContext != null)
                {
                  paramContext.startActivity(this.val$intent);
                  GMTrace.o(1235071533056L, 9202);
                  return;
                }
              }
              catch (Exception paramAnonymousString)
              {
                w.printErrStackTrace("MicroMsg.DeepLinkHelper", paramAnonymousString, "", new Object[] { "" });
                GMTrace.o(1235071533056L, 9202);
                return;
              }
              ab.getContext().startActivity(this.val$intent);
              GMTrace.o(1235071533056L, 9202);
            }
          });
        }
        for (;;)
        {
          GMTrace.o(20405389623296L, 152032);
          return true;
          paramContext.startActivity(paramString2);
        }
      }
      if ((((String)localObject1).startsWith("weixin://dl/businessGame/detail/")) || (((String)localObject1).startsWith("weixin://dl/businessGame/detail")))
      {
        w.i("MicroMsg.DeepLinkHelper", "gotoUri, uri startsWith GAME_DETAIL");
        paramArrayOfByte = Uri.parse(paramString1);
        paramString1 = null;
        paramBundle = new Intent();
        if (paramArrayOfByte != null)
        {
          paramArrayOfByte = paramArrayOfByte.getQueryParameter("appid");
          paramString1 = "com.tencent.mm.plugin.game.ui.GameDetailUI";
          paramBundle.putExtra("game_app_id", paramArrayOfByte);
          paramBundle.putExtra("game_report_from_scene", 6);
        }
        if (!bg.nm(paramString1))
        {
          paramBundle.setClassName(ab.getContext(), paramString1);
          if (paramContext != null) {}
          try
          {
            paramContext.startActivity(paramBundle);
            for (;;)
            {
              GMTrace.o(20405389623296L, 152032);
              return true;
              ab.getContext().startActivity(paramBundle);
              b.B(ab.getContext(), paramBundle);
            }
          }
          catch (Exception paramContext)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.DeepLinkHelper", paramContext, "", new Object[] { "" });
            }
          }
        }
        GMTrace.o(20405389623296L, 152032);
        return false;
      }
      if ((((String)localObject1).startsWith("weixin://dl/businessGame/library/")) || (((String)localObject1).startsWith("weixin://dl/businessGame/library")))
      {
        w.i("MicroMsg.DeepLinkHelper", "gotoUri, uri startsWith GAME_LIBRARY");
        paramString1 = new Intent();
        if (!bg.nm("com.tencent.mm.plugin.game.ui.GameLibraryUI"))
        {
          paramString1.putExtra("game_report_from_scene", 6);
          paramString1.setClassName(ab.getContext(), "com.tencent.mm.plugin.game.ui.GameLibraryUI");
          if (paramContext != null) {}
          try
          {
            paramContext.startActivity(paramString1);
            for (;;)
            {
              GMTrace.o(20405389623296L, 152032);
              return true;
              ab.getContext().startActivity(paramString1);
              b.B(ab.getContext(), paramString1);
            }
          }
          catch (Exception paramContext)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.DeepLinkHelper", paramContext, "", new Object[] { "" });
            }
          }
        }
        GMTrace.o(20405389623296L, 152032);
        return false;
      }
      if ((((String)localObject1).startsWith("weixin://dl/businessWebview/link/")) || (((String)localObject1).startsWith("weixin://dl/businessWebview/link")))
      {
        w.i("MicroMsg.DeepLinkHelper", "gotoUri, uri startsWith H5_LINK");
        paramString2 = Uri.parse(paramString1);
        localObject1 = new Intent();
        paramString1 = null;
        if (paramString2 != null)
        {
          paramString1 = paramString2.getQueryParameter("url");
          w.i("MicroMsg.DeepLinkHelper", "gotoUri, rawUrl = %s, translateLinkScene: %s", new Object[] { paramString1, Integer.valueOf(paramInt1) });
          paramString2 = "com.tencent.mm.plugin.webview.ui.tools.WebViewUI";
          ((Intent)localObject1).putExtra("rawUrl", paramString1);
          ((Intent)localObject1).putExtra("geta8key_session_id", paramInt2);
          ((Intent)localObject1).putExtra("geta8key_cookie", paramArrayOfByte);
          ((Intent)localObject1).addFlags(268435456);
          if (paramInt1 != 1) {
            break label4088;
          }
          ((Intent)localObject1).putExtra("show_openapp_dialog", false);
          ((Intent)localObject1).putExtra("pay_channel", 40);
          com.tencent.mm.pluginsdk.wallet.h.zJ(39);
        }
        for (;;)
        {
          ((Intent)localObject1).putExtra("transaction_for_openapi_openwebview", tlN);
          paramString1 = paramString2;
          if (paramBundle != null)
          {
            ((Intent)localObject1).putExtras(paramBundle);
            paramString1 = paramString2;
          }
          if (!bg.nm(paramString1))
          {
            ((Intent)localObject1).setClassName(ab.getContext(), paramString1);
            if (paramContext != null) {}
            try
            {
              paramContext.startActivity((Intent)localObject1);
              for (;;)
              {
                GMTrace.o(20405389623296L, 152032);
                return true;
                label4088:
                if (paramInt1 != 2) {
                  break;
                }
                ((Intent)localObject1).putExtra("pay_channel", 39);
                com.tencent.mm.pluginsdk.wallet.h.zJ(39);
                break;
                ab.getContext().startActivity((Intent)localObject1);
                b.B(ab.getContext(), (Intent)localObject1);
              }
            }
            catch (Exception paramContext)
            {
              for (;;)
              {
                w.printErrStackTrace("MicroMsg.DeepLinkHelper", paramContext, "", new Object[] { "" });
              }
            }
          }
        }
        GMTrace.o(20405389623296L, 152032);
        return false;
      }
      GMTrace.o(20405389623296L, 152032);
      return false;
      label4175:
      paramString1 = "";
    }
  }
  
  public static boolean a(Context paramContext, String paramString1, int paramInt, Bundle paramBundle, String paramString2)
  {
    GMTrace.i(20405255405568L, 152031);
    boolean bool = a(paramContext, paramString1, paramInt, paramBundle, (int)System.currentTimeMillis(), new byte[0], paramString2);
    GMTrace.o(20405255405568L, 152031);
    return bool;
  }
  
  public static void aM(Context paramContext, String paramString)
  {
    GMTrace.i(1240574459904L, 9243);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.DeepLinkHelper", "cpan gotoLoginUI url is null. finish");
      GMTrace.o(1240574459904L, 9243);
      return;
    }
    Object localObject;
    if (paramString.startsWith("weixin://dl/login/phone_view"))
    {
      localObject = Uri.parse(paramString);
      paramString = ((Uri)localObject).getQueryParameter("cc");
      localObject = ((Uri)localObject).getQueryParameter("num");
      w.d("MicroMsg.DeepLinkHelper", "cpan gotoLoginUI cc:%s num:%s", new Object[] { paramString, localObject });
      Intent localIntent = new Intent();
      localIntent.putExtra("input_country_code", paramString);
      localIntent.putExtra("input_mobile_number", (String)localObject);
      localIntent.putExtra("from_deep_link", true);
      localIntent.putExtra("mobile_input_purpose", 1);
      localIntent.addFlags(268435456);
      com.tencent.mm.bj.d.b(paramContext, "accountsync", "com.tencent.mm.ui.account.mobile.MobileInputUI", localIntent);
      GMTrace.o(1240574459904L, 9243);
      return;
    }
    if (paramString.startsWith("weixin://dl/login/common_view"))
    {
      paramString = Uri.parse(paramString).getQueryParameter("username");
      w.d("MicroMsg.DeepLinkHelper", "cpan gotoLoginUI  username:%s", new Object[] { paramString });
      localObject = new Intent();
      ((Intent)localObject).putExtra("login_username", paramString);
      ((Intent)localObject).putExtra("from_deep_link", true);
      ((Intent)localObject).addFlags(268435456);
      com.tencent.mm.bj.d.b(paramContext, "accountsync", "com.tencent.mm.ui.account.LoginUI", (Intent)localObject);
      GMTrace.o(1240574459904L, 9243);
      return;
    }
    w.e("MicroMsg.DeepLinkHelper", "cpan gotoLoginUI url not Correct:%s", new Object[] { paramString });
    GMTrace.o(1240574459904L, 9243);
  }
  
  public static boolean aa(String paramString, long paramLong)
  {
    GMTrace.i(1238292758528L, 9226);
    if (!bg.nm(paramString))
    {
      paramString = Oa(paramString);
      if (!tlO.containsKey(paramString)) {
        break label92;
      }
    }
    label92:
    for (long l = ((Long)tlO.get(paramString)).longValue();; l = -1L)
    {
      if ((l != -1L) && ((l == 0L) || ((l & paramLong) == l))) {}
      for (boolean bool = true;; bool = false)
      {
        GMTrace.o(1238292758528L, 9226);
        return bool;
      }
    }
  }
  
  public static void dF(Context paramContext)
  {
    GMTrace.i(1240037588992L, 9239);
    M(paramContext, (int)System.currentTimeMillis());
    GMTrace.o(1240037588992L, 9239);
  }
  
  public static boolean i(Uri paramUri)
  {
    GMTrace.i(1238695411712L, 9229);
    if (paramUri == null)
    {
      GMTrace.o(1238695411712L, 9229);
      return false;
    }
    if (!bg.nm(paramUri.getQueryParameter("ticket")))
    {
      GMTrace.o(1238695411712L, 9229);
      return true;
    }
    boolean bool = j(paramUri);
    GMTrace.o(1238695411712L, 9229);
    return bool;
  }
  
  public static boolean j(Uri paramUri)
  {
    GMTrace.i(1238829629440L, 9230);
    if (paramUri == null)
    {
      GMTrace.o(1238829629440L, 9230);
      return false;
    }
    if ((paramUri.toString().startsWith("weixin://dl/business/tempsession/")) || (paramUri.toString().startsWith("weixin://dl/businessTempSession/")))
    {
      GMTrace.o(1238829629440L, 9230);
      return true;
    }
    GMTrace.o(1238829629440L, 9230);
    return false;
  }
  
  public static void u(final Context paramContext, String paramString1, String paramString2)
  {
    GMTrace.i(1240440242176L, 9242);
    if (NY(paramString2))
    {
      GMTrace.o(1240440242176L, 9242);
      return;
    }
    r localr = com.tencent.mm.ui.base.h.a(paramContext, "", true, null);
    int j = 6;
    int i = j;
    if (!bg.nm(paramString1))
    {
      if (!com.tencent.mm.y.s.eb(paramString1)) {
        break label86;
      }
      i = 7;
    }
    for (;;)
    {
      a(paramContext, paramString2, i, new a()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk, boolean paramAnonymousBoolean)
        {
          GMTrace.i(1230239694848L, 9166);
          w.i("MicroMsg.DeepLinkHelper", "DeepLinkHelper.DeepLinkCallback, %d, %d, %s, %b", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, Boolean.valueOf(paramAnonymousBoolean) });
          if ((this.tlS != null) && (this.tlS.isShowing())) {
            this.tlS.dismiss();
          }
          if ((paramAnonymousk != null) && (paramAnonymousInt1 != 0) && (paramAnonymousInt2 != 0) && ((paramAnonymousk instanceof ai)))
          {
            paramAnonymousString = ((ai)paramAnonymousk).LM();
            if ((paramAnonymousString != null) && (paramContext != null)) {
              com.tencent.mm.ui.base.u.makeText(paramContext, paramContext.getString(R.l.cUG) + " : " + bg.nl(paramAnonymousString.uUJ), 0).show();
            }
          }
          GMTrace.o(1230239694848L, 9166);
        }
      });
      GMTrace.o(1240440242176L, 9242);
      return;
      label86:
      i = j;
      if (com.tencent.mm.y.s.fD(paramString1)) {
        i = 9;
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt1, int paramInt2, String paramString, k paramk, boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */