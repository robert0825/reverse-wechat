package com.tencent.mm.plugin.wear.model.b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
{
  public static void M(Bundle paramBundle)
  {
    GMTrace.i(9192974843904L, 68493);
    Intent localIntent = new Intent();
    localIntent.setPackage(ab.getContext().getPackageName());
    localIntent.setAction("com.tencent.mm.wear.message");
    localIntent.putExtras(paramBundle);
    ab.getContext().sendBroadcast(localIntent);
    GMTrace.o(9192974843904L, 68493);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */