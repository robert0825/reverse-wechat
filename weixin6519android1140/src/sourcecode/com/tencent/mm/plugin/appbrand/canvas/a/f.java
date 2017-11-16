package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.e;
import com.tencent.mm.plugin.appbrand.canvas.e.a;
import com.tencent.mm.plugin.appbrand.n.c;
import org.json.JSONArray;

public final class f
  implements d
{
  public f()
  {
    GMTrace.i(17717142749184L, 132003);
    GMTrace.o(17717142749184L, 132003);
  }
  
  public final boolean a(final com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(17717411184640L, 132005);
    if (paramJSONArray.length() < 3)
    {
      GMTrace.o(17717411184640L, 132005);
      return false;
    }
    Object localObject = paramJSONArray.optString(0);
    float f5 = c.b(paramJSONArray, 1);
    float f6 = c.b(paramJSONArray, 2);
    if (TextUtils.isEmpty((CharSequence)localObject))
    {
      GMTrace.o(17717411184640L, 132005);
      return false;
    }
    localObject = paramd.hNS.a(paramd.fXC, (String)localObject, new e.a()
    {
      public final void TR()
      {
        GMTrace.i(19998709907456L, 149002);
        paramd.invalidate();
        GMTrace.o(19998709907456L, 149002);
      }
    });
    if ((localObject == null) || (((Bitmap)localObject).isRecycled()))
    {
      GMTrace.o(17717411184640L, 132005);
      return false;
    }
    float f4 = c.jM(((Bitmap)localObject).getWidth());
    float f3 = c.jM(((Bitmap)localObject).getHeight());
    float f2 = f3;
    float f1 = f4;
    if (paramJSONArray.length() >= 5)
    {
      f1 = c.a(paramJSONArray, 3, f4);
      f2 = c.a(paramJSONArray, 4, f3);
    }
    paramCanvas.drawBitmap((Bitmap)localObject, new Rect(0, 0, ((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight()), new RectF(f5, f6, f1 + f5, f2 + f6), paramd.hNN);
    GMTrace.o(17717411184640L, 132005);
    return true;
  }
  
  public final String getMethod()
  {
    GMTrace.i(17717276966912L, 132004);
    GMTrace.o(17717276966912L, 132004);
    return "drawImage";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */