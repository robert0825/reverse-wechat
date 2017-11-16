package com.tencent.mm.compatible.b;

import android.annotation.TargetApi;
import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  implements f.a
{
  private AcousticEchoCanceler fMQ;
  
  @TargetApi(16)
  public d(AudioRecord paramAudioRecord)
  {
    GMTrace.i(13815970267136L, 102937);
    this.fMQ = null;
    boolean bool = AcousticEchoCanceler.isAvailable();
    w.d("MicroMsg.MMAcousticEchoCanceler", "available  " + bool);
    if (bool) {
      this.fMQ = AcousticEchoCanceler.create(paramAudioRecord.getAudioSessionId());
    }
    GMTrace.o(13815970267136L, 102937);
  }
  
  @TargetApi(16)
  public final boolean isAvailable()
  {
    GMTrace.i(13816104484864L, 102938);
    boolean bool = AcousticEchoCanceler.isAvailable();
    GMTrace.o(13816104484864L, 102938);
    return bool;
  }
  
  @TargetApi(16)
  public final boolean sc()
  {
    GMTrace.i(13816238702592L, 102939);
    if (this.fMQ != null) {}
    try
    {
      int i = this.fMQ.setEnabled(true);
      if (i == 0)
      {
        GMTrace.o(13816238702592L, 102939);
        return true;
      }
      w.d("MicroMsg.MMAcousticEchoCanceler", "setEnabled failed " + i);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.MMAcousticEchoCanceler", localException, "", new Object[0]);
      }
    }
    GMTrace.o(13816238702592L, 102939);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */