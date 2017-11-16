package com.tencent.mm.plugin.game.gamewebview.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.k.d.b;
import com.tencent.mm.plugin.game.gamewebview.ipc.AddShortcutTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GWMainProcessTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameKeepPageTopTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.game.gamewebview.model.FavUrlTask;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.o;
import com.tencent.mm.ui.base.p.a;
import com.tencent.mm.ui.base.p.b;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.snackbar.b.b;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import com.tencent.mm.ui.widget.f;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

public class i
{
  public static b.b lKN;
  protected GameWebViewUI lJb;
  private com.tencent.mm.plugin.webview.modeltools.a lKJ;
  public HashSet<Integer> lKK;
  public Map<String, Integer> lKL;
  public HashSet<Integer> lKM;
  protected b lKt;
  private boolean mEnable;
  
  static
  {
    GMTrace.i(16995588243456L, 126627);
    lKN = new b.b()
    {
      public final void aEW()
      {
        GMTrace.i(17990946914304L, 134043);
        FavUrlTask localFavUrlTask = new FavUrlTask();
        localFavUrlTask.actionType = 2;
        GameWebViewMainProcessService.a(localFavUrlTask);
        GMTrace.o(17990946914304L, 134043);
      }
    };
    GMTrace.o(16995588243456L, 126627);
  }
  
  public i(b paramb)
  {
    GMTrace.i(18010140049408L, 134186);
    this.lKK = new HashSet();
    this.lKL = new HashMap();
    this.lKM = new HashSet();
    this.mEnable = false;
    this.lKt = paramb;
    this.lJb = ((GameWebViewUI)paramb.getContext());
    this.lKL.clear();
    this.lKL.put("menuItem:share:brand", Integer.valueOf(0));
    this.lKL.put("menuItem:share:appMessage", Integer.valueOf(1));
    this.lKL.put("menuItem:share:dataMessage", Integer.valueOf(23));
    this.lKL.put("menuItem:share:timeline", Integer.valueOf(2));
    this.lKL.put("menuItem:favorite", Integer.valueOf(3));
    this.lKL.put("menuItem:profile", Integer.valueOf(5));
    this.lKL.put("menuItem:addContact", Integer.valueOf(5));
    this.lKL.put("menuItem:copyUrl", Integer.valueOf(6));
    this.lKL.put("menuItem:openWithSafari", Integer.valueOf(7));
    this.lKL.put("menuItem:share:email", Integer.valueOf(8));
    this.lKL.put("menuItem:delete", Integer.valueOf(9));
    this.lKL.put("menuItem:exposeArticle", Integer.valueOf(10));
    this.lKL.put("menuItem:setFont", Integer.valueOf(11));
    this.lKL.put("menuItem:editTag", Integer.valueOf(12));
    this.lKL.put("menuItem:readMode", Integer.valueOf(14));
    this.lKL.put("menuItem:originPage", Integer.valueOf(14));
    this.lKL.put("menuItem:share:qq", Integer.valueOf(20));
    this.lKL.put("menuItem:share:weiboApp", Integer.valueOf(21));
    this.lKL.put("menuItem:share:QZone", Integer.valueOf(22));
    this.lKL.put("menuItem:share:enterprise", Integer.valueOf(24));
    this.lKL.put("menuItem:refresh", Integer.valueOf(28));
    this.lKL.put("menuItem:share:wework", Integer.valueOf(25));
    this.lKL.put("menuItem:share:weread", Integer.valueOf(26));
    this.lKL.put("menuItem:keepTop", Integer.valueOf(30));
    this.lKL.put("menuItem:cancelKeepTop", Integer.valueOf(32));
    this.lKL.put("menuItem:addShortcut", Integer.valueOf(29));
    this.lKL.put("menuItem:search", Integer.valueOf(31));
    this.lKM.clear();
    this.lKM.add(Integer.valueOf(28));
    this.lKM.add(Integer.valueOf(6));
    this.lKM.add(Integer.valueOf(27));
    this.lKM.add(Integer.valueOf(30));
    this.lKM.add(Integer.valueOf(32));
    GMTrace.o(18010140049408L, 134186);
  }
  
  public static boolean aEV()
  {
    GMTrace.i(16995319808000L, 126625);
    FavUrlTask localFavUrlTask = new FavUrlTask();
    localFavUrlTask.actionType = 3;
    GameWebViewMainProcessService.b(localFavUrlTask);
    boolean bool = localFavUrlTask.lIl;
    GMTrace.o(16995319808000L, 126625);
    return bool;
  }
  
  public static boolean h(MenuItem paramMenuItem)
  {
    GMTrace.i(16994917154816L, 126622);
    if (paramMenuItem.getItemId() >= 10000)
    {
      GMTrace.o(16994917154816L, 126622);
      return true;
    }
    GMTrace.o(16994917154816L, 126622);
    return false;
  }
  
  protected final boolean Ok()
  {
    GMTrace.i(16995185590272L, 126624);
    if ((this.lKt.aEe()) || (this.lKt.lIX))
    {
      GMTrace.o(16995185590272L, 126624);
      return true;
    }
    GameKeepPageTopTask localGameKeepPageTopTask = new GameKeepPageTopTask();
    localGameKeepPageTopTask.type = 1;
    GameWebViewMainProcessService.b(localGameKeepPageTopTask);
    if (bg.nl(this.lKt.lHe.lID).equals(bg.nl(localGameKeepPageTopTask.url)))
    {
      GMTrace.o(16995185590272L, 126624);
      return true;
    }
    GMTrace.o(16995185590272L, 126624);
    return false;
  }
  
  public void aEG()
  {
    GMTrace.i(16995051372544L, 126623);
    final Object localObject = Boolean.valueOf(false);
    final f localf;
    if (((Boolean)localObject).booleanValue())
    {
      localf = new f(this.lJb, f.xpQ, false);
      localf.xhT = new p.a()
      {
        public final void a(ImageView paramAnonymousImageView, MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(18023964475392L, 134289);
          if (i.h(paramAnonymousMenuItem))
          {
            paramAnonymousImageView.setVisibility(8);
            GMTrace.o(18023964475392L, 134289);
            return;
          }
          GMTrace.o(18023964475392L, 134289);
        }
      };
      localf.xhU = new p.b()
      {
        public final void a(TextView paramAnonymousTextView, MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(17998060453888L, 134096);
          paramAnonymousMenuItem = paramAnonymousMenuItem.getTitle();
          if (paramAnonymousTextView != null) {
            paramAnonymousTextView.setText(paramAnonymousMenuItem);
          }
          GMTrace.o(17998060453888L, 134096);
        }
      };
      localf.qil = new p.d()
      {
        public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          GMTrace.i(17987323035648L, 134016);
          if ((i.this.lJb.isFinishing()) || (i.this.lJb.vKD))
          {
            GMTrace.o(17987323035648L, 134016);
            return;
          }
          if (i.h(paramAnonymousMenuItem))
          {
            paramAnonymousMenuItem.getMenuInfo();
            GMTrace.o(17987323035648L, 134016);
            return;
          }
          switch (paramAnonymousMenuItem.getItemId())
          {
          }
          for (;;)
          {
            GMTrace.o(17987323035648L, 134016);
            return;
            i.this.aEJ();
            GMTrace.o(17987323035648L, 134016);
            return;
            i.this.aEK();
            GMTrace.o(17987323035648L, 134016);
            return;
            i.this.aEL();
            GMTrace.o(17987323035648L, 134016);
            return;
            i.this.aER();
            GMTrace.o(17987323035648L, 134016);
            return;
            i.this.refresh();
            GMTrace.o(17987323035648L, 134016);
            return;
            i.this.aEM();
            GMTrace.o(17987323035648L, 134016);
            return;
            i.this.aEN();
            GMTrace.o(17987323035648L, 134016);
            return;
            i.this.aEO();
            GMTrace.o(17987323035648L, 134016);
            return;
            i.this.aEP();
            GMTrace.o(17987323035648L, 134016);
            return;
            i.this.aES();
            GMTrace.o(17987323035648L, 134016);
            return;
            i.this.aET();
            GMTrace.o(17987323035648L, 134016);
            return;
            i.this.aEQ();
            GMTrace.o(17987323035648L, 134016);
            return;
            i.this.lKt.lHe.eU(true);
            GMTrace.o(17987323035648L, 134016);
            return;
            i.this.aEU();
          }
        }
      };
      localf.qik = new p.c()
      {
        public final void a(n paramAnonymousn)
        {
          GMTrace.i(17990678478848L, 134041);
          g.ork.a(480L, 0L, 1L, false);
          Object localObject1;
          Object localObject2;
          if (localObject.booleanValue())
          {
            int j = this.lKQ.size();
            int i = 0;
            while (i < j)
            {
              localObject1 = (d.b)this.lKQ.get(i);
              localObject2 = (o)paramAnonymousn.e(((d.b)localObject1).id, ((d.b)localObject1).title);
              ((o)localObject2).wdD = ((ContextMenu.ContextMenuInfo)localObject1);
              ((o)localObject2).setIcon(null);
              ((o)localObject2).setIcon(0);
              i += 1;
            }
            GMTrace.o(17990678478848L, 134041);
            return;
          }
          if ((i.this.lKt.lHe.eS(21)) && (i.this.oE(1))) {
            paramAnonymousn.a(1, i.this.lJb.getString(R.l.dPA), R.k.cKE);
          }
          if ((i.this.lKt.lHe.eS(23)) && (i.this.oE(2))) {
            paramAnonymousn.a(2, i.this.lJb.getString(R.l.dPB), R.k.cKu);
          }
          boolean bool1 = i.this.getBundle().getBoolean("is_favorite_item", false);
          if ((!bool1) && (i.aEV()) && (i.this.oE(3))) {
            paramAnonymousn.a(3, i.this.lJb.getString(R.l.dNH), R.k.cKn);
          }
          paramAnonymousn.a(31, i.this.lJb.getString(R.l.elH), R.k.cKC);
          if ((i.this.lKt.lHe.eS(44)) && (i.this.oE(6))) {
            paramAnonymousn.a(6, i.this.lJb.getString(R.l.elf), R.k.cKh);
          }
          boolean bool2 = i.this.getBundle().getBoolean("key_detail_can_delete", true);
          if ((bool1) && (bool2) && (i.aEV()))
          {
            if (i.this.oE(12)) {
              paramAnonymousn.a(12, i.this.lJb.getString(R.l.dsR), R.k.cKc);
            }
            if (i.this.oE(9)) {
              paramAnonymousn.a(9, i.this.lJb.getString(R.l.cSt), R.k.cKi);
            }
          }
          if (!i.this.Ok()) {
            if (i.this.oE(30)) {
              paramAnonymousn.a(30, i.this.lJb.getString(R.l.dPH), R.k.cKG);
            }
          }
          for (;;)
          {
            if ((i.this.lKt.lHe.eS(45)) && (i.this.oE(7))) {
              paramAnonymousn.a(7, i.this.lJb.getString(R.l.elk), R.k.cKf);
            }
            if (i.this.oE(28)) {
              paramAnonymousn.a(28, i.this.lJb.getString(R.l.ejH), R.k.cKA);
            }
            if (i.this.lKt.lHe.ivn) {
              paramAnonymousn.a(27, i.this.lJb.getString(R.l.dPG), R.k.cKm);
            }
            localObject1 = i.this.lKt.lHe.aEs();
            localObject2 = i.this.getBundle().getString("shortcut_user_name");
            if ((!i.this.getBundle().getBoolean("from_shortcut", false)) && (!bg.nm((String)localObject1)) && (!bg.nm((String)localObject2)) && (i.this.lKt.lHe.eS(255)) && (i.this.oE(29))) {
              paramAnonymousn.a(29, i.this.lJb.getString(R.l.dPy), R.k.cPG);
            }
            paramAnonymousn.a(10, i.this.lJb.getString(R.l.daI), R.k.cKg);
            GMTrace.o(17990678478848L, 134041);
            return;
            if (i.this.oE(32)) {
              paramAnonymousn.a(32, i.this.lJb.getString(R.l.dPC), R.k.cKF);
            }
          }
        }
      };
      localObject = this.lKt.lHe.aEr();
      if (!bg.nm((String)localObject))
      {
        localObject = Uri.parse((String)localObject).getHost();
        if (!bg.nm((String)localObject)) {
          localf.d(this.lJb.getString(R.l.ekk, new Object[] { localObject }), 1);
        }
      }
      if (!this.lKt.isFullScreen()) {
        break label232;
      }
      localf.rRu = true;
    }
    for (localf.rRv = true;; localf.rRv = false)
    {
      if (!this.lKt.lHe.lJt.isShown()) {
        break label245;
      }
      this.lKt.lHe.eU(false);
      af.i(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18020340596736L, 134262);
          localf.bFk();
          GMTrace.o(18020340596736L, 134262);
        }
      }, 100L);
      GMTrace.o(16995051372544L, 126623);
      return;
      localf = new f(this.lJb, f.xpP, true);
      break;
      label232:
      localf.rRu = false;
    }
    label245:
    this.lJb.aLo();
    af.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17012231241728L, 126751);
        localf.bFk();
        GMTrace.o(17012231241728L, 126751);
      }
    }, 100L);
    GMTrace.o(16995051372544L, 126623);
  }
  
  protected final void aEJ()
  {
    GMTrace.i(18010408484864L, 134188);
    if (!this.lKt.lHe.aEv()) {
      this.lKt.aEf();
    }
    GMTrace.o(18010408484864L, 134188);
  }
  
  protected final void aEK()
  {
    GMTrace.i(18010542702592L, 134189);
    com.tencent.mm.plugin.game.gamewebview.model.h.c(this.lKt.lHe);
    GMTrace.o(18010542702592L, 134189);
  }
  
  protected final void aEL()
  {
    GMTrace.i(18010676920320L, 134190);
    d locald = this.lKt.lHe;
    if (locald.bd("shareTimeline", 88))
    {
      locald.zC("shareTimeline");
      locald.cp("menu:share:timeline", "");
      GMTrace.o(18010676920320L, 134190);
      return;
    }
    JSONObject localJSONObject = new JSONObject();
    try
    {
      String str = locald.Lg();
      localJSONObject.put("link", str);
      localJSONObject.put("desc", str);
      localJSONObject.put("title", locald.getTitle());
      locald.cq("shareTimeline", localJSONObject.toString());
      GMTrace.o(18010676920320L, 134190);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.GameWebViewShareController", localException, "", new Object[0]);
      }
    }
  }
  
  protected final void aEM()
  {
    GMTrace.i(18010811138048L, 134191);
    String str = this.lKt.lHe.Lg();
    ClipboardManager localClipboardManager = (ClipboardManager)this.lJb.getSystemService("clipboard");
    if (localClipboardManager != null) {}
    try
    {
      localClipboardManager.setText(str);
      Toast.makeText(this.lJb, this.lJb.getString(R.l.elg), 0).show();
      GMTrace.o(18010811138048L, 134191);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.OptionMenuBtnHelp", localException, "clip.setText error", new Object[0]);
      GMTrace.o(18010811138048L, 134191);
    }
    w.e("MicroMsg.OptionMenuBtnHelp", "clipboard manager is null");
    GMTrace.o(18010811138048L, 134191);
    return;
  }
  
  protected final void aEN()
  {
    GMTrace.i(18010945355776L, 134192);
    w.i("MicroMsg.OptionMenuBtnHelp", "doKeepPageTopLogic");
    Object localObject = getBundle().getString("custom_keep_top_url");
    String str1 = getBundle().getString("custom_keep_top_title");
    String str2 = getBundle().getString("shortcut_user_name");
    GameKeepPageTopTask localGameKeepPageTopTask = new GameKeepPageTopTask();
    localGameKeepPageTopTask.type = 2;
    if ((!bg.nm(str1)) && (!bg.nm((String)localObject)))
    {
      localGameKeepPageTopTask.url = ((String)localObject);
      localGameKeepPageTopTask.title = str1;
    }
    for (localGameKeepPageTopTask.username = str2;; localGameKeepPageTopTask.username = "")
    {
      GameWebViewMainProcessService.a(localGameKeepPageTopTask);
      localObject = this.lKt;
      ((b)localObject).lIX = true;
      ((SwipeBackLayout)localObject).mEnable = ((b)localObject).aEc();
      ((b)localObject).lIW.b((b)localObject);
      com.tencent.mm.ui.snackbar.a.e(this.lJb, this.lJb.getString(R.l.dPI));
      GMTrace.o(18010945355776L, 134192);
      return;
      localGameKeepPageTopTask.url = bg.nl(this.lKt.lHe.lID);
      localGameKeepPageTopTask.title = this.lKt.lHe.getTitle();
    }
  }
  
  protected final void aEO()
  {
    GMTrace.i(18011079573504L, 134193);
    Object localObject = new GameKeepPageTopTask();
    ((GameKeepPageTopTask)localObject).type = 2;
    ((GameKeepPageTopTask)localObject).url = "";
    ((GameKeepPageTopTask)localObject).title = "";
    ((GameKeepPageTopTask)localObject).username = "";
    GameWebViewMainProcessService.a((GWMainProcessTask)localObject);
    localObject = this.lKt;
    ((b)localObject).lIX = false;
    ((SwipeBackLayout)localObject).mEnable = ((b)localObject).aEc();
    ((b)localObject).lIW.aEh();
    com.tencent.mm.ui.snackbar.a.e(this.lJb, this.lJb.getString(R.l.dPD));
    GMTrace.o(18011079573504L, 134193);
  }
  
  protected final void aEP()
  {
    GMTrace.i(18011213791232L, 134194);
    String str = this.lKt.lHe.Lg();
    if (this.lKJ == null) {
      this.lKJ = new com.tencent.mm.plugin.webview.modeltools.a();
    }
    com.tencent.mm.plugin.webview.modeltools.a.d(this.lJb, str);
    GMTrace.o(18011213791232L, 134194);
  }
  
  protected final void aEQ()
  {
    GMTrace.i(18011348008960L, 134195);
    String str1 = getBundle().getString("shortcut_user_name");
    String str2 = this.lKt.lHe.aEs();
    if ((bg.nm(str1)) || (bg.nm(str2)))
    {
      w.e("MicroMsg.OptionMenuBtnHelp", "addShortcut,appid or username is null");
      GMTrace.o(18011348008960L, 134195);
      return;
    }
    final AddShortcutTask localAddShortcutTask = new AddShortcutTask();
    localAddShortcutTask.username = str1;
    localAddShortcutTask.appId = str2;
    localAddShortcutTask.hYr = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17002299129856L, 126677);
        localAddShortcutTask.VN();
        d locald = i.this.lKt.lHe;
        boolean bool = localAddShortcutTask.success;
        JSONObject localJSONObject = new JSONObject();
        try
        {
          localJSONObject.put("success", bool);
          locald.cp("onAddShortcutStatus", localJSONObject.toString());
          if (localAddShortcutTask.success)
          {
            com.tencent.mm.ui.base.h.a(i.this.lJb, R.l.elc, R.l.cUG, false, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(17985712422912L, 134004);
                paramAnonymous2DialogInterface.dismiss();
                GMTrace.o(17985712422912L, 134004);
              }
            });
            GMTrace.o(17002299129856L, 126677);
            return;
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e("MicroMsg.GameWebviewJsLoader", "onGetAddShortcutStatus, e:" + localException.getMessage());
          }
          Toast.makeText(i.this.lJb, i.this.lJb.getString(R.l.elb), 0).show();
          GMTrace.o(17002299129856L, 126677);
        }
      }
    };
    localAddShortcutTask.VM();
    GameWebViewMainProcessService.a(localAddShortcutTask);
    GMTrace.o(18011348008960L, 134195);
  }
  
  protected final void aER()
  {
    GMTrace.i(18011616444416L, 134197);
    Object localObject1 = new Bundle();
    ((Bundle)localObject1).putLong("msg_id", getBundle().getLong("msg_id", Long.MIN_VALUE));
    ((Bundle)localObject1).putString("sns_local_id", getBundle().getString("sns_local_id"));
    ((Bundle)localObject1).putInt("news_svr_id", getBundle().getInt("news_svr_id", 0));
    ((Bundle)localObject1).putString("news_svr_tweetid", getBundle().getString("news_svr_tweetid"));
    ((Bundle)localObject1).putInt("message_index", getBundle().getInt("message_index", 0));
    String str = bg.nl(this.lKt.lHe.lID);
    ((Bundle)localObject1).putString("rawUrl", str);
    Object localObject2 = this.lKt.lHe.aEr();
    if ((!bg.nm(str)) && (str.endsWith("#rd")))
    {
      str = str.substring(0, str.length() - 3);
      if ((!bg.nm((String)localObject2)) && (!((String)localObject2).startsWith(str)))
      {
        ((Bundle)localObject1).putString("rawUrl", (String)localObject2);
        ((Bundle)localObject1).putLong("msg_id", Long.MIN_VALUE);
      }
    }
    for (;;)
    {
      if (getBundle() != null)
      {
        ((Bundle)localObject1).putString("preChatName", getBundle().getString("preChatName"));
        ((Bundle)localObject1).putInt("preMsgIndex", getBundle().getInt("preMsgIndex", 0));
        ((Bundle)localObject1).putString("prePublishId", getBundle().getString("prePublishId"));
        ((Bundle)localObject1).putString("preUsername", getBundle().getString("preUsername"));
      }
      localObject2 = new FavUrlTask();
      ((FavUrlTask)localObject2).actionType = 1;
      ((FavUrlTask)localObject2).ler = ((Bundle)localObject1);
      GameWebViewMainProcessService.b((GWMainProcessTask)localObject2);
      if (!((FavUrlTask)localObject2).lIk) {
        break;
      }
      localObject1 = this.lKt.lHe;
      com.tencent.mm.plugin.game.gamewebview.jsapi.biz.GameJsApiSendAppMessage.eZj = 1;
      com.tencent.mm.plugin.game.gamewebview.model.h.c((d)localObject1);
      w.i("MicroMsg.OptionMenuBtnHelp", "on favorite simple url");
      GMTrace.o(18011616444416L, 134197);
      return;
      if ((!bg.nm((String)localObject2)) && (!((String)localObject2).startsWith(str)))
      {
        ((Bundle)localObject1).putString("rawUrl", (String)localObject2);
        ((Bundle)localObject1).putLong("msg_id", Long.MIN_VALUE);
        ((Bundle)localObject1).putString("sns_local_id", "");
      }
    }
    com.tencent.mm.pluginsdk.model.c.a(((FavUrlTask)localObject2).ret, 35, this.lJb, lKN);
    GMTrace.o(18011616444416L, 134197);
  }
  
  public final void aES()
  {
    GMTrace.i(18011750662144L, 134198);
    Intent localIntent = new Intent();
    localIntent.putExtra("key_fav_scene", 2);
    localIntent.putExtra("key_fav_item_id", getBundle().getLong("fav_local_id", -1L));
    com.tencent.mm.bj.d.b(this.lJb, "favorite", ".ui.FavTagEditUI", localIntent);
    GMTrace.o(18011750662144L, 134198);
  }
  
  protected final void aET()
  {
    GMTrace.i(18011884879872L, 134199);
    com.tencent.mm.ui.base.h.a(this.lJb, this.lJb.getString(R.l.cSu), null, null, this.lJb.getString(R.l.cSt), new h.d()
    {
      public final void bT(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(18012690186240L, 134205);
        switch (paramAnonymousInt2)
        {
        default: 
          w.i("MicroMsg.OptionMenuBtnHelp", "do del cancel");
        }
        FavUrlTask localFavUrlTask;
        do
        {
          GMTrace.o(18012690186240L, 134205);
          return;
          Bundle localBundle = new Bundle();
          localBundle.putLong("fav_local_id", i.this.getBundle().getLong("fav_local_id", -1L));
          localFavUrlTask = new FavUrlTask();
          localFavUrlTask.actionType = 4;
          localFavUrlTask.ler = localBundle;
          GameWebViewMainProcessService.b(localFavUrlTask);
        } while (!localFavUrlTask.eAO);
        w.i("MicroMsg.OptionMenuBtnHelp", "del fav web url ok, finish webview ui");
        i.this.lJb.finish();
        GMTrace.o(18012690186240L, 134205);
      }
    });
    GMTrace.o(18011884879872L, 134199);
  }
  
  protected final void aEU()
  {
    Object localObject3 = null;
    GMTrace.i(18012019097600L, 134200);
    Object localObject1 = getBundle().getString("geta8key_username");
    String str = this.lKt.lHe.aEr();
    Intent localIntent = new Intent(this.lJb, GameWebViewUI.class);
    localIntent.putExtra("k_username", (String)localObject1);
    localIntent.putExtra("k_expose_url", str);
    localIntent.putExtra("showShare", false);
    if (!bg.nm(str)) {}
    Object localObject2;
    for (localObject1 = Uri.parse(str).getHost();; localObject2 = null)
    {
      if ((!bg.nm((String)localObject1)) && (((String)localObject1).startsWith("mp.weixin.qq.com"))) {}
      for (;;)
      {
        try
        {
          localObject1 = String.format("https://mp.weixin.qq.com/mp/infringement?url=%s#wechat_redirect", new Object[] { p.encode(str, "utf-8") });
          if (localObject1 != null) {
            localObject3 = localObject1;
          }
          localObject1 = localObject3;
          if (bg.nm((String)localObject3)) {
            localObject1 = String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(34) });
          }
          localIntent.putExtra("rawUrl", (String)localObject1);
          this.lJb.startActivity(localIntent);
          GMTrace.o(18012019097600L, 134200);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          w.e("MicroMsg.OptionMenuBtnHelp", localUnsupportedEncodingException.getMessage());
          localObject2 = null;
          continue;
        }
        localIntent.putExtra("k_expose_current_url", str);
      }
    }
  }
  
  protected final Bundle getBundle()
  {
    GMTrace.i(18012153315328L, 134201);
    if (this.lKt != null)
    {
      localBundle = this.lKt.ui;
      GMTrace.o(18012153315328L, 134201);
      return localBundle;
    }
    Bundle localBundle = new Bundle();
    GMTrace.o(18012153315328L, 134201);
    return localBundle;
  }
  
  public final boolean oE(int paramInt)
  {
    GMTrace.i(16994782937088L, 126621);
    if (!this.lKK.contains(Integer.valueOf(paramInt)))
    {
      GMTrace.o(16994782937088L, 126621);
      return true;
    }
    GMTrace.o(16994782937088L, 126621);
    return false;
  }
  
  public final boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(18010274267136L, 134187);
    if ((this.lKJ != null) && (com.tencent.mm.plugin.webview.modeltools.a.a(this.lJb, paramInt1, paramInt2, paramIntent)))
    {
      GMTrace.o(18010274267136L, 134187);
      return true;
    }
    GMTrace.o(18010274267136L, 134187);
    return false;
  }
  
  protected final void refresh()
  {
    GMTrace.i(18011482226688L, 134196);
    if (this.lKt.lHe.lJr != null) {
      this.lKt.lHe.lJr.reload();
    }
    GMTrace.o(18011482226688L, 134196);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\ui\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */