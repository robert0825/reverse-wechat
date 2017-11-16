package com.tencent.mm.plugin.mmsight.model.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
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

public final class n
  implements d
{
  private String eDW;
  String eIy;
  private boolean gaO;
  boolean hxo;
  private String idM;
  private String mFileName;
  VideoTransPara mWP;
  private Point mYh;
  private boolean mZm;
  public s naU;
  private String naX;
  private int naY;
  private float naZ;
  public int nap;
  public c nbH;
  public q nbI;
  private m nbJ;
  private HandlerThread nbK;
  public ae nbL;
  private int nbM;
  com.tencent.mm.plugin.mmsight.model.b nbN;
  public com.tencent.mm.plugin.mmsight.model.b nbO;
  public Runnable nbP;
  private boolean nbQ;
  private int nba;
  private int nbb;
  private int nbc;
  int nbd;
  int nbe;
  int nbf;
  private String nbg;
  private boolean nbl;
  boolean nbm;
  boolean nbo;
  int nbp;
  public d.a nbq;
  boolean nbs;
  private f nbt;
  
  public n(VideoTransPara paramVideoTransPara)
  {
    GMTrace.i(7352715575296L, 54782);
    this.naX = "";
    this.naY = 0;
    this.naZ = 0.0F;
    this.nba = 480;
    this.nbb = 640;
    this.nbc = 1600000;
    this.nbd = 480;
    this.nbe = 640;
    this.nbg = null;
    this.nbM = 0;
    this.mZm = false;
    this.nbm = false;
    this.eIy = null;
    this.idM = null;
    this.nbl = false;
    this.mYh = null;
    this.nbN = new com.tencent.mm.plugin.mmsight.model.b("yuvRecorderWriteData");
    this.nbO = new com.tencent.mm.plugin.mmsight.model.b("frameCountCallback");
    this.gaO = false;
    this.nbo = false;
    this.eDW = "";
    this.hxo = false;
    this.nbp = 0;
    this.nbP = null;
    this.nbQ = false;
    this.nbs = true;
    this.nbt = new f()
    {
      public final boolean L(byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(7370163879936L, 54912);
        if ((paramAnonymousArrayOfByte == null) || (paramAnonymousArrayOfByte.length <= 0))
        {
          GMTrace.o(7370163879936L, 54912);
          return false;
        }
        if ((n.this.naU.ncn == d.c.nae) || (n.this.naU.ncn == d.c.naf))
        {
          if (n.this.naU.ncn == d.c.naf)
          {
            n.this.naU.ncn = d.c.nag;
            w.v("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "forward one more frame");
          }
          n.this.nbO.cS(1L);
          if (n.this.nbH != null) {
            n.this.nbH.aPp();
          }
          if (n.this.nbI != null)
          {
            Message localMessage = Message.obtain();
            localMessage.what = 1;
            localMessage.obj = paramAnonymousArrayOfByte;
            if (n.this.nbL != null) {
              n.this.nbL.sendMessage(localMessage);
            }
          }
          GMTrace.o(7370163879936L, 54912);
          return true;
        }
        GMTrace.o(7370163879936L, 54912);
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
      w.d("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "create MMSightMediaCodecMP4MuxRecorder, targetWidth: %s, targetHeight: %s, targetRate: %s", new Object[] { Integer.valueOf(this.nba), Integer.valueOf(this.nbb), Integer.valueOf(this.nbc) });
      GMTrace.o(7352715575296L, 54782);
      return;
    }
  }
  
  private boolean qL(int paramInt)
  {
    GMTrace.i(7352849793024L, 54783);
    long l = bg.Pw();
    this.mZm = com.tencent.mm.plugin.mmsight.model.j.mZc.mZm;
    int i = this.nbc;
    this.nap = SightVideoJNI.initDataBufferForMMSight(this.nbd, this.nbe, paramInt, this.nba, this.nbb, this.mWP.fps, i, this.mWP.gBn, 8, this.mWP.gBm, 23.0F, false, false, this.mWP.duration, false);
    w.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "init, bufId: %s", new Object[] { Integer.valueOf(this.nap) });
    if (this.nap < 0)
    {
      w.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "init failed!");
      com.tencent.mm.plugin.mmsight.model.k.aPf();
      GMTrace.o(7352849793024L, 54783);
      return false;
    }
    this.nbf = paramInt;
    this.nbI = new q(this.nbd, this.nbe, this.nba, this.nbb, this.nbc, this.mWP.gBl, this.mWP.fps, this.mZm);
    int j = this.nbI.ct(this.nap, paramInt);
    paramInt = 0;
    i = -1;
    if (CaptureMMProxy.getInstance() != null) {
      i = CaptureMMProxy.getInstance().getInt(w.a.vvF, -1);
    }
    if (i < 0)
    {
      this.nbH = new g(this.mWP.audioSampleRate, this.mWP.gBk);
      this.nbH.fW(this.nbQ);
      paramInt = this.nbH.af(this.nap, com.tencent.mm.plugin.sight.base.d.Gz(this.naX));
      if ((j < 0) || (paramInt < 0))
      {
        w.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "init yuv or aac recorder error!! %d %d", new Object[] { Integer.valueOf(j), Integer.valueOf(paramInt) });
        if ((paramInt < 0) && (j >= 0))
        {
          w.w("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "aac init error, try mediarecorder now");
          this.nbH.clear();
          this.nbH = new i(this.mWP.audioSampleRate, this.mWP.gBk);
          this.nbH.fW(this.nbQ);
          paramInt = this.nbH.af(this.nap, com.tencent.mm.plugin.sight.base.d.Gz(this.naX));
          w.w("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "MMSightAACMediaRecorder init ret: %s", new Object[] { Integer.valueOf(paramInt) });
          if (paramInt >= 0)
          {
            GMTrace.o(7352849793024L, 54783);
            return true;
          }
        }
        SightVideoJNI.releaseBigSightDataBuffer(this.nap);
        com.tencent.mm.plugin.mmsight.model.k.aPf();
        GMTrace.o(7352849793024L, 54783);
        return false;
      }
    }
    else
    {
      if (i == 1)
      {
        this.nbH = new g(this.mWP.audioSampleRate, this.mWP.gBk);
        this.nbH.fW(this.nbQ);
        paramInt = this.nbH.af(this.nap, com.tencent.mm.plugin.sight.base.d.Gz(this.naX));
      }
      while ((j < 0) || (paramInt < 0))
      {
        w.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "init yuv or aac recorder error!! %d %d", new Object[] { Integer.valueOf(j), Integer.valueOf(paramInt) });
        SightVideoJNI.releaseBigSightDataBuffer(this.nap);
        com.tencent.mm.plugin.mmsight.model.k.aPf();
        GMTrace.o(7352849793024L, 54783);
        return false;
        if (i == 2)
        {
          this.nbH = new i(this.mWP.audioSampleRate, this.mWP.gBk);
          this.nbH.fW(this.nbQ);
          paramInt = this.nbH.af(this.nap, com.tencent.mm.plugin.sight.base.d.Gz(this.naX));
        }
      }
    }
    w.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "initImpl used %sms", new Object[] { Long.valueOf(bg.aI(l)) });
    GMTrace.o(7352849793024L, 54783);
    return true;
  }
  
  public final void CJ(String paramString)
  {
    GMTrace.i(7353923534848L, 54791);
    this.eIy = paramString;
    GMTrace.o(7353923534848L, 54791);
  }
  
  public final void CK(String paramString)
  {
    GMTrace.i(7354057752576L, 54792);
    this.idM = paramString;
    GMTrace.o(7354057752576L, 54792);
  }
  
  public final void G(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(7355936800768L, 54806);
    w.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "resume, cameraOrientation: %s", new Object[] { Integer.valueOf(paramInt1) });
    if ((this.naU != null) && (this.naU.ncn == d.c.nan))
    {
      if (this.nbI != null)
      {
        q localq = this.nbI;
        localq.nbZ = paramInt1;
        localq.nca = paramInt2;
        localq.ncb = paramInt3;
        w.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "resume, newRotation: %s, newFrameWidth: %s, newFrameHeight: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      }
      this.naU.a(d.c.nae);
    }
    GMTrace.o(7355936800768L, 54806);
  }
  
  public final String GS()
  {
    GMTrace.i(7353520881664L, 54788);
    String str = bg.aq(this.eDW, "");
    GMTrace.o(7353520881664L, 54788);
    return str;
  }
  
  public final void a(d.a parama)
  {
    GMTrace.i(7356205236224L, 54808);
    this.nbq = parama;
    GMTrace.o(7356205236224L, 54808);
  }
  
  public final String aDc()
  {
    GMTrace.i(20191312347136L, 150437);
    String str = this.eIy;
    GMTrace.o(20191312347136L, 150437);
    return str;
  }
  
  public final boolean aOU()
  {
    GMTrace.i(7356339453952L, 54809);
    boolean bool = this.hxo;
    GMTrace.o(7356339453952L, 54809);
    return bool;
  }
  
  public final int aPA()
  {
    GMTrace.i(7355668365312L, 54804);
    int i = this.nbf;
    GMTrace.o(7355668365312L, 54804);
    return i;
  }
  
  public final boolean aPB()
  {
    GMTrace.i(7356071018496L, 54807);
    boolean bool = this.nbo;
    GMTrace.o(7356071018496L, 54807);
    return bool;
  }
  
  public final void aPC()
  {
    GMTrace.i(15396384014336L, 114712);
    this.nbQ = true;
    GMTrace.o(15396384014336L, 114712);
  }
  
  public final com.tencent.mm.e.b.c.a aPD()
  {
    GMTrace.i(7356607889408L, 54811);
    if (this.nbH != null)
    {
      com.tencent.mm.e.b.c.a locala = this.nbH.aPq();
      GMTrace.o(7356607889408L, 54811);
      return locala;
    }
    GMTrace.o(7356607889408L, 54811);
    return null;
  }
  
  public final void aPE()
  {
    GMTrace.i(20191446564864L, 150438);
    this.nbs = false;
    GMTrace.o(20191446564864L, 150438);
  }
  
  public final boolean aPN()
  {
    GMTrace.i(7353386663936L, 54787);
    long l = bg.Pw();
    if ((this.nbK != null) && (this.nbL != null))
    {
      if (!com.tencent.mm.compatible.util.d.et(18)) {
        break label300;
      }
      this.nbK.quitSafely();
    }
    int i;
    for (;;)
    {
      this.nbL = null;
      i = this.nbI.frameCount;
      this.naZ = (i * 1000.0F / this.naY);
      w.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "stop, frameCount: %s, fps: %s, duration: %s, file: %s handlerrunning %s", new Object[] { Integer.valueOf(i), Float.valueOf(this.naZ), Integer.valueOf(this.naY), this.naX, Long.valueOf(bg.aI(l)) });
      w.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "frameCountCallback %s", new Object[] { this.nbO.getValue() });
      w.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "yuvRecorderWriteDataCallback %s", new Object[] { this.nbN.getValue() });
      this.nbJ = new m(this.nap, this.naX, this.naZ, this.nbc, this.naY, this.mWP.audioSampleRate);
      l = bg.Pw();
      boolean bool = this.nbJ.aPF();
      w.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "mux used %sms, success: %s", new Object[] { Long.valueOf(bg.aI(l)), Boolean.valueOf(bool) });
      if (bool) {
        break;
      }
      w.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "mux failed!");
      w.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecMuxError");
      com.tencent.mm.plugin.report.service.g.ork.a(440L, 31L, 1L, false);
      GMTrace.o(7353386663936L, 54787);
      return false;
      label300:
      this.nbK.quit();
    }
    if (((this.hxo) && (this.mZm)) || ((!this.mZm) && (!this.hxo)) || ((this.hxo) && (Math.abs(this.nbf - this.nbp) == 0)) || (this.nbp == 180))
    {
      l = bg.Pw();
      if ((this.mZm) || (this.hxo)) {
        break label615;
      }
      i = this.nbf;
    }
    for (;;)
    {
      int j = i;
      if (this.nbp == 180)
      {
        j = i;
        if (!this.mZm)
        {
          i += 180;
          j = i;
          if (i > 360) {
            j = i - 360;
          }
        }
      }
      SightVideoJNI.tagRotateVideo(this.naX, this.nbg, j);
      this.nbl = true;
      w.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "tagRotateVideo used %sms, cameraOrientation: %s, isLandscape: %s, deviceDegree: %s, rotateDegree: %s", new Object[] { Long.valueOf(bg.aI(l)), Integer.valueOf(this.nbf), Boolean.valueOf(this.hxo), Integer.valueOf(this.nbp), Integer.valueOf(j) });
      l = bg.Pw();
      try
      {
        FileOp.deleteFile(this.naX);
        FileOp.al(this.nbg, this.naX);
        w.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "copyFile cost %s", new Object[] { Long.valueOf(bg.aI(l)) });
        com.tencent.mm.sdk.f.e.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(7350299656192L, 54764);
            try
            {
              FileOp.deleteFile(this.nbF);
              GMTrace.o(7350299656192L, 54764);
              return;
            }
            catch (Exception localException)
            {
              w.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "stop, delete old file error: %s", new Object[] { localException.getMessage() });
              GMTrace.o(7350299656192L, 54764);
            }
          }
        }, "BigSightMediaCodecMP4MuxRecorder_tagRotate_after_process");
        SightVideoJNI.releaseBigSightDataBuffer(this.nap);
        this.naU.a(d.c.nah);
        this.eDW = com.tencent.mm.c.g.bg(this.nbg);
        GMTrace.o(7353386663936L, 54787);
        return true;
      }
      catch (Exception localException)
      {
        label615:
        w.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "stop, copy file error");
        GMTrace.o(7353386663936L, 54787);
      }
      if (this.mZm) {
        i = this.nbp;
      } else {
        i = 180;
      }
    }
    return false;
  }
  
  public final String aPt()
  {
    GMTrace.i(7354191970304L, 54793);
    String str = this.idM;
    GMTrace.o(7354191970304L, 54793);
    return str;
  }
  
  public final float aPu()
  {
    GMTrace.i(7354594623488L, 54796);
    float f = this.naZ;
    GMTrace.o(7354594623488L, 54796);
    return f;
  }
  
  public final long aPv()
  {
    GMTrace.i(7354863058944L, 54798);
    if (this.nbI != null)
    {
      long l = this.nbI.aPO();
      GMTrace.o(7354863058944L, 54798);
      return l;
    }
    GMTrace.o(7354863058944L, 54798);
    return 0L;
  }
  
  public final f aPw()
  {
    GMTrace.i(16371878461440L, 121980);
    f localf = this.nbt;
    GMTrace.o(16371878461440L, 121980);
    return localf;
  }
  
  public final d.c aPx()
  {
    GMTrace.i(18671967666176L, 139117);
    d.c localc = this.naU.ncn;
    GMTrace.o(18671967666176L, 139117);
    return localc;
  }
  
  public final int aPy()
  {
    GMTrace.i(7355399929856L, 54802);
    int i = Math.round(this.naY / 1000.0F);
    GMTrace.o(7355399929856L, 54802);
    return i;
  }
  
  public final Point aPz()
  {
    GMTrace.i(7355534147584L, 54803);
    Point localPoint = new Point(this.nbd, this.nbe);
    GMTrace.o(7355534147584L, 54803);
    return localPoint;
  }
  
  public final int b(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    GMTrace.i(7353118228480L, 54785);
    w.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "start, cameraOrientation: %s, isLandscape: %s, degree: %s", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt2) });
    this.nbN.reset();
    this.naY = 0;
    this.nbO.reset();
    this.nbm = false;
    this.hxo = paramBoolean;
    this.nbp = paramInt2;
    this.naU.a(d.c.nad);
    if (bg.nm(this.naX))
    {
      w.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "start error, mCurRecordPath is null!!");
      GMTrace.o(7353118228480L, 54785);
      return -1;
    }
    try
    {
      this.mFileName = com.tencent.mm.a.e.bc(this.naX);
      String str2 = FileOp.kZ(this.naX);
      String str1 = str2;
      if (!str2.endsWith("/")) {
        str1 = str2 + "/";
      }
      this.nbg = (str1 + "tempRotate.mp4");
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "retrieve file name error: %s", new Object[] { localException.getMessage() });
        continue;
        this.naU.a(d.c.nam);
      }
    }
    w.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "mCurRecordPath: %s, tempRotateFilePath: %s", new Object[] { this.naX, this.nbg });
    this.nbf = paramInt1;
    this.nbK = com.tencent.mm.sdk.f.e.cK("BigSightMediaCodecMP4MuxRecorder_writeYuvData_" + hashCode(), -1);
    this.nbK.start();
    this.nbL = new ae(this.nbK.getLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(7350568091648L, 54766);
        n localn;
        long l;
        Object localObject2;
        int j;
        int k;
        int i;
        boolean bool1;
        if (paramAnonymousMessage.what == 1)
        {
          paramAnonymousMessage = (byte[])paramAnonymousMessage.obj;
          localn = n.this;
          if (localn.nbI != null)
          {
            localn.nbN.cS(1L);
            l = bg.Pw();
            localObject2 = localn.nbI;
            j = localn.nbd;
            k = localn.nbe;
            bg.Pw();
            i = ((r)localObject2).nbY;
            bool1 = ((r)localObject2).mZm;
            if (bool1) {
              break label708;
            }
            if ((((r)localObject2).nbZ == -1) || (((r)localObject2).nbZ == ((r)localObject2).nbY)) {
              break label702;
            }
            bool1 = true;
            i = ((r)localObject2).nbZ;
            if (((r)localObject2).nbY > 180) {
              break label687;
            }
            i -= ((r)localObject2).nbY;
            i = Math.max(0, i);
            if (i < 360) {
              break label760;
            }
            i = 0;
          }
        }
        for (;;)
        {
          label162:
          int m = ((r)localObject2).nbY;
          if ((((r)localObject2).nbZ != -1) && (((r)localObject2).nbZ != ((r)localObject2).nbY)) {
            m = ((r)localObject2).nbZ;
          }
          for (;;)
          {
            int n;
            label214:
            int i1;
            label231:
            boolean bool2;
            if ((m == 0) || (m == 180))
            {
              n = j;
              if ((m != 0) && (m != 180)) {
                break label742;
              }
              i1 = k;
              if ((n != ((r)localObject2).mAB) || (i1 != ((r)localObject2).lhd)) {
                break label748;
              }
              bool2 = false;
              label254:
              if ((((r)localObject2).nca == -1) || (((r)localObject2).ncb == -1) || ((((r)localObject2).nca == ((r)localObject2).mAB) && (((r)localObject2).ncb == ((r)localObject2).lhd))) {
                break label754;
              }
              bool2 = true;
            }
            label687:
            label702:
            label708:
            label742:
            label748:
            label754:
            for (;;)
            {
              w.d("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "writeData, needRotateEachFrame: %s, needScale: %s, width: %s, height: %s, rotate: %s, needRotate %s srcWidth %d srcHeight %d determinRotate %d", new Object[] { Boolean.valueOf(((r)localObject2).mZm), Boolean.valueOf(bool2), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i), Boolean.valueOf(bool1), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(m) });
              Object localObject1 = new b(n, i1, ((r)localObject2).mZX, ((r)localObject2).mAB, ((r)localObject2).lhd, bool2, bool1, i, paramAnonymousMessage);
              localObject2 = ((r)localObject2).ncc;
              if (!((a)localObject2).mZM)
              {
                if (((a)localObject2).handler == null) {
                  ((a)localObject2).handler = new ae(Looper.myLooper());
                }
                i = ((a)localObject2).mZI % a.mZG;
                if (localObject2.mZH[i] != null)
                {
                  j = ((a)localObject2).mZI;
                  Looper localLooper = localObject2.mZH[i].getLooper();
                  b.a locala = ((a)localObject2).mZN;
                  ((b)localObject1).mZU = j;
                  ((b)localObject1).mZY = i;
                  ((b)localObject1).tick = bg.Pw();
                  w.i("MicroMsg.FrameBufProcessor", "create framebuf %d %d", new Object[] { Integer.valueOf(((b)localObject1).mZR.length), Integer.valueOf(((b)localObject1).mZU) });
                  new ae(localLooper).post(new b.1((b)localObject1, locala));
                  ((a)localObject2).mZI += 1;
                }
              }
              w.d("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "writeYuvData used %sms", new Object[] { Long.valueOf(bg.aI(l)) });
              if ((!localn.nbm) && (localn.nbs))
              {
                localn.nbm = true;
                localObject1 = new byte[paramAnonymousMessage.length];
                System.arraycopy(paramAnonymousMessage, 0, localObject1, 0, paramAnonymousMessage.length);
                com.tencent.mm.sdk.f.e.post(new n.9(localn, (byte[])localObject1), "BigSightMediaCodecMP4MuxRecorder_saveThumb");
              }
              localn.nbo = true;
              GMTrace.o(7350568091648L, 54766);
              return;
              i += 360 - ((r)localObject2).nbY;
              break;
              bool1 = false;
              break label162;
              if (((r)localObject2).nbZ == -1)
              {
                i = ((r)localObject2).nbY;
                break label162;
              }
              i = ((r)localObject2).nbZ;
              break label162;
              n = k;
              break label214;
              i1 = j;
              break label231;
              bool2 = true;
              break label254;
            }
          }
          label760:
          bool1 = true;
        }
      }
    };
    if (!this.gaO)
    {
      qL(paramInt1);
      this.gaO = true;
    }
    paramInt1 = this.nbH.a(new c.a()
    {
      public final void aPr()
      {
        GMTrace.i(7367479525376L, 54892);
        w.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "onPcmReady");
        if (n.this.naU.ncn != d.c.nam)
        {
          w.w("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "not MediaStatus.Initialized, maybe canceled by user");
          GMTrace.o(7367479525376L, 54892);
          return;
        }
        q localq = n.this.nbI;
        w.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "Start");
        localq.isStart = true;
        localq.startTime = System.currentTimeMillis();
        n.this.naU.a(d.c.nae);
        GMTrace.o(7367479525376L, 54892);
      }
    });
    w.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "start aacRecorder ret: %s", new Object[] { Integer.valueOf(paramInt1) });
    this.nbo = false;
    if (paramInt1 != 0)
    {
      this.naU.a(d.c.nak);
      com.tencent.mm.plugin.mmsight.model.k.aPd();
      w.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecCapture");
      com.tencent.mm.plugin.report.service.g.ork.a(440L, 2L, 1L, false);
      GMTrace.o(7353118228480L, 54785);
      return paramInt1;
    }
  }
  
  public final void cancel()
  {
    GMTrace.i(7353655099392L, 54789);
    w.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "cancel record");
    if ((this.nbI == null) || (this.nbH == null))
    {
      w.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "error, yuvRecorder or aacRecorder is null");
      GMTrace.o(7353655099392L, 54789);
      return;
    }
    this.naU.a(d.c.nag);
    this.nbI.a(null);
    this.nbH.a(new c.b()
    {
      public final void aPs()
      {
        GMTrace.i(7359560679424L, 54833);
        w.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "aac stop finish");
        GMTrace.o(7359560679424L, 54833);
      }
    });
    if ((this.nbK != null) && (this.nbL != null))
    {
      this.nbL.removeMessages(0);
      this.nbK.quit();
      this.nbL = null;
    }
    SightVideoJNI.releaseBigSightDataBuffer(this.nap);
    this.naU.a(d.c.nah);
    reset();
    GMTrace.o(7353655099392L, 54789);
  }
  
  public final String getFileName()
  {
    GMTrace.i(7354460405760L, 54795);
    String str = this.mFileName;
    GMTrace.o(7354460405760L, 54795);
    return str;
  }
  
  public final String getFilePath()
  {
    GMTrace.i(7354326188032L, 54794);
    String str = this.naX;
    GMTrace.o(7354326188032L, 54794);
    return str;
  }
  
  public final void k(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(7355131494400L, 54800);
    w.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "setSize, width: %s, height: %s, targetWidth: %s, targetHeight: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    w.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "setSize, after align, targetWidth: %d, targetHeight: %d", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    this.nba = paramInt3;
    this.nbb = paramInt4;
    this.nbd = paramInt1;
    this.nbe = paramInt2;
    if (j.naP.h(Integer.valueOf(paramInt1 * paramInt2 * 3 / 2)) == null)
    {
      w.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "preloadCameraData, width: %s, height: %s, count: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(3) });
      long l = bg.Pw();
      paramInt3 = 0;
      while (paramInt3 < 3)
      {
        j.naP.x(new byte[paramInt1 * paramInt2 * 3 / 2]);
        paramInt3 += 1;
      }
      w.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "preloadCameraData used %sms", new Object[] { Long.valueOf(bg.aI(l)) });
    }
    GMTrace.o(7355131494400L, 54800);
  }
  
  public final void pause()
  {
    GMTrace.i(7355802583040L, 54805);
    w.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "pause");
    if ((this.naU != null) && (this.naU.ncn == d.c.nae)) {
      this.naU.a(d.c.nan);
    }
    GMTrace.o(7355802583040L, 54805);
  }
  
  public final boolean qJ(int paramInt)
  {
    GMTrace.i(7352984010752L, 54784);
    if (!this.gaO)
    {
      w.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "preInit, cameraOrientation");
      boolean bool = qL(paramInt);
      this.gaO = true;
      w.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "initImpl result: %s", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(7352984010752L, 54784);
      return bool;
    }
    GMTrace.o(7352984010752L, 54784);
    return true;
  }
  
  public final void reset()
  {
    GMTrace.i(7354728841216L, 54797);
    w.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "reset, yuvRecorder: %s, aacRecorder: %s, muxer: %s", new Object[] { this.nbI, this.nbH, this.nbJ });
    this.nbI = null;
    this.nbH = null;
    this.nbJ = null;
    this.gaO = false;
    this.nbo = false;
    GMTrace.o(7354728841216L, 54797);
  }
  
  public final void setFilePath(String paramString)
  {
    GMTrace.i(7353789317120L, 54790);
    this.naX = paramString;
    GMTrace.o(7353789317120L, 54790);
  }
  
  public final void x(Runnable paramRunnable)
  {
    GMTrace.i(7353252446208L, 54786);
    this.nbP = paramRunnable;
    w.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "!!!!!stop, stopCallback: %s!!!", new Object[] { paramRunnable });
    if ((this.nbI == null) || (this.nbH == null))
    {
      w.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "error, yuvRecorder or aacRecorder is null");
      if (paramRunnable != null) {
        af.t(paramRunnable);
      }
      GMTrace.o(7353252446208L, 54786);
      return;
    }
    if ((this.naU != null) && (this.naU.ncn == d.c.nah))
    {
      w.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "stop, already in stop status");
      if (this.nbH != null) {
        this.nbH.clear();
      }
      if (this.nbI != null) {
        this.nbI.clear();
      }
      if (paramRunnable != null) {
        af.t(paramRunnable);
      }
      GMTrace.o(7353252446208L, 54786);
      return;
    }
    this.nbt = null;
    this.naY = ((int)this.nbI.aPO());
    if (this.naU != null) {
      this.naU.a(d.c.naf);
    }
    this.nbI.a(new f.a()
    {
      public final void aPG()
      {
        GMTrace.i(7352447139840L, 54780);
        com.tencent.mm.sdk.f.e.post(new n.6(n.this), "MMSightMediaCodecMP4MuxRecorder_stop");
        GMTrace.o(7352447139840L, 54780);
      }
    });
    this.nbH.a(new c.b()
    {
      public final void aPs()
      {
        GMTrace.i(7368553267200L, 54900);
        w.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "aac stop finish");
        GMTrace.o(7368553267200L, 54900);
      }
    });
    GMTrace.o(7353252446208L, 54786);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */