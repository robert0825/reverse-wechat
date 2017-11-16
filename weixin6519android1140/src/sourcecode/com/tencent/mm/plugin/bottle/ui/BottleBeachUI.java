package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.af.m.a;
import com.tencent.mm.af.m.a.a;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelsimple.ab;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.c.bak;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.s;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.y.at;

@com.tencent.mm.ui.base.a(1)
public class BottleBeachUI
  extends MMActivity
  implements View.OnClickListener, com.tencent.mm.ad.e, m.a.a, m.b
{
  private r hsU;
  private BallonImageView jpA;
  private LightHouseImageView jpB;
  private ImageView jpC;
  private MoonImageView jpD;
  private ImageView jpE;
  private int jpF;
  boolean jpG;
  private ImageView jpH;
  private ImageView jpI;
  private ImageView jpJ;
  private TextView jpK;
  private d jpL;
  private b jpM;
  private boolean jpN;
  private View jpv;
  private FrameLayout jpw;
  private ThrowBottleUI jpx;
  private PickBottleUI jpy;
  private OpenBottleUI jpz;
  
  public BottleBeachUI()
  {
    GMTrace.i(7607595040768L, 56681);
    this.jpF = 0;
    this.jpG = true;
    this.hsU = null;
    this.jpN = true;
    GMTrace.o(7607595040768L, 56681);
  }
  
  private void ahC()
  {
    GMTrace.i(7609071435776L, 56692);
    boolean bool = this.jpN;
    lc(bool);
    if (!bool) {}
    for (bool = true;; bool = false)
    {
      this.jpN = bool;
      GMTrace.o(7609071435776L, 56692);
      return;
    }
  }
  
  private void ahD()
  {
    GMTrace.i(7609742524416L, 56697);
    if (this.jpK == null)
    {
      this.jpK = ((TextView)findViewById(R.h.bhH));
      this.jpK.setBackgroundResource(s.fH(this.vKB.vKW));
    }
    int i = com.tencent.mm.plugin.bottle.a.c.aht();
    this.jpK.setText(String.valueOf(i));
    TextView localTextView = this.jpK;
    if (i > 0) {}
    for (i = 0;; i = 8)
    {
      localTextView.setVisibility(i);
      GMTrace.o(7609742524416L, 56697);
      return;
    }
  }
  
  private void i(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(7609608306688L, 56696);
    w.v("MM.UI.BottleUI", "set frame visible");
    if (this.jpw == null) {
      this.jpw = ((FrameLayout)findViewById(R.h.bhF));
    }
    this.jpv.setVisibility(paramInt1);
    if (paramInt1 == 0)
    {
      ahD();
      this.jpE.setVisibility(8);
      aLo();
    }
    Object localObject;
    if ((paramInt2 == 0) && (this.jpx == null))
    {
      this.jpx = ((ThrowBottleUI)View.inflate(this, R.i.cqu, null));
      this.jpw.addView(this.jpx);
      localObject = this.jpx;
      ((ThrowBottleUI)localObject).jss = new ToneGenerator(1, 60);
      ((ThrowBottleUI)localObject).jsv = ((Vibrator)((ThrowBottleUI)localObject).jqX.getSystemService("vibrator"));
      ((ThrowBottleUI)localObject).jsy = ((ImageView)((ThrowBottleUI)localObject).findViewById(R.h.bhZ));
      ((ThrowBottleUI)localObject).jsz = ((TextView)((ThrowBottleUI)localObject).findViewById(R.h.bhy));
      ((ThrowBottleUI)localObject).jsz.setVisibility(8);
      ((ThrowBottleUI)localObject).jsA = ((ImageView)((ThrowBottleUI)localObject).findViewById(R.h.bhY));
      ((ThrowBottleUI)localObject).jsB = ((MMEditText)((ThrowBottleUI)localObject).findViewById(R.h.bim));
      ((ThrowBottleUI)localObject).jsC = ((ThrowBottleUI)localObject).findViewById(R.h.bii);
      ((ThrowBottleUI)localObject).jsF = ((ThrowBottleFooter)((ThrowBottleUI)localObject).findViewById(R.h.bin));
      ((ThrowBottleUI)localObject).jru = ((ImageView)((ThrowBottleUI)localObject).jqX.findViewById(R.h.bhC));
      ((ThrowBottleUI)localObject).jsE = ((ImageButton)((ThrowBottleUI)localObject).findViewById(R.h.bhx));
      ((ThrowBottleUI)localObject).jsE.setOnClickListener((View.OnClickListener)localObject);
      ((ThrowBottleUI)localObject).jsD = ((Button)((ThrowBottleUI)localObject).findViewById(R.h.bij));
      ((ThrowBottleUI)localObject).jsD.setOnTouchListener(new ThrowBottleUI.2((ThrowBottleUI)localObject));
      ((ThrowBottleUI)localObject).setOnClickListener((View.OnClickListener)localObject);
      if (((ThrowBottleUI)localObject).jsI == null)
      {
        ((ThrowBottleUI)localObject).jsI = ((LinearLayout.LayoutParams)((ThrowBottleUI)localObject).jsB.getLayoutParams());
        ((ThrowBottleUI)localObject).jsK = ((ThrowBottleUI)localObject).jsI.topMargin;
      }
      ((ThrowBottleUI)localObject).jsF.jso = new ThrowBottleUI.1((ThrowBottleUI)localObject);
    }
    if (this.jpx != null) {
      this.jpx.setVisibility(paramInt2);
    }
    if ((paramInt3 == 0) && (this.jpy == null))
    {
      this.jpy = ((PickBottleUI)View.inflate(this, R.i.cqt, null));
      this.jpw.addView(this.jpy);
      this.jpy.MP();
    }
    if (this.jpy != null) {
      this.jpy.setVisibility(paramInt3);
    }
    if (paramInt3 == 0)
    {
      this.jpy.density = com.tencent.mm.br.a.getDensity(this);
      localObject = this.jpy;
      ((PickBottleUI)localObject).jrt.setVisibility(8);
      ((PickBottleUI)localObject).jrs.y(Integer.MAX_VALUE, -1, -1);
      ((PickBottleUI)localObject).jru.setVisibility(8);
      ((PickBottleUI)localObject).jqX.jpG = false;
      ((PickBottleUI)localObject).handler.postDelayed(((PickBottleUI)localObject).jrw, 1000L);
    }
    if ((paramInt4 == 0) && (this.jpz == null))
    {
      this.jpz = ((OpenBottleUI)View.inflate(this, R.i.cqs, null));
      this.jpw.addView(this.jpz);
      localObject = this.jpz;
      ((Button)((OpenBottleUI)localObject).findViewById(R.h.bhO)).setOnClickListener((View.OnClickListener)localObject);
      ((Button)((OpenBottleUI)localObject).findViewById(R.h.bhM)).setOnClickListener((View.OnClickListener)localObject);
      ((OpenBottleUI)localObject).jrn = this;
    }
    if (this.jpz != null) {
      this.jpz.setVisibility(paramInt4);
    }
    GMTrace.o(7609608306688L, 56696);
  }
  
  private void lg(int paramInt)
  {
    GMTrace.i(7609205653504L, 56693);
    if (paramInt > 0) {}
    for (String str = this.vKB.vKW.getString(paramInt);; str = null)
    {
      if (this.jpL == null) {
        this.jpL = new d(this);
      }
      this.jpL.cancel();
      if (str != null)
      {
        this.jpL.setDuration(0);
        this.jpL.setText(str);
        this.jpL.show();
      }
      GMTrace.o(7609205653504L, 56693);
      return;
    }
  }
  
  protected final void MP()
  {
    int j = 8;
    GMTrace.i(7608534564864L, 56688);
    oM(R.l.dba);
    a(0, R.l.cQm, R.k.cIU, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7630814707712L, 56854);
        paramAnonymousMenuItem = new Intent(BottleBeachUI.this, BottlePersonalInfoUI.class);
        paramAnonymousMenuItem.putExtra("is_allow_set", false);
        BottleBeachUI.this.startActivity(paramAnonymousMenuItem);
        GMTrace.o(7630814707712L, 56854);
        return false;
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7625043345408L, 56811);
        BottleBeachUI.this.aLo();
        BottleBeachUI.this.finish();
        GMTrace.o(7625043345408L, 56811);
        return false;
      }
    });
    boolean bool = bg.bQO();
    Object localObject;
    if (this.jpA == null)
    {
      localObject = (FrameLayout)findViewById(R.h.bhA);
      ((FrameLayout)((FrameLayout)localObject).getParent()).removeView((View)localObject);
      ((FrameLayout)getWindow().getDecorView()).addView((View)localObject, 0);
      if (bool)
      {
        i = R.g.aUk;
        ((FrameLayout)localObject).setBackgroundResource(i);
        ((FrameLayout)localObject).setVisibility(0);
        this.jpA = ((BallonImageView)findViewById(R.h.bhz));
        this.jpB = ((LightHouseImageView)findViewById(R.h.bhG));
        this.jpC = ((ImageView)findViewById(R.h.bie));
        this.jpD = ((MoonImageView)findViewById(R.h.bhI));
      }
    }
    else
    {
      localObject = this.jpA;
      if (!bool) {
        break label375;
      }
      i = 0;
      label190:
      ((BallonImageView)localObject).setVisibility(i);
      localObject = this.jpB;
      if (!bool) {
        break label381;
      }
      i = 8;
      label209:
      ((LightHouseImageView)localObject).setVisibility(i);
      this.jpD.jpC = this.jpC;
      localObject = this.jpD;
      if (!bool) {
        break label386;
      }
    }
    label375:
    label381:
    label386:
    for (int i = j;; i = 0)
    {
      ((MoonImageView)localObject).setVisibility(i);
      this.jpv = findViewById(R.h.bhB);
      this.jpv.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7644236480512L, 56954);
          BottleBeachUI.d(BottleBeachUI.this);
          GMTrace.o(7644236480512L, 56954);
        }
      });
      this.jpH = ((ImageView)findViewById(R.h.bhV));
      this.jpI = ((ImageView)findViewById(R.h.bhU));
      this.jpJ = ((ImageView)findViewById(R.h.bhT));
      this.jpH.setOnClickListener(this);
      this.jpI.setOnClickListener(this);
      this.jpJ.setOnClickListener(this);
      this.jpE = ((ImageView)findViewById(R.h.bhC));
      this.jpE.setOnClickListener(this);
      GMTrace.o(7608534564864L, 56688);
      return;
      i = R.g.aUs;
      break;
      i = 8;
      break label190;
      i = 0;
      break label209;
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(7608400347136L, 56687);
    GMTrace.o(7608400347136L, 56687);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7608668782592L, 56689);
    w.d("MM.UI.BottleUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if ((paramInt2 == 63534) && (this.jpF == 0))
    {
      lh(R.l.daZ);
      GMTrace.o(7608668782592L, 56689);
      return;
    }
    switch (paramk.getType())
    {
    default: 
      lg(R.l.dbi);
      GMTrace.o(7608668782592L, 56689);
      return;
    case 152: 
      ahD();
      GMTrace.o(7608668782592L, 56689);
      return;
    }
    w.i("MM.UI.BottleUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.hsU != null)
    {
      this.hsU.dismiss();
      this.hsU = null;
    }
    if (!com.tencent.mm.plugin.bottle.a.hnI.a(this.vKB.vKW, paramInt1, paramInt2, paramString))
    {
      if ((paramInt1 == 4) && (paramInt2 == -4))
      {
        com.tencent.mm.ui.base.h.h(this.vKB.vKW, R.l.cRe, R.l.cUG);
        GMTrace.o(7608668782592L, 56689);
        return;
      }
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        Toast.makeText(this.vKB.vKW, this.vKB.vKW.getString(R.l.dxd, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
        GMTrace.o(7608668782592L, 56689);
        return;
      }
      paramString = ((ab)paramk).LK();
      paramk = com.tencent.mm.platformtools.n.a(paramString.ufy);
      com.tencent.mm.ac.n.Dh().f(paramk, com.tencent.mm.platformtools.n.a(paramString.tQa));
      Intent localIntent = new Intent();
      com.tencent.mm.pluginsdk.ui.tools.c.a(localIntent, paramString, 25);
      if (bg.nl(paramk).length() > 0)
      {
        if ((paramString.uAv & 0x8) > 0) {
          com.tencent.mm.plugin.report.service.g.ork.A(10298, paramk + ",25");
        }
        com.tencent.mm.plugin.bottle.a.hnH.d(localIntent, this.vKB.vKW);
      }
    }
    GMTrace.o(7608668782592L, 56689);
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    GMTrace.i(7610010959872L, 56699);
    ahD();
    GMTrace.o(7610010959872L, 56699);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7607729258496L, 56682);
    int i = R.i.cqq;
    GMTrace.o(7607729258496L, 56682);
    return i;
  }
  
  public final void ja(String paramString)
  {
    GMTrace.i(7609876742144L, 56698);
    if (this.jpy != null)
    {
      Object localObject = this.jpy;
      if (((PickBottleUI)localObject).jrt != null)
      {
        localObject = ((PickBottleUI)localObject).jrt;
        if (paramString.equals(((PickedBottleImageView)localObject).jpc))
        {
          ((PickedBottleImageView)localObject).jrB = com.tencent.mm.af.m.d(((PickedBottleImageView)localObject).jpc, ((PickedBottleImageView)localObject).iconUrl, R.g.aYx);
          ((PickedBottleImageView)localObject).update();
          ((PickedBottleImageView)localObject).invalidate();
        }
      }
    }
    GMTrace.o(7609876742144L, 56698);
  }
  
  public final void lh(int paramInt)
  {
    GMTrace.i(7609339871232L, 56694);
    if (this.jpM == null) {
      this.jpM = new b(this);
    }
    b localb = this.jpM;
    String str = getString(paramInt);
    localb.huP.setText(str);
    this.jpM.show();
    GMTrace.o(7609339871232L, 56694);
  }
  
  public final void li(int paramInt)
  {
    GMTrace.i(7609474088960L, 56695);
    this.jpF = paramInt;
    lg(0);
    if (this.jpN) {
      ahC();
    }
    switch (paramInt)
    {
    default: 
      i(8, 8, 8, 8);
      GMTrace.o(7609474088960L, 56695);
      return;
    case 0: 
      this.jpG = true;
      i(0, 8, 8, 8);
      GMTrace.o(7609474088960L, 56695);
      return;
    case 1: 
      i(8, 0, 8, 8);
      GMTrace.o(7609474088960L, 56695);
      return;
    case 2: 
      i(8, 8, 0, 8);
      GMTrace.o(7609474088960L, 56695);
      return;
    }
    i(8, 8, 8, 0);
    GMTrace.o(7609474088960L, 56695);
  }
  
  public void onClick(final View paramView)
  {
    GMTrace.i(7608937218048L, 56691);
    int i = paramView.getId();
    if (R.h.bhV == i)
    {
      if (com.tencent.mm.plugin.bottle.a.c.ahr() > 0)
      {
        li(1);
        GMTrace.o(7608937218048L, 56691);
        return;
      }
      lh(R.l.dbc);
      GMTrace.o(7608937218048L, 56691);
      return;
    }
    if (R.h.bhU == i)
    {
      if (com.tencent.mm.plugin.bottle.a.c.ahs() > 0)
      {
        li(2);
        GMTrace.o(7608937218048L, 56691);
        return;
      }
      lh(R.l.dbb);
      GMTrace.o(7608937218048L, 56691);
      return;
    }
    if (R.h.bhT == i)
    {
      if (!this.jpN) {
        ahC();
      }
      paramView = new Intent();
      paramView.setClass(this, BottleConversationUI.class);
      paramView.putExtra("conversation_from", "from_beach");
      startActivity(paramView);
      GMTrace.o(7608937218048L, 56691);
      return;
    }
    if (R.h.bhC == i)
    {
      if (this.jpF == 3)
      {
        this.jpz.onPause();
        this.jpz.ahM();
      }
      li(0);
      i(0, 8, 8, 8);
      GMTrace.o(7608937218048L, 56691);
      return;
    }
    if (R.h.bhX == i)
    {
      Object localObject = ((PickedBottleImageView)paramView).jrh;
      paramView = ((PickedBottleImageView)paramView).jpc;
      if ((paramView != null) && (paramView.length() > 0))
      {
        li(0);
        at.AR();
        localObject = com.tencent.mm.y.c.yK().TE(paramView);
        if ((localObject != null) && ((int)((com.tencent.mm.l.a)localObject).fTq != 0) && (com.tencent.mm.l.a.eE(((af)localObject).field_type)))
        {
          paramView = new Intent();
          paramView.putExtra("Contact_User", ((af)localObject).field_username);
          if (((com.tencent.mm.storage.x)localObject).bSA())
          {
            com.tencent.mm.plugin.report.service.g.ork.A(10298, ((af)localObject).field_username + ",25");
            paramView.putExtra("Contact_Scene", 25);
          }
          com.tencent.mm.plugin.bottle.a.hnH.d(paramView, this.vKB.vKW);
          GMTrace.o(7608937218048L, 56691);
          return;
        }
        paramView = new ab(paramView);
        at.wS().a(paramView, 0);
        localObject = this.vKB.vKW;
        getString(R.l.cUG);
        this.hsU = com.tencent.mm.ui.base.h.a((Context)localObject, getString(R.l.cRh), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(7649202536448L, 56991);
            at.wS().c(paramView);
            GMTrace.o(7649202536448L, 56991);
          }
        });
        GMTrace.o(7608937218048L, 56691);
        return;
      }
      if (localObject != null)
      {
        li(3);
        paramView = this.jpz;
        if (paramView.jrg == null)
        {
          paramView.jrg = ((ThrowBottleAnimUI)paramView.jqX.findViewById(R.h.big));
          paramView.jrg.jsk = new OpenBottleUI.1(paramView);
        }
        if (paramView.jqY == null)
        {
          paramView.jqY = ((TextView)paramView.findViewById(R.h.bhN));
          paramView.jqZ = ((LinearLayout)paramView.findViewById(R.h.bhQ));
          paramView.jra = ((FrameLayout)paramView.findViewById(R.h.bhS));
          paramView.jrb = ((ImageView)paramView.findViewById(R.h.bhP));
          paramView.jrc = ((TextView)paramView.findViewById(R.h.bhR));
          paramView.jrd = ((TextView)paramView.findViewById(R.h.bhK));
          paramView.jre = ((TextView)paramView.findViewById(R.h.bhL));
          paramView.jra.setOnClickListener(paramView);
        }
        paramView.jrh = ((String)localObject);
        w.d("MM.Bottle_OpenBottleUI", (String)localObject);
        at.AR();
        paramView.eAH = com.tencent.mm.y.c.yM().Ca((String)localObject);
        if (paramView.eAH.bTu())
        {
          paramView.jqY.setVisibility(8);
          paramView.jqZ.setVisibility(0);
          float f = com.tencent.mm.modelvoice.q.A(paramView.eAH);
          paramView.jra.setMinimumWidth(com.tencent.mm.br.a.fromDPToPix(paramView.jqX, OpenBottleUI.ln((int)f)));
          paramView.jrc.setText(paramView.jqX.getString(R.l.dxn, new Object[] { Integer.valueOf((int)f) }));
          OpenBottleUI.jrf.a(paramView);
          if (paramView.eAH != null)
          {
            f = com.tencent.mm.modelvoice.q.aD(new com.tencent.mm.modelvoice.n(paramView.eAH.field_content).time);
            localObject = paramView.jra;
            paramView.getResources().getString(R.l.dbx);
            ((FrameLayout)localObject).setContentDescription(String.format("%d", new Object[] { Integer.valueOf((int)f) }));
          }
        }
        for (;;)
        {
          paramView.ahN();
          if (paramView.jrm == null)
          {
            paramView.jrm = ((TextView)paramView.findViewById(R.h.bxY));
            paramView.jrm.setOnClickListener(new OpenBottleUI.4(paramView));
          }
          GMTrace.o(7608937218048L, 56691);
          return;
          paramView.jqY.setVisibility(0);
          paramView.jqZ.setVisibility(8);
          localObject = paramView.eAH;
          paramView.jqY.setText(((ce)localObject).field_content);
          com.tencent.mm.pluginsdk.ui.d.h.e(paramView.jqY, 1);
        }
      }
      li(0);
    }
    GMTrace.o(7608937218048L, 56691);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7607863476224L, 56683);
    super.onCreate(paramBundle);
    if (!com.tencent.mm.y.q.zV())
    {
      at.AR();
      com.tencent.mm.y.c.yJ().b(new com.tencent.mm.av.g(11, 1));
    }
    MP();
    at.wS().a(152, this);
    at.wS().a(new com.tencent.mm.plugin.bottle.a.d(), 0);
    GMTrace.o(7607863476224L, 56683);
  }
  
  public void onDestroy()
  {
    GMTrace.i(7608266129408L, 56686);
    Object localObject;
    if (this.jpx != null)
    {
      localObject = this.jpx;
      ((ThrowBottleUI)localObject).jsr = null;
      ((ThrowBottleUI)localObject).jsu = null;
      if (((ThrowBottleUI)localObject).jsv != null)
      {
        ((ThrowBottleUI)localObject).jsv.cancel();
        ((ThrowBottleUI)localObject).jsv = null;
      }
      if (((ThrowBottleUI)localObject).jsw != null) {
        ((ThrowBottleUI)localObject).jsw.release();
      }
      ((ThrowBottleUI)localObject).jsw = null;
      ((ThrowBottleUI)localObject).jsx = null;
      ((ThrowBottleUI)localObject).jqX = null;
      if (((ThrowBottleUI)localObject).jss != null) {
        ((ThrowBottleUI)localObject).jss.release();
      }
      this.jpx = null;
    }
    if (this.jpy != null)
    {
      localObject = this.jpy;
      ((PickBottleUI)localObject).handler.removeCallbacks(((PickBottleUI)localObject).jrw);
      ((PickBottleUI)localObject).handler.removeCallbacks(((PickBottleUI)localObject).jrx);
      ((PickBottleUI)localObject).jqX = null;
      ((PickBottleUI)localObject).jrs = null;
      ((PickBottleUI)localObject).jrt = null;
      this.jpy = null;
    }
    if (this.jpL != null)
    {
      this.jpL.cancel();
      this.jpL.context = null;
      this.jpL = null;
    }
    if (this.jpz != null)
    {
      localObject = this.jpz;
      if ((((OpenBottleUI)localObject).eAH != null) && (((OpenBottleUI)localObject).eAH.bTu())) {
        ((OpenBottleUI)localObject).ahM();
      }
      ((OpenBottleUI)localObject).jqX = null;
      if (((OpenBottleUI)localObject).jrg != null)
      {
        ((OpenBottleUI)localObject).jrg.release();
        ((OpenBottleUI)localObject).jrg = null;
      }
      OpenBottleUI.jrf = null;
      at.AR();
      com.tencent.mm.y.c.yK().b((m.b)localObject);
      this.jpz = null;
    }
    this.jpA = null;
    this.jpB = null;
    this.jpD = null;
    if (this.jpM != null)
    {
      this.jpM.dismiss();
      this.jpM = null;
    }
    at.wS().b(152, this);
    super.onDestroy();
    GMTrace.o(7608266129408L, 56686);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7608803000320L, 56690);
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 1))
    {
      if (!this.jpG)
      {
        GMTrace.o(7608803000320L, 56690);
        return true;
      }
      if (this.jpF == 0) {
        finish();
      }
      for (;;)
      {
        GMTrace.o(7608803000320L, 56690);
        return true;
        li(0);
      }
    }
    if (this.jpF == 3)
    {
      w.v("MM.UI.BottleUI", "on key dwon");
      if ((paramInt == 25) && (this.jpz.ahP()))
      {
        at.AS().ei(0);
        GMTrace.o(7608803000320L, 56690);
        return true;
      }
      if ((paramInt == 24) && (this.jpz.ahP()))
      {
        at.AS().eh(0);
        GMTrace.o(7608803000320L, 56690);
        return true;
      }
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(7608803000320L, 56690);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(7608131911680L, 56685);
    super.onPause();
    if ((this.jpF == 1) && (this.jpx != null)) {
      this.jpx.ahZ();
    }
    if ((this.jpF == 3) && (this.jpz != null)) {
      this.jpz.onPause();
    }
    if (at.AU())
    {
      at.AR();
      com.tencent.mm.y.c.yP().b(this);
      at.wS().b(106, this);
    }
    com.tencent.mm.af.x.FO().b(this);
    GMTrace.o(7608131911680L, 56685);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(7610145177600L, 56700);
    w.i("MM.UI.BottleUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(7610145177600L, 56700);
      return;
      if (paramArrayOfInt[0] != 0) {
        com.tencent.mm.ui.base.h.a(this, getString(R.l.dNr), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(7621419466752L, 56784);
            BottleBeachUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
            GMTrace.o(7621419466752L, 56784);
          }
        }, null);
      }
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(7607997693952L, 56684);
    super.onResume();
    ahD();
    this.vKB.vKI.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7617929805824L, 56758);
        if ((BottleBeachUI.a(BottleBeachUI.this) != null) && (BottleBeachUI.b(BottleBeachUI.this) == 0) && (BottleBeachUI.c(BottleBeachUI.this))) {
          BottleBeachUI.d(BottleBeachUI.this);
        }
        GMTrace.o(7617929805824L, 56758);
      }
    }, 1000L);
    if ((this.jpF == 3) && (this.jpz != null))
    {
      OpenBottleUI localOpenBottleUI = this.jpz;
      if ((localOpenBottleUI.eAH != null) && (localOpenBottleUI.eAH.bTu())) {
        OpenBottleUI.jrf.a(localOpenBottleUI);
      }
      localOpenBottleUI.dp(true);
      localOpenBottleUI.jro = bg.Pw();
    }
    at.AR();
    com.tencent.mm.y.c.yP().a(this);
    com.tencent.mm.af.x.FO().a(this);
    at.wS().a(106, this);
    GMTrace.o(7607997693952L, 56684);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\bottle\ui\BottleBeachUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */