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

public final class ads
  extends c
{
  private final int height;
  private final int width;
  
  public ads()
  {
    GMTrace.i(15880507359232L, 118319);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15880507359232L, 118319);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15880641576960L, 118320);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15880641576960L, 118320);
      return 0;
      GMTrace.o(15880641576960L, 118320);
      return 96;
      GMTrace.o(15880641576960L, 118320);
      return 96;
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
      localPaint.setColor(-1);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(27.334614F, 45.865097F);
      ((Path)localObject).cubicTo(25.343315F, 46.87897F, 21.187138F, 52.730484F, 20.731934F, 57.04248F);
      ((Path)localObject).cubicTo(20.231934F, 61.77881F, 21.082403F, 65.68994F, 22.739258F, 65.68994F);
      ((Path)localObject).cubicTo(23.691587F, 65.68994F, 25.924526F, 64.05116F, 27.651304F, 61.766052F);
      ((Path)localObject).cubicTo(28.861832F, 64.05024F, 30.447872F, 66.10601F, 32.327477F, 67.851654F);
      ((Path)localObject).cubicTo(28.999271F, 69.187904F, 26.0F, 71.20011F, 26.0F, 73.5F);
      ((Path)localObject).cubicTo(26.0F, 77.52051F, 31.528564F, 80.11182F, 35.64502F, 80.11182F);
      ((Path)localObject).cubicTo(38.9312F, 80.11182F, 45.607635F, 78.17335F, 48.0F, 75.37939F);
      ((Path)localObject).lineTo(48.0F, 75.37939F);
      ((Path)localObject).cubicTo(50.392365F, 78.17335F, 57.0688F, 80.11182F, 60.35498F, 80.11182F);
      ((Path)localObject).cubicTo(64.471436F, 80.11182F, 70.0F, 77.52051F, 70.0F, 73.5F);
      ((Path)localObject).cubicTo(70.0F, 71.20011F, 67.000725F, 69.187904F, 63.672523F, 67.851654F);
      ((Path)localObject).lineTo(63.672523F, 67.851654F);
      ((Path)localObject).cubicTo(65.605F, 66.0569F, 67.22717F, 63.934326F, 68.44997F, 61.57273F);
      ((Path)localObject).cubicTo(70.38834F, 63.95817F, 72.97974F, 65.68994F, 74.06749F, 65.68994F);
      ((Path)localObject).cubicTo(75.90844F, 65.68994F, 76.85341F, 61.77881F, 76.29785F, 57.04248F);
      ((Path)localObject).cubicTo(75.76961F, 52.539017F, 70.75588F, 46.356285F, 68.68161F, 45.759216F);
      ((Path)localObject).cubicTo(68.89081F, 44.375946F, 69.0F, 42.95274F, 69.0F, 41.5F);
      ((Path)localObject).cubicTo(69.0F, 27.969023F, 59.59798F, 17.0F, 48.0F, 17.0F);
      ((Path)localObject).cubicTo(36.40202F, 17.0F, 27.0F, 27.969023F, 27.0F, 41.5F);
      ((Path)localObject).cubicTo(27.0F, 42.989834F, 27.11484F, 44.448605F, 27.334614F, 45.865097F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ads.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */