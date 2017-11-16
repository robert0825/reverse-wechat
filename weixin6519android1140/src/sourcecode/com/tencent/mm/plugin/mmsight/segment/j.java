package com.tencent.mm.plugin.mmsight.segment;

import android.annotation.TargetApi;
import android.graphics.ImageFormat;
import android.media.Image;
import android.media.Image.Plane;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.nio.ByteBuffer;

@TargetApi(21)
public final class j
  extends i
{
  public static String TAG;
  
  static
  {
    GMTrace.i(7422911447040L, 55305);
    TAG = "MicroMsg.MediaCodecTranscodeDecoder21";
    GMTrace.o(7422911447040L, 55305);
  }
  
  public j(MediaExtractor paramMediaExtractor, MediaFormat paramMediaFormat, int paramInt)
  {
    super(paramMediaExtractor, paramMediaFormat, paramInt);
    GMTrace.i(7422106140672L, 55299);
    w.i(TAG, "init ");
    GMTrace.o(7422106140672L, 55299);
  }
  
  private static byte[] a(Image paramImage)
  {
    GMTrace.i(7422777229312L, 55304);
    int j = paramImage.getFormat();
    int i3 = paramImage.getWidth();
    int i4 = paramImage.getHeight();
    int i = 0;
    paramImage = paramImage.getPlanes();
    int k = i3 * i4 * ImageFormat.getBitsPerPixel(j) / 8;
    w.i(TAG, "planes len %d, datalen: %s width %d height %d format %d", new Object[] { Integer.valueOf(paramImage.length), Integer.valueOf(k), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(j) });
    byte[] arrayOfByte1 = com.tencent.mm.plugin.mmsight.model.a.j.naP.h(Integer.valueOf(k));
    k = 0;
    while (k < paramImage.length)
    {
      ByteBuffer localByteBuffer = paramImage[k].getBuffer();
      int i5 = paramImage[k].getRowStride();
      int i6 = paramImage[k].getPixelStride();
      int m;
      if (k == 0)
      {
        m = i3;
        if (k != 0) {
          break label300;
        }
      }
      byte[] arrayOfByte2;
      int i1;
      label300:
      for (int n = i4;; n = i4 / 2)
      {
        w.v(TAG, "row planes rowStride %d w %d h %d pixelStride %d", new Object[] { Integer.valueOf(i5), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i6) });
        arrayOfByte2 = com.tencent.mm.plugin.mmsight.model.a.j.naP.h(Integer.valueOf(i5));
        i1 = 0;
        for (;;)
        {
          if (i1 >= n) {
            break label387;
          }
          j = ImageFormat.getBitsPerPixel(35) / 8;
          if (i6 != j) {
            break;
          }
          j *= m;
          localByteBuffer.get(arrayOfByte1, i, j);
          if (n - i1 != 1) {
            localByteBuffer.position(localByteBuffer.position() + i5 - j);
          }
          i += j;
          i1 += 1;
        }
        m = i3 / 2;
        break;
      }
      if (n - i1 == 1) {
        localByteBuffer.get(arrayOfByte2, 0, i3 - i6 + 1);
      }
      for (;;)
      {
        int i2 = 0;
        j = i;
        for (;;)
        {
          i = j;
          if (i2 >= m) {
            break;
          }
          arrayOfByte1[j] = arrayOfByte2[(i2 * i6)];
          i2 += 1;
          j += 1;
        }
        localByteBuffer.get(arrayOfByte2, 0, i5);
      }
      label387:
      com.tencent.mm.plugin.mmsight.model.a.j.naP.x(arrayOfByte2);
      k += 1;
    }
    GMTrace.o(7422777229312L, 55304);
    return arrayOfByte1;
  }
  
  protected final int a(MediaCodecInfo paramMediaCodecInfo, String paramString)
  {
    GMTrace.i(7422240358400L, 55300);
    w.i(TAG, "selectColorFormat, mimeType: %s, codecInfo: %s", new Object[] { paramString, paramMediaCodecInfo });
    int j = 0;
    long l = bg.Pw();
    paramString = paramMediaCodecInfo.getCapabilitiesForType(paramString);
    w.i(TAG, "getCapabilitiesForType used %sms", new Object[] { Long.valueOf(bg.aI(l)) });
    w.i(TAG, "color format length: %s", new Object[] { Integer.valueOf(paramString.colorFormats.length) });
    int i = 0;
    while (i < paramString.colorFormats.length)
    {
      int m = paramString.colorFormats[i];
      w.i(TAG, "capabilities colorFormat: %s", new Object[] { Integer.valueOf(m) });
      int k = j;
      if (qP(m)) {
        if (m <= j)
        {
          k = j;
          if (m != 2135033992) {}
        }
        else
        {
          k = m;
        }
      }
      i += 1;
      j = k;
    }
    w.i(TAG, "codec: %s, colorFormat: %s", new Object[] { paramMediaCodecInfo.getName(), Integer.valueOf(j) });
    GMTrace.o(7422240358400L, 55300);
    return j;
  }
  
  public final int aPW()
  {
    GMTrace.i(7422643011584L, 55303);
    GMTrace.o(7422643011584L, 55303);
    return 2;
  }
  
  protected final boolean aQi()
  {
    GMTrace.i(7422508793856L, 55302);
    if (this.mVP == null)
    {
      w.e(TAG, "drainDecoder, decoder is null");
      GMTrace.o(7422508793856L, 55302);
      return true;
    }
    int i = this.mVP.dequeueOutputBuffer(this.ncg, 60000L);
    w.i(TAG, "outputBufferIndex-->" + i);
    if (i == -1)
    {
      w.i(TAG, "no output from decoder available, break");
      label83:
      GMTrace.o(7422508793856L, 55302);
      return false;
    }
    if (i == -3) {
      w.i(TAG, "decoder output buffers changed");
    }
    for (;;)
    {
      int j = this.mVP.dequeueOutputBuffer(this.ncg, 60000L);
      i = j;
      if (j >= 0) {
        break;
      }
      break label83;
      if (i == -2)
      {
        this.ndL = this.mVP.getOutputFormat();
        w.i(TAG, "decoder output format changed: " + this.ndL);
      }
      else if (i < 0)
      {
        w.w(TAG, "unexpected result from decoder.dequeueOutputBuffer: " + i);
      }
      else
      {
        w.v(TAG, "perform decoding");
        long l = bg.Pw();
        byte[] arrayOfByte = a(this.mVP.getOutputImage(i));
        w.v(TAG, "perform decoding costImage %s", new Object[] { Long.valueOf(bg.aI(l)) });
        if (arrayOfByte == null) {
          break label83;
        }
        if (arrayOfByte.length != 0)
        {
          MediaCodec.BufferInfo localBufferInfo = this.ncg;
          if (arrayOfByte == null) {
            w.e(TAG, "processDecodeOutputBuffer error! byteBuffer is null");
          }
          for (;;)
          {
            this.mVP.releaseOutputBuffer(i, false);
            l = this.ncg.presentationTimeUs;
            if ((this.ncN == 1L) || (l < this.ncN * 1000L)) {
              break;
            }
            w.e(TAG, "exceed endTimeMs");
            GMTrace.o(7422508793856L, 55302);
            return true;
            w.i(TAG, "processDecodeOutputBuffer, byteBuffer: %s, bufferInfo: %s, size: %d", new Object[] { arrayOfByte, localBufferInfo, Integer.valueOf(localBufferInfo.size) });
            this.ndL = this.mVP.getOutputFormat();
            if (this.nds != null) {
              this.nds.ay(arrayOfByte);
            }
          }
          if ((this.ncg.flags & 0x4) != 0)
          {
            w.i(TAG, "receive end of stream");
            try
            {
              this.mVP.stop();
              this.mVP.release();
              this.mVP = null;
              GMTrace.o(7422508793856L, 55302);
              return true;
            }
            catch (Exception localException)
            {
              for (;;)
              {
                w.e(TAG, "stop and release decoder error: %s", new Object[] { localException.getMessage() });
              }
            }
          }
          GMTrace.o(7422508793856L, 55302);
          return false;
        }
        this.mVP.releaseOutputBuffer(i, false);
      }
    }
  }
  
  protected final boolean qP(int paramInt)
  {
    GMTrace.i(7422374576128L, 55301);
    switch (paramInt)
    {
    default: 
      GMTrace.o(7422374576128L, 55301);
      return false;
    }
    GMTrace.o(7422374576128L, 55301);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\segment\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */