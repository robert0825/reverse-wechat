package com.tencent.mm.ui.chatting.gallery;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.k.e;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.q;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;

public final class l
{
  public String filename;
  long gAP;
  int hJt;
  int hak;
  int hal;
  com.tencent.mm.plugin.a.f ham;
  public int han;
  int hao;
  boolean haq;
  int har;
  private int has;
  public boolean hat;
  boolean hau;
  String mediaId;
  HashMap<String, Integer> pUV;
  int pUX;
  public int pUY;
  long pUZ;
  public long pVa;
  private long pVb;
  private int pVc;
  public i wOq;
  a wOr;
  
  public l(i parami)
  {
    GMTrace.i(2411355701248L, 17966);
    this.hak = 0;
    this.hal = 0;
    this.har = 0;
    this.pUV = new HashMap();
    this.pUY = 0;
    this.hat = false;
    this.hau = false;
    this.wOq = parami;
    reset();
    this.ham = new com.tencent.mm.plugin.a.f();
    this.wOr = new a();
    parami = com.tencent.mm.k.g.ut().getValue("AndroidOnlineVideoArgs");
    if (!bg.nm(parami))
    {
      w.i("MicroMsg.OnlineVideoUIHelper", "online video config : " + parami);
      parami = parami.split(";");
      if ((parami != null) && (parami.length >= 4))
      {
        this.wOr.haA = bg.getInt(parami[0], 5);
        this.wOr.haB = bg.getInt(parami[1], 1);
        this.wOr.pVf = bg.getInt(parami[2], 75);
        this.wOr.wOt = (bg.getInt(parami[3], 1) * 1048576);
      }
    }
    for (int i = 1;; i = 0)
    {
      if (i == 0)
      {
        this.wOr.haA = 5;
        this.wOr.haB = 1;
        this.wOr.pVf = 75;
        this.wOr.wOt = 1048576;
      }
      w.i("MicroMsg.OnlineVideoUIHelper", "parseConfig preload[%d] downloadSec[%d], needFinish[%d], minStreamSize[%d]", new Object[] { Integer.valueOf(this.wOr.haA), Integer.valueOf(this.wOr.haB), Integer.valueOf(this.wOr.pVf), Integer.valueOf(this.wOr.wOt) });
      this.has = this.wOr.haA;
      GMTrace.o(2411355701248L, 17966);
      return;
    }
  }
  
  private boolean a(int paramInt, PInt paramPInt1, PInt paramPInt2)
  {
    GMTrace.i(2412429443072L, 17974);
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
      paramPInt2.value = (this.has + paramInt + 2 + this.wOr.haB);
    }
    if (paramPInt2.value >= this.han + 1) {
      paramPInt2.value = (this.han + 1);
    }
    if (paramPInt2.value <= paramPInt1.value)
    {
      paramPInt1.value += this.wOr.haB;
      GMTrace.o(2412429443072L, 17974);
      return false;
    }
    w.i("MicroMsg.OnlineVideoUIHelper", "calcDownloadRange range[%d, %d] playTime[%d] playStatus[%d] cache[%d, %d]", new Object[] { Integer.valueOf(paramPInt1.value), Integer.valueOf(paramPInt2.value), Integer.valueOf(paramInt), Integer.valueOf(this.hal), Integer.valueOf(this.har), Integer.valueOf(this.has) });
    GMTrace.o(2412429443072L, 17974);
    return true;
  }
  
  private boolean f(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(2412563660800L, 17975);
    PInt localPInt1 = new PInt();
    PInt localPInt2 = new PInt();
    boolean bool2 = false;
    boolean bool1 = bool2;
    try
    {
      if (this.ham.a(paramInt1, paramInt2, localPInt1, localPInt2)) {
        bool1 = o.Ni().isVideoDataAvailable(this.mediaId, localPInt1.value, localPInt2.value);
      }
      if (!bool1) {
        if (!this.pUV.containsKey(this.mediaId + 0 + "_-1"))
        {
          String str = this.mediaId + localPInt1.value + "_" + localPInt2.value;
          w.i("MicroMsg.OnlineVideoUIHelper", "request video data [%d, %d] isRequestNow[%b] isSeek[%b]", new Object[] { Integer.valueOf(localPInt1.value), Integer.valueOf(localPInt2.value), Boolean.valueOf(this.hau), Boolean.valueOf(paramBoolean) });
          if ((!this.pUV.containsKey(str)) && ((!this.hau) || (paramBoolean)))
          {
            this.hau = true;
            o.Ni();
            com.tencent.mm.modelcdntran.f.e(this.mediaId, localPInt1.value, localPInt2.value);
            this.pUV.put(str, Integer.valueOf(paramInt2));
          }
        }
        else
        {
          GMTrace.o(2412563660800L, 17975);
          return bool1;
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.OnlineVideoUIHelper", localException, "", new Object[0]);
        w.e("MicroMsg.OnlineVideoUIHelper", "check video data error: " + localException.toString());
        bool1 = bool2;
        continue;
        w.i("MicroMsg.OnlineVideoUIHelper", "already request video : " + localException);
        continue;
        w.i("MicroMsg.OnlineVideoUIHelper", "already had video data.");
      }
    }
  }
  
  public final boolean Ja(String paramString)
  {
    GMTrace.i(2411758354432L, 17969);
    boolean bool = bg.eW(paramString, this.mediaId);
    GMTrace.o(2411758354432L, 17969);
    return bool;
  }
  
  public final boolean ag(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(2412026789888L, 17971);
    switch (this.hak)
    {
    }
    for (paramBoolean = true;; paramBoolean = false)
    {
      w.i("MicroMsg.OnlineVideoUIHelper", "seek video time %d, download status %d playStatus %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.hak), Integer.valueOf(this.hal) });
      com.tencent.mm.plugin.report.service.g.ork.a(354L, 4L, 1L, false);
      GMTrace.o(2412026789888L, 17971);
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
        this.wOq.B(paramInt, paramBoolean);
        break;
      }
      this.hao = paramInt;
      this.haq = true;
      this.wOq.MT();
    }
  }
  
  final void bnZ()
  {
    GMTrace.i(2411892572160L, 17970);
    w.i("MicroMsg.OnlineVideoUIHelper", "play offline video %s ", new Object[] { this.filename });
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2440615165952L, 18184);
        if (l.this.wOq != null) {
          l.this.wOq.az(l.this.filename, false);
        }
        GMTrace.o(2440615165952L, 18184);
      }
    });
    GMTrace.o(2411892572160L, 17970);
  }
  
  public final void cfW()
  {
    GMTrace.i(2411624136704L, 17968);
    w.i("MicroMsg.OnlineVideoUIHelper", "stop stream download video.");
    int i;
    if (this.hak == 3)
    {
      i = 1;
      this.hak = 0;
      if (!bg.nm(this.mediaId))
      {
        if (i == 0) {
          break label94;
        }
        cfY();
      }
    }
    for (;;)
    {
      o.Ni().b(this.mediaId, cfZ());
      com.tencent.mm.plugin.report.service.g.ork.a(354L, 2L, 1L, false);
      GMTrace.o(2411624136704L, 17968);
      return;
      i = 0;
      break;
      label94:
      if (this.pUX >= this.wOr.pVf)
      {
        w.i("MicroMsg.OnlineVideoUIHelper", "start complete video, downloaded (%d) more than config (%d).", new Object[] { Integer.valueOf(this.pUX), Integer.valueOf(this.wOr.pVf) });
        t.O(this.filename, 2);
        com.tencent.mm.plugin.report.service.g.ork.a(354L, 10L, 1L, false);
      }
    }
  }
  
  public final void cfX()
  {
    GMTrace.i(2412697878528L, 17976);
    String str = this.mediaId + 0 + "_-1";
    if (!this.pUV.containsKey(str))
    {
      w.i("MicroMsg.OnlineVideoUIHelper", "request all data. [%s]", new Object[] { this.mediaId });
      o.Ni();
      com.tencent.mm.modelcdntran.f.e(this.mediaId, 0, -1);
      this.pUV.put(str, Integer.valueOf(0));
      com.tencent.mm.plugin.report.service.g.ork.a(354L, 24L, 1L, false);
      w.w("MicroMsg.OnlineVideoUIHelper", "%d rpt request all video %s ", new Object[] { Integer.valueOf(hashCode()), this.filename });
      com.tencent.mm.plugin.report.service.g.ork.i(13836, new Object[] { Integer.valueOf(303), Long.valueOf(bg.Pu()), "" });
    }
    this.hal = 5;
    GMTrace.o(2412697878528L, 17976);
  }
  
  final void cfY()
  {
    GMTrace.i(17604399857664L, 131163);
    o.Nh();
    boolean bool;
    if (q.me(s.mk(this.filename)))
    {
      w.i("MicroMsg.OnlineVideoUIHelper", "download finish and is hevc need complete %s ", new Object[] { this.filename });
      r localr = t.mw(this.filename);
      if (localr == null) {
        break label167;
      }
      localr.videoFormat = 2;
      localr.status = 123;
      localr.hcu = bg.Pu();
      localr.hct = bg.Pu();
      localr.gAU = 16;
      localr.eQl = 268438786;
      bool = o.Nh().b(localr);
      w.i("MicroMsg.VideoLogic", "set hevc video Completion ret: " + bool + " status: " + localr.status);
    }
    for (;;)
    {
      if (bool) {
        com.tencent.mm.plugin.report.service.g.ork.a(354L, 134L, 1L, false);
      }
      GMTrace.o(17604399857664L, 131163);
      return;
      label167:
      bool = false;
    }
  }
  
  final Object[] cfZ()
  {
    int j = 0;
    GMTrace.i(2412832096256L, 17977);
    Object[] arrayOfObject = new Object[7];
    i locali = this.wOq;
    if (locali.pUO < 0) {
      locali.pUO = 0;
    }
    w.i("MicroMsg.Imagegallery.handler.video", "get[%s] play video duration [%d]", new Object[] { locali.filename, Integer.valueOf(locali.pUO) });
    arrayOfObject[0] = Integer.valueOf(locali.pUO);
    if (this.pVa <= 0L) {
      this.pVa = bg.Pv();
    }
    int k = (int)(this.pVa - this.gAP);
    int i = k;
    if (k <= 0) {
      i = 0;
    }
    arrayOfObject[1] = Integer.valueOf(i);
    if (this.pUZ <= 0L) {
      this.pUZ = bg.Pv();
    }
    k = (int)(this.pUZ - this.gAP);
    i = k;
    if (k <= 0) {
      i = 0;
    }
    arrayOfObject[2] = Integer.valueOf(i);
    arrayOfObject[3] = Integer.valueOf(this.pUY);
    if (this.pUY > 0)
    {
      if (this.pVc == 0) {
        this.pVc = ((int)(this.pVc + bg.aH(this.pVb)));
      }
      arrayOfObject[4] = Integer.valueOf(this.pVc / this.pUY);
      locali = this.wOq;
      if ((locali.pUI <= 0L) || (locali.pUH <= 0L)) {
        break label321;
      }
    }
    label321:
    for (i = (int)(locali.pUI - locali.pUH);; i = 0)
    {
      if (i < 0) {
        i = j;
      }
      for (;;)
      {
        arrayOfObject[5] = Integer.valueOf(i);
        arrayOfObject[6] = Integer.valueOf(this.wOq.lhm);
        GMTrace.o(2412832096256L, 17977);
        return arrayOfObject;
        arrayOfObject[4] = Integer.valueOf(0);
        break;
      }
    }
  }
  
  public final boolean hm(int paramInt)
  {
    boolean bool3 = false;
    boolean bool2 = true;
    GMTrace.i(2412161007616L, 17972);
    if (this.hao != -1) {}
    for (int i = this.hao;; i = paramInt)
    {
      w.i("MicroMsg.OnlineVideoUIHelper", "check timer playCurrPos %d playTime %d cachePlayTime %d timeDuration %d downloadStatus %d firPlayWait{%d} isPrepareVideo[%b]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), Integer.valueOf(this.har), Integer.valueOf(this.han), Integer.valueOf(this.hak), Long.valueOf(this.pVa - this.gAP), Boolean.valueOf(this.hat) });
      boolean bool1 = bool2;
      switch (this.hak)
      {
      default: 
        bool1 = bool2;
      }
      for (;;)
      {
        GMTrace.o(2412161007616L, 17972);
        return bool1;
        if (!hn(i))
        {
          this.haq = true;
          if (this.har <= 0) {
            if (this.hao == -1)
            {
              this.hal = 1;
              label191:
              bool1 = false;
            }
          }
        }
        for (;;)
        {
          this.wOq.Dz(i);
          PInt localPInt1 = new PInt();
          PInt localPInt2 = new PInt();
          if (!a(i, localPInt1, localPInt2)) {
            break label685;
          }
          if (!f(localPInt1.value, localPInt2.value, false)) {
            break label693;
          }
          this.har = Math.max(this.har, localPInt2.value);
          bool1 = bool2;
          break;
          this.hal = 2;
          break label191;
          w.i("MicroMsg.OnlineVideoUIHelper", "pause by load data pauseByLoadDataCount : " + this.pUY + " playStatus : " + this.hal);
          this.pVb = bg.Pv();
          if ((this.hal != 2) && (this.hal != 4))
          {
            this.has += this.wOr.haA;
            this.has = Math.min(this.has, 60);
            this.pUY += 1;
            this.hal = 4;
          }
          this.wOq.MT();
          break label191;
          if ((this.pUY == 0) && (this.pVa == 0L)) {
            this.pVa = bg.Pv();
          }
          if (this.hat)
          {
            this.wOq.Wt(this.filename);
            if (this.haq) {
              if ((this.pUY == 0) && (this.pVa == 0L))
              {
                this.pVa = bg.Pv();
                label465:
                w.i("MicroMsg.OnlineVideoUIHelper", "resume by data gain.pauseByLoadDataCount %d pauseAllTime %d", new Object[] { Integer.valueOf(this.pUY), Integer.valueOf(this.pVc) });
                if (this.hao == -1) {
                  break label571;
                }
                this.wOq.B(this.hao, true);
                this.hao = -1;
                bool1 = false;
                label524:
                this.haq = bool1;
                paramInt = 3;
              }
            }
            for (;;)
            {
              this.hal = paramInt;
              label571:
              do
              {
                bool1 = true;
                break;
                if (this.pVb <= 0L) {
                  break label465;
                }
                this.pVc = ((int)(this.pVc + bg.aH(this.pVb)));
                break label465;
                if (this.wOq.bnQ())
                {
                  bool1 = false;
                  break label524;
                }
                bool1 = true;
                break label524;
              } while (this.hal == 3);
              w.i("MicroMsg.OnlineVideoUIHelper", "start to play video playStatus[%d]", new Object[] { Integer.valueOf(this.hal) });
              if (this.wOq.bnQ()) {
                paramInt = 3;
              } else {
                paramInt = this.hal;
              }
            }
          }
          w.i("MicroMsg.OnlineVideoUIHelper", "prepare video [%s]", new Object[] { this.filename });
          this.wOq.az(this.filename, true);
          this.hat = true;
          bool1 = true;
        }
        label685:
        w.d("MicroMsg.OnlineVideoUIHelper", "can not calc download.");
        label693:
        continue;
        if (this.hat)
        {
          if (this.haq)
          {
            if (this.hao == -1) {
              break label757;
            }
            this.wOq.B(this.hao, true);
            this.hao = -1;
            bool1 = bool3;
          }
          for (;;)
          {
            this.haq = bool1;
            this.wOq.Dz(i);
            bool1 = bool2;
            break;
            label757:
            if (this.wOq.bnQ()) {
              bool1 = bool3;
            } else {
              bool1 = true;
            }
          }
        }
        this.wOq.az(this.filename, false);
        this.hat = true;
        bool1 = bool2;
      }
    }
  }
  
  /* Error */
  public final boolean hn(int paramInt)
  {
    // Byte code:
    //   0: ldc2_w 508
    //   3: sipush 17973
    //   6: invokestatic 56	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: getfield 58	com/tencent/mm/ui/chatting/gallery/l:hak	I
    //   13: iconst_3
    //   14: if_icmpne +14 -> 28
    //   17: ldc2_w 508
    //   20: sipush 17973
    //   23: invokestatic 169	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   26: iconst_1
    //   27: ireturn
    //   28: aload_0
    //   29: getfield 62	com/tencent/mm/ui/chatting/gallery/l:har	I
    //   32: iload_1
    //   33: isub
    //   34: iconst_2
    //   35: if_icmpgt +25 -> 60
    //   38: aload_0
    //   39: getfield 62	com/tencent/mm/ui/chatting/gallery/l:har	I
    //   42: aload_0
    //   43: getfield 186	com/tencent/mm/ui/chatting/gallery/l:han	I
    //   46: if_icmpge +14 -> 60
    //   49: ldc2_w 508
    //   52: sipush 17973
    //   55: invokestatic 169	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   58: iconst_0
    //   59: ireturn
    //   60: new 181	com/tencent/mm/pointers/PInt
    //   63: dup
    //   64: invokespecial 195	com/tencent/mm/pointers/PInt:<init>	()V
    //   67: astore 4
    //   69: new 181	com/tencent/mm/pointers/PInt
    //   72: dup
    //   73: invokespecial 195	com/tencent/mm/pointers/PInt:<init>	()V
    //   76: astore 5
    //   78: aload_0
    //   79: getfield 83	com/tencent/mm/ui/chatting/gallery/l:ham	Lcom/tencent/mm/plugin/a/f;
    //   82: iload_1
    //   83: iload_1
    //   84: iconst_2
    //   85: iadd
    //   86: aload 4
    //   88: aload 5
    //   90: invokevirtual 198	com/tencent/mm/plugin/a/f:a	(IILcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;)Z
    //   93: ifeq +100 -> 193
    //   96: invokestatic 204	com/tencent/mm/modelvideo/o:Ni	()Lcom/tencent/mm/modelcdntran/f;
    //   99: aload_0
    //   100: getfield 206	com/tencent/mm/ui/chatting/gallery/l:mediaId	Ljava/lang/String;
    //   103: aload 4
    //   105: getfield 184	com/tencent/mm/pointers/PInt:value	I
    //   108: aload 5
    //   110: getfield 184	com/tencent/mm/pointers/PInt:value	I
    //   113: invokevirtual 212	com/tencent/mm/modelcdntran/f:isVideoDataAvailable	(Ljava/lang/String;II)Z
    //   116: istore_2
    //   117: iload_2
    //   118: istore_3
    //   119: iload_2
    //   120: ifne +10 -> 130
    //   123: aload_0
    //   124: iload_1
    //   125: putfield 62	com/tencent/mm/ui/chatting/gallery/l:har	I
    //   128: iload_2
    //   129: istore_3
    //   130: ldc2_w 508
    //   133: sipush 17973
    //   136: invokestatic 169	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   139: iload_3
    //   140: ireturn
    //   141: astore 4
    //   143: iconst_0
    //   144: istore_2
    //   145: ldc 108
    //   147: aload 4
    //   149: ldc -15
    //   151: iconst_0
    //   152: anewarray 4	java/lang/Object
    //   155: invokestatic 245	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   158: ldc 108
    //   160: new 110	java/lang/StringBuilder
    //   163: dup
    //   164: ldc -9
    //   166: invokespecial 115	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   169: aload 4
    //   171: invokevirtual 248	java/lang/Exception:toString	()Ljava/lang/String;
    //   174: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   180: invokestatic 250	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   183: iload_2
    //   184: istore_3
    //   185: goto -55 -> 130
    //   188: astore 4
    //   190: goto -45 -> 145
    //   193: iconst_0
    //   194: istore_3
    //   195: goto -65 -> 130
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	198	0	this	l
    //   0	198	1	paramInt	int
    //   116	68	2	bool1	boolean
    //   118	77	3	bool2	boolean
    //   67	37	4	localPInt1	PInt
    //   141	29	4	localException1	Exception
    //   188	1	4	localException2	Exception
    //   76	33	5	localPInt2	PInt
    // Exception table:
    //   from	to	target	type
    //   78	117	141	java/lang/Exception
    //   123	128	188	java/lang/Exception
  }
  
  public final boolean isStreaming()
  {
    GMTrace.i(16136192131072L, 120224);
    if ((!bg.nm(this.mediaId)) && ((this.hak == 1) || (this.hak == 3)))
    {
      GMTrace.o(16136192131072L, 120224);
      return true;
    }
    GMTrace.o(16136192131072L, 120224);
    return false;
  }
  
  public final void reset()
  {
    GMTrace.i(2411489918976L, 17967);
    this.mediaId = "";
    this.filename = "";
    this.hao = -1;
    this.pUX = 0;
    this.hJt = 0;
    this.har = 0;
    this.han = 0;
    this.pUY = 0;
    this.hal = 0;
    this.hak = 0;
    this.haq = false;
    this.hat = false;
    this.hau = false;
    this.pUV.clear();
    if (this.wOr != null) {
      this.has = this.wOr.haA;
    }
    this.pUZ = 0L;
    this.gAP = 0L;
    this.pVc = 0;
    this.pVb = 0L;
    this.pVa = 0L;
    GMTrace.o(2411489918976L, 17967);
  }
  
  private static final class a
  {
    int haA;
    int haB;
    int pVf;
    int wOt;
    
    public a()
    {
      GMTrace.i(2426656522240L, 18080);
      GMTrace.o(2426656522240L, 18080);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\gallery\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */