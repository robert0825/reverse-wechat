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

public final class qp
  extends c
{
  private final int height;
  private final int width;
  
  public qp()
  {
    GMTrace.i(16007611547648L, 119266);
    this.width = 108;
    this.height = 108;
    GMTrace.o(16007611547648L, 119266);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16007745765376L, 119267);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(16007745765376L, 119267);
      return 0;
      GMTrace.o(16007745765376L, 119267);
      return 108;
      GMTrace.o(16007745765376L, 119267);
      return 108;
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
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-499359);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 16.0F, 0.0F, 1.0F, 17.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(36.832836F, 23.632835F);
      ((Path)localObject2).lineTo(41.955223F, 12.99403F);
      ((Path)localObject2).cubicTo(42.54627F, 11.713433F, 42.54627F, 10.432836F, 42.05373F, 9.250747F);
      ((Path)localObject2).cubicTo(41.561195F, 8.068657F, 40.57612F, 7.1820893F, 39.197014F, 6.6895523F);
      ((Path)localObject2).lineTo(38.113434F, 6.295522F);
      ((Path)localObject2).cubicTo(37.620895F, 6.0985074F, 37.128357F, 6.0F, 36.635822F, 6.0F);
      ((Path)localObject2).cubicTo(34.46866F, 6.0F, 32.695522F, 7.477612F, 32.202984F, 9.644776F);
      ((Path)localObject2).lineTo(29.937313F, 21.170149F);
      ((Path)localObject2).cubicTo(29.34627F, 23.928358F, 30.232836F, 26.489552F, 31.808956F, 27.080597F);
      ((Path)localObject2).cubicTo(32.00597F, 27.179104F, 32.202984F, 27.179104F, 32.49851F, 27.179104F);
      ((Path)localObject2).cubicTo(33.97612F, 27.277613F, 35.749252F, 25.8F, 36.832836F, 23.632835F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(24.716417F, 31.119404F);
      ((Path)localObject2).cubicTo(24.913433F, 29.444777F, 22.844776F, 27.671642F, 20.086567F, 27.080597F);
      ((Path)localObject2).lineTo(11.614925F, 25.01194F);
      ((Path)localObject2).cubicTo(11.220896F, 24.913433F, 10.826866F, 24.913433F, 10.432836F, 24.913433F);
      ((Path)localObject2).cubicTo(8.167164F, 24.913433F, 6.295522F, 26.58806F, 6.0985074F, 28.853731F);
      ((Path)localObject2).lineTo(6.0F, 30.03582F);
      ((Path)localObject2).cubicTo(6.0F, 31.414925F, 6.4925375F, 32.695522F, 7.3791046F, 33.58209F);
      ((Path)localObject2).cubicTo(8.167164F, 34.370148F, 9.250747F, 34.76418F, 10.432836F, 34.76418F);
      ((Path)localObject2).cubicTo(10.531343F, 34.76418F, 10.62985F, 34.76418F, 10.728358F, 34.76418F);
      ((Path)localObject2).lineTo(19.397015F, 34.370148F);
      ((Path)localObject2).cubicTo(22.25373F, 34.074627F, 24.519403F, 32.695522F, 24.716417F, 31.119404F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(26.686567F, 39.689552F);
      ((Path)localObject2).cubicTo(25.01194F, 39.197014F, 22.74627F, 40.773136F, 21.662687F, 43.334328F);
      ((Path)localObject2).lineTo(13.38806F, 61.4597F);
      ((Path)localObject2).cubicTo(12.797015F, 62.7403F, 12.797015F, 64.0209F, 13.38806F, 65.20299F);
      ((Path)localObject2).cubicTo(13.979104F, 66.38507F, 14.964179F, 67.271645F, 16.343283F, 67.66567F);
      ((Path)localObject2).lineTo(17.426867F, 68.0597F);
      ((Path)localObject2).lineTo(17.525373F, 68.0597F);
      ((Path)localObject2).cubicTo(17.722387F, 68.0597F, 17.919403F, 68.0597F, 18.116419F, 68.0597F);
      ((Path)localObject2).cubicTo(20.480597F, 68.0597F, 23.140299F, 66.97612F, 23.731344F, 64.71045F);
      ((Path)localObject2).lineTo(28.558208F, 45.402985F);
      ((Path)localObject2).cubicTo(29.050747F, 42.743282F, 28.361195F, 40.18209F, 26.686567F, 39.689552F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(41.167164F, 41.856716F);
      ((Path)localObject2).cubicTo(39.886566F, 40.47761F, 38.21194F, 39.591045F, 36.832836F, 39.591045F);
      ((Path)localObject2).cubicTo(36.24179F, 39.591045F, 35.749252F, 39.78806F, 35.355225F, 40.083584F);
      ((Path)localObject2).cubicTo(34.074627F, 41.167164F, 34.27164F, 43.826866F, 35.94627F, 46.191044F);
      ((Path)localObject2).lineTo(51.608955F, 69.04478F);
      ((Path)localObject2).cubicTo(52.49552F, 70.42388F, 53.973133F, 71.113434F, 55.450745F, 71.113434F);
      ((Path)localObject2).cubicTo(56.53433F, 71.113434F, 57.617912F, 70.719406F, 58.50448F, 70.029854F);
      ((Path)localObject2).lineTo(59.391045F, 69.3403F);
      ((Path)localObject2).cubicTo(60.47463F, 68.45373F, 61.06567F, 67.271645F, 61.16418F, 65.89254F);
      ((Path)localObject2).cubicTo(61.262688F, 64.513435F, 60.77015F, 63.232838F, 59.883583F, 62.24776F);
      ((Path)localObject2).lineTo(41.167164F, 41.856716F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(71.90149F, 30.331343F);
      ((Path)localObject2).cubicTo(71.704475F, 27.474627F, 69.3403F, 25.40597F, 66.48358F, 25.8F);
      ((Path)localObject2).lineTo(43.23582F, 29.24776F);
      ((Path)localObject2).cubicTo(40.47761F, 29.64179F, 38.310448F, 31.316418F, 38.408955F, 33.089554F);
      ((Path)localObject2).cubicTo(38.50746F, 34.862686F, 40.773136F, 36.24179F, 43.629852F, 36.24179F);
      ((Path)localObject2).lineTo(66.58209F, 36.53731F);
      ((Path)localObject2).lineTo(66.680595F, 36.53731F);
      ((Path)localObject2).cubicTo(68.15821F, 36.53731F, 69.63582F, 35.847763F, 70.719406F, 34.76418F);
      ((Path)localObject2).cubicTo(71.60597F, 33.779106F, 72.0F, 32.597015F, 72.0F, 31.414925F);
      ((Path)localObject2).lineTo(71.90149F, 30.331343F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\qp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */