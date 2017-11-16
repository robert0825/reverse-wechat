package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import android.os.Build.VERSION;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.b.i;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.g.a.rm;
import com.tencent.mm.g.a.rm.a;
import com.tencent.mm.memory.o.b;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class a
{
  private static HashMap<String, WeakReference<Bitmap>> oSp;
  public static Map<String, Integer> oSt;
  public boolean gSY;
  public boolean isLoop;
  public ae krX;
  public Surface mSurface;
  public int oRQ;
  public int oRR;
  public String oRS;
  public String oRT;
  public int oRU;
  protected int oRV;
  public Bitmap oRW;
  public Bitmap oRX;
  public Bitmap oRY;
  public WeakReference<View> oRZ;
  public WeakReference<TextView> oSa;
  public long oSb;
  public WeakReference<View> oSc;
  public Animation oSd;
  public Animation oSe;
  boolean oSn;
  public boolean oSo;
  public boolean oSq;
  double oSr;
  boolean oSs;
  public double oSu;
  public boolean oSv;
  public boolean oSw;
  public volatile c pJA;
  private k pJB;
  public j pJC;
  private d pJD;
  private a pJE;
  public e pJF;
  public f pJG;
  public g pJH;
  volatile h pJx;
  public volatile b pJy;
  public volatile i pJz;
  public int position;
  
  static
  {
    GMTrace.i(15259213496320L, 113690);
    oSp = new HashMap();
    oSt = new ConcurrentHashMap();
    GMTrace.o(15259213496320L, 113690);
  }
  
  public a(int paramInt, View paramView)
  {
    GMTrace.i(15250757779456L, 113627);
    this.gSY = false;
    this.oRQ = 0;
    this.oRR = 0;
    this.oRS = "";
    this.oRT = "";
    this.oRU = -1;
    this.oRV = 41;
    this.oSn = true;
    this.oSo = false;
    this.oSq = false;
    this.isLoop = true;
    this.oSr = -1.0D;
    this.oSs = false;
    this.oSu = -1.0D;
    this.oSv = false;
    this.oSw = false;
    this.oRR = 0;
    this.krX = new ae(Looper.getMainLooper());
    this.oSc = new WeakReference(paramView);
    w.i("MicroMsg.SightPlayController", "new SightPlayController, drawType %d", new Object[] { Integer.valueOf(0) });
    GMTrace.o(15250757779456L, 113627);
  }
  
  public static boolean GC(String paramString)
  {
    GMTrace.i(15251697303552L, 113634);
    if (bg.nm(paramString))
    {
      GMTrace.o(15251697303552L, 113634);
      return false;
    }
    paramString = (Integer)oSt.get(paramString);
    if ((paramString != null) && (2 == paramString.intValue()))
    {
      GMTrace.o(15251697303552L, 113634);
      return false;
    }
    GMTrace.o(15251697303552L, 113634);
    return true;
  }
  
  public abstract void F(Bitmap paramBitmap);
  
  protected int bgq()
  {
    GMTrace.i(15250891997184L, 113628);
    GMTrace.o(15250891997184L, 113628);
    return -1;
  }
  
  public final boolean bgr()
  {
    GMTrace.i(15251160432640L, 113630);
    if (1 == this.oRR)
    {
      if ((this.pJy != null) && (!this.pJy.mZM))
      {
        GMTrace.o(15251160432640L, 113630);
        return true;
      }
      GMTrace.o(15251160432640L, 113630);
      return false;
    }
    if ((this.pJA != null) && (!this.pJA.mZM) && (this.pJy != null) && (!this.pJy.mZM))
    {
      GMTrace.o(15251160432640L, 113630);
      return true;
    }
    GMTrace.o(15251160432640L, 113630);
    return false;
  }
  
  public final boolean bgs()
  {
    GMTrace.i(15251831521280L, 113635);
    if (this.oSq)
    {
      GMTrace.o(15251831521280L, 113635);
      return false;
    }
    if (Build.VERSION.SDK_INT >= 11)
    {
      if (this.oRQ >= 3)
      {
        w.v("MicroMsg.SightPlayController", "match not check bad fps, but now is bad fps");
        this.oRQ = 0;
      }
      GMTrace.o(15251831521280L, 113635);
      return false;
    }
    if (this.oRQ >= 3)
    {
      GMTrace.o(15251831521280L, 113635);
      return true;
    }
    GMTrace.o(15251831521280L, 113635);
    return false;
  }
  
  protected final void bgt()
  {
    GMTrace.i(15252099956736L, 113637);
    int i = Math.max(1, (int)SightVideoJNI.getVideoRate(this.oRU));
    this.oRV = (1000 / i);
    w.d("MicroMsg.SightPlayController", "#0x%x update video rate to %d fps, delay %d ms", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(this.oRV) });
    GMTrace.o(15252099956736L, 113637);
  }
  
  public final void bgu()
  {
    GMTrace.i(16042642374656L, 119527);
    if ((this.oSc == null) || (-1 == bgq()))
    {
      GMTrace.o(16042642374656L, 119527);
      return;
    }
    if ((this.oSd == null) && (this.oSc.get() != null)) {
      this.oSd = AnimationUtils.loadAnimation(((View)this.oSc.get()).getContext(), bgq());
    }
    if (this.pJD == null) {
      this.pJD = new d();
    }
    this.krX.post(this.pJD);
    GMTrace.o(16042642374656L, 119527);
  }
  
  public final c bgv()
  {
    GMTrace.i(15252502609920L, 113640);
    if (this.pJE == null) {
      this.pJE = new a(this);
    }
    a locala = this.pJE;
    GMTrace.o(15252502609920L, 113640);
    return locala;
  }
  
  public final void blf()
  {
    GMTrace.i(15252234174464L, 113638);
    w.v("MicroMsg.SightPlayController", "draw surface thumb, thumb is null ? %B", new Object[] { Boolean.valueOf(true) });
    com.tencent.mm.modelvideo.o.g(this.pJB);
    if (this.pJB == null) {
      this.pJB = new k();
    }
    this.pJB.oSM = new WeakReference(null);
    com.tencent.mm.modelvideo.o.d(this.pJB, 0L);
    GMTrace.o(15252234174464L, 113638);
  }
  
  public abstract void bs(int paramInt1, int paramInt2);
  
  public final void clear()
  {
    GMTrace.i(15251428868096L, 113632);
    w.i("MicroMsg.SightPlayController", "#0x%x do clear, remove render job, video id %d, runing %B", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.oRU), Boolean.valueOf(bgr()) });
    hs(true);
    this.oSb = 0L;
    tX(this.oRU);
    this.oRU = -1;
    this.oRS = "";
    this.oRT = "ERROR#PATH";
    this.oRY = null;
    this.oSr = 0.0D;
    this.oSs = false;
    com.tencent.mm.memory.o.gib.g(this.oRW);
    this.oRW = null;
    GMTrace.o(15251428868096L, 113632);
  }
  
  public final void hs(boolean paramBoolean)
  {
    GMTrace.i(15251026214912L, 113629);
    if (this.pJx != null)
    {
      com.tencent.mm.modelvideo.o.g(this.pJx);
      this.pJx.mZM = true;
    }
    if (this.pJA != null)
    {
      this.krX.removeCallbacks(this.pJA);
      this.pJA.mZM = true;
    }
    if (this.pJy != null)
    {
      com.tencent.mm.modelvideo.o.g(this.pJy);
      this.pJy.mZM = true;
    }
    i locali;
    if (this.pJz != null)
    {
      locali = this.pJz;
      if (!paramBoolean) {
        break label123;
      }
    }
    label123:
    for (int i = 0;; i = 2)
    {
      locali.type = i;
      com.tencent.mm.modelvideo.o.d(this.pJz, 0L);
      GMTrace.o(15251026214912L, 113629);
      return;
    }
  }
  
  public final void restart()
  {
    GMTrace.i(15251294650368L, 113631);
    w.i("MicroMsg.SightPlayController", "#0x%x restart, canPlay %B, videoPath %s, videoId %d", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(this.oSn), this.oRS, Integer.valueOf(this.oRU) });
    if (!this.oSn)
    {
      clear();
      GMTrace.o(15251294650368L, 113631);
      return;
    }
    if (bgr())
    {
      w.w("MicroMsg.SightPlayController", "#0x%x is runing, do nothing when restart request asked, videoPath %s", new Object[] { Integer.valueOf(hashCode()), this.oRS });
      GMTrace.o(15251294650368L, 113631);
      return;
    }
    if (this.oRU < 0) {}
    for (boolean bool = true;; bool = false)
    {
      hs(bool);
      this.oSb = 0L;
      if (!bgs()) {
        break;
      }
      w.e("MicroMsg.SightPlayController", "#0x%x is bad fps, do nothing when restart", new Object[] { Integer.valueOf(hashCode()) });
      GMTrace.o(15251294650368L, 113631);
      return;
    }
    if (this.oRU < 0)
    {
      w.w("MicroMsg.SightPlayController", "#0x%x restart match error video id, try reopen video, videoPath %s", new Object[] { Integer.valueOf(hashCode()), this.oRS });
      if (bg.nm(this.oRS))
      {
        GMTrace.o(15251294650368L, 113631);
        return;
      }
      if (!GC(this.oRS))
      {
        w.w("MicroMsg.SightPlayController", "Check Sight Fail!!! return");
        clear();
        GMTrace.o(15251294650368L, 113631);
        return;
      }
      this.pJx = new h();
      com.tencent.mm.modelvideo.o.d(this.pJx, 0L);
      GMTrace.o(15251294650368L, 113631);
      return;
    }
    if (1 == this.oRR)
    {
      this.pJy = new b();
      this.pJA = null;
      com.tencent.mm.modelvideo.o.d(this.pJy, 0L);
      GMTrace.o(15251294650368L, 113631);
      return;
    }
    this.pJy = new b();
    this.pJA = new c();
    this.pJy.pJJ = this.pJA;
    this.pJA.pJL = this.pJy;
    com.tencent.mm.modelvideo.o.d(this.pJy, 0L);
    GMTrace.o(15251294650368L, 113631);
  }
  
  public final void tX(final int paramInt)
  {
    GMTrace.i(15251563085824L, 113633);
    com.tencent.mm.modelvideo.o.d(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(15272366833664L, 113788);
        long l = System.currentTimeMillis();
        SightVideoJNI.freeObj(paramInt);
        w.d("MicroMsg.SightPlayController", "#0x%x tick: do clear video %d, use %d ms", new Object[] { Integer.valueOf(a.this.hashCode()), Integer.valueOf(paramInt), Long.valueOf(System.currentTimeMillis() - l) });
        GMTrace.o(15272366833664L, 113788);
      }
    }, 0L);
    GMTrace.o(15251563085824L, 113633);
  }
  
  private static final class a
    extends c<rm>
  {
    int led;
    int oSD;
    int oSE;
    WeakReference<a> oSF;
    
    public a(a parama)
    {
      super();
      GMTrace.i(15263642681344L, 113723);
      this.oSD = 0;
      this.oSE = 0;
      this.led = 0;
      this.oSF = new WeakReference(parama);
      this.vhf = rm.class.getName().hashCode();
      GMTrace.o(15263642681344L, 113723);
    }
    
    private void a(rm paramrm)
    {
      GMTrace.i(15263776899072L, 113724);
      this.oSD = paramrm.eWo.eWr;
      this.oSE = paramrm.eWo.eWp;
      this.led = paramrm.eWo.eWq;
      GMTrace.o(15263776899072L, 113724);
    }
    
    private boolean bgx()
    {
      GMTrace.i(15263911116800L, 113725);
      if (this.oSF.get() == null)
      {
        GMTrace.o(15263911116800L, 113725);
        return false;
      }
      int i = ((a)this.oSF.get()).position + this.oSD;
      if ((i < this.oSE) || (i > this.led))
      {
        GMTrace.o(15263911116800L, 113725);
        return false;
      }
      GMTrace.o(15263911116800L, 113725);
      return true;
    }
  }
  
  private final class b
    implements Runnable
  {
    volatile boolean mZM;
    a.c pJJ;
    
    public b()
    {
      GMTrace.i(15273037922304L, 113793);
      this.mZM = false;
      GMTrace.o(15273037922304L, 113793);
    }
    
    public final void run()
    {
      GMTrace.i(15273172140032L, 113794);
      if ((a.this.pJH != null) && (a.this.pJH.bgz() != null) && (a.this.pJH.bgz().getVisibility() == 0)) {
        a.this.krX.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(15261897850880L, 113710);
            a.this.pJH.bgz().setVisibility(8);
            GMTrace.o(15261897850880L, 113710);
          }
        });
      }
      if (a.this.oRU < 0)
      {
        w.w("MicroMsg.SightPlayController", "#0x%x-#0x%x error video id, path %s", new Object[] { Integer.valueOf(a.this.hashCode()), Integer.valueOf(hashCode()), a.this.oRS });
        GMTrace.o(15273172140032L, 113794);
        return;
      }
      if (this.mZM)
      {
        w.e("MicroMsg.SightPlayController", "#0x%x-#0x%x match stop decode cmd at beg", new Object[] { Integer.valueOf(a.this.hashCode()), Integer.valueOf(hashCode()) });
        GMTrace.o(15273172140032L, 113794);
        return;
      }
      if (a.this.oSb == 0L)
      {
        if (a.this.pJz != null)
        {
          a.this.pJz.type = 1;
          a.this.pJz.run();
        }
        a.this.oSb = System.currentTimeMillis();
      }
      int j = 0;
      int i = j;
      if (a.this.oSu != -1.0D)
      {
        if (a.this.oSo) {
          break label637;
        }
        i = j;
        if (SightVideoJNI.seekStream(a.this.oSu, a.this.oRU) > 0)
        {
          if (a.this.pJz == null) {
            a.this.pJz = new a.i(a.this);
          }
          a.this.pJz.type = 4;
          a.this.pJz.oSu = a.this.oSu;
          a.this.pJz.run();
          i = 1;
        }
      }
      float f3 = (float)(System.currentTimeMillis() - a.this.oSb);
      float f1;
      label381:
      float f2;
      double d;
      a locala;
      if (i != 0)
      {
        f1 = 0.0F;
        f2 = f1;
        if (a.this.oSo)
        {
          f2 = f1;
          if (a.this.oSv)
          {
            a.this.oSv = false;
            f2 = f1;
            if (a.this.pJz != null)
            {
              d = a.this.pJz.bgC() / 1000.0D;
              f2 = f1;
              if (SightVideoJNI.seekStream(d, a.this.oRU) > 0)
              {
                f2 = 0.0F;
                w.i("MicroMsg.SightPlayController", "seek to " + d + " modify time : 0.0");
              }
            }
          }
        }
        if (a.this.gSY) {
          w.i("MicroMsg.SightPlayController", "#0x%x video %d id passedTime:  %s  seek  %s", new Object[] { Integer.valueOf(a.this.hashCode()), Integer.valueOf(a.this.oRU), Float.valueOf(f3), Float.valueOf(f2) });
        }
        a.this.oSb = System.currentTimeMillis();
        if (f2 < 2.0F) {
          break label828;
        }
        locala = a.this;
      }
      label637:
      label828:
      for (locala.oRQ += 1;; a.this.oRQ = Math.max(0, a.this.oRQ - 1))
      {
        if (!a.this.bgs()) {
          break label851;
        }
        w.e("MicroMsg.SightPlayController", "match tolerate bad seek times %d", new Object[] { Integer.valueOf(a.this.oRQ) });
        a.this.clear();
        GMTrace.o(15273172140032L, 113794);
        return;
        if (a.this.pJz != null)
        {
          a.this.pJz.type = 4;
          a.this.pJz.oSu = a.this.oSu;
          a.this.pJz.run();
          a.this.krX.postDelayed(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(15260287238144L, 113698);
              a.this.oSv = true;
              GMTrace.o(15260287238144L, 113698);
            }
          }, 100L);
          i = j;
          break;
        }
        i = j;
        if (SightVideoJNI.seekStream(a.this.oSu, a.this.oRU) <= 0) {
          break;
        }
        if (a.this.pJz == null) {
          a.this.pJz = new a.i(a.this);
        }
        a.this.pJz.type = 4;
        a.this.pJz.oSu = a.this.oSu;
        a.this.pJz.run();
        i = 1;
        break;
        f1 = f3 / a.this.oRV + 0.5F;
        break label381;
      }
      label851:
      int k = 0;
      j = 0;
      int m = 0;
      if (1 == a.this.oRR) {
        if ((a.this.mSurface != null) && (!a.this.mSurface.isValid()))
        {
          w.e("MicroMsg.SightPlayController", "#0x%x-#0x%x draw surface match error, surface is not valid", new Object[] { Integer.valueOf(a.this.hashCode()), Integer.valueOf(hashCode()) });
          this.mZM = true;
          if (this.pJJ == null) {
            break label1406;
          }
          this.pJJ.mZM = true;
          i = 0;
          j = m;
          if (a.this.pJz == null) {
            break label2149;
          }
          w.d("MicroMsg.SightPlayController", "voice time is" + a.this.pJz.bgC() / 1000.0D);
        }
      }
      label1406:
      label1730:
      label2149:
      for (;;)
      {
        if (1 == j) {
          a.this.krX.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(15262568939520L, 113715);
              if (a.this.pJF != null) {
                a.this.pJF.uO(0);
              }
              GMTrace.o(15262568939520L, 113715);
            }
          });
        }
        if (this.mZM)
        {
          w.e("MicroMsg.SightPlayController", "#0x%x-#0x%x match stop decode cmd at end", new Object[] { Integer.valueOf(a.this.hashCode()), Integer.valueOf(hashCode()) });
          if (a.this.pJz != null)
          {
            a.this.pJz.type = 0;
            a.this.pJz.run();
          }
          GMTrace.o(15273172140032L, 113794);
          return;
          i = SightVideoJNI.drawSurfaceFrame(a.this.oRU, a.this.mSurface, (int)f2, a.this.oRX, a.this.isLoop);
          if (a.this.pJG != null)
          {
            d = SightVideoJNI.getVideoPlayTime(a.this.oRU);
            j = (int)d;
            if (j != (int)a.this.oSr) {
              a.this.pJG.dM(j);
            }
            a.this.oSr = d;
          }
          if (i == 0)
          {
            a.this.oSu = -1.0D;
            k = 0;
            j = i;
            i = k;
            break;
          }
          if (1 == i)
          {
            a.this.oSu = -1.0D;
            k = 1;
            a.this.oSb = 0L;
            a.this.bgu();
            j = i;
            i = k;
            break;
          }
          if (-7 == i)
          {
            w.w("MicroMsg.SightPlayController", "surface is null, continue");
            k = 0;
            j = i;
            i = k;
            break;
          }
          w.e("MicroMsg.SightPlayController", "#0x%x-#0x%x draw surface match error:%d", new Object[] { Integer.valueOf(a.this.hashCode()), Integer.valueOf(hashCode()), Integer.valueOf(i) });
          this.mZM = true;
          if (this.pJJ != null) {
            this.pJJ.mZM = true;
          }
          a.this.blf();
          j = i;
          if (a.this.pJF != null)
          {
            a.this.pJF.uO(-1);
            j = i;
          }
          i = 0;
          break;
          m = SightVideoJNI.drawFrame(a.this.oRU, a.this.oRW, (int)f2, null, false, a.this.isLoop);
          if (a.this.pJG != null)
          {
            d = SightVideoJNI.getVideoPlayTime(a.this.oRU);
            i = (int)d;
            if (i != (int)a.this.oSr) {
              a.this.pJG.dM(i);
            }
            a.this.oSr = d;
            if (a.this.gSY) {
              w.i("MicroMsg.SightPlayController", "#0x%x-#0x%drawFrame ret: %d  time: %f", new Object[] { Integer.valueOf(a.this.hashCode()), Integer.valueOf(hashCode()), Integer.valueOf(m), Double.valueOf(d) });
            }
          }
          for (;;)
          {
            if (m != 0) {
              break label1730;
            }
            a.this.oSu = -1.0D;
            j = m;
            i = k;
            break;
            if (a.this.gSY)
            {
              d = SightVideoJNI.getVideoPlayTime(a.this.oRU);
              if (a.this.gSY) {
                w.i("MicroMsg.SightPlayController", "#0x%x-#0x%drawFrame ret: %d  time: %f", new Object[] { Integer.valueOf(a.this.hashCode()), Integer.valueOf(hashCode()), Integer.valueOf(m), Double.valueOf(d) });
              }
            }
            else if (a.this.gSY)
            {
              w.i("MicroMsg.SightPlayController", "#0x%x-#0x%drawFrame ret: %d", new Object[] { Integer.valueOf(a.this.hashCode()), Integer.valueOf(hashCode()), Integer.valueOf(m) });
            }
          }
          if (1 == m)
          {
            a.this.oSu = -1.0D;
            i = 1;
            a.this.oSb = 0L;
            a.this.bgu();
            j = m;
            continue;
          }
          a.this.oSu = -1.0D;
          w.e("MicroMsg.SightPlayController", "#0x%x-#0x%x draw bitmap match error:%d", new Object[] { Integer.valueOf(a.this.hashCode()), Integer.valueOf(hashCode()), Integer.valueOf(m) });
          this.mZM = true;
          if (this.pJJ != null) {
            this.pJJ.mZM = true;
          }
          a.this.krX.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(15264984858624L, 113733);
              a.this.F(null);
              GMTrace.o(15264984858624L, 113733);
            }
          });
          j = m;
          i = k;
          if (a.this.pJF == null) {
            continue;
          }
          a.this.pJF.uO(-1);
          j = m;
          i = k;
          continue;
        }
        long l;
        if (1 == a.this.oRR)
        {
          l = a.this.oRV - (System.currentTimeMillis() - a.this.oSb);
          if (a.this.oSb == 0L) {
            com.tencent.mm.modelvideo.o.d(this, a.this.oRV * 5);
          }
        }
        for (;;)
        {
          if (a.this.pJz != null) {
            w.d("MicroMsg.SightPlayController", "voice time is" + a.this.pJz.bgC() / 1000.0D);
          }
          GMTrace.o(15273172140032L, 113794);
          return;
          if (l > 0L)
          {
            com.tencent.mm.modelvideo.o.d(this, l);
          }
          else
          {
            com.tencent.mm.modelvideo.o.d(this, 0L);
            continue;
            if ((i != 0) && (a.this.pJH != null))
            {
              i = a.this.pJH.bgy();
              a.this.krX.post(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(15250355126272L, 113624);
                  if (a.this.pJH != null)
                  {
                    View localView = a.this.pJH.bgz();
                    if (localView != null)
                    {
                      if ((a.this.oSe == null) && (a.this.pJH.bgA() != -1) && (a.this.oSc.get() != null)) {
                        a.this.oSe = AnimationUtils.loadAnimation(((View)a.this.oSc.get()).getContext(), a.this.pJH.bgA());
                      }
                      if (a.this.oSe != null) {
                        localView.startAnimation(a.this.oSe);
                      }
                      localView.setVisibility(0);
                    }
                  }
                  GMTrace.o(15250355126272L, 113624);
                }
              });
              this.pJJ.oSI = j;
              a.this.krX.postDelayed(this.pJJ, i);
            }
            else
            {
              this.pJJ.oSI = j;
              a.this.krX.post(this.pJJ);
            }
          }
        }
      }
    }
  }
  
  private final class c
    implements Runnable
  {
    volatile boolean mZM;
    int oSI;
    a.b pJL;
    
    public c()
    {
      GMTrace.i(15268608737280L, 113760);
      this.mZM = false;
      w.i("MicroMsg.SightPlayController", "make sure drawJob alive");
      GMTrace.o(15268608737280L, 113760);
    }
    
    public final void run()
    {
      GMTrace.i(15268742955008L, 113761);
      if (this.mZM)
      {
        w.e("MicroMsg.SightPlayController", "#0x%x-#0x%x match stop draw", new Object[] { Integer.valueOf(a.this.hashCode()), Integer.valueOf(hashCode()) });
        GMTrace.o(15268742955008L, 113761);
        return;
      }
      a.this.F(a.this.oRW);
      if (a.this.oSb == 0L)
      {
        com.tencent.mm.modelvideo.o.d(this.pJL, 0L);
        GMTrace.o(15268742955008L, 113761);
        return;
      }
      long l = a.this.oRV - (System.currentTimeMillis() - a.this.oSb);
      if (l > 0L)
      {
        com.tencent.mm.modelvideo.o.d(this.pJL, l);
        GMTrace.o(15268742955008L, 113761);
        return;
      }
      com.tencent.mm.modelvideo.o.d(this.pJL, 0L);
      GMTrace.o(15268742955008L, 113761);
    }
  }
  
  private final class d
    implements Runnable
  {
    public d()
    {
      GMTrace.i(15264179552256L, 113727);
      GMTrace.o(15264179552256L, 113727);
    }
    
    public final void run()
    {
      GMTrace.i(15264313769984L, 113728);
      if (a.this.oSc.get() == null)
      {
        GMTrace.o(15264313769984L, 113728);
        return;
      }
      ((View)a.this.oSc.get()).startAnimation(a.this.oSd);
      GMTrace.o(15264313769984L, 113728);
    }
  }
  
  public static abstract interface e
  {
    public abstract void uO(int paramInt);
  }
  
  public static abstract interface f
  {
    public abstract void dM(long paramLong);
  }
  
  public static abstract interface g
  {
    public abstract int bgA();
    
    public abstract int bgy();
    
    public abstract View bgz();
  }
  
  private final class h
    implements Runnable
  {
    volatile boolean mZM;
    
    public h()
    {
      GMTrace.i(15249818255360L, 113620);
      this.mZM = false;
      GMTrace.o(15249818255360L, 113620);
    }
    
    public final void run()
    {
      GMTrace.i(15249952473088L, 113621);
      if (a.this.bgs())
      {
        w.e("MicroMsg.SightPlayController", "is bad fps, do nothing when open file");
        GMTrace.o(15249952473088L, 113621);
        return;
      }
      a locala = a.this;
      String str = a.this.oRS;
      if (1 == a.this.oRR) {}
      for (int i = 0;; i = 1)
      {
        locala.oRU = SightVideoJNI.openFile(str, i, 1, false);
        if (a.this.oRU >= 0) {
          break;
        }
        w.w("MicroMsg.SightPlayController", "#0x%x-#0x%x error video id %d, path %s", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(a.this.hashCode()), Integer.valueOf(a.this.oRU), a.this.oRS });
        a.this.blf();
        if (a.this.pJF != null) {
          a.this.pJF.uO(-1);
        }
        GMTrace.o(15249952473088L, 113621);
        return;
      }
      if (((Boolean)AdLandingPagesProxy.getInstance().getCfg(344065, Boolean.valueOf(false))).booleanValue())
      {
        if (a.this.pJC == null) {
          a.this.pJC = new a.j(a.this);
        }
        a.this.krX.removeCallbacks(a.this.pJC);
        a.this.krX.post(a.this.pJC);
      }
      int j = Math.max(1, SightVideoJNI.getVideoWidth(a.this.oRU));
      int k = Math.max(1, SightVideoJNI.getVideoHeight(a.this.oRU));
      if (a.this.oRR == 0)
      {
        if ((j * k >= 1048576) || (j <= 0) || (k <= 0))
        {
          w.e("MicroMsg.SightPlayController", "get error info videoWidth %d height  %d", new Object[] { Integer.valueOf(j), Integer.valueOf(k) });
          GMTrace.o(15249952473088L, 113621);
          return;
        }
        locala = a.this;
        w.d("MicroMsg.SightPlayController", "#0x%x check bmp, video width %d, height %d", new Object[] { Integer.valueOf(locala.hashCode()), Integer.valueOf(j), Integer.valueOf(k) });
        if (locala.oRW != null) {
          break label633;
        }
        locala.oRW = com.tencent.mm.memory.o.gib.a(new o.b(j, k));
        w.j("MicroMsg.SightPlayController", "checkBmp, create new one, videoPath: %s", new Object[] { locala.oRS });
      }
      label633:
      while ((locala.oRW.getWidth() == j) && (locala.oRW.getHeight() == k))
      {
        a.this.bgt();
        if ((Float.compare(j / k, 5.0F) <= 0) && (Float.compare(k / j, 5.0F) <= 0)) {
          break;
        }
        w.w("MicroMsg.SightPlayController", "ERROR Video size %d, %d", new Object[] { Integer.valueOf(j), Integer.valueOf(k) });
        if (!bg.nm(a.this.oRS)) {
          a.oSt.put(a.this.oRS, Integer.valueOf(2));
        }
        a.this.oSb = 0L;
        a.this.tX(a.this.oRU);
        a.this.oRU = -1;
        a.this.oRS = "";
        a.this.oRT = "ERROR#PATH";
        a.this.oRY = null;
        this.mZM = true;
        if (a.this.pJF != null) {
          a.this.pJF.uO(-1);
        }
        GMTrace.o(15249952473088L, 113621);
        return;
      }
      w.w("MicroMsg.SightPlayController", "reset bmp, old value " + locala.oRW.getWidth() + "*" + locala.oRW.getHeight());
      if ((d.et(19)) && (locala.oRW.getAllocationByteCount() >= k * j * 4)) {}
      for (;;)
      {
        try
        {
          w.w("MicroMsg.SightPlayController", "reset bmp, try directly reconfigure");
          locala.oRW.reconfigure(j, k, Bitmap.Config.ARGB_8888);
          i = 1;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.SightPlayController", "reconfigure failed: %s" + localException.getMessage());
          i = 0;
          continue;
        }
        if (i == 0)
        {
          com.tencent.mm.memory.o.gib.g(locala.oRW);
          locala.oRW = com.tencent.mm.memory.o.gib.a(new o.b(j, k));
        }
        w.j("MicroMsg.SightPlayController", "checkBmp, the origin bmp size not match, create new one, videoPath: %s", new Object[] { locala.oRS });
        break;
        a.this.bs(j, k);
        if (1 == a.this.oRR)
        {
          a.this.pJy = new a.b(a.this);
          a.this.pJA = null;
          if (!this.mZM) {
            com.tencent.mm.modelvideo.o.d(a.this.pJy, 0L);
          }
        }
        for (;;)
        {
          if (this.mZM) {
            w.e("MicroMsg.SightPlayController", "#0x%x-#0x%x open file end, match stop %B", new Object[] { Integer.valueOf(a.this.hashCode()), Integer.valueOf(hashCode()), Boolean.valueOf(this.mZM) });
          }
          GMTrace.o(15249952473088L, 113621);
          return;
          a.this.pJy = new a.b(a.this);
          a.this.pJA = new a.c(a.this);
          a.this.pJy.pJJ = a.this.pJA;
          a.this.pJA.pJL = a.this.pJy;
          if (!this.mZM) {
            com.tencent.mm.modelvideo.o.d(a.this.pJy, 0L);
          }
        }
        i = 0;
      }
    }
  }
  
  private final class i
    implements Runnable
  {
    MediaPlayer oSK;
    double oSu;
    int type;
    
    public i()
    {
      GMTrace.i(15262971592704L, 113718);
      this.oSu = -1.0D;
      GMTrace.o(15262971592704L, 113718);
    }
    
    private void bgB()
    {
      GMTrace.i(15263105810432L, 113719);
      w.i("MicroMsg.SightPlayController", "stopPlayer");
      try
      {
        if (this.oSK != null)
        {
          this.oSK.stop();
          this.oSK.release();
          this.oSK = null;
        }
        GMTrace.o(15263105810432L, 113719);
        return;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.SightPlayController", localException, "stop play sound error: %s", new Object[] { localException.getMessage() });
        this.oSK = null;
        GMTrace.o(15263105810432L, 113719);
      }
    }
    
    public final double bgC()
    {
      GMTrace.i(15263240028160L, 113720);
      if (this.oSK == null)
      {
        GMTrace.o(15263240028160L, 113720);
        return 0.0D;
      }
      double d = this.oSK.getCurrentPosition();
      GMTrace.o(15263240028160L, 113720);
      return d;
    }
    
    public final void run()
    {
      GMTrace.i(15263374245888L, 113721);
      String str;
      switch (this.type)
      {
      default: 
        str = "unknown";
        w.i("MicroMsg.SightPlayController", "do play sound, operation %s", new Object[] { str });
        switch (this.type)
        {
        }
        break;
      }
      for (;;)
      {
        GMTrace.o(15263374245888L, 113721);
        return;
        str = "start";
        break;
        str = "stop";
        break;
        str = "pause";
        break;
        str = "resume";
        break;
        str = "seek";
        break;
        bgB();
        if (!bg.nm(a.this.oRS))
        {
          try
          {
            this.oSK = new i();
            this.oSK.setDisplay(null);
            this.oSK.reset();
            this.oSK.setDataSource(a.this.oRS);
            this.oSK.setAudioStreamType(3);
            this.oSK.setOnErrorListener(new MediaPlayer.OnErrorListener()
            {
              public final boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
              {
                GMTrace.i(15249684037632L, 113619);
                w.e("MicroMsg.SightPlayController", "on error: play %s ERROR!! %d %d", new Object[] { a.this.oRS, Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
                a.this.clear();
                if (a.this.pJF != null) {
                  a.this.pJF.uO(-1);
                }
                GMTrace.o(15249684037632L, 113619);
                return true;
              }
            });
            this.oSK.prepare();
            this.oSK.start();
            GMTrace.o(15263374245888L, 113721);
            return;
          }
          catch (Exception localException1)
          {
            w.printErrStackTrace("MicroMsg.SightPlayController", localException1, "play sound error: %s", new Object[] { localException1.getMessage() });
            w.e("MicroMsg.SightPlayController", "on Exception: play %s ERROR!!", new Object[] { a.this.oRS });
            a.this.clear();
            if (a.this.pJF != null) {
              a.this.pJF.uO(-1);
            }
            GMTrace.o(15263374245888L, 113721);
            return;
          }
          bgB();
          GMTrace.o(15263374245888L, 113721);
          return;
          try
          {
            if ((this.oSK != null) && (this.oSK.isPlaying())) {
              this.oSK.pause();
            }
            GMTrace.o(15263374245888L, 113721);
            return;
          }
          catch (Exception localException2)
          {
            w.printErrStackTrace("MicroMsg.SightPlayController", localException2, "pause sound error: %s", new Object[] { localException2.getMessage() });
            bgB();
            GMTrace.o(15263374245888L, 113721);
            return;
          }
          try
          {
            if (this.oSK != null) {
              this.oSK.start();
            }
            GMTrace.o(15263374245888L, 113721);
            return;
          }
          catch (Exception localException3)
          {
            w.printErrStackTrace("MicroMsg.SightPlayController", localException3, "pause sound error: %s", new Object[] { localException3.getMessage() });
            bgB();
            GMTrace.o(15263374245888L, 113721);
            return;
          }
          try
          {
            w.i("MicroMsg.SightPlayController", "soundplayer seek %f", new Object[] { Double.valueOf(this.oSu) });
            this.oSK.seekTo((int)(this.oSu * 1000.0D));
            GMTrace.o(15263374245888L, 113721);
            return;
          }
          catch (Exception localException4)
          {
            w.printErrStackTrace("MicroMsg.SightPlayController", localException4, "seek sound error: %s", new Object[] { localException4.getMessage() });
          }
        }
      }
    }
  }
  
  private final class j
    implements Runnable
  {
    public j()
    {
      GMTrace.i(15262032068608L, 113711);
      GMTrace.o(15262032068608L, 113711);
    }
    
    public final void run()
    {
      GMTrace.i(15262166286336L, 113712);
      if ((a.this.oRU < 0) || (a.this.oSa == null) || (a.this.oSa.get() == null))
      {
        GMTrace.o(15262166286336L, 113712);
        return;
      }
      String str = SightVideoJNI.getVideoInfo(a.this.oRU);
      ((TextView)a.this.oSa.get()).setText(str);
      GMTrace.o(15262166286336L, 113712);
    }
  }
  
  private final class k
    implements Runnable
  {
    WeakReference<Bitmap> oSM;
    
    public k()
    {
      GMTrace.i(15259616149504L, 113693);
      this.oSM = new WeakReference(null);
      GMTrace.o(15259616149504L, 113693);
    }
    
    public final void run()
    {
      boolean bool6 = true;
      boolean bool5 = true;
      GMTrace.i(15259750367232L, 113694);
      boolean bool2;
      label75:
      label88:
      label101:
      final Bitmap localBitmap;
      try
      {
        if ((a.this.mSurface != null) && (a.this.mSurface.isValid())) {
          break label735;
        }
        i = a.this.hashCode();
        j = hashCode();
        boolean bool3;
        boolean bool4;
        final View localView1;
        if (a.this.mSurface == null)
        {
          bool1 = true;
          if (a.this.oRZ != null) {
            break label279;
          }
          bool2 = true;
          if (this.oSM.get() != null) {
            break label285;
          }
          bool3 = true;
          if (a.this.oRX != null) {
            break label291;
          }
          bool4 = true;
          w.w("MicroMsg.SightPlayController", "#0x%x-#0x%x want draw thumb, but surface status error, surface null ? %B, thumb bgView null ? %B, thumb null ? %B, mask null ? %B", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4) });
          if (a.this.oRX != null) {
            break label365;
          }
          localBitmap = (Bitmap)this.oSM.get();
          if (a.this.oRZ == null) {
            break label297;
          }
          localView1 = (View)a.this.oRZ.get();
          label205:
          if ((localView1 != null) && (localBitmap != null) && (!localBitmap.isRecycled())) {
            break label314;
          }
          if (localView1 != null) {
            break label303;
          }
          bool1 = true;
          label230:
          if (localBitmap != null) {
            break label308;
          }
        }
        label279:
        label285:
        label291:
        label297:
        label303:
        label308:
        for (bool2 = bool5;; bool2 = false)
        {
          w.e("MicroMsg.SightPlayController", "bgView:%B, thumb:%B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
          GMTrace.o(15259750367232L, 113694);
          return;
          bool1 = false;
          break;
          bool2 = false;
          break label75;
          bool3 = false;
          break label88;
          bool4 = false;
          break label101;
          localView1 = null;
          break label205;
          bool1 = false;
          break label230;
        }
        label314:
        localView1.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(15262837374976L, 113717);
            localView1.setBackgroundDrawable(new BitmapDrawable(localBitmap));
            GMTrace.o(15262837374976L, 113717);
          }
        });
        GMTrace.o(15259750367232L, 113694);
        return;
      }
      catch (Exception localException1)
      {
        w.printErrStackTrace("MicroMsg.SightPlayController", localException1, "", new Object[0]);
        GMTrace.o(15259750367232L, 113694);
        return;
      }
      label365:
      if ((a.this.oRY != null) && (a.this.oRY.getWidth() == a.this.oRX.getWidth()))
      {
        i = a.this.oRY.getHeight();
        j = a.this.oRX.getHeight();
        if (i == j) {
          break label458;
        }
      }
      label458:
      label520:
      final View localView2;
      try
      {
        a.this.oRY = Bitmap.createBitmap(a.this.oRX.getWidth(), a.this.oRX.getHeight(), Bitmap.Config.ARGB_8888);
        if ((a.this.oRY == null) || (this.oSM.get() == null) || (((Bitmap)this.oSM.get()).isRecycled()))
        {
          if (a.this.oRY != null) {
            break label906;
          }
          bool1 = true;
          if (this.oSM.get() != null) {
            break label911;
          }
          bool2 = bool6;
          w.e("MicroMsg.SightPlayController", "mThubmBgBmp:%B, thumbRef:%B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
          GMTrace.o(15259750367232L, 113694);
          return;
        }
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.SightPlayController", localException2, "try to create thumb bmp error:%s", new Object[] { localException2.getMessage() });
          a.this.oRY = null;
        }
        long l = System.nanoTime();
        SightVideoJNI.handleThumb((Bitmap)this.oSM.get(), a.this.oRY, a.this.oRX);
        w.i("MicroMsg.SightPlayController", "handle thumb use %d us", new Object[] { Long.valueOf((System.nanoTime() - l) / 1000L) });
        localBitmap = a.this.oRY;
        if (a.this.oRZ != null) {}
        for (localView2 = (View)a.this.oRZ.get(); (localView2 == null) || (localBitmap == null); localView2 = null)
        {
          GMTrace.o(15259750367232L, 113694);
          return;
        }
        localView2.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(15260958326784L, 113703);
            localView2.setBackgroundDrawable(new BitmapDrawable(localBitmap));
            GMTrace.o(15260958326784L, 113703);
          }
        });
        GMTrace.o(15259750367232L, 113694);
        return;
      }
      label735:
      int i = a.this.hashCode();
      int j = hashCode();
      if (this.oSM.get() == null) {}
      for (boolean bool1 = true;; bool1 = false)
      {
        w.d("MicroMsg.SightPlayController", "#0x%x-#0x%x draw thumb, thumb empty ? %B", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(bool1) });
        if (a.this.oRZ != null)
        {
          localView2 = (View)a.this.oRZ.get();
          if (localView2 != null) {
            localView2.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(15264716423168L, 113731);
                w.v("MicroMsg.SightPlayController", "set background drawable null");
                localView2.setBackgroundDrawable(null);
                GMTrace.o(15264716423168L, 113731);
              }
            });
          }
        }
        if (this.oSM.get() == null)
        {
          SightVideoJNI.drawSurfaceColor(a.this.mSurface, 0);
          GMTrace.o(15259750367232L, 113694);
          return;
        }
        SightVideoJNI.drawSurfaceThumb(a.this.mSurface, (Bitmap)this.oSM.get(), a.this.oRX);
        GMTrace.o(15259750367232L, 113694);
        return;
        label906:
        bool1 = false;
        break;
        label911:
        bool2 = false;
        break label520;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\widget\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */