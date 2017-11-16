package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class tk
  extends c
{
  private final int height;
  private final int width;
  
  public tk()
  {
    GMTrace.i(17582522368000L, 131000);
    this.width = 96;
    this.height = 96;
    GMTrace.o(17582522368000L, 131000);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17582656585728L, 131001);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17582656585728L, 131001);
      return 0;
      GMTrace.o(17582656585728L, 131001);
      return 96;
      GMTrace.o(17582656585728L, 131001);
      return 96;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.e(paramVarArgs);
      c.d(paramVarArgs);
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
      localPaint2 = c.a(localPaint2, paramVarArgs);
      localPaint2.setStrokeWidth(1.0F);
      Object localObject2 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject2).setColor(-8420471);
      Object localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(96.0F, 47.448277F);
      ((Path)localObject1).cubicTo(96.0F, 74.50933F, 74.50971F, 96.0F, 48.551723F, 96.0F);
      ((Path)localObject1).cubicTo(21.490286F, 96.0F, 0.0F, 74.50933F, 0.0F, 47.448277F);
      ((Path)localObject1).cubicTo(0.0F, 21.488955F, 21.490286F, 5.9487298E-15F, 48.551723F, 5.9487298E-15F);
      ((Path)localObject1).cubicTo(74.50971F, 5.9487298E-15F, 96.0F, 21.488955F, 96.0F, 47.448277F);
      ((Path)localObject1).close();
      localCanvas.saveLayerAlpha(null, 51, 4);
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-8617594);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(96.0F, 48.0F);
      ((Path)localObject2).cubicTo(96.0F, 74.50967F, 74.50967F, 96.0F, 48.0F, 96.0F);
      ((Path)localObject2).cubicTo(21.490332F, 96.0F, 0.0F, 74.50967F, 0.0F, 48.0F);
      ((Path)localObject2).cubicTo(0.0F, 21.490332F, 21.490332F, 0.0F, 48.0F, 0.0F);
      ((Path)localObject2).cubicTo(74.50967F, 0.0F, 96.0F, 21.490332F, 96.0F, 48.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(2.2325583F, 48.0F);
      ((Path)localObject2).cubicTo(2.2325583F, 73.27666F, 22.72334F, 93.76744F, 48.0F, 93.76744F);
      ((Path)localObject2).cubicTo(73.27666F, 93.76744F, 93.76744F, 73.27666F, 93.76744F, 48.0F);
      ((Path)localObject2).cubicTo(93.76744F, 22.72334F, 73.27666F, 2.2325583F, 48.0F, 2.2325583F);
      ((Path)localObject2).cubicTo(22.72334F, 2.2325583F, 2.2325583F, 22.72334F, 2.2325583F, 48.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint2 = c.a(localPaint2, paramVarArgs);
      localPaint1.setColor(-8617594);
      localPaint2.setColor(-8617594);
      localPaint2.setStrokeWidth(2.0F);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(60.0F, 50.0F);
      ((Path)localObject1).cubicTo(58.552845F, 50.154545F, 57.8374F, 49.327274F, 59.0F, 48.0F);
      ((Path)localObject1).cubicTo(58.672085F, 47.436363F, 59.506775F, 46.727272F, 61.0F, 47.0F);
      ((Path)localObject1).cubicTo(64.03794F, 45.663635F, 66.54201F, 42.945454F, 67.0F, 40.0F);
      ((Path)localObject1).cubicTo(66.54201F, 35.736362F, 62.845528F, 32.545456F, 59.0F, 32.0F);
      ((Path)localObject1).cubicTo(53.544716F, 32.545456F, 49.84824F, 35.736362F, 50.0F, 40.0F);
      ((Path)localObject1).lineTo(50.0F, 57.0F);
      ((Path)localObject1).cubicTo(49.84824F, 63.272728F, 44.482384F, 68.0F, 38.0F, 68.0F);
      ((Path)localObject1).cubicTo(31.365854F, 68.0F, 26.0F, 63.272728F, 26.0F, 57.0F);
      ((Path)localObject1).cubicTo(26.0F, 52.163635F, 30.17344F, 47.79091F, 36.0F, 47.0F);
      ((Path)localObject1).cubicTo(37.20867F, 46.96364F, 37.80488F, 48.618183F, 37.0F, 49.0F);
      ((Path)localObject1).cubicTo(36.759224F, 49.496105F, 36.373985F, 50.390907F, 35.0F, 50.0F);
      ((Path)localObject1).cubicTo(31.962059F, 51.454544F, 29.457994F, 54.172726F, 29.0F, 57.0F);
      ((Path)localObject1).cubicTo(29.457994F, 61.263638F, 33.154472F, 64.454544F, 37.0F, 65.0F);
      ((Path)localObject1).cubicTo(42.455284F, 64.454544F, 46.15176F, 61.263638F, 46.0F, 57.0F);
      ((Path)localObject1).lineTo(46.0F, 40.0F);
      ((Path)localObject1).cubicTo(46.15176F, 33.727272F, 51.517616F, 29.0F, 58.0F, 29.0F);
      ((Path)localObject1).cubicTo(64.63415F, 29.0F, 70.0F, 33.727272F, 70.0F, 40.0F);
      ((Path)localObject1).cubicTo(70.0F, 44.954544F, 65.82656F, 49.20909F, 60.0F, 50.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.drawPath((Path)localObject1, localPaint2);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\tk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */