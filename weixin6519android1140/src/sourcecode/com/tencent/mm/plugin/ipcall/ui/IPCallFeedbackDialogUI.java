package com.tencent.mm.plugin.ipcall.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.p;

@a(7)
public class IPCallFeedbackDialogUI
  extends MMActivity
{
  private g mqD;
  
  public IPCallFeedbackDialogUI()
  {
    GMTrace.i(11706604453888L, 87221);
    GMTrace.o(11706604453888L, 87221);
  }
  
  public void finish()
  {
    GMTrace.i(11707409760256L, 87227);
    w.i("MicroMsg.IPCallFeedbackDialogUI", "finish");
    if ((this.mqD != null) && (this.mqD.isShowing()))
    {
      this.mqD.dismiss();
      this.mqD = null;
    }
    super.finish();
    GMTrace.o(11707409760256L, 87227);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11706872889344L, 87223);
    GMTrace.o(11706872889344L, 87223);
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11706738671616L, 87222);
    super.onCreate(paramBundle);
    w.i("MicroMsg.IPCallFeedbackDialogUI", "onCreate");
    this.mqD = new g(this, this.vKB.vKW, getIntent().getIntExtra("IPCallFeedbackDialogUI_KRoomId", 0), getIntent().getLongExtra("IPCallFeedbackDialogUI_KCallseq", 0L));
    this.mqD.setOnDismissListener(new DialogInterface.OnDismissListener()
    {
      public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(11649427701760L, 86795);
        IPCallFeedbackDialogUI.this.finish();
        GMTrace.o(11649427701760L, 86795);
      }
    });
    this.mqD.getWindow().setSoftInputMode(16);
    this.mqD.show();
    GMTrace.o(11706738671616L, 87222);
  }
  
  public void onDestroy()
  {
    GMTrace.i(11707275542528L, 87226);
    w.d("MicroMsg.IPCallFeedbackDialogUI", "onDestroy");
    super.onDestroy();
    GMTrace.o(11707275542528L, 87226);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(11707141324800L, 87225);
    w.d("MicroMsg.IPCallFeedbackDialogUI", "onNewIntent");
    super.onNewIntent(paramIntent);
    GMTrace.o(11707141324800L, 87225);
  }
  
  public void onResume()
  {
    GMTrace.i(11707007107072L, 87224);
    w.d("MicroMsg.IPCallFeedbackDialogUI", "onResume");
    super.onResume();
    GMTrace.o(11707007107072L, 87224);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\IPCallFeedbackDialogUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */