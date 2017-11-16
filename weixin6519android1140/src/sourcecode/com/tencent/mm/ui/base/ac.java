package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;

public final class ac
{
  public static void a(boolean paramBoolean, Intent paramIntent)
  {
    GMTrace.i(3331820879872L, 24824);
    Intent localIntent = paramIntent;
    if (paramIntent == null) {
      localIntent = new Intent();
    }
    if (paramBoolean) {}
    for (paramIntent = "com.tencent.mm.ui.ACTION_ACTIVE";; paramIntent = "com.tencent.mm.ui.ACTION_DEACTIVE")
    {
      localIntent.setAction(paramIntent);
      localIntent.putExtra("_application_context_process_", ab.vM());
      localIntent.putExtra("process_id", Process.myPid());
      localIntent.putExtra("process_is_mm", ab.bPY());
      ab.getContext().sendBroadcast(localIntent, "com.tencent.mm.permission.MM_MESSAGE");
      GMTrace.o(3331820879872L, 24824);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */