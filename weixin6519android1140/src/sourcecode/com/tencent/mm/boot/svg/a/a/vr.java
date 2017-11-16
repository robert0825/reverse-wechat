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

public final class vr
  extends c
{
  private final int height;
  private final int width;
  
  public vr()
  {
    GMTrace.i(15842389524480L, 118035);
    this.width = 84;
    this.height = 84;
    GMTrace.o(15842389524480L, 118035);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15842523742208L, 118036);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15842523742208L, 118036);
      return 0;
      GMTrace.o(15842523742208L, 118036);
      return 84;
      GMTrace.o(15842523742208L, 118036);
      return 84;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject2 = c.d(paramVarArgs);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject3 = c.h(paramVarArgs);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      c.a((Paint)localObject3, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject3).setColor(1717131609);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 9.0093975F);
      localPath.cubicTo(0.0F, 4.0336447F, 4.0231953F, 0.0F, 9.0093975F, 0.0F);
      localPath.lineTo(74.9906F, 0.0F);
      localPath.cubicTo(79.966354F, 0.0F, 84.0F, 4.0231953F, 84.0F, 9.0093975F);
      localPath.lineTo(84.0F, 74.9906F);
      localPath.cubicTo(84.0F, 79.966354F, 79.97681F, 84.0F, 74.9906F, 84.0F);
      localPath.lineTo(9.0093975F, 84.0F);
      localPath.cubicTo(4.0336447F, 84.0F, 0.0F, 79.97681F, 0.0F, 74.9906F);
      localPath.lineTo(0.0F, 9.0093975F);
      localPath.close();
      localPath.moveTo(2.0F, 10.0000515F);
      localPath.lineTo(2.0F, 73.99995F);
      localPath.cubicTo(2.0F, 78.42021F, 5.5817447F, 82.0F, 10.0000515F, 82.0F);
      localPath.lineTo(73.99995F, 82.0F);
      localPath.cubicTo(78.42021F, 82.0F, 82.0F, 78.41826F, 82.0F, 73.99995F);
      localPath.lineTo(82.0F, 10.0000515F);
      localPath.cubicTo(82.0F, 5.5797863F, 78.41826F, 2.0F, 73.99995F, 2.0F);
      localPath.lineTo(10.0000515F, 2.0F);
      localPath.cubicTo(5.5797863F, 2.0F, 2.0F, 5.5817447F, 2.0F, 10.0000515F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject3).setColor(1719039606);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(84.0F, 0.0F);
      localPath.lineTo(84.0F, 84.0F);
      localPath.lineTo(0.0F, 84.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject3).setColor(-1);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(18.0F, 60.0F);
      localPath.lineTo(66.0F, 60.0F);
      localPath.lineTo(66.0F, 66.0F);
      localPath.lineTo(18.0F, 66.0F);
      localPath.lineTo(18.0F, 60.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject3 = c.a((float[])localObject2, 1.0F, 0.0F, 32.0F, 0.0F, 1.0F, 18.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint, paramVarArgs);
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 58.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(10.0F, 23.0F);
      ((Path)localObject1).lineTo(20.0F, 35.0F);
      ((Path)localObject1).lineTo(-2.6645353E-15F, 35.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(7.0F, 0.0F);
      ((Path)localObject2).lineTo(13.0F, 0.0F);
      ((Path)localObject2).lineTo(13.0F, 27.0F);
      ((Path)localObject2).lineTo(7.0F, 27.0F);
      ((Path)localObject2).lineTo(7.0F, 0.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\vr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */