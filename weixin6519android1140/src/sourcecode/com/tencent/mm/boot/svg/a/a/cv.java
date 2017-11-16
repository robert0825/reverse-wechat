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

public final class cv
  extends c
{
  private final int height;
  private final int width;
  
  public cv()
  {
    GMTrace.i(15863059054592L, 118189);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15863059054592L, 118189);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15863193272320L, 118190);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15863193272320L, 118190);
      return 0;
      GMTrace.o(15863193272320L, 118190);
      return 96;
      GMTrace.o(15863193272320L, 118190);
      return 96;
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -1592.0F, 0.0F, 1.0F, -216.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 1592.0F, 0.0F, 1.0F, 216.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(43.0F, 71.37524F);
      ((Path)localObject2).cubicTo(40.38898F, 70.74798F, 37.94752F, 69.685074F, 35.756817F, 68.267685F);
      ((Path)localObject2).lineTo(33.071095F, 70.953415F);
      ((Path)localObject2).cubicTo(32.744633F, 71.280716F, 32.349525F, 71.44395F, 31.887455F, 71.44395F);
      ((Path)localObject2).cubicTo(31.425385F, 71.44395F, 31.03028F, 71.280716F, 30.703815F, 70.953415F);
      ((Path)localObject2).lineTo(25.968422F, 66.21802F);
      ((Path)localObject2).cubicTo(25.64112F, 65.891556F, 25.47789F, 65.49645F, 25.47789F, 65.03438F);
      ((Path)localObject2).cubicTo(25.47789F, 64.5723F, 25.64112F, 64.1772F, 25.968422F, 63.85074F);
      ((Path)localObject2).lineTo(28.676521F, 61.14264F);
      ((Path)localObject2).cubicTo(27.294926F, 58.977337F, 26.258167F, 56.570663F, 25.643635F, 54.0F);
      ((Path)localObject2).lineTo(21.67647F, 54.0F);
      ((Path)localObject2).cubicTo(21.213764F, 54.0F, 20.818117F, 53.8375F, 20.491205F, 53.511665F);
      ((Path)localObject2).cubicTo(20.163456F, 53.18667F, 20.0F, 52.793335F, 20.0F, 52.333332F);
      ((Path)localObject2).lineTo(20.0F, 45.666668F);
      ((Path)localObject2).cubicTo(20.0F, 45.206665F, 20.163456F, 44.81333F, 20.491205F, 44.488335F);
      ((Path)localObject2).cubicTo(20.818117F, 44.1625F, 21.213764F, 44.0F, 21.67647F, 44.0F);
      ((Path)localObject2).lineTo(25.432756F, 44.0F);
      ((Path)localObject2).cubicTo(25.968296F, 41.245472F, 26.984692F, 38.662666F, 28.391035F, 36.342514F);
      ((Path)localObject2).lineTo(25.513884F, 33.465363F);
      ((Path)localObject2).cubicTo(25.186583F, 33.137226F, 25.022514F, 32.742958F, 25.022514F, 32.279213F);
      ((Path)localObject2).cubicTo(25.022514F, 31.816303F, 25.186583F, 31.421198F, 25.513884F, 31.093899F);
      ((Path)localObject2).lineTo(30.256813F, 26.35097F);
      ((Path)localObject2).cubicTo(30.584112F, 26.02367F, 30.979218F, 25.8596F, 31.442125F, 25.8596F);
      ((Path)localObject2).cubicTo(31.905033F, 25.8596F, 32.30014F, 26.02367F, 32.628277F, 26.35097F);
      ((Path)localObject2).lineTo(35.322765F, 29.045517F);
      ((Path)localObject2).cubicTo(37.62329F, 27.483685F, 40.215202F, 26.318954F, 43.0F, 25.649855F);
      ((Path)localObject2).lineTo(43.0F, 21.67647F);
      ((Path)localObject2).cubicTo(43.0F, 21.213764F, 43.1625F, 20.818117F, 43.488335F, 20.491205F);
      ((Path)localObject2).cubicTo(43.81333F, 20.164293F, 44.206665F, 20.0F, 44.666668F, 20.0F);
      ((Path)localObject2).lineTo(51.333332F, 20.0F);
      ((Path)localObject2).cubicTo(51.793335F, 20.0F, 52.18667F, 20.164293F, 52.511665F, 20.491205F);
      ((Path)localObject2).cubicTo(52.8375F, 20.818117F, 53.0F, 21.213764F, 53.0F, 21.67647F);
      ((Path)localObject2).lineTo(53.0F, 25.427748F);
      ((Path)localObject2).cubicTo(55.947445F, 25.99736F, 58.698654F, 27.117449F, 61.14241F, 28.676748F);
      ((Path)localObject2).lineTo(63.85074F, 25.968422F);
      ((Path)localObject2).cubicTo(64.1772F, 25.64112F, 64.5723F, 25.47789F, 65.03438F, 25.47789F);
      ((Path)localObject2).cubicTo(65.49645F, 25.47789F, 65.891556F, 25.64112F, 66.21802F, 25.968422F);
      ((Path)localObject2).lineTo(70.953415F, 30.703815F);
      ((Path)localObject2).cubicTo(71.280716F, 31.031116F, 71.44395F, 31.425385F, 71.44395F, 31.887455F);
      ((Path)localObject2).cubicTo(71.44395F, 32.350365F, 71.280716F, 32.744633F, 70.953415F, 33.071095F);
      ((Path)localObject2).lineTo(68.26744F, 35.757065F);
      ((Path)localObject2).cubicTo(69.86432F, 38.225166F, 71.011284F, 41.011517F, 71.59228F, 44.0F);
      ((Path)localObject2).lineTo(75.32353F, 44.0F);
      ((Path)localObject2).cubicTo(75.78623F, 44.0F, 76.181885F, 44.1625F, 76.5088F, 44.488335F);
      ((Path)localObject2).cubicTo(76.83655F, 44.81333F, 77.0F, 45.206665F, 77.0F, 45.666668F);
      ((Path)localObject2).lineTo(77.0F, 52.333332F);
      ((Path)localObject2).cubicTo(77.0F, 52.793335F, 76.83655F, 53.18667F, 76.5088F, 53.511665F);
      ((Path)localObject2).cubicTo(76.181885F, 53.8375F, 75.78623F, 54.0F, 75.32353F, 54.0F);
      ((Path)localObject2).lineTo(71.38141F, 54.0F);
      ((Path)localObject2).cubicTo(70.71336F, 56.79468F, 69.546326F, 59.395546F, 67.9797F, 61.70317F);
      ((Path)localObject2).lineTo(70.57086F, 64.294395F);
      ((Path)localObject2).cubicTo(70.89816F, 64.62086F, 71.06223F, 65.0168F, 71.06223F, 65.479706F);
      ((Path)localObject2).cubicTo(71.06223F, 65.94262F, 70.89816F, 66.338554F, 70.57086F, 66.66502F);
      ((Path)localObject2).lineTo(65.827934F, 71.40795F);
      ((Path)localObject2).cubicTo(65.50063F, 71.736084F, 65.10553F, 71.89932F, 64.642624F, 71.89932F);
      ((Path)localObject2).cubicTo(64.17971F, 71.89932F, 63.78461F, 71.736084F, 63.45647F, 71.40795F);
      ((Path)localObject2).lineTo(60.682983F, 68.63446F);
      ((Path)localObject2).cubicTo(58.355732F, 70.045006F, 55.764164F, 71.0632F, 53.0F, 71.59731F);
      ((Path)localObject2).lineTo(53.0F, 75.32353F);
      ((Path)localObject2).cubicTo(53.0F, 75.78707F, 52.8375F, 76.181885F, 52.511665F, 76.5088F);
      ((Path)localObject2).cubicTo(52.18667F, 76.83655F, 51.793335F, 77.0F, 51.333332F, 77.0F);
      ((Path)localObject2).lineTo(44.666668F, 77.0F);
      ((Path)localObject2).cubicTo(44.206665F, 77.0F, 43.81333F, 76.83655F, 43.488335F, 76.5088F);
      ((Path)localObject2).cubicTo(43.1625F, 76.181885F, 43.0F, 75.78707F, 43.0F, 75.32353F);
      ((Path)localObject2).lineTo(43.0F, 71.37524F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(48.41505F, 30.0F);
      ((Path)localObject2).cubicTo(58.58648F, 30.0F, 66.83177F, 38.244457F, 66.83177F, 48.415886F);
      ((Path)localObject2).cubicTo(66.83177F, 58.58648F, 58.58648F, 66.83177F, 48.41505F, 66.83177F);
      ((Path)localObject2).cubicTo(38.245296F, 66.83177F, 30.0F, 58.58648F, 30.0F, 48.415886F);
      ((Path)localObject2).cubicTo(30.0F, 38.244457F, 38.245296F, 30.0F, 48.41505F, 30.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\cv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */