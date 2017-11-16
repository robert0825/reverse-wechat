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

public final class do
  extends c
{
  private final int height;
  private final int width;
  
  public do()
  {
    GMTrace.i(17576079917056L, 130952);
    this.width = 144;
    this.height = 144;
    GMTrace.o(17576079917056L, 130952);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17576214134784L, 130953);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17576214134784L, 130953);
      return 0;
      GMTrace.o(17576214134784L, 130953);
      return 144;
      GMTrace.o(17576214134784L, 130953);
      return 144;
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
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-2565928);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(144.0F, 0.0F);
      localPath.lineTo(144.0F, 144.0F);
      localPath.lineTo(0.0F, 144.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.saveLayerAlpha(null, 0, 4);
      localCanvas.drawPath(localPath, c.a((Paint)localObject, paramVarArgs));
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(78.44484F, 44.162613F);
      ((Path)localObject).cubicTo(84.704666F, 51.292156F, 88.5F, 60.63898F, 88.5F, 70.87225F);
      ((Path)localObject).cubicTo(88.5F, 81.723785F, 84.23221F, 91.57853F, 77.28353F, 98.84956F);
      ((Path)localObject).lineTo(72.523056F, 95.138885F);
      ((Path)localObject).cubicTo(78.69114F, 88.90604F, 82.5F, 80.33395F, 82.5F, 70.87225F);
      ((Path)localObject).cubicTo(82.5F, 61.983555F, 79.138504F, 53.87998F, 73.6174F, 47.763412F);
      ((Path)localObject).lineTo(78.44484F, 44.162613F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(100.12927F, 27.988129F);
      ((Path)localObject).cubicTo(109.732765F, 39.648514F, 115.5F, 54.58688F, 115.5F, 70.87225F);
      ((Path)localObject).cubicTo(115.5F, 87.98085F, 109.13496F, 103.60282F, 98.64374F, 115.499306F);
      ((Path)localObject).lineTo(93.90192F, 111.80317F);
      ((Path)localObject).cubicTo(103.60352F, 100.93096F, 109.5F, 86.5902F, 109.5F, 70.87225F);
      ((Path)localObject).cubicTo(109.5F, 55.931896F, 104.17251F, 42.23584F, 95.3136F, 31.580154F);
      ((Path)localObject).lineTo(100.12927F, 27.988129F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(120.587326F, 12.728405F);
      ((Path)localObject).cubicTo(133.35962F, 28.652878F, 141.0F, 48.87031F, 141.0F, 70.87225F);
      ((Path)localObject).cubicTo(141.0F, 93.89153F, 132.63672F, 114.95747F, 118.78293F, 131.1973F);
      ((Path)localObject).lineTo(114.045685F, 127.50474F);
      ((Path)localObject).cubicTo(127.1076F, 112.28587F, 135.0F, 92.50075F, 135.0F, 70.87225F);
      ((Path)localObject).cubicTo(135.0F, 50.21541F, 127.8008F, 31.240032F, 115.77455F, 16.318272F);
      ((Path)localObject).lineTo(120.587326F, 12.728405F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(6.0F, 54.0F);
      ((Path)localObject).lineTo(27.0F, 54.0F);
      ((Path)localObject).lineTo(56.9668F, 32.595142F);
      ((Path)localObject).lineTo(56.9668F, 32.595142F);
      ((Path)localObject).cubicTo(57.416214F, 32.27413F, 58.040764F, 32.378223F, 58.361774F, 32.827637F);
      ((Path)localObject).cubicTo(58.477894F, 32.990208F, 58.54266F, 33.18383F, 58.547718F, 33.38355F);
      ((Path)localObject).lineTo(59.347828F, 64.964676F);
      ((Path)localObject).lineTo(58.533905F, 110.598976F);
      ((Path)localObject).lineTo(58.533905F, 110.598976F);
      ((Path)localObject).cubicTo(58.524055F, 111.15118F, 58.068428F, 111.590836F, 57.51623F, 111.580986F);
      ((Path)localObject).cubicTo(57.313927F, 111.57738F, 57.117477F, 111.51248F, 56.952827F, 111.394875F);
      ((Path)localObject).lineTo(27.0F, 90.0F);
      ((Path)localObject).lineTo(6.0F, 90.0F);
      ((Path)localObject).cubicTo(4.343146F, 90.0F, 3.0F, 88.65685F, 3.0F, 87.0F);
      ((Path)localObject).lineTo(3.0F, 57.0F);
      ((Path)localObject).lineTo(3.0F, 57.0F);
      ((Path)localObject).cubicTo(3.0F, 55.343147F, 4.343146F, 54.0F, 6.0F, 54.0F);
      ((Path)localObject).lineTo(6.0F, 54.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\do.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */