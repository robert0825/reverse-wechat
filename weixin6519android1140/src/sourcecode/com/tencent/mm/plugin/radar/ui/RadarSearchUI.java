package com.tencent.mm.plugin.radar.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.rd;
import com.tencent.mm.plugin.radar.a.d;
import com.tencent.mm.plugin.radar.a.e.d;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.v;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bt;
import com.tencent.mm.y.q;

@com.tencent.mm.ui.base.a(19)
public class RadarSearchUI
  extends MMBaseActivity
{
  private RadarViewController oaJ;
  private boolean oaK;
  
  public RadarSearchUI()
  {
    GMTrace.i(8928431702016L, 66522);
    this.oaJ = null;
    this.oaK = true;
    GMTrace.o(8928431702016L, 66522);
  }
  
  private void aZQ()
  {
    GMTrace.i(8928834355200L, 66525);
    gN(true);
    Object localObject = d.nZz;
    ((d)localObject).eMK = 0;
    ((d)localObject).nZD = 0L;
    ((d)localObject).nZD = d.aZG();
    localObject = d.nZz;
    ((d)localObject).nZE = 0;
    ((d)localObject).nZC = 0L;
    ((d)localObject).nZA = 0;
    ((d)localObject).nZB = 0L;
    ((d)localObject).nZC = d.aZG();
    if ((this.oaJ.obQ == e.d.oaa) || (this.oaJ.obQ == e.d.oab))
    {
      localObject = this.oaJ.obN;
      if (((com.tencent.mm.plugin.radar.a.e)localObject).gxh != null) {
        ((com.tencent.mm.plugin.radar.a.e)localObject).gxh.a(((com.tencent.mm.plugin.radar.a.e)localObject).fJt, true);
      }
      this.oaJ.obN.aZH();
      this.oaJ.obE.bac();
    }
    GMTrace.o(8928834355200L, 66525);
  }
  
  private static void gN(boolean paramBoolean)
  {
    GMTrace.i(8929505443840L, 66530);
    rd localrd = new rd();
    localrd.eWa.eWb = paramBoolean;
    com.tencent.mm.sdk.b.a.vgX.m(localrd);
    GMTrace.o(8929505443840L, 66530);
  }
  
  public Object getSystemService(String paramString)
  {
    GMTrace.i(8929639661568L, 66531);
    Object localObject = super.getSystemService(paramString);
    if ("layout_inflater".equals(paramString))
    {
      paramString = v.b((LayoutInflater)localObject);
      GMTrace.o(8929639661568L, 66531);
      return paramString;
    }
    GMTrace.o(8929639661568L, 66531);
    return localObject;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8928565919744L, 66523);
    super.onCreate(paramBundle);
    getWindow().setFlags(1024, 1024);
    requestWindowFeature(1);
    setContentView(R.i.cEc);
    this.oaJ = ((RadarViewController)findViewById(R.h.bVV));
    paramBundle = this.oaJ;
    Object localObject1 = (RelativeLayout)paramBundle.findViewById(R.h.bVN);
    Object localObject2 = (RelativeLayout.LayoutParams)((RelativeLayout)localObject1).getLayoutParams();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((Activity)paramBundle.getContext()).getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    ((RelativeLayout.LayoutParams)localObject2).width = localDisplayMetrics.widthPixels;
    ((RelativeLayout)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
    paramBundle.obH = ((RadarTipsView)paramBundle.findViewById(R.h.bWf));
    localObject1 = paramBundle.obH;
    localObject2 = ((RadarTipsView)localObject1).getContext();
    if (((RadarTipsView)localObject1).obh == null) {
      ((RadarTipsView)localObject1).obh = AnimationUtils.loadAnimation((Context)localObject2, R.a.aLN);
    }
    if (((RadarTipsView)localObject1).obi == null)
    {
      ((RadarTipsView)localObject1).obi = AnimationUtils.loadAnimation((Context)localObject2, R.a.aLO);
      ((RadarTipsView)localObject1).obi.setAnimationListener(new RadarTipsView.1((RadarTipsView)localObject1));
    }
    ((RadarTipsView)localObject1).obk = ((TextView)((RadarTipsView)localObject1).findViewById(R.h.bWg));
    ((RadarTipsView)localObject1).obl = ((RadarTipsView)localObject1).findViewById(R.h.bWe);
    ((RadarTipsView)localObject1).obm = ((LinearLayout)((RadarTipsView)localObject1).findViewById(R.h.bWh));
    ((RadarTipsView)localObject1).obm.setOnClickListener(new RadarTipsView.2((RadarTipsView)localObject1));
    localObject1 = paramBundle.obH;
    ((RadarTipsView)localObject1).obC = 1;
    ((RadarTipsView)localObject1).obs.sendEmptyMessageDelayed(2, 1000L);
    ((RadarTipsView)localObject1).obs.sendEmptyMessageDelayed(1, 9000L);
    localObject1 = paramBundle.obH;
    if (((RadarTipsView)localObject1).oby != 0L)
    {
      ((RadarTipsView)localObject1).obC = 0;
      ((RadarTipsView)localObject1).aZZ();
      ((RadarTipsView)localObject1).aZY();
      ((RadarTipsView)localObject1).obl.setVisibility(8);
      ((RadarTipsView)localObject1).obm.setVisibility(8);
      ((RadarTipsView)localObject1).setVisibility(8);
    }
    ((RadarTipsView)localObject1).obw = true;
    ((RadarTipsView)localObject1).oby = bg.Pw();
    ((RadarTipsView)localObject1).obz = true;
    ((RadarTipsView)localObject1).obx += 1;
    paramBundle.obJ = ((TextView)paramBundle.findViewById(R.h.bVT));
    paramBundle.obK = ((ProgressBar)paramBundle.findViewById(R.h.bVU));
    paramBundle.obL = ((Button)paramBundle.findViewById(R.h.bVX));
    paramBundle.obL.setOnClickListener(paramBundle.obT);
    paramBundle.obM = paramBundle.findViewById(R.h.bVK);
    paramBundle.obE = ((RadarWaveView)((Activity)paramBundle.getContext()).findViewById(R.h.bWi));
    localObject1 = paramBundle.obE;
    ((RadarWaveView)localObject1).oct = ((RadarWaveView)localObject1).findViewById(R.h.bWb);
    ((RadarWaveView)localObject1).ocu = AnimationUtils.loadAnimation(((RadarWaveView)localObject1).getContext(), R.a.aLQ);
    ((RadarWaveView)localObject1).ocu.setInterpolator(new LinearInterpolator());
    b.a.a((ImageView)paramBundle.findViewById(R.h.cbZ), q.zE());
    paramBundle.obF = ((RadarMemberView)paramBundle.findViewById(R.h.bVO));
    paramBundle.obF.oaB = new RadarViewController.3(paramBundle);
    paramBundle.obG = ((RadarSpecialGridView)paramBundle.findViewById(R.h.bWd));
    paramBundle.obP = new RadarViewController.b(paramBundle, paramBundle.obG, paramBundle.getContext());
    paramBundle.obG.a(new RadarViewController.4(paramBundle));
    paramBundle = this.oaJ;
    localObject1 = paramBundle.obO;
    at.AR();
    com.tencent.mm.y.c.yK().a((m.b)localObject1);
    com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.radar.a.c)localObject1).nZi);
    at.getSysCmdMsgExtension().a("addcontact", ((com.tencent.mm.plugin.radar.a.c)localObject1).kAP, true);
    paramBundle = paramBundle.obN;
    at.wS().a(425, paramBundle);
    at.wS().a(602, paramBundle);
    at.AR();
    int i = ((Integer)com.tencent.mm.y.c.xh().get(229377, Integer.valueOf(0))).intValue();
    at.AR();
    com.tencent.mm.y.c.xh().set(229377, Integer.valueOf(i + 1));
    GMTrace.o(8928565919744L, 66523);
  }
  
  public void onDestroy()
  {
    GMTrace.i(8929237008384L, 66528);
    Object localObject1;
    if (this.oaJ != null)
    {
      localObject1 = this.oaJ;
      Object localObject2 = ((RadarViewController)localObject1).obO;
      at.AR();
      com.tencent.mm.y.c.yK().b((m.b)localObject2);
      com.tencent.mm.sdk.b.a.vgX.c(((com.tencent.mm.plugin.radar.a.c)localObject2).nZi);
      at.getSysCmdMsgExtension().b("addcontact", ((com.tencent.mm.plugin.radar.a.c)localObject2).kAP, true);
      localObject2 = ((RadarViewController)localObject1).obN;
      at.wS().b(425, (com.tencent.mm.ad.e)localObject2);
      at.wS().b(602, (com.tencent.mm.ad.e)localObject2);
      ((com.tencent.mm.plugin.radar.a.e)localObject2).stop();
      if (((com.tencent.mm.plugin.radar.a.e)localObject2).gxh != null) {
        ((com.tencent.mm.plugin.radar.a.e)localObject2).gxh.c(((com.tencent.mm.plugin.radar.a.e)localObject2).fJt);
      }
      localObject1 = ((RadarViewController)localObject1).obE;
    }
    try
    {
      if (((RadarWaveView)localObject1).ocs != null)
      {
        ((RadarWaveView)localObject1).ocs.stop();
        ((RadarWaveView)localObject1).ocs.release();
        ((RadarWaveView)localObject1).ocs = null;
      }
      super.onDestroy();
      GMTrace.o(8929237008384L, 66528);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.RadarWaveView", localException, "", new Object[0]);
        w.e("MicroMsg.RadarWaveView", "stop() crash, because of the native mediaplay is null.");
        ((RadarWaveView)localObject1).ocs = null;
      }
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(8929371226112L, 66529);
    boolean bool = false;
    if (this.oaJ != null) {
      bool = this.oaJ.onKeyDown(paramInt, paramKeyEvent);
    }
    if (bool)
    {
      GMTrace.o(8929371226112L, 66529);
      return bool;
    }
    bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(8929371226112L, 66529);
    return bool;
  }
  
  public void onPause()
  {
    GMTrace.i(8929102790656L, 66527);
    super.onPause();
    gN(false);
    Object localObject = d.nZz;
    long l1;
    if (((d)localObject).nZD != 0L)
    {
      l1 = d.aZG() - ((d)localObject).nZD;
      if (l1 > 500L) {
        break label403;
      }
      i = 1;
      if (i != 0) {
        break label408;
      }
    }
    label403:
    label408:
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        i = ((d)localObject).eMK;
        w.d("MicroMsg.RadarKvStatReport", "FoundFriendsCnt %d", new Object[] { Integer.valueOf(i) });
        g.ork.A(10679, String.format("%d", new Object[] { Integer.valueOf(i) }));
        ((d)localObject).nZA += 1;
        ((d)localObject).nZB = (l1 + ((d)localObject).nZB);
        ((d)localObject).nZD = 0L;
      }
      localObject = d.nZz;
      if (((d)localObject).nZC != 0L)
      {
        l1 = System.currentTimeMillis();
        long l2 = ((d)localObject).nZC;
        i = ((d)localObject).nZA;
        float f1 = (float)((d)localObject).nZB * 1.0F / 1000.0F;
        int j = ((d)localObject).nZE;
        float f2 = (float)(l1 - l2) * 1.0F / 1000.0F;
        w.d("MicroMsg.RadarKvStatReport", "RadarAddFriendStat %d,%d,%s,%d,%s", new Object[] { Integer.valueOf(1), Integer.valueOf(i), Float.valueOf(f1), Integer.valueOf(j), Float.valueOf(f2) });
        g.ork.A(10676, String.format("%d,%d,%s,%d,%s", new Object[] { Integer.valueOf(1), Integer.valueOf(i), Float.valueOf(f1), Integer.valueOf(j), Float.valueOf(f2) }));
      }
      if ((this.oaJ.obQ == e.d.oaa) || (this.oaJ.obQ == e.d.oab))
      {
        this.oaJ.obN.aZI();
        localObject = this.oaJ.obN;
        if (((com.tencent.mm.plugin.radar.a.e)localObject).gxh != null) {
          ((com.tencent.mm.plugin.radar.a.e)localObject).gxh.c(((com.tencent.mm.plugin.radar.a.e)localObject).fJt);
        }
        this.oaJ.obE.bad();
      }
      GMTrace.o(8929102790656L, 66527);
      return;
      i = 0;
      break;
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(8928968572928L, 66526);
    w.i("MicroMsg.RadarSearchUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(8928968572928L, 66526);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        aZQ();
        GMTrace.o(8928968572928L, 66526);
        return;
      }
      this.oaK = false;
      h.a(this, getString(R.l.dNq), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(8905346252800L, 66350);
          RadarSearchUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          RadarSearchUI.a(RadarSearchUI.this);
          RadarSearchUI.this.finish();
          GMTrace.o(8905346252800L, 66350);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(8923734081536L, 66487);
          RadarSearchUI.a(RadarSearchUI.this);
          RadarSearchUI.this.finish();
          GMTrace.o(8923734081536L, 66487);
        }
      });
    }
  }
  
  public void onResume()
  {
    GMTrace.i(8928700137472L, 66524);
    super.onResume();
    if (this.oaK)
    {
      boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.ACCESS_COARSE_LOCATION", 64, null, null);
      w.i("MicroMsg.RadarSearchUI", "summerper checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
      {
        GMTrace.o(8928700137472L, 66524);
        return;
      }
      aZQ();
    }
    GMTrace.o(8928700137472L, 66524);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\radar\ui\RadarSearchUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */