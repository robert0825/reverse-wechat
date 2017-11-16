package com.tencent.mm.plugin.backup.backupmoveui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.net.wifi.WifiManager;
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
import com.tencent.mm.plugin.backup.a.b.d;
import com.tencent.mm.plugin.backup.a.f;
import com.tencent.mm.plugin.backup.c.b;
import com.tencent.mm.plugin.backup.c.c;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.p;
import java.lang.reflect.Method;

@com.tencent.mm.ui.base.a(3)
public class BackupMoveRecoverUI
  extends MMWizardActivity
  implements b.d
{
  private static boolean iZm;
  private static boolean iZu;
  private boolean iZn;
  public TextView iZo;
  public TextView iZp;
  public TextView iZq;
  public TextView iZr;
  public TextView iZs;
  public ImageView iZt;
  
  static
  {
    GMTrace.i(9581132513280L, 71385);
    iZm = false;
    iZu = false;
    GMTrace.o(9581132513280L, 71385);
  }
  
  public BackupMoveRecoverUI()
  {
    GMTrace.i(9578179723264L, 71363);
    this.iZn = false;
    GMTrace.o(9578179723264L, 71363);
  }
  
  private void afc()
  {
    GMTrace.i(9579253465088L, 71371);
    this.iZs.setText(R.l.cVk);
    this.iZs.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9577777070080L, 71360);
        BackupMoveRecoverUI.c(BackupMoveRecoverUI.this);
        GMTrace.o(9577777070080L, 71360);
      }
    });
    GMTrace.o(9579253465088L, 71371);
  }
  
  private void afd()
  {
    GMTrace.i(9579387682816L, 71372);
    final int i = b.aeH().aei().iVu;
    w.i("MicroMsg.BackupMoveRecoverUI", "close btn, backupPcState:%d, disableButton:%b  backupPcState:%d ", new Object[] { Integer.valueOf(i), Boolean.valueOf(this.iZn), Integer.valueOf(i) });
    if (!this.iZn) {}
    switch (i)
    {
    default: 
    case -22: 
    case -21: 
    case -13: 
    case -5: 
    case -3: 
    case -2: 
    case -1: 
    case 1: 
    case 27: 
    case 24: 
      for (;;)
      {
        Bh(1);
        GMTrace.o(9579387682816L, 71372);
        return;
        b.aeH().aeK().a(false, false, -100);
        GMTrace.o(9579387682816L, 71372);
        return;
        w.i("MicroMsg.BackupMoveRecoverUI", "recover finish, user click close, backupState[%d].", new Object[] { Integer.valueOf(i) });
        b.aeH().aeK().a(true, false, -100);
        b.aeH().aeI().stop();
        GMTrace.o(9579387682816L, 71372);
        return;
        b.aeH().aei().iVu = 25;
      }
    case 52: 
      com.tencent.mm.ui.base.h.a(this, R.l.cVu, R.l.cVt, R.l.cWh, R.l.cVi, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(18809540837376L, 140142);
          w.i("MicroMsg.BackupMoveRecoverUI", "user click close. stop recover move, backupState[%d].", new Object[] { Integer.valueOf(i) });
          b.aeH().aeI().stop();
          b.aeH().aeK().a(true, true, -100);
          GMTrace.o(18809540837376L, 140142);
        }
      }, null, R.e.aMS);
      GMTrace.o(9579387682816L, 71372);
      return;
    }
    com.tencent.mm.ui.base.h.a(this, R.l.cWD, R.l.cWC, R.l.cXv, R.l.cVi, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(9583011561472L, 71399);
        w.i("MicroMsg.BackupMoveRecoverUI", "user click close. stop recover merge, backupState[%d], disableButton[%b]", new Object[] { Integer.valueOf(i), Boolean.valueOf(BackupMoveRecoverUI.d(BackupMoveRecoverUI.this)) });
        if (!BackupMoveRecoverUI.d(BackupMoveRecoverUI.this))
        {
          g.ork.a(485L, 48L, 1L, false);
          b.aeH().aeI().stop();
          b.aeH().aeK().a(true, true, -100);
        }
        GMTrace.o(9583011561472L, 71399);
      }
    }, null, R.e.aMS);
    GMTrace.o(9579387682816L, 71372);
  }
  
  private void afe()
  {
    GMTrace.i(9579521900544L, 71373);
    this.iZs.setText(R.l.cVm);
    this.iZs.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18808332877824L, 140133);
        BackupMoveRecoverUI.e(BackupMoveRecoverUI.this);
        GMTrace.o(18808332877824L, 140133);
      }
    });
    GMTrace.o(9579521900544L, 71373);
  }
  
  public final void MP()
  {
    GMTrace.i(9578448158720L, 71365);
    this.iZs = ((TextView)findViewById(R.h.bfJ));
    this.iZt = ((ImageView)findViewById(R.h.bfK));
    this.iZq = ((TextView)findViewById(R.h.bfQ));
    this.iZr = ((TextView)findViewById(R.h.aMT));
    this.iZo = ((TextView)findViewById(R.h.bfy));
    this.iZp = ((TextView)findViewById(R.h.bfx));
    GMTrace.o(9578448158720L, 71365);
  }
  
  public final void a(final f paramf)
  {
    GMTrace.i(14845957111808L, 110611);
    w.i("MicroMsg.BackupMoveRecoverUI", "onUpdateUIProgress state[%d], isActivityOnTop[%b], transferSession[%d], totalSession[%d]", new Object[] { Integer.valueOf(paramf.iVu), Boolean.valueOf(iZu), Integer.valueOf(paramf.iVv), Integer.valueOf(paramf.iVw) });
    switch (paramf.iVu)
    {
    }
    for (;;)
    {
      GMTrace.o(14845957111808L, 110611);
      return;
      Bh(1);
      GMTrace.o(14845957111808L, 110611);
      return;
      finish();
      GMTrace.o(14845957111808L, 110611);
      return;
      this.iZt.setImageResource(R.k.cJE);
      this.iZq.setText(R.l.cVq);
      this.iZr.setText(R.l.cVQ);
      this.iZr.setVisibility(0);
      this.iZo.setVisibility(4);
      this.iZp.setVisibility(4);
      afc();
      GMTrace.o(14845957111808L, 110611);
      return;
      this.iZt.setImageResource(R.k.cJE);
      this.iZq.setText(R.l.cWd);
      this.iZr.setText(R.l.cVQ);
      this.iZr.setTextColor(getResources().getColor(R.e.aMT));
      this.iZr.setVisibility(0);
      this.iZo.setVisibility(4);
      this.iZp.setVisibility(4);
      afe();
      GMTrace.o(14845957111808L, 110611);
      return;
      this.iZt.setImageResource(R.k.cJE);
      this.iZq.setText(R.l.cVN);
      this.iZo.setText(R.l.cVP);
      this.iZp.setText(R.l.cVO);
      this.iZr.setVisibility(4);
      this.iZo.setVisibility(0);
      this.iZp.setVisibility(0);
      this.iZo.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(18807930224640L, 140130);
          b.aeH().aeK().cZ(false);
          GMTrace.o(18807930224640L, 140130);
        }
      });
      this.iZp.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9582206255104L, 71393);
          b.aeH().aeK().cZ(true);
          GMTrace.o(9582206255104L, 71393);
        }
      });
      afc();
      GMTrace.o(14845957111808L, 110611);
      return;
      this.iZt.setImageResource(R.k.cJE);
      TextView localTextView = this.iZq;
      int i = R.l.cWi;
      int j = paramf.iVv;
      int k = paramf.iVw;
      b.aeH().aeK();
      localTextView.setText(getString(i, new Object[] { Integer.valueOf(j), Integer.valueOf(k), c.aeP() }));
      this.iZr.setText(R.l.cVQ);
      this.iZr.setTextColor(getResources().getColor(R.e.aMT));
      this.iZr.setVisibility(0);
      this.iZo.setVisibility(4);
      this.iZp.setVisibility(4);
      afe();
      GMTrace.o(14845957111808L, 110611);
      return;
      if (iZu)
      {
        b.aeH().aei().iVu = 24;
        paramf = b.aeH().aei();
        break;
        w.i("MicroMsg.BackupMoveRecoverUI", "backupmove BACKUP_STATE_RECOVER_TRANSFER_FINISH isFromBanner[%b]", new Object[] { Boolean.valueOf(iZm) });
        if (iZm)
        {
          this.iZt.setImageResource(R.k.cJE);
          this.iZq.setText(R.l.cWj);
          this.iZr.setText(R.l.cWl);
          this.iZr.setTextColor(getResources().getColor(R.e.aMT));
          this.iZo.setText(R.l.cWf);
          this.iZp.setText(R.l.cWg);
          this.iZs.setText(R.l.cXz);
          this.iZr.setVisibility(0);
          this.iZo.setVisibility(0);
          this.iZp.setVisibility(0);
          this.iZo.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(9594151632896L, 71482);
              w.i("MicroMsg.BackupMoveRecoverUI", "backupmove click start merge button.");
              b.aeH().aeK();
              if (!c.aeM())
              {
                w.e("MicroMsg.BackupMoveRecoverUI", "miss recover merge data.");
                b.aeH().aei().iVu = -22;
                BackupMoveRecoverUI.this.a(b.aeH().aei());
                g.ork.a(485L, 6L, 1L, false);
                GMTrace.o(9594151632896L, 71482);
                return;
              }
              b.aeH().aeK().aew();
              GMTrace.o(9594151632896L, 71482);
            }
          });
          this.iZp.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(9585293262848L, 71416);
              w.i("MicroMsg.BackupMoveRecoverUI", "backupmove click stop merge button.");
              com.tencent.mm.ui.base.h.a(BackupMoveRecoverUI.this, R.l.cVs, R.l.cVr, R.l.cWg, R.l.cVi, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(9581669384192L, 71389);
                  w.i("MicroMsg.BackupMoveRecoverUI", "user click close. stop recover merge, backupState[%d].", new Object[] { Integer.valueOf(BackupMoveRecoverUI.11.this.iYk.iVu) });
                  g.ork.a(485L, 48L, 1L, false);
                  b.aeH().aeI().stop();
                  b.aeH().aeK().a(true, true, -100);
                  GMTrace.o(9581669384192L, 71389);
                }
              }, null, R.e.aMS);
              GMTrace.o(9585293262848L, 71416);
            }
          });
          this.iZs.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(9594956939264L, 71488);
              b.aeH().aei().iVu = 25;
              BackupMoveRecoverUI.a(BackupMoveRecoverUI.this);
              GMTrace.o(9594956939264L, 71488);
            }
          });
          GMTrace.o(14845957111808L, 110611);
          return;
        }
        if (iZu)
        {
          b.aeH().aeK();
          if (!c.aeM())
          {
            w.e("MicroMsg.BackupMoveRecoverUI", "miss recover merge data.");
            b.aeH().aei().iVu = -22;
            a(b.aeH().aei());
            g.ork.a(485L, 6L, 1L, false);
            GMTrace.o(14845957111808L, 110611);
            return;
          }
          b.aeH().aeK().aew();
          GMTrace.o(14845957111808L, 110611);
          return;
          this.iZt.setImageResource(R.k.cJK);
          this.iZq.setText(getString(R.l.cWa, new Object[] { Integer.valueOf(paramf.iVv), Integer.valueOf(paramf.iVw) }));
          this.iZr.setText(R.l.cWb);
          this.iZr.setTextColor(getResources().getColor(R.e.aMT));
          this.iZr.setVisibility(0);
          this.iZo.setVisibility(4);
          this.iZp.setVisibility(4);
          afc();
          GMTrace.o(14845957111808L, 110611);
          return;
          this.iZt.setImageResource(R.k.cJL);
          this.iZq.setText(R.l.cVY);
          this.iZr.setText(getString(R.l.cVZ, new Object[] { Integer.valueOf(paramf.iVv), Integer.valueOf(paramf.iVw) }));
          this.iZr.setTextColor(getResources().getColor(R.e.aMT));
          this.iZo.setText(R.l.cVl);
          this.iZr.setVisibility(0);
          this.iZo.setVisibility(0);
          this.iZp.setVisibility(4);
          this.iZo.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(9593614761984L, 71478);
              b.aeH().aeI().stop();
              b.aeH().aei().iVu = -100;
              BackupMoveRecoverUI.b(BackupMoveRecoverUI.this);
              GMTrace.o(9593614761984L, 71478);
            }
          });
          afc();
          GMTrace.o(14845957111808L, 110611);
          return;
          this.iZt.setImageResource(R.k.cJG);
          this.iZq.setText(getString(R.l.cVR, new Object[] { Integer.valueOf(paramf.iVv), Integer.valueOf(paramf.iVw), "0M" }));
          this.iZr.setText(R.l.cVD);
          this.iZo.setText(R.l.cWe);
          this.iZp.setText(R.l.cWh);
          this.iZo.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(9589454012416L, 71447);
              paramAnonymousView = new Intent();
              paramAnonymousView.putExtra("BaseScanUI_select_scan_mode", 1);
              paramAnonymousView.setFlags(268435456);
              com.tencent.mm.bj.d.b(BackupMoveRecoverUI.this.vKB.vKW, "scanner", ".ui.BaseScanUI", paramAnonymousView);
              GMTrace.o(9589454012416L, 71447);
            }
          });
          this.iZp.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(9585024827392L, 71414);
              com.tencent.mm.ui.base.h.a(BackupMoveRecoverUI.this, R.l.cVu, R.l.cVt, R.l.cWh, R.l.cVi, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(18808869748736L, 140137);
                  w.i("MicroMsg.BackupMoveRecoverUI", "user click close. stop recover, backupState[%d].", new Object[] { Integer.valueOf(BackupMoveRecoverUI.15.this.iYk.iVu) });
                  g.ork.a(485L, 44L, 1L, false);
                  b.aeH().aeI().stop();
                  b.aeH().aeK().a(true, true, -100);
                  GMTrace.o(18808869748736L, 140137);
                }
              }, null, R.e.aMS);
              GMTrace.o(9585024827392L, 71414);
            }
          });
          this.iZr.setTextColor(getResources().getColor(R.e.aMS));
          this.iZr.setVisibility(0);
          this.iZo.setVisibility(0);
          this.iZp.setVisibility(0);
          afe();
          GMTrace.o(14845957111808L, 110611);
          return;
          this.iZt.setImageResource(R.k.cJG);
          this.iZq.setText(R.l.cVG);
          paramf = com.tencent.mm.plugin.backup.a.h.bY(this);
          if ((paramf == null) || (paramf.equals(""))) {
            this.iZr.setText(getString(R.l.cVH, new Object[] { "移动网络", b.aeH().aeK().iXW }));
          }
          for (;;)
          {
            this.iZr.setTextColor(getResources().getColor(R.e.aMS));
            this.iZr.setVisibility(0);
            this.iZo.setVisibility(4);
            this.iZp.setVisibility(4);
            afc();
            GMTrace.o(14845957111808L, 110611);
            return;
            this.iZr.setText(getString(R.l.cVH, new Object[] { paramf, b.aeH().aeK().iXW }));
          }
          this.iZt.setImageResource(R.k.cJG);
          this.iZq.setText(R.l.cVw);
          this.iZr.setText(R.l.cVx);
          this.iZo.setText(R.l.cWc);
          this.iZp.setText(R.l.cWh);
          this.iZr.setTextColor(getResources().getColor(R.e.aMS));
          this.iZr.setVisibility(0);
          this.iZo.setVisibility(0);
          this.iZp.setVisibility(0);
          this.iZo.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(9584353738752L, 71409);
              paramAnonymousView = new Intent();
              paramAnonymousView.putExtra("title", BackupMoveRecoverUI.this.getString(R.l.cVT));
              paramAnonymousView.putExtra("rawUrl", BackupMoveRecoverUI.this.getString(R.l.cVS, new Object[] { v.bPK() }));
              paramAnonymousView.putExtra("showShare", false);
              paramAnonymousView.putExtra("neverGetA8Key", true);
              com.tencent.mm.bj.d.b(BackupMoveRecoverUI.this, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
              GMTrace.o(9584353738752L, 71409);
            }
          });
          this.iZp.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(9583279996928L, 71401);
              com.tencent.mm.ui.base.h.a(BackupMoveRecoverUI.this, R.l.cVu, R.l.cVt, R.l.cWh, R.l.cVi, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(18807661789184L, 140128);
                  w.i("MicroMsg.BackupMoveRecoverUI", "user click close. stop recover, backupState[%d].", new Object[] { Integer.valueOf(BackupMoveRecoverUI.2.this.iYk.iVu) });
                  g.ork.a(485L, 44L, 1L, false);
                  b.aeH().aeI().stop();
                  b.aeH().aeK().a(true, true, -100);
                  GMTrace.o(18807661789184L, 140128);
                }
              }, null, R.e.aMS);
              GMTrace.o(9583279996928L, 71401);
            }
          });
          afc();
          GMTrace.o(14845957111808L, 110611);
          return;
          this.iZt.setImageResource(R.k.cJG);
          this.iZq.setText(R.l.cVy);
          this.iZo.setText(R.l.cWe);
          this.iZp.setText(R.l.cWh);
          this.iZr.setVisibility(4);
          this.iZo.setVisibility(0);
          this.iZp.setVisibility(0);
          this.iZo.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(9576703328256L, 71352);
              paramAnonymousView = new Intent();
              paramAnonymousView.putExtra("BaseScanUI_select_scan_mode", 1);
              paramAnonymousView.setFlags(268435456);
              com.tencent.mm.bj.d.b(BackupMoveRecoverUI.this.vKB.vKW, "scanner", ".ui.BaseScanUI", paramAnonymousView);
              GMTrace.o(9576703328256L, 71352);
            }
          });
          this.iZp.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(9593883197440L, 71480);
              com.tencent.mm.ui.base.h.a(BackupMoveRecoverUI.this, R.l.cVu, R.l.cVt, R.l.cWh, R.l.cVi, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(18808601313280L, 140135);
                  w.i("MicroMsg.BackupMoveRecoverUI", "user click close. stop recover, backupState[%d].", new Object[] { Integer.valueOf(BackupMoveRecoverUI.4.this.iYk.iVu) });
                  g.ork.a(485L, 44L, 1L, false);
                  b.aeH().aeI().stop();
                  b.aeH().aeK().a(true, true, -100);
                  GMTrace.o(18808601313280L, 140135);
                }
              }, null, R.e.aMS);
              GMTrace.o(9593883197440L, 71480);
            }
          });
          afc();
          GMTrace.o(14845957111808L, 110611);
          return;
          this.iZt.setImageResource(R.k.cJG);
          this.iZq.setText(R.l.cWQ);
          this.iZr.setVisibility(4);
          this.iZo.setVisibility(4);
          this.iZp.setVisibility(4);
          afc();
          GMTrace.o(14845957111808L, 110611);
          return;
          this.iZt.setImageResource(R.k.cJG);
          this.iZq.setText(R.l.cVE);
          this.iZr.setText(getString(R.l.cVF, new Object[] { bg.aF(b.aeH().aeK().iYe) }));
          this.iZr.setVisibility(0);
          this.iZo.setVisibility(4);
          this.iZp.setVisibility(4);
          afc();
          GMTrace.o(14845957111808L, 110611);
          return;
          this.iZt.setImageResource(R.k.cJG);
          this.iZq.setText(R.l.cWL);
          b.aeH().aeI().stop();
          this.iZr.setVisibility(4);
          this.iZo.setVisibility(4);
          this.iZp.setVisibility(4);
          afc();
        }
      }
    }
  }
  
  public final void aeg()
  {
    GMTrace.i(18457353519104L, 137518);
    GMTrace.o(18457353519104L, 137518);
  }
  
  public final void cX(boolean paramBoolean)
  {
    GMTrace.i(9579119247360L, 71370);
    this.iZn = paramBoolean;
    if (paramBoolean)
    {
      this.iZs.setEnabled(false);
      GMTrace.o(9579119247360L, 71370);
      return;
    }
    this.iZs.setEnabled(true);
    GMTrace.o(9579119247360L, 71370);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9579656118272L, 71374);
    int i = R.i.cpH;
    GMTrace.o(9579656118272L, 71374);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9578313940992L, 71364);
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false))
    {
      GMTrace.o(9578313940992L, 71364);
      return;
    }
    w.i("MicroMsg.BackupMoveRecoverUI", "onCreate.");
    cN().cO().hide();
    com.tencent.mm.plugin.backup.a.hnH.pu();
    MP();
    try
    {
      paramBundle = WifiManager.class.getMethod("isWifiApEnabled", new Class[0]);
      WifiManager localWifiManager = (WifiManager)getSystemService("wifi");
      b.aeH().aeK().iXR = ((Boolean)paramBundle.invoke(localWifiManager, new Object[0])).booleanValue();
      w.d("MicroMsg.BackupMoveRecoverUI", "new isWifiAp:%s", new Object[] { Boolean.valueOf(b.aeH().aeK().iXR) });
      GMTrace.o(9578313940992L, 71364);
      return;
    }
    catch (Exception paramBundle)
    {
      w.e("MicroMsg.BackupMoveRecoverUI", "no such method WifiManager.isWifiApEnabled:%s", new Object[] { bg.bQW() });
      GMTrace.o(9578313940992L, 71364);
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(9578716594176L, 71367);
    w.i("MicroMsg.BackupMoveRecoverUI", "BackupMoveRecoverUI onDestroy.");
    super.onDestroy();
    GMTrace.o(9578716594176L, 71367);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(9578850811904L, 71368);
    if (paramInt == 4)
    {
      afd();
      GMTrace.o(9578850811904L, 71368);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(9578850811904L, 71368);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(14845822894080L, 110610);
    super.onPause();
    w.i("MicroMsg.BackupMoveRecoverUI", "onPause.");
    iZu = false;
    GMTrace.o(14845822894080L, 110610);
  }
  
  public void onResume()
  {
    GMTrace.i(9578582376448L, 71366);
    super.onResume();
    w.i("MicroMsg.BackupMoveRecoverUI", "onResume.");
    iZu = true;
    b.aeH().aeK().iWP = this;
    iZm = getIntent().getBooleanExtra("isRecoverTransferFinishFromBanner", false);
    a(b.aeH().aei());
    GMTrace.o(9578582376448L, 71366);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\backupmoveui\BackupMoveRecoverUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */