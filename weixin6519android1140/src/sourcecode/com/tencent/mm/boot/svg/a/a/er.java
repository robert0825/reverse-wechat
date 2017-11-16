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

public final class er
  extends c
{
  private final int height;
  private final int width;
  
  public er()
  {
    GMTrace.i(15740384051200L, 117275);
    this.width = 438;
    this.height = 372;
    GMTrace.o(15740384051200L, 117275);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15740518268928L, 117276);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15740518268928L, 117276);
      return 0;
      GMTrace.o(15740518268928L, 117276);
      return 438;
      GMTrace.o(15740518268928L, 117276);
      return 372;
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
      localPath.moveTo(57.052635F, 156.0F);
      localPath.cubicTo(55.918964F, 156.0F, 55.0F, 154.65694F, 55.0F, 153.00008F);
      localPath.cubicTo(55.0F, 151.34306F, 55.918964F, 150.0F, 57.052635F, 150.0F);
      localPath.lineTo(122.528206F, 150.0F);
      localPath.cubicTo(123.66188F, 150.0F, 124.58084F, 151.34306F, 124.58084F, 152.99992F);
      localPath.cubicTo(124.58084F, 154.65678F, 123.66188F, 156.0F, 122.528206F, 156.0F);
      localPath.lineTo(57.052635F, 156.0F);
      localPath.close();
      localPath.moveTo(57.492485F, 174.68736F);
      localPath.cubicTo(56.115887F, 174.68736F, 55.0F, 173.3443F, 55.0F, 171.68744F);
      localPath.cubicTo(55.0F, 170.03043F, 56.115887F, 168.68736F, 57.492485F, 168.68736F);
      localPath.lineTo(136.99854F, 168.68736F);
      localPath.cubicTo(138.37514F, 168.68736F, 139.49103F, 170.03043F, 139.49103F, 171.68729F);
      localPath.cubicTo(139.49103F, 173.3443F, 138.37514F, 174.68736F, 136.99854F, 174.68736F);
      localPath.lineTo(57.492485F, 174.68736F);
      localPath.close();
      localPath.moveTo(97.27607F, 193.47983F);
      localPath.lineTo(57.45447F, 193.47983F);
      localPath.cubicTo(56.098866F, 193.47983F, 55.0F, 192.13673F, 55.0F, 190.47983F);
      localPath.cubicTo(55.0F, 188.82294F, 56.098866F, 187.47983F, 57.45447F, 187.47983F);
      localPath.lineTo(97.27607F, 187.47983F);
      localPath.cubicTo(98.631676F, 187.47983F, 99.730545F, 188.82294F, 99.730545F, 190.47983F);
      localPath.cubicTo(99.73042F, 192.13673F, 98.63155F, 193.47983F, 97.27607F, 193.47983F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-16777216);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(133.0F, 120.0F);
      localPath.lineTo(133.0F, 45.0F);
      localPath.lineTo(305.0F, 45.0F);
      localPath.lineTo(305.0F, 318.0F);
      localPath.lineTo(133.0F, 318.0F);
      localPath.lineTo(133.0F, 225.46962F);
      localPath.lineTo(134.5F, 225.46962F);
      localPath.lineTo(134.5F, 316.5F);
      localPath.lineTo(303.5F, 316.5F);
      localPath.lineTo(303.5F, 46.5F);
      localPath.lineTo(134.5F, 46.5F);
      localPath.lineTo(134.5F, 120.0F);
      localPath.lineTo(133.0F, 120.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-16777216);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(120.0F, 120.0F);
      localPath.lineTo(120.0F, 21.991756F);
      localPath.cubicTo(120.0F, 13.170865F, 127.1606F, 6.0F, 135.99364F, 6.0F);
      localPath.lineTo(302.00635F, 6.0F);
      localPath.cubicTo(310.8361F, 6.0F, 318.0F, 13.159754F, 318.0F, 21.991756F);
      localPath.lineTo(318.0F, 350.00824F);
      localPath.cubicTo(318.0F, 358.82913F, 310.83942F, 366.0F, 302.00635F, 366.0F);
      localPath.lineTo(135.99364F, 366.0F);
      localPath.cubicTo(127.1639F, 366.0F, 120.0F, 358.84024F, 120.0F, 350.00824F);
      localPath.lineTo(120.0F, 225.46962F);
      localPath.lineTo(123.0F, 225.46962F);
      localPath.lineTo(123.0F, 350.00754F);
      localPath.cubicTo(123.0F, 357.18307F, 128.82472F, 363.0F, 136.00838F, 363.0F);
      localPath.lineTo(301.99164F, 363.0F);
      localPath.cubicTo(309.17596F, 363.0F, 315.0F, 357.18747F, 315.0F, 350.00754F);
      localPath.lineTo(315.0F, 21.992458F);
      localPath.cubicTo(315.0F, 14.816921F, 309.17526F, 9.0F, 301.99164F, 9.0F);
      localPath.lineTo(136.00838F, 9.0F);
      localPath.cubicTo(128.82405F, 9.0F, 123.0F, 14.812543F, 123.0F, 21.992458F);
      localPath.lineTo(123.0F, 120.0F);
      localPath.lineTo(120.0F, 120.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-16777216);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(206.0F, 24.0F);
      localPath.lineTo(232.0F, 24.0F);
      localPath.lineTo(232.0F, 27.0F);
      localPath.lineTo(206.0F, 27.0F);
      localPath.lineTo(206.0F, 24.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-16777216);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(60.651176F, 249.89926F);
      ((Path)localObject).lineTo(60.595497F, 225.46962F);
      ((Path)localObject).lineTo(33.888363F, 225.46962F);
      ((Path)localObject).cubicTo(27.33306F, 225.46962F, 22.0F, 220.17123F, 22.0F, 213.65854F);
      ((Path)localObject).lineTo(22.0F, 131.81108F);
      ((Path)localObject).cubicTo(22.0F, 125.298386F, 27.33306F, 120.0F, 33.888363F, 120.0F);
      ((Path)localObject).lineTo(160.11163F, 120.0F);
      ((Path)localObject).cubicTo(166.66695F, 120.0F, 172.0F, 125.298386F, 172.0F, 131.81108F);
      ((Path)localObject).lineTo(172.0F, 213.65854F);
      ((Path)localObject).cubicTo(172.0F, 220.17123F, 166.66695F, 225.46962F, 160.11163F, 225.46962F);
      ((Path)localObject).lineTo(97.138374F, 225.46962F);
      ((Path)localObject).lineTo(69.358574F, 253.56952F);
      ((Path)localObject).cubicTo(68.354385F, 254.50647F, 67.109116F, 254.99985F, 65.80787F, 255.0F);
      ((Path)localObject).cubicTo(62.971363F, 255.0003F, 60.6581F, 252.7121F, 60.651176F, 249.89926F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(63.58853F, 247.54555F);
      ((Path)localObject).lineTo(63.608063F, 222.6283F);
      ((Path)localObject).lineTo(36.50444F, 222.48622F);
      ((Path)localObject).cubicTo(28.85407F, 222.5878F, 25.13076F, 218.84735F, 25.09161F, 211.1126F);
      ((Path)localObject).lineTo(25.0F, 134.37363F);
      ((Path)localObject).cubicTo(25.132122F, 125.48259F, 30.013842F, 122.979996F, 36.41283F, 123.0F);
      ((Path)localObject).lineTo(157.58717F, 123.0F);
      ((Path)localObject).cubicTo(167.20503F, 123.0F, 169.02705F, 128.21953F, 169.0F, 134.37363F);
      ((Path)localObject).lineTo(169.09161F, 211.1126F);
      ((Path)localObject).cubicTo(169.11636F, 218.63168F, 166.0281F, 222.59373F, 157.67879F, 222.48622F);
      ((Path)localObject).lineTo(95.95168F, 222.58171F);
      ((Path)localObject).lineTo(68.555214F, 250.40294F);
      ((Path)localObject).cubicTo(67.59119F, 251.30519F, 66.85377F, 251.84087F, 65.63155F, 251.84087F);
      ((Path)localObject).cubicTo(63.608063F, 251.86566F, 63.595177F, 250.2542F, 63.58853F, 247.54555F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\er.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */