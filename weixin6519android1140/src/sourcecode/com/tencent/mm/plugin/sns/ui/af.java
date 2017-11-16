package com.tencent.mm.plugin.sns.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.k.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.aq;
import com.tencent.mm.plugin.sns.model.aq.5;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;

public final class af
{
  String eEM;
  anu eUs;
  long gAP;
  int gGY;
  String hah;
  public String hai;
  int hak;
  int hal;
  com.tencent.mm.plugin.a.f ham;
  int han;
  int hao;
  boolean haq;
  int har;
  private int has;
  public boolean hat;
  boolean hau;
  int oGI;
  HashMap<String, Integer> pUV;
  public a pUW;
  int pUX;
  private int pUY;
  long pUZ;
  private long pVa;
  private long pVb;
  private int pVc;
  private b pVd;
  int progress;
  
  public af(a parama)
  {
    GMTrace.i(8677981421568L, 64656);
    this.hak = 0;
    this.hal = 0;
    this.pUV = null;
    this.har = 0;
    this.hat = false;
    this.hau = false;
    this.pUY = 0;
    this.pUW = parama;
    this.ham = new com.tencent.mm.plugin.a.f();
    this.pUV = new HashMap();
    this.pVd = new b();
    this.pVd.haA = com.tencent.mm.k.g.ut().getInt("SnsVideoPreloadSec", 5);
    this.pVd.haB = com.tencent.mm.k.g.ut().getInt("SnsVideoDownloadSec", 1);
    this.pVd.pVf = com.tencent.mm.k.g.ut().getInt("SnsVideoFullDownloadPercent", 101);
    w.i("MicroMsg.OnlineVideoViewHelper", "parseConfig preload[%d] downloadSec[%d], needFinish[%d]", new Object[] { Integer.valueOf(this.pVd.haA), Integer.valueOf(this.pVd.haB), Integer.valueOf(this.pVd.pVf) });
    reset();
    GMTrace.o(8677981421568L, 64656);
  }
  
  private boolean dd(int paramInt1, int paramInt2)
  {
    GMTrace.i(15294512758784L, 113953);
    PInt localPInt1 = new PInt();
    PInt localPInt2 = new PInt();
    boolean bool2 = false;
    boolean bool1 = bool2;
    try
    {
      if (this.ham.a(paramInt1, paramInt2, localPInt1, localPInt2))
      {
        localPInt2.value += 81920;
        bool1 = o.Ni().isVideoDataAvailable(this.hah, localPInt1.value, localPInt2.value);
      }
      if (!bool1) {
        if (!this.pUV.containsKey(this.hah + 0 + "_-1"))
        {
          String str = this.hah + localPInt1.value + "_" + localPInt2.value;
          w.i("MicroMsg.OnlineVideoViewHelper", "request video data [%d, %d] isRequestNow[%b] isSeek[%b]", new Object[] { Integer.valueOf(localPInt1.value), Integer.valueOf(localPInt2.value), Boolean.valueOf(this.hau), Boolean.valueOf(false) });
          if ((!this.pUV.containsKey(str)) && (!this.hau))
          {
            this.hau = true;
            o.Ni();
            com.tencent.mm.modelcdntran.f.e(this.hah, localPInt1.value, localPInt2.value);
            this.pUV.put(str, Integer.valueOf(paramInt2));
          }
        }
        else
        {
          GMTrace.o(15294512758784L, 113953);
          return bool1;
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.OnlineVideoViewHelper", "check video data error: " + localException.toString());
        bool1 = bool2;
        continue;
        w.i("MicroMsg.OnlineVideoViewHelper", "already request video : " + localException);
        continue;
        w.i("MicroMsg.OnlineVideoViewHelper", "already had video data.");
      }
    }
  }
  
  private boolean hn(int paramInt)
  {
    boolean bool3 = false;
    bool1 = false;
    GMTrace.i(8678652510208L, 64661);
    if (this.hak == 3)
    {
      GMTrace.o(8678652510208L, 64661);
      return true;
    }
    if ((this.har - paramInt <= 1) && (this.har < this.han))
    {
      GMTrace.o(8678652510208L, 64661);
      return false;
    }
    PInt localPInt1 = new PInt();
    PInt localPInt2 = new PInt();
    bool2 = bool3;
    try
    {
      if (this.ham.a(paramInt, paramInt + 1, localPInt1, localPInt2))
      {
        bool2 = bool3;
        bool3 = o.Ni().isVideoDataAvailable(this.hah, localPInt1.value, localPInt2.value);
        bool1 = bool3;
        if (!bool3)
        {
          bool2 = bool3;
          this.har = paramInt;
          bool1 = bool3;
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.OnlineVideoViewHelper", "check video data error: " + localException.toString());
        bool1 = bool2;
      }
    }
    GMTrace.o(8678652510208L, 64661);
    return bool1;
  }
  
  private void reset()
  {
    GMTrace.i(8678115639296L, 64657);
    this.hah = "";
    this.hao = -1;
    this.har = 0;
    this.han = 0;
    this.pUY = 0;
    this.hal = 0;
    this.hak = 0;
    this.haq = false;
    this.hat = false;
    this.hau = false;
    this.pUV.clear();
    this.eUs = null;
    this.gGY = 0;
    this.eEM = null;
    if (this.pVd != null) {
      this.has = this.pVd.haA;
    }
    this.pUZ = 0L;
    this.gAP = 0L;
    this.pVc = 0;
    this.pVb = 0L;
    this.pVa = 0L;
    GMTrace.o(8678115639296L, 64657);
  }
  
  public final boolean Ja(String paramString)
  {
    GMTrace.i(8678249857024L, 64658);
    boolean bool = bg.eW(this.hah, paramString);
    GMTrace.o(8678249857024L, 64658);
    return bool;
  }
  
  public final boolean bnY()
  {
    GMTrace.i(18575599337472L, 138399);
    boolean bool;
    aq localaq;
    String str;
    Object[] arrayOfObject;
    if (!bg.nm(this.hah))
    {
      if (this.hak != 3) {
        break label375;
      }
      bool = true;
      w.i("MicroMsg.OnlineVideoViewHelper", "stop online download video %s isFinish %b percent %d", new Object[] { this.hah, Boolean.valueOf(bool), Integer.valueOf(this.pUX) });
      localaq = ae.bjb();
      str = this.hah;
      arrayOfObject = new Object[7];
      arrayOfObject[0] = Integer.valueOf(this.pUW.bnT());
      if (this.pVa <= 0L) {
        this.pVa = bg.Pv();
      }
      int j = (int)(this.pVa - this.gAP);
      int i = j;
      if (j <= 0) {
        i = 0;
      }
      arrayOfObject[1] = Integer.valueOf(i);
      if (this.pUZ <= 0L) {
        this.pUZ = bg.Pv();
      }
      j = (int)(this.pUZ - this.gAP);
      i = j;
      if (j <= 0) {
        i = 0;
      }
      arrayOfObject[2] = Integer.valueOf(i);
      arrayOfObject[3] = Integer.valueOf(this.pUY);
      if (this.pUY <= 0) {
        break label380;
      }
      if (this.pVc == 0) {
        this.pVc = ((int)(this.pVc + bg.aH(this.pVb)));
      }
      arrayOfObject[4] = Integer.valueOf(this.pVc / this.pUY);
    }
    for (;;)
    {
      arrayOfObject[5] = Integer.valueOf(this.pUW.bnV());
      arrayOfObject[6] = Integer.valueOf(this.pUW.bnU());
      if (!bg.nm(str))
      {
        h.xz();
        h.xB().A(new aq.5(localaq, str, arrayOfObject));
      }
      if ((this.pUX >= this.pVd.pVf) && (!bool)) {
        ae.bjb().a(this.eUs, this.gGY, this.eEM, false, false, 36);
      }
      com.tencent.mm.plugin.report.service.g.ork.a(354L, 203L, 1L, false);
      GMTrace.o(18575599337472L, 138399);
      return true;
      label375:
      bool = false;
      break;
      label380:
      arrayOfObject[4] = Integer.valueOf(0);
    }
  }
  
  final void bnZ()
  {
    GMTrace.i(8678920945664L, 64663);
    w.i("MicroMsg.OnlineVideoViewHelper", "play offline video %s ", new Object[] { this.hah });
    com.tencent.mm.sdk.platformtools.af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8674089107456L, 64627);
        if (af.this.pUW != null) {
          af.this.pUW.az(af.this.hai, false);
        }
        GMTrace.o(8674089107456L, 64627);
      }
    });
    GMTrace.o(8678920945664L, 64663);
  }
  
  public final void boa()
  {
    GMTrace.i(8679055163392L, 64664);
    if (this.pVa == 0L) {
      this.pVa = bg.Pv();
    }
    GMTrace.o(8679055163392L, 64664);
  }
  
  public final void clear()
  {
    GMTrace.i(18575465119744L, 138398);
    w.i("MicroMsg.OnlineVideoViewHelper", "clear");
    reset();
    this.pUW = null;
    this.ham = null;
    GMTrace.o(18575465119744L, 138398);
  }
  
  public final boolean hm(int paramInt)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    GMTrace.i(8678384074752L, 64659);
    if (this.hao != -1) {}
    for (int i = this.hao;; i = paramInt)
    {
      w.i("MicroMsg.OnlineVideoViewHelper", "check timer playCurrPos %d playTime %d cachePlayTime %d timeDuration %d playStatus %d downloadStatus %d cdnMediaId %s firPlayWait{%d} isPrepareVideo[%b]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), Integer.valueOf(this.har), Integer.valueOf(this.han), Integer.valueOf(this.hal), Integer.valueOf(this.hak), this.hah, Long.valueOf(this.pVa - this.gAP), Boolean.valueOf(this.hat) });
      switch (this.hak)
      {
      default: 
        w.w("MicroMsg.OnlineVideoViewHelper", "check time default.");
        bool1 = bool2;
      }
      for (;;)
      {
        GMTrace.o(8678384074752L, 64659);
        return bool1;
        label215:
        label217:
        PInt localPInt1;
        PInt localPInt2;
        if (!hn(i))
        {
          this.haq = true;
          if (this.har <= 0) {
            if (this.hao == -1)
            {
              this.hal = 1;
              bool1 = false;
              localPInt1 = new PInt();
              localPInt2 = new PInt();
              localPInt1.value = Math.max(i, this.har);
              if (this.hal == 1)
              {
                localPInt1.value = i;
                localPInt1.value += this.has;
              }
              if (this.hal == 2)
              {
                localPInt1.value = (i - 8);
                if (localPInt1.value < 0) {
                  localPInt1.value = 0;
                }
                localPInt2.value = (localPInt1.value + this.has + 8);
              }
              if ((this.hal == 3) || (this.hal == 4))
              {
                localPInt1.value = this.har;
                localPInt2.value = (this.has + i + 1 + this.pVd.haB);
              }
              if (localPInt2.value >= this.han + 1) {
                localPInt2.value = (this.han + 1);
              }
              if (localPInt2.value >= localPInt1.value) {
                break label894;
              }
              localPInt1.value += this.pVd.haB;
            }
          }
        }
        for (paramInt = 0;; paramInt = 1)
        {
          if (paramInt == 0) {
            break label971;
          }
          if (!dd(localPInt1.value, localPInt2.value)) {
            break label993;
          }
          this.har = Math.max(this.har, localPInt2.value);
          bool1 = bool2;
          break;
          this.hal = 2;
          break label215;
          w.i("MicroMsg.OnlineVideoViewHelper", "pause by load data cdnMediaId %s, pauseByLoadDataCount %d, playStatus %d", new Object[] { this.hah, Integer.valueOf(this.pUY), Integer.valueOf(this.hal) });
          this.pVb = bg.Pv();
          if ((this.hal != 2) && (this.hal != 4))
          {
            this.has += this.pVd.haA;
            this.has = Math.min(this.has, 60);
            this.pUY += 1;
            this.hal = 4;
          }
          this.pUW.MT();
          break label215;
          boa();
          if (this.hat)
          {
            if (this.haq)
            {
              if ((this.pUY == 0) && (this.pVa == 0L)) {
                boa();
              }
              for (;;)
              {
                w.i("MicroMsg.OnlineVideoViewHelper", "resume by data gain.pauseByLoadDataCount %d pauseAllTime %d cdnMediaId %s", new Object[] { Integer.valueOf(this.pUY), Integer.valueOf(this.pVc), this.hah });
                this.hal = 3;
                if (this.hao == -1) {
                  break label747;
                }
                this.pUW.qz(this.hao);
                this.hao = -1;
                this.haq = false;
                bool1 = true;
                break;
                if (this.pVb > 0L) {
                  this.pVc = ((int)(this.pVc + bg.aH(this.pVb)));
                }
              }
              label747:
              if (this.pUW.bnQ()) {}
              for (bool1 = false;; bool1 = true)
              {
                this.haq = bool1;
                bool1 = true;
                break;
              }
            }
            if (this.hal != 3)
            {
              w.i("MicroMsg.OnlineVideoViewHelper", "start to play video playStatus[%d]", new Object[] { Integer.valueOf(this.hal) });
              if (!this.pUW.bnQ()) {
                break label830;
              }
            }
            label830:
            for (paramInt = 3;; paramInt = this.hal)
            {
              this.hal = paramInt;
              bool1 = true;
              break;
            }
          }
          w.i("MicroMsg.OnlineVideoViewHelper", "prepare cdnMediaId [%s]", new Object[] { this.hah });
          if (this.hal == 5) {
            this.hal = 1;
          }
          this.pUW.az(this.hai, true);
          this.hat = true;
          bool1 = true;
          break label217;
          label894:
          w.i("MicroMsg.OnlineVideoViewHelper", "calcDownloadRange range[%d, %d] playTime[%d] playStatus[%d] cache[%d, %d]", new Object[] { Integer.valueOf(localPInt1.value), Integer.valueOf(localPInt2.value), Integer.valueOf(i), Integer.valueOf(this.hal), Integer.valueOf(this.har), Integer.valueOf(this.has) });
        }
        label971:
        w.d("MicroMsg.OnlineVideoViewHelper", "can not calc download.");
        o.Ni();
        com.tencent.mm.modelcdntran.f.e(this.hah, 0, -1);
        label993:
        continue;
        if (this.hat)
        {
          if (this.haq)
          {
            if (this.hao == -1) {
              break label1052;
            }
            this.pUW.qz(this.hao);
            this.hao = -1;
          }
          for (;;)
          {
            this.haq = bool1;
            this.hal = 3;
            bool1 = bool2;
            break;
            label1052:
            if (!this.pUW.bnQ()) {
              bool1 = true;
            }
          }
        }
        if (this.hal == 5) {
          this.hal = 1;
        }
        this.pUW.az(this.hai, false);
        this.hat = true;
        bool1 = bool2;
        continue;
        w.w("MicroMsg.OnlineVideoViewHelper", "download error.");
        bool1 = bool2;
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void MT();
    
    public abstract void az(String paramString, boolean paramBoolean);
    
    public abstract boolean bnQ();
    
    public abstract int bnT();
    
    public abstract int bnU();
    
    public abstract int bnV();
    
    public abstract void qz(int paramInt);
  }
  
  private static final class b
  {
    int haA;
    int haB;
    int pVf;
    
    public b()
    {
      GMTrace.i(8427396923392L, 62789);
      GMTrace.o(8427396923392L, 62789);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */