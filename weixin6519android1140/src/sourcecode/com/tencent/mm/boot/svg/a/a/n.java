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

public final class n
  extends c
{
  private final int height;
  private final int width;
  
  public n()
  {
    GMTrace.i(15745752760320L, 117315);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15745752760320L, 117315);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15745886978048L, 117316);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15745886978048L, 117316);
      return 0;
      GMTrace.o(15745886978048L, 117316);
      return 96;
      GMTrace.o(15745886978048L, 117316);
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 17.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.067056F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-1);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(57.465305F, 52.295155F);
      ((Path)localObject2).cubicTo(57.383434F, 52.276527F, 57.30082F, 52.260136F, 57.218204F, 52.246723F);
      ((Path)localObject2).cubicTo(57.13559F, 52.232567F, 57.052227F, 52.220646F, 56.968124F, 52.211708F);
      ((Path)localObject2).cubicTo(54.519424F, 51.754982F, 52.177902F, 50.57927F, 50.283695F, 48.68233F);
      ((Path)localObject2).cubicTo(50.146748F, 48.545986F, 50.014267F, 48.40666F, 49.885506F, 48.265095F);
      ((Path)localObject2).lineTo(49.884758F, 48.265842F);
      ((Path)localObject2).cubicTo(49.498474F, 47.878407F, 48.871788F, 47.878407F, 48.485504F, 48.265842F);
      ((Path)localObject2).cubicTo(48.12378F, 48.627197F, 48.100708F, 49.19941F, 48.41554F, 49.588333F);
      ((Path)localObject2).cubicTo(48.437126F, 49.615154F, 48.460197F, 49.64123F, 48.485504F, 49.666565F);
      ((Path)localObject2).cubicTo(48.52867F, 49.709778F, 48.57556F, 49.747032F, 48.62394F, 49.78056F);
      ((Path)localObject2).cubicTo(48.71995F, 49.871456F, 48.815968F, 49.963844F, 48.909744F, 50.057724F);
      ((Path)localObject2).cubicTo(50.76227F, 51.91219F, 51.926334F, 54.194324F, 52.404167F, 56.585983F);
      ((Path)localObject2).cubicTo(52.412354F, 56.72084F, 52.42724F, 56.854954F, 52.448822F, 56.98832F);
      ((Path)localObject2).cubicTo(52.471897F, 57.135098F, 52.503155F, 57.281128F, 52.542603F, 57.42567F);
      ((Path)localObject2).cubicTo(52.725697F, 58.09772F, 53.07998F, 58.73326F, 53.607674F, 59.261513F);
      ((Path)localObject2).cubicTo(55.224262F, 60.879795F, 57.84489F, 60.879795F, 59.460735F, 59.261513F);
      ((Path)localObject2).cubicTo(61.077324F, 57.64323F, 61.077324F, 55.019855F, 59.460735F, 53.40232F);
      ((Path)localObject2).cubicTo(58.891357F, 52.8316F, 58.196194F, 52.46354F, 57.465305F, 52.295155F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-1);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(71.16499F, 41.71508F);
      ((Path)localObject2).cubicTo(69.54915F, 40.096798F, 66.92778F, 40.096798F, 65.31119F, 41.71508F);
      ((Path)localObject2).cubicTo(64.74181F, 42.2858F, 64.37414F, 42.980946F, 64.205925F, 43.7126F);
      ((Path)localObject2).cubicTo(64.18732F, 43.794556F, 64.170944F, 43.87726F, 64.15681F, 43.95996F);
      ((Path)localObject2).cubicTo(64.14341F, 44.043407F, 64.1315F, 44.126854F, 64.12257F, 44.210304F);
      ((Path)localObject2).cubicTo(63.66632F, 46.661568F, 62.491837F, 49.005543F, 60.596886F, 50.902477F);
      ((Path)localObject2).cubicTo(60.460682F, 51.038826F, 60.32076F, 51.171448F, 60.180088F, 51.300343F);
      ((Path)localObject2).lineTo(60.180832F, 51.301086F);
      ((Path)localObject2).cubicTo(59.793804F, 51.68778F, 59.793804F, 52.31512F, 60.180832F, 52.70181F);
      ((Path)localObject2).cubicTo(60.54181F, 53.06391F, 61.113422F, 53.08701F, 61.50268F, 52.771847F);
      ((Path)localObject2).cubicTo(61.528732F, 52.75024F, 61.554783F, 52.727142F, 61.58009F, 52.70181F);
      ((Path)localObject2).cubicTo(61.623257F, 52.658596F, 61.660473F, 52.612404F, 61.69471F, 52.563972F);
      ((Path)localObject2).cubicTo(61.784767F, 52.467113F, 61.876312F, 52.371746F, 61.970837F, 52.277122F);
      ((Path)localObject2).cubicTo(63.823364F, 50.422657F, 66.10236F, 49.257374F, 68.49226F, 48.77979F);
      ((Path)localObject2).cubicTo(68.62698F, 48.77159F, 68.760956F, 48.75669F, 68.89418F, 48.735085F);
      ((Path)localObject2).cubicTo(69.0408F, 48.711987F, 69.18668F, 48.679947F, 69.33108F, 48.64046F);
      ((Path)localObject2).cubicTo(70.00317F, 48.457172F, 70.63804F, 48.102524F, 71.16499F, 47.575016F);
      ((Path)localObject2).cubicTo(72.781586F, 45.956734F, 72.781586F, 43.333363F, 71.16499F, 41.71508F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-1);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(53.636925F, 29.998707F);
      ((Path)localObject2).cubicTo(52.021084F, 31.61699F, 52.021084F, 34.240364F, 53.636925F, 35.858643F);
      ((Path)localObject2).cubicTo(54.206303F, 36.42862F, 54.901466F, 36.79668F, 55.632355F, 36.965065F);
      ((Path)localObject2).cubicTo(55.714226F, 36.983692F, 55.79684F, 37.000084F, 55.87946F, 37.01424F);
      ((Path)localObject2).cubicTo(55.96282F, 37.027653F, 56.046177F, 37.039574F, 56.129536F, 37.04851F);
      ((Path)localObject2).cubicTo(58.57898F, 37.505238F, 60.919758F, 38.68095F, 62.813965F, 40.57789F);
      ((Path)localObject2).cubicTo(62.950912F, 40.714233F, 63.083397F, 40.854305F, 63.212902F, 40.995125F);
      ((Path)localObject2).lineTo(63.212902F, 40.995125F);
      ((Path)localObject2).cubicTo(63.59993F, 41.381813F, 64.225876F, 41.381813F, 64.6129F, 40.995125F);
      ((Path)localObject2).cubicTo(64.97388F, 40.633022F, 64.996956F, 40.06081F, 64.68212F, 39.671886F);
      ((Path)localObject2).cubicTo(64.66054F, 39.645065F, 64.63747F, 39.618988F, 64.6129F, 39.593655F);
      ((Path)localObject2).cubicTo(64.56973F, 39.55044F, 64.52284F, 39.513187F, 64.474464F, 39.47966F);
      ((Path)localObject2).cubicTo(64.37771F, 39.388763F, 64.28244F, 39.296375F, 64.18791F, 39.202496F);
      ((Path)localObject2).cubicTo(62.33539F, 37.34803F, 61.171326F, 35.06664F, 60.693497F, 32.674236F);
      ((Path)localObject2).cubicTo(60.686054F, 32.53938F, 60.671165F, 32.405266F, 60.649582F, 32.2719F);
      ((Path)localObject2).cubicTo(60.62651F, 32.125122F, 60.594505F, 31.97909F, 60.5558F, 31.834547F);
      ((Path)localObject2).cubicTo(60.371964F, 31.162498F, 60.017685F, 30.526958F, 59.49073F, 29.998707F);
      ((Path)localObject2).cubicTo(57.87414F, 28.380424F, 55.253513F, 28.380424F, 53.636925F, 29.998707F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-1);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(48.940784F, 45.300335F);
      ((Path)localObject2).cubicTo(48.954926F, 45.216885F, 48.966087F, 45.13344F, 48.97502F, 45.04999F);
      ((Path)localObject2).cubicTo(49.43201F, 42.59873F, 50.606495F, 40.254753F, 52.500698F, 38.357815F);
      ((Path)localObject2).cubicTo(52.63765F, 38.22147F, 52.77683F, 38.08885F, 52.918243F, 37.959953F);
      ((Path)localObject2).lineTo(52.9175F, 37.959206F);
      ((Path)localObject2).cubicTo(53.303783F, 37.572517F, 53.303783F, 36.94517F, 52.9175F, 36.558483F);
      ((Path)localObject2).cubicTo(52.55578F, 36.19638F, 51.984165F, 36.173286F, 51.59565F, 36.48845F);
      ((Path)localObject2).cubicTo(51.568855F, 36.510056F, 51.542805F, 36.533154F, 51.51824F, 36.558483F);
      ((Path)localObject2).cubicTo(51.475075F, 36.601696F, 51.437115F, 36.647892F, 51.40362F, 36.69632F);
      ((Path)localObject2).cubicTo(51.31282F, 36.79318F, 51.22127F, 36.888546F, 51.126747F, 36.98317F);
      ((Path)localObject2).cubicTo(49.274967F, 38.83764F, 46.99522F, 40.00292F, 44.60532F, 40.480507F);
      ((Path)localObject2).cubicTo(44.471348F, 40.4887F, 44.33738F, 40.503605F, 44.203407F, 40.52521F);
      ((Path)localObject2).cubicTo(44.05678F, 40.54831F, 43.910904F, 40.580345F, 43.767254F, 40.619835F);
      ((Path)localObject2).cubicTo(43.095165F, 40.80312F, 42.46029F, 41.157772F, 41.93259F, 41.685276F);
      ((Path)localObject2).cubicTo(40.316006F, 43.30356F, 40.316006F, 45.926933F, 41.93259F, 47.545216F);
      ((Path)localObject2).cubicTo(43.54918F, 49.163494F, 46.169807F, 49.163494F, 47.786396F, 47.545216F);
      ((Path)localObject2).cubicTo(48.355774F, 46.97524F, 48.724197F, 46.27935F, 48.892403F, 45.547695F);
      ((Path)localObject2).cubicTo(48.91101F, 45.465736F, 48.927387F, 45.383034F, 48.940784F, 45.300335F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(53.152695F, 9.709912F);
      ((Path)localObject1).cubicTo(48.3528F, 4.741073F, 41.63339F, 1.5402732F, 34.232216F, 0.6976045F);
      ((Path)localObject1).cubicTo(32.903667F, 0.5471013F, 31.587025F, 0.47035962F, 30.318018F, 0.47035962F);
      ((Path)localObject1).cubicTo(29.108555F, 0.47035962F, 27.84848F, 0.54039574F, 26.570541F, 0.6797229F);
      ((Path)localObject1).cubicTo(19.135876F, 1.4888637F, 12.379252F, 4.673272F, 7.5443745F, 9.645092F);
      ((Path)localObject1).cubicTo(5.6360264F, 11.608338F, 4.0812144F, 13.801065F, 2.922362F, 16.162922F);
      ((Path)localObject1).cubicTo(1.3496871F, 19.367447F, 0.5518132F, 22.770159F, 0.5518132F, 26.2742F);
      ((Path)localObject1).cubicTo(0.5518132F, 30.786316F, 1.9235312F, 35.2351F, 4.518854F, 39.14073F);
      ((Path)localObject1).cubicTo(5.8332624F, 41.119625F, 7.9827585F, 43.611122F, 9.960324F, 45.36724F);
      ((Path)localObject1).lineTo(9.067183F, 52.402145F);
      ((Path)localObject1).cubicTo(9.031457F, 52.49826F, 8.993498F, 52.59288F, 8.971169F, 52.69421F);
      ((Path)localObject1).cubicTo(8.951074F, 52.78511F, 8.944375F, 52.880478F, 8.935444F, 52.9751F);
      ((Path)localObject1).cubicTo(8.929489F, 53.046627F, 8.913859F, 53.11666F, 8.913859F, 53.190426F);
      ((Path)localObject1).cubicTo(8.913859F, 53.268658F, 8.929489F, 53.343163F, 8.936933F, 53.42065F);
      ((Path)localObject1).cubicTo(9.054529F, 54.576992F, 10.018379F, 55.483734F, 11.20477F, 55.483734F);
      ((Path)localObject1).cubicTo(11.618592F, 55.483734F, 12.001155F, 55.36527F, 12.336083F, 55.173042F);
      ((Path)localObject1).cubicTo(12.417211F, 55.12685F, 12.467078F, 55.101517F, 12.5139675F, 55.068733F);
      ((Path)localObject1).lineTo(14.648579F, 53.996586F);
      ((Path)localObject1).lineTo(21.009985F, 50.800255F);
      ((Path)localObject1).cubicTo(22.838696F, 51.325527F, 24.653263F, 51.660805F, 26.566076F, 51.87166F);
      ((Path)localObject1).cubicTo(27.809776F, 52.00875F, 29.072084F, 52.07804F, 30.318018F, 52.07804F);
      ((Path)localObject1).cubicTo(31.588514F, 52.07804F, 32.9059F, 52.0013F, 34.232216F, 51.850796F);
      ((Path)localObject1).cubicTo(36.84168F, 51.553516F, 39.35141F, 50.951504F, 41.733868F, 50.095425F);
      ((Path)localObject1).cubicTo(41.476345F, 50.009743F, 41.22329F, 49.89798F, 40.978416F, 49.757908F);
      ((Path)localObject1).cubicTo(39.520363F, 48.923435F, 38.766403F, 47.33645F, 38.916004F, 45.765106F);
      ((Path)localObject1).cubicTo(37.21382F, 46.306023F, 35.435726F, 46.694202F, 33.598083F, 46.903564F);
      ((Path)localObject1).cubicTo(32.4824F, 47.030224F, 31.37937F, 47.095047F, 30.318018F, 47.095047F);
      ((Path)localObject1).cubicTo(29.275274F, 47.095047F, 28.219133F, 47.03693F, 27.177877F, 46.92219F);
      ((Path)localObject1).cubicTo(26.96129F, 46.89835F, 26.744703F, 46.864822F, 26.528118F, 46.835762F);
      ((Path)localObject1).cubicTo(25.098345F, 46.645027F, 23.684946F, 46.352962F, 22.319183F, 45.95286F);
      ((Path)localObject1).cubicTo(22.041565F, 45.864197F, 21.746084F, 45.81875F, 21.444649F, 45.81875F);
      ((Path)localObject1).cubicTo(20.973515F, 45.81875F, 20.516523F, 45.94392F, 20.05358F, 46.18383F);
      ((Path)localObject1).cubicTo(19.993292F, 46.215126F, 19.933748F, 46.241203F, 19.87346F, 46.27622F);
      ((Path)localObject1).lineTo(14.648579F, 49.358555F);
      ((Path)localObject1).lineTo(14.422316F, 49.492664F);
      ((Path)localObject1).cubicTo(14.303229F, 49.56196F, 14.239222F, 49.586544F, 14.181167F, 49.586544F);
      ((Path)localObject1).cubicTo(13.989141F, 49.586544F, 13.833586F, 49.424118F, 13.833586F, 49.22519F);
      ((Path)localObject1).lineTo(14.035287F, 48.410088F);
      ((Path)localObject1).cubicTo(14.091853F, 48.194763F, 14.171492F, 47.892265F, 14.267504F, 47.524204F);
      ((Path)localObject1).cubicTo(14.380635F, 47.092068F, 14.513863F, 46.58393F, 14.648579F, 46.07207F);
      ((Path)localObject1).cubicTo(14.796691F, 45.50582F, 14.946292F, 44.9351F, 15.072821F, 44.45081F);
      ((Path)localObject1).cubicTo(15.125666F, 44.26231F, 15.179254F, 44.03581F, 15.179254F, 43.781742F);
      ((Path)localObject1).cubicTo(15.179254F, 43.079144F, 14.843581F, 42.41529F, 14.283878F, 42.00774F);
      ((Path)localObject1).cubicTo(13.999561F, 41.796886F, 13.715244F, 41.576347F, 13.416786F, 41.332714F);
      ((Path)localObject1).cubicTo(12.95905F, 40.959435F, 12.521411F, 40.571255F, 12.100145F, 40.171154F);
      ((Path)localObject1).cubicTo(10.916732F, 39.047596F, 9.877709F, 37.82122F, 9.0046625F, 36.506924F);
      ((Path)localObject1).cubicTo(6.9496903F, 33.41416F, 5.863034F, 29.904903F, 5.863034F, 26.357649F);
      ((Path)localObject1).cubicTo(5.863034F, 23.604631F, 6.491955F, 20.927614F, 7.731934F, 18.400352F);
      ((Path)localObject1).cubicTo(8.658569F, 16.513102F, 9.905992F, 14.755493F, 11.440708F, 13.176701F);
      ((Path)localObject1).cubicTo(15.415193F, 9.089273F, 21.00403F, 6.468134F, 27.177877F, 5.79683F);
      ((Path)localObject1).cubicTo(28.251883F, 5.6798553F, 29.308767F, 5.6202497F, 30.318018F, 5.6202497F);
      ((Path)localObject1).cubicTo(31.37788F, 5.6202497F, 32.481655F, 5.6843257F, 33.598083F, 5.811732F);
      ((Path)localObject1).cubicTo(39.742905F, 6.510603F, 45.298996F, 9.145153F, 49.243706F, 13.228855F);
      ((Path)localObject1).cubicTo(50.771725F, 14.811374F, 52.012447F, 16.572708F, 52.932384F, 18.464428F);
      ((Path)localObject1).cubicTo(54.152267F, 20.975298F, 54.77077F, 23.630709F, 54.77077F, 26.357649F);
      ((Path)localObject1).cubicTo(54.77077F, 26.640772F, 54.752907F, 26.923153F, 54.73951F, 27.206278F);
      ((Path)localObject1).cubicTo(56.333027F, 26.229496F, 58.439354F, 26.420979F, 59.820004F, 27.80233F);
      ((Path)localObject1).cubicTo(59.88922F, 27.872366F, 59.94802F, 27.948362F, 60.011284F, 28.022123F);
      ((Path)localObject1).cubicTo(60.056686F, 27.440973F, 60.082733F, 26.858332F, 60.082733F, 26.2742F);
      ((Path)localObject1).cubicTo(60.082733F, 22.802197F, 59.297512F, 19.427052F, 57.750145F, 16.24339F);
      ((Path)localObject1).cubicTo(56.59948F, 13.875571F, 55.05211F, 11.677629F, 53.152695F, 9.709912F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */