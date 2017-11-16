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

public final class ah
  extends c
{
  private final int height;
  private final int width;
  
  public ah()
  {
    GMTrace.i(15759979839488L, 117421);
    this.width = 108;
    this.height = 108;
    GMTrace.o(15759979839488L, 117421);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15760114057216L, 117422);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15760114057216L, 117422);
      return 0;
      GMTrace.o(15760114057216L, 117422);
      return 108;
      GMTrace.o(15760114057216L, 117422);
      return 108;
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
      ((Paint)localObject).setColor(-14187817);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(108.07031F, 0.0F);
      localPath.lineTo(108.07031F, 108.07031F);
      localPath.lineTo(0.0F, 108.07031F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-1);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(17.448853F, 35.66546F);
      localPath.lineTo(17.448853F, 75.79919F);
      localPath.cubicTo(17.448853F, 77.45719F, 18.7972F, 78.80127F, 20.453722F, 78.80127F);
      localPath.lineTo(87.61659F, 78.80127F);
      localPath.cubicTo(89.27613F, 78.80127F, 90.62146F, 77.452194F, 90.62146F, 75.79919F);
      localPath.lineTo(90.62146F, 35.66546F);
      localPath.lineTo(58.135864F, 60.45544F);
      localPath.cubicTo(55.81595F, 62.361008F, 52.25586F, 62.362236F, 49.93445F, 60.45544F);
      localPath.lineTo(17.448853F, 35.66546F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-1);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(19.689577F, 29.269043F);
      localPath.cubicTo(18.03435F, 29.269043F, 17.749979F, 30.091743F, 19.05684F, 31.10848F);
      localPath.lineTo(51.671455F, 56.482616F);
      localPath.cubicTo(52.977234F, 57.49851F, 55.09323F, 57.49935F, 56.400093F, 56.482616F);
      localPath.lineTo(89.01471F, 31.10848F);
      localPath.cubicTo(90.32048F, 30.092587F, 90.03502F, 29.269043F, 88.38197F, 29.269043F);
      localPath.lineTo(19.689577F, 29.269043F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-14187817);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(108.07031F, 0.0F);
      localPath.lineTo(108.07031F, 108.07031F);
      localPath.lineTo(0.0F, 108.07031F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-1);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(17.448853F, 35.66546F);
      localPath.lineTo(17.448853F, 75.79919F);
      localPath.cubicTo(17.448853F, 77.45719F, 18.7972F, 78.80127F, 20.453722F, 78.80127F);
      localPath.lineTo(87.61659F, 78.80127F);
      localPath.cubicTo(89.27613F, 78.80127F, 90.62146F, 77.452194F, 90.62146F, 75.79919F);
      localPath.lineTo(90.62146F, 35.66546F);
      localPath.lineTo(58.135864F, 60.45544F);
      localPath.cubicTo(55.81595F, 62.361008F, 52.25586F, 62.362236F, 49.93445F, 60.45544F);
      localPath.lineTo(17.448853F, 35.66546F);
      localPath.lineTo(17.448853F, 35.66546F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(19.689577F, 29.269043F);
      ((Path)localObject).cubicTo(18.03435F, 29.269043F, 17.749979F, 30.091743F, 19.05684F, 31.10848F);
      ((Path)localObject).lineTo(51.671455F, 56.482616F);
      ((Path)localObject).cubicTo(52.977234F, 57.49851F, 55.09323F, 57.49935F, 56.400093F, 56.482616F);
      ((Path)localObject).lineTo(89.01471F, 31.10848F);
      ((Path)localObject).cubicTo(90.32048F, 30.092587F, 90.03502F, 29.269043F, 88.38197F, 29.269043F);
      ((Path)localObject).lineTo(19.689577F, 29.269043F);
      ((Path)localObject).lineTo(19.689577F, 29.269043F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */