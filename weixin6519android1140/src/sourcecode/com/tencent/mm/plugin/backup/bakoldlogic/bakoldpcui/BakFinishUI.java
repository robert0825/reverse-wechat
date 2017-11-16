package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.backup.bakoldlogic.a.c;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMWizardActivity;

public class BakFinishUI
  extends MMWizardActivity
  implements e.e
{
  private ae handler;
  private int jgu;
  private TextView jgw;
  
  public BakFinishUI()
  {
    GMTrace.i(14765158039552L, 110009);
    this.handler = new ae(Looper.getMainLooper());
    GMTrace.o(14765158039552L, 110009);
  }
  
  protected final void MP()
  {
    GMTrace.i(14765560692736L, 110012);
    oM(R.l.cYc);
    this.jgw = ((TextView)findViewById(R.h.bfX));
    if (6 == this.jgu) {
      this.jgw.setText(getString(R.l.cYb));
    }
    for (;;)
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(14773747974144L, 110073);
          a.agk().agl().jfR = c.jdg;
          BakFinishUI.a(BakFinishUI.this);
          GMTrace.o(14773747974144L, 110073);
          return true;
        }
      });
      GMTrace.o(14765560692736L, 110012);
      return;
      if (1 == this.jgu) {
        this.jgw.setText(getString(R.l.cXU));
      }
    }
  }
  
  public final void agy()
  {
    GMTrace.i(14765963345920L, 110015);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14761802596352L, 109984);
        a.agk().agl().jfR = c.jdg;
        BakFinishUI.b(BakFinishUI.this);
        GMTrace.o(14761802596352L, 109984);
      }
    });
    GMTrace.o(14765963345920L, 110015);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(14765292257280L, 110010);
    int i = R.i.cpS;
    GMTrace.o(14765292257280L, 110010);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(14765426475008L, 110011);
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false))
    {
      GMTrace.o(14765426475008L, 110011);
      return;
    }
    this.jgu = getIntent().getIntExtra("cmd", -1);
    w.i("MicroMsg.BakFinishUI", "BakFinishUI onCreate nowCmd:%d", new Object[] { Integer.valueOf(this.jgu) });
    MP();
    a.agk().agl().jfK = this;
    GMTrace.o(14765426475008L, 110011);
  }
  
  public void onDestroy()
  {
    GMTrace.i(14765694910464L, 110013);
    super.onDestroy();
    a.agk().agl().jfK = null;
    w.i("MicroMsg.BakFinishUI", "BakFinishUI onDestroy nowCmd:%d", new Object[] { Integer.valueOf(this.jgu) });
    GMTrace.o(14765694910464L, 110013);
  }
  
  public final void onError(int paramInt)
  {
    GMTrace.i(14766097563648L, 110016);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14770526748672L, 110049);
        w.d("MicroMsg.BakFinishUI", "BakFinishUI onCloseSocket");
        Intent localIntent = new Intent(BakFinishUI.this, BakConnErrorUI.class);
        MMWizardActivity.A(BakFinishUI.this, localIntent);
        GMTrace.o(14770526748672L, 110049);
      }
    });
    GMTrace.o(14766097563648L, 110016);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(14765829128192L, 110014);
    if (paramInt == 4)
    {
      a.agk().agl().jfR = c.jdg;
      Bh(1);
      GMTrace.o(14765829128192L, 110014);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(14765829128192L, 110014);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\bakoldpcui\BakFinishUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */