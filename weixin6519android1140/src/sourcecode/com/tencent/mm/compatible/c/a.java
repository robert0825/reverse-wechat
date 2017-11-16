package com.tencent.mm.compatible.c;

import android.media.AudioManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.j;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  public static boolean a(AudioManager paramAudioManager)
  {
    GMTrace.i(13776107601920L, 102640);
    if (ap.qk())
    {
      GMTrace.o(13776107601920L, 102640);
      return false;
    }
    w.i("MicroMsg.BluetoothUtil", "stop DeviceInfo mCommonInfo getStartBluetoothSco:%s,getStopBluetoothInBU:%s ", new Object[] { Integer.valueOf(p.fQL.fPn), Integer.valueOf(p.fQL.fPm) });
    if (((p.fQL.fPm == 1) || (p.fQL.fPn == -1)) && (paramAudioManager.isBluetoothScoOn()))
    {
      w.i("MicroMsg.BluetoothUtil", "BluetoothUtil stopBluetoothSco stack: %s", new Object[] { bg.bQW() });
      paramAudioManager.stopBluetoothSco();
    }
    GMTrace.o(13776107601920L, 102640);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */