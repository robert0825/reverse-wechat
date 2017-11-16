package com.tencent.mm.plugin.mmsight.model.b;

import android.graphics.Point;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class c
{
  private int frameCount;
  private boolean mBy;
  a ncK;
  private String ncL;
  private long ncM;
  private long ncN;
  private byte[] ncO;
  private int ncP;
  double ncQ;
  private int videoFps;
  
  public c()
  {
    GMTrace.i(20196278403072L, 150474);
    this.ncO = null;
    this.mBy = false;
    this.ncP = 0;
    this.frameCount = 0;
    GMTrace.o(20196278403072L, 150474);
  }
  
  public static Point aPT()
  {
    GMTrace.i(20196681056256L, 150477);
    Point localPoint = new Point(MP4MuxerJNI.ffmpegGetVideoWidth(), MP4MuxerJNI.ffmpegGetVideoHeight());
    GMTrace.o(20196681056256L, 150477);
    return localPoint;
  }
  
  public final void aPS()
  {
    GMTrace.i(20196546838528L, 150476);
    w.i("MicroMsg.FFMpegTranscodeDecoder", "startDecodeBlockLoop");
    this.mBy = true;
    this.frameCount = 0;
    boolean bool2;
    do
    {
      if (!this.mBy)
      {
        GMTrace.o(20196546838528L, 150476);
        return;
      }
      long l = bg.Pw();
      this.ncO = MP4MuxerJNI.ffmpegGetNextVideoFrameData(this.ncO);
      w.d("MicroMsg.FFMpegTranscodeDecoder", "ffmpegGetNextVideoFrameData used %sms", new Object[] { Long.valueOf(bg.aI(l)) });
      bool2 = MP4MuxerJNI.ffmpegCheckIfReachEndTimestamp();
      this.frameCount += 1;
    } while ((this.ncP > 1) && (this.frameCount % this.ncP == 0));
    a locala;
    byte[] arrayOfByte;
    if (this.ncK != null)
    {
      locala = this.ncK;
      arrayOfByte = this.ncO;
      if ((this.ncO != null) && (!bool2)) {
        break label236;
      }
    }
    label236:
    for (boolean bool1 = true;; bool1 = false)
    {
      locala.a(arrayOfByte, bool1, (this.frameCount * this.ncQ * 1000.0D));
      if ((this.ncO != null) && (!bool2)) {
        break;
      }
      w.e("MicroMsg.FFMpegTranscodeDecoder", "ret buffer is null or reachEnd? %s", new Object[] { Boolean.valueOf(bool2) });
      w.i("MicroMsg.FFMpegTranscodeDecoder", "decode finish, frame count: %s", new Object[] { Integer.valueOf(this.frameCount) });
      this.mBy = false;
      GMTrace.o(20196546838528L, 150476);
      return;
    }
  }
  
  public final int b(String paramString, long paramLong1, long paramLong2, int paramInt)
  {
    GMTrace.i(20196412620800L, 150475);
    w.i("MicroMsg.FFMpegTranscodeDecoder", "initDecoder, srcFilePath: %s, start: %s, end: %s, videoFps: %s", new Object[] { paramString, Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt) });
    this.ncL = paramString;
    this.ncM = paramLong1;
    this.ncN = paramLong2;
    this.videoFps = paramInt;
    this.ncQ = (1000.0D / paramInt);
    if (!bg.nm(paramString))
    {
      long l = bg.Pw();
      paramInt = MP4MuxerJNI.ffmpegOpenAndSeekFile(paramString, paramLong1 * 1000.0D, paramLong2 * 1000.0D);
      w.i("MicroMsg.FFMpegTranscodeDecoder", "ffmpegOpenAndSeekFile used %sms", new Object[] { Long.valueOf(bg.aI(l)) });
      GMTrace.o(20196412620800L, 150475);
      return paramInt;
    }
    GMTrace.o(20196412620800L, 150475);
    return -1;
  }
  
  public static abstract interface a
  {
    public abstract void a(byte[] paramArrayOfByte, boolean paramBoolean, long paramLong);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */