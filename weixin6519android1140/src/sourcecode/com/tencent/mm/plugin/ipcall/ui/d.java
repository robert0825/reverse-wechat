package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.ipcall.b.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ar;
import com.tencent.mm.sdk.platformtools.ar.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.y;
import java.lang.ref.WeakReference;

public final class d
{
  public Context context;
  private ae ghS;
  ar mok;
  public y<String, WeakReference<Bitmap>> mol;
  
  public d(Context paramContext)
  {
    GMTrace.i(11687142883328L, 87076);
    this.mol = new y(50);
    this.ghS = new ae(Looper.getMainLooper());
    this.mok = new ar(5, "IPCallAddressAvatarLoader", 1, Looper.getMainLooper());
    this.context = paramContext;
    GMTrace.o(11687142883328L, 87076);
  }
  
  private static String Aw(String paramString)
  {
    GMTrace.i(11687813971968L, 87081);
    paramString = paramString + "@username";
    GMTrace.o(11687813971968L, 87081);
    return paramString;
  }
  
  private static String Ax(String paramString)
  {
    GMTrace.i(11687948189696L, 87082);
    paramString = paramString + "@contactId";
    GMTrace.o(11687948189696L, 87082);
    return paramString;
  }
  
  public static String cF(String paramString1, String paramString2)
  {
    GMTrace.i(11688082407424L, 87083);
    paramString1 = paramString1 + "@" + paramString2 + "@contactId@username";
    GMTrace.o(11688082407424L, 87083);
    return paramString1;
  }
  
  private boolean d(String paramString, ImageView paramImageView)
  {
    GMTrace.i(11687679754240L, 87080);
    Object localObject = (WeakReference)this.mol.get(paramString);
    if (localObject != null)
    {
      localObject = (Bitmap)((WeakReference)localObject).get();
      if ((localObject != null) && (paramImageView.getTag() != null) && (paramImageView.getTag().toString().equals(paramString)))
      {
        if ((localObject != null) && (!((Bitmap)localObject).isRecycled())) {
          paramImageView.setImageBitmap((Bitmap)localObject);
        }
        GMTrace.o(11687679754240L, 87080);
        return true;
      }
    }
    GMTrace.o(11687679754240L, 87080);
    return false;
  }
  
  public final void a(final ImageView paramImageView, final String paramString, final Bitmap paramBitmap)
  {
    GMTrace.i(16062640816128L, 119676);
    if (paramBitmap != null)
    {
      this.mol.put(paramString, new WeakReference(paramBitmap));
      this.ghS.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11631845179392L, 86664);
          if ((paramImageView.getTag() != null) && (paramImageView.getTag().equals(paramString)) && (paramBitmap != null) && (!paramBitmap.isRecycled())) {
            paramImageView.setImageBitmap(paramBitmap);
          }
          GMTrace.o(11631845179392L, 86664);
        }
      });
    }
    GMTrace.o(16062640816128L, 119676);
  }
  
  public final void a(final String paramString1, final String paramString2, final ImageView paramImageView)
  {
    GMTrace.i(11687277101056L, 87077);
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)) || (paramImageView == null))
    {
      GMTrace.o(11687277101056L, 87077);
      return;
    }
    final String str = cF(paramString1, paramString2);
    paramImageView.setTag(str);
    if (!d(cF(paramString1, paramString2), paramImageView)) {
      this.mok.c(new ar.a()
      {
        private boolean gaP;
        
        public final boolean Dj()
        {
          GMTrace.i(11695464382464L, 87138);
          Bitmap localBitmap = a.ak(d.this.context, paramString1);
          if (localBitmap != null)
          {
            d.this.mol.put(str, new WeakReference(localBitmap));
            this.gaP = true;
            d.this.a(paramImageView, str, localBitmap);
          }
          GMTrace.o(11695464382464L, 87138);
          return true;
        }
        
        public final boolean Dk()
        {
          GMTrace.i(11695598600192L, 87139);
          if (!this.gaP)
          {
            d locald = d.this;
            String str2 = paramString1;
            String str1 = paramString2;
            ImageView localImageView = paramImageView;
            str2 = d.cF(str2, str1);
            locald.mok.c(new d.2(locald, str1, localImageView, str2));
          }
          GMTrace.o(11695598600192L, 87139);
          return true;
        }
      });
    }
    GMTrace.o(11687277101056L, 87077);
  }
  
  public final void b(final String paramString, final ImageView paramImageView)
  {
    GMTrace.i(11687411318784L, 87078);
    if ((bg.nm(paramString)) || (paramImageView == null))
    {
      GMTrace.o(11687411318784L, 87078);
      return;
    }
    final String str = Ax(paramString);
    paramImageView.setTag(str);
    if (!d(Ax(paramString), paramImageView)) {
      this.mok.c(new ar.a()
      {
        public final boolean Dj()
        {
          GMTrace.i(11650635661312L, 86804);
          Bitmap localBitmap = a.ak(d.this.context, paramString);
          d.this.a(paramImageView, str, localBitmap);
          GMTrace.o(11650635661312L, 86804);
          return true;
        }
        
        public final boolean Dk()
        {
          GMTrace.i(11650769879040L, 86805);
          GMTrace.o(11650769879040L, 86805);
          return true;
        }
      });
    }
    GMTrace.o(11687411318784L, 87078);
  }
  
  public final void c(final String paramString, final ImageView paramImageView)
  {
    GMTrace.i(11687545536512L, 87079);
    if ((bg.nm(paramString)) || (paramImageView == null))
    {
      GMTrace.o(11687545536512L, 87079);
      return;
    }
    final String str = Aw(paramString);
    paramImageView.setTag(str);
    if (!d(Aw(paramString), paramImageView)) {
      this.mok.c(new ar.a()
      {
        public final boolean Dj()
        {
          GMTrace.i(11721771057152L, 87334);
          Bitmap localBitmap2 = b.a(paramString, false, -1);
          Bitmap localBitmap1 = localBitmap2;
          if (localBitmap2 == null)
          {
            n.Dh();
            localBitmap1 = com.tencent.mm.ac.d.hX(paramString);
          }
          d.this.a(paramImageView, str, localBitmap1);
          GMTrace.o(11721771057152L, 87334);
          return true;
        }
        
        public final boolean Dk()
        {
          GMTrace.i(11721905274880L, 87335);
          GMTrace.o(11721905274880L, 87335);
          return false;
        }
      });
    }
    GMTrace.o(11687545536512L, 87079);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */