package com.tencent.mm.plugin.mmsight.model.a;

import android.annotation.TargetApi;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.nio.ByteBuffer;

@Deprecated
@TargetApi(18)
public final class o
  implements e
{
  boolean isStart;
  private MediaMuxer nbT;
  private int nbU;
  private int nbV;
  long nbW;
  
  public final void a(MediaFormat paramMediaFormat)
  {
    try
    {
      GMTrace.i(7340904415232L, 54694);
      try
      {
        if ((this.nbT != null) && (this.nbU == -1))
        {
          this.nbU = this.nbT.addTrack(paramMediaFormat);
          w.i("MicroMsg.MMSightSystemMediaMuxer", "addX264Track, x264TrackIndex: %s", new Object[] { Integer.valueOf(this.nbU) });
          if ((!this.isStart) && (this.nbU != -1) && (this.nbV != -1))
          {
            w.i("MicroMsg.MMSightSystemMediaMuxer", "start!");
            this.nbT.start();
            this.isStart = true;
          }
        }
        GMTrace.o(7340904415232L, 54694);
      }
      catch (Exception paramMediaFormat)
      {
        for (;;)
        {
          w.e("MicroMsg.MMSightSystemMediaMuxer", "addX264Track error: %s", new Object[] { paramMediaFormat.getMessage() });
          GMTrace.o(7340904415232L, 54694);
        }
      }
      return;
    }
    finally {}
  }
  
  public final boolean aPF()
  {
    GMTrace.i(7340770197504L, 54693);
    GMTrace.o(7340770197504L, 54693);
    return false;
  }
  
  public final void b(MediaFormat paramMediaFormat)
  {
    try
    {
      GMTrace.i(7341038632960L, 54695);
      try
      {
        if ((this.nbT != null) && (this.nbV == -1))
        {
          this.nbV = this.nbT.addTrack(paramMediaFormat);
          w.i("MicroMsg.MMSightSystemMediaMuxer", "addAACTrack, aacTrackIndex: %s", new Object[] { Integer.valueOf(this.nbV) });
          if ((!this.isStart) && (this.nbV != -1) && (this.nbU != -1))
          {
            w.i("MicroMsg.MMSightSystemMediaMuxer", "start!");
            this.nbT.start();
            this.isStart = true;
          }
        }
        GMTrace.o(7341038632960L, 54695);
      }
      catch (Exception paramMediaFormat)
      {
        for (;;)
        {
          w.e("MicroMsg.MMSightSystemMediaMuxer", "addAACTrack error: %s", new Object[] { paramMediaFormat.getMessage() });
          GMTrace.o(7341038632960L, 54695);
        }
      }
      return;
    }
    finally {}
  }
  
  public final void b(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    try
    {
      GMTrace.i(7341172850688L, 54696);
      try
      {
        if ((this.nbT != null) && (this.nbV != -1) && (this.isStart) && (paramByteBuffer != null) && (paramBufferInfo != null))
        {
          long l1 = paramBufferInfo.presentationTimeUs;
          paramBufferInfo.presentationTimeUs = ((System.nanoTime() - this.nbW) / 1000L);
          long l2 = bg.Pw();
          this.nbT.writeSampleData(this.nbV, paramByteBuffer, paramBufferInfo);
          w.v("MicroMsg.MMSightSystemMediaMuxer", "writeAACSampleData size: %s used %dms oldpts %s fix pts: %s", new Object[] { Integer.valueOf(paramBufferInfo.size), Long.valueOf(bg.aI(l2)), Long.valueOf(l1), Long.valueOf(paramBufferInfo.presentationTimeUs) });
        }
        GMTrace.o(7341172850688L, 54696);
      }
      catch (Exception paramByteBuffer)
      {
        for (;;)
        {
          w.e("MicroMsg.MMSightSystemMediaMuxer", "writeAACSampleData error: %s", new Object[] { paramByteBuffer.getMessage() });
          GMTrace.o(7341172850688L, 54696);
        }
      }
      return;
    }
    finally {}
  }
  
  public final void c(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    int j = 1;
    for (;;)
    {
      try
      {
        GMTrace.i(7341307068416L, 54697);
        try
        {
          if ((this.nbT != null) && (this.nbU != -1) && (this.isStart))
          {
            if (paramByteBuffer == null) {
              continue;
            }
            i = 1;
            break label203;
            if ((j & i) != 0)
            {
              long l1 = paramBufferInfo.presentationTimeUs;
              paramBufferInfo.presentationTimeUs = ((System.nanoTime() - this.nbW) / 1000L);
              paramBufferInfo.flags = 1;
              long l2 = bg.Pw();
              this.nbT.writeSampleData(this.nbU, paramByteBuffer, paramBufferInfo);
              w.v("MicroMsg.MMSightSystemMediaMuxer", "writeAACSampleData size: %s used %dms oldpts %s fix pts: %s", new Object[] { Integer.valueOf(paramBufferInfo.size), Long.valueOf(bg.aI(l2)), Long.valueOf(l1), Long.valueOf(paramBufferInfo.presentationTimeUs) });
            }
          }
          GMTrace.o(7341307068416L, 54697);
        }
        catch (Exception paramByteBuffer)
        {
          int i;
          w.e("MicroMsg.MMSightSystemMediaMuxer", "writeX264SampleData error: %s", new Object[] { paramByteBuffer.getMessage() });
          GMTrace.o(7341307068416L, 54697);
          continue;
        }
        return;
      }
      finally {}
      i = 0;
      break label203;
      j = 0;
      continue;
      label203:
      if (paramBufferInfo == null) {}
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\a\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */