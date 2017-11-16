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

public final class aao
  extends c
{
  private final int height;
  private final int width;
  
  public aao()
  {
    GMTrace.i(20327140687872L, 151449);
    this.width = 24;
    this.height = 24;
    GMTrace.o(20327140687872L, 151449);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20327274905600L, 151450);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(20327274905600L, 151450);
      return 0;
      GMTrace.o(20327274905600L, 151450);
      return 24;
      GMTrace.o(20327274905600L, 151450);
      return 24;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.e(paramVarArgs);
      c.d(paramVarArgs);
      Object localObject = c.h(paramVarArgs);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.FILL);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setStrokeWidth(1.0F);
      localObject = c.a((Paint)localObject, paramVarArgs);
      ((Paint)localObject).setColor(-564640);
      localCanvas.save();
      localObject = c.a((Paint)localObject, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(12.0F, 3.0F);
      localPath.cubicTo(16.970562F, 3.0F, 21.0F, 7.029437F, 21.0F, 12.0F);
      localPath.cubicTo(21.0F, 16.970562F, 16.970562F, 21.0F, 12.0F, 21.0F);
      localPath.cubicTo(7.029437F, 21.0F, 3.0F, 16.970562F, 3.0F, 12.0F);
      localPath.cubicTo(3.0F, 7.029437F, 7.029437F, 3.0F, 12.0F, 3.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localPaint.setStrokeWidth(3.0F);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(12.0F, 1.5F);
      ((Path)localObject).cubicTo(17.79899F, 1.5F, 22.5F, 6.2010098F, 22.5F, 12.0F);
      ((Path)localObject).cubicTo(22.5F, 17.79899F, 17.79899F, 22.5F, 12.0F, 22.5F);
      ((Path)localObject).cubicTo(6.2010098F, 22.5F, 1.5F, 17.79899F, 1.5F, 12.0F);
      ((Path)localObject).cubicTo(1.5F, 6.2010098F, 6.2010098F, 1.5F, 12.0F, 1.5F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\aao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */