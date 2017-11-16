package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.f;
import com.tencent.mm.g.a.cp;
import com.tencent.mm.g.a.it;
import com.tencent.mm.g.a.it.b;
import com.tencent.mm.g.a.om;
import com.tencent.mm.g.a.rb;
import com.tencent.mm.g.a.rb.b;
import com.tencent.mm.g.a.sh;
import com.tencent.mm.g.a.sh.a;
import com.tencent.mm.g.a.si;
import com.tencent.mm.g.a.si.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.y;
import com.tencent.mm.network.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.au.a;
import com.tencent.mm.storage.au.b;
import com.tencent.mm.storage.au.c;
import com.tencent.mm.storage.au.d;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.chatting.b.m;
import com.tencent.mm.ui.chatting.gallery.ImageGalleryUI;
import com.tencent.mm.ui.e.a;
import com.tencent.mm.ui.widget.MMTextView;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import java.util.Map;
import junit.framework.Assert;

public class cw
  implements View.OnClickListener
{
  public static boolean wzL;
  public En_5b8fbb1e.a wvE;
  
  static
  {
    GMTrace.i(2108426289152L, 15709);
    wzL = false;
    GMTrace.o(2108426289152L, 15709);
  }
  
  public cw(En_5b8fbb1e.a parama, String paramString)
  {
    GMTrace.i(2106144587776L, 15692);
    this.wvE = parama;
    parama = new it();
    parama.eMp.eMj = 0;
    parama.eMp.aKB = v.bPK();
    if (com.tencent.mm.y.s.eb(paramString)) {}
    for (parama.eMp.eMr = true;; parama.eMp.eMr = false)
    {
      com.tencent.mm.sdk.b.a.vgX.m(parama);
      GMTrace.o(2106144587776L, 15692);
      return;
    }
  }
  
  public static void Wd(String paramString)
  {
    GMTrace.i(19169915437056L, 142827);
    com.tencent.mm.modelvideo.t.ms(paramString);
    GMTrace.o(19169915437056L, 142827);
  }
  
  private void a(long paramLong1, long paramLong2, String paramString1, String paramString2, int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    GMTrace.i(2107755200512L, 15704);
    Intent localIntent = new Intent(this.wvE.vKB.vKW, ImageGalleryUI.class);
    localIntent.putExtra("img_gallery_msg_id", paramLong1);
    localIntent.putExtra("show_search_chat_content_result", this.wvE.wCy.wuY);
    localIntent.putExtra("img_gallery_msg_svr_id", paramLong2);
    localIntent.putExtra("key_is_biz_chat", this.wvE.txk);
    localIntent.putExtra("key_biz_chat_id", this.wvE.cej());
    localIntent.putExtra("img_gallery_talker", paramString1);
    localIntent.putExtra("img_gallery_chatroom_name", paramString2);
    localIntent.putExtra("img_gallery_left", paramArrayOfInt[0]);
    localIntent.putExtra("img_gallery_top", paramArrayOfInt[1]);
    localIntent.putExtra("img_gallery_width", paramInt1);
    localIntent.putExtra("img_gallery_height", paramInt2);
    localIntent.putExtra("img_gallery_enter_from_chatting_ui", this.wvE.wCy.wIL);
    localIntent.putExtra("img_gallery_enter_from_appbrand_service_chatting_ui", com.tencent.mm.storage.x.eU(paramString1));
    paramString2 = this.wvE.cci();
    paramArrayOfInt = new Bundle();
    if (this.wvE.wvi) {
      paramInt1 = 2;
    }
    for (;;)
    {
      paramArrayOfInt.putInt("stat_scene", paramInt1);
      paramArrayOfInt.putString("stat_msg_id", "msg_" + Long.toString(paramLong2));
      paramArrayOfInt.putString("stat_chat_talker_username", paramString2);
      paramArrayOfInt.putString("stat_send_msg_user", paramString1);
      localIntent.putExtra("_stat_obj", paramArrayOfInt);
      this.wvE.startActivity(localIntent);
      this.wvE.overridePendingTransition(0, 0);
      GMTrace.o(2107755200512L, 15704);
      return;
      if (com.tencent.mm.y.s.fD(paramString2)) {
        paramInt1 = 7;
      } else {
        paramInt1 = 1;
      }
    }
  }
  
  private static void a(View paramView, dr paramdr)
  {
    GMTrace.i(14924742918144L, 111198);
    if ((paramView instanceof MMTextView))
    {
      paramView = (MMTextView)paramView;
      com.tencent.mm.ui.chatting.e.a.a.cgb();
      com.tencent.mm.ui.chatting.e.a.a.a(paramView.getText(), paramdr.eRz);
    }
    GMTrace.o(14924742918144L, 111198);
  }
  
  private void a(dr paramdr)
  {
    GMTrace.i(2106413023232L, 15694);
    at.AR();
    if (!com.tencent.mm.y.c.isSDCardAvailable())
    {
      com.tencent.mm.ui.base.u.fo(this.wvE.vKB.vKW);
      GMTrace.o(2106413023232L, 15694);
      return;
    }
    this.wvE.wvd.wyS.b(paramdr.position, paramdr.eRz);
    GMTrace.o(2106413023232L, 15694);
  }
  
  private void b(dr paramdr)
  {
    GMTrace.i(16304501161984L, 121478);
    at.AR();
    if (!com.tencent.mm.y.c.isSDCardAvailable())
    {
      GMTrace.o(16304501161984L, 121478);
      return;
    }
    Object localObject = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vP(paramdr.eRz.field_imgPath);
    if ((localObject == null) || (((EmojiInfo)localObject).bJs()))
    {
      GMTrace.o(16304501161984L, 121478);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("custom_smiley_preview_md5", paramdr.eRz.field_imgPath);
    localIntent.putExtra("custom_to_talker_name", paramdr.eRz.field_talker);
    if ((((EmojiInfo)localObject).field_catalog != EmojiGroupInfo.vCn) && (((EmojiInfo)localObject).field_catalog != EmojiGroupInfo.vCm) && (((EmojiInfo)localObject).field_catalog != EmojiGroupInfo.vCl)) {
      localIntent.putExtra("custom_smiley_preview_productid", ((EmojiInfo)localObject).field_groupId);
    }
    localIntent.putExtra("msg_id", paramdr.eRz.field_msgSvrId);
    localIntent.putExtra("msg_content", paramdr.eRz.field_content);
    String str = paramdr.eRz.field_talker;
    localObject = str;
    if (com.tencent.mm.y.s.eb(str)) {
      localObject = bc.gP(paramdr.eRz.field_content);
    }
    localIntent.putExtra("msg_sender", (String)localObject);
    com.tencent.mm.bj.d.b(this.wvE.vKB.vKW, "emoji", ".ui.CustomSmileyPreviewUI", localIntent);
    com.tencent.mm.plugin.report.service.g.ork.i(11592, new Object[] { Integer.valueOf(0) });
    GMTrace.o(16304501161984L, 121478);
  }
  
  private void c(final dr paramdr)
  {
    GMTrace.i(14924877135872L, 111199);
    if (com.tencent.mm.p.a.aP(this.wvE.vKB.vKW))
    {
      GMTrace.o(14924877135872L, 111199);
      return;
    }
    Object localObject = new sh();
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    if ((!paramdr.eRz.field_talker.equals(((sh)localObject).eXb.eDs)) && ((((sh)localObject).eXb.eXd) || (((sh)localObject).eXb.eXe)))
    {
      if (((sh)localObject).eXb.eXc) {}
      for (int i = R.l.dbN;; i = R.l.dbO)
      {
        Toast.makeText(this.wvE.vKB.vKW, i, 0).show();
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ChattingListClickListener", "voip is running, can't do this");
        GMTrace.o(14924877135872L, 111199);
        return;
      }
    }
    localObject = new rb();
    ((rb)localObject).eVS.eVU = true;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    localObject = ((rb)localObject).eVT.eVW;
    if (!com.tencent.mm.platformtools.t.nm((String)localObject))
    {
      com.tencent.mm.sdk.platformtools.w.v("MicroMsg.ChattingListClickListener", "Talkroom is on: " + (String)localObject);
      com.tencent.mm.ui.base.h.a(this.wvE.vKB.vKW, this.wvE.vKB.vKW.getString(R.l.edN), "", this.wvE.vKB.vKW.getString(R.l.cTM), this.wvE.vKB.vKW.getString(R.l.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2379009228800L, 17725);
          rb localrb = new rb();
          localrb.eVS.eVV = true;
          com.tencent.mm.sdk.b.a.vgX.m(localrb);
          cw.this.d(paramdr);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(2379009228800L, 17725);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2167884742656L, 16152);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(2167884742656L, 16152);
        }
      });
      GMTrace.o(14924877135872L, 111199);
      return;
    }
    d(paramdr);
    GMTrace.o(14924877135872L, 111199);
  }
  
  private void e(dr paramdr)
  {
    int i = 3;
    GMTrace.i(2107620982784L, 15703);
    if (com.tencent.mm.p.a.aP(this.wvE.vKB.vKW))
    {
      GMTrace.o(2107620982784L, 15703);
      return;
    }
    Object localObject = new sh();
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    if ((!paramdr.eRz.field_talker.equals(((sh)localObject).eXb.eDs)) && ((((sh)localObject).eXb.eXd) || (((sh)localObject).eXb.eXe)))
    {
      if (((sh)localObject).eXb.eXc) {}
      for (i = R.l.dbN;; i = R.l.dbO)
      {
        Toast.makeText(this.wvE.vKB.vKW, i, 0).show();
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ChattingListClickListener", "voip is running, can't do this");
        GMTrace.o(2107620982784L, 15703);
        return;
      }
    }
    paramdr.eRz.dB(6);
    at.AR();
    com.tencent.mm.y.c.yM().a(paramdr.eRz.field_msgId, paramdr.eRz);
    this.wvE.cem();
    localObject = new si();
    ((si)localObject).eXf.eHJ = 5;
    ((si)localObject).eXf.eDs = paramdr.eRz.field_talker;
    ((si)localObject).eXf.context = this.wvE.vKB.vKW;
    ((si)localObject).eXf.eXa = 4;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    localObject = com.tencent.mm.plugin.report.service.g.ork;
    if ((paramdr.eRz.fwv == null) || (paramdr.eRz.fwv.length() <= 0)) {
      i = 1;
    }
    ((com.tencent.mm.plugin.report.service.g)localObject).i(11033, new Object[] { Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(i) });
    GMTrace.o(2107620982784L, 15703);
  }
  
  private void f(dr paramdr)
  {
    GMTrace.i(14642751471616L, 109097);
    au localau = paramdr.eRz;
    Object localObject1 = localau.field_content;
    int i;
    if (localau.field_isSend == 0)
    {
      i = 1;
      paramdr = "";
      if (i != 0) {
        paramdr = localau.field_talker;
      }
      if ((!com.tencent.mm.y.s.eb(localau.field_talker)) || (i == 0) || (this.wvE.txk)) {
        break label489;
      }
      i = bc.gO((String)localObject1);
      if (i == -1) {
        break label489;
      }
      paramdr = ((String)localObject1).substring(0, i).trim();
      localObject1 = ((String)localObject1).substring(i + 1).trim();
    }
    label489:
    for (;;)
    {
      at.AR();
      au.b localb = com.tencent.mm.y.c.yM().Co((String)localObject1);
      localObject1 = paramdr;
      if (!com.tencent.mm.platformtools.t.nm(paramdr))
      {
        localObject1 = paramdr;
        if (com.tencent.mm.y.s.eb(paramdr)) {
          localObject1 = "";
        }
      }
      Object localObject2 = new it();
      ((it)localObject2).eMp.eMj = 1;
      ((it)localObject2).eMp.eAH = localau;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
      paramdr = ((it)localObject2).eMq.eMs;
      if (((com.tencent.mm.platformtools.t.nm(((it)localObject2).eMq.eMt)) && (com.tencent.mm.platformtools.t.nm(paramdr))) || ("err_not_started".equals(paramdr)))
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ChattingListClickListener", "location not valid or subcore not started");
        GMTrace.o(14642751471616L, 109097);
        return;
        i = 0;
        break;
      }
      localObject2 = new Intent();
      ((Intent)localObject2).putExtra("kMsgId", localau.field_msgId);
      ((Intent)localObject2).putExtra("map_view_type", 1);
      ((Intent)localObject2).putExtra("kwebmap_slat", localb.mwH);
      ((Intent)localObject2).putExtra("kwebmap_lng", localb.mwI);
      ((Intent)localObject2).putExtra("kwebmap_scale", localb.eMn);
      ((Intent)localObject2).putExtra("kPoiName", localb.mzo);
      ((Intent)localObject2).putExtra("kisUsername", com.tencent.mm.y.r.fs((String)localObject1));
      ((Intent)localObject2).putExtra("Kwebmap_locaion", paramdr);
      at.AR();
      ((Intent)localObject2).putExtra("kimg_path", com.tencent.mm.y.c.yU());
      ((Intent)localObject2).putExtra("map_talker_name", localau.field_talker);
      ((Intent)localObject2).putExtra("view_type_key", 0);
      ((Intent)localObject2).putExtra("kwebmap_from_to", true);
      ((Intent)localObject2).putExtra("kPoi_url", localb.tmu);
      ((Intent)localObject2).putExtra("soso_street_view_url", com.tencent.mm.platformtools.t.aq(localau.field_reserved, ""));
      com.tencent.mm.plugin.report.service.g.ork.i(12809, new Object[] { Integer.valueOf(2), "" });
      com.tencent.mm.bj.d.a(this.wvE, "location", ".ui.RedirectUI", (Intent)localObject2, 2002);
      GMTrace.o(14642751471616L, 109097);
      return;
    }
  }
  
  private void h(final com.tencent.mm.modelvideo.r paramr)
  {
    GMTrace.i(2106949894144L, 15698);
    at.AR();
    if (!com.tencent.mm.y.c.isSDCardAvailable())
    {
      com.tencent.mm.ui.base.u.fo(this.wvE.vKB.vKW);
      GMTrace.o(2106949894144L, 15698);
      return;
    }
    if (paramr.status == 198)
    {
      com.tencent.mm.modelvideo.t.mu(paramr.getFileName());
      GMTrace.o(2106949894144L, 15698);
      return;
    }
    if ((!ab.bv(this.wvE.vKB.vKW)) && (!wzL))
    {
      wzL = true;
      com.tencent.mm.ui.base.h.a(this.wvE.vKB.vKW, R.l.egp, R.l.cUG, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2236335783936L, 16662);
          cw.Wd(paramr.getFileName());
          GMTrace.o(2236335783936L, 16662);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2175400935424L, 16208);
          GMTrace.o(2175400935424L, 16208);
        }
      });
      GMTrace.o(2106949894144L, 15698);
      return;
    }
    com.tencent.mm.modelvideo.t.ms(paramr.getFileName());
    GMTrace.o(2106949894144L, 15698);
  }
  
  public final void a(au paramau, long paramLong1, long paramLong2, String paramString1, String paramString2, int[] paramArrayOfInt, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(16447443042304L, 122543);
    Intent localIntent = new Intent(this.wvE.vKB.vKW, ImageGalleryUI.class);
    localIntent.putExtra("img_gallery_msg_id", paramLong1);
    localIntent.putExtra("img_gallery_msg_svr_id", paramLong2);
    localIntent.putExtra("show_search_chat_content_result", this.wvE.wCy.wuY);
    localIntent.putExtra("key_is_biz_chat", this.wvE.txk);
    localIntent.putExtra("key_biz_chat_id", this.wvE.cej());
    localIntent.putExtra("img_gallery_talker", paramString1);
    localIntent.putExtra("img_gallery_chatroom_name", paramString2);
    localIntent.putExtra("img_gallery_left", paramArrayOfInt[0]);
    localIntent.putExtra("img_gallery_top", paramArrayOfInt[1]);
    localIntent.putExtra("img_gallery_width", paramInt1);
    localIntent.putExtra("img_gallery_height", paramInt2);
    localIntent.putExtra("img_gallery_enter_from_chatting_ui", this.wvE.wCy.wIL);
    localIntent.putExtra("img_gallery_enter_PhotoEditUI", paramBoolean);
    localIntent.putExtra("img_gallery_enter_from_appbrand_service_chatting_ui", com.tencent.mm.storage.x.eU(paramString1));
    paramString2 = this.wvE.cci();
    if (paramau.field_isSend == 1) {
      paramString1 = this.wvE.wvd.gtf;
    }
    paramau = new Bundle();
    if (this.wvE.wvi) {
      paramInt1 = 2;
    }
    for (;;)
    {
      paramau.putInt("stat_scene", paramInt1);
      paramau.putString("stat_msg_id", "msg_" + Long.toString(paramLong2));
      paramau.putString("stat_chat_talker_username", paramString2);
      paramau.putString("stat_send_msg_user", paramString1);
      localIntent.putExtra("_stat_obj", paramau);
      this.wvE.startActivity(localIntent);
      this.wvE.overridePendingTransition(0, 0);
      GMTrace.o(16447443042304L, 122543);
      return;
      if (com.tencent.mm.y.s.fD(paramString2)) {
        paramInt1 = 7;
      } else {
        paramInt1 = 1;
      }
    }
  }
  
  public final void d(dr paramdr)
  {
    int i = 3;
    GMTrace.i(2107486765056L, 15702);
    paramdr.eRz.dB(6);
    at.AR();
    com.tencent.mm.y.c.yM().a(paramdr.eRz.field_msgId, paramdr.eRz);
    this.wvE.cem();
    Object localObject = new si();
    ((si)localObject).eXf.eHJ = 5;
    ((si)localObject).eXf.eDs = paramdr.eRz.field_talker;
    ((si)localObject).eXf.context = this.wvE.vKB.vKW;
    ((si)localObject).eXf.eXa = 2;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    localObject = com.tencent.mm.plugin.report.service.g.ork;
    if ((paramdr.eRz.fwv == null) || (paramdr.eRz.fwv.length() <= 0)) {
      i = 1;
    }
    ((com.tencent.mm.plugin.report.service.g)localObject).i(11033, new Object[] { Integer.valueOf(3), Integer.valueOf(1), Integer.valueOf(i) });
    GMTrace.o(2107486765056L, 15702);
  }
  
  public void onClick(final View paramView)
  {
    GMTrace.i(2106278805504L, 15693);
    Object localObject3 = (dr)paramView.getTag();
    int j = 0;
    int k = 0;
    Object localObject1;
    Object localObject4;
    Object localObject5;
    switch (((dr)localObject3).jHw)
    {
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    default: 
      localObject1 = ((dr)localObject3).eRz;
      if (localObject1 == null)
      {
        GMTrace.o(2106278805504L, 15693);
        return;
      }
      break;
    case 1: 
    case 9: 
      paramView = ((dr)localObject3).userName;
      if ((paramView == null) || (paramView.equals("")))
      {
        GMTrace.o(2106278805504L, 15693);
        return;
      }
      if (this.wvE.tzG)
      {
        localObject1 = this.wvE.vKB.vKW;
        localObject2 = new Intent();
        ((Intent)localObject2).putExtra("Contact_User", paramView);
        ((Intent)localObject2).putExtra("Contact_Encryptusername", true);
        ((Intent)localObject2).putExtra("Contact_IsLBSFriend", true);
        ((Intent)localObject2).putExtra("Contact_IsLbsChattingProfile", true);
        com.tencent.mm.bj.d.b((Context)localObject1, "profile", ".ui.ContactInfoUI", (Intent)localObject2);
        GMTrace.o(2106278805504L, 15693);
        return;
      }
      if (this.wvE.txk)
      {
        paramView = this.wvE.woz.jc(paramView);
        if (paramView != null)
        {
          if ((paramView == null) || (com.tencent.mm.platformtools.t.nm(paramView.field_profileUrl)))
          {
            if (paramView == null) {}
            for (bool = true;; bool = false)
            {
              com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ChattingListClickListener", "onClick userInfo == null:%s", new Object[] { Boolean.valueOf(bool) });
              GMTrace.o(2106278805504L, 15693);
              return;
            }
          }
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ChattingListClickListener", "onClick Url:%s", new Object[] { paramView.field_profileUrl });
          com.tencent.mm.af.x.FM().aa(paramView.field_userId, paramView.field_brandUserName);
          localObject1 = new Intent();
          ((Intent)localObject1).putExtra("rawUrl", paramView.field_profileUrl);
          ((Intent)localObject1).putExtra("useJs", true);
          com.tencent.mm.bj.d.b(this.wvE.bWQ(), "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
        }
        GMTrace.o(2106278805504L, 15693);
        return;
      }
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("Contact_User", paramView);
      if ((((dr)localObject3).jHw == 9) && (!com.tencent.mm.platformtools.t.nm(((dr)localObject3).wFz))) {
        ((Intent)localObject1).putExtra("Contact_BIZ_KF_WORKER_ID", ((dr)localObject3).wFz);
      }
      at.AR();
      localObject2 = com.tencent.mm.y.c.yK().TE(paramView);
      if ((localObject2 != null) && ((int)((com.tencent.mm.l.a)localObject2).fTq > 0) && (com.tencent.mm.l.a.eE(((com.tencent.mm.g.b.af)localObject2).field_type))) {
        com.tencent.mm.ui.contact.e.a((Intent)localObject1, paramView);
      }
      if (com.tencent.mm.y.s.eb(this.wvE.eMY.getUsername()))
      {
        at.AR();
        localObject2 = com.tencent.mm.y.c.yT().gD(this.wvE.eMY.getUsername());
        ((Intent)localObject1).putExtra("Contact_RoomNickname", ((com.tencent.mm.storage.q)localObject2).fs(paramView));
        ((Intent)localObject1).putExtra("Contact_Scene", 14);
        ((Intent)localObject1).putExtra("Contact_ChatRoomId", this.wvE.eMY.getUsername());
        ((Intent)localObject1).putExtra("room_name", this.wvE.eMY.getUsername());
        if (((com.tencent.mm.storage.q)localObject2).field_roomowner == null)
        {
          bool = false;
          ((Intent)localObject1).putExtra("Is_RoomOwner", bool);
        }
      }
      else if (((dr)localObject3).eRz != null)
      {
        switch (((dr)localObject3).eRz.getType())
        {
        }
      }
      for (;;)
      {
        com.tencent.mm.bj.d.b(this.wvE.bcT(), "profile", ".ui.ContactInfoUI", (Intent)localObject1, 213);
        GMTrace.o(2106278805504L, 15693);
        return;
        bool = ((com.tencent.mm.storage.q)localObject2).field_roomowner.equals(com.tencent.mm.y.q.zE());
        break;
        ((Intent)localObject1).putExtra("Contact_Scene", 34);
        ((Intent)localObject1).putExtra("Contact_IsLBSFriend", true);
      }
    case 6: 
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ChattingListClickListener", "edw timestamp, onClick = " + System.currentTimeMillis());
      if (s.a(((dr)localObject3).eYm, this.wvE.bcT(), null, this.wvE.cci()))
      {
        GMTrace.o(2106278805504L, 15693);
        return;
      }
      localObject1 = ((dr)localObject3).userName;
      localObject2 = ((dr)localObject3).wFw;
      if ((localObject1 == null) || (((String)localObject1).equals("")))
      {
        GMTrace.o(2106278805504L, 15693);
        return;
      }
      paramView = new Intent();
      paramView.putExtra("rawUrl", (String)localObject1);
      paramView.putExtra("shortUrl", (String)localObject1);
      paramView.putExtra("webpageTitle", (String)localObject2);
      localObject1 = new Bundle();
      localObject2 = ((dr)localObject3).eRz;
      if (localObject2 != null)
      {
        if (((au)localObject2).bTA())
        {
          localObject4 = bh.q(((au)localObject2).rc(), "msg");
          if (localObject4 != null)
          {
            localObject4 = di.al((Map)localObject4);
            if (!com.tencent.mm.platformtools.t.nm(((di)localObject4).gjw))
            {
              paramView.putExtra("KTemplateId", ((di)localObject4).gjw);
              com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ChattingListClickListener", "report template msg click action, templateId(%s). srcUsername(%s)", new Object[] { ((di)localObject4).gjw, ((dr)localObject3).eTo });
              com.tencent.mm.plugin.report.service.g.ork.i(11608, new Object[] { ((di)localObject4).gjw, ((dr)localObject3).eTo, Integer.valueOf(0) });
            }
          }
        }
        at.AR();
        localObject4 = com.tencent.mm.y.c.yK().TE(((au)localObject2).rb());
        i = k;
        if (localObject4 != null)
        {
          i = k;
          if (((com.tencent.mm.storage.x)localObject4).bSA())
          {
            i = 4;
            com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ChattingListClickListener", "hakon click biz msg %s", new Object[] { ((com.tencent.mm.storage.x)localObject4).getUsername() });
          }
        }
        paramView.putExtra("msg_id", ((au)localObject2).qX());
        paramView.putExtra("KPublisherId", "msg_" + Long.toString(((au)localObject2).qY()));
        paramView.putExtra("pre_username", ((au)localObject2).rb());
        paramView.putExtra("prePublishId", "msg_" + Long.toString(((au)localObject2).qY()));
        paramView.putExtra("preUsername", ah.a((au)localObject2, ((dr)localObject3).wqK, this.wvE.txk));
        paramView.putExtra("preChatName", this.wvE.cci());
        paramView.putExtra("preChatTYPE", com.tencent.mm.y.t.H(ah.a((au)localObject2, ((dr)localObject3).wqK, this.wvE.txk), this.wvE.cci()));
        paramView.putExtra("preMsgIndex", ((dr)localObject3).rFo);
        localObject2 = ((dr)localObject3).wFC;
        j = i;
        if (localObject2 != null)
        {
          paramView.putExtras((Bundle)localObject2);
          j = i;
        }
      }
      ((Bundle)localObject1).putInt("snsWebSource", j);
      paramView.putExtra("jsapiargs", (Bundle)localObject1);
      paramView.putExtra("geta8key_username", this.wvE.cci());
      if (!com.tencent.mm.platformtools.t.nm(((dr)localObject3).eTo))
      {
        paramView.putExtra("srcUsername", ((dr)localObject3).eTo);
        paramView.putExtra("srcDisplayname", ((dr)localObject3).eTp);
        paramView.putExtra("mode", 1);
      }
      paramView.putExtra("message_id", ((dr)localObject3).rFn);
      paramView.putExtra("message_index", ((dr)localObject3).rFo);
      paramView.putExtra("from_scence", 1);
      com.tencent.mm.bj.d.b(this.wvE.bcT(), "webview", ".ui.tools.WebViewUI", paramView);
      if (!com.tencent.mm.platformtools.t.nm(this.wvE.cci()))
      {
        at.AR();
        if (com.tencent.mm.y.c.yK().TE(this.wvE.cci()).fjs == 1)
        {
          at.AR();
          com.tencent.mm.y.c.yP().TS(this.wvE.cci());
        }
      }
      GMTrace.o(2106278805504L, 15693);
      return;
    case 7: 
      paramView = new Intent();
      paramView.putExtra("geta8key_username", this.wvE.cci());
      paramView.putExtra("rawUrl", ((dr)localObject3).fwt);
      com.tencent.mm.bj.d.b(this.wvE.bcT(), "webview", ".ui.tools.WebViewUI", paramView);
      GMTrace.o(2106278805504L, 15693);
      return;
    case 8: 
      if (((dr)localObject3).eRz == null)
      {
        GMTrace.o(2106278805504L, 15693);
        return;
      }
      localObject1 = ((dr)localObject3).eEa;
      paramView = (View)localObject1;
      if (TextUtils.isEmpty((CharSequence)localObject1)) {
        paramView = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vU(((dr)localObject3).fwt);
      }
      if (TextUtils.isEmpty(paramView))
      {
        paramView = new Intent();
        paramView.putExtra("geta8key_username", this.wvE.cci());
        paramView.putExtra("rawUrl", ((dr)localObject3).fwt);
        com.tencent.mm.bj.d.b(this.wvE.bcT(), "webview", ".ui.tools.WebViewUI", paramView);
        GMTrace.o(2106278805504L, 15693);
        return;
      }
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("extra_id", paramView);
      ((Intent)localObject1).putExtra("extra_name", ((dr)localObject3).title);
      if (((dr)localObject3).wFx)
      {
        ((Intent)localObject1).putExtra("download_entrance_scene", 20);
        ((Intent)localObject1).putExtra("preceding_scence", 3);
        ((Intent)localObject1).putExtra("reward_tip", true);
        com.tencent.mm.plugin.report.service.g.ork.i(12953, new Object[] { Integer.valueOf(1), paramView });
      }
      for (;;)
      {
        com.tencent.mm.bj.d.b(this.wvE.bcT(), "emoji", ".ui.EmojiStoreDetailUI", (Intent)localObject1);
        GMTrace.o(2106278805504L, 15693);
        return;
        if (((dr)localObject3).wFy)
        {
          ((Intent)localObject1).putExtra("download_entrance_scene", 25);
          ((Intent)localObject1).putExtra("preceding_scence", 9);
          ((Intent)localObject1).putExtra("reward_tip", true);
        }
        else
        {
          ((Intent)localObject1).putExtra("download_entrance_scene", 22);
          ((Intent)localObject1).putExtra("preceding_scence", 122);
          com.tencent.mm.plugin.report.service.g.ork.i(10993, new Object[] { Integer.valueOf(2), paramView });
        }
      }
    case 10: 
      if (((dr)localObject3).eRz == null)
      {
        GMTrace.o(2106278805504L, 15693);
        return;
      }
      i = ((dr)localObject3).designerUIN;
      paramView = ((dr)localObject3).designerName;
      localObject1 = ((dr)localObject3).designerRediretctUrl;
      if (i != 0)
      {
        localObject2 = new Intent();
        ((Intent)localObject2).putExtra("geta8key_username", this.wvE.cci());
        ((Intent)localObject2).putExtra("rawUrl", ((dr)localObject3).fwt);
        ((Intent)localObject2).putExtra("uin", i);
        ((Intent)localObject2).putExtra("name", paramView);
        ((Intent)localObject2).putExtra("rediret_url", (String)localObject1);
        ((Intent)localObject2).putExtra("extra_scence", 22);
        com.tencent.mm.bj.d.b(this.wvE.bcT(), "emoji", ".ui.v2.EmojiStoreV2DesignerUI", (Intent)localObject2);
      }
      GMTrace.o(2106278805504L, 15693);
      return;
    case 11: 
      com.tencent.mm.ui.base.h.a(this.wvE.bcT(), this.wvE.getString(R.l.dnO), "", this.wvE.getString(R.l.dnQ), this.wvE.getString(R.l.dnN), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(19184008298496L, 142932);
          paramAnonymousDialogInterface = new cp();
          paramAnonymousDialogInterface.eDT.eDU = true;
          com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousDialogInterface);
          GMTrace.o(19184008298496L, 142932);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2301834035200L, 17150);
          paramAnonymousDialogInterface = new cp();
          paramAnonymousDialogInterface.eDT.eDU = false;
          com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousDialogInterface);
          GMTrace.o(2301834035200L, 17150);
        }
      });
      GMTrace.o(2106278805504L, 15693);
      return;
    case 12: 
      if (((dr)localObject3).eRz == null)
      {
        GMTrace.o(2106278805504L, 15693);
        return;
      }
      i = ((dr)localObject3).tid;
      paramView = ((dr)localObject3).gkG;
      localObject1 = ((dr)localObject3).desc;
      localObject2 = ((dr)localObject3).iconUrl;
      localObject4 = ((dr)localObject3).secondUrl;
      if (i != 0)
      {
        localObject5 = new Intent();
        ((Intent)localObject5).putExtra("geta8key_username", this.wvE.cci());
        ((Intent)localObject5).putExtra("rawUrl", ((dr)localObject3).fwt);
        ((Intent)localObject5).putExtra("topic_id", i);
        ((Intent)localObject5).putExtra("topic_name", paramView);
        ((Intent)localObject5).putExtra("topic_desc", (String)localObject1);
        ((Intent)localObject5).putExtra("topic_icon_url", (String)localObject2);
        ((Intent)localObject5).putExtra("topic_ad_url", (String)localObject4);
        ((Intent)localObject5).putExtra("extra_scence", 22);
        com.tencent.mm.bj.d.b(this.wvE.bcT(), "emoji", ".ui.EmojiStoreTopicUI", (Intent)localObject5);
        GMTrace.o(2106278805504L, 15693);
        return;
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ChattingListClickListener", "topic id is zero.");
      GMTrace.o(2106278805504L, 15693);
      return;
    case 13: 
      if (((dr)localObject3).eRz == null)
      {
        GMTrace.o(2106278805504L, 15693);
        return;
      }
      i = ((dr)localObject3).tid;
      paramView = ((dr)localObject3).gkG;
      localObject1 = ((dr)localObject3).desc;
      localObject2 = ((dr)localObject3).iconUrl;
      localObject4 = ((dr)localObject3).secondUrl;
      j = ((dr)localObject3).pageType;
      if (i != 0)
      {
        localObject5 = new Intent();
        ((Intent)localObject5).putExtra("geta8key_username", this.wvE.cci());
        ((Intent)localObject5).putExtra("rawUrl", ((dr)localObject3).fwt);
        ((Intent)localObject5).putExtra("set_id", i);
        ((Intent)localObject5).putExtra("set_title", paramView);
        ((Intent)localObject5).putExtra("set_iconURL", (String)localObject2);
        ((Intent)localObject5).putExtra("set_desc", (String)localObject1);
        ((Intent)localObject5).putExtra("headurl", (String)localObject4);
        ((Intent)localObject5).putExtra("pageType", j);
        com.tencent.mm.bj.d.b(this.wvE.bcT(), "emoji", ".ui.v2.EmojiStoreV2SingleProductUI", (Intent)localObject5);
        GMTrace.o(2106278805504L, 15693);
        return;
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ChattingListClickListener", "topic id is zero.");
      GMTrace.o(2106278805504L, 15693);
      return;
    }
    Object localObject2 = this.wvE.wvd;
    int i = ((au)localObject1).getType();
    if (((au)localObject1).qZ() == 1) {}
    for (boolean bool = true;; bool = false)
    {
      localObject2 = ((cv)localObject2).ac(i, bool);
      if ((localObject2 == null) || (!((ah)localObject2).a(paramView, this.wvE, (au)localObject1))) {
        break;
      }
      if (((au)localObject1).aCp()) {
        com.tencent.mm.modelstat.b.gWv.e((au)localObject1, com.tencent.mm.x.g.g((au)localObject1));
      }
      GMTrace.o(2106278805504L, 15693);
      return;
    }
    if ((((dr)localObject3).jHw == 5) && (((au)localObject1).qZ() == 1))
    {
      paramView = ((dr)localObject3).eRz;
      if ((paramView != null) && (paramView.fwu == 80))
      {
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ChattingListClickListener", "[dealClickStateBtn] %s", new Object[] { paramView.rd() });
        com.tencent.mm.ui.base.h.A(this.wvE.bcT(), this.wvE.bcT().getString(R.l.dzk), this.wvE.bcT().getString(R.l.chx));
        GMTrace.o(2106278805504L, 15693);
        return;
      }
      com.tencent.mm.ui.base.h.a(this.wvE.bcT(), this.wvE.getString(R.l.dhb), "", this.wvE.getString(R.l.cUn), this.wvE.getString(R.l.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          paramAnonymousInt = 1;
          GMTrace.i(2196741554176L, 16367);
          paramView.bTQ();
          at.AR();
          com.tencent.mm.y.c.yM().a(paramView.field_msgId, paramView);
          if (cw.this.wvE.wte.aP(paramView))
          {
            GMTrace.o(2196741554176L, 16367);
            return;
          }
          if (cw.this.wvE.wCt.aP(paramView))
          {
            GMTrace.o(2196741554176L, 16367);
            return;
          }
          if (cw.this.wvE.wCq.aO(paramView))
          {
            GMTrace.o(2196741554176L, 16367);
            return;
          }
          if (paramView.bTF())
          {
            cw.this.wvE.aD(paramView);
            GMTrace.o(2196741554176L, 16367);
            return;
          }
          if (cw.this.wvE.wCx.aP(paramView))
          {
            GMTrace.o(2196741554176L, 16367);
            return;
          }
          paramAnonymousDialogInterface = cw.this.wvE.wCw;
          au localau = paramView;
          if (localau.bTD())
          {
            if (!paramAnonymousDialogInterface.wtd.ccY().field_username.equals("medianote"))
            {
              at.AR();
              com.tencent.mm.y.c.yJ().b(new com.tencent.mm.av.e(localau.field_talker, localau.field_msgSvrId));
            }
            ed.aL(localau);
            paramAnonymousDialogInterface.wtd.me(true);
          }
          while (paramAnonymousInt != 0)
          {
            GMTrace.o(2196741554176L, 16367);
            return;
            paramAnonymousInt = 0;
          }
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ChattingListClickListener", "uknown msg type");
          GMTrace.o(2196741554176L, 16367);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2202512916480L, 16410);
          GMTrace.o(2202512916480L, 16410);
        }
      });
      GMTrace.o(2106278805504L, 15693);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ChattingListClickListener", "CreateTime:" + ((au)localObject1).ra());
    if (((au)localObject1).bTu())
    {
      com.tencent.mm.modelstat.b.gWv.v(((dr)localObject3).eRz);
      if ((y.aR(this.wvE.bcT())) || (com.tencent.mm.as.a.aP(this.wvE.bcT())))
      {
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ChattingListClickListener", "voip is running, not play voice");
        GMTrace.o(2106278805504L, 15693);
        return;
      }
      at.AR();
      if (!com.tencent.mm.y.c.isSDCardAvailable())
      {
        com.tencent.mm.ui.base.u.fo(this.wvE.bcT());
        GMTrace.o(2106278805504L, 15693);
        return;
      }
      if ((localObject3 != null) && (((dr)localObject3).eRz != null))
      {
        paramView = new com.tencent.mm.modelvoice.n(((dr)localObject3).eRz.rc());
        if ((com.tencent.mm.platformtools.t.nm(((dr)localObject3).eRz.rc())) || (paramView.time == 0L))
        {
          Toast.makeText(this.wvE.bcT(), R.l.dfh, 0).show();
          GMTrace.o(2106278805504L, 15693);
          return;
        }
        if ((this.wvE.wvd != null) && (this.wvE.wvd.wyS != null))
        {
          this.wvE.wvd.wyS.a(((dr)localObject3).position, ((dr)localObject3).eRz);
          if (((dr)localObject3).eRz.bTW()) {
            com.tencent.mm.plugin.report.service.g.ork.i(14220, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
          }
        }
      }
      GMTrace.o(2106278805504L, 15693);
      return;
    }
    if (((au)localObject1).getType() == 35) {
      i = 1;
    }
    while (i != 0)
    {
      at.AR();
      paramView = com.tencent.mm.y.c.yM().Cl(((dr)localObject3).eRz.rc());
      if (com.tencent.mm.platformtools.t.nl(paramView.nRW).length() > 0)
      {
        com.tencent.mm.bj.d.b(this.wvE.bcT(), "qqmail", ".ui.ReadMailUI", new Intent().putExtra("msgid", ((dr)localObject3).eRz.qX()));
        GMTrace.o(2106278805504L, 15693);
        return;
        i = 0;
      }
      else
      {
        if (com.tencent.mm.platformtools.t.nl(paramView.bUg()).length() > 0)
        {
          paramView = new Intent("android.intent.action.VIEW", Uri.parse(paramView.bUg()));
          com.tencent.mm.bj.d.b(this.wvE.bcT(), "webview", ".ui.tools.WebViewUI", paramView);
        }
        GMTrace.o(2106278805504L, 15693);
        return;
      }
    }
    if (((au)localObject1).bTC())
    {
      com.tencent.mm.modelstat.b.gWv.v(((dr)localObject3).eRz);
      localObject4 = ((dr)localObject3).eRz;
      com.tencent.mm.modelstat.a.a((au)localObject4, com.tencent.mm.modelstat.a.a.gWs);
      localObject5 = new int[2];
      i = 0;
      j = 0;
      if (paramView != null)
      {
        paramView.getLocationInWindow((int[])localObject5);
        i = paramView.getWidth();
        j = paramView.getHeight();
      }
      if (((au)localObject4).qZ() == 1)
      {
        paramView = com.tencent.mm.ao.n.IZ().aq(((au)localObject4).qX());
        if (paramView.IF() != 0L) {
          break label7495;
        }
      }
      paramView = com.tencent.mm.ao.n.IZ().ap(((au)localObject4).qY());
    }
    label3964:
    label4435:
    label4438:
    label4650:
    label4902:
    label4908:
    label6114:
    label6133:
    label6153:
    label7485:
    label7495:
    for (;;)
    {
      localObject1 = bh.q(((au)localObject4).rc(), "msg");
      if (localObject1 != null) {
        Long.valueOf(com.tencent.mm.platformtools.t.aq((String)((Map)localObject1).get(".msg.img.$hdlength"), "0")).longValue();
      }
      at.AR();
      if (!com.tencent.mm.y.c.isSDCardAvailable())
      {
        com.tencent.mm.ui.base.u.fo(this.wvE.bcT());
        GMTrace.o(2106278805504L, 15693);
        return;
      }
      if (((au)localObject4).qZ() == 1)
      {
        localObject1 = com.tencent.mm.ao.e.c(paramView);
        if (com.tencent.mm.a.e.aZ(com.tencent.mm.ao.n.IZ().l((String)localObject1, "", "")))
        {
          a((au)localObject4, paramView.IE(), paramView.qY(), ((dr)localObject3).userName, ((dr)localObject3).chatroomName, (int[])localObject5, i, j, false);
          GMTrace.o(2106278805504L, 15693);
          return;
        }
        localObject1 = paramView.IG();
        if (com.tencent.mm.a.e.aZ(com.tencent.mm.ao.n.IZ().l((String)localObject1, "", "")))
        {
          a((au)localObject4, paramView.IE(), paramView.qY(), ((dr)localObject3).userName, ((dr)localObject3).chatroomName, (int[])localObject5, i, j, false);
          GMTrace.o(2106278805504L, 15693);
          return;
        }
        a(((au)localObject4).qX(), ((au)localObject4).qY(), ((dr)localObject3).userName, ((dr)localObject3).chatroomName, (int[])localObject5, i, j);
        GMTrace.o(2106278805504L, 15693);
        return;
      }
      if (paramView.IH())
      {
        localObject2 = paramView.IG();
        localObject1 = localObject2;
        if (paramView.II())
        {
          com.tencent.mm.ao.d locald = com.tencent.mm.ao.e.a(paramView);
          localObject1 = localObject2;
          if (locald != null)
          {
            localObject1 = localObject2;
            if (locald.IF() > 0L)
            {
              localObject1 = localObject2;
              if (locald.IH())
              {
                localObject1 = localObject2;
                if (com.tencent.mm.a.e.aZ(com.tencent.mm.ao.n.IZ().l(locald.IG(), "", ""))) {
                  localObject1 = locald.IG();
                }
              }
            }
          }
        }
        com.tencent.mm.ao.n.IZ().l((String)localObject1, "", "");
        a((au)localObject4, paramView.IE(), paramView.qY(), ((dr)localObject3).userName, ((dr)localObject3).chatroomName, (int[])localObject5, i, j, false);
        GMTrace.o(2106278805504L, 15693);
        return;
      }
      if (paramView.status == -1)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ChattingListClickListener", "retry downloadImg, %d", new Object[] { Long.valueOf(paramView.IF()) });
        paramView.dB(0);
        paramView.eQl = 256;
        com.tencent.mm.ao.n.IZ().a(Long.valueOf(paramView.IF()), paramView);
      }
      a(((au)localObject4).qX(), ((au)localObject4).qY(), ((dr)localObject3).userName, ((dr)localObject3).chatroomName, (int[])localObject5, i, j);
      GMTrace.o(2106278805504L, 15693);
      return;
      if (((au)localObject1).bTD())
      {
        localObject2 = ((dr)localObject3).userName;
        paramView = ((au)localObject1).rc();
        bool = ((dr)localObject3).wqK;
        if (((au)localObject1).qZ() == 0)
        {
          i = 1;
          if ((!bool) || (i == 0)) {
            break label4435;
          }
          paramView = bc.gQ(paramView);
          at.AR();
          paramView = com.tencent.mm.y.c.yM().Cn(paramView);
          if (paramView == null) {
            break label7485;
          }
          localObject1 = new Intent();
          ((Intent)localObject1).putExtra("Contact_User", paramView.bUa());
          ((Intent)localObject1).putExtra("Contact_Alias", paramView.fsF);
          ((Intent)localObject1).putExtra("Contact_Nick", paramView.eCQ);
          ((Intent)localObject1).putExtra("Contact_QuanPin", paramView.gDZ);
          ((Intent)localObject1).putExtra("Contact_PyInitial", paramView.gDY);
          ((Intent)localObject1).putExtra("Contact_Uin", paramView.bUc());
          ((Intent)localObject1).putExtra("Contact_Mobile_MD5", paramView.bUb());
          ((Intent)localObject1).putExtra("Contact_full_Mobile_MD5", paramView.bUe());
          ((Intent)localObject1).putExtra("Contact_QQNick", paramView.bUd());
          ((Intent)localObject1).putExtra("User_From_Fmessage", false);
          ((Intent)localObject1).putExtra("Contact_Scene", paramView.aGs());
          ((Intent)localObject1).putExtra("Contact_FMessageCard", true);
          ((Intent)localObject1).putExtra("Contact_RemarkName", paramView.gEd);
          ((Intent)localObject1).putExtra("Contact_VUser_Info_Flag", paramView.bUf());
          ((Intent)localObject1).putExtra("Contact_VUser_Info", paramView.fjp);
          ((Intent)localObject1).putExtra("Contact_BrandIconURL", paramView.nLE);
          ((Intent)localObject1).putExtra("Contact_Province", paramView.getProvince());
          ((Intent)localObject1).putExtra("Contact_City", paramView.getCity());
          ((Intent)localObject1).putExtra("Contact_Sex", paramView.fja);
          ((Intent)localObject1).putExtra("Contact_Signature", paramView.signature);
          ((Intent)localObject1).putExtra("Contact_ShowUserName", true);
          ((Intent)localObject1).putExtra("Contact_KSnsIFlag", 0);
          ((Intent)localObject1).putExtra("Contact_Source_FMessage", 17);
          ((Intent)localObject1).putExtra("source_from_user_name", (String)localObject2);
          ((Intent)localObject1).putExtra("source_from_nick_name", com.tencent.mm.y.r.fr((String)localObject2));
          ((Intent)localObject1).putExtra(e.a.vGE, paramView.vBw);
          if ((paramView.bUf() & 0x8) > 0)
          {
            if (!com.tencent.mm.platformtools.t.nm((String)localObject2))
            {
              at.AR();
              if (com.tencent.mm.y.c.yK().TE((String)localObject2).bSA()) {
                break label4438;
              }
            }
            ((Intent)localObject1).putExtra("Contact_Scene", 17);
            com.tencent.mm.plugin.report.service.g.ork.A(10298, paramView.bUa() + ",17");
          }
        }
        for (;;)
        {
          com.tencent.mm.bj.d.b(this.wvE.bcT(), "profile", ".ui.ContactInfoUI", (Intent)localObject1);
          com.tencent.mm.bk.a.zK(paramView.aGs());
          GMTrace.o(2106278805504L, 15693);
          return;
          i = 0;
          break;
          break label3964;
          ((Intent)localObject1).putExtra("Contact_Scene", 41);
          com.tencent.mm.plugin.report.service.g.ork.A(10298, paramView.bUa() + ",41");
        }
      }
      else
      {
        if (((au)localObject1).getType() == 37)
        {
          paramView = ((au)localObject1).rc();
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ChattingListClickListener", "dealClickVerifyMsgEvent : " + paramView);
          if ((paramView == null) || (paramView.length() <= 0))
          {
            GMTrace.o(2106278805504L, 15693);
            return;
          }
          at.AR();
          localObject2 = com.tencent.mm.y.c.yM().Cm(paramView);
          if (localObject2 != null)
          {
            if (((au.d)localObject2).bUa().length() <= 0) {
              break label4902;
            }
            bool = true;
            Assert.assertTrue(bool);
            at.AR();
            paramView = com.tencent.mm.y.c.yK().TE(((au.d)localObject2).bUa());
            localObject3 = new Intent();
            if ((paramView == null) || (paramView.vi() <= 0) || (!paramView.uW())) {
              break label4908;
            }
            ((Intent)localObject3).putExtra("Contact_User", paramView.getUsername());
            com.tencent.mm.ui.contact.e.a((Intent)localObject3, paramView.getUsername());
            localObject1 = ((au.d)localObject2).content;
            paramView = (View)localObject1;
            if (com.tencent.mm.platformtools.t.nl((String)localObject1).length() <= 0) {
              switch (((au.d)localObject2).aGs())
              {
              }
            }
          }
          for (paramView = this.wvE.getString(R.l.dfx);; paramView = this.wvE.getString(R.l.dfB))
          {
            ((Intent)localObject3).putExtra("Contact_Content", paramView);
            ((Intent)localObject3).putExtra("Contact_verify_Scene", ((au.d)localObject2).aGs());
            ((Intent)localObject3).putExtra("Contact_Uin", ((au.d)localObject2).nNL);
            ((Intent)localObject3).putExtra("Contact_QQNick", ((au.d)localObject2).gEa);
            ((Intent)localObject3).putExtra("Contact_Mobile_MD5", ((au.d)localObject2).bUb());
            ((Intent)localObject3).putExtra("User_From_Fmessage", true);
            ((Intent)localObject3).putExtra("Contact_from_msgType", 37);
            ((Intent)localObject3).putExtra("Contact_KSnsIFlag", ((au.d)localObject2).bUh());
            ((Intent)localObject3).putExtra("Contact_KSnsBgUrl", ((au.d)localObject2).bUi());
            com.tencent.mm.bj.d.b(this.wvE.bcT(), "profile", ".ui.ContactInfoUI", (Intent)localObject3);
            com.tencent.mm.bk.a.zK(((au.d)localObject2).aGs());
            GMTrace.o(2106278805504L, 15693);
            return;
            bool = false;
            break;
            ((Intent)localObject3).putExtra("Verify_ticket", ((au.d)localObject2).nLA);
            ((Intent)localObject3).putExtra("User_Verify", true);
            ((Intent)localObject3).putExtra("Contact_User", ((au.d)localObject2).bUa());
            ((Intent)localObject3).putExtra("Contact_Alias", ((au.d)localObject2).fsF);
            ((Intent)localObject3).putExtra("Contact_Nick", ((au.d)localObject2).eCQ);
            ((Intent)localObject3).putExtra("Contact_QuanPin", ((au.d)localObject2).gDZ);
            ((Intent)localObject3).putExtra("Contact_PyInitial", ((au.d)localObject2).gDY);
            ((Intent)localObject3).putExtra("Contact_Sex", ((au.d)localObject2).fja);
            ((Intent)localObject3).putExtra("Contact_Signature", ((au.d)localObject2).signature);
            ((Intent)localObject3).putExtra("Contact_Scene", ((au.d)localObject2).aGs());
            ((Intent)localObject3).putExtra("Contact_FMessageCard", true);
            ((Intent)localObject3).putExtra("Contact_City", ((au.d)localObject2).getCity());
            ((Intent)localObject3).putExtra("Contact_Province", ((au.d)localObject2).getProvince());
            ((Intent)localObject3).putExtra("Contact_Mobile_MD5", ((au.d)localObject2).bUb());
            ((Intent)localObject3).putExtra("Contact_full_Mobile_MD5", ((au.d)localObject2).vBt);
            ((Intent)localObject3).putExtra("Contact_KSnsIFlag", ((au.d)localObject2).bUh());
            ((Intent)localObject3).putExtra("Contact_KSnsBgUrl", ((au.d)localObject2).bUi());
            break label4650;
          }
        }
        if (((au)localObject1).getType() == 40)
        {
          paramView = ((au)localObject1).rc();
          at.AR();
          localObject2 = com.tencent.mm.y.c.yM().Cn(paramView);
          if ((localObject2 != null) && (((au.a)localObject2).bUa().length() > 0))
          {
            com.tencent.mm.bk.a.zK(((au.a)localObject2).aGs());
            at.AR();
            localObject3 = com.tencent.mm.y.c.yK().TE(((au.a)localObject2).bUa());
            if ((localObject3 != null) && (((com.tencent.mm.storage.x)localObject3).vi() > 0) && (((com.tencent.mm.storage.x)localObject3).uW()))
            {
              com.tencent.mm.ui.contact.e.a(this.wvE.bcT(), (com.tencent.mm.storage.x)localObject3, (au.a)localObject2);
              GMTrace.o(2106278805504L, 15693);
              return;
            }
            if ((((au.a)localObject2).bUc() <= 0L) && ((!com.tencent.mm.platformtools.t.nm(((au.a)localObject2).bUb())) || (!com.tencent.mm.platformtools.t.nm(((au.a)localObject2).bUe()))))
            {
              localObject1 = com.tencent.mm.modelfriend.af.If().jK(((au.a)localObject2).bUb());
              if ((localObject1 != null) && (((com.tencent.mm.modelfriend.b)localObject1).GS() != null))
              {
                paramView = (View)localObject1;
                if (((com.tencent.mm.modelfriend.b)localObject1).GS().length() > 0) {}
              }
              else
              {
                localObject1 = com.tencent.mm.modelfriend.af.If().jK(((au.a)localObject2).bUe());
                if ((localObject1 != null) && (((com.tencent.mm.modelfriend.b)localObject1).GS() != null))
                {
                  paramView = (View)localObject1;
                  if (((com.tencent.mm.modelfriend.b)localObject1).GS().length() > 0) {}
                }
                else
                {
                  if ((localObject3 != null) && (((com.tencent.mm.storage.x)localObject3).vi() > 0)) {
                    com.tencent.mm.ui.contact.e.a(this.wvE.bcT(), (com.tencent.mm.storage.x)localObject3, (au.a)localObject2);
                  }
                  for (;;)
                  {
                    com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ChattingListClickListener", "error : this is not the mobile contact, MD5 = " + ((au.a)localObject2).bUb() + " fullMD5:" + ((au.a)localObject2).bUe());
                    GMTrace.o(2106278805504L, 15693);
                    return;
                    com.tencent.mm.ui.contact.e.a(this.wvE.bcT(), (au.a)localObject2);
                  }
                }
              }
              if ((paramView.getUsername() == null) || (paramView.getUsername().length() <= 0))
              {
                paramView.username = ((au.a)localObject2).bUa();
                paramView.fZ(128);
                if (com.tencent.mm.modelfriend.af.If().a(paramView.GS(), paramView) == -1)
                {
                  com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ChattingListClickListener", "update mobile contact username failed");
                  GMTrace.o(2106278805504L, 15693);
                  return;
                }
              }
              com.tencent.mm.ui.contact.e.a(this.wvE.bcT(), (au.a)localObject2);
              GMTrace.o(2106278805504L, 15693);
              return;
            }
            com.tencent.mm.ui.contact.e.a(this.wvE.bcT(), (au.a)localObject2);
          }
          GMTrace.o(2106278805504L, 15693);
          return;
        }
        if ((((au)localObject1).bTG()) || (((au)localObject1).bTH()))
        {
          com.tencent.mm.modelstat.b.gWv.v(((dr)localObject3).eRz);
          com.tencent.mm.modelstat.a.a(((dr)localObject3).eRz, com.tencent.mm.modelstat.a.a.gWs);
          if (2 == ((dr)localObject3).jHw)
          {
            if ((y.aR(this.wvE.bcT())) || (com.tencent.mm.as.a.aP(this.wvE.bcT())))
            {
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ChattingListClickListener", "Voip or multitalk is running, can't do this");
              GMTrace.o(2106278805504L, 15693);
              return;
            }
            localObject1 = ((dr)localObject3).eRz;
            localObject4 = new int[2];
            j = 0;
            i = 0;
            if (paramView != null)
            {
              paramView.getLocationInWindow((int[])localObject4);
              j = paramView.getWidth();
              i = paramView.getHeight();
            }
            long l1 = ((au)localObject1).qX();
            long l2 = ((au)localObject1).qY();
            paramView = ((dr)localObject3).userName;
            localObject5 = ((dr)localObject3).chatroomName;
            localObject2 = new Intent(this.wvE.bcT(), ImageGalleryUI.class);
            ((Intent)localObject2).putExtra("show_search_chat_content_result", this.wvE.wCy.wuY);
            ((Intent)localObject2).putExtra("img_gallery_msg_id", l1);
            ((Intent)localObject2).putExtra("key_is_biz_chat", this.wvE.txk);
            ((Intent)localObject2).putExtra("key_biz_chat_id", this.wvE.cej());
            ((Intent)localObject2).putExtra("img_gallery_msg_svr_id", l2);
            ((Intent)localObject2).putExtra("img_gallery_talker", paramView);
            ((Intent)localObject2).putExtra("img_gallery_chatroom_name", (String)localObject5);
            ((Intent)localObject2).putExtra("img_gallery_left", localObject4[0]);
            ((Intent)localObject2).putExtra("img_gallery_top", localObject4[1]);
            ((Intent)localObject2).putExtra("img_gallery_width", j);
            ((Intent)localObject2).putExtra("img_gallery_height", i);
            ((Intent)localObject2).putExtra("img_gallery_enter_from_chatting_ui", this.wvE.wCy.wIL);
            localObject4 = this.wvE.cci();
            if (((au)localObject1).qZ() == 1)
            {
              paramView = this.wvE.wvd.gtf;
              localObject5 = new Bundle();
              if (!this.wvE.wvi) {
                break label6114;
              }
              i = 2;
            }
            for (;;)
            {
              ((Bundle)localObject5).putInt("stat_scene", i);
              ((Bundle)localObject5).putString("stat_msg_id", "msg_" + Long.toString(l2));
              ((Bundle)localObject5).putString("stat_chat_talker_username", (String)localObject4);
              ((Bundle)localObject5).putString("stat_send_msg_user", paramView);
              ((Intent)localObject2).putExtra("_stat_obj", (Bundle)localObject5);
              this.wvE.startActivity((Intent)localObject2);
              this.wvE.overridePendingTransition(0, 0);
              if ((!((au)localObject1).bTH()) || (((dr)localObject3).userName == null)) {
                break label6153;
              }
              a.a(a.a.wql, (au)localObject1);
              if (!((dr)localObject3).userName.toLowerCase().endsWith("@chatroom")) {
                break label6133;
              }
              com.tencent.mm.plugin.report.service.g.ork.i(11444, new Object[] { Integer.valueOf(2) });
              GMTrace.o(2106278805504L, 15693);
              return;
              break;
              if (com.tencent.mm.y.s.fD((String)localObject4)) {
                i = 7;
              } else {
                i = 1;
              }
            }
            com.tencent.mm.plugin.report.service.g.ork.i(11444, new Object[] { Integer.valueOf(1) });
            GMTrace.o(2106278805504L, 15693);
            return;
          }
          paramView = ((dr)localObject3).eRz;
          if (paramView.qZ() == 0)
          {
            localObject1 = ((dr)localObject3).eRz;
            localObject2 = com.tencent.mm.modelvideo.t.mw(((au)localObject1).rd());
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ChattingListClickListener", "videoReceiverEvent video status:" + ((com.tencent.mm.modelvideo.r)localObject2).getStatus() + " is sender:" + ((au)localObject1).qZ());
            switch (((dr)localObject3).jHw)
            {
            }
          }
          while (paramView.qZ() == 1)
          {
            paramView = ((dr)localObject3).eRz;
            if (paramView == null)
            {
              com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ChattingListClickListener", "videoSendEvent but msg is null ");
              GMTrace.o(2106278805504L, 15693);
              return;
              at.AR();
              if (!com.tencent.mm.y.c.isSDCardAvailable())
              {
                com.tencent.mm.ui.base.u.fo(this.wvE.bcT());
              }
              else
              {
                com.tencent.mm.modelvideo.t.mt(((au)localObject1).rd());
                continue;
                h((com.tencent.mm.modelvideo.r)localObject2);
              }
            }
            else
            {
              localObject1 = o.Nh().mh(paramView.rd());
              if (localObject1 == null)
              {
                com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ChattingListClickListener", "videoSendEvent but video info is null [%s]", new Object[] { paramView.rd() });
                GMTrace.o(2106278805504L, 15693);
                return;
              }
              i = ((com.tencent.mm.modelvideo.r)localObject1).getStatus();
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ChattingListClickListener", " videoSendEvent status : " + i);
              switch (((dr)localObject3).jHw)
              {
              }
            }
          }
          for (;;)
          {
            GMTrace.o(2106278805504L, 15693);
            return;
            at.AR();
            if (!com.tencent.mm.y.c.isSDCardAvailable())
            {
              com.tencent.mm.ui.base.u.fo(this.wvE.bcT());
              GMTrace.o(2106278805504L, 15693);
              return;
            }
            if (i == 112)
            {
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ChattingListClickListener", "this video come from pc weixin, user pause recv now.");
              com.tencent.mm.modelvideo.t.mt(paramView.rd());
              GMTrace.o(2106278805504L, 15693);
              return;
            }
            localObject1 = paramView.rd();
            localObject2 = com.tencent.mm.modelvideo.t.mw((String)localObject1);
            if (localObject2 == null)
            {
              com.tencent.mm.sdk.platformtools.w.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.tC() + " getinfo failed: " + (String)localObject1);
              com.tencent.mm.compatible.util.g.tA();
            }
            for (;;)
            {
              com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ChattingListClickListener", "pause video, publish SendMsgFailEvent");
              localObject1 = new om();
              ((om)localObject1).eTz.eAH = paramView;
              com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
              GMTrace.o(2106278805504L, 15693);
              return;
              if ((((com.tencent.mm.modelvideo.r)localObject2).getStatus() != 104) && (((com.tencent.mm.modelvideo.r)localObject2).getStatus() != 103))
              {
                com.tencent.mm.sdk.platformtools.w.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.tC() + " get status failed: " + (String)localObject1 + " status:" + ((com.tencent.mm.modelvideo.r)localObject2).getStatus());
                com.tencent.mm.compatible.util.g.tA();
              }
              else
              {
                ((com.tencent.mm.modelvideo.r)localObject2).dB(105);
                ((com.tencent.mm.modelvideo.r)localObject2).aA(bg.Pu());
                ((com.tencent.mm.modelvideo.r)localObject2).fZ(1280);
                if (!com.tencent.mm.modelvideo.t.e((com.tencent.mm.modelvideo.r)localObject2))
                {
                  com.tencent.mm.sdk.platformtools.w.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.tC() + " update failed: " + (String)localObject1);
                  com.tencent.mm.compatible.util.g.tA();
                }
              }
            }
            at.AR();
            if (!com.tencent.mm.y.c.isSDCardAvailable())
            {
              com.tencent.mm.ui.base.u.fo(this.wvE.bcT());
              GMTrace.o(2106278805504L, 15693);
              return;
            }
            if (i == 113)
            {
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ChattingListClickListener", "this video come from pc weixin, user restart now.");
              h((com.tencent.mm.modelvideo.r)localObject1);
              GMTrace.o(2106278805504L, 15693);
              return;
            }
            if (((com.tencent.mm.modelvideo.r)localObject1).Nu())
            {
              com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ChattingListClickListener", "this video come from gallery, but it is illegal.");
              paramView = this.wvE.bcT().getString(R.l.egn);
              if (i == 142) {
                paramView = this.wvE.bcT().getString(R.l.egn);
              }
              for (;;)
              {
                com.tencent.mm.ui.base.h.A(this.wvE.bcT(), paramView, this.wvE.bcT().getString(R.l.chx));
                GMTrace.o(2106278805504L, 15693);
                return;
                if (i == 141) {
                  paramView = this.wvE.bcT().getString(R.l.ego);
                } else if (i == 140) {
                  paramView = this.wvE.bcT().getString(R.l.egm);
                }
              }
            }
            paramView.bTQ();
            at.AR();
            com.tencent.mm.y.c.yM().a(paramView.qX(), paramView);
            if (((com.tencent.mm.modelvideo.r)localObject1).getStatus() == 198)
            {
              com.tencent.mm.modelvideo.t.mv(paramView.rd());
              GMTrace.o(2106278805504L, 15693);
              return;
            }
            com.tencent.mm.modelvideo.t.mr(paramView.rd());
          }
        }
        if (((au)localObject1).bTI())
        {
          b((dr)localObject3);
          GMTrace.o(2106278805504L, 15693);
          return;
        }
        if (((au)localObject1).getType() == 48)
        {
          f((dr)localObject3);
          GMTrace.o(2106278805504L, 15693);
          return;
        }
        if (((au)localObject1).bTy())
        {
          paramView = ((au)localObject1).rc();
          localObject2 = new si();
          ((si)localObject2).eXf.eHJ = 1;
          ((si)localObject2).eXf.content = paramView;
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
          if (((si)localObject2).eXg.type == 2) {}
          for (i = 1; (i != 0) || (((au)localObject1).rc().equals(au.vBm)); i = 0)
          {
            c((dr)localObject3);
            GMTrace.o(2106278805504L, 15693);
            return;
          }
          paramView = ((au)localObject1).rc();
          localObject2 = new si();
          ((si)localObject2).eXf.eHJ = 1;
          ((si)localObject2).eXf.content = paramView;
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
          if (((si)localObject2).eXg.type == 3) {}
          for (i = 1; (i != 0) || (((au)localObject1).rc().equals(au.vBl)); i = 0)
          {
            e((dr)localObject3);
            GMTrace.o(2106278805504L, 15693);
            return;
          }
        }
        if (((au)localObject1).bTJ())
        {
          at.AR();
          if (com.tencent.mm.y.c.isSDCardAvailable())
          {
            paramView = ((dr)localObject3).eRz;
            ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().a(this.wvE.bcT(), paramView);
            com.tencent.mm.plugin.report.service.g.ork.i(11592, new Object[] { Integer.valueOf(0) });
          }
          GMTrace.o(2106278805504L, 15693);
          return;
        }
        if (((au)localObject1).bTx())
        {
          if (this.wvE != null)
          {
            com.tencent.mm.plugin.report.service.g.ork.A(10221, "1");
            paramView = new Intent();
            paramView.addFlags(67108864);
            com.tencent.mm.bj.d.b(this.wvE.bcT(), "shake", ".ui.ShakeReportUI", paramView);
          }
          GMTrace.o(2106278805504L, 15693);
          return;
        }
        if (((au)localObject1).bTL())
        {
          a((dr)localObject3);
          GMTrace.o(2106278805504L, 15693);
          return;
        }
        if (((au)localObject1).bTF())
        {
          a(paramView, (dr)localObject3);
          GMTrace.o(2106278805504L, 15693);
          return;
        }
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ChattingListClickListener", "uknown msg type");
      }
      GMTrace.o(2106278805504L, 15693);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\cw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */