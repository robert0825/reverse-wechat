package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e.c;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMWizardActivity;

public class BakWaitingUI
  extends MMWizardActivity
  implements e.c
{
  private ae handler;
  private boolean jgM;
  private int nJ;
  
  public BakWaitingUI()
  {
    GMTrace.i(14776566546432L, 110094);
    this.handler = new ae(Looper.getMainLooper());
    GMTrace.o(14776566546432L, 110094);
  }
  
  protected final void MP()
  {
    GMTrace.i(14776834981888L, 110096);
    oM(R.l.cYc);
    if (this.jgM) {
      findViewById(R.h.bgb).setVisibility(8);
    }
    for (;;)
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(14767439740928L, 110026);
          BakWaitingUI.a(BakWaitingUI.this);
          GMTrace.o(14767439740928L, 110026);
          return true;
        }
      });
      GMTrace.o(14776834981888L, 110096);
      return;
      findViewById(R.h.bgb).setVisibility(0);
    }
  }
  
  final void agF()
  {
    GMTrace.i(14777506070528L, 110101);
    if ((6 == this.nJ) || (1 == this.nJ))
    {
      Intent localIntent = new Intent(this, BakOperatingUI.class);
      localIntent.putExtra("cmd", this.nJ);
      MMWizardActivity.A(this, localIntent);
    }
    GMTrace.o(14777506070528L, 110101);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(14776969199616L, 110097);
    int i = R.i.cpU;
    GMTrace.o(14776969199616L, 110097);
    return i;
  }
  
  public final void kN(int paramInt)
  {
    GMTrace.i(14777103417344L, 110098);
    this.nJ = paramInt;
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14769721442304L, 110043);
        BakWaitingUI.this.agF();
        GMTrace.o(14769721442304L, 110043);
      }
    });
    GMTrace.o(14777103417344L, 110098);
  }
  
  public final void kO(final int paramInt)
  {
    GMTrace.i(14777371852800L, 110100);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14776163893248L, 110091);
        w.d("MicroMsg.BakWaitingUI", "BakWaitingUI onCloseSocket errType: %d", new Object[] { Integer.valueOf(paramInt) });
        if (paramInt == -1)
        {
          w.d("MicroMsg.BakWaitingUI", "BakToPcUI jump tips");
          Intent localIntent = new Intent();
          localIntent.putExtra("title", BakWaitingUI.this.getString(R.l.cWW));
          localIntent.putExtra("rawUrl", BakWaitingUI.this.getString(R.l.cWt, new Object[] { v.bPK() }));
          localIntent.putExtra("showShare", false);
          localIntent.putExtra("neverGetA8Key", true);
          d.b(BakWaitingUI.this, "webview", ".ui.tools.WebViewUI", localIntent);
        }
        GMTrace.o(14776163893248L, 110091);
      }
    });
    GMTrace.o(14777371852800L, 110100);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(14776700764160L, 110095);
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false))
    {
      GMTrace.o(14776700764160L, 110095);
      return;
    }
    a.agk().agl().jfI = this;
    this.nJ = a.agk().agl().jfO;
    this.jgM = getIntent().getBooleanExtra("from_back_finish", false);
    w.i("MicroMsg.BakWaitingUI", "BakWaitingUI onCreate nowCmd:%d isFromFinish:%b", new Object[] { Integer.valueOf(this.nJ), Boolean.valueOf(this.jgM) });
    MP();
    agF();
    GMTrace.o(14776700764160L, 110095);
  }
  
  public void onDestroy()
  {
    GMTrace.i(14777237635072L, 110099);
    super.onDestroy();
    a.agk().agl().jfI = null;
    w.i("MicroMsg.BakWaitingUI", "BakWaitingUI onDestroy nowCmd:%d isFromFinish:%b", new Object[] { Integer.valueOf(this.nJ), Boolean.valueOf(this.jgM) });
    GMTrace.o(14777237635072L, 110099);
  }
  
  public final void onError(final int paramInt)
  {
    GMTrace.i(14777774505984L, 110103);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14775358586880L, 110085);
        w.d("MicroMsg.BakWaitingUI", "BakWaitingUI onCloseSocket errType: %d", new Object[] { Integer.valueOf(paramInt) });
        if (paramInt == -1)
        {
          w.d("MicroMsg.BakWaitingUI", "BakToPcUI jump tips");
          localIntent = new Intent();
          localIntent.putExtra("title", BakWaitingUI.this.getString(R.l.cWW));
          localIntent.putExtra("rawUrl", BakWaitingUI.this.getString(R.l.cWt, new Object[] { v.bPK() }));
          localIntent.putExtra("showShare", false);
          localIntent.putExtra("neverGetA8Key", true);
          d.b(BakWaitingUI.this, "webview", ".ui.tools.WebViewUI", localIntent);
          GMTrace.o(14775358586880L, 110085);
          return;
        }
        Intent localIntent = new Intent(BakWaitingUI.this, BakConnErrorUI.class);
        MMWizardActivity.A(BakWaitingUI.this, localIntent);
        GMTrace.o(14775358586880L, 110085);
      }
    });
    GMTrace.o(14777774505984L, 110103);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(14777640288256L, 110102);
    if (paramInt == 4)
    {
      Bh(1);
      GMTrace.o(14777640288256L, 110102);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(14777640288256L, 110102);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\bakoldpcui\BakWaitingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */