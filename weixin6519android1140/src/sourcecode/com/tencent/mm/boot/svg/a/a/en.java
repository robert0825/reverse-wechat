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

public final class en
  extends c
{
  private final int height;
  private final int width;
  
  public en()
  {
    GMTrace.i(15796487061504L, 117693);
    this.width = 438;
    this.height = 372;
    GMTrace.o(15796487061504L, 117693);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15796621279232L, 117694);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15796621279232L, 117694);
      return 0;
      GMTrace.o(15796621279232L, 117694);
      return 438;
      GMTrace.o(15796621279232L, 117694);
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
      ((Paint)localObject).setColor(-16777216);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(171.0F, 225.46962F);
      localPath.lineTo(171.0F, 312.0046F);
      localPath.cubicTo(171.0F, 320.83633F, 163.8328F, 328.0F, 154.99161F, 328.0F);
      localPath.lineTo(22.008387F, 328.0F);
      localPath.cubicTo(13.169351F, 328.0F, 6.0F, 320.83862F, 6.0F, 312.0046F);
      localPath.lineTo(6.0F, 45.995407F);
      localPath.cubicTo(6.0F, 37.163662F, 13.167199F, 30.0F, 22.008387F, 30.0F);
      localPath.lineTo(154.99161F, 30.0F);
      localPath.cubicTo(163.83064F, 30.0F, 171.0F, 37.16139F, 171.0F, 45.995407F);
      localPath.lineTo(171.0F, 120.0F);
      localPath.lineTo(168.0F, 120.0F);
      localPath.lineTo(168.0F, 45.994846F);
      localPath.cubicTo(168.0F, 38.81799F, 162.17625F, 33.0F, 155.00523F, 33.0F);
      localPath.lineTo(21.99477F, 33.0F);
      localPath.cubicTo(14.817957F, 33.0F, 9.0F, 38.81637F, 9.0F, 45.994846F);
      localPath.lineTo(9.0F, 312.00516F);
      localPath.cubicTo(9.0F, 319.182F, 14.823739F, 325.0F, 21.99477F, 325.0F);
      localPath.lineTo(155.00523F, 325.0F);
      localPath.cubicTo(162.18204F, 325.0F, 168.0F, 319.18362F, 168.0F, 312.00516F);
      localPath.lineTo(168.0F, 225.46962F);
      localPath.lineTo(171.0F, 225.46962F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-16777216);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(161.0F, 225.46962F);
      localPath.lineTo(161.0F, 288.0F);
      localPath.lineTo(18.0F, 288.0F);
      localPath.lineTo(18.0F, 62.0F);
      localPath.lineTo(161.0F, 62.0F);
      localPath.lineTo(161.0F, 120.0F);
      localPath.lineTo(159.5F, 120.0F);
      localPath.lineTo(159.5F, 63.5F);
      localPath.lineTo(19.5F, 63.5F);
      localPath.lineTo(19.5F, 286.5F);
      localPath.lineTo(159.5F, 286.5F);
      localPath.lineTo(159.5F, 225.46962F);
      localPath.lineTo(161.0F, 225.46962F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-16777216);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(77.0F, 45.0F);
      localPath.lineTo(100.0F, 45.0F);
      localPath.lineTo(100.0F, 47.5F);
      localPath.lineTo(77.0F, 47.5F);
      localPath.lineTo(77.0F, 45.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-16777216);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(247.0F, 120.0F);
      localPath.lineTo(247.0F, 45.0F);
      localPath.lineTo(419.0F, 45.0F);
      localPath.lineTo(419.0F, 318.0F);
      localPath.lineTo(247.0F, 318.0F);
      localPath.lineTo(247.0F, 225.46962F);
      localPath.lineTo(248.5F, 225.46962F);
      localPath.lineTo(248.5F, 316.5F);
      localPath.lineTo(417.5F, 316.5F);
      localPath.lineTo(417.5F, 46.5F);
      localPath.lineTo(248.5F, 46.5F);
      localPath.lineTo(248.5F, 120.0F);
      localPath.lineTo(247.0F, 120.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-16777216);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(234.0F, 120.0F);
      localPath.lineTo(234.0F, 21.991756F);
      localPath.cubicTo(234.0F, 13.170865F, 241.1606F, 6.0F, 249.99364F, 6.0F);
      localPath.lineTo(416.00635F, 6.0F);
      localPath.cubicTo(424.8361F, 6.0F, 432.0F, 13.159754F, 432.0F, 21.991756F);
      localPath.lineTo(432.0F, 350.00824F);
      localPath.cubicTo(432.0F, 358.82913F, 424.83942F, 366.0F, 416.00635F, 366.0F);
      localPath.lineTo(249.99364F, 366.0F);
      localPath.cubicTo(241.1639F, 366.0F, 234.0F, 358.84024F, 234.0F, 350.00824F);
      localPath.lineTo(234.0F, 225.46962F);
      localPath.lineTo(237.0F, 225.46962F);
      localPath.lineTo(237.0F, 350.00754F);
      localPath.cubicTo(237.0F, 357.18307F, 242.82472F, 363.0F, 250.00838F, 363.0F);
      localPath.lineTo(415.99164F, 363.0F);
      localPath.cubicTo(423.17596F, 363.0F, 429.0F, 357.18747F, 429.0F, 350.00754F);
      localPath.lineTo(429.0F, 21.992458F);
      localPath.cubicTo(429.0F, 14.816921F, 423.17526F, 9.0F, 415.99164F, 9.0F);
      localPath.lineTo(250.00838F, 9.0F);
      localPath.cubicTo(242.82405F, 9.0F, 237.0F, 14.812543F, 237.0F, 21.992458F);
      localPath.lineTo(237.0F, 120.0F);
      localPath.lineTo(234.0F, 120.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-16777216);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(320.0F, 24.0F);
      localPath.lineTo(346.0F, 24.0F);
      localPath.lineTo(346.0F, 27.0F);
      localPath.lineTo(320.0F, 27.0F);
      localPath.lineTo(320.0F, 24.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-16777216);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(182.65118F, 249.89926F);
      localPath.lineTo(182.5955F, 225.46962F);
      localPath.lineTo(155.88837F, 225.46962F);
      localPath.cubicTo(149.33305F, 225.46962F, 144.0F, 220.17123F, 144.0F, 213.65854F);
      localPath.lineTo(144.0F, 131.81108F);
      localPath.cubicTo(144.0F, 125.298386F, 149.33305F, 120.0F, 155.88837F, 120.0F);
      localPath.lineTo(282.11163F, 120.0F);
      localPath.cubicTo(288.66693F, 120.0F, 294.0F, 125.298386F, 294.0F, 131.81108F);
      localPath.lineTo(294.0F, 213.65854F);
      localPath.cubicTo(294.0F, 220.17123F, 288.66693F, 225.46962F, 282.11163F, 225.46962F);
      localPath.lineTo(219.13837F, 225.46962F);
      localPath.lineTo(191.35858F, 253.56952F);
      localPath.cubicTo(190.35439F, 254.50647F, 189.10912F, 254.99985F, 187.80786F, 255.0F);
      localPath.cubicTo(184.97136F, 255.0003F, 182.6581F, 252.7121F, 182.65118F, 249.89926F);
      localPath.close();
      localPath.moveTo(185.58853F, 247.54555F);
      localPath.lineTo(185.60806F, 222.6283F);
      localPath.lineTo(158.50444F, 222.48622F);
      localPath.cubicTo(150.85406F, 222.5878F, 147.13077F, 218.84735F, 147.09161F, 211.1126F);
      localPath.lineTo(147.0F, 134.37363F);
      localPath.cubicTo(147.13213F, 125.48259F, 152.01384F, 122.979996F, 158.41283F, 123.0F);
      localPath.lineTo(279.58716F, 123.0F);
      localPath.cubicTo(289.20505F, 123.0F, 291.02707F, 128.21953F, 291.0F, 134.37363F);
      localPath.lineTo(291.0916F, 211.1126F);
      localPath.cubicTo(291.11636F, 218.63168F, 288.0281F, 222.59373F, 279.67877F, 222.48622F);
      localPath.lineTo(217.95168F, 222.58171F);
      localPath.lineTo(190.5552F, 250.40294F);
      localPath.cubicTo(189.59119F, 251.30519F, 188.85378F, 251.84087F, 187.63156F, 251.84087F);
      localPath.cubicTo(185.60806F, 251.86566F, 185.59517F, 250.2542F, 185.58853F, 247.54555F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-564640);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(252.0F, 171.40741F);
      ((Path)localObject).cubicTo(252.0F, 152.77422F, 237.22578F, 138.0F, 218.59259F, 138.0F);
      ((Path)localObject).cubicTo(200.77422F, 138.0F, 186.0F, 152.77422F, 186.0F, 171.40741F);
      ((Path)localObject).cubicTo(186.0F, 189.22578F, 200.77422F, 204.0F, 218.59259F, 204.0F);
      ((Path)localObject).cubicTo(237.22578F, 204.0F, 252.0F, 189.22578F, 252.0F, 171.40741F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(249.0F, 171.37038F);
      ((Path)localObject).cubicTo(249.0F, 154.4311F, 235.5689F, 141.0F, 218.62962F, 141.0F);
      ((Path)localObject).cubicTo(202.4311F, 141.0F, 189.0F, 154.4311F, 189.0F, 171.37038F);
      ((Path)localObject).cubicTo(189.0F, 187.5689F, 202.4311F, 201.0F, 218.62962F, 201.0F);
      ((Path)localObject).cubicTo(235.5689F, 201.0F, 249.0F, 187.5689F, 249.0F, 171.37038F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(219.0763F, 156.97F);
      ((Path)localObject).cubicTo(217.41943F, 156.97F, 216.14113F, 158.31671F, 216.22063F, 159.96783F);
      ((Path)localObject).lineTo(216.93195F, 174.74138F);
      ((Path)localObject).cubicTo(217.01166F, 176.39705F, 218.41936F, 177.73923F, 220.06693F, 177.73923F);
      ((Path)localObject).lineTo(218.08566F, 177.73923F);
      ((Path)localObject).cubicTo(219.73734F, 177.73923F, 221.14113F, 176.3925F, 221.22063F, 174.74138F);
      ((Path)localObject).lineTo(221.93195F, 159.96783F);
      ((Path)localObject).cubicTo(222.01166F, 158.31218F, 220.72977F, 156.97F, 219.0763F, 156.97F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(219.0763F, 186.97F);
      ((Path)localObject).cubicTo(220.73314F, 186.97F, 222.0763F, 185.67851F, 222.0763F, 184.08537F);
      ((Path)localObject).cubicTo(222.0763F, 182.49225F, 220.73314F, 181.20076F, 219.0763F, 181.20076F);
      ((Path)localObject).cubicTo(217.41943F, 181.20076F, 216.0763F, 182.49225F, 216.0763F, 184.08537F);
      ((Path)localObject).cubicTo(216.0763F, 185.67851F, 217.41943F, 186.97F, 219.0763F, 186.97F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\en.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */