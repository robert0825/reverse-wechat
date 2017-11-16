package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region.Op;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.f;
import com.tencent.mm.plugin.appbrand.n.c;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONArray;

public final class a
  implements d
{
  public a()
  {
    GMTrace.i(17713518870528L, 131976);
    GMTrace.o(17713518870528L, 131976);
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(17713787305984L, 131978);
    if (paramJSONArray.length() < 4)
    {
      GMTrace.o(17713787305984L, 131978);
      return false;
    }
    float f1 = c.b(paramJSONArray, 0);
    float f2 = c.b(paramJSONArray, 1);
    float f3 = c.b(paramJSONArray, 2);
    float f4 = c.b(paramJSONArray, 3);
    if (paramCanvas.isHardwareAccelerated())
    {
      if ((paramCanvas instanceof f))
      {
        paramd = (f)paramCanvas;
        paramCanvas = paramd.mBitmap;
        paramJSONArray = new RectF(f1, f2, f1 + f3, f2 + f4);
        RectF localRectF = new RectF(0.0F, 0.0F, paramd.mBitmap.getWidth(), paramd.mBitmap.getHeight());
        Region.Op localOp = Region.Op.XOR;
        Bitmap localBitmap = Bitmap.createBitmap(paramCanvas.getWidth(), paramCanvas.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas localCanvas = new Canvas(localBitmap);
        localCanvas.clipRect(paramJSONArray);
        localCanvas.clipRect(localRectF, localOp);
        localCanvas.drawBitmap(paramCanvas, 0.0F, 0.0F, null);
        if ((localBitmap != null) && (!localBitmap.isRecycled()))
        {
          paramd.mBitmap.eraseColor(0);
          paramd.drawBitmap(localBitmap, 0.0F, 0.0F, null);
          localBitmap.recycle();
        }
        w.v("MicroMsg.ClearRectAction", "MCanvas.clearRect(x : %s, y : %s, w : %s, h : %s)", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4) });
        GMTrace.o(17713787305984L, 131978);
        return true;
      }
      if (paramd.hNR != null)
      {
        paramCanvas.drawRect(f1, f2, f1 + f3, f2 + f4, paramd.hNR);
        w.v("MicroMsg.ClearRectAction", "clearRect(x : %s, y : %s, w : %s, h : %s) with custom clearPaint", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4) });
        GMTrace.o(17713787305984L, 131978);
        return true;
      }
      w.v("MicroMsg.ClearRectAction", "clearRect(x : %s, y : %s, w : %s, h : %s) failed", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4) });
      GMTrace.o(17713787305984L, 131978);
      return false;
    }
    if (paramd.hNR != null)
    {
      paramCanvas.drawRect(f1, f2, f1 + f3, f2 + f4, paramd.hNR);
      w.v("MicroMsg.ClearRectAction", "clearRect(x : %s, y : %s, w : %s, h : %s) with custom clearPaint", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4) });
      GMTrace.o(17713787305984L, 131978);
      return true;
    }
    paramCanvas.drawRect(f1, f2, f1 + f3, f2 + f4, paramd.hNQ);
    w.v("MicroMsg.ClearRectAction", "clearRect(x : %s, y : %s, w : %s, h : %s) with default clearPaint", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4) });
    GMTrace.o(17713787305984L, 131978);
    return true;
  }
  
  public final String getMethod()
  {
    GMTrace.i(17713653088256L, 131977);
    GMTrace.o(17713653088256L, 131977);
    return "clearRect";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */