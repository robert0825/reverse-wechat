package com.tencent.mm.plugin.radar.ui;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.pluginsdk.ui.j;
import com.tencent.mm.pluginsdk.ui.j.a;

public final class b
  extends j
  implements d.a
{
  private b(String paramString)
  {
    super(a.nPm, paramString);
    GMTrace.i(8906822647808L, 66361);
    GMTrace.o(8906822647808L, 66361);
  }
  
  public final void ib(String paramString)
  {
    GMTrace.i(8906956865536L, 66362);
    super.ib(paramString);
    GMTrace.o(8906956865536L, 66362);
  }
  
  public static final class a
  {
    public static j.a nPm;
    
    public static void a(ImageView paramImageView, String paramString)
    {
      GMTrace.i(8912996663296L, 66407);
      Object localObject = paramImageView.getDrawable();
      if ((localObject != null) && ((localObject instanceof b))) {}
      for (localObject = (b)localObject;; localObject = new b(paramString, (byte)0))
      {
        ((b)localObject).oZ(paramString);
        paramImageView.setImageDrawable((Drawable)localObject);
        GMTrace.o(8912996663296L, 66407);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\radar\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */