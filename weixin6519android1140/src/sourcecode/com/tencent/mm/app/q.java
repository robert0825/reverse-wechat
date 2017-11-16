package com.tencent.mm.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.booter.notification.f;
import com.tencent.mm.booter.notification.f.a;
import com.tencent.mm.booter.notification.queue.b;
import com.tencent.mm.g.a.ol;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.v;
import com.tencent.mm.pluginsdk.ui.applet.e.a;
import com.tencent.mm.pluginsdk.ui.applet.o.a;
import com.tencent.mm.pluginsdk.ui.d.o;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.account.LoginIndepPass;
import com.tencent.mm.ui.account.LoginPasswordUI;
import com.tencent.mm.ui.account.LoginUI;
import com.tencent.mm.ui.account.RegByMobileVoiceVerifyUI;
import com.tencent.mm.ui.account.SimpleLoginUI;
import com.tencent.mm.ui.account.mobile.MobileInputUI;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.bindmobile.BindMContactIntroUI;
import com.tencent.mm.ui.bindmobile.BindMContactUI;
import com.tencent.mm.ui.bindqq.BindQQUI;
import com.tencent.mm.ui.chatting.En_5b8fbb1e;
import com.tencent.mm.ui.contact.ContactRemarkInfoModUI;
import com.tencent.mm.ui.contact.ModRemarkNameUI;
import com.tencent.mm.ui.contact.SnsLabelContactListUI;
import com.tencent.mm.ui.contact.e;
import com.tencent.mm.ui.tools.CountryCodeUI;
import com.tencent.mm.ui.tools.ShowImageUI;
import com.tencent.mm.ui.tools.a.a;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.ui.transmit.SelectConversationUI;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.s;

public final class q
  implements m
{
  public q()
  {
    GMTrace.i(12980733345792L, 96714);
    GMTrace.o(12980733345792L, 96714);
  }
  
  public final void a(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    GMTrace.i(12983820353536L, 96737);
    if (paramActivity != null)
    {
      paramIntent.setClassName(paramActivity, "com.tencent.mm.ui.tools.CropImageNewUI");
      paramActivity.startActivityForResult(paramIntent, paramInt);
    }
    GMTrace.o(12983820353536L, 96737);
  }
  
  public final void a(Activity paramActivity, Intent paramIntent1, Intent paramIntent2, String paramString, int paramInt, a.a parama)
  {
    GMTrace.i(12983954571264L, 96738);
    if (paramActivity != null)
    {
      paramIntent2.setClassName(paramActivity, "com.tencent.mm.ui.tools.CropImageNewUI");
      com.tencent.mm.ui.tools.a.b(paramActivity, paramIntent1, paramIntent2, paramString, paramInt, parama);
    }
    GMTrace.o(12983954571264L, 96738);
  }
  
  public final void a(Context paramContext, Intent paramIntent1, Intent paramIntent2)
  {
    GMTrace.i(12987041579008L, 96761);
    if ((paramContext == null) || (paramIntent1 == null))
    {
      GMTrace.o(12987041579008L, 96761);
      return;
    }
    int i = paramIntent1.getIntExtra("from_source", 1);
    if (i == 1)
    {
      paramIntent1.setClass(paramContext, LoginUI.class);
      paramContext.startActivity(paramIntent1);
      GMTrace.o(12987041579008L, 96761);
      return;
    }
    if (i == 2)
    {
      paramIntent1.setClass(paramContext, LoginPasswordUI.class);
      paramContext.startActivity(paramIntent1);
      GMTrace.o(12987041579008L, 96761);
      return;
    }
    if (i == 3)
    {
      paramIntent1.setClass(paramContext, SimpleLoginUI.class);
      if (paramIntent2 != null)
      {
        MMWizardActivity.b(paramContext, paramIntent1, paramIntent2);
        GMTrace.o(12987041579008L, 96761);
        return;
      }
      MMWizardActivity.A(paramContext, paramIntent1);
      GMTrace.o(12987041579008L, 96761);
      return;
    }
    if (i == 5)
    {
      paramIntent1.setClass(paramContext, LoginIndepPass.class);
      paramContext.startActivity(paramIntent1);
      GMTrace.o(12987041579008L, 96761);
      return;
    }
    if (i == 6)
    {
      paramIntent1.setClass(paramContext, MobileInputUI.class);
      paramIntent1.putExtra("mobile_input_purpose", 1);
      paramIntent1.putExtra("mobile_auth_type", 7);
      paramContext.startActivity(paramIntent1);
    }
    GMTrace.o(12987041579008L, 96761);
  }
  
  public final void a(Intent paramIntent, int paramInt, Activity paramActivity)
  {
    GMTrace.i(12983686135808L, 96736);
    if (paramActivity != null) {
      com.tencent.mm.bj.d.b(paramActivity, "location", ".ui.RedirectUI", paramIntent, 4097);
    }
    GMTrace.o(12983686135808L, 96736);
  }
  
  public final void a(Intent paramIntent1, int paramInt, MMActivity paramMMActivity, Intent paramIntent2)
  {
    GMTrace.i(12983283482624L, 96733);
    if (paramMMActivity != null)
    {
      paramIntent1.setClassName(paramMMActivity, "com.tencent.mm.ui.tools.CropImageNewUI");
      at.AR();
      com.tencent.mm.ui.tools.a.a(paramMMActivity, paramIntent2, paramIntent1, c.yU(), paramInt);
    }
    GMTrace.o(12983283482624L, 96733);
  }
  
  public final void a(Intent paramIntent, Activity paramActivity)
  {
    GMTrace.i(12984491442176L, 96742);
    if (paramActivity != null)
    {
      paramIntent.setClass(paramActivity, ModRemarkNameUI.class);
      paramActivity.startActivityForResult(paramIntent, 2);
    }
    GMTrace.o(12984491442176L, 96742);
  }
  
  public final void a(Intent paramIntent, Activity paramActivity, int paramInt)
  {
    GMTrace.i(12985833619456L, 96752);
    if (paramActivity != null)
    {
      paramIntent.setClassName(paramActivity, "com.tencent.mm.ui.contact.SnsAddressUI");
      paramActivity.startActivityForResult(paramIntent, paramInt);
    }
    GMTrace.o(12985833619456L, 96752);
  }
  
  public final void a(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(12980867563520L, 96715);
    if (paramContext == null)
    {
      GMTrace.o(12980867563520L, 96715);
      return;
    }
    paramIntent.setClassName(paramContext, "com.tencent.mm.ui.contact.SayHiEditUI");
    paramContext.startActivity(paramIntent);
    GMTrace.o(12980867563520L, 96715);
  }
  
  public final void a(Intent paramIntent, MMActivity.a parama, MMActivity paramMMActivity)
  {
    GMTrace.i(12987981103104L, 96768);
    if (paramMMActivity != null)
    {
      paramIntent.setClassName(paramMMActivity, "com.tencent.mm.ui.CheckCanSubscribeBizUI");
      paramMMActivity.a(parama, paramIntent, 8);
    }
    GMTrace.o(12987981103104L, 96768);
  }
  
  public final void a(Intent paramIntent, MMActivity paramMMActivity)
  {
    GMTrace.i(12983149264896L, 96732);
    paramIntent.setClass(paramMMActivity, SelectConversationUI.class);
    paramMMActivity.startActivityForResult(paramIntent, 1);
    GMTrace.o(12983149264896L, 96732);
  }
  
  public final void a(final MMActivity paramMMActivity, final String paramString1, final WXMediaMessage paramWXMediaMessage, final String paramString2, final String paramString3)
  {
    GMTrace.i(12983015047168L, 96731);
    String str = paramMMActivity.getResources().getString(R.l.cTB);
    Object localObject = paramWXMediaMessage.title;
    str = str + (String)localObject;
    localObject = new e.a(paramMMActivity);
    ((e.a)localObject).bA(paramString2).Pi(str).zf(R.l.diw);
    {
      public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
      {
        GMTrace.i(13003013488640L, 96880);
        if (!paramAnonymousBoolean)
        {
          GMTrace.o(13003013488640L, 96880);
          return;
        }
        l.a(paramWXMediaMessage, paramString1, paramString3, paramString2, 3, null);
        if (!bg.nm(paramAnonymousString))
        {
          ol localol = new ol();
          localol.eTx.eTy = paramString2;
          localol.eTx.content = paramAnonymousString;
          localol.eTx.type = s.go(paramString2);
          localol.eTx.flags = 0;
          com.tencent.mm.sdk.b.a.vgX.m(localol);
        }
        h.bm(paramMMActivity, paramMMActivity.getResources().getString(R.l.cUy));
        g.ork.A(10910, "2");
        GMTrace.o(13003013488640L, 96880);
      }
    }.show();
    GMTrace.o(12983015047168L, 96731);
  }
  
  public final void a(MMWizardActivity paramMMWizardActivity, Intent paramIntent)
  {
    GMTrace.i(12986638925824L, 96758);
    if (paramMMWizardActivity == null)
    {
      GMTrace.o(12986638925824L, 96758);
      return;
    }
    paramIntent.setClass(paramMMWizardActivity, MobileInputUI.class);
    MMWizardActivity.A(paramMMWizardActivity, paramIntent);
    GMTrace.o(12986638925824L, 96758);
  }
  
  public final void a(String paramString, Intent paramIntent, Context paramContext)
  {
    GMTrace.i(12982612393984L, 96728);
    paramIntent.putExtra("Ksnsupload_type", 0);
    paramIntent.putExtra("sns_kemdia_path", paramString);
    com.tencent.mm.bj.d.b(paramContext, "sns", ".ui.En_c4f742e5", paramIntent);
    GMTrace.o(12982612393984L, 96728);
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2, Context paramContext, String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(12986102054912L, 96754);
    if ((paramBoolean1) || (paramBoolean2))
    {
      if (!com.tencent.mm.pluginsdk.k.b.a.a.b(paramString, paramContext, paramBoolean2))
      {
        Toast.makeText(paramContext, paramContext.getString(R.l.egz), 0).show();
        GMTrace.o(12986102054912L, 96754);
      }
    }
    else
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("VideoPlayer_File_nam", paramString);
      localIntent.putExtra("VideoRecorder_VideoLength", paramInt1);
      localIntent.putExtra("VideoRecorder_VideoSize", paramInt2);
      com.tencent.mm.bj.d.b(paramContext, "subapp", ".ui.video.VideoPlayerUI", localIntent);
    }
    GMTrace.o(12986102054912L, 96754);
  }
  
  public final boolean a(Context paramContext, String paramString, Object... paramVarArgs)
  {
    GMTrace.i(12987846885376L, 96767);
    boolean bool = p.a.tme.b(paramContext, paramString, paramVarArgs);
    GMTrace.o(12987846885376L, 96767);
    return bool;
  }
  
  public final i an(Context paramContext)
  {
    GMTrace.i(12982343958528L, 96726);
    paramContext = MMAppMgr.an(paramContext);
    GMTrace.o(12982343958528L, 96726);
    return paramContext;
  }
  
  public final Intent ao(Context paramContext)
  {
    GMTrace.i(12985028313088L, 96746);
    paramContext = new Intent(paramContext, LauncherUI.class).addFlags(67108864);
    GMTrace.o(12985028313088L, 96746);
    return paramContext;
  }
  
  public final void ap(Context paramContext)
  {
    GMTrace.i(12985162530816L, 96747);
    com.tencent.mm.bj.d.b(paramContext, "setting", ".ui.setting.SelfQRCodeUI", new Intent());
    GMTrace.o(12985162530816L, 96747);
  }
  
  public final void aq(Context paramContext)
  {
    GMTrace.i(12986236272640L, 96755);
    com.tencent.mm.bj.d.b(paramContext, "subapp", ".ui.openapi.AddAppUI", new Intent());
    GMTrace.o(12986236272640L, 96755);
  }
  
  public final void b(Intent paramIntent, Activity paramActivity)
  {
    GMTrace.i(12984625659904L, 96743);
    if (paramActivity != null)
    {
      paramIntent.setClass(paramActivity, CountryCodeUI.class);
      paramActivity.startActivityForResult(paramIntent, 100);
    }
    GMTrace.o(12984625659904L, 96743);
  }
  
  public final void b(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(12981001781248L, 96716);
    if (paramContext == null)
    {
      GMTrace.o(12981001781248L, 96716);
      return;
    }
    Intent localIntent = paramIntent;
    if (paramIntent == null) {
      localIntent = new Intent();
    }
    com.tencent.mm.bj.d.a(paramContext, ".ui.tools.MultiStageCitySelectUI", localIntent);
    GMTrace.o(12981001781248L, 96716);
  }
  
  public final void b(MMWizardActivity paramMMWizardActivity, Intent paramIntent)
  {
    GMTrace.i(12986907361280L, 96760);
    if (paramMMWizardActivity == null)
    {
      GMTrace.o(12986907361280L, 96760);
      return;
    }
    paramIntent.setClass(paramMMWizardActivity, BindMContactUI.class);
    MMWizardActivity.A(paramMMWizardActivity, paramIntent);
    GMTrace.o(12986907361280L, 96760);
  }
  
  public final boolean b(Context paramContext, String paramString, Bundle paramBundle)
  {
    GMTrace.i(12983417700352L, 96734);
    boolean bool = p.a.tme.a(paramContext, paramString, false, paramBundle);
    GMTrace.o(12983417700352L, 96734);
    return bool;
  }
  
  public final void c(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(12986370490368L, 96756);
    if (paramContext != null)
    {
      paramIntent.setClass(paramContext, ShowImageUI.class);
      paramContext.startActivity(paramIntent);
    }
    GMTrace.o(12986370490368L, 96756);
  }
  
  public final void c(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(12981135998976L, 96717);
    if (paramContext == null)
    {
      GMTrace.o(12981135998976L, 96717);
      return;
    }
    Intent localIntent = paramIntent;
    if (paramIntent == null) {
      localIntent = new Intent();
    }
    com.tencent.mm.bj.d.b(paramContext, "setting", ".ui.setting.EditSignatureUI", localIntent);
    GMTrace.o(12981135998976L, 96717);
  }
  
  public final void cancelNotification(String paramString)
  {
    GMTrace.i(12988249538560L, 96770);
    f localf = f.a.fKW;
    if (paramString != null)
    {
      int i = b.rH().getId(paramString);
      w.d("MicroMsg.Notification.Handle", "cancel : %s", new Object[] { paramString });
      b.rH().cancel(i);
    }
    GMTrace.o(12988249538560L, 96770);
  }
  
  public final void d(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(12986504708096L, 96757);
    if (paramContext == null)
    {
      GMTrace.o(12986504708096L, 96757);
      return;
    }
    com.tencent.mm.bj.d.b(paramContext, "safedevice", ".ui.MySafeDeviceListUI", paramIntent);
    GMTrace.o(12986504708096L, 96757);
  }
  
  public final void d(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(12981270216704L, 96718);
    if (paramContext == null)
    {
      GMTrace.o(12981270216704L, 96718);
      return;
    }
    Intent localIntent = paramIntent;
    if (paramIntent == null) {
      localIntent = new Intent();
    }
    com.tencent.mm.bj.d.b(paramContext, "profile", ".ui.ContactInfoUI", localIntent);
    GMTrace.o(12981270216704L, 96718);
  }
  
  public final void e(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(12986773143552L, 96759);
    if (paramContext == null)
    {
      GMTrace.o(12986773143552L, 96759);
      return;
    }
    paramIntent.setClass(paramContext, RegByMobileVoiceVerifyUI.class);
    paramContext.startActivity(paramIntent);
    GMTrace.o(12986773143552L, 96759);
  }
  
  public final void e(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(12981404434432L, 96719);
    if (paramContext == null)
    {
      GMTrace.o(12981404434432L, 96719);
      return;
    }
    Intent localIntent = paramIntent;
    if (paramIntent == null) {
      localIntent = new Intent();
    }
    paramIntent = localIntent.getStringExtra("Contact_User");
    if (paramIntent != null) {
      e.a(localIntent, paramIntent);
    }
    localIntent.setClass(paramContext, En_5b8fbb1e.class);
    paramContext.startActivity(localIntent);
    GMTrace.o(12981404434432L, 96719);
  }
  
  public final void f(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(12987175796736L, 96762);
    if (paramContext == null)
    {
      GMTrace.o(12987175796736L, 96762);
      return;
    }
    com.tencent.mm.bj.d.a(paramContext, "safedevice", ".ui.SecurityAccountIntroUI", paramIntent);
    GMTrace.o(12987175796736L, 96762);
  }
  
  public final void f(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(12981538652160L, 96720);
    if (paramContext == null)
    {
      GMTrace.o(12981538652160L, 96720);
      return;
    }
    paramIntent.setClass(paramContext, En_5b8fbb1e.class);
    if ((paramContext instanceof Activity))
    {
      ((Activity)paramContext).startActivityForResult(paramIntent, 1);
      GMTrace.o(12981538652160L, 96720);
      return;
    }
    paramContext.startActivity(paramIntent);
    GMTrace.o(12981538652160L, 96720);
  }
  
  public final void g(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(12987712667648L, 96766);
    if (paramContext == null)
    {
      GMTrace.o(12987712667648L, 96766);
      return;
    }
    paramIntent.setClassName(paramContext, "com.tencent.mm.ui.contact.SelectSpecialContactUI");
    paramContext.startActivity(paramIntent);
    GMTrace.o(12987712667648L, 96766);
  }
  
  public final void g(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(12981672869888L, 96721);
    if (paramContext == null)
    {
      GMTrace.o(12981672869888L, 96721);
      return;
    }
    paramIntent.setClass(paramContext, BindMContactIntroUI.class);
    MMWizardActivity.A(paramContext, paramIntent);
    GMTrace.o(12981672869888L, 96721);
  }
  
  public final void h(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(12981807087616L, 96722);
    if (paramContext == null)
    {
      GMTrace.o(12981807087616L, 96722);
      return;
    }
    Intent localIntent = paramIntent;
    if (paramIntent == null) {
      localIntent = new Intent();
    }
    localIntent.setClass(paramContext, BindQQUI.class);
    MMWizardActivity.A(paramContext, localIntent);
    GMTrace.o(12981807087616L, 96722);
  }
  
  public final void i(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(12981941305344L, 96723);
    if (paramContext == null)
    {
      GMTrace.o(12981941305344L, 96723);
      return;
    }
    paramIntent.setClass(paramContext, LauncherUI.class).addFlags(67108864);
    paramContext.startActivity(paramIntent);
    GMTrace.o(12981941305344L, 96723);
  }
  
  public final void j(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(12982075523072L, 96724);
    if (paramContext == null)
    {
      GMTrace.o(12982075523072L, 96724);
      return;
    }
    Intent localIntent = paramIntent;
    if (paramIntent == null) {
      localIntent = new Intent();
    }
    com.tencent.mm.bj.d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
    GMTrace.o(12982075523072L, 96724);
  }
  
  public final void k(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(12982209740800L, 96725);
    o.d(paramContext, paramIntent.getBundleExtra("reportArgs"));
    GMTrace.o(12982209740800L, 96725);
  }
  
  public final void l(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(12982478176256L, 96727);
    if (paramContext != null)
    {
      if (paramIntent.getIntExtra("Retr_Msg_Type", -1) < 0) {
        paramIntent.putExtra("Retr_Msg_Type", 4);
      }
      paramIntent.setClass(paramContext, MsgRetransmitUI.class);
      paramContext.startActivity(paramIntent);
    }
    GMTrace.o(12982478176256L, 96727);
  }
  
  public final void m(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(12982746611712L, 96729);
    if (paramContext != null)
    {
      paramIntent.putExtra("Ksnsupload_type", 1);
      com.tencent.mm.bj.d.b(paramContext, "sns", ".ui.En_c4f742e5", paramIntent);
    }
    GMTrace.o(12982746611712L, 96729);
  }
  
  public final void n(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(12982880829440L, 96730);
    if (paramContext != null)
    {
      paramIntent.putExtra("Ksnsupload_type", 2);
      com.tencent.mm.bj.d.b(paramContext, "sns", ".ui.En_c4f742e5", paramIntent);
    }
    GMTrace.o(12982880829440L, 96730);
  }
  
  public final void o(Context paramContext, String paramString)
  {
    GMTrace.i(12988383756288L, 96771);
    p.a.tme.a(paramContext, paramString, true);
    GMTrace.o(12988383756288L, 96771);
  }
  
  public final void o(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(12983551918080L, 96735);
    if (paramContext != null) {
      com.tencent.mm.bj.d.b(paramContext, "location", ".ui.RedirectUI", paramIntent);
    }
    GMTrace.o(12983551918080L, 96735);
  }
  
  public final void p(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(12984223006720L, 96740);
    if (paramContext != null)
    {
      paramIntent.setClass(paramContext, ContactRemarkInfoModUI.class);
      paramContext.startActivity(paramIntent);
    }
    GMTrace.o(12984223006720L, 96740);
  }
  
  public final void pu()
  {
    GMTrace.i(12988115320832L, 96769);
    MMAppMgr.pu();
    GMTrace.o(12988115320832L, 96769);
  }
  
  public final void q(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(12984357224448L, 96741);
    if (paramContext != null)
    {
      paramIntent.setClass(paramContext, ModRemarkNameUI.class);
      paramContext.startActivity(paramIntent);
    }
    GMTrace.o(12984357224448L, 96741);
  }
  
  public final void r(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(12984759877632L, 96744);
    if (paramContext != null) {
      com.tencent.mm.bj.d.b(paramContext, "setting", ".ui.setting.SettingsLanguageUI", paramIntent);
    }
    GMTrace.o(12984759877632L, 96744);
  }
  
  public final void s(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(12984894095360L, 96745);
    if ((paramIntent != null) && (paramContext != null))
    {
      paramIntent.setClass(paramContext, LauncherUI.class).addFlags(67108864);
      paramContext.startActivity(paramIntent);
    }
    GMTrace.o(12984894095360L, 96745);
  }
  
  public final void t(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(12985296748544L, 96748);
    Intent localIntent = new Intent();
    localIntent.putExtras(paramIntent.getExtras());
    if (paramIntent.getFlags() != 0) {
      localIntent.addFlags(paramIntent.getFlags());
    }
    com.tencent.mm.bj.d.b(paramContext, "subapp", ".ui.gallery.GestureGalleryUI", localIntent);
    GMTrace.o(12985296748544L, 96748);
  }
  
  public final void u(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(12985430966272L, 96749);
    Intent localIntent = new Intent();
    localIntent.putExtras(paramIntent.getExtras());
    if (paramIntent.getFlags() != 0) {
      localIntent.addFlags(paramIntent.getFlags());
    }
    com.tencent.mm.pluginsdk.d.dF(paramContext);
    GMTrace.o(12985430966272L, 96749);
  }
  
  public final void v(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(12985565184000L, 96750);
    if (paramContext != null)
    {
      Intent localIntent = new Intent();
      localIntent.putExtras(paramIntent.getExtras());
      if (paramIntent.getFlags() != 0) {
        localIntent.addFlags(paramIntent.getFlags());
      }
      com.tencent.mm.bj.d.b(paramContext, "subapp", ".ui.pluginapp.ContactSearchUI", localIntent);
    }
    GMTrace.o(12985565184000L, 96750);
  }
  
  public final void w(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(12985699401728L, 96751);
    if (paramContext != null)
    {
      Intent localIntent = new Intent();
      localIntent.putExtras(paramIntent.getExtras());
      if (paramIntent.getFlags() != 0) {
        localIntent.addFlags(paramIntent.getFlags());
      }
      com.tencent.mm.bj.d.b(paramContext, "subapp", ".ui.pluginapp.ContactSearchResultUI", localIntent);
    }
    GMTrace.o(12985699401728L, 96751);
  }
  
  public final void x(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(12985967837184L, 96753);
    paramIntent.setClass(paramContext, SnsLabelContactListUI.class);
    paramContext.startActivity(paramIntent);
    GMTrace.o(12985967837184L, 96753);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\app\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */