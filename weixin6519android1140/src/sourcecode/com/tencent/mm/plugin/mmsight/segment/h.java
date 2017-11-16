package com.tencent.mm.plugin.mmsight.segment;

import android.graphics.Point;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.d.s;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;

public final class h
  implements e.a
{
  private static int nei;
  int eSp;
  private Object lock;
  private int mZV;
  private int mZW;
  public String ncL;
  long ncM;
  long ncN;
  int ncP;
  Thread ncW;
  VideoTransPara ndN;
  private int ndW;
  private int ndX;
  private int ndY;
  private int ndZ;
  private int nea;
  private int neb;
  a nec;
  private int ned;
  MediaExtractor nee;
  int nef;
  e neg;
  private boolean neh;
  private MediaFormat nej;
  
  static
  {
    GMTrace.i(7444117848064L, 55463);
    nei = -1;
    GMTrace.o(7444117848064L, 55463);
  }
  
  public h()
  {
    GMTrace.i(7443178323968L, 55456);
    this.ncM = -1L;
    this.ncN = -1L;
    this.ned = 0;
    this.neh = false;
    this.lock = new byte[0];
    this.ncP = -1;
    GMTrace.o(7443178323968L, 55456);
  }
  
  public static int aQh()
  {
    GMTrace.i(7443312541696L, 55457);
    int i = CaptureMMProxy.getInstance().getInt(w.a.vvC, -1);
    if (i != -1)
    {
      if (i == 1) {
        if (d.et(21)) {
          nei = 2;
        }
      }
      for (;;)
      {
        i = nei;
        GMTrace.o(7443312541696L, 55457);
        return i;
        nei = 1;
        continue;
        if (i == 2) {
          nei = 1;
        } else {
          nei = 3;
        }
      }
    }
    if (nei != -1)
    {
      i = nei;
      GMTrace.o(7443312541696L, 55457);
      return i;
    }
    i = p.fQJ.fQU;
    if (i != -1) {
      if (i == 1) {
        nei = 1;
      }
    }
    for (;;)
    {
      i = nei;
      GMTrace.o(7443312541696L, 55457);
      return i;
      if (i == 2)
      {
        if (d.et(21)) {
          nei = 2;
        } else {
          nei = 1;
        }
      }
      else if (i == 3)
      {
        do
        {
          nei = 3;
          break;
        } while (!d.et(bg.getInt(CaptureMMProxy.getInstance().getDynamicConfig("SightSegCutMinApiLevel"), 21)));
        nei = 1;
      }
    }
  }
  
  private static Point l(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(7443715194880L, 55460);
    w.d("MicroMsg.MediaCodecFFMpegTranscoder", "scale() called with: decoderOutputWidth = [" + paramInt1 + "], decoderOutputHeight = [" + paramInt2 + "], specWidth = [" + paramInt3 + "], specHeight = [" + paramInt4 + "]");
    if ((paramInt1 <= paramInt3) && (paramInt2 <= paramInt4))
    {
      w.i("MicroMsg.MediaCodecFFMpegTranscoder", "calc scale, small or equal to spec size");
      GMTrace.o(7443715194880L, 55460);
      return null;
    }
    int m = Math.max(paramInt1, paramInt2);
    int k = Math.min(paramInt1, paramInt2);
    int i = Math.max(paramInt3, paramInt4);
    int j = Math.min(paramInt3, paramInt4);
    if ((m % 16 == 0) && (Math.abs(m - i) < 16) && (k % 16 == 0) && (Math.abs(k - j) < 16))
    {
      w.i("MicroMsg.MediaCodecFFMpegTranscoder", "calc scale, same len divide by 16, no need scale");
      GMTrace.o(7443715194880L, 55460);
      return null;
    }
    if ((m / 2 == i) && (k / 2 == j))
    {
      w.i("MicroMsg.MediaCodecFFMpegTranscoder", "calc scale, double ratio");
      paramInt4 = paramInt1 / 2;
      paramInt3 = paramInt2 / 2;
      paramInt1 = paramInt4;
      if (paramInt4 % 2 != 0) {
        paramInt1 = paramInt4 + 1;
      }
      paramInt2 = paramInt3;
      if (paramInt3 % 2 != 0) {
        paramInt2 = paramInt3 + 1;
      }
      localPoint = new Point(paramInt1, paramInt2);
      GMTrace.o(7443715194880L, 55460);
      return localPoint;
    }
    m /= 2;
    k /= 2;
    if ((m % 16 == 0) && (Math.abs(m - i) < 16) && (k % 16 == 0) && (Math.abs(k - j) < 16))
    {
      w.i("MicroMsg.MediaCodecFFMpegTranscoder", "calc scale, double ratio divide by 16");
      paramInt4 = paramInt1 / 2;
      paramInt3 = paramInt2 / 2;
      paramInt1 = paramInt4;
      if (paramInt4 % 2 != 0) {
        paramInt1 = paramInt4 + 1;
      }
      paramInt2 = paramInt3;
      if (paramInt3 % 2 != 0) {
        paramInt2 = paramInt3 + 1;
      }
      localPoint = new Point(paramInt1, paramInt2);
      GMTrace.o(7443715194880L, 55460);
      return localPoint;
    }
    Point localPoint = new Point();
    double d;
    if (paramInt1 < paramInt2)
    {
      paramInt3 = Math.min(paramInt3, paramInt4);
      d = 1.0D * paramInt1 / paramInt3;
      paramInt2 = (int)(paramInt2 / d);
      paramInt1 = paramInt3;
    }
    for (;;)
    {
      paramInt3 = paramInt2;
      if (paramInt2 % 2 != 0) {
        paramInt3 = paramInt2 + 1;
      }
      paramInt2 = paramInt1;
      if (paramInt1 % 2 != 0) {
        paramInt2 = paramInt1 + 1;
      }
      w.i("MicroMsg.MediaCodecFFMpegTranscoder", "calc scale, outputsize: %s %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      localPoint.x = paramInt2;
      localPoint.y = paramInt3;
      GMTrace.o(7443715194880L, 55460);
      return localPoint;
      paramInt3 = Math.min(paramInt3, paramInt4);
      d = 1.0D * paramInt2 / paramInt3;
      paramInt1 = (int)(paramInt1 / d);
      paramInt2 = paramInt3;
    }
  }
  
  public final void ay(byte[] paramArrayOfByte)
  {
    GMTrace.i(7443983630336L, 55462);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      w.i("MicroMsg.MediaCodecFFMpegTranscoder", "onYuvDataImp error data is null!!");
      GMTrace.o(7443983630336L, 55462);
      return;
    }
    Point localPoint1 = this.neg.aPT();
    this.mZV = localPoint1.x;
    this.mZW = localPoint1.y;
    Point localPoint2;
    if ((this.neb <= 0) || (this.nea <= 0))
    {
      localPoint2 = l(this.mZV, this.mZW, this.ndW, this.ndX);
      if (localPoint2 == null) {
        break label548;
      }
      this.nea = localPoint2.x;
    }
    int k;
    int m;
    boolean bool;
    for (this.neb = localPoint2.y;; this.neb = this.mZW)
    {
      w.i("MicroMsg.MediaCodecFFMpegTranscoder", "scaleYuvTargetWidth: %s, scaleYuvTargetHeight: %s, srcWidth: %s, srcHeight: %s", new Object[] { Integer.valueOf(this.nea), Integer.valueOf(this.neb), Integer.valueOf(this.mZV), Integer.valueOf(this.mZW) });
      long l = bg.Pw();
      int i = 0;
      int j = 0;
      if (this.nej != null)
      {
        k = this.nej.getInteger("width");
        m = this.nej.getInteger("height");
        if (this.ndY > 0)
        {
          i = k;
          j = m;
          if (this.ndZ > 0) {}
        }
        else
        {
          localPoint2 = l(k, m, this.ndW, this.ndX);
          if (localPoint2 == null) {
            break;
          }
          this.ndY = localPoint2.x;
          this.ndZ = localPoint2.y;
          bool = true;
          if (bool)
          {
            this.nea = this.ndY;
            this.neb = this.ndZ;
          }
          w.i("MicroMsg.MediaCodecFFMpegTranscoder", "videoTargetWidth: %s, videoTargetHeight: %s, initWidth: %s, initHeight: %s, videoNeedScale: %s", new Object[] { Integer.valueOf(this.ndY), Integer.valueOf(this.ndZ), Integer.valueOf(k), Integer.valueOf(m), Boolean.valueOf(bool) });
          j = m;
          i = k;
        }
      }
      this.ned = this.neg.aPW();
      i = MP4MuxerJNI.writeYuvDataForSegment(paramArrayOfByte, localPoint1.x, localPoint1.y, this.nea, this.neb, this.ned, i, j);
      w.i("MicroMsg.MediaCodecFFMpegTranscoder", "writeYuvDataForSegment used %sms", new Object[] { Long.valueOf(bg.aI(l)) });
      if (i < 0) {
        w.e("MicroMsg.MediaCodecFFMpegTranscoder", "writeYuvDataForSegment error: %s", new Object[] { Integer.valueOf(i) });
      }
      if (this.nec == null)
      {
        MP4MuxerJNI.initH264Encoder(this.ndY, this.ndZ, this.ndN.fps, this.ndN.videoBitrate, this.ndN.gBn, 8, this.ndN.gBm, 23.0F);
        this.nec = new a();
        this.ncW = com.tencent.mm.sdk.f.e.b(this.nec, "MediaCodecFFMpegTranscoder_Encoder");
        this.ncW.start();
        w.i("MicroMsg.MediaCodecFFMpegTranscoder", "initAndStartEncoder");
      }
      GMTrace.o(7443983630336L, 55462);
      return;
      label548:
      this.nea = this.mZV;
    }
    if ((Math.abs(m - localPoint1.y) > 0) && (k == localPoint1.x)) {
      this.ndY = k;
    }
    for (this.ndZ = m;; this.ndZ = localPoint1.y)
    {
      bool = false;
      break;
      this.ndY = localPoint1.x;
    }
  }
  
  public final int c(MediaFormat paramMediaFormat)
  {
    GMTrace.i(7443446759424L, 55458);
    w.i("MicroMsg.MediaCodecFFMpegTranscoder", "initDecoder, format: %s, filePath: %s", new Object[] { paramMediaFormat, this.ncL });
    this.nej = paramMediaFormat;
    int i = aQh();
    if (i == 1)
    {
      this.neg = new i(this.nee, paramMediaFormat, this.nef);
      this.neh = false;
    }
    for (;;)
    {
      if (this.neg == null)
      {
        w.i("MicroMsg.MediaCodecFFMpegTranscoder", "use default config");
        this.neg = new i(this.nee, paramMediaFormat, this.nef);
        this.neh = false;
      }
      int j = this.neg.o(this.ncL, this.ncM, this.ncN);
      w.i("MicroMsg.MediaCodecFFMpegTranscoder", "init decoder ret: %s", new Object[] { Integer.valueOf(j) });
      i = j;
      if (j < 0) {
        if (nei != 1)
        {
          i = j;
          if (nei != 2) {}
        }
        else
        {
          w.i("MicroMsg.MediaCodecFFMpegTranscoder", "init mediaCodecDecoder failed, try ffmepg");
        }
      }
      try
      {
        this.neg.stop();
        this.neg = null;
        this.neg = new b();
        this.neh = true;
        nei = 3;
        i = this.neg.o(this.ncL, this.ncM, this.ncN);
        this.neg.a(this);
        w.i("MicroMsg.MediaCodecFFMpegTranscoder", "init finish, ret: %d, decoderType: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(nei) });
        GMTrace.o(7443446759424L, 55458);
        return i;
        if (i == 2)
        {
          this.neg = new j(this.nee, paramMediaFormat, this.nef);
          this.neh = false;
          continue;
        }
        this.neg = new b();
        this.neh = true;
      }
      catch (Exception paramMediaFormat)
      {
        for (;;) {}
      }
    }
  }
  
  public final void cu(int paramInt1, int paramInt2)
  {
    GMTrace.i(7443580977152L, 55459);
    w.i("MicroMsg.MediaCodecFFMpegTranscoder", "registerDesiredSize: %s, %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.ndW = paramInt1;
    this.ndX = paramInt2;
    GMTrace.o(7443580977152L, 55459);
  }
  
  public final void release()
  {
    GMTrace.i(7443849412608L, 55461);
    w.i("MicroMsg.MediaCodecFFMpegTranscoder", "release, decoderType: %d", new Object[] { Integer.valueOf(nei) });
    try
    {
      if (this.neg != null) {
        this.neg.stop();
      }
      MP4MuxerJNI.releaseDataBuf(0);
      nei = -1;
      GMTrace.o(7443849412608L, 55461);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MediaCodecFFMpegTranscoder", "release error: %s", new Object[] { localException.getMessage() });
      MP4MuxerJNI.releaseDataBuf(0);
      nei = -1;
      GMTrace.o(7443849412608L, 55461);
      return;
    }
    finally
    {
      MP4MuxerJNI.releaseDataBuf(0);
      nei = -1;
    }
  }
  
  private final class a
    implements Runnable
  {
    Object nbD;
    int nbk;
    volatile int nbw;
    boolean ncX;
    
    public a()
    {
      GMTrace.i(7483443642368L, 55756);
      this.nbD = new Object();
      GMTrace.o(7483443642368L, 55756);
    }
    
    public final void run()
    {
      GMTrace.i(7483577860096L, 55757);
      if (this.nbk == -1)
      {
        this.nbk = Process.myTid();
        Process.setThreadPriority(Process.myTid(), -2);
        w.i("MicroMsg.MediaCodecFFMpegTranscoder", "encodeTid: %s", new Object[] { Integer.valueOf(this.nbk) });
      }
      this.nbw = 0;
      for (;;)
      {
        int i;
        synchronized (this.nbD)
        {
          if (this.ncX) {
            break label191;
          }
          l = bg.Pw();
          w.i("MicroMsg.MediaCodecFFMpegTranscoder", "try trigger encode");
          i = MP4MuxerJNI.triggerEncodeForSegment(Math.max(0, this.nbw), false);
          w.i("MicroMsg.MediaCodecFFMpegTranscoder", "ing: trigger encode use %dms, Encode index[%d, %d), threadId: %s", new Object[] { Long.valueOf(bg.aI(l)), Integer.valueOf(this.nbw), Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()) });
          int j = this.nbw;
          if (i != j) {}
        }
        try
        {
          Thread.sleep(20L);
          this.nbw = i;
          continue;
          localObject2 = finally;
          throw ((Throwable)localObject2);
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e("MicroMsg.MediaCodecFFMpegTranscoder", "thread sleep error");
          }
        }
      }
      label191:
      long l = bg.Pw();
      this.nbw = MP4MuxerJNI.triggerEncodeForSegment(this.nbw, true);
      w.i("MicroMsg.MediaCodecFFMpegTranscoder", "end: trigger encode use %dms, curEncode index %d, threadId: %s", new Object[] { Long.valueOf(bg.aI(l)), Integer.valueOf(this.nbw), Long.valueOf(Thread.currentThread().getId()) });
      GMTrace.o(7483577860096L, 55757);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\segment\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */