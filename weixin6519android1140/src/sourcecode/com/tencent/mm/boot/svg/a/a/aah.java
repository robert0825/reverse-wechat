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

public final class aah
  extends c
{
  private final int height;
  private final int width;
  
  public aah()
  {
    GMTrace.i(15950569013248L, 118841);
    this.width = 73;
    this.height = 73;
    GMTrace.o(15950569013248L, 118841);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15950703230976L, 118842);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15950703230976L, 118842);
      return 0;
      GMTrace.o(15950703230976L, 118842);
      return 73;
      GMTrace.o(15950703230976L, 118842);
      return 73;
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
      ((Path)localObject).moveTo(47.197567F, 20.880615F);
      ((Path)localObject).cubicTo(49.75061F, 18.27593F, 54.734123F, 11.859151F, 52.71646F, 9.693311F);
      ((Path)localObject).cubicTo(50.6186F, 7.441382F, 47.12471F, 10.099909F, 43.102005F, 10.099909F);
      ((Path)localObject).cubicTo(38.419895F, 10.099909F, 33.461906F, 6.347826F, 28.768751F, 6.347826F);
      ((Path)localObject).cubicTo(24.075596F, 6.347826F, 21.768908F, 8.151717F, 21.393791F, 9.693311F);
      ((Path)localObject).cubicTo(20.369335F, 13.903461F, 24.471415F, 19.043554F, 26.450045F, 20.825512F);
      ((Path)localObject).cubicTo(17.056711F, 25.732353F, 10.57971F, 36.775944F, 10.57971F, 46.79578F);
      ((Path)localObject).cubicTo(10.57971F, 60.167355F, 22.11471F, 66.652176F, 36.72224F, 66.652176F);
      ((Path)localObject).cubicTo(51.329773F, 66.652176F, 63.47826F, 60.167355F, 63.47826F, 46.79578F);
      ((Path)localObject).cubicTo(63.47826F, 36.813274F, 56.70752F, 25.814636F, 47.197567F, 20.880615F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(43.0405F, 19.180447F);
      ((Path)localObject).cubicTo(45.004486F, 18.007338F, 47.713238F, 13.764762F, 47.17403F, 13.226644F);
      ((Path)localObject).cubicTo(46.54742F, 12.601296F, 45.27558F, 13.851991F, 42.83166F, 13.851991F);
      ((Path)localObject).cubicTo(37.192146F, 13.851991F, 31.270815F, 10.099909F, 28.419573F, 10.099909F);
      ((Path)localObject).cubicTo(25.56833F, 10.099909F, 25.28651F, 11.324817F, 25.28651F, 12.601296F);
      ((Path)localObject).cubicTo(25.28651F, 14.340447F, 28.844025F, 18.299887F, 30.058945F, 19.301182F);
      ((Path)localObject).cubicTo(32.180992F, 18.609077F, 34.41323F, 18.22942F, 36.72224F, 18.22942F);
      ((Path)localObject).cubicTo(38.893246F, 18.22942F, 41.009937F, 18.565052F, 43.0405F, 19.180447F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(36.813618F, 62.003716F);
      ((Path)localObject).cubicTo(48.32105F, 62.003716F, 59.455482F, 58.047215F, 59.455482F, 46.995384F);
      ((Path)localObject).cubicTo(59.455482F, 35.943558F, 48.32105F, 22.60685F, 36.81362F, 22.60685F);
      ((Path)localObject).cubicTo(25.30619F, 22.60685F, 14.965998F, 35.943558F, 14.965998F, 46.995384F);
      ((Path)localObject).cubicTo(14.965998F, 58.047215F, 25.30619F, 62.003716F, 36.813618F, 62.003716F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(24.521008F, 42.901672F);
      ((Path)localObject).cubicTo(24.348475F, 42.723473F, 24.324863F, 42.421143F, 24.47348F, 42.219334F);
      ((Path)localObject).lineTo(25.425287F, 40.92684F);
      ((Path)localObject).cubicTo(25.571571F, 40.7282F, 25.856255F, 40.689495F, 26.04206F, 40.826347F);
      ((Path)localObject).lineTo(32.63428F, 45.681618F);
      ((Path)localObject).cubicTo(32.828632F, 45.82476F, 33.137394F, 45.814117F, 33.333984F, 45.64941F);
      ((Path)localObject).lineTo(47.91601F, 33.432472F);
      ((Path)localObject).cubicTo(48.108097F, 33.271545F, 48.400536F, 33.27584F, 48.57801F, 33.45076F);
      ((Path)localObject).lineTo(49.431164F, 34.29163F);
      ((Path)localObject).cubicTo(49.60469F, 34.462658F, 49.61013F, 34.750954F, 49.448505F, 34.929363F);
      ((Path)localObject).cubicTo(49.448505F, 34.929363F, 45.16237F, 39.68604F, 42.28657F, 42.510536F);
      ((Path)localObject).cubicTo(39.410778F, 45.335033F, 33.302795F, 51.33406F, 33.302795F, 51.33406F);
      ((Path)localObject).cubicTo(33.127937F, 51.5058F, 32.848312F, 51.502617F, 32.673786F, 51.322357F);
      ((Path)localObject).lineTo(24.521008F, 42.901672F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\aah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */