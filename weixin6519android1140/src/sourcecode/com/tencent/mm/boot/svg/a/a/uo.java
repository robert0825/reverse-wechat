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

public final class uo
  extends c
{
  private final int height;
  private final int width;
  
  public uo()
  {
    GMTrace.i(15911645872128L, 118551);
    this.width = 120;
    this.height = 120;
    GMTrace.o(15911645872128L, 118551);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15911780089856L, 118552);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15911780089856L, 118552);
      return 0;
      GMTrace.o(15911780089856L, 118552);
      return 120;
      GMTrace.o(15911780089856L, 118552);
      return 120;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject2 = c.d(paramVarArgs);
      Paint localPaint1 = c.h(paramVarArgs);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.h(paramVarArgs);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      c.a(localPaint2, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -180.0F, 0.0F, 1.0F, -98.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 180.0F, 0.0F, 1.0F, 98.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-3552823);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 0.0F);
      ((Path)localObject2).lineTo(120.0F, 0.0F);
      ((Path)localObject2).lineTo(120.0F, 120.0F);
      ((Path)localObject2).lineTo(0.0F, 120.0F);
      ((Path)localObject2).lineTo(0.0F, 0.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(84.01563F, 54.268833F);
      ((Path)localObject1).cubicTo(89.06397F, 49.220486F, 89.01945F, 40.99985F, 83.91914F, 35.89955F);
      ((Path)localObject1).cubicTo(78.81996F, 30.80037F, 70.595184F, 30.757744F, 65.549866F, 35.803066F);
      ((Path)localObject1).lineTo(53.803066F, 47.549866F);
      ((Path)localObject1).cubicTo(48.75472F, 52.59821F, 48.799248F, 60.818844F, 53.89955F, 65.91914F);
      ((Path)localObject1).lineTo(56.50995F, 63.308746F);
      ((Path)localObject1).cubicTo(52.866802F, 59.6656F, 52.805256F, 53.823605F, 56.441032F, 50.18783F);
      ((Path)localObject1).lineTo(68.18783F, 38.441032F);
      ((Path)localObject1).cubicTo(71.82153F, 34.807327F, 77.66728F, 34.86849F, 81.30875F, 38.50995F);
      ((Path)localObject1).cubicTo(84.9519F, 42.153095F, 85.01344F, 47.99509F, 81.37766F, 51.630867F);
      ((Path)localObject1).lineTo(75.504265F, 57.504265F);
      ((Path)localObject1).lineTo(78.142235F, 60.14223F);
      ((Path)localObject1).lineTo(84.01563F, 54.268833F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(35.803066F, 65.549866F);
      ((Path)localObject1).cubicTo(30.75472F, 70.598206F, 30.799248F, 78.81885F, 35.89955F, 83.91914F);
      ((Path)localObject1).cubicTo(40.99873F, 89.018326F, 49.22351F, 89.06095F, 54.268833F, 84.01563F);
      ((Path)localObject1).lineTo(66.01563F, 72.26883F);
      ((Path)localObject1).cubicTo(71.06397F, 67.22049F, 71.01945F, 58.99985F, 65.91914F, 53.89955F);
      ((Path)localObject1).lineTo(63.308746F, 56.50995F);
      ((Path)localObject1).cubicTo(66.9519F, 60.153095F, 67.01344F, 65.99509F, 63.377663F, 69.63087F);
      ((Path)localObject1).lineTo(51.630867F, 81.37766F);
      ((Path)localObject1).cubicTo(47.997158F, 85.01137F, 42.151413F, 84.95021F, 38.50995F, 81.30875F);
      ((Path)localObject1).cubicTo(34.866802F, 77.665596F, 34.805256F, 71.82361F, 38.441032F, 68.18783F);
      ((Path)localObject1).lineTo(44.31443F, 62.31443F);
      ((Path)localObject1).lineTo(41.676464F, 59.676464F);
      ((Path)localObject1).lineTo(35.803066F, 65.549866F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\uo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */