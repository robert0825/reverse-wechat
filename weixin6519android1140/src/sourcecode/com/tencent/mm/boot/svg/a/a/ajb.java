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

public final class ajb
  extends c
{
  private final int height;
  private final int width;
  
  public ajb()
  {
    GMTrace.i(17581180190720L, 130990);
    this.width = 42;
    this.height = 42;
    GMTrace.o(17581180190720L, 130990);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17581314408448L, 130991);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17581314408448L, 130991);
      return 0;
      GMTrace.o(17581314408448L, 130991);
      return 42;
      GMTrace.o(17581314408448L, 130991);
      return 42;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject2 = c.d(paramVarArgs);
      Object localObject3 = c.h(paramVarArgs);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setStrokeWidth(1.0F);
      localObject3 = c.a((Paint)localObject3, paramVarArgs);
      localPaint = c.a(localPaint, paramVarArgs);
      ((Paint)localObject3).setColor(-4210753);
      localPaint.setColor(-4210753);
      localPaint.setStrokeWidth(0.5F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 3.230769F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramVarArgs);
      localObject2 = c.a(localPaint, paramVarArgs);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(32.76171F, 34.3179F);
      ((Path)localObject3).cubicTo(32.04974F, 35.220024F, 30.931181F, 35.92615F, 29.615654F, 36.305027F);
      ((Path)localObject3).cubicTo(28.96241F, 36.48965F, 28.304647F, 36.586777F, 27.65592F, 36.586777F);
      ((Path)localObject3).cubicTo(25.783825F, 36.585026F, 24.27043F, 35.773026F, 23.889143F, 34.563774F);
      ((Path)localObject3).cubicTo(23.36239F, 32.88115F, 25.090826F, 30.836275F, 27.663147F, 30.09515F);
      ((Path)localObject3).cubicTo(28.315489F, 29.90965F, 28.973251F, 29.814276F, 29.622883F, 29.814276F);
      ((Path)localObject3).cubicTo(31.494074F, 29.814276F, 33.006565F, 30.626276F, 33.386948F, 31.836401F);
      ((Path)localObject3).cubicTo(33.6318F, 32.61515F, 33.408634F, 33.496277F, 32.76171F, 34.3179F);
      ((Path)localObject3).moveTo(10.807075F, 37.917652F);
      ((Path)localObject3).cubicTo(10.0951F, 38.820652F, 8.976542F, 39.526775F, 7.65921F, 39.904778F);
      ((Path)localObject3).cubicTo(7.005965F, 40.091152F, 6.348202F, 40.1874F, 5.701282F, 40.1874F);
      ((Path)localObject3).cubicTo(3.8282845F, 40.184776F, 2.3157916F, 39.37365F, 1.9345062F, 38.164402F);
      ((Path)localObject3).cubicTo(1.4059469F, 36.481777F, 3.1352844F, 34.4369F, 5.70851F, 33.695774F);
      ((Path)localObject3).cubicTo(6.360852F, 33.510277F, 7.0186143F, 33.414024F, 7.6682453F, 33.414024F);
      ((Path)localObject3).cubicTo(9.539435F, 33.414024F, 11.051025F, 34.226902F, 11.432311F, 35.437027F);
      ((Path)localObject3).cubicTo(11.677165F, 36.2149F, 11.453995F, 37.0969F, 10.807075F, 37.917652F);
      ((Path)localObject3).moveTo(13.23393F, 12.986276F);
      ((Path)localObject3).lineTo(13.23393F, 6.130651F);
      ((Path)localObject3).lineTo(33.484528F, 1.9674009F);
      ((Path)localObject3).lineTo(33.484528F, 8.598151F);
      ((Path)localObject3).lineTo(33.484528F, 10.402401F);
      ((Path)localObject3).lineTo(33.484528F, 29.16415F);
      ((Path)localObject3).cubicTo(32.48162F, 28.465025F, 31.146217F, 28.053776F, 29.622883F, 28.053776F);
      ((Path)localObject3).cubicTo(28.795258F, 28.053776F, 27.957695F, 28.174526F, 27.134588F, 28.411652F);
      ((Path)localObject3).cubicTo(23.545807F, 29.4424F, 21.298752F, 32.42965F, 22.12728F, 35.06865F);
      ((Path)localObject3).cubicTo(22.753418F, 37.059277F, 24.922771F, 38.34465F, 27.65592F, 38.3464F);
      ((Path)localObject3).cubicTo(28.482641F, 38.3464F, 29.320204F, 38.226524F, 30.144215F, 37.988525F);
      ((Path)localObject3).cubicTo(31.833797F, 37.50465F, 33.28485F, 36.578026F, 34.23174F, 35.3784F);
      ((Path)localObject3).cubicTo(35.081047F, 34.3004F, 35.41535F, 33.114777F, 35.259945F, 31.9729F);
      ((Path)localObject3).cubicTo(35.298798F, 31.875776F, 35.325F, 31.774277F, 35.325F, 31.664026F);
      ((Path)localObject3).lineTo(35.325F, 0.8789008F);
      ((Path)localObject3).cubicTo(35.325F, 0.61202586F, 35.19941F, 0.36090085F, 34.983467F, 0.19465084F);
      ((Path)localObject3).cubicTo(34.76572F, 0.026650846F, 34.48382F, -0.033724155F, 34.21096F, 0.017900845F);
      ((Path)localObject3).lineTo(12.118986F, 4.5582757F);
      ((Path)localObject3).cubicTo(11.695235F, 4.645776F, 11.392555F, 5.0054007F, 11.392555F, 5.4192758F);
      ((Path)localObject3).lineTo(11.392555F, 32.667652F);
      ((Path)localObject3).cubicTo(10.405911F, 32.02715F, 9.121106F, 31.653526F, 7.6682453F, 31.653526F);
      ((Path)localObject3).cubicTo(6.838814F, 31.653526F, 6.0030575F, 31.77515F, 5.1799507F, 32.011402F);
      ((Path)localObject3).cubicTo(1.5875543F, 33.043026F, -0.6576933F, 36.0294F, 0.17264175F, 38.67015F);
      ((Path)localObject3).cubicTo(0.7978777F, 40.659027F, 2.9663262F, 41.9444F, 5.699475F, 41.947025F);
      ((Path)localObject3).lineTo(5.701282F, 41.947025F);
      ((Path)localObject3).cubicTo(6.5280027F, 41.947025F, 7.363759F, 41.826275F, 8.18777F, 41.58915F);
      ((Path)localObject3).cubicTo(9.877353F, 41.1044F, 11.329309F, 40.177776F, 12.275295F, 38.979027F);
      ((Path)localObject3).cubicTo(13.228509F, 37.77065F, 13.550162F, 36.424026F, 13.23393F, 35.160526F);
      ((Path)localObject3).lineTo(13.23393F, 14.789651F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ajb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */