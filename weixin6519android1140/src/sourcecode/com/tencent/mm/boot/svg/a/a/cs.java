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

public final class cs
  extends c
{
  private final int height;
  private final int width;
  
  public cs()
  {
    GMTrace.i(18801353555968L, 140081);
    this.width = 30;
    this.height = 30;
    GMTrace.o(18801353555968L, 140081);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18801487773696L, 140082);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(18801487773696L, 140082);
      return 0;
      GMTrace.o(18801487773696L, 140082);
      return 30;
      GMTrace.o(18801487773696L, 140082);
      return 30;
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
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-9074981);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -350.0F, 0.0F, 1.0F, -661.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(372.0F, 661.0F);
      ((Path)localObject2).cubicTo(369.8465F, 661.0F, 368.307F, 661.45575F, 367.0F, 662.0F);
      ((Path)localObject2).cubicTo(364.6025F, 663.65375F, 363.0F, 666.1686F, 363.0F, 669.0F);
      ((Path)localObject2).lineTo(363.0F, 681.0F);
      ((Path)localObject2).cubicTo(363.0F, 683.11066F, 360.985F, 684.85187F, 359.0F, 685.0F);
      ((Path)localObject2).cubicTo(356.0145F, 684.85187F, 354.0F, 683.11066F, 354.0F, 681.0F);
      ((Path)localObject2).cubicTo(354.0F, 679.4344F, 355.023F, 678.1158F, 357.0F, 677.0F);
      ((Path)localObject2).cubicTo(356.6145F, 677.43445F, 356.723F, 677.39087F, 357.0F, 677.0F);
      ((Path)localObject2).cubicTo(357.769F, 676.9636F, 358.5705F, 676.2336F, 359.0F, 675.0F);
      ((Path)localObject2).cubicTo(359.3075F, 674.1341F, 358.4895F, 673.1199F, 357.0F, 673.0F);
      ((Path)localObject2).cubicTo(356.6805F, 673.1199F, 356.3145F, 673.1831F, 356.0F, 673.0F);
      ((Path)localObject2).cubicTo(355.96F, 673.2977F, 355.9585F, 673.2982F, 356.0F, 673.0F);
      ((Path)localObject2).cubicTo(353.863F, 673.922F, 352.1155F, 675.2888F, 351.0F, 677.0F);
      ((Path)localObject2).cubicTo(350.389F, 678.2278F, 350.0F, 679.5526F, 350.0F, 681.0F);
      ((Path)localObject2).cubicTo(350.0F, 685.3947F, 353.813F, 689.0F, 359.0F, 689.0F);
      ((Path)localObject2).cubicTo(360.1535F, 689.0F, 361.693F, 688.54425F, 363.0F, 688.0F);
      ((Path)localObject2).cubicTo(365.3975F, 686.34625F, 367.0F, 683.8314F, 367.0F, 681.0F);
      ((Path)localObject2).lineTo(367.0F, 669.0F);
      ((Path)localObject2).cubicTo(367.0F, 666.88934F, 369.0145F, 665.14813F, 372.0F, 665.0F);
      ((Path)localObject2).cubicTo(373.985F, 665.14813F, 376.0F, 666.88934F, 376.0F, 669.0F);
      ((Path)localObject2).cubicTo(376.0F, 670.631F, 374.8905F, 672.0009F, 373.0F, 673.0F);
      ((Path)localObject2).cubicTo(372.2775F, 672.9576F, 371.438F, 673.7265F, 371.0F, 675.0F);
      ((Path)localObject2).cubicTo(370.681F, 675.88306F, 371.495F, 676.8931F, 373.0F, 677.0F);
      ((Path)localObject2).cubicTo(373.263F, 676.8931F, 373.593F, 676.835F, 374.0F, 677.0F);
      ((Path)localObject2).cubicTo(373.967F, 676.72565F, 374.019F, 676.70905F, 374.0F, 677.0F);
      ((Path)localObject2).cubicTo(376.152F, 676.0661F, 377.889F, 674.7034F, 379.0F, 673.0F);
      ((Path)localObject2).cubicTo(379.611F, 671.77277F, 380.0F, 670.4474F, 380.0F, 669.0F);
      ((Path)localObject2).cubicTo(380.0F, 664.6053F, 376.187F, 661.0F, 372.0F, 661.0F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\cs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */