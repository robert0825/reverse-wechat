package com.tencent.mm.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;

@a(19)
public class DataTransferUI
  extends MMBaseActivity
{
  private r iBj;
  private long startTime;
  
  public DataTransferUI()
  {
    GMTrace.i(2535507099648L, 18891);
    this.startTime = 0L;
    GMTrace.o(2535507099648L, 18891);
  }
  
  private void aj(Intent paramIntent)
  {
    GMTrace.i(2535909752832L, 18894);
    boolean bool = paramIntent.getBooleanExtra("finish_data_transfer", false);
    w.d("MicroMsg.DataTransferUI", "tryFinish, timestamp = " + System.currentTimeMillis() + ", finish = " + bool);
    if (bool) {
      finish();
    }
    GMTrace.o(2535909752832L, 18894);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2535641317376L, 18892);
    super.onCreate(paramBundle);
    w.d("MicroMsg.DataTransferUI", "onCreate, timestamp = " + System.currentTimeMillis());
    this.startTime = System.currentTimeMillis();
    getString(R.l.cUG);
    this.iBj = h.a(this, getString(R.l.cSs), false, null);
    new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(1871800434688L, 13946);
        if ((DataTransferUI.a(DataTransferUI.this) != null) && (DataTransferUI.a(DataTransferUI.this).isShowing()))
        {
          w.e("MicroMsg.DataTransferUI", "dialog has shown for a long time, auto dismiss it...");
          DataTransferUI.a(DataTransferUI.this).dismiss();
          DataTransferUI.this.finish();
        }
        GMTrace.o(1871800434688L, 13946);
      }
    }.sendEmptyMessageDelayed(0, 60000L);
    aj(getIntent());
    GMTrace.o(2535641317376L, 18892);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(2536178188288L, 18896);
    super.onDestroy();
    w.d("MicroMsg.DataTransferUI", "onDestroy");
    if ((this.iBj != null) && (this.iBj.isShowing())) {
      this.iBj.dismiss();
    }
    GMTrace.o(2536178188288L, 18896);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(2535775535104L, 18893);
    w.d("MicroMsg.DataTransferUI", "onNewIntent, timestamp = " + System.currentTimeMillis());
    aj(paramIntent);
    GMTrace.o(2535775535104L, 18893);
  }
  
  protected void onPause()
  {
    GMTrace.i(2536043970560L, 18895);
    w.d("MicroMsg.DataTransferUI", "edw DataTransferUI duration time = " + (System.currentTimeMillis() - this.startTime));
    super.onPause();
    GMTrace.o(2536043970560L, 18895);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\DataTransferUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */