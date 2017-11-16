package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.view.ViewStub.OnInflateListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.ft;
import com.tencent.mm.g.a.ft.b;
import com.tencent.mm.g.a.rb;
import com.tencent.mm.g.a.rb.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.location.model.LocationInfo;
import com.tencent.mm.plugin.location.model.p;
import com.tencent.mm.plugin.location.ui.MyLocationButton;
import com.tencent.mm.plugin.location.ui.NewMyLocationButton;
import com.tencent.mm.plugin.location.ui.l.1;
import com.tencent.mm.plugin.location.ui.l.2;
import com.tencent.mm.plugin.location.ui.l.3;
import com.tencent.mm.plugin.location.ui.l.9;
import com.tencent.mm.plugin.location.ui.l.a;
import com.tencent.mm.plugin.location.ui.m;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.m;
import com.tencent.mm.pluginsdk.p.r;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.e.h;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class h
  extends i
{
  public MyLocationButton mEc;
  public m mEe;
  public com.tencent.mm.plugin.location.ui.l mEg;
  private Button mEs;
  private NewMyLocationButton mEt;
  private com.tencent.mm.plugin.location.ui.f mEu;
  private View mEv;
  private boolean mEw;
  private com.tencent.mm.ui.widget.f mEx;
  public Map<String, String> mEy;
  public int mEz;
  
  public h(Activity paramActivity)
  {
    super(paramActivity);
    GMTrace.i(9693606969344L, 72223);
    this.mEw = false;
    GMTrace.o(9693606969344L, 72223);
  }
  
  public final void aLB()
  {
    GMTrace.i(9694143840256L, 72227);
    super.aLB();
    GMTrace.o(9694143840256L, 72227);
  }
  
  public final void aLC()
  {
    GMTrace.i(9694278057984L, 72228);
    super.aLC();
    GMTrace.o(9694278057984L, 72228);
  }
  
  public final void aLE()
  {
    GMTrace.i(9694412275712L, 72229);
    super.aLE();
    w.i("MicroMsg.TrackMapUI", "onDown");
    GMTrace.o(9694412275712L, 72229);
  }
  
  protected final void aLF()
  {
    GMTrace.i(14561952399360L, 108495);
    this.mEx = new com.tencent.mm.ui.widget.f(this.activity, com.tencent.mm.ui.widget.f.xpQ, false);
    this.mEx.qik = new p.c()
    {
      public final void a(com.tencent.mm.ui.base.n paramAnonymousn)
      {
        GMTrace.i(14561818181632L, 108494);
        if (h.this.mEQ) {
          paramAnonymousn.a(1, h.this.getString(R.l.dGT), 0);
        }
        Object localObject1 = h.this;
        Object localObject2 = h.this.mCd;
        Object localObject3 = h.this.mCe;
        ArrayList localArrayList = new ArrayList();
        localArrayList.add("com.tencent.map");
        localArrayList.add("com.google.android.apps.maps");
        localArrayList.add("com.baidu.BaiduMap");
        localArrayList.add("com.autonavi.minimap");
        localArrayList.add("com.sogou.map.android.maps");
        Object localObject4 = new Intent("android.intent.action.VIEW", Uri.parse(String.format("geo:%f,%f", new Object[] { Double.valueOf(((LocationInfo)localObject3).mwH), Double.valueOf(((LocationInfo)localObject3).mwI) })));
        Object localObject5 = ((com.tencent.mm.plugin.location.ui.d)localObject2).context.getPackageManager();
        localObject3 = new HashMap();
        localObject4 = ((PackageManager)localObject5).queryIntentActivities((Intent)localObject4, 65536).iterator();
        while (((Iterator)localObject4).hasNext())
        {
          localObject5 = (ResolveInfo)((Iterator)localObject4).next();
          if (localArrayList.contains(((ResolveInfo)localObject5).activityInfo.packageName)) {
            ((Map)localObject3).put(((ResolveInfo)localObject5).activityInfo.packageName, ((ResolveInfo)localObject5).activityInfo.loadLabel(((com.tencent.mm.plugin.location.ui.d)localObject2).context.getPackageManager()).toString());
          }
        }
        ((h)localObject1).mEy = ((Map)localObject3);
        if ((h.this.mEz < 4) || (h.this.aLG())) {
          paramAnonymousn.Z(2, R.l.eeu, 0);
        }
        localObject1 = h.this.mEy.entrySet().iterator();
        int i = 3;
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (Map.Entry)((Iterator)localObject1).next();
          if (!((String)((Map.Entry)localObject2).getKey()).equals("com.tencent.map")) {
            paramAnonymousn.a(i, (CharSequence)((Map.Entry)localObject2).getValue(), 0);
          }
          i += 1;
        }
        GMTrace.o(14561818181632L, 108494);
      }
    };
    this.mEx.qil = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(14562623488000L, 108500);
        Iterator localIterator;
        switch (paramAnonymousMenuItem.getItemId())
        {
        default: 
          if (h.this.mEy != null) {
            localIterator = h.this.mEy.entrySet().iterator();
          }
          break;
        case 1: 
        case 2: 
          while (localIterator.hasNext())
          {
            Map.Entry localEntry = (Map.Entry)localIterator.next();
            if (((String)localEntry.getValue()).equals(paramAnonymousMenuItem.getTitle()))
            {
              h.this.mCd.a(h.this.mCe, h.this.mCf, (String)localEntry.getKey(), false);
              g.ork.i(12809, new Object[] { Integer.valueOf(4), localEntry.getKey() });
              GMTrace.o(14562623488000L, 108500);
              return;
              h.this.aLM();
              g.ork.i(12809, new Object[] { Integer.valueOf(4) });
              GMTrace.o(14562623488000L, 108500);
              return;
              w.i("MicroMsg.TrackMapUI", "click tencent map: %s", new Object[] { Boolean.valueOf(h.this.mEy.containsKey("com.tencent.map")) });
              if (h.this.aLG())
              {
                h.this.mCd.a(h.this.mCe, h.this.mCf, "com.tencent.map", false);
                g.ork.i(12809, new Object[] { Integer.valueOf(4), "com.tencent.map" });
                GMTrace.o(14562623488000L, 108500);
                return;
              }
              if (h.this.mEz < 4)
              {
                paramAnonymousMenuItem = h.this;
                paramAnonymousMenuItem.mEz += 1;
                at.AR();
                com.tencent.mm.y.c.xh().a(w.a.vxM, Integer.valueOf(h.this.mEz));
              }
              paramAnonymousMenuItem = new Intent();
              paramAnonymousMenuItem.putExtra("rawUrl", " http://mapdownload.map.qq.com/?key=wx&referer=wx1&channel=00008");
              com.tencent.mm.bj.d.b(h.this.activity, "webview", ".ui.tools.WebViewUI", paramAnonymousMenuItem);
              g.ork.i(12809, new Object[] { Integer.valueOf(5) });
              GMTrace.o(14562623488000L, 108500);
              return;
            }
          }
        }
        GMTrace.o(14562623488000L, 108500);
      }
    };
    this.mEx.bFk();
    GMTrace.o(14561952399360L, 108495);
  }
  
  public final boolean aLG()
  {
    GMTrace.i(16051098091520L, 119590);
    boolean bool = this.mEy.containsKey("com.tencent.map");
    GMTrace.o(16051098091520L, 119590);
    return bool;
  }
  
  public final void aLH()
  {
    GMTrace.i(16051232309248L, 119591);
    w.i("MicroMsg.TrackMapUI", "onShare");
    d.v(this.activity);
    Intent localIntent = this.activity.getIntent();
    localIntent.putExtra("intent_map_key", 5);
    localIntent.putExtra("kwebmap_scale", this.mCg.mzn.getZoomLevel());
    com.tencent.mm.plugin.location.a.a locala = com.tencent.mm.plugin.location.model.l.aKo().Bi(this.myb);
    if ((locala != null) && (locala.eNM.size() > 0))
    {
      localIntent.putExtra("kwebmap_slat", locala.latitude);
      localIntent.putExtra("kwebmap_lng", locala.longitude);
      localIntent.putExtra("Kwebmap_locaion", locala.mwD);
      localIntent.putExtra("fromWhereShare", "fromTrackButton");
    }
    this.activity.startActivity(localIntent);
    this.activity.finish();
    GMTrace.o(16051232309248L, 119591);
  }
  
  final void aLn()
  {
    GMTrace.i(9693875404800L, 72225);
    super.aLn();
    if ((this.activity.getIntent().getBooleanExtra("KFavLocSigleView", false)) && (this.activity.getIntent().getBooleanExtra("kFavCanRemark", false))) {
      this.mEw = true;
    }
    w.d("MicroMsg.TrackMapUI", "oldVer %s", new Object[] { Boolean.valueOf(this.mEw) });
    ((TextView)findViewById(R.h.bNe)).setText(R.l.bKW);
    findViewById(R.h.chR).setVisibility(8);
    if (!this.mEw)
    {
      localObject = (ViewStub)findViewById(R.h.bLa);
      ((ViewStub)localObject).setOnInflateListener(new ViewStub.OnInflateListener()
      {
        public final void onInflate(ViewStub paramAnonymousViewStub, View paramAnonymousView)
        {
          GMTrace.i(9687835607040L, 72180);
          paramAnonymousView.findViewById(R.h.bKY).setOnTouchListener(new View.OnTouchListener()
          {
            public final boolean onTouch(View paramAnonymous2View, MotionEvent paramAnonymous2MotionEvent)
            {
              GMTrace.i(9706491871232L, 72319);
              GMTrace.o(9706491871232L, 72319);
              return true;
            }
          });
          GMTrace.o(9687835607040L, 72180);
        }
      });
      this.mEv = ((ViewStub)localObject).inflate();
      findViewById(R.h.bKT).setVisibility(8);
    }
    this.mEe = new m(this.activity, this.mCg.mzn, false);
    this.mEe.mBp = false;
    this.mEe.mBq = false;
    final Object localObject = this.mEe;
    ((m)localObject).mBn = true;
    if (((m)localObject).mBg != null)
    {
      ((m)localObject).mBg.c(null);
      ((m)localObject).mBg.b(null);
      ((m)localObject).mBg.aLI();
    }
    this.mEe.mBk = false;
    this.mEg = new com.tencent.mm.plugin.location.ui.l(this.activity, new l.a()
    {
      public final void aLe()
      {
        GMTrace.i(9702465339392L, 72289);
        GMTrace.o(9702465339392L, 72289);
      }
      
      public final void aLf()
      {
        GMTrace.i(9702733774848L, 72291);
        GMTrace.o(9702733774848L, 72291);
      }
      
      public final void aLg()
      {
        GMTrace.i(9702867992576L, 72292);
        h.this.aLH();
        GMTrace.o(9702867992576L, 72292);
      }
      
      public final void fG(boolean paramAnonymousBoolean)
      {
        GMTrace.i(9702331121664L, 72288);
        if (com.tencent.mm.plugin.location.model.l.aKo().cM(h.this.myb, q.zE()))
        {
          h.this.aLH();
          GMTrace.o(9702331121664L, 72288);
          return;
        }
        if ((!paramAnonymousBoolean) && (!h.this.d(h.this.mCe)))
        {
          com.tencent.mm.plugin.location.ui.l locall = h.this.mEg;
          if (locall.mBc == null) {
            locall.mBc = com.tencent.mm.ui.base.h.a(locall.mContext, locall.mResources.getString(R.l.dGD), "", false, new l.9(locall), new l.2(locall));
          }
          GMTrace.o(9702331121664L, 72288);
          return;
        }
        h.this.aLH();
        GMTrace.o(9702331121664L, 72288);
      }
      
      public final void pM(int paramAnonymousInt)
      {
        GMTrace.i(9702599557120L, 72290);
        GMTrace.o(9702599557120L, 72290);
      }
    });
    if (!this.mEw)
    {
      findViewById(R.h.cfF).setVisibility(8);
      this.mCg.mCv.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9698304589824L, 72258);
          h.this.aLm();
          h.this.aLo();
          h.this.activity.finish();
          GMTrace.o(9698304589824L, 72258);
        }
      });
      if (this.mEw) {
        break label815;
      }
      this.mEt = ((NewMyLocationButton)this.mEv.findViewById(R.h.bQL));
      this.mEt.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9710652620800L, 72350);
          h.this.mEe.a(h.this.mCg.mzn);
          GMTrace.o(9710652620800L, 72350);
        }
      });
      localObject = this.activity.getIntent().getStringExtra("kPoi_url");
      if (!bg.nm((String)localObject)) {
        break label782;
      }
      this.mCg.mCC.setVisibility(8);
    }
    for (;;)
    {
      int i;
      if (!this.mEw)
      {
        localObject = this.mEO;
        i = R.g.aXF;
        if ((((com.tencent.mm.plugin.location.ui.n)localObject).mzm != null) && (((com.tencent.mm.plugin.location.ui.n)localObject).mBT == null)) {
          ((com.tencent.mm.plugin.location.ui.n)localObject).mBT = ((ImageView)((com.tencent.mm.plugin.location.ui.n)localObject).mzm.findViewById(R.h.bKU));
        }
        ((com.tencent.mm.plugin.location.ui.n)localObject).mBT.setImageResource(i);
        this.mEO.mBV.setVisibility(4);
        this.mEu = new com.tencent.mm.plugin.location.ui.f(this.mCg.mzn, this.activity);
        if (this.mCe.aKe())
        {
          if ((this.mzo != null) && (!this.mzo.equals(""))) {
            this.mEu.mzo = this.mzo;
          }
          this.mEu.setText(this.mEO.myL + this.mCe.mwJ);
        }
        localObject = new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(9685688123392L, 72164);
            w.d("MicroMsg.TrackMapUI", "newpoi old go back onclick");
            h.this.mCl = 0;
            h.this.aLD();
            h.this.aLO();
            GMTrace.o(9685688123392L, 72164);
          }
        };
        com.tencent.mm.plugin.location.ui.f localf = this.mEu;
        localf.mzr.setOnClickListener((View.OnClickListener)localObject);
        localf.mzr.setVisibility(0);
      }
      GMTrace.o(9693875404800L, 72225);
      return;
      this.mEs = ((Button)findViewById(R.h.cfF));
      this.mEs.setVisibility(0);
      this.mEs.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9695620235264L, 72238);
          int i;
          int j;
          if ((p.a.tmc != null) && (p.a.tmc.Bj(h.this.myb)))
          {
            i = 1;
            if ((p.a.tlV == null) || (!p.a.tlV.JD(h.this.myb))) {
              break label168;
            }
            j = 1;
          }
          for (;;)
          {
            if ((i == 0) && (j != 0))
            {
              paramAnonymousView = new rb();
              paramAnonymousView.eVS.eVU = true;
              com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousView);
              if (h.this.myb.equals(paramAnonymousView.eVT.eVW))
              {
                com.tencent.mm.ui.base.h.a(h.this.activity, h.this.getString(R.l.dpO), "", h.this.getString(R.l.dCR), false, new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                  {
                    GMTrace.i(9690117308416L, 72197);
                    GMTrace.o(9690117308416L, 72197);
                  }
                });
                GMTrace.o(9695620235264L, 72238);
                return;
                i = 0;
                break;
                label168:
                j = 0;
                continue;
              }
              com.tencent.mm.ui.base.h.a(h.this.activity, h.this.getString(R.l.dpP), "", h.this.getString(R.l.dCR), false, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(9698036154368L, 72256);
                  GMTrace.o(9698036154368L, 72256);
                }
              });
              GMTrace.o(9695620235264L, 72238);
              return;
            }
          }
          paramAnonymousView = h.this.mEg;
          if (!com.tencent.mm.plugin.location.ui.l.pK(67589))
          {
            com.tencent.mm.ui.base.h.a(paramAnonymousView.mContext, paramAnonymousView.mResources.getString(R.l.dGR), "", false, new l.1(paramAnonymousView), new l.3(paramAnonymousView));
            com.tencent.mm.plugin.location.ui.l.pL(67589);
            GMTrace.o(9695620235264L, 72238);
            return;
          }
          if (paramAnonymousView.mBb != null) {
            paramAnonymousView.mBb.fG(false);
          }
          GMTrace.o(9695620235264L, 72238);
        }
      });
      this.mEs.setEnabled(true);
      if (this.type == 2) {
        i = 0;
      }
      for (;;)
      {
        if (i != 0) {
          break label780;
        }
        this.mEs.setVisibility(8);
        break;
        if (this.type == 3)
        {
          i = 0;
        }
        else if (this.type == 7)
        {
          i = 0;
        }
        else if (this.type == 9)
        {
          i = 0;
        }
        else if (this.eDr != -1L)
        {
          at.AR();
          localObject = com.tencent.mm.y.c.yM().cM(this.eDr);
          if ((s.fD(((ce)localObject).field_talker)) || (s.gj(((ce)localObject).field_talker)) || (x.To(((ce)localObject).field_talker)) || (x.Tq(((ce)localObject).field_talker)) || (x.fw(((ce)localObject).field_talker))) {
            i = 0;
          } else {
            i = 1;
          }
        }
        else
        {
          i = 1;
        }
      }
      label780:
      break;
      label782:
      this.mCg.mCC.setVisibility(0);
      this.mCg.mCC.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9709981532160L, 72345);
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(h.this.activity, e.h.class);
          w.d("MicroMsg.TrackMapUI", "click url %s", new Object[] { localObject });
          paramAnonymousView.putExtra("rawUrl", localObject);
          paramAnonymousView.putExtra("showShare", false);
          com.tencent.mm.bj.d.a(h.this.activity, "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramAnonymousView);
          GMTrace.o(9709981532160L, 72345);
        }
      });
      continue;
      label815:
      this.mEc = ((MyLocationButton)findViewById(R.h.bKT));
      this.mEc.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9706223435776L, 72317);
          w.d("MicroMsg.TrackMapUI", "newpoi my position ", new Object[] { h.this.mEc });
          h.this.mEe.a(h.this.mCg.mzn);
          GMTrace.o(9706223435776L, 72317);
        }
      });
      if ((this.type == 2) && (this.activity.getIntent().getBooleanExtra("kFavCanRemark", true))) {
        ((ViewGroup.MarginLayoutParams)this.mEc.getLayoutParams()).bottomMargin = com.tencent.mm.br.a.fromDPToPix(this.activity, 80);
      }
      localObject = this.activity.getIntent().getStringExtra("kPoi_url");
      if (bg.nm((String)localObject))
      {
        this.mCg.mCC.setVisibility(8);
      }
      else
      {
        this.mCg.mCC.setVisibility(0);
        this.mCg.mCC.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(9691727921152L, 72209);
            paramAnonymousView = new Intent();
            paramAnonymousView.setClass(h.this.activity, e.h.class);
            w.d("MicroMsg.TrackMapUI", "click url %s", new Object[] { localObject });
            paramAnonymousView.putExtra("rawUrl", localObject);
            paramAnonymousView.putExtra("showShare", false);
            com.tencent.mm.bj.d.a(h.this.activity, "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramAnonymousView);
            GMTrace.o(9691727921152L, 72209);
          }
        });
      }
    }
  }
  
  public final boolean d(LocationInfo paramLocationInfo)
  {
    GMTrace.i(9694546493440L, 72230);
    com.tencent.mm.plugin.location.a.a locala = com.tencent.mm.plugin.location.model.l.aKo().Bi(this.myb);
    StringBuilder localStringBuilder = new StringBuilder("resume try to enter trackRoom ");
    if (locala != null) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.TrackMapUI", bool);
      if (locala != null) {
        break;
      }
      GMTrace.o(9694546493440L, 72230);
      return true;
    }
    if ((!bg.nm(locala.mwD)) && (!bg.nm(paramLocationInfo.mwJ)) && (!locala.mwD.equals(paramLocationInfo.mwJ)))
    {
      GMTrace.o(9694546493440L, 72230);
      return false;
    }
    if ((Math.abs(locala.latitude - paramLocationInfo.mwH) < 0.001D) && (Math.abs(locala.longitude - paramLocationInfo.mwI) < 0.001D))
    {
      GMTrace.o(9694546493440L, 72230);
      return true;
    }
    GMTrace.o(9694546493440L, 72230);
    return false;
  }
  
  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(9694009622528L, 72226);
    if (paramKeyEvent.getKeyCode() == 4) {
      paramKeyEvent.getAction();
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(9694009622528L, 72226);
    return bool;
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9693741187072L, 72224);
    super.onCreate(paramBundle);
    at.AR();
    this.mEz = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vxM, Integer.valueOf(0))).intValue();
    w.i("MicroMsg.TrackMapUI", "count: %s", new Object[] { Integer.valueOf(this.mEz) });
    GMTrace.o(9693741187072L, 72224);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(9694680711168L, 72231);
    super.onDestroy();
    if (this.mEe != null) {
      this.mEe.destroy();
    }
    GMTrace.o(9694680711168L, 72231);
  }
  
  public final void onPause()
  {
    GMTrace.i(9694949146624L, 72233);
    super.onPause();
    if (this.mEe != null) {
      this.mEe.onPause();
    }
    GMTrace.o(9694949146624L, 72233);
  }
  
  public final void onResume()
  {
    GMTrace.i(9694814928896L, 72232);
    super.onResume();
    if (this.mEe != null) {
      this.mEe.onResume();
    }
    ft localft;
    if (this.type == 2)
    {
      localft = new ft();
      localft.eIo.eDp = this.activity.getIntent().getLongExtra("kFavInfoLocalId", -1L);
      localft.eIo.type = 4;
      com.tencent.mm.sdk.b.a.vgX.m(localft);
      if (localft.eIp.eIx != null)
      {
        if (this.mCm != null) {
          break label139;
        }
        this.mCm = new ArrayList();
      }
    }
    for (;;)
    {
      this.mCm.addAll(localft.eIp.eIx);
      aLj();
      GMTrace.o(9694814928896L, 72232);
      return;
      label139:
      this.mCm.clear();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\impl\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */