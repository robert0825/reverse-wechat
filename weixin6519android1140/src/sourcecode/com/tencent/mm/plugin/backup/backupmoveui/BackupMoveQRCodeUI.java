package com.tencent.mm.plugin.backup.backupmoveui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.backup.a.b.d;
import com.tencent.mm.plugin.backup.a.c;
import com.tencent.mm.plugin.backup.a.f;
import com.tencent.mm.plugin.backup.b.a;
import com.tencent.mm.plugin.backup.c.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.io.File;

public class BackupMoveQRCodeUI
  extends MMWizardActivity
  implements b.d
{
  private ImageView iZh;
  private TextView iZi;
  private TextView iZj;
  private boolean iZk;
  
  public BackupMoveQRCodeUI()
  {
    GMTrace.i(9585964351488L, 71421);
    this.iZk = false;
    GMTrace.o(9585964351488L, 71421);
  }
  
  private void afb()
  {
    GMTrace.i(9586769657856L, 71427);
    if (at.wF())
    {
      com.tencent.mm.ui.base.h.a(this, R.l.cVW, R.l.cVV, R.l.cWr, R.l.cVi, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(9594688503808L, 71486);
          w.i("MicroMsg.BackupMoveQRCodeUI", "user click close. stop move.");
          com.tencent.mm.plugin.backup.c.b.aeH().aeI().stop();
          com.tencent.mm.plugin.backup.c.b.aeH().aeJ().bK(true);
          com.tencent.mm.plugin.backup.c.b.aeH().aei().iVu = -100;
          BackupMoveQRCodeUI.b(BackupMoveQRCodeUI.this);
          GMTrace.o(9594688503808L, 71486);
        }
      }, null, R.e.aMS);
      GMTrace.o(9586769657856L, 71427);
      return;
    }
    w.i("MicroMsg.BackupMoveQRCodeUI", "user click close. stop move.");
    com.tencent.mm.plugin.backup.c.b.aeH().aeI().stop();
    com.tencent.mm.plugin.backup.c.b.aeH().aeJ().bK(true);
    com.tencent.mm.plugin.backup.c.b.aeH().aei().iVu = -100;
    Bh(1);
    GMTrace.o(9586769657856L, 71427);
  }
  
  public final void MP()
  {
    GMTrace.i(9586501222400L, 71425);
    oM(R.l.cJE);
    this.iZh = ((ImageView)findViewById(R.h.bfN));
    this.iZi = ((TextView)findViewById(R.h.bfP));
    this.iZj = ((TextView)findViewById(R.h.bfO));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9583548432384L, 71403);
        BackupMoveQRCodeUI.a(BackupMoveQRCodeUI.this);
        GMTrace.o(9583548432384L, 71403);
        return true;
      }
    });
    com.tencent.mm.a.e.f(new File(com.tencent.mm.plugin.backup.a.h.aer()));
    GMTrace.o(9586501222400L, 71425);
  }
  
  public final void a(f paramf)
  {
    GMTrace.i(14846225547264L, 110613);
    w.i("MicroMsg.BackupMoveQRCodeUI", "onUpdateUIProgress backupState:%d", new Object[] { Integer.valueOf(paramf.iVu) });
    if (this.iZk)
    {
      GMTrace.o(14846225547264L, 110613);
      return;
    }
    switch (paramf.iVu)
    {
    }
    for (;;)
    {
      GMTrace.o(14846225547264L, 110613);
      return;
      w.i("MicroMsg.BackupMoveQRCodeUI", "auth success. go to BackupMoveUI.");
      com.tencent.mm.plugin.backup.c.b.aeH().aei().iVu = 12;
      MMWizardActivity.A(this, new Intent(this, BackupMoveUI.class));
      GMTrace.o(14846225547264L, 110613);
      return;
      paramf = com.tencent.mm.plugin.backup.c.b.aeH().aeJ().bitmapData;
      this.iZh.setImageBitmap(BitmapFactory.decodeByteArray(paramf, 0, paramf.length));
      this.iZi.setText(R.l.cVX);
      this.iZi.setTextColor(this.vKB.vKW.getResources().getColor(R.e.black));
      this.iZj.setVisibility(4);
      GMTrace.o(14846225547264L, 110613);
      return;
      this.iZi.setText(R.l.cVC);
      this.iZi.setTextColor(this.vKB.vKW.getResources().getColor(R.e.aOL));
      this.iZh.setImageResource(R.k.cJJ);
      this.iZj.setVisibility(4);
      GMTrace.o(14846225547264L, 110613);
      return;
      this.iZk = true;
      com.tencent.mm.ui.base.h.a(this, R.l.cVK, 0, R.l.cVh, R.l.cVi, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(18458158825472L, 137524);
          w.i("MicroMsg.BackupMoveQRCodeUI", "CLIENT_NOT_SUPPORT_SELECT_TIME_AND_QUICK_BACKUP, user click move all.");
          BackupMoveQRCodeUI.c(BackupMoveQRCodeUI.this);
          com.tencent.mm.plugin.backup.c.b.aeH().aeJ().da(true);
          GMTrace.o(18458158825472L, 137524);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(18458427260928L, 137526);
          w.i("MicroMsg.BackupMoveQRCodeUI", "CLIENT_NOT_SUPPORT_SELECT_TIME_AND_QUICK_BACKUP, user click cancel.");
          BackupMoveQRCodeUI.d(BackupMoveQRCodeUI.this);
          GMTrace.o(18458427260928L, 137526);
        }
      }, R.e.aMR);
      GMTrace.o(14846225547264L, 110613);
      return;
      this.iZk = true;
      com.tencent.mm.ui.base.h.a(this, R.l.cVJ, 0, R.l.cVg, R.l.cVi, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(18455474470912L, 137504);
          w.i("MicroMsg.BackupMoveQRCodeUI", "CLIENT_NOT_SUPPORT_SELECT_TIME, user click move all.");
          BackupMoveQRCodeUI.c(BackupMoveQRCodeUI.this);
          com.tencent.mm.plugin.backup.c.b.aeH().aeJ().da(true);
          GMTrace.o(18455474470912L, 137504);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(18457890390016L, 137522);
          w.i("MicroMsg.BackupMoveQRCodeUI", "CLIENT_NOT_SUPPORT_SELECT_TIME, user click cancel.");
          BackupMoveQRCodeUI.d(BackupMoveQRCodeUI.this);
          GMTrace.o(18457890390016L, 137522);
        }
      }, R.e.aMR);
      GMTrace.o(14846225547264L, 110613);
      return;
      this.iZk = true;
      com.tencent.mm.ui.base.h.a(this, R.l.cVI, 0, R.l.cVh, R.l.cVi, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(18455206035456L, 137502);
          w.i("MicroMsg.BackupMoveQRCodeUI", "CLIENT_NOT_SUPPORT_QUICK_BACKUP, user click move all.");
          BackupMoveQRCodeUI.c(BackupMoveQRCodeUI.this);
          com.tencent.mm.plugin.backup.c.b.aeH().aeJ().da(true);
          GMTrace.o(18455206035456L, 137502);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(18456548212736L, 137512);
          w.i("MicroMsg.BackupMoveQRCodeUI", "CLIENT_NOT_SUPPORT_QUICK_BACKUP, user click cancel.");
          BackupMoveQRCodeUI.d(BackupMoveQRCodeUI.this);
          GMTrace.o(18456548212736L, 137512);
        }
      }, R.e.aMR);
    }
  }
  
  public final void aeg()
  {
    GMTrace.i(18453461204992L, 137489);
    GMTrace.o(18453461204992L, 137489);
  }
  
  public final void cX(boolean paramBoolean)
  {
    GMTrace.i(9587306528768L, 71431);
    GMTrace.o(9587306528768L, 71431);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9587038093312L, 71429);
    int i = R.i.cpG;
    GMTrace.o(9587038093312L, 71429);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9586098569216L, 71422);
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false))
    {
      GMTrace.o(9586098569216L, 71422);
      return;
    }
    if (!at.AU())
    {
      finish();
      GMTrace.o(9586098569216L, 71422);
      return;
    }
    MP();
    com.tencent.mm.plugin.backup.f.b.clear();
    paramBundle = com.tencent.mm.plugin.backup.c.b.aeH().aeJ();
    com.tencent.mm.plugin.backup.f.b.a(paramBundle.iYi);
    com.tencent.mm.plugin.backup.a.e.ku(21);
    com.tencent.mm.plugin.backup.f.b.a(paramBundle.iYg);
    com.tencent.mm.plugin.backup.c.b.aeH().aej();
    com.tencent.mm.plugin.backup.f.b.a(paramBundle);
    com.tencent.mm.plugin.backup.f.b.a(com.tencent.mm.plugin.backup.c.b.aeH().aeI());
    com.tencent.mm.plugin.backup.f.b.ku(2);
    com.tencent.mm.plugin.backup.c.b.aeH().iVp = null;
    paramBundle.iYs = false;
    com.tencent.mm.plugin.backup.c.b.aeH().aeJ().iYt = c.iVa;
    com.tencent.mm.plugin.backup.a.e.aeo();
    GMTrace.o(9586098569216L, 71422);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(9586635440128L, 71426);
    if (paramInt == 4)
    {
      afb();
      GMTrace.o(9586635440128L, 71426);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(9586635440128L, 71426);
    return bool;
  }
  
  public void onResume()
  {
    GMTrace.i(9586367004672L, 71424);
    super.onResume();
    a(com.tencent.mm.plugin.backup.c.b.aeH().aei());
    GMTrace.o(9586367004672L, 71424);
  }
  
  public void onStart()
  {
    GMTrace.i(9586232786944L, 71423);
    super.onStart();
    com.tencent.mm.plugin.backup.f.b.a(com.tencent.mm.plugin.backup.c.b.aeH().aeJ());
    com.tencent.mm.plugin.backup.c.b.aeH().aeJ().iWP = this;
    com.tencent.mm.plugin.backup.c.b.aeH().aeJ().iYz.start();
    GMTrace.o(9586232786944L, 71423);
  }
  
  public void onStop()
  {
    GMTrace.i(9586903875584L, 71428);
    w.i("MicroMsg.BackupMoveQRCodeUI", "BackupMoveQRCodeUI onStop.");
    if (com.tencent.mm.plugin.backup.c.b.aeH().aeJ().iYz != null) {
      com.tencent.mm.plugin.backup.c.b.aeH().aeJ().iYz.stop();
    }
    super.onStop();
    GMTrace.o(9586903875584L, 71428);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\backupmoveui\BackupMoveQRCodeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */