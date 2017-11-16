package com.tencent.mm.plugin.qqmail.stub;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.qqmail.ui.c;
import com.tencent.mm.plugin.qqmail.ui.c.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.a;

@a(7)
public class QQMailStubProxyUI
  extends Activity
{
  public QQMailStubProxyUI()
  {
    GMTrace.i(5577015033856L, 41552);
    GMTrace.o(5577015033856L, 41552);
  }
  
  protected void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(5577149251584L, 41553);
    super.onCreate(paramBundle);
    w.d("MicroMsg.QQMail.QQMailStubProxyUI", "onCreate");
    paramBundle = new c(this);
    paramBundle.a(new c.a()
    {
      public final void aYH()
      {
        GMTrace.i(5577686122496L, 41557);
        w.d("MicroMsg.QQMail.QQMailStubProxyUI", "onAfterVerify");
        paramBundle.release();
        QQMailStubProxyUI.this.setResult(-1);
        QQMailStubProxyUI.this.finish();
        GMTrace.o(5577686122496L, 41557);
      }
      
      public final void aYI()
      {
        GMTrace.i(5577820340224L, 41558);
        w.e("MicroMsg.QQMail.QQMailStubProxyUI", "onVerifyFail, finish self");
        paramBundle.release();
        QQMailStubProxyUI.this.setResult(0);
        QQMailStubProxyUI.this.finish();
        GMTrace.o(5577820340224L, 41558);
      }
    });
    GMTrace.o(5577149251584L, 41553);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\stub\QQMailStubProxyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */