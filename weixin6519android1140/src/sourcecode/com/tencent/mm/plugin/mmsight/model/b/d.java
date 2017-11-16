package com.tencent.mm.plugin.mmsight.model.b;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.EncoderCapabilities;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.mmsight.model.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.nio.ByteBuffer;

public final class d
{
  private int bitrate;
  private boolean exl;
  int frameCount;
  private int hwX;
  private int hwY;
  boolean isStart;
  int lhd;
  int mAB;
  private ByteBuffer[] mVR;
  private ByteBuffer[] mVT;
  int mZX;
  protected int nap;
  protected MediaCodec naq;
  private int nax;
  a ncR;
  int ncS;
  byte[] ncT;
  int ncU;
  protected MediaFormat ncd;
  private int ncf;
  private MediaCodec.BufferInfo ncg;
  private boolean nch;
  private int nci;
  private int ncj;
  
  public d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    GMTrace.i(20193728266240L, 150455);
    this.nap = -1;
    this.ncf = -1;
    this.nax = -1;
    this.bitrate = 0;
    this.isStart = false;
    this.exl = false;
    this.nch = false;
    this.hwX = paramInt1;
    this.hwY = paramInt2;
    w.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "create MMSightRemuxMediaCodecEncoder, init targetWidth: %d, targetHeight: %d", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    this.mAB = paramInt3;
    this.lhd = paramInt4;
    this.ncj = paramInt6;
    this.nci = 1;
    this.ncg = new MediaCodec.BufferInfo();
    this.bitrate = paramInt5;
    w.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "create MMSightRemuxMediaCodecEncoder, frameWidth: %s, frameHeight: %s, targetWidth: %s, targetHeight: %s, bitrate: %s", new Object[] { Integer.valueOf(this.hwX), Integer.valueOf(this.hwY), Integer.valueOf(this.mAB), Integer.valueOf(this.lhd), Integer.valueOf(paramInt5) });
    GMTrace.o(20193728266240L, 150455);
  }
  
  private int aPP()
  {
    GMTrace.i(20193996701696L, 150457);
    long l1 = bg.Pw();
    int k = MediaCodecList.getCodecCount();
    int i = 0;
    MediaCodecInfo localMediaCodecInfo;
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
      w.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "Unable to find an appropriate codec for video/avc");
      k.aPg();
      GMTrace.o(20193996701696L, 150457);
      return -1;
      j += 1;
      break label47;
      i += 1;
      break;
      localMediaCodecInfo = null;
    }
    label111:
    w.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "found codec: %s, used %sms", new Object[] { localMediaCodecInfo.getName(), Long.valueOf(bg.aI(l1)) });
    l1 = bg.Pw();
    i = 0;
    long l2 = bg.Pw();
    Object localObject1 = localMediaCodecInfo.getCapabilitiesForType("video/avc");
    w.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "getCapabilitiesForType used %sms", new Object[] { Long.valueOf(bg.aI(l2)) });
    w.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "color format length: %s", new Object[] { Integer.valueOf(((MediaCodecInfo.CodecCapabilities)localObject1).colorFormats.length) });
    j = 0;
    int n;
    int m;
    if (j < ((MediaCodecInfo.CodecCapabilities)localObject1).colorFormats.length)
    {
      k = localObject1.colorFormats[j];
      w.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "capabilities colorFormat: %s", new Object[] { Integer.valueOf(k) });
      switch (k)
      {
      }
      for (n = 0;; n = 1)
      {
        m = i;
        if (n != 0)
        {
          m = i;
          if (k > i)
          {
            i = k;
            if (k == 19) {
              break label326;
            }
            m = k;
          }
        }
        j += 1;
        i = m;
        break;
      }
    }
    label326:
    w.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "codec: %s, colorFormat: %s", new Object[] { localMediaCodecInfo.getName(), Integer.valueOf(i) });
    this.mZX = i;
    l1 = bg.aI(l1);
    w.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "found colorFormat: %s, used %sms", new Object[] { Integer.valueOf(this.mZX), Long.valueOf(l1) });
    if (this.mZX == 19)
    {
      this.ncU = 2;
      l1 = bg.Pw();
      this.ncd = MediaFormat.createVideoFormat("video/avc", this.mAB, this.lhd);
      w.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "createVideoFormat used %sms", new Object[] { Long.valueOf(bg.aI(l1)) });
      if ((localMediaCodecInfo != null) && (!com.tencent.mm.compatible.util.d.et(23))) {}
    }
    else
    {
      for (;;)
      {
        try
        {
          localObject1 = localMediaCodecInfo.getCapabilitiesForType("video/avc");
          if (localObject1 == null) {
            continue;
          }
          localObject1 = ((MediaCodecInfo.CodecCapabilities)localObject1).profileLevels;
          if (localObject1 == null) {
            continue;
          }
          localCodecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
          localCodecProfileLevel.level = 0;
          localCodecProfileLevel.profile = 0;
          k = localObject1.length;
          i = 0;
          if (i >= k) {
            continue;
          }
          Object localObject2 = localObject1[i];
          m = ((MediaCodecInfo.CodecProfileLevel)localObject2).profile;
          n = ((MediaCodecInfo.CodecProfileLevel)localObject2).level;
          w.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "profile: %s, level: %s", new Object[] { Integer.valueOf(m), Integer.valueOf(n) });
          switch (m)
          {
          }
        }
        catch (Exception localException1)
        {
          MediaCodecInfo.CodecProfileLevel localCodecProfileLevel;
          w.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "trySetProfile error: %s", new Object[] { localException1.getMessage() });
          continue;
          if (!localException1.isBitrateModeSupported(0)) {
            continue;
          }
          w.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "support cq bitrate mode");
          this.ncd.setInteger("bitrate-mode", 0);
          continue;
          j = 0;
          continue;
        }
        if ((j != 0) && (m >= localCodecProfileLevel.profile) && (n >= localCodecProfileLevel.level))
        {
          localCodecProfileLevel.profile = m;
          localCodecProfileLevel.level = n;
        }
        i += 1;
        continue;
        this.ncU = 1;
        break;
        j = 1;
      }
      w.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "best profile: %s, level: %s", new Object[] { Integer.valueOf(localCodecProfileLevel.profile), Integer.valueOf(localCodecProfileLevel.level) });
      if ((localCodecProfileLevel.profile > 0) && (localCodecProfileLevel.level >= 256))
      {
        this.ncd.setInteger("profile", localCodecProfileLevel.profile);
        this.ncd.setInteger("level", 256);
      }
    }
    try
    {
      if (com.tencent.mm.compatible.util.d.et(21))
      {
        localObject1 = localMediaCodecInfo.getCapabilitiesForType("video/avc");
        if (localObject1 != null)
        {
          localObject1 = ((MediaCodecInfo.CodecCapabilities)localObject1).getEncoderCapabilities();
          if (localObject1 != null)
          {
            if (!((MediaCodecInfo.EncoderCapabilities)localObject1).isBitrateModeSupported(2)) {
              break label940;
            }
            w.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "support cbr bitrate mode");
            this.ncd.setInteger("bitrate-mode", 2);
          }
        }
      }
    }
    catch (Exception localException2)
    {
      for (;;)
      {
        w.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "trySetBitRateMode error: %s", new Object[] { localException2.getMessage() });
        continue;
        w.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "both cbr and cq bitrate mode not support!");
      }
    }
    this.ncd.setInteger("bitrate", this.bitrate);
    this.ncd.setInteger("frame-rate", this.ncj);
    this.ncd.setInteger("color-format", this.mZX);
    this.ncd.setInteger("i-frame-interval", this.nci);
    w.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "mediaFormat: %s", new Object[] { this.ncd });
    this.naq = MediaCodec.createByCodecName(localMediaCodecInfo.getName());
    this.naq.configure(this.ncd, null, null, 1);
    this.naq.start();
    GMTrace.o(20193996701696L, 150457);
    return 0;
  }
  
  private void aPQ()
  {
    GMTrace.i(20194265137152L, 150459);
    this.nax = this.naq.dequeueOutputBuffer(this.ncg, 600L);
    w.v("MicroMsg.MMSightRemuxMediaCodecEncoder", "outputBufferIndex-->" + this.nax);
    if (this.nax == -1)
    {
      w.d("MicroMsg.MMSightRemuxMediaCodecEncoder", "no output from encoder available, break encoderEndStream %s", new Object[] { Boolean.valueOf(this.nch) });
      if (!this.nch) {}
    }
    label268:
    do
    {
      for (;;)
      {
        this.nax = this.naq.dequeueOutputBuffer(this.ncg, 600L);
        if (this.nax <= 0) {
          w.v("MicroMsg.MMSightRemuxMediaCodecEncoder", "get outputBufferIndex %d", new Object[] { Integer.valueOf(this.nax) });
        }
        if ((this.nax >= 0) || (this.nch)) {
          break;
        }
        GMTrace.o(20194265137152L, 150459);
        return;
        if (this.nax == -3)
        {
          this.mVT = this.naq.getOutputBuffers();
          w.d("MicroMsg.MMSightRemuxMediaCodecEncoder", "encoder output buffers changed");
        }
        else if (this.nax == -2)
        {
          localObject = this.naq.getOutputFormat();
          w.d("MicroMsg.MMSightRemuxMediaCodecEncoder", "encoder output format changed: " + localObject);
        }
        else
        {
          if (this.nax >= 0) {
            break label268;
          }
          w.w("MicroMsg.MMSightRemuxMediaCodecEncoder", "unexpected result from encoder.dequeueOutputBuffer: " + this.nax);
        }
      }
      w.v("MicroMsg.MMSightRemuxMediaCodecEncoder", "perform encoding");
      Object localObject = this.mVT[this.nax];
      if (localObject == null) {
        throw new RuntimeException("encoderOutputBuffer " + this.nax + " was null");
      }
      this.frameCount += 1;
      if ((this.ncg.flags & 0x2) != 0) {
        w.v("MicroMsg.MMSightRemuxMediaCodecEncoder", "ignoring BUFFER_FLAG_CODEC_CONFIG, size: %s, %s", new Object[] { Integer.valueOf(this.ncg.size), Boolean.valueOf(false) });
      }
      if (this.ncg.size != 0)
      {
        ((ByteBuffer)localObject).position(this.ncg.offset);
        ((ByteBuffer)localObject).limit(this.ncg.offset + this.ncg.size);
        MediaCodec.BufferInfo localBufferInfo = this.ncg;
        if ((localObject != null) && (localBufferInfo != null) && (this.ncR != null)) {
          this.ncR.a(this.nap, (ByteBuffer)localObject, localBufferInfo.size);
        }
      }
      this.naq.releaseOutputBuffer(this.nax, false);
    } while ((this.ncg.flags & 0x4) == 0);
    if (!this.exl)
    {
      w.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "reached end of stream unexpectedly");
      GMTrace.o(20194265137152L, 150459);
      return;
    }
    w.w("MicroMsg.MMSightRemuxMediaCodecEncoder", "do stop encoder, frameCount: %s, writeFrameCount: %s", new Object[] { Integer.valueOf(this.frameCount), Integer.valueOf(this.ncS) });
    try
    {
      this.naq.stop();
      this.naq.release();
      this.naq = null;
      this.isStart = false;
      GMTrace.o(20194265137152L, 150459);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "do stop encoder error: %s", new Object[] { localException.getMessage() });
      GMTrace.o(20194265137152L, 150459);
    }
  }
  
  public final void b(byte[] paramArrayOfByte, boolean paramBoolean, long paramLong)
  {
    GMTrace.i(20194130919424L, 150458);
    for (;;)
    {
      try
      {
        if (!this.isStart)
        {
          w.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "writeData, not start!");
          GMTrace.o(20194130919424L, 150458);
          return;
        }
        if (this.naq == null)
        {
          w.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "encoder is null");
          GMTrace.o(20194130919424L, 150458);
          return;
        }
        long l1 = bg.Pw();
        this.mVR = this.naq.getInputBuffers();
        this.mVT = this.naq.getOutputBuffers();
        int i = 0;
        if (this.naq != null)
        {
          int j = this.naq.dequeueInputBuffer(600L);
          this.ncf = j;
          if ((j < 0) && (i < 10))
          {
            w.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "video no input available, drain first");
            aPQ();
            i += 1;
            continue;
          }
        }
        if (this.naq == null)
        {
          w.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "encoder is null");
          GMTrace.o(20194130919424L, 150458);
          return;
        }
        w.v("MicroMsg.MMSightRemuxMediaCodecEncoder", "inputBufferIndex: %s", new Object[] { Integer.valueOf(this.ncf) });
        long l2 = bg.Pw();
        if (this.ncf >= 0)
        {
          if ((this.isStart) && (!paramBoolean) && (paramArrayOfByte != null))
          {
            w.v("MicroMsg.MMSightRemuxMediaCodecEncoder", "presentationTime: " + paramLong);
            ByteBuffer localByteBuffer = this.mVR[this.ncf];
            localByteBuffer.clear();
            localByteBuffer.put(paramArrayOfByte);
            localByteBuffer.position(0);
            this.naq.queueInputBuffer(this.ncf, 0, paramArrayOfByte.length, paramLong, 0);
            aPQ();
            w.v("MicroMsg.MMSightRemuxMediaCodecEncoder", "encoder used %sms %sms", new Object[] { Long.valueOf(bg.aI(l1)), Long.valueOf(bg.aI(l2)) });
            GMTrace.o(20194130919424L, 150458);
            return;
          }
          w.v("MicroMsg.MMSightRemuxMediaCodecEncoder", "end of stream");
          this.nch = true;
          this.naq.queueInputBuffer(this.ncf, 0, 0, paramLong, 4);
          this.exl = true;
          continue;
        }
        w.v("MicroMsg.MMSightRemuxMediaCodecEncoder", "input buffer not available");
      }
      catch (Exception paramArrayOfByte)
      {
        k.aPh();
        w.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "writeData error: %s", new Object[] { paramArrayOfByte.getMessage() });
        w.printErrStackTrace("MicroMsg.MMSightRemuxMediaCodecEncoder", paramArrayOfByte, "", new Object[0]);
        GMTrace.o(20194130919424L, 150458);
        return;
      }
    }
  }
  
  public final int qN(int paramInt)
  {
    GMTrace.i(20193862483968L, 150456);
    try
    {
      this.nap = paramInt;
      paramInt = aPP();
      GMTrace.o(20193862483968L, 150456);
      return paramInt;
    }
    catch (Exception localException1)
    {
      w.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "init error: %s, try to re-init again", new Object[] { localException1.getMessage() });
      try
      {
        paramInt = aPP();
        GMTrace.o(20193862483968L, 150456);
        return paramInt;
      }
      catch (Exception localException2)
      {
        w.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "re-init again error: %s", new Object[] { localException2.getMessage() });
        k.aPg();
        GMTrace.o(20193862483968L, 150456);
      }
    }
    return -1;
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */