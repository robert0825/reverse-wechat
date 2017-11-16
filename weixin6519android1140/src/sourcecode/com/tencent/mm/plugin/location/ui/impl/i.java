package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.ca;
import com.tencent.mm.g.a.ca.b;
import com.tencent.mm.g.a.dh;
import com.tencent.mm.g.a.dh.b;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.modelsimple.aa;
import com.tencent.mm.plugin.location.model.LocationInfo;
import com.tencent.mm.plugin.location.ui.n.1;
import com.tencent.mm.pluginsdk.ui.tools.AppChooserUI;
import com.tencent.mm.pluginsdk.ui.tools.r;
import com.tencent.mm.protocal.c.azy;
import com.tencent.mm.protocal.c.azz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.widget.f;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.HashMap;

public class i
  extends a
  implements com.tencent.mm.ad.e
{
  protected long eDr;
  private boolean eON;
  private boolean jaO;
  public com.tencent.mm.remoteservice.d kSj;
  private long mBs;
  private String mEN;
  com.tencent.mm.plugin.location.ui.n mEO;
  public f mEP;
  boolean mEQ;
  private Runnable mER;
  private com.tencent.mm.modelgeo.a.a mES;
  
  public i(Activity paramActivity)
  {
    super(paramActivity);
    GMTrace.i(9707162959872L, 72324);
    this.eDr = -1L;
    this.mEN = "";
    this.eON = true;
    this.kSj = new com.tencent.mm.remoteservice.d(this.activity);
    this.mEQ = false;
    this.mES = new com.tencent.mm.modelgeo.a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(15405645037568L, 114781);
        if (!paramAnonymousBoolean)
        {
          GMTrace.o(15405645037568L, 114781);
          return false;
        }
        w.d("MicroMsg.ViewMapUI", "onGetLocation flong " + paramAnonymousFloat1 + " flat " + paramAnonymousFloat2);
        if ((paramAnonymousFloat2 == 0.0D) && (paramAnonymousFloat1 == 0.0D))
        {
          GMTrace.o(15405645037568L, 114781);
          return true;
        }
        w.d("MicroMsg.ViewMapUI", "myLocation " + i.this.mCf.mwH + " " + i.this.mCf.mwI);
        if (!i.this.mCf.aKd())
        {
          w.d("MicroMsg.ViewMapUI", "location my show");
          i.this.mCf.mwH = paramAnonymousFloat2;
          i.this.mCf.mwI = paramAnonymousFloat1;
          i.this.mCj.a(i.this.mCf.mwH, i.this.mCf.mwI, i.this.mCr, i.this.mCf.mwG);
        }
        GMTrace.o(15405645037568L, 114781);
        return true;
      }
    };
    this.jaO = false;
    this.mBs = 0L;
    at.wS().a(424, this);
    GMTrace.o(9707162959872L, 72324);
  }
  
  protected final String Qb()
  {
    GMTrace.i(9708907790336L, 72337);
    String str = getString(R.l.dGK);
    GMTrace.o(9708907790336L, 72337);
    return str;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(9709578878976L, 72342);
    w.d("MicroMsg.ViewMapUI", "onScene end %d %d %d", new Object[] { Integer.valueOf(paramk.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramk.getType() == 424)
    {
      if ((paramInt2 == 0) && (paramInt1 == 0))
      {
        paramString = aa.lr(((aa)paramk).LJ().tWx);
        w.d("MicroMsg.ViewMapUI", "getUrl success! url is %s", new Object[] { paramString });
        this.mEN = paramString;
        if (!bg.nm(paramString)) {
          this.mEQ = true;
        }
        if ((this.type == 9) && (!bg.nm(paramString)))
        {
          paramString = (TextView)findViewById(R.h.cfY);
          paramString.setVisibility(0);
          paramString.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(9678037712896L, 72107);
              i.this.aLM();
              GMTrace.o(9678037712896L, 72107);
            }
          });
        }
        GMTrace.o(9709578878976L, 72342);
      }
    }
    else {
      w.e("MicroMsg.ViewMapUI", "msg failed.errtype:%d, errcode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    }
    GMTrace.o(9709578878976L, 72342);
  }
  
  public void aLB()
  {
    GMTrace.i(9709176225792L, 72339);
    if (this.mEO != null) {
      this.mEO.fJ(false);
    }
    GMTrace.o(9709176225792L, 72339);
  }
  
  public void aLC()
  {
    GMTrace.i(9709310443520L, 72340);
    if (this.mEO != null) {
      this.mEO.fJ(true);
    }
    GMTrace.o(9709310443520L, 72340);
  }
  
  protected void aLD()
  {
    GMTrace.i(9707699830784L, 72328);
    GMTrace.o(9707699830784L, 72328);
  }
  
  public void aLE()
  {
    GMTrace.i(9709444661248L, 72341);
    GMTrace.o(9709444661248L, 72341);
  }
  
  protected void aLF()
  {
    GMTrace.i(14562220834816L, 108497);
    GMTrace.o(14562220834816L, 108497);
  }
  
  public final void aLL()
  {
    GMTrace.i(9707431395328L, 72326);
    this.mEP = new f(this.activity, f.xpQ, false);
    this.mEP.qik = new p.c()
    {
      public final void a(com.tencent.mm.ui.base.n paramAnonymousn)
      {
        GMTrace.i(9684882817024L, 72158);
        paramAnonymousn.a(1, i.this.getString(R.l.cUx), 0);
        if (i.this.type == 1) {
          paramAnonymousn.a(3, i.this.getString(R.l.dNH), 0);
        }
        for (;;)
        {
          dh localdh = new dh();
          localdh.eEV.eDr = i.this.eDr;
          com.tencent.mm.sdk.b.a.vgX.m(localdh);
          if ((localdh.eEW.eEu) || (com.tencent.mm.pluginsdk.model.app.g.l(ab.getContext(), 4L))) {
            paramAnonymousn.a(6, i.this.getString(R.l.dnp), 0);
          }
          GMTrace.o(9684882817024L, 72158);
          return;
          if ((i.this.type == 2) && (i.this.activity.getIntent().getBooleanExtra("kFavCanDel", true)))
          {
            paramAnonymousn.a(5, i.this.getString(R.l.dtk), 0);
            paramAnonymousn.a(4, i.this.getString(R.l.cSt), 0);
          }
        }
      }
    };
    this.mEP.qil = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(9698573025280L, 72260);
        switch (paramAnonymousMenuItem.getItemId())
        {
        }
        for (;;)
        {
          GMTrace.o(9698573025280L, 72260);
          return;
          i.this.aLM();
          GMTrace.o(9698573025280L, 72260);
          return;
          if (i.this.type == 2) {
            com.tencent.mm.plugin.report.service.g.ork.i(10651, new Object[] { Integer.valueOf(6), Integer.valueOf(1), Integer.valueOf(0) });
          }
          paramAnonymousMenuItem = new Intent();
          paramAnonymousMenuItem.putExtra("Retr_Msg_content", com.tencent.mm.plugin.location.model.e.a(i.this.mCe));
          paramAnonymousMenuItem.putExtra("Retr_Msg_Type", 9);
          com.tencent.mm.bj.d.a(i.this.activity, ".ui.transmit.MsgRetransmitUI", paramAnonymousMenuItem);
          GMTrace.o(9698573025280L, 72260);
          return;
          i.this.mCl = 0;
          i.this.aLO();
          GMTrace.o(9698573025280L, 72260);
          return;
          i.this.aLN();
          GMTrace.o(9698573025280L, 72260);
          return;
          h.a(i.this.activity, i.this.activity.getString(R.l.cSu), "", new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(9678843019264L, 72113);
              long l = i.this.activity.getIntent().getLongExtra("kFavInfoLocalId", -1L);
              paramAnonymous2DialogInterface = new ca();
              paramAnonymous2DialogInterface.eDn.eDp = l;
              com.tencent.mm.sdk.b.a.vgX.m(paramAnonymous2DialogInterface);
              boolean bool = bg.a(Boolean.valueOf(paramAnonymous2DialogInterface.eDo.eDb), false);
              w.d("MicroMsg.ViewMapUI", "do del fav voice, local id %d, result %B", new Object[] { Long.valueOf(l), Boolean.valueOf(bool) });
              if (bool) {
                i.this.activity.finish();
              }
              GMTrace.o(9678843019264L, 72113);
            }
          }, null);
          GMTrace.o(9698573025280L, 72260);
          return;
          long l = i.this.activity.getIntent().getLongExtra("kFavInfoLocalId", -1L);
          paramAnonymousMenuItem = new Intent();
          paramAnonymousMenuItem.putExtra("key_fav_item_id", l);
          paramAnonymousMenuItem.putExtra("key_fav_scene", 2);
          com.tencent.mm.bj.d.b(i.this.activity, "favorite", ".ui.FavTagEditUI", paramAnonymousMenuItem);
          GMTrace.o(9698573025280L, 72260);
          return;
          paramAnonymousMenuItem = new Intent();
          paramAnonymousMenuItem.putExtra("Retr_Msg_content", com.tencent.mm.plugin.location.model.e.a(i.this.mCe));
          paramAnonymousMenuItem.putExtra("Retr_Msg_Id", i.this.eDr);
          com.tencent.mm.bj.d.a(i.this.activity, ".ui.chatting.ChattingSendDataToDeviceUI", paramAnonymousMenuItem);
        }
      }
    };
    GMTrace.o(9707431395328L, 72326);
  }
  
  protected final void aLM()
  {
    GMTrace.i(14562355052544L, 108498);
    if (this.mEQ)
    {
      r.a(new com.tencent.mm.pluginsdk.ui.tools.e());
      Intent localIntent = new Intent();
      localIntent.putExtra("show_bottom", false);
      localIntent.putExtra("jsapi_args_appid", "wx751a1acca5688ba3");
      localIntent.putExtra("rawUrl", this.mEN);
      localIntent.putExtra("title", R.l.dVh);
      localIntent.putExtra("webview_bg_color_rsID", R.e.black);
      com.tencent.mm.bj.d.b(this.activity, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
    }
    GMTrace.o(14562355052544L, 108498);
  }
  
  protected final void aLN()
  {
    GMTrace.i(9708370919424L, 72333);
    w.d("MicroMsg.ViewMapUI", "directlyFavorite lat %s, long %s, scale", new Object[] { Double.valueOf(this.mCe.mwH), Double.valueOf(this.mCe.mwI) });
    Intent localIntent = new Intent();
    localIntent.putExtra("kfavorite", true);
    localIntent.putExtra("kopenGmapNums", this.mCd.myQ);
    localIntent.putExtra("kopenOthersNums", this.mCd.myR);
    localIntent.putExtra("kopenreportType", this.mCd.gPO);
    localIntent.putExtra("kRemark", aLl());
    localIntent.putExtra("kwebmap_slat", this.mCe.mwH);
    localIntent.putExtra("kwebmap_lng", this.mCe.mwI);
    localIntent.putExtra("Kwebmap_locaion", this.mCe.mwJ);
    localIntent.putExtra("kPoiName", this.mzo);
    this.activity.setResult(-1, localIntent);
    this.activity.getIntent().getIntExtra("MMActivity.OverrideEnterAnimation", -1);
    this.activity.getIntent().getIntExtra("MMActivity.OverrideExitAnimation", -1);
    this.activity.finish();
    GMTrace.o(9708370919424L, 72333);
  }
  
  protected final void aLO()
  {
    GMTrace.i(9708505137152L, 72334);
    com.tencent.mm.plugin.report.service.g.ork.i(12809, new Object[] { Integer.valueOf(3), "" });
    w.d("MicroMsg.ViewMapUI", "locationLine, locationInfo.slat=%f, locationInfo.slong=%f, myLocation.slat=%f, myLocation.slong=%f", new Object[] { Double.valueOf(this.mCe.mwH), Double.valueOf(this.mCe.mwI), Double.valueOf(this.mCf.mwH), Double.valueOf(this.mCf.mwI) });
    if (this.mCf.aKd())
    {
      aLF();
      GMTrace.o(9708505137152L, 72334);
      return;
    }
    this.mCk = true;
    if (this.handler == null)
    {
      GMTrace.o(9708505137152L, 72334);
      return;
    }
    if (this.mER != null) {
      this.handler.removeCallbacks(this.mER);
    }
    this.mER = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9688104042496L, 72182);
        if (i.this.mCk)
        {
          if (i.this.htG != null) {
            i.this.htG.dismiss();
          }
          i.this.aLF();
        }
        i.this.mCk = false;
        GMTrace.o(9688104042496L, 72182);
      }
    };
    this.handler.postDelayed(this.mER, 10000L);
    Activity localActivity = this.activity;
    getString(R.l.cUG);
    this.htG = h.a(localActivity, getString(R.l.dBk), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(9679111454720L, 72115);
        i.this.mCk = false;
        GMTrace.o(9679111454720L, 72115);
      }
    });
    GMTrace.o(9708505137152L, 72334);
  }
  
  protected void aLm()
  {
    GMTrace.i(9708236701696L, 72332);
    Intent localIntent = new Intent();
    localIntent.putExtra("kopenGmapNums", this.mCd.myQ);
    localIntent.putExtra("kopenOthersNums", this.mCd.myR);
    localIntent.putExtra("kopenreportType", this.mCd.gPO);
    localIntent.putExtra("kRemark", aLl());
    localIntent.putExtra("soso_street_view_url", this.mEN);
    this.activity.setResult(-1, localIntent);
    GMTrace.o(9708236701696L, 72332);
  }
  
  void aLn()
  {
    GMTrace.i(9707565613056L, 72327);
    this.mCg.mCy.setEnabled(true);
    this.mCg.mCt.setVisibility(8);
    c(this.mCe);
    this.mCg.mzn.getIController().setZoom(this.zoom);
    this.mCg.mCw.setEnabled(true);
    this.eON = this.activity.getIntent().getBooleanExtra("kShowshare", true);
    label153:
    Object localObject;
    if (this.eON)
    {
      this.mCg.mCw.setVisibility(0);
      this.mEN = this.activity.getIntent().getStringExtra("soso_street_view_url");
      if ((bg.nm(this.mEN)) || ((!v.bPI()) && (!v.bPH()))) {
        break label574;
      }
      this.mEQ = true;
      this.mCg.mCw.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9678306148352L, 72109);
          i.this.aLL();
          i.this.mEP.bFk();
          GMTrace.o(9678306148352L, 72109);
        }
      });
      this.mEO = new com.tencent.mm.plugin.location.ui.n(this.mCg.mzn, this.activity);
      localObject = this.mEO;
      if (((com.tencent.mm.plugin.location.ui.n)localObject).mBT != null)
      {
        ((com.tencent.mm.plugin.location.ui.n)localObject).mBT.setOnClickListener(new n.1((com.tencent.mm.plugin.location.ui.n)localObject));
        ((com.tencent.mm.plugin.location.ui.n)localObject).mBU.setVisibility(0);
      }
      a(this.mEO);
      this.mEO.b(this.mCe);
      this.mEO.Bu("");
      if (!com.tencent.mm.plugin.location.model.e.h(this.mCe.mwH, this.mCe.mwI))
      {
        w.d("MicroMsg.ViewMapUI", "isValidLatLng %f %f", new Object[] { Double.valueOf(this.mCe.mwH), Double.valueOf(this.mCe.mwI) });
        localObject = this.mEO;
        ((com.tencent.mm.plugin.location.ui.n)localObject).mzl = false;
        ((com.tencent.mm.plugin.location.ui.n)localObject).mzm.setVisibility(8);
      }
      if (2 == this.type)
      {
        w.i("MicroMsg.ViewMapUI", "location id %s", new Object[] { this.mCe.mwG });
        if (this.activity.getIntent().getBooleanExtra("kFavCanRemark", true)) {
          aLk();
        }
        if (!bg.nm(this.mCe.mwJ)) {
          this.mCg.mCu.setVisibility(0);
        }
      }
      this.mCi.put(this.mCe.mwG, this.mEO);
      if (!this.mCe.aKe()) {
        break label672;
      }
      if ((this.mzo != null) && (!this.mzo.equals(""))) {
        this.mEO.mzo = this.mzo;
      }
      this.mEO.setText(this.mEO.myL + this.mCe.mwJ);
    }
    for (;;)
    {
      this.mCg.mCz = this.mEO.mBX;
      localObject = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9679379890176L, 72117);
          i.this.mCl = 0;
          i.this.aLD();
          i.this.aLO();
          GMTrace.o(9679379890176L, 72117);
        }
      };
      this.mCg.mCz.setOnClickListener((View.OnClickListener)localObject);
      this.mCg.mCz.setVisibility(0);
      GMTrace.o(9707565613056L, 72327);
      return;
      this.mCg.mCw.setVisibility(8);
      break;
      label574:
      if ((!v.bPI()) && (!v.bPH())) {
        break label153;
      }
      this.mEQ = false;
      try
      {
        localObject = (azy)new aa((float)this.mCe.mwI, (float)this.mCe.mwH, this.eDr).fUa.gtC.gtK;
        new aa((azy)localObject);
        at.wS().a(new aa((azy)localObject), 0);
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.ViewMapUI", localException.toString());
      }
      break label153;
      label672:
      if (com.tencent.mm.plugin.location.model.e.h(this.mCe.mwH, this.mCe.mwI)) {
        this.mCj.a(this.mCe.mwH, this.mCe.mwI, this.mCr, this.mCe.mwG);
      }
    }
  }
  
  public boolean aLp()
  {
    GMTrace.i(9707297177600L, 72325);
    if ((this.mEP != null) && (this.mEP.isShowing())) {
      this.mEP.bFl();
    }
    for (;;)
    {
      GMTrace.o(9707297177600L, 72325);
      return true;
      aLL();
      this.mEP.bFk();
    }
  }
  
  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(9709042008064L, 72338);
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      boolean bool = super.dispatchTouchEvent(paramMotionEvent);
      GMTrace.o(9709042008064L, 72338);
      return bool;
      if ((Math.abs(paramMotionEvent.getX() - this.lUn) > 10.0F) || (Math.abs(paramMotionEvent.getY() - this.jqu) > 10.0F))
      {
        this.jaO = true;
        aLB();
        continue;
        this.lUn = paramMotionEvent.getX();
        this.jqu = paramMotionEvent.getY();
        this.mBs = System.currentTimeMillis();
        this.jaO = false;
        aLE();
        continue;
        if (!this.jaO) {
          System.currentTimeMillis();
        }
        aLC();
      }
    }
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(9708639354880L, 72335);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(9708639354880L, 72335);
      return;
      com.tencent.mm.plugin.location.ui.d locald = this.mCd;
      Object localObject1;
      switch (paramInt1)
      {
      default: 
        break;
      case 4098: 
        Object localObject2;
        if ((-1 == paramInt2) && (paramIntent != null))
        {
          localObject1 = paramIntent.getStringExtra("selectpkg");
          localObject2 = paramIntent.getBundleExtra("transferback");
          boolean bool = paramIntent.getBooleanExtra("isalways", false);
          paramIntent = ((Bundle)localObject2).getParcelableArrayList("locations");
          locald.a((LocationInfo)paramIntent.get(0), (LocationInfo)paramIntent.get(1), (String)localObject1, bool);
          GMTrace.o(9708639354880L, 72335);
          return;
        }
        if (4097 == paramInt2)
        {
          if (paramIntent.getBooleanExtra("isalways", false))
          {
            com.tencent.mm.plugin.report.service.g.ork.i(11091, new Object[] { Integer.valueOf(6), Integer.valueOf(2) });
            paramIntent = paramIntent.getBundleExtra("transferback").getParcelableArrayList("locations");
            localObject1 = (LocationInfo)paramIntent.get(0);
            localObject2 = (LocationInfo)paramIntent.get(1);
            if (!bg.nm(((LocationInfo)localObject1).mwK)) {
              break label504;
            }
          }
          for (paramIntent = "zh-cn";; paramIntent = ((LocationInfo)localObject1).mwK)
          {
            paramIntent = new Intent("android.intent.action.VIEW", Uri.parse(String.format("http://maps.google.com/maps?f=d&saddr=%f,%f&daddr=%f,%f&hl=" + paramIntent, new Object[] { Double.valueOf(((LocationInfo)localObject2).mwH), Double.valueOf(((LocationInfo)localObject2).mwI), Double.valueOf(((LocationInfo)localObject1).mwH), Double.valueOf(((LocationInfo)localObject1).mwI) })));
            localObject1 = new Bundle();
            ((Bundle)localObject1).putParcelable("targetintent", paramIntent);
            localObject2 = new Intent();
            ((Intent)localObject2).setClass(locald.context, AppChooserUI.class);
            ((Intent)localObject2).putExtra("type", 1);
            ((Intent)localObject2).putExtra("title", locald.context.getResources().getString(R.l.dGE));
            ((Intent)localObject2).putExtra("targetintent", paramIntent);
            ((Intent)localObject2).putExtra("transferback", (Bundle)localObject1);
            ((Intent)localObject2).putExtra("scene", 6);
            ((Activity)locald.context).startActivityForResult((Intent)localObject2, 4099);
            GMTrace.o(9708639354880L, 72335);
            return;
            com.tencent.mm.plugin.report.service.g.ork.i(11091, new Object[] { Integer.valueOf(6), Integer.valueOf(1) });
            break;
          }
        }
        break;
      case 4099: 
        label504:
        if ((-1 == paramInt2) && (paramIntent != null))
        {
          localObject1 = paramIntent.getStringExtra("selectpkg");
          paramIntent = new Intent((Intent)paramIntent.getBundleExtra("transferback").getParcelable("targetintent"));
          paramIntent.setPackage((String)localObject1);
          paramIntent.addFlags(524288);
          locald.context.startActivity(paramIntent);
        }
        break;
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9708102483968L, 72331);
    super.onCreate(paramBundle);
    double d1 = this.activity.getIntent().getDoubleExtra("kwebmap_slat", 0.0D);
    double d2 = this.activity.getIntent().getDoubleExtra("kwebmap_lng", 0.0D);
    w.i("MicroMsg.ViewMapUI", "start dslat " + d1 + " " + d2);
    this.zoom = this.activity.getIntent().getIntExtra("kwebmap_scale", 15);
    if (this.zoom <= 0) {
      this.zoom = 15;
    }
    this.mzo = this.activity.getIntent().getStringExtra("kPoiName");
    paramBundle = this.activity.getIntent().getStringExtra("Kwebmap_locaion");
    w.d("MicroMsg.ViewMapUI", "view " + d1 + " " + d2);
    LocationInfo localLocationInfo = this.mCe;
    localLocationInfo.mwH = d1;
    localLocationInfo.mwI = d2;
    localLocationInfo.mwJ = paramBundle;
    localLocationInfo.zoom = this.zoom;
    localLocationInfo.eQm = this.mzo;
    this.eDr = this.activity.getIntent().getLongExtra("kMsgId", -1L);
    this.myb = this.activity.getIntent().getStringExtra("map_talker_name");
    MP();
    GMTrace.o(9708102483968L, 72331);
  }
  
  public void onDestroy()
  {
    GMTrace.i(9708773572608L, 72336);
    this.kSj.release();
    this.handler.removeCallbacks(this.mER);
    this.handler = null;
    at.wS().b(424, this);
    super.onDestroy();
    GMTrace.o(9708773572608L, 72336);
  }
  
  public void onPause()
  {
    GMTrace.i(9707968266240L, 72330);
    w.d("MicroMsg.ViewMapUI", "onbaseGeoResume");
    if (this.mCq != null) {
      this.mCq.c(this.mES);
    }
    super.onPause();
    GMTrace.o(9707968266240L, 72330);
  }
  
  public void onResume()
  {
    GMTrace.i(9707834048512L, 72329);
    super.onResume();
    w.d("MicroMsg.ViewMapUI", "onbaseGeoResume");
    if (this.mCq != null) {
      this.mCq.b(this.mES, true);
    }
    GMTrace.o(9707834048512L, 72329);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\impl\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */