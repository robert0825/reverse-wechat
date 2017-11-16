package com.tencent.mm.modelvideo;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.pluginsdk.ui.CommonVideoView;
import com.tencent.mm.pluginsdk.ui.h.a;
import com.tencent.mm.pluginsdk.ui.h.d;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.o;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class MMVideoView
  extends CommonVideoView
  implements b.a
{
  public String haf;
  public b hag;
  private String hah;
  private String hai;
  public h.a haj;
  private int hak;
  private int hal;
  private com.tencent.mm.plugin.a.f ham;
  private int han;
  private int hao;
  private boolean hap;
  private boolean haq;
  private int har;
  private int has;
  private boolean hat;
  private boolean hau;
  private boolean hav;
  private a haw;
  private boolean hax;
  private aj hay;
  
  public MMVideoView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(17448438857728L, 130001);
    this.hak = 0;
    this.hal = 0;
    this.har = 0;
    this.hat = false;
    this.hau = false;
    this.hav = false;
    this.hax = false;
    this.hay = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(16387581935616L, 122097);
        if (MMVideoView.a(MMVideoView.this) == null)
        {
          GMTrace.o(16387581935616L, 122097);
          return false;
        }
        boolean bool2 = MMVideoView.b(MMVideoView.this).isPlaying();
        if (bool2) {
          MMVideoView.c(MMVideoView.this);
        }
        try
        {
          int i = MMVideoView.d(MMVideoView.this).getCurrentPosition() / 1000;
          MMVideoView.a(MMVideoView.this, i);
          bool1 = MMVideoView.b(MMVideoView.this, i);
          if ((bool1) && (bool2))
          {
            GMTrace.o(16387581935616L, 122097);
            return true;
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e(MMVideoView.e(MMVideoView.this), "%s online video timer check error [%s] ", new Object[] { MMVideoView.f(MMVideoView.this), localException.toString() });
            boolean bool1 = false;
          }
          GMTrace.o(16387581935616L, 122097);
        }
        return false;
      }
    }, true);
    GMTrace.o(17448438857728L, 130001);
  }
  
  public MMVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(16386508193792L, 122089);
    this.hak = 0;
    this.hal = 0;
    this.har = 0;
    this.hat = false;
    this.hau = false;
    this.hav = false;
    this.hax = false;
    this.hay = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(16387581935616L, 122097);
        if (MMVideoView.a(MMVideoView.this) == null)
        {
          GMTrace.o(16387581935616L, 122097);
          return false;
        }
        boolean bool2 = MMVideoView.b(MMVideoView.this).isPlaying();
        if (bool2) {
          MMVideoView.c(MMVideoView.this);
        }
        try
        {
          int i = MMVideoView.d(MMVideoView.this).getCurrentPosition() / 1000;
          MMVideoView.a(MMVideoView.this, i);
          bool1 = MMVideoView.b(MMVideoView.this, i);
          if ((bool1) && (bool2))
          {
            GMTrace.o(16387581935616L, 122097);
            return true;
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e(MMVideoView.e(MMVideoView.this), "%s online video timer check error [%s] ", new Object[] { MMVideoView.f(MMVideoView.this), localException.toString() });
            boolean bool1 = false;
          }
          GMTrace.o(16387581935616L, 122097);
        }
        return false;
      }
    }, true);
    GMTrace.o(16386508193792L, 122089);
  }
  
  public MMVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(16386642411520L, 122090);
    this.hak = 0;
    this.hal = 0;
    this.har = 0;
    this.hat = false;
    this.hau = false;
    this.hav = false;
    this.hax = false;
    this.hay = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(16387581935616L, 122097);
        if (MMVideoView.a(MMVideoView.this) == null)
        {
          GMTrace.o(16387581935616L, 122097);
          return false;
        }
        boolean bool2 = MMVideoView.b(MMVideoView.this).isPlaying();
        if (bool2) {
          MMVideoView.c(MMVideoView.this);
        }
        try
        {
          int i = MMVideoView.d(MMVideoView.this).getCurrentPosition() / 1000;
          MMVideoView.a(MMVideoView.this, i);
          bool1 = MMVideoView.b(MMVideoView.this, i);
          if ((bool1) && (bool2))
          {
            GMTrace.o(16387581935616L, 122097);
            return true;
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e(MMVideoView.e(MMVideoView.this), "%s online video timer check error [%s] ", new Object[] { MMVideoView.f(MMVideoView.this), localException.toString() });
            boolean bool1 = false;
          }
          GMTrace.o(16387581935616L, 122097);
        }
        return false;
      }
    }, true);
    GMTrace.o(16386642411520L, 122090);
  }
  
  private void MQ()
  {
    GMTrace.i(17448975728640L, 130005);
    if (this.jGP != null)
    {
      this.hat = true;
      this.jGP.setVideoPath(this.hai);
    }
    GMTrace.o(17448975728640L, 130005);
  }
  
  private void MT()
  {
    GMTrace.i(17450452123648L, 130016);
    w.i(this.TAG, "%s pauseByDataBlock ", new Object[] { aiH() });
    abq();
    pause();
    GMTrace.o(17450452123648L, 130016);
  }
  
  private boolean a(int paramInt, PInt paramPInt1, PInt paramPInt2)
  {
    GMTrace.i(17450317905920L, 130015);
    paramPInt1.value = Math.max(paramInt, this.har);
    if (this.hal == 1)
    {
      paramPInt1.value = paramInt;
      paramPInt1.value += this.has;
    }
    if (this.hal == 2)
    {
      paramPInt1.value = (paramInt - 8);
      if (paramPInt1.value < 0) {
        paramPInt1.value = 0;
      }
      paramPInt2.value = (paramPInt1.value + this.has + 8);
    }
    if ((this.hal == 3) || (this.hal == 4))
    {
      paramPInt1.value = this.har;
      paramPInt2.value = (this.has + paramInt + 1 + this.haw.haB);
    }
    if (paramPInt2.value >= this.han + 1) {
      paramPInt2.value = (this.han + 1);
    }
    if (paramPInt2.value < paramPInt1.value)
    {
      paramPInt1.value += this.haw.haB;
      GMTrace.o(17450317905920L, 130015);
      return false;
    }
    w.i(this.TAG, "%s calcDownloadRange range[%d, %d] playTime[%d] playStatus[%d] cache[%d, %d] [%s]", new Object[] { aiH(), Integer.valueOf(paramPInt1.value), Integer.valueOf(paramPInt2.value), Integer.valueOf(paramInt), Integer.valueOf(this.hal), Integer.valueOf(this.har), Integer.valueOf(this.has), this.hah });
    GMTrace.o(17450317905920L, 130015);
    return true;
  }
  
  private boolean f(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(17450586341376L, 130017);
    PInt localPInt1 = new PInt();
    PInt localPInt2 = new PInt();
    boolean bool2 = false;
    boolean bool1 = bool2;
    try
    {
      if (this.ham.a(paramInt1, paramInt2, localPInt1, localPInt2)) {
        bool1 = this.hag.ba(localPInt1.value, localPInt2.value);
      }
      if (!bool1)
      {
        String str = this.hah + "_" + localPInt1.value + "_" + localPInt2.value;
        if ((!this.hau) || (paramBoolean))
        {
          this.hau = true;
          this.hag.g(this.hah, localPInt1.value, localPInt2.value);
          GMTrace.o(17450586341376L, 130017);
          return bool1;
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e(this.TAG, "%s check video data error[%s] ", new Object[] { aiH(), localException.toString() });
        bool1 = bool2;
        continue;
        w.i(this.TAG, "%s already request video [%s] isRequestNow[%b] isSeek[%b] ", new Object[] { aiH(), localException, Boolean.valueOf(this.hau), Boolean.valueOf(paramBoolean) });
        continue;
        w.i(this.TAG, "%s already had video data.", new Object[] { aiH() });
      }
    }
  }
  
  private boolean hm(int paramInt)
  {
    boolean bool2 = true;
    boolean bool1 = false;
    GMTrace.i(17449781035008L, 130011);
    if (this.hao != -1) {}
    for (int i = this.hao;; i = paramInt)
    {
      w.i(this.TAG, "%s check timer playCurrPos %d playTime %d cachePlayTime %d timeDuration %d playStatus %d downloadStatus %d cdnMediaId %s isPrepareVideo[%b]", new Object[] { aiH(), Integer.valueOf(paramInt), Integer.valueOf(i), Integer.valueOf(this.har), Integer.valueOf(this.han), Integer.valueOf(this.hal), Integer.valueOf(this.hak), this.hah, Boolean.valueOf(this.hat) });
      switch (this.hak)
      {
      default: 
        w.w(this.TAG, "%s check time default.", new Object[] { aiH() });
        bool1 = false;
      }
      for (;;)
      {
        GMTrace.o(17449781035008L, 130011);
        return bool1;
        if (!hn(i))
        {
          this.haq = true;
          if (this.har <= 0) {
            if (this.hao == -1)
            {
              this.hal = 1;
              label219:
              bool1 = false;
            }
          }
        }
        for (;;)
        {
          oV(i);
          PInt localPInt1 = new PInt();
          PInt localPInt2 = new PInt();
          if (!a(i, localPInt1, localPInt2)) {
            break label620;
          }
          if (!f(localPInt1.value, localPInt2.value, false)) {
            break label641;
          }
          this.har = Math.max(this.har, localPInt2.value);
          bool1 = bool2;
          break;
          this.hal = 2;
          break label219;
          w.i(this.TAG, "%s pause by load data cdnMediaId %s, playStatus %d", new Object[] { aiH(), this.hah, Integer.valueOf(this.hal) });
          bKE();
          if ((this.hal != 2) && (this.hal != 4))
          {
            this.has += this.haw.haA;
            this.has = Math.min(this.has, 60);
            bKG();
            this.hal = 4;
          }
          MT();
          break label219;
          if (this.hat)
          {
            oV(i);
            if (this.haq)
            {
              bKF();
              bKH();
              w.i(this.TAG, "%s resume by data gain cdnMediaId %s", new Object[] { aiH(), this.hah });
              if (this.hao != -1)
              {
                o(this.hao, this.hap);
                this.hao = -1;
                bool1 = false;
                label490:
                this.haq = bool1;
                paramInt = 3;
              }
            }
            for (;;)
            {
              this.hal = paramInt;
              do
              {
                bool1 = true;
                break;
                if (play())
                {
                  bool1 = false;
                  break label490;
                }
                bool1 = true;
                break label490;
              } while (this.hal == 3);
              w.i(this.TAG, "%s start to play video playStatus[%d]", new Object[] { aiH(), Integer.valueOf(this.hal) });
              if (play()) {
                paramInt = 3;
              } else {
                paramInt = this.hal;
              }
            }
          }
          w.i(this.TAG, "%s prepare cdnMediaId [%s]", new Object[] { aiH(), this.hah });
          MQ();
          bool1 = true;
        }
        label620:
        w.d(this.TAG, "%s can not calc download.", new Object[] { aiH() });
        label641:
        continue;
        if (this.hat)
        {
          if (this.haq)
          {
            if (this.hao == -1) {
              break label697;
            }
            o(this.hao, true);
            this.hao = -1;
          }
          for (;;)
          {
            this.haq = bool1;
            oV(i);
            bool1 = bool2;
            break;
            label697:
            if (!play()) {
              bool1 = true;
            }
          }
        }
        MQ();
        bool1 = bool2;
        continue;
        w.w(this.TAG, "%s download error.", new Object[] { aiH() });
        bool1 = false;
      }
    }
  }
  
  /* Error */
  private boolean hn(int paramInt)
  {
    // Byte code:
    //   0: ldc2_w 336
    //   3: ldc_w 338
    //   6: invokestatic 52	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: getfield 54	com/tencent/mm/modelvideo/MMVideoView:hak	I
    //   13: iconst_3
    //   14: if_icmpne +14 -> 28
    //   17: ldc2_w 336
    //   20: ldc_w 338
    //   23: invokestatic 79	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   26: iconst_1
    //   27: ireturn
    //   28: aload_0
    //   29: getfield 58	com/tencent/mm/modelvideo/MMVideoView:har	I
    //   32: iload_1
    //   33: isub
    //   34: iconst_1
    //   35: if_icmpgt +25 -> 60
    //   38: aload_0
    //   39: getfield 58	com/tencent/mm/modelvideo/MMVideoView:har	I
    //   42: aload_0
    //   43: getfield 172	com/tencent/mm/modelvideo/MMVideoView:han	I
    //   46: if_icmpge +14 -> 60
    //   49: ldc2_w 336
    //   52: ldc_w 338
    //   55: invokestatic 79	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   58: iconst_0
    //   59: ireturn
    //   60: new 160	com/tencent/mm/pointers/PInt
    //   63: dup
    //   64: invokespecial 222	com/tencent/mm/pointers/PInt:<init>	()V
    //   67: astore 4
    //   69: new 160	com/tencent/mm/pointers/PInt
    //   72: dup
    //   73: invokespecial 222	com/tencent/mm/pointers/PInt:<init>	()V
    //   76: astore 5
    //   78: aload_0
    //   79: getfield 224	com/tencent/mm/modelvideo/MMVideoView:ham	Lcom/tencent/mm/plugin/a/f;
    //   82: iload_1
    //   83: iload_1
    //   84: iconst_1
    //   85: iadd
    //   86: aload 4
    //   88: aload 5
    //   90: invokevirtual 229	com/tencent/mm/plugin/a/f:a	(IILcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;)Z
    //   93: ifeq +90 -> 183
    //   96: aload_0
    //   97: getfield 231	com/tencent/mm/modelvideo/MMVideoView:hag	Lcom/tencent/mm/modelvideo/b;
    //   100: aload 4
    //   102: getfield 163	com/tencent/mm/pointers/PInt:value	I
    //   105: aload 5
    //   107: getfield 163	com/tencent/mm/pointers/PInt:value	I
    //   110: invokeinterface 237 3 0
    //   115: istore_2
    //   116: iload_2
    //   117: istore_3
    //   118: iload_2
    //   119: ifne +10 -> 129
    //   122: aload_0
    //   123: iload_1
    //   124: putfield 58	com/tencent/mm/modelvideo/MMVideoView:har	I
    //   127: iload_2
    //   128: istore_3
    //   129: ldc2_w 336
    //   132: ldc_w 338
    //   135: invokestatic 79	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   138: iload_3
    //   139: ireturn
    //   140: astore 4
    //   142: iconst_0
    //   143: istore_2
    //   144: aload_0
    //   145: getfield 116	com/tencent/mm/modelvideo/MMVideoView:TAG	Ljava/lang/String;
    //   148: ldc_w 340
    //   151: iconst_2
    //   152: anewarray 120	java/lang/Object
    //   155: dup
    //   156: iconst_0
    //   157: aload_0
    //   158: invokevirtual 124	com/tencent/mm/modelvideo/MMVideoView:aiH	()Ljava/lang/String;
    //   161: aastore
    //   162: dup
    //   163: iconst_1
    //   164: aload 4
    //   166: invokevirtual 259	java/lang/Exception:toString	()Ljava/lang/String;
    //   169: aastore
    //   170: invokestatic 261	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   173: iload_2
    //   174: istore_3
    //   175: goto -46 -> 129
    //   178: astore 4
    //   180: goto -36 -> 144
    //   183: iconst_0
    //   184: istore_3
    //   185: goto -56 -> 129
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	188	0	this	MMVideoView
    //   0	188	1	paramInt	int
    //   115	59	2	bool1	boolean
    //   117	68	3	bool2	boolean
    //   67	34	4	localPInt1	PInt
    //   140	25	4	localException1	Exception
    //   178	1	4	localException2	Exception
    //   76	30	5	localPInt2	PInt
    // Exception table:
    //   from	to	target	type
    //   78	116	140	java/lang/Exception
    //   122	127	178	java/lang/Exception
  }
  
  private void reset()
  {
    GMTrace.i(17448707293184L, 130003);
    this.hao = -1;
    this.har = 0;
    this.han = 0;
    this.hal = 0;
    this.hak = 0;
    this.haq = false;
    this.hat = false;
    this.hau = false;
    if (this.haw != null) {
      this.has = this.haw.haA;
    }
    GMTrace.o(17448707293184L, 130003);
  }
  
  public final void A(String paramString, int paramInt)
  {
    boolean bool = false;
    GMTrace.i(17451123212288L, 130021);
    if ((!bg.eW(this.hah, paramString)) || (this.hak == 3))
    {
      GMTrace.o(17451123212288L, 130021);
      return;
    }
    w.i(this.TAG, "%s download finish [%d]", new Object[] { aiH(), Integer.valueOf(paramInt) });
    if (paramInt == 0) {
      this.hak = 3;
    }
    if (this.haj != null)
    {
      paramString = this.haj;
      String str = this.hai;
      if (this.hal > 0) {
        bool = true;
      }
      paramString.O(str, bool);
    }
    bF(true);
    GMTrace.o(17451123212288L, 130021);
  }
  
  protected final void MP()
  {
    GMTrace.i(17448573075456L, 130002);
    super.MP();
    this.TAG = "MicroMsg.MMVideoView";
    this.ham = new com.tencent.mm.plugin.a.f();
    this.haw = new a();
    this.haw.haA = 5;
    this.haw.haB = 2;
    reset();
    GMTrace.o(17448573075456L, 130002);
  }
  
  public final void MR()
  {
    GMTrace.i(17449109946368L, 130006);
    super.MR();
    if (this.hax)
    {
      this.hav = true;
      stop();
    }
    GMTrace.o(17449109946368L, 130006);
  }
  
  public final void MS()
  {
    GMTrace.i(17449244164096L, 130007);
    super.MS();
    w.i(this.TAG, "%s onUIResume stopDownloadByUiPause[%b] currTimeOnUiPause[%d] isPlayOnUiPause[%b]", new Object[] { aiH(), Boolean.valueOf(this.hav), Integer.valueOf(this.tsq), Boolean.valueOf(this.tsr) });
    if (this.hav)
    {
      o(this.tsq, this.tsr);
      GMTrace.o(17449244164096L, 130007);
      return;
    }
    if ((this.jGP != null) && (d.et(24)) && ((this.jGP instanceof VideoPlayerTextureView)))
    {
      ((VideoPlayerTextureView)this.jGP).aOJ();
      GMTrace.o(17449244164096L, 130007);
      return;
    }
    GMTrace.o(17449244164096L, 130007);
  }
  
  public final int MU()
  {
    GMTrace.i(17451525865472L, 130024);
    if (this.hak == 3)
    {
      i = XG();
      GMTrace.o(17451525865472L, 130024);
      return i;
    }
    int i = this.har;
    GMTrace.o(17451525865472L, 130024);
    return i;
  }
  
  public final void MV()
  {
    GMTrace.i(17451660083200L, 130025);
    GMTrace.o(17451660083200L, 130025);
  }
  
  protected final int MW()
  {
    GMTrace.i(17451794300928L, 130026);
    GMTrace.o(17451794300928L, 130026);
    return 100;
  }
  
  public final void a(h.d paramd)
  {
    GMTrace.i(17449646817280L, 130010);
    if ((this.jGP instanceof VideoPlayerTextureView))
    {
      VideoPlayerTextureView localVideoPlayerTextureView = (VideoPlayerTextureView)this.jGP;
      localVideoPlayerTextureView.tHx.a(paramd);
      localVideoPlayerTextureView.requestLayout();
      ex(114L);
    }
    GMTrace.o(17449646817280L, 130010);
  }
  
  public final void b(boolean paramBoolean, String paramString, int paramInt)
  {
    GMTrace.i(17448841510912L, 130004);
    super.b(paramBoolean, paramString, paramInt);
    this.hah = ("MMVideo_" + paramString.hashCode());
    StringBuilder localStringBuilder = new StringBuilder();
    if (!bg.nm(this.haf)) {}
    for (String str = this.haf;; str = com.tencent.mm.compatible.util.e.ghz + "appbrandvideo/")
    {
      this.hai = (str + "MMVideo_" + paramString.hashCode() + ".mp4");
      com.tencent.mm.a.e.bf(this.hai);
      w.i(this.TAG, "%s set video path [%s %s]", new Object[] { aiH(), this.hah, this.hai });
      GMTrace.o(17448841510912L, 130004);
      return;
    }
  }
  
  public final void bE(boolean paramBoolean)
  {
    GMTrace.i(17450049470464L, 130013);
    super.bE(paramBoolean);
    aJR();
    GMTrace.o(17450049470464L, 130013);
  }
  
  protected final void bF(boolean paramBoolean)
  {
    GMTrace.i(17451257430016L, 130022);
    this.hay.stopTimer();
    this.hay.z(500L, 500L);
    GMTrace.o(17451257430016L, 130022);
  }
  
  protected final com.tencent.mm.pluginsdk.ui.tools.f bu(Context paramContext)
  {
    GMTrace.i(16386910846976L, 122092);
    this.tss = 1;
    paramContext = new VideoPlayerTextureView(paramContext);
    paramContext.fT(true);
    GMTrace.o(16386910846976L, 122092);
    return paramContext;
  }
  
  public final void f(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(17450988994560L, 130020);
    if (!bg.eW(this.hah, paramString))
    {
      GMTrace.o(17450988994560L, 130020);
      return;
    }
    w.d(this.TAG, "%s download  onProgress [%d, %d]", new Object[] { aiH(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    GMTrace.o(17450988994560L, 130020);
  }
  
  public final void hl(int paramInt)
  {
    GMTrace.i(17450720559104L, 130018);
    w.i(this.TAG, "%s deal moov ready moovPos %d, timeDuration %d, cdnMediaId %s", new Object[] { aiH(), Integer.valueOf(paramInt), Integer.valueOf(this.han), this.hah });
    if (this.han != 0)
    {
      w.w(this.TAG, "moov had callback, do nothing.");
      GMTrace.o(17450720559104L, 130018);
      return;
    }
    bKD();
    try
    {
      if (this.ham == null)
      {
        w.w(this.TAG, "%s parser is null, thread is error.", new Object[] { aiH() });
        GMTrace.o(17450720559104L, 130018);
        return;
      }
      if (!this.ham.n(this.hai, paramInt)) {
        break label278;
      }
      this.han = this.ham.hnp;
      w.i(this.TAG, "%s mp4 parse moov success. duration %d cdnMediaId %s ", new Object[] { aiH(), Integer.valueOf(this.han), this.hah });
      if (hm(0)) {
        MQ();
      }
      if (this.hao == -1)
      {
        this.hal = 1;
        GMTrace.o(17450720559104L, 130018);
        return;
      }
    }
    catch (Exception localException)
    {
      w.printErrStackTrace(this.TAG, localException, "%s deal moov ready error [%s]", new Object[] { aiH(), this.hah });
      GMTrace.o(17450720559104L, 130018);
      return;
    }
    this.hal = 2;
    GMTrace.o(17450720559104L, 130018);
    return;
    label278:
    w.w(this.TAG, "%s mp4 parse moov error. cdnMediaId %s", new Object[] { aiH(), this.hah });
    this.hag.g(this.hah, 0, -1);
    GMTrace.o(17450720559104L, 130018);
  }
  
  public final boolean o(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(17449915252736L, 130012);
    switch (this.hak)
    {
    }
    for (;;)
    {
      paramBoolean = true;
      for (;;)
      {
        w.i(this.TAG, "%s seek video time %d, download status %d playStatus %d", new Object[] { aiH(), Integer.valueOf(paramInt), Integer.valueOf(this.hak), Integer.valueOf(this.hal) });
        GMTrace.o(17449915252736L, 130012);
        return paramBoolean;
        this.hal = 2;
        PInt localPInt1 = new PInt();
        PInt localPInt2 = new PInt();
        a(paramInt, localPInt1, localPInt2);
        if (f(localPInt1.value, localPInt2.value, true))
        {
          this.hao = -1;
          this.haq = false;
          this.har = localPInt2.value;
          this.hal = 3;
          super.o(paramInt, paramBoolean);
          paramBoolean = true;
        }
        else
        {
          this.hao = paramInt;
          this.hap = paramBoolean;
          this.haq = true;
          MT();
          paramBoolean = false;
          continue;
          super.o(paramInt, paramBoolean);
          paramBoolean = true;
          continue;
          paramBoolean = true;
        }
      }
      if (!isPrepared())
      {
        this.tst = this.tsr;
        this.tsu = this.tsq;
        start();
      }
    }
  }
  
  public final void onCompletion()
  {
    GMTrace.i(17449378381824L, 130008);
    super.onCompletion();
    this.hag.lY(this.hah);
    reset();
    if (this.jGP != null) {
      this.jGP.stop();
    }
    GMTrace.o(17449378381824L, 130008);
  }
  
  public final void onDataAvailable(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(17450854776832L, 130019);
    this.hau = false;
    if ((paramInt1 < 0) || (paramInt2 < 0))
    {
      w.w(this.TAG, "%s deal data available error offset[%d], length[%d]", new Object[] { aiH(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      GMTrace.o(17450854776832L, 130019);
      return;
    }
    if (!bg.eW(this.hah, paramString))
    {
      GMTrace.o(17450854776832L, 130019);
      return;
    }
    try
    {
      this.har = this.ham.bi(paramInt1, paramInt2);
      w.i(this.TAG, "%s deal data available. offset[%d] length[%d] cachePlayTime[%d]", new Object[] { aiH(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(this.har) });
      bF(true);
      GMTrace.o(17450854776832L, 130019);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.e(this.TAG, "%s deal data available file pos to video time error[%s] ", new Object[] { aiH(), paramString.toString() });
      }
    }
  }
  
  public final void start()
  {
    GMTrace.i(16386776629248L, 122091);
    w.i(this.TAG, "%s start cdnMediaId[%s] ", new Object[] { aiH(), this.hah });
    if (this.jGP != null)
    {
      if (!bg.nm(this.jGP.NE())) {
        break label125;
      }
      abq();
      this.hax = true;
      this.hak = 1;
      this.hag.n(this.hah, this.hai, this.url);
      this.hag.a(this);
      boa();
    }
    for (;;)
    {
      ex(101L);
      GMTrace.o(16386776629248L, 122091);
      return;
      label125:
      play();
    }
  }
  
  public final void stop()
  {
    GMTrace.i(17449512599552L, 130009);
    this.hag.lY(this.hah);
    reset();
    super.stop();
    GMTrace.o(17449512599552L, 130009);
  }
  
  protected final void stopTimer()
  {
    GMTrace.i(17451391647744L, 130023);
    this.hay.stopTimer();
    GMTrace.o(17451391647744L, 130023);
  }
  
  private static final class a
  {
    int haA;
    int haB;
    
    public a()
    {
      GMTrace.i(17454210220032L, 130044);
      GMTrace.o(17454210220032L, 130044);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\modelvideo\MMVideoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */