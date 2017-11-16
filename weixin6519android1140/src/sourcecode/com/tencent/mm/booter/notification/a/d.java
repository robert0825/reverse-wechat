package com.tencent.mm.booter.notification.a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;

public final class d
{
  public Intent Jt;
  
  public d()
  {
    GMTrace.i(524522881024L, 3908);
    GMTrace.o(524522881024L, 3908);
  }
  
  public static PendingIntent a(Context paramContext, int paramInt, Intent paramIntent)
  {
    GMTrace.i(524657098752L, 3909);
    paramContext = PendingIntent.getActivity(paramContext, paramInt, paramIntent, 134217728);
    GMTrace.o(524657098752L, 3909);
    return paramContext;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\booter\notification\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */