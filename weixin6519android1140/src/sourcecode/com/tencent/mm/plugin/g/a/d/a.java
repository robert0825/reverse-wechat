package com.tencent.mm.plugin.g.a.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  public final a jox;
  public final BroadcastReceiver joy;
  
  public a(a parama)
  {
    GMTrace.i(4811034460160L, 35845);
    this.joy = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(4814658338816L, 35872);
        if (paramAnonymousIntent == null)
        {
          w.e("McroMsg.exdevice.BluetoohtStateMonitor", "null == intent");
          GMTrace.o(4814658338816L, 35872);
          return;
        }
        if (paramAnonymousIntent.getAction().equals("android.bluetooth.adapter.action.STATE_CHANGED"))
        {
          w.i("McroMsg.exdevice.BluetoohtStateMonitor", "onReceive, action = " + paramAnonymousIntent.getAction());
          int i = paramAnonymousIntent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
          if ((10 == i) || (12 == i)) {
            a.this.jox.lb(i);
          }
        }
        GMTrace.o(4814658338816L, 35872);
      }
    };
    w.i("McroMsg.exdevice.BluetoohtStateMonitor", "register BluetoothState receiver");
    this.jox = parama;
    parama = new IntentFilter();
    parama.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
    ab.getContext().registerReceiver(this.joy, parama);
    GMTrace.o(4811034460160L, 35845);
  }
  
  public static abstract interface a
  {
    public abstract void lb(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\g\a\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */