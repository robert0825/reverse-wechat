package com.tencent.mm.plugin.wallet_core.id_verify;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@a(3)
public class RealnameDialogActivity
  extends WalletBaseUI
{
  private RealnameGuideHelper mQa;
  private int type;
  
  public RealnameDialogActivity()
  {
    GMTrace.i(6849533313024L, 51033);
    this.type = 1;
    GMTrace.o(6849533313024L, 51033);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6849801748480L, 51035);
    GMTrace.o(6849801748480L, 51035);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6849935966208L, 51036);
    GMTrace.o(6849935966208L, 51036);
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6849667530752L, 51034);
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    if ((paramBundle != null) && (paramBundle.hasExtra("key_realname_guide_helper")))
    {
      this.mQa = ((RealnameGuideHelper)paramBundle.getParcelableExtra("key_realname_guide_helper"));
      paramBundle = new Bundle();
      paramBundle.putString("realname_verify_process_jump_plugin", "wallet_core");
      paramBundle.putString("realname_verify_process_jump_activity", ".id_verify.RealnameDialogActivity");
      paramBundle.putBoolean("process_finish_stay_orgpage", false);
      boolean bool1 = this.mQa.b(this, paramBundle, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6862686650368L, 51131);
          paramAnonymousDialogInterface.dismiss();
          RealnameDialogActivity.this.finish();
          GMTrace.o(6862686650368L, 51131);
        }
      }, true);
      boolean bool2 = this.mQa.a(this, paramBundle, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(19316481196032L, 143919);
          paramAnonymousDialogInterface.dismiss();
          RealnameDialogActivity.this.finish();
          GMTrace.o(19316481196032L, 143919);
        }
      }, true);
      if ((!bool1) && (!bool2)) {
        finish();
      }
      GMTrace.o(6849667530752L, 51034);
      return;
    }
    finish();
    GMTrace.o(6849667530752L, 51034);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\id_verify\RealnameDialogActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */