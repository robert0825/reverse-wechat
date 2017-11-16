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
import com.tencent.mm.svg.c;

public final class ki
  extends c
{
  private final int height;
  private final int width;
  
  public ki()
  {
    GMTrace.i(17575006175232L, 130944);
    this.width = 62;
    this.height = 62;
    GMTrace.o(17575006175232L, 130944);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17575140392960L, 130945);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17575140392960L, 130945);
      return 0;
      GMTrace.o(17575140392960L, 130945);
      return 62;
      GMTrace.o(17575140392960L, 130945);
      return 62;
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
      localPaint1 = c.a(localPaint2, paramVarArgs);
      localPaint1.setStrokeWidth(1.0F);
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setStrokeWidth(3.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 11.0F, 0.0F, 1.0F, 9.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-11711155);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(11.007507F, 11.458933F);
      ((Path)localObject2).cubicTo(12.887484F, 9.4437065F, 15.622662F, 7.9247327F, 18.017488F, 7.3999724F);
      ((Path)localObject2).lineTo(20.244202F, 6.9120493F);
      ((Path)localObject2).lineTo(18.915043F, 5.060115F);
      ((Path)localObject2).cubicTo(18.642044F, 4.679744F, 18.492981F, 4.2231226F, 18.492981F, 3.7391305F);
      ((Path)localObject2).cubicTo(18.492981F, 2.4983008F, 19.479156F, 1.5F, 20.686369F, 1.5F);
      ((Path)localObject2).cubicTo(21.893581F, 1.5F, 22.879757F, 2.4983008F, 22.879757F, 3.7391305F);
      ((Path)localObject2).cubicTo(22.879757F, 4.2231226F, 22.730694F, 4.679744F, 22.457695F, 5.060115F);
      ((Path)localObject2).lineTo(21.128536F, 6.9120493F);
      ((Path)localObject2).lineTo(23.355251F, 7.3999724F);
      ((Path)localObject2).cubicTo(29.377106F, 8.719497F, 33.48841F, 13.843313F, 33.95838F, 24.302568F);
      ((Path)localObject2).cubicTo(33.769905F, 28.412003F, 34.089592F, 31.934727F, 34.821133F, 34.91406F);
      ((Path)localObject2).lineTo(28.334389F, 28.619492F);
      ((Path)localObject2).cubicTo(28.294184F, 28.580555F, 28.294184F, 28.580555F, 28.10701F, 28.399086F);
      ((Path)localObject2).cubicTo(27.850748F, 28.150501F, 27.707758F, 28.011713F, 27.466179F, 27.777033F);
      ((Path)localObject2).cubicTo(26.775806F, 27.106375F, 26.006472F, 26.357574F, 25.177935F, 25.549345F);
      ((Path)localObject2).cubicTo(22.810862F, 23.240292F, 20.44387F, 20.917908F, 18.235228F, 18.732124F);
      ((Path)localObject2).cubicTo(18.06544F, 18.564066F, 18.06544F, 18.564066F, 17.895714F, 18.39596F);
      ((Path)localObject2).cubicTo(15.029206F, 15.556324F, 12.680043F, 13.193508F, 11.007507F, 11.458933F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-11711155);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(1.5F, 42.5F);
      ((Path)localObject2).lineTo(1.5F, 41.82444F);
      ((Path)localObject2).cubicTo(1.6038995F, 41.74702F, 1.7123853F, 41.662033F, 1.8249147F, 41.56911F);
      ((Path)localObject2).cubicTo(2.5979338F, 40.930805F, 3.3558638F, 40.07715F, 4.0502887F, 38.98194F);
      ((Path)localObject2).cubicTo(6.195145F, 35.59919F, 7.3330913F, 30.618256F, 7.0150514F, 23.757542F);
      ((Path)localObject2).cubicTo(7.107518F, 21.681265F, 7.2452464F, 20.08475F, 7.466496F, 18.886692F);
      ((Path)localObject2).cubicTo(14.1708975F, 26.23253F, 20.274372F, 32.6139F, 25.684317F, 38.023556F);
      ((Path)localObject2).cubicTo(27.371628F, 39.710777F, 28.891684F, 41.203136F, 30.23632F, 42.5F);
      ((Path)localObject2).lineTo(1.5F, 42.5F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-11776948);
      localPaint1.setStrokeCap(Paint.Cap.ROUND);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(5.3454547F, 6.3454547F);
      ((Path)localObject1).lineTo(42.115005F, 43.115005F);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ki.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */