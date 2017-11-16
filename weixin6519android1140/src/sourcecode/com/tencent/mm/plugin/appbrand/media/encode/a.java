package com.tencent.mm.plugin.appbrand.media.encode;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.media.g;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class a
  extends b
{
  private final int TIMEOUT_USEC;
  int irL;
  MediaCodec.BufferInfo mBufferInfo;
  private MediaCodec mEncoder;
  private String mFilePath;
  
  public a()
  {
    GMTrace.i(19852412583936L, 147912);
    this.irL = 2;
    this.mFilePath = "";
    this.TIMEOUT_USEC = 100;
    GMTrace.o(19852412583936L, 147912);
  }
  
  public final boolean a(boolean paramBoolean, byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(19852681019392L, 147914);
    if (paramArrayOfByte == null)
    {
      w.e("MicroMsg.AACAudioEncoder", "pcm is null");
      GMTrace.o(19852681019392L, 147914);
      return false;
    }
    if (this.mEncoder != null)
    {
      w.i("MicroMsg.AACAudioEncoder", "encodePCMToAAC endOfStream:%b", new Object[] { Boolean.valueOf(paramBoolean) });
      Object localObject2 = this.mEncoder.getInputBuffers();
      Object localObject1 = this.mEncoder.getOutputBuffers();
      paramInt = this.mEncoder.dequeueInputBuffer(100L);
      if (paramInt >= 0)
      {
        localObject2 = localObject2[paramInt];
        ((ByteBuffer)localObject2).clear();
        ((ByteBuffer)localObject2).put(paramArrayOfByte);
        ((ByteBuffer)localObject2).position(0);
        ((ByteBuffer)localObject2).limit(paramArrayOfByte.length);
        w.i("MicroMsg.AACAudioEncoder", "inputBufferIndex:%d, data length:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfByte.length) });
        if (paramBoolean)
        {
          this.mEncoder.queueInputBuffer(paramInt, 0, paramArrayOfByte.length, System.nanoTime(), 4);
          paramArrayOfByte = (byte[])localObject1;
          paramInt = this.mEncoder.dequeueOutputBuffer(this.mBufferInfo, 100L);
          if (paramInt != -1) {
            break label251;
          }
          w.d("MicroMsg.AACAudioEncoder", "no output available, break");
        }
      }
      for (;;)
      {
        label196:
        GMTrace.o(19852681019392L, 147914);
        return true;
        this.mEncoder.queueInputBuffer(paramInt, 0, paramArrayOfByte.length, System.nanoTime(), 0);
        paramArrayOfByte = (byte[])localObject1;
        break;
        w.e("MicroMsg.AACAudioEncoder", "inputBufferIndex %d", new Object[] { Integer.valueOf(paramInt) });
        paramArrayOfByte = (byte[])localObject1;
        break;
        label251:
        if (paramInt == -3)
        {
          w.e("MicroMsg.AACAudioEncoder", "output buff change");
          paramArrayOfByte = this.mEncoder.getOutputBuffers();
          break;
        }
        if (paramInt == -2)
        {
          localObject1 = this.mEncoder.getOutputFormat();
          w.e("MicroMsg.AACAudioEncoder", "encoder output format changed: " + localObject1);
          break;
        }
        if (paramInt < 0)
        {
          w.e("MicroMsg.AACAudioEncoder", "unexpected result from encoder.dequeueOutputBuffer: %s", new Object[] { Integer.valueOf(paramInt) });
          break;
        }
        w.i("MicroMsg.AACAudioEncoder", "outputBufferIndex %d", new Object[] { Integer.valueOf(paramInt) });
        localObject1 = paramArrayOfByte[paramInt];
        if (localObject1 == null) {
          throw new RuntimeException("outputBuffer " + paramInt + " was null");
        }
        if ((this.mBufferInfo.flags & 0x2) != 0) {
          w.e("MicroMsg.AACAudioEncoder", "flags is BUFFER_FLAG_CODEC_CONFIG, don't writ data into file");
        }
        for (;;)
        {
          this.mEncoder.releaseOutputBuffer(paramInt, false);
          if ((this.mBufferInfo.flags & 0x4) == 0) {
            break;
          }
          if (paramBoolean) {
            break label520;
          }
          w.w("MicroMsg.AACAudioEncoder", "reached end of stream unexpectedly");
          break label196;
          int i = this.mBufferInfo.size;
          localObject2 = new byte[i];
          ((ByteBuffer)localObject1).get((byte[])localObject2, 0, i);
          int j = M4aAudioFormatJni.writeAudioBuff((byte[])localObject2, i);
          b((byte[])localObject2, i, false);
          if (j == 0) {
            w.i("MicroMsg.AACAudioEncoder", "writeAudioBuff buff ok,");
          } else {
            w.i("MicroMsg.AACAudioEncoder", "writeAudioBuff buff fail,");
          }
        }
        label520:
        w.e("MicroMsg.AACAudioEncoder", "reach the end, and end to encode the data");
      }
    }
    w.e("MicroMsg.AACAudioEncoder", "mEncoder is null");
    GMTrace.o(19852681019392L, 147914);
    return false;
  }
  
  public final void close()
  {
    GMTrace.i(19852949454848L, 147916);
    w.i("MicroMsg.AACAudioEncoder", "close");
    if (this.mEncoder != null)
    {
      this.mEncoder.stop();
      this.mEncoder.release();
      this.mEncoder = null;
    }
    M4aAudioFormatJni.closeM4aFile();
    GMTrace.o(19852949454848L, 147916);
  }
  
  public final boolean e(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(19852546801664L, 147913);
    w.i("MicroMsg.AACAudioEncoder", "init, filePath:%s, sampleRate:%d, channelCount:%d, bitRate:%d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mFilePath = paramString;
    int i = 0;
    try
    {
      w.i("MicroMsg.AACAudioEncoder", "initCodec");
      this.mBufferInfo = new MediaCodec.BufferInfo();
      MediaFormat localMediaFormat = MediaFormat.createAudioFormat(this.irM, paramInt1, paramInt2);
      localMediaFormat.setInteger("bitrate", paramInt3);
      localMediaFormat.setInteger("aac-profile", this.irL);
      this.mEncoder = MediaCodec.createEncoderByType(this.irM);
      this.mEncoder.configure(localMediaFormat, null, null, 1);
      this.mEncoder.start();
      w.i("MicroMsg.AACAudioEncoder", "encoder start to work");
      paramInt3 = i;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.AACAudioEncoder", localIOException, "initCodec", new Object[0]);
        paramInt3 = -1;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.AACAudioEncoder", localException, "initCodec", new Object[0]);
        paramInt3 = -1;
      }
      w.i("MicroMsg.AACAudioEncoder", "initCodec ok");
      if (M4aAudioFormatJni.createM4aFile(paramString, paramInt2, paramInt1, this.irL) != 0) {
        break label255;
      }
      w.i("MicroMsg.AACAudioEncoder", "createM4aFile m4a jni api ok,");
      GMTrace.o(19852546801664L, 147913);
      return true;
      w.i("MicroMsg.AACAudioEncoder", "createM4aFile m4a jni api fail,");
      g.iZ(22);
      GMTrace.o(19852546801664L, 147913);
    }
    if (paramInt3 == -1)
    {
      w.i("MicroMsg.AACAudioEncoder", "initCodec  fail,");
      g.iZ(21);
      GMTrace.o(19852546801664L, 147913);
      return false;
    }
    label255:
    return false;
  }
  
  public final void flush()
  {
    GMTrace.i(19852815237120L, 147915);
    w.i("MicroMsg.AACAudioEncoder", "flush");
    b(new byte[0], 0, true);
    GMTrace.o(19852815237120L, 147915);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\media\encode\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */