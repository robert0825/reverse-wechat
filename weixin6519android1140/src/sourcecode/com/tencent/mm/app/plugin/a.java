package com.tencent.mm.app.plugin;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.p.v;
import com.tencent.mm.pluginsdk.t;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.JSAPIUploadLogHelperUI;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.bindmobile.BindMContactIntroUI;
import com.tencent.mm.ui.contact.VoipAddressUI;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.Iterator;

public final class a
  implements p.v
{
  public a()
  {
    GMTrace.i(13007040020480L, 96910);
    GMTrace.o(13007040020480L, 96910);
  }
  
  private boolean a(Context paramContext, String paramString, boolean paramBoolean, t paramt, Bundle paramBundle)
  {
    GMTrace.i(13007711109120L, 96915);
    if (paramContext == null)
    {
      w.e("MicroMsg.MMURIJumpHandler", "jumpToUIInternal, context is null!");
      GMTrace.o(13007711109120L, 96915);
      return false;
    }
    if (paramString == null)
    {
      w.e("MicroMsg.MMURIJumpHandler", "jumpToUIInternal url is null");
      GMTrace.o(13007711109120L, 96915);
      return false;
    }
    if (paramString.startsWith("weixin://openSpecificView/"))
    {
      paramBoolean = b(paramContext, paramString, new Object[0]);
      GMTrace.o(13007711109120L, 96915);
      return paramBoolean;
    }
    d locald = d.pI();
    if (paramt == null) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.URISpanHandler", "handleUriJump, url:%s, isAllowScanQrCode:%b, callback==null:%b, mHighPriorityHandlerList.size:%d, mNormalPriorityHandlerList.size: %d, mLowPriorityHandlerList.size: %d", new Object[] { paramString, Boolean.valueOf(paramBoolean), Boolean.valueOf(bool), Integer.valueOf(locald.euk.size()), Integer.valueOf(locald.eul.size()), Integer.valueOf(locald.eum.size()) });
      if (paramContext != null) {
        break;
      }
      w.e("MicroMsg.URISpanHandler", "handleUriJump, context is null!");
      locald.euj.mContext = null;
      GMTrace.o(13007711109120L, 96915);
      return false;
    }
    locald.mContext = paramContext;
    locald.euj.mContext = locald.mContext;
    if (bg.nm(paramString))
    {
      w.d("MicroMsg.URISpanHandler", "handleUriJump, url is null");
      locald.mContext = null;
      locald.euj.mContext = null;
      GMTrace.o(13007711109120L, 96915);
      return false;
    }
    paramContext = locald.euk.iterator();
    URISpanHandlerSet.BaseUriSpanHandler localBaseUriSpanHandler;
    while (paramContext.hasNext())
    {
      localBaseUriSpanHandler = (URISpanHandlerSet.BaseUriSpanHandler)paramContext.next();
      if (localBaseUriSpanHandler.a(paramString, paramBoolean, paramt, paramBundle))
      {
        w.d("MicroMsg.URISpanHandler", "handleUriJump, %s handle", new Object[] { localBaseUriSpanHandler.getClass().getName() });
        locald.mContext = null;
        locald.euj.mContext = null;
        GMTrace.o(13007711109120L, 96915);
        return true;
      }
    }
    paramContext = locald.eul.iterator();
    while (paramContext.hasNext())
    {
      localBaseUriSpanHandler = (URISpanHandlerSet.BaseUriSpanHandler)paramContext.next();
      if (localBaseUriSpanHandler.a(paramString, paramBoolean, paramt, paramBundle))
      {
        w.d("MicroMsg.URISpanHandler", "handleUriJump, %s handle", new Object[] { localBaseUriSpanHandler.getClass().getName() });
        locald.mContext = null;
        locald.euj.mContext = null;
        GMTrace.o(13007711109120L, 96915);
        return true;
      }
    }
    paramContext = locald.eum.iterator();
    while (paramContext.hasNext())
    {
      localBaseUriSpanHandler = (URISpanHandlerSet.BaseUriSpanHandler)paramContext.next();
      if (localBaseUriSpanHandler.a(paramString, paramBoolean, paramt, paramBundle))
      {
        w.d("MicroMsg.URISpanHandler", "handleUriJump, %s handle", new Object[] { localBaseUriSpanHandler.getClass().getName() });
        locald.mContext = null;
        locald.euj.mContext = null;
        GMTrace.o(13007711109120L, 96915);
        return true;
      }
    }
    locald.mContext = null;
    locald.euj.mContext = null;
    w.d("MicroMsg.URISpanHandler", "handleUriJump, nothing handle");
    GMTrace.o(13007711109120L, 96915);
    return false;
  }
  
  public final boolean a(Context paramContext, String paramString, boolean paramBoolean)
  {
    GMTrace.i(13007174238208L, 96911);
    paramBoolean = a(paramContext, paramString, paramBoolean, null);
    GMTrace.o(13007174238208L, 96911);
    return paramBoolean;
  }
  
  public final boolean a(Context paramContext, String paramString, boolean paramBoolean, Bundle paramBundle)
  {
    GMTrace.i(13007442673664L, 96913);
    paramBoolean = a(paramContext, paramString, paramBoolean, null, paramBundle);
    GMTrace.o(13007442673664L, 96913);
    return paramBoolean;
  }
  
  public final boolean a(Context paramContext, String paramString, boolean paramBoolean, t paramt)
  {
    GMTrace.i(13007308455936L, 96912);
    if (paramContext == null)
    {
      w.e("MicroMsg.MMURIJumpHandler", "jumpToURLWithCallback, context is null!");
      GMTrace.o(13007308455936L, 96912);
      return false;
    }
    if (paramString.startsWith("http"))
    {
      paramString = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
      paramString.addFlags(268435456);
      try
      {
        paramContext.startActivity(paramString);
        GMTrace.o(13007308455936L, 96912);
        return true;
      }
      catch (Exception paramContext)
      {
        for (;;)
        {
          w.e("MicroMsg.MMURIJumpHandler", "openLinkInBrowser fail:%s", new Object[] { paramContext.getMessage() });
        }
      }
    }
    if (!b(paramContext, paramString, paramBoolean, paramt))
    {
      w.w("MicroMsg.MMURIJumpHandler", "jumpToUI failed, uri:%s", new Object[] { paramString });
      GMTrace.o(13007308455936L, 96912);
      return false;
    }
    GMTrace.o(13007308455936L, 96912);
    return false;
  }
  
  public final boolean b(Context paramContext, String paramString, boolean paramBoolean, t paramt)
  {
    GMTrace.i(13007576891392L, 96914);
    paramBoolean = a(paramContext, paramString, paramBoolean, paramt, null);
    GMTrace.o(13007576891392L, 96914);
    return paramBoolean;
  }
  
  public final boolean b(Context paramContext, String paramString, Object... paramVarArgs)
  {
    GMTrace.i(13007845326848L, 96916);
    if (paramString == null)
    {
      w.d("MicroMsg.MMURIJumpHandler", "openSpecificUI uri is null");
      GMTrace.o(13007845326848L, 96916);
      return false;
    }
    if (paramContext == null)
    {
      w.e("MicroMsg.MMURIJumpHandler", "openSpecificUI, context is null");
      GMTrace.o(13007845326848L, 96916);
      return false;
    }
    Intent localIntent = new Intent();
    localIntent.addFlags(268435456);
    String str2 = paramString.replace("weixin://openSpecificView/", "");
    String str1 = null;
    paramString = str1;
    if (paramVarArgs != null)
    {
      paramString = str1;
      if (paramVarArgs.length > 0) {
        paramString = (Bundle)paramVarArgs[0];
      }
    }
    if (str2.equalsIgnoreCase("contacts"))
    {
      localIntent.addFlags(67108864);
      localIntent.putExtra("preferred_tab", 2);
      paramContext.startActivity(localIntent.setClass(paramContext, LauncherUI.class));
    }
    for (;;)
    {
      GMTrace.o(13007845326848L, 96916);
      return true;
      if (str2.equalsIgnoreCase("newfriend"))
      {
        com.tencent.mm.bj.d.b(paramContext, "subapp", ".ui.friend.FMessageConversationUI", localIntent);
      }
      else if (str2.equalsIgnoreCase("addfriend"))
      {
        com.tencent.mm.bj.d.b(paramContext, "subapp", ".ui.pluginapp.AddMoreFriendsUI", localIntent);
      }
      else if (str2.equalsIgnoreCase("searchbrand"))
      {
        paramString = new Intent();
        paramString.putExtra("Contact_Scene", 39);
        com.tencent.mm.bj.d.b(paramContext, "brandservice", ".ui.SearchOrRecommendBizUI", paramString);
      }
      else if (str2.equalsIgnoreCase("discover"))
      {
        localIntent.addFlags(67108864);
        localIntent.putExtra("preferred_tab", 1);
        paramContext.startActivity(localIntent.setClass(paramContext, LauncherUI.class));
      }
      else if (str2.equalsIgnoreCase("timeline"))
      {
        com.tencent.mm.bj.d.b(paramContext, "sns", ".ui.En_424b8e16", localIntent);
      }
      else if (str2.equalsIgnoreCase("scan"))
      {
        com.tencent.mm.bj.d.b(paramContext, "scanner", ".ui.BaseScanUI", localIntent);
      }
      else if (str2.equalsIgnoreCase("myprofile"))
      {
        com.tencent.mm.bj.d.b(paramContext, "setting", ".ui.setting.SettingsPersonalInfoUI", localIntent);
      }
      else if (str2.equalsIgnoreCase("myaccount"))
      {
        com.tencent.mm.bj.d.b(paramContext, "setting", ".ui.setting.SettingsAccountInfoUI", localIntent);
      }
      else if (str2.equalsIgnoreCase("bindphone"))
      {
        MMWizardActivity.A(paramContext, localIntent.setClass(paramContext, BindMContactIntroUI.class));
      }
      else if (str2.equalsIgnoreCase("privacy"))
      {
        com.tencent.mm.bj.d.b(paramContext, "setting", ".ui.setting.SettingsPrivacyUI", localIntent);
      }
      else if (str2.equalsIgnoreCase("general"))
      {
        com.tencent.mm.bj.d.b(paramContext, "setting", ".ui.setting.SettingsAboutSystemUI", localIntent);
      }
      else
      {
        if (!str2.equalsIgnoreCase("invitevoip")) {
          break;
        }
        VoipAddressUI.fx(paramContext);
      }
    }
    if (str2.equalsIgnoreCase("expose")) {
      if (paramString == null) {
        break label836;
      }
    }
    label814:
    label830:
    label836:
    for (paramString = paramString.getString("url");; paramString = "")
    {
      localIntent.putExtra("k_expose_url", paramString);
      localIntent.putExtra("k_username", q.zE());
      localIntent.putExtra("showShare", false);
      localIntent.putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(34) }));
      com.tencent.mm.bj.d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
      break;
      if (str2.equalsIgnoreCase("shakecard")) {
        if (paramString == null) {
          break label830;
        }
      }
      for (paramString = paramString.getString("extinfo");; paramString = "")
      {
        localIntent.putExtra("key_shake_card_from_scene", 3);
        localIntent.putExtra("shake_card", true);
        localIntent.putExtra("key_shake_card_ext_info", paramString);
        com.tencent.mm.bj.d.b(paramContext, "shake", ".ui.ShakeReportUI", localIntent);
        break;
        if (str2.equalsIgnoreCase("cardlistview"))
        {
          com.tencent.mm.bj.d.b(paramContext, "card", ".ui.CardHomePageUI", localIntent);
          break;
        }
        if (str2.equalsIgnoreCase("uploadlog"))
        {
          str1 = q.zE();
          paramVarArgs = str1;
          if (bg.nm(str1)) {
            paramVarArgs = "weixin";
          }
          if (paramString != null) {}
          for (;;)
          {
            try
            {
              i = bg.getInt(paramString.getString("extinfo"), 0);
              if ((!at.AU()) || (at.wF())) {
                break label814;
              }
              bool = true;
              w.i("MicroMsg.MMURIJumpHandler", "upload log from jsapi, before upload, is-login:%b, time:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i) });
              paramString = new Intent(paramContext, JSAPIUploadLogHelperUI.class);
              paramString.putExtra("key_user", paramVarArgs);
              paramString.putExtra("key_time", i);
              paramContext.startActivity(paramString);
            }
            catch (Exception paramString) {}
            int i = 0;
            continue;
            boolean bool = false;
          }
        }
        GMTrace.o(13007845326848L, 96916);
        return false;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\app\plugin\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */