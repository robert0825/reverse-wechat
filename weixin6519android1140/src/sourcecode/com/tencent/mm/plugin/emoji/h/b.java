package com.tencent.mm.plugin.emoji.h;

import android.app.Activity;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.bj.d;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class b
{
  private final String TAG;
  public int iAR;
  public String kvx;
  
  public b(int paramInt)
  {
    GMTrace.i(11284489699328L, 84076);
    this.TAG = "MicroMsg.emoji.UseSmileyTool";
    this.iAR = paramInt;
    GMTrace.o(11284489699328L, 84076);
  }
  
  public static void a(Intent paramIntent, String paramString, Activity paramActivity)
  {
    GMTrace.i(11284623917056L, 84077);
    if (paramIntent == null)
    {
      GMTrace.o(11284623917056L, 84077);
      return;
    }
    a(paramIntent.getStringExtra("Select_Conv_User"), paramString, paramActivity);
    GMTrace.o(11284623917056L, 84077);
  }
  
  public static void a(String paramString1, String paramString2, Activity paramActivity)
  {
    GMTrace.i(11284758134784L, 84078);
    if (bg.nm(paramString1))
    {
      w.d("MicroMsg.emoji.UseSmileyTool", "talker name is invalid so can't go to chat room use.");
      GMTrace.o(11284758134784L, 84078);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("Chat_User", paramString1);
    localIntent.putExtra("smiley_product_id", paramString2);
    com.tencent.mm.plugin.emoji.b.hnH.e(localIntent, paramActivity);
    GMTrace.o(11284758134784L, 84078);
  }
  
  public final void m(Activity paramActivity)
  {
    GMTrace.i(11284892352512L, 84079);
    w.d("MicroMsg.emoji.UseSmileyTool", "jacks sendToFriend emoji");
    Intent localIntent = new Intent();
    localIntent.putExtra("MMActivity.OverrideEnterAnimation", R.a.aLs);
    localIntent.putExtra("MMActivity.OverrideExitAnimation", R.a.aLE);
    d.a(paramActivity, ".ui.transmit.SelectConversationUI", localIntent, this.iAR);
    paramActivity.overridePendingTransition(R.a.aLG, R.a.aLt);
    GMTrace.o(11284892352512L, 84079);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\h\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */