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

public final class g
  extends c
{
  private final int height;
  private final int width;
  
  public g()
  {
    GMTrace.i(15944931868672L, 118799);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15944931868672L, 118799);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15945066086400L, 118800);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15945066086400L, 118800);
      return 0;
      GMTrace.o(15945066086400L, 118800);
      return 96;
      GMTrace.o(15945066086400L, 118800);
      return 96;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject3 = c.d(paramVarArgs);
      Object localObject2 = c.h(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-1);
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 9.0F, 0.0F, 1.0F, 21.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(16.0F, 3.0F);
      ((Path)localObject3).cubicTo(27.571133F, -2.8609138F, 43.519093F, -0.13518363F, 52.0F, 10.0F);
      ((Path)localObject3).cubicTo(55.015995F, 12.687686F, 56.702606F, 16.060032F, 58.0F, 20.0F);
      ((Path)localObject3).cubicTo(53.84834F, 22.386908F, 54.956116F, 27.709045F, 55.0F, 32.0F);
      ((Path)localObject3).cubicTo(51.89227F, 32.106026F, 48.828426F, 31.668318F, 46.0F, 32.0F);
      ((Path)localObject3).cubicTo(40.42531F, 34.334362F, 40.385387F, 43.516293F, 46.0F, 46.0F);
      ((Path)localObject3).cubicTo(47.032036F, 45.804314F, 48.23961F, 46.003273F, 49.0F, 46.0F);
      ((Path)localObject3).cubicTo(42.640858F, 51.18614F, 33.9583F, 53.921818F, 25.0F, 53.0F);
      ((Path)localObject3).cubicTo(21.613102F, 52.42963F, 18.130098F, 50.758377F, 15.0F, 50.0F);
      ((Path)localObject3).cubicTo(10.964495F, 49.7039F, 7.6112313F, 51.295567F, 4.0F, 52.0F);
      ((Path)localObject3).cubicTo(4.4276276F, 48.201763F, 7.4315925F, 44.073376F, 5.0F, 41.0F);
      ((Path)localObject3).cubicTo(0.8348453F, 35.28936F, -0.87172616F, 28.425297F, 3.5527137E-15F, 22.0F);
      ((Path)localObject3).cubicTo(1.9625797F, 13.652635F, 8.1102295F, 6.758725F, 16.0F, 3.0F);
      ((Path)localObject3).lineTo(16.0F, 3.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(59.0F, 25.0F);
      ((Path)localObject2).cubicTo(60.022385F, 23.507645F, 63.989056F, 23.527437F, 65.0F, 25.0F);
      ((Path)localObject2).cubicTo(65.397224F, 28.960669F, 65.11956F, 32.513546F, 65.0F, 36.0F);
      ((Path)localObject2).cubicTo(68.62015F, 36.086216F, 72.041405F, 35.95756F, 75.0F, 36.0F);
      ((Path)localObject2).cubicTo(78.40791F, 35.710144F, 78.48725F, 39.896404F, 77.0F, 42.0F);
      ((Path)localObject2).cubicTo(73.34049F, 42.5289F, 69.1854F, 41.727276F, 65.0F, 42.0F);
      ((Path)localObject2).cubicTo(65.16914F, 45.20098F, 65.29806F, 48.42727F, 65.0F, 52.0F);
      ((Path)localObject2).cubicTo(65.26831F, 54.563156F, 60.756218F, 54.444397F, 59.0F, 53.0F);
      ((Path)localObject2).cubicTo(58.336548F, 49.476307F, 59.0803F, 45.646328F, 59.0F, 42.0F);
      ((Path)localObject2).cubicTo(55.440876F, 41.945F, 52.01962F, 42.06376F, 49.0F, 42.0F);
      ((Path)localObject2).cubicTo(45.16719F, 42.509106F, 45.117607F, 35.621075F, 49.0F, 36.0F);
      ((Path)localObject2).cubicTo(51.970036F, 35.95756F, 55.411125F, 36.086216F, 59.0F, 36.0F);
      ((Path)localObject2).cubicTo(58.93155F, 32.513546F, 58.643967F, 28.970564F, 59.0F, 25.0F);
      ((Path)localObject2).lineTo(59.0F, 25.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */