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

public final class akx
  extends c
{
  private final int height;
  private final int width;
  
  public akx()
  {
    GMTrace.i(17582790803456L, 131002);
    this.width = 96;
    this.height = 96;
    GMTrace.o(17582790803456L, 131002);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17582925021184L, 131003);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17582925021184L, 131003);
      return 0;
      GMTrace.o(17582925021184L, 131003);
      return 96;
      GMTrace.o(17582925021184L, 131003);
      return 96;
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
      c.a(localPaint, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint = c.a((Paint)localObject2, paramVarArgs);
      localPaint.setColor(0);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(96.0F, 0.0F);
      localPath.lineTo(96.0F, 96.0F);
      localPath.lineTo(0.0F, 96.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 21.0F, 0.0F, 1.0F, 21.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint = c.a((Paint)localObject2, paramVarArgs);
      localPaint.setColor(-499359);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(27.0F, 0.0F);
      localPath.cubicTo(41.91169F, 0.0F, 54.0F, 12.088311F, 54.0F, 27.0F);
      localPath.cubicTo(54.0F, 41.91169F, 41.91169F, 54.0F, 27.0F, 54.0F);
      localPath.cubicTo(12.088311F, 54.0F, 0.0F, 41.91169F, 0.0F, 27.0F);
      localPath.cubicTo(0.0F, 12.088311F, 12.088311F, 0.0F, 27.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-1);
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 24.0F, 0.0F, 1.0F, 13.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(3.0F, 24.0F);
      ((Path)localObject3).cubicTo(4.6568546F, 24.0F, 6.0F, 25.343145F, 6.0F, 27.0F);
      ((Path)localObject3).cubicTo(6.0F, 28.656855F, 4.6568546F, 30.0F, 3.0F, 30.0F);
      ((Path)localObject3).cubicTo(1.3431456F, 30.0F, 0.0F, 28.656855F, 0.0F, 27.0F);
      ((Path)localObject3).cubicTo(0.0F, 25.343145F, 1.3431456F, 24.0F, 3.0F, 24.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.49475262F, 0.0F);
      ((Path)localObject2).lineTo(5.4947524F, 0.0F);
      ((Path)localObject2).lineTo(4.7095985F, 20.212122F);
      ((Path)localObject2).lineTo(1.3290199F, 20.212122F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\akx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */