package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.sw;
import com.tencent.mm.g.a.sw.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;
import com.tencent.mm.x.b;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;

final class al
  extends ah.c
{
  private En_5b8fbb1e.a wvE;
  
  public al()
  {
    super(60);
    GMTrace.i(2128693166080L, 15860);
    GMTrace.o(2128693166080L, 15860);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2128827383808L, 15861);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null) && ((paramView.getTag() instanceof e)))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csM);
      ((View)localObject).setTag(new e(this.jHw).dj((View)localObject));
    }
    GMTrace.o(2128827383808L, 15861);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2128961601536L, 15862);
    this.wvE = parama1;
    e locale = (e)parama;
    paramString = paramau.field_content;
    if (paramString != null) {}
    for (f.a locala = f.a.C(paramString, paramau.field_reserved);; locala = null)
    {
      sw localsw;
      boolean bool1;
      int j;
      label239:
      label272:
      Object localObject;
      if (locala != null)
      {
        boolean bool2 = "1001".equals(locala.gka);
        localsw = new sw();
        if ((!bg.nm(locala.gkb)) && (!bool2))
        {
          localsw.eYk.eYm = locala.gkb;
          com.tencent.mm.sdk.b.a.vgX.m(localsw);
        }
        e.I(locale.wvA, locale.wrJ);
        if (!"1001".equals(locala.gka)) {
          break label658;
        }
        paramString = locale.wvA;
        if (paramau.field_isSend != 1) {
          break label652;
        }
        bool1 = true;
        paramString.setBackgroundResource(v.c(locala, bool1));
        locale.wrG.setTypeface(Typeface.defaultFromStyle(1));
        i = com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 13);
        j = parama1.vKB.vKW.getResources().getDimensionPixelSize(R.f.aQw);
        locale.wvA.setPadding(j, 0, i, 0);
        if (paramau.field_isSend != 1) {
          break label769;
        }
        paramString = locala.gjV;
        if (!bg.nm(paramString)) {
          break label779;
        }
        paramString = locala.description;
        locale.wrG.setSingleLine(false);
        locale.wrG.setMaxLines(3);
        locale.wrG.setText(com.tencent.mm.pluginsdk.ui.d.h.c(parama1.vKB.vKW, paramString, locale.wrK));
        locale.wrG.setTextSize(0, locale.wrK);
        if (!bool2) {
          break label797;
        }
        localObject = locale.wrH;
        paramString = parama1.vKB.vKW;
        if (paramau.field_isSend != 1) {
          break label791;
        }
        bool1 = true;
        label345:
        paramString = com.tencent.mm.pluginsdk.ui.d.h.b(paramString, v.b(locala, bool1), locale.wrH.getTextSize());
        label367:
        ((TextView)localObject).setText(paramString);
        localObject = locala.gjY;
        paramString = (String)localObject;
        if (bg.nm((String)localObject)) {
          paramString = locala.title;
        }
        locale.wrI.setText(paramString);
        paramString = (b)locala.n(b.class);
        if (bg.nm(paramString.gip)) {
          break label1078;
        }
        n.Jd().a("", locale.wrF);
      }
      label538:
      label652:
      label658:
      label697:
      label759:
      label769:
      label779:
      label791:
      label797:
      label963:
      label1078:
      for (int i = parama1.getResources().getIdentifier(paramString.gip, "drawable", ab.getPackageName());; i = 0)
      {
        w.v("MicroMsg.ChattingItemAppMsgC2CTo", "c2c localResId: %s", new Object[] { Integer.valueOf(i) });
        if (i > 0)
        {
          w.v("MicroMsg.ChattingItemAppMsgC2CTo", "set c2cIcon from localRes");
          locale.wrF.setImageResource(i);
        }
        if ("1001".equals(locala.gka)) {
          if (paramau.field_isSend == 1)
          {
            bool1 = true;
            j = v.a(locala, bool1);
            if (j <= 0) {
              break label963;
            }
            w.v("MicroMsg.ChattingItemAppMsgC2CTo", "set c2cIcon from iconRes");
            locale.wrF.setImageResource(j);
          }
        }
        for (;;)
        {
          parama.wvA.setOnClickListener(parama1.wvd.wyW);
          parama.wvA.setOnLongClickListener(parama1.wvd.wyY);
          parama.wvA.setOnTouchListener(parama1.wvd.wza);
          parama1 = new dr(paramau, this.wvE.wqK, paramInt, null, 0, (byte)0);
          parama.wvA.setTag(parama1);
          GMTrace.o(2128961601536L, 15862);
          return;
          bool1 = false;
          break;
          paramString = locale.wvA;
          i = localsw.eYl.eYn;
          j = localsw.eYl.eYo;
          if (paramau.field_isSend == 1)
          {
            bool1 = true;
            paramString.setBackgroundResource(v.q(i, j, bool1));
            locale.wrG.setTypeface(Typeface.defaultFromStyle(0));
            if (locale.wrK <= locale.maxSize) {
              break label759;
            }
          }
          for (i = locale.maxSize;; i = locale.wrK)
          {
            locale.wrK = i;
            break;
            bool1 = false;
            break label697;
          }
          paramString = locala.gjU;
          break label239;
          locale.wrG.setSingleLine(true);
          break label272;
          bool1 = false;
          break label345;
          if (!bg.nm(locala.gkb))
          {
            localObject = locale.wrH;
            i = localsw.eYl.eYn;
            j = localsw.eYl.eYo;
            if (paramau.field_isSend == 1) {}
            for (bool1 = true;; bool1 = false)
            {
              paramString = v.a(i, j, bool1, locala);
              break;
            }
          }
          localObject = locale.wrH;
          if (paramau.field_isSend == 1)
          {
            paramString = locala.gjW;
            break label367;
          }
          paramString = locala.gjX;
          break label367;
          bool1 = false;
          break label538;
          j = localsw.eYl.eYn;
          int k = localsw.eYl.eYo;
          if (paramau.field_isSend == 1) {}
          for (bool1 = true;; bool1 = false)
          {
            j = v.r(j, k, bool1);
            break;
          }
          if (i <= 0)
          {
            w.v("MicroMsg.ChattingItemAppMsgC2CTo", "set c2cIcon from iconUrl");
            localObject = locala.gjT;
            paramString = (String)localObject;
            if (bg.nm((String)localObject)) {
              paramString = locala.thumburl;
            }
            locale.wrF.setImageBitmap(null);
            if (!bg.nm(paramString))
            {
              localObject = new c.a();
              at.AR();
              ((c.a)localObject).gKF = com.tencent.mm.y.c.yV();
              ((c.a)localObject).gKC = true;
              ((c.a)localObject).gKY = true;
              localObject = ((c.a)localObject).Jn();
              n.Jd().a(paramString, locale.wrF, (com.tencent.mm.ao.a.a.c)localObject);
            }
          }
        }
      }
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2129095819264L, 15863);
    paramContextMenu.add(((dr)paramView.getTag()).position, 100, 0, this.wvE.getString(R.l.dgd));
    GMTrace.o(2129095819264L, 15863);
    return false;
  }
  
  public final boolean a(final MenuItem paramMenuItem, final En_5b8fbb1e.a parama, final au paramau)
  {
    GMTrace.i(2129230036992L, 15864);
    switch (paramMenuItem.getItemId())
    {
    case 101: 
    case 102: 
    default: 
      GMTrace.o(2129230036992L, 15864);
      return false;
    case 100: 
      bc.S(paramau.field_msgId);
      GMTrace.o(2129230036992L, 15864);
      return true;
    }
    final String str1 = paramau.field_content;
    paramMenuItem = null;
    if (str1 != null) {
      paramMenuItem = f.a.C(str1, paramau.field_reserved);
    }
    if (paramMenuItem != null)
    {
      paramau = paramau.field_talker;
      str1 = paramMenuItem.gjU;
      final String str2 = paramMenuItem.gjV;
      final String str3 = paramMenuItem.gjW;
      final String str4 = paramMenuItem.gjX;
      final String str5 = paramMenuItem.gjS;
      final String str6 = paramMenuItem.gjZ;
      paramMenuItem = paramMenuItem.gka;
      com.tencent.mm.ui.base.h.a(parama.vKB.vKW, parama.getString(R.l.dhb), parama.getString(R.l.cUl), parama.getString(R.l.dhc), parama.getString(R.l.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2246938984448L, 16741);
          paramAnonymousDialogInterface = new Intent();
          paramAnonymousDialogInterface.putExtra("key_scene", 1);
          paramAnonymousDialogInterface.putExtra("key_receiver", paramau);
          paramAnonymousDialogInterface.putExtra("key_receivertitle", str1);
          paramAnonymousDialogInterface.putExtra("key_sendertitle", str2);
          paramAnonymousDialogInterface.putExtra("key_sender_des", str3);
          paramAnonymousDialogInterface.putExtra("key_receiver_des", str4);
          paramAnonymousDialogInterface.putExtra("key_url", str5);
          paramAnonymousDialogInterface.putExtra("key_templateid", str6);
          paramAnonymousDialogInterface.putExtra("key_sceneid", paramMenuItem);
          d.b(parama.bWQ(), "wallet_index", ".ui.WalletSendC2CMsgUI", paramAnonymousDialogInterface);
          GMTrace.o(2246938984448L, 16741);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2216203124736L, 16512);
          GMTrace.o(2216203124736L, 16512);
        }
      });
    }
    GMTrace.o(2129230036992L, 15864);
    return true;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2129364254720L, 15865);
    paramView = paramau.field_content;
    if (paramView != null) {}
    for (paramView = f.a.C(paramView, paramau.field_reserved);; paramView = null)
    {
      if (paramView != null)
      {
        if (!bg.nm(paramView.gjS)) {
          break label185;
        }
        paramau = paramView.url;
        w.i("MicroMsg.ChattingItemAppMsgC2CTo", "url==null: %s, billNo==null: %s", new Object[] { Boolean.valueOf(bg.nm(paramau)), Boolean.valueOf(bg.nm(paramView.gkj)) });
        if (bg.nm(paramView.gkb)) {
          break label364;
        }
        if (!paramView.gkb.startsWith("weixin://openNativeUrl/weixinHB/startreceivebizhbrequest")) {
          break label193;
        }
        paramau = new Intent();
        paramau.putExtra("key_way", 1);
        paramau.putExtra("key_native_url", paramView.gkb);
        paramau.putExtra("key_username", parama.cci());
        paramau.putExtra("key_static_from_scene", 100002);
        d.b(parama.vKB.vKW, "luckymoney", ".ui.LuckyMoneyBusiReceiveUI", paramau);
      }
      for (;;)
      {
        GMTrace.o(2129364254720L, 15865);
        return true;
        label185:
        paramau = paramView.gjS;
        break;
        label193:
        if (paramView.gkb.startsWith("wxpay://c2cbizmessagehandler/hongbao/receivehongbao"))
        {
          paramau = new Intent();
          if (parama.wvi) {}
          for (int i = 0;; i = 1)
          {
            paramau.putExtra("key_way", i);
            paramau.putExtra("key_native_url", paramView.gkb);
            paramau.putExtra("key_username", parama.cci());
            d.b(parama.vKB.vKW, "luckymoney", ".ui.En_fba4b94f", paramau);
            break;
          }
        }
        w.i("MicroMsg.ChattingItemAppMsgC2CTo", "native url not match:" + paramView.gkb + ", go webview:" + paramau);
        if (!bg.nm(paramau))
        {
          paramView = new Intent();
          paramView.putExtra("rawUrl", paramau);
          d.b(parama.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramView);
          continue;
          label364:
          if (!bg.nm(paramView.gkj))
          {
            w.i("MicroMsg.ChattingItemAppMsgC2CTo", "tofuliu billNo: %s, c2cNewAAType: %s, fromUser: %s", new Object[] { paramView.gkj, Integer.valueOf(paramView.gkk), paramView.eMI });
            paramau = new Intent();
            paramau.putExtra("bill_no", paramView.gkj);
            paramau.putExtra("launcher_user_name", paramView.eMI);
            paramau.putExtra("enter_scene", 1);
            paramau.putExtra("chatroom", parama.cci());
            d.b(parama.vKB.vKW, "aa", ".ui.PaylistAAUI", paramau);
            g.ork.i(13721, new Object[] { Integer.valueOf(4), Integer.valueOf(1) });
          }
          else if ((!bg.nm(paramau)) && (!bg.nm(paramau)))
          {
            paramView = new Intent();
            paramView.putExtra("rawUrl", paramau);
            d.b(parama.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramView);
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */