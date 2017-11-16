package com.tencent.mm.plugin.record.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.record.a.i;
import com.tencent.mm.plugin.record.a.m;
import com.tencent.mm.pluginsdk.model.app.ab;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.ti;
import com.tencent.mm.protocal.c.tj;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import java.util.Iterator;
import java.util.LinkedList;

public class RecordMsgDetailUI
  extends RecordMsgBaseUI
{
  private long eDr;
  private boolean eON;
  private String eRw;
  private r ihl;
  private com.tencent.mm.protocal.b.a.c oic;
  private boolean oid;
  private String oie;
  private String oif;
  private String title;
  
  public RecordMsgDetailUI()
  {
    GMTrace.i(7560081965056L, 56327);
    this.oic = null;
    this.eDr = -1L;
    this.eRw = null;
    this.eON = true;
    this.oid = false;
    this.title = "";
    this.oie = "";
    this.oif = "";
    this.ihl = null;
    GMTrace.o(7560081965056L, 56327);
  }
  
  private String a(com.tencent.mm.protocal.b.a.c paramc)
  {
    com.tencent.mm.protocal.b.a.c localc = null;
    GMTrace.i(16878953037824L, 125758);
    int i;
    String str2;
    String str1;
    if (paramc != null)
    {
      Iterator localIterator = paramc.glr.iterator();
      i = 0;
      str2 = null;
      str1 = null;
      while (localIterator.hasNext())
      {
        paramc = (th)localIterator.next();
        if (paramc.ukn.ukF.ulb != null)
        {
          str1 = this.vKB.vKW.getString(R.l.dQl);
          i = 1;
        }
        else
        {
          if (paramc.ukn.ukF.eMI == null) {
            break label241;
          }
          if (str2 == null)
          {
            str2 = paramc.ukp;
          }
          else
          {
            if (str2 == paramc.ukp) {
              break label241;
            }
            paramc = paramc.ukp;
            localc = paramc;
          }
        }
      }
      if ((str2 != null) && (localc == null) && (i == 0)) {
        paramc = this.vKB.vKW.getString(R.l.duv, new Object[] { str2 });
      }
    }
    for (;;)
    {
      GMTrace.o(16878953037824L, 125758);
      return paramc;
      paramc = str1;
      if (str2 != null)
      {
        paramc = str1;
        if (localc != null)
        {
          paramc = str1;
          if (!str2.equals(localc))
          {
            paramc = str1;
            if (i == 0)
            {
              paramc = this.vKB.vKW.getString(R.l.duu, new Object[] { str2, localc });
              continue;
              label241:
              paramc = localc;
              break;
              paramc = null;
            }
          }
        }
      }
    }
  }
  
  private void ar()
  {
    GMTrace.i(16879087255552L, 125759);
    f localf = new f();
    localf.ohD = this.oic.glr;
    localf.eDr = this.eDr;
    localf.eRw = this.eRw;
    super.baQ();
    this.ohZ.a(localf);
    com.tencent.mm.plugin.record.a.s.baL().a((e)this.ohZ);
    GMTrace.o(16879087255552L, 125759);
  }
  
  protected final void b(int paramInt1, int paramInt2, final Intent paramIntent)
  {
    GMTrace.i(7561289924608L, 56336);
    if (-1 != paramInt2)
    {
      w.e("MicroMsg.RecordMsgDetailUI", "processResult %d", new Object[] { Integer.valueOf(paramInt2) });
      GMTrace.o(7561289924608L, 56336);
      return;
    }
    final Object localObject;
    if (1001 == paramInt1)
    {
      if (paramIntent == null)
      {
        localObject = null;
        if (paramIntent != null) {
          break label103;
        }
      }
      label103:
      for (paramIntent = null;; paramIntent = paramIntent.getStringExtra("custom_send_text"))
      {
        if (!bg.nm((String)localObject)) {
          break label114;
        }
        w.w("MicroMsg.RecordMsgDetailUI", "want to send record msg, but toUser is null");
        GMTrace.o(7561289924608L, 56336);
        return;
        localObject = paramIntent.getStringExtra("Select_Conv_User");
        break;
      }
      label114:
      at.AR();
      final au localau = com.tencent.mm.y.c.yM().cM(this.eDr);
      if (localau.field_msgId != this.eDr)
      {
        w.w("MicroMsg.RecordMsgDetailUI", "want to send record msg, but message info is null");
        GMTrace.o(7561289924608L, 56336);
        return;
      }
      final r localr = com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.dtM), false, null);
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16880966303744L, 125773);
          m.a(localObject, paramIntent, localau);
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(16878281949184L, 125753);
              RecordMsgDetailUI.4.this.lea.dismiss();
              GMTrace.o(16878281949184L, 125753);
            }
          });
          GMTrace.o(16880966303744L, 125773);
        }
        
        public final String toString()
        {
          GMTrace.i(16881100521472L, 125774);
          String str = super.toString() + "|onActivityResult";
          GMTrace.o(16881100521472L, 125774);
          return str;
        }
      });
      GMTrace.o(7561289924608L, 56336);
      return;
    }
    if ((1002 == paramInt1) && (paramIntent.getBooleanExtra("kfavorite", false)))
    {
      localObject = new cf();
      com.tencent.mm.pluginsdk.model.e.a((cf)localObject, paramIntent);
      ((cf)localObject).eDv.activity = this;
      ((cf)localObject).eDv.eDC = 8;
      a.vgX.m((b)localObject);
    }
    GMTrace.o(7561289924608L, 56336);
  }
  
  protected final void baQ()
  {
    GMTrace.i(7560350400512L, 56329);
    this.eDr = getIntent().getLongExtra("message_id", -1L);
    this.eRw = getIntent().getStringExtra("record_xml");
    this.eON = getIntent().getBooleanExtra("record_show_share", true);
    this.oid = getIntent().getBooleanExtra("big_appmsg", false);
    this.oic = m.Fw(this.eRw);
    if (this.oic != null) {
      if (a(this.oic) != null)
      {
        this.title = a(this.oic);
        if (!bg.cc(this.oic.glr))
        {
          this.oie = ((th)this.oic.glr.getFirst()).ukr;
          this.oif = ((th)this.oic.glr.getLast()).ukr;
        }
      }
    }
    for (;;)
    {
      if ((this.eRw != null) && (this.oic != null)) {
        break label350;
      }
      baY();
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(7535251685376L, 56142);
          RecordMsgDetailUI.this.finish();
          GMTrace.o(7535251685376L, 56142);
          return true;
        }
      });
      if ((this.oid) && (an.afP().eq(this.eDr) != null))
      {
        at.AR();
        localObject = com.tencent.mm.y.c.yM().cM(this.eDr);
        localObject = new ab(this.eDr, ((ce)localObject).field_msgSvrId, new com.tencent.mm.ad.f()
        {
          public final void a(int paramAnonymousInt1, int paramAnonymousInt2, k paramAnonymousk)
          {
            GMTrace.i(16877610860544L, 125748);
            if (paramAnonymousInt1 == paramAnonymousInt2)
            {
              if (RecordMsgDetailUI.a(RecordMsgDetailUI.this) != null)
              {
                RecordMsgDetailUI.a(RecordMsgDetailUI.this).dismiss();
                RecordMsgDetailUI.b(RecordMsgDetailUI.this);
              }
              at.AR();
              au localau = com.tencent.mm.y.c.yM().cM(RecordMsgDetailUI.c(RecordMsgDetailUI.this));
              paramAnonymousk = localau.field_content;
              if (com.tencent.mm.y.s.eb(localau.field_talker)) {
                paramAnonymousk = bc.gQ(localau.field_content);
              }
              paramAnonymousk = f.a.eS(paramAnonymousk);
              if (paramAnonymousk != null)
              {
                RecordMsgDetailUI.a(RecordMsgDetailUI.this, paramAnonymousk.giV);
                RecordMsgDetailUI.a(RecordMsgDetailUI.this, m.Fw(RecordMsgDetailUI.d(RecordMsgDetailUI.this)));
                if (RecordMsgDetailUI.e(RecordMsgDetailUI.this) != null)
                {
                  if (RecordMsgDetailUI.b(RecordMsgDetailUI.this, RecordMsgDetailUI.e(RecordMsgDetailUI.this)) == null) {
                    break label246;
                  }
                  RecordMsgDetailUI.b(RecordMsgDetailUI.this, RecordMsgDetailUI.b(RecordMsgDetailUI.this, RecordMsgDetailUI.e(RecordMsgDetailUI.this)));
                }
              }
            }
            for (;;)
            {
              RecordMsgDetailUI.c(RecordMsgDetailUI.this, ((th)RecordMsgDetailUI.e(RecordMsgDetailUI.this).glr.getFirst()).ukr);
              RecordMsgDetailUI.d(RecordMsgDetailUI.this, ((th)RecordMsgDetailUI.e(RecordMsgDetailUI.this).glr.getLast()).ukr);
              RecordMsgDetailUI.f(RecordMsgDetailUI.this);
              GMTrace.o(16877610860544L, 125748);
              return;
              label246:
              RecordMsgDetailUI.b(RecordMsgDetailUI.this, RecordMsgDetailUI.e(RecordMsgDetailUI.this).title);
            }
          }
        });
        at.wS().a((k)localObject, 0);
      }
      GMTrace.o(7560350400512L, 56329);
      return;
      this.title = this.oic.title;
      break;
      at.AR();
      Object localObject = com.tencent.mm.y.c.yM().cM(this.eDr);
      localObject = f.a.C(((ce)localObject).field_content, ((ce)localObject).field_reserved);
      if (localObject != null)
      {
        this.title = ((f.a)localObject).title;
        this.ihl = r.b(this, getString(R.l.bKJ), true, 0, null);
      }
    }
    label350:
    ar();
    GMTrace.o(7560350400512L, 56329);
  }
  
  protected final h baR()
  {
    GMTrace.i(7560484618240L, 56330);
    e locale = new e(this, new g());
    GMTrace.o(7560484618240L, 56330);
    return locale;
  }
  
  protected final String baS()
  {
    GMTrace.i(7560753053696L, 56332);
    String str = this.title;
    GMTrace.o(7560753053696L, 56332);
    return str;
  }
  
  protected final String baT()
  {
    GMTrace.i(7560887271424L, 56333);
    String str = this.oie;
    GMTrace.o(7560887271424L, 56333);
    return str;
  }
  
  protected final String baU()
  {
    GMTrace.i(7561021489152L, 56334);
    String str = this.oif;
    GMTrace.o(7561021489152L, 56334);
    return str;
  }
  
  protected final void baV()
  {
    GMTrace.i(7561155706880L, 56335);
    if (!this.eON)
    {
      GMTrace.o(7561155706880L, 56335);
      return;
    }
    a(0, R.g.aXV, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(16878818820096L, 125757);
        paramAnonymousMenuItem = new com.tencent.mm.ui.widget.f(RecordMsgDetailUI.this.vKB.vKW, com.tencent.mm.ui.widget.f.xpQ, false);
        paramAnonymousMenuItem.qik = new p.c()
        {
          public final void a(com.tencent.mm.ui.base.n paramAnonymous2n)
          {
            GMTrace.i(16878550384640L, 125755);
            paramAnonymous2n.e(0, RecordMsgDetailUI.this.getString(R.l.duL));
            paramAnonymous2n.e(2, RecordMsgDetailUI.this.getString(R.l.dNH));
            GMTrace.o(16878550384640L, 125755);
          }
        };
        paramAnonymousMenuItem.qil = new p.d()
        {
          public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
          {
            GMTrace.i(16878013513728L, 125751);
            switch (paramAnonymous2MenuItem.getItemId())
            {
            }
            for (;;)
            {
              GMTrace.o(16878013513728L, 125751);
              return;
              paramAnonymous2MenuItem = new Intent();
              paramAnonymous2MenuItem.putExtra("Select_Conv_Type", 3);
              paramAnonymous2MenuItem.putExtra("select_is_ret", true);
              paramAnonymous2MenuItem.putExtra("mutil_select_is_ret", true);
              paramAnonymous2MenuItem.putExtra("Retr_Msg_Type", 10);
              paramAnonymous2MenuItem.putExtra("Retr_Msg_Id", RecordMsgDetailUI.c(RecordMsgDetailUI.this));
              d.a(RecordMsgDetailUI.this, ".ui.transmit.SelectConversationUI", paramAnonymous2MenuItem, 1001);
              GMTrace.o(16878013513728L, 125751);
              return;
              GMTrace.o(16878013513728L, 125751);
              return;
              paramAnonymous2MenuItem = new cf();
              com.tencent.mm.pluginsdk.model.e.a(paramAnonymous2MenuItem, RecordMsgDetailUI.c(RecordMsgDetailUI.this));
              paramAnonymous2MenuItem.eDv.eDC = 9;
              paramAnonymous2MenuItem.eDv.activity = RecordMsgDetailUI.this;
              a.vgX.m(paramAnonymous2MenuItem);
            }
          }
        };
        paramAnonymousMenuItem.bFk();
        GMTrace.o(16878818820096L, 125757);
        return true;
      }
    });
    GMTrace.o(7561155706880L, 56335);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7560216182784L, 56328);
    super.onCreate(paramBundle);
    GMTrace.o(7560216182784L, 56328);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7560618835968L, 56331);
    super.onDestroy();
    com.tencent.mm.plugin.record.a.s.baL().b((e)this.ohZ);
    GMTrace.o(7560618835968L, 56331);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\record\ui\RecordMsgDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */