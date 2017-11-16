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

public final class alk
  extends c
{
  private final int height;
  private final int width;
  
  public alk()
  {
    GMTrace.i(15772059435008L, 117511);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15772059435008L, 117511);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15772193652736L, 117512);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15772193652736L, 117512);
      return 0;
      GMTrace.o(15772193652736L, 117512);
      return 96;
      GMTrace.o(15772193652736L, 117512);
      return 96;
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 16.0F, 0.0F, 1.0F, 16.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-16731650);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(34.912872F, 17.558449F);
      ((Path)localObject2).cubicTo(34.91382F, 17.558449F, 34.915707F, 17.558449F, 34.916653F, 17.559427F);
      ((Path)localObject2).cubicTo(35.271107F, 17.633741F, 35.624615F, 17.723701F, 35.97434F, 17.826374F);
      ((Path)localObject2).cubicTo(35.975285F, 17.826374F, 35.975285F, 17.826374F, 35.97623F, 17.82735F);
      ((Path)localObject2).cubicTo(36.27397F, 17.914377F, 36.566982F, 18.02096F, 36.859997F, 18.1295F);
      ((Path)localObject2).cubicTo(36.96397F, 18.168612F, 37.06983F, 18.201859F, 37.17286F, 18.242928F);
      ((Path)localObject2).cubicTo(37.471546F, 18.361244F, 37.76456F, 18.495205F, 38.05663F, 18.634056F);
      ((Path)localObject2).cubicTo(38.13697F, 18.67317F, 38.21731F, 18.709349F, 38.29671F, 18.74944F);
      ((Path)localObject2).cubicTo(38.611465F, 18.907846F, 38.9196F, 19.078966F, 39.224903F, 19.26182F);
      ((Path)localObject2).cubicTo(39.26555F, 19.286264F, 39.30619F, 19.31071F, 39.34589F, 19.336134F);
      ((Path)localObject2).cubicTo(39.737206F, 19.5757F, 40.11718F, 19.83678F, 40.48959F, 20.118393F);
      ((Path)localObject2).cubicTo(40.62381F, 20.217154F, 40.758026F, 20.314936F, 40.888466F, 20.421518F);
      ((Path)localObject2).cubicTo(40.889412F, 20.422497F, 40.8913F, 20.423475F, 40.892246F, 20.424452F);
      ((Path)localObject2).cubicTo(40.99433F, 20.508545F, 41.09736F, 20.590683F, 41.198494F, 20.67771F);
      ((Path)localObject2).cubicTo(41.53215F, 20.964212F, 41.857304F, 21.263426F, 42.16922F, 21.586107F);
      ((Path)localObject2).cubicTo(42.444275F, 21.870655F, 42.69759F, 22.167913F, 42.941456F, 22.47006F);
      ((Path)localObject2).cubicTo(43.061497F, 22.614779F, 43.179646F, 22.761452F, 43.29307F, 22.910082F);
      ((Path)localObject2).cubicTo(43.29307F, 22.910082F, 43.294018F, 22.91106F, 43.29496F, 22.912037F);
      ((Path)localObject2).cubicTo(43.347893F, 22.981462F, 43.394207F, 23.0548F, 43.446194F, 23.125204F);
      ((Path)localObject2).cubicTo(43.44714F, 23.12618F, 43.448086F, 23.12716F, 43.448086F, 23.128138F);
      ((Path)localObject2).cubicTo(43.76284F, 23.556423F, 44.050182F, 23.9984F, 44.31295F, 24.45211F);
      ((Path)localObject2).cubicTo(44.313892F, 24.454067F, 44.31484F, 24.455044F, 44.315784F, 24.457F);
      ((Path)localObject2).cubicTo(44.44244F, 24.674076F, 44.57477F, 24.88822F, 44.690086F, 25.111164F);
      ((Path)localObject2).cubicTo(44.690086F, 25.111164F, 44.690086F, 25.112143F, 44.691032F, 25.112143F);
      ((Path)localObject2).cubicTo(44.74302F, 25.213837F, 44.785553F, 25.318462F, 44.8347F, 25.421135F);
      ((Path)localObject2).lineTo(44.835648F, 25.422112F);
      ((Path)localObject2).cubicTo(44.96892F, 25.697859F, 45.094635F, 25.97654F, 45.210896F, 26.258152F);
      ((Path)localObject2).lineTo(45.21373F, 26.264997F);
      ((Path)localObject2).cubicTo(45.31959F, 26.52412F, 45.411278F, 26.787155F, 45.502964F, 27.051168F);
      ((Path)localObject2).cubicTo(45.536045F, 27.150906F, 45.57102F, 27.249666F, 45.603153F, 27.349403F);
      ((Path)localObject2).cubicTo(45.739265F, 27.771824F, 45.855526F, 28.198156F, 45.95288F, 28.629375F);
      ((Path)localObject2).cubicTo(45.987854F, 28.774094F, 46.027554F, 28.918812F, 46.05591F, 29.065485F);
      ((Path)localObject2).cubicTo(46.056854F, 29.07233F, 46.058743F, 29.078197F, 46.060635F, 29.085043F);
      ((Path)localObject2).cubicTo(46.060635F, 29.08602F, 46.060635F, 29.087976F, 46.06158F, 29.089931F);
      ((Path)localObject2).lineTo(46.06158F, 29.09091F);
      ((Path)localObject2).lineTo(60.1943F, 29.09091F);
      ((Path)localObject2).cubicTo(61.306812F, 29.09091F, 62.360718F, 28.410343F, 62.81347F, 27.280956F);
      ((Path)localObject2).cubicTo(63.266224F, 26.15157F, 62.985497F, 24.897999F, 62.199085F, 24.084448F);
      ((Path)localObject2).lineTo(39.748547F, 0.8591668F);
      ((Path)localObject2).cubicTo(38.962135F, 0.04561703F, 37.751328F, -0.24381895F, 36.659615F, 0.22455887F);
      ((Path)localObject2).cubicTo(35.5679F, 0.69195884F, 34.908146F, 1.7832108F, 34.909092F, 2.93411F);
      ((Path)localObject2).lineTo(34.909092F, 17.554539F);
      ((Path)localObject2).lineTo(34.910038F, 17.554539F);
      ((Path)localObject2).cubicTo(34.911926F, 17.558449F, 34.912872F, 17.558449F, 34.912872F, 17.558449F);
      ((Path)localObject2).lineTo(34.912872F, 17.558449F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-499359);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(27.98998F, 46.179195F);
      ((Path)localObject2).cubicTo(27.8091F, 46.12835F, 27.63213F, 46.067726F, 27.454182F, 46.010036F);
      ((Path)localObject2).cubicTo(27.223438F, 45.934746F, 26.992693F, 45.855545F, 26.764881F, 45.76852F);
      ((Path)localObject2).cubicTo(26.593777F, 45.703007F, 26.422674F, 45.637497F, 26.253525F, 45.56514F);
      ((Path)localObject2).cubicTo(25.971937F, 45.445847F, 25.694262F, 45.314823F, 25.418541F, 45.17793F);
      ((Path)localObject2).cubicTo(25.314901F, 45.126106F, 25.208328F, 45.081127F, 25.105665F, 45.02637F);
      ((Path)localObject2).cubicTo(24.739016F, 44.83179F, 24.381165F, 44.616673F, 24.028204F, 44.389824F);
      ((Path)localObject2).cubicTo(23.90892F, 44.31258F, 23.79257F, 44.229465F, 23.674263F, 44.148308F);
      ((Path)localObject2).cubicTo(23.413208F, 43.96937F, 23.15802F, 43.781635F, 22.906742F, 43.584118F);
      ((Path)localObject2).cubicTo(22.798214F, 43.49905F, 22.689686F, 43.41496F, 22.583113F, 43.32598F);
      ((Path)localObject2).cubicTo(22.23895F, 43.039486F, 21.90261F, 42.741257F, 21.579958F, 42.418583F);
      ((Path)localObject2).cubicTo(21.257305F, 42.09591F, 20.958118F, 41.758568F, 20.671642F, 41.414383F);
      ((Path)localObject2).cubicTo(20.583647F, 41.30878F, 20.50054F, 41.201225F, 20.416454F, 41.093666F);
      ((Path)localObject2).cubicTo(20.216997F, 40.840416F, 20.028294F, 40.58228F, 19.847414F, 40.31925F);
      ((Path)localObject2).cubicTo(19.768217F, 40.20387F, 19.687065F, 40.089466F, 19.610802F, 39.97311F);
      ((Path)localObject2).cubicTo(19.38299F, 39.619144F, 19.16691F, 39.259315F, 18.972342F, 38.891663F);
      ((Path)localObject2).cubicTo(18.919544F, 38.791927F, 18.875546F, 38.688282F, 18.825682F, 38.58757F);
      ((Path)localObject2).cubicTo(18.685865F, 38.308895F, 18.553871F, 38.02729F, 18.43361F, 37.74177F);
      ((Path)localObject2).cubicTo(18.363213F, 37.57457F, 18.297705F, 37.406387F, 18.233175F, 37.23723F);
      ((Path)localObject2).cubicTo(18.145178F, 37.00549F, 18.065004F, 36.772774F, 17.98874F, 36.5381F);
      ((Path)localObject2).cubicTo(17.932034F, 36.36308F, 17.87239F, 36.18903F, 17.822527F, 36.01107F);
      ((Path)localObject2).cubicTo(17.719864F, 35.64635F, 17.627958F, 35.278698F, 17.55365F, 34.909092F);
      ((Path)localObject2).lineTo(2.9335957F, 34.909092F);
      ((Path)localObject2).cubicTo(1.7837806F, 34.909092F, 0.6926297F, 35.589638F, 0.22429515F, 36.72095F);
      ((Path)localObject2).cubicTo(-0.24403936F, 37.848354F, 0.046347596F, 39.10189F, 0.85982215F, 39.91542F);
      ((Path)localObject2).lineTo(24.083935F, 63.141064F);
      ((Path)localObject2).cubicTo(24.896431F, 63.953617F, 26.149885F, 64.24402F, 27.27917F, 63.775658F);
      ((Path)localObject2).cubicTo(28.408451F, 63.30827F, 29.09091F, 62.218025F, 29.09091F, 61.066177F);
      ((Path)localObject2).lineTo(29.09091F, 46.447113F);
      ((Path)localObject2).cubicTo(29.0782F, 46.445156F, 29.066465F, 46.441246F, 29.054733F, 46.438313F);
      ((Path)localObject2).cubicTo(28.694927F, 46.365955F, 28.340986F, 46.27893F, 27.98998F, 46.179195F);
      ((Path)localObject2).lineTo(27.98998F, 46.179195F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-16074232);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(61.062687F, 34.909092F);
      ((Path)localObject2).lineTo(46.443386F, 34.909092F);
      ((Path)localObject2).cubicTo(46.431652F, 34.967766F, 46.41405F, 35.024483F, 46.40134F, 35.082176F);
      ((Path)localObject2).cubicTo(46.33387F, 35.392166F, 46.260536F, 35.702156F, 46.175465F, 36.00921F);
      ((Path)localObject2).cubicTo(46.175465F, 36.01019F, 46.174488F, 36.011166F, 46.174488F, 36.012142F);
      ((Path)localObject2).cubicTo(46.086483F, 36.322132F, 45.978924F, 36.62821F, 45.86941F, 36.933308F);
      ((Path)localObject2).cubicTo(45.83421F, 37.03403F, 45.80194F, 37.134754F, 45.764782F, 37.234497F);
      ((Path)localObject2).cubicTo(45.763805F, 37.23645F, 45.76283F, 37.238407F, 45.76283F, 37.240364F);
      ((Path)localObject2).cubicTo(45.699272F, 37.408558F, 45.63376F, 37.5748F, 45.563354F, 37.74104F);
      ((Path)localObject2).cubicTo(45.563354F, 37.74104F, 45.563354F, 37.74104F, 45.563354F, 37.742016F);
      ((Path)localObject2).cubicTo(45.443085F, 38.025604F, 45.312057F, 38.3043F, 45.174183F, 38.58104F);
      ((Path)localObject2).cubicTo(45.174183F, 38.58104F, 45.173206F, 38.58202F, 45.173206F, 38.582996F);
      ((Path)localObject2).cubicTo(45.12236F, 38.684696F, 45.078358F, 38.788353F, 45.025555F, 38.889072F);
      ((Path)localObject2).cubicTo(45.025555F, 38.890053F, 45.02458F, 38.890053F, 45.02458F, 38.89103F);
      ((Path)localObject2).cubicTo(44.90626F, 39.113987F, 44.76839F, 39.328144F, 44.637363F, 39.54523F);
      ((Path)localObject2).cubicTo(44.363575F, 40.001904F, 44.064365F, 40.44586F, 43.737774F, 40.87711F);
      ((Path)localObject2).cubicTo(43.683994F, 40.947517F, 43.63608F, 41.01988F, 43.581326F, 41.090286F);
      ((Path)localObject2).cubicTo(43.580345F, 41.091263F, 43.57937F, 41.092243F, 43.57937F, 41.092243F);
      ((Path)localObject2).cubicTo(43.219532F, 41.549892F, 42.838184F, 41.994827F, 42.416748F, 42.416294F);
      ((Path)localObject2).cubicTo(41.129944F, 43.70319F, 39.659313F, 44.68694F, 38.09481F, 45.399815F);
      ((Path)localObject2).cubicTo(37.97747F, 45.454575F, 37.86111F, 45.51325F, 37.742798F, 45.56312F);
      ((Path)localObject2).lineTo(37.742798F, 45.56312F);
      ((Path)localObject2).cubicTo(37.573635F, 45.634506F, 37.403496F, 45.701004F, 37.233356F, 45.76554F);
      ((Path)localObject2).cubicTo(37.233356F, 45.76554F, 37.232376F, 45.76554F, 37.2314F, 45.76652F);
      ((Path)localObject2).cubicTo(37.165886F, 45.790966F, 37.099396F, 45.811504F, 37.033882F, 45.834972F);
      ((Path)localObject2).cubicTo(36.69458F, 45.958187F, 36.3543F, 46.078465F, 36.008156F, 46.176254F);
      ((Path)localObject2).lineTo(36.008156F, 46.176254F);
      ((Path)localObject2).cubicTo(35.644405F, 46.27893F, 35.277725F, 46.369873F, 34.909092F, 46.44419F);
      ((Path)localObject2).lineTo(34.909092F, 61.06549F);
      ((Path)localObject2).cubicTo(34.909092F, 62.217438F, 35.58965F, 63.307774F, 36.72F, 63.775204F);
      ((Path)localObject2).cubicTo(37.8484F, 64.24458F, 39.102936F, 63.95318F, 39.9155F, 63.140556F);
      ((Path)localObject2).lineTo(63.14054F, 39.913895F);
      ((Path)localObject2).cubicTo(63.954082F, 39.09932F, 64.243515F, 37.84763F, 63.77612F, 36.718174F);
      ((Path)localObject2).cubicTo(63.304813F, 35.5897F, 62.213573F, 34.908115F, 61.062687F, 34.909092F);
      ((Path)localObject2).lineTo(61.062687F, 34.909092F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-212971);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(2.9339895F, 29.09091F);
      ((Path)localObject1).lineTo(17.554485F, 29.09091F);
      ((Path)localObject1).cubicTo(18.108913F, 26.34041F, 19.44854F, 23.715067F, 21.581184F, 21.581549F);
      ((Path)localObject1).cubicTo(23.714806F, 19.44803F, 26.339298F, 18.108469F, 29.09091F, 17.554068F);
      ((Path)localObject1).lineTo(29.09091F, 2.9342813F);
      ((Path)localObject1).cubicTo(29.09091F, 1.7834328F, 28.41034F, 0.6922289F, 27.280949F, 0.22387168F);
      ((Path)localObject1).cubicTo(26.152534F, -0.24350779F, 24.89798F, 0.04591548F, 24.084425F, 0.85942954F);
      ((Path)localObject1).lineTo(0.85903686F, 24.08369F);
      ((Path)localObject1).cubicTo(0.045483325F, 24.897205F, -0.24297616F, 26.15072F, 0.22344816F, 27.27908F);
      ((Path)localObject1).cubicTo(0.69182813F, 28.410374F, 1.7830851F, 29.09091F, 2.9339895F, 29.09091F);
      ((Path)localObject1).lineTo(2.9339895F, 29.09091F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\alk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */