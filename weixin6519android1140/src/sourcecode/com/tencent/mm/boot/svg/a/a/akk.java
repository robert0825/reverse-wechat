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

public final class akk
  extends c
{
  private final int height;
  private final int width;
  
  public akk()
  {
    GMTrace.i(15901176889344L, 118473);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15901176889344L, 118473);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15901311107072L, 118474);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15901311107072L, 118474);
      return 0;
      GMTrace.o(15901311107072L, 118474);
      return 96;
      GMTrace.o(15901311107072L, 118474);
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
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-15028967);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 20.0F, 0.0F, 1.0F, 21.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(20.74746F, 32.321507F);
      ((Path)localObject2).cubicTo(26.264082F, 37.838127F, 31.491142F, 40.425617F, 33.424133F, 40.274094F);
      ((Path)localObject2).cubicTo(35.35712F, 40.12257F, 40.170807F, 36.81219F, 42.443256F, 36.856255F);
      ((Path)localObject2).cubicTo(43.535416F, 36.87743F, 50.672344F, 41.704136F, 51.53627F, 42.26218F);
      ((Path)localObject2).cubicTo(52.400192F, 42.820225F, 53.201244F, 43.47209F, 53.050617F, 44.296967F);
      ((Path)localObject2).cubicTo(52.899994F, 45.12184F, 49.763397F, 54.207813F, 41.755672F, 52.949615F);
      ((Path)localObject2).cubicTo(33.747948F, 51.691418F, 22.584057F, 43.058952F, 16.222599F, 36.846367F);
      ((Path)localObject2).lineTo(20.74746F, 32.321507F);
      ((Path)localObject2).lineTo(20.74746F, 32.321507F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(20.74746F, 32.321507F);
      ((Path)localObject2).cubicTo(15.230838F, 26.804884F, 12.643348F, 21.577822F, 12.794871F, 19.644833F);
      ((Path)localObject2).cubicTo(12.946394F, 17.711843F, 16.256773F, 12.89816F, 16.212711F, 10.625708F);
      ((Path)localObject2).cubicTo(16.191534F, 9.533548F, 11.364832F, 2.3966224F, 10.806786F, 1.5326972F);
      ((Path)localObject2).cubicTo(10.248739F, 0.6687721F, 9.596872F, -0.13227762F, 8.771998F, 0.01834671F);
      ((Path)localObject2).cubicTo(7.947124F, 0.16897105F, -1.1388476F, 3.3055677F, 0.11935101F, 11.313293F);
      ((Path)localObject2).cubicTo(1.3775496F, 19.32102F, 10.010014F, 30.48491F, 16.222599F, 36.846367F);
      ((Path)localObject2).lineTo(20.74746F, 32.321507F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(28.0F, 3.8234966F);
      ((Path)localObject2).cubicTo(28.0F, 3.368692F, 28.384283F, 3.0F, 28.856068F, 3.0F);
      ((Path)localObject2).lineTo(45.143932F, 3.0F);
      ((Path)localObject2).cubicTo(45.616726F, 3.0F, 46.0F, 3.36727F, 46.0F, 3.8234966F);
      ((Path)localObject2).lineTo(46.0F, 16.176504F);
      ((Path)localObject2).cubicTo(46.0F, 16.631308F, 45.61572F, 17.0F, 45.143932F, 17.0F);
      ((Path)localObject2).lineTo(28.856068F, 17.0F);
      ((Path)localObject2).cubicTo(28.383274F, 17.0F, 28.0F, 16.63273F, 28.0F, 16.176504F);
      ((Path)localObject2).lineTo(28.0F, 3.8234966F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(54.6875F, 17.939888F);
      ((Path)localObject2).cubicTo(55.392006F, 18.168455F, 56.0F, 17.719242F, 56.0F, 17.031927F);
      ((Path)localObject2).lineTo(56.0F, 2.9585342F);
      ((Path)localObject2).cubicTo(56.0F, 2.189203F, 55.327656F, 1.8663305F, 54.6875F, 2.0505733F);
      ((Path)localObject2).cubicTo(54.307777F, 2.3871007F, 51.20473F, 5.3116455F, 49.0F, 7.3502574F);
      ((Path)localObject2).lineTo(49.0F, 12.586108F);
      ((Path)localObject2).cubicTo(51.2585F, 14.652606F, 54.430782F, 17.66358F, 54.6875F, 17.939888F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\akk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */