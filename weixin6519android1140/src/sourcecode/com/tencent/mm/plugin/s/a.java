package com.tencent.mm.plugin.s;

import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.b.c;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.nio.ByteBuffer;

public final class a
  extends h
{
  private int channels;
  private AudioTrack hdT;
  private boolean jGN;
  private int sampleRate;
  
  public a(g paramg, ae paramae)
  {
    super(paramg, paramae);
    GMTrace.i(12899800055808L, 96111);
    this.jGN = false;
    GMTrace.o(12899800055808L, 96111);
  }
  
  private int getSampleRate()
  {
    GMTrace.i(12900739579904L, 96118);
    if (this.sampleRate == 0) {
      this.sampleRate = this.mVI.getInteger("sample-rate");
    }
    int i = this.sampleRate;
    GMTrace.o(12900739579904L, 96118);
    return i;
  }
  
  final boolean a(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, ByteBuffer paramByteBuffer, int paramInt, MediaCodec.BufferInfo paramBufferInfo)
  {
    GMTrace.i(12899934273536L, 96112);
    w.d("MicroMsg.AudioTrackDataSource", "%s start to process output buffer state %d time[%d, %d] index %d", new Object[] { aiJ(), Integer.valueOf(this.state), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt) });
    if (!d.qx(this.state))
    {
      w.i("MicroMsg.AudioTrackDataSource", "%s it no need process buffer now state %d", new Object[] { aiJ(), Integer.valueOf(this.state) });
      GMTrace.o(12899934273536L, 96112);
      return false;
    }
    if (this.hdT == null)
    {
      w.i("MicroMsg.AudioTrackDataSource", "%s init audio track", new Object[] { aiJ() });
      if (this.channels == 0) {
        this.channels = this.mVI.getInteger("channel-count");
      }
      if (this.channels == 1)
      {
        i = 4;
        int j = AudioTrack.getMinBufferSize(getSampleRate(), i, 2);
        this.hdT = new c(3, getSampleRate(), i, 2, j);
        if ((this.hdT == null) || (this.hdT.getState() == 1)) {
          break label281;
        }
        w.w("MicroMsg.AudioTrackDataSource", "%s can not create audio track [%d]", new Object[] { aiJ(), Integer.valueOf(this.hdT.getState()) });
        this.hdT.release();
        this.hdT = null;
      }
      for (i = 0;; i = 1)
      {
        if (i != 0) {
          break label295;
        }
        GMTrace.o(12899934273536L, 96112);
        return false;
        i = 12;
        break;
        label281:
        setMute(this.jGN);
      }
    }
    label295:
    if ((d.qs(this.state)) && ((this.hdT.getPlayState() == 2) || (this.hdT.getPlayState() == 1))) {
      onStart();
    }
    if (this.state == 4) {}
    for (int i = 1;; i = 0)
    {
      if ((i != 0) && (this.hdT.getPlayState() == 3)) {
        onPause();
      }
      try
      {
        this.mVD.mVu = paramBufferInfo.presentationTimeUs;
        paramBufferInfo = new byte[paramBufferInfo.size];
        paramByteBuffer.get(paramBufferInfo);
        paramByteBuffer.clear();
        if (paramBufferInfo.length > 0) {
          this.hdT.write(paramBufferInfo, 0, paramBufferInfo.length);
        }
        w.d("MicroMsg.AudioTrackDataSource", "%s finish to process index[%d] time[%d] to audio track", new Object[] { aiJ(), Integer.valueOf(paramInt), Long.valueOf(this.mVD.mVu) });
        paramMediaCodec.releaseOutputBuffer(paramInt, false);
      }
      catch (Exception paramMediaCodec)
      {
        for (;;)
        {
          w.e("MicroMsg.AudioTrackDataSource", "%s audio release output buffer error %s", new Object[] { aiJ(), paramMediaCodec.toString() });
        }
      }
      GMTrace.o(12899934273536L, 96112);
      return true;
    }
  }
  
  final boolean a(MediaCodec paramMediaCodec)
  {
    GMTrace.i(12900605362176L, 96117);
    w.i("MicroMsg.AudioTrackDataSource", "%s handle decoder before start", new Object[] { aiJ() });
    paramMediaCodec.configure(this.mVI, null, null, 0);
    GMTrace.o(12900605362176L, 96117);
    return false;
  }
  
  final String aOv()
  {
    GMTrace.i(12901008015360L, 96120);
    GMTrace.o(12901008015360L, 96120);
    return "audio";
  }
  
  protected final void b(MediaCodec paramMediaCodec)
  {
    GMTrace.i(12900873797632L, 96119);
    w.i("MicroMsg.AudioTrackDataSource", "%s on output format changed", new Object[] { aiJ() });
    this.sampleRate = 0;
    this.channels = 0;
    this.hdT = null;
    GMTrace.o(12900873797632L, 96119);
  }
  
  protected final void onPause()
  {
    GMTrace.i(12900202708992L, 96114);
    w.i("MicroMsg.AudioTrackDataSource", "%s on pause", new Object[] { aiJ() });
    if ((this.hdT != null) && (this.hdT.getState() == 1)) {
      this.hdT.pause();
    }
    GMTrace.o(12900202708992L, 96114);
  }
  
  protected final void onStart()
  {
    GMTrace.i(12900068491264L, 96113);
    w.i("MicroMsg.AudioTrackDataSource", "%s on start", new Object[] { aiJ() });
    if ((this.hdT != null) && (this.hdT.getState() == 1)) {
      this.hdT.play();
    }
    GMTrace.o(12900068491264L, 96113);
  }
  
  public final void release()
  {
    GMTrace.i(12900336926720L, 96115);
    try
    {
      this.hdT.flush();
      this.hdT.release();
      super.release();
      GMTrace.o(12900336926720L, 96115);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public final void setMute(boolean paramBoolean)
  {
    GMTrace.i(12900471144448L, 96116);
    if (this.hdT == null)
    {
      w.w("MicroMsg.AudioTrackDataSource", "%s set mute[%b] but audio track is null", new Object[] { aiJ(), Boolean.valueOf(paramBoolean) });
      this.jGN = paramBoolean;
      GMTrace.o(12900471144448L, 96116);
      return;
    }
    if (com.tencent.mm.compatible.util.d.eu(21))
    {
      w.d("MicroMsg.AudioTrackDataSource", "%s api below 21 set mute[%b]", new Object[] { aiJ(), Boolean.valueOf(paramBoolean) });
      if (paramBoolean)
      {
        this.hdT.setStereoVolume(0.0F, 0.0F);
        GMTrace.o(12900471144448L, 96116);
        return;
      }
      this.hdT.setStereoVolume(1.0F, 1.0F);
      GMTrace.o(12900471144448L, 96116);
      return;
    }
    w.d("MicroMsg.AudioTrackDataSource", "%s api higher 21 set mute[%b]", new Object[] { aiJ(), Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      this.hdT.setVolume(0.0F);
      GMTrace.o(12900471144448L, 96116);
      return;
    }
    this.hdT.setVolume(1.0F);
    GMTrace.o(12900471144448L, 96116);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\s\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */