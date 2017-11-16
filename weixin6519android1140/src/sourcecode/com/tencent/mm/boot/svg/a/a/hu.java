package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class hu
  extends c
{
  private final int height;
  private final int width;
  
  public hu()
  {
    GMTrace.i(15835678638080L, 117985);
    this.width = 102;
    this.height = 102;
    GMTrace.o(15835678638080L, 117985);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15835812855808L, 117986);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15835812855808L, 117986);
      return 0;
      GMTrace.o(15835812855808L, 117986);
      return 102;
      GMTrace.o(15835812855808L, 117986);
      return 102;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject2 = c.d(paramVarArgs);
      Paint localPaint1 = c.h(paramVarArgs);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.h(paramVarArgs);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      c.a(localPaint2, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -2644.0F, 0.0F, 1.0F, -1766.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(2716.0F, 1819.1445F);
      ((Path)localObject2).lineTo(2716.0F, 1793.4993F);
      ((Path)localObject2).cubicTo(2716.0F, 1792.396F, 2715.1057F, 1791.5F, 2714.0024F, 1791.5F);
      ((Path)localObject2).lineTo(2675.9976F, 1791.5F);
      ((Path)localObject2).cubicTo(2674.8967F, 1791.5F, 2674.0F, 1792.3951F, 2674.0F, 1793.4993F);
      ((Path)localObject2).lineTo(2674.0F, 1840.5007F);
      ((Path)localObject2).cubicTo(2674.0F, 1841.604F, 2674.8943F, 1842.5F, 2675.9976F, 1842.5F);
      ((Path)localObject2).lineTo(2714.0024F, 1842.5F);
      ((Path)localObject2).cubicTo(2715.1033F, 1842.5F, 2716.0F, 1841.6049F, 2716.0F, 1840.5007F);
      ((Path)localObject2).lineTo(2716.0F, 1821.9503F);
      ((Path)localObject2).lineTo(2694.9534F, 1833.2782F);
      ((Path)localObject2).lineTo(2694.801F, 1833.36F);
      ((Path)localObject2).cubicTo(2694.6123F, 1833.4487F, 2694.3997F, 1833.5F, 2694.1743F, 1833.5F);
      ((Path)localObject2).cubicTo(2693.6523F, 1833.5F, 2693.1985F, 1833.2317F, 2692.96F, 1832.836F);
      ((Path)localObject2).lineTo(2692.8687F, 1832.6495F);
      ((Path)localObject2).lineTo(2689.067F, 1824.8727F);
      ((Path)localObject2).cubicTo(2689.0254F, 1824.7877F, 2689.0F, 1824.692F, 2689.0F, 1824.5991F);
      ((Path)localObject2).cubicTo(2689.0F, 1824.241F, 2689.3118F, 1823.9498F, 2689.6965F, 1823.9498F);
      ((Path)localObject2).cubicTo(2689.8528F, 1823.9498F, 2689.9968F, 1823.9979F, 2690.113F, 1824.0787F);
      ((Path)localObject2).lineTo(2694.5994F, 1827.0565F);
      ((Path)localObject2).cubicTo(2694.9272F, 1827.2567F, 2695.3188F, 1827.3739F, 2695.74F, 1827.3739F);
      ((Path)localObject2).cubicTo(2695.991F, 1827.3739F, 2696.2307F, 1827.3301F, 2696.4539F, 1827.2546F);
      ((Path)localObject2).lineTo(2716.0F, 1819.1445F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(2695.0F, 1868.0F);
      ((Path)localObject2).cubicTo(2666.8335F, 1868.0F, 2644.0F, 1845.1665F, 2644.0F, 1817.0F);
      ((Path)localObject2).cubicTo(2644.0F, 1788.8335F, 2666.8335F, 1766.0F, 2695.0F, 1766.0F);
      ((Path)localObject2).cubicTo(2723.1665F, 1766.0F, 2746.0F, 1788.8335F, 2746.0F, 1817.0F);
      ((Path)localObject2).cubicTo(2746.0F, 1845.1665F, 2723.1665F, 1868.0F, 2695.0F, 1868.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(2695.0F, 1865.0F);
      ((Path)localObject2).cubicTo(2668.4902F, 1865.0F, 2647.0F, 1843.5096F, 2647.0F, 1817.0F);
      ((Path)localObject2).cubicTo(2647.0F, 1790.4904F, 2668.4902F, 1769.0F, 2695.0F, 1769.0F);
      ((Path)localObject2).cubicTo(2721.5098F, 1769.0F, 2743.0F, 1790.4904F, 2743.0F, 1817.0F);
      ((Path)localObject2).cubicTo(2743.0F, 1843.5096F, 2721.5098F, 1865.0F, 2695.0F, 1865.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(2681.5F, 1799.0F);
      ((Path)localObject2).lineTo(2696.5F, 1799.0F);
      ((Path)localObject2).lineTo(2696.5F, 1802.0F);
      ((Path)localObject2).lineTo(2681.5F, 1802.0F);
      ((Path)localObject2).lineTo(2681.5F, 1799.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(2681.5F, 1806.5F);
      ((Path)localObject2).lineTo(2696.5F, 1806.5F);
      ((Path)localObject2).lineTo(2696.5F, 1809.5F);
      ((Path)localObject2).lineTo(2681.5F, 1809.5F);
      ((Path)localObject2).lineTo(2681.5F, 1806.5F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\hu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */