package com.tencent.mm.plugin.mmsight.model.a;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.EncoderCapabilities;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.mmsight.model.k;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import java.nio.ByteBuffer;

@TargetApi(16)
public class r
  implements f
{
  private int bitrate;
  public boolean exl;
  int frameCount;
  private int hwX;
  private int hwY;
  public boolean isStart;
  int lhd;
  int mAB;
  private ByteBuffer[] mVR;
  private ByteBuffer[] mVT;
  int mZX;
  boolean mZm;
  private o naB;
  protected MediaCodec naq;
  private int nax;
  int nbY;
  int nbZ;
  int nca;
  int ncb;
  public a ncc;
  protected MediaFormat ncd;
  private long nce;
  private int ncf;
  private MediaCodec.BufferInfo ncg;
  private boolean nch;
  private int nci;
  private int ncj;
  public f.a nck;
  private a.a ncl;
  long startTime;
  
  public r(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean)
  {
    GMTrace.i(7346541559808L, 54736);
    this.startTime = 0L;
    this.nce = 0L;
    this.ncf = -1;
    this.nax = -1;
    this.bitrate = 0;
    this.isStart = false;
    this.exl = false;
    this.nch = false;
    this.nbY = -1;
    this.nbZ = -1;
    this.nca = -1;
    this.ncb = -1;
    this.mZm = false;
    this.ncl = new a.a()
    {
      public final void output(byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(7374593064960L, 54945);
        long l = bg.Pw();
        boolean bool2 = r.this.ncc.aPo();
        r localr = r.this;
        if ((bool2) && (r.this.exl)) {}
        for (boolean bool1 = true;; bool1 = false)
        {
          localr.c(paramAnonymousArrayOfByte, bool1);
          j.naP.x(paramAnonymousArrayOfByte);
          w.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "markStop: %s isEnd %s costTime %d", new Object[] { Boolean.valueOf(r.this.exl), Boolean.valueOf(bool2), Long.valueOf(bg.aI(l)) });
          if ((bool2) && (r.this.exl)) {
            r.this.aPR();
          }
          GMTrace.o(7374593064960L, 54945);
          return;
        }
      }
    };
    this.ncc = new a(this.ncl);
    this.hwX = paramInt1;
    this.hwY = paramInt2;
    w.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "create MMSightYUVMediaCodecRecorder, init targetWidth: %d, targetHeight: %d", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    w.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "create MMSightYUVMediaCodecRecorder, after align 16, targetWidth: %d, targetHeight: %d", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    this.mAB = paramInt3;
    this.lhd = paramInt4;
    this.ncj = paramInt7;
    this.nci = paramInt6;
    this.naB = null;
    this.ncg = new MediaCodec.BufferInfo();
    this.bitrate = paramInt5;
    this.mZm = paramBoolean;
    w.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "create BigSightMediaCodecYUVRecorder, frameWidth: %s, frameHeight: %s, targetWidth: %s, targetHeight: %s, bitrate: %s, needRotateEachFrame: %s, muxer: %s", new Object[] { Integer.valueOf(this.hwX), Integer.valueOf(this.hwY), Integer.valueOf(this.mAB), Integer.valueOf(this.lhd), Integer.valueOf(paramInt5), Boolean.valueOf(paramBoolean), null });
    GMTrace.o(7346541559808L, 54736);
  }
  
  private int aPP()
  {
    GMTrace.i(7346809995264L, 54738);
    long l1 = bg.Pw();
    int k = MediaCodecList.getCodecCount();
    int i = 0;
    MediaCodecInfo localMediaCodecInfo;
    Object localObject1;
    int j;
    if (i < k)
    {
      localMediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
      if (localMediaCodecInfo.isEncoder())
      {
        localObject1 = localMediaCodecInfo.getSupportedTypes();
        j = 0;
        label47:
        if (j < localObject1.length) {
          if (!localObject1[j].equalsIgnoreCase("video/avc")) {}
        }
      }
    }
    for (;;)
    {
      if (localMediaCodecInfo != null) {
        break label111;
      }
      w.e("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "Unable to find an appropriate codec for video/avc");
      k.aPg();
      GMTrace.o(7346809995264L, 54738);
      return -1;
      j += 1;
      break label47;
      i += 1;
      break;
      localMediaCodecInfo = null;
    }
    label111:
    w.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "found codec: %s, used %sms", new Object[] { localMediaCodecInfo.getName(), Long.valueOf(bg.aI(l1)) });
    l1 = bg.Pw();
    if (CaptureMMProxy.getInstance() != null)
    {
      i = CaptureMMProxy.getInstance().getInt(w.a.vvG, -1);
      w.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "saveColorFormat: %s", new Object[] { Integer.valueOf(i) });
      if (i > 0)
      {
        this.mZX = i;
        l1 = bg.aI(l1);
        if ((this.mZX > 0) && (l1 > 200L) && (CaptureMMProxy.getInstance() != null)) {
          CaptureMMProxy.getInstance().set(w.a.vvG, Integer.valueOf(this.mZX));
        }
        w.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "found colorFormat: %s, used %sms", new Object[] { Integer.valueOf(this.mZX), Long.valueOf(l1) });
        l1 = bg.Pw();
        if (!this.mZm) {
          break label785;
        }
        if ((this.nbY != 180) && (this.nbY != 0)) {
          break label769;
        }
        i = this.mAB;
        label299:
        if ((this.nbY != 180) && (this.nbY != 0)) {
          break label777;
        }
        j = this.lhd;
        label321:
        this.ncd = MediaFormat.createVideoFormat("video/avc", i, j);
        label332:
        w.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "createVideoFormat used %sms", new Object[] { Long.valueOf(bg.aI(l1)) });
        if ((localMediaCodecInfo != null) && (!d.et(23))) {
          break label945;
        }
      }
    }
    for (;;)
    {
      try
      {
        localObject1 = localMediaCodecInfo.getCapabilitiesForType("video/avc");
        if (localObject1 != null)
        {
          localObject1 = ((MediaCodecInfo.CodecCapabilities)localObject1).profileLevels;
          if (localObject1 != null)
          {
            MediaCodecInfo.CodecProfileLevel localCodecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            localCodecProfileLevel.level = 0;
            localCodecProfileLevel.profile = 0;
            k = localObject1.length;
            i = 0;
            int m;
            int n;
            if (i < k)
            {
              Object localObject2 = localObject1[i];
              m = ((MediaCodecInfo.CodecProfileLevel)localObject2).profile;
              n = ((MediaCodecInfo.CodecProfileLevel)localObject2).level;
              w.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "profile: %s, level: %s", new Object[] { Integer.valueOf(m), Integer.valueOf(n) });
            }
            switch (m)
            {
            case 1: 
              if ((j != 0) && (m >= localCodecProfileLevel.profile) && (n >= localCodecProfileLevel.level))
              {
                localCodecProfileLevel.profile = m;
                localCodecProfileLevel.level = n;
              }
              i += 1;
              continue;
              long l2 = bg.Pw();
              localObject1 = localMediaCodecInfo.getCapabilitiesForType("video/avc");
              w.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "getCapabilitiesForType used %sms", new Object[] { Long.valueOf(bg.aI(l2)) });
              w.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "color format length: %s", new Object[] { Integer.valueOf(((MediaCodecInfo.CodecCapabilities)localObject1).colorFormats.length) });
              i = 0;
              j = 0;
              if (j < ((MediaCodecInfo.CodecCapabilities)localObject1).colorFormats.length)
              {
                n = localObject1.colorFormats[j];
                w.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "capabilities colorFormat: %s", new Object[] { Integer.valueOf(n) });
                switch (n)
                {
                default: 
                  m = 0;
                  k = i;
                  if (m != 0) {
                    if (n <= i)
                    {
                      k = i;
                      if (n != 21) {}
                    }
                    else
                    {
                      k = n;
                    }
                  }
                  j += 1;
                  i = k;
                  break;
                case 19: 
                case 21: 
                case 2130706688: 
                  m = 1;
                  break;
                }
              }
              w.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "codec: %s, colorFormat: %s", new Object[] { localMediaCodecInfo.getName(), Integer.valueOf(i) });
              break;
              i = this.lhd;
              break label299;
              j = this.mAB;
              break label321;
              if ((this.nbY == 180) || (this.nbY == 0))
              {
                i = this.lhd;
                if ((this.nbY != 180) && (this.nbY != 0)) {
                  continue;
                }
                j = this.mAB;
                this.ncd = MediaFormat.createVideoFormat("video/avc", i, j);
                break label332;
              }
              i = this.mAB;
              continue;
              j = this.lhd;
              break;
            case 2: 
            case 8: 
              label769:
              label777:
              label785:
              j = 1;
              continue;
              w.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "best profile: %s, level: %s", new Object[] { Integer.valueOf(localCodecProfileLevel.profile), Integer.valueOf(localCodecProfileLevel.level) });
              if ((localCodecProfileLevel.profile > 0) && (localCodecProfileLevel.level >= 256))
              {
                this.ncd.setInteger("profile", localCodecProfileLevel.profile);
                this.ncd.setInteger("level", 256);
              }
              break;
            }
          }
        }
      }
      catch (Exception localException1)
      {
        label945:
        w.e("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "trySetProfile error: %s", new Object[] { localException1.getMessage() });
        continue;
        if (localException1.isBitrateModeSupported(0))
        {
          w.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "support cq bitrate mode");
          this.ncd.setInteger("bitrate-mode", 0);
          continue;
        }
      }
      try
      {
        if (d.et(21))
        {
          localObject1 = localMediaCodecInfo.getCapabilitiesForType("video/avc");
          if (localObject1 != null)
          {
            localObject1 = ((MediaCodecInfo.CodecCapabilities)localObject1).getEncoderCapabilities();
            if (localObject1 != null)
            {
              if (!((MediaCodecInfo.EncoderCapabilities)localObject1).isBitrateModeSupported(2)) {
                continue;
              }
              w.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "support cbr bitrate mode");
              this.ncd.setInteger("bitrate-mode", 2);
            }
          }
        }
      }
      catch (Exception localException2)
      {
        w.e("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "trySetBitRateMode error: %s", new Object[] { localException2.getMessage() });
        continue;
        w.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "both cbr and cq bitrate mode not support!");
        continue;
      }
      this.ncd.setInteger("bitrate", this.bitrate);
      this.ncd.setInteger("frame-rate", this.ncj);
      this.ncd.setInteger("color-format", this.mZX);
      this.ncd.setInteger("i-frame-interval", this.nci);
      w.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "mediaFormat: %s", new Object[] { this.ncd });
      this.naq = MediaCodec.createByCodecName(localMediaCodecInfo.getName());
      this.naq.configure(this.ncd, null, null, 1);
      this.naq.start();
      GMTrace.o(7346809995264L, 54738);
      return 0;
      i = -1;
      break;
      j = 0;
    }
  }
  
  private void aPQ()
  {
    GMTrace.i(7347078430720L, 54740);
    this.nax = this.naq.dequeueOutputBuffer(this.ncg, 100L);
    w.v("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "outputBufferIndex-->" + this.nax);
    if (this.nax == -1)
    {
      w.d("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "no output from encoder available, break encoderEndStream %s", new Object[] { Boolean.valueOf(this.nch) });
      if (!this.nch) {}
    }
    label283:
    do
    {
      for (;;)
      {
        this.nax = this.naq.dequeueOutputBuffer(this.ncg, 100L);
        if (this.nax <= 0) {
          w.v("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "get outputBufferIndex %d", new Object[] { Integer.valueOf(this.nax) });
        }
        if ((this.nax >= 0) || (this.nch)) {
          break;
        }
        GMTrace.o(7347078430720L, 54740);
        return;
        if (this.nax == -3)
        {
          this.mVT = this.naq.getOutputBuffers();
          w.d("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "encoder output buffers changed");
        }
        else if (this.nax == -2)
        {
          localObject = this.naq.getOutputFormat();
          w.d("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "encoder output format changed: " + localObject);
          if (this.naB != null) {
            this.naB.a((MediaFormat)localObject);
          }
        }
        else
        {
          if (this.nax >= 0) {
            break label283;
          }
          w.w("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "unexpected result from encoder.dequeueOutputBuffer: " + this.nax);
        }
      }
      w.v("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "perform encoding");
      Object localObject = this.mVT[this.nax];
      if (localObject == null) {
        throw new RuntimeException("encoderOutputBuffer " + this.nax + " was null");
      }
      this.frameCount += 1;
      if ((this.ncg.flags & 0x2) != 0) {
        w.v("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "ignoring BUFFER_FLAG_CODEC_CONFIG, size: %s, %s", new Object[] { Integer.valueOf(this.ncg.size), Boolean.valueOf(false) });
      }
      if (this.ncg.size != 0)
      {
        if ((this.naB != null) && (!this.naB.isStart))
        {
          MediaFormat localMediaFormat = this.naq.getOutputFormat();
          this.naB.a(localMediaFormat);
        }
        ((ByteBuffer)localObject).position(this.ncg.offset);
        ((ByteBuffer)localObject).limit(this.ncg.offset + this.ncg.size);
        a((ByteBuffer)localObject, this.ncg);
      }
      this.naq.releaseOutputBuffer(this.nax, false);
    } while ((this.ncg.flags & 0x4) == 0);
    if (!this.exl)
    {
      w.e("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "reached end of stream unexpectedly");
      GMTrace.o(7347078430720L, 54740);
      return;
    }
    w.w("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "do stop encoder");
    try
    {
      this.naq.stop();
      this.naq.release();
      this.ncc.stop();
      this.naq = null;
      this.isStart = false;
      if (this.nck != null) {
        this.nck.aPG();
      }
      GMTrace.o(7347078430720L, 54740);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "do stop encoder error: %s", new Object[] { localException.getMessage() });
      GMTrace.o(7347078430720L, 54740);
    }
  }
  
  public final void a(f.a parama)
  {
    GMTrace.i(7347346866176L, 54742);
    this.nck = parama;
    this.exl = true;
    boolean bool = this.ncc.aPo();
    w.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "!!!stop, isStart!!: %s %s isEnd %s", new Object[] { Boolean.valueOf(this.isStart), this.nck, Boolean.valueOf(bool) });
    if (bool) {
      aPR();
    }
    GMTrace.o(7347346866176L, 54742);
  }
  
  protected void a(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    GMTrace.i(7347212648448L, 54741);
    if ((this.naB != null) && ((paramBufferInfo.flags & 0x4) == 0)) {
      this.naB.c(paramByteBuffer, paramBufferInfo);
    }
    GMTrace.o(7347212648448L, 54741);
  }
  
  public final long aPO()
  {
    GMTrace.i(7347615301632L, 54744);
    long l1 = System.currentTimeMillis();
    long l2 = this.startTime;
    GMTrace.o(7347615301632L, 54744);
    return l1 - l2;
  }
  
  public final void aPR()
  {
    GMTrace.i(7347481083904L, 54743);
    w.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "stopImp %s", new Object[] { bg.bQW().toString() });
    try
    {
      if (this.isStart) {
        af.i(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(7371371839488L, 54921);
            try
            {
              if (r.this.naq != null)
              {
                w.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "delay to stop encoder");
                r.this.ncc.stop();
                r.this.naq.stop();
                r.this.naq.release();
                r.this.naq = null;
                r.this.isStart = false;
                if (r.this.nck != null) {
                  r.this.nck.aPG();
                }
              }
              GMTrace.o(7371371839488L, 54921);
              return;
            }
            catch (Exception localException)
            {
              w.e("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "delay to stop encoder error: %s", new Object[] { localException.getMessage() });
              GMTrace.o(7371371839488L, 54921);
            }
          }
        }, 500L);
      }
      GMTrace.o(7347481083904L, 54743);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "stop error: %s", new Object[] { localException.getMessage() });
      GMTrace.o(7347481083904L, 54743);
    }
  }
  
  public final void c(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    GMTrace.i(7346944212992L, 54739);
    for (;;)
    {
      try
      {
        if (!this.isStart)
        {
          w.e("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "writeData, not start!");
          GMTrace.o(7346944212992L, 54739);
          return;
        }
        if (this.naq == null)
        {
          w.e("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "encoder is null");
          GMTrace.o(7346944212992L, 54739);
          return;
        }
        if ((this.naB != null) && (this.naB.nbW <= 0L)) {
          this.naB.nbW = System.nanoTime();
        }
        long l2 = bg.Pw();
        this.mVR = this.naq.getInputBuffers();
        this.mVT = this.naq.getOutputBuffers();
        int i = this.naq.dequeueInputBuffer(100L);
        this.ncf = i;
        if (i < 0)
        {
          w.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "video no input available, drain first");
          aPQ();
        }
        if (this.naq == null)
        {
          w.e("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "encoder is null");
          GMTrace.o(7346944212992L, 54739);
          return;
        }
        w.v("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "inputBufferIndex: %s", new Object[] { Integer.valueOf(this.ncf) });
        long l3 = bg.Pw();
        if (this.ncf >= 0)
        {
          long l4 = System.nanoTime();
          long l5 = paramArrayOfByte.length / 1600000 / 1000000000;
          long l1;
          if (this.naB != null)
          {
            l1 = this.naB.nbW;
            l1 = (l4 - l5 - l1) / 1000L;
            w.v("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "presentationTime: " + l1);
            ByteBuffer localByteBuffer = this.mVR[this.ncf];
            localByteBuffer.clear();
            localByteBuffer.put(paramArrayOfByte);
            localByteBuffer.position(0);
            if ((this.isStart) && (!paramBoolean))
            {
              this.naq.queueInputBuffer(this.ncf, 0, paramArrayOfByte.length, l1, 0);
              aPQ();
              w.v("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "encoder used %sms %sms", new Object[] { Long.valueOf(bg.aI(l2)), Long.valueOf(bg.aI(l3)) });
              GMTrace.o(7346944212992L, 54739);
            }
          }
          else
          {
            l1 = this.startTime;
            continue;
          }
          w.v("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "end of stream");
          this.nch = true;
          this.naq.queueInputBuffer(this.ncf, 0, paramArrayOfByte.length, l1, 4);
          continue;
        }
        w.v("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "input buffer not available");
      }
      catch (Exception paramArrayOfByte)
      {
        k.aPh();
        w.e("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "writeData error: %s", new Object[] { paramArrayOfByte.getMessage() });
        w.printErrStackTrace("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", paramArrayOfByte, "", new Object[0]);
        GMTrace.o(7346944212992L, 54739);
        return;
      }
    }
  }
  
  public void clear()
  {
    GMTrace.i(7347749519360L, 54745);
    w.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "clear");
    try
    {
      if (this.naq != null)
      {
        w.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "stop encoder");
        this.ncc.stop();
        this.naq.stop();
        this.naq.release();
        this.naq = null;
        this.isStart = false;
      }
      GMTrace.o(7347749519360L, 54745);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "clear error: %s", new Object[] { localException.getMessage() });
      GMTrace.o(7347749519360L, 54745);
    }
  }
  
  public int ct(int paramInt1, int paramInt2)
  {
    GMTrace.i(7346675777536L, 54737);
    try
    {
      this.nbY = paramInt2;
      paramInt1 = aPP();
      GMTrace.o(7346675777536L, 54737);
      return paramInt1;
    }
    catch (Exception localException1)
    {
      w.e("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "init error: %s, try to re-init again", new Object[] { localException1.getMessage() });
      try
      {
        if (CaptureMMProxy.getInstance() != null) {
          CaptureMMProxy.getInstance().set(w.a.vvG, Integer.valueOf(-1));
        }
        paramInt1 = aPP();
        GMTrace.o(7346675777536L, 54737);
        return paramInt1;
      }
      catch (Exception localException2)
      {
        w.e("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "re-init again error: %s", new Object[] { localException2.getMessage() });
        k.aPg();
        GMTrace.o(7346675777536L, 54737);
      }
    }
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\a\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */