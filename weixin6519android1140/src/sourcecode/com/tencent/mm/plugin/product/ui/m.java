package com.tencent.mm.plugin.product.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.product.b.n.a;
import com.tencent.mm.sdk.platformtools.bg;

public final class m
  implements j.a
{
  public TextView hqi;
  public ImageView iDp;
  public n.a nKy;
  
  public m()
  {
    GMTrace.i(6029597212672L, 44924);
    GMTrace.o(6029597212672L, 44924);
  }
  
  public final void k(String paramString, final Bitmap paramBitmap)
  {
    GMTrace.i(6029731430400L, 44925);
    if ((this.nKy == null) || (bg.nm(this.nKy.iconUrl)))
    {
      GMTrace.o(6029731430400L, 44925);
      return;
    }
    if (paramString.equals(this.nKy.iconUrl)) {
      this.iDp.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6007317069824L, 44758);
          m.this.iDp.setImageBitmap(paramBitmap);
          GMTrace.o(6007317069824L, 44758);
        }
      });
    }
    GMTrace.o(6029731430400L, 44925);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\ui\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */