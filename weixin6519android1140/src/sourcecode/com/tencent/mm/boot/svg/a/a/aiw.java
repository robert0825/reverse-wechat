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

public final class aiw
  extends c
{
  private final int height;
  private final int width;
  
  public aiw()
  {
    GMTrace.i(17575274610688L, 130946);
    this.width = 42;
    this.height = 42;
    GMTrace.o(17575274610688L, 130946);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17575408828416L, 130947);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17575408828416L, 130947);
      return 0;
      GMTrace.o(17575408828416L, 130947);
      return 42;
      GMTrace.o(17575408828416L, 130947);
      return 42;
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
      localPaint2 = c.a(localPaint2, paramVarArgs);
      localPaint2.setStrokeWidth(1.0F);
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint2 = c.a(localPaint2, paramVarArgs);
      localPaint1.setColor(-4210753);
      localPaint2.setColor(-4210753);
      localPaint2.setStrokeWidth(1.2F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.a(localPaint2, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(20.06508F, 39.519398F);
      localPath.cubicTo(9.131414F, 39.519398F, 0.36045057F, 30.628284F, 0.36045057F, 19.814768F);
      localPath.cubicTo(0.36045057F, 8.881102F, 9.251564F, 0.11013767F, 20.06508F, 0.11013767F);
      localPath.cubicTo(30.998749F, 0.11013767F, 39.76971F, 9.001251F, 39.76971F, 19.814768F);
      localPath.cubicTo(39.76971F, 30.628284F, 30.998749F, 39.519398F, 20.06508F, 39.519398F);
      localPath.close();
      localPath.moveTo(20.06508F, 1.1914893F);
      localPath.cubicTo(9.852315F, 1.1914893F, 1.5619525F, 9.481853F, 1.5619525F, 19.694618F);
      localPath.cubicTo(1.5619525F, 29.907385F, 9.852315F, 38.197746F, 20.06508F, 38.197746F);
      localPath.cubicTo(30.277847F, 38.197746F, 38.56821F, 29.907385F, 38.56821F, 19.694618F);
      localPath.cubicTo(38.56821F, 9.481853F, 30.277847F, 1.1914893F, 20.06508F, 1.1914893F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject1);
      localCanvas.drawPath(localPath, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint2 = c.a(localPaint2, paramVarArgs);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(25.83229F, 27.26408F);
      ((Path)localObject1).cubicTo(25.712141F, 27.26408F, 25.47184F, 27.14393F, 25.35169F, 27.023779F);
      ((Path)localObject1).lineTo(19.58448F, 20.055069F);
      ((Path)localObject1).cubicTo(19.46433F, 19.93492F, 19.46433F, 19.814768F, 19.46433F, 19.694618F);
      ((Path)localObject1).lineTo(19.46433F, 8.1602F);
      ((Path)localObject1).cubicTo(19.46433F, 7.79975F, 19.70463F, 7.559449F, 20.06508F, 7.559449F);
      ((Path)localObject1).cubicTo(20.425531F, 7.559449F, 20.665833F, 7.79975F, 20.665833F, 8.1602F);
      ((Path)localObject1).lineTo(20.665833F, 19.454317F);
      ((Path)localObject1).lineTo(26.312891F, 26.182728F);
      ((Path)localObject1).cubicTo(26.553192F, 26.423029F, 26.43304F, 26.78348F, 26.192741F, 27.023779F);
      ((Path)localObject1).cubicTo(26.07259F, 27.26408F, 25.95244F, 27.26408F, 25.83229F, 27.26408F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.drawPath((Path)localObject1, localPaint2);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\aiw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */