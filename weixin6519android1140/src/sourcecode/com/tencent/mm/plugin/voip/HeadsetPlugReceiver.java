package com.tencent.mm.plugin.voip;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public class HeadsetPlugReceiver
  extends BroadcastReceiver
{
  private a qDT;
  
  public HeadsetPlugReceiver()
  {
    GMTrace.i(5378641231872L, 40074);
    this.qDT = null;
    GMTrace.o(5378641231872L, 40074);
  }
  
  public final void a(Context paramContext, a parama)
  {
    GMTrace.i(5378909667328L, 40076);
    this.qDT = parama;
    parama = new IntentFilter();
    parama.addAction("android.intent.action.HEADSET_PLUG");
    paramContext.registerReceiver(this, parama);
    GMTrace.o(5378909667328L, 40076);
  }
  
  public final void di(Context paramContext)
  {
    GMTrace.i(5379043885056L, 40077);
    try
    {
      paramContext.unregisterReceiver(this);
      this.qDT = null;
      GMTrace.o(5379043885056L, 40077);
      return;
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        w.e("MicroMsg.HeadsetPlugReceiver", "unregisterReceiver(HeadsetPlugReceiver.this) error:%s", new Object[] { paramContext.getMessage() });
      }
    }
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(5378775449600L, 40075);
    w.d("MicroMsg.HeadsetPlugReceiver", "headset onReceive %s  %d", new Object[] { paramIntent.getAction(), Integer.valueOf(paramIntent.getIntExtra("state", 0)) });
    if ((paramIntent.getAction() != null) && (paramIntent.getAction().equals("android.intent.action.HEADSET_PLUG"))) {
      if (paramIntent.getIntExtra("state", 0) == 0)
      {
        if (this.qDT != null)
        {
          this.qDT.fp(false);
          GMTrace.o(5378775449600L, 40075);
        }
      }
      else if ((paramIntent.getIntExtra("state", 0) == 1) && (this.qDT != null)) {
        this.qDT.fp(true);
      }
    }
    GMTrace.o(5378775449600L, 40075);
  }
  
  public static abstract interface a
  {
    public abstract void fp(boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\HeadsetPlugReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */