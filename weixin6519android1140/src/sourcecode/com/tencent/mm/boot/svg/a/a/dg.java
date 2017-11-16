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

public final class dg
  extends c
{
  private final int height;
  private final int width;
  
  public dg()
  {
    GMTrace.i(17579838013440L, 130980);
    this.width = 156;
    this.height = 67;
    GMTrace.o(17579838013440L, 130980);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17579972231168L, 130981);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17579972231168L, 130981);
      return 0;
      GMTrace.o(17579972231168L, 130981);
      return 156;
      GMTrace.o(17579972231168L, 130981);
      return 67;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      float[] arrayOfFloat = c.d(paramVarArgs);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject2 = c.h(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -353.0F, 0.0F, 1.0F, -150.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 353.0F, 0.0F, 1.0F, 150.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject1).setColor(-1);
      ((Paint)localObject1).setStrokeWidth(4.257F);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(2.1285F, 33.5F);
      ((Path)localObject2).cubicTo(2.1285F, 16.173998F, 16.173998F, 2.1285F, 33.5F, 2.1285F);
      ((Path)localObject2).lineTo(122.49999F, 2.1285F);
      ((Path)localObject2).cubicTo(139.82599F, 2.1285F, 153.87149F, 16.173998F, 153.87149F, 33.5F);
      ((Path)localObject2).lineTo(153.87149F, 33.5F);
      ((Path)localObject2).cubicTo(153.87149F, 50.826004F, 139.82599F, 64.8715F, 122.49999F, 64.8715F);
      ((Path)localObject2).lineTo(33.5F, 64.8715F);
      ((Path)localObject2).cubicTo(16.173998F, 64.8715F, 2.1285F, 50.826004F, 2.1285F, 33.5F);
      ((Path)localObject2).lineTo(2.1285F, 33.5F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(45.341103F, 26.941479F);
      ((Path)localObject1).lineTo(52.543945F, 26.941479F);
      ((Path)localObject1).lineTo(52.543945F, 16.137213F);
      ((Path)localObject1).lineTo(42.314373F, 16.137213F);
      ((Path)localObject1).lineTo(42.314373F, 18.550932F);
      ((Path)localObject1).lineTo(49.862038F, 18.550932F);
      ((Path)localObject1).lineTo(49.862038F, 24.52776F);
      ((Path)localObject1).lineTo(42.88907F, 24.52776F);
      ((Path)localObject1).lineTo(41.892933F, 35.561905F);
      ((Path)localObject1).lineTo(50.245167F, 35.561905F);
      ((Path)localObject1).cubicTo(50.245167F, 40.159462F, 50.0536F, 43.224503F, 49.67047F, 44.680397F);
      ((Path)localObject1).cubicTo(49.325653F, 46.059666F, 48.02301F, 46.787613F, 45.762547F, 46.787613F);
      ((Path)localObject1).cubicTo(44.804718F, 46.787613F, 43.88521F, 46.710987F, 42.965694F, 46.63436F);
      ((Path)localObject1).lineTo(43.65533F, 49.201332F);
      ((Path)localObject1).cubicTo(44.57484F, 49.277958F, 45.494354F, 49.354584F, 46.375553F, 49.354584F);
      ((Path)localObject1).cubicTo(49.785408F, 49.201332F, 51.739372F, 48.05194F, 52.237442F, 45.82979F);
      ((Path)localObject1).cubicTo(52.62057F, 43.837513F, 52.85045F, 39.584766F, 52.85045F, 33.148186F);
      ((Path)localObject1).lineTo(44.68978F, 33.148186F);
      ((Path)localObject1).lineTo(45.341103F, 26.941479F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(55.838863F, 20.734772F);
      ((Path)localObject1).lineTo(66.987946F, 20.734772F);
      ((Path)localObject1).cubicTo(68.13734F, 18.66587F, 69.09516F, 16.520342F, 69.93805F, 14.259875F);
      ((Path)localObject1).lineTo(72.58164F, 15.179387F);
      ((Path)localObject1).cubicTo(71.73876F, 17.24829F, 70.78094F, 19.125626F, 69.70817F, 20.734772F);
      ((Path)localObject1).lineTo(74.68886F, 20.734772F);
      ((Path)localObject1).lineTo(74.68886F, 36.098286F);
      ((Path)localObject1).lineTo(66.52819F, 36.098286F);
      ((Path)localObject1).lineTo(66.52819F, 39.814648F);
      ((Path)localObject1).lineTo(76.37463F, 39.814648F);
      ((Path)localObject1).lineTo(76.37463F, 42.38162F);
      ((Path)localObject1).lineTo(66.52819F, 42.38162F);
      ((Path)localObject1).lineTo(66.52819F, 49.737713F);
      ((Path)localObject1).lineTo(63.84628F, 49.737713F);
      ((Path)localObject1).lineTo(63.84628F, 42.38162F);
      ((Path)localObject1).lineTo(54.15309F, 42.38162F);
      ((Path)localObject1).lineTo(54.15309F, 39.814648F);
      ((Path)localObject1).lineTo(63.84628F, 39.814648F);
      ((Path)localObject1).lineTo(63.84628F, 36.098286F);
      ((Path)localObject1).lineTo(55.838863F, 36.098286F);
      ((Path)localObject1).lineTo(55.838863F, 20.734772F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(72.19852F, 33.761192F);
      ((Path)localObject1).lineTo(72.19852F, 29.623388F);
      ((Path)localObject1).lineTo(66.52819F, 29.623388F);
      ((Path)localObject1).lineTo(66.52819F, 33.761192F);
      ((Path)localObject1).lineTo(72.19852F, 33.761192F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(63.84628F, 33.761192F);
      ((Path)localObject1).lineTo(63.84628F, 29.623388F);
      ((Path)localObject1).lineTo(58.290897F, 29.623388F);
      ((Path)localObject1).lineTo(58.290897F, 33.761192F);
      ((Path)localObject1).lineTo(63.84628F, 33.761192F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(58.290897F, 27.324608F);
      ((Path)localObject1).lineTo(63.84628F, 27.324608F);
      ((Path)localObject1).lineTo(63.84628F, 23.071865F);
      ((Path)localObject1).lineTo(58.290897F, 23.071865F);
      ((Path)localObject1).lineTo(58.290897F, 27.324608F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(66.52819F, 23.071865F);
      ((Path)localObject1).lineTo(66.52819F, 27.324608F);
      ((Path)localObject1).lineTo(72.19852F, 27.324608F);
      ((Path)localObject1).lineTo(72.19852F, 23.071865F);
      ((Path)localObject1).lineTo(66.52819F, 23.071865F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(60.3598F, 14.489753F);
      ((Path)localObject1).cubicTo(61.50919F, 16.060587F, 62.505325F, 17.746359F, 63.348213F, 19.508757F);
      ((Path)localObject1).lineTo(60.972805F, 20.543207F);
      ((Path)localObject1).cubicTo(60.053295F, 18.550932F, 58.98053F, 16.826847F, 57.83114F, 15.294326F);
      ((Path)localObject1).lineTo(60.3598F, 14.489753F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(95.952576F, 37.515865F);
      ((Path)localObject1).lineTo(98.55786F, 37.515865F);
      ((Path)localObject1).lineTo(98.55786F, 40.197777F);
      ((Path)localObject1).lineTo(107.408165F, 40.197777F);
      ((Path)localObject1).cubicTo(105.33926F, 38.97176F, 103.73012F, 37.669117F, 102.58073F, 36.213223F);
      ((Path)localObject1).lineTo(92.65765F, 36.213223F);
      ((Path)localObject1).cubicTo(91.3167F, 37.669117F, 89.63093F, 39.010075F, 87.60034F, 40.197777F);
      ((Path)localObject1).lineTo(95.952576F, 40.197777F);
      ((Path)localObject1).lineTo(95.952576F, 37.515865F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(95.952576F, 42.304993F);
      ((Path)localObject1).lineTo(88.71142F, 42.304993F);
      ((Path)localObject1).lineTo(88.71142F, 48.703262F);
      ((Path)localObject1).lineTo(86.10613F, 48.703262F);
      ((Path)localObject1).lineTo(86.10613F, 41.00235F);
      ((Path)localObject1).cubicTo(84.49699F, 41.806923F, 82.7729F, 42.53487F, 80.933876F, 43.18619F);
      ((Path)localObject1).lineTo(79.74618F, 40.88741F);
      ((Path)localObject1).cubicTo(83.88398F, 39.584766F, 87.10227F, 38.05225F, 89.36274F, 36.213223F);
      ((Path)localObject1).lineTo(80.704F, 36.213223F);
      ((Path)localObject1).lineTo(80.704F, 33.914444F);
      ((Path)localObject1).lineTo(91.58489F, 33.914444F);
      ((Path)localObject1).cubicTo(92.04465F, 33.263123F, 92.42778F, 32.6118F, 92.73428F, 31.922169F);
      ((Path)localObject1).lineTo(84.918434F, 31.922169F);
      ((Path)localObject1).lineTo(84.918434F, 21.769222F);
      ((Path)localObject1).lineTo(89.36274F, 21.769222F);
      ((Path)localObject1).lineTo(89.36274F, 19.317192F);
      ((Path)localObject1).lineTo(80.24425F, 19.317192F);
      ((Path)localObject1).lineTo(80.24425F, 17.056725F);
      ((Path)localObject1).lineTo(89.36274F, 17.056725F);
      ((Path)localObject1).lineTo(89.36274F, 14.489753F);
      ((Path)localObject1).lineTo(92.00633F, 14.489753F);
      ((Path)localObject1).lineTo(92.00633F, 17.056725F);
      ((Path)localObject1).lineTo(102.38916F, 17.056725F);
      ((Path)localObject1).lineTo(102.38916F, 14.489753F);
      ((Path)localObject1).lineTo(105.03275F, 14.489753F);
      ((Path)localObject1).lineTo(105.03275F, 17.056725F);
      ((Path)localObject1).lineTo(114.15125F, 17.056725F);
      ((Path)localObject1).lineTo(114.15125F, 19.317192F);
      ((Path)localObject1).lineTo(105.03275F, 19.317192F);
      ((Path)localObject1).lineTo(105.03275F, 21.769222F);
      ((Path)localObject1).lineTo(109.477066F, 21.769222F);
      ((Path)localObject1).lineTo(109.477066F, 31.922169F);
      ((Path)localObject1).lineTo(95.301254F, 31.922169F);
      ((Path)localObject1).cubicTo(95.033066F, 32.6118F, 94.72656F, 33.263123F, 94.34343F, 33.914444F);
      ((Path)localObject1).lineTo(113.65318F, 33.914444F);
      ((Path)localObject1).lineTo(113.65318F, 36.213223F);
      ((Path)localObject1).lineTo(105.37757F, 36.213223F);
      ((Path)localObject1).cubicTo(107.48479F, 38.09056F, 110.62646F, 39.584766F, 114.76426F, 40.65753F);
      ((Path)localObject1).lineTo(113.65318F, 42.956314F);
      ((Path)localObject1).cubicTo(111.890785F, 42.343304F, 110.35826F, 41.730297F, 109.05562F, 41.078976F);
      ((Path)localObject1).lineTo(109.05562F, 45.714848F);
      ((Path)localObject1).cubicTo(109.05562F, 47.707123F, 107.94454F, 48.741573F, 105.72239F, 48.741573F);
      ((Path)localObject1).lineTo(102.8106F, 48.741573F);
      ((Path)localObject1).lineTo(102.23591F, 46.442795F);
      ((Path)localObject1).lineTo(104.95613F, 46.51942F);
      ((Path)localObject1).cubicTo(105.95227F, 46.51942F, 106.45034F, 46.059666F, 106.45034F, 45.140152F);
      ((Path)localObject1).lineTo(106.45034F, 42.304993F);
      ((Path)localObject1).lineTo(98.55786F, 42.304993F);
      ((Path)localObject1).lineTo(98.55786F, 49.661087F);
      ((Path)localObject1).lineTo(95.952576F, 49.661087F);
      ((Path)localObject1).lineTo(95.952576F, 42.304993F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(102.38916F, 19.317192F);
      ((Path)localObject1).lineTo(92.00633F, 19.317192F);
      ((Path)localObject1).lineTo(92.00633F, 21.769222F);
      ((Path)localObject1).lineTo(102.38916F, 21.769222F);
      ((Path)localObject1).lineTo(102.38916F, 19.317192F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(106.87178F, 30.006517F);
      ((Path)localObject1).lineTo(106.87178F, 27.707739F);
      ((Path)localObject1).lineTo(87.52371F, 27.707739F);
      ((Path)localObject1).lineTo(87.52371F, 30.006517F);
      ((Path)localObject1).lineTo(106.87178F, 30.006517F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(87.52371F, 25.907026F);
      ((Path)localObject1).lineTo(106.87178F, 25.907026F);
      ((Path)localObject1).lineTo(106.87178F, 23.7615F);
      ((Path)localObject1).lineTo(87.52371F, 23.7615F);
      ((Path)localObject1).lineTo(87.52371F, 25.907026F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\dg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */