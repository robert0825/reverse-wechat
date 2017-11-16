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

public final class ex
  extends c
{
  private final int height;
  private final int width;
  
  public ex()
  {
    GMTrace.i(15769375080448L, 117491);
    this.width = 476;
    this.height = 292;
    GMTrace.o(15769375080448L, 117491);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15769509298176L, 117492);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15769509298176L, 117492);
      return 0;
      GMTrace.o(15769509298176L, 117492);
      return 476;
      GMTrace.o(15769509298176L, 117492);
      return 292;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject2 = c.d(paramVarArgs);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject3 = c.h(paramVarArgs);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      c.a((Paint)localObject3, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a((float[])localObject2, 1.0F, 0.0F, 3.0F, 0.0F, 1.0F, 2.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject2).setColor(-13158344);
      localObject3 = c.a((float[])localObject3, -1.0F, 0.0F, 470.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(304.0F, 278.731F);
      localPath.lineTo(304.0F, 284.001F);
      localPath.lineTo(166.0F, 284.001F);
      localPath.lineTo(166.0F, 278.731F);
      localPath.lineTo(219.0F, 273.731F);
      localPath.lineTo(219.0F, 240.001F);
      localPath.lineTo(251.0F, 240.001F);
      localPath.lineTo(251.0F, 273.731F);
      localPath.lineTo(304.0F, 278.731F);
      localPath.close();
      localPath.moveTo(254.0F, 240.0F);
      localPath.lineTo(366.985F, 240.0F);
      localPath.lineTo(366.985F, 237.001F);
      localPath.lineTo(254.0F, 237.001F);
      localPath.lineTo(216.0F, 237.0F);
      localPath.lineTo(62.006F, 237.001F);
      localPath.cubicTo(55.938F, 237.001F, 51.0F, 232.063F, 51.0F, 225.994F);
      localPath.lineTo(51.0F, 14.007F);
      localPath.cubicTo(51.0F, 7.938F, 55.938F, 3.001F, 62.006F, 3.001F);
      localPath.lineTo(407.993F, 3.001F);
      localPath.cubicTo(414.063F, 3.001F, 419.0F, 7.938F, 419.0F, 14.007F);
      localPath.lineTo(419.0F, 97.39F);
      localPath.lineTo(422.0F, 97.39F);
      localPath.lineTo(422.0F, 14.007F);
      localPath.cubicTo(422.0F, 6.266F, 415.729F, 0.0F, 407.993F, 0.0F);
      localPath.lineTo(62.007F, 0.0F);
      localPath.cubicTo(54.276F, 0.0F, 48.0F, 6.271F, 48.0F, 14.007F);
      localPath.lineTo(48.0F, 225.994F);
      localPath.cubicTo(48.0F, 233.735F, 54.271F, 240.0F, 62.007F, 240.0F);
      localPath.lineTo(216.0F, 240.0F);
      localPath.lineTo(216.0F, 271.0F);
      localPath.lineTo(163.0F, 276.0F);
      localPath.lineTo(163.0F, 287.0F);
      localPath.lineTo(307.0F, 287.0F);
      localPath.lineTo(307.0F, 276.0F);
      localPath.lineTo(254.0F, 271.0F);
      localPath.lineTo(254.0F, 240.0F);
      localPath.close();
      localPath.moveTo(365.9854F, 226.0006F);
      localPath.lineTo(62.0004F, 226.0006F);
      localPath.lineTo(62.0004F, 14.0006F);
      localPath.lineTo(408.0004F, 14.0006F);
      localPath.lineTo(408.0004F, 95.3906F);
      localPath.cubicTo(408.0004F, 95.3906F, 408.9994F, 97.02239F, 408.9994F, 95.01775F);
      localPath.lineTo(408.9994F, 13.0006F);
      localPath.lineTo(60.9994F, 13.0006F);
      localPath.lineTo(60.9994F, 227.0006F);
      localPath.lineTo(365.9854F, 227.0006F);
      localPath.lineTo(365.9854F, 226.0006F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((float[])localObject3, -1.0F, 0.0F, 106.0F, 0.0F, 1.0F, 96.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject3 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject3).setColor(-13092808);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(3.0F, 183.006F);
      localPath.lineTo(3.0F, 7.994F);
      localPath.cubicTo(3.0F, 5.24F, 5.243F, 3.0F, 8.0F, 3.0F);
      localPath.lineTo(98.0F, 3.0F);
      localPath.cubicTo(100.757F, 3.0F, 103.0F, 5.24F, 103.0F, 7.994F);
      localPath.lineTo(103.0F, 183.006F);
      localPath.cubicTo(103.0F, 185.76F, 100.757F, 188.0F, 98.0F, 188.0F);
      localPath.lineTo(8.0F, 188.0F);
      localPath.cubicTo(5.243F, 188.0F, 3.0F, 185.76F, 3.0F, 183.006F);
      localPath.lineTo(3.0F, 183.006F);
      localPath.close();
      localPath.moveTo(98.0F, 191.0F);
      localPath.cubicTo(102.418F, 191.0F, 106.0F, 187.418F, 106.0F, 183.006F);
      localPath.lineTo(106.0F, 7.994F);
      localPath.cubicTo(106.0F, 3.579F, 102.412F, 0.0F, 98.0F, 0.0F);
      localPath.lineTo(8.0F, 0.0F);
      localPath.cubicTo(3.582F, 0.0F, 0.0F, 3.582F, 0.0F, 7.994F);
      localPath.lineTo(0.0F, 183.006F);
      localPath.cubicTo(0.0F, 187.421F, 3.588F, 191.0F, 8.0F, 191.0F);
      localPath.lineTo(98.0F, 191.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 35.0F, 0.0F, 1.0F, 77.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 7.0F, 0.0F, 1.0F, 10.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject3 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject3).setColor(-13092808);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(1.0F, 157.0F);
      localPath.lineTo(91.0F, 157.0F);
      localPath.lineTo(91.0F, 11.0F);
      localPath.lineTo(1.0F, 11.0F);
      localPath.lineTo(1.0F, 157.0F);
      localPath.close();
      localPath.moveTo(0.0F, 158.0F);
      localPath.lineTo(92.0F, 158.0F);
      localPath.lineTo(92.0F, 10.0F);
      localPath.lineTo(0.0F, 10.0F);
      localPath.lineTo(0.0F, 158.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject3).setColor(-15028967);
      localObject2 = c.a((float[])localObject2, -1.0F, 0.0F, 92.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(13.652F, 52.567215F);
      ((Path)localObject1).cubicTo(12.7396F, 52.567215F, 12.0F, 51.936596F, 12.0F, 51.15864F);
      ((Path)localObject1).cubicTo(12.0F, 50.38062F, 12.7396F, 49.75F, 13.652F, 49.75F);
      ((Path)localObject1).lineTo(66.348F, 49.75F);
      ((Path)localObject1).cubicTo(67.2604F, 49.75F, 68.0F, 50.38062F, 68.0F, 51.158573F);
      ((Path)localObject1).cubicTo(68.0F, 51.936527F, 67.2604F, 52.567215F, 66.348F, 52.567215F);
      ((Path)localObject1).lineTo(13.652F, 52.567215F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(77.994F, 68.137474F);
      ((Path)localObject1).lineTo(14.0060005F, 68.137474F);
      ((Path)localObject1).cubicTo(12.898087F, 68.137474F, 12.0F, 67.50686F, 12.0F, 66.728905F);
      ((Path)localObject1).lineTo(12.0F, 66.728836F);
      ((Path)localObject1).cubicTo(12.0F, 65.95088F, 12.898087F, 65.32026F, 14.0060005F, 65.32026F);
      ((Path)localObject1).lineTo(77.994F, 65.32026F);
      ((Path)localObject1).cubicTo(79.10191F, 65.32026F, 80.0F, 65.95088F, 80.0F, 66.728836F);
      ((Path)localObject1).lineTo(80.0F, 66.728905F);
      ((Path)localObject1).cubicTo(80.0F, 67.50686F, 79.10191F, 68.137474F, 77.994F, 68.137474F);
      ((Path)localObject1).lineTo(77.994F, 68.137474F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(46.024593F, 83.0F);
      ((Path)localObject1).lineTo(13.975407F, 83.0F);
      ((Path)localObject1).cubicTo(12.884389F, 83.0F, 12.0F, 82.36937F, 12.0F, 81.59139F);
      ((Path)localObject1).lineTo(12.0F, 81.59139F);
      ((Path)localObject1).cubicTo(12.0F, 80.813416F, 12.884389F, 80.182785F, 13.975407F, 80.182785F);
      ((Path)localObject1).lineTo(46.024593F, 80.182785F);
      ((Path)localObject1).cubicTo(47.115612F, 80.182785F, 48.0F, 80.813416F, 48.0F, 81.59139F);
      ((Path)localObject1).lineTo(48.0F, 81.59139F);
      ((Path)localObject1).cubicTo(47.9999F, 82.36937F, 47.115513F, 83.0F, 46.024593F, 83.0F);
      ((Path)localObject1).lineTo(46.024593F, 83.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-13092808);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(39.0F, 3.0F);
      ((Path)localObject1).lineTo(53.0F, 3.0F);
      ((Path)localObject1).lineTo(53.0F, 0.0F);
      ((Path)localObject1).lineTo(39.0F, 0.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ex.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */