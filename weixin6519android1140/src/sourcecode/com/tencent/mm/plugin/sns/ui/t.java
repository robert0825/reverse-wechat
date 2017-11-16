package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.al;
import com.tencent.mm.g.a.bz;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.dh;
import com.tencent.mm.g.a.dh.b;
import com.tencent.mm.g.a.kb;
import com.tencent.mm.g.a.mk;
import com.tencent.mm.g.a.mm;
import com.tencent.mm.g.a.qf;
import com.tencent.mm.plugin.sns.data.SnsCmdList;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ac;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.plugin.sns.model.q;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.widget.f;
import com.tencent.mm.ui.widget.f.a;
import java.util.ArrayList;
import java.util.List;

public final class t
  implements e
{
  public final Context context;
  public int eDg;
  public int eDh;
  public r hsU;
  public int jhX;
  c leg;
  public com.tencent.mm.plugin.sns.storage.m oWL;
  public boolean pQn;
  SnsCmdList pSQ;
  private final a pSR;
  public f pSS;
  public anu pST;
  private final String pSU;
  public String pSk;
  public String pSn;
  public boolean pSo;
  c pSq;
  public String tW;
  
  public t(Context paramContext, a parama)
  {
    GMTrace.i(8556245942272L, 63749);
    this.pSQ = new SnsCmdList();
    this.hsU = null;
    this.jhX = 0;
    this.pSS = null;
    this.pSo = false;
    this.leg = new c() {};
    this.pSq = new c() {};
    this.context = paramContext;
    this.pSR = parama;
    this.pSU = ((Activity)paramContext).getIntent().getStringExtra("sns_gallery_pre_title");
    GMTrace.o(8556245942272L, 63749);
  }
  
  public static void IX(String paramString)
  {
    GMTrace.i(16045058293760L, 119545);
    qf localqf = new qf();
    localqf.eUO.eHJ = 1;
    localqf.eUO.eUR = 2;
    localqf.eUO.eHy = paramString;
    com.tencent.mm.sdk.b.a.vgX.m(localqf);
    GMTrace.o(16045058293760L, 119545);
  }
  
  public static void IY(String paramString)
  {
    GMTrace.i(16045192511488L, 119546);
    qf localqf = new qf();
    localqf.eUO.eHJ = 3;
    localqf.eUO.eHy = paramString;
    com.tencent.mm.sdk.b.a.vgX.m(localqf);
    GMTrace.o(16045192511488L, 119546);
  }
  
  protected final void A(final com.tencent.mm.plugin.sns.storage.m paramm)
  {
    GMTrace.i(8556648595456L, 63752);
    if ((paramm.blZ()) || (paramm.bma()))
    {
      ae.bjd().vb(paramm.pMe);
      this.pSQ.uf(paramm.pMe);
      GMTrace.o(8556648595456L, 63752);
      return;
    }
    ae.bjc().dG(paramm.field_snsId);
    paramm = new q(paramm.field_snsId, 1);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(paramm, 0);
    Context localContext = this.context;
    this.context.getString(i.j.cUG);
    this.hsU = com.tencent.mm.ui.base.h.a(localContext, this.context.getString(i.j.piP), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(8493700481024L, 63283);
        if (t.this.jhX != 0)
        {
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xx().fYr.c(paramm);
          t.this.jhX = 0;
        }
        GMTrace.o(8493700481024L, 63283);
      }
    });
    GMTrace.o(8556648595456L, 63752);
  }
  
  public final void I(Bundle paramBundle)
  {
    GMTrace.i(16145184718848L, 120291);
    w.i("MicroMsg.GalleryTitleManager", "request deal QBAR string");
    bz localbz = new bz();
    localbz.eDf.activity = ((Activity)this.context);
    localbz.eDf.eBB = this.pSn;
    localbz.eDf.eDg = this.eDg;
    localbz.eDf.eDh = this.eDh;
    localbz.eDf.eDm = paramBundle;
    com.tencent.mm.sdk.b.a.vgX.m(localbz);
    GMTrace.o(16145184718848L, 120291);
  }
  
  protected final void IW(String paramString)
  {
    GMTrace.i(8556782813184L, 63753);
    Intent localIntent = new Intent();
    localIntent.putExtra("Retr_File_Name", paramString);
    localIntent.putExtra("Retr_Compress_Type", 0);
    localIntent.putExtra("Retr_Msg_Type", 0);
    com.tencent.mm.plugin.sns.c.a.hnH.l(localIntent, this.context);
    GMTrace.o(8556782813184L, 63753);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(8556917030912L, 63754);
    if ((paramInt1 != 0) || (paramInt2 != 0) || (paramk == null))
    {
      GMTrace.o(8556917030912L, 63754);
      return;
    }
    w.i("MicroMsg.GalleryTitleManager", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " type = " + paramk.getType() + " @" + hashCode());
    if (this.hsU != null) {
      this.hsU.dismiss();
    }
    paramString = (q)paramk;
    switch (paramString.type)
    {
    }
    for (;;)
    {
      GMTrace.o(8556917030912L, 63754);
      return;
      this.pSQ.uf(paramString.ppo);
      this.pSR.bT(u.X("sns_table_", paramString.ppo), paramString.type);
      GMTrace.o(8556917030912L, 63754);
      return;
      this.pSQ.ug(paramString.ppo);
      this.pSR.bT("", paramString.type);
      GMTrace.o(8556917030912L, 63754);
      return;
      this.pSR.bT("", paramString.type);
      GMTrace.o(8556917030912L, 63754);
      return;
      this.pSQ.ug(paramString.ppo);
      this.pSR.bT(u.X("sns_table_", paramString.ppo), paramString.type);
    }
  }
  
  public final void a(com.tencent.mm.plugin.sns.storage.m paramm, anu paramanu)
  {
    GMTrace.i(16044789858304L, 119543);
    if (paramm == null)
    {
      w.i("MicroMsg.GalleryTitleManager", "error beacause info null");
      GMTrace.o(16044789858304L, 119543);
      return;
    }
    if (paramm.field_type == 1)
    {
      cf localcf = new cf();
      com.tencent.mm.plugin.sns.i.a.a(localcf, paramm, paramanu.mmR);
      localcf.eDv.activity = ((Activity)this.context);
      localcf.eDv.eDC = 15;
      com.tencent.mm.sdk.b.a.vgX.m(localcf);
      GMTrace.o(16044789858304L, 119543);
      return;
    }
    if (paramm == null)
    {
      GMTrace.o(16044789858304L, 119543);
      return;
    }
    if (!paramm.uX(32))
    {
      paramm = paramm.blY();
      paramanu = new qf();
      paramanu.eUO.eHJ = 2;
      paramanu.eUO.eUP = 16;
      paramanu.eUO.eUQ = false;
      paramanu.eUO.eHy = paramm;
      com.tencent.mm.sdk.b.a.vgX.m(paramanu);
      GMTrace.o(16044789858304L, 119543);
      return;
    }
    paramanu = new cf();
    com.tencent.mm.plugin.sns.i.a.a(paramanu, paramm);
    paramanu.eDv.activity = ((Activity)this.context);
    paramanu.eDv.eDC = 16;
    com.tencent.mm.sdk.b.a.vgX.m(paramanu);
    GMTrace.o(16044789858304L, 119543);
  }
  
  public final void a(com.tencent.mm.plugin.sns.storage.m paramm, anu paramanu, int paramInt)
  {
    GMTrace.i(16044655640576L, 119542);
    if (paramm == null)
    {
      w.e("MicroMsg.GalleryTitleManager", "error beacause info null");
      GMTrace.o(16044655640576L, 119542);
      return;
    }
    Intent localIntent = new Intent();
    if (paramm.field_type == 1)
    {
      String str = paramanu.mmR;
      localIntent.putExtra("sns_send_data_ui_image_path", FlipView.f(am.dE(ae.getAccSnsPath(), str) + i.l(paramanu), this.context));
      localIntent.putExtra("sns_send_data_ui_image_position", paramInt);
    }
    localIntent.putExtra("sns_send_data_ui_activity", true);
    localIntent.putExtra("sns_local_id", paramm.blY());
    d.a(this.context, ".ui.chatting.ChattingSendDataToDeviceUI", localIntent);
    GMTrace.o(16044655640576L, 119542);
  }
  
  public final void a(boolean paramBoolean1, final com.tencent.mm.plugin.sns.storage.m paramm, final anu paramanu, boolean paramBoolean2, final int paramInt)
  {
    GMTrace.i(8556514377728L, 63751);
    this.pQn = paramBoolean1;
    this.oWL = paramm;
    this.pST = paramanu;
    this.tW = paramanu.mmR;
    final ArrayList localArrayList1 = new ArrayList();
    final ArrayList localArrayList2 = new ArrayList();
    label244:
    Object localObject;
    if (paramBoolean1)
    {
      if (paramm == null)
      {
        GMTrace.o(8556514377728L, 63751);
        return;
      }
      if (paramm.field_localPrivate > 0)
      {
        if ((!bg.nm(ae.biJ())) && (ae.biJ().equals(paramm.field_userName)))
        {
          localArrayList1.add(this.context.getString(i.j.pkA));
          localArrayList2.add(Integer.valueOf(5));
        }
        localArrayList1.add(this.context.getString(i.j.edp));
        localArrayList2.add(Integer.valueOf(3));
        if (d.LL("favorite"))
        {
          localArrayList1.add(this.context.getString(i.j.dNH));
          localArrayList2.add(Integer.valueOf(6));
        }
        if ((paramm.field_type != 15) && (paramm.field_type != 5)) {
          break label606;
        }
        localArrayList1.add(this.context.getString(i.j.dUN));
        localArrayList2.add(Integer.valueOf(2));
        localObject = new dh();
        ((dh)localObject).eEV.eEM = paramm.blY();
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
        if (((dh)localObject).eEW.eEu)
        {
          localArrayList1.add(this.context.getString(i.j.phO));
          localArrayList2.add(Integer.valueOf(8));
        }
        if (this.pSn != null)
        {
          if (!com.tencent.mm.plugin.scanner.a.an(this.eDg, this.pSn)) {
            break label680;
          }
          localObject = this.context.getString(i.j.dQh);
          label349:
          localArrayList1.add(localObject);
          localArrayList2.add(Integer.valueOf(7));
        }
        if ((this.pSS == null) || (!this.pSo)) {
          break label695;
        }
        this.pSo = false;
        label391:
        this.pSS.qik = new p.c()
        {
          public final void a(com.tencent.mm.ui.base.n paramAnonymousn)
          {
            GMTrace.i(8707375104000L, 64875);
            paramAnonymousn.clear();
            int i = 0;
            while (i < localArrayList1.size())
            {
              paramAnonymousn.e(((Integer)localArrayList2.get(i)).intValue(), (CharSequence)localArrayList1.get(i));
              i += 1;
            }
            paramAnonymousn.e(-1, t.this.context.getString(i.j.piO));
            GMTrace.o(8707375104000L, 64875);
          }
        };
        this.pSS.qil = new p.d()
        {
          public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
          {
            GMTrace.i(8493432045568L, 63281);
            paramAnonymousInt = paramAnonymousMenuItem.getItemId();
            w.d("MicroMsg.GalleryTitleManager", "showAlertWithDel " + paramAnonymousInt);
            switch (paramAnonymousInt)
            {
            }
            for (;;)
            {
              GMTrace.o(8493432045568L, 63281);
              return;
              if ((paramm != null) && (paramm.blD().uUc != null))
              {
                t.this.a(paramm, paramanu);
                GMTrace.o(8493432045568L, 63281);
                return;
                t.this.a(paramm, paramanu, paramInt);
                GMTrace.o(8493432045568L, 63281);
                return;
                paramAnonymousMenuItem = t.this;
                Object localObject = new q(paramm.field_snsId, 3);
                com.tencent.mm.kernel.h.xz();
                com.tencent.mm.kernel.h.xx().fYr.a((com.tencent.mm.ad.k)localObject, 0);
                Context localContext = paramAnonymousMenuItem.context;
                paramAnonymousMenuItem.context.getString(i.j.cUG);
                paramAnonymousMenuItem.hsU = com.tencent.mm.ui.base.h.a(localContext, paramAnonymousMenuItem.context.getString(i.j.pky), true, new t.9(paramAnonymousMenuItem, (q)localObject));
                GMTrace.o(8493432045568L, 63281);
                return;
                paramAnonymousMenuItem = t.this;
                localObject = paramm;
                if ((((com.tencent.mm.plugin.sns.storage.m)localObject).blZ()) || (((com.tencent.mm.plugin.sns.storage.m)localObject).bma()))
                {
                  ae.bjd().vb(((com.tencent.mm.plugin.sns.storage.m)localObject).pMe);
                  GMTrace.o(8493432045568L, 63281);
                  return;
                }
                localObject = new q(((com.tencent.mm.plugin.sns.storage.m)localObject).field_snsId, 2);
                com.tencent.mm.kernel.h.xz();
                com.tencent.mm.kernel.h.xx().fYr.a((com.tencent.mm.ad.k)localObject, 0);
                localContext = paramAnonymousMenuItem.context;
                paramAnonymousMenuItem.context.getString(i.j.cUG);
                paramAnonymousMenuItem.hsU = com.tencent.mm.ui.base.h.a(localContext, paramAnonymousMenuItem.context.getString(i.j.pky), true, new t.8(paramAnonymousMenuItem, (q)localObject));
                GMTrace.o(8493432045568L, 63281);
                return;
                if ((paramm != null) && (paramm.blD().uUc != null))
                {
                  if (paramm.field_type != 15)
                  {
                    com.tencent.mm.pluginsdk.ui.tools.k.h(am.dE(ae.getAccSnsPath(), paramanu.mmR) + i.l(paramanu), t.this.context);
                    GMTrace.o(8493432045568L, 63281);
                    return;
                  }
                  t.IY(paramm.blY());
                  GMTrace.o(8493432045568L, 63281);
                  return;
                  if ((paramm != null) && (paramm.blD().uUc != null))
                  {
                    if (paramm.blD().uUc.ueV == 1)
                    {
                      paramAnonymousMenuItem = am.dE(ae.getAccSnsPath(), paramanu.mmR) + i.l(paramanu);
                      t.this.IW(paramAnonymousMenuItem);
                      GMTrace.o(8493432045568L, 63281);
                      return;
                    }
                    t.IX(paramm.blY());
                    GMTrace.o(8493432045568L, 63281);
                    return;
                    paramAnonymousMenuItem = new Bundle();
                    paramAnonymousMenuItem.putString("stat_msg_id", "sns_" + i.dt(paramm.field_snsId));
                    paramAnonymousMenuItem.putString("stat_send_msg_user", paramm.field_userName);
                    paramAnonymousMenuItem.putInt("stat_scene", 3);
                    t.this.I(paramAnonymousMenuItem);
                    GMTrace.o(8493432045568L, 63281);
                    return;
                    if (paramm.blD().uUc.ueW.size() > 1)
                    {
                      com.tencent.mm.ui.base.h.a(t.this.context, t.this.context.getString(i.j.pkl), "", new DialogInterface.OnClickListener()
                      {
                        public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                        {
                          GMTrace.i(8722944360448L, 64991);
                          t.this.A(t.3.this.pSY);
                          GMTrace.o(8722944360448L, 64991);
                        }
                      }, null);
                      GMTrace.o(8493432045568L, 63281);
                      return;
                    }
                    com.tencent.mm.ui.base.h.a(t.this.context, t.this.context.getString(i.j.pkj), "", new DialogInterface.OnClickListener()
                    {
                      public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                      {
                        GMTrace.i(8533428928512L, 63579);
                        t.this.A(t.3.this.pSY);
                        GMTrace.o(8533428928512L, 63579);
                      }
                    }, null);
                  }
                }
              }
            }
          }
        };
        this.pSS.xqc = new f.a()
        {
          public final void onDismiss()
          {
            GMTrace.i(14707041763328L, 109576);
            Object localObject = new al();
            ((al)localObject).eBC.filePath = t.this.pSk;
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
            t.this.pSS = null;
            t.this.pSk = null;
            t.this.oWL = null;
            t.this.tW = null;
            t.this.pSn = null;
            localObject = t.this;
            t.this.eDh = 0;
            ((t)localObject).eDg = 0;
            GMTrace.o(14707041763328L, 109576);
          }
        };
        this.pSS.bFk();
      }
    }
    label606:
    label680:
    label695:
    label839:
    label944:
    do
    {
      if (true == paramBoolean2)
      {
        com.tencent.mm.kernel.h.xz();
        if (com.tencent.mm.kernel.h.xx().fYr.DN() != 0)
        {
          paramm = new mk();
          paramanu = am.dE(ae.getAccSnsPath(), this.tW) + i.l(paramanu);
          paramm.eRq.filePath = paramanu;
          this.pSk = paramanu;
          com.tencent.mm.sdk.b.a.vgX.m(paramm);
        }
      }
      GMTrace.o(8556514377728L, 63751);
      return;
      localArrayList1.add(this.context.getString(i.j.pkB));
      localArrayList2.add(Integer.valueOf(1));
      localArrayList1.add(this.context.getString(i.j.edp));
      localArrayList2.add(Integer.valueOf(3));
      break;
      if (paramm.field_type == 1)
      {
        localArrayList1.add(this.context.getString(i.j.dUK));
        localArrayList2.add(Integer.valueOf(2));
        break label244;
      }
      localArrayList1.add(this.context.getString(i.j.pkv));
      localArrayList2.add(Integer.valueOf(2));
      break label244;
      localObject = this.context.getString(i.j.dQg);
      break label349;
      this.pSS = new f(this.context, f.xpQ, false);
      break label391;
      paramm.blD();
      localArrayList1.add(this.context.getString(i.j.edp));
      localArrayList2.add(Integer.valueOf(3));
      if (d.LL("favorite"))
      {
        localArrayList1.add(this.context.getString(i.j.dNH));
        localArrayList2.add(Integer.valueOf(6));
      }
      if ((paramm.field_type != 15) && (paramm.field_type != 5)) {
        break label1044;
      }
      localArrayList1.add(this.context.getString(i.j.dUN));
      localArrayList2.add(Integer.valueOf(2));
      localObject = new dh();
      ((dh)localObject).eEV.eEM = paramm.blY();
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      if (((dh)localObject).eEW.eEu)
      {
        localArrayList1.add(this.context.getString(i.j.phO));
        localArrayList2.add(Integer.valueOf(8));
      }
      if (this.pSn != null)
      {
        if (!com.tencent.mm.plugin.scanner.a.an(this.eDg, this.pSn)) {
          break label1118;
        }
        localObject = this.context.getString(i.j.dQh);
        localArrayList1.add(localObject);
        localArrayList2.add(Integer.valueOf(7));
      }
    } while (localArrayList1.size() == 0);
    if ((this.pSS != null) && (this.pSo)) {
      this.pSo = false;
    }
    for (;;)
    {
      this.pSS.qik = new p.c()
      {
        public final void a(com.tencent.mm.ui.base.n paramAnonymousn)
        {
          GMTrace.i(8391829225472L, 62524);
          paramAnonymousn.clear();
          int i = 0;
          while (i < localArrayList1.size())
          {
            paramAnonymousn.e(((Integer)localArrayList2.get(i)).intValue(), (CharSequence)localArrayList1.get(i));
            i += 1;
          }
          GMTrace.o(8391829225472L, 62524);
        }
      };
      this.pSS.qil = new p.d()
      {
        public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          GMTrace.i(8613288476672L, 64174);
          paramAnonymousInt = paramAnonymousMenuItem.getItemId();
          w.d("MicroMsg.GalleryTitleManager", "showAlert " + paramAnonymousInt);
          switch (paramAnonymousInt)
          {
          }
          for (;;)
          {
            GMTrace.o(8613288476672L, 64174);
            return;
            if ((paramm != null) && (paramm.blD().uUc != null))
            {
              t.this.a(paramm, paramanu);
              GMTrace.o(8613288476672L, 64174);
              return;
              t.this.a(paramm, paramanu, paramInt);
              GMTrace.o(8613288476672L, 64174);
              return;
              if ((paramm != null) && (paramm.blD().uUc != null))
              {
                if (paramm.blD().uUc.ueV == 1)
                {
                  paramAnonymousMenuItem = am.dE(ae.getAccSnsPath(), paramanu.mmR) + i.l(paramanu);
                  t.this.IW(paramAnonymousMenuItem);
                  GMTrace.o(8613288476672L, 64174);
                  return;
                }
                t.IX(paramm.blY());
                GMTrace.o(8613288476672L, 64174);
                return;
                if ((paramm != null) && (paramm.blD().uUc != null))
                {
                  if (paramm.field_type != 15)
                  {
                    com.tencent.mm.pluginsdk.ui.tools.k.h(am.dE(ae.getAccSnsPath(), paramanu.mmR) + i.l(paramanu), t.this.context);
                    GMTrace.o(8613288476672L, 64174);
                    return;
                  }
                  t.IY(paramm.blY());
                  GMTrace.o(8613288476672L, 64174);
                  return;
                  paramAnonymousMenuItem = t.this;
                  long l = paramm.field_snsId;
                  com.tencent.mm.plugin.sns.storage.m localm = ae.bjd().dU(l);
                  if ((l == 0L) || (localm == null))
                  {
                    GMTrace.o(8613288476672L, 64174);
                    return;
                  }
                  Intent localIntent = new Intent();
                  localIntent.putExtra("k_username", localm.field_userName);
                  localIntent.putExtra("k_expose_msg_id", l);
                  localIntent.putExtra("showShare", false);
                  localIntent.putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(33) }));
                  d.b(paramAnonymousMenuItem.context, "webview", ".ui.tools.WebViewUI", localIntent);
                  GMTrace.o(8613288476672L, 64174);
                  return;
                  paramAnonymousMenuItem = new Bundle();
                  paramAnonymousMenuItem.putString("stat_msg_id", "sns_" + i.dt(paramm.field_snsId));
                  paramAnonymousMenuItem.putString("stat_send_msg_user", paramm.field_userName);
                  paramAnonymousMenuItem.putInt("stat_scene", 3);
                  t.this.I(paramAnonymousMenuItem);
                }
              }
            }
          }
        }
      };
      this.pSS.bFk();
      break;
      label1044:
      if (paramm.field_type == 1)
      {
        localArrayList1.add(this.context.getString(i.j.dUK));
        localArrayList2.add(Integer.valueOf(2));
        break label839;
      }
      localArrayList1.add(this.context.getString(i.j.pkv));
      localArrayList2.add(Integer.valueOf(2));
      break label839;
      label1118:
      localObject = this.context.getString(i.j.dQg);
      break label944;
      this.pSS = new f(this.context, f.xpQ, false);
    }
  }
  
  public final void bnv()
  {
    GMTrace.i(8556380160000L, 63750);
    Intent localIntent = new Intent();
    localIntent.putExtra("sns_cmd_list", this.pSQ);
    ((Activity)this.context).setResult(-1, localIntent);
    ((Activity)this.context).finish();
    GMTrace.o(8556380160000L, 63750);
  }
  
  public final void vd(int paramInt)
  {
    GMTrace.i(8556111724544L, 63748);
    if (paramInt == 0)
    {
      GMTrace.o(8556111724544L, 63748);
      return;
    }
    this.pSQ.uf(paramInt);
    GMTrace.o(8556111724544L, 63748);
  }
  
  public static abstract interface a
  {
    public abstract void ahC();
    
    public abstract void bT(String paramString, int paramInt);
    
    public abstract void bU(String paramString, int paramInt);
    
    public abstract void bnw();
    
    public abstract void dR(String paramString1, String paramString2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */