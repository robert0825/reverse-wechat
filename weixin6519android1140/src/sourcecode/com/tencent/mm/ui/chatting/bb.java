package com.tencent.mm.ui.chatting;

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
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.chatting.gallery.ImageGalleryUI;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.s;

final class bb
  extends ah.c
{
  public En_5b8fbb1e.a wvE;
  
  public bb()
  {
    super(21);
    GMTrace.i(2260897628160L, 16845);
    GMTrace.o(2260897628160L, 16845);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2261031845888L, 16846);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null) && ((paramView.getTag() instanceof i)))
    {
      localObject = paramView;
      if (((i)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csP);
      ((View)localObject).setTag(new i(this.jHw).dl((View)localObject));
    }
    GMTrace.o(2261031845888L, 16846);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2261166063616L, 16847);
    final i locali = (i)parama;
    this.wvE = parama1;
    parama1.wCp.aT(paramau);
    parama = null;
    String str = paramau.field_content;
    if (str != null) {
      parama = f.a.C(str, paramau.field_reserved);
    }
    Object localObject;
    label195:
    label208:
    label232:
    int i;
    if (parama != null)
    {
      localObject = g.cB(parama.appId, parama.eVc);
      if ((localObject == null) || (((com.tencent.mm.pluginsdk.model.app.f)localObject).field_appName == null) || (((com.tencent.mm.pluginsdk.model.app.f)localObject).field_appName.trim().length() <= 0))
      {
        paramString = parama.appName;
        if ((parama.appId == null) || (parama.appId.length() <= 0) || (!g.bI(paramString))) {
          break label437;
        }
        locali.ljO.setText(g.a(parama1.vKB.vKW, (com.tencent.mm.pluginsdk.model.app.f)localObject, paramString));
        locali.ljO.setVisibility(0);
        if ((localObject == null) || (!((com.tencent.mm.pluginsdk.model.app.f)localObject).bJs())) {
          break label421;
        }
        a(parama1, locali.ljO, paramau, parama, ((com.tencent.mm.pluginsdk.model.app.f)localObject).field_packageName, paramau.field_msgSvrId);
        a(parama1, locali.ljO, parama.appId);
      }
    }
    else
    {
      switch (parama.type)
      {
      default: 
        locali.wvA.setTag(new dr(paramau, parama1.wqK, paramInt, null, 0, (byte)0));
        locali.wvA.setOnClickListener(parama1.wvd.wyW);
        if (this.tIv)
        {
          locali.wvA.setOnLongClickListener(parama1.wvd.wyY);
          locali.wvA.setOnTouchListener(parama1.wvd.wza);
        }
        i = l.Oz(str);
        if ((i == -1) || (i >= 100) || (parama.giv <= 0) || (paramau.field_status == 5))
        {
          locali.lhL.setVisibility(8);
          locali.lCw.setAlpha(255);
          locali.lCw.setBackgroundDrawable(null);
        }
        break;
      }
    }
    for (;;)
    {
      a(paramInt, locali, paramau, parama1.wvd.gtf, parama1.wqK, parama1.wvd.wyW);
      GMTrace.o(2261166063616L, 16847);
      return;
      paramString = ((com.tencent.mm.pluginsdk.model.app.f)localObject).field_appName;
      break;
      label421:
      a(parama1, locali.ljO, parama.appId);
      break label195;
      label437:
      locali.ljO.setVisibility(8);
      break label208;
      locali.lCw.setVisibility(0);
      com.tencent.mm.pluginsdk.model.app.b localb = an.afP().Op(parama.eAE);
      localObject = paramau.field_imgPath;
      paramString = Boolean.valueOf(false);
      if (localb != null)
      {
        localObject = localb.field_fileFullPath;
        paramString = Boolean.valueOf(true);
      }
      if (n.IZ().a(locali.lCw, (String)localObject, paramString.booleanValue(), com.tencent.mm.br.a.getDensity(parama1.vKB.vKW), parama.giI, parama.giH, true, R.g.aVk, locali.lCC, R.g.aVl, 0, true, null)) {
        break label232;
      }
      if (this.tIv) {
        locali.lCw.setImageResource(R.k.cLe);
      }
      for (;;)
      {
        locali.lCw.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(2144799293440L, 15980);
            locali.lCw.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(locali.lCw.getWidth(), locali.lCw.getHeight());
            locali.lCC.setLayoutParams(localLayoutParams);
            GMTrace.o(2144799293440L, 15980);
          }
        });
        break;
        locali.lCw.setImageBitmap(BitmapFactory.decodeResource(parama1.getResources(), R.g.aYy));
      }
      locali.lhL.setVisibility(0);
      locali.wsa.setText(i + "%");
      locali.lCw.setAlpha(64);
      locali.lCw.setBackgroundResource(R.g.aZS);
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2261300281344L, 16848);
    if (paramView == null)
    {
      w.e("MicroMsg.ChattingItemAppMsgToImg", "[onCreateContextMenu] v is null");
      GMTrace.o(2261300281344L, 16848);
      return false;
    }
    Object localObject = (dr)paramView.getTag();
    if (localObject == null)
    {
      w.e("MicroMsg.ChattingItemAppMsgToImg", "[onCreateContextMenu] tag is null");
      GMTrace.o(2261300281344L, 16848);
      return false;
    }
    int k = ((dr)localObject).position;
    localObject = paramau.field_content;
    localObject = f.a.eS(this.wvE.cV((String)localObject, paramau.field_isSend));
    if ((localObject != null) && (g.h(g.aP(((f.a)localObject).appId, false)))) {
      paramContextMenu.add(k, 111, 0, this.wvE.getString(R.l.dSi));
    }
    if (d.LL("favorite")) {
      paramContextMenu.add(k, 116, 0, this.wvE.getString(R.l.dNH));
    }
    localObject = new dh();
    ((dh)localObject).eEV.eDr = paramau.field_msgId;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    boolean bool = g.l(this.wvE.vKB.vKW, 2L);
    if ((((dh)localObject).eEW.eEu) || (bool)) {
      paramContextMenu.add(k, 128, 0, paramView.getContext().getString(R.l.dgi));
    }
    if ((d.LL("photoedit")) && (paramau.field_status != 5))
    {
      localObject = paramContextMenu.add(k, 130, 0, paramView.getContext().getString(R.l.dfG));
      int j = 0;
      int i = 0;
      int[] arrayOfInt = new int[2];
      if (paramView != null)
      {
        j = paramView.getWidth();
        i = paramView.getHeight();
        paramView.getLocationInWindow(arrayOfInt);
      }
      Intent localIntent = new Intent();
      localIntent.putExtra("img_gallery_width", j).putExtra("img_gallery_height", i).putExtra("img_gallery_left", arrayOfInt[0]).putExtra("img_gallery_top", arrayOfInt[1]);
      ((MenuItem)localObject).setIntent(localIntent);
    }
    if ((!paramau.bTs()) && (paramau.bTK()) && ((paramau.field_status == 2) || (paramau.fwz == 1)) && (av(paramau)) && (VU(paramau.field_talker))) {
      paramContextMenu.add(k, 123, 0, paramView.getContext().getString(R.l.dgl));
    }
    if (!this.wvE.ceh()) {
      paramContextMenu.add(k, 100, 0, this.wvE.getString(R.l.dgd));
    }
    GMTrace.o(2261300281344L, 16848);
    return true;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    Object localObject2 = null;
    GMTrace.i(2261434499072L, 16849);
    Object localObject1 = paramau.field_content;
    if (localObject1 != null) {}
    for (localObject1 = f.a.eS((String)localObject1);; localObject1 = null)
    {
      switch (paramMenuItem.getItemId())
      {
      default: 
        GMTrace.o(2261434499072L, 16849);
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
        GMTrace.o(2261434499072L, 16849);
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
      localObject1 = new Intent(parama.vKB.vKW, MsgRetransmitUI.class);
      ((Intent)localObject1).putExtra("Retr_Msg_content", paramau.field_content);
      ((Intent)localObject1).putExtra("Retr_File_Name", paramMenuItem);
      ((Intent)localObject1).putExtra("Retr_Msg_Type", 16);
      ((Intent)localObject1).putExtra("Retr_Msg_Id", paramau.field_msgId);
      parama.startActivity((Intent)localObject1);
      GMTrace.o(2261434499072L, 16849);
      return false;
    }
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, final au paramau)
  {
    GMTrace.i(2261568716800L, 16850);
    at.AR();
    if (!com.tencent.mm.y.c.isSDCardAvailable())
    {
      com.tencent.mm.ui.base.u.fo(parama.vKB.vKW);
      GMTrace.o(2261568716800L, 16850);
      return true;
    }
    if (paramView == null)
    {
      GMTrace.o(2261568716800L, 16850);
      return true;
    }
    if ((((dr)paramView.getTag()).jHw == 5) && (paramau.field_isSend == 1))
    {
      if (paramau != null) {
        h.a(this.wvE.vKB.vKW, this.wvE.getString(R.l.dhb), "", this.wvE.getString(R.l.cUn), this.wvE.getString(R.l.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(2394712702976L, 17842);
            l.Z(paramau);
            bc.S(paramau.field_msgId);
            bb.this.wvE.me(true);
            GMTrace.o(2394712702976L, 17842);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(2386659639296L, 17782);
            GMTrace.o(2386659639296L, 17782);
          }
        });
      }
      GMTrace.o(2261568716800L, 16850);
      return true;
    }
    Object localObject1 = null;
    Object localObject2 = paramau.field_content;
    if (localObject2 != null) {
      localObject1 = f.a.eS((String)localObject2);
    }
    if (localObject1 == null)
    {
      w.e("MicroMsg.ChattingItemAppMsgToImg", "content is null");
      GMTrace.o(2261568716800L, 16850);
      return true;
    }
    localObject2 = new int[2];
    paramView.getLocationInWindow((int[])localObject2);
    int i = paramView.getWidth();
    int j = paramView.getHeight();
    paramView = g.aP(((f.a)localObject1).appId, false);
    if ((paramView != null) && (paramView.bJs())) {
      a(parama, (f.a)localObject1, com.tencent.mm.y.q.zE(), paramView, paramau.field_msgSvrId);
    }
    label618:
    PackageInfo localPackageInfo;
    if ((((f.a)localObject1).eAE != null) && (((f.a)localObject1).eAE.length() > 0))
    {
      paramView = an.afP().Op(((f.a)localObject1).eAE);
      if (paramView != null)
      {
        at.AR();
        if (!com.tencent.mm.y.c.isSDCardAvailable()) {
          com.tencent.mm.ui.base.u.fo(parama.vKB.vKW);
        }
        for (;;)
        {
          GMTrace.o(2261568716800L, 16850);
          return true;
          if (paramau.field_isSend == 1)
          {
            paramView = paramView.field_fileFullPath;
            if (!e.aZ(paramView)) {
              break label618;
            }
            if ((paramView != null) && (!paramView.equals("")) && (e.aZ(paramView))) {
              break;
            }
            w.d("MicroMsg.ChattingItemAppMsgToImg", "showImg : imgPath is null");
          }
        }
        long l1 = paramau.field_msgId;
        long l2 = paramau.field_msgSvrId;
        parama = paramau.field_talker;
        paramView = new Intent(this.wvE.vKB.vKW, ImageGalleryUI.class);
        paramView.putExtra("img_gallery_msg_id", l1);
        paramView.putExtra("img_gallery_talker", parama);
        paramView.putExtra("img_gallery_left", localObject2[0]);
        paramView.putExtra("img_gallery_top", localObject2[1]);
        paramView.putExtra("img_gallery_width", i);
        paramView.putExtra("img_gallery_height", j);
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
        w.i("MicroMsg.ChattingItemAppMsgToImg", "onItemClick::bigImgPath: %s, msgId: %d, msgSvrId: %d", new Object[] { paramView, Long.valueOf(paramau.field_msgId), Long.valueOf(paramau.field_msgSvrId) });
        paramView = new Intent();
        paramView.setClassName(parama.vKB.vKW, "com.tencent.mm.ui.chatting.ResourcesExceedUI");
        paramView.putExtra("clean_view_type", 1);
        parama.startActivity(paramView);
        GMTrace.o(2261568716800L, 16850);
        return true;
      }
    }
    else if ((((f.a)localObject1).url != null) && (((f.a)localObject1).url.length() > 0))
    {
      localObject2 = com.tencent.mm.pluginsdk.model.app.p.s(((f.a)localObject1).url, "message");
      localPackageInfo = getPackageInfo(parama.vKB.vKW, ((f.a)localObject1).appId);
      if (localPackageInfo != null) {
        break label805;
      }
      paramView = null;
      if (localPackageInfo != null) {
        break label814;
      }
    }
    label805:
    label814:
    for (i = 0;; i = localPackageInfo.versionCode)
    {
      a(parama, (String)localObject2, (String)localObject2, paramView, i, ((f.a)localObject1).appId, false, paramau.field_msgId, paramau.field_msgSvrId, paramau);
      GMTrace.o(2261568716800L, 16850);
      return false;
      paramView = localPackageInfo.versionName;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */