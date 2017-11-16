package com.tencent.mm.plugin.backup.backuppcui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.backup.a.b.c;
import com.tencent.mm.plugin.backup.a.f;
import com.tencent.mm.plugin.backup.backuppcmodel.b;
import com.tencent.mm.plugin.backup.backuppcmodel.e;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.y.at;
import java.util.Set;

@com.tencent.mm.ui.base.a(3)
public class BackupPcUI
  extends MMWizardActivity
{
  private static boolean iZm;
  private boolean iZn;
  private TextView iZo;
  private TextView iZp;
  private TextView iZq;
  private TextView iZr;
  private TextView iZs;
  private ImageView iZt;
  public b.c jaZ;
  
  static
  {
    GMTrace.i(9570663530496L, 71307);
    iZm = false;
    GMTrace.o(9570663530496L, 71307);
  }
  
  public BackupPcUI()
  {
    GMTrace.i(9567173869568L, 71281);
    this.iZn = false;
    this.jaZ = new b.c()
    {
      private void afc()
      {
        GMTrace.i(18446347665408L, 137436);
        BackupPcUI.i(BackupPcUI.this).setText(R.l.cVk);
        BackupPcUI.i(BackupPcUI.this).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymous2View)
          {
            GMTrace.i(18440442085376L, 137392);
            BackupPcUI.n(BackupPcUI.this);
            GMTrace.o(18440442085376L, 137392);
          }
        });
        GMTrace.o(18446347665408L, 137436);
      }
      
      private void afe()
      {
        GMTrace.i(18446481883136L, 137437);
        BackupPcUI.i(BackupPcUI.this).setText(R.l.cVm);
        BackupPcUI.i(BackupPcUI.this).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymous2View)
          {
            GMTrace.i(18442321133568L, 137406);
            BackupPcUI.o(BackupPcUI.this);
            GMTrace.o(18442321133568L, 137406);
          }
        });
        GMTrace.o(18446481883136L, 137437);
      }
      
      private void afq()
      {
        GMTrace.i(18446213447680L, 137435);
        if ((1 == b.afh().afi().jas) || (3 == b.afh().afi().jas))
        {
          BackupPcUI.c(BackupPcUI.this).setImageResource(R.k.cJN);
          GMTrace.o(18446213447680L, 137435);
          return;
        }
        if ((2 == b.afh().afi().jas) || (4 == b.afh().afi().jas)) {
          BackupPcUI.c(BackupPcUI.this).setImageResource(R.k.cJR);
        }
        GMTrace.o(18446213447680L, 137435);
      }
      
      public final void a(f paramAnonymousf)
      {
        GMTrace.i(18445945012224L, 137433);
        w.i("MicroMsg.BackupPcUI", "onUpdateUIProgress backupPcState:%d", new Object[] { Integer.valueOf(paramAnonymousf.iVu) });
        switch (paramAnonymousf.iVu)
        {
        }
        for (;;)
        {
          GMTrace.o(18445945012224L, 137433);
          return;
          BackupPcUI.b(BackupPcUI.this);
          GMTrace.o(18445945012224L, 137433);
          return;
          BackupPcUI.c(BackupPcUI.this).setImageResource(R.k.cJP);
          BackupPcUI.d(BackupPcUI.this).setText(R.l.cWy);
          BackupPcUI.e(BackupPcUI.this).setVisibility(4);
          BackupPcUI.f(BackupPcUI.this).setVisibility(4);
          BackupPcUI.g(BackupPcUI.this).setVisibility(4);
          afc();
          GMTrace.o(18445945012224L, 137433);
          return;
          BackupPcUI.c(BackupPcUI.this).setImageResource(R.k.cJP);
          BackupPcUI.d(BackupPcUI.this).setText(R.l.cXt);
          BackupPcUI.e(BackupPcUI.this).setText(R.l.cXs);
          BackupPcUI.e(BackupPcUI.this).setTextColor(BackupPcUI.this.getResources().getColor(R.e.aMT));
          BackupPcUI.f(BackupPcUI.this).setText(R.l.cXq);
          BackupPcUI.g(BackupPcUI.this).setText(R.l.cXr);
          BackupPcUI.e(BackupPcUI.this).setVisibility(0);
          BackupPcUI.f(BackupPcUI.this).setVisibility(0);
          BackupPcUI.g(BackupPcUI.this).setVisibility(0);
          afc();
          BackupPcUI.f(BackupPcUI.this).setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymous2View)
            {
              GMTrace.i(18443663310848L, 137416);
              at.AR();
              boolean bool = ((Boolean)com.tencent.mm.y.c.xh().get(w.a.vvW, Boolean.valueOf(false))).booleanValue();
              w.i("MicroMsg.BackupPcUI", "onBackupPcUpdateUICallback onUpdateUIProgress startbackup all, hasMove:%s", new Object[] { Boolean.valueOf(bool) });
              if (bool)
              {
                com.tencent.mm.ui.base.h.a(BackupPcUI.this, R.l.cWT, 0, R.l.cXE, 0, new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
                  {
                    GMTrace.i(18440978956288L, 137396);
                    b.afh().afi();
                    com.tencent.mm.plugin.backup.backuppcmodel.c.kA(2);
                    b.afh().aei().iVu = 12;
                    BackupPcUI.3.this.a(b.afh().aei());
                    b.afh().afl().aeE();
                    b.afh().afl().dc(true);
                    g.ork.a(400L, 7L, 1L, false);
                    g.ork.i(13735, new Object[] { Integer.valueOf(9), Integer.valueOf(b.afh().afi().jaw) });
                    GMTrace.o(18440978956288L, 137396);
                  }
                }, null, R.e.aMR);
                GMTrace.o(18443663310848L, 137416);
                return;
              }
              b.afh().afi();
              com.tencent.mm.plugin.backup.backuppcmodel.c.kA(2);
              b.afh().aei().iVu = 12;
              BackupPcUI.3.this.a(b.afh().aei());
              b.afh().afl().cancel();
              b.afh().afl().aeE();
              b.afh().afl().dc(true);
              g.ork.a(400L, 7L, 1L, false);
              g.ork.i(13735, new Object[] { Integer.valueOf(9), Integer.valueOf(b.afh().afi().jaw) });
              GMTrace.o(18443663310848L, 137416);
            }
          });
          BackupPcUI.g(BackupPcUI.this).setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymous2View)
            {
              GMTrace.i(18441784262656L, 137402);
              paramAnonymous2View = new Intent(BackupPcUI.this, BackupPcChooseUI.class);
              MMWizardActivity.A(BackupPcUI.this, paramAnonymous2View);
              b.afh().afl().cancel();
              b.afh().afl().aeE();
              b.afh().afl().dc(false);
              GMTrace.o(18441784262656L, 137402);
            }
          });
          GMTrace.o(18445945012224L, 137433);
          return;
          BackupPcUI.c(BackupPcUI.this).setImageResource(R.k.cJP);
          BackupPcUI.d(BackupPcUI.this).setText(R.l.cWX);
          BackupPcUI.e(BackupPcUI.this).setText(R.l.cWY);
          BackupPcUI.e(BackupPcUI.this).setTextColor(BackupPcUI.this.getResources().getColor(R.e.aMT));
          BackupPcUI.e(BackupPcUI.this).setVisibility(0);
          BackupPcUI.f(BackupPcUI.this).setVisibility(4);
          BackupPcUI.g(BackupPcUI.this).setVisibility(4);
          afe();
          GMTrace.o(18445945012224L, 137433);
          return;
          BackupPcUI.c(BackupPcUI.this).setImageResource(R.k.cJP);
          TextView localTextView = BackupPcUI.d(BackupPcUI.this);
          BackupPcUI localBackupPcUI = BackupPcUI.this;
          int i = R.l.cXy;
          int j = paramAnonymousf.iVv;
          int k = paramAnonymousf.iVw;
          b.afh().afi();
          localTextView.setText(localBackupPcUI.getString(i, new Object[] { Integer.valueOf(j), Integer.valueOf(k), com.tencent.mm.plugin.backup.backuppcmodel.c.afn() }));
          BackupPcUI.e(BackupPcUI.this).setText(R.l.cWY);
          BackupPcUI.e(BackupPcUI.this).setTextColor(BackupPcUI.this.getResources().getColor(R.e.aMT));
          BackupPcUI.e(BackupPcUI.this).setVisibility(0);
          BackupPcUI.f(BackupPcUI.this).setVisibility(4);
          BackupPcUI.g(BackupPcUI.this).setVisibility(4);
          afe();
          GMTrace.o(18445945012224L, 137433);
          return;
          BackupPcUI.c(BackupPcUI.this).setImageResource(R.k.cJO);
          BackupPcUI.d(BackupPcUI.this).setText(R.l.cWu);
          BackupPcUI.e(BackupPcUI.this).setText(BackupPcUI.this.getString(R.l.cWv, new Object[] { Integer.valueOf(paramAnonymousf.iVv), Integer.valueOf(paramAnonymousf.iVw) }));
          BackupPcUI.e(BackupPcUI.this).setTextColor(BackupPcUI.this.getResources().getColor(R.e.aMT));
          BackupPcUI.f(BackupPcUI.this).setText(R.l.cVl);
          BackupPcUI.e(BackupPcUI.this).setVisibility(0);
          BackupPcUI.f(BackupPcUI.this).setVisibility(0);
          BackupPcUI.g(BackupPcUI.this).setVisibility(4);
          BackupPcUI.f(BackupPcUI.this).setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymous2View)
            {
              GMTrace.i(18442052698112L, 137404);
              b.afh().aeI().stop();
              b.afh().afj().bK(true);
              b.afh().aei().iVu = -100;
              BackupPcUI.h(BackupPcUI.this);
              GMTrace.o(18442052698112L, 137404);
            }
          });
          afc();
          GMTrace.o(18445945012224L, 137433);
          return;
          BackupPcUI.c(BackupPcUI.this).setImageResource(R.k.cJT);
          BackupPcUI.d(BackupPcUI.this).setText(R.l.cXf);
          BackupPcUI.f(BackupPcUI.this).setText(R.l.cXe);
          BackupPcUI.e(BackupPcUI.this).setVisibility(4);
          BackupPcUI.f(BackupPcUI.this).setVisibility(0);
          BackupPcUI.g(BackupPcUI.this).setVisibility(4);
          BackupPcUI.f(BackupPcUI.this).setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymous2View)
            {
              GMTrace.i(18444468617216L, 137422);
              g.ork.i(13735, new Object[] { Integer.valueOf(23), Integer.valueOf(b.afh().afi().jaw) });
              b.afh().afi();
              com.tencent.mm.plugin.backup.backuppcmodel.c.kA(4);
              b.afh().aei().iVu = 22;
              BackupPcUI.3.this.a(b.afh().aei());
              g.ork.a(400L, 16L, 1L, false);
              GMTrace.o(18444468617216L, 137422);
            }
          });
          afc();
          GMTrace.o(18445945012224L, 137433);
          return;
          BackupPcUI.c(BackupPcUI.this).setImageResource(R.k.cJT);
          BackupPcUI.d(BackupPcUI.this).setText(R.l.cWX);
          BackupPcUI.e(BackupPcUI.this).setText(R.l.cWY);
          BackupPcUI.e(BackupPcUI.this).setTextColor(BackupPcUI.this.getResources().getColor(R.e.aMT));
          BackupPcUI.e(BackupPcUI.this).setVisibility(0);
          BackupPcUI.f(BackupPcUI.this).setVisibility(4);
          BackupPcUI.g(BackupPcUI.this).setVisibility(4);
          afe();
          GMTrace.o(18445945012224L, 137433);
          return;
          BackupPcUI.c(BackupPcUI.this).setImageResource(R.k.cJT);
          localTextView = BackupPcUI.d(BackupPcUI.this);
          localBackupPcUI = BackupPcUI.this;
          i = R.l.cXh;
          j = paramAnonymousf.iVv;
          k = paramAnonymousf.iVw;
          b.afh().afi();
          localTextView.setText(localBackupPcUI.getString(i, new Object[] { Integer.valueOf(j), Integer.valueOf(k), com.tencent.mm.plugin.backup.backuppcmodel.c.afn() }));
          BackupPcUI.e(BackupPcUI.this).setText(R.l.cWY);
          BackupPcUI.e(BackupPcUI.this).setTextColor(BackupPcUI.this.getResources().getColor(R.e.aMT));
          BackupPcUI.e(BackupPcUI.this).setVisibility(0);
          BackupPcUI.f(BackupPcUI.this).setVisibility(4);
          BackupPcUI.g(BackupPcUI.this).setVisibility(4);
          afe();
          GMTrace.o(18445945012224L, 137433);
          return;
          if (bg.bx(BackupPcUI.this))
          {
            b.afh().aei().iVu = 24;
            paramAnonymousf = b.afh().aei();
            break;
            if (BackupPcUI.afp())
            {
              BackupPcUI.c(BackupPcUI.this).setImageResource(R.k.cJT);
              BackupPcUI.d(BackupPcUI.this).setText(R.l.cXi);
              BackupPcUI.e(BackupPcUI.this).setText(R.l.cXk);
              BackupPcUI.e(BackupPcUI.this).setTextColor(BackupPcUI.this.getResources().getColor(R.e.aMT));
              BackupPcUI.f(BackupPcUI.this).setText(R.l.cXd);
              BackupPcUI.g(BackupPcUI.this).setText(R.l.cXg);
              BackupPcUI.i(BackupPcUI.this).setText(R.l.cXz);
              BackupPcUI.e(BackupPcUI.this).setVisibility(0);
              BackupPcUI.f(BackupPcUI.this).setVisibility(0);
              BackupPcUI.g(BackupPcUI.this).setVisibility(0);
              BackupPcUI.f(BackupPcUI.this).setOnClickListener(new View.OnClickListener()
              {
                public final void onClick(View paramAnonymous2View)
                {
                  GMTrace.i(18444200181760L, 137420);
                  b.afh().afk();
                  if (!com.tencent.mm.plugin.backup.backuppcmodel.d.aeM())
                  {
                    b.afh().afk();
                    if (!com.tencent.mm.plugin.backup.backuppcmodel.d.aeM())
                    {
                      b.afh().aei().iVu = -22;
                      BackupPcUI.3.this.a(b.afh().aei());
                      g.ork.a(400L, 64L, 1L, false);
                      GMTrace.o(18444200181760L, 137420);
                      return;
                    }
                  }
                  g.ork.i(13735, new Object[] { Integer.valueOf(27), Integer.valueOf(b.afh().afi().jaw) });
                  b.afh().afk().aew();
                  GMTrace.o(18444200181760L, 137420);
                }
              });
              BackupPcUI.g(BackupPcUI.this).setOnClickListener(new View.OnClickListener()
              {
                public final void onClick(View paramAnonymous2View)
                {
                  GMTrace.i(18444737052672L, 137424);
                  com.tencent.mm.ui.base.h.a(BackupPcUI.this, R.l.cWD, R.l.cWC, R.l.cXv, R.l.cVi, new DialogInterface.OnClickListener()
                  {
                    public final void onClick(DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
                    {
                      GMTrace.i(18440710520832L, 137394);
                      w.i("MicroMsg.BackupPcUI", "user click close. stop recover merge.");
                      g.ork.a(400L, 26L, 1L, false);
                      b.afh().aeI().stop();
                      b.afh().afk().a(true, true, -100);
                      GMTrace.o(18440710520832L, 137394);
                    }
                  }, null, R.e.aMS);
                  GMTrace.o(18444737052672L, 137424);
                }
              });
              BackupPcUI.i(BackupPcUI.this).setOnClickListener(new View.OnClickListener()
              {
                public final void onClick(View paramAnonymous2View)
                {
                  GMTrace.i(18441515827200L, 137400);
                  b.afh().aei().iVu = 25;
                  BackupPcUI.j(BackupPcUI.this);
                  GMTrace.o(18441515827200L, 137400);
                }
              });
              GMTrace.o(18445945012224L, 137433);
              return;
            }
            if (bg.bx(BackupPcUI.this))
            {
              b.afh().afk();
              if (!com.tencent.mm.plugin.backup.backuppcmodel.d.aeM())
              {
                b.afh().aei().iVu = -22;
                a(b.afh().aei());
                g.ork.a(400L, 64L, 1L, false);
                GMTrace.o(18445945012224L, 137433);
                return;
              }
              b.afh().afk().aew();
              GMTrace.o(18445945012224L, 137433);
              return;
              BackupPcUI.c(BackupPcUI.this).setImageResource(R.k.cJT);
              BackupPcUI.d(BackupPcUI.this).setText(BackupPcUI.this.getString(R.l.cWZ, new Object[] { Integer.valueOf(paramAnonymousf.iVv), Integer.valueOf(paramAnonymousf.iVw) }));
              BackupPcUI.e(BackupPcUI.this).setText(R.l.cXc);
              BackupPcUI.e(BackupPcUI.this).setTextColor(BackupPcUI.this.getResources().getColor(R.e.aMT));
              BackupPcUI.i(BackupPcUI.this).setText(R.l.cXg);
              BackupPcUI.e(BackupPcUI.this).setVisibility(0);
              BackupPcUI.f(BackupPcUI.this).setVisibility(4);
              BackupPcUI.g(BackupPcUI.this).setVisibility(4);
              afc();
              GMTrace.o(18445945012224L, 137433);
              return;
              BackupPcUI.c(BackupPcUI.this).setImageResource(R.k.cJS);
              BackupPcUI.d(BackupPcUI.this).setText(R.l.cXa);
              BackupPcUI.e(BackupPcUI.this).setText(BackupPcUI.this.getString(R.l.cXb, new Object[] { Integer.valueOf(paramAnonymousf.iVv), Integer.valueOf(paramAnonymousf.iVw) }));
              BackupPcUI.e(BackupPcUI.this).setTextColor(BackupPcUI.this.getResources().getColor(R.e.aMT));
              BackupPcUI.f(BackupPcUI.this).setText(R.l.cVl);
              BackupPcUI.e(BackupPcUI.this).setVisibility(0);
              BackupPcUI.f(BackupPcUI.this).setVisibility(0);
              BackupPcUI.g(BackupPcUI.this).setVisibility(4);
              BackupPcUI.f(BackupPcUI.this).setOnClickListener(new View.OnClickListener()
              {
                public final void onClick(View paramAnonymous2View)
                {
                  GMTrace.i(18446884536320L, 137440);
                  b.afh().aeI().stop();
                  b.afh().aei().iVu = -100;
                  BackupPcUI.k(BackupPcUI.this);
                  GMTrace.o(18446884536320L, 137440);
                }
              });
              afc();
              GMTrace.o(18445945012224L, 137433);
              return;
              if ((1 == b.afh().afi().jas) || (3 == b.afh().afi().jas))
              {
                BackupPcUI.c(BackupPcUI.this).setImageResource(R.k.cJN);
                BackupPcUI.d(BackupPcUI.this).setText(BackupPcUI.this.getString(R.l.cXy, new Object[] { Integer.valueOf(paramAnonymousf.iVv), Integer.valueOf(paramAnonymousf.iVw), "0M" }));
                BackupPcUI.e(BackupPcUI.this).setText(R.l.cWM);
                BackupPcUI.g(BackupPcUI.this).setText(R.l.cXu);
                BackupPcUI.g(BackupPcUI.this).setOnClickListener(new View.OnClickListener()
                {
                  public final void onClick(View paramAnonymous2View)
                  {
                    GMTrace.i(18437623513088L, 137371);
                    com.tencent.mm.ui.base.h.a(BackupPcUI.this, R.l.cWB, R.l.cWA, R.l.cXu, R.l.cVi, new DialogInterface.OnClickListener()
                    {
                      public final void onClick(DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
                      {
                        GMTrace.i(18445273923584L, 137428);
                        w.i("MicroMsg.BackupPcUI", "user click close. stop backup.");
                        g.ork.a(400L, 10L, 1L, false);
                        b.afh().aeI().stop();
                        b.afh().afj().bK(true);
                        b.afh().aei().iVu = -100;
                        BackupPcUI.l(BackupPcUI.this);
                        GMTrace.o(18445273923584L, 137428);
                      }
                    }, null, R.e.aMS);
                    GMTrace.o(18437623513088L, 137371);
                  }
                });
              }
              for (;;)
              {
                BackupPcUI.e(BackupPcUI.this).setTextColor(BackupPcUI.this.getResources().getColor(R.e.aMS));
                BackupPcUI.e(BackupPcUI.this).setVisibility(0);
                BackupPcUI.f(BackupPcUI.this).setVisibility(4);
                BackupPcUI.g(BackupPcUI.this).setVisibility(0);
                afe();
                GMTrace.o(18445945012224L, 137433);
                return;
                if ((2 == b.afh().afi().jas) || (4 == b.afh().afi().jas))
                {
                  BackupPcUI.c(BackupPcUI.this).setImageResource(R.k.cJR);
                  BackupPcUI.d(BackupPcUI.this).setText(BackupPcUI.this.getString(R.l.cXh, new Object[] { Integer.valueOf(paramAnonymousf.iVv), Integer.valueOf(paramAnonymousf.iVw), "0M" }));
                  BackupPcUI.e(BackupPcUI.this).setText(R.l.cWR);
                  BackupPcUI.g(BackupPcUI.this).setText(R.l.cXw);
                  BackupPcUI.g(BackupPcUI.this).setOnClickListener(new View.OnClickListener()
                  {
                    public final void onClick(View paramAnonymous2View)
                    {
                      GMTrace.i(18447152971776L, 137442);
                      com.tencent.mm.ui.base.h.a(BackupPcUI.this, R.l.cWD, R.l.cWC, R.l.cXv, R.l.cVi, new DialogInterface.OnClickListener()
                      {
                        public final void onClick(DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
                        {
                          GMTrace.i(18441247391744L, 137398);
                          w.i("MicroMsg.BackupPcUI", "user click close. stop recover.");
                          g.ork.a(400L, 18L, 1L, false);
                          b.afh().aeI().stop();
                          b.afh().afk().a(true, true, -100);
                          GMTrace.o(18441247391744L, 137398);
                        }
                      }, null, R.e.aMS);
                      GMTrace.o(18447152971776L, 137442);
                    }
                  });
                }
              }
              afq();
              BackupPcUI.d(BackupPcUI.this).setText(R.l.cWO);
              paramAnonymousf = com.tencent.mm.plugin.backup.a.h.bY(BackupPcUI.this);
              if ((paramAnonymousf == null) || (paramAnonymousf.equals(""))) {
                BackupPcUI.e(BackupPcUI.this).setText(BackupPcUI.this.getString(R.l.cWP, new Object[] { b.afh().afi().jat, "移动网络" }));
              }
              for (;;)
              {
                BackupPcUI.e(BackupPcUI.this).setTextColor(BackupPcUI.this.getResources().getColor(R.e.aMS));
                BackupPcUI.g(BackupPcUI.this).setText(R.l.cWS);
                BackupPcUI.e(BackupPcUI.this).setVisibility(0);
                BackupPcUI.f(BackupPcUI.this).setVisibility(4);
                BackupPcUI.g(BackupPcUI.this).setVisibility(0);
                BackupPcUI.g(BackupPcUI.this).setOnClickListener(new View.OnClickListener()
                {
                  public final void onClick(View paramAnonymous2View)
                  {
                    GMTrace.i(18443931746304L, 137418);
                    BackupPcUI.m(BackupPcUI.this);
                    GMTrace.o(18443931746304L, 137418);
                  }
                });
                afc();
                GMTrace.o(18445945012224L, 137433);
                return;
                BackupPcUI.e(BackupPcUI.this).setText(BackupPcUI.this.getString(R.l.cWP, new Object[] { b.afh().afi().jat, paramAnonymousf }));
              }
              afq();
              BackupPcUI.d(BackupPcUI.this).setText(R.l.cWG);
              BackupPcUI.g(BackupPcUI.this).setText(R.l.cWS);
              BackupPcUI.e(BackupPcUI.this).setVisibility(4);
              BackupPcUI.f(BackupPcUI.this).setVisibility(4);
              BackupPcUI.g(BackupPcUI.this).setVisibility(0);
              BackupPcUI.g(BackupPcUI.this).setOnClickListener(new View.OnClickListener()
              {
                public final void onClick(View paramAnonymous2View)
                {
                  GMTrace.i(18445676576768L, 137431);
                  BackupPcUI.m(BackupPcUI.this);
                  GMTrace.o(18445676576768L, 137431);
                }
              });
              afc();
              GMTrace.o(18445945012224L, 137433);
              return;
              afq();
              BackupPcUI.d(BackupPcUI.this).setText(R.l.cWH);
              BackupPcUI.e(BackupPcUI.this).setVisibility(4);
              BackupPcUI.f(BackupPcUI.this).setVisibility(4);
              BackupPcUI.g(BackupPcUI.this).setVisibility(4);
              afc();
              GMTrace.o(18445945012224L, 137433);
              return;
              afq();
              BackupPcUI.d(BackupPcUI.this).setText(R.l.cWQ);
              BackupPcUI.e(BackupPcUI.this).setVisibility(4);
              BackupPcUI.f(BackupPcUI.this).setVisibility(4);
              BackupPcUI.g(BackupPcUI.this).setVisibility(4);
              afc();
              GMTrace.o(18445945012224L, 137433);
              return;
              afq();
              BackupPcUI.d(BackupPcUI.this).setText(R.l.cWN);
              b.afh().aeI().stop();
              BackupPcUI.e(BackupPcUI.this).setVisibility(4);
              BackupPcUI.f(BackupPcUI.this).setVisibility(4);
              BackupPcUI.g(BackupPcUI.this).setVisibility(4);
              afc();
              GMTrace.o(18445945012224L, 137433);
              return;
              afq();
              BackupPcUI.d(BackupPcUI.this).setText(R.l.cWL);
              b.afh().aeI().stop();
              BackupPcUI.e(BackupPcUI.this).setVisibility(4);
              BackupPcUI.f(BackupPcUI.this).setVisibility(4);
              BackupPcUI.g(BackupPcUI.this).setVisibility(4);
              afc();
              GMTrace.o(18445945012224L, 137433);
              return;
              afq();
              BackupPcUI.d(BackupPcUI.this).setText(R.l.cWI);
              BackupPcUI.e(BackupPcUI.this).setVisibility(4);
              BackupPcUI.f(BackupPcUI.this).setVisibility(4);
              BackupPcUI.g(BackupPcUI.this).setVisibility(4);
              afc();
            }
          }
        }
      }
      
      public final void aef()
      {
        GMTrace.i(18445810794496L, 137432);
        int i = b.afh().afi().jas;
        w.i("MicroMsg.BackupPcUI", "onBackupPcUpdateUICallback onBackupPcStart, commandMode[%d]", new Object[] { Integer.valueOf(i) });
        switch (i)
        {
        }
        for (;;)
        {
          GMTrace.o(18445810794496L, 137432);
          return;
          b.afh().aei().iVu = 11;
          a(b.afh().aei());
          GMTrace.o(18445810794496L, 137432);
          return;
          b.afh().aei().iVu = 21;
          a(b.afh().aei());
          GMTrace.o(18445810794496L, 137432);
          return;
          b.afh().aei().iVu = 12;
          a(b.afh().aei());
          GMTrace.o(18445810794496L, 137432);
          return;
          b.afh().aei().iVu = 22;
          a(b.afh().aei());
        }
      }
      
      public final void aeg()
      {
        GMTrace.i(18446616100864L, 137438);
        GMTrace.o(18446616100864L, 137438);
      }
      
      public final void cX(boolean paramAnonymousBoolean)
      {
        GMTrace.i(18446079229952L, 137434);
        w.i("MicroMsg.BackupPcUI", "onBackupPcUpdateUICallback onDisableUIOperation disableButton[%b]", new Object[] { Boolean.valueOf(BackupPcUI.a(BackupPcUI.this)) });
        BackupPcUI.a(BackupPcUI.this, paramAnonymousBoolean);
        if (paramAnonymousBoolean)
        {
          BackupPcUI.i(BackupPcUI.this).setEnabled(false);
          GMTrace.o(18446079229952L, 137434);
          return;
        }
        BackupPcUI.i(BackupPcUI.this).setEnabled(true);
        GMTrace.o(18446079229952L, 137434);
      }
    };
    GMTrace.o(9567173869568L, 71281);
  }
  
  private void afd()
  {
    GMTrace.i(9568784482304L, 71293);
    int i = b.afh().aei().iVu;
    w.i("MicroMsg.BackupPcUI", "closeImpl, backupPcState:%d, disableButton:%b", new Object[] { Integer.valueOf(i), Boolean.valueOf(this.iZn) });
    if (!this.iZn) {}
    switch (i)
    {
    default: 
    case 15: 
    case -22: 
    case -21: 
    case -13: 
    case -5: 
    case -3: 
    case -2: 
    case -1: 
    case 1: 
    case 11: 
    case 21: 
    case 27: 
    case 24: 
      for (;;)
      {
        Bh(1);
        GMTrace.o(9568784482304L, 71293);
        return;
        w.i("MicroMsg.BackupPcUI", "closeImpl backup finish, user click close.");
        afo();
        GMTrace.o(9568784482304L, 71293);
        return;
        if ((1 == b.afh().afi().jas) || (3 == b.afh().afi().jas))
        {
          b.afh().afj().bK(false);
          b.afh().aei().iVu = -100;
        }
        else
        {
          if ((2 == b.afh().afi().jas) || (4 == b.afh().afi().jas))
          {
            b.afh().afk().a(false, false, -100);
            GMTrace.o(9568784482304L, 71293);
            return;
          }
          b.afh().aei().iVu = -100;
          continue;
          w.i("MicroMsg.BackupPcUI", "closeImpl recover finish, user click close.");
          afo();
          GMTrace.o(9568784482304L, 71293);
          return;
          b.afh().aei().iVu = 25;
        }
      }
    }
    com.tencent.mm.ui.base.h.a(this, R.l.cWD, R.l.cWC, R.l.cXv, R.l.cVi, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(14843943845888L, 110596);
        w.i("MicroMsg.BackupPcUI", "closeImpl merging user click close. stop recover merge. disableButton[%b]", new Object[] { Boolean.valueOf(BackupPcUI.a(BackupPcUI.this)) });
        if (!BackupPcUI.a(BackupPcUI.this))
        {
          g.ork.a(400L, 26L, 1L, false);
          b.afh().aeI().stop();
          b.afh().afk().a(true, true, -100);
        }
        GMTrace.o(14843943845888L, 110596);
      }
    }, null, R.e.aMS);
    GMTrace.o(9568784482304L, 71293);
  }
  
  private void afo()
  {
    GMTrace.i(9568918700032L, 71294);
    w.i("MicroMsg.BackupPcUI", "exitBackupPc.");
    if ((1 == b.afh().afi().jas) || (3 == b.afh().afi().jas))
    {
      b.afh().afl().cancel();
      b.afh().afl().aeE();
      b.afh().afj().bK(true);
      b.afh().aeI().stop();
      b.afh().aei().iVu = -100;
      Bh(1);
      GMTrace.o(9568918700032L, 71294);
      return;
    }
    if ((2 == b.afh().afi().jas) || (4 == b.afh().afi().jas))
    {
      b.afh().afk().a(true, true, -100);
      b.afh().aeI().stop();
    }
    GMTrace.o(9568918700032L, 71294);
  }
  
  public final void MP()
  {
    GMTrace.i(9567710740480L, 71285);
    this.iZs = ((TextView)findViewById(R.h.bfJ));
    this.iZt = ((ImageView)findViewById(R.h.bfK));
    this.iZq = ((TextView)findViewById(R.h.bfQ));
    this.iZr = ((TextView)findViewById(R.h.aMT));
    this.iZo = ((TextView)findViewById(R.h.bfy));
    this.iZp = ((TextView)findViewById(R.h.bfx));
    GMTrace.o(9567710740480L, 71285);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9567844958208L, 71286);
    int i = R.i.cpH;
    GMTrace.o(9567844958208L, 71286);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9567308087296L, 71282);
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false))
    {
      GMTrace.o(9567308087296L, 71282);
      return;
    }
    w.i("MicroMsg.BackupPcUI", "onCreate.");
    cN().cO().hide();
    com.tencent.mm.plugin.backup.a.hnH.pu();
    MP();
    if (b.afh().afi().jax)
    {
      b.afh().afi().jax = false;
      final int i = com.tencent.mm.plugin.backup.a.h.aes();
      if (i < 50)
      {
        g.ork.i(13736, new Object[] { Integer.valueOf(4), b.afh().afi().jat, com.tencent.mm.plugin.backup.a.h.bY(this), Integer.valueOf(0), Integer.valueOf(b.afh().afi().jaw) });
        com.tencent.mm.ui.base.h.a(this, R.l.cWK, R.l.cWJ, R.l.cXE, 0, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(18445005488128L, 137426);
            w.i("MicroMsg.BackupPcUI", "low battery, user click sure. battery:%d", new Object[] { Integer.valueOf(i) });
            GMTrace.o(18445005488128L, 137426);
          }
        }, null, R.e.aMR);
      }
    }
    GMTrace.o(9567308087296L, 71282);
  }
  
  public void onDestroy()
  {
    GMTrace.i(9567979175936L, 71287);
    w.i("MicroMsg.BackupPcUI", "onDestroy. stack:%s", new Object[] { bg.bQW() });
    super.onDestroy();
    GMTrace.o(9567979175936L, 71287);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(9568113393664L, 71288);
    if (paramInt == 4)
    {
      afd();
      GMTrace.o(9568113393664L, 71288);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(9568113393664L, 71288);
    return bool;
  }
  
  public void onPause()
  {
    GMTrace.i(18437891948544L, 137373);
    super.onPause();
    w.i("MicroMsg.BackupPcUI", "onPause.");
    Object localObject1 = b.afh().afj();
    b.c localc = this.jaZ;
    synchronized (((e)localObject1).jaA)
    {
      ((e)localObject1).jaA.remove(localc);
      localObject1 = b.afh().afk();
      localc = this.jaZ;
    }
    synchronized (((com.tencent.mm.plugin.backup.backuppcmodel.d)localObject1).jaA)
    {
      ((com.tencent.mm.plugin.backup.backuppcmodel.d)localObject1).jaA.remove(localc);
      GMTrace.o(18437891948544L, 137373);
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  public void onResume()
  {
    GMTrace.i(9567442305024L, 71283);
    super.onResume();
    w.i("MicroMsg.BackupPcUI", "onResume.");
    Object localObject2 = b.afh().afj();
    b.c localc = this.jaZ;
    synchronized (((e)localObject2).jaA)
    {
      ((e)localObject2).jaA.add(localc);
      localObject2 = b.afh().afk();
      localc = this.jaZ;
    }
    synchronized (((com.tencent.mm.plugin.backup.backuppcmodel.d)localObject2).jaA)
    {
      ((com.tencent.mm.plugin.backup.backuppcmodel.d)localObject2).jaA.add(localc);
      ??? = b.afh().aei();
      this.jaZ.a((f)???);
      GMTrace.o(9567442305024L, 71283);
      return;
      localObject3 = finally;
      throw ((Throwable)localObject3);
    }
  }
  
  public void onStart()
  {
    GMTrace.i(18437757730816L, 137372);
    super.onStart();
    w.i("MicroMsg.BackupPcUI", "onStart.");
    iZm = getIntent().getBooleanExtra("isRecoverTransferFinishFromBanner", false);
    GMTrace.o(18437757730816L, 137372);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\backuppcui\BackupPcUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */