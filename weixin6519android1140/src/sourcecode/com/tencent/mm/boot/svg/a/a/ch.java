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

public final class ch
  extends c
{
  private final int height;
  private final int width;
  
  public ch()
  {
    GMTrace.i(15936610369536L, 118737);
    this.width = 60;
    this.height = 60;
    GMTrace.o(15936610369536L, 118737);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15936744587264L, 118738);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15936744587264L, 118738);
      return 0;
      GMTrace.o(15936744587264L, 118738);
      return 60;
      GMTrace.o(15936744587264L, 118738);
      return 60;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject = c.e(paramVarArgs);
      float[] arrayOfFloat = c.d(paramVarArgs);
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
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -251.0F, 0.0F, 1.0F, -198.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 251.0F, 0.0F, 1.0F, 198.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramVarArgs);
      localPaint2.setColor(-1686720);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(30.0F, 60.0F);
      localPath.cubicTo(46.568542F, 60.0F, 60.0F, 46.568542F, 60.0F, 30.0F);
      localPath.cubicTo(60.0F, 13.4314575F, 46.568542F, 0.0F, 30.0F, 0.0F);
      localPath.cubicTo(13.4314575F, 0.0F, 0.0F, 13.4314575F, 0.0F, 30.0F);
      localPath.cubicTo(0.0F, 46.568542F, 13.4314575F, 60.0F, 30.0F, 60.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      arrayOfFloat = c.a(arrayOfFloat, 0.70710677F, -0.70710677F, 30.0F, 0.70710677F, 0.70710677F, -12.426407F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(31.5F, 28.5F);
      ((Path)localObject).lineTo(31.5F, 16.508265F);
      ((Path)localObject).cubicTo(31.5F, 15.668654F, 30.828426F, 15.0F, 30.0F, 15.0F);
      ((Path)localObject).cubicTo(29.165796F, 15.0F, 28.5F, 15.675273F, 28.5F, 16.508265F);
      ((Path)localObject).lineTo(28.5F, 28.5F);
      ((Path)localObject).lineTo(16.508265F, 28.5F);
      ((Path)localObject).cubicTo(15.668654F, 28.5F, 15.0F, 29.171574F, 15.0F, 30.0F);
      ((Path)localObject).cubicTo(15.0F, 30.834204F, 15.675273F, 31.5F, 16.508265F, 31.5F);
      ((Path)localObject).lineTo(28.5F, 31.5F);
      ((Path)localObject).lineTo(28.5F, 43.491737F);
      ((Path)localObject).cubicTo(28.5F, 44.331345F, 29.171574F, 45.0F, 30.0F, 45.0F);
      ((Path)localObject).cubicTo(30.834204F, 45.0F, 31.5F, 44.324726F, 31.5F, 43.491737F);
      ((Path)localObject).lineTo(31.5F, 31.5F);
      ((Path)localObject).lineTo(43.491737F, 31.5F);
      ((Path)localObject).cubicTo(44.331345F, 31.5F, 45.0F, 30.828426F, 45.0F, 30.0F);
      ((Path)localObject).cubicTo(45.0F, 29.165796F, 44.324726F, 28.5F, 43.491737F, 28.5F);
      ((Path)localObject).lineTo(31.5F, 28.5F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */