package com.tencent.mm.plugin.location.ui;

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

public class SimpleImageView
  extends ImageView
{
  public ae handler;
  public String imagePath;
  public int lhd;
  public int mAB;
  public String url;
  
  public SimpleImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9649986207744L, 71898);
    this.url = null;
    this.handler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(9667971383296L, 72032);
        byte[] arrayOfByte = (byte[])paramAnonymousMessage.obj;
        if ((arrayOfByte == null) || (arrayOfByte.length == 0))
        {
          w.e("MicroMsg.SimpleImageView", "handleMsg fail, data is null");
          GMTrace.o(9667971383296L, 72032);
          return;
        }
        paramAnonymousMessage = d.bg(arrayOfByte);
        String str = SimpleImageView.a(SimpleImageView.this) + g.n(SimpleImageView.b(SimpleImageView.this).getBytes());
        w.d("MicroMsg.SimpleImageView", "filePath  %s", new Object[] { str });
        e.b(str, arrayOfByte, arrayOfByte.length);
        if ((paramAnonymousMessage != null) && (SimpleImageView.c(SimpleImageView.this) > 0) && (SimpleImageView.d(SimpleImageView.this) > 0)) {
          paramAnonymousMessage = d.a(paramAnonymousMessage, SimpleImageView.d(SimpleImageView.this), SimpleImageView.c(SimpleImageView.this), true, false);
        }
        for (;;)
        {
          SimpleImageView.this.setImageBitmap(paramAnonymousMessage);
          GMTrace.o(9667971383296L, 72032);
          return;
        }
      }
    };
    GMTrace.o(9649986207744L, 71898);
  }
  
  public static final class a
    implements Runnable
  {
    private ae handler;
    private String url;
    
    public a(String paramString, ae paramae)
    {
      GMTrace.i(9717497724928L, 72401);
      this.url = paramString;
      this.handler = paramae;
      GMTrace.o(9717497724928L, 72401);
    }
    
    public final void run()
    {
      GMTrace.i(9717631942656L, 72402);
      byte[] arrayOfByte = bg.SC(this.url);
      Message localMessage = Message.obtain();
      localMessage.obj = arrayOfByte;
      this.handler.sendMessage(localMessage);
      GMTrace.o(9717631942656L, 72402);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\SimpleImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */