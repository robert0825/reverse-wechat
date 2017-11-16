package com.tencent.mm.plugin.address.e;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.address.d.b;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  public static Intent b(b paramb)
  {
    GMTrace.i(12819269419008L, 95511);
    if (paramb == null)
    {
      w.e("MicroMsg.AddrUtil", "addressObj == null");
      GMTrace.o(12819269419008L, 95511);
      return null;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("nationalCode", paramb.huK);
    localIntent.putExtra("userName", paramb.huI);
    localIntent.putExtra("telNumber", paramb.huJ);
    localIntent.putExtra("addressPostalCode", paramb.huG);
    localIntent.putExtra("proviceFirstStageName", paramb.huD);
    localIntent.putExtra("addressCitySecondStageName", paramb.huE);
    localIntent.putExtra("addressCountiesThirdStageName", paramb.huF);
    localIntent.putExtra("addressDetailInfo", paramb.huH);
    GMTrace.o(12819269419008L, 95511);
    return localIntent;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */