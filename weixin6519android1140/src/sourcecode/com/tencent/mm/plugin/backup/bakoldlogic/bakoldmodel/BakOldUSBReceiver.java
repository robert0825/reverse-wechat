package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.ab;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.w;

public class BakOldUSBReceiver
  extends BroadcastReceiver
{
  private static String jdB;
  private static String jdC;
  
  static
  {
    GMTrace.i(14733751091200L, 109775);
    jdB = "MMBakchatServiceStart";
    jdC = "MMBakchatServiceStop";
    GMTrace.o(14733751091200L, 109775);
  }
  
  public BakOldUSBReceiver()
  {
    GMTrace.i(14733482655744L, 109773);
    GMTrace.o(14733482655744L, 109773);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(14733616873472L, 109774);
    try
    {
      String str = paramIntent.getAction();
      if (jdB.equalsIgnoreCase(str))
      {
        paramContext.startService(new Intent().setClassName(paramContext, "com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.BakOldUSBService").putExtra("url", paramIntent.getStringExtra("url")));
        w.d("MicroMsg.BakOldUSBReceiver", "START_ACTION onReceive start end");
        GMTrace.o(14733616873472L, 109774);
        return;
      }
      if (jdC.equalsIgnoreCase(str))
      {
        paramIntent = new ab();
        paramIntent.eAY.eAZ = paramContext;
        a.vgX.m(paramIntent);
        w.d("MicroMsg.BakOldUSBReceiver", "STOP_ACTION onReceive stop end");
      }
      GMTrace.o(14733616873472L, 109774);
      return;
    }
    catch (Exception paramContext)
    {
      w.printErrStackTrace("MicroMsg.BakOldUSBReceiver", paramContext, "onReceive:", new Object[0]);
      GMTrace.o(14733616873472L, 109774);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\bakoldmodel\BakOldUSBReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */