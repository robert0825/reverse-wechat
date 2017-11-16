package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class acw
  extends c
{
  private final int height;
  private final int width;
  
  public acw()
  {
    GMTrace.i(15843194830848L, 118041);
    this.width = 30;
    this.height = 24;
    GMTrace.o(15843194830848L, 118041);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15843329048576L, 118042);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15843329048576L, 118042);
      return 0;
      GMTrace.o(15843329048576L, 118042);
      return 30;
      GMTrace.o(15843329048576L, 118042);
      return 24;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.e(paramVarArgs);
      c.d(paramVarArgs);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject = c.h(paramVarArgs);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramVarArgs).setStrokeWidth(1.0F);
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(26.0F, 0.0F);
      localPath.lineTo(26.0F, 20.0F);
      localPath.lineTo(0.0F, 20.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localPath.moveTo(24.0F, 2.0F);
      localPath.lineTo(2.0F, 2.0F);
      localPath.lineTo(2.0F, 17.0F);
      localPath.lineTo(24.0F, 17.0F);
      localPath.lineTo(24.0F, 2.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(28.0F, 23.0F);
      localPath.lineTo(29.0F, 23.0F);
      localPath.lineTo(29.0F, 3.0F);
      localPath.lineTo(27.0F, 3.0F);
      localPath.lineTo(27.0F, 21.0F);
      localPath.lineTo(3.0F, 21.0F);
      localPath.lineTo(3.0F, 23.0F);
      localPath.lineTo(28.0F, 23.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(19.784946F, 8.898396F);
      ((Path)localObject).lineTo(15.462585F, 11.916007F);
      ((Path)localObject).lineTo(8.518518F, 6.5454545F);
      ((Path)localObject).lineTo(0.0F, 13.368984F);
      ((Path)localObject).lineTo(0.0F, 18.545454F);
      ((Path)localObject).lineTo(25.555555F, 18.545454F);
      ((Path)localObject).lineTo(25.555555F, 13.368984F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\acw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */