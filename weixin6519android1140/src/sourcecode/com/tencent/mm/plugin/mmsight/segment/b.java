package com.tencent.mm.plugin.mmsight.segment;

import android.graphics.Point;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  implements e
{
  private int frameCount;
  private boolean mBy;
  private String ncL;
  private long ncM;
  private long ncN;
  private byte[] ncO;
  private int ncP;
  private e.a nds;
  
  public b()
  {
    GMTrace.i(7472572006400L, 55675);
    this.ncO = null;
    this.mBy = false;
    this.frameCount = 0;
    GMTrace.o(7472572006400L, 55675);
  }
  
  public final void a(e.a parama)
  {
    GMTrace.i(7472974659584L, 55678);
    this.nds = parama;
    GMTrace.o(7472974659584L, 55678);
  }
  
  public final Point aPT()
  {
    GMTrace.i(7473108877312L, 55679);
    Point localPoint = new Point(MP4MuxerJNI.ffmpegGetVideoWidth(), MP4MuxerJNI.ffmpegGetVideoHeight());
    GMTrace.o(7473108877312L, 55679);
    return localPoint;
  }
  
  public final int aPW()
  {
    GMTrace.i(7473377312768L, 55681);
    GMTrace.o(7473377312768L, 55681);
    return 2;
  }
  
  public final int o(String paramString, long paramLong1, long paramLong2)
  {
    GMTrace.i(7472706224128L, 55676);
    w.i("MicroMsg.FFMpegTranscodeDecoder", "initDecoder, srcFilePath: %s, start: %s, end: %s", new Object[] { paramString, Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
    this.ncL = paramString;
    this.ncM = paramLong1;
    this.ncN = paramLong2;
    if (!bg.nm(paramString))
    {
      long l = bg.Pw();
      int i = MP4MuxerJNI.ffmpegOpenAndSeekFile(paramString, paramLong1 * 1000.0D, paramLong2 * 1000.0D);
      w.i("MicroMsg.FFMpegTranscodeDecoder", "ffmpegOpenAndSeekFile used %sms", new Object[] { Long.valueOf(bg.aI(l)) });
      GMTrace.o(7472706224128L, 55676);
      return i;
    }
    GMTrace.o(7472706224128L, 55676);
    return -1;
  }
  
  public final void qO(int paramInt)
  {
    GMTrace.i(7473511530496L, 55682);
    w.i("MicroMsg.FFMpegTranscodeDecoder", "setFrameDropInterval: %s", new Object[] { Integer.valueOf(paramInt) });
    this.ncP = paramInt;
    GMTrace.o(7473511530496L, 55682);
  }
  
  public final void stop()
  {
    GMTrace.i(7473243095040L, 55680);
    w.i("MicroMsg.FFMpegTranscodeDecoder", "stop, start: %s", new Object[] { Boolean.valueOf(this.mBy) });
    this.mBy = false;
    GMTrace.o(7473243095040L, 55680);
  }
  
  public final void y(Runnable paramRunnable)
  {
    GMTrace.i(7472840441856L, 55677);
    w.i("MicroMsg.FFMpegTranscodeDecoder", "startDecodeBlockLoop");
    this.mBy = true;
    this.frameCount = 0;
    for (;;)
    {
      if (!this.mBy)
      {
        GMTrace.o(7472840441856L, 55677);
        return;
      }
      long l = bg.Pw();
      this.ncO = MP4MuxerJNI.ffmpegGetNextVideoFrameData(this.ncO);
      w.d("MicroMsg.FFMpegTranscodeDecoder", "ffmpegGetNextVideoFrameData used %sms", new Object[] { Long.valueOf(bg.aI(l)) });
      boolean bool = MP4MuxerJNI.ffmpegCheckIfReachEndTimestamp();
      if ((this.ncO == null) || (bool))
      {
        w.e("MicroMsg.FFMpegTranscodeDecoder", "ret buffer is null or reachEnd? %s", new Object[] { Boolean.valueOf(bool) });
        this.mBy = false;
        paramRunnable.run();
        GMTrace.o(7472840441856L, 55677);
        return;
      }
      this.frameCount += 1;
      if (((this.ncP <= 1) || (this.frameCount % this.ncP != 0)) && (this.nds != null)) {
        this.nds.ay(this.ncO);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\segment\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */