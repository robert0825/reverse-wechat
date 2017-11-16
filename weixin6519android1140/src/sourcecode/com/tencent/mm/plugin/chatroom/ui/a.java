package com.tencent.mm.plugin.chatroom.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.chatroom.d.o;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.m;

public final class a
{
  public static void a(Activity paramActivity, String paramString, boolean paramBoolean)
  {
    GMTrace.i(9111370465280L, 67885);
    if (paramBoolean)
    {
      localIntent = new Intent(paramActivity, RoomUpgradeUI.class);
      localIntent.setFlags(603979776);
      localIntent.putExtra("room_name", paramString);
      paramString = new Intent();
      paramString.setClassName(paramActivity, "com.tencent.mm.ui.account.bind.BindMobileUI");
      paramString.putExtra("is_bind_for_chatroom_upgrade", true);
      MMWizardActivity.b(paramActivity, paramString, localIntent);
      GMTrace.o(9111370465280L, 67885);
      return;
    }
    Intent localIntent = new Intent(paramActivity, RoomUpgradeUI.class);
    localIntent.setFlags(603979776);
    localIntent.putExtra("room_name", paramString);
    localIntent.putExtra("announce_ok", true);
    paramActivity.startActivity(localIntent);
    GMTrace.o(9111370465280L, 67885);
  }
  
  static abstract interface a
  {
    public abstract void i(boolean paramBoolean, int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */