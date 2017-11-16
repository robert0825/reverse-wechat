package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.ao.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.dh;
import com.tencent.mm.g.a.dh.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.chatting.b.q;
import com.tencent.mm.ui.chatting.gallery.ImageGalleryUI;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.s;

final class at
  extends ah.b
{
  private En_5b8fbb1e.a wvE;
  private final long wvR;
  
  public at()
  {
    super(20);
    GMTrace.i(2307471179776L, 17192);
    this.wvR = 259200000L;
    GMTrace.o(2307471179776L, 17192);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2307605397504L, 17193);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null) && ((paramView.getTag() instanceof i)))
    {
      localObject = paramView;
      if (((i)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csk);
      ((View)localObject).setTag(new i(this.jHw).dl((View)localObject));
    }
    GMTrace.o(2307605397504L, 17193);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2307739615232L, 17194);
    final i locali = (i)parama;
    this.wvE = parama1;
    parama1.wCp.aT(paramau);
    parama = null;
    String str = paramau.field_content;
    paramString = str;
    if (parama1.wvi)
    {
      int i = paramau.field_content.indexOf(':');
      paramString = str;
      if (i != -1) {
        paramString = paramau.field_content.substring(i + 1);
      }
    }
    if (paramString != null) {
      parama = f.a.C(paramString, paramau.field_reserved);
    }
    com.tencent.mm.pluginsdk.model.app.f localf;
    if (parama != null)
    {
      localf = g.cB(parama.appId, parama.eVc);
      if ((localf != null) && (localf.bJs())) {
        b(parama1, parama, paramau);
      }
      if ((localf != null) && (localf.field_appName != null) && (localf.field_appName.trim().length() > 0)) {
        break label460;
      }
      paramString = parama.appName;
      if ((parama.appId == null) || (parama.appId.length() <= 0) || (!g.bI(paramString))) {
        break label486;
      }
      locali.ljO.setText(g.a(parama1.vKB.vKW, localf, paramString));
      locali.ljO.setVisibility(0);
      if ((localf == null) || (!localf.bJs())) {
        break label470;
      }
      a(parama1, locali.ljO, paramau, parama, localf.field_packageName, paramau.field_msgSvrId);
      label262:
      a(parama1, locali.ljO, parama.appId);
      label275:
      if ((parama.fwt != null) && (parama.fwt.length() != 0)) {
        break label499;
      }
      locali.wsb.setVisibility(8);
      label302:
      switch (parama.type)
      {
      default: 
        label324:
        if (!parama1.wqK) {
          if (g.g(localf))
          {
            locali.wsc.setVisibility(0);
            locali.wsb.setVisibility(8);
            c(parama1, locali.wsc, dr.a(parama, paramau));
          }
        }
        break;
      }
    }
    for (;;)
    {
      locali.wvA.setTag(new dr(paramau, parama1.wqK, paramInt, null, 0, (byte)0));
      locali.wvA.setOnClickListener(parama1.wvd.wyW);
      if (this.tIv)
      {
        locali.wvA.setOnLongClickListener(parama1.wvd.wyY);
        locali.wvA.setOnTouchListener(parama1.wvd.wza);
      }
      GMTrace.o(2307739615232L, 17194);
      return;
      label460:
      paramString = localf.field_appName;
      break;
      label470:
      a(parama1, locali.ljO, parama.appId);
      break label262;
      label486:
      locali.ljO.setVisibility(8);
      break label275;
      label499:
      locali.wsb.setVisibility(0);
      b(parama1, locali.wsb, dr.Wm(parama.fwt));
      break label302;
      locali.lCw.setVisibility(0);
      com.tencent.mm.pluginsdk.model.app.b localb = an.afP().Op(parama.eAE);
      str = paramau.field_imgPath;
      paramString = Boolean.valueOf(false);
      if (localb != null)
      {
        str = localb.field_fileFullPath;
        paramString = Boolean.valueOf(true);
      }
      if (n.IZ().a(locali.lCw, str, paramString.booleanValue(), com.tencent.mm.br.a.getDensity(parama1.vKB.vKW), parama.giG, parama.giF, true, R.g.aVi, locali.lCC, R.g.aVj, 1, true, null)) {
        break label324;
      }
      if (this.tIv) {
        locali.lCw.setImageResource(R.k.cLd);
      }
      for (;;)
      {
        locali.lCw.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(2110976425984L, 15728);
            locali.lCw.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(locali.lCw.getWidth(), locali.lCw.getHeight());
            locali.lCC.setLayoutParams(localLayoutParams);
            GMTrace.o(2110976425984L, 15728);
          }
        });
        break;
        locali.lCw.setImageBitmap(BitmapFactory.decodeResource(parama1.getResources(), R.g.aYy));
      }
      locali.wsc.setVisibility(8);
      continue;
      locali.wsc.setVisibility(8);
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2307873832960L, 17195);
    if ((paramView == null) || (paramau == null))
    {
      GMTrace.o(2307873832960L, 17195);
      return true;
    }
    int k = ((dr)paramView.getTag()).position;
    l.Oz(this.wvE.cV(paramau.field_content, paramau.field_isSend));
    if (g.h(g.aP(f.a.eS(this.wvE.cV(paramau.field_content, paramau.field_isSend)).appId, false))) {
      paramContextMenu.add(k, 111, 0, this.wvE.getString(R.l.dSi));
    }
    if (d.LL("favorite")) {
      paramContextMenu.add(k, 116, 0, this.wvE.getString(R.l.dNH));
    }
    Object localObject = new dh();
    ((dh)localObject).eEV.eDr = paramau.field_msgId;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    boolean bool = g.l(this.wvE.vKB.vKW, 2L);
    if ((((dh)localObject).eEW.eEu) || (bool)) {
      paramContextMenu.add(k, 128, 0, paramView.getContext().getString(R.l.dgi));
    }
    int j;
    int i;
    if ((d.LL("photoedit")) && (paramau.field_status != 5))
    {
      paramau = paramContextMenu.add(k, 130, 0, paramView.getContext().getString(R.l.dfG));
      localObject = new int[2];
      if (paramView == null) {
        break label394;
      }
      j = paramView.getWidth();
      i = paramView.getHeight();
      paramView.getLocationInWindow((int[])localObject);
    }
    for (;;)
    {
      paramView = new Intent();
      paramView.putExtra("img_gallery_width", j).putExtra("img_gallery_height", i).putExtra("img_gallery_left", localObject[0]).putExtra("img_gallery_top", localObject[1]);
      paramau.setIntent(paramView);
      if (!this.wvE.ceh()) {
        paramContextMenu.add(k, 100, 0, this.wvE.getString(R.l.dgd));
      }
      GMTrace.o(2307873832960L, 17195);
      return true;
      label394:
      i = 0;
      j = 0;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, final au paramau)
  {
    Object localObject2 = null;
    GMTrace.i(2308008050688L, 17196);
    Object localObject1 = paramau.field_content;
    if (localObject1 != null) {}
    for (localObject1 = f.a.eS((String)localObject1);; localObject1 = null)
    {
      switch (paramMenuItem.getItemId())
      {
      default: 
        GMTrace.o(2308008050688L, 17196);
        return false;
      case 100: 
        if (localObject1 != null) {
          l.es(paramau.field_msgId);
        }
        bc.S(paramau.field_msgId);
        paramMenuItem = g.aP(((f.a)localObject1).appId, false);
        if ((paramMenuItem != null) && (paramMenuItem.bJs())) {
          a(parama, (f.a)localObject1, paramau, paramMenuItem);
        }
        GMTrace.o(2308008050688L, 17196);
        return false;
      }
      paramMenuItem = (MenuItem)localObject2;
      if (localObject1 != null)
      {
        paramMenuItem = (MenuItem)localObject2;
        if (((f.a)localObject1).eAE != null)
        {
          paramMenuItem = (MenuItem)localObject2;
          if (((f.a)localObject1).eAE.length() > 0)
          {
            localObject1 = an.afP().Op(((f.a)localObject1).eAE);
            paramMenuItem = (MenuItem)localObject2;
            if (localObject1 != null) {
              paramMenuItem = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_fileFullPath;
            }
          }
        }
      }
      if (!paramau.bTO()) {
        if ((System.currentTimeMillis() - paramau.field_createTime <= 259200000L) || ((!bg.nm(paramMenuItem)) && (e.aZ(paramMenuItem)))) {
          break label304;
        }
      }
      label304:
      for (int i = 1; i != 0; i = 0)
      {
        w.i("MicroMsg.ChattingItemAppMsgFromImg", "img is expired or clean!!!");
        h.a(parama.vKB.vKW, parama.vKB.vKW.getString(R.l.dCW), parama.vKB.vKW.getString(R.l.cUG), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(14619397586944L, 108923);
            GMTrace.o(14619397586944L, 108923);
          }
        });
        GMTrace.o(2308008050688L, 17196);
        return false;
      }
      new ae().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14619666022400L, 108925);
          l.a(paramau, null);
          GMTrace.o(14619666022400L, 108925);
        }
      });
      localObject1 = new Intent(parama.vKB.vKW, MsgRetransmitUI.class);
      ((Intent)localObject1).putExtra("Retr_File_Name", paramMenuItem);
      ((Intent)localObject1).putExtra("Retr_Msg_content", parama.cV(paramau.field_content, paramau.field_isSend));
      ((Intent)localObject1).putExtra("Retr_Msg_Type", 16);
      ((Intent)localObject1).putExtra("Retr_Msg_Id", paramau.field_msgId);
      parama.startActivity((Intent)localObject1);
      GMTrace.o(2308008050688L, 17196);
      return false;
    }
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2308142268416L, 17197);
    com.tencent.mm.y.at.AR();
    if (!com.tencent.mm.y.c.isSDCardAvailable())
    {
      com.tencent.mm.ui.base.u.fo(parama.vKB.vKW);
      GMTrace.o(2308142268416L, 17197);
      return true;
    }
    Object localObject1 = null;
    Object localObject2 = parama.cV(paramau.field_content, paramau.field_isSend);
    if (localObject2 != null) {
      localObject1 = f.a.eS((String)localObject2);
    }
    if (localObject1 == null)
    {
      w.e("MicroMsg.ChattingItemAppMsgFromImg", "content is null");
      GMTrace.o(2308142268416L, 17197);
      return true;
    }
    localObject2 = new int[2];
    int j;
    int i;
    if (paramView != null)
    {
      paramView.getLocationInWindow((int[])localObject2);
      j = paramView.getWidth();
      i = paramView.getHeight();
    }
    for (;;)
    {
      paramView = g.aP(((f.a)localObject1).appId, true);
      if ((paramView != null) && (paramView.bJs())) {
        a(parama, (f.a)localObject1, c(parama, paramau), paramView, paramau.field_msgSvrId);
      }
      if ((((f.a)localObject1).eAE != null) && (((f.a)localObject1).eAE.length() > 0))
      {
        paramView = an.afP().Op(((f.a)localObject1).eAE);
        if ((paramView == null) || (!paramView.aDI())) {
          if (paramau.field_isSend == 0)
          {
            l1 = paramau.field_msgId;
            paramView = new Intent();
            paramView.setClassName(this.wvE.vKB.vKW, "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
            paramView.putExtra("app_msg_id", l1);
            this.wvE.startActivity(paramView);
          }
        }
      }
      while ((((f.a)localObject1).url == null) || (((f.a)localObject1).url.length() <= 0))
      {
        for (;;)
        {
          GMTrace.o(2308142268416L, 17197);
          return true;
          paramView = paramView.field_fileFullPath;
          if (!e.aZ(paramView))
          {
            w.i("MicroMsg.ChattingItemAppMsgFromImg", "Img not exist, bigImgPath: %s, msgId: %d, msgSvrId: %d", new Object[] { paramView, Long.valueOf(paramau.field_msgId), Long.valueOf(paramau.field_msgSvrId) });
            paramView = new Intent();
            paramView.setClassName(parama.vKB.vKW, "com.tencent.mm.ui.chatting.ResourcesExceedUI");
            paramView.putExtra("clean_view_type", 1);
            parama.startActivity(paramView);
            GMTrace.o(2308142268416L, 17197);
            return true;
          }
          if ((paramView != null) && (!paramView.equals("")) && (e.aZ(paramView))) {
            break;
          }
          w.d("MicroMsg.ChattingItemAppMsgFromImg", "showImg : imgPath is null");
        }
        long l1 = paramau.field_msgId;
        long l2 = paramau.field_msgSvrId;
        parama = paramau.field_talker;
        paramView = new Intent(this.wvE.vKB.vKW, ImageGalleryUI.class);
        paramView.putExtra("img_gallery_msg_id", l1);
        paramView.putExtra("img_gallery_talker", parama);
        paramView.putExtra("img_gallery_left", localObject2[0]);
        paramView.putExtra("img_gallery_top", localObject2[1]);
        paramView.putExtra("img_gallery_width", j);
        paramView.putExtra("img_gallery_height", i);
        parama = this.wvE.cci();
        paramau = a(this.wvE, paramau);
        localObject1 = new Bundle();
        if (this.wvE.wvi) {
          i = 2;
        }
        for (;;)
        {
          ((Bundle)localObject1).putInt("stat_scene", i);
          ((Bundle)localObject1).putString("stat_msg_id", "msg_" + Long.toString(l2));
          ((Bundle)localObject1).putString("stat_chat_talker_username", parama);
          ((Bundle)localObject1).putString("stat_send_msg_user", paramau);
          paramView.putExtra("_stat_obj", (Bundle)localObject1);
          this.wvE.startActivity(paramView);
          break;
          if (s.fD(parama)) {
            i = 7;
          } else {
            i = 1;
          }
        }
      }
      localObject2 = com.tencent.mm.pluginsdk.model.app.p.s(((f.a)localObject1).url, "message");
      PackageInfo localPackageInfo = getPackageInfo(parama.vKB.vKW, ((f.a)localObject1).appId);
      if (localPackageInfo == null)
      {
        paramView = null;
        label693:
        if (localPackageInfo != null) {
          break label740;
        }
      }
      label740:
      for (i = 0;; i = localPackageInfo.versionCode)
      {
        a(parama, (String)localObject2, (String)localObject2, paramView, i, ((f.a)localObject1).appId, false, paramau.field_msgId, paramau.field_msgSvrId, paramau);
        break;
        paramView = localPackageInfo.versionName;
        break label693;
      }
      i = 0;
      j = 0;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */