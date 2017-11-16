package com.tencent.mm.opensdk.channel.a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.d;

public final class a
{
  public static boolean a(Context paramContext, a parama)
  {
    GMTrace.i(268435456L, 2);
    if (paramContext == null)
    {
      Log.e("MicroMsg.SDK.MMessage", "send fail, invalid argument");
      GMTrace.o(268435456L, 2);
      return false;
    }
    if (d.a(parama.action))
    {
      Log.e("MicroMsg.SDK.MMessage", "send fail, action is null");
      GMTrace.o(268435456L, 2);
      return false;
    }
    String str1 = null;
    if (!d.a(parama.a)) {
      str1 = parama.a + ".permission.MM_MESSAGE";
    }
    Intent localIntent = new Intent(parama.action);
    if (parama.bundle != null) {
      localIntent.putExtras(parama.bundle);
    }
    String str2 = paramContext.getPackageName();
    localIntent.putExtra("_mmessage_sdkVersion", 620822528);
    localIntent.putExtra("_mmessage_appPackage", str2);
    localIntent.putExtra("_mmessage_content", parama.content);
    localIntent.putExtra("_mmessage_support_content_type", parama.b);
    localIntent.putExtra("_mmessage_checksum", b.a(parama.content, 620822528, str2));
    paramContext.sendBroadcast(localIntent, str1);
    Log.d("MicroMsg.SDK.MMessage", "send mm message, intent=" + localIntent + ", perm=" + str1);
    GMTrace.o(268435456L, 2);
    return true;
  }
  
  public static final class a
  {
    public String a;
    public String action;
    public long b;
    public Bundle bundle;
    public String content;
    
    public a()
    {
      GMTrace.i(134217728L, 1);
      GMTrace.o(134217728L, 1);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\opensdk\channel\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */