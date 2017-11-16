package com.tencent.mm.plugin.sight.draft.ui;

import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.k;
import com.tencent.mm.a.f;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.y.at;
import java.lang.ref.WeakReference;

public abstract class c
{
  public f<String, Bitmap> oUB;
  private Bitmap oUC;
  
  public c()
  {
    GMTrace.i(9363431358464L, 69763);
    this.oUB = new f(24);
    GMTrace.o(9363431358464L, 69763);
  }
  
  private Bitmap bgX()
  {
    GMTrace.i(9363834011648L, 69766);
    if (this.oUC == null) {
      this.oUC = d.Ag(R.k.cOa);
    }
    Bitmap localBitmap = this.oUC;
    GMTrace.o(9363834011648L, 69766);
    return localBitmap;
  }
  
  public final Bitmap o(String paramString1, String paramString2, boolean paramBoolean)
  {
    GMTrace.i(9363699793920L, 69765);
    if (bg.nm(paramString1))
    {
      paramString1 = bgX();
      GMTrace.o(9363699793920L, 69765);
      return paramString1;
    }
    Object localObject = (Bitmap)this.oUB.get(paramString1);
    if (localObject != null)
    {
      GMTrace.o(9363699793920L, 69765);
      return (Bitmap)localObject;
    }
    localObject = new a();
    ((a)localObject).amf = paramString1;
    ((a)localObject).path = paramString2;
    ((a)localObject).oUD = paramBoolean;
    ((a)localObject).oUE = new WeakReference(this);
    if (paramBoolean) {
      at.xB().A((Runnable)localObject);
    }
    do
    {
      paramString1 = bgX();
      GMTrace.o(9363699793920L, 69765);
      return paramString1;
      ((a)localObject).run();
      paramString1 = (Bitmap)this.oUB.get(paramString1);
    } while (paramString1 == null);
    GMTrace.o(9363699793920L, 69765);
    return paramString1;
  }
  
  public abstract void q(String paramString, Bitmap paramBitmap);
  
  private static final class a
    implements Runnable
  {
    String amf;
    boolean oUD;
    WeakReference<c> oUE;
    String path;
    
    public a()
    {
      GMTrace.i(9368665849856L, 69802);
      GMTrace.o(9368665849856L, 69802);
    }
    
    public final void run()
    {
      GMTrace.i(9368800067584L, 69803);
      Bitmap localBitmap = d.RD(this.path);
      Object localObject = (c)this.oUE.get();
      if (localObject != null)
      {
        if ((!bg.nm(this.amf)) && (localBitmap != null)) {
          ((c)localObject).oUB.put(this.amf, localBitmap);
        }
        localObject = new c.b();
        ((c.b)localObject).amf = this.amf;
        ((c.b)localObject).lEg = localBitmap;
        ((c.b)localObject).oUE = this.oUE;
        if (this.oUD) {
          af.t((Runnable)localObject);
        }
      }
      GMTrace.o(9368800067584L, 69803);
    }
  }
  
  private static final class b
    implements Runnable
  {
    String amf;
    Bitmap lEg;
    WeakReference<c> oUE;
    
    public b()
    {
      GMTrace.i(9365981495296L, 69782);
      GMTrace.o(9365981495296L, 69782);
    }
    
    public final void run()
    {
      GMTrace.i(9366115713024L, 69783);
      c localc = (c)this.oUE.get();
      if (localc != null) {
        localc.q(this.amf, this.lEg);
      }
      GMTrace.o(9366115713024L, 69783);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sight\draft\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */