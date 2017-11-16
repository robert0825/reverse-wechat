package com.tencent.mm.compatible.b;

import android.annotation.TargetApi;
import android.media.AudioRecord;
import android.media.audiofx.AutomaticGainControl;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class g
  implements f.a
{
  private AutomaticGainControl fNn;
  
  @TargetApi(16)
  public g(AudioRecord paramAudioRecord)
  {
    GMTrace.i(13821875847168L, 102981);
    this.fNn = null;
    boolean bool = AutomaticGainControl.isAvailable();
    w.d("MicroMsg.MMAutomaticGainControl", "available  " + bool);
    if (bool) {
      this.fNn = AutomaticGainControl.create(paramAudioRecord.getAudioSessionId());
    }
    GMTrace.o(13821875847168L, 102981);
  }
  
  @TargetApi(16)
  public final boolean isAvailable()
  {
    GMTrace.i(13822010064896L, 102982);
    boolean bool = AutomaticGainControl.isAvailable();
    GMTrace.o(13822010064896L, 102982);
    return bool;
  }
  
  @TargetApi(16)
  public final boolean sc()
  {
    GMTrace.i(13822144282624L, 102983);
    if (this.fNn != null) {}
    try
    {
      int i = this.fNn.setEnabled(true);
      if (i == 0)
      {
        GMTrace.o(13822144282624L, 102983);
        return true;
      }
      w.d("MicroMsg.MMAutomaticGainControl", "setEnabled failed " + i);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.MMAutomaticGainControl", localException, "", new Object[0]);
      }
    }
    GMTrace.o(13822144282624L, 102983);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */