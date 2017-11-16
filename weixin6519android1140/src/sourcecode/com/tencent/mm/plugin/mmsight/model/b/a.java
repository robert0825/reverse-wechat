package com.tencent.mm.plugin.mmsight.model.b;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.mmsight.model.a.j;
import com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class a
  extends com.tencent.mm.plugin.mmsight.api.a
{
  private String filePath;
  private int inputHeight;
  private int inputWidth;
  private int irV;
  private int ljb;
  private MediaExtractor mVN;
  private int nap;
  private int ncA;
  public Point ncB;
  public HandlerThread ncC;
  public a ncD;
  public Bitmap ncE;
  private byte[] ncF;
  public byte[] ncG;
  public c ncs;
  public d nct;
  private String ncu;
  private int ncv;
  public int ncw;
  private long ncx;
  private long ncy;
  private int ncz;
  private int outputHeight;
  private int outputWidth;
  private int videoFps;
  
  public a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(20194802008064L, 150463);
    this.ljb = -1;
    this.ncx = -1L;
    this.ncy = -1L;
    this.ncz = -1;
    this.ncB = null;
    this.ncF = null;
    this.ncG = null;
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)) || (paramInt1 <= 0) || (paramInt2 <= 0))
    {
      w.e("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "create MMSightFFMpegMediaCodecRemuxer error, filePath: %s, outputFilePath: %s, outputWidth: %s, outputHeight: %s, outputFps: %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt4) });
      GMTrace.o(20194802008064L, 150463);
      return;
    }
    this.filePath = paramString1;
    this.ncu = paramString2;
    this.outputWidth = paramInt1;
    this.outputHeight = paramInt2;
    this.ncv = paramInt3;
    this.ncz = paramInt4;
    this.ncw = SightVideoJNI.getMp4Rotate(paramString1);
    com.tencent.mm.plugin.sight.base.a locala = com.tencent.mm.plugin.sight.base.d.GB(paramString1);
    if (locala != null)
    {
      this.inputWidth = locala.width;
      this.inputHeight = locala.height;
      this.ljb = locala.ljb;
      this.videoFps = locala.ncj;
    }
    this.ncx = 0L;
    this.ncy = this.ljb;
    w.i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "create MMSightFFMpegMediaCodecRemuxer, filePath: %s, outputFilePath: %s, inputWidth: %s, inputHeight: %s, videoRotate: %s, outputWidth: %s, outputHeight: %s", new Object[] { paramString1, paramString2, Integer.valueOf(this.inputWidth), Integer.valueOf(this.inputHeight), Integer.valueOf(this.ncw), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    GMTrace.o(20194802008064L, 150463);
  }
  
  public a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2)
  {
    GMTrace.i(20194936225792L, 150464);
    this.ljb = -1;
    this.ncx = -1L;
    this.ncy = -1L;
    this.ncz = -1;
    this.ncB = null;
    this.ncF = null;
    this.ncG = null;
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)) || (paramInt1 <= 0) || (paramInt2 <= 0))
    {
      w.e("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "create MMSightFFMpegMediaCodecRemuxer error, filePath: %s, outputFilePath: %s, outputWidth: %s, outputHeight: %s, outputFps: %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt4) });
      GMTrace.o(20194936225792L, 150464);
      return;
    }
    this.filePath = paramString1;
    this.ncu = paramString2;
    this.outputWidth = paramInt1;
    this.outputHeight = paramInt2;
    this.ncv = paramInt3;
    this.ncz = paramInt4;
    this.ncw = SightVideoJNI.getMp4Rotate(paramString1);
    com.tencent.mm.plugin.sight.base.a locala = com.tencent.mm.plugin.sight.base.d.GB(paramString1);
    if (locala != null)
    {
      this.inputWidth = locala.width;
      this.inputHeight = locala.height;
      this.videoFps = locala.ncj;
    }
    this.ncx = paramLong1;
    this.ncy = paramLong2;
    w.i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "create MMSightFFMpegMediaCodecRemuxer, filePath: %s, outputFilePath: %s, inputWidth: %s, inputHeight: %s, videoRotate: %s, outputWidth: %s, outputHeight: %s, startTimeMs: %s, endTimeMs: %s", new Object[] { paramString1, paramString2, Integer.valueOf(this.inputWidth), Integer.valueOf(this.inputHeight), Integer.valueOf(this.ncw), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
    GMTrace.o(20194936225792L, 150464);
  }
  
  public final void A(Bitmap paramBitmap)
  {
    GMTrace.i(20195070443520L, 150465);
    if (paramBitmap != null) {
      this.ncE = paramBitmap;
    }
    GMTrace.o(20195070443520L, 150465);
  }
  
  public final int aOO()
  {
    GMTrace.i(20195204661248L, 150466);
    int j = Math.round(this.ljb / 1000.0F);
    int i = j;
    if (this.ncx >= 0L)
    {
      i = j;
      if (this.ncy >= 0L) {
        i = Math.round((float)(this.ncy - this.ncx) / 1000.0F) + 1;
      }
    }
    this.nap = MP4MuxerJNI.initDataBuf(i);
    this.ncs = new c();
    if (this.ljb > 0) {}
    for (i = this.ncs.b(this.filePath, 0L, this.ljb, this.videoFps);; i = this.ncs.b(this.filePath, this.ncx, this.ncy, this.videoFps))
    {
      w.i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "decoder init ret: %s", new Object[] { Integer.valueOf(i) });
      if (i >= 0) {
        break label251;
      }
      MP4MuxerJNI.releaseDataBuf(this.nap);
      GMTrace.o(20195204661248L, 150466);
      return -1;
      if ((this.ncx < 0L) || (this.ncy < 0L)) {
        break;
      }
    }
    w.e("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "remux time error, videoDuration: %s, remuxStartTime: %s, remuxEndTime: %s", new Object[] { Integer.valueOf(this.ljb), Long.valueOf(this.ncx), Long.valueOf(this.ncy) });
    MP4MuxerJNI.releaseDataBuf(this.nap);
    GMTrace.o(20195204661248L, 150466);
    return -1;
    label251:
    if ((this.ncz > 0) && (this.ncz < this.videoFps)) {
      this.ncs.ncQ = ((int)Math.ceil(this.videoFps / this.ncz));
    }
    if (this.ncz > 0)
    {
      i = Math.min(this.ncz, this.videoFps);
      this.nct = new d(this.inputWidth, this.inputHeight, this.outputWidth, this.outputHeight, this.ncv, i);
      this.ncs.ncK = new c.a()
      {
        public final void a(byte[] paramAnonymousArrayOfByte, boolean paramAnonymousBoolean, long paramAnonymousLong)
        {
          int i = 1;
          GMTrace.i(20192654524416L, 150447);
          if (a.this.ncC == null)
          {
            a.this.ncC = e.cK("remuxer_encode", -2);
            a.this.ncC.start();
            a.this.ncD = new a.a(a.this, a.this.ncC.getLooper());
          }
          Message localMessage;
          byte[] arrayOfByte;
          if (a.this.ncD != null)
          {
            localMessage = Message.obtain();
            localMessage.what = 1;
            if (paramAnonymousArrayOfByte == null) {
              break label174;
            }
            arrayOfByte = j.naP.h(Integer.valueOf(paramAnonymousArrayOfByte.length));
            if (arrayOfByte != null) {
              System.arraycopy(paramAnonymousArrayOfByte, 0, arrayOfByte, 0, arrayOfByte.length);
            }
            localMessage.obj = arrayOfByte;
            if (!paramAnonymousBoolean) {
              break label180;
            }
          }
          for (;;)
          {
            localMessage.arg1 = i;
            localMessage.arg2 = ((int)paramAnonymousLong);
            a.this.ncD.sendMessage(localMessage);
            GMTrace.o(20192654524416L, 150447);
            return;
            label174:
            arrayOfByte = null;
            break;
            label180:
            i = 0;
          }
        }
      };
      this.nct.ncR = new d.a()
      {
        public final void a(int paramAnonymousInt1, ByteBuffer paramAnonymousByteBuffer, int paramAnonymousInt2)
        {
          GMTrace.i(20193057177600L, 150450);
          MP4MuxerJNI.writeH264Data(paramAnonymousInt1, paramAnonymousByteBuffer, paramAnonymousInt2);
          GMTrace.o(20193057177600L, 150450);
        }
      };
    }
    for (;;)
    {
      MediaFormat localMediaFormat;
      Object localObject3;
      try
      {
        this.nct.qN(this.nap);
        Object localObject1 = this.nct;
        w.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "Start");
        ((d)localObject1).isStart = true;
        this.ncs.aPS();
        this.ncC.quitSafely();
        this.ncC.join();
        this.ncD = null;
        this.mVN = new MediaExtractor();
        try
        {
          this.mVN.setDataSource(this.filePath);
          localObject1 = null;
          i = 0;
          if (i >= this.mVN.getTrackCount()) {
            break label971;
          }
          localMediaFormat = this.mVN.getTrackFormat(i);
          localObject1 = localMediaFormat.getString("mime");
          if (!((String)localObject1).startsWith("audio/")) {
            break label892;
          }
          localObject3 = localObject1;
          localObject1 = localMediaFormat;
          if ((i >= 0) && (localObject1 != null) && (!bg.nm((String)localObject3)))
          {
            this.irV = ((MediaFormat)localObject1).getInteger("channel-count");
            this.ncA = ((MediaFormat)localObject1).getInteger("sample-rate");
            this.mVN.selectTrack(i);
            if (this.ncx > 0L) {
              this.mVN.seekTo(this.ncx * 1000L, 0);
            }
            localObject1 = ByteBuffer.allocateDirect(((MediaFormat)localObject1).getInteger("max-input-size"));
            ((ByteBuffer)localObject1).clear();
            j = this.mVN.readSampleData((ByteBuffer)localObject1, 0);
            w.d("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "sampleSize: %d", new Object[] { Integer.valueOf(j) });
            if (j > 0) {
              break label899;
            }
            w.i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "muxAudio size = %d. Saw eos.", new Object[] { Integer.valueOf(j) });
          }
        }
        catch (IOException localIOException)
        {
          long l;
          w.printErrStackTrace("MicroMsg.MMSightFFMpegMediaCodecRemuxer", localIOException, "muxAudio create extractor failed: %s", new Object[] { localIOException.getMessage() });
          continue;
        }
        localObject3 = this.ncu;
        localObject1 = localObject3;
        if (this.ncw > 0) {
          localObject1 = (String)localObject3 + "tempRotate.mp4";
        }
        l = this.ljb;
        if (l > 0L) {
          break label968;
        }
        l = this.ncy - this.ncx;
        i = MP4MuxerJNI.muxing(this.nap, this.ncA, 1024, 2, this.irV, (String)localObject1, this.nct.frameCount * 1000.0F / (float)l, null, 0);
        w.i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "muxing ret: %s", new Object[] { Integer.valueOf(i) });
        if (this.ncw > 0)
        {
          SightVideoJNI.tagRotateVideo((String)localObject1, this.ncu, this.ncw);
          FileOp.deleteFile((String)localObject1);
        }
        MP4MuxerJNI.releaseDataBuf(this.nap);
        j.naP.ye();
        GMTrace.o(20195204661248L, 150466);
        return i;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.MMSightFFMpegMediaCodecRemuxer", localException, "decode error: %s", new Object[] { localException.getMessage() });
        GMTrace.o(20195204661248L, 150466);
        return -1;
      }
      i = this.videoFps;
      break;
      label892:
      i += 1;
      continue;
      label899:
      if (this.mVN.getSampleTime() < this.ncy * 1000L) {
        if (this.mVN.getSampleTrackIndex() != i)
        {
          w.e("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "track index not match! break");
        }
        else
        {
          localException.position(0);
          MP4MuxerJNI.writeAACData(this.nap, localException, j);
          this.mVN.advance();
          continue;
          label968:
          continue;
          label971:
          i = -1;
          localMediaFormat = null;
          localObject3 = localException;
          Object localObject2 = localMediaFormat;
        }
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(20195338878976L, 150467);
    GMTrace.o(20195338878976L, 150467);
    return 1;
  }
  
  private final class a
    extends ae
  {
    public a(Looper paramLooper)
    {
      super();
      GMTrace.i(20193191395328L, 150451);
      GMTrace.o(20193191395328L, 150451);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      GMTrace.i(20193325613056L, 150452);
      byte[] arrayOfByte;
      int i;
      long l;
      label149:
      int j;
      int k;
      boolean bool;
      if (paramMessage.what == 1)
      {
        arrayOfByte = (byte[])paramMessage.obj;
        if (paramMessage.arg1 != 1) {
          break label487;
        }
        i = 1;
        l = paramMessage.arg2;
        if (a.this.nct != null)
        {
          if (a.this.ncB == null) {
            a.this.ncB = c.aPT();
          }
          if (a.this.ncE != null)
          {
            if (a.this.ncG == null)
            {
              if ((a.this.ncw != 90) && (a.this.ncw != 270)) {
                break label492;
              }
              a.this.ncE = com.tencent.mm.sdk.platformtools.d.b(a.this.ncE, 360 - a.this.ncw);
              a.this.ncE = Bitmap.createScaledBitmap(a.this.ncE, a.this.ncB.x, a.this.ncB.y, true);
              paramMessage = ByteBuffer.allocateDirect(a.this.ncE.getRowBytes() * a.this.ncE.getHeight());
              paramMessage.position(0);
              a.this.ncE.copyPixelsToBuffer(paramMessage);
              a.this.ncG = paramMessage.array();
            }
            SightVideoJNI.blendYuvFrame(arrayOfByte, a.this.ncG, a.this.ncB.x, a.this.ncB.y);
          }
          paramMessage = a.this.nct;
          j = a.this.ncB.x;
          k = a.this.ncB.y;
          if ((i != 0) || (arrayOfByte == null)) {
            break label560;
          }
          if ((j != paramMessage.mAB) || (k != paramMessage.lhd)) {
            break label527;
          }
          bool = false;
          label332:
          w.d("MicroMsg.MMSightRemuxMediaCodecEncoder", "writeData, needScale: %s, srcSize: [%s, %s], targetSize: [%s, %s], pts: %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(paramMessage.mAB), Integer.valueOf(paramMessage.lhd), Long.valueOf(l) });
          if (paramMessage.ncT == null) {
            paramMessage.ncT = new byte[paramMessage.mAB * paramMessage.lhd * 3 >> 1];
          }
          if ((paramMessage.mZX != 19) || (bool)) {
            break label533;
          }
          System.arraycopy(arrayOfByte, 0, paramMessage.ncT, 0, arrayOfByte.length);
          label449:
          paramMessage.ncS += 1;
          paramMessage.b(paramMessage.ncT, false, l);
        }
      }
      for (;;)
      {
        j.naP.x(arrayOfByte);
        GMTrace.o(20193325613056L, 150452);
        return;
        label487:
        i = 0;
        break;
        label492:
        if (a.this.ncw != 180) {
          break label149;
        }
        a.this.ncE = com.tencent.mm.sdk.platformtools.d.b(a.this.ncE, 180.0F);
        break label149;
        label527:
        bool = true;
        break label332;
        label533:
        MP4MuxerJNI.yuv420pTo420XXAndScale(arrayOfByte, paramMessage.ncT, paramMessage.ncU, j, k, paramMessage.mAB, paramMessage.lhd);
        break label449;
        label560:
        paramMessage.b(paramMessage.ncT, true, l);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */