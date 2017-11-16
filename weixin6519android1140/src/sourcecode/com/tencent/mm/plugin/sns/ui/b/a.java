package com.tencent.mm.plugin.sns.ui.b;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.view.MenuItem;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.cf.a;
import com.tencent.mm.g.a.cf.b;
import com.tencent.mm.g.a.qg;
import com.tencent.mm.g.a.qg.b;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.a.b.j;
import com.tencent.mm.plugin.sns.a.b.j.c;
import com.tencent.mm.plugin.sns.a.b.j.d;
import com.tencent.mm.plugin.sns.a.b.j.e;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ad;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.plugin.sns.model.ao;
import com.tencent.mm.plugin.sns.model.ao.b;
import com.tencent.mm.plugin.sns.ui.FlipView;
import com.tencent.mm.plugin.sns.ui.SnsBrowseUI;
import com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity;
import com.tencent.mm.plugin.sns.ui.SnsPermissionUI;
import com.tencent.mm.plugin.sns.ui.ap;
import com.tencent.mm.plugin.sns.ui.as;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.bew;
import com.tencent.mm.protocal.c.bhq;
import com.tencent.mm.protocal.c.bhr;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.cs;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.protocal.c.tz;
import com.tencent.mm.protocal.c.uf;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.y.s;
import com.tencent.mm.y.u.b;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class a
  implements com.tencent.mm.ad.e, p.d
{
  private Activity activity;
  private ClipboardManager liU;
  private r pPm;
  private ad pPx;
  private View qmr;
  private String qms;
  private biz qmt;
  private int scene;
  
  public a(Activity paramActivity, int paramInt, ad paramad)
  {
    GMTrace.i(8644963860480L, 64410);
    this.activity = paramActivity;
    this.scene = paramInt;
    this.liU = ((ClipboardManager)paramActivity.getSystemService("clipboard"));
    this.pPx = paramad;
    GMTrace.o(8644963860480L, 64410);
  }
  
  private void Jr(String paramString)
  {
    GMTrace.i(8645500731392L, 64414);
    Object localObject2 = ae.bjd().Is(paramString);
    if (localObject2 == null)
    {
      GMTrace.o(8645500731392L, 64414);
      return;
    }
    if (((com.tencent.mm.plugin.sns.storage.m)localObject2).uX(32))
    {
      ((com.tencent.mm.plugin.sns.storage.m)localObject2).blB();
      localObject1 = ((com.tencent.mm.plugin.sns.storage.m)localObject2).bmj();
      str1 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.w((com.tencent.mm.plugin.sns.storage.m)localObject2);
      if (!bg.nm(str1)) {
        ((com.tencent.mm.plugin.sns.storage.e)localObject1).field_adxml = str1;
      }
    }
    for (Object localObject1 = ((com.tencent.mm.plugin.sns.storage.e)localObject1).field_adxml;; localObject1 = ((com.tencent.mm.plugin.sns.storage.m)localObject2).blD().pRQ)
    {
      localObject3 = bh.q((String)localObject1, "adxml");
      if (localObject3 != null) {
        break;
      }
      GMTrace.o(8645500731392L, 64414);
      return;
    }
    if (!((Map)localObject3).containsKey(".adxml.adCanvasInfo"))
    {
      com.tencent.mm.ui.base.h.h(this.activity, i.j.dtD, 0);
      GMTrace.o(8645500731392L, 64414);
      return;
    }
    localObject2 = com.tencent.mm.y.u.gy(((com.tencent.mm.plugin.sns.storage.m)localObject2).field_snsId);
    String str1 = bg.aq((String)((Map)localObject3).get(".adxml.adCanvasInfo.shareTitle"), "");
    String str2 = bg.aq((String)((Map)localObject3).get(".adxml.adCanvasInfo.shareWebUrl"), "");
    String str3 = bg.aq((String)((Map)localObject3).get(".adxml.adCanvasInfo.shareDesc"), "");
    Object localObject3 = new cf();
    qg localqg = new qg();
    localqg.eUS.eUV = paramString;
    localqg.eUS.eUW = ((cf)localObject3);
    localqg.eUS.url = str2;
    com.tencent.mm.sdk.b.a.vgX.m(localqg);
    if (!localqg.eUT.eDb)
    {
      if (((cf)localObject3).eDv.eDB == 0) {
        ((cf)localObject3).eDv.eDB = i.j.dtC;
      }
      com.tencent.mm.ui.base.h.h(this.activity, ((cf)localObject3).eDv.eDB, 0);
      GMTrace.o(8645500731392L, 64414);
      return;
    }
    ((cf)localObject3).eDv.eDA = ((String)localObject2);
    ((cf)localObject3).eDv.title = str1;
    ((cf)localObject3).eDv.desc = str3;
    paramString = ((cf)localObject3).eDv.eDx;
    if ((paramString != null) && (paramString.ulB != null) && (paramString.ulB.size() > 0) && (paramString.ulB.get(0) != null))
    {
      ((th)paramString.ulB.get(0)).QF((String)localObject1);
      if (bg.nm(((th)paramString.ulB.get(0)).title)) {
        ((th)paramString.ulB.get(0)).Qg(((cf)localObject3).eDv.title);
      }
      if (bg.nm(((th)paramString.ulB.get(0)).desc)) {
        ((th)paramString.ulB.get(0)).Qh(((cf)localObject3).eDv.desc);
      }
    }
    ((cf)localObject3).eDv.activity = this.activity;
    ((cf)localObject3).eDv.eDC = 28;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject3);
    GMTrace.o(8645500731392L, 64414);
  }
  
  private String bpX()
  {
    GMTrace.i(8645232295936L, 64412);
    if ((this.qmr != null) && ((this.qmr.getTag() instanceof as)) && (((as)this.qmr.getTag()).bpn()))
    {
      Object localObject = ao.HA(ae.bjd().Is(this.qms).blE());
      if (localObject != null)
      {
        localObject = ((ao.b)localObject).result;
        GMTrace.o(8645232295936L, 64412);
        return (String)localObject;
      }
    }
    GMTrace.o(8645232295936L, 64412);
    return null;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8645769166848L, 64416);
    w.i("MicroMsg.TimeLineMMMenuItemSelectedListener", "onSceneEnd");
    if ((this.pPm != null) && (this.pPm.isShowing())) {
      this.pPm.dismiss();
    }
    GMTrace.o(8645769166848L, 64416);
  }
  
  public final void a(View paramView, String paramString, biz parambiz)
  {
    GMTrace.i(8645098078208L, 64411);
    this.qmr = paramView;
    this.qms = paramString;
    this.qmt = parambiz;
    GMTrace.o(8645098078208L, 64411);
  }
  
  public final void c(final MenuItem paramMenuItem, int paramInt)
  {
    GMTrace.i(8645366513664L, 64413);
    if (this.qmr == null)
    {
      GMTrace.o(8645366513664L, 64413);
      return;
    }
    Object localObject3;
    Object localObject4;
    label682:
    label870:
    Object localObject7;
    Object localObject5;
    Object localObject6;
    label1490:
    int i;
    long l;
    label2573:
    Object localObject2;
    switch (paramMenuItem.getItemId())
    {
    case 6: 
    default: 
    case 0: 
    case 1: 
    case 2: 
    case 4: 
    case 18: 
    case 19: 
    case 3: 
    case 5: 
    case 9: 
    case 7: 
    case 8: 
    case 10: 
    case 12: 
    case 11: 
    case 13: 
    case 14: 
    case 15: 
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                GMTrace.o(8645366513664L, 64413);
                return;
                Object localObject1 = bpX();
                paramMenuItem = (MenuItem)localObject1;
                if (bg.nm((String)localObject1)) {
                  paramMenuItem = this.qmt.uTZ;
                }
                this.liU.setText(paramMenuItem);
                com.tencent.mm.ui.base.h.bm(this.activity, this.activity.getString(i.j.cSq));
                paramInt = com.tencent.mm.plugin.secinforeport.a.a.oEY;
                com.tencent.mm.plugin.secinforeport.a.a.c(2, this.qmt.mmR, bg.So(paramMenuItem));
                GMTrace.o(8645366513664L, 64413);
                return;
                localObject1 = bpX();
                paramMenuItem = (MenuItem)localObject1;
                if (bg.nm((String)localObject1)) {
                  paramMenuItem = this.qmt.uTZ;
                }
                this.pPx.biI().dJ(this.qms, this.qmt.mmR);
                localObject1 = new cf();
                com.tencent.mm.plugin.sns.i.a.a((cf)localObject1, this.qms, paramMenuItem);
                ((cf)localObject1).eDv.activity = this.activity;
                ((cf)localObject1).eDv.eDC = 30;
                com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
                GMTrace.o(8645366513664L, 64413);
                return;
                this.pPx.biI().dJ(this.qms, this.qmt.mmR);
                paramMenuItem = new cf();
                localObject1 = com.tencent.mm.plugin.sns.storage.h.Is(this.qms);
                if ((((com.tencent.mm.plugin.sns.storage.m)localObject1).uX(32)) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).blz().pCp))
                {
                  Jr(this.qms);
                  if (((com.tencent.mm.plugin.sns.storage.m)localObject1).uX(32)) {
                    if (this.scene != 0) {
                      break label682;
                    }
                  }
                }
                for (paramInt = 1;; paramInt = 2)
                {
                  paramMenuItem = new com.tencent.mm.plugin.sns.a.b.c(((com.tencent.mm.plugin.sns.storage.m)localObject1).bmh(), 11, paramInt, "", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmm(), ((com.tencent.mm.plugin.sns.storage.m)localObject1).blE());
                  com.tencent.mm.kernel.h.xz();
                  com.tencent.mm.kernel.h.xx().fYr.a(paramMenuItem, 0);
                  GMTrace.o(8645366513664L, 64413);
                  return;
                  localObject3 = (ap)this.qmr.getTag();
                  localObject4 = this.qms;
                  paramInt = ((ap)localObject3).index;
                  if ((com.tencent.mm.plugin.sns.storage.u.IP((String)localObject4)) || (paramInt < 0))
                  {
                    w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or position errro");
                    paramMenuItem.eDv.eDB = i.j.dtu;
                  }
                  for (;;)
                  {
                    paramMenuItem.eDv.activity = this.activity;
                    paramMenuItem.eDv.eDC = 31;
                    com.tencent.mm.sdk.b.a.vgX.m(paramMenuItem);
                    break;
                    if (ae.biM())
                    {
                      w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
                      paramMenuItem.eDv.eDB = i.j.phR;
                    }
                    else
                    {
                      localObject3 = ae.bjd().Is((String)localObject4);
                      if (localObject3 == null)
                      {
                        w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
                        paramMenuItem.eDv.eDB = i.j.dtv;
                      }
                      else
                      {
                        localObject4 = ai.a((com.tencent.mm.plugin.sns.storage.m)localObject3, paramInt);
                        if (localObject4 == null)
                        {
                          w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, media obj is null");
                          paramMenuItem.eDv.eDB = i.j.dtv;
                        }
                        else
                        {
                          com.tencent.mm.plugin.sns.i.a.a(paramMenuItem, (com.tencent.mm.plugin.sns.storage.m)localObject3, ((anu)localObject4).mmR);
                        }
                      }
                    }
                  }
                }
                this.pPx.biI().dJ(this.qms, this.qmt.mmR);
                paramMenuItem = ae.bjd().Is(this.qms);
                if (this.qmt.uUc.ueW.size() != 0)
                {
                  localObject1 = (anu)this.qmt.uUc.ueW.get(0);
                  if ((paramMenuItem == null) || (localObject1 == null))
                  {
                    w.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "favorite music fail, snsinfo or mediaobj is null");
                    GMTrace.o(8645366513664L, 64413);
                    return;
                  }
                  localObject3 = new cf();
                  if ((localObject1 != null) && (paramMenuItem != null) && (paramMenuItem.pMe != 0)) {
                    break label870;
                  }
                  w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or media is null");
                }
                for (((cf)localObject3).eDv.eDB = i.j.dtu;; ((cf)localObject3).eDv.eDB = i.j.phR)
                {
                  ((cf)localObject3).eDv.activity = this.activity;
                  ((cf)localObject3).eDv.eDC = 25;
                  com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject3);
                  GMTrace.o(8645366513664L, 64413);
                  return;
                  if (!ae.biM()) {
                    break;
                  }
                  w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
                }
                localObject7 = String.format("%s#%s", new Object[] { i.dt(paramMenuItem.field_snsId), ((anu)localObject1).mmR });
                localObject4 = new tt();
                localObject5 = new tw();
                w.i("MicroMsg.Sns.GetFavDataSource", "fav sns music, from %s", new Object[] { paramMenuItem.field_userName });
                ((tw)localObject5).QY(paramMenuItem.field_userName);
                ((tw)localObject5).QZ(com.tencent.mm.y.q.zE());
                ((tw)localObject5).zZ(2);
                ((tw)localObject5).eE(paramMenuItem.field_createTime * 1000L);
                ((tw)localObject5).Rd(paramMenuItem.blE());
                ((tw)localObject5).Ra((String)localObject7);
                localObject6 = new th();
                ((th)localObject6).Qy((String)localObject7);
                ((th)localObject6).Qn(((anu)localObject1).lPM);
                ((th)localObject6).Qo(((anu)localObject1).uCS);
                ((th)localObject6).Qm(paramMenuItem.blD().uUc.lPM);
                localObject7 = am.dE(ae.getAccSnsPath(), ((anu)localObject1).mmR) + i.e((anu)localObject1);
                if (FileOp.aZ((String)localObject7)) {
                  ((th)localObject6).Qv((String)localObject7);
                }
                for (;;)
                {
                  ((th)localObject6).zR(7);
                  ((th)localObject6).Qg(((anu)localObject1).eBt);
                  ((th)localObject6).Qh(((anu)localObject1).lPj);
                  ((th)localObject6).kw(true);
                  ((tt)localObject4).ulB.add(localObject6);
                  ((tt)localObject4).a((tw)localObject5);
                  ((cf)localObject3).eDv.eDx = ((tt)localObject4);
                  ((cf)localObject3).eDv.type = 7;
                  com.tencent.mm.plugin.sns.i.a.a((th)localObject6, paramMenuItem);
                  break;
                  ((th)localObject6).kx(true);
                  ((th)localObject6).Qp(((anu)localObject1).uCO);
                  localObject7 = new uf();
                  ((uf)localObject7).Ro(((anu)localObject1).uCO);
                  ((tt)localObject4).b((uf)localObject7);
                }
                paramMenuItem = this.activity;
                localObject4 = ae.bjd().Is(this.qms);
                if (localObject4 != null)
                {
                  localObject1 = new Intent();
                  if (((com.tencent.mm.plugin.sns.storage.m)localObject4).blD().uUc.ueV != 1) {
                    break label1490;
                  }
                  localObject3 = (ap)this.qmr.getTag();
                  localObject4 = ai.a((com.tencent.mm.plugin.sns.storage.m)localObject4, ((ap)localObject3).index);
                  if (localObject4 == null)
                  {
                    w.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "send photo fail, mediaObj is null");
                    GMTrace.o(8645366513664L, 64413);
                    return;
                  }
                  localObject5 = ((anu)localObject4).mmR;
                  ((Intent)localObject1).putExtra("sns_send_data_ui_image_path", FlipView.f(am.dE(ae.getAccSnsPath(), (String)localObject5) + i.l((anu)localObject4), paramMenuItem));
                  ((Intent)localObject1).putExtra("sns_send_data_ui_image_position", ((ap)localObject3).index);
                }
                while (((((com.tencent.mm.plugin.sns.storage.m)localObject4).blD().uUc.ueV != 4) && (((com.tencent.mm.plugin.sns.storage.m)localObject4).blD().uUc.ueV != 15) && (((com.tencent.mm.plugin.sns.storage.m)localObject4).blD().uUc.ueV != 3)) || ((anu)((com.tencent.mm.plugin.sns.storage.m)localObject4).blD().uUc.ueW.get(0) != null))
                {
                  ((Intent)localObject1).putExtra("exdevice_open_scene_type", 1);
                  ((Intent)localObject1).putExtra("sns_local_id", this.qms);
                  ((Intent)localObject1).putExtra("sns_send_data_ui_activity", true);
                  com.tencent.mm.bj.d.a(this.activity, ".ui.chatting.ChattingSendDataToDeviceUI", (Intent)localObject1);
                  GMTrace.o(8645366513664L, 64413);
                  return;
                }
                w.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "mediaObj is null, send failed!");
                GMTrace.o(8645366513664L, 64413);
                return;
                paramMenuItem = ae.bjd().Is(this.qms);
                if (paramMenuItem == null)
                {
                  w.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "mute play video but sns info is null.");
                  GMTrace.o(8645366513664L, 64413);
                  return;
                }
                if (paramMenuItem.uX(32))
                {
                  w.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "mute play video but it is ad");
                  GMTrace.o(8645366513664L, 64413);
                  return;
                }
                localObject1 = (anu)paramMenuItem.blD().uUc.ueW.get(0);
                if (localObject1 == null)
                {
                  w.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "mute paly video but media is null");
                  GMTrace.o(8645366513664L, 64413);
                  return;
                }
                localObject3 = am.dE(ae.getAccSnsPath(), ((anu)localObject1).mmR);
                paramMenuItem = "";
                localObject4 = i.j((anu)localObject1);
                if (FileOp.aZ((String)localObject3 + (String)localObject4)) {
                  paramMenuItem = (String)localObject3 + i.e((anu)localObject1);
                }
                if (FileOp.aZ((String)localObject3 + i.p((anu)localObject1))) {
                  paramMenuItem = (String)localObject3 + i.n((anu)localObject1);
                }
                localObject1 = new Intent();
                ((Intent)localObject1).setClass(this.activity, SnsOnlineVideoActivity.class);
                ((Intent)localObject1).putExtra("intent_thumbpath", paramMenuItem);
                ((Intent)localObject1).putExtra("intent_localid", this.qms);
                ((Intent)localObject1).putExtra("intent_from_scene", this.scene);
                ((Intent)localObject1).putExtra("intent_ismute", true);
                if (this.qmr != null)
                {
                  paramMenuItem = new int[2];
                  this.qmr.getLocationInWindow(paramMenuItem);
                  paramInt = this.qmr.getWidth();
                  i = this.qmr.getHeight();
                  ((Intent)localObject1).putExtra("img_gallery_left", paramMenuItem[0]);
                  ((Intent)localObject1).putExtra("img_gallery_top", paramMenuItem[1]);
                  ((Intent)localObject1).putExtra("img_gallery_width", paramInt);
                  ((Intent)localObject1).putExtra("img_gallery_height", i);
                }
                this.activity.startActivity((Intent)localObject1);
                this.activity.overridePendingTransition(0, 0);
                GMTrace.o(8645366513664L, 64413);
                return;
                this.pPx.biI().dJ(this.qms, this.qmt.mmR);
                paramMenuItem = this.qmt.uUc.lPM;
                localObject1 = this.qmt.uUb.mmR;
                localObject1 = av.Jq(paramMenuItem);
                if (bg.nm((String)localObject1))
                {
                  w.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "favorite url fail, url is null");
                  GMTrace.o(8645366513664L, 64413);
                  return;
                }
                paramMenuItem = new cf();
                localObject3 = com.tencent.mm.plugin.sns.storage.h.Is(this.qms);
                if (localObject3 != null)
                {
                  localObject4 = com.tencent.mm.y.u.gy(((com.tencent.mm.plugin.sns.storage.m)localObject3).field_snsId);
                  localObject5 = com.tencent.mm.y.u.Av().p((String)localObject4, true);
                  ((u.b)localObject5).o("prePublishId", "sns_" + i.dt(((com.tencent.mm.plugin.sns.storage.m)localObject3).field_snsId));
                  ((u.b)localObject5).o("preUsername", ((com.tencent.mm.plugin.sns.storage.m)localObject3).field_userName);
                  ((u.b)localObject5).o("preChatName", "");
                  ((u.b)localObject5).o("url", localObject1);
                  ((u.b)localObject5).o("preMsgIndex", Integer.valueOf(0));
                  ((u.b)localObject5).o("sendAppMsgScene", Integer.valueOf(1));
                  ((u.b)localObject5).o("adExtStr", ((com.tencent.mm.plugin.sns.storage.m)localObject3).blD().pTh);
                  paramMenuItem.eDv.eDA = ((String)localObject4);
                }
                localObject3 = ae.bjd().Is(this.qms);
                if ((localObject3 != null) && (this.qmt.uUc.ueV == 18)) {
                  j.a(j.d.pox, j.c.poq, j.e.poC, 0, (com.tencent.mm.plugin.sns.storage.m)localObject3);
                }
                if (!bg.nm(this.qmt.pRQ))
                {
                  Jr(((com.tencent.mm.plugin.sns.storage.m)localObject3).blY());
                  GMTrace.o(8645366513664L, 64413);
                  return;
                }
                if (((com.tencent.mm.plugin.sns.storage.m)localObject3).uX(32)) {
                  if (this.scene != 0) {
                    break label2573;
                  }
                }
                for (paramInt = 1;; paramInt = 2)
                {
                  localObject3 = new com.tencent.mm.plugin.sns.a.b.c(((com.tencent.mm.plugin.sns.storage.m)localObject3).bmh(), 11, paramInt, "", ((com.tencent.mm.plugin.sns.storage.m)localObject3).bmm(), ((com.tencent.mm.plugin.sns.storage.m)localObject3).blE());
                  com.tencent.mm.kernel.h.xz();
                  com.tencent.mm.kernel.h.xx().fYr.a((k)localObject3, 0);
                  com.tencent.mm.plugin.sns.i.a.a(paramMenuItem, (String)localObject1, this.qms);
                  paramMenuItem.eDv.activity = this.activity;
                  paramMenuItem.eDv.eDC = 28;
                  com.tencent.mm.sdk.b.a.vgX.m(paramMenuItem);
                  if (paramMenuItem.eDw.ret == 0)
                  {
                    l = bg.Pu();
                    if (!bg.nm((String)localObject1))
                    {
                      w.d("MicroMsg.TimeLineMMMenuItemSelectedListener", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13378), localObject1, Long.valueOf(l), Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(1) });
                      paramMenuItem = "";
                    }
                  }
                  try
                  {
                    localObject1 = URLEncoder.encode((String)localObject1, "UTF-8");
                    paramMenuItem = (MenuItem)localObject1;
                  }
                  catch (UnsupportedEncodingException localUnsupportedEncodingException)
                  {
                    for (;;)
                    {
                      w.printErrStackTrace("MicroMsg.TimeLineMMMenuItemSelectedListener", localUnsupportedEncodingException, "", new Object[0]);
                    }
                  }
                  com.tencent.mm.plugin.report.service.g.ork.i(13378, new Object[] { paramMenuItem, Long.valueOf(l), Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(1) });
                  GMTrace.o(8645366513664L, 64413);
                  return;
                }
                this.pPx.biI().dJ(this.qms, this.qmt.mmR);
              } while (this.qmt == null);
              paramMenuItem = new cf();
              localObject5 = this.qmt;
              if (localObject5 == null)
              {
                w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or tlObj is null");
                paramMenuItem.eDv.eDB = i.j.dtu;
              }
              for (;;)
              {
                paramMenuItem.eDv.activity = this.activity;
                paramMenuItem.eDv.eDC = 26;
                com.tencent.mm.sdk.b.a.vgX.m(paramMenuItem);
                GMTrace.o(8645366513664L, 64413);
                return;
                localObject2 = new tt();
                localObject3 = new tw();
                localObject4 = new ts();
                ((tw)localObject3).QY(((biz)localObject5).jhi);
                ((tw)localObject3).QZ(com.tencent.mm.y.q.zE());
                ((tw)localObject3).zZ(2);
                ((tw)localObject3).eE(bg.Pv());
                if (((biz)localObject5).uUb != null) {
                  ((tw)localObject3).Re(((biz)localObject5).uUb.mmR);
                }
                if (((biz)localObject5).uUc != null)
                {
                  ((ts)localObject4).QR(((biz)localObject5).uUc.eBt);
                  ((ts)localObject4).QS(((biz)localObject5).uUc.lPj);
                  if ((((biz)localObject5).uUc.ueW != null) && (!((biz)localObject5).uUc.ueW.isEmpty()))
                  {
                    localObject5 = (anu)((biz)localObject5).uUc.ueW.get(0);
                    ((ts)localObject4).zW(((anu)localObject5).eCt);
                    ((ts)localObject4).QU(((anu)localObject5).pPP);
                    ((ts)localObject4).QT(((anu)localObject5).uCO);
                  }
                }
                paramMenuItem.eDv.title = ((ts)localObject4).title;
                paramMenuItem.eDv.desc = ((ts)localObject4).desc;
                paramMenuItem.eDv.eDx = ((tt)localObject2);
                paramMenuItem.eDv.type = 10;
                ((tt)localObject2).a((tw)localObject3);
                ((tt)localObject2).b((ts)localObject4);
              }
              this.pPx.biI().dJ(this.qms, this.qmt.mmR);
            } while (this.qmt == null);
            paramMenuItem = new cf();
            localObject5 = this.qmt;
            if (localObject5 == null)
            {
              w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or tlObj is null");
              paramMenuItem.eDv.eDB = i.j.dtu;
            }
            for (;;)
            {
              paramMenuItem.eDv.activity = this.activity;
              paramMenuItem.eDv.eDC = 27;
              com.tencent.mm.sdk.b.a.vgX.m(paramMenuItem);
              GMTrace.o(8645366513664L, 64413);
              return;
              localObject2 = new tt();
              localObject3 = new tw();
              localObject4 = new tz();
              ((tw)localObject3).QY(((biz)localObject5).jhi);
              ((tw)localObject3).QZ(com.tencent.mm.y.q.zE());
              ((tw)localObject3).zZ(8);
              ((tw)localObject3).eE(bg.Pv());
              if (((biz)localObject5).uUb != null) {
                ((tw)localObject3).Re(((biz)localObject5).uUb.mmR);
              }
              if (((biz)localObject5).uUc != null)
              {
                ((tz)localObject4).Rh(((biz)localObject5).uUc.eBt);
                ((tz)localObject4).Ri(((biz)localObject5).uUc.lPj);
                if ((((biz)localObject5).uUc.ueW != null) && (!((biz)localObject5).uUc.ueW.isEmpty()))
                {
                  localObject5 = (anu)((biz)localObject5).uUc.ueW.get(0);
                  ((tz)localObject4).Rk(((anu)localObject5).pPP);
                  ((tz)localObject4).Rj(((anu)localObject5).uCO);
                }
              }
              paramMenuItem.eDv.title = ((tz)localObject4).title;
              paramMenuItem.eDv.desc = ((tz)localObject4).desc;
              paramMenuItem.eDv.eDx = ((tt)localObject2);
              paramMenuItem.eDv.type = 15;
              ((tt)localObject2).a((tw)localObject3);
              ((tt)localObject2).b((tz)localObject4);
            }
            paramMenuItem = ae.bjd().Is(this.qms).blE();
            localObject2 = (com.tencent.mm.plugin.sns.ui.m)this.qmr.getTag();
            if (com.tencent.mm.plugin.sns.storage.u.IL(paramMenuItem))
            {
              paramMenuItem = new com.tencent.mm.plugin.sns.model.q(com.tencent.mm.plugin.sns.storage.u.IM(paramMenuItem), 6, ((com.tencent.mm.plugin.sns.ui.m)localObject2).pso);
              com.tencent.mm.kernel.h.xz();
              com.tencent.mm.kernel.h.xx().fYr.a(paramMenuItem, 0);
            }
            for (;;)
            {
              localObject2 = this.activity;
              this.activity.getString(i.j.cUG);
              this.pPm = com.tencent.mm.ui.base.h.a((Context)localObject2, this.activity.getString(i.j.piP), true, new DialogInterface.OnCancelListener()
              {
                public final void onCancel(DialogInterface paramAnonymousDialogInterface)
                {
                  GMTrace.i(8644561207296L, 64407);
                  com.tencent.mm.kernel.h.xz();
                  com.tencent.mm.kernel.h.xx().fYr.c(paramMenuItem);
                  GMTrace.o(8644561207296L, 64407);
                }
              });
              GMTrace.o(8645366513664L, 64413);
              return;
              paramMenuItem = new com.tencent.mm.plugin.sns.model.q(com.tencent.mm.plugin.sns.storage.u.IM(paramMenuItem), 4, ((com.tencent.mm.plugin.sns.ui.m)localObject2).pso);
              com.tencent.mm.kernel.h.xz();
              com.tencent.mm.kernel.h.xx().fYr.a(paramMenuItem, 0);
            }
            paramMenuItem = ae.bjd().Is(this.qms);
          } while (paramMenuItem == null);
          com.tencent.mm.plugin.sns.abtest.a.b(paramMenuItem);
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("sns_permission_snsinfo_svr_id", paramMenuItem.field_snsId);
          ((Intent)localObject2).putExtra("sns_permission_userName", paramMenuItem.field_userName);
          ((Intent)localObject2).putExtra("sns_permission_anim", true);
          ((Intent)localObject2).setClass(this.activity, SnsPermissionUI.class);
          this.activity.startActivityForResult((Intent)localObject2, 11);
          GMTrace.o(8645366513664L, 64413);
          return;
          this.pPx.biI().dJ(this.qms, this.qmt.mmR);
          paramMenuItem = com.tencent.mm.plugin.sns.storage.h.Is(this.qms);
          if ((paramMenuItem.uX(32)) && (paramMenuItem.blz().pCp))
          {
            paramMenuItem = ae.bjd().Is(this.qms);
            if ((paramMenuItem != null) && (paramMenuItem.uX(32))) {
              if (this.scene != 0) {
                break label3711;
              }
            }
            for (paramInt = 1;; paramInt = 2)
            {
              paramMenuItem = new com.tencent.mm.plugin.sns.a.b.c(paramMenuItem.bmh(), 11, paramInt, "", 2, paramMenuItem.blE());
              com.tencent.mm.kernel.h.xz();
              com.tencent.mm.kernel.h.xx().fYr.a(paramMenuItem, 0);
              Jr(this.qms);
              GMTrace.o(8645366513664L, 64413);
              return;
            }
          }
          paramMenuItem = this.qms;
          paramMenuItem = ae.bjd().Is(paramMenuItem);
          if (paramMenuItem != null) {
            if (paramMenuItem.uX(32))
            {
              j.a(j.d.pow, j.c.poq, j.e.poC, 0, paramMenuItem);
              if (this.scene != 0) {
                break label3865;
              }
            }
          }
          for (paramInt = 1;; paramInt = 2)
          {
            localObject2 = new com.tencent.mm.plugin.sns.a.b.c(paramMenuItem.bmh(), 11, paramInt, "", paramMenuItem.bmm(), paramMenuItem.blE());
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xx().fYr.a((k)localObject2, 0);
            localObject2 = new cf();
            com.tencent.mm.plugin.sns.i.a.a((cf)localObject2, paramMenuItem);
            ((cf)localObject2).eDv.activity = this.activity;
            ((cf)localObject2).eDv.eDC = 29;
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
            GMTrace.o(8645366513664L, 64413);
            return;
          }
          paramMenuItem = (anu)this.qmt.uUc.ueW.get(0);
          paramMenuItem = am.dE(ae.getAccSnsPath(), paramMenuItem.mmR) + i.e(paramMenuItem);
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("Select_Conv_Type", 3);
          ((Intent)localObject2).putExtra("select_is_ret", true);
          ((Intent)localObject2).putExtra("mutil_select_is_ret", true);
          ((Intent)localObject2).putExtra("image_path", paramMenuItem);
          ((Intent)localObject2).putExtra("Retr_Msg_Type", 11);
          com.tencent.mm.bj.d.a(this.activity, ".ui.transmit.SelectConversationUI", (Intent)localObject2, 15);
          GMTrace.o(8645366513664L, 64413);
          return;
        } while (!(this.qmr.getTag() instanceof com.tencent.mm.plugin.sns.ui.m));
        paramMenuItem = (com.tencent.mm.plugin.sns.ui.m)this.qmr.getTag();
        this.liU.setText(paramMenuItem.nIp);
        com.tencent.mm.ui.base.h.bm(this.activity, this.activity.getString(i.j.cSq));
        if (paramMenuItem.pso != null)
        {
          paramInt = com.tencent.mm.plugin.secinforeport.a.a.oEY;
          com.tencent.mm.plugin.secinforeport.a.a.c(4, this.qmt.mmR + ":" + paramMenuItem.pso.uQm, bg.So(paramMenuItem.nIp));
        }
        GMTrace.o(8645366513664L, 64413);
        return;
        paramMenuItem = ae.bjd().Is(this.qms);
        com.tencent.mm.plugin.sns.abtest.a.a(this.activity, paramMenuItem);
        GMTrace.o(8645366513664L, 64413);
        return;
        localObject2 = ae.bjd().Is(this.qms);
        if (localObject2 != null) {
          if (this.scene != 0) {
            break label4240;
          }
        }
        for (paramMenuItem = com.tencent.mm.modelsns.b.ha(714);; paramMenuItem = com.tencent.mm.modelsns.b.hb(714))
        {
          paramMenuItem.lu(i.g((com.tencent.mm.plugin.sns.storage.m)localObject2)).hd(((com.tencent.mm.plugin.sns.storage.m)localObject2).field_type).bC(((com.tencent.mm.plugin.sns.storage.m)localObject2).uX(32)).lu(((com.tencent.mm.plugin.sns.storage.m)localObject2).bmi());
          paramMenuItem.LR();
          ao.o((com.tencent.mm.plugin.sns.storage.m)localObject2);
          GMTrace.o(8645366513664L, 64413);
          return;
        }
      } while (!(this.qmr.getTag() instanceof com.tencent.mm.plugin.sns.ui.m));
      localObject2 = (com.tencent.mm.plugin.sns.ui.m)this.qmr.getTag();
      localObject3 = ae.bjd().Ir(((com.tencent.mm.plugin.sns.ui.m)localObject2).pPG);
      if (localObject3 != null)
      {
        if (this.scene != 0) {
          break label4420;
        }
        paramMenuItem = com.tencent.mm.modelsns.b.ha(715);
        paramMenuItem.lu(i.g((com.tencent.mm.plugin.sns.storage.m)localObject3)).hd(((com.tencent.mm.plugin.sns.storage.m)localObject3).field_type).bC(((com.tencent.mm.plugin.sns.storage.m)localObject3).uX(32)).lu(((com.tencent.mm.plugin.sns.storage.m)localObject3).bmi());
        if (((com.tencent.mm.plugin.sns.ui.m)localObject2).pso == null) {
          break label4456;
        }
        if (((com.tencent.mm.plugin.sns.ui.m)localObject2).pso.uQm != 0) {
          break label4430;
        }
        localObject2 = ((com.tencent.mm.plugin.sns.ui.m)localObject2).pso.uQp;
        paramMenuItem.lu((String)localObject2);
      }
      for (;;)
      {
        paramMenuItem.LR();
        ao.a((com.tencent.mm.plugin.sns.ui.m)this.qmr.getTag());
        GMTrace.o(8645366513664L, 64413);
        return;
        paramMenuItem = com.tencent.mm.modelsns.b.hb(715);
        break;
        localObject2 = ((com.tencent.mm.plugin.sns.ui.m)localObject2).pso.uQm;
        break label4385;
        paramMenuItem.lu("");
      }
    case 20: 
      label3711:
      label3865:
      label4240:
      label4385:
      label4420:
      label4430:
      label4456:
      this.pPx.biI().dJ(this.qms, this.qmt.mmR);
      paramMenuItem = com.tencent.mm.plugin.sns.storage.h.Is(this.qms);
      if ((paramMenuItem.uX(32)) && (paramMenuItem.blz().pCp))
      {
        paramMenuItem = ae.bjd().Is(this.qms);
        if ((paramMenuItem != null) && (paramMenuItem.uX(32)))
        {
          if ((this.qmt == null) || (this.qmt.uUc.ueV != 15) || (this.qmt.uUj == 1)) {
            break label4643;
          }
          if (this.scene != 0) {
            break label4638;
          }
        }
        label4638:
        for (paramInt = 1;; paramInt = 2)
        {
          paramMenuItem = new com.tencent.mm.plugin.sns.a.b.c(paramMenuItem.bmh(), 11, paramInt, "", 5, paramMenuItem.blE());
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xx().fYr.a(paramMenuItem, 0);
          Jr(this.qms);
          GMTrace.o(8645366513664L, 64413);
          return;
        }
        label4643:
        if (this.scene == 0) {}
        for (paramInt = 1;; paramInt = 2)
        {
          paramMenuItem = new com.tencent.mm.plugin.sns.a.b.c(paramMenuItem.bmh(), 11, paramInt, "", 4, paramMenuItem.blE());
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xx().fYr.a(paramMenuItem, 0);
          break;
        }
      }
      paramMenuItem = this.qms;
      localObject3 = ae.bjd().Is(paramMenuItem);
      localObject2 = null;
      paramMenuItem = (MenuItem)localObject2;
      if (localObject3 != null)
      {
        paramMenuItem = (MenuItem)localObject2;
        if (((com.tencent.mm.plugin.sns.storage.m)localObject3).uX(32))
        {
          localObject2 = ((com.tencent.mm.plugin.sns.storage.m)localObject3).bmg();
          paramMenuItem = (MenuItem)localObject2;
          if (bg.nm((String)localObject2)) {
            paramMenuItem = ((com.tencent.mm.plugin.sns.storage.m)localObject3).bmf();
          }
        }
      }
      if (bg.nm(paramMenuItem))
      {
        paramMenuItem = this.qmt.uUc.lPM;
        localObject2 = this.qmt.uUb.mmR;
        paramMenuItem = av.Jq(paramMenuItem);
      }
      break;
    }
    for (;;)
    {
      if (bg.nm(paramMenuItem))
      {
        w.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "favorite url fail, url is null");
        GMTrace.o(8645366513664L, 64413);
        return;
      }
      localObject2 = new cf();
      localObject4 = com.tencent.mm.plugin.sns.storage.h.Is(this.qms);
      if (localObject4 != null)
      {
        localObject5 = com.tencent.mm.y.u.gy(((com.tencent.mm.plugin.sns.storage.m)localObject4).field_snsId);
        localObject6 = com.tencent.mm.y.u.Av().p((String)localObject5, true);
        ((u.b)localObject6).o("prePublishId", "sns_" + i.dt(((com.tencent.mm.plugin.sns.storage.m)localObject4).field_snsId));
        ((u.b)localObject6).o("preUsername", ((com.tencent.mm.plugin.sns.storage.m)localObject4).field_userName);
        ((u.b)localObject6).o("preChatName", "");
        ((u.b)localObject6).o("url", paramMenuItem);
        ((u.b)localObject6).o("preMsgIndex", Integer.valueOf(0));
        ((u.b)localObject6).o("sendAppMsgScene", Integer.valueOf(1));
        ((u.b)localObject6).o("adExtStr", ((com.tencent.mm.plugin.sns.storage.m)localObject4).blD().pTh);
        ((cf)localObject2).eDv.eDA = ((String)localObject5);
      }
      if ((localObject3 != null) && ((this.qmt.uUc.ueV == 18) || (((com.tencent.mm.plugin.sns.storage.m)localObject3).uX(32))))
      {
        j.a(j.d.pox, j.c.poq, j.e.poC, 0, (com.tencent.mm.plugin.sns.storage.m)localObject3);
        if ((this.qmt == null) || (this.qmt.uUc.ueV != 15) || (this.qmt.uUj == 1)) {
          break label5165;
        }
        if (this.scene != 0) {
          break label5160;
        }
      }
      label5160:
      for (paramInt = 1;; paramInt = 2)
      {
        localObject4 = new com.tencent.mm.plugin.sns.a.b.c(((com.tencent.mm.plugin.sns.storage.m)localObject3).bmh(), 11, paramInt, "", 5, ((com.tencent.mm.plugin.sns.storage.m)localObject3).blE());
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a((k)localObject4, 0);
        if (bg.nm(this.qmt.pRQ)) {
          break;
        }
        Jr(((com.tencent.mm.plugin.sns.storage.m)localObject3).blY());
        GMTrace.o(8645366513664L, 64413);
        return;
      }
      label5165:
      if (this.scene == 0) {}
      for (paramInt = 1;; paramInt = 2)
      {
        localObject4 = new com.tencent.mm.plugin.sns.a.b.c(((com.tencent.mm.plugin.sns.storage.m)localObject3).bmh(), 11, paramInt, "", ((com.tencent.mm.plugin.sns.storage.m)localObject3).bmm(), ((com.tencent.mm.plugin.sns.storage.m)localObject3).blE());
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a((k)localObject4, 0);
        break;
      }
      com.tencent.mm.plugin.sns.i.a.a((cf)localObject2, paramMenuItem, this.qms);
      ((cf)localObject2).eDv.activity = this.activity;
      ((cf)localObject2).eDv.eDC = 28;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
      if (((cf)localObject2).eDw.ret == 0)
      {
        l = bg.Pu();
        if (!bg.nm(paramMenuItem))
        {
          w.d("MicroMsg.TimeLineMMMenuItemSelectedListener", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13378), paramMenuItem, Long.valueOf(l), Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(1) });
          localObject2 = "";
        }
      }
      try
      {
        paramMenuItem = URLEncoder.encode(paramMenuItem, "UTF-8");
        com.tencent.mm.plugin.report.service.g.ork.i(13378, new Object[] { paramMenuItem, Long.valueOf(l), Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(1) });
        GMTrace.o(8645366513664L, 64413);
        return;
      }
      catch (UnsupportedEncodingException paramMenuItem)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.TimeLineMMMenuItemSelectedListener", paramMenuItem, "", new Object[0]);
          paramMenuItem = (MenuItem)localObject2;
        }
      }
      ao.p(ae.bjd().Is(this.qms));
      GMTrace.o(8645366513664L, 64413);
      return;
      if (!(this.qmr.getTag() instanceof com.tencent.mm.plugin.sns.ui.m)) {
        break;
      }
      ao.b((com.tencent.mm.plugin.sns.ui.m)this.qmr.getTag());
      GMTrace.o(8645366513664L, 64413);
      return;
      localObject2 = com.tencent.mm.plugin.sns.storage.h.Is(this.qms);
      if (localObject2 == null)
      {
        w.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "edit photo fail, info is null");
        GMTrace.o(8645366513664L, 64413);
        return;
      }
      localObject6 = (ap)this.qmr.getTag();
      localObject3 = this.activity;
      localObject4 = paramMenuItem.getIntent();
      paramMenuItem = this.pPx;
      if (localObject4 == null)
      {
        w.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] intent is null!");
        GMTrace.o(8645366513664L, 64413);
        return;
      }
      if (paramMenuItem == null)
      {
        w.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] snsContext is null!");
        GMTrace.o(8645366513664L, 64413);
        return;
      }
      if (localObject2 == null)
      {
        w.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] info is null!");
        GMTrace.o(8645366513664L, 64413);
        return;
      }
      com.tencent.mm.kernel.h.xz();
      if (!com.tencent.mm.kernel.h.xy().isSDCardAvailable())
      {
        w.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] is not SDCardAvailable");
        GMTrace.o(8645366513664L, 64413);
        return;
      }
      localObject5 = ((ap)localObject6).eHy;
      paramInt = ((ap)localObject6).index;
      i = ((ap)localObject6).position;
      localObject6 = ((com.tencent.mm.plugin.sns.storage.m)localObject2).blD();
      if ((((biz)localObject6).uUc == null) || (((biz)localObject6).uUc.ueW.size() == 0))
      {
        w.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] is ContentObj null");
        GMTrace.o(8645366513664L, 64413);
        return;
      }
      paramMenuItem.biI().v((com.tencent.mm.plugin.sns.storage.m)localObject2);
      localObject6 = ((com.tencent.mm.plugin.sns.storage.m)localObject2).blD();
      if (paramInt < ((biz)localObject6).uUc.ueW.size()) {}
      for (paramMenuItem = (anu)((biz)localObject6).uUc.ueW.get(paramInt); !ae.bja().A(paramMenuItem); paramMenuItem = new anu())
      {
        w.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] media[%s] is illegal", new Object[] { Integer.valueOf(paramMenuItem.ppo) });
        GMTrace.o(8645366513664L, 64413);
        return;
      }
      localObject7 = com.tencent.mm.modelsns.b.ha(716);
      ((com.tencent.mm.modelsns.b)localObject7).lu(i.g((com.tencent.mm.plugin.sns.storage.m)localObject2)).hd(((com.tencent.mm.plugin.sns.storage.m)localObject2).field_type).bC(((com.tencent.mm.plugin.sns.storage.m)localObject2).uX(32)).lu(((com.tencent.mm.plugin.sns.storage.m)localObject2).bmi()).lu(paramMenuItem.mmR).hd(paramInt).hd(((biz)localObject6).uUc.ueW.size());
      ((com.tencent.mm.modelsns.b)localObject7).LR();
      paramMenuItem = com.tencent.mm.modelsns.b.ha(744);
      paramMenuItem.lu(i.g((com.tencent.mm.plugin.sns.storage.m)localObject2)).hd(((com.tencent.mm.plugin.sns.storage.m)localObject2).field_type).bC(((com.tencent.mm.plugin.sns.storage.m)localObject2).uX(32)).lu(((com.tencent.mm.plugin.sns.storage.m)localObject2).bmi());
      paramMenuItem.b((Intent)localObject4, "intent_key_StatisticsOplog");
      ((Intent)localObject4).putExtra("sns_soon_enter_photoedit_ui", true);
      ((Intent)localObject4).putExtra("sns_gallery_localId", (String)localObject5);
      ((Intent)localObject4).putExtra("sns_gallery_position", paramInt);
      ((Intent)localObject4).putExtra("sns_position", i);
      ((Intent)localObject4).putExtra("sns_gallery_showtype", 1);
      ((Intent)localObject4).putExtra("K_ad_scene", 1);
      ((Intent)localObject4).putExtra("k_is_from_sns_main_timeline", true);
      ((Intent)localObject4).setClass((Context)localObject3, SnsBrowseUI.class);
      paramMenuItem = new Bundle();
      paramMenuItem.putInt("stat_scene", 3);
      paramMenuItem.putString("stat_msg_id", "sns_" + i.dt(((com.tencent.mm.plugin.sns.storage.m)localObject2).field_snsId));
      paramMenuItem.putString("stat_send_msg_user", ((com.tencent.mm.plugin.sns.storage.m)localObject2).field_userName);
      ((Intent)localObject4).putExtra("_stat_obj", paramMenuItem);
      ((Activity)localObject3).startActivity((Intent)localObject4);
      ((Activity)localObject3).overridePendingTransition(0, 0);
      GMTrace.o(8645366513664L, 64413);
      return;
      if (this.qmt == null)
      {
        w.e("MicroMsg.TimeLineMMMenuItemSelectedListener", "favNotelink,tlobj is null, return");
        GMTrace.o(8645366513664L, 64413);
        return;
      }
      paramMenuItem = new cf();
      com.tencent.mm.plugin.sns.i.a.a(paramMenuItem, this.qms);
      paramMenuItem.eDv.activity = this.activity;
      paramMenuItem.eDv.eDC = 28;
      com.tencent.mm.sdk.b.a.vgX.m(paramMenuItem);
      break;
    }
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8645634949120L, 64415);
    if (paramInt2 == -1)
    {
      if (paramInt1 == 15)
      {
        com.tencent.mm.plugin.sns.storage.m localm = ae.bjd().Is(this.qms);
        Object localObject1 = (anu)this.qmt.uUc.ueW.get(0);
        String str1 = paramIntent.getStringExtra("Select_Conv_User");
        Object localObject2 = paramIntent.getStringExtra("custom_send_text");
        String str2 = am.dE(ae.getAccSnsPath(), ((anu)localObject1).mmR) + i.e((anu)localObject1);
        paramIntent = bg.g(str1.split(",")).iterator();
        while (paramIntent.hasNext())
        {
          str1 = (String)paramIntent.next();
          if (localm.uX(32))
          {
            str3 = am.dE(ae.getAccSnsPath(), ((anu)localObject1).mmR) + i.j((anu)localObject1);
            biz localbiz = localm.blD();
            com.tencent.mm.plugin.sns.storage.b localb = localm.blz();
            bhr localbhr = new bhr();
            localbhr.ulk = ((anu)localObject1).qkw;
            localbhr.gkI = ((anu)localObject1).uCV;
            if (localbiz.uUc.ueV == 15)
            {
              localbhr.gkO = localm.blB().pyc;
              localbhr.gkP = localbiz.mmR;
              localbhr.gkK = localbiz.uTZ;
              if (!bg.nm(((anu)localObject1).uCY)) {
                break label568;
              }
              paramIntent = ((anu)localObject1).uCO;
              label290:
              localbhr.gkN = paramIntent;
              if ((localb != null) && (localb.pCO == 0))
              {
                localbhr.gkM = localb.pCQ;
                localbhr.gkL = localb.pCP;
              }
              paramInt1 = i.Hc(str3);
              w.i("MicroMsg.TimeLineMMMenuItemSelectedListener", "send adsight to %s, videopath %s, thumbpath %s url: %s time: %d, duration: %s", new Object[] { str1, str3, str2, ((anu)localObject1).uCV, Integer.valueOf(((anu)localObject1).qkw), Integer.valueOf(paramInt1) });
              com.tencent.mm.plugin.messenger.a.d.aOe().a(this.activity, str1, str3, str2, 43, paramInt1, localbhr, false, false, localbiz.pTh);
              com.tencent.mm.plugin.messenger.a.d.aOe().cR((String)localObject2, str1);
              if (this.scene != 0) {
                break label577;
              }
              paramInt1 = 1;
              label441:
              paramIntent = new com.tencent.mm.plugin.sns.a.b.c(localm.bmh(), 12, paramInt1, "", 2, localm.blE());
              com.tencent.mm.kernel.h.xz();
              com.tencent.mm.kernel.h.xx().fYr.a(paramIntent, 0);
              boolean bool = s.eb(str1);
              localObject1 = j.d.pow;
              if (!bool) {
                break label582;
              }
              paramIntent = j.c.pot;
              label502:
              localObject2 = j.e.poC;
              if (!bool) {
                break label589;
              }
            }
            label568:
            label577:
            label582:
            label589:
            for (paramInt1 = com.tencent.mm.y.m.fk(str1);; paramInt1 = 0)
            {
              j.a((j.d)localObject1, paramIntent, (j.e)localObject2, paramInt1, localm);
              GMTrace.o(8645634949120L, 64415);
              return;
              localbhr.gkO = localbiz.uUh.gkO;
              localbhr.gkP = localbiz.uUh.gkP;
              break;
              paramIntent = ((anu)localObject1).uCY;
              break label290;
              paramInt1 = 2;
              break label441;
              paramIntent = j.c.por;
              break label502;
            }
          }
          String str3 = am.dE(ae.getAccSnsPath(), ((anu)localObject1).mmR) + i.j((anu)localObject1);
          paramInt1 = i.Hc(str3);
          w.i("MicroMsg.TimeLineMMMenuItemSelectedListener", "send sight to %s, videopath %s, thumbpath %s url: %s time: %d, duration: %s", new Object[] { str1, str3, str2, ((anu)localObject1).uCV, Integer.valueOf(((anu)localObject1).qkw), Integer.valueOf(paramInt1) });
          com.tencent.mm.plugin.messenger.a.d.aOe().a(this.activity, str1, str3, str2, 43, paramInt1, this.qmt.pTh);
          com.tencent.mm.plugin.messenger.a.d.aOe().cR((String)localObject2, str1);
        }
        com.tencent.mm.ui.snackbar.a.e(this.activity, this.activity.getString(i.j.dCJ));
        GMTrace.o(8645634949120L, 64415);
      }
    }
    else if (paramInt1 == 15)
    {
      paramIntent = ae.bjd().Is(this.qms);
      if (paramIntent == null)
      {
        w.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "menuitemselected and snsinfo is null %s", new Object[] { this.qms });
        GMTrace.o(8645634949120L, 64415);
        return;
      }
      if (this.scene != 0) {
        break label867;
      }
    }
    label867:
    for (paramInt1 = 1;; paramInt1 = 2)
    {
      paramIntent = new com.tencent.mm.plugin.sns.a.b.c(paramIntent.bmh(), 13, paramInt1, "", 2, paramIntent.blE());
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a(paramIntent, 0);
      GMTrace.o(8645634949120L, 64415);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */