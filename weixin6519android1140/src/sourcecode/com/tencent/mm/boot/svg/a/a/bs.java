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

public final class bs
  extends c
{
  private final int height;
  private final int width;
  
  public bs()
  {
    GMTrace.i(15883728584704L, 118343);
    this.width = 22;
    this.height = 36;
    GMTrace.o(15883728584704L, 118343);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15883862802432L, 118344);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15883862802432L, 118344);
      return 0;
      GMTrace.o(15883862802432L, 118344);
      return 22;
      GMTrace.o(15883862802432L, 118344);
      return 36;
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
      ((Paint)localObject3).setColor(-10526881);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -215.0F, 0.0F, 1.0F, -1633.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject4 = c.a((float[])localObject2, 1.0F, 0.0F, 126.0F, 0.0F, 1.0F, 1631.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject4);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramVarArgs);
      localObject3 = c.a((float[])localObject4, -0.70710677F, 0.70710677F, 144.65001F, 0.70710677F, 0.70710677F, -59.915993F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(84.78122F, 28.281223F);
      ((Path)localObject1).lineTo(84.78122F, 7.281223F);
      ((Path)localObject1).lineTo(80.28122F, 7.281223F);
      ((Path)localObject1).lineTo(80.28122F, 30.531223F);
      ((Path)localObject1).lineTo(80.28122F, 32.781223F);
      ((Path)localObject1).lineTo(105.78122F, 32.781223F);
      ((Path)localObject1).lineTo(105.78122F, 28.281223F);
      ((Path)localObject1).lineTo(84.78122F, 28.281223F);
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */