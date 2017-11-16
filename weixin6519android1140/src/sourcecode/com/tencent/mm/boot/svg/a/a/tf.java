package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.svg.c;

public final class tf
  extends c
{
  private final int height;
  private final int width;
  
  public tf()
  {
    GMTrace.i(15764811677696L, 117457);
    this.width = 35;
    this.height = 55;
    GMTrace.o(15764811677696L, 117457);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15764945895424L, 117458);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15764945895424L, 117458);
      return 0;
      GMTrace.o(15764945895424L, 117458);
      return 35;
      GMTrace.o(15764945895424L, 117458);
      return 55;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.e(paramVarArgs);
      c.d(paramVarArgs);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject = c.h(paramVarArgs);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramVarArgs).setStrokeWidth(1.0F);
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-5066062);
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 4.0F);
      localPath.cubicTo(0.0F, 1.7908609F, 1.7908609F, 0.0F, 4.0F, 0.0F);
      localPath.lineTo(5.0F, 0.0F);
      localPath.cubicTo(7.209139F, 0.0F, 9.0F, 1.7908609F, 9.0F, 4.0F);
      localPath.lineTo(9.0F, 51.0F);
      localPath.cubicTo(9.0F, 53.20914F, 7.209139F, 55.0F, 5.0F, 55.0F);
      localPath.lineTo(4.0F, 55.0F);
      localPath.cubicTo(1.7908609F, 55.0F, 0.0F, 53.20914F, 0.0F, 51.0F);
      localPath.lineTo(0.0F, 4.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(26.0F, 4.0F);
      ((Path)localObject).cubicTo(26.0F, 1.7908609F, 27.790861F, 0.0F, 30.0F, 0.0F);
      ((Path)localObject).lineTo(31.0F, 0.0F);
      ((Path)localObject).cubicTo(33.20914F, 0.0F, 35.0F, 1.7908609F, 35.0F, 4.0F);
      ((Path)localObject).lineTo(35.0F, 51.0F);
      ((Path)localObject).cubicTo(35.0F, 53.20914F, 33.20914F, 55.0F, 31.0F, 55.0F);
      ((Path)localObject).lineTo(30.0F, 55.0F);
      ((Path)localObject).cubicTo(27.790861F, 55.0F, 26.0F, 53.20914F, 26.0F, 51.0F);
      ((Path)localObject).lineTo(26.0F, 4.0F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\tf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */