package com.tencent.mm.api;

import android.content.Context;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public abstract class b
  extends FrameLayout
{
  public l eqv;
  
  public b(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(20211981877248L, 150591);
    this.eqv = new l()
    {
      public final void a(d paramAnonymousd)
      {
        GMTrace.i(20209431740416L, 150572);
        w.i("MicroMsg.DrawingView", "Default [onSelectedFeature] features:%s", new Object[] { paramAnonymousd.name() });
        GMTrace.o(20209431740416L, 150572);
      }
      
      public final void a(d paramAnonymousd, int paramAnonymousInt)
      {
        GMTrace.i(20209565958144L, 150573);
        w.i("MicroMsg.DrawingView", "Default [onSelectedDetailFeature] features:%s index:%s", new Object[] { paramAnonymousd.name(), Integer.valueOf(paramAnonymousInt) });
        GMTrace.o(20209565958144L, 150573);
      }
      
      public final void ap(boolean paramAnonymousBoolean)
      {
        GMTrace.i(20209700175872L, 150574);
        GMTrace.o(20209700175872L, 150574);
      }
    };
    GMTrace.o(20211981877248L, 150591);
  }
  
  public abstract void a(e parame);
  
  public abstract void am(boolean paramBoolean);
  
  public abstract void an(boolean paramBoolean);
  
  public abstract void ao(boolean paramBoolean);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\api\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */