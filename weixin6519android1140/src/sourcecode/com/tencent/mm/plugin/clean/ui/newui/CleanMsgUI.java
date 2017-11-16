package com.tencent.mm.plugin.clean.ui.newui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.clean.c.c;
import com.tencent.mm.plugin.clean.c.d;
import com.tencent.mm.plugin.clean.ui.PieView;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class CleanMsgUI
  extends MMActivity
  implements com.tencent.mm.plugin.clean.c.g, com.tencent.mm.plugin.clean.c.h
{
  private ProgressDialog htG;
  private View jUD;
  private PieView jUE;
  private TextView jUF;
  private Button jUG;
  private Button jUH;
  private TextView jUI;
  private TextView jUJ;
  private TextView jUK;
  private TextView jUL;
  private View jUM;
  private TextView jUN;
  private TextView jUO;
  private TextView jUP;
  private TextView jUQ;
  private TextView jUR;
  private com.tencent.mm.plugin.clean.c.e jVA;
  private c jVG;
  
  public CleanMsgUI()
  {
    GMTrace.i(20538802044928L, 153026);
    GMTrace.o(20538802044928L, 153026);
  }
  
  private void c(long paramLong1, long paramLong2, long paramLong3)
  {
    GMTrace.i(20539204698112L, 153029);
    int j = (int)(360L * paramLong3 / paramLong1);
    if (j < 5) {
      j = 5;
    }
    for (;;)
    {
      int i = 0;
      if (paramLong2 > 0L)
      {
        int k = (int)(360L * paramLong2 / paramLong1);
        i = k;
        if (k < 5) {
          i = 5;
        }
      }
      long l = paramLong1 - paramLong3 - paramLong2;
      w.i("MicroMsg.CleanMsgUI", "update [%d %d] [%d %d] [%d %d] wechatSize[%d]", new Object[] { Long.valueOf(paramLong3), Integer.valueOf(j), Long.valueOf(paramLong2), Integer.valueOf(i), Long.valueOf(l), Integer.valueOf((int)(360L * l / paramLong1)), Long.valueOf(paramLong1) });
      this.jUE.jTS = j;
      this.jUE.jTU = i;
      this.jUE.eOh = 1;
      this.jUD.setVisibility(0);
      this.jUI.setText(bg.aF(paramLong3));
      this.jUJ.setText(bg.aF(paramLong2));
      this.jUK.setText(bg.aF(l));
      if (paramLong2 > 0L)
      {
        this.jUM.setVisibility(0);
        this.jUH.setVisibility(0);
      }
      for (;;)
      {
        i = (int)(100L * paramLong3 / paramLong1);
        this.jUP.setText(getString(R.l.dhR, new Object[] { i + "%" }));
        i = (int)(100L * paramLong2 / paramLong1);
        this.jUQ.setText(getString(R.l.dib, new Object[] { i + "%" }));
        i = (int)(100L * l / paramLong1);
        this.jUR.setText(getString(R.l.did, new Object[] { i + "%" }));
        GMTrace.o(20539204698112L, 153029);
        return;
        this.jUH.setVisibility(8);
        this.jUM.setVisibility(8);
      }
    }
  }
  
  public final void a(long paramLong1, long paramLong2, long paramLong3, ArrayList<com.tencent.mm.plugin.clean.c.b> paramArrayList, long paramLong4, HashSet<String> paramHashSet)
  {
    GMTrace.i(20539741569024L, 153033);
    w.i("MicroMsg.CleanMsgUI", "%d on clean result cleanDataSize[%d] wechatSize[%d] otherAccSize[%d]", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Long.valueOf(paramLong4) });
    this.jUF.setVisibility(8);
    this.jUG.setEnabled(true);
    Y(0, true);
    c(paramLong2, paramLong4, paramLong3);
    if (paramLong1 > 0L)
    {
      this.jUN.setVisibility(0);
      this.jUN.setText(getString(R.l.dhV, new Object[] { bg.aF(paramLong1) }));
    }
    for (;;)
    {
      d.bc(paramLong1);
      d.aZ(paramLong2);
      d.bb(paramLong4);
      d.b(paramHashSet);
      d.ba(paramLong3);
      d.p(paramArrayList);
      if (paramLong4 <= 0L) {
        break;
      }
      com.tencent.mm.plugin.report.service.g.ork.a(282L, 9L, 1L, false);
      GMTrace.o(20539741569024L, 153033);
      return;
      this.jUN.setVisibility(8);
      this.jUN.setText("");
    }
    com.tencent.mm.plugin.report.service.g.ork.a(282L, 10L, 1L, false);
    GMTrace.o(20539741569024L, 153033);
  }
  
  public final void bQ(int paramInt1, int paramInt2)
  {
    GMTrace.i(20539607351296L, 153032);
    this.jUF.setText(getString(R.l.cRH, new Object[] { paramInt1 * 100 / paramInt2 + "%" }));
    GMTrace.o(20539607351296L, 153032);
  }
  
  public final void bR(int paramInt1, int paramInt2)
  {
    GMTrace.i(20539875786752L, 153034);
    this.htG.setMessage(getString(R.l.die, new Object[] { paramInt1 * 100 / paramInt2 + "%" }));
    GMTrace.o(20539875786752L, 153034);
  }
  
  public final void be(long paramLong)
  {
    GMTrace.i(20540010004480L, 153035);
    this.htG.dismiss();
    d.aZ(d.anZ() - paramLong);
    d.bc(d.aoc() + paramLong);
    d.aoc();
    c(d.anZ(), d.aob(), d.aoa());
    GMTrace.o(20540010004480L, 153035);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(20539070480384L, 153028);
    int i = R.i.ctw;
    GMTrace.o(20539070480384L, 153028);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(20539473133568L, 153031);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    d.aoc();
    c(d.anZ(), d.aob(), d.aoa());
    GMTrace.o(20539473133568L, 153031);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(20538936262656L, 153027);
    super.onCreate(paramBundle);
    com.tencent.mm.plugin.report.service.g.ork.a(282L, 3L, 1L, false);
    d.aof();
    this.jUF = ((TextView)findViewById(R.h.bTQ));
    this.jUE = ((PieView)findViewById(R.h.bTk));
    this.jUG = ((Button)findViewById(R.h.bph));
    this.jUH = ((Button)findViewById(R.h.bpl));
    this.jUD = findViewById(R.h.bdT);
    this.jUI = ((TextView)findViewById(R.h.coi));
    this.jUI.setTextSize(1, 16.0F);
    this.jUJ = ((TextView)findViewById(R.h.bSB));
    this.jUJ.setTextSize(1, 16.0F);
    this.jUK = ((TextView)findViewById(R.h.bSE));
    this.jUK.setTextSize(1, 16.0F);
    this.jUL = ((TextView)findViewById(R.h.bBg));
    this.jUL.setTextSize(1, 16.0F);
    this.jUN = ((TextView)findViewById(R.h.bpk));
    this.jUO = ((TextView)findViewById(R.h.bpm));
    this.jUP = ((TextView)findViewById(R.h.com));
    this.jUQ = ((TextView)findViewById(R.h.bSC));
    this.jUR = ((TextView)findViewById(R.h.bSG));
    this.jUM = ((View)findViewById(R.h.bSA));
    oM(R.l.dig);
    d.a(new com.tencent.mm.plugin.clean.c.a.b());
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(20544573407232L, 153069);
        CleanMsgUI.this.finish();
        GMTrace.o(20544573407232L, 153069);
        return false;
      }
    });
    this.jUH.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20544036536320L, 153065);
        com.tencent.mm.ui.base.h.a(CleanMsgUI.this, CleanMsgUI.this.getString(R.l.dic, new Object[] { bg.eL(d.aob()) }), "", CleanMsgUI.this.getString(R.l.cTM), CleanMsgUI.this.getString(R.l.cSk), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(20537459867648L, 153016);
            CleanMsgUI.a(CleanMsgUI.this, d.anY());
            GMTrace.o(20537459867648L, 153016);
          }
        }, null);
        GMTrace.o(20544036536320L, 153065);
      }
    });
    this.jUG.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20537191432192L, 153014);
        CleanMsgUI.this.startActivityForResult(new Intent(CleanMsgUI.this, CleanChattingUI.class), 0);
        com.tencent.mm.plugin.report.service.g.ork.a(282L, 4L, 1L, false);
        GMTrace.o(20537191432192L, 153014);
      }
    });
    a(0, R.k.cIQ, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(20536922996736L, 153012);
        CleanMsgUI.a(CleanMsgUI.this);
        GMTrace.o(20536922996736L, 153012);
        return false;
      }
    });
    Y(0, false);
    getString(R.l.cUG);
    this.htG = com.tencent.mm.ui.base.h.a(this, getString(R.l.dhT), false, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(20544841842688L, 153071);
        GMTrace.o(20544841842688L, 153071);
      }
    });
    this.htG.dismiss();
    if (d.agb() != null)
    {
      this.jUF.setVisibility(8);
      this.jUG.setEnabled(true);
      Y(0, true);
      d.aoc();
      c(d.anZ(), d.aob(), d.aoa());
      GMTrace.o(20538936262656L, 153027);
      return;
    }
    paramBundle = d.anX();
    if (paramBundle != null)
    {
      this.jVG = new c(paramBundle, this);
      com.tencent.mm.sdk.f.e.post(this.jVG, "CleanUI_clean");
      this.jUF.setText(getString(R.l.cRH, new Object[] { "0%" }));
    }
    GMTrace.o(20538936262656L, 153027);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(20539338915840L, 153030);
    Object localObject;
    if (this.jVG != null)
    {
      localObject = this.jVG;
      w.i("MicroMsg.CleanController", "stop CleanController [%d]", new Object[] { Integer.valueOf(localObject.hashCode()) });
      ((c)localObject).isStop = true;
      com.tencent.mm.sdk.f.e.L((Runnable)localObject);
    }
    if (this.jVA != null) {
      this.jVA.aoh();
    }
    if (d.anX() != null)
    {
      localObject = d.anX();
      Iterator localIterator = ((com.tencent.mm.plugin.clean.c.a.b)localObject).jTz.values().iterator();
      while (localIterator.hasNext()) {
        ((ae)localIterator.next()).removeCallbacksAndMessages(null);
      }
      localIterator = ((com.tencent.mm.plugin.clean.c.a.b)localObject).jTz.values().iterator();
      while (localIterator.hasNext())
      {
        ae localae = (ae)localIterator.next();
        localae.getLooper().getThread().interrupt();
        localae.getLooper().quit();
      }
      w.i("MicroMsg.ThreadController", "finish thread controller [%d]", new Object[] { Integer.valueOf(localObject.hashCode()) });
    }
    d.aog();
    d.aoe();
    super.onDestroy();
    GMTrace.o(20539338915840L, 153030);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\clean\ui\newui\CleanMsgUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */