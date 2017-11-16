package com.tencent.mm.plugin.hce.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.nfc.NfcAdapter;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
{
  @TargetApi(21)
  public static boolean aHj()
  {
    GMTrace.i(20652216025088L, 153871);
    if (Build.VERSION.SDK_INT >= 21) {}
    for (int i = 1; i != 0; i = 0)
    {
      boolean bool = ab.getContext().getPackageManager().hasSystemFeature("android.hardware.nfc.hce");
      GMTrace.o(20652216025088L, 153871);
      return bool;
    }
    GMTrace.o(20652216025088L, 153871);
    return false;
  }
  
  public static boolean aHk()
  {
    GMTrace.i(20652350242816L, 153872);
    Context localContext = ab.getContext();
    if (!localContext.getPackageManager().hasSystemFeature("android.hardware.nfc"))
    {
      GMTrace.o(20652350242816L, 153872);
      return false;
    }
    if (NfcAdapter.getDefaultAdapter(localContext) == null)
    {
      GMTrace.o(20652350242816L, 153872);
      return false;
    }
    GMTrace.o(20652350242816L, 153872);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\hce\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */