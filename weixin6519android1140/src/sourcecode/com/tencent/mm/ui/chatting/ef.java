package com.tencent.mm.ui.chatting;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.l.a;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvoice.p;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aj;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.base.p.a;
import com.tencent.mm.ui.base.p.b;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.chatting.gallery.ImageGalleryUI;
import com.tencent.mm.ui.transmit.MsgRetransmitUI.a;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bq;
import com.tencent.mm.y.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ef
{
  public static void a(au paramau, final Context paramContext)
  {
    GMTrace.i(2368942899200L, 17650);
    if (paramContext == null)
    {
      w.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptVideoConnector: context is null");
      GMTrace.o(2368942899200L, 17650);
      return;
    }
    if (paramau == null)
    {
      w.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptVideoConnector: msg is null");
      GMTrace.o(2368942899200L, 17650);
      return;
    }
    at.AR();
    if (!com.tencent.mm.y.c.isSDCardAvailable())
    {
      u.fo(paramContext);
      w.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptVideoConnector: sd card is not available");
      GMTrace.o(2368942899200L, 17650);
      return;
    }
    a(cJ(com.tencent.mm.af.x.FG().fP(8)), paramContext, new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(2486517628928L, 18526);
        paramAnonymousMenuItem = paramAnonymousMenuItem.getTitle();
        r localr = t.mw(this.gmh.field_imgPath);
        w.i("MicroMsg.LongClickBrandServiceHelper", "connector click[video]: to[%s] imgPath[%s]", new Object[] { paramAnonymousMenuItem, this.gmh.field_imgPath });
        final MsgRetransmitUI.a locala = new MsgRetransmitUI.a();
        Object localObject = paramContext;
        paramContext.getResources().getString(R.l.cUG);
        localObject = com.tencent.mm.ui.base.h.a((Context)localObject, paramContext.getResources().getString(R.l.cUt), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
          {
            GMTrace.i(2181038080000L, 16250);
            locala.xll = true;
            GMTrace.o(2181038080000L, 16250);
          }
        });
        locala.context = paramContext;
        locala.euR = this.gmh.field_imgPath;
        locala.hul = ((Dialog)localObject);
        locala.userName = paramAnonymousMenuItem;
        locala.xkL = localr.hcz;
        locala.hcv = localr.hcv;
        locala.execute(new Object[0]);
        bq.BG().c(bq.gpd, null);
        com.tencent.mm.ui.base.h.bm(paramContext, paramContext.getString(R.l.cUq));
        GMTrace.o(2486517628928L, 18526);
      }
    });
    GMTrace.o(2368942899200L, 17650);
  }
  
  public static void a(au paramau, final Context paramContext, final String paramString, final boolean paramBoolean)
  {
    GMTrace.i(16136057913344L, 120223);
    if (paramContext == null)
    {
      w.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptImgConnector: context is null");
      GMTrace.o(16136057913344L, 120223);
      return;
    }
    if (paramau == null)
    {
      w.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptImgConnector: msg is null");
      GMTrace.o(16136057913344L, 120223);
      return;
    }
    at.AR();
    if (!com.tencent.mm.y.c.isSDCardAvailable())
    {
      u.fo(paramContext);
      w.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptImgConnector: sd card is not available");
      GMTrace.o(16136057913344L, 120223);
      return;
    }
    a(cJ(com.tencent.mm.af.x.FG().fP(4)), paramContext, new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(2270158651392L, 16914);
        String str = paramAnonymousMenuItem.getTitle();
        paramAnonymousMenuItem = null;
        if (this.gmh.field_msgId > 0L) {
          paramAnonymousMenuItem = com.tencent.mm.ao.n.IZ().aq(this.gmh.field_msgId);
        }
        if (((paramAnonymousMenuItem == null) || (paramAnonymousMenuItem.gGR <= 0L)) && (this.gmh.field_msgSvrId > 0L)) {
          paramAnonymousMenuItem = com.tencent.mm.ao.n.IZ().ap(this.gmh.field_msgSvrId);
        }
        for (;;)
        {
          if (paramAnonymousMenuItem == null)
          {
            w.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptImgConnector: try get imgInfo fail");
            GMTrace.o(2270158651392L, 16914);
            return;
          }
          if ((paramAnonymousMenuItem.offset >= paramAnonymousMenuItem.gsL) && (paramAnonymousMenuItem.gsL != 0))
          {
            if (this.gmh.field_isSend == 1) {
              if (paramAnonymousMenuItem.II()) {
                paramAnonymousInt = 1;
              }
            }
            for (;;)
            {
              localObject = com.tencent.mm.y.q.zE();
              paramAnonymousMenuItem = com.tencent.mm.ao.n.IZ().l(com.tencent.mm.ao.e.c(paramAnonymousMenuItem), "", "");
              if (!bg.nm(paramAnonymousMenuItem))
              {
                w.i("MicroMsg.LongClickBrandServiceHelper", "connector click[img]: to[%s] fileName[%s]", new Object[] { str, paramAnonymousMenuItem });
                paramAnonymousMenuItem = new com.tencent.mm.ao.k(4, (String)localObject, str, paramAnonymousMenuItem, paramAnonymousInt, null, 0, "", "", true, R.g.aVk);
                at.wS().a(paramAnonymousMenuItem, 0);
                bq.BG().c(bq.gpc, null);
              }
              g.ork.i(10424, new Object[] { Integer.valueOf(3), Integer.valueOf(4), str });
              com.tencent.mm.ui.base.h.bm(paramContext, paramContext.getString(R.l.cUq));
              GMTrace.o(2270158651392L, 16914);
              return;
              paramAnonymousInt = 0;
              continue;
              if (!paramAnonymousMenuItem.II()) {
                paramAnonymousInt = 0;
              } else if (!com.tencent.mm.a.e.aZ(com.tencent.mm.ao.e.a(paramAnonymousMenuItem).gGS)) {
                paramAnonymousInt = 0;
              } else {
                paramAnonymousInt = 1;
              }
            }
          }
          paramAnonymousMenuItem = new Intent(paramContext, ImageGalleryUI.class);
          paramAnonymousMenuItem.putExtra("img_gallery_msg_id", this.gmh.field_msgId);
          paramAnonymousMenuItem.putExtra("img_gallery_msg_svr_id", this.gmh.field_msgSvrId);
          paramAnonymousMenuItem.putExtra("img_gallery_talker", this.gmh.field_talker);
          paramAnonymousMenuItem.putExtra("img_gallery_chatroom_name", this.gmh.field_talker);
          paramAnonymousMenuItem.putExtra("img_gallery_is_restransmit_after_download", true);
          paramAnonymousMenuItem.putExtra("img_gallery_directly_send_name", str);
          paramAnonymousMenuItem.putExtra("start_chatting_ui", false);
          str = this.gmh.field_talker;
          Object localObject = new Bundle();
          if (paramBoolean) {
            paramAnonymousInt = 2;
          }
          for (;;)
          {
            ((Bundle)localObject).putInt("stat_scene", paramAnonymousInt);
            ((Bundle)localObject).putString("stat_msg_id", "msg_" + Long.toString(this.gmh.field_msgSvrId));
            ((Bundle)localObject).putString("stat_chat_talker_username", str);
            ((Bundle)localObject).putString("stat_send_msg_user", paramString);
            paramAnonymousMenuItem.putExtra("_stat_obj", (Bundle)localObject);
            paramContext.startActivity(paramAnonymousMenuItem);
            GMTrace.o(2270158651392L, 16914);
            return;
            if (s.fD(str)) {
              paramAnonymousInt = 7;
            } else {
              paramAnonymousInt = 1;
            }
          }
        }
      }
    });
    GMTrace.o(16136057913344L, 120223);
  }
  
  public static void a(au paramau, String paramString, Context paramContext)
  {
    GMTrace.i(2369211334656L, 17652);
    a(paramau, paramString, paramContext, 512);
    GMTrace.o(2369211334656L, 17652);
  }
  
  private static void a(au paramau, final String paramString, final Context paramContext, final int paramInt)
  {
    GMTrace.i(2369613987840L, 17655);
    if (paramContext == null)
    {
      w.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptMusicConnector: context is null");
      GMTrace.o(2369613987840L, 17655);
      return;
    }
    if (paramau == null)
    {
      w.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptMusicConnector: msg is null");
      GMTrace.o(2369613987840L, 17655);
      return;
    }
    List localList = null;
    switch (paramInt)
    {
    }
    for (;;)
    {
      a(localList, paramContext, new p.d()
      {
        public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          GMTrace.i(2316597985280L, 17260);
          paramAnonymousMenuItem = paramAnonymousMenuItem.getTitle();
          ef.a(paramAnonymousMenuItem, this.gmh, paramString);
          switch (paramInt)
          {
          }
          for (;;)
          {
            com.tencent.mm.ui.base.h.bm(paramContext, paramContext.getString(R.l.cUq));
            GMTrace.o(2316597985280L, 17260);
            return;
            g.ork.i(10424, new Object[] { Integer.valueOf(49), Integer.valueOf(256), paramAnonymousMenuItem });
            continue;
            g.ork.i(10424, new Object[] { Integer.valueOf(49), Integer.valueOf(128), paramAnonymousMenuItem });
            continue;
            g.ork.i(10424, new Object[] { Integer.valueOf(49), Integer.valueOf(512), paramAnonymousMenuItem });
          }
        }
      });
      GMTrace.o(2369613987840L, 17655);
      return;
      localList = cJ(com.tencent.mm.af.x.FG().fP(256));
      continue;
      localList = cJ(com.tencent.mm.af.f.Fu());
      continue;
      localList = cJ(com.tencent.mm.af.x.FG().fP(512));
    }
  }
  
  public static void a(String paramString1, au paramau, String paramString2)
  {
    GMTrace.i(16095389941760L, 119920);
    f.a locala = f.a.eS(bg.Sx(paramString2));
    if (locala == null)
    {
      w.w("MicroMsg.LongClickBrandServiceHelper", "send: parse app msg content return null");
      GMTrace.o(16095389941760L, 119920);
      return;
    }
    Object localObject = null;
    paramString2 = (String)localObject;
    if (paramau.field_imgPath != null)
    {
      paramString2 = (String)localObject;
      if (!paramau.field_imgPath.equals("")) {
        paramau = com.tencent.mm.ao.n.IZ().x(paramau.field_imgPath, true);
      }
    }
    try
    {
      paramString2 = com.tencent.mm.a.e.c(paramau, 0, com.tencent.mm.a.e.aY(paramau));
      localObject = new b();
      paramau = (au)localObject;
      if (!bg.nm(locala.eAE))
      {
        long l = bg.getLong(locala.eAE, -1L);
        if (l == -1L) {
          break label335;
        }
        an.afP().b(l, (com.tencent.mm.sdk.e.c)localObject);
        paramau = (au)localObject;
        if (((b)localObject).vmr != l)
        {
          localObject = an.afP().Op(locala.eAE);
          if (localObject != null)
          {
            paramau = (au)localObject;
            if (((b)localObject).field_mediaSvrId.equals(locala.eAE)) {}
          }
          else
          {
            paramau = null;
          }
        }
      }
      String str = "";
      localObject = str;
      if (paramau != null)
      {
        localObject = str;
        if (paramau.field_fileFullPath != null)
        {
          localObject = str;
          if (!paramau.field_fileFullPath.equals(""))
          {
            at.AR();
            localObject = com.tencent.mm.pluginsdk.model.app.l.ad(com.tencent.mm.y.c.zg(), locala.title, locala.giw);
            com.tencent.mm.sdk.platformtools.j.r(paramau.field_fileFullPath, (String)localObject, false);
          }
        }
      }
      paramau = f.a.a(locala);
      paramau.giy = 3;
      com.tencent.mm.pluginsdk.model.app.l.a(paramau, locala.appId, locala.appName, paramString1, (String)localObject, paramString2, null);
      GMTrace.o(16095389941760L, 119920);
      return;
    }
    catch (Exception paramau)
    {
      for (;;)
      {
        w.e("MicroMsg.LongClickBrandServiceHelper", "send appmsg to %s, error:%s", new Object[] { paramString1, paramau.getLocalizedMessage() });
        paramString2 = (String)localObject;
        continue;
        label335:
        localObject = an.afP().Op(locala.eAE);
        if (localObject != null)
        {
          paramau = (au)localObject;
          if (((b)localObject).field_mediaSvrId.equals(locala.eAE)) {}
        }
        else
        {
          paramau = null;
        }
      }
    }
  }
  
  static void a(List<String> paramList, Context paramContext, p.d paramd)
  {
    GMTrace.i(2369882423296L, 17657);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      w.w("MicroMsg.LongClickBrandServiceHelper", "tryShowConnectorDialog: careList is null or empty");
      GMTrace.o(2369882423296L, 17657);
      return;
    }
    com.tencent.mm.ui.tools.l locall = new com.tencent.mm.ui.tools.l(paramContext);
    locall.xhT = new p.a()
    {
      public final void a(ImageView paramAnonymousImageView, MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2196204683264L, 16363);
        a.b.a(paramAnonymousImageView, paramAnonymousMenuItem.getTitle());
        GMTrace.o(2196204683264L, 16363);
      }
    };
    locall.xhU = new p.b()
    {
      public final void a(TextView paramAnonymousTextView, MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2120237449216L, 15797);
        if (paramAnonymousTextView != null)
        {
          at.AR();
          com.tencent.mm.storage.x localx = com.tencent.mm.y.c.yK().TE(paramAnonymousMenuItem.getTitle());
          if ((localx == null) || ((int)localx.fTq <= 0))
          {
            paramAnonymousTextView.setText(paramAnonymousMenuItem.getTitle());
            GMTrace.o(2120237449216L, 15797);
            return;
          }
          paramAnonymousTextView.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.val$context, localx.vj(), paramAnonymousTextView.getTextSize()));
        }
        GMTrace.o(2120237449216L, 15797);
      }
    };
    locall.qik = new p.c()
    {
      public final void a(com.tencent.mm.ui.base.n paramAnonymousn)
      {
        GMTrace.i(2202781351936L, 16412);
        Iterator localIterator = this.wGU.iterator();
        while (localIterator.hasNext()) {
          paramAnonymousn.add((String)localIterator.next());
        }
        GMTrace.o(2202781351936L, 16412);
      }
    };
    locall.qil = paramd;
    locall.bpI();
    GMTrace.o(2369882423296L, 17657);
  }
  
  public static void b(au paramau, final Context paramContext)
  {
    GMTrace.i(2369077116928L, 17651);
    if (paramContext == null)
    {
      w.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptEmojiConnector: context is null");
      GMTrace.o(2369077116928L, 17651);
      return;
    }
    if (paramau == null)
    {
      w.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptEmojiConnector: msg is null");
      GMTrace.o(2369077116928L, 17651);
      return;
    }
    at.AR();
    if (!com.tencent.mm.y.c.isSDCardAvailable())
    {
      u.fo(paramContext);
      w.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptEmojiConnector: sd card is not available");
      GMTrace.o(2369077116928L, 17651);
      return;
    }
    a(cJ(com.tencent.mm.af.x.FG().fP(64)), paramContext, new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(2385183244288L, 17771);
        String str = paramAnonymousMenuItem.getTitle();
        paramAnonymousMenuItem = aj.Uf(this.gmh.field_content).eDW;
        if ((paramAnonymousMenuItem == null) || (paramAnonymousMenuItem.endsWith("-1"))) {
          paramAnonymousMenuItem = this.gmh.field_imgPath;
        }
        for (;;)
        {
          if (paramAnonymousMenuItem == null)
          {
            w.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptEmojiConnector: filePath is null");
            GMTrace.o(2385183244288L, 17771);
            return;
          }
          w.i("MicroMsg.LongClickBrandServiceHelper", "connector click[emoji]: to[%s] filePath[%s]", new Object[] { str, paramAnonymousMenuItem });
          if (((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().m(paramContext, str, paramAnonymousMenuItem))
          {
            g.ork.i(10424, new Object[] { Integer.valueOf(47), Integer.valueOf(64), str });
            com.tencent.mm.ui.base.h.bm(paramContext, "");
          }
          g.ork.i(10424, new Object[] { Integer.valueOf(47), Integer.valueOf(64), str });
          com.tencent.mm.ui.base.h.bm(paramContext, paramContext.getString(R.l.cUq));
          GMTrace.o(2385183244288L, 17771);
          return;
        }
      }
    });
    GMTrace.o(2369077116928L, 17651);
  }
  
  public static void b(au paramau, String paramString, Context paramContext)
  {
    GMTrace.i(2369345552384L, 17653);
    a(paramau, paramString, paramContext, 256);
    GMTrace.o(2369345552384L, 17653);
  }
  
  public static void c(au paramau, String paramString, Context paramContext)
  {
    GMTrace.i(2369479770112L, 17654);
    a(paramau, paramString, paramContext, 128);
    GMTrace.o(2369479770112L, 17654);
  }
  
  static List<String> cJ(List<String> paramList)
  {
    GMTrace.i(2369748205568L, 17656);
    LinkedList localLinkedList = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if (!com.tencent.mm.af.f.iN(str)) {
        localLinkedList.add(str);
      }
    }
    w.d("MicroMsg.LongClickBrandServiceHelper", "get selected accept list, size %d", new Object[] { Integer.valueOf(localLinkedList.size()) });
    GMTrace.o(2369748205568L, 17656);
    return localLinkedList;
  }
  
  public static void k(String paramString, final Context paramContext)
  {
    GMTrace.i(2368674463744L, 17648);
    if (paramContext == null)
    {
      w.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptTextConnector: context is null");
      GMTrace.o(2368674463744L, 17648);
      return;
    }
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptTextConnector: content is null");
      GMTrace.o(2368674463744L, 17648);
      return;
    }
    a(cJ(com.tencent.mm.af.x.FG().fP(1)), paramContext, new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(2176072024064L, 16213);
        paramAnonymousMenuItem = paramAnonymousMenuItem.getTitle();
        w.i("MicroMsg.LongClickBrandServiceHelper", "connector click[text]: to[%s] text[%s]", new Object[] { paramAnonymousMenuItem, this.gUc });
        com.tencent.mm.modelmulti.j localj = new com.tencent.mm.modelmulti.j(paramAnonymousMenuItem, this.gUc, s.go(paramAnonymousMenuItem));
        at.wS().a(localj, 0);
        g.ork.i(10424, new Object[] { Integer.valueOf(1), Integer.valueOf(1), paramAnonymousMenuItem });
        com.tencent.mm.ui.base.h.bm(paramContext, paramContext.getString(R.l.cUq));
        GMTrace.o(2176072024064L, 16213);
      }
    });
    GMTrace.o(2368674463744L, 17648);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */