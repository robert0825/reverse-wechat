package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.sx;
import com.tencent.mm.g.a.sx.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;

final class ax
  extends ah.c
{
  private En_5b8fbb1e.a wvE;
  
  public ax()
  {
    super(54);
    GMTrace.i(2379143446528L, 17726);
    GMTrace.o(2379143446528L, 17726);
  }
  
  private static void a(k paramk)
  {
    GMTrace.i(19178505371648L, 142891);
    int i = paramk.wvA.getPaddingLeft();
    int j = paramk.wvA.getPaddingTop();
    int k = paramk.wvA.getPaddingRight();
    int m = paramk.wvA.getPaddingBottom();
    paramk.wvA.setBackgroundResource(R.g.aUN);
    paramk.wvA.setPadding(i, j, k, m);
    GMTrace.o(19178505371648L, 142891);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2379277664256L, 17727);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null) && ((paramView.getTag() instanceof k)))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csR);
      ((View)localObject).setTag(new k(this.jHw).dn((View)localObject));
    }
    GMTrace.o(2379277664256L, 17727);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2379411881984L, 17728);
    this.wvE = parama1;
    k localk = (k)parama;
    parama = paramau.field_content;
    if (parama != null) {}
    for (parama = f.a.C(parama, paramau.field_reserved);; parama = null)
    {
      boolean bool;
      if (parama != null)
      {
        k.I(localk.wvA, localk.wrJ);
        localk.wvA.setBackgroundResource(R.g.aUM);
        localk.wvA.setPadding(parama1.vKB.vKW.getResources().getDimensionPixelSize(R.f.aQw), 0, com.tencent.mm.br.a.fromDPToPix(parama1.vKB.vKW, 13), 0);
        localk.wsf.setSingleLine(true);
        paramString = new sx();
        paramString.eYp.eRi = parama.gjA;
        com.tencent.mm.sdk.b.a.vgX.m(paramString);
        bool = paramString.eYq.eYr;
        if (paramString.eYq.status == -2) {
          bool = false;
        }
        int j = paramString.eYq.status;
        int i = j;
        if (j <= 0) {
          i = parama.gjx;
        }
        switch (i)
        {
        case 2: 
        default: 
          localk.wse.setImageResource(R.k.cKT);
          localk.wsf.setSingleLine(false);
          localk.wsf.setMaxLines(2);
          localk.wsg.setText(null);
          localk.wsf.setText(parama.description);
        }
      }
      for (;;)
      {
        localk.wvA.setOnClickListener(parama1.wvd.wyW);
        localk.wvA.setOnLongClickListener(parama1.wvd.wyY);
        localk.wvA.setOnTouchListener(parama1.wvd.wza);
        parama = new dr(paramau, this.wvE.wqK, paramInt, null, 0, (byte)0);
        localk.wvA.setTag(parama);
        GMTrace.o(2379411881984L, 17728);
        return;
        at.AR();
        paramString = c.yK().TD(paramau.field_talker);
        if (paramString != null)
        {
          paramString = paramString.vk();
          label406:
          if (!t.nm(parama.gkH)) {
            break label501;
          }
          paramString = parama1.getString(R.l.dfN, new Object[] { t.nl(paramString) });
          localk.wsf.setText(com.tencent.mm.pluginsdk.ui.d.h.b(parama1.vKB.vKW, paramString, localk.wsf.getTextSize()));
        }
        for (;;)
        {
          localk.wsg.setText(parama.gjy);
          localk.wse.setImageResource(R.k.cKT);
          break;
          paramString = paramau.field_talker;
          break label406;
          label501:
          paramString = com.tencent.mm.pluginsdk.ui.d.h.a(parama1.vKB.vKW, parama.gkH);
          localk.wsf.setText(paramString);
        }
        if (bool) {
          if (t.nm(parama.gkH))
          {
            paramString = ab.getContext().getString(R.l.dfI);
            label556:
            localk.wsf.setText(com.tencent.mm.pluginsdk.ui.d.h.a(parama1.vKB.vKW, paramString));
          }
        }
        for (;;)
        {
          localk.wsg.setText(parama.gjy);
          localk.wse.setImageResource(R.k.cKU);
          a(localk);
          break;
          paramString = ab.getContext().getString(R.l.dfI) + "-" + parama.gkH;
          break label556;
          localk.wsf.setText(R.l.dfJ);
        }
        localk.wsg.setText(parama.gjy);
        localk.wse.setImageResource(R.k.cKV);
        if (bool) {
          if (t.nm(parama.gkH))
          {
            parama = ab.getContext().getString(R.l.dfQ);
            label709:
            localk.wsf.setText(com.tencent.mm.pluginsdk.ui.d.h.a(parama1.vKB.vKW, parama));
          }
        }
        for (;;)
        {
          a(localk);
          break;
          parama = ab.getContext().getString(R.l.dfQ) + "-" + parama.gkH;
          break label709;
          localk.wsf.setText(R.l.dfP);
        }
        if (bool) {
          if (t.nm(parama.gkH))
          {
            paramString = ab.getContext().getString(R.l.dfL);
            label815:
            localk.wsf.setText(com.tencent.mm.pluginsdk.ui.d.h.a(parama1.vKB.vKW, paramString));
          }
        }
        for (;;)
        {
          localk.wsg.setText(parama.gjy);
          localk.wse.setImageResource(R.k.cKU);
          a(localk);
          break;
          paramString = ab.getContext().getString(R.l.dfL) + "-" + parama.gkH;
          break label815;
          localk.wsf.setText(R.l.dfM);
        }
        localk.wsf.setText(R.l.dfK);
        localk.wsg.setText(parama.gjy);
        localk.wse.setImageResource(R.k.cKS);
        a(localk);
      }
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2379546099712L, 17729);
    int i = ((dr)paramView.getTag()).position;
    String str = paramau.field_content;
    paramView = null;
    if (str != null) {
      paramView = f.a.C(str, paramau.field_reserved);
    }
    if (paramView != null)
    {
      paramContextMenu.add(i, 100, 0, this.wvE.getString(R.l.dgd));
      if (paramView.gjx == 1) {
        paramContextMenu.add(i, 103, 0, this.wvE.getString(R.l.edA));
      }
    }
    GMTrace.o(2379546099712L, 17729);
    return false;
  }
  
  public final boolean a(final MenuItem paramMenuItem, final En_5b8fbb1e.a parama, final au paramau)
  {
    GMTrace.i(2379680317440L, 17730);
    switch (paramMenuItem.getItemId())
    {
    case 101: 
    case 102: 
    default: 
      GMTrace.o(2379680317440L, 17730);
      return false;
    case 100: 
      bc.S(paramau.field_msgId);
      GMTrace.o(2379680317440L, 17730);
      return true;
    }
    final String str = paramau.field_content;
    paramMenuItem = null;
    if (str != null) {
      paramMenuItem = f.a.C(str, paramau.field_reserved);
    }
    if (paramMenuItem != null)
    {
      str = paramMenuItem.gjz;
      paramau = paramau.field_talker;
      final int i = paramMenuItem.gjB;
      final int j = paramMenuItem.eRQ;
      paramMenuItem = paramMenuItem.eCU;
      com.tencent.mm.ui.base.h.a(parama.vKB.vKW, parama.getString(R.l.edz), parama.getString(R.l.cUl), parama.getString(R.l.edA), parama.getString(R.l.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2220229656576L, 16542);
          paramAnonymousDialogInterface = new Intent();
          paramAnonymousDialogInterface.putExtra("transaction_id", str);
          paramAnonymousDialogInterface.putExtra("receiver_name", paramau);
          paramAnonymousDialogInterface.putExtra("resend_msg_from_flag", 2);
          paramAnonymousDialogInterface.putExtra("invalid_time", i);
          paramAnonymousDialogInterface.putExtra("total_fee", j);
          paramAnonymousDialogInterface.putExtra("fee_type", paramMenuItem);
          if (q.zR())
          {
            d.b(parama.bWQ(), "wallet_payu", ".remittance.ui.PayURemittanceResendMsgUI", paramAnonymousDialogInterface);
            GMTrace.o(2220229656576L, 16542);
            return;
          }
          d.b(parama.bWQ(), "remittance", ".ui.RemittanceResendMsgUI", paramAnonymousDialogInterface);
          GMTrace.o(2220229656576L, 16542);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2207881625600L, 16450);
          GMTrace.o(2207881625600L, 16450);
        }
      });
    }
    GMTrace.o(2379680317440L, 17730);
    return true;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2379814535168L, 17731);
    Object localObject = paramau.field_content;
    paramView = null;
    if (localObject != null) {
      paramView = f.a.C((String)localObject, paramau.field_reserved);
    }
    if (paramView != null)
    {
      localObject = new Intent();
      ((Intent)localObject).putExtra("sender_name", paramau.field_talker);
      switch (paramView.gjx)
      {
      case 2: 
      default: 
        w.w("MicroMsg.ChattingItemAppMsgRemittanceTo", "Unrecognized type %d, probably version to low & check update!", new Object[] { Integer.valueOf(paramView.gjx) });
        t.by(parama.vKB.vKW);
      }
      for (;;)
      {
        GMTrace.o(2379814535168L, 17731);
        return true;
        ((Intent)localObject).putExtra("invalid_time", paramView.gjB);
        ((Intent)localObject).putExtra("is_sender", true);
        ((Intent)localObject).putExtra("appmsg_type", paramView.gjx);
        ((Intent)localObject).putExtra("transfer_id", paramView.gjA);
        ((Intent)localObject).putExtra("transaction_id", paramView.gjz);
        ((Intent)localObject).putExtra("effective_date", paramView.gjC);
        ((Intent)localObject).putExtra("total_fee", paramView.eRQ);
        ((Intent)localObject).putExtra("fee_type", paramView.eCU);
        if (q.zR())
        {
          d.a(parama, "wallet_payu", ".remittance.ui.PayURemittanceDetailUI", (Intent)localObject, 221);
        }
        else
        {
          d.a(parama, "remittance", ".ui.RemittanceDetailUI", (Intent)localObject, 221);
          continue;
          ((Intent)localObject).putExtra("appmsg_type", paramView.gjx);
          ((Intent)localObject).putExtra("transfer_id", paramView.gjA);
          ((Intent)localObject).putExtra("transaction_id", paramView.gjz);
          ((Intent)localObject).putExtra("effective_date", paramView.gjC);
          ((Intent)localObject).putExtra("total_fee", paramView.eRQ);
          ((Intent)localObject).putExtra("fee_type", paramView.eCU);
          if (q.zR()) {
            d.b(parama.vKB.vKW, "wallet_payu", ".remittance.ui.PayURemittanceDetailUI", (Intent)localObject);
          } else {
            d.b(parama.vKB.vKW, "remittance", ".ui.RemittanceDetailUI", (Intent)localObject);
          }
        }
      }
    }
    GMTrace.o(2379814535168L, 17731);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */