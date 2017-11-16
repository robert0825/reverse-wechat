package com.tencent.mm.plugin.mmsight.model.a;

import android.media.MediaRecorder;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;

public final class i
  implements c
{
  private int audioSampleRate;
  private int gBk;
  public c.a naA;
  private ae naC;
  private MediaRecorder naM;
  private boolean naN;
  
  public i(int paramInt1, int paramInt2)
  {
    GMTrace.i(7366137348096L, 54882);
    this.naN = false;
    this.naC = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(7363452993536L, 54862);
        if (i.this.naA != null)
        {
          i.this.naA.aPr();
          i.this.naA = null;
        }
        GMTrace.o(7363452993536L, 54862);
      }
    };
    this.audioSampleRate = paramInt1;
    this.gBk = paramInt2;
    w.i("MicroMsg.MMSightAACMediaRecorder", "MMSightAACMediaRecorder, sampleRate: %s, bitrate: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    GMTrace.o(7366137348096L, 54882);
  }
  
  public final int a(c.a parama)
  {
    GMTrace.i(7366405783552L, 54884);
    w.i("MicroMsg.MMSightAACMediaRecorder", "start, onPcmReady: %s", new Object[] { parama });
    this.naA = parama;
    try
    {
      if ((this.naM != null) && (!this.naN)) {
        this.naM.start();
      }
      this.naC.sendEmptyMessage(0);
      GMTrace.o(7366405783552L, 54884);
      return 0;
    }
    catch (Exception parama)
    {
      w.printErrStackTrace("MicroMsg.MMSightAACMediaRecorder", parama, "start record aac.mp4 error:%s", new Object[] { parama.getMessage() });
      this.naC.sendEmptyMessage(0);
      GMTrace.o(7366405783552L, 54884);
      return -1;
    }
    finally
    {
      this.naC.sendEmptyMessage(0);
    }
  }
  
  public final int a(c.b paramb)
  {
    GMTrace.i(7366540001280L, 54885);
    w.i("MicroMsg.MMSightAACMediaRecorder", "stop, mediaRecorder: %s, callback: %s", new Object[] { this.naM, paramb });
    if (this.naM == null)
    {
      if (paramb != null) {
        paramb.aPs();
      }
      GMTrace.o(7366540001280L, 54885);
      return 0;
    }
    try
    {
      if (!this.naN)
      {
        this.naM.stop();
        this.naM.release();
      }
      this.naM = null;
      if (paramb != null) {
        paramb.aPs();
      }
      GMTrace.o(7366540001280L, 54885);
      return 0;
    }
    catch (Exception paramb)
    {
      w.printErrStackTrace("MicroMsg.MMSightAACMediaRecorder", paramb, "stop record aac.mp4 error:%s", new Object[] { paramb.getMessage() });
      GMTrace.o(7366540001280L, 54885);
    }
    return -1;
  }
  
  public final void aPp()
  {
    GMTrace.i(7366808436736L, 54887);
    GMTrace.o(7366808436736L, 54887);
  }
  
  public final com.tencent.mm.e.b.c.a aPq()
  {
    GMTrace.i(7366942654464L, 54888);
    GMTrace.o(7366942654464L, 54888);
    return null;
  }
  
  public final int af(int paramInt, String paramString)
  {
    GMTrace.i(7366271565824L, 54883);
    w.i("MicroMsg.MMSightAACMediaRecorder", "MMSightAACMediaRecorder init tempPath[%s], sampleRate[%d]", new Object[] { paramString, Integer.valueOf(this.audioSampleRate) });
    this.naM = new MediaRecorder();
    this.naM.setAudioSource(1);
    this.naM.setOutputFormat(2);
    this.naM.setAudioEncoder(3);
    this.naM.setAudioChannels(1);
    this.naM.setAudioEncodingBitRate(this.gBk);
    this.naM.setAudioSamplingRate(this.audioSampleRate);
    this.naM.setOutputFile(paramString);
    try
    {
      this.naM.prepare();
      GMTrace.o(7366271565824L, 54883);
      return 0;
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("MicroMsg.MMSightAACMediaRecorder", paramString, "mediaRecorder prepare error: %s", new Object[] { paramString.getMessage() });
      GMTrace.o(7366271565824L, 54883);
    }
    return -1;
  }
  
  public final void clear()
  {
    GMTrace.i(7366674219008L, 54886);
    try
    {
      if (this.naM != null)
      {
        if (!this.naN)
        {
          this.naM.stop();
          this.naM.release();
        }
        this.naM = null;
      }
      GMTrace.o(7366674219008L, 54886);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.MMSightAACMediaRecorder", localException, "clear error: %s", new Object[] { localException.getMessage() });
      GMTrace.o(7366674219008L, 54886);
    }
  }
  
  public final void fW(boolean paramBoolean)
  {
    GMTrace.i(15396786667520L, 114715);
    this.naN = paramBoolean;
    GMTrace.o(15396786667520L, 114715);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */