package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
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
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.q;

final class aw
  extends ah.b
{
  private En_5b8fbb1e.a wvE;
  
  public aw()
  {
    super(53);
    GMTrace.i(2516716617728L, 18751);
    GMTrace.o(2516716617728L, 18751);
  }
  
  private static void a(k paramk)
  {
    GMTrace.i(19192329797632L, 142994);
    int i = paramk.wvA.getPaddingLeft();
    int j = paramk.wvA.getPaddingTop();
    int k = paramk.wvA.getPaddingRight();
    int m = paramk.wvA.getPaddingBottom();
    paramk.wvA.setBackgroundResource(R.g.aUL);
    paramk.wvA.setPadding(i, j, k, m);
    GMTrace.o(19192329797632L, 142994);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2516850835456L, 18752);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null) && ((paramView.getTag() instanceof k)))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csm);
      ((View)localObject).setTag(new k(this.jHw).dn((View)localObject));
    }
    GMTrace.o(2516850835456L, 18752);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2516985053184L, 18753);
    this.wvE = parama1;
    k localk = (k)parama;
    parama = paramau.field_content;
    if (parama != null) {}
    for (parama = f.a.C(parama, paramau.field_reserved);; parama = null)
    {
      int i;
      if (parama != null)
      {
        k.I(localk.wvA, localk.wrJ);
        localk.wvA.setBackgroundResource(R.g.aUK);
        localk.wvA.setPadding(com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 13), 0, parama1.vKB.vKW.getResources().getDimensionPixelOffset(R.f.aRB), 0);
        localk.wsf.setSingleLine(true);
        paramString = new sx();
        paramString.eYp.eRi = parama.gjA;
        com.tencent.mm.sdk.b.a.vgX.m(paramString);
        if (paramString.eYq.eYr) {
          break label372;
        }
        i = 1;
        if (paramString.eYq.status == -2) {
          i = 0;
        }
        int k = paramString.eYq.status;
        int j = k;
        if (k <= 0) {
          j = parama.gjx;
        }
        switch (j)
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
        parama = new dr(paramau, parama1.wqK, paramInt, null, 0, (byte)0);
        localk.wvA.setTag(parama);
        GMTrace.o(2516985053184L, 18753);
        return;
        label372:
        i = 0;
        break;
        if (t.nm(parama.gkH)) {
          localk.wsf.setText(R.l.dfO);
        }
        for (;;)
        {
          localk.wsg.setText(parama.gjy);
          localk.wse.setImageResource(R.k.cKT);
          break;
          paramString = h.a(parama1.vKB.vKW, parama.gkH);
          localk.wsf.setText(paramString);
        }
        if (i != 0) {
          if (t.nm(parama.gkH))
          {
            paramString = ab.getContext().getString(R.l.dfI);
            label480:
            localk.wsf.setText(h.a(parama1.vKB.vKW, paramString));
          }
        }
        for (;;)
        {
          localk.wsg.setText(parama.gjy);
          localk.wse.setImageResource(R.k.cKU);
          a(localk);
          break;
          paramString = ab.getContext().getString(R.l.dfI) + "-" + parama.gkH;
          break label480;
          localk.wsf.setText(R.l.dfJ);
        }
        localk.wsg.setText(parama.gjy);
        localk.wse.setImageResource(R.k.cKV);
        if (i != 0) {
          if (t.nm(parama.gkH))
          {
            parama = ab.getContext().getString(R.l.dfQ);
            label633:
            localk.wsf.setText(h.a(parama1.vKB.vKW, parama));
          }
        }
        for (;;)
        {
          a(localk);
          break;
          parama = ab.getContext().getString(R.l.dfQ) + "-" + parama.gkH;
          break label633;
          localk.wsf.setText(R.l.dfP);
        }
        localk.wsg.setText(parama.gjy);
        localk.wse.setImageResource(R.k.cKU);
        if (i != 0) {
          if (t.nm(parama.gkH))
          {
            parama = ab.getContext().getString(R.l.dfL);
            label761:
            localk.wsf.setText(h.a(parama1.vKB.vKW, parama));
          }
        }
        for (;;)
        {
          a(localk);
          break;
          parama = ab.getContext().getString(R.l.dfL) + "-" + parama.gkH;
          break label761;
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
    GMTrace.i(2517119270912L, 18754);
    int i = ((dr)paramView.getTag()).position;
    if (paramau != null) {
      paramContextMenu.add(i, 100, 0, this.wvE.getString(R.l.dgd));
    }
    GMTrace.o(2517119270912L, 18754);
    return false;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2517253488640L, 18755);
    switch (paramMenuItem.getItemId())
    {
    default: 
      GMTrace.o(2517253488640L, 18755);
      return false;
    }
    bc.S(paramau.field_msgId);
    GMTrace.o(2517253488640L, 18755);
    return true;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2517387706368L, 18756);
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
        w.w("MicroMsg.ChattingItemAppMsgRemittanceFrom", "Unrecognized type %d, probably version to low & check update!", new Object[] { Integer.valueOf(paramView.gjx) });
        t.by(parama.vKB.vKW);
      }
      for (;;)
      {
        GMTrace.o(2517387706368L, 18756);
        return true;
        ((Intent)localObject).putExtra("invalid_time", paramView.gjB);
        ((Intent)localObject).putExtra("is_sender", false);
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
          ((Intent)localObject).putExtra("is_sender", true);
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
    GMTrace.o(2517387706368L, 18756);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */