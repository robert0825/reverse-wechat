package com.tencent.mm.ui.chatting;

import android.app.Activity;
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
import com.tencent.mm.pluginsdk.ui.d.h;
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

final class ai
  extends ah.b
{
  private En_5b8fbb1e.a wvE;
  
  public ai()
  {
    super(59);
    GMTrace.i(2396054880256L, 17852);
    GMTrace.o(2396054880256L, 17852);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2396189097984L, 17853);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null) && ((paramView.getTag() instanceof e)))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csh);
      ((View)localObject).setTag(new e(this.jHw).dj((View)localObject));
    }
    GMTrace.o(2396189097984L, 17853);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2396323315712L, 17854);
    this.wvE = parama1;
    e locale = (e)parama;
    paramString = paramau.field_content;
    if (paramString != null) {}
    for (f.a locala = f.a.C(paramString, paramau.field_reserved);; locala = null)
    {
      sw localsw;
      boolean bool1;
      int i;
      int j;
      label243:
      label276:
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
          break label657;
        }
        paramString = locale.wvA;
        if (paramau.field_isSend != 1) {
          break label651;
        }
        bool1 = true;
        paramString.setBackgroundResource(v.c(locala, bool1));
        locale.wrG.setTypeface(Typeface.defaultFromStyle(1));
        i = parama1.vKB.vKW.getResources().getDimensionPixelSize(R.f.aQN);
        j = parama1.vKB.vKW.getResources().getDimensionPixelSize(R.f.aRB);
        locale.wvA.setPadding(j, 0, i, 0);
        if (paramau.field_isSend != 1) {
          break label768;
        }
        paramString = locala.gjV;
        if (!bg.nm(paramString)) {
          break label778;
        }
        paramString = locala.description;
        locale.wrG.setSingleLine(false);
        locale.wrG.setMaxLines(3);
        locale.wrG.setText(h.c(parama1.vKB.vKW, paramString, locale.wrK));
        locale.wrG.setTextSize(0, locale.wrK);
        if (!bool2) {
          break label796;
        }
        localObject = locale.wrH;
        paramString = parama1.vKB.vKW;
        if (paramau.field_isSend != 1) {
          break label790;
        }
        bool1 = true;
        label349:
        paramString = h.b(paramString, v.b(locala, bool1), locale.wrH.getTextSize());
        label371:
        ((TextView)localObject).setText(paramString);
        paramString = locala.gjY;
        if (!bg.nm(paramString)) {
          break label1083;
        }
        paramString = locala.title;
      }
      label537:
      label651:
      label657:
      label696:
      label758:
      label768:
      label778:
      label790:
      label796:
      label962:
      label1083:
      for (;;)
      {
        localObject = (b)locala.n(b.class);
        locale.wrI.setText(paramString);
        if (!bg.nm(((b)localObject).gip)) {
          n.Jd().a("", locale.wrF);
        }
        for (i = parama1.getResources().getIdentifier(((b)localObject).gip, "drawable", ab.getPackageName());; i = 0)
        {
          w.v("MicroMsg.ChattingItemAppMsgC2CFrom", "c2c loaclResId: %s", new Object[] { Integer.valueOf(i) });
          if (i > 0)
          {
            w.v("MicroMsg.ChattingItemAppMsgC2CFrom", "set c2cIcon from localRes");
            locale.wrF.setImageResource(i);
          }
          if ("1001".equals(locala.gka)) {
            if (paramau.field_isSend == 1)
            {
              bool1 = true;
              j = v.a(locala, bool1);
              if (j <= 0) {
                break label962;
              }
              w.v("MicroMsg.ChattingItemAppMsgC2CFrom", "set c2cIcon from iconRes");
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
            GMTrace.o(2396323315712L, 17854);
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
                break label758;
              }
            }
            for (i = locale.maxSize;; i = locale.wrK)
            {
              locale.wrK = i;
              break;
              bool1 = false;
              break label696;
            }
            paramString = locala.gjU;
            break label243;
            locale.wrG.setSingleLine(true);
            break label276;
            bool1 = false;
            break label349;
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
              break label371;
            }
            paramString = locala.gjX;
            break label371;
            bool1 = false;
            break label537;
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
              w.v("MicroMsg.ChattingItemAppMsgC2CFrom", "set c2cIcon from localResId");
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
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2396457533440L, 17855);
    paramContextMenu.add(((dr)paramView.getTag()).position, 100, 0, this.wvE.getString(R.l.dgd));
    GMTrace.o(2396457533440L, 17855);
    return false;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2396591751168L, 17856);
    switch (paramMenuItem.getItemId())
    {
    default: 
      GMTrace.o(2396591751168L, 17856);
      return false;
    }
    bc.S(paramau.field_msgId);
    GMTrace.o(2396591751168L, 17856);
    return true;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2396725968896L, 17857);
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
        w.i("MicroMsg.ChattingItemAppMsgC2CFrom", "url==null: %s, billNo==null: %s", new Object[] { Boolean.valueOf(bg.nm(paramau)), Boolean.valueOf(bg.nm(paramView.gkj)) });
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
        GMTrace.o(2396725968896L, 17857);
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
        w.i("MicroMsg.ChattingItemAppMsgC2CFrom", "native url not match:" + paramView.gkb + ", go webview:" + paramau);
        if (!bg.nm(paramau))
        {
          paramView = new Intent();
          paramView.putExtra("rawUrl", paramau);
          d.b(parama.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramView);
          continue;
          label364:
          if (!bg.nm(paramView.gkj))
          {
            w.i("MicroMsg.ChattingItemAppMsgC2CFrom", "tofuliu billNo: %s, c2cNewAAType: %s, fromUser: %s", new Object[] { paramView.gkj, Integer.valueOf(paramView.gkk), paramView.eMI });
            paramau = new Intent();
            paramau.putExtra("bill_no", paramView.gkj);
            paramau.putExtra("launcher_user_name", paramView.eMI);
            paramau.putExtra("enter_scene", 1);
            paramau.putExtra("chatroom", parama.cci());
            d.b(parama.vKB.vKW, "aa", ".ui.PaylistAAUI", paramau);
            if (v.e(paramView).tMk == 2) {
              g.ork.i(13721, new Object[] { Integer.valueOf(4), Integer.valueOf(2) });
            } else {
              g.ork.i(13721, new Object[] { Integer.valueOf(4), Integer.valueOf(3) });
            }
          }
          else if (!bg.nm(paramau))
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */