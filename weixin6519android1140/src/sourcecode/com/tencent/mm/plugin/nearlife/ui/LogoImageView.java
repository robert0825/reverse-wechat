package com.tencent.mm.plugin.nearlife.ui;

import android.content.Context;
import android.os.Message;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;

public class LogoImageView
  extends ImageView
{
  ae handler;
  String imagePath;
  int lhd;
  int mAB;
  String url;
  
  public LogoImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12562108252160L, 93595);
    this.url = null;
    this.handler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(12547746955264L, 93488);
        byte[] arrayOfByte = (byte[])paramAnonymousMessage.obj;
        if ((arrayOfByte == null) || (arrayOfByte.length == 0))
        {
          w.e("MicroMsg.LogoImageView", "handleMsg fail, data is null");
          GMTrace.o(12547746955264L, 93488);
          return;
        }
        paramAnonymousMessage = d.bg(arrayOfByte);
        String str = LogoImageView.a(LogoImageView.this) + g.n(LogoImageView.b(LogoImageView.this).getBytes());
        w.d("MicroMsg.LogoImageView", "filePath  %s", new Object[] { str });
        e.b(str, arrayOfByte, arrayOfByte.length);
        if ((paramAnonymousMessage != null) && (LogoImageView.c(LogoImageView.this) > 0) && (LogoImageView.d(LogoImageView.this) > 0)) {
          paramAnonymousMessage = d.a(paramAnonymousMessage, LogoImageView.d(LogoImageView.this), LogoImageView.c(LogoImageView.this), true, false);
        }
        for (;;)
        {
          LogoImageView.this.setImageBitmap(paramAnonymousMessage);
          GMTrace.o(12547746955264L, 93488);
          return;
        }
      }
    };
    GMTrace.o(12562108252160L, 93595);
  }
  
  static final class a
    implements Runnable
  {
    private ae handler;
    private String url;
    
    a(String paramString, ae paramae)
    {
      GMTrace.i(12558887026688L, 93571);
      this.url = paramString;
      this.handler = paramae;
      GMTrace.o(12558887026688L, 93571);
    }
    
    public final void run()
    {
      GMTrace.i(12559021244416L, 93572);
      byte[] arrayOfByte = bg.SC(this.url);
      Message localMessage = Message.obtain();
      localMessage.obj = arrayOfByte;
      this.handler.sendMessage(localMessage);
      GMTrace.o(12559021244416L, 93572);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nearlife\ui\LogoImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */