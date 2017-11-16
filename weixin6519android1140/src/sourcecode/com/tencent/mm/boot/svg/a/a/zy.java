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

public final class zy
  extends c
{
  private final int height;
  private final int width;
  
  public zy()
  {
    GMTrace.i(21024938655744L, 156648);
    this.width = 36;
    this.height = 36;
    GMTrace.o(21024938655744L, 156648);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(21025072873472L, 156649);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(21025072873472L, 156649);
      return 0;
      GMTrace.o(21025072873472L, 156649);
      return 36;
      GMTrace.o(21025072873472L, 156649);
      return 36;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject3 = c.d(paramVarArgs);
      Object localObject2 = c.h(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      localObject2 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-15028967);
      ((Paint)localObject2).setStrokeWidth(2.0F);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 3.0F, 0.0F, 1.0F, 3.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint = c.a((Paint)localObject2, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(2.0306435F, 11.052016F);
      localPath.cubicTo(0.7812371F, 9.886849F, 0.0F, 8.226148F, 0.0F, 6.382979F);
      localPath.cubicTo(0.0F, 2.8577569F, 2.8577569F, 0.0F, 6.382979F, 0.0F);
      localPath.cubicTo(8.40088F, 0.0F, 10.200077F, 0.93637973F, 11.3697605F, 2.3983283F);
      localPath.cubicTo(7.022729F, 3.5833154F, 3.5322874F, 6.84528F, 2.0306435F, 11.052016F);
      localPath.close();
      localPath.moveTo(18.629875F, 2.3987827F);
      localPath.cubicTo(19.799551F, 0.9365738F, 21.598911F, 0.0F, 23.617022F, 0.0F);
      localPath.cubicTo(27.142242F, 0.0F, 30.0F, 2.8577569F, 30.0F, 6.382979F);
      localPath.cubicTo(30.0F, 8.226897F, 29.218128F, 9.8882F, 27.967833F, 11.053436F);
      localPath.cubicTo(26.46666F, 6.8465524F, 22.976622F, 3.5842826F, 18.629875F, 2.3987827F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject2, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(15.0F, 1.9148932F);
      localPath.cubicTo(22.226706F, 1.9148932F, 28.085106F, 7.7732944F, 28.085106F, 15.0F);
      localPath.cubicTo(28.085106F, 22.226706F, 22.226706F, 28.085106F, 15.0F, 28.085106F);
      localPath.cubicTo(7.7732944F, 28.085106F, 1.9148932F, 22.226706F, 1.9148932F, 15.0F);
      localPath.cubicTo(1.9148932F, 7.7732944F, 7.7732944F, 1.9148932F, 15.0F, 1.9148932F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject2, paramVarArgs);
      localPaint.setStrokeCap(Paint.Cap.SQUARE);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(23.0F, 26.0F);
      localPath.lineTo(26.19149F, 29.19149F);
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject2, paramVarArgs);
      localPaint.setStrokeCap(Paint.Cap.SQUARE);
      localObject3 = c.a((float[])localObject3, -1.0F, 0.0F, 10.553192F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(4.0F, 26.0F);
      ((Path)localObject1).lineTo(6.5531917F, 29.829786F);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject1).setStrokeCap(Paint.Cap.SQUARE);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(15.0F, 6.1363635F);
      ((Path)localObject3).lineTo(15.0F, 15.0F);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject1).setStrokeCap(Paint.Cap.SQUARE);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(15.0F, 15.0F);
      ((Path)localObject2).lineTo(20.74468F, 18.40909F);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\zy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */