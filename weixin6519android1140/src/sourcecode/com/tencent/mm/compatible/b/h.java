package com.tencent.mm.compatible.b;

import android.annotation.TargetApi;
import android.media.AudioRecord;
import android.media.audiofx.NoiseSuppressor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class h
  implements f.a
{
  private NoiseSuppressor fNo;
  
  @TargetApi(16)
  public h(AudioRecord paramAudioRecord)
  {
    GMTrace.i(13814225436672L, 102924);
    this.fNo = null;
    boolean bool = NoiseSuppressor.isAvailable();
    w.d("MicroMsg.MMNoiseSuppressor", "available  " + bool);
    if (bool) {
      this.fNo = NoiseSuppressor.create(paramAudioRecord.getAudioSessionId());
    }
    GMTrace.o(13814225436672L, 102924);
  }
  
  @TargetApi(16)
  public final boolean isAvailable()
  {
    GMTrace.i(13814359654400L, 102925);
    boolean bool = NoiseSuppressor.isAvailable();
    GMTrace.o(13814359654400L, 102925);
    return bool;
  }
  
  @TargetApi(16)
  public final boolean sc()
  {
    GMTrace.i(13814493872128L, 102926);
    if (this.fNo != null) {}
    try
    {
      int i = this.fNo.setEnabled(true);
      if (i == 0)
      {
        GMTrace.o(13814493872128L, 102926);
        return true;
      }
      w.d("MicroMsg.MMNoiseSuppressor", "setEnabled failed " + i);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.MMNoiseSuppressor", localException, "", new Object[0]);
      }
    }
    GMTrace.o(13814493872128L, 102926);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */