package com.tencent.mm.ui.chatting;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.plugin.subapp.c.a;
import com.tencent.mm.pluginsdk.model.app.ab;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.protocal.c.bnx;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.ui.u;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.f;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.q;
import java.util.LinkedList;

final class ch
  extends ah
{
  public com.tencent.mm.ad.e gWn;
  public ProgressDialog oHE;
  public En_5b8fbb1e.a wvE;
  
  public ch()
  {
    super(34);
    GMTrace.i(2371090382848L, 17666);
    GMTrace.o(2371090382848L, 17666);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2371224600576L, 17667);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null) && ((paramView.getTag() instanceof dg)))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.cte);
      ((View)localObject).setTag(new dg(this.jHw).dw((View)localObject));
    }
    GMTrace.o(2371224600576L, 17667);
    return (View)localObject;
  }
  
  public final void a(final ah.a parama, final int paramInt, final En_5b8fbb1e.a parama1, final au paramau, String paramString)
  {
    GMTrace.i(2371493036032L, 17669);
    paramString = (dg)parama;
    this.wvE = parama1;
    Object localObject2 = an.bJI().er(paramau.field_msgId);
    final Object localObject1 = paramau.field_content;
    parama1 = null;
    parama = parama1;
    if (localObject2 != null)
    {
      parama = parama1;
      if (localObject1 != null) {
        parama = f.a.eS((String)localObject1);
      }
    }
    boolean bool2 = false;
    parama1 = com.tencent.mm.plugin.subapp.c.e.Jw((String)localObject1);
    boolean bool1 = bool2;
    if (parama1 != null)
    {
      bool1 = bool2;
      if (parama1.qsm == 0) {}
    }
    for (;;)
    {
      try
      {
        localObject1 = com.tencent.mm.pluginsdk.i.n.O(this.wvE.vKB.vKW, parama1.qsm);
        if ((parama != null) && (parama.description != null))
        {
          i = parama.description.indexOf('|');
          if ((i <= 0) || (parama.description.length() <= i + 1)) {
            continue;
          }
          localObject2 = parama.description.substring(i + 1);
          paramString.hqI.setText((CharSequence)localObject2);
        }
        if ((localObject1 != null) && (((String)localObject1).length() > 0))
        {
          localObject1 = ((String)localObject1).split(";");
          paramString.wBQ.setText(localObject1[0]);
          if (localObject1.length > 1) {
            paramString.wBR.setText(localObject1[1]);
          }
        }
      }
      catch (Exception localException)
      {
        long l;
        Object localObject3;
        int j;
        int k;
        String str;
        w.printErrStackTrace("MicroMsg.ChattingItemVoiceRemindConfirm", localException, "", new Object[0]);
        continue;
        paramString.wBU.setVisibility(8);
        paramString.hqI.setTextColor(this.wvE.getResources().getColor(R.e.aPk));
        paramString.wBR.setTextColor(this.wvE.getResources().getColor(R.e.aPk));
        paramString.wBQ.setTextColor(this.wvE.getResources().getColor(R.e.aPk));
        continue;
        int i = 0;
        continue;
        paramString.wBS.setBackgroundResource(R.g.bbt);
        continue;
      }
      bool1 = t.hC(parama1.qsm);
      if (!bool1) {
        continue;
      }
      paramString.wBU.setVisibility(0);
      paramString.hqI.setTextColor(this.wvE.getResources().getColor(R.e.aPl));
      paramString.wBR.setTextColor(this.wvE.getResources().getColor(R.e.aPl));
      paramString.wBQ.setTextColor(this.wvE.getResources().getColor(R.e.aPl));
      paramString.wBS.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2271500828672L, 16924);
          if (t.nm(paramau.field_imgPath))
          {
            w.d("MicroMsg.ChattingItemVoiceRemindConfirm", "filename is null");
            GMTrace.o(2271500828672L, 16924);
            return;
          }
          ch.this.wvE.wvd.wyS.c(paramInt, paramau);
          GMTrace.o(2271500828672L, 16924);
        }
      });
      l = paramau.field_msgId;
      if ((this.wvE.wvd.wyS == null) || (!this.wvE.wvd.wyS.isPlaying()) || (this.wvE.wvd.wyS.wta != l)) {
        continue;
      }
      i = 1;
      if (i == 0) {
        continue;
      }
      paramString.wBS.setBackgroundResource(R.g.bbs);
      if ((parama1 != null) && (!t.nm(parama1.qso)) && (parama1.qsp > 0) && (t.nm(paramau.field_reserved)) && (parama != null))
      {
        localObject2 = com.tencent.mm.plugin.subapp.c.k.mj(q.zE());
        localObject1 = com.tencent.mm.plugin.subapp.c.h.aA((String)localObject2, false);
        paramau.dd((String)localObject2);
        at.AR();
        com.tencent.mm.y.c.yM().a(paramau.field_msgId, paramau);
        l = paramau.field_msgId;
        i = parama.sdkVer;
        localObject2 = parama.appId;
        localObject3 = parama1.qso;
        j = parama1.qsp;
        k = parama.type;
        str = parama.giJ;
        localObject1 = l.a((String)localObject1, l, i, (String)localObject2, (String)localObject3, j, k, parama.giz);
        if (localObject1 != null)
        {
          localObject2 = at.wS();
          localObject3 = new com.tencent.mm.ad.e()
          {
            public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
            {
              GMTrace.i(2246670548992L, 16739);
              w.d("MicroMsg.ChattingItemVoiceRemindConfirm", "errType " + paramAnonymousInt1 + " errCode " + paramAnonymousInt2 + "  scene " + paramAnonymousk.getType());
              boolean bool = false;
              if (ak.a.gna != null) {
                bool = ak.a.gna.R(paramau.field_msgId);
              }
              if ((!bool) && (paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0) && (((ab)paramAnonymousk).getMediaId().equals(localObject1)))
              {
                paramAnonymousString = au.ad(paramau);
                paramAnonymousString.dc(paramau.field_reserved);
                paramAnonymousString.C(-1L);
                ch.this.wvE.wvd.wyS.c(paramInt, paramAnonymousString);
              }
              at.wS().b(221, ch.this.gWn);
              ch.this.gWn = null;
              GMTrace.o(2246670548992L, 16739);
            }
          };
          this.gWn = ((com.tencent.mm.ad.e)localObject3);
          ((com.tencent.mm.ad.n)localObject2).a(221, (com.tencent.mm.ad.e)localObject3);
          localObject1 = new ab((String)localObject1);
          ((ab)localObject1).bJD();
          at.wS().a((com.tencent.mm.ad.k)localObject1, 0);
        }
      }
      if ((t.nm(paramau.field_imgPath)) && (parama1.qss > 0))
      {
        at.AR();
        localObject1 = com.tencent.mm.y.c.yM().B(paramau.field_talker, parama1.qss);
        if (!t.nm(((ce)localObject1).field_imgPath))
        {
          localObject2 = com.tencent.mm.plugin.subapp.c.k.mj(q.zE());
          localObject3 = com.tencent.mm.plugin.subapp.c.h.aA((String)localObject2, false);
          if (j.r(com.tencent.mm.plugin.subapp.c.h.aA(((ce)localObject1).field_imgPath, false), (String)localObject3, false))
          {
            paramau.dc((String)localObject2);
            at.AR();
            com.tencent.mm.y.c.yM().a(paramau.field_msgId, paramau);
          }
        }
      }
      if ((t.nm(paramau.field_imgPath)) && (parama1 != null) && (!t.nm(parama1.eAE)) && (parama1.giv > 0) && (this.gWn == null))
      {
        localObject1 = com.tencent.mm.plugin.subapp.c.k.mj(q.zE());
        localObject2 = com.tencent.mm.plugin.subapp.c.h.aA((String)localObject1, false);
        paramau.dc((String)localObject1);
        at.AR();
        com.tencent.mm.y.c.yM().a(paramau.field_msgId, paramau);
        parama = l.a((String)localObject2, paramau.field_msgId, parama.sdkVer, parama.appId, parama.eAE, parama.giv);
        w.d("MicroMsg.ChattingItemVoiceRemindConfirm", "mediaId  " + parama.field_mediaSvrId);
        if (parama.field_mediaSvrId != null)
        {
          localObject1 = at.wS();
          localObject2 = new com.tencent.mm.ad.e()
          {
            public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
            {
              GMTrace.i(2168421613568L, 16156);
              w.d("MicroMsg.ChattingItemVoiceRemindConfirm", "errType " + paramAnonymousInt1 + " errCode " + paramAnonymousInt2 + "  scene " + paramAnonymousk.getType());
              if (((ab)paramAnonymousk).getMediaId().equals(parama.field_mediaSvrId))
              {
                at.wS().b(221, ch.this.gWn);
                ch.this.gWn = null;
              }
              GMTrace.o(2168421613568L, 16156);
            }
          };
          this.gWn = ((com.tencent.mm.ad.e)localObject2);
          ((com.tencent.mm.ad.n)localObject1).a(221, (com.tencent.mm.ad.e)localObject2);
          parama = new ab(parama);
          at.wS().a(parama, 0);
        }
      }
      paramString.wBT.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2114331869184L, 15753);
          com.tencent.mm.ui.base.h.a(ch.this.wvE.vKB.vKW, R.l.ehb, R.l.ehd, new DialogInterface.OnClickListener()
          {
            public final void onClick(final DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(2525843423232L, 18819);
              paramAnonymous2DialogInterface = at.wS();
              Object localObject1 = ch.this;
              Object localObject2 = new com.tencent.mm.ad.e()
              {
                public final void a(int paramAnonymous3Int1, int paramAnonymous3Int2, String paramAnonymous3String, com.tencent.mm.ad.k paramAnonymous3k)
                {
                  GMTrace.i(2211639721984L, 16478);
                  w.d("MicroMsg.ChattingItemVoiceRemindConfirm", "errType " + paramAnonymous3Int1 + " errCode " + paramAnonymous3Int2 + "  scene " + paramAnonymous3k.getType());
                  if ((paramAnonymous3Int1 == 0) && (paramAnonymous3Int2 == 0))
                  {
                    paramAnonymous3String = ch.4.this.wyC.field_content;
                    if (paramAnonymous3String == null) {
                      break label243;
                    }
                  }
                  label243:
                  for (paramAnonymous3String = f.a.eS(paramAnonymous3String);; paramAnonymous3String = null)
                  {
                    if (paramAnonymous3String != null) {
                      l.es(ch.4.this.wyC.field_msgId);
                    }
                    bc.S(ch.4.this.wyC.field_msgId);
                    Toast.makeText(ch.this.wvE.vKB.vKW, ch.this.wvE.getString(R.l.dfT), 0).show();
                    at.wS().b(331, ch.this.gWn);
                    ch.this.gWn = null;
                    if (ch.this.oHE != null) {
                      ch.this.oHE.dismiss();
                    }
                    GMTrace.o(2211639721984L, 16478);
                    return;
                  }
                }
              };
              ((ch)localObject1).gWn = ((com.tencent.mm.ad.e)localObject2);
              paramAnonymous2DialogInterface.a(331, (com.tencent.mm.ad.e)localObject2);
              paramAnonymous2DialogInterface = new LinkedList();
              localObject1 = new bnx();
              ((bnx)localObject1).tQQ = ch.4.this.wyG.qsn;
              paramAnonymous2DialogInterface.add(localObject1);
              paramAnonymous2DialogInterface = new a(paramAnonymous2DialogInterface, paramAnonymous2DialogInterface.size());
              at.wS().a(paramAnonymous2DialogInterface, 0);
              localObject1 = ch.this;
              localObject2 = ch.this.wvE.vKB.vKW;
              ch.this.wvE.getString(R.l.cUG);
              ((ch)localObject1).oHE = com.tencent.mm.ui.base.h.a((Context)localObject2, ch.this.wvE.getString(R.l.dfU), true, new DialogInterface.OnCancelListener()
              {
                public final void onCancel(DialogInterface paramAnonymous3DialogInterface)
                {
                  GMTrace.i(2156878888960L, 16070);
                  at.wS().c(paramAnonymous2DialogInterface);
                  at.wS().b(331, ch.this.gWn);
                  ch.this.gWn = null;
                  if (ch.this.oHE != null) {
                    ch.this.oHE.dismiss();
                  }
                  GMTrace.o(2156878888960L, 16070);
                }
              });
              GMTrace.o(2525843423232L, 18819);
            }
          }, null);
          GMTrace.o(2114331869184L, 15753);
        }
      });
      paramString.wvA.setTag(new dr(paramau, this.wvE.wqK, paramInt, null, 0, (byte)0));
      paramString.wvA.setOnClickListener(this.wvE.wvd.wyW);
      at.AR();
      if (com.tencent.mm.y.c.isSDCardAvailable()) {
        paramString.wvA.setOnLongClickListener(this.wvE.wvd.wyY);
      }
      GMTrace.o(2371493036032L, 17669);
      return;
      paramString.hqI.setText("");
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2371627253760L, 17670);
    int i = ((dr)paramView.getTag()).position;
    int j = l.Oz(this.wvE.cV(paramau.field_content, paramau.field_isSend));
    paramView = f.a.eS(this.wvE.cV(paramau.field_content, paramau.field_isSend));
    if ((paramView.giv <= 0) || ((paramView.giv > 0) && (j >= 100))) {
      paramContextMenu.add(i, 111, 0, this.wvE.getString(R.l.dSi));
    }
    if (!this.wvE.ceh()) {
      paramContextMenu.add(i, 100, 0, this.wvE.getString(R.l.dgd));
    }
    GMTrace.o(2371627253760L, 17670);
    return true;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2371761471488L, 17671);
    switch (paramMenuItem.getItemId())
    {
    default: 
      GMTrace.o(2371761471488L, 17671);
      return false;
    case 100: 
      parama = paramau.field_content;
      paramMenuItem = null;
      if (parama != null) {
        paramMenuItem = f.a.eS(parama);
      }
      if (paramMenuItem != null) {
        l.es(paramau.field_msgId);
      }
      bc.S(paramau.field_msgId);
      GMTrace.o(2371761471488L, 17671);
      return false;
    }
    paramMenuItem = new Intent(parama.vKB.vKW, MsgRetransmitUI.class);
    paramMenuItem.putExtra("Retr_Msg_content", parama.cV(paramau.field_content, paramau.field_isSend));
    paramMenuItem.putExtra("Retr_Msg_Type", 2);
    paramMenuItem.putExtra("Retr_Msg_Id", paramau.field_msgId);
    parama.startActivity(paramMenuItem);
    GMTrace.o(2371761471488L, 17671);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2371895689216L, 17672);
    GMTrace.o(2371895689216L, 17672);
    return true;
  }
  
  protected final boolean ccr()
  {
    GMTrace.i(2371358818304L, 17668);
    GMTrace.o(2371358818304L, 17668);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */