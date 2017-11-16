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

public final class aaa
  extends c
{
  private final int height;
  private final int width;
  
  public aaa()
  {
    GMTrace.i(21023596478464L, 156638);
    this.width = 90;
    this.height = 90;
    GMTrace.o(21023596478464L, 156638);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(21023730696192L, 156639);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(21023730696192L, 156639);
      return 0;
      GMTrace.o(21023730696192L, 156639);
      return 90;
      GMTrace.o(21023730696192L, 156639);
      return 90;
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
      localPaint2 = c.a(localPaint1, paramVarArgs);
      localPaint2.setColor(-1);
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 4.0F);
      localPath.cubicTo(0.0F, 1.7908609F, 1.7908609F, 0.0F, 4.0F, 0.0F);
      localPath.lineTo(86.0F, 0.0F);
      localPath.cubicTo(88.20914F, 0.0F, 90.0F, 1.7908609F, 90.0F, 4.0F);
      localPath.lineTo(90.0F, 86.0F);
      localPath.cubicTo(90.0F, 88.20914F, 88.20914F, 90.0F, 86.0F, 90.0F);
      localPath.lineTo(4.0F, 90.0F);
      localPath.cubicTo(1.7908609F, 90.0F, 0.0F, 88.20914F, 0.0F, 86.0F);
      localPath.lineTo(0.0F, 4.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 25.0F, 0.0F, 1.0F, 23.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-16731650);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(1.330489F, 10.218908F);
      ((Path)localObject2).lineTo(18.69964F, 20.085167F);
      ((Path)localObject2).cubicTo(19.419216F, 20.49391F, 20.589544F, 20.491829F, 21.305456F, 20.085167F);
      ((Path)localObject2).lineTo(38.674606F, 10.218908F);
      ((Path)localObject2).cubicTo(39.394184F, 9.810165F, 39.379704F, 9.183529F, 38.635887F, 8.816125F);
      ((Path)localObject2).lineTo(21.34418F, 0.27502382F);
      ((Path)localObject2).cubicTo(20.603216F, -0.09096857F, 19.404737F, -0.09237996F, 18.660917F, 0.27502382F);
      ((Path)localObject2).lineTo(1.3692116F, 8.816125F);
      ((Path)localObject2).cubicTo(0.6282494F, 9.182117F, 0.6145759F, 9.812246F, 1.330489F, 10.218908F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-371630);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(22.305946F, 22.062408F);
      ((Path)localObject2).cubicTo(21.584692F, 22.468164F, 21.0F, 23.469671F, 21.0F, 24.294716F);
      ((Path)localObject2).lineTo(21.0F, 42.597317F);
      ((Path)localObject2).cubicTo(21.0F, 43.42443F, 21.579006F, 43.74706F, 22.28357F, 43.32374F);
      ((Path)localObject2).lineTo(38.71643F, 33.450405F);
      ((Path)localObject2).cubicTo(39.425327F, 33.024483F, 40.0F, 32.006466F, 40.0F, 31.183224F);
      ((Path)localObject2).lineTo(40.0F, 13.604286F);
      ((Path)localObject2).cubicTo(40.0F, 12.77808F, 39.410534F, 12.439923F, 38.694054F, 12.842992F);
      ((Path)localObject2).lineTo(22.305946F, 22.062408F);
      ((Path)localObject2).lineTo(22.305946F, 22.062408F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(51223);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(17.694054F, 22.062408F);
      ((Path)localObject1).cubicTo(18.415308F, 22.468164F, 19.0F, 23.469671F, 19.0F, 24.294716F);
      ((Path)localObject1).lineTo(19.0F, 42.597317F);
      ((Path)localObject1).cubicTo(19.0F, 43.42443F, 18.420994F, 43.74706F, 17.71643F, 43.32374F);
      ((Path)localObject1).lineTo(1.2835687F, 33.450405F);
      ((Path)localObject1).cubicTo(0.5746733F, 33.024483F, 0.0F, 32.006466F, 0.0F, 31.183224F);
      ((Path)localObject1).lineTo(0.0F, 13.604286F);
      ((Path)localObject1).cubicTo(0.0F, 12.77808F, 0.5894669F, 12.439923F, 1.305947F, 12.842992F);
      ((Path)localObject1).lineTo(17.694054F, 22.062408F);
      ((Path)localObject1).lineTo(17.694054F, 22.062408F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\aaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */