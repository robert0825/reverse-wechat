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

public final class ake
  extends c
{
  private final int height;
  private final int width;
  
  public ake()
  {
    GMTrace.i(15754879565824L, 117383);
    this.width = 144;
    this.height = 144;
    GMTrace.o(15754879565824L, 117383);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15755013783552L, 117384);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15755013783552L, 117384);
      return 0;
      GMTrace.o(15755013783552L, 117384);
      return 144;
      GMTrace.o(15755013783552L, 117384);
      return 144;
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
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-9473160);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 24.0F, 0.0F, 1.0F, 24.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(51.0F, 45.0F);
      ((Path)localObject2).lineTo(51.0F, 20.995752F);
      ((Path)localObject2).cubicTo(51.0F, 20.45077F, 50.55641F, 20.0F, 50.00922F, 20.0F);
      ((Path)localObject2).lineTo(45.99078F, 20.0F);
      ((Path)localObject2).cubicTo(45.450974F, 20.0F, 45.0F, 20.445814F, 45.0F, 20.995752F);
      ((Path)localObject2).lineTo(45.0F, 45.0F);
      ((Path)localObject2).lineTo(20.995752F, 45.0F);
      ((Path)localObject2).cubicTo(20.45077F, 45.0F, 20.0F, 45.44359F, 20.0F, 45.99078F);
      ((Path)localObject2).lineTo(20.0F, 50.00922F);
      ((Path)localObject2).cubicTo(20.0F, 50.549026F, 20.445814F, 51.0F, 20.995752F, 51.0F);
      ((Path)localObject2).lineTo(45.0F, 51.0F);
      ((Path)localObject2).lineTo(45.0F, 75.00425F);
      ((Path)localObject2).cubicTo(45.0F, 75.54923F, 45.44359F, 76.0F, 45.99078F, 76.0F);
      ((Path)localObject2).lineTo(50.00922F, 76.0F);
      ((Path)localObject2).cubicTo(50.549026F, 76.0F, 51.0F, 75.554184F, 51.0F, 75.00425F);
      ((Path)localObject2).lineTo(51.0F, 51.0F);
      ((Path)localObject2).lineTo(75.00425F, 51.0F);
      ((Path)localObject2).cubicTo(75.54923F, 51.0F, 76.0F, 50.55641F, 76.0F, 50.00922F);
      ((Path)localObject2).lineTo(76.0F, 45.99078F);
      ((Path)localObject2).cubicTo(76.0F, 45.450974F, 75.554184F, 45.0F, 75.00425F, 45.0F);
      ((Path)localObject2).lineTo(51.0F, 45.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(48.551723F, 2.2325583F);
      ((Path)localObject2).cubicTo(22.886942F, 2.2325583F, 2.2325583F, 22.56116F, 2.2325583F, 47.448277F);
      ((Path)localObject2).cubicTo(2.2325583F, 73.27646F, 22.723429F, 93.76744F, 48.551723F, 93.76744F);
      ((Path)localObject2).cubicTo(73.43785F, 93.76744F, 93.76744F, 73.112335F, 93.76744F, 47.448277F);
      ((Path)localObject2).cubicTo(93.76744F, 22.722431F, 73.277176F, 2.2325583F, 48.551723F, 2.2325583F);
      ((Path)localObject2).lineTo(48.551723F, 0.0F);
      ((Path)localObject2).cubicTo(74.50971F, 5.9487298E-15F, 96.0F, 21.488955F, 96.0F, 47.448277F);
      ((Path)localObject2).cubicTo(96.0F, 74.50933F, 74.50971F, 96.0F, 48.551723F, 96.0F);
      ((Path)localObject2).cubicTo(21.490286F, 96.0F, 0.0F, 74.50933F, 0.0F, 47.448277F);
      ((Path)localObject2).cubicTo(0.0F, 21.488955F, 21.490286F, 5.9487298E-15F, 48.551723F, 5.9487298E-15F);
      ((Path)localObject2).lineTo(48.551723F, 2.2325583F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ake.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */