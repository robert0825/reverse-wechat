package com.tencent.mm.ui.chatting.d;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView.t;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.g.a.gk;
import com.tencent.mm.g.a.nb;
import com.tencent.mm.g.a.nb.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.chatting.a.b.a;
import com.tencent.mm.ui.chatting.a.b.c;
import com.tencent.mm.ui.chatting.a.b.e;
import com.tencent.mm.ui.chatting.et;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class g
  extends b
{
  public int iGe;
  public int wOJ;
  HashSet<Integer> wPc;
  
  public g(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(14945144012800L, 111350);
    this.wPc = new HashSet();
    this.iGe = -1;
    this.wOJ = 0;
    GMTrace.o(14945144012800L, 111350);
  }
  
  private boolean a(au paramau, com.tencent.mm.pluginsdk.model.app.f paramf)
  {
    GMTrace.i(14945680883712L, 111354);
    if ((!paramau.field_talker.endsWith("@qqim")) || (!paramf.field_packageName.equals("com.tencent.mobileqq")))
    {
      GMTrace.o(14945680883712L, 111354);
      return false;
    }
    w.d("MicroMsg.UrlHistoryListPresenter", "jacks open QQ");
    paramau = new Intent("android.intent.action.MAIN", null);
    paramau.addCategory("android.intent.category.LAUNCHER");
    paramau.addFlags(268435456);
    paramau.setClassName("com.tencent.mobileqq", as(this.mContext, "com.tencent.mobileqq"));
    paramau.putExtra("platformId", "wechat");
    at.AR();
    paramf = com.tencent.mm.y.c.xh().get(9, null);
    int i;
    if ((paramf != null) && ((paramf instanceof Integer))) {
      i = ((Integer)paramf).intValue();
    }
    for (;;)
    {
      int j;
      if (i != 0) {
        j = 0;
      }
      try
      {
        paramf = String.valueOf(i).getBytes("utf-8");
        byte[] arrayOfByte = "asdfghjkl;'".getBytes("utf-8");
        int m = arrayOfByte.length;
        int k = 0;
        i = j;
        j = k;
        while (j < m)
        {
          k = arrayOfByte[j];
          if (i >= paramf.length) {
            break;
          }
          paramf[i] = ((byte)(k ^ paramf[i]));
          j += 1;
          i += 1;
        }
        paramau.putExtra("tencent_gif", paramf);
        i = 0;
      }
      catch (UnsupportedEncodingException paramf)
      {
        try
        {
          for (;;)
          {
            this.mContext.startActivity(paramau);
            GMTrace.o(14945680883712L, 111354);
            return true;
            paramf = paramf;
            w.printErrStackTrace("MicroMsg.UrlHistoryListPresenter", paramf, "", new Object[0]);
          }
        }
        catch (Exception paramau)
        {
          for (;;) {}
        }
      }
    }
  }
  
  private static String as(Context paramContext, String paramString)
  {
    GMTrace.i(14945815101440L, 111355);
    paramContext = paramContext.getPackageManager();
    try
    {
      paramString = paramContext.getPackageInfo(paramString, 0);
      Intent localIntent = new Intent("android.intent.action.MAIN", null);
      localIntent.addCategory("android.intent.category.LAUNCHER");
      localIntent.setPackage(paramString.packageName);
      paramContext = (ResolveInfo)paramContext.queryIntentActivities(localIntent, 0).iterator().next();
      if (paramContext == null) {
        break label102;
      }
      paramContext = paramContext.activityInfo.name;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.UrlHistoryListPresenter", paramContext, "", new Object[0]);
        paramContext = null;
      }
    }
    GMTrace.o(14945815101440L, 111355);
    return paramContext;
  }
  
  private static PackageInfo getPackageInfo(Context paramContext, String paramString)
  {
    GMTrace.i(14945949319168L, 111356);
    if ((paramString == null) || (paramString.length() == 0)) {
      paramString = null;
    }
    while (paramString == null)
    {
      GMTrace.o(14945949319168L, 111356);
      return null;
      paramString = com.tencent.mm.pluginsdk.model.app.g.aP(paramString, true);
      if (paramString == null) {
        paramString = null;
      } else {
        paramString = paramString.field_packageName;
      }
    }
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0);
      GMTrace.o(14945949319168L, 111356);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      w.printErrStackTrace("MicroMsg.UrlHistoryListPresenter", paramContext, "", new Object[0]);
      GMTrace.o(14945949319168L, 111356);
    }
    return null;
  }
  
  public final String Qb()
  {
    GMTrace.i(14945412448256L, 111352);
    String str = this.mContext.getString(R.l.cRA);
    GMTrace.o(14945412448256L, 111352);
    return str;
  }
  
  public final void a(b.a parama, int paramInt)
  {
    GMTrace.i(16455496105984L, 122603);
    b localb = (b)parama;
    a locala = (a)CV(paramInt);
    if ((bg.nm(locala.desc)) || (!bg.nm(locala.aEe)))
    {
      localb.hqI.setVisibility(8);
      Bitmap localBitmap = com.tencent.mm.ao.n.IZ().a(locala.imagePath, com.tencent.mm.br.a.getDensity(this.mContext), false);
      if (localBitmap != null)
      {
        parama = localBitmap;
        if (!localBitmap.isRecycled()) {
          break label235;
        }
      }
      localBitmap = com.tencent.mm.pluginsdk.model.app.g.b(locala.appId, 1, com.tencent.mm.br.a.getDensity(this.mContext));
      if (localBitmap != null)
      {
        parama = localBitmap;
        if (!localBitmap.isRecycled()) {
          break label235;
        }
      }
      localBitmap = j.a(new com.tencent.mm.pluginsdk.model.s(locala.imagePath, locala.type, "@S", false));
      parama = localBitmap;
      if (localBitmap != null) {
        break label235;
      }
      localb.iub.setImageResource(R.k.cJr);
    }
    for (;;)
    {
      localb.ljO.setText(bg.aq(locala.aEe, ""));
      b.d(localb.ljO, this.wOz.wIc);
      GMTrace.o(16455496105984L, 122603);
      return;
      localb.hqI.setVisibility(0);
      localb.hqI.setText(bg.aq(locala.desc, ""));
      break;
      label235:
      localb.iub.setImageBitmap(parama);
    }
  }
  
  public final void a(a parama)
  {
    GMTrace.i(16455630323712L, 122604);
    at.AR();
    au localau = com.tencent.mm.y.c.yM().cM(parama.eDr);
    f.a locala = f.a.eS(localau.field_content);
    Object localObject1;
    PackageInfo localPackageInfo;
    if ((locala.url != null) && (!locala.url.equals("")))
    {
      localObject1 = locala.url;
      if (!this.iGc.endsWith("@chatroom")) {
        break label516;
      }
      parama = "groupmessage";
      Object localObject2 = p.s((String)localObject1, parama);
      parama = locala.url;
      localPackageInfo = getPackageInfo(this.mContext, locala.appId);
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("rawUrl", (String)localObject2);
      ((Intent)localObject1).putExtra("webpageTitle", locala.title);
      if ((locala.appId != null) && (("wx751a1acca5688ba3".equals(locala.appId)) || ("wxfbc915ff7c30e335".equals(locala.appId)) || ("wx482a4001c37e2b74".equals(locala.appId))))
      {
        localObject2 = new Bundle();
        ((Bundle)localObject2).putString("jsapi_args_appid", locala.appId);
        ((Intent)localObject1).putExtra("jsapiargs", (Bundle)localObject2);
      }
      if (bg.nm(parama)) {
        break label523;
      }
      ((Intent)localObject1).putExtra("shortUrl", parama);
      label242:
      if (localPackageInfo != null) {
        break label540;
      }
      parama = null;
      label249:
      ((Intent)localObject1).putExtra("version_name", parama);
      if (localPackageInfo != null) {
        break label549;
      }
    }
    label516:
    label523:
    label540:
    label549:
    for (int i = 0;; i = localPackageInfo.versionCode)
    {
      ((Intent)localObject1).putExtra("version_code", i);
      if (!bg.nm(locala.eTo))
      {
        ((Intent)localObject1).putExtra("srcUsername", locala.eTo);
        ((Intent)localObject1).putExtra("srcDisplayname", locala.eTp);
      }
      ((Intent)localObject1).putExtra("msg_id", localau.field_msgId);
      ((Intent)localObject1).putExtra("KPublisherId", "msg_" + Long.toString(localau.field_msgSvrId));
      ((Intent)localObject1).putExtra("KAppId", locala.appId);
      ((Intent)localObject1).putExtra("geta8key_username", this.iGc);
      parama = b(localau, com.tencent.mm.y.s.eb(this.iGc));
      ((Intent)localObject1).putExtra("pre_username", parama);
      ((Intent)localObject1).putExtra("prePublishId", "msg_" + Long.toString(localau.field_msgSvrId));
      ((Intent)localObject1).putExtra("preUsername", parama);
      ((Intent)localObject1).putExtra("preChatName", this.iGc);
      ((Intent)localObject1).putExtra("preChatTYPE", com.tencent.mm.y.t.H(parama, this.iGc));
      ((Intent)localObject1).putExtra("preMsgIndex", 0);
      com.tencent.mm.bj.d.b(this.mContext, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
      GMTrace.o(16455630323712L, 122604);
      return;
      parama = "singlemessage";
      break;
      ((Intent)localObject1).putExtra("shortUrl", locala.url);
      break label242;
      parama = localPackageInfo.versionName;
      break label249;
    }
  }
  
  public final void b(a parama)
  {
    GMTrace.i(16455764541440L, 122605);
    at.AR();
    au localau = com.tencent.mm.y.c.yM().cM(parama.eDr);
    Object localObject2 = f.a.eS(localau.field_content);
    Object localObject3 = com.tencent.mm.pluginsdk.model.app.g.aP(((f.a)localObject2).appId, false);
    if ((localObject3 != null) && (((com.tencent.mm.pluginsdk.model.app.f)localObject3).bJs()))
    {
      Object localObject1 = this.iGc;
      parama = (a)localObject1;
      if (com.tencent.mm.y.s.eb((String)localObject1)) {
        parama = bc.gP(localau.field_content);
      }
      long l = localau.field_msgSvrId;
      int i;
      if ((localObject3 != null) && (p.n(this.mContext, ((com.tencent.mm.pluginsdk.model.app.f)localObject3).field_packageName)))
      {
        i = 3;
        if (((f.a)localObject2).type != 2) {
          break label512;
        }
        i = 4;
        label126:
        nb localnb = new nb();
        localnb.eSc.context = this.mContext;
        localnb.eSc.scene = 1;
        localnb.eSc.eSd = ((f.a)localObject2).appId;
        nb.a locala = localnb.eSc;
        if (localObject3 != null) {
          break label526;
        }
        localObject1 = null;
        label184:
        locala.packageName = ((String)localObject1);
        localnb.eSc.msgType = ((f.a)localObject2).type;
        localnb.eSc.eMI = parama;
        localnb.eSc.eSe = i;
        localnb.eSc.mediaTagName = ((f.a)localObject2).mediaTagName;
        localnb.eSc.eSf = l;
        localnb.eSc.eSg = "";
        com.tencent.mm.sdk.b.a.vgX.m(localnb);
        parama = p.a.tma;
        if ((com.tencent.mm.pluginsdk.model.app.g.a(this.mContext, (com.tencent.mm.pluginsdk.model.app.f)localObject3)) || (parama == null)) {
          break label623;
        }
        if (bg.nm(((com.tencent.mm.g.b.n)localObject3).fdR)) {
          break label536;
        }
        boolean bool = com.tencent.mm.pluginsdk.model.app.q.aR(this.mContext, ((com.tencent.mm.g.b.n)localObject3).fdR);
        w.i("MicroMsg.UrlHistoryListPresenter", "oversea game info and gpdownload url is not empty, jump to google play directy:[%s], jump result: [%b]", new Object[] { ((com.tencent.mm.g.b.n)localObject3).fdR, Boolean.valueOf(bool) });
        if (!bool) {
          break label536;
        }
        i = 1;
      }
      for (;;)
      {
        if (i == 0)
        {
          if ((((f.a)localObject2).eAE == null) || (((f.a)localObject2).eAE.length() == 0))
          {
            localObject1 = localau.field_content;
            parama = (a)localObject1;
            if (localau.field_isSend == 0)
            {
              i = localau.field_isSend;
              parama = (a)localObject1;
              if (com.tencent.mm.y.s.eb(this.iGc))
              {
                parama = (a)localObject1;
                if (localObject1 != null)
                {
                  parama = (a)localObject1;
                  if (i == 0) {
                    parama = bc.gQ((String)localObject1);
                  }
                }
              }
            }
            localObject1 = f.a.eS(parama);
            localObject2 = com.tencent.mm.pluginsdk.model.app.g.aP(((f.a)localObject1).appId, true);
            if ((localObject2 != null) && (p.n(this.mContext, ((com.tencent.mm.pluginsdk.model.app.f)localObject2).field_packageName)))
            {
              if (((com.tencent.mm.pluginsdk.model.app.f)localObject2).field_status == 3)
              {
                w.e("MicroMsg.UrlHistoryListPresenter", "requestAppShow fail, app is in blacklist, packageName = " + ((com.tencent.mm.pluginsdk.model.app.f)localObject2).field_packageName);
                GMTrace.o(16455764541440L, 122605);
                return;
                i = 6;
                break;
                label512:
                if (((f.a)localObject2).type != 5) {
                  break label126;
                }
                i = 1;
                break label126;
                label526:
                localObject1 = ((com.tencent.mm.pluginsdk.model.app.f)localObject3).field_packageName;
                break label184;
                label536:
                localObject1 = new gk();
                ((gk)localObject1).eJy.actionCode = 2;
                ((gk)localObject1).eJy.scene = 1;
                ((gk)localObject1).eJy.appId = ((com.tencent.mm.pluginsdk.model.app.f)localObject3).field_appId;
                ((gk)localObject1).eJy.context = this.mContext;
                com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
                new Intent();
                parama.G(((com.tencent.mm.pluginsdk.model.app.f)localObject3).field_appId, 1, 1);
                i = 1;
                continue;
                label623:
                i = 0;
                continue;
              }
              if (!p.b(this.mContext, (com.tencent.mm.pluginsdk.model.app.f)localObject2))
              {
                w.e("MicroMsg.UrlHistoryListPresenter", "The app %s signature is incorrect.", new Object[] { ((com.tencent.mm.pluginsdk.model.app.f)localObject2).field_appName });
                Toast.makeText(this.mContext, this.mContext.getString(R.l.dzZ, new Object[] { com.tencent.mm.pluginsdk.model.app.g.a(this.mContext, (com.tencent.mm.pluginsdk.model.app.f)localObject2, null) }), 1).show();
                GMTrace.o(16455764541440L, 122605);
                return;
              }
              if (a(localau, (com.tencent.mm.pluginsdk.model.app.f)localObject2)) {
                break label956;
              }
              localObject3 = new WXAppExtendObject();
              ((WXAppExtendObject)localObject3).extInfo = ((f.a)localObject1).extInfo;
              if ((((f.a)localObject1).eAE != null) && (((f.a)localObject1).eAE.length() > 0))
              {
                parama = an.afP().Op(((f.a)localObject1).eAE);
                if (parama != null) {
                  break label898;
                }
              }
              label898:
              for (parama = null;; parama = parama.field_fileFullPath)
              {
                ((WXAppExtendObject)localObject3).filePath = parama;
                parama = new WXMediaMessage();
                parama.sdkVer = 620822528;
                parama.mediaObject = ((WXMediaMessage.IMediaObject)localObject3);
                parama.title = ((f.a)localObject1).title;
                parama.description = ((f.a)localObject1).description;
                parama.messageAction = ((f.a)localObject1).messageAction;
                parama.messageExt = ((f.a)localObject1).messageExt;
                parama.thumbData = e.c(com.tencent.mm.ao.n.IZ().ke(localau.field_imgPath), 0, -1);
                new et(this.mContext).a(((com.tencent.mm.pluginsdk.model.app.f)localObject2).field_packageName, parama, ((com.tencent.mm.pluginsdk.model.app.f)localObject2).field_appId, ((com.tencent.mm.pluginsdk.model.app.f)localObject2).field_openId);
                GMTrace.o(16455764541440L, 122605);
                return;
              }
            }
            parama = p.v(this.mContext, ((f.a)localObject1).appId, "message");
            localObject1 = new Intent();
            ((Intent)localObject1).putExtra("rawUrl", parama);
            com.tencent.mm.bj.d.b(this.mContext, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
            label956:
            GMTrace.o(16455764541440L, 122605);
            return;
          }
          if (!CU())
          {
            u.fo(this.mContext);
            GMTrace.o(16455764541440L, 122605);
            return;
          }
          parama = new Intent();
          parama.setClassName(this.mContext, "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
          parama.putExtra("app_msg_id", localau.field_msgId);
          this.mContext.startActivity(parama);
        }
      }
    }
    GMTrace.o(16455764541440L, 122605);
  }
  
  public final void c(a parama)
  {
    GMTrace.i(16455898759168L, 122606);
    at.AR();
    f.a locala = f.a.eS(com.tencent.mm.y.c.yM().cM(parama.eDr).field_content);
    Object localObject = locala.giY;
    parama = (a)localObject;
    if (TextUtils.isEmpty((CharSequence)localObject)) {
      parama = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vU(locala.url);
    }
    if (TextUtils.isEmpty(parama))
    {
      parama = new Intent();
      parama.putExtra("geta8key_username", com.tencent.mm.y.q.zE());
      parama.putExtra("rawUrl", locala.url);
      com.tencent.mm.bj.d.b(this.mContext, "webview", ".ui.tools.WebViewUI", parama);
      GMTrace.o(16455898759168L, 122606);
      return;
    }
    w.d("MicroMsg.UrlHistoryListPresenter", "start emoji detail from brandcontact");
    localObject = new Intent();
    ((Intent)localObject).putExtra("extra_id", parama);
    ((Intent)localObject).putExtra("preceding_scence", 123);
    ((Intent)localObject).putExtra("download_entrance_scene", 23);
    com.tencent.mm.bj.d.b(this.mContext, "emoji", ".ui.EmojiStoreDetailUI", (Intent)localObject);
    com.tencent.mm.plugin.report.service.g.ork.i(10993, new Object[] { Integer.valueOf(2), parama });
    GMTrace.o(16455898759168L, 122606);
  }
  
  public final void ceZ()
  {
    GMTrace.i(14945278230528L, 111351);
    this.wOy.cfd();
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14943130746880L, 111335);
        LinkedList localLinkedList = new LinkedList();
        at.AR();
        Cursor localCursor = com.tencent.mm.y.c.yM().bl(g.this.iGc, g.this.iGe);
        if (localCursor == null)
        {
          w.e("MicroMsg.UrlHistoryListPresenter", "[loadData] cursor is null!");
          GMTrace.o(14943130746880L, 111335);
          return;
        }
        com.tencent.mm.storage.q localq;
        long l1;
        if (com.tencent.mm.y.s.eb(g.this.iGc))
        {
          at.AR();
          localq = com.tencent.mm.y.c.yT().gC(g.this.iGc);
          l1 = 0L;
        }
        label609:
        for (;;)
        {
          try
          {
            if (localCursor.moveToNext())
            {
              au localau = new au();
              localau.b(localCursor);
              Object localObject1 = localau.field_content;
              if (localObject1 == null) {
                continue;
              }
              f.a locala = f.a.eS((String)localObject1);
              localObject1 = g.this;
              int i = locala.type;
              ((g)localObject1).getType();
              if (!((g)localObject1).wPc.contains(Integer.valueOf(i))) {
                continue;
              }
              localObject1 = new Date(localau.field_createTime);
              long l2 = com.tencent.mm.ui.gridviewheaders.a.chJ().a((Date)localObject1);
              if (l1 != l2)
              {
                localLinkedList.add(new b.c(localau.field_createTime));
                localObject1 = g.this;
                ((g)localObject1).wOJ += 1;
              }
              localObject1 = g.b(localau, com.tencent.mm.y.s.eb(g.this.iGc));
              x localx1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE((String)localObject1);
              Object localObject3 = "";
              if (localq != null) {
                localObject3 = localq.fs((String)localObject1);
              }
              i = com.tencent.mm.pluginsdk.model.c.Oh(locala.giw);
              localObject1 = com.tencent.mm.plugin.favorite.c.getAppName(g.this.mContext, locala.eTo);
              at.AR();
              x localx2 = com.tencent.mm.y.c.yK().TE(locala.eTo);
              if ((localx2 == null) || (!localx2.field_username.equals(locala.eTo)))
              {
                ak.a.gmX.a(locala.eTo, "", null);
                localObject3 = new g.a(g.this, localau.field_createTime, locala.type, locala.title, localau.field_msgId, localx1.field_username, localx1.vj(), localx1.field_conRemark, (String)localObject3);
                if (!bg.nm((String)localObject1)) {
                  break label609;
                }
                localObject1 = locala.description;
                ((g.a)localObject3).aEe = ((String)localObject1);
                ((g.a)localObject3).appId = locala.appId;
                if (bg.nm(localau.field_imgPath))
                {
                  ((g.a)localObject3).imagePath = locala.thumburl;
                  ((g.a)localObject3).iconRes = i;
                  localLinkedList.add(localObject3);
                  l1 = l2;
                }
              }
              else
              {
                localObject1 = localx2.vk();
                continue;
              }
              ((g.a)localObject3).imagePath = localau.field_imgPath;
              continue;
            }
          }
          finally
          {
            localCursor.close();
          }
          g.this.iFZ.addAll(localLinkedList);
          g.this.wOB = g.this.iFZ;
          localLinkedList.clear();
          com.tencent.mm.sdk.platformtools.af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(14931722240000L, 111250);
              if (g.this.wOy != null) {
                g.this.wOy.v(g.1.this.wOu, g.this.iFZ.size());
              }
              GMTrace.o(14931722240000L, 111250);
            }
          });
          GMTrace.o(14943130746880L, 111335);
          return;
          localq = null;
          break;
        }
      }
    });
    GMTrace.o(14945278230528L, 111351);
  }
  
  public final b.e cfa()
  {
    GMTrace.i(16455227670528L, 122601);
    b.e local2 = new b.e()
    {
      public final void a(int paramAnonymousInt, com.tencent.mm.ui.chatting.a.b.b paramAnonymousb)
      {
        GMTrace.i(16449590525952L, 122559);
        w.i("MicroMsg.UrlHistoryListPresenter", "[onItemClick] position:%s", new Object[] { Integer.valueOf(paramAnonymousInt) });
        if (paramAnonymousb == null)
        {
          w.e("MicroMsg.UrlHistoryListPresenter", "[onItemClick] null == baseItem, position:%s", new Object[] { Integer.valueOf(paramAnonymousInt) });
          GMTrace.o(16449590525952L, 122559);
          return;
        }
        paramAnonymousb = (g.a)paramAnonymousb;
        if (paramAnonymousb.getType() == 5)
        {
          g.this.a(paramAnonymousb);
          GMTrace.o(16449590525952L, 122559);
          return;
        }
        if (paramAnonymousb.getType() == 7)
        {
          g.this.b(paramAnonymousb);
          GMTrace.o(16449590525952L, 122559);
          return;
        }
        if (paramAnonymousb.getType() == 15)
        {
          g.this.c(paramAnonymousb);
          GMTrace.o(16449590525952L, 122559);
          return;
        }
        if (paramAnonymousb.getType() == 26)
        {
          g.this.d(paramAnonymousb);
          GMTrace.o(16449590525952L, 122559);
          return;
        }
        if (paramAnonymousb.getType() == 27)
        {
          g.this.e(paramAnonymousb);
          GMTrace.o(16449590525952L, 122559);
          return;
        }
        w.e("MicroMsg.UrlHistoryListPresenter", "[onItemClick] type:%s", new Object[] { Integer.valueOf(paramAnonymousb.getType()) });
        GMTrace.o(16449590525952L, 122559);
      }
      
      public final void a(View paramAnonymousView, final int paramAnonymousInt, final com.tencent.mm.ui.chatting.a.b.b paramAnonymousb)
      {
        GMTrace.i(16449724743680L, 122560);
        w.i("MicroMsg.UrlHistoryListPresenter", "[onItemLongClick] position:%s", new Object[] { Integer.valueOf(paramAnonymousInt) });
        new l(paramAnonymousView.getContext()).b(paramAnonymousView, new View.OnCreateContextMenuListener()new p.d
        {
          public final void onCreateContextMenu(ContextMenu paramAnonymous2ContextMenu, View paramAnonymous2View, ContextMenu.ContextMenuInfo paramAnonymous2ContextMenuInfo)
          {
            GMTrace.i(14942862311424L, 111333);
            paramAnonymous2ContextMenu.add(0, 0, 0, paramAnonymous2View.getContext().getString(R.l.dSm));
            paramAnonymous2ContextMenu.add(0, 1, 0, paramAnonymous2View.getContext().getString(R.l.dfl));
            paramAnonymous2ContextMenu.add(0, 2, 0, paramAnonymous2View.getContext().getString(R.l.dgd));
            GMTrace.o(14942862311424L, 111333);
          }
        }, new p.d()
        {
          public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
          {
            GMTrace.i(14940043739136L, 111312);
            if (paramAnonymousb == null)
            {
              w.e("MicroMsg.UrlHistoryListPresenter", "item is null! position:%s", new Object[] { Integer.valueOf(paramAnonymousInt) });
              GMTrace.o(14940043739136L, 111312);
              return;
            }
            at.AR();
            paramAnonymous2MenuItem = com.tencent.mm.y.c.yM().cM(paramAnonymousb.eDr);
            g.this.d(paramAnonymous2Int, paramAnonymous2MenuItem);
            GMTrace.o(14940043739136L, 111312);
          }
        });
        GMTrace.o(16449724743680L, 122560);
      }
    };
    GMTrace.o(16455227670528L, 122601);
    return local2;
  }
  
  public final String cfc()
  {
    GMTrace.i(16455093452800L, 122600);
    String str = this.mContext.getString(R.l.cRA);
    GMTrace.o(16455093452800L, 122600);
    return str;
  }
  
  public final void d(a parama)
  {
    GMTrace.i(16456032976896L, 122607);
    at.AR();
    parama = com.tencent.mm.y.c.yM().cM(parama.eDr);
    f.a locala = f.a.eS(parama.field_content);
    int i = locala.tid;
    String str1 = locala.gkG;
    String str2 = locala.desc;
    String str3 = locala.iconUrl;
    String str4 = locala.secondUrl;
    int j = locala.pageType;
    if (i != 0)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("geta8key_username", b(parama, com.tencent.mm.y.s.eb(this.iGc)));
      localIntent.putExtra("rawUrl", locala.fwt);
      localIntent.putExtra("topic_id", i);
      localIntent.putExtra("topic_name", str1);
      localIntent.putExtra("topic_desc", str2);
      localIntent.putExtra("topic_icon_url", str3);
      localIntent.putExtra("topic_ad_url", str4);
      localIntent.putExtra("extra_scence", 23);
      com.tencent.mm.bj.d.b(this.mContext, "emoji", ".ui.EmojiStoreTopicUI", localIntent);
      GMTrace.o(16456032976896L, 122607);
      return;
    }
    w.i("MicroMsg.UrlHistoryListPresenter", "topic id is zero.");
    GMTrace.o(16456032976896L, 122607);
  }
  
  public final void e(a parama)
  {
    GMTrace.i(16456167194624L, 122608);
    at.AR();
    parama = com.tencent.mm.y.c.yM().cM(parama.eDr);
    f.a locala = f.a.eS(parama.field_content);
    int i = locala.tid;
    String str1 = locala.gkG;
    String str2 = locala.desc;
    String str3 = locala.iconUrl;
    String str4 = locala.secondUrl;
    int j = locala.pageType;
    if (i != 0)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("geta8key_username", b(parama, com.tencent.mm.y.s.eb(this.iGc)));
      localIntent.putExtra("rawUrl", locala.fwt);
      localIntent.putExtra("set_id", i);
      localIntent.putExtra("set_title", str1);
      localIntent.putExtra("set_iconURL", str3);
      localIntent.putExtra("set_desc", str2);
      localIntent.putExtra("headurl", str4);
      localIntent.putExtra("pageType", j);
      com.tencent.mm.bj.d.b(this.mContext, "emoji", ".ui.v2.EmojiStoreV2SingleProductUI", localIntent);
      GMTrace.o(16456167194624L, 122608);
      return;
    }
    w.i("MicroMsg.UrlHistoryListPresenter", "topic id is zero.");
    GMTrace.o(16456167194624L, 122608);
  }
  
  public final int getType()
  {
    GMTrace.i(20394786422784L, 151953);
    this.wPc.add(Integer.valueOf(5));
    this.wPc.add(Integer.valueOf(7));
    this.wPc.add(Integer.valueOf(27));
    this.wPc.add(Integer.valueOf(26));
    this.wPc.add(Integer.valueOf(15));
    GMTrace.o(20394786422784L, 151953);
    return -1;
  }
  
  public final RecyclerView.t m(ViewGroup paramViewGroup)
  {
    GMTrace.i(16455361888256L, 122602);
    paramViewGroup = new b(LayoutInflater.from(paramViewGroup.getContext()).inflate(R.i.cHk, paramViewGroup, false));
    GMTrace.o(16455361888256L, 122602);
    return paramViewGroup;
  }
  
  final class a
    extends com.tencent.mm.ui.chatting.a.b.b
  {
    public String aEe;
    public String appId;
    public String desc;
    public int iconRes;
    public String imagePath;
    
    public a(long paramLong1, int paramInt, String paramString1, long paramLong2, String paramString2, String paramString3, String paramString4, String paramString5)
    {
      super(paramInt, paramString1, paramLong2, paramString2, paramString3, paramString4, paramString5);
      GMTrace.i(16449858961408L, 122561);
      GMTrace.o(16449858961408L, 122561);
    }
    
    public final boolean Wn(String paramString)
    {
      GMTrace.i(16449993179136L, 122562);
      if (paramString != null)
      {
        paramString = paramString.toLowerCase();
        if (!Wo(paramString))
        {
          if ((!bg.nm(this.aEe)) && (fo(paramString, this.aEe.toLowerCase())))
          {
            GMTrace.o(16449993179136L, 122562);
            return true;
          }
        }
        else if ((!bg.nm(this.aEe)) && (this.aEe.toLowerCase().contains(paramString)))
        {
          GMTrace.o(16449993179136L, 122562);
          return true;
        }
        boolean bool = super.Wn(paramString);
        GMTrace.o(16449993179136L, 122562);
        return bool;
      }
      GMTrace.o(16449993179136L, 122562);
      return false;
    }
  }
  
  final class b
    extends b.a
  {
    TextView hqI;
    ImageView iub;
    TextView ljO;
    
    public b(View paramView)
    {
      super();
      GMTrace.i(16454019710976L, 122592);
      this.iub = ((ImageView)paramView.findViewById(R.h.byW));
      this.hqI = ((TextView)paramView.findViewById(R.h.byI));
      this.ljO = ((TextView)paramView.findViewById(R.h.bzn));
      this.ljO.setVisibility(0);
      GMTrace.o(16454019710976L, 122592);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\chatting\d\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */