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

public final class gj
  extends c
{
  private final int height;
  private final int width;
  
  public gj()
  {
    GMTrace.i(15836752379904L, 117993);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15836752379904L, 117993);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15836886597632L, 117994);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15836886597632L, 117994);
      return 0;
      GMTrace.o(15836886597632L, 117994);
      return 96;
      GMTrace.o(15836886597632L, 117994);
      return 96;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      float[] arrayOfFloat = c.d(paramVarArgs);
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
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 4.0F, 0.0F, 1.0F, 10.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject1).setColor(-8617851);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(32.9052F, 39.8588F);
      ((Path)localObject2).cubicTo(33.5872F, 40.15305F, 34.10695F, 39.579674F, 34.364075F, 39.163048F);
      ((Path)localObject2).lineTo(35.824326F, 37.07992F);
      ((Path)localObject2).cubicTo(36.377075F, 36.140797F, 36.22995F, 35.869923F, 35.824326F, 35.689796F);
      ((Path)localObject2).cubicTo(35.252327F, 35.435425F, 35.054325F, 35.578423F, 34.364075F, 36.384174F);
      ((Path)localObject2).lineTo(32.9052F, 38.470047F);
      ((Path)localObject2).cubicTo(32.64945F, 38.88255F, 32.496826F, 39.681423F, 32.9052F, 39.8588F);
      ((Path)localObject2).lineTo(32.9052F, 39.8588F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(46.6607F, 39.015923F);
      ((Path)localObject2).cubicTo(48.523827F, 42.02305F, 46.255074F, 46.432674F, 42.10395F, 46.478046F);
      ((Path)localObject2).cubicTo(37.88545F, 46.52205F, 30.714825F, 39.8588F, 30.714825F, 39.8588F);
      ((Path)localObject2).lineTo(34.364075F, 32.910923F);
      ((Path)localObject2).cubicTo(34.364075F, 32.910923F, 44.772823F, 35.96755F, 46.6607F, 39.015923F);
      ((Path)localObject2).lineTo(46.6607F, 39.015923F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(42.3927F, 19.708174F);
      ((Path)localObject2).cubicTo(45.130325F, 24.813547F, 44.440075F, 29.763548F, 43.12145F, 34.30105F);
      ((Path)localObject2).cubicTo(41.1882F, 33.16392F, 40.485577F, 32.631798F, 39.4722F, 32.21517F);
      ((Path)localObject2).cubicTo(39.855824F, 30.103172F, 39.43645F, 29.568298F, 38.74345F, 26.656048F);
      ((Path)localObject2).cubicTo(37.273575F, 20.468548F, 29.613451F, 16.426048F, 21.958826F, 17.623672F);
      ((Path)localObject2).cubicTo(14.11445F, 18.851547F, 10.813075F, 27.984299F, 12.6707F, 35.219547F);
      ((Path)localObject2).cubicTo(14.39495F, 41.929546F, 17.600075F, 45.61592F, 24.147825F, 48.196796F);
      ((Path)localObject2).cubicTo(24.147825F, 48.196796F, 25.239574F, 50.98392F, 26.3382F, 53.060173F);
      ((Path)localObject2).cubicTo(27.425825F, 55.11855F, 29.257326F, 57.22917F, 29.257326F, 57.22917F);
      ((Path)localObject2).cubicTo(24.16295F, 56.82905F, 9.15895F, 50.127296F, 3.4307003F, 40.51605F);
      ((Path)localObject2).cubicTo(-2.2947998F, 30.904799F, -1.2442998F, 18.309797F, 9.5535755F, 11.368798F);
      ((Path)localObject2).cubicTo(20.42295F, 4.386548F, 36.872074F, 9.410798F, 42.3927F, 19.708174F);
      ((Path)localObject2).lineTo(42.3927F, 19.708174F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(52.61995F, 11.374298F);
      ((Path)localObject2).cubicTo(48.23095F, 14.465298F, 45.361324F, 18.084297F, 43.851574F, 21.794048F);
      ((Path)localObject2).cubicTo(42.831326F, 17.757048F, 40.25045F, 14.191673F, 36.553074F, 12.065923F);
      ((Path)localObject2).cubicTo(41.01495F, 4.9489226F, 46.541077F, 2.116423F, 53.3377F, 0.94904786F);
      ((Path)localObject2).cubicTo(58.10345F, 1.7960478F, 64.21258F, 2.900173F, 67.93195F, 5.8124228F);
      ((Path)localObject2).cubicTo(63.604824F, 5.919673F, 58.500824F, 7.235548F, 52.61995F, 11.374298F);
      ((Path)localObject2).lineTo(52.61995F, 11.374298F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(76.68932F, 47.502422F);
      ((Path)localObject2).cubicTo(63.8042F, 59.665672F, 57.090076F, 65.93705F, 50.418575F, 75.29668F);
      ((Path)localObject2).cubicTo(49.258076F, 72.3143F, 46.9852F, 71.4453F, 46.0392F, 69.04455F);
      ((Path)localObject2).cubicTo(45.0987F, 66.64517F, 46.329327F, 64.92642F, 46.0392F, 63.485424F);
      ((Path)localObject2).cubicTo(45.75045F, 62.0458F, 44.3892F, 60.316048F, 43.120075F, 60.0108F);
      ((Path)localObject2).cubicTo(53.559074F, 46.02155F, 73.63957F, 39.956425F, 75.96058F, 22.488422F);
      ((Path)localObject2).cubicTo(78.080826F, 6.521923F, 65.39507F, 1.9184228F, 54.796574F, 0.25329787F);
      ((Path)localObject2).cubicTo(68.315575F, -1.1657021F, 79.49158F, 3.3965478F, 84.71795F, 13.456048F);
      ((Path)localObject2).cubicTo(89.19357F, 22.080048F, 89.458954F, 35.451923F, 76.68932F, 47.502422F);
      ((Path)localObject2).lineTo(76.68932F, 47.502422F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\gj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */