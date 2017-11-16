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

public final class jk
  extends c
{
  private final int height;
  private final int width;
  
  public jk()
  {
    GMTrace.i(15717298601984L, 117103);
    this.width = 20;
    this.height = 17;
    GMTrace.o(15717298601984L, 117103);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15717432819712L, 117104);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15717432819712L, 117104);
      return 0;
      GMTrace.o(15717432819712L, 117104);
      return 20;
      GMTrace.o(15717432819712L, 117104);
      return 17;
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
      localPaint.setColor(-15683841);
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(14.0F, 0.0F);
      localPath.lineTo(14.0F, 3.0F);
      localPath.lineTo(0.0F, 3.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 14.0F);
      localPath.lineTo(14.0F, 14.0F);
      localPath.lineTo(14.0F, 17.0F);
      localPath.lineTo(0.0F, 17.0F);
      localPath.lineTo(0.0F, 14.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(6.0F, 7.0F);
      ((Path)localObject).lineTo(20.0F, 7.0F);
      ((Path)localObject).lineTo(20.0F, 10.0F);
      ((Path)localObject).lineTo(6.0F, 10.0F);
      ((Path)localObject).lineTo(6.0F, 7.0F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\jk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */