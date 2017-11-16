package com.tencent.mm.plugin.appbrand.widget.input.a;

import android.os.Looper;
import android.os.Message;
import android.text.Selection;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;

public final class a
{
  private final ae iLF;
  public volatile c iPl;
  
  public a()
  {
    GMTrace.i(19862478913536L, 147987);
    this.iLF = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(19862881566720L, 147990);
        if (1000 == paramAnonymousMessage.what)
        {
          String str = (String)paramAnonymousMessage.obj;
          int i = paramAnonymousMessage.arg1;
          if (a.this.iPl != null) {
            a.this.iPl.ak(str, i);
          }
        }
        GMTrace.o(19862881566720L, 147990);
      }
    };
    GMTrace.o(19862478913536L, 147987);
  }
  
  public final void a(CharSequence paramCharSequence, boolean paramBoolean)
  {
    GMTrace.i(19862613131264L, 147988);
    if (paramCharSequence == null)
    {
      GMTrace.o(19862613131264L, 147988);
      return;
    }
    paramCharSequence = this.iLF.obtainMessage(1000, Selection.getSelectionEnd(paramCharSequence), 0, paramCharSequence.toString());
    this.iLF.removeMessages(1000);
    ae localae = this.iLF;
    if (paramBoolean) {}
    for (long l = 150L;; l = 0L)
    {
      localae.sendMessageDelayed(paramCharSequence, l);
      GMTrace.o(19862613131264L, 147988);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */