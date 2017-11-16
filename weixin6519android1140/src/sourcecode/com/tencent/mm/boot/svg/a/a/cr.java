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

public final class cr
  extends c
{
  private final int height;
  private final int width;
  
  public cr()
  {
    GMTrace.i(15815545978880L, 117835);
    this.width = 27;
    this.height = 45;
    GMTrace.o(15815545978880L, 117835);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15815680196608L, 117836);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15815680196608L, 117836);
      return 0;
      GMTrace.o(15815680196608L, 117836);
      return 27;
      GMTrace.o(15815680196608L, 117836);
      return 45;
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
      ((Paint)localObject3).setColor(-3684404);
      localObject4 = c.a((float[])localObject2, 1.0F, 0.0F, -1529.0F, 0.0F, 1.0F, -685.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject4);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramVarArgs);
      localObject3 = c.a((float[])localObject4, 0.70710677F, 0.70710677F, -51.91919F, -0.70710677F, 0.70710677F, 1290.656F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(1542.5F, 718.5F);
      ((Path)localObject1).lineTo(1517.0F, 718.5F);
      ((Path)localObject1).lineTo(1517.0F, 723.0F);
      ((Path)localObject1).lineTo(1544.75F, 723.0F);
      ((Path)localObject1).lineTo(1547.0F, 723.0F);
      ((Path)localObject1).lineTo(1547.0F, 693.0F);
      ((Path)localObject1).lineTo(1542.5F, 693.0F);
      ((Path)localObject1).lineTo(1542.5F, 718.5F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\cr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */