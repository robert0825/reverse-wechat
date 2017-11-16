package com.tencent.mm.compatible.i;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.a.a;
import com.tencent.mm.compatible.a.a.a;
import com.tencent.mm.sdk.platformtools.w;

public final class b
{
  public static boolean b(Activity paramActivity, int paramInt)
  {
    GMTrace.i(13823486459904L, 102993);
    Intent localIntent = new Intent("android.media.action.VIDEO_CAPTURE");
    localIntent.putExtra("android.intent.extra.videoQuality", 0);
    a.a(8, new a.a()
    {
      public final void run()
      {
        GMTrace.i(13823754895360L, 102995);
        this.fSC.putExtra("android.intent.extra.durationLimit", 30);
        this.fSC.putExtra("android.intent.extra.sizeLimit", 10485760);
        GMTrace.o(13823754895360L, 102995);
      }
    });
    try
    {
      paramActivity.startActivityForResult(localIntent, 4372);
      GMTrace.o(13823486459904L, 102993);
      return true;
    }
    catch (ActivityNotFoundException paramActivity)
    {
      w.printErrStackTrace("MicroMsg.TakeVideoUtil", paramActivity, "", new Object[0]);
      GMTrace.o(13823486459904L, 102993);
    }
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\compatible\i\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */