package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmoveui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.a.b;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.f;
import com.tencent.mm.plugin.backup.f.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import java.lang.reflect.Method;

public class BakMoveOldUI
  extends BakMoveBaseUI
  implements e, a.b, com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.d
{
  private boolean gpJ;
  private boolean jfb;
  private int progress;
  
  public BakMoveOldUI()
  {
    GMTrace.i(14797638729728L, 110251);
    this.progress = -2;
    this.jfb = false;
    this.gpJ = false;
    GMTrace.o(14797638729728L, 110251);
  }
  
  private void agj()
  {
    GMTrace.i(14799249342464L, 110263);
    if (!this.jfb) {
      finish();
    }
    h.a(this, R.l.cXF, 0, R.l.cSk, R.l.cYE, null, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(14807839277056L, 110327);
        w.i("MicroMsg.BakMoveOldUI", "try cancel");
        a.afV().afW().bK(false);
        BakMoveOldUI.this.finish();
        GMTrace.o(14807839277056L, 110327);
      }
    });
    GMTrace.o(14799249342464L, 110263);
  }
  
  public final void MP()
  {
    GMTrace.i(14797907165184L, 110253);
    oM(R.l.cYr);
    this.jeJ.setVisibility(4);
    oM(R.l.cYv);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(14803678527488L, 110296);
        BakMoveOldUI.a(BakMoveOldUI.this);
        GMTrace.o(14803678527488L, 110296);
        return true;
      }
    });
    GMTrace.o(14797907165184L, 110253);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(14799383560192L, 110264);
    GMTrace.o(14799383560192L, 110264);
  }
  
  public final void aeg()
  {
    GMTrace.i(14798712471552L, 110259);
    GMTrace.o(14798712471552L, 110259);
  }
  
  public final void afS()
  {
    GMTrace.i(14798980907008L, 110261);
    this.progress = -1;
    this.jeK.setText(getString(R.l.cYx));
    GMTrace.o(14798980907008L, 110261);
  }
  
  public final void aga()
  {
    GMTrace.i(14798578253824L, 110258);
    w.d("MicroMsg.BakMoveOldUI", "begin to onNetFinish. ");
    this.gpJ = true;
    this.jfb = false;
    this.progress = -1;
    this.jeJ.setVisibility(0);
    this.jeJ.setText(R.l.cYH);
    this.jeL.setVisibility(4);
    this.jeK.setVisibility(4);
    this.jeM.setText(R.l.cYI);
    GMTrace.o(14798578253824L, 110258);
  }
  
  public final void b(long paramLong1, long paramLong2, int paramInt)
  {
    GMTrace.i(14798309818368L, 110256);
    w.d("MicroMsg.BakMoveOldUI", "onNetProgress sucSize : " + paramLong1 + " convDataSize : " + paramLong2 + " timeLeft : " + paramInt);
    String str;
    if (paramInt < 60)
    {
      str = getString(R.l.cYG);
      this.jeJ.setText(str);
      if (paramLong1 >= 512000L) {
        break label150;
      }
      this.jeJ.setVisibility(4);
      label89:
      if (paramLong2 != 0L) {
        break label161;
      }
    }
    int i;
    label150:
    label161:
    for (long l = 0L;; l = 100L * paramLong1 / paramLong2)
    {
      i = (int)l;
      if (this.progress != i) {
        break label173;
      }
      GMTrace.o(14798309818368L, 110256);
      return;
      str = getString(R.l.cYF, new Object[] { Integer.valueOf(paramInt / 60 + 1) });
      break;
      this.jeJ.setVisibility(0);
      break label89;
    }
    label173:
    if (this.progress > 0) {
      this.jeJ.setVisibility(0);
    }
    this.progress = i;
    if (paramInt <= 0) {
      this.jeK.setText(com.tencent.mm.plugin.backup.bakoldlogic.a.d.aR(paramLong1) + "/" + com.tencent.mm.plugin.backup.bakoldlogic.a.d.aR(paramLong2));
    }
    for (;;)
    {
      this.jeL.setProgress(i);
      GMTrace.o(14798309818368L, 110256);
      return;
      l = (paramLong2 - paramLong1) / paramInt;
      this.jeK.setText(com.tencent.mm.plugin.backup.bakoldlogic.a.d.aR(paramLong1) + "/" + com.tencent.mm.plugin.backup.bakoldlogic.a.d.aR(paramLong2) + "(" + com.tencent.mm.plugin.backup.bakoldlogic.a.d.aR(l) + "/s)");
    }
  }
  
  public final void bI(int paramInt1, int paramInt2)
  {
    GMTrace.i(14798444036096L, 110257);
    GMTrace.o(14798444036096L, 110257);
  }
  
  public final void n(int paramInt, long paramLong)
  {
    GMTrace.i(14798846689280L, 110260);
    this.jfb = true;
    if (this.progress >= paramInt)
    {
      GMTrace.o(14798846689280L, 110260);
      return;
    }
    if (this.progress < 0) {
      this.jeK.setVisibility(0);
    }
    this.progress = paramInt;
    this.jeK.setText(getString(R.l.cYy, new Object[] { Integer.valueOf(this.progress), com.tencent.mm.plugin.backup.bakoldlogic.a.d.aR(paramLong) }));
    this.jeL.setProgress(paramInt);
    GMTrace.o(14798846689280L, 110260);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(14797772947456L, 110252);
    super.onCreate(paramBundle);
    MP();
    a.afV().afW().jeg = this;
    a.afV().afW().jeh = this;
    try
    {
      paramBundle = WifiManager.class.getMethod("isWifiApEnabled", new Class[0]);
      WifiManager localWifiManager = (WifiManager)getSystemService("wifi");
      a.afV().afW().iXR = ((Boolean)paramBundle.invoke(localWifiManager, new Object[0])).booleanValue();
      w.d("MicroMsg.BakMoveOldUI", "old isWifiAp:%s", new Object[] { Boolean.valueOf(a.afV().afW().iXR) });
      GMTrace.o(14797772947456L, 110252);
      return;
    }
    catch (Exception paramBundle)
    {
      w.e("MicroMsg.BakMoveOldUI", "no such method WifiManager.isWifiApEnabled:%s", new Object[] { new ah() });
      GMTrace.o(14797772947456L, 110252);
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(14798041382912L, 110254);
    w.d("MicroMsg.BakMoveOldUI", " BakMoveOldUI onDestroy.");
    a.afV().afW().jeg = null;
    a.afV().afW().jeh = null;
    b.clear();
    super.onDestroy();
    GMTrace.o(14798041382912L, 110254);
  }
  
  public final void onError(int paramInt, String paramString)
  {
    GMTrace.i(14798175600640L, 110255);
    w.d("MicroMsg.BakMoveOldUI", "onError errorType : " + paramInt + " info : " + paramString);
    if (this.gpJ)
    {
      GMTrace.o(14798175600640L, 110255);
      return;
    }
    this.progress = -1;
    w.i("MicroMsg.BakMoveOldUI", "begin goto BakMoveErrUI");
    Intent localIntent = new Intent(ab.getContext(), BakMoveErrUI.class);
    localIntent.putExtra("err_type", paramInt);
    localIntent.putExtra("err_info", paramString);
    localIntent.addFlags(335544320);
    ab.getContext().startActivity(localIntent);
    finish();
    GMTrace.o(14798175600640L, 110255);
  }
  
  /* Error */
  public boolean onKeyDown(int paramInt, android.view.KeyEvent paramKeyEvent)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 381
    //   5: ldc_w 383
    //   8: invokestatic 32	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: iload_1
    //   12: iconst_4
    //   13: if_icmpne +22 -> 35
    //   16: aload_0
    //   17: invokespecial 50	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmoveui/BakMoveOldUI:agj	()V
    //   20: iconst_1
    //   21: istore_3
    //   22: ldc2_w 381
    //   25: ldc_w 383
    //   28: invokestatic 41	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   31: aload_0
    //   32: monitorexit
    //   33: iload_3
    //   34: ireturn
    //   35: aload_0
    //   36: iload_1
    //   37: aload_2
    //   38: invokespecial 385	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmoveui/BakMoveBaseUI:onKeyDown	(ILandroid/view/KeyEvent;)Z
    //   41: istore_3
    //   42: ldc2_w 381
    //   45: ldc_w 383
    //   48: invokestatic 41	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   51: goto -20 -> 31
    //   54: astore_2
    //   55: aload_0
    //   56: monitorexit
    //   57: aload_2
    //   58: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	59	0	this	BakMoveOldUI
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
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\bakoldmoveui\BakMoveOldUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */