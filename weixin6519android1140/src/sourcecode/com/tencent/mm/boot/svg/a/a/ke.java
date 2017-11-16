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

public final class ke
  extends c
{
  private final int height;
  private final int width;
  
  public ke()
  {
    GMTrace.i(20324993204224L, 151433);
    this.width = 24;
    this.height = 39;
    GMTrace.o(20324993204224L, 151433);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20325127421952L, 151434);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(20325127421952L, 151434);
      return 0;
      GMTrace.o(20325127421952L, 151434);
      return 24;
      GMTrace.o(20325127421952L, 151434);
      return 39;
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
      localCanvas.saveLayerAlpha(null, 128, 4);
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-6052957);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(24.0F, 19.54977F);
      ((Path)localObject).lineTo(4.981074F, 39.0F);
      ((Path)localObject).lineTo(0.58091927F, 34.302555F);
      ((Path)localObject).lineTo(15.198146F, 19.352266F);
      ((Path)localObject).lineTo(0.0F, 4.7969856F);
      ((Path)localObject).lineTo(4.690614F, 0.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ke.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */