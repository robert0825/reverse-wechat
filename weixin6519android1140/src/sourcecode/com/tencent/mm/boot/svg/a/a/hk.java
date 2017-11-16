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

public final class hk
  extends c
{
  private final int height;
  private final int width;
  
  public hk()
  {
    GMTrace.i(15944663433216L, 118797);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15944663433216L, 118797);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15944797650944L, 118798);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15944797650944L, 118798);
      return 0;
      GMTrace.o(15944797650944L, 118798);
      return 96;
      GMTrace.o(15944797650944L, 118798);
      return 96;
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
      c.a((Paint)localObject2, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -340.0F, 0.0F, 1.0F, -201.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 349.0F, 0.0F, 1.0F, 210.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject2).setColor(-13783042);
      Object localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(50.80595F, 0.0F);
      ((Path)localObject3).cubicTo(58.6365F, 0.0F, 62.5508F, 0.0F, 66.76605F, 1.3325F);
      ((Path)localObject3).cubicTo(71.36805F, 3.00755F, 74.99245F, 6.63195F, 76.6675F, 11.23395F);
      ((Path)localObject3).cubicTo(78.0F, 15.44855F, 78.0F, 19.36415F, 78.0F, 27.19405F);
      ((Path)localObject3).lineTo(78.0F, 50.80595F);
      ((Path)localObject3).cubicTo(78.0F, 58.6365F, 78.0F, 62.5508F, 76.6675F, 66.76605F);
      ((Path)localObject3).cubicTo(74.99245F, 71.36805F, 71.36805F, 74.99245F, 66.76605F, 76.66685F);
      ((Path)localObject3).cubicTo(62.5508F, 78.0F, 58.6365F, 78.0F, 50.80595F, 78.0F);
      ((Path)localObject3).lineTo(27.19405F, 78.0F);
      ((Path)localObject3).cubicTo(19.3635F, 78.0F, 15.44855F, 78.0F, 11.23395F, 76.66685F);
      ((Path)localObject3).cubicTo(6.63195F, 74.99245F, 3.00755F, 71.36805F, 1.3325F, 66.76605F);
      ((Path)localObject3).cubicTo(0.0F, 62.5508F, 0.0F, 58.6365F, 0.0F, 50.80595F);
      ((Path)localObject3).lineTo(0.0F, 27.19405F);
      ((Path)localObject3).cubicTo(0.0F, 19.36415F, 0.0F, 15.44855F, 1.3325F, 11.23395F);
      ((Path)localObject3).cubicTo(3.00755F, 6.63195F, 6.63195F, 3.00755F, 11.23395F, 1.3325F);
      ((Path)localObject3).cubicTo(15.44855F, 0.0F, 19.3635F, 0.0F, 27.19405F, 0.0F);
      ((Path)localObject3).lineTo(50.80595F, 0.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localObject3 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject3).setColor(-201326593);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(77.15287F, 65.0F);
      ((Path)localObject2).cubicTo(77.0148F, 65.59051F, 76.85423F, 66.17532F, 76.6675F, 66.76605F);
      ((Path)localObject2).cubicTo(74.99245F, 71.36805F, 71.36805F, 74.99245F, 66.76605F, 76.66685F);
      ((Path)localObject2).cubicTo(62.5508F, 78.0F, 58.6365F, 78.0F, 50.80595F, 78.0F);
      ((Path)localObject2).lineTo(27.19405F, 78.0F);
      ((Path)localObject2).cubicTo(19.3635F, 78.0F, 15.44855F, 78.0F, 11.23395F, 76.66685F);
      ((Path)localObject2).cubicTo(6.63195F, 74.99245F, 3.00755F, 71.36805F, 1.3325F, 66.76605F);
      ((Path)localObject2).cubicTo(1.1457635F, 66.17532F, 0.9851963F, 65.59051F, 0.84713095F, 65.0F);
      ((Path)localObject2).lineTo(33.0F, 65.0F);
      ((Path)localObject2).cubicTo(35.795135F, 64.88961F, 38.52101F, 67.3264F, 39.0F, 70.0F);
      ((Path)localObject2).cubicTo(39.478985F, 67.3264F, 42.204865F, 64.88961F, 46.0F, 65.0F);
      ((Path)localObject2).lineTo(77.15287F, 65.0F);
      ((Path)localObject2).close();
      localCanvas.saveLayerAlpha(null, 230, 4);
      localObject3 = c.a((Paint)localObject3, paramVarArgs);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject2).setColor(-13783042);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(50.80595F, 0.0F);
      ((Path)localObject3).cubicTo(58.6365F, 0.0F, 62.5508F, 0.0F, 66.76605F, 1.3325F);
      ((Path)localObject3).cubicTo(71.36805F, 3.00755F, 74.99245F, 6.63195F, 76.6675F, 11.23395F);
      ((Path)localObject3).cubicTo(78.0F, 15.44855F, 78.0F, 19.36415F, 78.0F, 27.19405F);
      ((Path)localObject3).lineTo(78.0F, 50.80595F);
      ((Path)localObject3).cubicTo(78.0F, 58.6365F, 78.0F, 62.5508F, 76.6675F, 66.76605F);
      ((Path)localObject3).cubicTo(74.99245F, 71.36805F, 71.36805F, 74.99245F, 66.76605F, 76.66685F);
      ((Path)localObject3).cubicTo(62.5508F, 78.0F, 58.6365F, 78.0F, 50.80595F, 78.0F);
      ((Path)localObject3).lineTo(27.19405F, 78.0F);
      ((Path)localObject3).cubicTo(19.3635F, 78.0F, 15.44855F, 78.0F, 11.23395F, 76.66685F);
      ((Path)localObject3).cubicTo(6.63195F, 74.99245F, 3.00755F, 71.36805F, 1.3325F, 66.76605F);
      ((Path)localObject3).cubicTo(0.0F, 62.5508F, 0.0F, 58.6365F, 0.0F, 50.80595F);
      ((Path)localObject3).lineTo(0.0F, 27.19405F);
      ((Path)localObject3).cubicTo(0.0F, 19.36415F, 0.0F, 15.44855F, 1.3325F, 11.23395F);
      ((Path)localObject3).cubicTo(3.00755F, 6.63195F, 6.63195F, 3.00755F, 11.23395F, 1.3325F);
      ((Path)localObject3).cubicTo(15.44855F, 0.0F, 19.3635F, 0.0F, 27.19405F, 0.0F);
      ((Path)localObject3).lineTo(50.80595F, 0.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(50.503235F, 1.0F);
      ((Path)localObject3).cubicTo(58.133F, 1.0F, 61.946934F, 1.0F, 66.0541F, 2.2983334F);
      ((Path)localObject3).cubicTo(70.5381F, 3.9304333F, 74.069565F, 7.4619F, 75.70167F, 11.9459F);
      ((Path)localObject3).cubicTo(77.0F, 16.052433F, 77.0F, 19.867634F, 77.0F, 27.496767F);
      ((Path)localObject3).lineTo(77.0F, 50.503235F);
      ((Path)localObject3).cubicTo(77.0F, 58.133F, 77.0F, 61.946934F, 75.70167F, 66.0541F);
      ((Path)localObject3).cubicTo(74.069565F, 70.5381F, 70.5381F, 74.069565F, 66.0541F, 75.701035F);
      ((Path)localObject3).cubicTo(61.946934F, 77.0F, 58.133F, 77.0F, 50.503235F, 77.0F);
      ((Path)localObject3).lineTo(27.496767F, 77.0F);
      ((Path)localObject3).cubicTo(19.867F, 77.0F, 16.052433F, 77.0F, 11.9459F, 75.701035F);
      ((Path)localObject3).cubicTo(7.4619F, 74.069565F, 3.9304333F, 70.5381F, 2.2983334F, 66.0541F);
      ((Path)localObject3).cubicTo(1.0F, 61.946934F, 1.0F, 58.133F, 1.0F, 50.503235F);
      ((Path)localObject3).lineTo(1.0F, 27.496767F);
      ((Path)localObject3).cubicTo(1.0F, 19.867634F, 1.0F, 16.052433F, 2.2983334F, 11.9459F);
      ((Path)localObject3).cubicTo(3.9304333F, 7.4619F, 7.4619F, 3.9304333F, 11.9459F, 2.2983334F);
      ((Path)localObject3).cubicTo(16.052433F, 1.0F, 19.867F, 1.0F, 27.496767F, 1.0F);
      ((Path)localObject3).lineTo(50.503235F, 1.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      arrayOfFloat = c.a(arrayOfFloat, -1.0F, 0.0F, 125.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(72.0F, 52.056374F);
      ((Path)localObject1).cubicTo(72.0F, 47.607002F, 67.74677F, 44.0F, 62.5F, 44.0F);
      ((Path)localObject1).cubicTo(57.253307F, 44.0F, 53.0F, 47.607002F, 53.0F, 52.056374F);
      ((Path)localObject1).cubicTo(53.0F, 56.505817F, 57.253307F, 60.11282F, 62.5F, 60.11282F);
      ((Path)localObject1).cubicTo(63.92956F, 60.11282F, 65.28509F, 59.844482F, 66.501205F, 59.364857F);
      ((Path)localObject1).cubicTo(67.81153F, 60.11975F, 69.11952F, 60.876648F, 69.286606F, 60.985985F);
      ((Path)localObject1).cubicTo(69.28684F, 60.984447F, 69.288086F, 60.982292F, 69.28879F, 60.98052F);
      ((Path)localObject1).cubicTo(69.31669F, 60.992764F, 69.34739F, 61.0F, 69.37989F, 61.0F);
      ((Path)localObject1).cubicTo(69.503876F, 61.0F, 69.60433F, 60.900673F, 69.60433F, 60.778244F);
      ((Path)localObject1).cubicTo(69.60433F, 60.755222F, 69.59981F, 60.73343F, 69.593185F, 60.712486F);
      ((Path)localObject1).cubicTo(69.600044F, 60.70748F, 69.60433F, 60.704327F, 69.60433F, 60.704327F);
      ((Path)localObject1).lineTo(68.72402F, 58.14304F);
      ((Path)localObject1).cubicTo(70.730896F, 56.665897F, 72.0F, 54.486835F, 72.0F, 52.056374F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(65.499954F, 51.0F);
      ((Path)localObject1).cubicTo(64.671585F, 51.0F, 64.0F, 50.32839F, 64.0F, 49.499954F);
      ((Path)localObject1).cubicTo(64.0F, 48.67161F, 64.671585F, 48.0F, 65.499954F, 48.0F);
      ((Path)localObject1).cubicTo(66.328415F, 48.0F, 67.0F, 48.67161F, 67.0F, 49.499954F);
      ((Path)localObject1).cubicTo(67.0F, 50.32839F, 66.328415F, 51.0F, 65.499954F, 51.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(59.500046F, 51.0F);
      ((Path)localObject1).cubicTo(58.671566F, 51.0F, 58.0F, 50.32839F, 58.0F, 49.499954F);
      ((Path)localObject1).cubicTo(58.0F, 48.67161F, 58.671566F, 48.0F, 59.500046F, 48.0F);
      ((Path)localObject1).cubicTo(60.328434F, 48.0F, 61.0F, 48.67161F, 61.0F, 49.499954F);
      ((Path)localObject1).cubicTo(61.0F, 50.32839F, 60.328434F, 51.0F, 59.500046F, 51.0F);
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\hk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */