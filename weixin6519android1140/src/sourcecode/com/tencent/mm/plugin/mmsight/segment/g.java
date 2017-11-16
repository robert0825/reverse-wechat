package com.tencent.mm.plugin.mmsight.segment;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class g
{
  String mVJ;
  private MediaExtractor mVN;
  private long ncM;
  private long ncN;
  public MediaCodec ndJ;
  public MediaCodec ndK;
  MediaFormat ndL;
  MediaFormat ndM;
  VideoTransPara ndN;
  boolean ndO;
  List<byte[]> ndP;
  private boolean ndQ;
  private boolean ndR;
  private byte[] ndS;
  private HandlerThread ndT;
  private ae ndU;
  
  public g(MediaExtractor paramMediaExtractor, MediaFormat paramMediaFormat, long paramLong1, long paramLong2, VideoTransPara paramVideoTransPara)
  {
    GMTrace.i(18668343787520L, 139090);
    this.mVJ = null;
    this.ndO = true;
    this.ndP = null;
    this.ndQ = false;
    this.ndR = false;
    this.ndT = null;
    this.ndU = null;
    this.mVN = paramMediaExtractor;
    this.ndL = paramMediaFormat;
    this.ncM = paramLong1;
    this.ncN = paramLong2;
    this.ndN = paramVideoTransPara;
    this.mVJ = paramMediaFormat.getString("mime");
    this.ndP = new ArrayList();
    w.i("MicroMsg.MediaCodecAACTranscoder", "create MediaCodecAACTranscoder, startTimeMs: %s, endTimeMs: %s, mime: %s, srcMediaFormat: %s, para: %s", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2), this.mVJ, paramMediaFormat, paramVideoTransPara });
    GMTrace.o(18668343787520L, 139090);
  }
  
  private void a(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo, boolean paramBoolean)
  {
    GMTrace.i(18668746440704L, 139093);
    if (paramByteBuffer == null)
    {
      GMTrace.o(18668746440704L, 139093);
      return;
    }
    w.d("MicroMsg.MediaCodecAACTranscoder", "processDecodeBuffer, EOS: %s, finishGetAllInputAACData: %s", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(this.ndR) });
    if (this.ndO)
    {
      if (!this.ndQ)
      {
        aQg();
        this.ndQ = true;
      }
      if (this.ndS == null)
      {
        this.ndS = new byte[paramByteBuffer.remaining()];
        paramByteBuffer.get(this.ndS, 0, paramByteBuffer.remaining());
      }
      a(this.ndS, paramBufferInfo.presentationTimeUs, paramBoolean);
      GMTrace.o(18668746440704L, 139093);
      return;
    }
    byte[] arrayOfByte = new byte[paramByteBuffer.remaining()];
    paramByteBuffer.get(arrayOfByte, 0, paramByteBuffer.remaining());
    this.ndP.add(arrayOfByte);
    if ((this.ndR) || (paramBoolean)) {
      try
      {
        this.ndJ.stop();
        this.ndJ.release();
        aQg();
        this.ndQ = true;
        paramByteBuffer = this.ndP.iterator();
        int i = 0;
        for (;;)
        {
          if (!paramByteBuffer.hasNext()) {
            break label287;
          }
          arrayOfByte = (byte[])paramByteBuffer.next();
          long l = paramBufferInfo.presentationTimeUs;
          if (i < this.ndP.size() - 1) {
            break;
          }
          paramBoolean = true;
          a(arrayOfByte, l, paramBoolean);
          i += 1;
        }
      }
      catch (Exception paramByteBuffer)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.MediaCodecAACTranscoder", paramByteBuffer, "", new Object[0]);
          continue;
          paramBoolean = false;
        }
      }
    }
    label287:
    GMTrace.o(18668746440704L, 139093);
  }
  
  private void a(byte[] paramArrayOfByte, long paramLong, boolean paramBoolean)
  {
    GMTrace.i(18669014876160L, 139095);
    if ((this.ndK == null) || (paramArrayOfByte == null))
    {
      GMTrace.o(18669014876160L, 139095);
      return;
    }
    Object localObject = this.ndK.getInputBuffers();
    int j = this.ndK.dequeueInputBuffer(20000L);
    if (j < 0)
    {
      w.d("MicroMsg.MediaCodecAACTranscoder", "encoder no input buffer available, drain first");
      aPQ();
    }
    int i;
    if (j >= 0)
    {
      localObject = localObject[j];
      ((ByteBuffer)localObject).clear();
      ((ByteBuffer)localObject).position(0);
      ((ByteBuffer)localObject).put(paramArrayOfByte);
      if (!paramBoolean) {
        break label198;
      }
      w.i("MicroMsg.MediaCodecAACTranscoder", "last, send EOS and try delay stop encoder");
      i = 1;
      af.i(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18668209569792L, 139089);
          try
          {
            if (g.this.ndK != null)
            {
              w.i("MicroMsg.MediaCodecAACTranscoder", "delay to stop encoder");
              g.this.ndK.stop();
              g.this.ndK.release();
              g.this.ndK = null;
            }
            GMTrace.o(18668209569792L, 139089);
            return;
          }
          catch (Exception localException)
          {
            w.e("MicroMsg.MediaCodecAACTranscoder", "delayStopEncoder error: %s", new Object[] { localException.getMessage() });
            GMTrace.o(18668209569792L, 139089);
          }
        }
      }, 500L);
    }
    for (;;)
    {
      if (this.ndK == null)
      {
        GMTrace.o(18669014876160L, 139095);
        return;
      }
      if (i != 0)
      {
        w.i("MicroMsg.MediaCodecAACTranscoder", "EOS received in sendAudioToEncoder");
        this.ndK.queueInputBuffer(j, 0, paramArrayOfByte.length, paramLong, 4);
      }
      for (;;)
      {
        aPQ();
        GMTrace.o(18669014876160L, 139095);
        return;
        this.ndK.queueInputBuffer(j, 0, paramArrayOfByte.length, paramLong, 0);
      }
      label198:
      i = 0;
    }
  }
  
  private void aPQ()
  {
    GMTrace.i(18669149093888L, 139096);
    if (this.ndK == null)
    {
      GMTrace.o(18669149093888L, 139096);
      return;
    }
    MediaCodec.BufferInfo localBufferInfo;
    do
    {
      int i;
      ByteBuffer[] arrayOfByteBuffer2;
      for (;;)
      {
        try
        {
          ByteBuffer[] arrayOfByteBuffer1 = this.ndK.getOutputBuffers();
          localBufferInfo = new MediaCodec.BufferInfo();
          i = this.ndK.dequeueOutputBuffer(localBufferInfo, 20000L);
          w.d("MicroMsg.MediaCodecAACTranscoder", "encoderOutputBufferIndex: %s", new Object[] { Integer.valueOf(i) });
          if (i == -1)
          {
            w.d("MicroMsg.MediaCodecAACTranscoder", "no output available, break");
            GMTrace.o(18669149093888L, 139096);
            return;
          }
        }
        catch (Exception localException)
        {
          w.printErrStackTrace("MicroMsg.MediaCodecAACTranscoder", localException, "drainEncoder error: %s", new Object[] { localException.getMessage() });
          GMTrace.o(18669149093888L, 139096);
          return;
        }
        if (i == -3)
        {
          arrayOfByteBuffer2 = this.ndK.getOutputBuffers();
        }
        else if (i == -2)
        {
          this.ndM = this.ndK.getOutputFormat();
          w.i("MicroMsg.MediaCodecAACTranscoder", "dstMediaFormat change: %s", new Object[] { this.ndM });
        }
        else
        {
          if (i >= 0) {
            break;
          }
          w.e("MicroMsg.MediaCodecAACTranscoder", "unexpected encoderOutputBufferIndex: %s", new Object[] { Integer.valueOf(i) });
        }
      }
      w.v("MicroMsg.MediaCodecAACTranscoder", "perform encoding");
      ByteBuffer localByteBuffer = arrayOfByteBuffer2[i];
      if (localByteBuffer == null)
      {
        w.e("MicroMsg.MediaCodecAACTranscoder", "ERROR, retrieve encoderOutputBuffer is null!!");
        GMTrace.o(18669149093888L, 139096);
        return;
      }
      if (localBufferInfo.size > 0)
      {
        localByteBuffer.position(localBufferInfo.offset);
        localByteBuffer.limit(localBufferInfo.offset + localBufferInfo.size);
        if (localByteBuffer != null) {
          MP4MuxerJNI.writeAACData(0, localByteBuffer, localBufferInfo.size);
        }
      }
      this.ndK.releaseOutputBuffer(i, false);
    } while ((localBufferInfo.flags & 0x4) == 0);
    w.i("MicroMsg.MediaCodecAACTranscoder", "receive EOS!");
    if (this.ndK != null)
    {
      this.ndK.stop();
      this.ndK.release();
      this.ndK = null;
      GMTrace.o(18669149093888L, 139096);
      return;
    }
    GMTrace.o(18669149093888L, 139096);
  }
  
  private void aQf()
  {
    GMTrace.i(18668612222976L, 139092);
    if (this.ndJ == null)
    {
      GMTrace.o(18668612222976L, 139092);
      return;
    }
    MediaCodec.BufferInfo localBufferInfo;
    int i;
    ByteBuffer[] arrayOfByteBuffer2;
    for (;;)
    {
      try
      {
        ByteBuffer[] arrayOfByteBuffer1 = this.ndJ.getOutputBuffers();
        localBufferInfo = new MediaCodec.BufferInfo();
        i = this.ndJ.dequeueOutputBuffer(localBufferInfo, 20000L);
        w.d("MicroMsg.MediaCodecAACTranscoder", "decoderOutputBufferIndex: %s", new Object[] { Integer.valueOf(i) });
        if (i == -1)
        {
          w.d("MicroMsg.MediaCodecAACTranscoder", "no output available, break");
          GMTrace.o(18668612222976L, 139092);
          return;
        }
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.MediaCodecAACTranscoder", localException, "drainDecoder error: %s", new Object[] { localException.getMessage() });
        GMTrace.o(18668612222976L, 139092);
        return;
      }
      if (i == -3)
      {
        arrayOfByteBuffer2 = this.ndJ.getOutputBuffers();
      }
      else if (i == -2)
      {
        this.ndL = this.ndJ.getOutputFormat();
        w.i("MicroMsg.MediaCodecAACTranscoder", "srcMediaFormat change: %s", new Object[] { this.ndL });
      }
      else
      {
        if (i >= 0) {
          break;
        }
        w.e("MicroMsg.MediaCodecAACTranscoder", "unexpected decoderOutputBufferIndex: %s", new Object[] { Integer.valueOf(i) });
      }
    }
    w.v("MicroMsg.MediaCodecAACTranscoder", "perform decoding");
    ByteBuffer localByteBuffer = arrayOfByteBuffer2[i];
    if (localByteBuffer == null)
    {
      w.e("MicroMsg.MediaCodecAACTranscoder", "ERROR, retrieve decoderOutputBuffer is null!!");
      GMTrace.o(18668612222976L, 139092);
      return;
    }
    if ((localBufferInfo.flags & 0x2) != 0)
    {
      w.e("MicroMsg.MediaCodecAACTranscoder", "ignore BUFFER_FLAG_CODEC_CONFIG");
      localBufferInfo.size = 0;
    }
    if (localBufferInfo.size > 0)
    {
      localByteBuffer.position(localBufferInfo.offset);
      localByteBuffer.limit(localBufferInfo.offset + localBufferInfo.size);
      if ((localBufferInfo.flags & 0x4) == 0) {
        break label391;
      }
    }
    label391:
    for (boolean bool = true;; bool = false)
    {
      a(localByteBuffer, localBufferInfo, bool);
      this.ndJ.releaseOutputBuffer(i, false);
      if ((localBufferInfo.flags & 0x4) == 0) {
        break;
      }
      w.i("MicroMsg.MediaCodecAACTranscoder", "receive EOS!");
      if (this.ndJ == null) {
        break label396;
      }
      this.ndJ.stop();
      this.ndJ.release();
      this.ndJ = null;
      GMTrace.o(18668612222976L, 139092);
      return;
    }
    label396:
    GMTrace.o(18668612222976L, 139092);
  }
  
  private void aQg()
  {
    GMTrace.i(18668880658432L, 139094);
    if ((this.ndK != null) && (this.ndO) && (!this.ndQ))
    {
      this.ndJ.start();
      GMTrace.o(18668880658432L, 139094);
      return;
    }
    try
    {
      this.ndM = new MediaFormat();
      this.ndM.setString("mime", "audio/mp4a-latm");
      this.ndM.setInteger("aac-profile", 2);
      this.ndM.setInteger("sample-rate", this.ndN.audioSampleRate);
      this.ndM.setInteger("channel-count", 1);
      this.ndM.setInteger("bitrate", this.ndN.gBk);
      this.ndM.setInteger("max-input-size", 16384);
      this.ndK = MediaCodec.createEncoderByType(this.mVJ);
      this.ndK.configure(this.ndM, null, null, 1);
      this.ndK.start();
      w.i("MicroMsg.MediaCodecAACTranscoder", "checkInitAndStartEncoder, not canEncodeDecodeBothExist, create new encoder");
      GMTrace.o(18668880658432L, 139094);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MediaCodecAACTranscoder", "checkInitAndStartEncoder, not canEncodeDecodeBothExist, error: %s", new Object[] { localException.getMessage() });
      GMTrace.o(18668880658432L, 139094);
    }
  }
  
  public final void aQe()
  {
    GMTrace.i(18668478005248L, 139091);
    this.ndQ = false;
    this.ndR = false;
    try
    {
      if ((this.ndJ == null) || (this.mVN == null))
      {
        w.e("MicroMsg.MediaCodecAACTranscoder", "startTranscodeBlockLoop error");
        GMTrace.o(18668478005248L, 139091);
        return;
      }
      Object localObject = this.ndJ.getInputBuffers();
      int j = this.ndJ.dequeueInputBuffer(20000L);
      if (j < 0)
      {
        w.d("MicroMsg.MediaCodecAACTranscoder", "decoder no input buffer available, drain first");
        aQf();
      }
      int k;
      long l;
      if (j >= 0)
      {
        w.d("MicroMsg.MediaCodecAACTranscoder", "decoderInputBufferIndex: %d", new Object[] { Integer.valueOf(j) });
        localObject = localObject[j];
        ((ByteBuffer)localObject).clear();
        ((ByteBuffer)localObject).position(0);
        k = this.mVN.readSampleData((ByteBuffer)localObject, 0);
        l = this.mVN.getSampleTime();
        this.mVN.advance();
        w.d("MicroMsg.MediaCodecAACTranscoder", "sampleSize: %s, pts: %s", new Object[] { Integer.valueOf(k), Long.valueOf(l) });
        int i = 0;
        if ((l >= this.ncN * 1000L) || (l <= 0L) || (k <= 0))
        {
          w.i("MicroMsg.MediaCodecAACTranscoder", "reach end time, send EOS and try delay stop decoder");
          i = 1;
          this.ndR = true;
          af.i(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(18669417529344L, 139098);
              try
              {
                if (g.this.ndJ != null)
                {
                  w.i("MicroMsg.MediaCodecAACTranscoder", "delay to stop decoder");
                  g.this.ndJ.stop();
                  g.this.ndJ.release();
                  g.this.ndJ = null;
                }
                GMTrace.o(18669417529344L, 139098);
                return;
              }
              catch (Exception localException)
              {
                w.e("MicroMsg.MediaCodecAACTranscoder", "delayStopDecoder error: %s", new Object[] { localException.getMessage() });
                GMTrace.o(18669417529344L, 139098);
              }
            }
          }, 500L);
        }
        if (this.ndJ == null) {
          break label353;
        }
        if (i == 0) {
          break label303;
        }
        w.i("MicroMsg.MediaCodecAACTranscoder", "EOS received in sendAudioToEncoder");
        this.ndJ.queueInputBuffer(j, 0, k, l, 4);
      }
      for (;;)
      {
        aQf();
        if (!this.ndR) {
          break;
        }
        localObject = this.ndK;
        if (localObject != null) {
          break;
        }
        GMTrace.o(18668478005248L, 139091);
        return;
        label303:
        this.ndJ.queueInputBuffer(j, 0, k, l, 0);
      }
      GMTrace.o(18668478005248L, 139091);
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.MediaCodecAACTranscoder", localException, "startTranscodeBlockLoop error: %s", new Object[] { localException.getMessage() });
      GMTrace.o(18668478005248L, 139091);
      return;
    }
    label353:
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\segment\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */