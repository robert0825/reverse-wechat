package com.tencent.mm.plugin.s;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.nio.ByteBuffer;

public final class k
  extends h
{
  public Surface mWr;
  boolean mWs;
  private boolean mWt;
  public boolean mWu;
  long mWv;
  private int videoHeight;
  private int videoWidth;
  
  public k(g paramg, ae paramae)
  {
    super(paramg, paramae);
    GMTrace.i(12904766111744L, 96148);
    this.mWs = false;
    this.mWt = false;
    this.mWu = false;
    this.mWv = -1L;
    GMTrace.o(12904766111744L, 96148);
  }
  
  protected final void a(MediaFormat paramMediaFormat, String paramString, int paramInt)
  {
    GMTrace.i(12905437200384L, 96153);
    super.a(paramMediaFormat, paramString, paramInt);
    this.videoHeight = paramMediaFormat.getInteger("height");
    this.videoWidth = paramMediaFormat.getInteger("width");
    if (paramMediaFormat.containsKey("rotation-degrees")) {
      paramInt = paramMediaFormat.getInteger("rotation-degrees");
    }
    for (int i = 1;; i = 0)
    {
      if ((Math.abs(paramInt) == 90) || (Math.abs(paramInt) == 270))
      {
        int j = this.videoWidth;
        this.videoWidth = this.videoHeight;
        this.videoHeight = j;
      }
      if (i != 0) {
        paramInt = 0;
      }
      this.mVE.obtainMessage(4, this.videoWidth, this.videoHeight, Integer.valueOf(paramInt)).sendToTarget();
      w.i("MicroMsg.VideoTrackDataSource", "%s video size[%d, %d] degrees[%d]", new Object[] { aiJ(), Integer.valueOf(this.videoWidth), Integer.valueOf(this.videoHeight), Integer.valueOf(paramInt) });
      GMTrace.o(12905437200384L, 96153);
      return;
      paramInt = SightVideoJNI.getMp4Rotate(this.path);
      w.w("MicroMsg.VideoTrackDataSource", "%s it don't contains rotation key. degrees [%d]", new Object[] { aiJ(), Integer.valueOf(paramInt) });
    }
  }
  
  final boolean a(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, ByteBuffer paramByteBuffer, int paramInt, MediaCodec.BufferInfo paramBufferInfo)
  {
    GMTrace.i(12904900329472L, 96149);
    w.d("MicroMsg.VideoTrackDataSource", "%s start to process output buffer state %d time[%d, %d] index %d", new Object[] { aiJ(), Integer.valueOf(this.state), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt) });
    if (d.qw(this.state))
    {
      w.i("MicroMsg.VideoTrackDataSource", "%s video track flush surface", new Object[] { aiJ() });
      paramMediaCodec.releaseOutputBuffer(paramInt, true);
      setState(4);
      GMTrace.o(12904900329472L, 96149);
      return true;
    }
    if (d.qv(this.state))
    {
      paramLong2 = paramBufferInfo.presentationTimeUs / 1000L;
      l1 = paramLong1 - paramLong2;
      w.d("MicroMsg.VideoTrackDataSource", "%s start to handle precision seek[%d, %d] diff[%d]", new Object[] { aiJ(), Long.valueOf(paramLong2), Long.valueOf(paramLong1), Long.valueOf(l1) });
      int i;
      if (l1 <= 30L)
      {
        i = 1;
        if (i == 0) {
          break label256;
        }
        w.i("MicroMsg.VideoTrackDataSource", "%s precision seek done to surface", new Object[] { aiJ() });
        paramMediaCodec.releaseOutputBuffer(paramInt, true);
        if (this.mWt)
        {
          setState(7);
          this.mWt = false;
        }
        this.mWt = true;
      }
      for (;;)
      {
        GMTrace.o(12904900329472L, 96149);
        return true;
        i = 0;
        break;
        label256:
        paramMediaCodec.releaseOutputBuffer(paramInt, false);
      }
    }
    if (!d.qx(this.state))
    {
      w.i("MicroMsg.VideoTrackDataSource", "%s it no need process buffer now state %d", new Object[] { aiJ(), Integer.valueOf(this.state) });
      GMTrace.o(12904900329472L, 96149);
      return false;
    }
    long l1 = paramBufferInfo.presentationTimeUs / 1000L;
    long l2 = SystemClock.elapsedRealtime();
    long l3 = l2 - paramLong2;
    long l4 = l1 - paramLong1 - l3;
    w.d("MicroMsg.VideoTrackDataSource", "%s earlyMs[%d] time[%d, %d, %d] sample[%d %d]", new Object[] { aiJ(), Long.valueOf(l4), Long.valueOf(l3), Long.valueOf(l2), Long.valueOf(paramLong2), Long.valueOf(paramLong1), Long.valueOf(l1) });
    if (l4 < -30L)
    {
      w.d("MicroMsg.VideoTrackDataSource", "%s finish to process but it too late to show video frame. throw now", new Object[] { aiJ() });
      paramMediaCodec.releaseOutputBuffer(paramInt, false);
      this.mVD.mVw = 0L;
      GMTrace.o(12904900329472L, 96149);
      return true;
    }
    if (l4 < 30L)
    {
      this.mVD.mVt = paramBufferInfo.presentationTimeUs;
      if (l4 <= 11L) {}
    }
    try
    {
      Thread.sleep(l4 - 10L);
      if (!d.qx(this.state))
      {
        w.i("MicroMsg.VideoTrackDataSource", "%s it no need process buffer now state %d", new Object[] { aiJ(), Integer.valueOf(this.state) });
        GMTrace.o(12904900329472L, 96149);
        return false;
      }
      w.i("MicroMsg.VideoTrackDataSource", "%s finish to process index[%d] time[%d] to surface", new Object[] { aiJ(), Integer.valueOf(paramInt), Long.valueOf(l1) });
      paramMediaCodec.releaseOutputBuffer(paramInt, true);
      GMTrace.o(12904900329472L, 96149);
      return true;
      w.d("MicroMsg.VideoTrackDataSource", "%s finish to process but it too early now do nothing.", new Object[] { aiJ() });
      GMTrace.o(12904900329472L, 96149);
      return false;
    }
    catch (Exception paramByteBuffer)
    {
      for (;;) {}
    }
  }
  
  final boolean a(MediaCodec paramMediaCodec)
  {
    GMTrace.i(12905168764928L, 96151);
    if (paramMediaCodec == null)
    {
      GMTrace.o(12905168764928L, 96151);
      return false;
    }
    if (this.mWr == null)
    {
      w.w("MicroMsg.VideoTrackDataSource", "%s decoder configure surface but surface is null.", new Object[] { aiJ() });
      this.mWs = false;
      w.i("MicroMsg.VideoTrackDataSource", "%s handleDecoderBeforeStart", new Object[] { aiJ() });
      if (this.mVN != null) {
        break label111;
      }
    }
    label111:
    for (MediaFormat localMediaFormat = this.mVI;; localMediaFormat = this.mVN.getTrackFormat(this.mVL))
    {
      paramMediaCodec.configure(localMediaFormat, this.mWr, null, 0);
      GMTrace.o(12905168764928L, 96151);
      return false;
      this.mWs = true;
      break;
    }
  }
  
  @TargetApi(23)
  public final void aOL()
  {
    GMTrace.i(17459310493696L, 130082);
    if (this.mVP != null) {
      this.mVP.setOutputSurface(this.mWr);
    }
    GMTrace.o(17459310493696L, 130082);
  }
  
  public final void aOM()
  {
    GMTrace.i(17459444711424L, 130083);
    w.i("MicroMsg.VideoTrackDataSource", "%s change surface below 23", new Object[] { aiJ() });
    if (this.mVP != null)
    {
      releaseDecoder();
      o(this.mVD.mVt, -1L);
      aOF();
    }
    GMTrace.o(17459444711424L, 130083);
  }
  
  final String aOv()
  {
    GMTrace.i(12905034547200L, 96150);
    GMTrace.o(12905034547200L, 96150);
    return "video";
  }
  
  protected final void b(MediaCodec paramMediaCodec)
  {
    GMTrace.i(12905302982656L, 96152);
    w.i("MicroMsg.VideoTrackDataSource", "%s output format changed", new Object[] { aiJ() });
    paramMediaCodec.setVideoScalingMode(1);
    GMTrace.o(12905302982656L, 96152);
  }
  
  protected final boolean z(int paramInt, long paramLong)
  {
    GMTrace.i(12905571418112L, 96154);
    w.d("MicroMsg.VideoTrackDataSource", "%s reset extractor flag[%d] needReset[%b]", new Object[] { aiJ(), Integer.valueOf(paramInt), Boolean.valueOf(this.mVD.mVy) });
    if ((this.mVD.mVy) && (paramInt == 1) && (this.mWv != paramLong))
    {
      boolean bool = o(paramLong, -1L);
      this.mWv = paramLong;
      GMTrace.o(12905571418112L, 96154);
      return bool;
    }
    GMTrace.o(12905571418112L, 96154);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\s\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */