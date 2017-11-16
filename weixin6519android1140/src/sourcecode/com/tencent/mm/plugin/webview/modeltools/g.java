package com.tencent.mm.plugin.webview.modeltools;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ae.a;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.MMWebView;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Locale;

public final class g
{
  ae iAX;
  MMWebView rHk;
  public String rHl;
  c rHm;
  private ae.a rHn;
  
  public g()
  {
    GMTrace.i(11982421884928L, 89276);
    this.rHn = new ae.a()
    {
      public final boolean handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(11988730118144L, 89323);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(11988730118144L, 89323);
          return false;
          paramAnonymousMessage = g.this.rHk.getBitmap();
          if (paramAnonymousMessage != null)
          {
            com.tencent.mm.sdk.f.e.post(new g.b(g.this, paramAnonymousMessage), "ViewCaptureHelper_SaveBitmap");
            g.this.rHk = null;
            continue;
            if (g.this.rHm != null) {
              g.this.rHm.qV(g.this.rHl);
            }
          }
        }
      }
    };
    this.iAX = new ae(Looper.getMainLooper(), this.rHn);
    GMTrace.o(11982421884928L, 89276);
  }
  
  public final void a(MMWebView paramMMWebView, c paramc)
  {
    GMTrace.i(19382516318208L, 144411);
    this.rHk = paramMMWebView;
    this.rHm = paramc;
    this.iAX.sendEmptyMessage(1);
    GMTrace.o(19382516318208L, 144411);
  }
  
  public final void bDa()
  {
    GMTrace.i(11982690320384L, 89278);
    com.tencent.mm.sdk.f.e.post(new a(), "ViewCaptureHelper_DeleteBitmap");
    GMTrace.o(11982690320384L, 89278);
  }
  
  private final class a
    implements Runnable
  {
    public a()
    {
      GMTrace.i(11988193247232L, 89319);
      GMTrace.o(11988193247232L, 89319);
    }
    
    public final void run()
    {
      GMTrace.i(11988327464960L, 89320);
      if (g.this.rHl == null)
      {
        GMTrace.o(11988327464960L, 89320);
        return;
      }
      File[] arrayOfFile = new File(g.this.rHl).getParentFile().listFiles(new FilenameFilter()
      {
        public final boolean accept(File paramAnonymousFile, String paramAnonymousString)
        {
          GMTrace.i(11984032497664L, 89288);
          boolean bool = paramAnonymousString.matches(".+_.+.\\.jpg");
          GMTrace.o(11984032497664L, 89288);
          return bool;
        }
      });
      int j = arrayOfFile.length;
      int i = 0;
      while (i < j)
      {
        w.i("MicroMsg.ViewCaptureHelper", "deleteFile result: %b", new Object[] { Boolean.valueOf(arrayOfFile[i].delete()) });
        i += 1;
      }
      g.this.rHl = null;
      GMTrace.o(11988327464960L, 89320);
    }
  }
  
  private final class b
    implements Runnable
  {
    private Bitmap mBitmap;
    
    public b(Bitmap paramBitmap)
    {
      GMTrace.i(11979200659456L, 89252);
      this.mBitmap = paramBitmap;
      GMTrace.o(11979200659456L, 89252);
    }
    
    public final void run()
    {
      GMTrace.i(11979334877184L, 89253);
      g.this.rHl = String.format(Locale.US, "%s%s_%08x.jpg", new Object[] { com.tencent.mm.compatible.util.e.ghz, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(this.mBitmap.hashCode()) });
      try
      {
        d.a(this.mBitmap, 100, Bitmap.CompressFormat.JPEG, g.this.rHl, true);
        this.mBitmap.recycle();
        g.this.iAX.sendEmptyMessage(2);
        GMTrace.o(11979334877184L, 89253);
        return;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          w.e("MicroMsg.ViewCaptureHelper", "saveBitmapToImage failed, " + localIOException.getMessage());
          g.this.rHl = null;
        }
      }
    }
  }
  
  public static abstract interface c
  {
    public abstract void qV(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\modeltools\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */