package com.tencent.mm.pluginsdk.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import junit.framework.Assert;

public final class a
  extends j
  implements d.a
{
  private a(String paramString)
  {
    super(b.nPm, paramString);
    GMTrace.i(1222320848896L, 9107);
    GMTrace.o(1222320848896L, 9107);
  }
  
  private a(String paramString, byte paramByte)
  {
    super(b.nPm, paramString, false);
    GMTrace.i(1222455066624L, 9108);
    GMTrace.o(1222455066624L, 9108);
  }
  
  public final void ib(String paramString)
  {
    GMTrace.i(1222589284352L, 9109);
    super.ib(paramString);
    GMTrace.o(1222589284352L, 9109);
  }
  
  public static abstract interface a
  {
    public abstract void doInvalidate();
    
    public abstract Drawable getDrawable();
    
    public abstract void setImageDrawable(Drawable paramDrawable);
  }
  
  public static final class b
  {
    public static j.a nPm;
    
    public static void a(ImageView paramImageView, String paramString)
    {
      GMTrace.i(1036160860160L, 7720);
      if (paramImageView == null)
      {
        w.e("MicroMsg.AvatarDrawable", "imageView is null");
        GMTrace.o(1036160860160L, 7720);
        return;
      }
      Object localObject = paramImageView.getDrawable();
      if ((localObject != null) && ((localObject instanceof a))) {}
      for (localObject = (a)localObject;; localObject = new a(paramString, '\000'))
      {
        ((a)localObject).oZ(paramString);
        paramImageView.setImageDrawable((Drawable)localObject);
        paramImageView.invalidate();
        GMTrace.o(1036160860160L, 7720);
        return;
      }
    }
    
    public static void a(ImageView paramImageView, String paramString, float paramFloat, boolean paramBoolean)
    {
      GMTrace.i(1036563513344L, 7723);
      Object localObject = paramImageView.getDrawable();
      if ((localObject != null) && ((localObject instanceof b))) {
        localObject = (b)localObject;
      }
      for (;;)
      {
        ((b)localObject).oZ(paramString);
        paramImageView.setImageDrawable((Drawable)localObject);
        paramImageView.invalidate();
        GMTrace.o(1036563513344L, 7723);
        return;
        localObject = new b(paramString, paramFloat);
        ((b)localObject).jY(paramBoolean);
      }
    }
    
    public static void a(a.a parama, String paramString)
    {
      GMTrace.i(1036831948800L, 7725);
      Object localObject = parama.getDrawable();
      if ((localObject != null) && ((localObject instanceof a))) {}
      for (localObject = (a)localObject;; localObject = new a(paramString, '\000'))
      {
        ((a)localObject).oZ(paramString);
        parama.setImageDrawable((Drawable)localObject);
        parama.doInvalidate();
        GMTrace.o(1036831948800L, 7725);
        return;
      }
    }
    
    public static void b(ImageView paramImageView, String paramString, boolean paramBoolean)
    {
      GMTrace.i(1036697731072L, 7724);
      Object localObject = paramImageView.getDrawable();
      if ((localObject != null) && ((localObject instanceof a))) {}
      for (localObject = (a)localObject;; localObject = new a(paramString, (short)0))
      {
        ((a)localObject).oZ(paramString);
        paramImageView.setImageDrawable((Drawable)localObject);
        paramImageView.invalidate();
        GMTrace.o(1036697731072L, 7724);
        return;
      }
    }
    
    public static j.a bKI()
    {
      GMTrace.i(1036026642432L, 7719);
      if (nPm != null) {}
      for (boolean bool = true;; bool = false)
      {
        Assert.assertTrue(bool);
        j.a locala = nPm;
        GMTrace.o(1036026642432L, 7719);
        return locala;
      }
    }
    
    public static void g(ImageView paramImageView, String paramString, int paramInt)
    {
      GMTrace.i(1036966166528L, 7726);
      if (paramImageView == null)
      {
        GMTrace.o(1036966166528L, 7726);
        return;
      }
      Object localObject = paramImageView.getDrawable();
      if ((localObject != null) && ((localObject instanceof c))) {}
      for (localObject = (c)localObject;; localObject = new c(paramString))
      {
        if ((((c)localObject).tsM != paramInt) || (((c)localObject).tsL == null) || (((c)localObject).tsL.jvJ == null) || (((c)localObject).tsL.jvJ.isRecycled()))
        {
          ((c)localObject).tsM = paramInt;
          Bitmap localBitmap = d.Ag(paramInt);
          if (((c)localObject).tsL != null) {
            ((c)localObject).tsL.jvJ = localBitmap;
          }
        }
        ((c)localObject).oZ(paramString);
        paramImageView.setImageDrawable((Drawable)localObject);
        paramImageView.invalidate();
        GMTrace.o(1036966166528L, 7726);
        return;
      }
    }
    
    public static void n(ImageView paramImageView, String paramString)
    {
      GMTrace.i(1036295077888L, 7721);
      a(paramImageView, paramString, 0.5F, false);
      GMTrace.o(1036295077888L, 7721);
    }
    
    public static void o(ImageView paramImageView, String paramString)
    {
      GMTrace.i(1036429295616L, 7722);
      a(paramImageView, paramString, 0.5F, true);
      GMTrace.o(1036429295616L, 7722);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */