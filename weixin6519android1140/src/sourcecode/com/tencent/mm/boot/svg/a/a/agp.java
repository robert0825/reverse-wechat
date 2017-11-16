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

public final class agp
  extends c
{
  private final int height;
  private final int width;
  
  public agp()
  {
    GMTrace.i(15794608013312L, 117679);
    this.width = 120;
    this.height = 120;
    GMTrace.o(15794608013312L, 117679);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15794742231040L, 117680);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15794742231040L, 117680);
      return 0;
      GMTrace.o(15794742231040L, 117680);
      return 120;
      GMTrace.o(15794742231040L, 117680);
      return 120;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.e(paramVarArgs);
      c.d(paramVarArgs);
      Object localObject1 = c.h(paramVarArgs);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.FILL);
      Object localObject2 = c.h(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      ((Paint)localObject1).setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      c.a((Paint)localObject2, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject2).setColor(1711276032);
      Object localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(60.0F, 0.0F);
      ((Path)localObject3).cubicTo(93.137085F, 0.0F, 120.0F, 26.862915F, 120.0F, 60.0F);
      ((Path)localObject3).cubicTo(120.0F, 93.137085F, 93.137085F, 120.0F, 60.0F, 120.0F);
      ((Path)localObject3).cubicTo(26.862915F, 120.0F, 0.0F, 93.137085F, 0.0F, 60.0F);
      ((Path)localObject3).cubicTo(0.0F, 26.862915F, 26.862915F, 0.0F, 60.0F, 0.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localObject3 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject3).setColor(-1);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(60.0F, 117.0F);
      ((Path)localObject2).cubicTo(91.48023F, 117.0F, 117.0F, 91.48023F, 117.0F, 60.0F);
      ((Path)localObject2).cubicTo(117.0F, 28.51977F, 91.48023F, 3.0F, 60.0F, 3.0F);
      ((Path)localObject2).cubicTo(28.51977F, 3.0F, 3.0F, 28.51977F, 3.0F, 60.0F);
      ((Path)localObject2).cubicTo(3.0F, 91.48023F, 28.51977F, 117.0F, 60.0F, 117.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(60.0F, 120.0F);
      ((Path)localObject2).cubicTo(26.862915F, 120.0F, 0.0F, 93.137085F, 0.0F, 60.0F);
      ((Path)localObject2).cubicTo(0.0F, 26.862915F, 26.862915F, 0.0F, 60.0F, 0.0F);
      ((Path)localObject2).cubicTo(93.137085F, 0.0F, 120.0F, 26.862915F, 120.0F, 60.0F);
      ((Path)localObject2).cubicTo(120.0F, 93.137085F, 93.137085F, 120.0F, 60.0F, 120.0F);
      ((Path)localObject2).close();
      localCanvas.saveLayerAlpha(null, 204, 4);
      localObject3 = c.a((Paint)localObject3, paramVarArgs);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject3);
      localCanvas.restore();
      localObject2 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject2).setColor(-1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(46.5F, 38.223152F);
      ((Path)localObject1).cubicTo(46.5F, 36.562F, 47.656143F, 35.89766F, 49.079807F, 36.73782F);
      ((Path)localObject1).lineTo(85.92019F, 58.478794F);
      ((Path)localObject1).cubicTo(87.34498F, 59.31962F, 87.34386F, 60.68353F, 85.92019F, 61.52369F);
      ((Path)localObject1).lineTo(49.079807F, 83.26466F);
      ((Path)localObject1).cubicTo(47.655018F, 84.10549F, 46.5F, 83.43548F, 46.5F, 81.779335F);
      ((Path)localObject1).lineTo(46.5F, 38.223152F);
      ((Path)localObject1).close();
      localCanvas.saveLayerAlpha(null, 204, 4);
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\agp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */