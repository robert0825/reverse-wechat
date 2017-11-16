package com.tencent.mm.plugin.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.g.a.hu;
import com.tencent.mm.plugin.m.a.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.w;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;

public class MMAnimateView
  extends AppCompatImageView
{
  public String kgw;
  private float mDensity;
  public int mfg;
  private int mfh;
  private boolean mfi;
  
  public MMAnimateView(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(20141786005504L, 150068);
    GMTrace.o(20141786005504L, 150068);
  }
  
  public MMAnimateView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
    GMTrace.i(20141920223232L, 150069);
    GMTrace.o(20141920223232L, 150069);
  }
  
  public MMAnimateView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(20142054440960L, 150070);
    this.mfg = a.d.kvV;
    this.mfh = a.d.aYy;
    this.mfi = true;
    this.mDensity = 0.0F;
    if (com.tencent.mm.compatible.util.d.et(26)) {
      setLayerType(1, null);
    }
    GMTrace.o(20142054440960L, 150070);
  }
  
  private void a(Resources paramResources, int paramInt, boolean paramBoolean)
  {
    a locala = null;
    GMTrace.i(20143128182784L, 150078);
    try
    {
      Object localObject;
      if (!bg.nm(null))
      {
        this.kgw = null;
        b localb = b.aHd();
        if (localb.mfe.get(null) != null) {
          locala = (a)((WeakReference)localb.mfe.get(null)).get();
        }
        localObject = locala;
        if (locala == null)
        {
          localObject = new c(paramResources, paramInt);
          localb.mfe.put(null, new WeakReference(localObject));
        }
      }
      while (paramBoolean)
      {
        setImageDrawable((Drawable)localObject);
        GMTrace.o(20143128182784L, 150078);
        return;
        localObject = new c(paramResources, paramInt);
      }
      return;
    }
    catch (IOException paramResources)
    {
      w.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFResource failed. %s" + paramResources.toString());
      if (paramBoolean)
      {
        super.setImageResource(paramInt);
        GMTrace.o(20143128182784L, 150078);
        return;
        setBackgroundDrawable((Drawable)localObject);
        GMTrace.o(20143128182784L, 150078);
        return;
      }
      super.setBackgroundResource(paramInt);
      GMTrace.o(20143128182784L, 150078);
    }
  }
  
  public static void a(MMGIFException paramMMGIFException)
  {
    GMTrace.i(20143799271424L, 150083);
    hu localhu = new hu();
    localhu.eLj.errorCode = paramMMGIFException.getErrorCode();
    com.tencent.mm.sdk.b.a.vgX.m(localhu);
    GMTrace.o(20143799271424L, 150083);
  }
  
  public final void a(InputStream paramInputStream, String paramString)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    GMTrace.i(20142859747328L, 150076);
    for (;;)
    {
      try
      {
        if (bg.nm(paramString)) {
          continue;
        }
        this.kgw = paramString;
        localb = b.aHd();
        str = this.kgw;
        if (paramInputStream != null) {
          continue;
        }
        paramString = (String)localObject1;
      }
      catch (MMGIFException paramString)
      {
        b localb;
        String str;
        a(paramString);
        if (paramString.getErrorCode() != 103) {
          break label253;
        }
        paramInputStream = com.tencent.mm.sdk.platformtools.d.decodeStream(paramInputStream);
        if (paramInputStream == null) {
          break label233;
        }
        paramInputStream.setDensity(320);
        setImageBitmap(paramInputStream);
        GMTrace.o(20142859747328L, 150076);
        return;
        paramString = new c(paramInputStream);
        continue;
      }
      catch (IOException paramInputStream)
      {
        w.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileInputStream failed. %s", new Object[] { paramInputStream.toString() });
      }
      setImageDrawable(paramString);
      GMTrace.o(20142859747328L, 150076);
      return;
      w.d("MicroMsg.GIF.MMAnimateDrawableCacheMgr", "stream key:%s", new Object[] { str });
      localObject1 = localObject2;
      if (localb.mfe.get(str) != null) {
        localObject1 = (a)((WeakReference)localb.mfe.get(str)).get();
      }
      paramString = (String)localObject1;
      if (localObject1 == null)
      {
        paramString = new c(paramInputStream);
        localb.mfe.put(str, new WeakReference(paramString));
      }
    }
    for (;;)
    {
      init();
      GMTrace.o(20142859747328L, 150076);
      return;
      label233:
      w.w("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileInputStream failedbitmap is null. bytes %s");
      init();
      GMTrace.o(20142859747328L, 150076);
      return;
      label253:
      w.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileInputStream failed. %s", new Object[] { paramString.toString() });
    }
  }
  
  public final void a(String paramString, h paramh)
  {
    GMTrace.i(20143262400512L, 150079);
    try
    {
      localObject = new c(paramString);
      setImageDrawable((Drawable)localObject);
      ((c)localObject).mfB = Integer.MAX_VALUE;
      ((c)localObject).mfD = paramh;
      GMTrace.o(20143262400512L, 150079);
      return;
    }
    catch (MMGIFException paramh)
    {
      try
      {
        Object localObject;
        a(paramh);
        if (paramh.getErrorCode() == 103)
        {
          localObject = com.tencent.mm.sdk.platformtools.d.decodeStream(new FileInputStream(paramString));
          if (localObject == null) {
            break label157;
          }
          ((Bitmap)localObject).setDensity(320);
          setImageBitmap((Bitmap)localObject);
          GMTrace.o(20143262400512L, 150079);
          return;
        }
      }
      catch (FileNotFoundException paramString)
      {
        w.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failed. %s" + paramString.toString());
        w.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failed. %s" + paramh.toString());
      }
      init();
      GMTrace.o(20143262400512L, 150079);
      return;
      w.w("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failed bitmap is null. show default and delete file. path:%s", new Object[] { paramString });
      init();
      com.tencent.mm.loader.stub.b.deleteFile(paramString);
      GMTrace.o(20143262400512L, 150079);
      return;
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        label157:
        w.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failed. %s" + paramString.toString());
      }
    }
  }
  
  public final float aHe()
  {
    GMTrace.i(20142993965056L, 150077);
    if (this.mDensity == 0.0F)
    {
      this.mDensity = (com.tencent.mm.br.a.getDensity(ab.getContext()) / 2.0F);
      if (this.mDensity >= 1.0F) {
        break label60;
      }
      this.mDensity = 1.0F;
    }
    for (;;)
    {
      float f = this.mDensity;
      GMTrace.o(20142993965056L, 150077);
      return f;
      label60:
      if (this.mDensity > 2.0F) {
        this.mDensity = 2.0F;
      }
    }
  }
  
  public final void cy(String paramString1, String paramString2)
  {
    GMTrace.i(20142591311872L, 150074);
    cz(paramString1, paramString2);
    GMTrace.o(20142591311872L, 150074);
  }
  
  public final void cz(String paramString1, String paramString2)
  {
    GMTrace.i(20143396618240L, 150080);
    try
    {
      if (o.RI(paramString1))
      {
        paramString2 = new f(e.c(paramString1, 0, e.aY(paramString1)));
        paramString2.start();
        setImageDrawable(paramString2);
        GMTrace.o(20143396618240L, 150080);
        return;
      }
      if (!bg.nm(paramString2)) {
        this.kgw = paramString2;
      }
      for (paramString2 = b.aHd().cx(this.kgw, paramString1);; paramString2 = new c(paramString1))
      {
        setImageDrawable(paramString2);
        GMTrace.o(20143396618240L, 150080);
        return;
      }
      label214:
      return;
    }
    catch (MMGIFException paramString2)
    {
      try
      {
        a(paramString2);
        if (paramString2.getErrorCode() != 103) {
          break label214;
        }
        paramString2 = com.tencent.mm.sdk.platformtools.d.decodeFile(paramString1, null);
        if (paramString2 != null)
        {
          paramString2.setDensity(320);
          setImageBitmap(paramString2);
          GMTrace.o(20143396618240L, 150080);
          return;
        }
      }
      catch (Exception paramString1)
      {
        w.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failed1. %s", new Object[] { bg.f(paramString1) });
        GMTrace.o(20143396618240L, 150080);
        return;
      }
      w.w("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failedbitmap is null. show default and delete file. path %s", new Object[] { paramString1 });
      init();
      com.tencent.mm.loader.stub.b.deleteFile(paramString1);
      GMTrace.o(20143396618240L, 150080);
      return;
      GMTrace.o(20143396618240L, 150080);
      return;
    }
    catch (IOException paramString2)
    {
      w.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failed3. %s", new Object[] { bg.f(paramString2) });
      com.tencent.mm.loader.stub.b.deleteFile(paramString1);
      init();
      GMTrace.o(20143396618240L, 150080);
      return;
    }
    catch (NullPointerException paramString1)
    {
      init();
      GMTrace.o(20143396618240L, 150080);
    }
  }
  
  public final void h(byte[] paramArrayOfByte, String paramString)
  {
    GMTrace.i(20142725529600L, 150075);
    if (paramArrayOfByte == null) {}
    try
    {
      w.e("MicroMsg.GIF.MMGIFImageView", "[setMMGIFFileByteArray] bytes is null! src:%s cacheKey:%s", new Object[] { Boolean.valueOf(true), paramString });
      GMTrace.o(20142725529600L, 150075);
      return;
    }
    catch (MMGIFException paramString)
    {
      for (;;)
      {
        a(paramString);
        if (paramString.getErrorCode() != 103) {
          break label232;
        }
        paramString = com.tencent.mm.sdk.platformtools.d.bg(paramArrayOfByte);
        if (paramString == null) {
          break;
        }
        paramString.setDensity(320);
        setImageBitmap(paramString);
        GMTrace.o(20142725529600L, 150075);
        return;
        paramString = new c(paramArrayOfByte);
      }
    }
    catch (IOException paramArrayOfByte)
    {
      w.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileByteArray failed. %s", new Object[] { paramArrayOfByte.toString() });
    }
    if (!bg.nm(paramString))
    {
      this.kgw = paramString;
      paramString = b.aHd().o(this.kgw, paramArrayOfByte);
    }
    for (;;)
    {
      setImageDrawable(paramString);
      GMTrace.o(20142725529600L, 150075);
      return;
      if (!o.bk(paramArrayOfByte)) {
        break;
      }
      paramString = new f(paramArrayOfByte);
      paramString.start();
    }
    for (;;)
    {
      init();
      GMTrace.o(20142725529600L, 150075);
      return;
      w.w("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileByteArray failed bitmap is null. bytes %s", new Object[] { paramArrayOfByte.toString() });
      init();
      GMTrace.o(20142725529600L, 150075);
      return;
      label232:
      w.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileByteArray failed. %s", new Object[] { paramString.toString() });
    }
  }
  
  public final void init()
  {
    GMTrace.i(20143530835968L, 150081);
    this.mfi = com.tencent.mm.compatible.util.f.ty();
    if (this.mfi)
    {
      if (this.mfg > 0)
      {
        super.setImageResource(this.mfg);
        GMTrace.o(20143530835968L, 150081);
      }
    }
    else if (this.mfh > 0) {
      super.setImageResource(this.mfh);
    }
    GMTrace.o(20143530835968L, 150081);
  }
  
  public final void recycle()
  {
    GMTrace.i(20143933489152L, 150084);
    if ((getDrawable() != null) && ((getDrawable() instanceof c))) {
      ((c)getDrawable()).recycle();
    }
    GMTrace.o(20143933489152L, 150084);
  }
  
  public final void resume()
  {
    GMTrace.i(20143665053696L, 150082);
    if ((getDrawable() != null) && ((getDrawable() instanceof c)))
    {
      c localc = (c)getDrawable();
      if (!localc.mfj)
      {
        localc.mIsRunning = true;
        localc.f(localc.mfF, 0L);
      }
    }
    GMTrace.o(20143665053696L, 150082);
  }
  
  public void setBackgroundResource(int paramInt)
  {
    GMTrace.i(20142322876416L, 150072);
    a(getResources(), paramInt, false);
    GMTrace.o(20142322876416L, 150072);
  }
  
  public void setImageResource(int paramInt)
  {
    GMTrace.i(20142188658688L, 150071);
    a(getResources(), paramInt, true);
    GMTrace.o(20142188658688L, 150071);
  }
  
  public final void zZ(String paramString)
  {
    GMTrace.i(20142457094144L, 150073);
    cz(paramString, null);
    GMTrace.o(20142457094144L, 150073);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\gif\MMAnimateView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */