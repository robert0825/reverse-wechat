package com.tencent.mm.opensdk.diffdev.a;

import android.os.Handler;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class b
  implements OAuthListener
{
  b(a parama)
  {
    GMTrace.i(3489660928L, 26);
    GMTrace.o(3489660928L, 26);
  }
  
  public final void onAuthFinish(OAuthErrCode paramOAuthErrCode, String paramString)
  {
    GMTrace.i(3892314112L, 29);
    Log.d("MicroMsg.SDK.ListenerWrapper", String.format("onAuthFinish, errCode = %s, authCode = %s", new Object[] { paramOAuthErrCode.toString(), paramString }));
    this.f.d = null;
    Object localObject = new ArrayList();
    ((List)localObject).addAll(this.f.c);
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      ((OAuthListener)((Iterator)localObject).next()).onAuthFinish(paramOAuthErrCode, paramString);
    }
    GMTrace.o(3892314112L, 29);
  }
  
  public final void onAuthGotQrcode(String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(3623878656L, 27);
    Log.d("MicroMsg.SDK.ListenerWrapper", "onAuthGotQrcode, qrcodeImgPath = " + paramString);
    Object localObject = new ArrayList();
    ((List)localObject).addAll(this.f.c);
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      ((OAuthListener)((Iterator)localObject).next()).onAuthGotQrcode(paramString, paramArrayOfByte);
    }
    GMTrace.o(3623878656L, 27);
  }
  
  public final void onQrcodeScanned()
  {
    GMTrace.i(3758096384L, 28);
    Log.d("MicroMsg.SDK.ListenerWrapper", "onQrcodeScanned");
    if (this.f.handler != null) {
      this.f.handler.post(new c(this));
    }
    GMTrace.o(3758096384L, 28);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\opensdk\diffdev\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */