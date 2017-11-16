package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class alr
  extends c
{
  private final int height;
  private final int width;
  
  public alr()
  {
    GMTrace.i(15887755116544L, 118373);
    this.width = 24;
    this.height = 150;
    GMTrace.o(15887755116544L, 118373);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15887889334272L, 118374);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15887889334272L, 118374);
      return 0;
      GMTrace.o(15887889334272L, 118374);
      return 24;
      GMTrace.o(15887889334272L, 118374);
      return 150;
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
      c.a(localPaint, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramVarArgs);
      localPaint.setColor(-1);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(24.0F, 0.0F);
      localPath.lineTo(24.0F, 150.0F);
      localPath.lineTo(0.0F, 150.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localPaint = c.a((Paint)localObject, paramVarArgs);
      localPaint.setColor(-16777216);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(7.0F, 66.0F);
      ((Path)localObject).lineTo(10.0F, 66.0F);
      ((Path)localObject).lineTo(10.0F, 84.0F);
      ((Path)localObject).lineTo(7.0F, 84.0F);
      ((Path)localObject).lineTo(7.0F, 66.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(14.0F, 66.0F);
      ((Path)localObject).lineTo(17.0F, 66.0F);
      ((Path)localObject).lineTo(17.0F, 84.0F);
      ((Path)localObject).lineTo(14.0F, 84.0F);
      ((Path)localObject).lineTo(14.0F, 66.0F);
      ((Path)localObject).close();
      localCanvas.saveLayerAlpha(null, 51, 4);
      localPaint = c.a(localPaint, paramVarArgs);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\alr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */