package com.tencent.mm.plugin.mmsight.model.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.mmsight.model.f;
import com.tencent.mm.plugin.mmsight.model.o;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import java.io.ByteArrayOutputStream;

public final class l
  implements d
{
  String eDW;
  String eIy;
  private boolean gaO;
  public boolean hxo;
  private String idM;
  private String mFileName;
  public VideoTransPara mWP;
  public boolean mZm;
  public c naS;
  p naT;
  public s naU;
  a naV;
  public e naW;
  public String naX;
  int naY;
  float naZ;
  private int nba;
  private int nbb;
  public int nbc;
  int nbd;
  int nbe;
  public int nbf;
  public String nbg;
  private HandlerThread nbh;
  public ae nbi;
  public int nbj;
  public int nbk;
  private boolean nbl;
  boolean nbm;
  private int nbn;
  boolean nbo;
  public int nbp;
  public d.a nbq;
  boolean nbr;
  boolean nbs;
  private f nbt;
  
  public l(VideoTransPara paramVideoTransPara)
  {
    GMTrace.i(7341978157056L, 54702);
    this.naV = null;
    this.naX = "";
    this.naY = 0;
    this.naZ = 0.0F;
    this.nba = 480;
    this.nbb = 640;
    this.nbc = 1600000;
    this.nbd = 480;
    this.nbe = 640;
    this.nbf = 0;
    this.nbg = null;
    this.nbh = null;
    this.nbi = null;
    this.nbj = -1;
    this.nbk = -1;
    this.mZm = false;
    this.eIy = null;
    this.idM = null;
    this.nbl = false;
    this.nbm = false;
    this.gaO = false;
    this.nbn = -1;
    this.nbo = false;
    this.eDW = "";
    this.hxo = false;
    this.nbp = 0;
    this.nbr = false;
    this.nbs = true;
    this.nbt = new f()
    {
      public final boolean L(byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(7346407342080L, 54735);
        if ((paramAnonymousArrayOfByte == null) || (paramAnonymousArrayOfByte.length <= 0))
        {
          GMTrace.o(7346407342080L, 54735);
          return false;
        }
        if (l.this.naU.ncn == d.c.nae)
        {
          Object localObject = l.this;
          if ((!((l)localObject).nbm) && (((l)localObject).nbs))
          {
            ((l)localObject).nbm = true;
            byte[] arrayOfByte = new byte[paramAnonymousArrayOfByte.length];
            System.arraycopy(paramAnonymousArrayOfByte, 0, arrayOfByte, 0, paramAnonymousArrayOfByte.length);
            com.tencent.mm.sdk.f.e.post(new l.6((l)localObject, arrayOfByte), "BigSightMediaCodecMP4MuxRecorder_saveThumb");
          }
          if (l.this.nbi != null)
          {
            localObject = Message.obtain();
            ((Message)localObject).what = 1;
            ((Message)localObject).obj = paramAnonymousArrayOfByte;
            l.this.nbi.sendMessage((Message)localObject);
          }
          GMTrace.o(7346407342080L, 54735);
          return true;
        }
        GMTrace.o(7346407342080L, 54735);
        return false;
      }
    };
    this.mWP = paramVideoTransPara;
    this.nba = paramVideoTransPara.width;
    this.nbb = paramVideoTransPara.height;
    this.nbc = paramVideoTransPara.videoBitrate;
    k.aPI();
    int i = k.aPJ();
    if (i == -1) {}
    for (this.nbc = paramVideoTransPara.videoBitrate;; this.nbc = i)
    {
      this.naU = new s();
      this.gaO = false;
      w.d("MicroMsg.MMSightFFMpegRecorder", "create MMSightFFMpegRecorder, targetWidth: %s, targetHeight: %s, targetRate: %s,  defaultRate: %s", new Object[] { Integer.valueOf(this.nba), Integer.valueOf(this.nbb), Integer.valueOf(this.nbc), Integer.valueOf(i) });
      GMTrace.o(7341978157056L, 54702);
      return;
    }
  }
  
  private void clear()
  {
    boolean bool2 = false;
    GMTrace.i(7342380810240L, 54705);
    int i = -1;
    if (this.naT != null)
    {
      i = this.naT.nbX;
      if (i < 0)
      {
        w.v("MicroMsg.MMSightFFMpegRecorder", "call clear, but bufID error");
        GMTrace.o(7342380810240L, 54705);
        return;
      }
      this.naT.stop();
    }
    if (this.naS != null) {
      this.naS.a(null);
    }
    if (this.naV == null) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      if (this.naV != null) {
        bool2 = this.naV.nbB;
      }
      w.v("MicroMsg.MMSightFFMpegRecorder", "ashutest::clear bufID %d, encodeRunnable null ? %B, markCancel %B", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((i >= 0) && (!qK(i)))
      {
        SightVideoJNI.releaseRecorderBufferRef("clear");
        SightVideoJNI.releaseBigSightDataBuffer(i);
      }
      GMTrace.o(7342380810240L, 54705);
      return;
    }
  }
  
  private boolean qK(int paramInt)
  {
    GMTrace.i(7342246592512L, 54704);
    if ((this.naV != null) && (!this.naV.nbC))
    {
      if (!this.naV.nbz)
      {
        this.naV.eDO = null;
        this.naV.nbB = true;
        this.naV.nbA = true;
        com.tencent.mm.sdk.f.e.remove(this.naV);
      }
      synchronized (this.naV.nbD)
      {
        SightVideoJNI.releaseBigSightDataBuffer(paramInt);
        if (this.naV.nbv != paramInt) {
          SightVideoJNI.releaseBigSightDataBuffer(this.naV.nbv);
        }
        GMTrace.o(7342246592512L, 54704);
        return true;
      }
    }
    GMTrace.o(7342246592512L, 54704);
    return false;
  }
  
  private boolean qL(int paramInt)
  {
    GMTrace.i(7344259858432L, 54719);
    long l = bg.Pw();
    this.mZm = com.tencent.mm.plugin.mmsight.model.j.mZc.mZm;
    this.nbf = paramInt;
    int j;
    label68:
    int n;
    int m;
    if (!this.mZm) {
      if ((paramInt == 0) || (paramInt == 180))
      {
        i = this.nbd;
        if ((paramInt != 0) && (paramInt != 180)) {
          break label179;
        }
        j = this.nbe;
        k = this.nba;
        n = this.nbb;
        m = i;
        i = n;
      }
    }
    for (;;)
    {
      n = this.nbc;
      j = SightVideoJNI.initDataBufferForMMSight(m, j, paramInt, k, i, this.mWP.fps, n, this.mWP.gBn, 8, this.mWP.gBm, 23.0F, this.mZm, true, this.mWP.duration, false);
      if (j >= 0) {
        break label302;
      }
      w.e("MicroMsg.MMSightFFMpegRecorder", "init failed!");
      com.tencent.mm.plugin.mmsight.model.k.aPe();
      GMTrace.o(7344259858432L, 54719);
      return false;
      i = this.nbe;
      break;
      label179:
      j = this.nbd;
      break label68;
      if ((paramInt == 0) || (paramInt == 180))
      {
        i = this.nbd;
        label203:
        if ((paramInt != 0) && (paramInt != 180)) {
          break label270;
        }
        j = this.nbe;
        label219:
        if ((paramInt != 0) && (paramInt != 180)) {
          break label278;
        }
      }
      label270:
      label278:
      for (k = this.nba;; k = this.nbb)
      {
        if ((paramInt != 0) && (paramInt != 180)) {
          break label287;
        }
        n = this.nbb;
        m = i;
        i = n;
        break;
        i = this.nbe;
        break label203;
        j = this.nbd;
        break label219;
      }
      label287:
      n = this.nba;
      m = i;
      i = n;
    }
    label302:
    this.nbn = j;
    this.naT = new p(this.mZm, paramInt, k, i);
    int k = this.naT.qM(j);
    paramInt = 0;
    int i = -1;
    if (CaptureMMProxy.getInstance() != null) {
      i = CaptureMMProxy.getInstance().getInt(w.a.vvF, -1);
    }
    if (i < 0)
    {
      this.naS = new g(this.mWP.audioSampleRate, this.mWP.gBk);
      this.naS.fW(this.nbr);
      paramInt = this.naS.af(j, com.tencent.mm.plugin.sight.base.d.Gz(this.naX));
      if ((k < 0) || (paramInt < 0))
      {
        w.e("MicroMsg.MMSightFFMpegRecorder", "init yuv or aac recorder error!! %d %d", new Object[] { Integer.valueOf(k), Integer.valueOf(paramInt) });
        if ((paramInt < 0) && (k >= 0))
        {
          w.w("MicroMsg.MMSightFFMpegRecorder", "aac init error, try mediarecorder now");
          this.naS.clear();
          this.naS = new i(this.mWP.audioSampleRate, this.mWP.gBk);
          this.naS.fW(this.nbr);
          paramInt = this.naS.af(j, com.tencent.mm.plugin.sight.base.d.Gz(this.naX));
          w.w("MicroMsg.MMSightFFMpegRecorder", "MMSightAACMediaRecorder init ret: %s", new Object[] { Integer.valueOf(paramInt) });
          if (paramInt >= 0)
          {
            GMTrace.o(7344259858432L, 54719);
            return true;
          }
        }
        SightVideoJNI.releaseBigSightDataBuffer(j);
        com.tencent.mm.plugin.mmsight.model.k.aPe();
        GMTrace.o(7344259858432L, 54719);
        return false;
      }
    }
    else
    {
      if (i == 1)
      {
        this.naS = new g(this.mWP.audioSampleRate, this.mWP.gBk);
        this.naS.fW(this.nbr);
        paramInt = this.naS.af(j, com.tencent.mm.plugin.sight.base.d.Gz(this.naX));
      }
      while ((k < 0) || (paramInt < 0))
      {
        w.e("MicroMsg.MMSightFFMpegRecorder", "init yuv or aac recorder error!! %d %d", new Object[] { Integer.valueOf(k), Integer.valueOf(paramInt) });
        SightVideoJNI.releaseBigSightDataBuffer(j);
        com.tencent.mm.plugin.mmsight.model.k.aPe();
        GMTrace.o(7344259858432L, 54719);
        return false;
        if (i == 2)
        {
          this.naS = new i(this.mWP.audioSampleRate, this.mWP.gBk);
          this.naS.fW(this.nbr);
          paramInt = this.naS.af(j, com.tencent.mm.plugin.sight.base.d.Gz(this.naX));
        }
      }
    }
    w.i("MicroMsg.MMSightFFMpegRecorder", "initImpl used %sms", new Object[] { Long.valueOf(bg.aI(l)) });
    GMTrace.o(7344259858432L, 54719);
    return true;
  }
  
  public final void CJ(String paramString)
  {
    GMTrace.i(7343722987520L, 54715);
    this.eIy = paramString;
    GMTrace.o(7343722987520L, 54715);
  }
  
  public final void CK(String paramString)
  {
    GMTrace.i(7343857205248L, 54716);
    this.idM = paramString;
    GMTrace.o(7343857205248L, 54716);
  }
  
  public final void G(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(7345199382528L, 54726);
    w.i("MicroMsg.MMSightFFMpegRecorder", "resume, cameraOrientation: %s", new Object[] { Integer.valueOf(paramInt1) });
    if ((this.naU != null) && (this.naU.ncn == d.c.nan))
    {
      if (this.naT != null)
      {
        p localp = this.naT;
        w.i("MicroMsg.MMSightX264YUVRecorder", "resume, newRotate: %s, frameWidth: %s, frameHeight: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
        localp.nbZ = paramInt1;
        localp.nca = paramInt2;
        localp.ncb = paramInt3;
      }
      this.naU.a(d.c.nae);
    }
    GMTrace.o(7345199382528L, 54726);
  }
  
  public final String GS()
  {
    GMTrace.i(7342783463424L, 54708);
    String str = bg.aq(this.eDW, "");
    GMTrace.o(7342783463424L, 54708);
    return str;
  }
  
  public final void a(d.a parama)
  {
    GMTrace.i(7345467817984L, 54728);
    this.nbq = parama;
    GMTrace.o(7345467817984L, 54728);
  }
  
  public final String aDc()
  {
    GMTrace.i(20191580782592L, 150439);
    String str = this.eIy;
    GMTrace.o(20191580782592L, 150439);
    return str;
  }
  
  public final boolean aOU()
  {
    GMTrace.i(7345602035712L, 54729);
    boolean bool = this.hxo;
    GMTrace.o(7345602035712L, 54729);
    return bool;
  }
  
  public final int aPA()
  {
    GMTrace.i(7344930947072L, 54724);
    int i = this.nbf;
    GMTrace.o(7344930947072L, 54724);
    return i;
  }
  
  public final boolean aPB()
  {
    GMTrace.i(7345333600256L, 54727);
    boolean bool = this.nbo;
    GMTrace.o(7345333600256L, 54727);
    return bool;
  }
  
  public final void aPC()
  {
    GMTrace.i(15396115578880L, 114710);
    this.nbr = true;
    GMTrace.o(15396115578880L, 114710);
  }
  
  public final com.tencent.mm.e.b.c.a aPD()
  {
    GMTrace.i(7345870471168L, 54731);
    if (this.naS != null)
    {
      com.tencent.mm.e.b.c.a locala = this.naS.aPq();
      GMTrace.o(7345870471168L, 54731);
      return locala;
    }
    GMTrace.o(7345870471168L, 54731);
    return null;
  }
  
  public final void aPE()
  {
    GMTrace.i(20191715000320L, 150440);
    this.nbs = false;
    GMTrace.o(20191715000320L, 150440);
  }
  
  public final void aPr()
  {
    GMTrace.i(15395981361152L, 114709);
    w.i("MicroMsg.MMSightFFMpegRecorder", "ashutest::pcm ready");
    if ((this.naV != null) && (!this.naV.nbC)) {
      w.e("MicroMsg.MMSightFFMpegRecorder", "ashutest::OnPcmReady, last encode thread[%s] status error!!! MUST NOT BE HERE", new Object[] { this.naV });
    }
    synchronized (this.naV.nbD)
    {
      qK(this.naV.nbv);
      if (this.naU.ncn != d.c.nam)
      {
        w.w("MicroMsg.MMSightFFMpegRecorder", "ashutest::not MediaStatus.Initialized, maybe canceled by user");
        GMTrace.o(15395981361152L, 114709);
        return;
      }
    }
    this.naU.a(d.c.nae);
    this.naV = new a();
    this.naV.nbv = this.nbn;
    com.tencent.mm.sdk.f.e.b(this.naV, "SightCustomAsyncMediaRecorder_encode_" + bg.Pw(), 5);
    GMTrace.o(15395981361152L, 114709);
  }
  
  public final void aPs()
  {
    GMTrace.i(15395847143424L, 114708);
    if (this.naV != null) {
      this.naV.nbA = true;
    }
    GMTrace.o(15395847143424L, 114708);
  }
  
  public final String aPt()
  {
    GMTrace.i(7343991422976L, 54717);
    String str = this.idM;
    GMTrace.o(7343991422976L, 54717);
    return str;
  }
  
  public final float aPu()
  {
    GMTrace.i(7346004688896L, 54732);
    float f = this.naZ;
    GMTrace.o(7346004688896L, 54732);
    return f;
  }
  
  public final long aPv()
  {
    GMTrace.i(7343051898880L, 54710);
    long l = this.naT.aPO();
    GMTrace.o(7343051898880L, 54710);
    return l;
  }
  
  public final f aPw()
  {
    GMTrace.i(16371744243712L, 121979);
    f localf = this.nbt;
    GMTrace.o(16371744243712L, 121979);
    return localf;
  }
  
  public final d.c aPx()
  {
    GMTrace.i(18672907190272L, 139124);
    d.c localc = this.naU.ncn;
    GMTrace.o(18672907190272L, 139124);
    return localc;
  }
  
  public final int aPy()
  {
    GMTrace.i(7344662511616L, 54722);
    int i = Math.round(this.naY / 1000.0F);
    GMTrace.o(7344662511616L, 54722);
    return i;
  }
  
  public final Point aPz()
  {
    GMTrace.i(7344796729344L, 54723);
    Point localPoint = new Point(this.nbd, this.nbe);
    GMTrace.o(7344796729344L, 54723);
    return localPoint;
  }
  
  public final int b(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    GMTrace.i(7344528293888L, 54721);
    w.i("MicroMsg.MMSightFFMpegRecorder", "request start, last status %s, cameraOrientation: %s, isLandscape: %s, degree: %s", new Object[] { this.naU.ncn, Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt2) });
    this.hxo = paramBoolean;
    this.naY = 0;
    this.nbp = paramInt2;
    this.naU.a(d.c.nad);
    Object localObject = this.naX;
    if (this.naV == null)
    {
      paramBoolean = true;
      if (this.naV != null) {
        break label175;
      }
    }
    label175:
    for (boolean bool = true;; bool = this.naV.nbC)
    {
      w.i("MicroMsg.MMSightFFMpegRecorder", "initialize: filePath[%s], encodeThread null[%B], encodeThreadFinish[%B]", new Object[] { localObject, Boolean.valueOf(paramBoolean), Boolean.valueOf(bool) });
      if ((this.naV == null) || (this.naV.nbC)) {
        break label187;
      }
      w.w("MicroMsg.MMSightFFMpegRecorder", "ERROR, status, wait last encode thread finish!!! MUST NOT BE HERE");
      GMTrace.o(7344528293888L, 54721);
      return -1;
      paramBoolean = false;
      break;
    }
    label187:
    if (bg.nm(this.naX))
    {
      w.e("MicroMsg.MMSightFFMpegRecorder", "start error, mCurRecordPath is null!!");
      GMTrace.o(7344528293888L, 54721);
      return -1;
    }
    this.mFileName = com.tencent.mm.a.e.bc(this.naX);
    w.i("MicroMsg.MMSightFFMpegRecorder", "mCurRecordPath: %s", new Object[] { this.naX });
    this.nbf = paramInt1;
    w.i("MicroMsg.MMSightFFMpegRecorder", "start, cameraOrientation: %s", new Object[] { Integer.valueOf(this.nbf) });
    if (!this.gaO)
    {
      qL(paramInt1);
      this.gaO = true;
    }
    localObject = this.naT;
    if (0L == ((p)localObject).jst) {
      ((p)localObject).jst = System.currentTimeMillis();
    }
    if (!this.nbr)
    {
      paramInt1 = this.naS.a(new c.a()
      {
        public final void aPr()
        {
          GMTrace.i(7340635979776L, 54692);
          l.this.aPr();
          GMTrace.o(7340635979776L, 54692);
        }
      });
      w.i("MicroMsg.MMSightFFMpegRecorder", "start aac recorder ret: %d", new Object[] { Integer.valueOf(paramInt1) });
      this.nbh = com.tencent.mm.sdk.f.e.cK("BigSightWriteCameraData", 0);
      this.nbh.start();
      this.nbi = new ae(this.nbh.getLooper())
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(7368821702656L, 54902);
          if (l.this.nbj == -1)
          {
            l.this.nbj = Process.myTid();
            w.i("MicroMsg.MMSightFFMpegRecorder", "writeCameraTid: %s", new Object[] { Integer.valueOf(l.this.nbj) });
          }
          l locall;
          byte[] arrayOfByte;
          int i2;
          int j;
          int i;
          if (paramAnonymousMessage.what == 1)
          {
            l.this.naS.aPp();
            locall = l.this;
            arrayOfByte = (byte[])paramAnonymousMessage.obj;
            if (!locall.mZm) {
              break label166;
            }
            paramAnonymousMessage = locall.naT;
            i2 = arrayOfByte.length;
            j = locall.nbd;
            i = locall.nbe;
          }
          label166:
          int k;
          for (;;)
          {
            paramAnonymousMessage.tick = bg.Pw();
            if (paramAnonymousMessage.nbX >= 0) {
              break;
            }
            w.e("MicroMsg.MMSightX264YUVRecorder", "write data error, yuv buffer id error");
            j.naP.x(arrayOfByte);
            locall.nbo = true;
            GMTrace.o(7368821702656L, 54902);
            return;
            paramAnonymousMessage = locall.naT;
            i2 = arrayOfByte.length;
            if ((locall.nbf == 0) || (locall.nbf == 180)) {}
            for (i = locall.nbd;; i = locall.nbe)
            {
              if ((locall.nbf != 0) && (locall.nbf != 180)) {
                break label245;
              }
              k = locall.nbe;
              j = i;
              i = k;
              break;
            }
            label245:
            k = locall.nbd;
            j = i;
            i = k;
          }
          for (;;)
          {
            int i1;
            int m;
            int n;
            boolean bool2;
            try
            {
              paramAnonymousMessage.frameCount += 1;
              i1 = paramAnonymousMessage.nbY;
              bool1 = paramAnonymousMessage.mZm;
              if (bool1) {
                break label552;
              }
              if ((paramAnonymousMessage.nbZ == -1) || (paramAnonymousMessage.nbZ == paramAnonymousMessage.nbY)) {
                break label546;
              }
              bool1 = true;
              k = paramAnonymousMessage.nbZ;
              if (paramAnonymousMessage.nbY <= 180)
              {
                k -= paramAnonymousMessage.nbY;
                i1 = Math.max(0, k);
                if (i1 < 360) {
                  break label721;
                }
                k = 0;
                i1 = k;
                SightVideoJNI.setRotateForBufId(paramAnonymousMessage.nbX, i1);
                if (!bool1) {
                  break label587;
                }
                if ((i1 != 0) && (i1 != 180)) {
                  break label578;
                }
                k = paramAnonymousMessage.mAB;
                if (!bool1) {
                  break label627;
                }
                if ((i1 != 0) && (i1 != 180)) {
                  break label618;
                }
                m = paramAnonymousMessage.lhd;
                if (!bool1) {
                  break label664;
                }
                if ((i1 != 0) && (i1 != 180)) {
                  break label658;
                }
                n = j;
                if (!bool1) {
                  break label694;
                }
                if ((i1 != 0) && (i1 != 180)) {
                  break label689;
                }
                if ((n != k) || (i != m)) {
                  break label715;
                }
                bool2 = false;
                SightVideoJNI.writeYuvDataForMMSight(paramAnonymousMessage.nbX, arrayOfByte, i2, k, m, bool1, bool2, n, i);
                w.d("MicroMsg.MMSightX264YUVRecorder", "write data use %dms", new Object[] { Long.valueOf(bg.aI(paramAnonymousMessage.tick)) });
                break;
              }
            }
            finally {}
            k += 360 - paramAnonymousMessage.nbY;
            continue;
            label546:
            boolean bool1 = false;
            continue;
            label552:
            if (paramAnonymousMessage.nbZ == -1)
            {
              k = paramAnonymousMessage.nbY;
            }
            else
            {
              k = paramAnonymousMessage.nbZ;
              continue;
              label578:
              k = paramAnonymousMessage.lhd;
              continue;
              label587:
              if ((i1 == 0) || (i1 == 180))
              {
                k = paramAnonymousMessage.lhd;
              }
              else
              {
                k = paramAnonymousMessage.mAB;
                continue;
                label618:
                m = paramAnonymousMessage.mAB;
                continue;
                label627:
                if ((i1 == 0) || (i1 == 180))
                {
                  m = paramAnonymousMessage.mAB;
                }
                else
                {
                  m = paramAnonymousMessage.lhd;
                  continue;
                  label658:
                  n = i;
                  continue;
                  label664:
                  if ((i1 == 0) || (i1 == 180))
                  {
                    n = i;
                  }
                  else
                  {
                    n = j;
                    continue;
                    label689:
                    i = j;
                    continue;
                    label694:
                    if ((i1 == 0) || (i1 == 180))
                    {
                      i = j;
                    }
                    else
                    {
                      continue;
                      label715:
                      bool2 = true;
                      continue;
                      label721:
                      bool1 = true;
                    }
                  }
                }
              }
            }
          }
        }
      };
      this.nbo = false;
      if (paramInt1 == 0) {
        break label466;
      }
      this.naU.a(d.c.nak);
    }
    for (;;)
    {
      com.tencent.mm.plugin.mmsight.model.k.aPd();
      w.i("MicroMsg.MMSightRecorderIDKeyStat", "markFFMpegCapture");
      com.tencent.mm.plugin.report.service.g.ork.a(440L, 1L, 1L, false);
      if (this.nbr) {
        aPr();
      }
      GMTrace.o(7344528293888L, 54721);
      return paramInt1;
      paramInt1 = 0;
      break;
      label466:
      this.naU.a(d.c.nam);
    }
  }
  
  public final void cancel()
  {
    GMTrace.i(7342515027968L, 54706);
    w.i("MicroMsg.MMSightFFMpegRecorder", "cancel");
    this.naU.a(d.c.nag);
    clear();
    this.naU.a(d.c.nah);
    GMTrace.o(7342515027968L, 54706);
  }
  
  public final String getFileName()
  {
    GMTrace.i(7343454552064L, 54713);
    String str = this.mFileName;
    GMTrace.o(7343454552064L, 54713);
    return str;
  }
  
  public final String getFilePath()
  {
    GMTrace.i(7343320334336L, 54712);
    String str = this.naX;
    GMTrace.o(7343320334336L, 54712);
    return str;
  }
  
  public final void k(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(7342112374784L, 54703);
    w.i("MicroMsg.MMSightFFMpegRecorder", "setSize, width: %s, height: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.nba = paramInt3;
    this.nbb = paramInt4;
    this.nbd = paramInt1;
    this.nbe = paramInt2;
    if (j.naP.h(Integer.valueOf(paramInt1 * paramInt2 * 3 / 2)) == null)
    {
      w.i("MicroMsg.MMSightFFMpegRecorder", "preloadCameraData, width: %s, height: %s, count: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(3) });
      long l = bg.Pw();
      paramInt3 = 0;
      while (paramInt3 < 3)
      {
        j.naP.x(new byte[paramInt1 * paramInt2 * 3 / 2]);
        paramInt3 += 1;
      }
      w.i("MicroMsg.MMSightFFMpegRecorder", "preloadCameraData used %sms", new Object[] { Long.valueOf(bg.aI(l)) });
    }
    GMTrace.o(7342112374784L, 54703);
  }
  
  public final void pause()
  {
    GMTrace.i(7345065164800L, 54725);
    w.i("MicroMsg.MMSightFFMpegRecorder", "pause");
    if ((this.naU != null) && (this.naU.ncn == d.c.nae)) {
      this.naU.a(d.c.nan);
    }
    GMTrace.o(7345065164800L, 54725);
  }
  
  public final boolean qJ(int paramInt)
  {
    GMTrace.i(7344394076160L, 54720);
    if (!this.gaO)
    {
      w.i("MicroMsg.MMSightFFMpegRecorder", "preInit, cameraOrientation: %s", new Object[] { Integer.valueOf(paramInt) });
      boolean bool = qL(paramInt);
      this.gaO = true;
      w.i("MicroMsg.MMSightFFMpegRecorder", "initImpl result: %s", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(7344394076160L, 54720);
      return bool;
    }
    GMTrace.o(7344394076160L, 54720);
    return true;
  }
  
  public final void reset()
  {
    GMTrace.i(7344125640704L, 54718);
    w.i("MicroMsg.MMSightFFMpegRecorder", "reset");
    this.naU.ncn = d.c.nah;
    this.nbo = false;
    if (this.naS != null) {
      this.naS.clear();
    }
    p localp;
    if (this.naT != null)
    {
      localp = this.naT;
      SightVideoJNI.releaseBigSightDataBuffer(localp.nbX);
      localp.nbX = -1;
    }
    try
    {
      localp.frameCount = 0;
      localp.jst = 0L;
      clear();
      GMTrace.o(7344125640704L, 54718);
      return;
    }
    finally {}
  }
  
  public final void setFilePath(String paramString)
  {
    GMTrace.i(7343588769792L, 54714);
    this.naX = paramString;
    GMTrace.o(7343588769792L, 54714);
  }
  
  public final void x(final Runnable paramRunnable)
  {
    boolean bool3 = true;
    GMTrace.i(7342649245696L, 54707);
    boolean bool1;
    if (this.naV == null) {
      bool1 = true;
    }
    for (;;)
    {
      boolean bool2;
      if ((this.naV != null) && (this.naV.nbz))
      {
        bool2 = true;
        label40:
        if ((this.naV == null) || (!this.naV.nbA)) {
          break label151;
        }
        w.i("MicroMsg.MMSightFFMpegRecorder", "stop, encodeThread null ? %B, has trigger finish ? %B, has finish callback ? %B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
        if ((this.naV == null) || (!this.naV.nbz)) {
          break;
        }
      }
      synchronized (this.naV.nbD)
      {
        reset();
        af.t(paramRunnable);
        GMTrace.o(7342649245696L, 54707);
        return;
        bool1 = false;
        continue;
        bool2 = false;
        break label40;
        label151:
        bool3 = false;
      }
    }
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7369224355840L, 54905);
        l locall = l.this;
        Runnable localRunnable = paramRunnable;
        locall.naU.a(d.c.nag);
        if (locall.naT != null)
        {
          int i = locall.naT.nbX;
          float f = locall.naT.frameCount * 1000.0F / (float)locall.naT.aPO();
          w.i("MicroMsg.MMSightFFMpegRecorder", "stop, bufID %d, frameCount %d, duration %dms, %.6ffps", new Object[] { Integer.valueOf(i), Integer.valueOf(locall.naT.frameCount), Long.valueOf(locall.naT.aPO()), Float.valueOf(f) });
          locall.naY = ((int)locall.naT.aPO());
          locall.naZ = f;
          locall.naT.stop();
          if (locall.naV != null)
          {
            locall.naV.nbx = f;
            locall.naV.duration = locall.naY;
            locall.naV.eDO = localRunnable;
            locall.naV.nbz = true;
            com.tencent.mm.sdk.f.e.remove(locall.naV);
          }
        }
        if ((locall.naS != null) && (!locall.nbr)) {
          locall.naS.a(new l.3(locall));
        }
        locall.naU.a(d.c.nah);
        locall.eDW = com.tencent.mm.c.g.bg(locall.naX);
        if (locall.naV == null)
        {
          w.e("MicroMsg.MMSightFFMpegRecorder", "encodeRunnable is null!, directly call stopcallback");
          locall.reset();
          af.t(localRunnable);
        }
        if (locall.nbr) {
          locall.aPs();
        }
        GMTrace.o(7369224355840L, 54905);
      }
    }, "MMSightFFMpegRecorder_stop");
    GMTrace.o(7342649245696L, 54707);
  }
  
  private final class a
    implements Runnable
  {
    int duration;
    Runnable eDO;
    boolean nbA;
    boolean nbB;
    boolean nbC;
    final Object nbD;
    int nbv;
    volatile int nbw;
    float nbx;
    volatile boolean nby;
    boolean nbz;
    
    public a()
    {
      GMTrace.i(7370298097664L, 54913);
      this.nbw = 0;
      this.nby = true;
      this.nbz = false;
      this.nbA = false;
      this.nbB = false;
      this.nbC = false;
      this.nbD = new Object();
      this.eDO = null;
      synchronized (this.nbD)
      {
        try
        {
          String str2 = FileOp.kZ(l.this.naX);
          String str1 = str2;
          if (!str2.endsWith("/")) {
            str1 = str2 + "/";
          }
          l.this.nbg = (str1 + "tempRotate.mp4");
        }
        catch (Exception this$1)
        {
          for (;;)
          {
            w.e("MicroMsg.MMSightFFMpegRecorder", "retrieve file name error: %s", new Object[] { l.this.getMessage() });
          }
        }
        GMTrace.o(7370298097664L, 54913);
        return;
      }
    }
    
    public final void run()
    {
      GMTrace.i(7370432315392L, 54914);
      if (l.this.nbk == -1)
      {
        l.this.nbk = Process.myTid();
        Process.setThreadPriority(Process.myTid(), -2);
        w.i("MicroMsg.MMSightFFMpegRecorder", "encodeTid: %s", new Object[] { Integer.valueOf(l.this.nbk) });
      }
      int i;
      int j;
      for (;;)
      {
        synchronized (this.nbD)
        {
          if (this.nbA) {
            break label197;
          }
          l = bg.Pw();
          i = SightVideoJNI.triggerEncode(this.nbv, Math.max(0, this.nbw), false);
          w.i("MicroMsg.MMSightFFMpegRecorder", "ing: trgger encode use %dms, Encode index[%d, %d), threadId: %s", new Object[] { Long.valueOf(bg.aI(l)), Integer.valueOf(this.nbw), Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()) });
          j = Math.abs(i - this.nbw);
          if (j > 5) {}
        }
        try
        {
          Thread.sleep(100L);
          this.nbw = i;
          continue;
          localObject2 = finally;
          throw ((Throwable)localObject2);
        }
        catch (Exception localException1)
        {
          for (;;)
          {
            w.e("MicroMsg.MMSightFFMpegRecorder", "thread sleep error");
          }
        }
      }
      label197:
      long l = bg.Pw();
      if (!this.nbB) {
        this.nbw = SightVideoJNI.triggerEncode(this.nbv, this.nbw, true);
      }
      w.i("MicroMsg.MMSightFFMpegRecorder", "end: trgger encode use %dms, curEncode index %d, markCancel %B, threadId: %s", new Object[] { Long.valueOf(bg.aI(l)), Integer.valueOf(this.nbw), Boolean.valueOf(this.nbB), Long.valueOf(Thread.currentThread().getId()) });
      if (!this.nbB)
      {
        l.this.naW = new m(this.nbv, l.this.naX, this.nbx, l.this.nbc, Math.max(1000, this.duration), l.this.mWP.audioSampleRate);
        l = bg.Pw();
        boolean bool = l.this.naW.aPF();
        w.i("MicroMsg.MMSightFFMpegRecorder", "mux used %sms, success: %s", new Object[] { Long.valueOf(bg.aI(l)), Boolean.valueOf(bool) });
        if (!bool)
        {
          w.e("MicroMsg.MMSightFFMpegRecorder", "mux failed!");
          SightVideoJNI.releaseBigSightDataBuffer(this.nbv);
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(7341575503872L, 54699);
              if (l.this.nbq != null) {
                l.this.nbq.Rv();
              }
              GMTrace.o(7341575503872L, 54699);
            }
          });
          w.i("MicroMsg.MMSightRecorderIDKeyStat", "markFFMpegCaptureMuxError");
          com.tencent.mm.plugin.report.service.g.ork.a(440L, 30L, 1L, false);
          GMTrace.o(7370432315392L, 54914);
          return;
        }
        if (((l.this.hxo) && (l.this.mZm)) || ((!l.this.mZm) && (!l.this.hxo)) || ((l.this.hxo) && (Math.abs(l.this.nbf - l.this.nbp) == 0)) || (l.this.nbp == 180))
        {
          l = bg.Pw();
          if ((l.this.mZm) || (l.this.hxo)) {
            break label840;
          }
          i = l.this.nbf;
        }
      }
      for (;;)
      {
        j = i;
        if (l.this.nbp == 180)
        {
          j = i;
          if (!l.this.mZm)
          {
            i += 180;
            j = i;
            if (i > 360) {
              j = i - 360;
            }
          }
        }
        SightVideoJNI.tagRotateVideo(l.this.naX, l.this.nbg, j);
        w.i("MicroMsg.MMSightFFMpegRecorder", "tagRotateVideo used %sms, cameraOrientation: %s, isLandscape: %s, deviceDegree: %s, rotateDegree: %s", new Object[] { Long.valueOf(bg.aI(l)), Integer.valueOf(l.this.nbf), Boolean.valueOf(l.this.hxo), Integer.valueOf(l.this.nbp), Integer.valueOf(j) });
        final String str = l.this.nbg;
        try
        {
          FileOp.o(l.this.nbg, l.this.naX);
          com.tencent.mm.sdk.f.e.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(7350836527104L, 54768);
              try
              {
                FileOp.deleteFile(str);
                GMTrace.o(7350836527104L, 54768);
                return;
              }
              catch (Exception localException)
              {
                w.e("MicroMsg.MMSightFFMpegRecorder", "stop, delete old file error: %s", new Object[] { localException.getMessage() });
                GMTrace.o(7350836527104L, 54768);
              }
            }
          }, "BigSightFFMpegRecorder_tagRotate_after_process");
          w.i("MicroMsg.MMSightFFMpegRecorder", "tag rotate used %sms", new Object[] { Long.valueOf(bg.aI(l)) });
          SightVideoJNI.releaseBigSightDataBuffer(this.nbv);
          w.i("MicroMsg.MMSightFFMpegRecorder", "all finish, callback: %s", new Object[] { this.eDO });
          l.this.reset();
          af.t(this.eDO);
          this.nbC = true;
          l.this.nbk = -1;
          l.this.nbj = -1;
          GMTrace.o(7370432315392L, 54914);
          return;
        }
        catch (Exception localException2)
        {
          label840:
          w.e("MicroMsg.MMSightFFMpegRecorder", "stop, copy file error");
          SightVideoJNI.releaseBigSightDataBuffer(this.nbv);
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(7371103404032L, 54919);
              if (l.this.nbq != null) {
                l.this.nbq.Rv();
              }
              GMTrace.o(7371103404032L, 54919);
            }
          });
          GMTrace.o(7370432315392L, 54914);
          return;
        }
        if (l.this.mZm) {
          i = l.this.nbp;
        } else {
          i = 180;
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */