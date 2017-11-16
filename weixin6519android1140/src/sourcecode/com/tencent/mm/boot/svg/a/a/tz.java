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

public final class tz
  extends c
{
  private final int height;
  private final int width;
  
  public tz()
  {
    GMTrace.i(15852858507264L, 118113);
    this.width = 442;
    this.height = 384;
    GMTrace.o(15852858507264L, 118113);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15852992724992L, 118114);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15852992724992L, 118114);
      return 0;
      GMTrace.o(15852992724992L, 118114);
      return 442;
      GMTrace.o(15852992724992L, 118114);
      return 384;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject2 = c.e(paramVarArgs);
      Object localObject3 = c.d(paramVarArgs);
      Object localObject1 = c.h(paramVarArgs);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.FILL);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject1).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, -638.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject2).reset();
      ((Matrix)localObject2).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject2);
      localObject2 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject2).setColor(-1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(0.0F, 0.0F);
      ((Path)localObject3).lineTo(1080.0F, 0.0F);
      ((Path)localObject3).lineTo(1080.0F, 384.0F);
      ((Path)localObject3).lineTo(0.0F, 384.0F);
      ((Path)localObject3).lineTo(0.0F, 0.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localObject2 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject2).setColor(-16777216);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(700.6798F, 213.73169F);
      ((Path)localObject1).cubicTo(697.973F, 173.42755F, 710.4088F, 134.17123F, 738.70874F, 105.26089F);
      ((Path)localObject1).cubicTo(796.09906F, 46.63267F, 896.9981F, 52.75353F, 964.07306F, 118.932205F);
      ((Path)localObject1).cubicTo(1031.1481F, 185.11089F, 1038.999F, 286.28687F, 981.6087F, 344.91507F);
      ((Path)localObject1).cubicTo(950.7191F, 376.47092F, 907.22516F, 389.26904F, 863.185F, 384.04095F);
      ((Path)localObject1).cubicTo(858.7008F, 393.6198F, 852.6391F, 402.50076F, 844.97217F, 410.33347F);
      ((Path)localObject1).cubicTo(803.2441F, 452.9637F, 729.76733F, 448.40085F, 680.8573F, 400.142F);
      ((Path)localObject1).cubicTo(631.94727F, 351.88315F, 626.1251F, 278.20294F, 667.8532F, 235.5727F);
      ((Path)localObject1).cubicTo(677.36743F, 225.85278F, 688.53217F, 218.58626F, 700.6798F, 213.73169F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(700.6798F, 213.73169F);
      ((Path)localObject1).cubicTo(703.4623F, 255.16158F, 722.245F, 297.69867F, 756.2444F, 331.24374F);
      ((Path)localObject1).cubicTo(787.21716F, 361.80264F, 825.4021F, 379.55566F, 863.185F, 384.04095F);
      ((Path)localObject1).cubicTo(883.1062F, 341.486F, 871.8916F, 285.15613F, 831.9681F, 245.76416F);
      ((Path)localObject1).cubicTo(794.2098F, 208.50858F, 741.8103F, 197.29474F, 700.6798F, 213.73169F);
      ((Path)localObject1).close();
      localCanvas.saveLayerAlpha(null, 7, 4);
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\tz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */