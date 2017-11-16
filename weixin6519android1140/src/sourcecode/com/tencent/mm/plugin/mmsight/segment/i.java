package com.tencent.mm.plugin.mmsight.segment;

import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.nio.ByteBuffer;

public class i
  implements e
{
  private int frameCount;
  protected String hai;
  protected MediaExtractor mVN;
  protected MediaCodec mVP;
  protected long ncM;
  protected long ncN;
  protected int ncP;
  protected MediaCodec.BufferInfo ncg;
  protected MediaFormat ndL;
  protected e.a nds;
  protected int nef;
  private byte[] nel;
  protected int sampleSize;
  
  public i(MediaExtractor paramMediaExtractor, MediaFormat paramMediaFormat, int paramInt)
  {
    GMTrace.i(7427072196608L, 55336);
    this.hai = null;
    this.ncg = new MediaCodec.BufferInfo();
    this.frameCount = 0;
    w.i("MicroMsg.MediaCodecTranscodeDecoder", "create MediaCodecTranscodeDecoder: %s, %s, %s", new Object[] { paramMediaExtractor, paramMediaFormat, Integer.valueOf(paramInt) });
    this.mVN = paramMediaExtractor;
    this.ndL = paramMediaFormat;
    this.nef = paramInt;
    GMTrace.o(7427072196608L, 55336);
  }
  
  private static MediaCodecInfo selectCodec(String paramString)
  {
    GMTrace.i(7427340632064L, 55338);
    int k = MediaCodecList.getCodecCount();
    int i = 0;
    while (i < k)
    {
      MediaCodecInfo localMediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
      if (!localMediaCodecInfo.isEncoder())
      {
        String[] arrayOfString = localMediaCodecInfo.getSupportedTypes();
        int j = 0;
        while (j < arrayOfString.length)
        {
          if (arrayOfString[j].equalsIgnoreCase(paramString))
          {
            GMTrace.o(7427340632064L, 55338);
            return localMediaCodecInfo;
          }
          j += 1;
        }
      }
      i += 1;
    }
    GMTrace.o(7427340632064L, 55338);
    return null;
  }
  
  protected int a(MediaCodecInfo paramMediaCodecInfo, String paramString)
  {
    GMTrace.i(7427474849792L, 55339);
    w.i("MicroMsg.MediaCodecTranscodeDecoder", "selectColorFormat, mimeType: %s, codecInfo: %s", new Object[] { paramString, paramMediaCodecInfo });
    int j = 0;
    long l = bg.Pw();
    paramString = paramMediaCodecInfo.getCapabilitiesForType(paramString);
    w.i("MicroMsg.MediaCodecTranscodeDecoder", "getCapabilitiesForType used %sms", new Object[] { Long.valueOf(bg.aI(l)) });
    w.i("MicroMsg.MediaCodecTranscodeDecoder", "color format length: %s", new Object[] { Integer.valueOf(paramString.colorFormats.length) });
    int i = 0;
    while (i < paramString.colorFormats.length)
    {
      int m = paramString.colorFormats[i];
      w.i("MicroMsg.MediaCodecTranscodeDecoder", "capabilities colorFormat: %s", new Object[] { Integer.valueOf(m) });
      int k = j;
      if (qP(m)) {
        if (m <= j)
        {
          k = j;
          if (m != 21) {}
        }
        else
        {
          k = m;
        }
      }
      i += 1;
      j = k;
    }
    w.i("MicroMsg.MediaCodecTranscodeDecoder", "codec: %s, colorFormat: %s", new Object[] { paramMediaCodecInfo.getName(), Integer.valueOf(j) });
    GMTrace.o(7427474849792L, 55339);
    return j;
  }
  
  public final void a(e.a parama)
  {
    GMTrace.i(7428011720704L, 55343);
    this.nds = parama;
    GMTrace.o(7428011720704L, 55343);
  }
  
  public final Point aPT()
  {
    GMTrace.i(7428280156160L, 55345);
    Point localPoint = new Point(this.ndL.getInteger("width"), this.ndL.getInteger("height"));
    GMTrace.o(7428280156160L, 55345);
    return localPoint;
  }
  
  public int aPW()
  {
    GMTrace.i(7428145938432L, 55344);
    int i = this.ndL.getInteger("color-format");
    w.i("MicroMsg.MediaCodecTranscodeDecoder", "src color format: %s", new Object[] { Integer.valueOf(i) });
    switch (i)
    {
    default: 
      GMTrace.o(7428145938432L, 55344);
      return 1;
    case 19: 
      GMTrace.o(7428145938432L, 55344);
      return 2;
    }
    GMTrace.o(7428145938432L, 55344);
    return 1;
  }
  
  protected boolean aQi()
  {
    GMTrace.i(7427743285248L, 55341);
    if (this.mVP == null)
    {
      w.e("MicroMsg.MediaCodecTranscodeDecoder", "drainDecoder, decoder is null");
      GMTrace.o(7427743285248L, 55341);
      return true;
    }
    Object localObject1 = this.mVP.getOutputBuffers();
    w.i("MicroMsg.MediaCodecTranscodeDecoder", "decoderOutputByteBuffers length: %s", new Object[] { Integer.valueOf(localObject1.length) });
    int i = this.mVP.dequeueOutputBuffer(this.ncg, 60000L);
    w.i("MicroMsg.MediaCodecTranscodeDecoder", "outputBufferIndex-->" + i);
    if (i == -1)
    {
      w.i("MicroMsg.MediaCodecTranscodeDecoder", "no output from decoder available, break");
      label109:
      GMTrace.o(7427743285248L, 55341);
      return false;
    }
    if (i == -3)
    {
      localObject1 = this.mVP.getOutputBuffers();
      w.i("MicroMsg.MediaCodecTranscodeDecoder", "decoder output buffers changed");
    }
    for (;;)
    {
      int j = this.mVP.dequeueOutputBuffer(this.ncg, 60000L);
      i = j;
      if (j >= 0) {
        break;
      }
      break label109;
      if (i == -2)
      {
        this.ndL = this.mVP.getOutputFormat();
        w.i("MicroMsg.MediaCodecTranscodeDecoder", "decoder output format changed: " + this.ndL);
      }
      else if (i < 0)
      {
        w.w("MicroMsg.MediaCodecTranscodeDecoder", "unexpected result from decoder.dequeueOutputBuffer: " + i);
      }
      else
      {
        w.v("MicroMsg.MediaCodecTranscodeDecoder", "perform decoding");
        Object localObject2 = localObject1[i];
        if (localObject2 == null) {
          break label109;
        }
        long l1 = this.ncg.presentationTimeUs;
        if ((l1 < this.ncM * 1000L) && ((this.ncg.flags & 0x4) == 0))
        {
          this.mVP.releaseOutputBuffer(i, false);
          w.i("MicroMsg.MediaCodecTranscodeDecoder", "decoder pts: %s, not reach start: %s", new Object[] { Long.valueOf(l1), Long.valueOf(this.ncM * 1000L) });
          GMTrace.o(7427743285248L, 55341);
          return false;
        }
        if (this.ncg.size != 0)
        {
          ((ByteBuffer)localObject2).position(this.ncg.offset);
          ((ByteBuffer)localObject2).limit(this.ncg.offset + this.ncg.size);
          long l2 = bg.Pw();
          localObject1 = this.ncg;
          if (localObject2 == null) {
            w.e("MicroMsg.MediaCodecTranscodeDecoder", "processDecodeOutputBuffer error! byteBuffer is null");
          }
          for (;;)
          {
            w.v("MicroMsg.MediaCodecTranscodeDecoder", "processDecodeOutputBuffer %s", new Object[] { Long.valueOf(bg.aI(l2)) });
            this.mVP.releaseOutputBuffer(i, false);
            if ((this.ncN != 1L) && (l1 >= this.ncN * 1000L))
            {
              w.e("MicroMsg.MediaCodecTranscodeDecoder", "exceed endTimeMs");
              GMTrace.o(7427743285248L, 55341);
              return true;
              this.frameCount += 1;
              if ((this.ncP > 1) && (this.frameCount % this.ncP == 0)) {
                continue;
              }
              if (this.nel == null) {
                this.nel = new byte[((ByteBuffer)localObject2).remaining()];
              }
              long l3 = bg.Pw();
              try
              {
                this.ndL = this.mVP.getOutputFormat();
                ((ByteBuffer)localObject2).get(this.nel, 0, ((ByteBuffer)localObject2).remaining());
                w.i("MicroMsg.MediaCodecTranscodeDecoder", "processDecodeOutputBuffer, byteBuffer: %s, bufferInfo: %s, size: %d cost %d", new Object[] { localObject2, localObject1, Integer.valueOf(((MediaCodec.BufferInfo)localObject1).size), Long.valueOf(bg.aI(l3)) });
                if (this.nds != null) {
                  this.nds.ay(this.nel);
                }
              }
              catch (Exception localException2)
              {
                for (;;)
                {
                  w.e("MicroMsg.MediaCodecTranscodeDecoder", "get output format error");
                }
              }
            }
          }
          if ((this.ncg.flags & 0x4) != 0)
          {
            w.i("MicroMsg.MediaCodecTranscodeDecoder", "receive end of stream");
            try
            {
              this.mVP.stop();
              this.mVP.release();
              this.mVP = null;
              GMTrace.o(7427743285248L, 55341);
              return true;
            }
            catch (Exception localException1)
            {
              for (;;)
              {
                w.e("MicroMsg.MediaCodecTranscodeDecoder", "stop and release decoder error: %s", new Object[] { localException1.getMessage() });
              }
            }
          }
          GMTrace.o(7427743285248L, 55341);
          return false;
        }
        this.mVP.releaseOutputBuffer(i, false);
      }
    }
  }
  
  public final int o(String paramString, long paramLong1, long paramLong2)
  {
    GMTrace.i(7427206414336L, 55337);
    this.hai = paramString;
    this.ncM = paramLong1;
    this.ncN = paramLong2;
    w.i("MicroMsg.MediaCodecTranscodeDecoder", "initDecoder() called with: format = [" + this.ndL + "]");
    try
    {
      paramString = this.ndL.getString("mime");
      this.mVP = MediaCodec.createDecoderByType(paramString);
      MediaCodecInfo localMediaCodecInfo = selectCodec(paramString);
      w.i("MicroMsg.MediaCodecTranscodeDecoder", "found codec: %s", new Object[] { localMediaCodecInfo });
      if (localMediaCodecInfo != null)
      {
        w.i("MicroMsg.MediaCodecTranscodeDecoder", "codec name: %s", new Object[] { localMediaCodecInfo.getName() });
        int i = a(localMediaCodecInfo, paramString);
        w.i("MicroMsg.MediaCodecTranscodeDecoder", "found colorFormat: %s", new Object[] { Integer.valueOf(i) });
        this.ndL.setInteger("color-format", i);
      }
      this.mVP.configure(this.ndL, null, null, 0);
      this.mVP.start();
      GMTrace.o(7427206414336L, 55337);
      return 0;
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("MicroMsg.MediaCodecTranscodeDecoder", paramString, "Init decoder failed : %s", new Object[] { paramString.getMessage() });
      GMTrace.o(7427206414336L, 55337);
    }
    return -1;
  }
  
  public final void qO(int paramInt)
  {
    GMTrace.i(7428548591616L, 55347);
    w.i("MicroMsg.MediaCodecTranscodeDecoder", "setFrameDropInterval: %s", new Object[] { Integer.valueOf(paramInt) });
    this.ncP = paramInt;
    GMTrace.o(7428548591616L, 55347);
  }
  
  protected boolean qP(int paramInt)
  {
    GMTrace.i(7427609067520L, 55340);
    switch (paramInt)
    {
    case 20: 
    default: 
      GMTrace.o(7427609067520L, 55340);
      return false;
    }
    GMTrace.o(7427609067520L, 55340);
    return true;
  }
  
  public final void stop()
  {
    GMTrace.i(7428414373888L, 55346);
    if (this.mVP != null) {
      try
      {
        w.i("MicroMsg.MediaCodecTranscodeDecoder", "stop decoder");
        this.mVP.stop();
        this.mVP.release();
        this.mVP = null;
        GMTrace.o(7428414373888L, 55346);
        return;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.MediaCodecTranscodeDecoder", localException, "stop decoder error: %s", new Object[] { localException.getMessage() });
      }
    }
    GMTrace.o(7428414373888L, 55346);
  }
  
  public final void y(Runnable paramRunnable)
  {
    GMTrace.i(7427877502976L, 55342);
    this.frameCount = 0;
    Object localObject1 = this.mVN;
    if (this.mVP == null) {
      w.i("MicroMsg.MediaCodecTranscodeDecoder", "input decoder is null");
    }
    Object localObject2;
    long l;
    for (boolean bool1 = true;; bool1 = false)
    {
      if (!bool1)
      {
        this.mVN.advance();
        if (this.mVN.getSampleTrackIndex() == this.nef) {
          break;
        }
        w.i("MicroMsg.MediaCodecTranscodeDecoder", "track index not match, break");
      }
      localObject1 = this.mVN;
      w.i("MicroMsg.MediaCodecTranscodeDecoder", "sendDecoderEOS");
      localObject2 = this.mVP.getInputBuffers();
      i = this.mVP.dequeueInputBuffer(60000L);
      if (i < 0)
      {
        w.i("MicroMsg.MediaCodecTranscodeDecoder", "check decoder input buffer index = %d count = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(0) });
        if (aQi()) {}
      }
      else
      {
        if (i >= 0)
        {
          localObject2 = localObject2[i];
          ((ByteBuffer)localObject2).clear();
          this.sampleSize = ((MediaExtractor)localObject1).readSampleData((ByteBuffer)localObject2, 0);
          ((ByteBuffer)localObject2).position(0);
          l = ((MediaExtractor)localObject1).getSampleTime();
          if (i < 0) {
            break label578;
          }
          w.i("MicroMsg.MediaCodecTranscodeDecoder", "send EOS, decoderInputBufferIndex: %s", new Object[] { Integer.valueOf(i) });
          this.mVP.queueInputBuffer(i, 0, 0, l * 1000L, 4);
        }
        label226:
        aQi();
      }
      af.i(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7452842000384L, 55528);
          if (i.this.mVP != null)
          {
            w.i("MicroMsg.MediaCodecTranscodeDecoder", "delay to stop decoder");
            try
            {
              i.this.mVP.stop();
              i.this.mVP.release();
              i.this.mVP = null;
              GMTrace.o(7452842000384L, 55528);
              return;
            }
            catch (Exception localException)
            {
              w.printErrStackTrace("MicroMsg.MediaCodecTranscodeDecoder", localException, "delay to stop decoder error: %s", new Object[] { localException.getMessage() });
            }
          }
          GMTrace.o(7452842000384L, 55528);
        }
      }, 500L);
      paramRunnable.run();
      GMTrace.o(7427877502976L, 55342);
      return;
      localObject2 = this.mVP.getInputBuffers();
      if (localObject2 != null) {
        break label281;
      }
    }
    label281:
    w.i("MicroMsg.MediaCodecTranscodeDecoder", "decoderInputByteBuffers size: %d", new Object[] { Integer.valueOf(localObject2.length) });
    int i = 0;
    int j;
    for (;;)
    {
      j = this.mVP.dequeueInputBuffer(60000L);
      if ((j >= 0) || (i >= 15)) {
        break label377;
      }
      l = bg.Pw();
      bool1 = aQi();
      w.i("MicroMsg.MediaCodecTranscodeDecoder", "drain cost1 %d", new Object[] { Long.valueOf(bg.aI(l)) });
      if (bool1)
      {
        bool1 = true;
        break;
      }
      i += 1;
    }
    label377:
    if (j >= 0)
    {
      localObject2 = localObject2[j];
      ((ByteBuffer)localObject2).clear();
      this.sampleSize = ((MediaExtractor)localObject1).readSampleData((ByteBuffer)localObject2, 0);
      ((ByteBuffer)localObject2).position(0);
      l = ((MediaExtractor)localObject1).getSampleTime();
      w.i("MicroMsg.MediaCodecTranscodeDecoder", "sampleTime: %s", new Object[] { Long.valueOf(l) });
      if ((this.sampleSize >= 0) && (l < this.ncN * 1000L)) {
        break label589;
      }
    }
    label502:
    label578:
    label589:
    for (bool1 = true;; bool1 = false)
    {
      w.i("MicroMsg.MediaCodecTranscodeDecoder", "sawInputEOS: %s", new Object[] { Boolean.valueOf(bool1) });
      localObject1 = this.mVP;
      int k = this.sampleSize;
      if (bool1)
      {
        i = 4;
        ((MediaCodec)localObject1).queueInputBuffer(j, 0, k, l, i);
      }
      for (;;)
      {
        l = bg.Pw();
        boolean bool2 = aQi();
        w.i("MicroMsg.MediaCodecTranscodeDecoder", "drain cost2 %d", new Object[] { Long.valueOf(bg.aI(l)) });
        if (!bool2) {
          break;
        }
        bool1 = true;
        break;
        i = 0;
        break label502;
        w.w("MicroMsg.MediaCodecTranscodeDecoder", "input buffer not available");
        bool1 = false;
      }
      w.w("MicroMsg.MediaCodecTranscodeDecoder", "input buffer not available");
      break label226;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\segment\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */