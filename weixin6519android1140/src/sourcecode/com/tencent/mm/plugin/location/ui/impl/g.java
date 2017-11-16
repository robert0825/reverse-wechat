package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.e;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.plugin.location.a.a;
import com.tencent.mm.plugin.location.model.LocationInfo;
import com.tencent.mm.plugin.location.model.f;
import com.tencent.mm.plugin.location.model.o;
import com.tencent.mm.plugin.location.model.o.a;
import com.tencent.mm.plugin.location.model.o.b;
import com.tencent.mm.plugin.location.model.p;
import com.tencent.mm.plugin.location.ui.MyLocationButton;
import com.tencent.mm.plugin.location.ui.ShareHeader;
import com.tencent.mm.plugin.location.ui.TipSayingWidget;
import com.tencent.mm.plugin.location.ui.VolumeMeter;
import com.tencent.mm.plugin.location.ui.l.6;
import com.tencent.mm.plugin.location.ui.l.7;
import com.tencent.mm.plugin.location.ui.l.8;
import com.tencent.mm.plugin.location.ui.l.a;
import com.tencent.mm.plugin.location.ui.m;
import com.tencent.mm.plugin.location.ui.m.a;
import com.tencent.mm.pluginsdk.p.n;
import com.tencent.mm.pluginsdk.p.o;
import com.tencent.mm.protocal.c.akc;
import com.tencent.mm.protocal.c.aub;
import com.tencent.mm.protocal.c.axz;
import com.tencent.mm.protocal.c.bjl;
import com.tencent.mm.protocal.c.bmv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMImageButton;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class g
  extends i
  implements l.a
{
  private com.tencent.mm.modelgeo.a.a fJt;
  private m.a mBw;
  private Button mEb;
  public MyLocationButton mEc;
  private TipSayingWidget mEd;
  public m mEe;
  public o mEf;
  public com.tencent.mm.plugin.location.ui.l mEg;
  public com.tencent.mm.plugin.location.ui.k mEh;
  private com.tencent.mm.plugin.location.ui.i mEi;
  private c mEj;
  private ShareHeader mEk;
  private String mEl;
  private long mEm;
  private long mEn;
  private o.b mEo;
  private o.a mEp;
  private HashMap<String, bmv> mEq;
  private View mzZ;
  private PowerManager.WakeLock wakeLock;
  
  public g(Activity paramActivity)
  {
    super(paramActivity);
    GMTrace.i(9699109896192L, 72264);
    this.mEm = 0L;
    this.mEn = 0L;
    this.mBw = new m.a() {};
    this.mEo = new o.b()
    {
      public final void a(axz paramAnonymousaxz)
      {
        GMTrace.i(9692935880704L, 72218);
        g.this.b(paramAnonymousaxz);
        GMTrace.o(9692935880704L, 72218);
      }
      
      public final void aKA()
      {
        GMTrace.i(9692801662976L, 72217);
        w.i("MicroMsg.ShareMapUI", "onJoinSucess");
        o localo = g.this.mEf;
        localo.mxY = true;
        localo.aKw();
        localo.aKx();
        g.this.mEe.fI(true);
        if (g.this.mEh != null) {
          g.this.mEh.aKS();
        }
        GMTrace.o(9692801662976L, 72217);
      }
      
      public final void aKB()
      {
        GMTrace.i(9693204316160L, 72220);
        g.this.mEe.fI(false);
        g.this.mEf.stop();
        g.this.mEf.pI(3);
        com.tencent.mm.plugin.location.ui.k.aKW();
        g.this.activity.finish();
        g.this.activity.overridePendingTransition(R.a.aLF, R.a.aLH);
        GMTrace.o(9693204316160L, 72220);
      }
      
      public final void onError(int paramAnonymousInt, String paramAnonymousString)
      {
        GMTrace.i(9693070098432L, 72219);
        w.v("MicroMsg.ShareMapUI", "onError type %d msg %s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString });
        com.tencent.mm.plugin.report.service.g.ork.i(10997, new Object[] { "7", "", Integer.valueOf(0), Integer.valueOf(0) });
        com.tencent.mm.plugin.location.ui.l locall = g.this.mEg;
        w.d("MicroMsg.TrackPoiDialogMgr", "showErrorDialog, errMsg=%s", new Object[] { paramAnonymousString });
        Context localContext = ab.getContext();
        Object localObject = null;
        if (bg.nm(paramAnonymousString)) {
          if (paramAnonymousInt == 0) {
            paramAnonymousString = localContext.getString(R.l.dGF);
          }
        }
        for (;;)
        {
          h.a(locall.mContext, paramAnonymousString, "", locall.mResources.getString(R.l.cTM), false, new l.8(locall, paramAnonymousInt));
          GMTrace.o(9693070098432L, 72219);
          return;
          if (paramAnonymousInt == 1)
          {
            paramAnonymousString = localContext.getString(R.l.dGG);
          }
          else
          {
            paramAnonymousString = (String)localObject;
            if (paramAnonymousInt == 2) {
              paramAnonymousString = localContext.getString(R.l.dGH);
            }
          }
        }
      }
    };
    this.mEp = new o.a()
    {
      public final void aKz()
      {
        GMTrace.i(9691056832512L, 72204);
        g localg = g.this;
        com.tencent.mm.ui.base.i.a locala = new com.tencent.mm.ui.base.i.a(localg.activity);
        locala.BO(R.l.eeL);
        locala.BQ(R.l.cTM).a(new g.9(localg));
        locala.aax().show();
        GMTrace.o(9691056832512L, 72204);
      }
    };
    this.fJt = new com.tencent.mm.modelgeo.a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(15405779255296L, 114782);
        if (!paramAnonymousBoolean)
        {
          GMTrace.o(15405779255296L, 114782);
          return false;
        }
        w.d("MicroMsg.ShareMapUI", "onGetLocation, latitude=%f, longtitude=%f, speed=%f", new Object[] { Float.valueOf(paramAnonymousFloat2), Float.valueOf(paramAnonymousFloat1), Double.valueOf(paramAnonymousDouble1) });
        if ((f.k(paramAnonymousDouble1)) && (!g.this.mEe.mBm))
        {
          w.d("MicroMsg.ShareMapUI", "set driving mode");
          g.this.mEe.mBp = false;
          g.this.mEe.fH(true);
          g.this.mEc.aKH();
        }
        GMTrace.o(15405779255296L, 114782);
        return true;
      }
    };
    this.mEq = new HashMap();
    this.mEf = com.tencent.mm.plugin.location.model.l.aKn();
    this.mEj = c.Ir();
    GMTrace.o(9699109896192L, 72264);
  }
  
  private void aLA()
  {
    GMTrace.i(9700317855744L, 72273);
    aLo();
    this.mEe.fI(false);
    this.mEf.stop();
    this.mEf.pI(3);
    com.tencent.mm.plugin.location.ui.k.aKW();
    this.mEf.mye = this.mCg.mzn.getZoom();
    this.activity.finish();
    GMTrace.o(9700317855744L, 72273);
  }
  
  public final void aLB()
  {
    GMTrace.i(9701123162112L, 72279);
    super.aLB();
    if (this.mEe != null)
    {
      this.mEe.mBp = false;
      this.mEe.fH(false);
      this.mEc.aKH();
    }
    GMTrace.o(9701123162112L, 72279);
  }
  
  public final void aLC()
  {
    GMTrace.i(9701257379840L, 72280);
    super.aLC();
    GMTrace.o(9701257379840L, 72280);
  }
  
  protected final void aLD()
  {
    GMTrace.i(9701391597568L, 72281);
    super.aLD();
    com.tencent.mm.plugin.report.service.g.ork.i(10997, new Object[] { "1", "", Integer.valueOf(0), Integer.valueOf(0) });
    GMTrace.o(9701391597568L, 72281);
  }
  
  public final void aLe()
  {
    GMTrace.i(9700183638016L, 72272);
    this.mEf.mye = this.mCg.mzn.getZoom();
    this.activity.finish();
    GMTrace.o(9700183638016L, 72272);
  }
  
  public final void aLf()
  {
    GMTrace.i(9700452073472L, 72274);
    this.mEe.fI(false);
    this.mEf.stop();
    this.mEf.pI(0);
    com.tencent.mm.plugin.location.ui.k.aKW();
    this.activity.finish();
    GMTrace.o(9700452073472L, 72274);
  }
  
  public final void aLg()
  {
    GMTrace.i(9700720508928L, 72276);
    Object localObject = this.mEe.mBo;
    if (localObject != null)
    {
      LocationInfo localLocationInfo = this.mCe;
      localLocationInfo.mwJ = ((bjl)localObject).uHS;
      localLocationInfo.mwI = ((bjl)localObject).tWm;
      localLocationInfo.mwH = ((bjl)localObject).tWn;
      if (!TextUtils.isEmpty(((bjl)localObject).uHS)) {
        break label145;
      }
      this.mEO.setText("");
    }
    for (;;)
    {
      this.mEO.b(this.mCe);
      localObject = this.mEO;
      ((com.tencent.mm.plugin.location.ui.n)localObject).mzn.updateLocaitonPinLayout(((com.tencent.mm.plugin.location.ui.n)localObject).mzm, ((com.tencent.mm.plugin.location.ui.n)localObject).mwH, ((com.tencent.mm.plugin.location.ui.n)localObject).mwI);
      this.mCg.mzn.getIController().animateTo(this.mCe.mwH, this.mCe.mwI);
      GMTrace.o(9700720508928L, 72276);
      return;
      label145:
      this.mEO.setText(((bjl)localObject).uHS);
    }
  }
  
  protected final void aLm()
  {
    GMTrace.i(9700049420288L, 72271);
    super.aLm();
    GMTrace.o(9700049420288L, 72271);
  }
  
  final void aLn()
  {
    GMTrace.i(9699378331648L, 72266);
    super.aLn();
    this.wakeLock = ((PowerManager)this.activity.getSystemService("power")).newWakeLock(26, "Track Lock");
    if (this.mEO != null)
    {
      localObject1 = this.mEO;
      ((com.tencent.mm.plugin.location.ui.n)localObject1).mBU.setVisibility(4);
      ((com.tencent.mm.plugin.location.ui.n)localObject1).isVisible = false;
    }
    findViewById(R.h.bFT).setVisibility(8);
    this.mEc = ((MyLocationButton)findViewById(R.h.bKT));
    Object localObject1 = this.mEc;
    ((MyLocationButton)localObject1).myV = this.mCg.mzn;
    ((MyLocationButton)localObject1).myU.setVisibility(0);
    ((MyLocationButton)localObject1).myT.setVisibility(8);
    c.Ir().b(((MyLocationButton)localObject1).fJt, true);
    this.mEc.aKG();
    this.mEc.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9677500841984L, 72103);
        g.this.mEc.aKG();
        g.this.mEe.mBp = true;
        g.this.mEe.a(g.this.mCg.mzn);
        g.this.mEe.fH(false);
        com.tencent.mm.plugin.report.service.g.ork.i(10997, new Object[] { "6", "", Integer.valueOf(0), Integer.valueOf(0) });
        GMTrace.o(9677500841984L, 72103);
      }
    });
    this.mzZ = findViewById(R.h.bFS);
    this.mEk = ((ShareHeader)findViewById(R.h.ceq));
    this.mEk.setVisibility(0);
    this.mEi = new com.tencent.mm.plugin.location.ui.i(this.activity, this.mEk.mzK, this.mzZ, this.myb, this.mCg.mzn);
    this.mEi.mAf = new com.tencent.mm.plugin.location.ui.i.a()
    {
      public final void Bq(String paramAnonymousString)
      {
        GMTrace.i(9689848872960L, 72195);
        Object localObject = (TrackPoint)g.this.mCg.mzn.getViewByItag(paramAnonymousString);
        if (localObject != null)
        {
          ((TrackPoint)localObject).bringToFront();
          g.this.mCg.mzn.invalidate();
          localObject = g.this.mEe;
          if (bg.nm(paramAnonymousString)) {
            break label240;
          }
          if ((((m)localObject).mxW == null) || (!paramAnonymousString.equals(((m)localObject).mxW.tRz))) {
            break label156;
          }
          paramAnonymousString = new com.tencent.mm.plugin.location.model.d(((m)localObject).mxW.uWX.tWm, ((m)localObject).mxW.uWX.tWn);
        }
        for (;;)
        {
          if (paramAnonymousString != null) {
            g.this.mCg.mzn.getIController().animateTo(paramAnonymousString.mwH, paramAnonymousString.mwI);
          }
          GMTrace.o(9689848872960L, 72195);
          return;
          label156:
          if ((((m)localObject).mBe != null) && (((m)localObject).mBe.size() > 0))
          {
            localObject = ((m)localObject).mBe.iterator();
            for (;;)
            {
              if (((Iterator)localObject).hasNext())
              {
                bmv localbmv = (bmv)((Iterator)localObject).next();
                if (localbmv.tRz.equals(paramAnonymousString))
                {
                  paramAnonymousString = new com.tencent.mm.plugin.location.model.d(localbmv.uWX.tWm, localbmv.uWX.tWn);
                  break;
                }
              }
            }
          }
          label240:
          paramAnonymousString = null;
        }
      }
    };
    this.mEf.myd = this.mEp;
    if (this.mEe == null) {
      this.mEe = new m(this.activity, this.mCg.mzn, true);
    }
    this.mEe.mBw = this.mBw;
    this.mEe.mBk = false;
    this.mEg = new com.tencent.mm.plugin.location.ui.l(this.activity, this);
    this.mEd = ((TipSayingWidget)findViewById(R.h.bZw));
    this.mEb = ((Button)findViewById(R.h.cer));
    this.mEb.setVisibility(0);
    this.mEh = new com.tencent.mm.plugin.location.ui.k(this.activity, this.mEb);
    this.mEh.mAS = this.mEi;
    localObject1 = this.mEk;
    Object localObject2 = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9668508254208L, 72036);
        paramAnonymousView = g.this.mEg;
        h.a(paramAnonymousView.mContext, paramAnonymousView.mResources.getString(R.l.dGQ), "", paramAnonymousView.mResources.getString(R.l.cSH), paramAnonymousView.mResources.getString(R.l.cSk), new l.6(paramAnonymousView), new l.7(paramAnonymousView));
        GMTrace.o(9668508254208L, 72036);
      }
    };
    ((ShareHeader)localObject1).mzL.setOnClickListener((View.OnClickListener)localObject2);
    localObject1 = this.mEk;
    localObject2 = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9705149693952L, 72309);
        com.tencent.mm.plugin.report.service.g.ork.i(10997, new Object[] { "11", Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
        g.this.mEg.aLd();
        GMTrace.o(9705149693952L, 72309);
      }
    };
    ((ShareHeader)localObject1).mzM.setOnClickListener((View.OnClickListener)localObject2);
    ((LocationManager)this.activity.getSystemService("location")).isProviderEnabled("gps");
    localObject1 = this.mEf;
    localObject2 = this.mCe;
    ((o)localObject1).myg = System.currentTimeMillis();
    ((o)localObject1).gxh = c.Ir();
    ((o)localObject1).gxh.b(((o)localObject1).fJt, true);
    if (((o)localObject1).mxT == null) {
      ((o)localObject1).mxT = com.tencent.mm.plugin.location.model.l.aKp();
    }
    ((o)localObject1).mxT.a(((o)localObject1).myi);
    if (localObject2 != null) {
      ((o)localObject1).mxX = ((LocationInfo)localObject2);
    }
    if (((o)localObject1).isStart)
    {
      w.i("MicorMsg.TrackRefreshManager", "start location " + ((o)localObject1).mxX.mwH + " " + ((o)localObject1).mxX.mwI);
      localObject1 = this.mEf;
      localObject2 = this.mEo;
      Iterator localIterator = ((o)localObject1).mxU.iterator();
      WeakReference localWeakReference;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localWeakReference = (WeakReference)localIterator.next();
      } while ((localWeakReference == null) || (localWeakReference.get() == null) || (!((o.b)localWeakReference.get()).equals(localObject2)));
    }
    for (;;)
    {
      this.mEl = this.activity.getIntent().getStringExtra("fromWhereShare");
      w.d("MicroMsg.ShareMapUI", "fromWhere=%s", new Object[] { this.mEl });
      if (!this.mEf.aKs()) {
        break label881;
      }
      w.i("MicroMsg.ShareMapUI", "has join");
      this.mEe.fI(true);
      this.mEh.aKS();
      GMTrace.o(9699378331648L, 72266);
      return;
      ((o)localObject1).mxV = 1;
      ((o)localObject1).mxW = new bmv();
      ((o)localObject1).mxW.uWX = new aub();
      ((o)localObject1).mxW.uWX.tWn = -1000.0D;
      ((o)localObject1).mxW.uWX.tWm = -1000.0D;
      w.i("MicorMsg.TrackRefreshManager", "start location imp " + ((o)localObject1).mxX.mwH + " " + ((o)localObject1).mxX.mwI);
      at.wS().a(492, (e)localObject1);
      at.wS().a(490, (e)localObject1);
      at.wS().a(491, (e)localObject1);
      ((o)localObject1).euX = false;
      ((o)localObject1).isStart = true;
      break;
      ((o)localObject1).mxU.add(new WeakReference(localObject2));
    }
    label881:
    localObject2 = this.mEf;
    localObject1 = this.myb;
    int i;
    if (!bg.nm(this.mEl)) {
      if (this.mEl.equals("fromBanner"))
      {
        i = 0;
        w.i("MicorMsg.TrackRefreshManager", "track join %s", new Object[] { localObject1 });
        ((o)localObject2).myb = ((String)localObject1);
        localObject2 = q.zE();
        if (!((String)localObject1).contains("@chatroom")) {
          break label1069;
        }
      }
    }
    for (;;)
    {
      localObject1 = new com.tencent.mm.plugin.location.model.a.b((String)localObject1);
      ((akc)((com.tencent.mm.plugin.location.model.a.b)localObject1).fUa.gtC.gtK).tOG = i;
      at.wS().a((com.tencent.mm.ad.k)localObject1, 0);
      GMTrace.o(9699378331648L, 72266);
      return;
      if (!this.mEl.equals("fromPluginLocation"))
      {
        if (this.mEl.equals("fromPluginTalk"))
        {
          i = 2;
          break;
        }
        if (this.mEl.equals("fromTrackButton"))
        {
          i = 3;
          break;
        }
        if (this.mEl.equals("fromMessage"))
        {
          i = 4;
          break;
        }
      }
      i = 1;
      break;
      label1069:
      if (((String)localObject2).compareTo((String)localObject1) > 0) {
        localObject1 = (String)localObject1 + (String)localObject2;
      } else {
        localObject1 = (String)localObject2 + (String)localObject1;
      }
    }
  }
  
  public final boolean aLp()
  {
    GMTrace.i(9698975678464L, 72263);
    GMTrace.o(9698975678464L, 72263);
    return true;
  }
  
  public final void b(axz paramaxz)
  {
    GMTrace.i(16051366526976L, 119592);
    w.d("MicroMsg.ShareMapUI", "refreshSuccess, timeout = %b", new Object[] { Boolean.valueOf(this.mEf.euX) });
    Object localObject3 = paramaxz.uMw;
    Object localObject2 = new LinkedList();
    Object localObject1 = com.tencent.mm.plugin.location.model.l.aKo().Bi(this.myb);
    if (localObject1 == null)
    {
      localObject1 = new a();
      ((a)localObject1).latitude = -1000.0D;
      ((a)localObject1).longitude = -1000.0D;
    }
    for (;;)
    {
      Object localObject4 = new LinkedList();
      Iterator localIterator = ((List)localObject3).iterator();
      while (localIterator.hasNext()) {
        ((LinkedList)localObject4).add(((bmv)localIterator.next()).tRz);
      }
      if (!((LinkedList)localObject4).contains(q.zE())) {
        ((LinkedList)localObject4).add(q.zE());
      }
      com.tencent.mm.plugin.location.model.l.aKo().a(this.myb, (LinkedList)localObject4, ((a)localObject1).latitude, ((a)localObject1).longitude, ((a)localObject1).mwD, "", "");
      localObject1 = ((List)localObject3).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = (bmv)((Iterator)localObject1).next();
        if ((Math.abs(((bmv)localObject3).uWX.tWm) > 180.0D) || (Math.abs(((bmv)localObject3).uWX.tWn) > 90.0D))
        {
          localObject4 = (bmv)this.mEq.get(((bmv)localObject3).tRz);
          if (localObject4 != null)
          {
            ((List)localObject2).add(localObject4);
            w.i("MicroMsg.ShareMapUI", "error from server get latlng %s %f %f and use old one %f %f", new Object[] { ((bmv)localObject3).tRz, Double.valueOf(((bmv)localObject3).uWX.tWn), Double.valueOf(((bmv)localObject3).uWX.tWm), Double.valueOf(((bmv)localObject4).uWX.tWn), Double.valueOf(((bmv)localObject4).uWX.tWm) });
          }
          else
          {
            w.i("MicroMsg.ShareMapUI", "error from server get latlng %s %f %f cannot user old one", new Object[] { ((bmv)localObject3).tRz, Double.valueOf(((bmv)localObject3).uWX.tWn), Double.valueOf(((bmv)localObject3).uWX.tWm) });
          }
        }
        else
        {
          ((List)localObject2).add(localObject3);
        }
      }
      this.mEq.clear();
      localObject1 = ((List)localObject2).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = (bmv)((Iterator)localObject1).next();
        this.mEq.put(((bmv)localObject3).tRz, localObject3);
      }
      int i = ((List)localObject2).size();
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).add(q.zE());
      if (i >= 0)
      {
        localObject3 = new StringBuilder();
        ((StringBuilder)localObject3).append("refreshSuccess, count =  " + i);
        i = 0;
        while (i < ((List)localObject2).size())
        {
          localObject4 = (bmv)((List)localObject2).get(i);
          ((StringBuilder)localObject3).append("[" + ((bmv)localObject4).tRz + " ] ");
          ((StringBuilder)localObject3).append(((bmv)localObject4).uWX.uJv + " ");
          ((StringBuilder)localObject3).append(((bmv)localObject4).uWX.tWn + " ");
          ((StringBuilder)localObject3).append(((bmv)localObject4).uWX.tWm + " ");
          ((ArrayList)localObject1).add(((bmv)localObject4).tRz);
          i += 1;
        }
        w.v("MicroMsg.ShareMapUI", "refreshSuccess TrackRoom num: " + ((StringBuilder)localObject3).toString());
        if (this.mEe != null) {
          this.mEe.aQ((List)localObject2);
        }
      }
      if (this.mEe.mBl)
      {
        localObject2 = this.mEe;
        paramaxz = paramaxz.uMx;
        if (((m)localObject2).mBo == null) {
          ((m)localObject2).mBo = new bjl();
        }
        if (paramaxz != null)
        {
          w.d("MicroMsg.TrackPointViewMgrImpl", "set trackitem  " + paramaxz.tWn + " " + paramaxz.tWm);
          ((m)localObject2).mBo.uHS = paramaxz.uHS;
          ((m)localObject2).mBo.tWn = paramaxz.tWn;
          ((m)localObject2).mBo.tWm = paramaxz.tWm;
        }
      }
      this.mEi.I((ArrayList)localObject1);
      GMTrace.o(16051366526976L, 119592);
      return;
    }
  }
  
  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(9700988944384L, 72278);
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(9700988944384L, 72278);
    return bool;
  }
  
  public final void fG(boolean paramBoolean)
  {
    GMTrace.i(9699915202560L, 72270);
    GMTrace.o(9699915202560L, 72270);
  }
  
  public final void onBackPressed()
  {
    GMTrace.i(9700854726656L, 72277);
    com.tencent.mm.plugin.report.service.g.ork.i(10997, new Object[] { "11", Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
    this.mEg.aLd();
    GMTrace.o(9700854726656L, 72277);
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9699244113920L, 72265);
    super.onCreate(paramBundle);
    w.i("MicroMsg.ShareMapUI", "onCreate");
    this.mEm = System.currentTimeMillis();
    GMTrace.o(9699244113920L, 72265);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(9699780984832L, 72269);
    super.onDestroy();
    Object localObject = this.mEf;
    o.b localb = this.mEo;
    Iterator localIterator = ((o)localObject).mxU.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      if ((localWeakReference != null) && (localWeakReference.get() != null) && (((o.b)localWeakReference.get()).equals(localb))) {
        ((o)localObject).mxU.remove(localWeakReference);
      }
    }
    this.mEf.myd = null;
    if (this.mEh != null)
    {
      localObject = this.mEh;
      ((com.tencent.mm.plugin.location.ui.k)localObject).mAR.b((p.o)localObject);
      localObject = ((com.tencent.mm.plugin.location.ui.k)localObject).mAE;
      ((VolumeMeter)localObject).mBz = true;
      ((VolumeMeter)localObject).mBy = false;
      if (((VolumeMeter)localObject).mBD != null)
      {
        ((VolumeMeter)localObject).mBD.getLooper().quit();
        ((VolumeMeter)localObject).mBD = null;
      }
    }
    if (this.mEe != null) {
      this.mEe.destroy();
    }
    if (this.mEc != null)
    {
      localObject = this.mEc;
      c.Ir().c(((MyLocationButton)localObject).fJt);
    }
    w.i("MicroMsg.ShareMapUI", "onDestory");
    GMTrace.o(9699780984832L, 72269);
  }
  
  public final void onPause()
  {
    GMTrace.i(9699646767104L, 72268);
    w.i("MicroMsg.ShareMapUI", "pause");
    super.onPause();
    this.wakeLock.release();
    o localo = this.mEf;
    w.d("MicorMsg.TrackRefreshManager", "pause isShared:" + localo.mxY);
    if (!localo.mxY)
    {
      localo.gxh.c(localo.fJt);
      localo.mxT.b(localo.myi);
      localo.mxZ = true;
      localo.myf = true;
    }
    localo = this.mEf;
    com.tencent.mm.plugin.p.d locald = this.mCg.mzn;
    localo.mya = localo.mxV;
    localo.mxV = 0;
    w.d("MicorMsg.TrackRefreshManager", "saveStatus pause_save_upload_status: " + localo.mya);
    if (localo.aKy())
    {
      localo.mwH = (locald.getMapCenterX() * 1.0D / 1000000.0D);
      localo.mwI = (locald.getMapCenterY() * 1.0D / 1000000.0D);
      localo.zoom = locald.getZoom();
    }
    com.tencent.mm.plugin.report.service.g.ork.i(10997, new Object[] { "17", Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(System.currentTimeMillis() - this.mEm) });
    this.mEm = System.currentTimeMillis();
    if (this.mEj != null) {
      this.mEj.c(this.fJt);
    }
    if (this.mEe != null) {
      this.mEe.onPause();
    }
    GMTrace.o(9699646767104L, 72268);
  }
  
  public final void onResume()
  {
    GMTrace.i(9699512549376L, 72267);
    w.i("MicroMsg.ShareMapUI", "resume");
    super.onResume();
    this.wakeLock.acquire();
    o localo = this.mEf;
    w.d("MicorMsg.TrackRefreshManager", "resume isPuase:" + localo.mxZ);
    if (localo.mxZ)
    {
      localo.myg = System.currentTimeMillis();
      localo.gxh.a(localo.fJt);
      localo.mxT.a(localo.myi);
    }
    localo.mxZ = false;
    localo.aKt();
    localo = this.mEf;
    com.tencent.mm.plugin.p.d locald = this.mCg.mzn;
    localo.mxV = localo.mya;
    w.d("MicorMsg.TrackRefreshManager", "resumeStatus upload_status  " + localo.mxV + " %f %f %d ", new Object[] { Double.valueOf(localo.mwH), Double.valueOf(localo.mwI), Integer.valueOf(localo.zoom) });
    if ((localo.mwH != -1000.0D) && (localo.mwI != -1000.0D) && (localo.zoom != -1))
    {
      locald.getIController().setCenter(localo.mwH, localo.mwI);
      locald.getIController().setZoom(localo.zoom);
    }
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        this.mEc.myW = false;
        this.mEc.aKH();
        this.mEe.mBp = false;
        this.mEe.mBj = true;
      }
      localo = this.mEf;
      locald = this.mCg.mzn;
      if (localo.mye != -1) {
        locald.getIController().setZoom(localo.mye);
      }
      if (this.mEj != null) {
        this.mEj.a(this.fJt);
      }
      if (this.mEe != null) {
        this.mEe.onResume();
      }
      GMTrace.o(9699512549376L, 72267);
      return;
    }
  }
  
  public final void pM(int paramInt)
  {
    GMTrace.i(9700586291200L, 72275);
    if (paramInt == 0)
    {
      com.tencent.mm.plugin.report.service.g.ork.i(10997, new Object[] { "8", "", Integer.valueOf(0), Integer.valueOf(0) });
      aLA();
      GMTrace.o(9700586291200L, 72275);
      return;
    }
    if (paramInt == 1)
    {
      com.tencent.mm.plugin.report.service.g.ork.i(10997, new Object[] { "8", "", Integer.valueOf(0), Integer.valueOf(0) });
      aLA();
      GMTrace.o(9700586291200L, 72275);
      return;
    }
    if (paramInt == 2) {
      aLA();
    }
    GMTrace.o(9700586291200L, 72275);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\impl\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */