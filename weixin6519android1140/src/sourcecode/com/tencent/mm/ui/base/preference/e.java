package com.tencent.mm.ui.base.preference;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;

public final class e
{
  Bitmap bitmap;
  int qPV;
  
  public e()
  {
    GMTrace.i(3233573502976L, 24092);
    this.bitmap = null;
    this.qPV = -1;
    GMTrace.o(3233573502976L, 24092);
  }
  
  public final void g(ImageView paramImageView)
  {
    GMTrace.i(3233707720704L, 24093);
    if (paramImageView == null)
    {
      GMTrace.o(3233707720704L, 24093);
      return;
    }
    if (this.qPV != -1) {
      paramImageView.setImageDrawable(a.b(paramImageView.getContext(), this.qPV));
    }
    if (this.bitmap != null) {
      paramImageView.setImageBitmap(this.bitmap);
    }
    GMTrace.o(3233707720704L, 24093);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\base\preference\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */