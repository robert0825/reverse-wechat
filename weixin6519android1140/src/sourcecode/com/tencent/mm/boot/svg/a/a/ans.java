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

public final class ans
  extends c
{
  private final int height;
  private final int width;
  
  public ans()
  {
    GMTrace.i(15782528417792L, 117589);
    this.width = 84;
    this.height = 102;
    GMTrace.o(15782528417792L, 117589);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15782662635520L, 117590);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15782662635520L, 117590);
      return 0;
      GMTrace.o(15782662635520L, 117590);
      return 84;
      GMTrace.o(15782662635520L, 117590);
      return 102;
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
      localPath.moveTo(24.0F, 83.18272F);
      localPath.cubicTo(24.0F, 82.52952F, 24.529522F, 82.0F, 25.18272F, 82.0F);
      localPath.lineTo(58.81728F, 82.0F);
      localPath.cubicTo(59.470478F, 82.0F, 60.0F, 82.52952F, 60.0F, 83.18272F);
      localPath.lineTo(60.0F, 84.81728F);
      localPath.cubicTo(60.0F, 85.47048F, 59.470478F, 86.0F, 58.81728F, 86.0F);
      localPath.lineTo(25.18272F, 86.0F);
      localPath.cubicTo(24.529522F, 86.0F, 24.0F, 85.47048F, 24.0F, 84.81728F);
      localPath.lineTo(24.0F, 83.18272F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(27.0F, 90.18272F);
      localPath.cubicTo(27.0F, 89.52952F, 27.529522F, 89.0F, 28.18272F, 89.0F);
      localPath.lineTo(55.81728F, 89.0F);
      localPath.cubicTo(56.470478F, 89.0F, 57.0F, 89.52952F, 57.0F, 90.18272F);
      localPath.lineTo(57.0F, 91.81728F);
      localPath.cubicTo(57.0F, 92.47048F, 56.470478F, 93.0F, 55.81728F, 93.0F);
      localPath.lineTo(28.18272F, 93.0F);
      localPath.cubicTo(27.529522F, 93.0F, 27.0F, 92.47048F, 27.0F, 91.81728F);
      localPath.lineTo(27.0F, 90.18272F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(33.65881F, 99.80592F);
      localPath.cubicTo(36.252205F, 100.09449F, 38.874313F, 100.24F, 41.51551F, 100.24F);
      localPath.cubicTo(44.202103F, 100.24F, 46.868923F, 100.08944F, 49.505833F, 99.790924F);
      localPath.cubicTo(50.738846F, 99.651344F, 51.61502F, 98.62145F, 51.462826F, 97.4906F);
      localPath.cubicTo(51.31063F, 96.35975F, 50.1877F, 95.55617F, 48.954685F, 95.695755F);
      localPath.cubicTo(46.50052F, 95.97358F, 44.017757F, 96.11375F, 41.51551F, 96.11375F);
      localPath.cubicTo(39.05553F, 96.11375F, 36.614365F, 95.97828F, 34.200657F, 95.70971F);
      localPath.cubicTo(32.967335F, 95.57248F, 31.846228F, 96.3782F, 31.6966F, 97.50934F);
      localPath.cubicTo(31.546974F, 98.64048F, 32.425484F, 99.66869F, 33.65881F, 99.80592F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 1);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(43.184082F, 59.838116F);
      localPath.cubicTo(43.89884F, 61.38677F, 46.09968F, 61.387447F, 46.8154F, 59.839237F);
      localPath.lineTo(51.001774F, 50.783474F);
      localPath.cubicTo(51.56792F, 52.0063F, 52.126087F, 53.21243F, 52.65766F, 54.361786F);
      localPath.cubicTo(53.72009F, 56.658962F, 54.580425F, 58.52206F, 55.18319F, 59.831715F);
      localPath.cubicTo(55.645F, 60.835114F, 56.832783F, 61.274155F, 57.83618F, 60.812344F);
      localPath.cubicTo(58.839577F, 60.350536F, 59.27862F, 59.16275F, 58.81681F, 58.15935F);
      localPath.cubicTo(58.212776F, 56.84694F, 57.351562F, 54.98194F, 56.299217F, 52.706562F);
      localPath.cubicTo(55.528305F, 51.039715F, 54.714195F, 49.280952F, 53.900093F, 47.52319F);
      localPath.cubicTo(53.61516F, 46.907978F, 53.438774F, 46.52722F, 53.113132F, 45.82436F);
      localPath.cubicTo(52.86889F, 45.297253F, 52.86889F, 45.297253F, 52.81458F, 45.180077F);
      localPath.cubicTo(52.09798F, 43.633926F, 49.89969F, 43.635002F, 49.1846F, 45.18185F);
      localPath.lineTo(45.001472F, 54.230587F);
      localPath.lineTo(40.815918F, 45.161884F);
      localPath.cubicTo(40.101242F, 43.61342F, 37.900753F, 43.6125F, 37.184784F, 45.160366F);
      localPath.lineTo(32.999584F, 54.208397F);
      localPath.lineTo(28.81507F, 45.166F);
      localPath.cubicTo(28.351177F, 44.163567F, 27.162483F, 43.72699F, 26.160048F, 44.190884F);
      localPath.cubicTo(25.157612F, 44.654778F, 24.721037F, 45.84347F, 25.18493F, 46.845905F);
      localPath.lineTo(31.18493F, 59.81142F);
      localPath.cubicTo(31.900772F, 61.3583F, 34.099644F, 61.35811F, 34.815216F, 59.811104F);
      localPath.lineTo(38.998005F, 50.768284F);
      localPath.lineTo(43.184082F, 59.838116F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 1);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(40.0F, 4.99842F);
      localPath.cubicTo(40.0F, 3.894723F, 40.89543F, 3.0F, 42.0F, 3.0F);
      localPath.cubicTo(43.10457F, 3.0F, 44.0F, 3.894723F, 44.0F, 4.99842F);
      localPath.lineTo(44.0F, 9.00158F);
      localPath.cubicTo(44.0F, 10.105277F, 43.10457F, 11.0F, 42.0F, 11.0F);
      localPath.cubicTo(40.89543F, 11.0F, 40.0F, 10.105277F, 40.0F, 9.00158F);
      localPath.lineTo(40.0F, 4.99842F);
      localPath.close();
      localPath.moveTo(77.479294F, 21.129032F);
      localPath.cubicTo(78.33703F, 20.434452F, 79.59587F, 20.567266F, 80.291F, 21.425678F);
      localPath.cubicTo(80.98613F, 22.28409F, 80.85431F, 23.543037F, 79.996574F, 24.237616F);
      localPath.lineTo(76.88554F, 26.756886F);
      localPath.cubicTo(76.0278F, 27.451466F, 74.76896F, 27.318653F, 74.07383F, 26.460241F);
      localPath.cubicTo(73.37871F, 25.60183F, 73.51052F, 24.34288F, 74.368256F, 23.648302F);
      localPath.lineTo(77.479294F, 21.129032F);
      localPath.close();
      localPath.moveTo(4.0034227F, 24.237616F);
      localPath.cubicTo(3.145689F, 23.543037F, 3.0138714F, 22.28409F, 3.7089994F, 21.425678F);
      localPath.cubicTo(4.4041276F, 20.567266F, 5.6629705F, 20.434452F, 6.5207043F, 21.129032F);
      localPath.lineTo(9.631744F, 23.648302F);
      localPath.cubicTo(10.489477F, 24.34288F, 10.621295F, 25.60183F, 9.9261675F, 26.460241F);
      localPath.cubicTo(9.231039F, 27.318653F, 7.972196F, 27.451466F, 7.1144624F, 26.756886F);
      localPath.lineTo(4.0034227F, 24.237616F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 1);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(63.002625F, 77.73915F);
      ((Path)localObject).cubicTo(71.14804F, 71.332855F, 76.0F, 61.56439F, 76.0F, 51.0F);
      ((Path)localObject).cubicTo(76.0F, 32.222317F, 60.777683F, 17.0F, 42.0F, 17.0F);
      ((Path)localObject).cubicTo(23.222319F, 17.0F, 8.0F, 32.222317F, 8.0F, 51.0F);
      ((Path)localObject).cubicTo(8.0F, 61.605255F, 12.88979F, 71.40733F, 21.088684F, 77.810715F);
      ((Path)localObject).cubicTo(21.959215F, 78.4906F, 23.21608F, 78.33606F, 23.895967F, 77.46552F);
      ((Path)localObject).cubicTo(24.575857F, 76.59499F, 24.421312F, 75.33813F, 23.550781F, 74.65824F);
      ((Path)localObject).cubicTo(16.31238F, 69.00501F, 12.0F, 60.360413F, 12.0F, 51.0F);
      ((Path)localObject).cubicTo(12.0F, 34.431458F, 25.431458F, 21.0F, 42.0F, 21.0F);
      ((Path)localObject).cubicTo(58.568542F, 21.0F, 72.0F, 34.431458F, 72.0F, 51.0F);
      ((Path)localObject).cubicTo(72.0F, 60.324368F, 67.721016F, 68.93926F, 60.52983F, 74.59506F);
      ((Path)localObject).cubicTo(59.661613F, 75.27791F, 59.51134F, 76.535286F, 60.194183F, 77.4035F);
      ((Path)localObject).cubicTo(60.877026F, 78.27172F, 62.134407F, 78.422F, 63.002625F, 77.73915F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ans.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */