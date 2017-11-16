package com.tencent.mm.plugin.sight.decode.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.NinePatchDrawable;
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
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.memory.o.b;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class b
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
  public g oSA;
  public WeakReference<TextView> oSa;
  public long oSb;
  public WeakReference<View> oSc;
  public Animation oSd;
  public Animation oSe;
  private volatile h oSf;
  public volatile b oSg;
  public volatile i oSh;
  public volatile c oSi;
  private k oSj;
  public j oSk;
  private d oSl;
  public boolean oSm;
  public boolean oSn;
  public boolean oSo;
  public boolean oSq;
  public double oSr;
  boolean oSs;
  public double oSu;
  public boolean oSv;
  public boolean oSw;
  private a oSx;
  public e oSy;
  public f oSz;
  public int position;
  
  static
  {
    GMTrace.i(9235924516864L, 68813);
    oSp = new HashMap();
    oSt = new ConcurrentHashMap();
    GMTrace.o(9235924516864L, 68813);
  }
  
  public b(int paramInt, View paramView)
  {
    GMTrace.i(9226931929088L, 68746);
    this.gSY = false;
    this.oRQ = 0;
    this.oRR = 0;
    this.oRS = "";
    this.oRT = "";
    this.oRU = -1;
    this.oRV = 41;
    this.oSm = true;
    this.oSn = true;
    this.oSo = false;
    this.oSq = false;
    this.isLoop = true;
    this.oSr = -1.0D;
    this.oSs = false;
    this.oSu = -1.0D;
    this.oSv = false;
    this.oSw = false;
    this.oRR = paramInt;
    this.krX = new ae(Looper.getMainLooper());
    this.oSc = new WeakReference(paramView);
    w.i("MicroMsg.SightPlayController", "new SightPlayController, drawType %d", new Object[] { Integer.valueOf(paramInt) });
    GMTrace.o(9226931929088L, 68746);
  }
  
  public static boolean GC(String paramString)
  {
    GMTrace.i(9228005670912L, 68754);
    if (bg.nm(paramString))
    {
      GMTrace.o(9228005670912L, 68754);
      return false;
    }
    paramString = (Integer)oSt.get(paramString);
    if ((paramString != null) && (2 == paramString.intValue()))
    {
      GMTrace.o(9228005670912L, 68754);
      return false;
    }
    GMTrace.o(9228005670912L, 68754);
    return true;
  }
  
  public static Bitmap a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(9226663493632L, 68744);
    String str = String.format("%s-%s-%s-%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    Object localObject = (WeakReference)oSp.get(str);
    if ((localObject != null) && (((WeakReference)localObject).get() != null))
    {
      paramContext = (Bitmap)((WeakReference)localObject).get();
      GMTrace.o(9226663493632L, 68744);
      return paramContext;
    }
    if (paramContext == null)
    {
      w.w("MicroMsg.SightPlayController", "get mask bmp, but context is null");
      GMTrace.o(9226663493632L, 68744);
      return null;
    }
    if (paramInt1 <= 0)
    {
      w.w("MicroMsg.SightPlayController", "get mask bmp, but mask id error");
      GMTrace.o(9226663493632L, 68744);
      return null;
    }
    if ((paramInt2 <= 0) || (paramInt4 <= 0) || (paramInt3 <= 0))
    {
      w.w("MicroMsg.SightPlayController", "get mask bmp, but size error");
      GMTrace.o(9226663493632L, 68744);
      return null;
    }
    long l = bg.Pw();
    paramInt3 = paramInt2 * paramInt4 / paramInt3;
    paramContext = (NinePatchDrawable)paramContext.getResources().getDrawable(paramInt1);
    paramContext.setBounds(0, 0, paramInt2, paramInt3);
    localObject = Bitmap.createBitmap(paramInt2, paramInt3, Bitmap.Config.ARGB_8888);
    paramContext.draw(new Canvas((Bitmap)localObject));
    oSp.put(str, new WeakReference(localObject));
    w.d("MicroMsg.SightPlayController", "create mask bmp use %dms", new Object[] { Long.valueOf(bg.aI(l)) });
    GMTrace.o(9226663493632L, 68744);
    return (Bitmap)localObject;
  }
  
  public static void ye()
  {
    GMTrace.i(9226797711360L, 68745);
    com.tencent.mm.modelvideo.o.d(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9219684171776L, 68692);
        long l = System.currentTimeMillis();
        try
        {
          SightVideoJNI.freeAll();
          w.i("MicroMsg.SightPlayController", "free all, use %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
          GMTrace.o(9219684171776L, 68692);
          return;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e("MicroMsg.SightPlayController", "free all sight error");
            w.printErrStackTrace("MicroMsg.SightPlayController", localException, "", new Object[0]);
          }
        }
      }
    }, 0L);
    GMTrace.o(9226797711360L, 68745);
  }
  
  public final void E(Bitmap paramBitmap)
  {
    boolean bool = true;
    GMTrace.i(9228810977280L, 68760);
    if (paramBitmap == null) {}
    for (;;)
    {
      w.v("MicroMsg.SightPlayController", "draw surface thumb, thumb is null ? %B", new Object[] { Boolean.valueOf(bool) });
      com.tencent.mm.modelvideo.o.g(this.oSj);
      if (this.oSj == null) {
        this.oSj = new k();
      }
      this.oSj.oSM = new WeakReference(paramBitmap);
      com.tencent.mm.modelvideo.o.d(this.oSj, 0L);
      GMTrace.o(9228810977280L, 68760);
      return;
      bool = false;
    }
  }
  
  public abstract void F(Bitmap paramBitmap);
  
  public final void a(Surface paramSurface)
  {
    GMTrace.i(9228542541824L, 68758);
    w.v("MicroMsg.SightPlayController", "set play surface %s", new Object[] { paramSurface });
    this.mSurface = paramSurface;
    com.tencent.mm.modelvideo.o.d(this.oSj, 0L);
    GMTrace.o(9228542541824L, 68758);
  }
  
  public final void ar(String paramString, boolean paramBoolean)
  {
    GMTrace.i(9227871453184L, 68753);
    w.i("MicroMsg.SightPlayController", "#0x%x data: set video[%s], old path[%s], fling[%B], last video id %d, recording %B, canPlay %B", new Object[] { Integer.valueOf(hashCode()), paramString, this.oRS, Boolean.valueOf(paramBoolean), Integer.valueOf(this.oRU), Boolean.valueOf(this.oSw), Boolean.valueOf(this.oSn) });
    if (this.oSw)
    {
      hs(false);
      GMTrace.o(9227871453184L, 68753);
      return;
    }
    if (bgs())
    {
      w.e("MicroMsg.SightPlayController", "is bad fps, do nothing when set video path");
      clear();
      GMTrace.o(9227871453184L, 68753);
      return;
    }
    if (!this.oSn)
    {
      clear();
      GMTrace.o(9227871453184L, 68753);
      return;
    }
    if (paramBoolean)
    {
      this.oRT = paramString;
      hs(false);
      GMTrace.o(9227871453184L, 68753);
      return;
    }
    if (this.oRS.equals(paramString))
    {
      this.oRT = "ERROR#PATH";
      hs(false);
      restart();
      GMTrace.o(9227871453184L, 68753);
      return;
    }
    clear();
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    this.oRS = str;
    if (bg.nm(this.oRS))
    {
      w.w("MicroMsg.SightPlayController", "empty video path, do draw empty thumb and return");
      E(null);
      GMTrace.o(9227871453184L, 68753);
      return;
    }
    if (!GC(this.oRS))
    {
      w.w("MicroMsg.SightPlayController", "Check Sight Fail!!! return");
      clear();
      GMTrace.o(9227871453184L, 68753);
      return;
    }
    this.oSf = new h();
    com.tencent.mm.modelvideo.o.d(this.oSf, 0L);
    GMTrace.o(9227871453184L, 68753);
  }
  
  public int bgq()
  {
    GMTrace.i(9227066146816L, 68747);
    GMTrace.o(9227066146816L, 68747);
    return -1;
  }
  
  public final boolean bgr()
  {
    GMTrace.i(9227334582272L, 68749);
    if (1 == this.oRR)
    {
      if ((this.oSg != null) && (!this.oSg.mZM))
      {
        GMTrace.o(9227334582272L, 68749);
        return true;
      }
      GMTrace.o(9227334582272L, 68749);
      return false;
    }
    if ((this.oSi != null) && (!this.oSi.mZM) && (this.oSg != null) && (!this.oSg.mZM))
    {
      GMTrace.o(9227334582272L, 68749);
      return true;
    }
    GMTrace.o(9227334582272L, 68749);
    return false;
  }
  
  public final boolean bgs()
  {
    GMTrace.i(9228139888640L, 68755);
    if (this.oSq)
    {
      GMTrace.o(9228139888640L, 68755);
      return false;
    }
    if (Build.VERSION.SDK_INT >= 11)
    {
      if (this.oRQ >= 3)
      {
        w.v("MicroMsg.SightPlayController", "match not check bad fps, but now is bad fps");
        this.oRQ = 0;
      }
      GMTrace.o(9228139888640L, 68755);
      return false;
    }
    if (this.oRQ >= 3)
    {
      GMTrace.o(9228139888640L, 68755);
      return true;
    }
    GMTrace.o(9228139888640L, 68755);
    return false;
  }
  
  protected final void bgt()
  {
    GMTrace.i(9228408324096L, 68757);
    int i = Math.max(1, (int)SightVideoJNI.getVideoRate(this.oRU));
    this.oRV = (1000 / i);
    w.d("MicroMsg.SightPlayController", "#0x%x update video rate to %d fps, delay %d ms", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(this.oRV) });
    GMTrace.o(9228408324096L, 68757);
  }
  
  public final void bgu()
  {
    GMTrace.i(16048547954688L, 119571);
    if ((this.oSc == null) || (-1 == bgq()) || (!this.oSm))
    {
      GMTrace.o(16048547954688L, 119571);
      return;
    }
    if ((this.oSd == null) && (this.oSc.get() != null)) {
      this.oSd = AnimationUtils.loadAnimation(((View)this.oSc.get()).getContext(), bgq());
    }
    if (this.oSl == null) {
      this.oSl = new d();
    }
    this.krX.post(this.oSl);
    GMTrace.o(16048547954688L, 119571);
  }
  
  public final c bgv()
  {
    GMTrace.i(9229079412736L, 68762);
    if (this.oSx == null) {
      this.oSx = new a(this);
    }
    a locala = this.oSx;
    GMTrace.o(9229079412736L, 68762);
    return locala;
  }
  
  public final double bgw()
  {
    GMTrace.i(9229213630464L, 68763);
    if (this.oRU == -1)
    {
      GMTrace.o(9229213630464L, 68763);
      return 0.0D;
    }
    double d = SightVideoJNI.getVideoDuration(this.oRU);
    GMTrace.o(9229213630464L, 68763);
    return d;
  }
  
  public abstract void bs(int paramInt1, int paramInt2);
  
  public final void clear()
  {
    GMTrace.i(9227603017728L, 68751);
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
    GMTrace.o(9227603017728L, 68751);
  }
  
  public final void h(TextView paramTextView)
  {
    GMTrace.i(9228676759552L, 68759);
    this.oSa = new WeakReference(paramTextView);
    GMTrace.o(9228676759552L, 68759);
  }
  
  public final void hs(boolean paramBoolean)
  {
    GMTrace.i(9227200364544L, 68748);
    if (this.oSf != null)
    {
      com.tencent.mm.modelvideo.o.g(this.oSf);
      this.oSf.mZM = true;
    }
    if (this.oSi != null)
    {
      this.krX.removeCallbacks(this.oSi);
      this.oSi.mZM = true;
    }
    if (this.oSg != null)
    {
      com.tencent.mm.modelvideo.o.g(this.oSg);
      this.oSg.mZM = true;
    }
    i locali;
    if (this.oSh != null)
    {
      locali = this.oSh;
      if (!paramBoolean) {
        break label123;
      }
    }
    label123:
    for (int i = 0;; i = 2)
    {
      locali.type = i;
      com.tencent.mm.modelvideo.o.d(this.oSh, 0L);
      GMTrace.o(9227200364544L, 68748);
      return;
    }
  }
  
  public final void restart()
  {
    GMTrace.i(9227468800000L, 68750);
    w.i("MicroMsg.SightPlayController", "#0x%x restart, canPlay %B, videoPath %s, videoId %d", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(this.oSn), this.oRS, Integer.valueOf(this.oRU) });
    if (!this.oSn)
    {
      clear();
      GMTrace.o(9227468800000L, 68750);
      return;
    }
    if (bgr())
    {
      w.w("MicroMsg.SightPlayController", "#0x%x is runing, do nothing when restart request asked, videoPath %s", new Object[] { Integer.valueOf(hashCode()), this.oRS });
      GMTrace.o(9227468800000L, 68750);
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
      GMTrace.o(9227468800000L, 68750);
      return;
    }
    if (this.oRU < 0)
    {
      w.w("MicroMsg.SightPlayController", "#0x%x restart match error video id, try reopen video, videoPath %s", new Object[] { Integer.valueOf(hashCode()), this.oRS });
      if (bg.nm(this.oRS))
      {
        GMTrace.o(9227468800000L, 68750);
        return;
      }
      if (!GC(this.oRS))
      {
        w.w("MicroMsg.SightPlayController", "Check Sight Fail!!! return");
        clear();
        GMTrace.o(9227468800000L, 68750);
        return;
      }
      this.oSf = new h();
      com.tencent.mm.modelvideo.o.d(this.oSf, 0L);
      GMTrace.o(9227468800000L, 68750);
      return;
    }
    if (1 == this.oRR)
    {
      this.oSg = new b();
      this.oSi = null;
      com.tencent.mm.modelvideo.o.d(this.oSg, 0L);
      GMTrace.o(9227468800000L, 68750);
      return;
    }
    this.oSg = new b();
    this.oSi = new c();
    this.oSg.oSG = this.oSi;
    this.oSi.oSJ = this.oSg;
    com.tencent.mm.modelvideo.o.d(this.oSg, 0L);
    GMTrace.o(9227468800000L, 68750);
  }
  
  public final void tX(final int paramInt)
  {
    GMTrace.i(9227737235456L, 68752);
    com.tencent.mm.modelvideo.o.d(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9222502744064L, 68713);
        long l = System.currentTimeMillis();
        SightVideoJNI.freeObj(paramInt);
        w.d("MicroMsg.SightPlayController", "#0x%x tick: do clear video %d, use %d ms", new Object[] { Integer.valueOf(b.this.hashCode()), Integer.valueOf(paramInt), Long.valueOf(System.currentTimeMillis() - l) });
        GMTrace.o(9222502744064L, 68713);
      }
    }, 0L);
    GMTrace.o(9227737235456L, 68752);
  }
  
  private static final class a
    extends c<rm>
  {
    int led;
    int oSD;
    int oSE;
    WeakReference<b> oSF;
    
    public a(b paramb)
    {
      super();
      GMTrace.i(9237266694144L, 68823);
      this.oSD = 0;
      this.oSE = 0;
      this.led = 0;
      this.oSF = new WeakReference(paramb);
      this.vhf = rm.class.getName().hashCode();
      GMTrace.o(9237266694144L, 68823);
    }
    
    private void a(rm paramrm)
    {
      GMTrace.i(9237400911872L, 68824);
      this.oSD = paramrm.eWo.eWr;
      this.oSE = paramrm.eWo.eWp;
      this.led = paramrm.eWo.eWq;
      GMTrace.o(9237400911872L, 68824);
    }
    
    private boolean bgx()
    {
      GMTrace.i(9237535129600L, 68825);
      if (this.oSF.get() == null)
      {
        GMTrace.o(9237535129600L, 68825);
        return false;
      }
      int i = ((b)this.oSF.get()).position + this.oSD;
      if ((i < this.oSE) || (i > this.led))
      {
        GMTrace.o(9237535129600L, 68825);
        return false;
      }
      GMTrace.o(9237535129600L, 68825);
      return true;
    }
  }
  
  private final class b
    implements Runnable
  {
    volatile boolean mZM;
    b.c oSG;
    
    public b()
    {
      GMTrace.i(9226260840448L, 68741);
      this.mZM = false;
      GMTrace.o(9226260840448L, 68741);
    }
    
    public final void run()
    {
      GMTrace.i(9226395058176L, 68742);
      if ((b.this.oSA != null) && (b.this.oSA.bgz() != null) && (b.this.oSA.bgz().getVisibility() == 0)) {
        b.this.krX.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(9221965873152L, 68709);
            b.this.oSA.bgz().setVisibility(8);
            GMTrace.o(9221965873152L, 68709);
          }
        });
      }
      if (b.this.oRU < 0)
      {
        w.w("MicroMsg.SightPlayController", "#0x%x-#0x%x error video id, path %s", new Object[] { Integer.valueOf(b.this.hashCode()), Integer.valueOf(hashCode()), b.this.oRS });
        GMTrace.o(9226395058176L, 68742);
        return;
      }
      if (this.mZM)
      {
        w.e("MicroMsg.SightPlayController", "#0x%x-#0x%x match stop decode cmd at beg", new Object[] { Integer.valueOf(b.this.hashCode()), Integer.valueOf(hashCode()) });
        GMTrace.o(9226395058176L, 68742);
        return;
      }
      if (b.this.oSb == 0L)
      {
        if (b.this.oSh != null)
        {
          b.this.oSh.type = 1;
          b.this.oSh.run();
        }
        b.this.oSb = System.currentTimeMillis();
      }
      int j = 0;
      int i = j;
      if (b.this.oSu != -1.0D)
      {
        if (b.this.oSo) {
          break label637;
        }
        i = j;
        if (SightVideoJNI.seekStream(b.this.oSu, b.this.oRU) > 0)
        {
          if (b.this.oSh == null) {
            b.this.oSh = new b.i(b.this);
          }
          b.this.oSh.type = 4;
          b.this.oSh.oSu = b.this.oSu;
          b.this.oSh.run();
          i = 1;
        }
      }
      float f3 = (float)(System.currentTimeMillis() - b.this.oSb);
      float f1;
      label381:
      float f2;
      double d;
      b localb;
      if (i != 0)
      {
        f1 = 0.0F;
        f2 = f1;
        if (b.this.oSo)
        {
          f2 = f1;
          if (b.this.oSv)
          {
            b.this.oSv = false;
            f2 = f1;
            if (b.this.oSh != null)
            {
              d = b.this.oSh.bgC() / 1000.0D;
              f2 = f1;
              if (SightVideoJNI.seekStream(d, b.this.oRU) > 0)
              {
                f2 = 0.0F;
                w.i("MicroMsg.SightPlayController", "seek to " + d + " modify time : 0.0");
              }
            }
          }
        }
        if (b.this.gSY) {
          w.i("MicroMsg.SightPlayController", "#0x%x video %d id passedTime:  %s  seek  %s", new Object[] { Integer.valueOf(b.this.hashCode()), Integer.valueOf(b.this.oRU), Float.valueOf(f3), Float.valueOf(f2) });
        }
        b.this.oSb = System.currentTimeMillis();
        if (f2 < 2.0F) {
          break label828;
        }
        localb = b.this;
      }
      label637:
      label828:
      for (localb.oRQ += 1;; b.this.oRQ = Math.max(0, b.this.oRQ - 1))
      {
        if (!b.this.bgs()) {
          break label851;
        }
        w.e("MicroMsg.SightPlayController", "match tolerate bad seek times %d", new Object[] { Integer.valueOf(b.this.oRQ) });
        b.this.clear();
        GMTrace.o(9226395058176L, 68742);
        return;
        if (b.this.oSh != null)
        {
          b.this.oSh.type = 4;
          b.this.oSh.oSu = b.this.oSu;
          b.this.oSh.run();
          b.this.krX.postDelayed(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(9238206218240L, 68830);
              b.this.oSv = true;
              GMTrace.o(9238206218240L, 68830);
            }
          }, 100L);
          i = j;
          break;
        }
        i = j;
        if (SightVideoJNI.seekStream(b.this.oSu, b.this.oRU) <= 0) {
          break;
        }
        if (b.this.oSh == null) {
          b.this.oSh = new b.i(b.this);
        }
        b.this.oSh.type = 4;
        b.this.oSh.oSu = b.this.oSu;
        b.this.oSh.run();
        i = 1;
        break;
        f1 = f3 / b.this.oRV + 0.5F;
        break label381;
      }
      label851:
      int k = 0;
      j = 0;
      int m = 0;
      if (1 == b.this.oRR) {
        if ((b.this.mSurface != null) && (!b.this.mSurface.isValid()))
        {
          w.e("MicroMsg.SightPlayController", "#0x%x-#0x%x draw surface match error, surface is not valid", new Object[] { Integer.valueOf(b.this.hashCode()), Integer.valueOf(hashCode()) });
          this.mZM = true;
          if (this.oSG == null) {
            break label1415;
          }
          this.oSG.mZM = true;
          i = 0;
          j = m;
          if (b.this.oSh == null) {
            break label2166;
          }
          w.d("MicroMsg.SightPlayController", "voice time is" + b.this.oSh.bgC() / 1000.0D);
        }
      }
      label1415:
      label1743:
      label2166:
      for (;;)
      {
        if (1 == j) {
          b.this.krX.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(9226126622720L, 68740);
              if (b.this.oSy != null) {
                b.this.oSy.a(b.this, 0);
              }
              GMTrace.o(9226126622720L, 68740);
            }
          });
        }
        if (this.mZM)
        {
          w.e("MicroMsg.SightPlayController", "#0x%x-#0x%x match stop decode cmd at end", new Object[] { Integer.valueOf(b.this.hashCode()), Integer.valueOf(hashCode()) });
          if (b.this.oSh != null)
          {
            b.this.oSh.type = 0;
            b.this.oSh.run();
          }
          GMTrace.o(9226395058176L, 68742);
          return;
          i = SightVideoJNI.drawSurfaceFrame(b.this.oRU, b.this.mSurface, (int)f2, b.this.oRX, b.this.isLoop);
          if (b.this.oSz != null)
          {
            d = SightVideoJNI.getVideoPlayTime(b.this.oRU);
            j = (int)d;
            if (j != (int)b.this.oSr) {
              b.this.oSz.a(b.this, j);
            }
            b.this.oSr = d;
          }
          if (i == 0)
          {
            b.this.oSu = -1.0D;
            k = 0;
            j = i;
            i = k;
            break;
          }
          if (1 == i)
          {
            b.this.oSu = -1.0D;
            k = 1;
            b.this.oSb = 0L;
            b.this.bgu();
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
          w.e("MicroMsg.SightPlayController", "#0x%x-#0x%x draw surface match error:%d", new Object[] { Integer.valueOf(b.this.hashCode()), Integer.valueOf(hashCode()), Integer.valueOf(i) });
          this.mZM = true;
          if (this.oSG != null) {
            this.oSG.mZM = true;
          }
          b.this.E(null);
          j = i;
          if (b.this.oSy != null)
          {
            b.this.oSy.a(b.this, -1);
            j = i;
          }
          i = 0;
          break;
          m = SightVideoJNI.drawFrame(b.this.oRU, b.this.oRW, (int)f2, null, false, b.this.isLoop);
          if (b.this.oSz != null)
          {
            d = SightVideoJNI.getVideoPlayTime(b.this.oRU);
            i = (int)d;
            if (i != (int)b.this.oSr) {
              b.this.oSz.a(b.this, i);
            }
            b.this.oSr = d;
            if (b.this.gSY) {
              w.i("MicroMsg.SightPlayController", "#0x%x-#0x%drawFrame ret: %d  time: %f", new Object[] { Integer.valueOf(b.this.hashCode()), Integer.valueOf(hashCode()), Integer.valueOf(m), Double.valueOf(d) });
            }
          }
          for (;;)
          {
            if (m != 0) {
              break label1743;
            }
            b.this.oSu = -1.0D;
            j = m;
            i = k;
            break;
            if (b.this.gSY)
            {
              d = SightVideoJNI.getVideoPlayTime(b.this.oRU);
              if (b.this.gSY) {
                w.i("MicroMsg.SightPlayController", "#0x%x-#0x%drawFrame ret: %d  time: %f", new Object[] { Integer.valueOf(b.this.hashCode()), Integer.valueOf(hashCode()), Integer.valueOf(m), Double.valueOf(d) });
              }
            }
            else if (b.this.gSY)
            {
              w.i("MicroMsg.SightPlayController", "#0x%x-#0x%drawFrame ret: %d", new Object[] { Integer.valueOf(b.this.hashCode()), Integer.valueOf(hashCode()), Integer.valueOf(m) });
            }
          }
          if (1 == m)
          {
            b.this.oSu = -1.0D;
            i = 1;
            b.this.oSb = 0L;
            b.this.bgu();
            j = m;
            continue;
          }
          b.this.oSu = -1.0D;
          w.e("MicroMsg.SightPlayController", "#0x%x-#0x%x draw bitmap match error:%d", new Object[] { Integer.valueOf(b.this.hashCode()), Integer.valueOf(hashCode()), Integer.valueOf(m) });
          this.mZM = true;
          if (this.oSG != null) {
            this.oSG.mZM = true;
          }
          b.this.krX.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(9221697437696L, 68707);
              b.this.F(null);
              GMTrace.o(9221697437696L, 68707);
            }
          });
          j = m;
          i = k;
          if (b.this.oSy == null) {
            continue;
          }
          b.this.oSy.a(b.this, -1);
          j = m;
          i = k;
          continue;
        }
        long l;
        if (1 == b.this.oRR)
        {
          l = b.this.oRV - (System.currentTimeMillis() - b.this.oSb);
          if (b.this.oSb == 0L) {
            com.tencent.mm.modelvideo.o.d(this, b.this.oRV * 5);
          }
        }
        for (;;)
        {
          if (b.this.oSh != null) {
            w.d("MicroMsg.SightPlayController", "voice time is" + b.this.oSh.bgC() / 1000.0D);
          }
          GMTrace.o(9226395058176L, 68742);
          return;
          if (l > 0L)
          {
            com.tencent.mm.modelvideo.o.d(this, l);
          }
          else
          {
            com.tencent.mm.modelvideo.o.d(this, 0L);
            continue;
            if ((i != 0) && (b.this.oSA != null))
            {
              i = b.this.oSA.bgy();
              b.this.krX.post(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(9222234308608L, 68711);
                  if (b.this.oSA != null)
                  {
                    View localView = b.this.oSA.bgz();
                    if (localView != null)
                    {
                      if ((b.this.oSe == null) && (b.this.oSA.bgA() != -1) && (b.this.oSc.get() != null)) {
                        b.this.oSe = AnimationUtils.loadAnimation(((View)b.this.oSc.get()).getContext(), b.this.oSA.bgA());
                      }
                      if (b.this.oSe != null) {
                        localView.startAnimation(b.this.oSe);
                      }
                      localView.setVisibility(0);
                    }
                  }
                  GMTrace.o(9222234308608L, 68711);
                }
              });
              this.oSG.oSI = j;
              b.this.krX.postDelayed(this.oSG, i);
            }
            else
            {
              this.oSG.oSI = j;
              b.this.krX.post(this.oSG);
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
    b.b oSJ;
    
    public c()
    {
      GMTrace.i(9219281518592L, 68689);
      this.mZM = false;
      w.i("MicroMsg.SightPlayController", "make sure drawJob alive");
      GMTrace.o(9219281518592L, 68689);
    }
    
    public final void run()
    {
      GMTrace.i(9219415736320L, 68690);
      if (this.mZM)
      {
        w.e("MicroMsg.SightPlayController", "#0x%x-#0x%x match stop draw", new Object[] { Integer.valueOf(b.this.hashCode()), Integer.valueOf(hashCode()) });
        GMTrace.o(9219415736320L, 68690);
        return;
      }
      b.this.F(b.this.oRW);
      if (b.this.oSb == 0L)
      {
        com.tencent.mm.modelvideo.o.d(this.oSJ, 0L);
        GMTrace.o(9219415736320L, 68690);
        return;
      }
      long l = b.this.oRV - (System.currentTimeMillis() - b.this.oSb);
      if (l > 0L)
      {
        com.tencent.mm.modelvideo.o.d(this.oSJ, l);
        GMTrace.o(9219415736320L, 68690);
        return;
      }
      com.tencent.mm.modelvideo.o.d(this.oSJ, 0L);
      GMTrace.o(9219415736320L, 68690);
    }
  }
  
  private final class d
    implements Runnable
  {
    public d()
    {
      GMTrace.i(9223039614976L, 68717);
      GMTrace.o(9223039614976L, 68717);
    }
    
    public final void run()
    {
      GMTrace.i(9223173832704L, 68718);
      if (b.this.oSc.get() == null)
      {
        GMTrace.o(9223173832704L, 68718);
        return;
      }
      ((View)b.this.oSc.get()).startAnimation(b.this.oSd);
      GMTrace.o(9223173832704L, 68718);
    }
  }
  
  public static abstract interface e
  {
    public abstract void a(b paramb, int paramInt);
  }
  
  public static abstract interface f
  {
    public abstract void a(b paramb, long paramLong);
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
      GMTrace.i(9236729823232L, 68819);
      this.mZM = false;
      GMTrace.o(9236729823232L, 68819);
    }
    
    public final void run()
    {
      GMTrace.i(9236864040960L, 68820);
      if (b.this.bgs())
      {
        w.e("MicroMsg.SightPlayController", "is bad fps, do nothing when open file");
        GMTrace.o(9236864040960L, 68820);
        return;
      }
      b localb = b.this;
      String str = b.this.oRS;
      if (1 == b.this.oRR) {}
      for (int i = 0;; i = 1)
      {
        localb.oRU = SightVideoJNI.openFile(str, i, 1, false);
        if (b.this.oRU >= 0) {
          break;
        }
        w.w("MicroMsg.SightPlayController", "#0x%x-#0x%x error video id %d, path %s", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(b.this.hashCode()), Integer.valueOf(b.this.oRU), b.this.oRS });
        b.this.E(null);
        if (b.this.oSy != null) {
          b.this.oSy.a(b.this, -1);
        }
        GMTrace.o(9236864040960L, 68820);
        return;
      }
      if (((Boolean)h.xy().xh().get(344065, Boolean.valueOf(false))).booleanValue())
      {
        if (b.this.oSk == null) {
          b.this.oSk = new b.j(b.this);
        }
        b.this.krX.removeCallbacks(b.this.oSk);
        b.this.krX.post(b.this.oSk);
      }
      int j = Math.max(1, SightVideoJNI.getVideoWidth(b.this.oRU));
      int k = Math.max(1, SightVideoJNI.getVideoHeight(b.this.oRU));
      if (b.this.oRR == 0)
      {
        if ((j * k >= 1048576) || (j <= 0) || (k <= 0))
        {
          w.e("MicroMsg.SightPlayController", "get error info videoWidth %d height  %d", new Object[] { Integer.valueOf(j), Integer.valueOf(k) });
          GMTrace.o(9236864040960L, 68820);
          return;
        }
        localb = b.this;
        w.d("MicroMsg.SightPlayController", "#0x%x check bmp, video width %d, height %d", new Object[] { Integer.valueOf(localb.hashCode()), Integer.valueOf(j), Integer.valueOf(k) });
        if (localb.oRW != null) {
          break label645;
        }
        localb.oRW = com.tencent.mm.memory.o.gib.a(new o.b(j, k));
        w.j("MicroMsg.SightPlayController", "checkBmp, create new one, videoPath: %s", new Object[] { localb.oRS });
      }
      label645:
      while ((localb.oRW.getWidth() == j) && (localb.oRW.getHeight() == k))
      {
        b.this.bgt();
        if ((Float.compare(j / k, 5.0F) <= 0) && (Float.compare(k / j, 5.0F) <= 0)) {
          break;
        }
        w.w("MicroMsg.SightPlayController", "ERROR Video size %d, %d", new Object[] { Integer.valueOf(j), Integer.valueOf(k) });
        if (!bg.nm(b.this.oRS)) {
          b.oSt.put(b.this.oRS, Integer.valueOf(2));
        }
        b.this.oSb = 0L;
        b.this.tX(b.this.oRU);
        b.this.oRU = -1;
        b.this.oRS = "";
        b.this.oRT = "ERROR#PATH";
        b.this.oRY = null;
        this.mZM = true;
        if (b.this.oSy != null) {
          b.this.oSy.a(b.this, -1);
        }
        GMTrace.o(9236864040960L, 68820);
        return;
      }
      w.w("MicroMsg.SightPlayController", "reset bmp, old value " + localb.oRW.getWidth() + "*" + localb.oRW.getHeight());
      if ((d.et(19)) && (localb.oRW.getAllocationByteCount() >= k * j * 4)) {}
      for (;;)
      {
        try
        {
          w.w("MicroMsg.SightPlayController", "reset bmp, try directly reconfigure");
          localb.oRW.reconfigure(j, k, Bitmap.Config.ARGB_8888);
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
          com.tencent.mm.memory.o.gib.g(localb.oRW);
          localb.oRW = com.tencent.mm.memory.o.gib.a(new o.b(j, k));
        }
        w.j("MicroMsg.SightPlayController", "checkBmp, the origin bmp size not match, create new one, videoPath: %s", new Object[] { localb.oRS });
        break;
        b.this.bs(j, k);
        if (1 == b.this.oRR)
        {
          b.this.oSg = new b.b(b.this);
          b.this.oSi = null;
          if (!this.mZM) {
            com.tencent.mm.modelvideo.o.d(b.this.oSg, 0L);
          }
        }
        for (;;)
        {
          if (this.mZM) {
            w.e("MicroMsg.SightPlayController", "#0x%x-#0x%x open file end, match stop %B", new Object[] { Integer.valueOf(b.this.hashCode()), Integer.valueOf(hashCode()), Boolean.valueOf(this.mZM) });
          }
          GMTrace.o(9236864040960L, 68820);
          return;
          b.this.oSg = new b.b(b.this);
          b.this.oSi = new b.c(b.this);
          b.this.oSg.oSG = b.this.oSi;
          b.this.oSi.oSJ = b.this.oSg;
          if (!this.mZM) {
            com.tencent.mm.modelvideo.o.d(b.this.oSg, 0L);
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
    public int type;
    
    public i()
    {
      GMTrace.i(9236058734592L, 68814);
      this.oSu = -1.0D;
      GMTrace.o(9236058734592L, 68814);
    }
    
    private void bgB()
    {
      GMTrace.i(9236192952320L, 68815);
      w.i("MicroMsg.SightPlayController", "stopPlayer");
      try
      {
        if (this.oSK != null)
        {
          this.oSK.stop();
          this.oSK.release();
          this.oSK = null;
        }
        GMTrace.o(9236192952320L, 68815);
        return;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.SightPlayController", localException, "stop play sound error: %s", new Object[] { localException.getMessage() });
        this.oSK = null;
        GMTrace.o(9236192952320L, 68815);
      }
    }
    
    public final double bgC()
    {
      GMTrace.i(9236327170048L, 68816);
      if (this.oSK == null)
      {
        GMTrace.o(9236327170048L, 68816);
        return 0.0D;
      }
      double d = this.oSK.getCurrentPosition();
      GMTrace.o(9236327170048L, 68816);
      return d;
    }
    
    public final void run()
    {
      GMTrace.i(9236461387776L, 68817);
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
        GMTrace.o(9236461387776L, 68817);
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
        if (!bg.nm(b.this.oRS))
        {
          try
          {
            this.oSK = new i();
            this.oSK.setDisplay(null);
            this.oSK.reset();
            this.oSK.setDataSource(b.this.oRS);
            this.oSK.setAudioStreamType(3);
            this.oSK.setOnErrorListener(new MediaPlayer.OnErrorListener()
            {
              public final boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
              {
                GMTrace.i(9237937782784L, 68828);
                w.e("MicroMsg.SightPlayController", "on error: play %s ERROR!! %d %d", new Object[] { b.this.oRS, Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
                b.this.clear();
                if (b.this.oSy != null) {
                  b.this.oSy.a(b.this, -1);
                }
                GMTrace.o(9237937782784L, 68828);
                return true;
              }
            });
            this.oSK.prepare();
            this.oSK.start();
            GMTrace.o(9236461387776L, 68817);
            return;
          }
          catch (Exception localException1)
          {
            w.printErrStackTrace("MicroMsg.SightPlayController", localException1, "play sound error: %s", new Object[] { localException1.getMessage() });
            w.e("MicroMsg.SightPlayController", "on Exception: play %s ERROR!!", new Object[] { b.this.oRS });
            b.this.clear();
            if (b.this.oSy != null) {
              b.this.oSy.a(b.this, -1);
            }
            GMTrace.o(9236461387776L, 68817);
            return;
          }
          bgB();
          GMTrace.o(9236461387776L, 68817);
          return;
          try
          {
            if ((this.oSK != null) && (this.oSK.isPlaying())) {
              this.oSK.pause();
            }
            GMTrace.o(9236461387776L, 68817);
            return;
          }
          catch (Exception localException2)
          {
            w.printErrStackTrace("MicroMsg.SightPlayController", localException2, "pause sound error: %s", new Object[] { localException2.getMessage() });
            bgB();
            GMTrace.o(9236461387776L, 68817);
            return;
          }
          try
          {
            if (this.oSK != null) {
              this.oSK.start();
            }
            GMTrace.o(9236461387776L, 68817);
            return;
          }
          catch (Exception localException3)
          {
            w.printErrStackTrace("MicroMsg.SightPlayController", localException3, "pause sound error: %s", new Object[] { localException3.getMessage() });
            bgB();
            GMTrace.o(9236461387776L, 68817);
            return;
          }
          try
          {
            w.i("MicroMsg.SightPlayController", "soundplayer seek %f", new Object[] { Double.valueOf(this.oSu) });
            this.oSK.seekTo((int)(this.oSu * 1000.0D));
            GMTrace.o(9236461387776L, 68817);
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
      GMTrace.i(9221160566784L, 68703);
      GMTrace.o(9221160566784L, 68703);
    }
    
    public final void run()
    {
      GMTrace.i(9221294784512L, 68704);
      if ((b.this.oRU < 0) || (b.this.oSa == null) || (b.this.oSa.get() == null))
      {
        GMTrace.o(9221294784512L, 68704);
        return;
      }
      String str = SightVideoJNI.getVideoInfo(b.this.oRU);
      ((TextView)b.this.oSa.get()).setText(str);
      GMTrace.o(9221294784512L, 68704);
    }
  }
  
  private final class k
    implements Runnable
  {
    WeakReference<Bitmap> oSM;
    
    public k()
    {
      GMTrace.i(9220355260416L, 68697);
      this.oSM = new WeakReference(null);
      GMTrace.o(9220355260416L, 68697);
    }
    
    public final void run()
    {
      boolean bool6 = true;
      boolean bool5 = true;
      GMTrace.i(9220489478144L, 68698);
      boolean bool2;
      label75:
      label88:
      label101:
      final Bitmap localBitmap;
      try
      {
        if ((b.this.mSurface != null) && (b.this.mSurface.isValid())) {
          break label735;
        }
        i = b.this.hashCode();
        j = hashCode();
        boolean bool3;
        boolean bool4;
        final View localView1;
        if (b.this.mSurface == null)
        {
          bool1 = true;
          if (b.this.oRZ != null) {
            break label279;
          }
          bool2 = true;
          if (this.oSM.get() != null) {
            break label285;
          }
          bool3 = true;
          if (b.this.oRX != null) {
            break label291;
          }
          bool4 = true;
          w.w("MicroMsg.SightPlayController", "#0x%x-#0x%x want draw thumb, but surface status error, surface null ? %B, thumb bgView null ? %B, thumb null ? %B, mask null ? %B", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4) });
          if (b.this.oRX != null) {
            break label365;
          }
          localBitmap = (Bitmap)this.oSM.get();
          if (b.this.oRZ == null) {
            break label297;
          }
          localView1 = (View)b.this.oRZ.get();
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
          GMTrace.o(9220489478144L, 68698);
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
            GMTrace.i(9219952607232L, 68694);
            localView1.setBackgroundDrawable(new BitmapDrawable(localBitmap));
            GMTrace.o(9219952607232L, 68694);
          }
        });
        GMTrace.o(9220489478144L, 68698);
        return;
      }
      catch (Exception localException1)
      {
        w.printErrStackTrace("MicroMsg.SightPlayController", localException1, "", new Object[0]);
        GMTrace.o(9220489478144L, 68698);
        return;
      }
      label365:
      if ((b.this.oRY != null) && (b.this.oRY.getWidth() == b.this.oRX.getWidth()))
      {
        i = b.this.oRY.getHeight();
        j = b.this.oRX.getHeight();
        if (i == j) {
          break label458;
        }
      }
      label458:
      label520:
      final View localView2;
      try
      {
        b.this.oRY = Bitmap.createBitmap(b.this.oRX.getWidth(), b.this.oRX.getHeight(), Bitmap.Config.ARGB_8888);
        if ((b.this.oRY == null) || (this.oSM.get() == null) || (((Bitmap)this.oSM.get()).isRecycled()))
        {
          if (b.this.oRY != null) {
            break label906;
          }
          bool1 = true;
          if (this.oSM.get() != null) {
            break label911;
          }
          bool2 = bool6;
          w.e("MicroMsg.SightPlayController", "mThubmBgBmp:%B, thumbRef:%B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
          GMTrace.o(9220489478144L, 68698);
          return;
        }
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.SightPlayController", localException2, "try to create thumb bmp error:%s", new Object[] { localException2.getMessage() });
          b.this.oRY = null;
        }
        long l = System.nanoTime();
        SightVideoJNI.handleThumb((Bitmap)this.oSM.get(), b.this.oRY, b.this.oRX);
        w.i("MicroMsg.SightPlayController", "handle thumb use %d us", new Object[] { Long.valueOf((System.nanoTime() - l) / 1000L) });
        localBitmap = b.this.oRY;
        if (b.this.oRZ != null) {}
        for (localView2 = (View)b.this.oRZ.get(); (localView2 == null) || (localBitmap == null); localView2 = null)
        {
          GMTrace.o(9220489478144L, 68698);
          return;
        }
        localView2.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(9219147300864L, 68688);
            localView2.setBackgroundDrawable(new BitmapDrawable(localBitmap));
            GMTrace.o(9219147300864L, 68688);
          }
        });
        GMTrace.o(9220489478144L, 68698);
        return;
      }
      label735:
      int i = b.this.hashCode();
      int j = hashCode();
      if (this.oSM.get() == null) {}
      for (boolean bool1 = true;; bool1 = false)
      {
        w.d("MicroMsg.SightPlayController", "#0x%x-#0x%x draw thumb, thumb empty ? %B", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(bool1) });
        if (b.this.oRZ != null)
        {
          localView2 = (View)b.this.oRZ.get();
          if (localView2 != null) {
            localView2.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(9222905397248L, 68716);
                w.v("MicroMsg.SightPlayController", "set background drawable null");
                localView2.setBackgroundDrawable(null);
                GMTrace.o(9222905397248L, 68716);
              }
            });
          }
        }
        if (this.oSM.get() == null)
        {
          SightVideoJNI.drawSurfaceColor(b.this.mSurface, 0);
          GMTrace.o(9220489478144L, 68698);
          return;
        }
        SightVideoJNI.drawSurfaceThumb(b.this.mSurface, (Bitmap)this.oSM.get(), b.this.oRX);
        GMTrace.o(9220489478144L, 68698);
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\sight\decode\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */