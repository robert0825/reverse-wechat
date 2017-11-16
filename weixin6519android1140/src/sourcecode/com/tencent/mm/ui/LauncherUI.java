package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.Process;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.BaseEvent;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.app.MMApplicationLike;
import com.tencent.mm.booter.CoreService;
import com.tencent.mm.booter.NotifyReceiver;
import com.tencent.mm.g.a.ax;
import com.tencent.mm.g.a.ax.b;
import com.tencent.mm.g.a.ba;
import com.tencent.mm.g.a.ep;
import com.tencent.mm.g.a.in;
import com.tencent.mm.g.a.iq;
import com.tencent.mm.kernel.b.3;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.j.a.b.o;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.p;
import com.tencent.mm.pluginsdk.p.r;
import com.tencent.mm.pluginsdk.p.s;
import com.tencent.mm.pluginsdk.p.u;
import com.tencent.mm.pluginsdk.p.x;
import com.tencent.mm.pluginsdk.ui.VoiceSearchLayout;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.account.WelcomeSelectView;
import com.tencent.mm.ui.account.WelcomeView;
import com.tencent.mm.ui.base.CustomViewPager;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.ui.chatting.En_5b8fbb1e.a;
import com.tencent.mm.ui.tools.TestTimeForChatting;
import com.tencent.mm.xlog.app.XLogSetup;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bf;
import com.tencent.mm.y.bt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@com.tencent.mm.ui.base.a(3)
@TargetApi(11)
public class LauncherUI
  extends MMFragmentActivity
{
  private static ArrayList<LauncherUI> vJf;
  private static boolean vJg;
  public static long vJh;
  private Intent eLY;
  public HomeUI vJi;
  private d vJj;
  private m vJk;
  public boolean vJl;
  boolean vJm;
  private boolean vJn;
  private com.tencent.mm.pluginsdk.r vJo;
  private WelcomeView vJp;
  private ae vJq;
  private boolean yvT;
  
  static
  {
    GMTrace.i(1701209702400L, 12675);
    vJf = new ArrayList();
    vJg = true;
    GMTrace.o(1701209702400L, 12675);
  }
  
  public LauncherUI()
  {
    GMTrace.i(1682821873664L, 12538);
    this.vJi = new HomeUI();
    this.vJj = new d(this.vJi);
    this.vJk = new m();
    this.eLY = null;
    this.vJl = false;
    this.vJm = false;
    this.vJn = false;
    this.vJo = new com.tencent.mm.pluginsdk.r("MicroMsg.LauncherUI");
    this.yvT = false;
    this.vJq = new ae();
    GMTrace.o(1682821873664L, 12538);
  }
  
  private void ak(Intent paramIntent)
  {
    GMTrace.i(1688056365056L, 12577);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "handleJump");
    if (!at.AU())
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "handleJump not accHhasReady");
      startActivity(new Intent(this, LauncherUI.class).putExtra("Intro_Switch", true).addFlags(67108864));
      finish();
      GMTrace.o(1688056365056L, 12577);
      return;
    }
    Object localObject1 = new in();
    ((in)localObject1).eLX.eLY = this.eLY;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
    if ("talkroom_notification".equals(com.tencent.mm.sdk.platformtools.s.i(paramIntent, "nofification_type")))
    {
      paramIntent = com.tencent.mm.sdk.platformtools.s.i(paramIntent, "enter_chat_usrname");
      if (!com.tencent.mm.platformtools.t.nm(paramIntent))
      {
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("enter_room_username", paramIntent);
        ((Intent)localObject1).setFlags(268435456);
        com.tencent.mm.bj.d.b(this, "talkroom", ".ui.TalkRoomUI", (Intent)localObject1);
      }
      GMTrace.o(1688056365056L, 12577);
      return;
    }
    if ("back_to_pcmgr_notification".equals(paramIntent.getStringExtra("nofification_type")))
    {
      if (!paramIntent.getBooleanExtra("newPCBackup", true)) {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "summerbak jump BakToPcUI");
      }
      for (paramIntent = new Intent().setClassName(this, "com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakToPcUI");; paramIntent = new Intent().setClassName(this, "com.tencent.mm.plugin.backup.backuppcui.BackupPcUI"))
      {
        paramIntent.setFlags(268435456);
        MMWizardActivity.A(this, paramIntent);
        GMTrace.o(1688056365056L, 12577);
        return;
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "summerbak jump BackupPcUI");
      }
    }
    if ("back_to_pcmgr_error_notification".equals(paramIntent.getStringExtra("nofification_type")))
    {
      paramIntent = new Intent().setClassName(this, "com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakConnErrorUI");
      paramIntent.setFlags(268435456);
      MMWizardActivity.A(this, paramIntent);
      GMTrace.o(1688056365056L, 12577);
      return;
    }
    if ("backup_move_notification".equals(paramIntent.getStringExtra("nofification_type")))
    {
      paramIntent = new Intent().setClassName(this, "com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI");
      paramIntent.setFlags(268435456);
      MMWizardActivity.A(this, paramIntent);
      GMTrace.o(1688056365056L, 12577);
      return;
    }
    int i;
    String str;
    int j;
    if (com.tencent.mm.sdk.platformtools.s.a(paramIntent, "show_update_dialog", false))
    {
      i = com.tencent.mm.sdk.platformtools.s.a(paramIntent, "update_type", -1);
      if (i == -1) {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.LauncherUI", "showUpdateDialog is true, but updateType is -1");
      }
    }
    else
    {
      str = com.tencent.mm.sdk.platformtools.s.i(paramIntent, "Main_User");
      int k = 0;
      j = 0;
      i = k;
      if (str != null)
      {
        i = k;
        if (!str.equals(""))
        {
          at.AR();
          localObject1 = com.tencent.mm.y.c.yP().TO(str);
          i = j;
          if (localObject1 != null) {
            i = ((com.tencent.mm.g.b.aj)localObject1).field_unReadCount;
          }
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "[oneliang] user:%s, conversation :%s, unReadCount:%s", new Object[] { str, localObject1, Integer.valueOf(i) });
        }
      }
      j = i;
      if (i == 0) {
        j = com.tencent.mm.sdk.platformtools.s.a(paramIntent, "pushcontent_unread_count", 0);
      }
      MMAppMgr.pu();
      com.tencent.mm.sdk.b.a.vgX.m(new com.tencent.mm.g.a.ac());
      boolean bool = com.tencent.mm.sdk.platformtools.s.a(paramIntent, "Intro_Is_Muti_Talker", true);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "handleJump, isMutiTalker:%b, unReadCount:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(j) });
      if ((!bool) && (j > 0))
      {
        i = com.tencent.mm.sdk.platformtools.s.a(paramIntent, "Intro_Bottle_unread_count", 0);
        if (i > 0)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "handleJump, bottleReadCnt :%d", new Object[] { Integer.valueOf(i) });
          com.tencent.mm.bj.d.x(this, "bottle", ".ui.BottleConversationUI");
        }
      }
      if ((bool) || (j <= 0)) {
        break label1203;
      }
      if (!com.tencent.mm.y.s.fT(str)) {
        break label843;
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "handleJump, isReaderAppNewsHelper");
      localObject1 = new Intent();
      ((Intent)localObject1).addFlags(67108864);
      ((Intent)localObject1).putExtra("type", 20);
      com.tencent.mm.bj.d.b(this, "readerapp", ".ui.ReaderAppUI", (Intent)localObject1);
    }
    for (;;)
    {
      if (com.tencent.mm.sdk.platformtools.s.a(paramIntent, "kstyle_show_bind_mobile_afterauth", 0) > 0)
      {
        localObject1 = new Intent();
        ((Intent)localObject1).setClassName(this, "com.tencent.mm.ui.account.bind.BindMobileUI");
        ((Intent)localObject1).putExtra("kstyle_bind_recommend_show", paramIntent.getIntExtra("kstyle_bind_recommend_show", 0));
        ((Intent)localObject1).putExtra("kstyle_bind_wording", paramIntent.getParcelableExtra("kstyle_bind_wording"));
        MMWizardActivity.A(this, (Intent)localObject1);
      }
      GMTrace.o(1688056365056L, 12577);
      return;
      g.ork.a(405L, 28L, 1L, true);
      if (p.x.bIV() == null) {
        break;
      }
      localObject1 = p.x.bIV().a(this, null);
      if (localObject1 == null) {
        break;
      }
      Object localObject2 = g.ork;
      if (i == 2) {}
      for (long l = 29L;; l = 30L)
      {
        ((g)localObject2).a(405L, l, 1L, true);
        ((p.s)localObject1).update(i);
        break;
      }
      label843:
      if (com.tencent.mm.y.s.gb(str))
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "handleJump, isReaderAppWeiboHelper");
        localObject1 = new Intent();
        ((Intent)localObject1).addFlags(67108864);
        ((Intent)localObject1).putExtra("type", 11);
        com.tencent.mm.bj.d.b(this, "readerapp", ".ui.ReaderAppUI", (Intent)localObject1);
      }
      else
      {
        j = paramIntent.getIntExtra("MainUI_User_Last_Msg_Type", 34);
        i = 1;
        if (j == 34) {
          i = 2;
        }
        localObject1 = new Bundle();
        ((Bundle)localObject1).putInt("Chat_Mode", i);
        if ("new_msg_nofification".equals(com.tencent.mm.sdk.platformtools.s.i(paramIntent, "nofification_type"))) {
          ((Bundle)localObject1).putInt("chat_from_scene", 1);
        }
        localObject2 = bXe();
        if (localObject2 != null) {
          if (com.tencent.mm.af.f.dL(str))
          {
            paramIntent.putExtra("Contact_User", str);
            paramIntent.addFlags(67108864);
            paramIntent.putExtra("biz_chat_from_scene", 4);
            com.tencent.mm.bj.d.a(this, ".ui.bizchat.BizChatConversationUI", paramIntent);
          }
          else
          {
            if (com.tencent.mm.af.f.iQ(str))
            {
              localObject1 = com.tencent.mm.af.f.iK(str);
              if (localObject1 == null) {}
              for (localObject1 = null;; localObject1 = ((com.tencent.mm.af.d)localObject1).EJ())
              {
                localObject2 = localObject1;
                if (localObject1 == null) {
                  localObject2 = "";
                }
                paramIntent.putExtra("rawUrl", (String)localObject2);
                paramIntent.putExtra("useJs", true);
                paramIntent.putExtra("srcUsername", str);
                paramIntent.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
                paramIntent.addFlags(67108864);
                com.tencent.mm.bj.d.b(this, "webview", ".ui.tools.WebViewUI", paramIntent);
                break;
              }
            }
            if (com.tencent.mm.storage.x.eU(str))
            {
              paramIntent.putExtra("Contact_User", str);
              paramIntent.addFlags(67108864);
              paramIntent.putExtra("app_brand_conversation_from_scene", 3);
              paramIntent.putExtra("finish_direct", true);
              paramIntent.putExtra("key_need_send_video", false);
              com.tencent.mm.bj.d.a(this, ".ui.conversation.AppBrandServiceConversationUI", paramIntent);
            }
            else
            {
              ((LauncherUI)localObject2).a(str, (Bundle)localObject1, false);
              continue;
              label1203:
              if (com.tencent.mm.sdk.platformtools.s.a(paramIntent, "From_fail_notify", false))
              {
                if (!com.tencent.mm.platformtools.t.nm(str))
                {
                  localObject1 = bXe();
                  if (localObject1 != null)
                  {
                    localObject2 = new Bundle();
                    ((Bundle)localObject2).putBoolean("Chat_Mode", com.tencent.mm.sdk.platformtools.s.a(paramIntent, "resend_fail_messages", false));
                    if (com.tencent.mm.af.f.dL(str))
                    {
                      paramIntent.putExtra("Contact_User", str);
                      paramIntent.addFlags(67108864);
                      paramIntent.putExtra("biz_chat_from_scene", 4);
                      com.tencent.mm.bj.d.a(this, ".ui.bizchat.BizChatConversationUI", paramIntent);
                    }
                    else
                    {
                      ((LauncherUI)localObject1).a(str, (Bundle)localObject2, false);
                    }
                  }
                }
                else if (com.tencent.mm.sdk.platformtools.s.a(paramIntent, "jump_sns_from_notify", false))
                {
                  localObject1 = new Intent();
                  ((Intent)localObject1).addFlags(67108864);
                  ((Intent)localObject1).putExtra("is_need_resend_sns", paramIntent.getBooleanExtra("is_need_resend_sns", false));
                  ((Intent)localObject1).putExtra("sns_resume_state", paramIntent.getBooleanExtra("sns_resume_state", false));
                  ((Intent)localObject1).putExtra("sns_timeline_NeedFirstLoadint", paramIntent.getBooleanExtra("sns_timeline_NeedFirstLoadint", false));
                  com.tencent.mm.bj.d.b(this, "sns", ".ui.En_424b8e16", (Intent)localObject1);
                }
              }
              else if ((com.tencent.mm.sdk.platformtools.s.a(paramIntent, "biz_chat_need_to_jump_to_chatting_ui", false)) && (bXe() != null) && (com.tencent.mm.af.f.dL(str)))
              {
                paramIntent.putExtra("Contact_User", str);
                paramIntent.addFlags(67108864);
                com.tencent.mm.bj.d.a(this, ".ui.bizchat.BizChatConversationUI", paramIntent);
              }
            }
          }
        }
      }
    }
  }
  
  public static LauncherUI bXe()
  {
    GMTrace.i(1686848405504L, 12568);
    if (vJf.isEmpty())
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.LauncherUI", "LauncherUI instances should not be empty. %s", new Object[] { com.tencent.mm.platformtools.t.Py() });
      GMTrace.o(1686848405504L, 12568);
      return null;
    }
    LauncherUI localLauncherUI = (LauncherUI)vJf.get(0);
    GMTrace.o(1686848405504L, 12568);
    return localLauncherUI;
  }
  
  private void bXf()
  {
    GMTrace.i(1684432486400L, 12550);
    int i = vJf.indexOf(this);
    if (i >= 0) {
      vJf.remove(i);
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "checktask delteInstance index %d, size:%d, hashCode: 0x%x", new Object[] { Integer.valueOf(i), Integer.valueOf(vJf.size()), Integer.valueOf(hashCode()) });
    GMTrace.o(1684432486400L, 12550);
  }
  
  private boolean bXh()
  {
    GMTrace.i(1684164050944L, 12548);
    if ((this.eLY != null) && ((com.tencent.mm.sdk.platformtools.s.a(this.eLY, "absolutely_exit", false)) || (com.tencent.mm.sdk.platformtools.s.a(this.eLY, "absolutely_exit_pid", 0) == Process.myPid())))
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.LauncherUI", "launcherOnResume exit absolutely!!!");
      finish();
      com.tencent.mm.plugin.report.service.f.tr(8);
      MMAppMgr.lj(com.tencent.mm.sdk.platformtools.s.a(this.eLY, "kill_service", true));
      GMTrace.o(1684164050944L, 12548);
      return true;
    }
    if ((this.eLY != null) && (com.tencent.mm.sdk.platformtools.s.a(this.eLY, "can_finish", false)))
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "exit obviously");
      at.wS().bj(true);
      if (com.tencent.mm.kernel.k.aS(getApplicationContext()))
      {
        Context localContext = getApplicationContext();
        localContext.stopService(new Intent(localContext, CoreService.class));
      }
      com.tencent.mm.plugin.report.service.f.tr(8);
      sendBroadcast(new Intent("com.tencent.mm.ui.ACTION_FORCE_DEACTIVE"), "com.tencent.mm.permission.MM_MESSAGE");
      finish();
      com.tencent.mm.ui.base.b.fm(this);
      GMTrace.o(1684164050944L, 12548);
      return true;
    }
    GMTrace.o(1684164050944L, 12548);
    return false;
  }
  
  public static void eW(Context paramContext)
  {
    GMTrace.i(1682956091392L, 12539);
    Intent localIntent = new Intent(paramContext, LauncherUI.class);
    localIntent.addFlags(67108864);
    paramContext.startActivity(localIntent);
    GMTrace.o(1682956091392L, 12539);
  }
  
  private void nl(boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    GMTrace.i(21072854384640L, 157005);
    if (paramBoolean)
    {
      if (!this.vJk.c(this, new Runnable()
      {
        public final void run()
        {
          GMTrace.i(20400557785088L, 151996);
          LauncherUI.a(LauncherUI.this);
          GMTrace.o(20400557785088L, 151996);
        }
      })) {}
      for (paramBoolean = bool2;; paramBoolean = false)
      {
        this.yvT = paramBoolean;
        GMTrace.o(21072854384640L, 157005);
        return;
      }
    }
    int i;
    if (!this.yvT)
    {
      if (!this.vJk.oaK) {
        break label230;
      }
      paramBoolean = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.WRITE_EXTERNAL_STORAGE", 33, "", "");
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "summerper checkPermission checkStorage[%b]", new Object[] { Boolean.valueOf(paramBoolean) });
      if (paramBoolean) {
        break label140;
      }
      i = 0;
      if (i != 0) {
        break label235;
      }
    }
    label140:
    label230:
    label235:
    for (paramBoolean = bool1;; paramBoolean = false)
    {
      this.yvT = paramBoolean;
      GMTrace.o(21072854384640L, 157005);
      return;
      paramBoolean = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.READ_PHONE_STATE", 97, "", "");
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "summerper checkPermission checkPhone[%b]", new Object[] { Boolean.valueOf(paramBoolean) });
      if (!paramBoolean)
      {
        i = 0;
        break;
      }
      paramBoolean = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.ACCESS_COARSE_LOCATION", 70, "", "");
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "summerper checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(paramBoolean) });
      if (!paramBoolean)
      {
        i = 0;
        break;
      }
      i = 1;
      break;
    }
  }
  
  public final void U(float paramFloat)
  {
    int i = 1;
    GMTrace.i(1690874937344L, 12598);
    Object localObject;
    if (this.vJl)
    {
      localObject = this.vJj;
      com.tencent.mm.sdk.platformtools.w.v("MicroMsg.LauncherUI.ChattingTabUI", "ashutest::on swipe %f, duration %d, resumeStatus %b", new Object[] { Float.valueOf(paramFloat), Long.valueOf(240L), Boolean.valueOf(((d)localObject).vFQ.bWY()) });
      if (((d)localObject).bWj()) {
        break label93;
      }
    }
    for (;;)
    {
      if (i == 0) {
        super.U(paramFloat);
      }
      GMTrace.o(1690874937344L, 12598);
      return;
      label93:
      if ((paramFloat == 0.0F) && (!((d)localObject).vGi))
      {
        ImageView localImageView = (ImageView)((d)localObject).vFP.getWindow().getDecorView().findViewById(R.h.gFJ);
        if (localImageView != null)
        {
          ViewGroup localViewGroup = (ViewGroup)localImageView.getTag();
          if (localViewGroup != null) {
            localViewGroup.post(new d.3((d)localObject, localImageView, localViewGroup));
          }
        }
      }
      if (((d)localObject).vFQ.bWY()) {
        break label241;
      }
      if (Float.compare(1.0F, paramFloat) <= 0) {
        break;
      }
      i = 0;
    }
    label241:
    for (i = 0;; i = 1)
    {
      localObject = ((d)localObject).vFP.findViewById(R.h.gFJ);
      if (Float.compare(1.0F, paramFloat) <= 0) {
        com.tencent.mm.ui.tools.j.n((View)localObject, 0.0F);
      }
      for (;;)
      {
        break;
        com.tencent.mm.ui.tools.j.n((View)localObject, ((View)localObject).getWidth() / 4 * (1.0F - paramFloat) * -1.0F);
      }
    }
  }
  
  public final boolean Zo()
  {
    GMTrace.i(1691411808256L, 12602);
    GMTrace.o(1691411808256L, 12602);
    return true;
  }
  
  public final void a(String paramString, Bundle paramBundle, boolean paramBoolean)
  {
    GMTrace.i(1688593235968L, 12581);
    HomeUI localHomeUI = this.vJi;
    if ((com.tencent.mm.y.q.Am().booleanValue()) && ((HomeUI.vIr.booleanValue()) || (HomeUI.vIs.booleanValue()))) {
      localHomeUI.c(Boolean.valueOf(false), Boolean.valueOf(false));
    }
    localHomeUI.vIy.bXS();
    this.vJj.a(paramString, paramBundle, paramBoolean);
    GMTrace.o(1688593235968L, 12581);
  }
  
  public final u bXi()
  {
    GMTrace.i(1691814461440L, 12605);
    Object localObject1 = this.vJj;
    if (!((d)localObject1).vGi) {}
    for (localObject1 = ((d)localObject1).vFY;; localObject1 = null)
    {
      Object localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = super.bXi();
      }
      GMTrace.o(1691814461440L, 12605);
      return (u)localObject2;
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(1690472284160L, 12595);
    if (this.vJj.bWe())
    {
      localObject1 = this.vJj;
      if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0)) {
        af.F(((d)localObject1).vGe);
      }
      if (((d)localObject1).vFY.onKeyDown(paramKeyEvent.getKeyCode(), paramKeyEvent))
      {
        GMTrace.o(1690472284160L, 12595);
        return true;
      }
    }
    Object localObject1 = this.vJi;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI.HomeUI", "ui group onKeyDown, code:%d action:%d", new Object[] { Integer.valueOf(paramKeyEvent.getKeyCode()), Integer.valueOf(paramKeyEvent.getAction()) });
    int i;
    if ((paramKeyEvent.getKeyCode() == 25) && (paramKeyEvent.getAction() == 0) && (at.AU())) {
      if (com.tencent.mm.at.b.JQ())
      {
        i = 3;
        at.AS().ei(i);
        i = 1;
      }
    }
    for (;;)
    {
      if (i == 0) {
        break label713;
      }
      GMTrace.o(1690472284160L, 12595);
      return true;
      i = 5;
      break;
      if ((paramKeyEvent.getKeyCode() == 24) && (paramKeyEvent.getAction() == 0) && (at.AU()))
      {
        if (com.tencent.mm.at.b.JQ()) {}
        for (i = 3;; i = 5)
        {
          at.AS().eh(i);
          i = 1;
          break;
        }
      }
      if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 1) && (((HomeUI)localObject1).vIq != null) && (((HomeUI)localObject1).vIq.isShowing()))
      {
        ((HomeUI)localObject1).vIq.dismiss();
        i = 1;
      }
      else if ((paramKeyEvent.getKeyCode() == 82) && (paramKeyEvent.getAction() == 1))
      {
        ((HomeUI)localObject1).bWU();
        i = 1;
      }
      else
      {
        Object localObject2 = ((HomeUI)localObject1).vIy.bXQ();
        if ((localObject2 != null) && (((u)localObject2).onKeyDown(paramKeyEvent.getKeyCode(), paramKeyEvent))) {
          i = 1;
        } else if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
        {
          if ((((HomeUI)localObject1).vIF != null) && (((HomeUI)localObject1).vIF.getVisibility() == 0))
          {
            ((HomeUI)localObject1).vIF.bLv();
            i = 1;
          }
          else
          {
            if ((at.AU()) && (com.tencent.mm.kernel.h.xw().fYg) && (am.isWap(((HomeUI)localObject1).vFP)))
            {
              Object localObject3 = ((HomeUI)localObject1).vFP;
              localObject2 = new HomeUI.5((HomeUI)localObject1);
              if (!at.AU()) {
                i = 0;
              }
              for (;;)
              {
                if (i == 0) {
                  break label613;
                }
                i = 1;
                break;
                at.AR();
                i = ((Integer)com.tencent.mm.y.c.xh().get(65, Integer.valueOf(0))).intValue();
                if (i >= 5)
                {
                  i = 0;
                }
                else if (!ad.RS("show_wap_adviser"))
                {
                  i = 0;
                }
                else
                {
                  View localView = View.inflate((Context)localObject3, R.i.cDc, null);
                  ((TextView)localView.findViewById(R.h.bPY)).setText(R.l.dLq);
                  localObject3 = new i.a((Context)localObject3);
                  ((i.a)localObject3).BN(R.l.cUG);
                  ((i.a)localObject3).dg(localView);
                  ((i.a)localObject3).BQ(R.l.cTM).a(new MMAppMgr.9(i));
                  ((i.a)localObject3).lz(false);
                  ((i.a)localObject3).BR(R.l.dLn).b(new MMAppMgr.10());
                  ((i.a)localObject3).a(new MMAppMgr.11((DialogInterface.OnClickListener)localObject2));
                  ((i.a)localObject3).aax().show();
                  i = 1;
                }
              }
            }
            label613:
            i = am.getBackgroundLimitType(((HomeUI)localObject1).vFP);
            if ((at.AU()) && (com.tencent.mm.kernel.h.xw().fYg) && (am.isLimited(i)))
            {
              at.AR();
              if ((com.tencent.mm.platformtools.t.a((Boolean)com.tencent.mm.y.c.xh().get(16385, null))) && (MMAppMgr.a(((HomeUI)localObject1).vFP, i, new HomeUI.6((HomeUI)localObject1, i), new HomeUI.7((HomeUI)localObject1))))
              {
                i = 1;
                continue;
              }
            }
            ((HomeUI)localObject1).bVQ();
          }
        }
        else {
          i = 0;
        }
      }
    }
    try
    {
      label713:
      boolean bool = super.dispatchKeyEvent(paramKeyEvent);
      GMTrace.o(1690472284160L, 12595);
      return bool;
    }
    catch (Exception paramKeyEvent)
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.LauncherUI", "dispatch key event catch exception %s", new Object[] { paramKeyEvent.getMessage() });
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.LauncherUI", paramKeyEvent, "", new Object[0]);
      GMTrace.o(1690472284160L, 12595);
    }
    return false;
  }
  
  public final void f(boolean paramBoolean, int paramInt)
  {
    long l = 120L;
    GMTrace.i(1691277590528L, 12601);
    int i;
    if (this.vJl)
    {
      localObject = this.vJj;
      com.tencent.mm.sdk.platformtools.w.v("MicroMsg.LauncherUI.ChattingTabUI", "ashutest: on settle %B, speed %d, resumeStatus %s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt), Boolean.valueOf(((d)localObject).vFQ.bWY()) });
      if (!((d)localObject).bWj()) {
        break label145;
      }
      if (((d)localObject).vFQ.bWY()) {
        break label113;
      }
      i = 0;
      if (i == 0) {
        super.f(paramBoolean, paramInt);
      }
    }
    GMTrace.o(1691277590528L, 12601);
    return;
    label113:
    Object localObject = ((d)localObject).vFP.findViewById(R.h.gFJ);
    if (paramBoolean)
    {
      if (paramInt > 0) {}
      for (;;)
      {
        com.tencent.mm.ui.tools.j.a((View)localObject, l, 0.0F, 0.125F);
        label145:
        i = 1;
        break;
        l = 240L;
      }
    }
    if (paramInt > 0) {}
    for (;;)
    {
      com.tencent.mm.ui.tools.j.a((View)localObject, l, ((View)localObject).getWidth() * -1 / 4, 0.75F);
      break;
      l = 240L;
    }
  }
  
  public void finish()
  {
    GMTrace.i(1685908881408L, 12561);
    super.finish();
    bXf();
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "checktask Launcherui onfinish 0x%x,instance size %d, stack: %s", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(vJf.size()), bg.bQW() });
    GMTrace.o(1685908881408L, 12561);
  }
  
  public final void la(boolean paramBoolean)
  {
    GMTrace.i(19041871724544L, 141873);
    Object localObject2 = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14668923928576L, 109292);
        LauncherUI.this.vJi.vIy.bXV();
        GMTrace.o(14668923928576L, 109292);
      }
    };
    Object localObject1 = this.vJj;
    boolean bool;
    int i;
    if (((d)localObject1).vFZ == null)
    {
      bool = false;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI.ChattingTabUI", "try closeChatting, ishow:%b", new Object[] { Boolean.valueOf(bool) });
      if ((((d)localObject1).vFZ != null) && (((d)localObject1).vFZ.getVisibility() != 8) && (((d)localObject1).vFY != null)) {
        break label270;
      }
      i = 0;
      if (i != 0)
      {
        localObject1 = this.vJi;
        if (!this.vJj.vFY.bXH()) {
          ((HomeUI)localObject1).bWZ();
        }
        ((HomeUI)localObject1).vFP.aQ();
        if (com.tencent.mm.y.q.Am().booleanValue()) {
          ((HomeUI)localObject1).bWT();
        }
        localObject1 = ((HomeUI)localObject1).vIy;
        if ((((w)localObject1).kZJ != 0) || (!com.tencent.mm.kernel.h.xx().fYr.foreground)) {
          break label554;
        }
        at.getNotification().aE(true);
      }
    }
    for (;;)
    {
      ((w)localObject1).bXc();
      k.a(((w)localObject1).vFP, 3, ((w)localObject1).kZJ, "prepareCloseChatting");
      localObject1 = (com.tencent.mm.ui.conversation.j)((w)localObject1).vMY.get(Integer.valueOf(0));
      if (localObject1 != null)
      {
        localObject2 = ((u)localObject1).vKB.hqF;
        if (((com.tencent.mm.ui.conversation.j)localObject1).vKB != null) {
          ((com.tencent.mm.ui.conversation.j)localObject1).vKB.onResume();
        }
        ((com.tencent.mm.ui.conversation.j)localObject1).onHiddenChanged(false);
      }
      GMTrace.o(19041871724544L, 141873);
      return;
      bool = ((d)localObject1).vFZ.isShown();
      break;
      label270:
      if ((((d)localObject1).vFY != null) && (((d)localObject1).vFY.bXH())) {
        com.tencent.mm.ui.widget.k.b(((d)localObject1).vFP);
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI.ChattingTabUI", "closeChatting");
      com.tencent.mm.sdk.f.e.post(new d.18((d)localObject1), "directReport_closeChatting");
      ((d)localObject1).vGi = true;
      if (((d)localObject1).vGf == null)
      {
        ((d)localObject1).vGf = AnimationUtils.loadAnimation(((d)localObject1).vFP, MMFragmentActivity.a.vMA);
        ((d)localObject1).vGf.setAnimationListener(new d.2((d)localObject1, (Runnable)localObject2));
      }
      ((d)localObject1).vFY.onPause();
      ((d)localObject1).vFY.cdE();
      ((d)localObject1).vFY.gOF = false;
      com.tencent.mm.ui.base.ac.a(true, new Intent().putExtra("classname", "mainui").putExtra("main_process", false));
      if (((d)localObject1).vFY.bXH())
      {
        localObject2 = (ImageView)((d)localObject1).vFP.getWindow().getDecorView().findViewById(R.h.gFJ);
        if ((localObject2 != null) && (((ImageView)localObject2).getVisibility() == 0))
        {
          ((ImageView)localObject2).setVisibility(8);
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI.ChattingTabUI", "[closeChatting] prepareView GONE");
          if (((ImageView)localObject2).getTag() != null) {
            ((View)((ImageView)localObject2).getTag()).setVisibility(0);
          }
        }
      }
      if (paramBoolean) {
        ((d)localObject1).vFZ.startAnimation(((d)localObject1).vGf);
      }
      for (;;)
      {
        i = 1;
        break;
        ((d)localObject1).vFZ.setVisibility(8);
        ((d)localObject1).vFP.U(1.0F);
        ((d)localObject1).bWi();
      }
      label554:
      at.getNotification().aE(false);
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(1686445752320L, 12565);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    com.tencent.mm.sdk.platformtools.w.v("MicroMsg.LauncherUI", "edw on activity result");
    Object localObject = this.vJj;
    if ((paramInt1 == 2001) && (((d)localObject).vFY != null)) {
      ((d)localObject).vFY.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
    int i = 0xFFFF & paramInt1;
    com.tencent.mm.sdk.platformtools.w.w("MicroMsg.LauncherUI.ChattingTabUI", "check request code %d", new Object[] { Integer.valueOf(i) });
    switch (i)
    {
    default: 
      i = 0;
      if ((i != 0) && (((d)localObject).vFY == null))
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI.ChattingTabUI", "on select image ActivityResult. the chattingUI maybe kill in the background.");
        af.F(((d)localObject).vFT);
        ((d)localObject).vFT.vGs = 0;
        ((d)localObject).vFT.eLN = paramInt1;
        ((d)localObject).vFT.aGY = paramInt2;
        ((d)localObject).vFT.eLO = paramIntent;
        af.t(((d)localObject).vFT);
      }
      break;
    }
    for (i = 1;; i = 0)
    {
      if (i == 0) {
        break label227;
      }
      GMTrace.o(1686445752320L, 12565);
      return;
      i = 1;
      break;
    }
    label227:
    paramIntent = this.vJi;
    if (paramIntent.vIn)
    {
      if (paramInt1 == 1)
      {
        at.AR();
        if (!com.tencent.mm.platformtools.t.b((Boolean)com.tencent.mm.y.c.xh().get(12323, null))) {
          com.tencent.mm.platformtools.m.a(paramIntent.vFP, null, false, 3);
        }
        GMTrace.o(1686445752320L, 12565);
        return;
      }
      if (paramInt1 == 22722)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI.HomeUI", "showAgreements %d, %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        if (paramInt2 != 102001) {
          break label402;
        }
        localObject = new com.tencent.mm.modelsimple.v(1);
        com.tencent.mm.kernel.h.wS().a((com.tencent.mm.ad.k)localObject, 0);
      }
    }
    for (;;)
    {
      if ((paramInt1 == 65534) && (paramInt2 == -1))
      {
        ad.RT("welcome_page_show");
        com.tencent.mm.kernel.k.d(paramIntent.vFP, true);
        MMAppMgr.pu();
        MMAppMgr.a(paramIntent.vFP, true);
        paramIntent.vFP.finish();
      }
      GMTrace.o(1686445752320L, 12565);
      return;
      label402:
      if (paramInt2 == 102002)
      {
        localObject = new com.tencent.mm.modelsimple.v(2);
        com.tencent.mm.kernel.h.wS().a((com.tencent.mm.ad.k)localObject, 0);
      }
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(1683492962304L, 12543);
    super.onConfigurationChanged(paramConfiguration);
    paramConfiguration = this.vJi;
    com.tencent.mm.pluginsdk.e.a(paramConfiguration.vFP, paramConfiguration.hqF);
    GMTrace.o(1683492962304L, 12543);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1683358744576L, 12542);
    com.tencent.mm.app.c.fH(com.tencent.mm.kernel.i.xD().ldN);
    long l1 = System.currentTimeMillis();
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "start time check checktask onCreate 0x%x, taskid %d, task:%s", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(getTaskId()), bg.eG(this) });
    super.onCreate(paramBundle);
    long l2 = System.currentTimeMillis();
    int i = getTaskId();
    String str = getPackageName();
    paramBundle = getIntent();
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramBundle != null)
    {
      bool1 = bool2;
      if (com.tencent.mm.sdk.platformtools.s.a(paramBundle, "absolutely_exit", false))
      {
        bool1 = true;
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "checktask checkInstance isWantToRestart");
      }
    }
    Object localObject1 = null;
    paramBundle = null;
    Object localObject2;
    if (!bool1)
    {
      localObject2 = vJf.iterator();
      localObject1 = paramBundle;
      if (((Iterator)localObject2).hasNext())
      {
        localObject1 = (LauncherUI)((Iterator)localObject2).next();
        if (((LauncherUI)localObject1).getTaskId() != i)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "checktask checkInstance 0x%x diff taskid taskid %d, nowtaskid:%d", new Object[] { Integer.valueOf(localObject1.hashCode()), Integer.valueOf(((LauncherUI)localObject1).getTaskId()), Integer.valueOf(i) });
          paramBundle = bg.ac(this, i);
          if (paramBundle != null)
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "checktask task diff id %d, topactivity %s, baseactivity %s, numtotal %d, numrunning %d", new Object[] { Integer.valueOf(paramBundle.id), paramBundle.topActivity.getClassName(), paramBundle.baseActivity.getClassName(), Integer.valueOf(paramBundle.numActivities), Integer.valueOf(paramBundle.numRunning) });
            if (paramBundle.baseActivity.getPackageName().equals(str)) {
              break label431;
            }
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.LauncherUI", "checktask base activity is not mm, finish! info.baseActivity.getPackageName()  " + paramBundle.baseActivity.getPackageName());
            finish();
            if (bg.ac(this, ((LauncherUI)localObject1).getTaskId()) != null)
            {
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "checktask startLauncherUI with FLAG_ACTIVITY_NEW_TASK");
              paramBundle = new Intent(this, LauncherUI.class);
              paramBundle.addFlags(268435456);
              startActivity(paramBundle);
            }
            i = 0;
          }
        }
      }
    }
    for (;;)
    {
      if (i == 0)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "onCreate checkInstance false");
        GMTrace.o(1683358744576L, 12542);
        return;
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.LauncherUI", "checktask cannot found curren taskinfo %d", new Object[] { Integer.valueOf(i) });
        finish();
        i = 0;
        continue;
        label431:
        ((LauncherUI)localObject1).finish();
        vJf.remove(localObject1);
        break;
        if (!vJf.isEmpty())
        {
          paramBundle = (Bundle)localObject1;
          if (localObject1 == null) {
            paramBundle = bg.ac(this, i);
          }
          if (paramBundle == null) {
            break label702;
          }
          localObject1 = paramBundle.baseActivity.getClassName();
          str = paramBundle.baseActivity.getClassName();
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "checktask now info id %d, topactivity %s, baseactivity %s, numtotal %d, numrunning %d", new Object[] { Integer.valueOf(paramBundle.id), str, localObject1, Integer.valueOf(paramBundle.numActivities), Integer.valueOf(paramBundle.numRunning) });
          localObject2 = getComponentName().getClassName();
          if ((paramBundle.numActivities > 1) && (((String)localObject2).equals(localObject1)) && (((String)localObject2).equals(str)))
          {
            finish();
            com.tencent.mm.sdk.platformtools.w.w("MicroMsg.LauncherUI", "checktask finish this mainTabUI, and use the last LauncherUI instanceCount: %d", new Object[] { Integer.valueOf(vJf.size()) });
            i = 0;
            continue;
          }
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.LauncherUI", "checktask should not here without isWantToRestart is true launcherUIInstances.clear LauncherUI instanceCount: %d, isWantToRestart %b", new Object[] { Integer.valueOf(vJf.size()), Boolean.valueOf(bool1) });
          vJf.clear();
        }
        for (;;)
        {
          vJf.add(this);
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "checktask Launcherui oncreate checkInstance size %d, use time %d", new Object[] { Integer.valueOf(vJf.size()), Long.valueOf(System.currentTimeMillis() - l2) });
          i = 1;
          break;
          label702:
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.LauncherUI", "checktask can not found taskid %d,  LauncherUI instanceCount: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(vJf.size()) });
          vJf.clear();
        }
      }
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "onCreate normally");
    this.vJi = new HomeUI();
    this.vJj = new d(this.vJi);
    paramBundle = this.vJi;
    localObject1 = this.vJj;
    paramBundle.vFP = this;
    paramBundle.vIw = ((a)localObject1);
    localObject1 = paramBundle.vIy;
    ((w)localObject1).vFP = this;
    ((w)localObject1).vMP = paramBundle;
    localObject1 = ((w)localObject1).vMO;
    ((x)localObject1).vFP = this;
    ((x)localObject1).vNf = paramBundle;
    paramBundle.vIx = new j(this, paramBundle);
    NotifyReceiver.rm();
    com.tencent.mm.pluginsdk.e.O(paramBundle.vFP);
    paramBundle.FM = cN().cO();
    if (paramBundle.FM != null)
    {
      if (Build.VERSION.SDK_INT < 11) {
        paramBundle.FM.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.e.aMD)));
      }
      paramBundle.FM.hide();
    }
    setRequestedOrientation(1);
    paramBundle = com.tencent.mm.y.as.gnb.B("login_user_name", "");
    this.eLY = getIntent();
    localObject1 = this.vJo;
    ((com.tencent.mm.pluginsdk.r)localObject1).tml = this.eLY.getBooleanExtra("splash-hack-activity-recreate", false);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SplashOptimizing", "[%s], recreating activity this time? %s", new Object[] { ((com.tencent.mm.pluginsdk.r)localObject1).mTag, Boolean.valueOf(((com.tencent.mm.pluginsdk.r)localObject1).tml) });
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "lastLoginName %s, hasCfgDefaultUin %s  isFirstTimeCreate %s", new Object[] { paramBundle, Boolean.valueOf(at.AT()), Boolean.valueOf(vJg) });
    if ((!vJg) && ((at.AT()) || (!paramBundle.equals(""))))
    {
      vJh = l1;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "start time check not isLauncherUIOnTop no welcomeearth create time from mmapplication==" + (System.currentTimeMillis() - MMApplicationLike.sAppStartTime));
      GMTrace.o(1683358744576L, 12542);
      return;
    }
    vJh = l1;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "start time check not isLauncherUIOnTop create time from mmapplication==" + (System.currentTimeMillis() - MMApplicationLike.sAppStartTime));
    setRequestedOrientation(1);
    bool1 = at.AT();
    paramBundle = com.tencent.mm.y.as.gnb.B("login_user_name", "");
    if ((!bool1) && (paramBundle.equals(""))) {}
    for (i = 1; i == 0; i = 0)
    {
      com.tencent.mm.sdk.platformtools.f.vht = false;
      GMTrace.o(1683358744576L, 12542);
      return;
    }
    bool1 = false;
    if (com.tencent.mm.sdk.platformtools.f.vhu) {
      bool1 = MMAppMgr.a(this, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(20400289349632L, 151994);
          LauncherUI.a(LauncherUI.this);
          GMTrace.o(20400289349632L, 151994);
        }
      });
    }
    for (;;)
    {
      if (!bool1) {
        nl(true);
      }
      o.agL();
      com.tencent.mm.plugin.report.service.f.tr(8);
      paramBundle = new WelcomeSelectView(this);
      setContentView(paramBundle);
      this.vJp = paramBundle;
      GMTrace.o(1683358744576L, 12542);
      return;
      MMAppMgr.eZ(this);
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(1685506228224L, 12558);
    if (this.vJj.bWe())
    {
      GMTrace.o(1685506228224L, 12558);
      return false;
    }
    HomeUI localHomeUI = this.vJi;
    if (localHomeUI.vIw.bWe())
    {
      GMTrace.o(1685506228224L, 12558);
      return false;
    }
    int i = localHomeUI.vFP.cN().cO().getHeight();
    if (i == 0)
    {
      DisplayMetrics localDisplayMetrics = localHomeUI.vFP.getResources().getDisplayMetrics();
      if (localDisplayMetrics.widthPixels > localDisplayMetrics.heightPixels) {
        i = localHomeUI.vFP.getResources().getDimensionPixelSize(R.f.aPM);
      }
    }
    for (;;)
    {
      localHomeUI.vID = paramMenu.add(0, 1, 0, R.l.eey);
      localHomeUI.vID.setIcon(R.k.cIT);
      int j = com.tencent.mm.br.a.fromDPToPix(localHomeUI.vFP, 68);
      localHomeUI.vIE = paramMenu.add(0, 2, 0, R.l.eex);
      if (localHomeUI.vIA == null)
      {
        paramMenu = new ViewGroup.LayoutParams(j, i);
        localHomeUI.vIA = View.inflate(localHomeUI.vFP, R.i.coR, null);
        localHomeUI.vIB = ((ImageView)localHomeUI.vIA.findViewById(R.h.icon));
        localHomeUI.vIC = localHomeUI.vIA.findViewById(R.h.chB);
        localHomeUI.vIA.setLayoutParams(paramMenu);
        localHomeUI.vIA.setBackgroundResource(R.g.aTq);
        localHomeUI.vIA.setMinimumHeight(i);
        localHomeUI.vIA.setMinimumWidth(j);
        localHomeUI.vIB.setImageResource(R.k.cIG);
        localHomeUI.vIA.setContentDescription(localHomeUI.getString(R.l.eex));
        localHomeUI.vIA.setOnClickListener(new HomeUI.19(localHomeUI));
        localHomeUI.vIA.post(new HomeUI.20(localHomeUI));
      }
      localHomeUI.kY(false);
      android.support.v4.view.m.a(localHomeUI.vIE, localHomeUI.vIA);
      if (localHomeUI.vID != null)
      {
        android.support.v4.view.m.a(localHomeUI.vID, 2);
        localHomeUI.vID.setVisible(true);
      }
      if (localHomeUI.vIE != null)
      {
        android.support.v4.view.m.a(localHomeUI.vIE, 2);
        localHomeUI.vIE.setVisible(true);
      }
      localHomeUI.vIA.getLayoutParams().width = j;
      localHomeUI.vIA.getLayoutParams().height = i;
      com.tencent.mm.sdk.platformtools.w.v("MicroMsg.LauncherUI.HomeUI", "onCreateOptionsMenu");
      GMTrace.o(1685506228224L, 12558);
      return true;
      i = localHomeUI.vFP.getResources().getDimensionPixelSize(R.f.aPN);
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(1686311534592L, 12564);
    com.tencent.mm.app.c.oV();
    super.onDestroy();
    Object localObject1 = this.vJi;
    Object localObject2 = ((HomeUI)localObject1).vIy;
    com.tencent.mm.sdk.b.a.vgX.c(((w)localObject2).vMW);
    ((w)localObject2).vMY.clear();
    if (((HomeUI)localObject1).vIx != null)
    {
      localObject2 = ((HomeUI)localObject1).vIx;
      com.tencent.mm.sdk.b.a.vgX.c(((j)localObject2).vId);
      com.tencent.mm.sdk.b.a.vgX.c(((j)localObject2).vIe);
    }
    if (((HomeUI)localObject1).vIn) {
      Looper.myQueue().removeIdleHandler(((HomeUI)localObject1).vIH);
    }
    if (((HomeUI)localObject1).vIF != null) {
      ((HomeUI)localObject1).vIF.twa = null;
    }
    localObject1 = this.vJj;
    if ((((d)localObject1).yvF != null) && (!((d)localObject1).yvF.isRecycled())) {
      ((d)localObject1).yvF.recycle();
    }
    af.F(((d)localObject1).vGe);
    Looper.myQueue().removeIdleHandler(((d)localObject1).vFS);
    bXf();
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "checktask onDestroy 0x%x, taskid %d, task:%s, instancesize %d", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(getTaskId()), bg.eG(this), Integer.valueOf(vJf.size()) });
    GMTrace.o(1686311534592L, 12564);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(1684298268672L, 12549);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "onNewIntent 0x%x task:%s", new Object[] { Integer.valueOf(hashCode()), bg.eG(this) });
    this.eLY = paramIntent;
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    if (bXh())
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "onNewIntent handleExitIntent");
      GMTrace.o(1684298268672L, 12549);
      return;
    }
    if ((this.eLY != null) && (com.tencent.mm.sdk.platformtools.s.a(this.eLY, "Intro_Need_Clear_Top ", false)))
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LauncherUI", "KEVIN KNeedClearTop");
      finish();
      eW(this);
      GMTrace.o(1684298268672L, 12549);
      return;
    }
    if ((paramIntent.getFlags() & 0x4000000) == 67108864) {
      la(false);
    }
    w localw = this.vJi.vIy;
    if ((paramIntent.getFlags() & 0x4000000) == 67108864) {
      localw.vMQ = true;
    }
    if (this.vJl)
    {
      com.tencent.mm.sdk.platformtools.w.v("MicroMsg.LauncherUI", "onMainTabNewIntent on new intent");
      ak(paramIntent);
    }
    GMTrace.o(1684298268672L, 12549);
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    int j = 0;
    GMTrace.i(1685640445952L, 12559);
    HomeUI localHomeUI = this.vJi;
    u localu = localHomeUI.vFP.bXi();
    int i;
    if ((localu != null) && (localu.isShowing())) {
      i = j;
    }
    while (i != 0)
    {
      GMTrace.o(1685640445952L, 12559);
      return true;
      i = j;
      if (!localHomeUI.vIw.bWe())
      {
        if (paramMenuItem.getItemId() == 2)
        {
          g.ork.A(10919, "0");
          localHomeUI.bWU();
        }
        for (;;)
        {
          i = 1;
          break;
          i = j;
          if (paramMenuItem.getItemId() != 1) {
            break;
          }
          bool = com.tencent.mm.pluginsdk.h.a.a(localHomeUI.vFP, "android.permission.ACCESS_COARSE_LOCATION", 65, null, null);
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI.HomeUI", "summerper checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
          if (bool) {
            localHomeUI.bWV();
          }
        }
      }
    }
    boolean bool = super.onOptionsItemSelected(paramMenuItem);
    GMTrace.o(1685640445952L, 12559);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(1686177316864L, 12563);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LauncherUI", "onPause, chatting is show ");
    super.onPause();
    Object localObject1 = this.vJo;
    boolean bool = ((com.tencent.mm.pluginsdk.r)localObject1).br("onPause");
    if (bool) {
      ((com.tencent.mm.pluginsdk.r)localObject1).tml = false;
    }
    if (bool)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "recreate activity %s, skip this onPause");
      GMTrace.o(1686177316864L, 12563);
      return;
    }
    com.tencent.mm.app.c.oV();
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "not skip this onPause");
    localObject1 = bXi();
    this.vJq.removeCallbacksAndMessages(null);
    Object localObject2 = this.vJi;
    Object localObject3 = ((HomeUI)localObject2).vIy;
    bool = ((HomeUI)localObject2).vIn;
    com.tencent.mm.sdk.platformtools.w.v("MicroMsg.LauncherUI.MainTabUI", "doOnPause %d, mainTabHasCreate:%b", new Object[] { Integer.valueOf(((w)localObject3).kZJ), Boolean.valueOf(bool) });
    if (bool) {
      ((w)localObject3).bXR();
    }
    localObject3 = ((w)localObject3).vMO;
    if (at.AU())
    {
      at.AR();
      com.tencent.mm.y.c.xh().b(((x)localObject3).vNk);
      at.AR();
      com.tencent.mm.y.c.yP().b((m.b)localObject3);
      com.tencent.mm.s.c.vK().b(((x)localObject3).vNj);
      com.tencent.mm.sdk.b.a.vgX.c(((x)localObject3).vNl);
      com.tencent.mm.sdk.b.a.vgX.c(((x)localObject3).vHE);
    }
    localObject3 = ((HomeUI)localObject2).vIx;
    if (((j)localObject3).vIb != null)
    {
      at.wS().b(255, ((j)localObject3).vIb);
      at.wS().b(384, ((j)localObject3).vIb);
      ((j)localObject3).vIb = null;
    }
    com.tencent.mm.sdk.a.b.bk(false);
    ((HomeUI)localObject2).vIv = HomeUI.a.vIU;
    if (!at.AJ()) {
      at.getNotification().aE(false);
    }
    bool = ((HomeUI)localObject2).vIw.bWe();
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI.HomeUI", "edw onPause, chatting is show " + bool);
    if (!bool) {
      k.a(((HomeUI)localObject2).vFP, 4, ((HomeUI)localObject2).vIy.kZJ, "directReport_onPause");
    }
    if (!((HomeUI)localObject2).vFP.isFinishing()) {
      com.tencent.mm.ui.widget.k.a(((HomeUI)localObject2).vFP);
    }
    if (((HomeUI)localObject2).vIn)
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LauncherUI.HomeUI", "KEVIN MainTabUI onMainTabPause");
      ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().a("showprivacypolicy", ((HomeUI)localObject2).vIK);
      if (at.AU()) {
        com.tencent.mm.sdk.b.a.vgX.c(((HomeUI)localObject2).vIG);
      }
    }
    if ((((HomeUI)localObject2).vIq != null) && (((HomeUI)localObject2).vIq.isShowing())) {
      ((HomeUI)localObject2).vIq.dismiss();
    }
    localObject2 = this.vJj;
    if (((d)localObject2).bWe())
    {
      com.tencent.mm.sdk.f.e.post(new d.13((d)localObject2), "directReport_onPause");
      if (((d)localObject2).vFY.bXH()) {
        ((d)localObject2).vFY.vMl.mEnable = false;
      }
    }
    if (localObject1 != null)
    {
      GMTrace.o(1686177316864L, 12563);
      return;
    }
    this.vJm = false;
    GMTrace.o(1686177316864L, 12563);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(1691546025984L, 12603);
    this.yvT = false;
    Object localObject;
    if (!this.vJk.a(this, paramInt, paramArrayOfString, paramArrayOfInt))
    {
      localObject = this.vJi;
      switch (paramInt)
      {
      default: 
        localObject = this.vJj;
        switch (paramInt)
        {
        }
        break;
      }
    }
    for (;;)
    {
      GMTrace.o(1691546025984L, 12603);
      return;
      if (paramInt == 80) {}
      for (int i = R.l.dNr; paramArrayOfInt[0] != 0; i = R.l.dNn)
      {
        com.tencent.mm.ui.base.h.a(((HomeUI)localObject).vFP, ((HomeUI)localObject).getString(i), ((HomeUI)localObject).getString(R.l.dNu), ((HomeUI)localObject).getString(R.l.dFX), ((HomeUI)localObject).getString(R.l.cancel), false, new HomeUI.9((HomeUI)localObject), new HomeUI.10((HomeUI)localObject));
        break;
      }
      if (paramArrayOfInt[0] == 0)
      {
        ((HomeUI)localObject).bWV();
        break;
      }
      com.tencent.mm.ui.base.h.a(((HomeUI)localObject).vFP, ((HomeUI)localObject).getString(R.l.dNq), ((HomeUI)localObject).getString(R.l.dNu), ((HomeUI)localObject).getString(R.l.dFX), ((HomeUI)localObject).getString(R.l.cancel), false, new HomeUI.11((HomeUI)localObject), null);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        localObject = ((HomeUI)localObject).vIy.bXQ();
        if (!(localObject instanceof h)) {
          break;
        }
        ((h)localObject).bWL();
        break;
      }
      com.tencent.mm.ui.base.h.a(((HomeUI)localObject).vFP, ((HomeUI)localObject).getString(R.l.dNq), ((HomeUI)localObject).getString(R.l.dNu), ((HomeUI)localObject).getString(R.l.dFX), ((HomeUI)localObject).getString(R.l.cancel), false, new HomeUI.13((HomeUI)localObject), null);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        if (((d)localObject).vFY != null)
        {
          ((d)localObject).vFY.cet();
          GMTrace.o(1691546025984L, 12603);
        }
      }
      else
      {
        if ("android.permission.CAMERA".equals(paramArrayOfString[0])) {}
        for (paramInt = R.l.dNn;; paramInt = R.l.dNr)
        {
          if (paramArrayOfInt[0] != 0) {
            com.tencent.mm.ui.base.h.a(((d)localObject).vFP, ((d)localObject).getString(paramInt), ((d)localObject).getString(R.l.dNu), ((d)localObject).getString(R.l.dFX), ((d)localObject).getString(R.l.cancel), false, new d.4((d)localObject), new d.5((d)localObject));
          }
          GMTrace.o(1691546025984L, 12603);
          return;
        }
        if (paramArrayOfInt[0] == 0)
        {
          if (((d)localObject).vFY != null)
          {
            if (paramInt == 19)
            {
              ((d)localObject).vFY.aXM();
              GMTrace.o(1691546025984L, 12603);
              return;
            }
            if (paramInt == 21)
            {
              ((d)localObject).vFY.ccl();
              GMTrace.o(1691546025984L, 12603);
              return;
            }
            ((d)localObject).vFY.ccj();
            GMTrace.o(1691546025984L, 12603);
          }
        }
        else
        {
          if ("android.permission.CAMERA".equals(paramArrayOfString[0])) {}
          for (paramInt = R.l.dNn;; paramInt = R.l.dNr)
          {
            if (paramArrayOfInt[0] != 0) {
              com.tencent.mm.ui.base.h.a(((d)localObject).vFP, ((d)localObject).getString(paramInt), ((d)localObject).getString(R.l.dNu), ((d)localObject).getString(R.l.dFX), ((d)localObject).getString(R.l.cancel), false, new d.6((d)localObject), new d.7((d)localObject));
            }
            GMTrace.o(1691546025984L, 12603);
            return;
          }
          if (paramArrayOfInt[0] == 0)
          {
            ((d)localObject).vFY.ccn();
            GMTrace.o(1691546025984L, 12603);
            return;
          }
          com.tencent.mm.ui.base.h.a(((d)localObject).vFP, ((d)localObject).getString(R.l.dNn), ((d)localObject).getString(R.l.dNu), ((d)localObject).getString(R.l.dFX), ((d)localObject).getString(R.l.cancel), false, new d.8((d)localObject), null);
          GMTrace.o(1691546025984L, 12603);
          return;
          if (paramArrayOfInt[0] == 0)
          {
            if (paramInt == 67)
            {
              ((d)localObject).vFY.wCx.ceB();
              GMTrace.o(1691546025984L, 12603);
              return;
            }
            ((d)localObject).vFY.wCx.ceC();
            GMTrace.o(1691546025984L, 12603);
            return;
          }
          com.tencent.mm.ui.base.h.a(((d)localObject).vFP, ((d)localObject).getString(R.l.dNq), ((d)localObject).getString(R.l.dNu), ((d)localObject).getString(R.l.dFX), ((d)localObject).getString(R.l.cancel), false, new d.9((d)localObject), null);
          GMTrace.o(1691546025984L, 12603);
          return;
          if (paramArrayOfInt[0] == 0)
          {
            ((d)localObject).vFY.ccm();
            GMTrace.o(1691546025984L, 12603);
            return;
          }
          com.tencent.mm.ui.base.h.a(((d)localObject).vFP, ((d)localObject).getString(R.l.dNq), ((d)localObject).getString(R.l.dNu), ((d)localObject).getString(R.l.dFX), ((d)localObject).getString(R.l.cancel), false, new d.10((d)localObject), null);
          GMTrace.o(1691546025984L, 12603);
          return;
          if (paramArrayOfInt[0] == 0)
          {
            if (paramInt == 82)
            {
              ((d)localObject).vFY.aXL();
              GMTrace.o(1691546025984L, 12603);
              return;
            }
            ((d)localObject).vFY.cck();
            GMTrace.o(1691546025984L, 12603);
            return;
          }
          com.tencent.mm.ui.base.h.a(((d)localObject).vFP, ((d)localObject).getString(R.l.dNr), ((d)localObject).getString(R.l.dNu), ((d)localObject).getString(R.l.dFX), ((d)localObject).getString(R.l.cancel), false, new d.19((d)localObject), null);
        }
      }
    }
  }
  
  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    GMTrace.i(1686982623232L, 12569);
    super.onRestoreInstanceState(paramBundle);
    d locald = this.vJj;
    locald.vFU = paramBundle.getString("last_restore_talker");
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LauncherUI.ChattingTabUI", "onRestoreInstantceState:%s", new Object[] { locald.vFU });
    GMTrace.o(1686982623232L, 12569);
  }
  
  public void onResume()
  {
    GMTrace.i(1684566704128L, 12551);
    super.onResume();
    if (this.vJo.br("onResume"))
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "recreate activity %s, skip this onResume");
      GMTrace.o(1684566704128L, 12551);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "not skip this onResume");
    if (bXh())
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "onResume handleExitIntent");
      GMTrace.o(1684566704128L, 12551);
      return;
    }
    vJg = false;
    int i;
    Object localObject2;
    long l1;
    Object localObject4;
    label866:
    long l2;
    if ((this.eLY != null) && (!com.tencent.mm.sdk.platformtools.s.a(this.eLY, "Intro_Switch", false)) && (at.AT()) && (!at.wF()))
    {
      i = 1;
      if (i == 0) {
        break label3579;
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "doOnResumeImp notSwitchorHold, hasDoInit:%b", new Object[] { Boolean.valueOf(this.vJl) });
      if (!this.vJl)
      {
        this.vJl = true;
        localObject1 = this.vJi;
        localObject2 = ((HomeUI)localObject1).vIx;
        com.tencent.mm.sdk.b.a.vgX.b(((j)localObject2).vId);
        com.tencent.mm.sdk.b.a.vgX.b(((j)localObject2).vIe);
        getWindow().setCallback(new com.tencent.mm.ui.b.c(getWindow().getCallback(), this));
        localObject2 = ((HomeUI)localObject1).vFP.getSharedPreferences("system_config_prefs", 4);
        if (((SharedPreferences)localObject2).getBoolean("first_launch_weixin", true))
        {
          ((SharedPreferences)localObject2).edit().putBoolean("first_launch_weixin", false).commit();
          XLogSetup.realSetupXlog();
        }
        ((HomeUI)localObject1).bWZ();
        ((HomeUI)localObject1).vIq = new aa(this);
        ((HomeUI)localObject1).vIn = true;
        NotifyReceiver.rn();
        at.getNotification().dV(1);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LauncherUI.HomeUI", "on main tab create");
        l1 = System.currentTimeMillis();
        if (at.AU()) {
          break label2637;
        }
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.LauncherUI.HomeUI", "mmcore has not ready, finish launcherui");
        ((HomeUI)localObject1).vFP.finish();
        localObject4 = ((HomeUI)localObject1).vIy;
        ((w)localObject4).vMS = ((CustomViewPager)((w)localObject4).vFP.findViewById(R.h.bSU));
        ((w)localObject4).vMS.DU(4);
        ((w)localObject4).vMS.CR = true;
        ((w)localObject4).vMT = new w.a((w)localObject4, ((w)localObject4).vFP, ((w)localObject4).vMS);
        ((w)localObject4).Bj(0);
        localObject1 = ((w)localObject4).vMO;
        localObject2 = (ViewGroup)((w)localObject4).vMS.getParent();
        localObject4 = ((w)localObject4).vMT;
        c localc = ((x)localObject1).vNg;
        if (((x)localObject1).vNg != null)
        {
          ((x)localObject1).vNg.a(null);
          ((View)((x)localObject1).vNg).setVisibility(8);
          if (localObject2 != null) {
            ((ViewGroup)localObject2).removeView((View)((x)localObject1).vNg);
          }
        }
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
        LauncherUIBottomTabView localLauncherUIBottomTabView = new LauncherUIBottomTabView(((x)localObject1).vFP);
        if (localObject2 != null) {
          ((ViewGroup)localObject2).addView(localLauncherUIBottomTabView, localLayoutParams);
        }
        ((x)localObject1).vNg = localLauncherUIBottomTabView;
        ((View)((x)localObject1).vNg).setVisibility(0);
        ((x)localObject1).vNg.a((c.a)localObject4);
        if ((localc != null) && (localc != ((x)localObject1).vNg))
        {
          ((x)localObject1).vNg.kR(localc.bWb());
          ((x)localObject1).vNg.kS(localc.bWc());
          ((x)localObject1).vNg.AM(localc.bVX());
          ((x)localObject1).vNg.AN(localc.bVY());
          ((x)localObject1).vNg.AO(localc.bVZ());
          ((x)localObject1).vNg.AP(localc.bWa());
          ((x)localObject1).vNg.mR(localc.bWd());
        }
        this.vJj.vFP = this;
        ak(getIntent());
      }
      localObject1 = this.vJi;
      l1 = com.tencent.mm.platformtools.t.Pv();
      localObject2 = ((HomeUI)localObject1).vIy;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI.MainTabUI", "onResume start :%d", new Object[] { Integer.valueOf(((w)localObject2).kZJ) });
      if (((w)localObject2).vMY.size() != 0) {
        ((l)((w)localObject2).vMY.get(Integer.valueOf(((w)localObject2).kZJ))).bVT();
      }
      if (((w)localObject2).vMQ)
      {
        ((w)localObject2).vMQ = false;
        ((w)localObject2).Vi("tab_main");
      }
      localObject4 = (com.tencent.mm.ui.conversation.j)((w)localObject2).vMY.get(Integer.valueOf(0));
      if (localObject4 != null)
      {
        ((com.tencent.mm.ui.conversation.j)localObject4).cgh();
        ((com.tencent.mm.ui.conversation.j)localObject4).chk();
      }
      if (((w)localObject2).kZJ != 0) {
        break label3212;
      }
      at.getNotification().aE(true);
      localObject4 = (l)((w)localObject2).Bk(((w)localObject2).kZJ);
      if (localObject4 != null) {
        ((l)localObject4).bVU();
      }
      ((w)localObject2).vMQ = false;
      i = com.tencent.mm.sdk.platformtools.s.a(((w)localObject2).vFP.getIntent(), "preferred_tab", 0);
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LauncherUI.MainTabUI", "doOnResume, tabIdx = %d", new Object[] { Integer.valueOf(i) });
      if (i != 0)
      {
        ((w)localObject2).Bj(i);
        ((w)localObject2).vFP.getIntent().putExtra("preferred_tab", 0);
      }
      com.tencent.mm.sdk.b.a.vgX.b(((w)localObject2).vMW);
      localObject2 = ((w)localObject2).vMO;
      if (((x)localObject2).vNg != null) {
        ((x)localObject2).vNg.bVW();
      }
      at.AR();
      com.tencent.mm.y.c.xh().a(((x)localObject2).vNk);
      com.tencent.mm.s.c.vK().a(((x)localObject2).vNj);
      at.AR();
      com.tencent.mm.y.c.yP().a((m.b)localObject2);
      com.tencent.mm.sdk.b.a.vgX.b(((x)localObject2).vHE);
      com.tencent.mm.sdk.b.a.vgX.b(((x)localObject2).vNl);
      ((x)localObject2).bYa();
      ((x)localObject2).bXY();
      ((x)localObject2).bXZ();
      localObject2 = ((HomeUI)localObject1).vIx;
      localObject4 = new ax();
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject4);
      if ((((ax)localObject4).eCf.eCg) && (!com.tencent.mm.platformtools.t.nm(((ax)localObject4).eCf.eCh)))
      {
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LauncherUI.GlobalAlertMgr", "  now show msg:%s", new Object[] { ((ax)localObject4).eCf.eCh });
        com.tencent.mm.ui.base.h.b(((j)localObject2).vFP, ((ax)localObject4).eCf.eCh, ((ax)localObject4).eCf.title, true);
      }
      if (!((j)localObject2).a(((j)localObject2).vIa)) {
        at.xB().h(new j.6((j)localObject2), 500L);
      }
      ((j)localObject2).vIa = null;
      com.tencent.mm.sdk.a.b.bk(true);
      bool1 = ((HomeUI)localObject1).vIw.bWe();
      if ((!bool1) && (at.AU()))
      {
        com.tencent.mm.plugin.sight.decode.a.b.ye();
        if ((p.a.tmb != null) && (p.a.tmc != null) && (!com.tencent.mm.platformtools.t.nm(p.a.tmc.aKE())))
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI.HomeUI", "launcher onResume end track %s", new Object[] { p.a.tmb.aKu() });
          localObject2 = new ep();
          ((ep)localObject2).eGm.username = p.a.tmb.aKu();
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
        }
      }
      if (!bool1) {
        k.a(((HomeUI)localObject1).vFP, 3, ((HomeUI)localObject1).vIy.kZJ, "directReport_onResume");
      }
      com.tencent.mm.ui.widget.k.b(((HomeUI)localObject1).vFP);
      ((HomeUI)localObject1).vFP.U(1.0F);
      ((HomeUI)localObject1).vIv = HomeUI.a.vIT;
      if (((HomeUI)localObject1).vIp)
      {
        ((HomeUI)localObject1).vIp = false;
        ((HomeUI)localObject1).bXa();
      }
      com.tencent.mm.ac.m.Ds();
      localObject2 = com.tencent.mm.y.as.gnb.B("login_user_name", "");
      if (((at.AT()) || (!((String)localObject2).equals(""))) && (!at.AU())) {
        com.tencent.mm.kernel.h.xw().initialize();
      }
      l2 = System.currentTimeMillis();
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.LauncherUI.HomeUI", "[Launching Application]");
      com.tencent.mm.kernel.k.d(((HomeUI)localObject1).vFP, false);
      com.tencent.mm.kernel.k.e(((HomeUI)localObject1).vFP, false);
      long l3 = System.currentTimeMillis();
      if (!((HomeUI)localObject1).vFP.getSharedPreferences(ab.bPU(), 0).getBoolean("settings_landscape_mode", false)) {
        break label3224;
      }
      ((HomeUI)localObject1).vFP.setRequestedOrientation(-1);
      label1515:
      long l4 = System.currentTimeMillis();
      if (bXe() != null)
      {
        ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().a("showprivacypolicy", ((HomeUI)localObject1).vIK);
        ((HomeUI)localObject1).kY(false);
        com.tencent.mm.sdk.b.a.vgX.b(((HomeUI)localObject1).vIG);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LauncherUI.HomeUI", "KEVIN MainTabUI onResume:" + (System.currentTimeMillis() - l4));
      }
      com.tencent.mm.sdk.platformtools.w.v("MicroMsg.LauncherUI.HomeUI", "KEVIN dispatch resume " + (System.currentTimeMillis() - l3));
      com.tencent.mm.ac.b.a(com.tencent.mm.y.q.zE(), false, -1);
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LauncherUI.HomeUI", "KEVIN LaucherUI lauch last : " + (System.currentTimeMillis() - l2));
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI.HomeUI", "initView " + (System.currentTimeMillis() - l1));
      if (((HomeUI)localObject1).vIp)
      {
        ((HomeUI)localObject1).vIp = false;
        ((HomeUI)localObject1).bXa();
      }
      localObject2 = com.tencent.mm.app.k.pj();
      ((com.tencent.mm.app.k)localObject2).esP = true;
      ((com.tencent.mm.app.k)localObject2).esQ.removeMessages(63537);
      ((com.tencent.mm.app.k)localObject2).esQ.removeMessages(62537);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI.HomeUI", "start time check LauncherUI Launcher onResume end: " + (System.currentTimeMillis() - l1));
      if (com.tencent.mm.y.q.Am().booleanValue()) {
        ((HomeUI)localObject1).bWT();
      }
      i = com.tencent.mm.br.a.ea(ab.getContext());
      l1 = System.currentTimeMillis();
      if (l1 - ab.getContext().getSharedPreferences(ab.bPU() + "_font_size_report_time", 4).getLong("font_size_report_time", 0L) > 604800000L)
      {
        g.ork.i(14239, new Object[] { Integer.valueOf(i) });
        ab.getContext().getSharedPreferences(ab.bPU() + "_font_size_report_time", 4).edit().putLong("font_size_report_time", l1).commit();
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI.HomeUI", "using font size kvReport logID:%d , usingFontSize: %d", new Object[] { Integer.valueOf(14239), Integer.valueOf(i) });
      }
      localObject1 = this.vJj;
      if (((d)localObject1).bWe())
      {
        com.tencent.mm.sdk.f.e.post(new d.1((d)localObject1), "directReport_onResume");
        ((d)localObject1).vFR = com.tencent.mm.platformtools.t.Pu();
        if (((d)localObject1).vFY.bXH()) {
          ((d)localObject1).vFY.vMl.mEnable = true;
        }
      }
      if (((d)localObject1).bWj())
      {
        Looper.myQueue().addIdleHandler(new d.11((d)localObject1));
        ((d)localObject1).vFS = new d.12((d)localObject1);
        Looper.myQueue().addIdleHandler(((d)localObject1).vFS);
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "resumeNormalJump");
      MMFragmentActivity.a.bXN();
      if (("pushcontent_notification".equals(com.tencent.mm.sdk.platformtools.s.i(getIntent(), "nofification_type"))) && (!com.tencent.mm.platformtools.t.nm(com.tencent.mm.sdk.platformtools.s.i(getIntent(), "Main_FromUserName"))))
      {
        localObject1 = com.tencent.mm.sdk.platformtools.s.i(getIntent(), "Main_FromUserName");
        i = com.tencent.mm.sdk.platformtools.s.a(getIntent(), "MainUI_User_Last_Msg_Type", 0);
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.LauncherUI", "launch report, fromUserName = %s, msgType = %d" + (String)localObject1 + i);
        g.ork.i(10856, new Object[] { Integer.valueOf(i), localObject1, Integer.valueOf(0) });
      }
      localObject1 = com.tencent.mm.sdk.platformtools.s.i(getIntent(), "LauncherUI.Shortcut.LaunchType");
      if (localObject1 != null)
      {
        if (!((String)localObject1).equals("launch_type_voip")) {
          break label3236;
        }
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LauncherUI", "launch, LaunchTypeVOIP");
        startActivity(new Intent().setClassName(this, "com.tencent.mm.ui.contact.VoipAddressUI").putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_voip"));
        g.ork.i(11034, new Object[] { Integer.valueOf(2), Integer.valueOf(0) });
      }
      label2264:
      localObject1 = com.tencent.mm.sdk.platformtools.s.i(getIntent(), "LauncherUI.switch.tab");
      if (!com.tencent.mm.platformtools.t.nm((String)localObject1))
      {
        this.vJi.vIy.Vi((String)localObject1);
        getIntent().putExtra("LauncherUI.switch.tab", "");
      }
      if ((com.tencent.mm.sdk.platformtools.s.a(getIntent(), "LauncherUI.From.Scaner.Shortcut", false)) || (this.vJn))
      {
        this.vJn = false;
        localObject1 = bXe();
        if (localObject1 != null) {
          ((LauncherUI)localObject1).vJi.bWX();
        }
        getIntent().putExtra("LauncherUI.From.Scaner.Shortcut", false);
        getIntent().putExtra("LauncherUI.switch.tab", "tab_find_friend");
      }
      bool1 = com.tencent.mm.sdk.platformtools.s.a(getIntent(), "LauncherUI.From.Biz.Shortcut", false);
      if (!bool1) {
        break label3312;
      }
      localObject1 = com.tencent.mm.sdk.platformtools.s.i(getIntent(), "LauncherUI.Shortcut.Username");
      label2410:
      if (bool1)
      {
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LauncherUI", "launch, fromBizShortcut, bizUsername = " + (String)localObject1);
        if (!com.tencent.mm.platformtools.t.nm((String)localObject1))
        {
          localObject4 = com.tencent.mm.plugin.base.model.b.ts((String)localObject1);
          if (!com.tencent.mm.platformtools.t.nm((String)localObject4))
          {
            if (com.tencent.mm.y.s.fC((String)localObject4))
            {
              com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LauncherUI", "launch, username is contact, go to chattingui");
              if (!com.tencent.mm.af.f.iN((String)localObject4)) {
                break label3557;
              }
              if (!com.tencent.mm.af.f.dL((String)localObject4)) {
                break label3337;
              }
              localObject1 = new Intent();
              ((Intent)localObject1).setClassName(this, "com.tencent.mm.ui.bizchat.BizChatConversationUI");
              ((Intent)localObject1).putExtra("Contact_User", (String)localObject4);
              ((Intent)localObject1).putExtra("biz_chat_from_scene", 9);
              ((Intent)localObject1).addFlags(67108864);
              startActivity((Intent)localObject1);
            }
            label2548:
            getIntent().putExtra("LauncherUI_From_Biz_Shortcut", false);
            getIntent().putExtra("LauncherUI.From.Biz.Shortcut", false);
          }
        }
      }
      this.vJm = true;
    }
    label2637:
    label3212:
    label3224:
    label3236:
    label3312:
    label3337:
    label3557:
    label3579:
    do
    {
      if (this.vJp != null)
      {
        overridePendingTransition(R.a.aLj, R.a.aLj);
        this.vJq.postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(3470870446080L, 25860);
            if (LauncherUI.b(LauncherUI.this) != null)
            {
              LauncherUI.b(LauncherUI.this).bZa();
              LauncherUI.c(LauncherUI.this);
            }
            GMTrace.o(3470870446080L, 25860);
          }
        }, 50L);
      }
      com.tencent.mm.app.c.cX(5);
      nl(false);
      GMTrace.o(1684566704128L, 12551);
      return;
      i = 0;
      break;
      l2 = System.currentTimeMillis();
      MMActivity.eJ(((HomeUI)localObject1).vFP);
      try
      {
        localObject2 = new HashSet();
        localObject4 = ((HomeUI)localObject1).getString(R.l.dma).split(";");
        ((Set)localObject2).add(localObject4[0]);
        ((Set)localObject2).add(localObject4[1]);
        com.tencent.mm.y.r.b((Set)localObject2);
        com.tencent.mm.sdk.b.a.vgX.m(new ba());
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LauncherUI.HomeUI", "KEVIN MainTabUI onCreate initLanguage: " + (System.currentTimeMillis() - l2));
        ((HomeUI)localObject1).lVD = ((LayoutInflater)((HomeUI)localObject1).vFP.getSystemService("layout_inflater"));
        l2 = System.currentTimeMillis();
        ((HomeUI)localObject1).hqF = v.fb(((HomeUI)localObject1).vFP).inflate(R.i.cBd, null);
        ((FirstScreenFrameLayout)((HomeUI)localObject1).hqF.findViewById(R.h.bAj)).vHV = new HomeUI.1((HomeUI)localObject1);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LauncherUI.HomeUI", "KEVIN MainTabUI onCreate inflater.inflate(R.layout.main_tab, null);" + (System.currentTimeMillis() - l2));
        ((HomeUI)localObject1).vFP.setContentView(((HomeUI)localObject1).hqF);
        Looper.myQueue().addIdleHandler(((HomeUI)localObject1).vIH);
        ((HomeUI)localObject1).vIo = true;
        ((HomeUI)localObject1).vIF = ((VoiceSearchLayout)((HomeUI)localObject1).vFP.findViewById(R.h.clV));
        ((HomeUI)localObject1).vIF.ze(BackwardSupportUtil.b.a(((HomeUI)localObject1).vFP, 100.0F));
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LauncherUI.HomeUI", "KEVIN MainTabUI onCreate initView(); " + (System.currentTimeMillis() - l2));
        l2 = System.currentTimeMillis();
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LauncherUI.HomeUI", "KEVIN handleJump(getIntent()); " + (System.currentTimeMillis() - l2));
        l2 = System.currentTimeMillis();
        if (!com.tencent.mm.sdk.platformtools.s.a(((HomeUI)localObject1).vFP.getIntent(), "LauncherUI.enter_from_reg", false)) {
          MMAppMgr.pG();
        }
        localObject2 = new iq();
        ((iq)localObject2).eMd.eHz = 2;
        ((iq)localObject2).eMd.eMg = 3;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LauncherUI.HomeUI", "KEVIN syncAddrBookAndUpload checkLastLbsroomAndQuitIt " + (System.currentTimeMillis() - l2));
        ((HomeUI)localObject1).bWZ();
        ((HomeUI)localObject1).FM.show();
        ((HomeUI)localObject1).hqF.post(new HomeUI.12((HomeUI)localObject1));
        com.tencent.mm.sdk.platformtools.w.v("MicroMsg.LauncherUI.HomeUI", "KEVIN MainTabUI onCreate : " + (System.currentTimeMillis() - l1));
        af.i(new HomeUI.15((HomeUI)localObject1), 2000L);
        ((HomeUI)localObject1).hqF.addOnLayoutChangeListener(new HomeUI.16((HomeUI)localObject1));
        com.tencent.mm.pluginsdk.e.a(((HomeUI)localObject1).vFP, ((HomeUI)localObject1).hqF);
        ((HomeUI)localObject1).hqF.postDelayed(new HomeUI.17((HomeUI)localObject1), 20L);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.LauncherUI.HomeUI", localException, "", new Object[0]);
        }
      }
      at.getNotification().aE(false);
      break label866;
      ((HomeUI)localObject1).vFP.setRequestedOrientation(1);
      break label1515;
      if (!((String)localObject1).equals("launch_type_voip_audio")) {
        break label2264;
      }
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LauncherUI", "launch, LaunchTypeVOIPAudio");
      startActivity(new Intent().setClassName(this, "com.tencent.mm.ui.contact.VoipAddressUI").putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_voip_audio"));
      g.ork.i(11034, new Object[] { Integer.valueOf(2), Integer.valueOf(1) });
      break label2264;
      bool1 = com.tencent.mm.sdk.platformtools.s.a(getIntent(), "LauncherUI_From_Biz_Shortcut", false);
      localObject1 = getIntent().getAction();
      break label2410;
      if (com.tencent.mm.af.f.iP((String)localObject4))
      {
        localObject1 = new Intent();
        ((Intent)localObject1).setClassName(this, "com.tencent.mm.ui.conversation.EnterpriseConversationUI");
        ((Intent)localObject1).putExtra("enterprise_biz_name", (String)localObject4);
        ((Intent)localObject1).putExtra("enterprise_biz_display_name", com.tencent.mm.y.r.fs((String)localObject4));
        startActivity((Intent)localObject1);
        break label2548;
      }
      if (com.tencent.mm.af.f.iQ((String)localObject4))
      {
        localObject1 = com.tencent.mm.af.f.iK((String)localObject4);
        if (localObject1 == null) {}
        for (localObject1 = null;; localObject1 = ((com.tencent.mm.af.d)localObject1).EJ())
        {
          localObject3 = localObject1;
          if (localObject1 == null) {
            localObject3 = "";
          }
          localObject1 = new Intent();
          ((Intent)localObject1).putExtra("rawUrl", (String)localObject3);
          ((Intent)localObject1).putExtra("useJs", true);
          ((Intent)localObject1).putExtra("srcUsername", (String)localObject4);
          ((Intent)localObject1).putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
          ((Intent)localObject1).addFlags(67108864);
          com.tencent.mm.bj.d.b(this, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
          break;
        }
      }
      localObject1 = bXe();
      Object localObject3 = new Bundle();
      ((Bundle)localObject3).putInt("chat_from_scene", 3);
      ((LauncherUI)localObject1).a((String)localObject4, (Bundle)localObject3, false);
      break label2548;
      localObject1 = bXe();
      if (localObject1 == null) {
        break label2548;
      }
      ((LauncherUI)localObject1).a((String)localObject4, null, false);
      break label2548;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "doOnResumeImp resumeLogoutJump");
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "resumeLogoutJump");
      MMFragmentActivity.a.bXN();
      localObject1 = com.tencent.mm.y.as.gnb.B("login_user_name", "");
    } while ((!at.AT()) && (((String)localObject1).equals("")));
    com.tencent.mm.plugin.report.service.f.tr(8);
    Object localObject1 = com.tencent.mm.kernel.h.xx();
    ((com.tencent.mm.kernel.b)localObject1).fYr.a(new bf(new b.3((com.tencent.mm.kernel.b)localObject1), "reset accinfo"), 0);
    if ((this.eLY.getFlags() & 0x4000000) == 67108864) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      boolean bool2 = com.tencent.mm.sdk.platformtools.s.a(this.eLY, "Intro_Notify", false);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "resumeLogoutJump hasDoInit:%b needResetLaunchUI:%b formNotification:%b, ishold:%b", new Object[] { Boolean.valueOf(this.vJl), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(at.wF()) });
      at.hold();
      localObject1 = new com.tencent.mm.g.a.x();
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
      com.tencent.mm.kernel.h.xz().eP("[" + this.vJl + " " + bool1 + " " + bool2 + "]");
      if (com.tencent.mm.sdk.platformtools.s.a(getIntent(), "LauncherUI.From.Scaner.Shortcut", false)) {
        this.vJn = true;
      }
      if ((!com.tencent.mm.sdk.platformtools.s.a(this.eLY, "Intro_Switch", false)) && ((!at.wF()) || (!this.vJl))) {
        break label3938;
      }
      com.tencent.mm.sdk.platformtools.w.appenderClose();
      BaseEvent.onSingalCrash(0);
      finish();
      localObject1 = new Intent(this, LauncherUI.class);
      ((Intent)localObject1).addFlags(67108864);
      startActivity((Intent)localObject1);
      at.unhold();
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "checktask ConstantsUI.Intro.KSwitch kill myself.");
      com.tencent.mm.sdk.platformtools.w.bPM();
      at.unhold();
      Process.killProcess(Process.myPid());
      at.unhold();
      break;
    }
    label3938:
    if (!com.tencent.mm.y.as.gnb.B("login_user_name", "").equals(""))
    {
      i = bg.Sy(com.tencent.mm.y.as.gnb.B("last_login_use_voice", ""));
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "pluginSwitch  " + i);
      if ((i & 0x20000) != 0)
      {
        startActivity(new Intent().setClassName(this, "com.tencent.mm.ui.account.LoginVoiceUI"));
        label4023:
        com.tencent.mm.ui.base.b.fk(this);
      }
    }
    for (;;)
    {
      com.tencent.mm.plugin.report.service.f.tr(8);
      break;
      startActivity(new Intent().setClassName(this, "com.tencent.mm.ui.account.LoginPasswordUI"));
      break label4023;
      localObject1 = new WelcomeSelectView(this);
      setContentView((View)localObject1);
      ((WelcomeView)localObject1).bZa();
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    GMTrace.i(1687116840960L, 12570);
    d locald = this.vJj;
    if ((locald.vFY != null) && (!com.tencent.mm.platformtools.t.nm(locald.vFY.cci())))
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LauncherUI.ChattingTabUI", "onSaveInstanceState:%s", new Object[] { locald.vFY.cci() });
      paramBundle.putString("last_restore_talker", locald.vFY.cci());
    }
    GMTrace.o(1687116840960L, 12570);
  }
  
  protected void onStop()
  {
    GMTrace.i(21036615598080L, 156735);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI", "onStop");
    com.tencent.mm.app.c.oV();
    super.onStop();
    GMTrace.o(21036615598080L, 156735);
  }
  
  public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
  {
    Object localObject2 = null;
    GMTrace.i(1683090309120L, 12540);
    Object localObject3 = this.vJj;
    Object localObject1 = localObject2;
    if (((d)localObject3).vFY != null)
    {
      localObject1 = localObject2;
      if (((d)localObject3).vFY.wDR != null)
      {
        if (((d)localObject3).vFY.bXH()) {
          break label76;
        }
        localObject1 = localObject2;
      }
    }
    for (;;)
    {
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = super.onWindowStartingActionMode(paramCallback);
      }
      GMTrace.o(1683090309120L, 12540);
      return (ActionMode)localObject2;
      label76:
      localObject1 = localObject2;
      if (!com.tencent.mm.compatible.util.d.ev(22))
      {
        localObject3 = ((d)localObject3).vFY.wDR.startActionMode(paramCallback);
        localObject1 = localObject2;
        if (localObject3 != null) {
          localObject1 = localObject3;
        }
      }
    }
  }
  
  static abstract interface a
  {
    public abstract boolean bWe();
  }
  
  static abstract interface b
  {
    public abstract void a(HomeUI.FitSystemWindowLayoutView paramFitSystemWindowLayoutView, Rect paramRect, ViewGroup paramViewGroup);
    
    public abstract boolean bWY();
    
    public abstract void bXc();
  }
  
  static abstract interface c
  {
    public abstract void bXb();
  }
  
  static abstract interface d
  {
    public abstract void bVK();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\LauncherUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */