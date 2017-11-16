package com.tencent.mm.plugin.webwx.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ad.n;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.y.at;

public class WebWXPopupUnlockUI
  extends MMBaseActivity
{
  public WebWXPopupUnlockUI()
  {
    GMTrace.i(7663295397888L, 57096);
    GMTrace.o(7663295397888L, 57096);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7663429615616L, 57097);
    super.onCreate(paramBundle);
    if (getIntent() != null)
    {
      paramBundle = getIntent().getStringExtra("deviceName");
      if (paramBundle != null)
      {
        final Dialog localDialog = new Dialog(this);
        localDialog.requestWindowFeature(1);
        View localView = View.inflate(this, R.i.cwi, null);
        TextView localTextView = (TextView)localView.findViewById(R.h.btL);
        ((TextView)localView.findViewById(R.h.cjk)).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(7663161180160L, 57095);
            paramAnonymousView = new com.tencent.mm.plugin.webwx.a.a(2);
            at.wS().a(paramAnonymousView, 0);
            w.d("MicroMsg.WebWxPopUnlockUI", "doScene netSceneExtDeviceControl : UNLOCK");
            com.tencent.mm.plugin.webwx.a.hnI.da(1);
            w.d("MicroMsg.WebWxPopUnlockUI", "trigger netSceneSync notify");
            localDialog.dismiss();
            GMTrace.o(7663161180160L, 57095);
          }
        });
        localDialog.setOnDismissListener(new DialogInterface.OnDismissListener()
        {
          public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(7661550567424L, 57083);
            WebWXPopupUnlockUI.this.finish();
            GMTrace.o(7661550567424L, 57083);
          }
        });
        localTextView.setText(paramBundle);
        localDialog.setContentView(localView);
        localDialog.show();
        GMTrace.o(7663429615616L, 57097);
        return;
      }
      w.w("MicroMsg.WebWxPopUnlockUI", "Mac WeChat request to unlock,the deviceName is null");
    }
    GMTrace.o(7663429615616L, 57097);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webwx\ui\WebWXPopupUnlockUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */