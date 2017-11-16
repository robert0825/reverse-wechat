package com.tencent.mm.plugin.traceroute.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.traceroute.b.a;
import com.tencent.mm.plugin.traceroute.b.a.b;
import com.tencent.mm.plugin.traceroute.b.a.c;
import com.tencent.mm.plugin.traceroute.b.a.d;
import com.tencent.mm.plugin.traceroute.b.a.e;
import com.tencent.mm.plugin.traceroute.b.a.j;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMProgressBar;
import com.tencent.mm.ui.base.MMProgressBar.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bf.a;
import com.tencent.mm.y.q;
import java.util.Map;

public class NetworkDiagnoseUI
  extends MMActivity
{
  private ae handler;
  private TextView ljF;
  private int ngQ;
  private final int qAT;
  private int qAU;
  private a qAV;
  private MMProgressBar qAW;
  private aj qAX;
  
  public NetworkDiagnoseUI()
  {
    GMTrace.i(9992509849600L, 74450);
    this.qAT = 100;
    this.ngQ = 0;
    this.qAU = 0;
    this.qAX = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(9995865292800L, 74475);
        NetworkDiagnoseUI.a(NetworkDiagnoseUI.this, NetworkDiagnoseUI.a(NetworkDiagnoseUI.this) + 1);
        NetworkDiagnoseUI.b(NetworkDiagnoseUI.this, NetworkDiagnoseUI.b(NetworkDiagnoseUI.this));
        if (NetworkDiagnoseUI.b(NetworkDiagnoseUI.this) < 100)
        {
          NetworkDiagnoseUI.c(NetworkDiagnoseUI.this).setProgress(NetworkDiagnoseUI.b(NetworkDiagnoseUI.this));
          GMTrace.o(9995865292800L, 74475);
          return true;
        }
        NetworkDiagnoseUI.c(NetworkDiagnoseUI.this).setProgress(100);
        GMTrace.o(9995865292800L, 74475);
        return false;
      }
    }, true);
    this.handler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(9996939034624L, 74483);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(9996939034624L, 74483);
          return;
          if (NetworkDiagnoseUI.b(NetworkDiagnoseUI.this) < 95) {
            NetworkDiagnoseUI.c(NetworkDiagnoseUI.this).setProgress(95);
          }
          NetworkDiagnoseUI.d(NetworkDiagnoseUI.this).bsQ();
          GMTrace.o(9996939034624L, 74483);
          return;
          NetworkDiagnoseUI.e(NetworkDiagnoseUI.this);
          if (NetworkDiagnoseUI.b(NetworkDiagnoseUI.this) < 95) {
            NetworkDiagnoseUI.c(NetworkDiagnoseUI.this).setProgress(95);
          }
          NetworkDiagnoseUI.d(NetworkDiagnoseUI.this).bsQ();
          GMTrace.o(9996939034624L, 74483);
          return;
          NetworkDiagnoseUI.c(NetworkDiagnoseUI.this).setProgress(100);
          NetworkDiagnoseUI.a(NetworkDiagnoseUI.this, false);
          GMTrace.o(9996939034624L, 74483);
          return;
          NetworkDiagnoseUI.c(NetworkDiagnoseUI.this).setProgress(100);
          NetworkDiagnoseUI.a(NetworkDiagnoseUI.this, true);
        }
      }
    };
    GMTrace.o(9992509849600L, 74450);
  }
  
  private void bsW()
  {
    GMTrace.i(9993449373696L, 74457);
    h.a(this, R.l.dim, R.l.dmJ, R.l.cUW, R.l.cTJ, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(9997744340992L, 74489);
        NetworkDiagnoseUI.e(NetworkDiagnoseUI.this);
        NetworkDiagnoseUI.this.finish();
        GMTrace.o(9997744340992L, 74489);
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(9992375631872L, 74449);
        GMTrace.o(9992375631872L, 74449);
      }
    });
    GMTrace.o(9993449373696L, 74457);
  }
  
  protected final void MP()
  {
    GMTrace.i(9992778285056L, 74452);
    this.ljF = ((TextView)findViewById(R.h.bYv));
    this.qAW = ((MMProgressBar)findViewById(R.h.btQ));
    this.qAW.wdL = new MMProgressBar.a()
    {
      public final void vZ(int paramAnonymousInt)
      {
        GMTrace.i(9990496583680L, 74435);
        if (paramAnonymousInt < 5)
        {
          NetworkDiagnoseUI.f(NetworkDiagnoseUI.this).setText(NetworkDiagnoseUI.this.getString(R.l.diI));
          GMTrace.o(9990496583680L, 74435);
          return;
        }
        if ((paramAnonymousInt >= 5) && (paramAnonymousInt < 95))
        {
          NetworkDiagnoseUI.f(NetworkDiagnoseUI.this).setText(NetworkDiagnoseUI.this.getString(R.l.dBl));
          GMTrace.o(9990496583680L, 74435);
          return;
        }
        NetworkDiagnoseUI.f(NetworkDiagnoseUI.this).setText(NetworkDiagnoseUI.this.getString(R.l.efz));
        GMTrace.o(9990496583680L, 74435);
      }
    };
    sq("");
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9992107196416L, 74447);
        NetworkDiagnoseUI.g(NetworkDiagnoseUI.this);
        GMTrace.o(9992107196416L, 74447);
        return true;
      }
    });
    new ae().postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9996402163712L, 74479);
        NetworkDiagnoseUI.h(NetworkDiagnoseUI.this);
        GMTrace.o(9996402163712L, 74479);
      }
    }, 200L);
    GMTrace.o(9992778285056L, 74452);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9992912502784L, 74453);
    int i = R.i.cDb;
    GMTrace.o(9992912502784L, 74453);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9992644067328L, 74451);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(9992644067328L, 74451);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(9993315155968L, 74456);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      bsW();
      GMTrace.o(9993315155968L, 74456);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(9993315155968L, 74456);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(9993046720512L, 74454);
    this.qAW.lC(false);
    super.onPause();
    GMTrace.o(9993046720512L, 74454);
  }
  
  protected void onResume()
  {
    GMTrace.i(9993180938240L, 74455);
    at.AR();
    if (!com.tencent.mm.y.c.isSDCardAvailable())
    {
      u.fo(this);
      GMTrace.o(9993180938240L, 74455);
      return;
    }
    this.qAW.lC(true);
    super.onResume();
    GMTrace.o(9993180938240L, 74455);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\traceroute\ui\NetworkDiagnoseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */