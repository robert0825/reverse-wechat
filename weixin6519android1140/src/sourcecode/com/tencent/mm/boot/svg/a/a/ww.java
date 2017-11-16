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

public final class ww
  extends c
{
  private final int height;
  private final int width;
  
  public ww()
  {
    GMTrace.i(17853507960832L, 133019);
    this.width = 46;
    this.height = 46;
    GMTrace.o(17853507960832L, 133019);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17853642178560L, 133020);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17853642178560L, 133020);
      return 0;
      GMTrace.o(17853642178560L, 133020);
      return 46;
      GMTrace.o(17853642178560L, 133020);
      return 46;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject2 = c.d(paramVarArgs);
      Object localObject3 = c.h(paramVarArgs);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Object localObject4 = c.h(paramVarArgs);
      ((Paint)localObject4).setFlags(385);
      ((Paint)localObject4).setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      ((Paint)localObject4).setStrokeWidth(1.0F);
      ((Paint)localObject4).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject4).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject4).setStrokeMiter(4.0F);
      ((Paint)localObject4).setPathEffect(null);
      c.a((Paint)localObject4, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramVarArgs);
      ((Paint)localObject3).setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -996.0F, 0.0F, 1.0F, -265.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject4 = c.a((float[])localObject2, 1.0F, 0.0F, -1.0F, 0.0F, 1.0F, 216.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject4);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramVarArgs);
      localObject3 = c.a((float[])localObject4, 0.70710677F, -0.70710677F, 350.08917F, 0.70710677F, 0.70710677F, -700.3372F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(1018.4283F, 70.42826F);
      ((Path)localObject1).lineTo(990.4264F, 70.42826F);
      ((Path)localObject1).lineTo(990.4264F, 74.42455F);
      ((Path)localObject1).lineTo(1018.4283F, 74.42455F);
      ((Path)localObject1).lineTo(1018.4283F, 102.42641F);
      ((Path)localObject1).lineTo(1022.42456F, 102.42641F);
      ((Path)localObject1).lineTo(1022.42456F, 74.42455F);
      ((Path)localObject1).lineTo(1050.4264F, 74.42455F);
      ((Path)localObject1).lineTo(1050.4264F, 70.42826F);
      ((Path)localObject1).lineTo(1022.42456F, 70.42826F);
      ((Path)localObject1).lineTo(1022.42456F, 42.426407F);
      ((Path)localObject1).lineTo(1018.4283F, 42.426407F);
      ((Path)localObject1).lineTo(1018.4283F, 70.42826F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ww.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */