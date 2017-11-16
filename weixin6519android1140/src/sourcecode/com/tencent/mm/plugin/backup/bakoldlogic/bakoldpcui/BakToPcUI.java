package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.c;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMWizardActivity;

public class BakToPcUI
  extends MMWizardActivity
  implements e.a
{
  private ae handler;
  private Button jgH;
  private Button jgI;
  private TextView jgJ;
  private TextView jgK;
  private int nJ;
  
  public BakToPcUI()
  {
    GMTrace.i(14771466272768L, 110056);
    this.nJ = -1;
    this.handler = new ae(Looper.getMainLooper());
    GMTrace.o(14771466272768L, 110056);
  }
  
  private void agE()
  {
    GMTrace.i(14772271579136L, 110062);
    if (this.nJ == 0)
    {
      this.jgH.setEnabled(true);
      this.jgI.setEnabled(true);
      GMTrace.o(14772271579136L, 110062);
      return;
    }
    this.jgH.setEnabled(false);
    this.jgI.setEnabled(false);
    GMTrace.o(14772271579136L, 110062);
  }
  
  public final void MP()
  {
    GMTrace.i(14771734708224L, 110058);
    oM(R.l.cYc);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(14770258313216L, 110047);
        a.agk().agl().kK(1);
        BakToPcUI.a(BakToPcUI.this);
        GMTrace.o(14770258313216L, 110047);
        return true;
      }
    });
    this.jgH = ((Button)findViewById(R.h.bfY));
    this.jgH.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(14775627022336L, 110087);
        if (BakToPcUI.b(BakToPcUI.this) == 0)
        {
          a.agk().agm().gns = 1;
          a.agk().agl().kK(0);
          paramAnonymousView = new Intent(BakToPcUI.this, BakWaitingUI.class);
          MMWizardActivity.A(BakToPcUI.this, paramAnonymousView);
        }
        GMTrace.o(14775627022336L, 110087);
      }
    });
    this.jgI = ((Button)findViewById(R.h.bfW));
    this.jgI.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(14767171305472L, 110024);
        if (BakToPcUI.b(BakToPcUI.this) == 0)
        {
          a.agk().agm().gns = 2;
          a.agk().agm().BH();
          a.agk().agl().kK(1);
          BakToPcUI.c(BakToPcUI.this);
        }
        GMTrace.o(14767171305472L, 110024);
      }
    });
    this.jgJ = ((TextView)findViewById(R.h.bgc));
    this.jgJ.setText(a.agk().agl().jfP);
    this.jgK = ((TextView)findViewById(R.h.bgd));
    this.jgK.setText(a.agk().agl().jfQ);
    GMTrace.o(14771734708224L, 110058);
  }
  
  public final void agw()
  {
    GMTrace.i(14772137361408L, 110061);
    this.nJ = 0;
    this.jgH.setVisibility(0);
    this.jgI.setVisibility(0);
    new ae(Looper.getMainLooper()).post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14757239193600L, 109950);
        BakToPcUI.d(BakToPcUI.this);
        GMTrace.o(14757239193600L, 109950);
      }
    });
    GMTrace.o(14772137361408L, 110061);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(14771868925952L, 110059);
    int i = R.i.cpQ;
    GMTrace.o(14771868925952L, 110059);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(14771600490496L, 110057);
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false))
    {
      GMTrace.o(14771600490496L, 110057);
      return;
    }
    MP();
    this.nJ = a.agk().agl().jfO;
    w.i("MicroMsg.BakToPcUI", "BakToPcUI auth onCreate nowCmd:%d", new Object[] { Integer.valueOf(this.nJ) });
    a.agk().agl().jfJ = this;
    agE();
    GMTrace.o(14771600490496L, 110057);
  }
  
  public void onDestroy()
  {
    GMTrace.i(14772003143680L, 110060);
    super.onDestroy();
    w.i("MicroMsg.BakToPcUI", "BakToPcUI auth onDestroy nowCmd:%d", new Object[] { Integer.valueOf(this.nJ) });
    a.agk().agl().jfJ = null;
    GMTrace.o(14772003143680L, 110060);
  }
  
  public final void onError(final int paramInt)
  {
    GMTrace.i(14772405796864L, 110063);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14756970758144L, 109948);
        w.d("MicroMsg.BakToPcUI", "BakToPcUI onCloseSocket errType: %d", new Object[] { Integer.valueOf(paramInt) });
        if (paramInt == -1)
        {
          w.d("MicroMsg.BakToPcUI", "BakToPcUI jump tips");
          Intent localIntent = new Intent();
          localIntent.putExtra("title", BakToPcUI.this.getString(R.l.cWW));
          localIntent.putExtra("rawUrl", BakToPcUI.this.getString(R.l.cWt, new Object[] { v.bPK() }));
          localIntent.putExtra("showShare", false);
          localIntent.putExtra("neverGetA8Key", true);
          d.b(BakToPcUI.this, "webview", ".ui.tools.WebViewUI", localIntent);
          GMTrace.o(14756970758144L, 109948);
          return;
        }
        BakToPcUI.e(BakToPcUI.this);
        GMTrace.o(14756970758144L, 109948);
      }
    });
    GMTrace.o(14772405796864L, 110063);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(14772540014592L, 110064);
    if (paramInt == 4)
    {
      a.agk().agm().gns = 3;
      a.agk().agm().BH();
      a.agk().agl().kK(1);
      Bh(1);
      GMTrace.o(14772540014592L, 110064);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(14772540014592L, 110064);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\bakoldpcui\BakToPcUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */