package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.plugin.location.model.LocationInfo;
import com.tencent.mm.plugin.location.model.e;
import com.tencent.mm.plugin.location.model.f;
import com.tencent.mm.plugin.location.model.i;
import com.tencent.mm.plugin.location.model.i.a;
import com.tencent.mm.plugin.location.model.l;
import com.tencent.mm.plugin.location.model.o;
import com.tencent.mm.plugin.location.ui.impl.TrackPoint;
import com.tencent.mm.plugin.location.ui.impl.TrackPointAnimAvatar;
import com.tencent.mm.plugin.p.d;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.aub;
import com.tencent.mm.protocal.c.bjl;
import com.tencent.mm.protocal.c.bmv;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class m
{
  private static Object mBf;
  private a.a fJt;
  public boolean jaO;
  protected float jqu;
  protected float lUn;
  public List<bmv> mBe;
  public TrackPoint mBg;
  TrackPointAnimAvatar mBh;
  boolean mBi;
  public boolean mBj;
  public boolean mBk;
  public boolean mBl;
  public boolean mBm;
  public boolean mBn;
  public bjl mBo;
  public boolean mBp;
  public boolean mBq;
  private boolean mBr;
  public long mBs;
  private View.OnTouchListener mBt;
  View.OnClickListener mBu;
  View.OnClickListener mBv;
  public a mBw;
  Context mContext;
  public bmv mxW;
  public d myV;
  boolean myW;
  private i.a myi;
  
  static
  {
    GMTrace.i(9649046683648L, 71891);
    mBf = new Object();
    GMTrace.o(9649046683648L, 71891);
  }
  
  public m(Context paramContext, d paramd, boolean paramBoolean)
  {
    GMTrace.i(9646764982272L, 71874);
    this.mBi = false;
    this.mBj = false;
    this.mBk = true;
    this.mBl = false;
    this.mBm = false;
    this.mBn = false;
    this.myW = false;
    this.mBp = true;
    this.mBq = true;
    this.mBr = false;
    this.lUn = 0.0F;
    this.jqu = 0.0F;
    this.jaO = false;
    this.mBs = 0L;
    this.mBt = new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        int j = 1;
        GMTrace.i(9653744304128L, 71926);
        switch (paramAnonymousMotionEvent.getAction())
        {
        }
        do
        {
          for (;;)
          {
            GMTrace.o(9653744304128L, 71926);
            return false;
            if ((Math.abs(paramAnonymousMotionEvent.getX() - m.this.lUn) > 10.0F) || (Math.abs(paramAnonymousMotionEvent.getY() - m.this.jqu) > 10.0F))
            {
              m.this.jaO = true;
              continue;
              m.this.lUn = paramAnonymousMotionEvent.getX();
              m.this.jqu = paramAnonymousMotionEvent.getY();
              m.this.mBs = System.currentTimeMillis();
              m.this.jaO = false;
            }
          }
        } while ((m.this.jaO) || (System.currentTimeMillis() - m.this.mBs >= 200L));
        paramAnonymousView = m.this;
        if (paramAnonymousView.mBm) {
          paramAnonymousView.fH(false);
        }
        paramAnonymousView = paramAnonymousView.myV.getChilds();
        paramAnonymousMotionEvent = paramAnonymousView.iterator();
        for (;;)
        {
          if (paramAnonymousMotionEvent.hasNext())
          {
            View localView = (View)paramAnonymousMotionEvent.next();
            if ((localView instanceof TrackPoint)) {
              if (((TrackPoint)localView).mEG.getVisibility() == 0)
              {
                i = 1;
                label252:
                if (i == 0) {
                  break label309;
                }
              }
            }
          }
        }
        for (int i = j;; i = 0)
        {
          paramAnonymousView = paramAnonymousView.iterator();
          for (;;)
          {
            if (!paramAnonymousView.hasNext()) {
              break label319;
            }
            paramAnonymousMotionEvent = (View)paramAnonymousView.next();
            if ((paramAnonymousMotionEvent instanceof TrackPoint))
            {
              if (i != 0)
              {
                ((TrackPoint)paramAnonymousMotionEvent).aLI();
                continue;
                i = 0;
                break label252;
                label309:
                break;
              }
              ((TrackPoint)paramAnonymousMotionEvent).aLJ();
            }
          }
          label319:
          break;
        }
      }
    };
    this.mBu = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9719108337664L, 72413);
        paramAnonymousView = (String)paramAnonymousView.getTag();
        w.d("MicroMsg.TrackPointViewMgrImpl", "onLocationTpClick, username=%s", new Object[] { paramAnonymousView });
        if (bg.nm(paramAnonymousView))
        {
          GMTrace.o(9719108337664L, 72413);
          return;
        }
        paramAnonymousView = m.this.myV.getViewByItag(paramAnonymousView);
        if ((paramAnonymousView != null) && ((paramAnonymousView instanceof TrackPoint)))
        {
          paramAnonymousView = (TrackPoint)paramAnonymousView;
          if (paramAnonymousView.visible)
          {
            paramAnonymousView.aLI();
            GMTrace.o(9719108337664L, 72413);
            return;
          }
          paramAnonymousView.aLJ();
        }
        GMTrace.o(9719108337664L, 72413);
      }
    };
    this.mBv = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9662602674176L, 71992);
        Object localObject1 = new int[2];
        paramAnonymousView.getLocationInWindow((int[])localObject1);
        paramAnonymousView = m.this;
        int i = localObject1[0];
        int j = localObject1[1];
        if (paramAnonymousView.mBe != null)
        {
          localObject1 = new ArrayList();
          float f = BackwardSupportUtil.b.a(paramAnonymousView.mContext, 85.0F);
          Object localObject2 = paramAnonymousView.mBe.iterator();
          while (((Iterator)localObject2).hasNext())
          {
            bmv localbmv = (bmv)((Iterator)localObject2).next();
            Point localPoint = paramAnonymousView.myV.getPointByGeoPoint(localbmv.uWX.tWn, localbmv.uWX.tWm);
            w.d("MicroMsg.TrackPointViewMgrImpl", "cal %f %f %d %d", new Object[] { Double.valueOf(localbmv.uWX.tWn), Double.valueOf(localbmv.uWX.tWm), Integer.valueOf(localPoint.x), Integer.valueOf(localPoint.y) });
            if (f.j(localPoint.x, localPoint.y, i, j) < f) {
              ((ArrayList)localObject1).add(localbmv.tRz);
            }
          }
          if (paramAnonymousView.mxW != null)
          {
            localObject2 = paramAnonymousView.myV.getPointByGeoPoint(paramAnonymousView.mxW.uWX.tWn, paramAnonymousView.mxW.uWX.tWm);
            w.d("MicroMsg.TrackPointViewMgrImpl", "cal %f %f %d %d", new Object[] { Double.valueOf(paramAnonymousView.mxW.uWX.tWn), Double.valueOf(paramAnonymousView.mxW.uWX.tWm), Integer.valueOf(((Point)localObject2).x), Integer.valueOf(((Point)localObject2).y) });
            if (f.j(((Point)localObject2).x, ((Point)localObject2).y, i, j) < f) {
              ((ArrayList)localObject1).add(paramAnonymousView.mxW.tRz);
            }
          }
          w.d("MicroMsg.TrackPointViewMgrImpl", "cal username size %d ", new Object[] { Integer.valueOf(((ArrayList)localObject1).size()) });
          if (((ArrayList)localObject1).size() > 1)
          {
            g.ork.i(10997, new Object[] { "12", Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
            b.b(paramAnonymousView.mContext, (ArrayList)localObject1);
          }
          ((ArrayList)localObject1).size();
        }
        GMTrace.o(9662602674176L, 71992);
      }
    };
    this.mBw = null;
    this.fJt = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(15405376602112L, 114779);
        if (!paramAnonymousBoolean)
        {
          GMTrace.o(15405376602112L, 114779);
          return false;
        }
        m localm = m.this;
        paramAnonymousDouble1 = paramAnonymousFloat2;
        paramAnonymousDouble2 = paramAnonymousFloat1;
        StringBuffer localStringBuffer = new StringBuffer();
        localStringBuffer.append("[refreshMyLocation] ");
        localStringBuffer.append(String.format("latitude = %f, longtitude = %f", new Object[] { Double.valueOf(paramAnonymousDouble1), Double.valueOf(paramAnonymousDouble2) }));
        if (localm.mxW == null)
        {
          localm.mxW = new bmv();
          localObject = new aub();
          localm.mxW.uWX = ((aub)localObject);
          localObject = q.zE();
          localm.mxW.tRz = ((String)localObject);
          localm.mxW.uWX.tWn = paramAnonymousDouble1;
          localm.mxW.uWX.tWm = paramAnonymousDouble2;
          if ((localm.myW) && (localm.mBi)) {
            localm.aLh();
          }
        }
        localm.mxW.uWX.tWn = paramAnonymousDouble1;
        localm.mxW.uWX.tWm = paramAnonymousDouble2;
        Object localObject = localm.myV.getViewByItag(localm.mxW.tRz);
        if (localObject != null)
        {
          localStringBuffer.append("[ view is not null hasCode: " + localObject.hashCode() + " ] ");
          w.d("MicroMsg.TrackPointViewMgrImpl", localStringBuffer.toString());
          if ((localObject instanceof TrackPoint))
          {
            localm.mBg = ((TrackPoint)localObject);
            w.d("MicroMsg.TrackPointViewMgrImpl", "udpate view layout");
            localm.myV.updateViewLayout((View)localObject, paramAnonymousDouble1, paramAnonymousDouble2);
            localm.mBg.By(localm.mxW.tRz);
            localObject = localm.mBg;
            paramAnonymousInt = R.g.aXL;
            ((TrackPoint)localObject).mEE.setImageResource(paramAnonymousInt);
            localObject = localm.mBg;
            if ((((TrackPoint)localObject).igq != -1.0D) || (((TrackPoint)localObject).igr != -1.0D)) {
              break label654;
            }
            ((TrackPoint)localObject).igq = paramAnonymousDouble1;
            ((TrackPoint)localObject).igo = paramAnonymousDouble1;
            ((TrackPoint)localObject).igr = paramAnonymousDouble2;
            ((TrackPoint)localObject).igp = paramAnonymousDouble2;
            label415:
            if (localm.mBk) {
              break label691;
            }
            localm.mBg.aLK();
          }
        }
        for (;;)
        {
          if (localm.mBp) {
            localm.myV.getIController().setCenter(localm.mxW.uWX.tWn, localm.mxW.uWX.tWm);
          }
          GMTrace.o(15405376602112L, 114779);
          return true;
          localObject = new TrackPoint(localm.mContext);
          if (localm.mBn)
          {
            ((TrackPoint)localObject).c(null);
            ((TrackPoint)localObject).b(null);
            ((TrackPoint)localObject).aLI();
          }
          for (;;)
          {
            if (!localm.mBk) {
              ((TrackPoint)localObject).aLK();
            }
            localStringBuffer.append("[view is null new one: " + localObject.hashCode() + " ] ");
            localm.myV.addView((View)localObject, paramAnonymousDouble1, paramAnonymousDouble2, localm.mxW.tRz);
            localm.mBh = new TrackPointAnimAvatar(localm.mContext);
            break;
            ((TrackPoint)localObject).c(localm.mBv);
            ((TrackPoint)localObject).b(localm.mBu);
          }
          label654:
          ((TrackPoint)localObject).igq = ((TrackPoint)localObject).igo;
          ((TrackPoint)localObject).igr = ((TrackPoint)localObject).igp;
          ((TrackPoint)localObject).igp = paramAnonymousDouble2;
          ((TrackPoint)localObject).igo = paramAnonymousDouble1;
          break label415;
          label691:
          localm.mBg.mEF.setVisibility(0);
        }
      }
    };
    this.myi = new i.a()
    {
      public final void l(double paramAnonymousDouble)
      {
        GMTrace.i(9666092335104L, 72018);
        if (m.this.mBg != null)
        {
          w.d("MicroMsg.TrackPointViewMgrImpl", "updateMyTrackPointDegree, degree = %f", new Object[] { Double.valueOf(paramAnonymousDouble) });
          m.this.mBg.m(paramAnonymousDouble);
        }
        GMTrace.o(9666092335104L, 72018);
      }
    };
    this.mContext = paramContext;
    this.myW = paramBoolean;
    this.myV = paramd;
    this.mBe = new ArrayList();
    paramd.setMapViewOnTouchListener(this.mBt);
    GMTrace.o(9646764982272L, 71874);
  }
  
  public final void a(d paramd)
  {
    GMTrace.i(9647570288640L, 71880);
    if (this.mxW == null)
    {
      GMTrace.o(9647570288640L, 71880);
      return;
    }
    double d1 = this.mxW.uWX.tWm;
    double d2 = this.mxW.uWX.tWn;
    paramd.getIController().animateTo(d2, d1);
    if (paramd.getZoomLevel() < 16) {
      paramd.getIController().setZoom(16);
    }
    GMTrace.o(9647570288640L, 71880);
  }
  
  final void aLh()
  {
    GMTrace.i(9647436070912L, 71879);
    if (this.mBj)
    {
      GMTrace.o(9647436070912L, 71879);
      return;
    }
    if (this.mxW == null)
    {
      GMTrace.o(9647436070912L, 71879);
      return;
    }
    double d3 = 0.0D;
    double d4 = 0.0D;
    LocationInfo localLocationInfo;
    double d1;
    if (this.mxW != null)
    {
      localLocationInfo = l.aKn().mxX;
      double d2 = d4;
      d1 = d3;
      if (this.mxW != null)
      {
        d2 = d4;
        d1 = d3;
        if (e.h(localLocationInfo.mwH, localLocationInfo.mwI))
        {
          d1 = 2.0D * Math.abs(this.mxW.uWX.tWn - localLocationInfo.mwH);
          d2 = Math.abs(this.mxW.uWX.tWm - localLocationInfo.mwI) * 2.0D;
        }
      }
      d3 = d1;
      int i = 0;
      for (d1 = d2; i < this.mBe.size(); d1 = d4)
      {
        bmv localbmv = (bmv)this.mBe.get(i);
        d2 = d3;
        d4 = d1;
        if (localbmv != null)
        {
          d2 = d3;
          d4 = d1;
          if (e.h(localbmv.uWX.tWn, localbmv.uWX.tWm))
          {
            double d5 = 2.0D * Math.abs(localbmv.uWX.tWn - this.mxW.uWX.tWn);
            d4 = Math.abs(localbmv.uWX.tWm - this.mxW.uWX.tWm) * 2.0D;
            d2 = d3;
            if (d5 > d3) {
              d2 = d5;
            }
            d3 = d1;
            if (d4 > d1) {
              d3 = d4;
            }
            w.d("MicroMsg.TrackPointViewMgrImpl", "update %s %f %f", new Object[] { localbmv.tRz, Double.valueOf(localbmv.uWX.tWn), Double.valueOf(localbmv.uWX.tWm) });
            d4 = d3;
          }
        }
        i += 1;
        d3 = d2;
      }
      if ((Math.abs(d3 + 1000.0D) >= 0.5D) && (Math.abs(d1 + 1000.0D) >= 0.5D)) {
        break label416;
      }
    }
    for (;;)
    {
      this.mBj = true;
      GMTrace.o(9647436070912L, 71879);
      return;
      label416:
      w.d("MicroMsg.TrackPointViewMgrImpl", "zoomToSpan maxlat " + 1000000.0D * d3 + " maxlng " + 1000000.0D * d1 + " poi " + localLocationInfo.mwH + " " + localLocationInfo.mwI);
      if (this.mxW != null)
      {
        w.d("MicroMsg.TrackPointViewMgrImpl", "mPosition item %f %f", new Object[] { Double.valueOf(this.mxW.uWX.tWn), Double.valueOf(this.mxW.uWX.tWm) });
        this.myV.zoomToSpan(this.mxW.uWX.tWn, this.mxW.uWX.tWm, d3, d1);
      }
      else if (e.h(localLocationInfo.mwH, localLocationInfo.mwI))
      {
        this.myV.zoomToSpan(localLocationInfo.mwH, localLocationInfo.mwI, d3, d1);
      }
    }
  }
  
  public final void aQ(List<bmv> paramList)
  {
    GMTrace.i(9647301853184L, 71878);
    this.mBi = true;
    int j = this.mBe.size() + 1;
    int i;
    int k;
    synchronized (mBf)
    {
      this.mBe.clear();
      i = 0;
      while (i < paramList.size())
      {
        this.mBe.add(paramList.get(i));
        i += 1;
      }
      k = this.mBe.size() + 1;
    }
    Object localObject2;
    synchronized (mBf)
    {
      Object localObject3 = this.myV.getTags();
      paramList = new HashSet();
      i = 0;
      while (i < this.mBe.size())
      {
        paramList.add(((bmv)this.mBe.get(i)).tRz);
        i += 1;
        continue;
        paramList = finally;
        throw paramList;
      }
      localObject2 = new LinkedList();
      localObject3 = ((Set)localObject3).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        String str = (String)((Iterator)localObject3).next();
        if ((!paramList.contains(str)) && (!str.endsWith("myAnim")) && ((this.mBg == null) || (!this.mBg.equals(this.myV.getViewByItag(str))))) {
          ((List)localObject2).add(str);
        }
      }
    }
    paramList = ((List)localObject2).iterator();
    while (paramList.hasNext())
    {
      localObject2 = (String)paramList.next();
      this.myV.removeViewByTag((String)localObject2);
    }
    for (;;)
    {
      if (i < this.mBe.size())
      {
        localObject2 = (bmv)this.mBe.get(i);
        paramList = this.myV.getViewByItag(((bmv)localObject2).tRz);
        w.d("MicroMsg.TrackPointViewMgrImpl", "position %d %s %f %f %f", new Object[] { Integer.valueOf(i), ((bmv)localObject2).tRz, Double.valueOf(((bmv)localObject2).uWX.tWn), Double.valueOf(((bmv)localObject2).uWX.tWm), Double.valueOf(((bmv)localObject2).uWX.uJv) });
        if (paramList != null) {
          this.myV.updateViewLayout(paramList, ((bmv)localObject2).uWX.tWn, ((bmv)localObject2).uWX.tWm);
        }
        while ((paramList instanceof TrackPoint))
        {
          paramList = (TrackPoint)paramList;
          paramList.By(((bmv)localObject2).tRz);
          paramList.m(((bmv)localObject2).uWX.uJv);
          if (this.mBl) {
            break;
          }
          paramList.aLI();
          break;
          paramList = new TrackPoint(this.mContext);
          paramList.setVisibility(0);
          if (!this.mBk) {
            ((TrackPoint)paramList).aLK();
          }
          this.myV.addView(paramList, ((bmv)localObject2).uWX.tWn, ((bmv)localObject2).uWX.tWm, ((bmv)localObject2).tRz);
          ((TrackPoint)paramList).c(this.mBv);
          ((TrackPoint)paramList).b(this.mBu);
        }
      }
      if ((this.myW) && (this.mBi))
      {
        if (!s.eb(l.aKn().myb)) {
          break label694;
        }
        aLh();
      }
      while ((j < 10) && (k >= 10))
      {
        paramList = this.myV.getChilds().iterator();
        while (paramList.hasNext())
        {
          localObject2 = (View)paramList.next();
          if ((localObject2 instanceof TrackPoint)) {
            ((TrackPoint)localObject2).aLI();
          }
        }
        label694:
        if (this.mBe.size() > 0) {
          aLh();
        }
      }
      if ((j >= 10) && (k < 10))
      {
        paramList = this.myV.getChilds().iterator();
        while (paramList.hasNext())
        {
          localObject2 = (View)paramList.next();
          if ((localObject2 instanceof TrackPoint)) {
            ((TrackPoint)localObject2).aLJ();
          }
        }
      }
      GMTrace.o(9647301853184L, 71878);
      return;
      i = 0;
      continue;
      i += 1;
    }
  }
  
  public final void destroy()
  {
    GMTrace.i(9647033417728L, 71876);
    synchronized (mBf)
    {
      if (this.mBe != null) {
        this.mBe.clear();
      }
      GMTrace.o(9647033417728L, 71876);
      return;
    }
  }
  
  public final void fH(boolean paramBoolean)
  {
    GMTrace.i(9646899200000L, 71875);
    if (paramBoolean) {
      if (this.mBg == null) {
        break label81;
      }
    }
    label81:
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        g.ork.i(10997, new Object[] { "20", Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
        this.mBm = paramBoolean;
      }
      GMTrace.o(9646899200000L, 71875);
      return;
    }
  }
  
  public final void fI(boolean paramBoolean)
  {
    GMTrace.i(9647167635456L, 71877);
    if ((paramBoolean) && (!this.mBl) && (this.myV != null))
    {
      Iterator localIterator = this.myV.getChilds().iterator();
      while (localIterator.hasNext())
      {
        View localView = (View)localIterator.next();
        if ((localView instanceof TrackPoint)) {
          ((TrackPoint)localView).aLJ();
        }
      }
    }
    this.mBl = paramBoolean;
    GMTrace.o(9647167635456L, 71877);
  }
  
  public final void onPause()
  {
    GMTrace.i(9647838724096L, 71882);
    c.Ir().c(this.fJt);
    l.aKp().b(this.myi);
    GMTrace.o(9647838724096L, 71882);
  }
  
  public final void onResume()
  {
    GMTrace.i(9647704506368L, 71881);
    c.Ir().b(this.fJt, true);
    l.aKp().a(this.myi);
    GMTrace.o(9647704506368L, 71881);
  }
  
  public static abstract interface a {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */