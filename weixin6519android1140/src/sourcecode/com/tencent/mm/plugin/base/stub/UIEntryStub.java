package com.tencent.mm.plugin.base.stub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.booter.NotifyReceiver;
import com.tencent.mm.network.e;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.transmit.SendAppMessageWrapperUI;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bf;
import com.tencent.mm.y.bf.a;

@a(7)
public class UIEntryStub
  extends Activity
{
  private Intent eLY;
  private int jje;
  private boolean jjf;
  private String tF;
  
  public UIEntryStub()
  {
    GMTrace.i(12834436022272L, 95624);
    GMTrace.o(12834436022272L, 95624);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12834570240000L, 95625);
    super.onCreate(paramBundle);
    NotifyReceiver.rn();
    this.jjf = false;
    GMTrace.o(12834570240000L, 95625);
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(12834704457728L, 95626);
    super.onNewIntent(paramIntent);
    this.eLY = paramIntent;
    w.i("MicroMsg.UIEntryStub", "onNewIntent mHasHandled: %b", new Object[] { Boolean.valueOf(this.jjf) });
    this.jjf = false;
    GMTrace.o(12834704457728L, 95626);
  }
  
  public void onResume()
  {
    GMTrace.i(12834838675456L, 95627);
    super.onResume();
    if (this.eLY == null) {
      this.eLY = getIntent();
    }
    at.wS().a(new bf(new bf.a()
    {
      public final void a(e paramAnonymouse)
      {
        GMTrace.i(12835643981824L, 95633);
        if (paramAnonymouse == null)
        {
          UIEntryStub.this.finish();
          GMTrace.o(12835643981824L, 95633);
          return;
        }
        w.i("MicroMsg.UIEntryStub", "onResume mHasHandled: %b", new Object[] { Boolean.valueOf(UIEntryStub.a(UIEntryStub.this)) });
        if (!UIEntryStub.a(UIEntryStub.this))
        {
          UIEntryStub.b(UIEntryStub.this);
          UIEntryStub.a(UIEntryStub.this, UIEntryStub.c(UIEntryStub.this).getExtras());
        }
        GMTrace.o(12835643981824L, 95633);
      }
    }), 0);
    GMTrace.o(12834838675456L, 95627);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\base\stub\UIEntryStub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */