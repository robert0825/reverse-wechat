package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.PowerManager.WakeLock;
import android.os.SystemClock;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.g.a.gf;
import com.tencent.mm.g.a.ih;
import com.tencent.mm.g.a.lw;
import com.tencent.mm.g.a.rk;
import com.tencent.mm.modelmulti.m;
import com.tencent.mm.pluginsdk.i.p;
import com.tencent.mm.pluginsdk.p.u;
import com.tencent.mm.pluginsdk.p.x;
import com.tencent.mm.protocal.c.bjc;
import com.tencent.mm.sdk.platformtools.FLock;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.t.a;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import java.io.File;

public final class i
  implements com.tencent.mm.ad.e, com.tencent.mm.ad.f
{
  private static boolean wYw;
  public Activity eNu;
  public ProgressDialog htG;
  com.tencent.mm.sdk.b.c wYA;
  FLock wYB;
  public com.tencent.mm.ui.base.i wYp;
  public com.tencent.mm.ui.base.i wYq;
  public volatile boolean wYr;
  public boolean wYs;
  public g.a wYt;
  boolean wYu;
  public com.tencent.mm.modelmulti.g wYv;
  a wYx;
  a wYy;
  com.tencent.mm.sdk.b.c wYz;
  PowerManager.WakeLock wakeLock;
  
  static
  {
    GMTrace.i(14488401084416L, 107947);
    wYw = false;
    GMTrace.o(14488401084416L, 107947);
  }
  
  public i()
  {
    GMTrace.i(14485716729856L, 107927);
    this.wYp = null;
    this.wYq = null;
    this.wYs = false;
    this.wYt = new g.a();
    this.wakeLock = null;
    this.wYu = false;
    this.wYv = null;
    this.htG = null;
    this.wYz = new com.tencent.mm.sdk.b.c() {};
    this.wYA = new com.tencent.mm.sdk.b.c()
    {
      private boolean chh()
      {
        GMTrace.i(16020764884992L, 119364);
        if (i.this.eNu == null)
        {
          w.i("MicroMsg.InitHelper", "inithelper hasn't initialized");
          GMTrace.o(16020764884992L, 119364);
          return false;
        }
        i.this.wYs = false;
        i.this.che();
        GMTrace.o(16020764884992L, 119364);
        return false;
      }
    };
    GMTrace.o(14485716729856L, 107927);
  }
  
  private boolean aa(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(14486387818496L, 107932);
    at.AR();
    long l1 = com.tencent.mm.platformtools.t.d((Long)com.tencent.mm.y.c.xh().get(w.a.vpE, null));
    at.AR();
    long l2 = com.tencent.mm.platformtools.t.d((Long)com.tencent.mm.y.c.xh().get(w.a.vpG, null));
    at.AR();
    long l3 = com.tencent.mm.platformtools.t.d((Long)com.tencent.mm.y.c.xh().get(w.a.vpF, null));
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vpE, Long.valueOf(0L));
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vpF, Long.valueOf(0L));
    if ((l3 == com.tencent.mm.protocal.d.tJC) && (com.tencent.mm.platformtools.t.aG(l2) < 3600L)) {
      if (l1 == 1L)
      {
        if (com.tencent.mm.ui.t.c(this.eNu, 4, -17))
        {
          GMTrace.o(14486387818496L, 107932);
          return true;
        }
      }
      else if ((l1 == 2L) && (com.tencent.mm.ui.t.c(this.eNu, 4, -16)))
      {
        GMTrace.o(14486387818496L, 107932);
        return true;
      }
    }
    if ((paramInt1 == 4) && ((paramInt2 == -16) || (paramInt2 == -17)))
    {
      w.i("MicroMsg.InitHelper", "trigger check update: errCode:%d, sceneType:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      if (com.tencent.mm.platformtools.r.hjW) {
        ab.getContext().getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", com.tencent.mm.platformtools.t.Pu() - 86400L - 1L).commit();
      }
      if (com.tencent.mm.ui.t.c(this.eNu, paramInt1, paramInt2))
      {
        GMTrace.o(14486387818496L, 107932);
        return true;
      }
    }
    GMTrace.o(14486387818496L, 107932);
    return false;
  }
  
  public final void a(int paramInt1, int paramInt2, k paramk)
  {
    GMTrace.i(14486119383040L, 107930);
    if ((paramk == null) || (paramk.getType() != 139))
    {
      GMTrace.o(14486119383040L, 107930);
      return;
    }
    if (paramInt2 != 0) {}
    for (long l = paramInt1 * 100L / paramInt2;; l = 0L)
    {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14492830269440L, 107980);
          if ((!i.this.wYr) && (i.this.htG != null)) {
            i.this.htG.setMessage(i.this.eNu.getString(R.l.cTt) + this.hsX + "%");
          }
          GMTrace.o(14492830269440L, 107980);
        }
      });
      GMTrace.o(14486119383040L, 107930);
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(14486253600768L, 107931);
    if ((paramk.getType() != 138) && (paramk.getType() != 139))
    {
      if ((paramk.getType() != 113) && (paramk.getType() != 0))
      {
        aa(paramInt1, paramInt2, paramk.getType());
        GMTrace.o(14486253600768L, 107931);
        return;
      }
      w.i("MicroMsg.InitHelper", "onSceneEnd from GetUpdateInfo, ignore it.");
      GMTrace.o(14486253600768L, 107931);
      return;
    }
    int j = paramk.getType();
    int k = hashCode();
    if (this.wYv == null) {}
    for (int i = -2;; i = this.wYv.hashCode())
    {
      w.i("MicroMsg.InitHelper", "dkinit onSceneEnd:[%d,%d,%s] type:%d hash:%d init:%d ", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i) });
      if ((this.wYv != null) && (paramk.getType() == 139))
      {
        this.wYv = null;
        w.w("MicroMsg.InitHelper", "summerinit dkinit Kevin init FINISH : %d ", new Object[] { Long.valueOf(this.wYt.tD()) });
        ak.a.gmX.a(null, null, null);
        if (com.tencent.mm.plugin.sns.b.n.poP != null) {
          com.tencent.mm.plugin.sns.b.n.poP.bhN();
        }
        this.wYy.chj();
        if (this.wakeLock.isHeld())
        {
          w.w("MicroMsg.InitHelper", "onSceneEnd wakelock.release!");
          this.wakeLock.release();
        }
        at.xB().bQh();
        if (this.htG != null)
        {
          this.htG.dismiss();
          this.htG = null;
        }
      }
      if (!com.tencent.mm.ui.t.a(this.eNu, paramInt1, paramInt2, new Intent().setClass(this.eNu, LauncherUI.class).putExtra("Intro_Switch", true).putExtra("animation_pop_in", true).addFlags(67108864), paramString)) {
        break;
      }
      w.i("MicroMsg.InitHelper", "summerinit onSceneEnd accountExpired ret");
      GMTrace.o(14486253600768L, 107931);
      return;
    }
    if (!at.AU())
    {
      w.w("MicroMsg.InitHelper", "summerinit onSceneEnd not set uin");
      GMTrace.o(14486253600768L, 107931);
      return;
    }
    Object localObject;
    if (!this.wYu)
    {
      this.wYu = true;
      at.AR();
      localObject = (String)com.tencent.mm.y.c.xh().get(5, null);
      at.AR();
      if (((Integer)com.tencent.mm.y.c.xh().get(57, Integer.valueOf(0))).intValue() == 0) {
        break label606;
      }
    }
    label606:
    for (i = 1;; i = 0)
    {
      if ((i != 0) && (localObject != null)) {
        com.tencent.mm.ui.base.h.a(this.eNu, this.eNu.getString(R.l.dRj, new Object[] { localObject }), this.eNu.getString(R.l.cUG), this.eNu.getString(R.l.dRl), this.eNu.getString(R.l.dRk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(14479005843456L, 107877);
            paramAnonymousDialogInterface = new Intent();
            paramAnonymousDialogInterface.setClassName(i.this.eNu, "com.tencent.mm.ui.account.RegByFacebookSetPwdUI");
            i.this.eNu.startActivity(paramAnonymousDialogInterface);
            GMTrace.o(14479005843456L, 107877);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(14491756527616L, 107972);
            paramAnonymousDialogInterface.dismiss();
            GMTrace.o(14491756527616L, 107972);
          }
        });
      }
      if ((paramInt1 == 4) && (paramInt2 == -17) && (!wYw))
      {
        com.tencent.mm.modelmulti.q.JF().gE(7);
        wYw = true;
      }
      if (!aa(paramInt1, paramInt2, paramk.getType())) {
        break;
      }
      w.w("MicroMsg.InitHelper", "summerinit onSceneEnd checkUpdate ret");
      GMTrace.o(14486253600768L, 107931);
      return;
    }
    if (paramk.getType() == 139)
    {
      localObject = new ih();
      if ((paramInt1 != 3) || (paramInt2 != -1)) {
        break label696;
      }
      this.wYs = true;
      ((ih)localObject).eLL.eKo = false;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      this.wYx.cgQ();
    }
    while (t.a.a(this.eNu, paramInt1, paramInt2, paramString, 4))
    {
      GMTrace.o(14486253600768L, 107931);
      return;
      label696:
      ((ih)localObject).eLL.eKo = true;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    }
    if (paramk.getType() == 139)
    {
      new com.tencent.mm.sdk.platformtools.ae().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14475381964800L, 107850);
          com.tencent.mm.modelmulti.q.JF().gE(5);
          GMTrace.o(14475381964800L, 107850);
        }
      });
      if ((com.tencent.mm.y.q.zK() & 0x80) != 0)
      {
        at.AR();
        if (com.tencent.mm.y.c.yP().TO("masssendapp") == null)
        {
          paramString = new com.tencent.mm.storage.ae();
          paramString.setUsername("masssendapp");
          paramString.setContent(ab.getContext().getResources().getString(R.l.djS));
          paramString.x(com.tencent.mm.platformtools.t.Pv() + 2000L);
          paramString.dC(0);
          paramString.dz(0);
          at.AR();
          com.tencent.mm.y.c.yP().d(paramString);
          paramInt1 = com.tencent.mm.y.q.zK();
          at.AR();
          com.tencent.mm.y.c.xh().set(40, Integer.valueOf(paramInt1 & 0xFF7F));
        }
      }
    }
    if ((paramk.getType() == 138) || (paramk.getType() == 139))
    {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14493098704896L, 107982);
          gf localgf = new gf();
          localgf.eJp.data = "MAIN_UI_EVENT_INIT_FINALLY";
          com.tencent.mm.sdk.b.a.vgX.m(localgf);
          GMTrace.o(14493098704896L, 107982);
        }
      });
      this.wYx.cgQ();
    }
    GMTrace.o(14486253600768L, 107931);
  }
  
  final boolean chd()
  {
    GMTrace.i(14485850947584L, 107928);
    if (!m.JC())
    {
      GMTrace.o(14485850947584L, 107928);
      return false;
    }
    if ((this.wYq != null) && (this.wYq.isShowing()))
    {
      GMTrace.o(14485850947584L, 107928);
      return false;
    }
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.e locale = com.tencent.mm.kernel.h.xy();
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xw().wG();
    int i;
    boolean bool;
    if ((bg.nl((String)locale.fYX.get(8195, null)).length() <= 0) || (bg.e((Integer)locale.fYX.get(15, null)) == 0))
    {
      i = 1;
      if ((i == 0) || (locale.xd() == null)) {
        break label263;
      }
      bool = true;
      label129:
      this.wYr = bool;
      if (!this.wYr) {
        break label268;
      }
      this.wYq = new com.tencent.mm.ui.base.i.a(this.eNu).BN(R.l.dmr).VA(this.eNu.getString(R.l.dmq)).lz(false).BQ(R.l.dms).a(new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(14513768235008L, 108136);
          i.this.wYq.dismiss();
          i.this.che();
          GMTrace.o(14513768235008L, 108136);
        }
      }).BR(R.l.dmp).b(new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(14485582512128L, 107926);
          i.this.wYq.dismiss();
          i.this.wYr = false;
          i.this.che();
          GMTrace.o(14485582512128L, 107926);
        }
      }).aax();
      this.wYq.show();
      com.tencent.mm.kernel.h.xz();
      new File(com.tencent.mm.kernel.h.xy().cachePath, "EnMicroMsg.db.corrupt").delete();
    }
    for (;;)
    {
      GMTrace.o(14485850947584L, 107928);
      return true;
      i = 0;
      break;
      label263:
      bool = false;
      break label129;
      label268:
      che();
    }
  }
  
  public final void che()
  {
    GMTrace.i(14485985165312L, 107929);
    if (this.wYs)
    {
      w.i("MicroMsg.InitHelper", "summerinit doInit but hasTryDoInitButFailed true ret");
      GMTrace.o(14485985165312L, 107929);
      return;
    }
    if (!this.wakeLock.isHeld())
    {
      w.w("MicroMsg.InitHelper", "tryDoInit wakelock.acquire!");
      this.wakeLock.acquire();
    }
    this.wYy.chi();
    if (this.wYr) {
      ((com.tencent.mm.plugin.dbbackup.d)at.AK().gZ("plugin.dbbackup")).b(new com.tencent.mm.plugin.dbbackup.b()
      {
        public final void mr(final int paramAnonymousInt)
        {
          GMTrace.i(14492293398528L, 107976);
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(14475650400256L, 107852);
              if (paramAnonymousInt == -2)
              {
                Toast.makeText(i.this.eNu, R.l.dQz, 1).show();
                GMTrace.o(14475650400256L, 107852);
                return;
              }
              if (paramAnonymousInt == 0)
              {
                Toast.makeText(i.this.eNu, R.l.dQA, 0).show();
                GMTrace.o(14475650400256L, 107852);
                return;
              }
              Toast.makeText(i.this.eNu, R.l.dQw, 1).show();
              GMTrace.o(14475650400256L, 107852);
            }
          });
          i.this.wYr = false;
          if (i.this.wYv == null)
          {
            if (com.tencent.mm.plugin.sns.b.n.poP != null) {
              com.tencent.mm.plugin.sns.b.n.poP.bhM();
            }
            i.this.wYv = new com.tencent.mm.modelmulti.g(i.this);
            w.d("MicroMsg.InitHelper", "dkinit doInit t:%d initScene:%d", new Object[] { Long.valueOf(i.this.wYt.tD()), Integer.valueOf(i.this.wYv.hashCode()) });
            i.this.wYt.fSo = SystemClock.elapsedRealtime();
            at.wS().a(i.this.wYv, 0);
          }
          GMTrace.o(14492293398528L, 107976);
        }
      });
    }
    for (;;)
    {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14489474826240L, 107955);
          long l = i.this.wYt.tD();
          int i;
          i locali;
          Activity localActivity;
          if (i.this.wYv == null)
          {
            i = -2;
            w.d("MicroMsg.InitHelper", "dkinit showProgressDlg t:%d initScene:%d", new Object[] { Long.valueOf(l), Integer.valueOf(i) });
            if ((i.this.htG != null) && (i.this.htG.isShowing())) {
              i.this.htG.dismiss();
            }
            if (!i.this.wYr) {
              break label183;
            }
            locali = i.this;
            localActivity = i.this.eNu;
            i.this.eNu.getString(R.l.cUG);
          }
          for (locali.htG = com.tencent.mm.ui.base.h.a(localActivity, i.this.eNu.getString(R.l.dQx), false, null);; locali.htG = com.tencent.mm.ui.base.h.a(localActivity, i.this.eNu.getString(R.l.cTt), false, new DialogInterface.OnCancelListener()
              {
                public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
                {
                  GMTrace.i(14493367140352L, 107984);
                  at.wS().c(i.this.wYv);
                  if (com.tencent.mm.plugin.sns.b.n.poP != null) {
                    com.tencent.mm.plugin.sns.b.n.poP.bhN();
                  }
                  GMTrace.o(14493367140352L, 107984);
                }
              }))
          {
            at.xB().bQf();
            GMTrace.o(14489474826240L, 107955);
            return;
            i = i.this.wYv.hashCode();
            break;
            label183:
            locali = i.this;
            localActivity = i.this.eNu;
            i.this.eNu.getString(R.l.cUG);
          }
        }
      });
      GMTrace.o(14485985165312L, 107929);
      return;
      if (this.wYv == null)
      {
        if (com.tencent.mm.plugin.sns.b.n.poP != null) {
          com.tencent.mm.plugin.sns.b.n.poP.bhM();
        }
        this.wYv = new com.tencent.mm.modelmulti.g(this);
        w.d("MicroMsg.InitHelper", "dkinit doInit t:%d initScene:%d", new Object[] { Long.valueOf(this.wYt.tD()), Integer.valueOf(this.wYv.hashCode()) });
        this.wYt.fSo = SystemClock.elapsedRealtime();
        at.wS().a(this.wYv, 0);
      }
    }
  }
  
  final int chf()
  {
    GMTrace.i(14486522036224L, 107933);
    if (this.wYv == null)
    {
      GMTrace.o(14486522036224L, 107933);
      return -2;
    }
    int i = this.wYv.hashCode();
    GMTrace.o(14486522036224L, 107933);
    return i;
  }
  
  public final boolean chg()
  {
    GMTrace.i(14486656253952L, 107934);
    if (this.wYv != null)
    {
      GMTrace.o(14486656253952L, 107934);
      return true;
    }
    GMTrace.o(14486656253952L, 107934);
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void chi();
    
    public abstract void chj();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */