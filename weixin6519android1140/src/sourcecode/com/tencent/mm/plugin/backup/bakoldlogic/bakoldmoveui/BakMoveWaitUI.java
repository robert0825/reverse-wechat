package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmoveui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.network.n.a;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.backup.a.h;
import com.tencent.mm.plugin.backup.bakoldlogic.a.d;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.f;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.f.a;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.i;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.j;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.ei;
import com.tencent.mm.protocal.c.ej;
import com.tencent.mm.protocal.c.nu;
import com.tencent.mm.protocal.j.b;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;

public class BakMoveWaitUI
  extends MMActivity
  implements com.tencent.mm.ad.e, f.a
{
  private com.tencent.mm.network.n gzE;
  private LinkedList<nu> iYB;
  private String iYC;
  private String iYD;
  private PLong jek;
  private PInt jel;
  private TextView jff;
  private ImageView jfg;
  private ArrayList<String> jfh;
  private aj jfi;
  private PowerManager.WakeLock wakeLock;
  
  public BakMoveWaitUI()
  {
    GMTrace.i(14801396826112L, 110279);
    this.jfh = null;
    this.jek = new PLong();
    this.jel = new PInt();
    this.iYD = "";
    this.gzE = new n.a()
    {
      public final void db(int paramAnonymousInt)
      {
        GMTrace.i(14794820157440L, 110230);
        w.d("MicroMsg.BakMoveWaitUI", "cdntra onNetworkChange st:%d ", new Object[] { Integer.valueOf(paramAnonymousInt) });
        BakMoveWaitUI.b(BakMoveWaitUI.this);
        GMTrace.o(14794820157440L, 110230);
      }
    };
    GMTrace.o(14801396826112L, 110279);
  }
  
  private void aeV()
  {
    GMTrace.i(14801665261568L, 110281);
    Object localObject = d.bY(this);
    w.i("MicroMsg.BakMoveWaitUI", "newWifiName: " + (String)localObject + " preWifiName : " + this.iYD);
    if (!((String)localObject).equals(this.iYD))
    {
      if (!at.AU())
      {
        GMTrace.o(14801665261568L, 110281);
        return;
      }
      this.iYD = ((String)localObject);
      if (!aeW())
      {
        GMTrace.o(14801665261568L, 110281);
        return;
      }
      if (at.wF())
      {
        w.d("MicroMsg.BakMoveWaitUI", "begin to netscene create QRCode offline");
        localObject = new j(this.iYB, this.iYC);
        at.wS().a((k)localObject, 0);
        GMTrace.o(14801665261568L, 110281);
        return;
      }
      w.d("MicroMsg.BakMoveWaitUI", "begin to netscene create QRCode online");
      localObject = new i(this.iYB, this.iYC);
      at.wS().a((k)localObject, 0);
    }
    GMTrace.o(14801665261568L, 110281);
  }
  
  private boolean aeW()
  {
    GMTrace.i(14801933697024L, 110283);
    this.iYB = new LinkedList();
    PString localPString = new PString();
    PInt localPInt = new PInt();
    if (!com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().aeI().a(localPString, localPInt))
    {
      kI(R.l.cYs);
      this.iYD = "";
      GMTrace.o(14801933697024L, 110283);
      return false;
    }
    w.i("MicroMsg.BakMoveWaitUI", "server listen result: %s, %d", new Object[] { localPString.value, Integer.valueOf(localPInt.value) });
    this.iYC = d.bY(this);
    w.i("MicroMsg.BakMoveWaitUI", "wifiName :%s", new Object[] { this.iYC });
    if (bg.nm(this.iYC))
    {
      kI(R.l.cYs);
      this.iYD = "";
      GMTrace.o(14801933697024L, 110283);
      return false;
    }
    nu localnu = new nu();
    localnu.uez = localPString.value;
    localnu.ueA = new LinkedList();
    localnu.ueA.add(Integer.valueOf(localPInt.value));
    this.iYB.add(localnu);
    GMTrace.o(14801933697024L, 110283);
    return true;
  }
  
  private void kI(int paramInt)
  {
    GMTrace.i(14802470567936L, 110287);
    this.jff.setText(paramInt);
    this.jff.setTextColor(this.vKB.vKW.getResources().getColor(R.e.aOL));
    this.jfg.setImageResource(R.g.aYH);
    GMTrace.o(14802470567936L, 110287);
  }
  
  public final void MP()
  {
    GMTrace.i(14801799479296L, 110282);
    oM(R.l.dYz);
    this.jff = ((TextView)findViewById(R.h.cil));
    this.jfg = ((ImageView)findViewById(R.h.bVv));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(14796296552448L, 110241);
        BakMoveWaitUI.this.finish();
        GMTrace.o(14796296552448L, 110241);
        return true;
      }
    });
    com.tencent.mm.a.e.f(new File(h.aer()));
    if (aeW())
    {
      this.iYD = null;
      aeV();
    }
    GMTrace.o(14801799479296L, 110282);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    Object localObject = null;
    GMTrace.i(14802336350208L, 110286);
    if (paramk.getType() == 704)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        w.i("MicroMsg.BakMoveWaitUI", "err: %d, %d, %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
        if (paramInt2 == -100)
        {
          paramString = new j(this.iYB, this.iYC);
          at.wS().a(paramString, 0);
          GMTrace.o(14802336350208L, 110286);
          return;
        }
        kI(R.l.cYt);
        GMTrace.o(14802336350208L, 110286);
        return;
      }
      paramk = (ej)((i)paramk).fUa.gtD.gtK;
      if (paramk == null) {
        paramString = (String)localObject;
      }
      for (;;)
      {
        if (paramString != null)
        {
          paramString = BitmapFactory.decodeByteArray(paramString, 0, paramString.length);
          this.jfg.setImageBitmap(paramString);
          this.jff.setText(R.l.cYu);
          this.jff.setTextColor(this.vKB.vKW.getResources().getColor(R.e.black));
        }
        GMTrace.o(14802336350208L, 110286);
        return;
        paramString = (String)localObject;
        if (paramk.tSU != null) {
          paramString = paramk.tSU.uNP.tJp;
        }
      }
    }
    if (paramk.getType() == 1000)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        w.i("MicroMsg.BakMoveWaitUI", "err: %d, %d, %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
        kI(R.l.cYt);
        GMTrace.o(14802336350208L, 110286);
        return;
      }
      paramk = ((j.b)((j)paramk).guL.AZ()).tKh;
      if (paramk != null) {
        break label417;
      }
      paramString = "";
      w.i("MicroMsg.NetSceneBakChatCreateQRCodeOffline", "onGYNetEnd QRCodeUrl:%s", new Object[] { paramString });
      if (paramk != null) {
        break label426;
      }
      paramString = null;
    }
    for (;;)
    {
      if (paramString != null)
      {
        paramString = BitmapFactory.decodeByteArray(paramString, 0, paramString.length);
        this.jfg.setImageBitmap(paramString);
        this.jff.setText(R.l.cYu);
        this.jff.setTextColor(this.vKB.vKW.getResources().getColor(R.e.black));
      }
      GMTrace.o(14802336350208L, 110286);
      return;
      label417:
      paramString = paramk.tSV;
      break;
      label426:
      if (paramk.tSU == null) {
        paramString = null;
      } else {
        paramString = paramk.tSU.uNP.tJp;
      }
    }
  }
  
  public final void agg()
  {
    GMTrace.i(14803007438848L, 110291);
    w.d("MicroMsg.BakMoveWaitUI", "onAuthOK. go to bakMoveOldUI.");
    startActivity(new Intent(this, BakMoveOldUI.class));
    finish();
    GMTrace.o(14803007438848L, 110291);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(14802873221120L, 110290);
    int i = R.i.cpP;
    GMTrace.o(14802873221120L, 110290);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(14803141656576L, 110292);
    GMTrace.o(14803141656576L, 110292);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(14801531043840L, 110280);
    super.onCreate(paramBundle);
    if (!at.AU())
    {
      finish();
      GMTrace.o(14801531043840L, 110280);
      return;
    }
    this.jfh = getIntent().getStringArrayListExtra("selected_records_username");
    this.jek.value = getIntent().getLongExtra("selected_records_addupsize", -1L);
    this.jel.value = getIntent().getIntExtra("selected_records_count", -1);
    if ((this.jfh == null) || (this.jfh.size() < 0) || (this.jek.value < 0L) || (this.jel.value <= 0))
    {
      finish();
      GMTrace.o(14801531043840L, 110280);
      return;
    }
    if (com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.e.agb() == null)
    {
      finish();
      GMTrace.o(14801531043840L, 110280);
      return;
    }
    MP();
    w.d("MicroMsg.BakMoveWaitUI", "resetMoveServerAndBakScene begin");
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().afW().bK(true);
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().afW().a(this.jfh, this.jek, this.jel);
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().afW().a(this);
    com.tencent.mm.plugin.backup.f.b.clear();
    com.tencent.mm.plugin.backup.f.b.a(com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().afW());
    com.tencent.mm.plugin.backup.f.b.a(com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().aeI());
    com.tencent.mm.plugin.backup.f.b.ku(2);
    at.wS().a(704, this);
    at.wS().a(1000, this);
    at.a(this.gzE);
    com.tencent.mm.plugin.backup.a.e.aeo();
    this.jfi = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(14795759681536L, 110237);
        BakMoveWaitUI.a(BakMoveWaitUI.this);
        GMTrace.o(14795759681536L, 110237);
        return true;
      }
    }, true);
    this.jfi.z(5000L, 5000L);
    this.wakeLock = ((PowerManager)getSystemService("power")).newWakeLock(26, "My Lock");
    GMTrace.o(14801531043840L, 110280);
  }
  
  public void onDestroy()
  {
    GMTrace.i(14802202132480L, 110285);
    w.i("MicroMsg.BakMoveWaitUI", "BakMoveWaitUI onDestroy.");
    if (this.jfi != null) {
      this.jfi.stopTimer();
    }
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().afW().a(null);
    at.wS().b(704, this);
    at.wS().b(1000, this);
    at.b(this.gzE);
    super.onDestroy();
    GMTrace.o(14802202132480L, 110285);
  }
  
  /* Error */
  public boolean onKeyDown(int paramInt, android.view.KeyEvent paramKeyEvent)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 593
    //   5: ldc_w 595
    //   8: invokestatic 50	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: iload_1
    //   12: iconst_4
    //   13: if_icmpne +22 -> 35
    //   16: aload_0
    //   17: invokevirtual 441	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmoveui/BakMoveWaitUI:finish	()V
    //   20: iconst_1
    //   21: istore_3
    //   22: ldc2_w 593
    //   25: ldc_w 595
    //   28: invokestatic 74	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   31: aload_0
    //   32: monitorexit
    //   33: iload_3
    //   34: ireturn
    //   35: aload_0
    //   36: iload_1
    //   37: aload_2
    //   38: invokespecial 597	com/tencent/mm/ui/MMActivity:onKeyDown	(ILandroid/view/KeyEvent;)Z
    //   41: istore_3
    //   42: ldc2_w 593
    //   45: ldc_w 595
    //   48: invokestatic 74	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   51: goto -20 -> 31
    //   54: astore_2
    //   55: aload_0
    //   56: monitorexit
    //   57: aload_2
    //   58: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	59	0	this	BakMoveWaitUI
    //   0	59	1	paramInt	int
    //   0	59	2	paramKeyEvent	android.view.KeyEvent
    //   21	21	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	11	54	finally
    //   16	20	54	finally
    //   22	31	54	finally
    //   35	51	54	finally
  }
  
  public void onPause()
  {
    GMTrace.i(14802739003392L, 110289);
    super.onPause();
    this.wakeLock.release();
    GMTrace.o(14802739003392L, 110289);
  }
  
  public void onResume()
  {
    GMTrace.i(14802604785664L, 110288);
    super.onResume();
    this.wakeLock.acquire();
    GMTrace.o(14802604785664L, 110288);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\bakoldmoveui\BakMoveWaitUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */