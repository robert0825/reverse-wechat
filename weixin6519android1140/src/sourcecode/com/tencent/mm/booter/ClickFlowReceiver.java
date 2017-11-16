package com.tencent.mm.booter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelstat.c;

public class ClickFlowReceiver
  extends BroadcastReceiver
{
  public ClickFlowReceiver()
  {
    GMTrace.i(495666069504L, 3693);
    GMTrace.o(495666069504L, 3693);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(495800287232L, 3694);
    c.Mh().r(paramIntent);
    GMTrace.o(495800287232L, 3694);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\booter\ClickFlowReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */