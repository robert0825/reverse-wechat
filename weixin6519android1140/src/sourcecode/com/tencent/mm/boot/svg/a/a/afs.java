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

public final class afs
  extends c
{
  private final int height;
  private final int width;
  
  public afs()
  {
    GMTrace.i(15732330987520L, 117215);
    this.width = 79;
    this.height = 71;
    GMTrace.o(15732330987520L, 117215);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15732465205248L, 117216);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15732465205248L, 117216);
      return 0;
      GMTrace.o(15732465205248L, 117216);
      return 79;
      GMTrace.o(15732465205248L, 117216);
      return 71;
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
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(85.5F, 0.0F);
      ((Path)localObject3).cubicTo(132.72035F, 0.0F, 171.0F, 38.27965F, 171.0F, 85.5F);
      ((Path)localObject3).cubicTo(171.0F, 132.72035F, 132.72035F, 171.0F, 85.5F, 171.0F);
      ((Path)localObject3).cubicTo(38.27965F, 171.0F, 0.0F, 132.72035F, 0.0F, 85.5F);
      ((Path)localObject3).cubicTo(0.0F, 38.27965F, 38.27965F, 0.0F, 85.5F, 0.0F);
      ((Path)localObject3).close();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-11119016);
      localCanvas.save();
      localObject3 = c.a(localPaint, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(45.426636F, 45.59831F);
      localPath.cubicTo(45.064354F, 45.11882F, 43.726395F, 43.143467F, 43.855465F, 40.273315F);
      localPath.cubicTo(43.958363F, 37.98519F, 43.95621F, 38.081062F, 46.194515F, 34.502163F);
      localPath.cubicTo(49.676476F, 32.289948F, 51.986675F, 28.397346F, 51.986675F, 23.964699F);
      localPath.lineTo(51.986675F, 15.349729F);
      localPath.cubicTo(51.986675F, 8.456272F, 46.40566F, 2.8766654F, 39.521126F, 2.8766654F);
      localPath.cubicTo(32.63508F, 2.8766654F, 27.055576F, 8.461046F, 27.055576F, 15.349729F);
      localPath.lineTo(27.055576F, 23.964699F);
      localPath.cubicTo(27.055576F, 28.400461F, 29.36645F, 32.292213F, 32.84851F, 34.5034F);
      localPath.cubicTo(35.08604F, 38.08104F, 35.0839F, 37.985455F, 35.186787F, 40.273315F);
      localPath.cubicTo(35.33592F, 43.589542F, 33.526573F, 45.71122F, 33.526573F, 45.71122F);
      localPath.lineTo(33.62935F, 45.77257F);
      localPath.lineTo(10.716543F, 57.88848F);
      localPath.cubicTo(9.505955F, 58.52862F, 8.332478F, 60.158325F, 8.111063F, 61.520306F);
      localPath.lineTo(7.9130507F, 62.738335F);
      localPath.cubicTo(7.690893F, 64.10488F, 8.635479F, 65.204414F, 10.021183F, 65.204414F);
      localPath.lineTo(70.02355F, 65.204414F);
      localPath.cubicTo(71.40404F, 65.204414F, 72.32937F, 64.10031F, 72.07869F, 62.738335F);
      localPath.lineTo(71.8545F, 61.520306F);
      localPath.cubicTo(71.602974F, 60.153755F, 70.40501F, 58.551296F, 69.17688F, 57.93091F);
      localPath.cubicTo(69.17688F, 57.93091F, 52.214314F, 49.392006F, 45.426636F, 45.59831F);
      localPath.close();
      localPath.moveTo(23.92041F, 22.062311F);
      localPath.lineTo(23.92041F, 15.751036F);
      localPath.cubicTo(23.92041F, 7.051979F, 30.904785F, 0.0F, 39.52468F, 0.0F);
      localPath.cubicTo(48.142685F, 0.0F, 55.128956F, 7.0538344F, 55.128956F, 15.751036F);
      localPath.lineTo(55.128956F, 22.062311F);
      localPath.cubicTo(55.128956F, 26.404568F, 52.825817F, 32.581375F, 49.987305F, 35.855644F);
      localPath.lineTo(48.319912F, 37.77901F);
      localPath.cubicTo(46.04784F, 40.399883F, 46.733746F, 43.733063F, 49.852333F, 45.224068F);
      localPath.lineTo(69.62199F, 54.675987F);
      localPath.cubicTo(71.959305F, 55.793465F, 74.15126F, 58.799007F, 74.51585F, 61.3749F);
      localPath.lineTo(74.97153F, 64.594444F);
      localPath.cubicTo(75.21618F, 66.32298F, 73.85184F, 68.16248F, 72.12305F, 68.078285F);
      localPath.lineTo(6.604266F, 68.078285F);
      localPath.cubicTo(4.8753734F, 68.16248F, 3.8324857F, 66.327934F, 4.0778384F, 64.594444F);
      localPath.lineTo(4.533522F, 61.3749F);
      localPath.cubicTo(4.899003F, 58.79267F, 7.0950084F, 55.790688F, 9.41165F, 54.682594F);
      localPath.lineTo(29.197031F, 45.21887F);
      localPath.cubicTo(32.315434F, 43.727276F, 33.002815F, 40.396038F, 30.72945F, 37.77501F);
      localPath.lineTo(29.06206F, 35.852623F);
      localPath.cubicTo(26.222404F, 32.5787F, 23.92041F, 26.403929F, 23.92041F, 22.062311F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint, paramVarArgs);
      localObject2 = c.a((float[])localObject2, -1.0F, 0.0F, 27.333248F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(1.8318651F, 11.024287F);
      ((Path)localObject1).cubicTo(6.47523F, 11.364725F, 10.115674F, 15.24173F, 10.088107F, 19.9702F);
      ((Path)localObject1).lineTo(10.056429F, 25.403927F);
      ((Path)localObject1).cubicTo(10.03919F, 28.36074F, 8.595826F, 31.033453F, 6.379834F, 32.744877F);
      ((Path)localObject1).cubicTo(6.3019724F, 32.91909F, 6.1928797F, 33.109375F, 6.049243F, 33.316998F);
      ((Path)localObject1).cubicTo(3.9072914F, 36.41312F, 4.3254013F, 36.22716F, 4.3254013F, 38.0F);
      ((Path)localObject1).cubicTo(4.3254013F, 39.129623F, 4.2810683F, 40.577164F, 4.835036F, 41.62398F);
      ((Path)localObject1).cubicTo(5.3650746F, 42.62558F, 6.058379F, 43.33712F, 6.4863653F, 43.717873F);
      ((Path)localObject1).cubicTo(12.0072775F, 46.570488F, 21.32859F, 51.07534F, 21.32859F, 51.07534F);
      ((Path)localObject1).cubicTo(22.568909F, 51.677437F, 23.727386F, 53.27528F, 23.915657F, 54.64085F);
      ((Path)localObject1).lineTo(24.350327F, 57.793613F);
      ((Path)localObject1).cubicTo(24.35982F, 57.86246F, 24.366398F, 57.930397F, 24.370157F, 57.997326F);
      ((Path)localObject1).lineTo(25.302315F, 57.997326F);
      ((Path)localObject1).cubicTo(26.593607F, 58.05956F, 27.492397F, 57.023796F, 27.309658F, 55.746117F);
      ((Path)localObject1).lineTo(26.969294F, 53.366337F);
      ((Path)localObject1).cubicTo(26.696974F, 51.46232F, 25.059736F, 49.24072F, 23.313917F, 48.414715F);
      ((Path)localObject1).lineTo(8.54735F, 41.42816F);
      ((Path)localObject1).cubicTo(7.0193176F, 39.192307F, 7.194654F, 37.7021F, 7.360811F, 35.922062F);
      ((Path)localObject1).lineTo(8.648165F, 34.50333F);
      ((Path)localObject1).cubicTo(10.768336F, 32.083096F, 13.291223F, 27.5174F, 13.291223F, 24.307745F);
      ((Path)localObject1).lineTo(13.291223F, 19.642654F);
      ((Path)localObject1).cubicTo(13.291223F, 13.213965F, 7.2703595F, 8.0F, 0.83330566F, 8.0F);
      ((Path)localObject1).cubicTo(0.55311376F, 8.0F, 0.27523544F, 8.0098715F, -7.5495166E-15F, 8.029286F);
      ((Path)localObject1).cubicTo(0.6909507F, 8.936287F, 1.3045083F, 9.950972F, 1.8318651F, 11.024287F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(53.820503F, 11.001198F);
      ((Path)localObject2).cubicTo(58.981113F, 11.082424F, 63.1143F, 15.285621F, 63.08271F, 20.472427F);
      ((Path)localObject2).lineTo(63.061825F, 23.9017F);
      ((Path)localObject2).cubicTo(63.041103F, 27.304077F, 61.232307F, 30.346895F, 58.53236F, 32.10642F);
      ((Path)localObject2).cubicTo(58.53904F, 32.422142F, 58.393166F, 32.81987F, 58.049244F, 33.316998F);
      ((Path)localObject2).cubicTo(55.90729F, 36.41312F, 56.04546F, 36.281353F, 56.04546F, 38.0F);
      ((Path)localObject2).cubicTo(56.04546F, 39.129623F, 56.281067F, 40.577164F, 56.835037F, 41.62398F);
      ((Path)localObject2).cubicTo(57.365074F, 42.62558F, 58.05838F, 43.33712F, 58.486366F, 43.717873F);
      ((Path)localObject2).cubicTo(64.00728F, 46.570488F, 73.32859F, 51.07534F, 73.32859F, 51.07534F);
      ((Path)localObject2).cubicTo(74.56891F, 51.677437F, 75.72739F, 53.27528F, 75.91566F, 54.64085F);
      ((Path)localObject2).lineTo(76.35033F, 57.793613F);
      ((Path)localObject2).cubicTo(76.35982F, 57.86246F, 76.3664F, 57.930397F, 76.370155F, 57.997326F);
      ((Path)localObject2).lineTo(77.302315F, 57.997326F);
      ((Path)localObject2).cubicTo(78.593605F, 58.05956F, 79.49239F, 57.023796F, 79.30966F, 55.746117F);
      ((Path)localObject2).lineTo(78.96929F, 53.366337F);
      ((Path)localObject2).cubicTo(78.696976F, 51.46232F, 77.05974F, 49.24072F, 75.31392F, 48.414715F);
      ((Path)localObject2).lineTo(60.54735F, 41.42816F);
      ((Path)localObject2).cubicTo(59.019318F, 39.192307F, 58.91311F, 37.824722F, 59.079266F, 36.044685F);
      ((Path)localObject2).lineTo(60.74255F, 34.108715F);
      ((Path)localObject2).cubicTo(62.86272F, 31.688482F, 65.943375F, 27.5174F, 65.943375F, 24.307745F);
      ((Path)localObject2).lineTo(65.943375F, 19.642654F);
      ((Path)localObject2).cubicTo(65.943375F, 13.213965F, 59.27036F, 8.0F, 52.833305F, 8.0F);
      ((Path)localObject2).cubicTo(52.553112F, 8.0F, 52.275234F, 8.0098715F, 52.0F, 8.029286F);
      ((Path)localObject2).cubicTo(52.685993F, 8.92978F, 53.2957F, 9.9364195F, 53.820503F, 11.001198F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\afs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */