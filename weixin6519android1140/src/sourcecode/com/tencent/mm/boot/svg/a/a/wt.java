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

public final class wt
  extends c
{
  private final int height;
  private final int width;
  
  public wt()
  {
    GMTrace.i(15867085586432L, 118219);
    this.width = 840;
    this.height = 344;
    GMTrace.o(15867085586432L, 118219);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15867219804160L, 118220);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15867219804160L, 118220);
      return 0;
      GMTrace.o(15867219804160L, 118220);
      return 840;
      GMTrace.o(15867219804160L, 118220);
      return 344;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      float[] arrayOfFloat = c.d(paramVarArgs);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject2 = c.h(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 55.5F, 0.0F, 1.0F, -39.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      Object localObject4 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject4).setColor(58033);
      Object localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(192.01114F, 198.0F);
      ((Path)localObject3).cubicTo(180.80962F, 214.06627F, 193.6998F, 216.21704F, 193.6998F, 216.21704F);
      ((Path)localObject3).cubicTo(193.6998F, 216.21704F, 170.13867F, 218.96794F, 159.68987F, 242.41885F);
      ((Path)localObject3).cubicTo(149.24107F, 265.86978F, 126.0484F, 280.74924F, 102.0F, 274.05322F);
      ((Path)localObject3).cubicTo(109.14646F, 269.55054F, 110.953125F, 266.6204F, 109.14646F, 257.39508F);
      ((Path)localObject3).cubicTo(117.26488F, 264.45032F, 135.67538F, 266.70627F, 150.40677F, 248.60117F);
      ((Path)localObject3).cubicTo(165.13817F, 230.49605F, 165.95909F, 200.18326F, 192.01114F, 198.0F);
      ((Path)localObject3).close();
      localCanvas.saveLayerAlpha(null, 25, 4);
      localObject4 = c.a((Paint)localObject4, paramVarArgs);
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject3).setColor(58033);
      arrayOfFloat = c.a(arrayOfFloat, 0.15643446F, 0.98768836F, 408.03046F, -0.98768836F, 0.15643446F, 640.46246F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject4 = c.i(paramVarArgs);
      ((Path)localObject4).moveTo(623.119F, 42.528004F);
      ((Path)localObject4).cubicTo(611.9175F, 58.594265F, 624.8077F, 60.745037F, 624.8077F, 60.745037F);
      ((Path)localObject4).cubicTo(624.8077F, 60.745037F, 601.2466F, 63.49594F, 590.7977F, 86.94685F);
      ((Path)localObject4).cubicTo(580.34894F, 110.39777F, 557.1563F, 125.27724F, 533.1079F, 118.58123F);
      ((Path)localObject4).cubicTo(540.25433F, 114.078545F, 542.06104F, 111.148384F, 540.25433F, 101.92309F);
      ((Path)localObject4).cubicTo(548.37274F, 108.97831F, 566.78326F, 111.23428F, 581.51465F, 93.129166F);
      ((Path)localObject4).cubicTo(596.24603F, 75.02405F, 597.06696F, 44.711266F, 623.119F, 42.528004F);
      ((Path)localObject4).close();
      localCanvas.saveLayerAlpha(null, 25, 4);
      localObject3 = c.a((Paint)localObject3, paramVarArgs);
      WeChatSVGRenderC2Java.setFillType((Path)localObject4, 2);
      localCanvas.drawPath((Path)localObject4, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject3).setColor(58033);
      arrayOfFloat = c.a(arrayOfFloat, 0.9659258F, -0.25881904F, 73.9371F, 0.25881904F, 0.9659258F, -184.82043F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject4 = c.i(paramVarArgs);
      ((Path)localObject4).moveTo(738.89386F, 212.39388F);
      ((Path)localObject4).cubicTo(752.1487F, 212.39388F, 762.89386F, 201.64871F, 762.89386F, 188.39388F);
      ((Path)localObject4).cubicTo(762.89386F, 175.13904F, 752.1487F, 164.39388F, 738.89386F, 164.39388F);
      ((Path)localObject4).cubicTo(725.63904F, 164.39388F, 714.89386F, 175.13904F, 714.89386F, 188.39388F);
      ((Path)localObject4).cubicTo(714.89386F, 201.64871F, 725.63904F, 212.39388F, 738.89386F, 212.39388F);
      ((Path)localObject4).close();
      ((Path)localObject4).moveTo(731.8351F, 181.33505F);
      ((Path)localObject4).lineTo(745.9527F, 181.33505F);
      ((Path)localObject4).lineTo(745.9527F, 195.4527F);
      ((Path)localObject4).lineTo(731.8351F, 195.4527F);
      ((Path)localObject4).lineTo(731.8351F, 181.33505F);
      ((Path)localObject4).close();
      localCanvas.saveLayerAlpha(null, 25, 4);
      localObject3 = c.a((Paint)localObject3, paramVarArgs);
      WeChatSVGRenderC2Java.setFillType((Path)localObject4, 2);
      localCanvas.drawPath((Path)localObject4, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.restore();
      localObject4 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject4).setColor(58033);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(24.0F, 369.0F);
      ((Path)localObject3).cubicTo(37.254833F, 369.0F, 48.0F, 358.25482F, 48.0F, 345.0F);
      ((Path)localObject3).cubicTo(48.0F, 331.74518F, 37.254833F, 321.0F, 24.0F, 321.0F);
      ((Path)localObject3).cubicTo(10.745166F, 321.0F, 0.0F, 331.74518F, 0.0F, 345.0F);
      ((Path)localObject3).cubicTo(0.0F, 358.25482F, 10.745166F, 369.0F, 24.0F, 369.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(16.941177F, 337.94116F);
      ((Path)localObject3).lineTo(31.058823F, 337.94116F);
      ((Path)localObject3).lineTo(31.058823F, 352.05884F);
      ((Path)localObject3).lineTo(16.941177F, 352.05884F);
      ((Path)localObject3).lineTo(16.941177F, 337.94116F);
      ((Path)localObject3).close();
      localCanvas.saveLayerAlpha(null, 25, 4);
      localObject4 = c.a((Paint)localObject4, paramVarArgs);
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 0.82903755F, 0.5591929F, 139.50002F, -0.5591929F, 0.82903755F, 49.48857F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(58033);
      ((Paint)localObject2).setStrokeWidth(7.5F);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(8.526513E-14F, 3.0F);
      ((Path)localObject3).cubicTo(8.526513E-14F, 1.3431456F, 1.3431456F, -8.526513E-14F, 3.0F, -8.526513E-14F);
      ((Path)localObject3).lineTo(85.5F, -8.526513E-14F);
      ((Path)localObject3).cubicTo(87.15685F, -8.526513E-14F, 88.5F, 1.3431456F, 88.5F, 3.0F);
      ((Path)localObject3).lineTo(88.5F, 97.5F);
      ((Path)localObject3).cubicTo(88.5F, 99.15685F, 87.15685F, 100.5F, 85.5F, 100.5F);
      ((Path)localObject3).lineTo(3.0F, 100.5F);
      ((Path)localObject3).cubicTo(1.3431456F, 100.5F, 8.526513E-14F, 99.15685F, 8.526513E-14F, 97.5F);
      ((Path)localObject3).lineTo(8.526513E-14F, 3.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(8.526513E-14F, 3.0F);
      ((Path)localObject2).cubicTo(8.526513E-14F, 1.3431456F, 1.3431456F, -8.526513E-14F, 3.0F, -8.526513E-14F);
      ((Path)localObject2).lineTo(85.5F, -8.526513E-14F);
      ((Path)localObject2).cubicTo(87.15685F, -8.526513E-14F, 88.5F, 1.3431456F, 88.5F, 3.0F);
      ((Path)localObject2).lineTo(88.5F, 97.5F);
      ((Path)localObject2).cubicTo(88.5F, 99.15685F, 87.15685F, 100.5F, 85.5F, 100.5F);
      ((Path)localObject2).lineTo(3.0F, 100.5F);
      ((Path)localObject2).cubicTo(1.3431456F, 100.5F, 8.526513E-14F, 99.15685F, 8.526513E-14F, 97.5F);
      ((Path)localObject2).lineTo(8.526513E-14F, 3.0F);
      ((Path)localObject2).close();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject2).setColor(58033);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(44.25F, 56.28F);
      ((Path)localObject3).cubicTo(50.915073F, 56.28F, 56.31818F, 50.880554F, 56.31818F, 44.22F);
      ((Path)localObject3).cubicTo(56.31818F, 37.559444F, 50.915073F, 32.16F, 44.25F, 32.16F);
      ((Path)localObject3).cubicTo(37.584927F, 32.16F, 32.18182F, 37.559444F, 32.18182F, 44.22F);
      ((Path)localObject3).cubicTo(32.18182F, 50.880554F, 37.584927F, 56.28F, 44.25F, 56.28F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(8.045455F, 16.08F);
      ((Path)localObject3).cubicTo(8.017179F, 23.141752F, 17.412853F, 34.57798F, 28.15909F, 40.2F);
      ((Path)localObject3).cubicTo(27.56025F, 44.113266F, 27.994614F, 46.796185F, 27.994614F, 47.546505F);
      ((Path)localObject3).cubicTo(22.612373F, 45.543724F, 8.045455F, 39.229103F, 4.481619F, 32.930923F);
      ((Path)localObject3).cubicTo(4.481619F, 26.154446F, 8.017179F, 9.852983F, 8.045455F, 16.08F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(80.454544F, 17.471193F);
      ((Path)localObject3).cubicTo(80.48282F, 24.532946F, 71.08714F, 35.969173F, 60.340908F, 41.591194F);
      ((Path)localObject3).cubicTo(60.93975F, 45.50446F, 60.505386F, 48.187378F, 60.505386F, 48.9377F);
      ((Path)localObject3).cubicTo(65.88763F, 46.934917F, 80.454544F, 40.620296F, 84.01838F, 34.322117F);
      ((Path)localObject3).cubicTo(84.01838F, 27.545639F, 80.48282F, 11.244177F, 80.454544F, 17.471193F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      localObject3 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject3).setColor(58033);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(733.82465F, 321.0F);
      ((Path)localObject2).cubicTo(733.82465F, 321.0F, 721.42267F, 286.58148F, 673.47174F, 283.11575F);
      ((Path)localObject2).cubicTo(667.1276F, 282.60178F, 667.25073F, 288.0679F, 673.63055F, 288.0679F);
      ((Path)localObject2).cubicTo(680.0103F, 288.0679F, 712.88446F, 288.0679F, 733.82465F, 321.0F);
      ((Path)localObject2).close();
      localCanvas.saveLayerAlpha(null, 25, 4);
      localObject3 = c.a((Paint)localObject3, paramVarArgs);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(58033);
      localObject2 = c.a(arrayOfFloat, 0.8660254F, -0.5F, 232.2376F, 0.5F, 0.8660254F, -285.60236F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(652.9379F, 279.51837F);
      ((Path)localObject1).cubicTo(653.6583F, 282.7544F, 656.86755F, 285.96213F, 660.1017F, 286.6821F);
      ((Path)localObject1).lineTo(668.7375F, 288.60452F);
      ((Path)localObject1).cubicTo(673.5889F, 289.6845F, 673.586F, 291.43622F, 668.7375F, 292.51553F);
      ((Path)localObject1).lineTo(660.1017F, 294.43796F);
      ((Path)localObject1).cubicTo(656.86566F, 295.15833F, 653.6579F, 298.36752F, 652.9379F, 301.6017F);
      ((Path)localObject1).lineTo(651.01556F, 310.23746F);
      ((Path)localObject1).cubicTo(649.93555F, 315.08896F, 648.18384F, 315.08597F, 647.1045F, 310.23746F);
      ((Path)localObject1).lineTo(645.1821F, 301.6017F);
      ((Path)localObject1).cubicTo(644.46173F, 298.36566F, 641.25256F, 295.15793F, 638.0184F, 294.43796F);
      ((Path)localObject1).lineTo(629.3826F, 292.51553F);
      ((Path)localObject1).cubicTo(624.5311F, 291.43555F, 624.53406F, 289.68387F, 629.3826F, 288.60452F);
      ((Path)localObject1).lineTo(638.0184F, 286.6821F);
      ((Path)localObject1).cubicTo(641.2544F, 285.96173F, 644.46216F, 282.75253F, 645.1821F, 279.51837F);
      ((Path)localObject1).lineTo(647.1045F, 270.8826F);
      ((Path)localObject1).cubicTo(648.1845F, 266.0311F, 649.9362F, 266.0341F, 651.01556F, 270.8826F);
      ((Path)localObject1).lineTo(652.9379F, 279.51837F);
      ((Path)localObject1).close();
      localCanvas.saveLayerAlpha(null, 25, 4);
      localPaint = c.a(localPaint, paramVarArgs);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\wt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */