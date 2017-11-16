package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.ft;
import com.tencent.mm.g.a.gk;
import com.tencent.mm.g.a.jm;
import com.tencent.mm.g.a.jm.b;
import com.tencent.mm.g.a.nb;
import com.tencent.mm.g.a.qi;
import com.tencent.mm.g.b.af;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.a.b.j;
import com.tencent.mm.plugin.sns.a.b.j.a;
import com.tencent.mm.plugin.sns.a.b.j.b;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ad;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.protocal.c.aq;
import com.tencent.mm.protocal.c.as;
import com.tencent.mm.protocal.c.bhq;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.brn;
import com.tencent.mm.protocal.c.cs;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.ak.b.a;
import java.util.LinkedList;
import java.util.List;

public final class bg
{
  public Context context;
  public com.tencent.mm.ui.base.r hsU;
  public ad pPx;
  public View.OnClickListener qeg;
  public a qjK;
  public long qjL;
  public View.OnClickListener qjM;
  public View.OnClickListener qjN;
  public View.OnClickListener qjO;
  public View.OnClickListener qjP;
  public View.OnClickListener qjQ;
  public View.OnClickListener qjR;
  public View.OnClickListener qjS;
  public View.OnClickListener qjT;
  public View.OnClickListener qjU;
  public View.OnClickListener qjV;
  public View.OnClickListener qjW;
  public View.OnClickListener qjX;
  public View.OnClickListener qjY;
  public View.OnClickListener qjZ;
  public int scene;
  
  public bg(Context paramContext, a parama, int paramInt, ad paramad)
  {
    GMTrace.i(8562956828672L, 63799);
    this.scene = 0;
    this.qjL = 0L;
    this.qeg = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8543629475840L, 63655);
        long l = System.currentTimeMillis();
        if (l - bg.this.qjL < 500L)
        {
          GMTrace.o(8543629475840L, 63655);
          return;
        }
        bg.this.qjL = l;
        Object localObject2;
        Object localObject4;
        Object localObject1;
        if ((paramAnonymousView.getTag() instanceof r))
        {
          localObject2 = (r)paramAnonymousView.getTag();
          localObject4 = ((r)localObject2).pRY;
          com.tencent.mm.plugin.sns.storage.m localm = ae.bjd().Is(((r)localObject2).eEM);
          if (bg.this.pPx != null) {
            bg.this.pPx.biI().v(localm);
          }
          if (((biz)localObject4).uUc.ueV == 18)
          {
            localObject1 = bg.this.context;
            localObject3 = ((r)localObject2).pRY;
            paramAnonymousView = ((r)localObject2).eEM;
            paramAnonymousView = ae.bjd().Is(paramAnonymousView);
            j.a(j.b.pol, j.a.pod, paramAnonymousView);
            localObject2 = new Intent();
            paramAnonymousView = null;
            if (((biz)localObject3).uUc.ueW.size() > 0) {
              paramAnonymousView = (anu)((biz)localObject3).uUc.ueW.get(0);
            }
            ((Intent)localObject2).putExtra("IsAd", false);
            ((Intent)localObject2).putExtra("KStremVideoUrl", ((biz)localObject3).uUc.lPM);
            ((Intent)localObject2).putExtra("KSta_SourceType", 2);
            ((Intent)localObject2).putExtra("KSta_Scene", j.b.pol.value);
            ((Intent)localObject2).putExtra("KSta_FromUserName", ((biz)localObject3).jhi);
            ((Intent)localObject2).putExtra("KSta_SnSId", ((biz)localObject3).mmR);
            if (paramAnonymousView == null)
            {
              localObject4 = new StringBuilder("fakeid_");
              if (paramAnonymousView == null)
              {
                paramAnonymousView = ((biz)localObject3).mmR;
                ((Intent)localObject2).putExtra("KMediaId", paramAnonymousView);
              }
            }
            for (;;)
            {
              paramAnonymousView = ((biz)localObject3).uUh;
              if (paramAnonymousView != null)
              {
                ((Intent)localObject2).putExtra("KMediaVideoTime", paramAnonymousView.gkJ);
                ((Intent)localObject2).putExtra("StreamWording", paramAnonymousView.gkL);
                ((Intent)localObject2).putExtra("StremWebUrl", paramAnonymousView.gkM);
                ((Intent)localObject2).putExtra("KMediaTitle", paramAnonymousView.gkK);
                ((Intent)localObject2).putExtra("KStremVideoUrl", paramAnonymousView.gkI);
                ((Intent)localObject2).putExtra("KThumUrl", paramAnonymousView.gkN);
                ((Intent)localObject2).putExtra("KSta_StremVideoAduxInfo", paramAnonymousView.gkO);
                ((Intent)localObject2).putExtra("KSta_StremVideoPublishId", paramAnonymousView.gkP);
              }
              ((Intent)localObject2).putExtra("KSta_SnsStatExtStr", ((biz)localObject3).pTh);
              com.tencent.mm.bj.d.b((Context)localObject1, "sns", ".ui.VideoAdPlayerUI", (Intent)localObject2);
              GMTrace.o(8543629475840L, 63655);
              return;
              paramAnonymousView = paramAnonymousView.mmR;
              break;
              ((Intent)localObject2).putExtra("KMediaId", paramAnonymousView.mmR);
            }
          }
          localObject1 = ((biz)localObject4).uUc.lPM;
          Object localObject3 = ((biz)localObject4).uUb.mmR;
          w.d("MicroMsg.TimeLineClickEvent", "url:" + (String)localObject1);
          localObject3 = com.tencent.mm.plugin.sns.c.a.hnI.s((String)localObject1, "timeline");
          if ((localObject3 == null) || (((String)localObject3).length() == 0))
          {
            GMTrace.o(8543629475840L, 63655);
            return;
          }
          Intent localIntent = new Intent();
          localObject1 = null;
          if (localObject4 != null)
          {
            localObject1 = new Bundle();
            ((Bundle)localObject1).putString("KSnsStrId", ((biz)localObject4).mmR);
            ((Bundle)localObject1).putString("KSnsLocalId", ((r)localObject2).eEM);
            ((Bundle)localObject1).putBoolean("KFromTimeline", true);
            if ((((biz)localObject4).uUc != null) && (((biz)localObject4).uUc.ueW.size() > 0))
            {
              ((Bundle)localObject1).putString("K_sns_thumb_url", ((anu)((biz)localObject4).uUc.ueW.get(0)).uCO);
              ((Bundle)localObject1).putString("K_sns_raw_url", ((biz)localObject4).uUc.lPM);
              w.i("MicroMsg.TimeLineClickEvent", "put the thumb url %s redirectUrl %s", new Object[] { ((anu)((biz)localObject4).uUc.ueW.get(0)).uCO, ((biz)localObject4).uUc.lPM });
            }
          }
          ((Bundle)localObject1).putString("key_snsad_statextstr", ((biz)localObject4).pTh);
          localIntent.putExtra("rawUrl", (String)localObject3);
          localIntent.putExtra("shortUrl", (String)localObject3);
          localIntent.putExtra("useJs", true);
          localIntent.putExtra("type", 65281);
          if (((biz)localObject4).uUd != null)
          {
            localIntent.putExtra("srcUsername", ((biz)localObject4).uUd);
            localIntent.putExtra("srcDisplayname", ((biz)localObject4).tws);
            w.i("MicroMsg.TimeLineClickEvent", "urlRedirectListener tlObj.sourceNickName: " + ((biz)localObject4).tws + " tlObj.publicUserName: " + ((biz)localObject4).uUd);
          }
          localIntent.putExtra("sns_local_id", ((r)localObject2).eEM);
          if (localm != null)
          {
            localIntent.putExtra("KPublisherId", "sns_" + i.dt(localm.field_snsId));
            localIntent.putExtra("pre_username", localm.field_userName);
            localIntent.putExtra("prePublishId", "sns_" + i.dt(localm.field_snsId));
            localIntent.putExtra("preUsername", localm.field_userName);
            localIntent.putExtra("share_report_pre_msg_url", (String)localObject3);
            localIntent.putExtra("share_report_pre_msg_title", ((biz)localObject4).uUc.eBt);
            localIntent.putExtra("share_report_pre_msg_desc", ((biz)localObject4).uUc.lPj);
            if ((((biz)localObject4).uUc.ueW != null) && (((biz)localObject4).uUc.ueW.size() > 0)) {
              localIntent.putExtra("share_report_pre_msg_icon_url", ((anu)((biz)localObject4).uUc.ueW.get(0)).uCO);
            }
            localIntent.putExtra("share_report_pre_msg_appid", "");
            localIntent.putExtra("share_report_from_scene", 1);
          }
          if ((localObject4 != null) && (((biz)localObject4).uUb != null)) {
            localIntent.putExtra("KAppId", ((biz)localObject4).uUb.mmR);
          }
          if ((localm != null) && (localm.uX(32)))
          {
            localObject2 = localm.blB();
            if (localObject2 != null) {
              localIntent.putExtra("KsnsViewId", ((com.tencent.mm.plugin.sns.storage.a)localObject2).hTy);
            }
          }
          if ((localm != null) && (localObject4 != null))
          {
            if (bg.this.scene != 0) {
              break label1735;
            }
            localObject2 = com.tencent.mm.modelsns.b.ha(718);
            com.tencent.mm.modelsns.b localb = ((com.tencent.mm.modelsns.b)localObject2).lu(i.g(localm)).hd(localm.field_type).bC(localm.uX(32)).lu(localm.bmi()).lu(((biz)localObject4).uUd);
            if (((biz)localObject4).uUb != null) {
              break label1746;
            }
            localObject3 = "";
            label1261:
            localb.lu((String)localObject3).lu(((biz)localObject4).uUc.lPM);
            ((com.tencent.mm.modelsns.b)localObject2).LR();
            if (bg.this.scene != 0) {
              break label1759;
            }
            localObject2 = com.tencent.mm.modelsns.b.ha(743);
            label1304:
            localb = ((com.tencent.mm.modelsns.b)localObject2).lu(i.g(localm)).hd(localm.field_type).bC(localm.uX(32)).lu(localm.bmi()).lu(((biz)localObject4).uUd);
            if (((biz)localObject4).uUb != null) {
              break label1770;
            }
            localObject3 = "";
            label1363:
            localb.lu((String)localObject3).lu(((biz)localObject4).uUc.lPM);
            if (localObject1 != null)
            {
              localObject2 = ((com.tencent.mm.modelsns.b)localObject2).Ec();
              if (localObject2 != null) {
                ((Bundle)localObject1).putByteArray("intent_key_StatisticsOplog", (byte[])localObject2);
              }
            }
          }
          if (localObject1 != null) {
            localIntent.putExtra("jsapiargs", (Bundle)localObject1);
          }
          localIntent.putExtra("geta8key_scene", 2);
          localIntent.putExtra("from_scence", 3);
          if ((!com.tencent.mm.sdk.platformtools.bg.nm(((biz)localObject4).pRQ)) && (e.Im(((biz)localObject4).pRQ)))
          {
            localObject1 = new int[2];
            if (paramAnonymousView != null) {
              paramAnonymousView.getLocationInWindow((int[])localObject1);
            }
            i = paramAnonymousView.getWidth();
            j = paramAnonymousView.getHeight();
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("img_gallery_left", localObject1[0]);
            paramAnonymousView.putExtra("img_gallery_top", localObject1[1]);
            paramAnonymousView.putExtra("img_gallery_width", i);
            paramAnonymousView.putExtra("img_gallery_height", j);
            if (localObject4 != null)
            {
              localObject1 = ((biz)localObject4).uUc.ueW;
              if (((List)localObject1).size() > 0) {
                paramAnonymousView.putExtra("sns_landing_pages_share_thumb_url", ((anu)((List)localObject1).get(0)).uCO);
              }
            }
            paramAnonymousView.putExtra("sns_landing_pages_share_sns_id", localm.blE());
            paramAnonymousView.putExtra("sns_landing_pages_aid", localm.bmd());
            paramAnonymousView.putExtra("sns_landing_pages_traceid", localm.bme());
            paramAnonymousView.putExtra("sns_landing_pages_ux_info", localm.bmi());
            if (bg.this.scene == 0) {}
            for (i = 3;; i = 4)
            {
              paramAnonymousView.putExtra("sns_landig_pages_from_source", i);
              paramAnonymousView.setClass(bg.this.context, SnsAdNativeLandingPagesUI.class);
              paramAnonymousView.putExtra("sns_landing_pages_xml", ((biz)localObject4).pRQ);
              paramAnonymousView.putExtra("sns_landing_pages_rec_src", localm.bml());
              paramAnonymousView.putExtra("sns_landing_pages_xml_prefix", "adxml");
              e.z(paramAnonymousView, bg.this.context);
              GMTrace.o(8543629475840L, 63655);
              return;
              label1735:
              localObject2 = com.tencent.mm.modelsns.b.hb(718);
              break;
              label1746:
              localObject3 = ((biz)localObject4).uUb.mmR;
              break label1261;
              label1759:
              localObject2 = com.tencent.mm.modelsns.b.hb(743);
              break label1304;
              label1770:
              localObject3 = ((biz)localObject4).uUb.mmR;
              break label1363;
            }
          }
          com.tencent.mm.plugin.sns.c.a.hnH.j(localIntent, bg.this.context);
          localObject1 = null;
          int j = 0;
          int i = j;
          paramAnonymousView = (View)localObject1;
          if (localObject4 != null)
          {
            i = j;
            paramAnonymousView = (View)localObject1;
            if (((biz)localObject4).uUb != null)
            {
              paramAnonymousView = ((biz)localObject4).uUb.mmR;
              i = com.tencent.mm.sdk.platformtools.bg.getInt(((biz)localObject4).uUb.jhO, 0);
            }
          }
          localObject3 = com.tencent.mm.plugin.sns.c.a.hnI.j(paramAnonymousView, i);
          if ((!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject3)) && (com.tencent.mm.plugin.sns.c.a.hnI.bJ(paramAnonymousView)))
          {
            localObject2 = null;
            localObject1 = localObject2;
            if (localObject4 != null)
            {
              localObject1 = localObject2;
              if (((biz)localObject4).pwN != null)
              {
                localObject1 = localObject2;
                if (((biz)localObject4).pwN.tOK != null) {
                  localObject1 = ((biz)localObject4).pwN.tOK.tOD;
                }
              }
            }
            if (localObject4 != null) {
              break label2108;
            }
            localObject2 = null;
            com.tencent.mm.plugin.sns.c.a.hnI.a(bg.this.context, paramAnonymousView, (String)localObject3, (String)localObject2, 5, 4, 1, (String)localObject1, ((biz)localObject4).mmR);
          }
          g.ork.i(11105, new Object[] { ((biz)localObject4).jhi, ((biz)localObject4).uUc.lPM });
          if ((localm != null) && (localm.field_type == 4))
          {
            paramAnonymousView = (anu)((biz)localObject4).uUc.ueW.get(0);
            localObject1 = g.ork;
            if (paramAnonymousView != null) {
              break label2118;
            }
          }
        }
        label2108:
        label2118:
        for (paramAnonymousView = "";; paramAnonymousView = paramAnonymousView.lPj)
        {
          ((g)localObject1).i(13043, new Object[] { Integer.valueOf(1), paramAnonymousView, ((biz)localObject4).uUb.mmR });
          GMTrace.o(8543629475840L, 63655);
          return;
          localObject2 = ((biz)localObject4).jhi;
          break;
        }
      }
    };
    this.qjM = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8586981801984L, 63978);
        Object localObject1 = bg.this;
        int i;
        if ((paramAnonymousView == null) || (!(paramAnonymousView.getTag() instanceof biz))) {
          i = 1;
        }
        Object localObject2;
        biz localbiz;
        String str1;
        String str2;
        for (;;)
        {
          if (i == 0) {
            if ((paramAnonymousView == null) || (!(paramAnonymousView.getTag() instanceof biz)))
            {
              GMTrace.o(8586981801984L, 63978);
              return;
              localObject2 = ((biz)paramAnonymousView.getTag()).uUb.mmR;
              if ("wx485a97c844086dc9".equals(localObject2))
              {
                com.tencent.mm.bj.d.b(paramAnonymousView.getContext(), "shake", ".ui.ShakeReportUI", new Intent().putExtra("shake_music", true));
                i = 1;
              }
              else
              {
                if ("wx7fa037cc7dfabad5".equals(localObject2))
                {
                  com.tencent.mm.plugin.sport.b.d.nU(34);
                  com.tencent.mm.kernel.h.xz();
                  if (com.tencent.mm.l.a.eE(((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE("gh_43f2581f6fd6").field_type))
                  {
                    localObject2 = new Intent();
                    ((Intent)localObject2).putExtra("Chat_User", "gh_43f2581f6fd6");
                    ((Intent)localObject2).putExtra("finish_direct", true);
                    com.tencent.mm.bj.d.a(((bg)localObject1).context, ".ui.chatting.En_5b8fbb1e", (Intent)localObject2);
                  }
                  for (;;)
                  {
                    i = 1;
                    break;
                    localObject2 = new Intent();
                    ((Intent)localObject2).putExtra("Contact_User", "gh_43f2581f6fd6");
                    com.tencent.mm.bj.d.b(((bg)localObject1).context, "profile", ".ui.ContactInfoUI", (Intent)localObject2);
                  }
                }
                if (("wx9181ed3f223e6d76".equals(localObject2)) || ("wx2fe12a395c426fcf".equals(localObject2)))
                {
                  w.i("MicroMsg.TimeLineClickEvent", "hy: shake new year closed. try to go to shake TV");
                  localObject1 = new Intent();
                  ((Intent)localObject1).putExtra("shake_tv", true);
                  com.tencent.mm.bj.d.b(paramAnonymousView.getContext(), "shake", ".ui.ShakeReportUI", (Intent)localObject1);
                  i = 1;
                }
                else if ("wx751a1acca5688ba3".equals(localObject2))
                {
                  localObject2 = new Intent();
                  ((Intent)localObject2).putExtra("BaseScanUI_select_scan_mode", 5);
                  if ((!com.tencent.mm.p.a.aQ(((bg)localObject1).context)) && (!com.tencent.mm.p.a.aP(((bg)localObject1).context))) {
                    com.tencent.mm.bj.d.b(((bg)localObject1).context, "scanner", ".ui.BaseScanUI", (Intent)localObject2);
                  }
                  i = 1;
                }
                else if ("wxfbc915ff7c30e335".equals(localObject2))
                {
                  localObject2 = new Intent();
                  ((Intent)localObject2).putExtra("BaseScanUI_select_scan_mode", 1);
                  if ((!com.tencent.mm.p.a.aQ(((bg)localObject1).context)) && (!com.tencent.mm.p.a.aP(((bg)localObject1).context))) {
                    com.tencent.mm.bj.d.b(((bg)localObject1).context, "scanner", ".ui.BaseScanUI", (Intent)localObject2);
                  }
                  i = 1;
                }
                else if ("wx482a4001c37e2b74".equals(localObject2))
                {
                  localObject2 = new Intent();
                  ((Intent)localObject2).putExtra("BaseScanUI_select_scan_mode", 2);
                  if ((!com.tencent.mm.p.a.aQ(((bg)localObject1).context)) && (!com.tencent.mm.p.a.aP(((bg)localObject1).context))) {
                    com.tencent.mm.bj.d.b(((bg)localObject1).context, "scanner", ".ui.BaseScanUI", (Intent)localObject2);
                  }
                  i = 1;
                }
                else if ("wxaf060266bfa9a35c".equals(localObject2))
                {
                  if (!com.tencent.mm.at.c.JX())
                  {
                    i = 1;
                  }
                  else
                  {
                    localObject2 = new Intent();
                    ((Intent)localObject2).putExtra("shake_tv", true);
                    com.tencent.mm.bj.d.b(((bg)localObject1).context, "shake", ".ui.ShakeReportUI", (Intent)localObject2);
                    i = 1;
                  }
                }
                else
                {
                  i = 0;
                }
              }
            }
            else
            {
              localbiz = (biz)paramAnonymousView.getTag();
              if ((localbiz == null) || (localbiz.uUb == null))
              {
                w.e("MicroMsg.TimeLineClickEvent", "appInfo is null");
                GMTrace.o(8586981801984L, 63978);
                return;
              }
              str1 = localbiz.uUb.mmR;
              str2 = com.tencent.mm.plugin.sns.c.a.hnI.bH(str1);
              if ((!com.tencent.mm.sdk.platformtools.bg.nm(str2)) && (com.tencent.mm.plugin.sns.c.a.hnI.bJ(str1))) {
                if (localbiz == null)
                {
                  paramAnonymousView = null;
                  if (localbiz.uUc.ueV != 1) {
                    break label902;
                  }
                  i = 2;
                }
              }
            }
          }
        }
        for (;;)
        {
          localObject2 = null;
          localObject1 = localObject2;
          if (localbiz.pwN != null)
          {
            localObject1 = localObject2;
            if (localbiz.pwN.tOK != null) {
              localObject1 = localbiz.pwN.tOK.tOD;
            }
          }
          localObject2 = new nb();
          ((nb)localObject2).eSc.context = bg.this.context;
          ((nb)localObject2).eSc.scene = 4;
          ((nb)localObject2).eSc.eSd = str1;
          ((nb)localObject2).eSc.packageName = str2;
          ((nb)localObject2).eSc.msgType = i;
          ((nb)localObject2).eSc.eMI = paramAnonymousView;
          ((nb)localObject2).eSc.mediaTagName = ((String)localObject1);
          ((nb)localObject2).eSc.eSe = 5;
          ((nb)localObject2).eSc.eSf = 0L;
          ((nb)localObject2).eSc.eSg = localbiz.mmR;
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
          paramAnonymousView = new gk();
          paramAnonymousView.eJy.actionCode = 2;
          paramAnonymousView.eJy.scene = 3;
          paramAnonymousView.eJy.extMsg = "timeline_src=3";
          paramAnonymousView.eJy.appId = str1;
          paramAnonymousView.eJy.context = bg.this.context;
          com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousView);
          GMTrace.o(8586981801984L, 63978);
          return;
          paramAnonymousView = localbiz.jhi;
          break;
          label902:
          if (localbiz.uUc.ueV == 3)
          {
            i = 5;
            continue;
            paramAnonymousView = bg.this;
            paramAnonymousView = com.tencent.mm.plugin.sns.c.a.hnI.f(paramAnonymousView.context, str1, "timeline");
            if ((paramAnonymousView == null) || (paramAnonymousView.length() == 0))
            {
              GMTrace.o(8586981801984L, 63978);
              return;
            }
            localObject1 = new Intent();
            ((Intent)localObject1).putExtra("rawUrl", paramAnonymousView);
            ((Intent)localObject1).putExtra("shortUrl", paramAnonymousView);
            ((Intent)localObject1).putExtra("useJs", true);
            ((Intent)localObject1).putExtra("type", 65281);
            ((Intent)localObject1).putExtra("geta8key_scene", 2);
            com.tencent.mm.plugin.sns.c.a.hnH.j((Intent)localObject1, bg.this.context);
            GMTrace.o(8586981801984L, 63978);
          }
          else
          {
            i = 2;
          }
        }
      }
    };
    this.qjN = new View.OnClickListener()
    {
      public final void onClick(final View paramAnonymousView)
      {
        GMTrace.i(8339886964736L, 62137);
        if ((paramAnonymousView.getTag() instanceof bd))
        {
          paramAnonymousView = (bd)paramAnonymousView.getTag();
          if (com.tencent.mm.sdk.platformtools.bg.nm(paramAnonymousView.qjw))
          {
            w.e("MicroMsg.TimeLineClickEvent", "show source profile fail, username is null");
            Toast.makeText(bg.this.context, bg.this.context.getString(i.j.dxf, new Object[] { Integer.valueOf(3), Integer.valueOf(-1) }), 0).show();
            GMTrace.o(8339886964736L, 62137);
            return;
          }
          com.tencent.mm.kernel.h.xz();
          Object localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramAnonymousView.qjw);
          if ((localObject != null) && (((af)localObject).field_username.equals(paramAnonymousView.qjw)))
          {
            localObject = new Intent();
            ((Intent)localObject).addFlags(268435456);
            ((Intent)localObject).putExtra("Contact_User", paramAnonymousView.qjw);
            g.ork.A(10298, paramAnonymousView.qjw + ",37");
            ((Intent)localObject).putExtra("Contact_Scene", 37);
            com.tencent.mm.plugin.sns.c.a.hnH.d((Intent)localObject, bg.this.context);
            GMTrace.o(8339886964736L, 62137);
            return;
          }
          ak.a.gmX.a(paramAnonymousView.qjw, "", new ak.b.a()
          {
            public final void r(String paramAnonymous2String, boolean paramAnonymous2Boolean)
            {
              GMTrace.i(8540810903552L, 63634);
              if (bg.this.hsU != null) {
                bg.this.hsU.dismiss();
              }
              if (!paramAnonymous2Boolean)
              {
                Toast.makeText(bg.this.context, bg.this.context.getString(i.j.dxf, new Object[] { Integer.valueOf(3), Integer.valueOf(-1) }), 0).show();
                GMTrace.o(8540810903552L, 63634);
                return;
              }
              com.tencent.mm.ac.b.y(paramAnonymous2String, 3);
              com.tencent.mm.ac.n.Dv().hS(paramAnonymous2String);
              Intent localIntent = new Intent();
              localIntent.addFlags(268435456);
              localIntent.putExtra("Contact_User", paramAnonymous2String);
              localIntent.putExtra("Contact_Scene", 37);
              com.tencent.mm.kernel.h.xz();
              x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramAnonymous2String);
              if ((localx != null) && (localx.bSA()))
              {
                g.ork.A(10298, paramAnonymous2String + ",37");
                localIntent.putExtra("Contact_Scene", 37);
              }
              com.tencent.mm.plugin.sns.c.a.hnH.d(localIntent, bg.this.context);
              GMTrace.o(8540810903552L, 63634);
            }
          });
          localObject = bg.this;
          Context localContext = bg.this.context;
          bg.this.context.getString(i.j.cUG);
          ((bg)localObject).hsU = com.tencent.mm.ui.base.h.a(localContext, bg.this.context.getString(i.j.cUV), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(8322841313280L, 62010);
              ak.a.gmX.gJ(paramAnonymousView.qjw);
              GMTrace.o(8322841313280L, 62010);
            }
          });
        }
        GMTrace.o(8339886964736L, 62137);
      }
    };
    this.qjO = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8592618946560L, 64020);
        if (!(paramAnonymousView.getTag() instanceof r))
        {
          GMTrace.o(8592618946560L, 64020);
          return;
        }
        Object localObject2 = (r)paramAnonymousView.getTag();
        Object localObject1 = ((r)localObject2).pRY;
        if (((biz)localObject1).uUc.ueW.size() > 0)
        {
          localObject2 = ae.bjd().Is(((r)localObject2).eEM);
          if (bg.this.pPx != null) {
            bg.this.pPx.biI().v((com.tencent.mm.plugin.sns.storage.m)localObject2);
          }
          localObject1 = ((anu)((biz)localObject1).uUc.ueW.get(0)).pPP;
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("key_Product_xml", (String)localObject1);
          ((Intent)localObject2).putExtra("key_ProductUI_getProductInfoScene", 2);
          com.tencent.mm.bj.d.b(paramAnonymousView.getContext(), "scanner", ".ui.ProductUI", (Intent)localObject2);
        }
        GMTrace.o(8592618946560L, 64020);
      }
    };
    this.qjP = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8354114043904L, 62243);
        w.d("MicroMsg.TimeLineClickEvent", "hardTVRedirectListener");
        if (!(paramAnonymousView.getTag() instanceof r))
        {
          GMTrace.o(8354114043904L, 62243);
          return;
        }
        Object localObject2 = (r)paramAnonymousView.getTag();
        Object localObject1 = ((r)localObject2).pRY;
        if (((biz)localObject1).uUc.ueW.size() > 0)
        {
          localObject2 = ae.bjd().Is(((r)localObject2).eEM);
          if (bg.this.pPx != null) {
            bg.this.pPx.biI().v((com.tencent.mm.plugin.sns.storage.m)localObject2);
          }
          localObject1 = ((anu)((biz)localObject1).uUc.ueW.get(0)).pPP;
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("key_TV_xml", (String)localObject1);
          ((Intent)localObject2).putExtra("key_TV_getProductInfoScene", 2);
          com.tencent.mm.bj.d.b(paramAnonymousView.getContext(), "shake", ".ui.TVInfoUI", (Intent)localObject2);
        }
        GMTrace.o(8354114043904L, 62243);
      }
    };
    this.qjQ = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8466454282240L, 63080);
        if (!(paramAnonymousView.getTag() instanceof r))
        {
          GMTrace.o(8466454282240L, 63080);
          return;
        }
        Object localObject2 = (r)paramAnonymousView.getTag();
        Object localObject1 = ((r)localObject2).pRY;
        if (((biz)localObject1).uUc.ueW.size() > 0)
        {
          localObject2 = ae.bjd().Is(((r)localObject2).eEM);
          if (bg.this.pPx != null) {
            bg.this.pPx.biI().v((com.tencent.mm.plugin.sns.storage.m)localObject2);
          }
          localObject1 = ((anu)((biz)localObject1).uUc.ueW.get(0)).pPP;
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("sns_object_data", (String)localObject1);
          ((Intent)localObject2).putExtra("preceding_scence", 10);
          ((Intent)localObject2).putExtra("download_entrance_scene", 13);
          com.tencent.mm.bj.d.b(paramAnonymousView.getContext(), "emoji", ".ui.EmojiStoreDetailUI", (Intent)localObject2);
        }
        GMTrace.o(8466454282240L, 63080);
      }
    };
    this.qjR = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8391292354560L, 62520);
        if (!(paramAnonymousView.getTag() instanceof r))
        {
          GMTrace.o(8391292354560L, 62520);
          return;
        }
        Object localObject2 = (r)paramAnonymousView.getTag();
        Object localObject1 = ((r)localObject2).pRY;
        if (((biz)localObject1).uUc.ueW.size() > 0)
        {
          localObject2 = ae.bjd().Is(((r)localObject2).eEM);
          if (bg.this.pPx != null) {
            bg.this.pPx.biI().v((com.tencent.mm.plugin.sns.storage.m)localObject2);
          }
          localObject1 = ((anu)((biz)localObject1).uUc.ueW.get(0)).pPP;
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("sns_object_data", (String)localObject1);
          ((Intent)localObject2).putExtra("extra_scence", 13);
          com.tencent.mm.bj.d.b(paramAnonymousView.getContext(), "emoji", ".ui.v2.EmojiStoreV2DesignerUI", (Intent)localObject2);
        }
        GMTrace.o(8391292354560L, 62520);
      }
    };
    this.qjS = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8344718802944L, 62173);
        if (!(paramAnonymousView.getTag() instanceof r))
        {
          GMTrace.o(8344718802944L, 62173);
          return;
        }
        Object localObject2 = (r)paramAnonymousView.getTag();
        Object localObject1 = ((r)localObject2).pRY;
        if (((biz)localObject1).uUc.ueW.size() > 0)
        {
          localObject2 = ae.bjd().Is(((r)localObject2).eEM);
          if (bg.this.pPx != null) {
            bg.this.pPx.biI().v((com.tencent.mm.plugin.sns.storage.m)localObject2);
          }
          localObject1 = ((anu)((biz)localObject1).uUc.ueW.get(0)).pPP;
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("sns_object_data", (String)localObject1);
          ((Intent)localObject2).putExtra("extra_scence", 13);
          com.tencent.mm.bj.d.b(paramAnonymousView.getContext(), "emoji", ".ui.EmojiStoreTopicUI", (Intent)localObject2);
        }
        GMTrace.o(8344718802944L, 62173);
      }
    };
    this.qjT = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8539334508544L, 63623);
        if (!(paramAnonymousView.getTag() instanceof r))
        {
          GMTrace.o(8539334508544L, 63623);
          return;
        }
        Object localObject2 = (r)paramAnonymousView.getTag();
        Object localObject1 = ((r)localObject2).pRY;
        if (((biz)localObject1).uUc.ueW.size() > 0)
        {
          localObject2 = ae.bjd().Is(((r)localObject2).eEM);
          if (bg.this.pPx != null) {
            bg.this.pPx.biI().v((com.tencent.mm.plugin.sns.storage.m)localObject2);
          }
          localObject1 = ((anu)((biz)localObject1).uUc.ueW.get(0)).pPP;
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("sns_object_data", (String)localObject1);
          com.tencent.mm.bj.d.b(paramAnonymousView.getContext(), "emoji", ".ui.v2.EmojiStoreV2SingleProductUI", (Intent)localObject2);
        }
        GMTrace.o(8539334508544L, 63623);
      }
    };
    this.qjU = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8535039541248L, 63591);
        boolean bool = paramAnonymousView.getTag() instanceof r;
        w.d("MicroMsg.TimeLineClickEvent", "musicRedirectListener click " + bool);
        if (!bool)
        {
          GMTrace.o(8535039541248L, 63591);
          return;
        }
        r localr = (r)paramAnonymousView.getTag();
        biz localbiz = localr.pRY;
        String str;
        if (!bg.FR(localbiz.mmR)) {
          if ((!com.tencent.mm.p.a.aR(bg.this.context)) && (!com.tencent.mm.p.a.aP(bg.this.context)))
          {
            g.ork.A(10090, "1,0");
            if (localbiz.uUc.ueW.size() > 0)
            {
              anu localanu = (anu)localbiz.uUc.ueW.get(0);
              if (bg.this.scene != 0) {
                break label287;
              }
              paramAnonymousView = com.tencent.mm.modelsns.b.ha(738);
              com.tencent.mm.modelsns.b localb = paramAnonymousView.lu(localbiz.mmR).lu(localbiz.jhi);
              if (localbiz.uUb != null) {
                break label297;
              }
              str = "";
              label192:
              localb.lu(str).lu(localanu.eBt).lu(localanu.lPj).lu("");
              paramAnonymousView.LR();
            }
            if (!localr.pRZ) {
              break label309;
            }
            com.tencent.mm.at.b.a(((com.tencent.mm.at.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.at.a.a.class)).a(ae.zo(), localbiz, 9));
          }
        }
        for (;;)
        {
          if (bg.this.qjK != null) {
            bg.this.qjK.boE();
          }
          GMTrace.o(8535039541248L, 63591);
          return;
          label287:
          paramAnonymousView = com.tencent.mm.modelsns.b.hb(738);
          break;
          label297:
          str = localbiz.uUb.mmR;
          break label192;
          label309:
          com.tencent.mm.at.b.b(((com.tencent.mm.at.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.at.a.a.class)).a(ae.zo(), localbiz, 1));
          continue;
          g.ork.A(10231, "1");
          com.tencent.mm.at.b.JO();
        }
      }
    };
    this.qjV = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8675565502464L, 64638);
        w.i("MicroMsg.TimeLineClickEvent", "appbrandRedirectListener");
        if (!(paramAnonymousView.getTag() instanceof r))
        {
          GMTrace.o(8675565502464L, 64638);
          return;
        }
        Object localObject = (r)paramAnonymousView.getTag();
        paramAnonymousView = ((r)localObject).pRY;
        localObject = ae.bjd().Is(((r)localObject).eEM);
        if (bg.this.pPx != null) {
          bg.this.pPx.biI().v((com.tencent.mm.plugin.sns.storage.m)localObject);
        }
        if (paramAnonymousView.uUi == null)
        {
          w.e("MicroMsg.TimeLineClickEvent", "appbrandRedirectListener weappInfo is null");
          GMTrace.o(8675565502464L, 64638);
          return;
        }
        String str1 = paramAnonymousView.uUi.username;
        String str2 = paramAnonymousView.uUi.path;
        w.i("MicroMsg.TimeLineClickEvent", "username: " + str1 + "pagepath: " + str2);
        qi localqi = new qi();
        localqi.eUY.userName = str1;
        localqi.eUY.eVa = str2;
        localqi.eUY.scene = 1009;
        localqi.eUY.eAv = (paramAnonymousView.mmR + ":" + paramAnonymousView.jhi);
        paramAnonymousView = new Bundle();
        paramAnonymousView.putString("stat_send_msg_user", ((com.tencent.mm.plugin.sns.storage.m)localObject).field_userName);
        paramAnonymousView.putString("stat_msg_id", "sns_" + i.dt(((com.tencent.mm.plugin.sns.storage.m)localObject).field_snsId));
        com.tencent.mm.sdk.b.a.vgX.m(localqi);
        GMTrace.o(8675565502464L, 64638);
      }
    };
    this.qjW = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8673820672000L, 64625);
        w.i("MicroMsg.TimeLineClickEvent", "appbrandHomeRedirectListener");
        if (!(paramAnonymousView.getTag() instanceof biz))
        {
          GMTrace.o(8673820672000L, 64625);
          return;
        }
        paramAnonymousView = (biz)paramAnonymousView.getTag();
        if (paramAnonymousView.uUi == null)
        {
          w.e("MicroMsg.TimeLineClickEvent", "appbrandRedirectListener username is null");
          GMTrace.o(8673820672000L, 64625);
          return;
        }
        String str = paramAnonymousView.uUi.username;
        qi localqi = new qi();
        w.i("MicroMsg.TimeLineClickEvent", "username: " + str);
        localqi.eUY.userName = str;
        localqi.eUY.scene = 1009;
        localqi.eUY.eAv = (paramAnonymousView.mmR + ":" + paramAnonymousView.jhi);
        com.tencent.mm.sdk.b.a.vgX.m(localqi);
        GMTrace.o(8673820672000L, 64625);
      }
    };
    this.qjX = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8706704015360L, 64870);
        w.i("MicroMsg.TimeLineClickEvent", "hardMallProductRedirectListener");
        if (!(paramAnonymousView.getTag() instanceof r))
        {
          GMTrace.o(8706704015360L, 64870);
          return;
        }
        Object localObject = (r)paramAnonymousView.getTag();
        paramAnonymousView = ((r)localObject).pRY;
        if (paramAnonymousView.uUc.ueW.size() > 0)
        {
          localObject = ae.bjd().Is(((r)localObject).eEM);
          if (bg.this.pPx != null) {
            bg.this.pPx.biI().v((com.tencent.mm.plugin.sns.storage.m)localObject);
          }
          paramAnonymousView = ((anu)paramAnonymousView.uUc.ueW.get(0)).pPP;
          localObject = new Intent();
          ((Intent)localObject).putExtra("key_product_scene", 2);
          ((Intent)localObject).putExtra("key_product_info", paramAnonymousView);
          com.tencent.mm.bj.d.b(bg.this.context, "product", ".ui.MallProductUI", (Intent)localObject);
        }
        GMTrace.o(8706704015360L, 64870);
      }
    };
    this.qjY = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8673552236544L, 64623);
        w.i("MicroMsg.TimeLineClickEvent", "cardRediretListener");
        if (!(paramAnonymousView.getTag() instanceof r))
        {
          GMTrace.o(8673552236544L, 64623);
          return;
        }
        Object localObject = (r)paramAnonymousView.getTag();
        paramAnonymousView = ((r)localObject).pRY;
        if (paramAnonymousView.uUc.ueW.size() > 0)
        {
          localObject = ae.bjd().Is(((r)localObject).eEM);
          if (bg.this.pPx != null) {
            bg.this.pPx.biI().v((com.tencent.mm.plugin.sns.storage.m)localObject);
          }
          paramAnonymousView = ((anu)paramAnonymousView.uUc.ueW.get(0)).pPP;
          localObject = new Intent();
          ((Intent)localObject).putExtra("key_from_scene", 12);
          if (!TextUtils.isEmpty(paramAnonymousView))
          {
            String[] arrayOfString = paramAnonymousView.split("#");
            if (arrayOfString.length >= 2)
            {
              w.i("MicroMsg.TimeLineClickEvent", "cardRediretListener userData[0]:" + arrayOfString[0]);
              ((Intent)localObject).putExtra("key_card_id", arrayOfString[0]);
              ((Intent)localObject).putExtra("key_card_ext", arrayOfString[1]);
              com.tencent.mm.bj.d.b(bg.this.context, "card", ".ui.CardDetailUI", (Intent)localObject);
              GMTrace.o(8673552236544L, 64623);
              return;
            }
            if (arrayOfString.length == 1)
            {
              w.i("MicroMsg.TimeLineClickEvent", "cardRediretListener userData not include cardExt");
              w.i("MicroMsg.TimeLineClickEvent", "cardRediretListener card_id :" + paramAnonymousView);
              ((Intent)localObject).putExtra("key_card_id", arrayOfString[0]);
              ((Intent)localObject).putExtra("key_card_ext", "");
              com.tencent.mm.bj.d.b(bg.this.context, "card", ".ui.CardDetailUI", (Intent)localObject);
              GMTrace.o(8673552236544L, 64623);
              return;
            }
            w.i("MicroMsg.TimeLineClickEvent", "cardRediretListener userData not include card_id and cardExt");
            w.i("MicroMsg.TimeLineClickEvent", "cardRediretListener userData :" + paramAnonymousView);
            GMTrace.o(8673552236544L, 64623);
            return;
          }
          w.i("MicroMsg.TimeLineClickEvent", "cardRediretListener userData is empty");
        }
        GMTrace.o(8673552236544L, 64623);
      }
    };
    this.qjZ = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20830457167872L, 155199);
        w.i("MicroMsg.TimeLineClickEvent", "noteLinkRedirectListener");
        r localr;
        ft localft;
        String str;
        if ((paramAnonymousView.getTag() instanceof r))
        {
          localr = (r)paramAnonymousView.getTag();
          if (localr.pRY.uUc.ueV == 26)
          {
            if (com.tencent.mm.sdk.platformtools.bg.nm(localr.pRY.uUc.ueY))
            {
              GMTrace.o(20830457167872L, 155199);
              return;
            }
            localft = new ft();
            localft.eIo.type = 37;
            localft.eIo.desc = localr.pRY.uUc.ueY;
            str = "";
            paramAnonymousView = str;
            if (localr.pRY.uUc.ueW != null)
            {
              paramAnonymousView = str;
              if (localr.pRY.uUc.ueW.size() > 0)
              {
                paramAnonymousView = am.dE(ae.getAccSnsPath(), ((anu)localr.pRY.uUc.ueW.get(0)).mmR);
                str = i.e((anu)localr.pRY.uUc.ueW.get(0));
                if (!FileOp.aZ(paramAnonymousView + str)) {
                  break label291;
                }
              }
            }
          }
        }
        label291:
        for (paramAnonymousView = paramAnonymousView + str;; paramAnonymousView = "")
        {
          localft.eIo.path = paramAnonymousView;
          localft.eIo.title = localr.eEM;
          localft.eIo.context = bg.this.context;
          com.tencent.mm.sdk.b.a.vgX.m(localft);
          GMTrace.o(20830457167872L, 155199);
          return;
        }
      }
    };
    this.context = paramContext;
    this.qjK = parama;
    this.scene = paramInt;
    this.pPx = paramad;
    GMTrace.o(8562956828672L, 63799);
  }
  
  protected static boolean FR(String paramString)
  {
    GMTrace.i(8563091046400L, 63800);
    Object localObject = new jm();
    ((jm)localObject).eNj.action = -2;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    localObject = ((jm)localObject).eNk.eNl;
    if ((localObject != null) && (com.tencent.mm.at.b.d((apv)localObject)) && (paramString.equals(((apv)localObject).ucY)) && (com.tencent.mm.at.b.JQ()))
    {
      GMTrace.o(8563091046400L, 63800);
      return true;
    }
    GMTrace.o(8563091046400L, 63800);
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void boE();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */