package com.tencent.mm.plugin.location.model;

import android.graphics.Bitmap;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.p;
import com.tencent.mm.pluginsdk.p.r;
import com.tencent.mm.protocal.c.aub;
import com.tencent.mm.protocal.c.axz;
import com.tencent.mm.protocal.c.bjl;
import com.tencent.mm.protocal.c.bmv;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.protocal.c.rw;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class o
  implements e, p.p
{
  public boolean euX;
  public a.a fJt;
  public com.tencent.mm.modelgeo.c gxh;
  public boolean isStart;
  private int jWT;
  ae mHandler;
  private String mwF;
  public double mwH;
  public double mwI;
  private int mxR;
  private int mxS;
  public i mxT;
  public HashSet<WeakReference<b>> mxU;
  public int mxV;
  public bmv mxW;
  public LocationInfo mxX;
  public boolean mxY;
  public boolean mxZ;
  public int mya;
  public String myb;
  boolean myc;
  public a myd;
  public int mye;
  public boolean myf;
  public long myg;
  public long myh;
  public i.a myi;
  public int zoom;
  
  public o()
  {
    GMTrace.i(9624350621696L, 71707);
    this.mxR = 0;
    this.mxS = 1000;
    this.mxU = new HashSet();
    this.mxV = 1;
    this.mxX = new LocationInfo((byte)0);
    this.mxY = false;
    this.mxZ = false;
    this.isStart = false;
    this.mya = this.mxV;
    this.myb = "";
    this.euX = false;
    this.myc = false;
    this.myd = null;
    this.mye = -1;
    this.myf = true;
    this.myg = 0L;
    this.myh = 0L;
    this.mwH = -1000.0D;
    this.mwI = -1000.0D;
    this.zoom = -1;
    this.mHandler = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(9627840282624L, 71733);
        super.handleMessage(paramAnonymousMessage);
        if (paramAnonymousMessage == null)
        {
          GMTrace.o(9627840282624L, 71733);
          return;
        }
        o localo = o.this;
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(9627840282624L, 71733);
          return;
          localo.aKx();
        }
      }
    };
    this.fJt = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(15404973948928L, 114776);
        if (!paramAnonymousBoolean)
        {
          GMTrace.o(15404973948928L, 114776);
          return false;
        }
        w.d("MicorMsg.TrackRefreshManager", "onGetlocatoin fLongitude:%f, fLatitude:%f, locType:%d, speed:%f", new Object[] { Float.valueOf(paramAnonymousFloat1), Float.valueOf(paramAnonymousFloat2), Integer.valueOf(paramAnonymousInt), Double.valueOf(paramAnonymousDouble1) });
        if (o.this.myf)
        {
          o.this.myf = false;
          o.this.myh = System.currentTimeMillis();
          long l = o.this.myh - o.this.myg;
          w.d("MicorMsg.TrackRefreshManager", "locate time:%d", new Object[] { Long.valueOf(l) });
          g.ork.i(10997, new Object[] { "10", "", Integer.valueOf(0), Long.valueOf(l) });
        }
        if ((o.this.mxW != null) && (o.this.mxW.uWX != null))
        {
          o.this.mxW.uWX.tWn = paramAnonymousFloat2;
          o.this.mxW.uWX.tWm = paramAnonymousFloat1;
        }
        GMTrace.o(15404973948928L, 114776);
        return true;
      }
    };
    this.myi = new i.a()
    {
      public final void l(double paramAnonymousDouble)
      {
        GMTrace.i(9626498105344L, 71723);
        if (o.this.mxW != null) {
          o.this.mxW.uWX.uJv = paramAnonymousDouble;
        }
        GMTrace.o(9626498105344L, 71723);
      }
    };
    GMTrace.o(9624350621696L, 71707);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(9625692798976L, 71717);
    w.d("MicorMsg.TrackRefreshManager", "onSceneEnd scene type %d errType %d errCode %d", new Object[] { Integer.valueOf(paramk.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    WeakReference localWeakReference;
    if (paramk.getType() == 490)
    {
      if ((paramInt2 == 0) || (paramInt2 >= 1000))
      {
        this.mwF = ((com.tencent.mm.plugin.location.model.a.b)paramk).mwF;
        l.aKo().Bk(this.mwF);
        if (aKy())
        {
          w.i("MicorMsg.TrackRefreshManager", "join sucess %s", new Object[] { this.mwF });
          paramString = p.a.tmc.Bh(this.myb);
          paramString.add(q.zE());
          if (this.mxX != null) {
            p.a.tmc.a(this.myb, paramString, this.mxX.mwH, this.mxX.mwI, this.mxX.mwJ, "", "");
          }
          while (this.mxU != null)
          {
            paramString = this.mxU.iterator();
            while (paramString.hasNext())
            {
              paramk = (WeakReference)paramString.next();
              if ((paramk != null) && (paramk.get() != null)) {
                ((b)paramk.get()).aKA();
              }
            }
            p.a.tmc.a(this.myb, paramString, -1000.0D, -1000.0D, "", "", "");
          }
          aKx();
          GMTrace.o(9625692798976L, 71717);
        }
      }
      else
      {
        if ((paramInt2 == 17) && (this.mxU != null))
        {
          paramString = this.mxU.iterator();
          while (paramString.hasNext())
          {
            localWeakReference = (WeakReference)paramString.next();
            if ((localWeakReference != null) && (localWeakReference.get() != null)) {
              ((b)localWeakReference.get()).aKB();
            }
          }
        }
        if (this.mxU != null)
        {
          paramString = this.mxU.iterator();
          while (paramString.hasNext())
          {
            localWeakReference = (WeakReference)paramString.next();
            if ((localWeakReference != null) && (localWeakReference.get() != null)) {
              ((b)localWeakReference.get()).onError(0, ((com.tencent.mm.plugin.location.model.a.b)paramk).jWP);
            }
          }
          GMTrace.o(9625692798976L, 71717);
        }
      }
    }
    else if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      if (paramk.getType() == 492)
      {
        this.mxR += 1;
        this.mHandler.removeMessages(1);
        if (this.mxR >= 10)
        {
          this.mHandler.removeMessages(1);
          if (this.mxU != null)
          {
            paramString = this.mxU.iterator();
            while (paramString.hasNext())
            {
              localWeakReference = (WeakReference)paramString.next();
              if ((localWeakReference != null) && (localWeakReference.get() != null)) {
                ((b)localWeakReference.get()).onError(1, ((com.tencent.mm.plugin.location.model.a.c)paramk).jWP);
              }
            }
            GMTrace.o(9625692798976L, 71717);
          }
        }
        else if ((aKy()) && (!this.myc))
        {
          paramString = ((com.tencent.mm.plugin.location.model.a.c)paramk).mys;
          if ((paramString != null) && (paramString.uND != null))
          {
            if (paramString.uND.tST != 12) {
              break label704;
            }
            this.euX = true;
            if (this.myd != null) {
              this.myd.aKz();
            }
          }
          for (;;)
          {
            w.d("MicorMsg.TrackRefreshManager", "refresh track room, in error status, timeout = %b, ret = %d", new Object[] { Boolean.valueOf(this.euX), Integer.valueOf(paramString.uND.tST) });
            if (!this.euX) {
              this.mHandler.sendEmptyMessageDelayed(1, this.mxS);
            }
            GMTrace.o(9625692798976L, 71717);
            return;
            label704:
            this.euX = false;
          }
        }
      }
    }
    else
    {
      if (paramk.getType() == 492)
      {
        paramString = ((com.tencent.mm.plugin.location.model.a.c)paramk).mys;
        if ((paramString != null) && (paramString.uND != null))
        {
          if (paramString.uND.tST != 12) {
            break label972;
          }
          this.euX = true;
          if (this.myd != null) {
            this.myd.aKz();
          }
        }
        for (;;)
        {
          w.d("MicorMsg.TrackRefreshManager", "refresh track room, timeout = %b, ret = %d", new Object[] { Boolean.valueOf(this.euX), Integer.valueOf(paramString.uND.tST) });
          if (this.mxR > 0) {
            g.ork.i(10997, new Object[] { "9", "", Integer.valueOf(this.mxR), Integer.valueOf(0) });
          }
          this.mxR = 0;
          this.mxS = ((com.tencent.mm.plugin.location.model.a.c)paramk).myp;
          paramInt1 = ((com.tencent.mm.plugin.location.model.a.c)paramk).myt;
          if ((this.mxU == null) || ((paramInt1 != 2) && (paramInt1 != 1) && (paramInt1 != 3))) {
            break;
          }
          paramString = this.mxU.iterator();
          while (paramString.hasNext())
          {
            localWeakReference = (WeakReference)paramString.next();
            if ((localWeakReference != null) && (localWeakReference.get() != null)) {
              ((b)localWeakReference.get()).a(((com.tencent.mm.plugin.location.model.a.c)paramk).mys);
            }
          }
          label972:
          this.euX = false;
        }
        if (this.mxV == 1) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          if (paramInt1 == 0) {
            aKw();
          }
          this.mHandler.removeMessages(1);
          if ((aKy()) && (!this.myc) && (!this.euX)) {
            this.mHandler.sendEmptyMessageDelayed(1, this.mxS);
          }
          GMTrace.o(9625692798976L, 71717);
          return;
        }
      }
      if (paramk.getType() == 491) {
        l.aKo().Bk("");
      }
    }
    GMTrace.o(9625692798976L, 71717);
  }
  
  public final boolean aKs()
  {
    GMTrace.i(9624619057152L, 71709);
    if ((aKy()) && (this.mxY))
    {
      GMTrace.o(9624619057152L, 71709);
      return true;
    }
    GMTrace.o(9624619057152L, 71709);
    return false;
  }
  
  public final void aKt()
  {
    GMTrace.i(9624887492608L, 71711);
    w.d("MicorMsg.TrackRefreshManager", "resume refresh");
    this.myc = false;
    w.d("MicorMsg.TrackRefreshManager", "trigerRefresh");
    if (aKy())
    {
      w.d("MicorMsg.TrackRefreshManager", "trigerRefresh, joinSuccess");
      this.gxh = com.tencent.mm.modelgeo.c.Ir();
      this.gxh.b(this.fJt, true);
      if (this.mxT == null) {
        this.mxT = l.aKp();
      }
      this.mxT.a(this.myi);
      aKx();
    }
    GMTrace.o(9624887492608L, 71711);
  }
  
  public final String aKu()
  {
    GMTrace.i(9625021710336L, 71712);
    String str = this.myb;
    GMTrace.o(9625021710336L, 71712);
    return str;
  }
  
  public final List<String> aKv()
  {
    GMTrace.i(9625155928064L, 71713);
    LinkedList localLinkedList = l.aKo().Bh(this.myb);
    GMTrace.o(9625155928064L, 71713);
    return localLinkedList;
  }
  
  public final void aKw()
  {
    GMTrace.i(9625290145792L, 71714);
    if (this.mxV == 1)
    {
      this.mxV = 3;
      GMTrace.o(9625290145792L, 71714);
      return;
    }
    if (this.mxV == 3) {
      this.mxV = 2;
    }
    GMTrace.o(9625290145792L, 71714);
  }
  
  public final void aKx()
  {
    boolean bool = true;
    GMTrace.i(9625424363520L, 71715);
    if ((!this.isStart) || (!this.mxY) || (this.mxX == null))
    {
      localObject1 = new StringBuilder("error to exit refresh isStart: ").append(this.isStart).append(" isShared: ").append(this.mxY).append(" ");
      if (this.mxX == null) {}
      for (;;)
      {
        w.e("MicorMsg.TrackRefreshManager", bool);
        GMTrace.o(9625424363520L, 71715);
        return;
        bool = false;
      }
    }
    if ((this.mxW == null) || (this.mxW.uWX.tWn == -1000.0D) || (this.mxW.uWX.tWm == -1000.0D))
    {
      w.e("MicorMsg.TrackRefreshManager", "error to get my location ");
      this.mHandler.sendEmptyMessageDelayed(1, this.mxS);
      GMTrace.o(9625424363520L, 71715);
      return;
    }
    Object localObject2 = q.zE();
    Object localObject1 = new bjl();
    ((bjl)localObject1).uHS = this.mxX.mwJ;
    ((bjl)localObject1).tWn = this.mxX.mwH;
    ((bjl)localObject1).tWm = this.mxX.mwI;
    ((bjl)localObject1).lPi = ((String)localObject2);
    this.mxW.tRz = ((String)localObject2);
    this.mxW.uWX.uJv = l.aKp().aKg();
    localObject2 = new StringBuffer();
    ((StringBuffer)localObject2).append("refreshLoopImpl, [trackRoomId:" + this.mwF + "]");
    switch (this.mxV)
    {
    }
    for (;;)
    {
      ((StringBuffer)localObject2).append("[ mMyPosiItem " + this.mxW.uWX.tWn + " " + this.mxW.uWX.tWm + " " + this.mxW.uWX.uJv + " ]");
      w.d("MicorMsg.TrackRefreshManager", ((StringBuffer)localObject2).toString());
      localObject2 = this.mwF;
      int i = this.mxV;
      bmv localbmv = this.mxW;
      int j = this.jWT + 1;
      this.jWT = j;
      localObject1 = new com.tencent.mm.plugin.location.model.a.c((String)localObject2, i, localbmv, j, (bjl)localObject1);
      at.wS().a((k)localObject1, 0);
      GMTrace.o(9625424363520L, 71715);
      return;
      ((StringBuffer)localObject2).append("track upload_status  MMRefreshTrackRoomUpload ");
      continue;
      ((StringBuffer)localObject2).append("track upload_status  MMRefreshTrackRoomDownload ");
      continue;
      ((StringBuffer)localObject2).append("track upload_status  MMRefreshTrackRoomUploadAndDownLoad ");
      continue;
      ((StringBuffer)localObject2).append("track upload_status  MMRefreshTrackRoomFirstUpload ");
      ((StringBuffer)localObject2).append("[ trackItem " + ((bjl)localObject1).tWn + " " + ((bjl)localObject1).tWm + " ]");
    }
  }
  
  public final boolean aKy()
  {
    GMTrace.i(9625558581248L, 71716);
    if (!bg.nm(this.mwF))
    {
      GMTrace.o(9625558581248L, 71716);
      return true;
    }
    GMTrace.o(9625558581248L, 71716);
    return false;
  }
  
  public final void pI(int paramInt)
  {
    GMTrace.i(9624753274880L, 71710);
    w.i("MicorMsg.TrackRefreshManager", "track endTrack");
    Object localObject;
    if (aKy())
    {
      localObject = this.mwF;
      w.d("MicorMsg.TrackRefreshManager", "exitTrack, scene=%d", new Object[] { Integer.valueOf(paramInt) });
      localObject = new com.tencent.mm.plugin.location.model.a.a((String)localObject);
      ((rw)((com.tencent.mm.plugin.location.model.a.a)localObject).fUa.gtC.gtK).tOG = paramInt;
      at.wS().a((k)localObject, 0);
      this.mwF = "";
    }
    if (!bg.nm(this.myb))
    {
      localObject = l.aKo().Bi(this.myb);
      if (localObject != null)
      {
        ((com.tencent.mm.plugin.location.a.a)localObject).eNM.remove(q.zE());
        l.aKo().a(this.myb, ((com.tencent.mm.plugin.location.a.a)localObject).eNM, ((com.tencent.mm.plugin.location.a.a)localObject).latitude, ((com.tencent.mm.plugin.location.a.a)localObject).longitude, ((com.tencent.mm.plugin.location.a.a)localObject).mwD, null, null);
      }
    }
    l.aKo().Bk("");
    this.mwF = "";
    this.myb = "";
    this.mxY = false;
    this.mxZ = false;
    this.mwH = -1000.0D;
    this.mwI = -1000.0D;
    this.zoom = -1;
    this.mye = -1;
    GMTrace.o(9624753274880L, 71710);
  }
  
  public final void stop()
  {
    GMTrace.i(9624484839424L, 71708);
    w.i("MicorMsg.TrackRefreshManager", "stop location");
    if (this.gxh != null) {
      this.gxh.c(this.fJt);
    }
    if (this.mxT != null) {
      this.mxT.b(this.myi);
    }
    at.wS().b(492, this);
    at.wS().b(490, this);
    at.wS().b(491, this);
    this.mxV = 1;
    this.isStart = false;
    this.mye = -1;
    m localm = l.aKq();
    w.d("MicroMsg.TrackAvatarCacheService", "clearCache");
    Iterator localIterator = localm.mxQ.snapshot().keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      localObject = (Bitmap)localm.mxQ.get(localObject);
      if ((localObject != null) && (!((Bitmap)localObject).isRecycled())) {
        ((Bitmap)localObject).recycle();
      }
    }
    localm.mxQ.trimToSize(-1);
    GMTrace.o(9624484839424L, 71708);
  }
  
  public static abstract interface a
  {
    public abstract void aKz();
  }
  
  public static abstract interface b
  {
    public abstract void a(axz paramaxz);
    
    public abstract void aKA();
    
    public abstract void aKB();
    
    public abstract void onError(int paramInt, String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\model\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */