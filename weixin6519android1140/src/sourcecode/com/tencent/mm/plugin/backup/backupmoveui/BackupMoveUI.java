package com.tencent.mm.plugin.backup.backupmoveui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
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
import com.tencent.mm.plugin.backup.a.c;
import com.tencent.mm.plugin.backup.a.f;
import com.tencent.mm.plugin.backup.c.b;
import com.tencent.mm.plugin.backup.c.e;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import java.lang.reflect.Method;

@com.tencent.mm.ui.base.a(3)
public class BackupMoveUI
  extends MMWizardActivity
  implements b.d
{
  public TextView iZo;
  public TextView iZp;
  public TextView iZq;
  public TextView iZr;
  public TextView iZs;
  public ImageView iZt;
  
  public BackupMoveUI()
  {
    GMTrace.i(9589856665600L, 71450);
    GMTrace.o(9589856665600L, 71450);
  }
  
  private void afc()
  {
    GMTrace.i(9591064625152L, 71459);
    this.iZs.setText(R.l.cVk);
    this.iZs.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9595493810176L, 71492);
        BackupMoveUI.b(BackupMoveUI.this);
        GMTrace.o(9595493810176L, 71492);
      }
    });
    GMTrace.o(9591064625152L, 71459);
  }
  
  private void afd()
  {
    GMTrace.i(9591198842880L, 71460);
    int i = b.aeH().aei().iVu;
    w.i("MicroMsg.BackupMoveUI", "close btn, backupMoveState:%d", new Object[] { Integer.valueOf(i) });
    switch (i)
    {
    default: 
      Bh(1);
      GMTrace.o(9591198842880L, 71460);
      return;
    case 15: 
      w.i("MicroMsg.BackupMoveUI", "backup move finish, user click close.");
      b.aeH().aeL().cancel();
      b.aeH().aeL().aeE();
      b.aeH().aeJ().bK(true);
      b.aeH().aeI().stop();
      b.aeH().aei().iVu = -100;
      Bh(1);
      GMTrace.o(9591198842880L, 71460);
      return;
    }
    h.a(this, R.l.cVW, R.l.cVV, R.l.cWr, R.l.cVi, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(9595225374720L, 71490);
        w.i("MicroMsg.BackupMoveUI", "user click close. stop move.");
        g.ork.a(485L, 25L, 1L, false);
        b.aeH().aeI().stop();
        b.aeH().aeJ().bK(false);
        b.aeH().aei().iVu = -100;
        BackupMoveUI.c(BackupMoveUI.this);
        GMTrace.o(9595225374720L, 71490);
      }
    }, null, R.e.aMS);
    GMTrace.o(9591198842880L, 71460);
  }
  
  public final void MP()
  {
    GMTrace.i(9590125101056L, 71452);
    this.iZs = ((TextView)findViewById(R.h.bfJ));
    this.iZt = ((ImageView)findViewById(R.h.bfK));
    this.iZq = ((TextView)findViewById(R.h.bfQ));
    this.iZr = ((TextView)findViewById(R.h.aMT));
    this.iZo = ((TextView)findViewById(R.h.bfy));
    this.iZp = ((TextView)findViewById(R.h.bfx));
    GMTrace.o(9590125101056L, 71452);
  }
  
  public final void a(f paramf)
  {
    GMTrace.i(14846493982720L, 110615);
    w.i("MicroMsg.BackupMoveUI", "onUpdateUIProgress state:%d, transferSession:%d, totalSession:%d", new Object[] { Integer.valueOf(paramf.iVu), Integer.valueOf(paramf.iVv), Integer.valueOf(paramf.iVw) });
    switch (paramf.iVu)
    {
    }
    for (;;)
    {
      GMTrace.o(14846493982720L, 110615);
      return;
      Bh(1);
      GMTrace.o(14846493982720L, 110615);
      return;
      finish();
      GMTrace.o(14846493982720L, 110615);
      return;
      this.iZt.setImageResource(R.k.cJE);
      this.iZq.setText(R.l.cVq);
      this.iZr.setText(R.l.cVQ);
      this.iZr.setVisibility(0);
      this.iZo.setVisibility(4);
      this.iZp.setVisibility(4);
      afc();
      GMTrace.o(14846493982720L, 110615);
      return;
      this.iZt.setImageResource(R.k.cJE);
      this.iZq.setText(getString(R.l.cVn, new Object[] { Integer.valueOf(paramf.iVv), Integer.valueOf(paramf.iVw) }));
      this.iZr.setText(R.l.cVQ);
      this.iZr.setTextColor(getResources().getColor(R.e.aMT));
      this.iZr.setVisibility(0);
      this.iZo.setVisibility(4);
      this.iZp.setVisibility(4);
      afc();
      GMTrace.o(14846493982720L, 110615);
      return;
      this.iZt.setImageResource(R.k.cJE);
      this.iZq.setText(R.l.cVU);
      this.iZr.setText(R.l.cVQ);
      this.iZr.setTextColor(getResources().getColor(R.e.aMT));
      this.iZr.setVisibility(0);
      this.iZo.setVisibility(4);
      this.iZp.setVisibility(4);
      afc();
      GMTrace.o(14846493982720L, 110615);
      return;
      this.iZt.setImageResource(R.k.cJE);
      TextView localTextView = this.iZq;
      int i = R.l.cWs;
      int j = paramf.iVv;
      int k = paramf.iVw;
      b.aeH().aeJ();
      localTextView.setText(getString(i, new Object[] { Integer.valueOf(j), Integer.valueOf(k), com.tencent.mm.plugin.backup.c.d.aeU() }));
      this.iZr.setText(R.l.cVQ);
      this.iZr.setTextColor(getResources().getColor(R.e.aMT));
      this.iZr.setVisibility(0);
      this.iZo.setVisibility(4);
      this.iZp.setVisibility(4);
      afc();
      GMTrace.o(14846493982720L, 110615);
      return;
      this.iZt.setImageResource(R.k.cJH);
      this.iZq.setText(R.l.cJH);
      this.iZr.setText(getString(R.l.cVM, new Object[] { Integer.valueOf(paramf.iVv), Integer.valueOf(paramf.iVw) }));
      this.iZr.setTextColor(getResources().getColor(R.e.aMT));
      this.iZo.setText(R.l.cVl);
      this.iZr.setVisibility(0);
      this.iZo.setVisibility(0);
      this.iZp.setVisibility(4);
      this.iZo.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9581400948736L, 71387);
          b.aeH().aeI().stop();
          b.aeH().aeJ().bK(true);
          b.aeH().aei().iVu = -100;
          BackupMoveUI.a(BackupMoveUI.this);
          GMTrace.o(9581400948736L, 71387);
        }
      });
      afc();
      GMTrace.o(14846493982720L, 110615);
      return;
      paramf = b.aeH().aeJ().bitmapData;
      this.iZt.setImageBitmap(BitmapFactory.decodeByteArray(paramf, 0, paramf.length));
      this.iZq.setText(R.l.cVX);
      this.iZq.setTextColor(this.vKB.vKW.getResources().getColor(R.e.black));
      this.iZr.setVisibility(4);
      this.iZo.setVisibility(4);
      this.iZp.setVisibility(4);
      afc();
      GMTrace.o(14846493982720L, 110615);
      return;
      this.iZt.setImageResource(R.k.cJI);
      b.aeH().aeJ().iYz.start();
      this.iZq.setText(getString(R.l.cVR, new Object[] { Integer.valueOf(paramf.iVv), Integer.valueOf(paramf.iVw), "0M" }));
      this.iZr.setText(R.l.cVD);
      this.iZr.setTextColor(this.vKB.vKW.getResources().getColor(R.e.aOL));
      this.iZr.setVisibility(0);
      this.iZo.setVisibility(4);
      this.iZp.setVisibility(4);
      this.iZs.setText(R.l.cVm);
      this.iZs.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9593346326528L, 71476);
          BackupMoveUI.d(BackupMoveUI.this);
          GMTrace.o(9593346326528L, 71476);
        }
      });
      b.aeH().aeJ().iYt = c.iVb;
      GMTrace.o(14846493982720L, 110615);
      return;
      this.iZt.setImageResource(R.k.cJI);
      this.iZq.setText(getString(R.l.cVR, new Object[] { Integer.valueOf(paramf.iVv), Integer.valueOf(paramf.iVw), "0M" }));
      this.iZr.setText(R.l.cVC);
      this.iZr.setTextColor(this.vKB.vKW.getResources().getColor(R.e.aOL));
      this.iZr.setVisibility(0);
      this.iZo.setVisibility(4);
      this.iZp.setVisibility(4);
      afc();
      GMTrace.o(14846493982720L, 110615);
      return;
      this.iZt.setImageResource(R.k.cJG);
      this.iZq.setText(R.l.cVL);
      this.iZr.setVisibility(4);
      this.iZo.setVisibility(4);
      this.iZp.setVisibility(4);
      afc();
      GMTrace.o(14846493982720L, 110615);
      return;
      this.iZt.setImageResource(R.k.cJG);
      this.iZq.setText(R.l.cVz);
      this.iZr.setVisibility(4);
      this.iZo.setVisibility(4);
      this.iZp.setVisibility(4);
      afc();
    }
  }
  
  public final void aeg()
  {
    GMTrace.i(18456145559552L, 137509);
    GMTrace.o(18456145559552L, 137509);
  }
  
  public final void cX(boolean paramBoolean)
  {
    GMTrace.i(9590930407424L, 71458);
    GMTrace.o(9590930407424L, 71458);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9590259318784L, 71453);
    int i = R.i.cpH;
    GMTrace.o(9590259318784L, 71453);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9589990883328L, 71451);
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false))
    {
      GMTrace.o(9589990883328L, 71451);
      return;
    }
    w.i("MicroMsg.BackupMoveUI", "onCreate.");
    cN().cO().hide();
    com.tencent.mm.plugin.backup.a.hnH.pu();
    MP();
    try
    {
      paramBundle = WifiManager.class.getMethod("isWifiApEnabled", new Class[0]);
      WifiManager localWifiManager = (WifiManager)getSystemService("wifi");
      b.aeH().aeJ().iXR = ((Boolean)paramBundle.invoke(localWifiManager, new Object[0])).booleanValue();
      w.d("MicroMsg.BackupMoveUI", "old isWifiAp:%s", new Object[] { Boolean.valueOf(b.aeH().aeJ().iXR) });
      GMTrace.o(9589990883328L, 71451);
      return;
    }
    catch (Exception paramBundle)
    {
      w.e("MicroMsg.BackupMoveUI", "no such method WifiManager.isWifiApEnabled:%s", new Object[] { new ah() });
      GMTrace.o(9589990883328L, 71451);
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(9590527754240L, 71455);
    w.d("MicroMsg.BackupMoveUI", "BackupMoveUI onDestroy.");
    if (b.aeH().aeJ().iYz != null) {
      b.aeH().aeJ().iYz.stop();
    }
    super.onDestroy();
    GMTrace.o(9590527754240L, 71455);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(9590796189696L, 71457);
    if (paramInt == 4)
    {
      afd();
      GMTrace.o(9590796189696L, 71457);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(9590796189696L, 71457);
    return bool;
  }
  
  public void onResume()
  {
    GMTrace.i(9590393536512L, 71454);
    super.onResume();
    b.aeH().aeJ().iWP = this;
    a(b.aeH().aei());
    GMTrace.o(9590393536512L, 71454);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\backupmoveui\BackupMoveUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */