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

public final class adn
  extends c
{
  private final int height;
  private final int width;
  
  public adn()
  {
    GMTrace.i(15738236567552L, 117259);
    this.width = 76;
    this.height = 76;
    GMTrace.o(15738236567552L, 117259);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15738370785280L, 117260);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15738370785280L, 117260);
      return 0;
      GMTrace.o(15738370785280L, 117260);
      return 76;
      GMTrace.o(15738370785280L, 117260);
      return 76;
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
      localPaint = c.a((Paint)localObject2, paramVarArgs);
      localPaint.setColor(-789517);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 4.0F);
      localPath.cubicTo(0.0F, 1.7908609F, 1.7908609F, 0.0F, 4.0F, 0.0F);
      localPath.lineTo(72.0F, 0.0F);
      localPath.cubicTo(74.20914F, 0.0F, 76.0F, 1.7908609F, 76.0F, 4.0F);
      localPath.lineTo(76.0F, 72.0F);
      localPath.cubicTo(76.0F, 74.20914F, 74.20914F, 76.0F, 72.0F, 76.0F);
      localPath.lineTo(4.0F, 76.0F);
      localPath.cubicTo(1.7908609F, 76.0F, 0.0F, 74.20914F, 0.0F, 72.0F);
      localPath.lineTo(0.0F, 4.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-5658199);
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 15.0F, 0.0F, 1.0F, 13.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(25.5F, 0.0F);
      ((Path)localObject3).cubicTo(27.985281F, 0.0F, 30.0F, 2.0147185F, 30.0F, 4.5F);
      ((Path)localObject3).cubicTo(30.0F, 6.9852815F, 27.985281F, 9.0F, 25.5F, 9.0F);
      ((Path)localObject3).cubicTo(23.014719F, 9.0F, 21.0F, 6.9852815F, 21.0F, 4.5F);
      ((Path)localObject3).cubicTo(21.0F, 2.0147185F, 23.014719F, 0.0F, 25.5F, 0.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(4.140231F, 10.026411F);
      ((Path)localObject3).cubicTo(17.423513F, 9.986368F, 30.706797F, 9.996379F, 44.0F, 10.026411F);
      ((Path)localObject3).cubicTo(43.94048F, 11.688178F, 43.910717F, 13.349946F, 43.890877F, 15.011714F);
      ((Path)localObject3).lineTo(10.786833F, 15.011714F);
      ((Path)localObject3).cubicTo(10.608268F, 23.610863F, 11.35229F, 32.33014F, 9.645998F, 40.80916F);
      ((Path)localObject3).cubicTo(8.71349F, 45.4541F, 5.162022F, 48.867733F, 1.1542207F, 51.0F);
      ((Path)localObject3).cubicTo(0.1919515F, 46.2049F, 4.0509486F, 42.450905F, 3.9616659F, 37.765923F);
      ((Path)localObject3).cubicTo(4.358478F, 28.52609F, 4.021188F, 19.27625F, 4.140231F, 10.026411F);
      ((Path)localObject3).lineTo(4.140231F, 10.026411F);
      ((Path)localObject3).lineTo(4.140231F, 10.026411F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(22.522583F, 17.0F);
      ((Path)localObject2).cubicTo(24.810589F, 17.040438F, 27.108543F, 17.050549F, 29.396551F, 17.060658F);
      ((Path)localObject2).cubicTo(29.476133F, 18.395117F, 29.545769F, 19.729574F, 29.615402F, 21.074142F);
      ((Path)localObject2).cubicTo(34.41027F, 21.084253F, 39.205135F, 21.074142F, 44.0F, 21.084253F);
      ((Path)localObject2).cubicTo(44.0F, 22.529917F, 44.0F, 23.98569F, 43.99005F, 25.431355F);
      ((Path)localObject2).cubicTo(39.145447F, 25.441463F, 34.31079F, 25.431355F, 29.476133F, 25.441463F);
      ((Path)localObject2).cubicTo(29.505978F, 27.463371F, 29.515924F, 29.48528F, 29.496029F, 31.507185F);
      ((Path)localObject2).cubicTo(33.654232F, 31.486967F, 37.802486F, 31.517296F, 41.95074F, 31.517296F);
      ((Path)localObject2).cubicTo(41.851265F, 36.046368F, 42.13975F, 40.59566F, 41.851265F, 45.124733F);
      ((Path)localObject2).cubicTo(41.9209F, 47.55102F, 39.46378F, 49.158436F, 37.255356F, 48.946136F);
      ((Path)localObject2).cubicTo(29.177698F, 49.02701F, 21.090092F, 49.02701F, 13.002487F, 48.87537F);
      ((Path)localObject2).cubicTo(13.002487F, 43.102825F, 12.992539F, 37.33028F, 13.012435F, 31.557734F);
      ((Path)localObject2).cubicTo(16.175852F, 31.547625F, 19.33927F, 31.466747F, 22.502687F, 31.466747F);
      ((Path)localObject2).cubicTo(22.522583F, 26.644499F, 22.522583F, 21.822248F, 22.522583F, 17.0F);
      ((Path)localObject2).lineTo(22.522583F, 17.0F);
      ((Path)localObject2).lineTo(22.522583F, 17.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(20.007324F, 36.01719F);
      ((Path)localObject2).cubicTo(19.997559F, 39.00472F, 19.997559F, 41.981876F, 20.007324F, 44.959034F);
      ((Path)localObject2).cubicTo(24.939476F, 44.979782F, 29.861862F, 45.10426F, 34.784245F, 44.782684F);
      ((Path)localObject2).cubicTo(34.960045F, 41.857395F, 35.02841F, 38.932106F, 34.989346F, 36.006813F);
      ((Path)localObject2).cubicTo(29.998594F, 35.99644F, 24.998075F, 35.99644F, 20.007324F, 36.01719F);
      ((Path)localObject2).lineTo(20.007324F, 36.01719F);
      ((Path)localObject2).lineTo(20.007324F, 36.01719F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\adn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */