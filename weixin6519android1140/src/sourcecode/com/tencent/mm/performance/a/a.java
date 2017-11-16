package com.tencent.mm.performance.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  private static a hip;
  public static b hiq;
  
  static
  {
    GMTrace.i(13128909717504L, 97818);
    hip = new a((byte)0);
    hiq = null;
    GMTrace.o(13128909717504L, 97818);
  }
  
  private static final class a
    extends BroadcastReceiver
  {
    private a()
    {
      GMTrace.i(13129715023872L, 97824);
      GMTrace.o(13129715023872L, 97824);
    }
    
    public final void onReceive(final Context paramContext, Intent paramIntent)
    {
      GMTrace.i(13129849241600L, 97825);
      paramContext = paramIntent.getAction();
      w.i("MicroMsg.HARespReceiver", "received cmd: %s", new Object[] { paramContext });
      if ("ha_resp_action_send_result".equals(paramContext))
      {
        int i = paramIntent.getIntExtra("ha_version", -1);
        if (i == 2)
        {
          paramContext = paramIntent.getExtras().getString("ha_hprof_filepath");
          String str = paramIntent.getExtras().getString("ha_obj_class");
          Object localObject = paramIntent.getExtras().getString("ha_obj_key");
          paramIntent = paramIntent.getExtras().getString("ha_result_refchain_logstr");
          if ((paramIntent == null) || (paramIntent.length() == 0)) {
            w.e("MicroMsg.HARespReceiver", "object '%s' with key '%s' is not leaked, sometimes his method may hit this wrong case.", new Object[] { str, localObject });
          }
          for (;;)
          {
            e.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(13129178152960L, 97820);
                new File(paramContext).delete();
                GMTrace.o(13129178152960L, 97820);
              }
            }, "del_hprof_file");
            GMTrace.o(13129849241600L, 97825);
            return;
            w.i("MicroMsg.HARespReceiver", "analyse result: key:%s, class:%s, refchain:%s", new Object[] { localObject, str, paramIntent });
            localObject = new HashMap();
            ((Map)localObject).put("leaked_activity", str);
            if (a.hiq != null) {
              a.hiq.a("UILeaksV2", paramIntent, (Map)localObject);
            } else {
              w.e("MicroMsg.HARespReceiver", "no report impl set!");
            }
          }
        }
        w.e("MicroMsg.HARespReceiver", "analyzer version mismatch, expected: %s, actual: %s, ignored.", new Object[] { Integer.valueOf(2), Integer.valueOf(i) });
        GMTrace.o(13129849241600L, 97825);
        return;
      }
      w.e("MicroMsg.HARespReceiver", "unknown command: %s", new Object[] { paramContext });
      GMTrace.o(13129849241600L, 97825);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\performance\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */