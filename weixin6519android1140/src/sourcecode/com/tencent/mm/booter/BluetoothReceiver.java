package com.tencent.mm.booter;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.b.e;
import com.tencent.mm.compatible.d.j;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.Set;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
public class BluetoothReceiver
  extends BroadcastReceiver
{
  public BluetoothReceiver()
  {
    GMTrace.i(501705867264L, 3738);
    GMTrace.o(501705867264L, 3738);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(501840084992L, 3739);
    if ((paramContext == null) || (paramIntent == null) || (bg.nm(paramIntent.getAction())))
    {
      GMTrace.o(501840084992L, 3739);
      return;
    }
    paramContext = BluetoothAdapter.getDefaultAdapter();
    if (paramContext == null)
    {
      w.d("MicroMsg.BluetoothReceiver", "getDefaultAdapter == null");
      GMTrace.o(501840084992L, 3739);
      return;
    }
    paramContext = paramContext.getBondedDevices();
    if ((paramContext == null) || (paramContext.size() == 0))
    {
      w.d("MicroMsg.BluetoothReceiver", "getBondedDevices == null");
      GMTrace.o(501840084992L, 3739);
      return;
    }
    if (bg.nm(paramIntent.getAction()))
    {
      GMTrace.o(501840084992L, 3739);
      return;
    }
    w.d("MicroMsg.BluetoothReceiver", "dkbt action :" + paramIntent.getAction());
    if (!at.AU())
    {
      GMTrace.o(501840084992L, 3739);
      return;
    }
    try
    {
      i = paramIntent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
      w.d("MicroMsg.BluetoothReceiver", "dkbt  action :" + paramIntent.getAction() + " state:" + i + " isBluetoothScoOn :" + at.AS().sh() + " " + at.AS().sl());
      if (paramIntent.getAction().equalsIgnoreCase("android.media.SCO_AUDIO_STATE_CHANGED"))
      {
        w.d("MicroMsg.BluetoothReceiver", "just STATE_CHANGED not real STATE_UPDATED" + paramIntent.getAction());
        GMTrace.o(501840084992L, 3739);
        return;
      }
    }
    catch (Exception paramContext)
    {
      int i;
      for (;;)
      {
        w.e("MicroMsg.BluetoothReceiver", "%s", new Object[] { bg.f(paramContext) });
        i = 0;
      }
      if (i == 1)
      {
        w.d("MicroMsg.BluetoothReceiver", "sco connected!");
        paramContext = at.AS();
        w.i("MicroMsg.MMAudioManager", "dkbt bluetoothStartSucc %s", new Object[] { paramContext.sl() });
        e.fMV = true;
        paramContext.eg(1);
        GMTrace.o(501840084992L, 3739);
        return;
      }
      if (i == 0)
      {
        w.d("MicroMsg.BluetoothReceiver", "sco disconnected!getStopBluetoothInBR = %s", new Object[] { Integer.valueOf(p.fQL.fPl) });
        if (p.fQL.fPl == 1) {
          at.AS().sg();
        }
        at.AS().se();
      }
      GMTrace.o(501840084992L, 3739);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\booter\BluetoothReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */