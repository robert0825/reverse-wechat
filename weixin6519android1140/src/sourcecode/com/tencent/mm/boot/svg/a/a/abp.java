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

public final class abp
  extends c
{
  private final int height;
  private final int width;
  
  public abp()
  {
    GMTrace.i(15832725848064L, 117963);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15832725848064L, 117963);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15832860065792L, 117964);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15832860065792L, 117964);
      return 0;
      GMTrace.o(15832860065792L, 117964);
      return 96;
      GMTrace.o(15832860065792L, 117964);
      return 96;
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
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 16.0F, 0.0F, 1.0F, 27.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(7.0F, 1.0F);
      ((Path)localObject2).cubicTo(10.526494F, -1.3853347F, 15.476821F, 1.5766289F, 14.0F, 5.0F);
      ((Path)localObject2).cubicTo(7.392988F, 12.569689F, 5.9232F, 23.522991F, 11.0F, 32.0F);
      ((Path)localObject2).cubicTo(11.93504F, 34.386837F, 14.650065F, 36.63316F, 14.0F, 40.0F);
      ((Path)localObject2).cubicTo(12.914899F, 42.31854F, 8.964845F, 42.795635F, 7.0F, 41.0F);
      ((Path)localObject2).cubicTo(-2.6607683F, 29.516495F, -2.181046F, 11.8341675F, 7.0F, 1.0F);
      ((Path)localObject2).lineTo(7.0F, 1.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(51.0F, 2.0F);
      ((Path)localObject2).cubicTo(51.81792F, -0.5502939F, 54.604008F, -0.16187043F, 57.0F, 1.0F);
      ((Path)localObject2).cubicTo(66.176994F, 11.769702F, 66.65665F, 29.467869F, 57.0F, 41.0F);
      ((Path)localObject2).cubicTo(55.236748F, 42.504955F, 51.83833F, 42.504955F, 51.0F, 40.0F);
      ((Path)localObject2).cubicTo(49.133884F, 38.062984F, 50.82799F, 35.712524F, 52.0F, 34.0F);
      ((Path)localObject2).cubicTo(57.3901F, 26.250925F, 57.51256F, 15.444786F, 52.0F, 8.0F);
      ((Path)localObject2).cubicTo(50.99128F, 6.013067F, 48.960392F, 3.782122F, 51.0F, 2.0F);
      ((Path)localObject2).lineTo(51.0F, 2.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(18.0F, 7.0F);
      ((Path)localObject2).cubicTo(20.819609F, 5.5211906F, 24.681755F, 10.051395F, 22.0F, 13.0F);
      ((Path)localObject2).cubicTo(19.615078F, 16.237059F, 18.668661F, 20.876305F, 20.0F, 25.0F);
      ((Path)localObject2).cubicTo(20.695332F, 26.992579F, 23.085274F, 28.112738F, 23.0F, 30.0F);
      ((Path)localObject2).cubicTo(22.989677F, 33.426064F, 19.060612F, 35.21039F, 17.0F, 33.0F);
      ((Path)localObject2).cubicTo(11.584872F, 25.703897F, 11.508394F, 14.214823F, 18.0F, 7.0F);
      ((Path)localObject2).lineTo(18.0F, 7.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(43.0F, 7.0F);
      ((Path)localObject2).cubicTo(44.48336F, 6.7782235F, 45.84865F, 6.9965997F, 47.0F, 8.0F);
      ((Path)localObject2).cubicTo(51.157063F, 13.766257F, 52.436428F, 22.223366F, 49.0F, 29.0F);
      ((Path)localObject2).cubicTo(48.130505F, 30.958408F, 47.366707F, 33.916412F, 45.0F, 34.0F);
      ((Path)localObject2).cubicTo(41.762325F, 34.36309F, 39.67142F, 29.975716F, 42.0F, 28.0F);
      ((Path)localObject2).cubicTo(45.82001F, 23.791702F, 45.01802F, 16.972414F, 42.0F, 13.0F);
      ((Path)localObject2).cubicTo(40.20608F, 11.02663F, 41.218117F, 7.979292F, 43.0F, 7.0F);
      ((Path)localObject2).lineTo(43.0F, 7.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(30.0F, 13.0F);
      ((Path)localObject1).cubicTo(35.026703F, 11.379892F, 41.03034F, 16.427767F, 40.0F, 22.0F);
      ((Path)localObject1).cubicTo(39.239254F, 27.1483F, 31.95484F, 29.994547F, 28.0F, 26.0F);
      ((Path)localObject1).cubicTo(23.189528F, 23.102068F, 24.520334F, 15.15836F, 30.0F, 13.0F);
      ((Path)localObject1).lineTo(30.0F, 13.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\abp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */