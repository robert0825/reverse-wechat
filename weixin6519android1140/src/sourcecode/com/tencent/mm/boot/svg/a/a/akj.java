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

public final class akj
  extends c
{
  private final int height;
  private final int width;
  
  public akj()
  {
    GMTrace.i(16770773549056L, 124952);
    this.width = 144;
    this.height = 144;
    GMTrace.o(16770773549056L, 124952);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16770907766784L, 124953);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(16770907766784L, 124953);
      return 0;
      GMTrace.o(16770907766784L, 124953);
      return 144;
      GMTrace.o(16770907766784L, 124953);
      return 144;
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
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-8420471);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 24.0F, 0.0F, 1.0F, 24.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject3 = c.a(localPaint, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(96.0F, 48.0F);
      localPath.cubicTo(96.0F, 74.50967F, 74.50967F, 96.0F, 48.0F, 96.0F);
      localPath.cubicTo(21.490332F, 96.0F, 0.0F, 74.50967F, 0.0F, 48.0F);
      localPath.cubicTo(0.0F, 21.490332F, 21.490332F, 0.0F, 48.0F, 0.0F);
      localPath.cubicTo(74.50967F, 0.0F, 96.0F, 21.490332F, 96.0F, 48.0F);
      localPath.close();
      localPath.moveTo(2.2325583F, 48.0F);
      localPath.cubicTo(2.2325583F, 73.27666F, 22.72334F, 93.76744F, 48.0F, 93.76744F);
      localPath.cubicTo(73.27666F, 93.76744F, 93.76744F, 73.27666F, 93.76744F, 48.0F);
      localPath.cubicTo(93.76744F, 22.72334F, 73.27666F, 2.2325583F, 48.0F, 2.2325583F);
      localPath.cubicTo(22.72334F, 2.2325583F, 2.2325583F, 22.72334F, 2.2325583F, 48.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 1);
      localCanvas.drawPath(localPath, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((float[])localObject2, 1.0F, 0.0F, 26.790697F, 0.0F, 1.0F, 18.976744F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint, paramVarArgs);
      localObject3 = c.a((float[])localObject3, 1.0F, -2.4492937E-16F, 5.8949783E-15F, 2.4492937E-16F, 1.0F, -7.1054274E-15F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(9.242784F, 15.046621F);
      localPath.lineTo(5.7515807F, 13.587353F);
      localPath.lineTo(4.2013745F, 16.236765F);
      localPath.cubicTo(-1.0752558F, 25.2549F, 0.82536453F, 36.455082F, 8.255448F, 42.848324F);
      localPath.lineTo(14.945739F, 46.659718F);
      localPath.cubicTo(24.271938F, 49.812366F, 35.05231F, 45.836422F, 40.32894F, 36.818287F);
      localPath.lineTo(41.879147F, 34.168877F);
      localPath.lineTo(38.534004F, 32.26318F);
      localPath.lineTo(36.983795F, 34.91259F);
      localPath.cubicTo(32.00611F, 43.41981F, 21.480352F, 46.39259F, 13.678554F, 41.94798F);
      localPath.cubicTo(5.2225933F, 37.130703F, 2.5688329F, 26.649681F, 7.5465198F, 18.142462F);
      localPath.lineTo(9.096725F, 15.49305F);
      localPath.lineTo(9.242784F, 15.046621F);
      localPath.close();
      localPath.moveTo(36.908394F, 2.0371823F);
      localPath.cubicTo(30.983795F, -1.3206756F, 23.404871F, 0.677421F, 19.991037F, 6.481949F);
      localPath.lineTo(11.786581F, 20.431961F);
      localPath.cubicTo(8.367981F, 26.244596F, 10.3981905F, 33.678013F, 16.324091F, 37.036606F);
      localPath.cubicTo(22.248688F, 40.394466F, 29.827612F, 38.39637F, 33.241444F, 32.59184F);
      localPath.lineTo(41.4459F, 18.641829F);
      localPath.cubicTo(44.864502F, 12.829193F, 42.834293F, 5.395778F, 36.908394F, 2.0371823F);
      localPath.lineTo(36.908394F, 2.0371823F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramVarArgs);
      localObject3 = c.a((float[])localObject3, 0.8660254F, -0.5F, 26.034246F, 0.5F, 0.8660254F, 2.5564842F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(4.387296F, 41.44669F);
      ((Path)localObject1).lineTo(12.10602F, 41.44669F);
      ((Path)localObject1).lineTo(12.10602F, 53.576115F);
      ((Path)localObject1).lineTo(8.81612F, 58.27597F);
      ((Path)localObject1).cubicTo(8.501615F, 58.72526F, 7.9934344F, 58.727737F, 7.6771955F, 58.27597F);
      ((Path)localObject1).lineTo(4.387296F, 53.576115F);
      ((Path)localObject1).lineTo(4.387296F, 41.44669F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-8420471);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(96.0F, 47.448277F);
      ((Path)localObject1).cubicTo(96.0F, 74.50933F, 74.50971F, 96.0F, 48.551723F, 96.0F);
      ((Path)localObject1).cubicTo(21.490286F, 96.0F, 0.0F, 74.50933F, 0.0F, 47.448277F);
      ((Path)localObject1).cubicTo(0.0F, 21.488955F, 21.490286F, 5.9487298E-15F, 48.551723F, 5.9487298E-15F);
      ((Path)localObject1).cubicTo(74.50971F, 5.9487298E-15F, 96.0F, 21.488955F, 96.0F, 47.448277F);
      ((Path)localObject1).close();
      localCanvas.saveLayerAlpha(null, 51, 4);
      localPaint = c.a(localPaint, paramVarArgs);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\akj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */