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

public final class nm
  extends c
{
  private final int height;
  private final int width;
  
  public nm()
  {
    GMTrace.i(15872185860096L, 118257);
    this.width = 480;
    this.height = 480;
    GMTrace.o(15872185860096L, 118257);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15872320077824L, 118258);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15872320077824L, 118258);
      return 0;
      GMTrace.o(15872320077824L, 118258);
      return 480;
      GMTrace.o(15872320077824L, 118258);
      return 480;
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
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-2565928);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(480.0F, 0.0F);
      localPath.lineTo(480.0F, 480.0F);
      localPath.lineTo(0.0F, 480.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(377.6F, 272.91428F);
      ((Path)localObject).lineTo(377.6F, 137.6F);
      ((Path)localObject).lineTo(102.4F, 137.6F);
      ((Path)localObject).lineTo(102.4F, 269.6258F);
      ((Path)localObject).lineTo(188.8F, 188.8F);
      ((Path)localObject).lineTo(288.0F, 278.4F);
      ((Path)localObject).lineTo(278.4F, 252.8F);
      ((Path)localObject).lineTo(320.0F, 220.8F);
      ((Path)localObject).lineTo(377.6F, 272.91428F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(86.4F, 124.594025F);
      ((Path)localObject).cubicTo(86.4F, 122.940475F, 87.736046F, 121.6F, 89.391014F, 121.6F);
      ((Path)localObject).lineTo(390.60898F, 121.6F);
      ((Path)localObject).cubicTo(392.26086F, 121.6F, 393.6F, 122.946335F, 393.6F, 124.594025F);
      ((Path)localObject).lineTo(393.6F, 355.40598F);
      ((Path)localObject).cubicTo(393.6F, 357.05954F, 392.26395F, 358.4F, 390.60898F, 358.4F);
      ((Path)localObject).lineTo(89.391014F, 358.4F);
      ((Path)localObject).cubicTo(87.73912F, 358.4F, 86.4F, 357.05365F, 86.4F, 355.40598F);
      ((Path)localObject).lineTo(86.4F, 124.594025F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\nm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */