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

public final class aai
  extends c
{
  private final int height;
  private final int width;
  
  public aai()
  {
    GMTrace.i(15768032903168L, 117481);
    this.width = 73;
    this.height = 73;
    GMTrace.o(15768032903168L, 117481);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15768167120896L, 117482);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15768167120896L, 117482);
      return 0;
      GMTrace.o(15768167120896L, 117482);
      return 73;
      GMTrace.o(15768167120896L, 117482);
      return 73;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject = c.e(paramVarArgs);
      float[] arrayOfFloat = c.d(paramVarArgs);
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
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 10.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      Paint localPaint3 = c.a(localPaint1, paramVarArgs);
      localPaint3.setColor(-1);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(38.0109F, 48.0F);
      localPath.lineTo(11.027271F, 48.0F);
      localPath.lineTo(11.025387F, 45.0F);
      localPath.lineTo(38.0F, 45.0F);
      localPath.lineTo(38.0F, 47.72576F);
      localPath.cubicTo(38.0F, 47.81738F, 38.00368F, 47.908848F, 38.0109F, 48.0F);
      localPath.close();
      localPath.moveTo(42.0F, 26.2F);
      localPath.lineTo(42.0F, 3.2803428F);
      localPath.cubicTo(42.0F, 1.4627535F, 40.532845F, 0.0F, 38.723015F, 0.0F);
      localPath.lineTo(10.276984F, 0.0F);
      localPath.cubicTo(8.459347F, 0.0F, 7.0F, 1.4686595F, 7.0F, 3.2803428F);
      localPath.lineTo(7.0F, 25.384615F);
      localPath.lineTo(7.7698135F, 25.503048F);
      localPath.cubicTo(8.660358F, 25.640055F, 9.441465F, 26.10954F, 10.0F, 26.76999F);
      localPath.lineTo(10.0F, 3.0F);
      localPath.lineTo(39.0F, 3.0F);
      localPath.lineTo(39.0F, 27.69727F);
      localPath.cubicTo(39.574238F, 27.026283F, 40.350243F, 26.529951F, 41.205326F, 26.358934F);
      localPath.lineTo(42.0F, 26.2F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, localPaint3);
      localCanvas.restore();
      localCanvas.save();
      localPaint3 = c.a(localPaint2, paramVarArgs);
      localPaint3.setColor(-1);
      localPaint3.setStrokeWidth(3.0F);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(8.0F, 20.0F);
      localPath.cubicTo(8.0F, 20.0F, 0.64974487F, 23.407583F, -8.881784E-14F, 24.0F);
      localPath.cubicTo(4.5895785E-13F, 25.344828F, -6.8270754E-14F, 49.992012F, -6.8270754E-14F, 49.992012F);
      localPath.cubicTo(-7.9618597E-14F, 50.54871F, 0.45007995F, 51.0F, 0.9926417F, 51.0F);
      localPath.lineTo(6.0F, 51.0F);
      localPath.cubicTo(9.251935F, 51.0F, 12.15733F, 42.483112F, 12.0F, 38.0F);
      localPath.cubicTo(12.904676F, 38.0F, 16.089167F, 36.990547F, 18.0F, 35.0F);
      localPath.cubicTo(19.561045F, 33.17274F, 20.349682F, 30.5F, 20.0F, 29.0F);
      localPath.cubicTo(19.357014F, 26.5F, 12.872799F, 27.450745F, 10.0F, 27.0F);
      localPath.cubicTo(7.2419853F, 27.450745F, 7.727435F, 22.480711F, 8.0F, 20.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint3);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramVarArgs);
      localPaint2.setColor(-1);
      localPaint2.setStrokeWidth(3.0F);
      arrayOfFloat = c.a(arrayOfFloat, -1.0F, 0.0F, 78.147736F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(37.0F, 20.0F);
      ((Path)localObject).cubicTo(37.0F, 20.0F, 29.654545F, 23.407583F, 29.0F, 24.0F);
      ((Path)localObject).cubicTo(29.0F, 25.344828F, 29.0F, 49.992012F, 29.0F, 49.992012F);
      ((Path)localObject).cubicTo(29.0F, 50.54871F, 29.452644F, 51.0F, 29.997412F, 51.0F);
      ((Path)localObject).lineTo(35.0F, 51.0F);
      ((Path)localObject).cubicTo(38.32028F, 51.0F, 41.24713F, 42.483112F, 41.0F, 38.0F);
      ((Path)localObject).cubicTo(42.0F, 38.0F, 45.208015F, 36.990547F, 47.0F, 35.0F);
      ((Path)localObject).cubicTo(48.705536F, 33.17274F, 49.5F, 30.5F, 49.0F, 28.5F);
      ((Path)localObject).cubicTo(48.5F, 26.5F, 41.967888F, 27.450745F, 39.0F, 27.0F);
      ((Path)localObject).cubicTo(36.29548F, 27.450745F, 36.784515F, 22.480711F, 37.0F, 20.0F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(9.0F, 15.403345F);
      ((Path)localObject).cubicTo(13.294594F, 17.93784F, 18.527863F, 19.69076F, 24.174742F, 19.69076F);
      ((Path)localObject).cubicTo(30.208483F, 19.69076F, 35.769997F, 17.689432F, 40.21875F, 14.871748F);
      ((Path)localObject).lineTo(39.116177F, 14.871748F);
      ((Path)localObject).lineTo(39.116177F, 12.13036F);
      ((Path)localObject).cubicTo(34.953056F, 14.432558F, 29.780018F, 16.019415F, 24.174742F, 16.019415F);
      ((Path)localObject).cubicTo(18.464275F, 16.019415F, 13.202425F, 14.372441F, 9.0F, 12.0F);
      ((Path)localObject).lineTo(9.0F, 15.403345F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\aai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */