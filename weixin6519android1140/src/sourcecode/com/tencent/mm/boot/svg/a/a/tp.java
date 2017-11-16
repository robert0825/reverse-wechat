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

public final class tp
  extends c
{
  private final int height;
  private final int width;
  
  public tp()
  {
    GMTrace.i(15928020434944L, 118673);
    this.width = 108;
    this.height = 108;
    GMTrace.o(15928020434944L, 118673);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15928154652672L, 118674);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15928154652672L, 118674);
      return 0;
      GMTrace.o(15928154652672L, 118674);
      return 108;
      GMTrace.o(15928154652672L, 118674);
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
      ((Paint)localObject).setColor(-15028967);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(108.0F, 0.0F);
      localPath.lineTo(108.0F, 108.0F);
      localPath.lineTo(0.0F, 108.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(55.078445F, 25.00014F);
      ((Path)localObject).cubicTo(39.16226F, 25.00014F, 26.207817F, 37.891388F, 26.207817F, 53.74081F);
      ((Path)localObject).cubicTo(26.207817F, 58.80523F, 27.541147F, 63.757267F, 30.065735F, 68.10752F);
      ((Path)localObject).cubicTo(30.065735F, 68.10752F, 27.28029F, 76.87909F, 26.0F, 81.53247F);
      ((Path)localObject).cubicTo(26.0F, 81.997284F, 26.0F, 83.03247F, 28.0F, 82.50686F);
      ((Path)localObject).cubicTo(29.5F, 82.03247F, 41.27883F, 79.004906F, 41.27883F, 79.004906F);
      ((Path)localObject).cubicTo(45.511826F, 81.29943F, 50.25455F, 82.50332F, 55.074802F, 82.50686F);
      ((Path)localObject).cubicTo(71.001915F, 82.50686F, 83.967285F, 69.61561F, 83.967285F, 53.766186F);
      ((Path)localObject).cubicTo(83.986824F, 46.13662F, 80.941284F, 38.81573F, 75.508286F, 33.43238F);
      ((Path)localObject).cubicTo(70.10815F, 28.012098F, 62.748436F, 24.97629F, 55.078445F, 25.00014F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(42.859886F, 74.32476F);
      ((Path)localObject).lineTo(41.981926F, 73.80273F);
      ((Path)localObject).lineTo(32.89633F, 76.16999F);
      ((Path)localObject).lineTo(35.322556F, 67.3571F);
      ((Path)localObject).lineTo(34.75425F, 66.4508F);
      ((Path)localObject).cubicTo(32.341713F, 62.647125F, 31.066797F, 58.238754F, 31.078484F, 53.74081F);
      ((Path)localObject).cubicTo(31.094553F, 40.54703F, 41.841843F, 29.857033F, 55.100304F, 29.847046F);
      ((Path)localObject).cubicTo(61.508305F, 29.847046F, 67.54472F, 32.34119F, 72.07295F, 36.84733F);
      ((Path)localObject).cubicTo(76.586525F, 41.32263F, 79.11532F, 47.407555F, 79.09662F, 53.748062F);
      ((Path)localObject).cubicTo(79.08569F, 66.93295F, 68.31704F, 77.6527F, 55.08573F, 77.6527F);
      ((Path)localObject).cubicTo(50.78394F, 77.657074F, 46.56114F, 76.506355F, 42.859886F, 74.32476F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(63.318867F, 57.424023F);
      ((Path)localObject).cubicTo(62.65949F, 57.18476F, 62.178616F, 57.061504F, 61.690456F, 57.786545F);
      ((Path)localObject).cubicTo(61.213226F, 58.500713F, 59.82525F, 60.12118F, 59.402664F, 60.60696F);
      ((Path)localObject).cubicTo(58.980076F, 61.081863F, 58.561134F, 61.15074F, 57.843468F, 60.78822F);
      ((Path)localObject).cubicTo(57.1258F, 60.425697F, 54.79065F, 59.66803F, 52.036556F, 57.221012F);
      ((Path)localObject).cubicTo(49.89448F, 55.317776F, 48.440933F, 52.96139F, 48.018345F, 52.247223F);
      ((Path)localObject).cubicTo(47.59576F, 51.53306F, 47.97099F, 51.13791F, 48.33893F, 50.786263F);
      ((Path)localObject).cubicTo(48.67044F, 50.467243F, 49.056595F, 49.94884F, 49.420895F, 49.528316F);
      ((Path)localObject).cubicTo(49.78519F, 49.10779F, 49.898125F, 48.814148F, 50.13856F, 48.32837F);
      ((Path)localObject).cubicTo(50.378998F, 47.85347F, 50.262424F, 47.432945F, 50.080273F, 47.070423F);
      ((Path)localObject).cubicTo(49.898125F, 46.7079F, 48.451862F, 43.17332F, 47.8617F, 41.73411F);
      ((Path)localObject).cubicTo(47.282463F, 40.32753F, 46.67773F, 40.523293F, 46.233284F, 40.497917F);
      ((Path)localObject).cubicTo(45.8107F, 40.476166F, 45.33347F, 40.476166F, 44.85624F, 40.476166F);
      ((Path)localObject).cubicTo(44.37901F, 40.476166F, 43.592125F, 40.657425F, 42.932743F, 41.37159F);
      ((Path)localObject).cubicTo(42.273365F, 42.08576F, 40.404514F, 43.829483F, 40.404514F, 47.364063F);
      ((Path)localObject).cubicTo(40.404514F, 50.898643F, 42.98739F, 54.309967F, 43.35169F, 54.795746F);
      ((Path)localObject).cubicTo(43.715984F, 55.27065F, 48.440933F, 62.531948F, 55.679535F, 65.63875F);
      ((Path)localObject).cubicTo(57.399025F, 66.37467F, 58.743282F, 66.81695F, 59.78882F, 67.157715F);
      ((Path)localObject).cubicTo(61.519234F, 67.7015F, 63.08936F, 67.62174F, 64.33162F, 67.44048F);
      ((Path)localObject).cubicTo(65.71959F, 67.23747F, 68.60119F, 65.707634F, 69.205925F, 64.02916F);
      ((Path)localObject).cubicTo(69.81066F, 62.350685F, 69.81066F, 60.915104F, 69.62851F, 60.617836F);
      ((Path)localObject).cubicTo(69.45729F, 60.298817F, 68.980064F, 60.12118F, 68.251465F, 59.755035F);
      ((Path)localObject).cubicTo(67.53015F, 59.396137F, 63.97825F, 57.66329F, 63.318867F, 57.424023F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\tp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */