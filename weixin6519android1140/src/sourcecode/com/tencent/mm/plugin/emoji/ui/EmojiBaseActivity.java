package com.tencent.mm.plugin.emoji.ui;

import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.ui.MMActivity;

public abstract class EmojiBaseActivity
  extends MMActivity
{
  a koi;
  b koj;
  private HandlerThread mHandlerThread;
  
  public EmojiBaseActivity()
  {
    GMTrace.i(11363409723392L, 84664);
    GMTrace.o(11363409723392L, 84664);
  }
  
  public final void asp()
  {
    GMTrace.i(11364349247488L, 84671);
    if (this.koj != null) {
      this.koj.removeMessages(131074);
    }
    GMTrace.o(11364349247488L, 84671);
  }
  
  public final void bV(int paramInt1, int paramInt2)
  {
    GMTrace.i(11364080812032L, 84669);
    if (this.koj != null) {
      this.koj.sendEmptyMessageDelayed(paramInt1, paramInt2);
    }
    GMTrace.o(11364080812032L, 84669);
  }
  
  public abstract void g(Message paramMessage);
  
  public abstract void h(Message paramMessage);
  
  public final void i(Message paramMessage)
  {
    GMTrace.i(11364215029760L, 84670);
    if (this.koj != null) {
      this.koj.sendMessage(paramMessage);
    }
    GMTrace.o(11364215029760L, 84670);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11363543941120L, 84665);
    super.onCreate(paramBundle);
    this.mHandlerThread = e.SV("EmojiBaseActivity_handlerThread");
    this.mHandlerThread.start();
    this.koi = new a(this.mHandlerThread.getLooper());
    this.koj = new b(getMainLooper());
    GMTrace.o(11363543941120L, 84665);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11363678158848L, 84666);
    super.onDestroy();
    if ((this.koi != null) && (this.koi.getLooper() != null)) {
      this.koi.getLooper().quit();
    }
    this.mHandlerThread = null;
    this.koi = null;
    this.koj = null;
    GMTrace.o(11363678158848L, 84666);
  }
  
  private final class a
    extends ae
  {
    a(Looper paramLooper)
    {
      super();
      GMTrace.i(11464878325760L, 85420);
      GMTrace.o(11464878325760L, 85420);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      GMTrace.i(11465012543488L, 85421);
      super.handleMessage(paramMessage);
      EmojiBaseActivity.this.g(paramMessage);
      GMTrace.o(11465012543488L, 85421);
    }
  }
  
  private final class b
    extends ae
  {
    b(Looper paramLooper)
    {
      super();
      GMTrace.i(11360188497920L, 84640);
      GMTrace.o(11360188497920L, 84640);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      GMTrace.i(11360322715648L, 84641);
      super.handleMessage(paramMessage);
      EmojiBaseActivity.this.h(paramMessage);
      GMTrace.o(11360322715648L, 84641);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\EmojiBaseActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */