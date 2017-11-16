package com.tencent.mm.plugin.mmsight.segment;

import android.graphics.Bitmap;
import android.graphics.Point;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.memory.o.b;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.w;

public class FFmpegSightJNIThumbFetcher
  implements d
{
  private static final String TAG = "MicroMsg.FFmpegSightJNIThumbFetcher";
  private int mBufId;
  private int mDurationMs;
  private Bitmap mReusedBitmap;
  private int mScaledHeight;
  private int mScaledWidth;
  
  public FFmpegSightJNIThumbFetcher()
  {
    GMTrace.i(7468142821376L, 55642);
    GMTrace.o(7468142821376L, 55642);
  }
  
  private Point calculateScaledLength(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Point paramPoint)
  {
    GMTrace.i(7468411256832L, 55644);
    if (paramPoint == null) {
      throw new IllegalArgumentException("FFmpegThumbFetcherImpl : Point to calculateScaledLength can not be null.");
    }
    if ((paramInt2 <= 0) && (paramInt1 <= 0))
    {
      paramPoint.x = paramInt3;
      paramPoint.y = paramInt4;
      GMTrace.o(7468411256832L, 55644);
      return paramPoint;
    }
    if (paramInt1 <= 0)
    {
      paramPoint.x = ((int)(paramInt2 / paramInt4 * paramInt3));
      paramPoint.y = paramInt2;
      GMTrace.o(7468411256832L, 55644);
      return paramPoint;
    }
    if (paramInt2 <= 0)
    {
      paramPoint.x = paramInt1;
      paramPoint.y = ((int)(paramInt1 / paramInt3 * paramInt4));
      GMTrace.o(7468411256832L, 55644);
      return paramPoint;
    }
    if (paramInt2 / paramInt1 > paramInt4 / paramInt3) {
      paramPoint.x = ((int)(paramInt3 * paramInt2 / paramInt4));
    }
    for (paramPoint.y = paramInt2;; paramPoint.y = ((int)(paramInt4 * paramInt1 / paramInt3)))
    {
      GMTrace.o(7468411256832L, 55644);
      return paramPoint;
      paramPoint.x = paramInt1;
    }
  }
  
  public int getDurationMs()
  {
    GMTrace.i(7468813910016L, 55647);
    w.i("MicroMsg.FFmpegSightJNIThumbFetcher", "getDurationMs() returned: " + this.mDurationMs);
    int i = this.mDurationMs;
    GMTrace.o(7468813910016L, 55647);
    return i;
  }
  
  public Bitmap getFrameAtTime(long paramLong)
  {
    long l = 0L;
    GMTrace.i(7468679692288L, 55646);
    w.i("MicroMsg.FFmpegSightJNIThumbFetcher", "getFrameAtTime() called with: timeMs = [%d], mBufId = [%d]", new Object[] { Long.valueOf(paramLong), Integer.valueOf(this.mBufId) });
    if (paramLong > this.mDurationMs) {
      paramLong = this.mDurationMs;
    }
    for (;;)
    {
      if (paramLong < 0L) {
        paramLong = l;
      }
      for (;;)
      {
        w.i("MicroMsg.FFmpegSightJNIThumbFetcher", "getFrameAtTime() seekStream return %d", new Object[] { Integer.valueOf(SightVideoJNI.seekStreamWithFlag((float)paramLong / 1000.0F, 1, this.mBufId)) });
        if ((this.mReusedBitmap == null) || (this.mReusedBitmap.isRecycled()) || (this.mReusedBitmap.getWidth() != this.mScaledWidth) || (this.mReusedBitmap.getHeight() != this.mScaledHeight))
        {
          if ((this.mReusedBitmap != null) && (!this.mReusedBitmap.isRecycled())) {
            com.tencent.mm.memory.o.gib.g(this.mReusedBitmap);
          }
          this.mReusedBitmap = com.tencent.mm.memory.o.gib.a(new o.b(this.mScaledWidth, this.mScaledHeight));
        }
        w.i("MicroMsg.FFmpegSightJNIThumbFetcher", "getFrameAtTime() dr return %d", new Object[] { Integer.valueOf(SightVideoJNI.drawScaledFrame(this.mBufId, this.mReusedBitmap, this.mScaledWidth, this.mScaledHeight)) });
        Bitmap localBitmap = this.mReusedBitmap;
        this.mReusedBitmap = null;
        GMTrace.o(7468679692288L, 55646);
        return localBitmap;
      }
    }
  }
  
  public int getScaledHeight()
  {
    GMTrace.i(7469082345472L, 55649);
    w.i("MicroMsg.FFmpegSightJNIThumbFetcher", "getScaledHeight() returned: " + this.mScaledHeight);
    int i = this.mScaledHeight;
    GMTrace.o(7469082345472L, 55649);
    return i;
  }
  
  public int getScaledWidth()
  {
    GMTrace.i(7468948127744L, 55648);
    w.i("MicroMsg.FFmpegSightJNIThumbFetcher", "getScaledWidth() returned: " + this.mScaledWidth);
    int i = this.mScaledWidth;
    GMTrace.o(7468948127744L, 55648);
    return i;
  }
  
  public void init(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(7468277039104L, 55643);
    w.i("MicroMsg.FFmpegSightJNIThumbFetcher", "init() called with: path = [" + paramString + "], segment_interval = [" + paramInt1 + "], width = [" + paramInt2 + "], height = [" + paramInt3 + "]");
    this.mBufId = SightVideoJNI.openFile(paramString, 1, 16, false);
    if (this.mBufId < 0) {
      throw new o("open file error.");
    }
    paramInt1 = SightVideoJNI.getVideoWidth(this.mBufId);
    int i = SightVideoJNI.getVideoHeight(this.mBufId);
    this.mDurationMs = ((int)(SightVideoJNI.getVideoDuration(this.mBufId) * 1000.0D));
    paramString = calculateScaledLength(paramInt2, paramInt3, paramInt1, i, new Point());
    this.mScaledWidth = paramString.x;
    this.mScaledHeight = paramString.y;
    w.i("MicroMsg.FFmpegSightJNIThumbFetcher", "FFmpegSightJNIThumbFetcher.init. scaled size is (%d, %d); raw size is (%d, %d)", new Object[] { Integer.valueOf(this.mScaledWidth), Integer.valueOf(this.mScaledHeight), Integer.valueOf(paramInt1), Integer.valueOf(i) });
    GMTrace.o(7468277039104L, 55643);
  }
  
  public void release()
  {
    GMTrace.i(7469216563200L, 55650);
    w.i("MicroMsg.FFmpegSightJNIThumbFetcher", "release() called");
    e.post(new ReleaseRunnable(this.mReusedBitmap, this.mBufId), "release");
    GMTrace.o(7469216563200L, 55650);
  }
  
  public void reuseBitmap(Bitmap paramBitmap)
  {
    GMTrace.i(7468545474560L, 55645);
    w.i("MicroMsg.FFmpegSightJNIThumbFetcher", "reuseBitmap() called with: bitmap = [" + paramBitmap + "]");
    if (paramBitmap == null)
    {
      GMTrace.o(7468545474560L, 55645);
      return;
    }
    this.mReusedBitmap = paramBitmap;
    GMTrace.o(7468545474560L, 55645);
  }
  
  private static class ReleaseRunnable
    implements Runnable
  {
    int mBufId;
    Bitmap mReusedBitmap;
    
    public ReleaseRunnable(Bitmap paramBitmap, int paramInt)
    {
      GMTrace.i(7453781524480L, 55535);
      this.mReusedBitmap = paramBitmap;
      this.mBufId = paramInt;
      GMTrace.o(7453781524480L, 55535);
    }
    
    public void run()
    {
      GMTrace.i(7453915742208L, 55536);
      if ((this.mReusedBitmap != null) && (!this.mReusedBitmap.isRecycled())) {
        com.tencent.mm.memory.o.gib.g(this.mReusedBitmap);
      }
      SightVideoJNI.freeObj(this.mBufId);
      GMTrace.o(7453915742208L, 55536);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\segment\FFmpegSightJNIThumbFetcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */