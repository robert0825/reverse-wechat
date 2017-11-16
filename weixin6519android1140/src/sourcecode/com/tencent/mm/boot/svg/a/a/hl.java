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

public final class hl
  extends c
{
  private final int height;
  private final int width;
  
  public hl()
  {
    GMTrace.i(15754074259456L, 117377);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15754074259456L, 117377);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15754208477184L, 117378);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15754208477184L, 117378);
      return 0;
      GMTrace.o(15754208477184L, 117378);
      return 96;
      GMTrace.o(15754208477184L, 117378);
      return 96;
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
      ((Paint)localObject).setColor(-16743697);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(79.07794F, 41.632782F);
      localPath.cubicTo(79.07794F, 42.400784F, 79.043655F, 43.166824F, 78.9839F, 43.930904F);
      localPath.cubicTo(78.900635F, 43.833927F, 78.82325F, 43.73401F, 78.73215F, 43.641926F);
      localPath.cubicTo(76.915F, 41.825764F, 74.14276F, 41.57401F, 72.045456F, 42.858253F);
      localPath.cubicTo(72.06309F, 42.486008F, 72.08659F, 42.114742F, 72.08659F, 41.742496F);
      localPath.cubicTo(72.08659F, 38.157192F, 71.27255F, 34.665928F, 69.66701F, 31.364702F);
      localPath.cubicTo(68.45623F, 28.877518F, 66.82325F, 26.561764F, 64.81215F, 24.48111F);
      localPath.cubicTo(59.62031F, 19.111967F, 52.307655F, 15.64813F, 44.220146F, 14.729274F);
      localPath.cubicTo(42.75076F, 14.561764F, 41.298023F, 14.477518F, 39.903084F, 14.477518F);
      localPath.cubicTo(38.57476F, 14.477518F, 37.18374F, 14.555885F, 35.770187F, 14.7096815F);
      localPath.cubicTo(27.644474F, 15.592294F, 20.28872F, 19.038498F, 15.057698F, 24.412539F);
      localPath.cubicTo(13.03778F, 26.488295F, 11.395984F, 28.79915F, 10.176392F, 31.280457F);
      localPath.cubicTo(8.544392F, 34.603233F, 7.7166367F, 38.122906F, 7.7166367F, 41.742496F);
      localPath.cubicTo(7.7166367F, 46.406334F, 9.146841F, 51.020214F, 11.851494F, 55.0865F);
      localPath.cubicTo(13.000555F, 56.8145F, 14.368065F, 58.426907F, 15.925616F, 59.90413F);
      localPath.cubicTo(16.480064F, 60.430172F, 17.056065F, 60.94054F, 17.658514F, 61.431313F);
      localPath.cubicTo(18.05133F, 61.75164F, 18.425535F, 62.0416F, 18.799738F, 62.318825F);
      localPath.cubicTo(19.536392F, 62.85466F, 19.978188F, 63.727478F, 19.978188F, 64.65123F);
      localPath.cubicTo(19.978188F, 64.985275F, 19.907658F, 65.283066F, 19.838106F, 65.53091F);
      localPath.cubicTo(19.671576F, 66.16764F, 19.474678F, 66.91801F, 19.27974F, 67.6625F);
      localPath.cubicTo(19.102432F, 68.33548F, 18.927086F, 69.00356F, 18.778189F, 69.571724F);
      localPath.cubicTo(18.651821F, 70.05564F, 18.547005F, 70.453354F, 18.472555F, 70.73646F);
      localPath.lineTo(18.207087F, 71.80813F);
      localPath.cubicTo(18.207087F, 72.06968F, 18.41182F, 72.28323F, 18.664555F, 72.28323F);
      localPath.cubicTo(18.740963F, 72.28323F, 18.825209F, 72.25091F, 18.974106F, 72.16372F);
      localPath.lineTo(19.27974F, 71.983475F);
      localPath.lineTo(26.156473F, 67.93091F);
      localPath.cubicTo(26.23582F, 67.884865F, 26.314188F, 67.85058F, 26.393536F, 67.80943F);
      localPath.cubicTo(27.00284F, 67.49401F, 27.604311F, 67.32944F, 28.224392F, 67.32944F);
      localPath.cubicTo(28.621126F, 67.32944F, 29.010025F, 67.38919F, 29.375412F, 67.50576F);
      localPath.cubicTo(31.172964F, 68.03181F, 33.033207F, 68.4158F, 34.915005F, 68.66658F);
      localPath.cubicTo(35.200066F, 68.70478F, 35.485126F, 68.74886F, 35.770187F, 68.78021F);
      localPath.cubicTo(37.140636F, 68.93107F, 38.530678F, 69.00748F, 39.903084F, 69.00748F);
      localPath.cubicTo(41.299984F, 69.00748F, 42.75174F, 68.92226F, 44.220146F, 68.75572F);
      localPath.cubicTo(46.63876F, 68.48045F, 48.979004F, 67.97009F, 51.21933F, 67.2589F);
      localPath.cubicTo(51.022434F, 69.32487F, 52.01476F, 71.41139F, 53.93378F, 72.50854F);
      localPath.cubicTo(54.256065F, 72.6927F, 54.589127F, 72.83964F, 54.928066F, 72.95229F);
      localPath.cubicTo(51.792393F, 74.07784F, 48.48921F, 74.869354F, 45.05476F, 75.260216F);
      localPath.cubicTo(43.309128F, 75.45809F, 41.57525F, 75.55899F, 39.903084F, 75.55899F);
      localPath.cubicTo(38.26325F, 75.55899F, 36.60186F, 75.46789F, 34.964962F, 75.28764F);
      localPath.cubicTo(32.44741F, 75.010414F, 30.059168F, 74.5696F, 27.65231F, 73.87899F);
      localPath.lineTo(19.27974F, 78.081436F);
      localPath.lineTo(16.47027F, 79.491066F);
      localPath.cubicTo(16.264555F, 79.61352F, 16.24986F, 79.62038F, 16.236147F, 79.62821F);
      localPath.cubicTo(15.795331F, 79.88094F, 15.291821F, 80.036705F, 14.747168F, 80.036705F);
      localPath.cubicTo(13.185698F, 80.036705F, 11.917127F, 78.844536F, 11.762351F, 77.32421F);
      localPath.cubicTo(11.752555F, 77.222336F, 11.731984F, 77.124374F, 11.731984F, 77.021515F);
      localPath.cubicTo(11.731984F, 76.92454F, 11.752555F, 76.83246F, 11.760392F, 76.73842F);
      localPath.cubicTo(11.772147F, 76.614006F, 11.780963F, 76.48862F, 11.807412F, 76.36911F);
      localPath.cubicTo(11.8368F, 76.235886F, 11.886759F, 76.11148F, 11.93378F, 75.98511F);
      localPath.lineTo(13.10929F, 66.7407F);
      localPath.cubicTo(10.506515F, 64.4269F, 7.677453F, 61.15115F, 5.947494F, 58.549355F);
      localPath.cubicTo(2.5316572F, 53.414333F, 0.72626936F, 47.565193F, 0.72626936F, 41.632782F);
      localPath.cubicTo(0.72626936F, 37.025764F, 1.7763919F, 32.551968F, 3.8462694F, 28.338743F);
      localPath.cubicTo(5.371494F, 25.233437F, 7.417861F, 22.350498F, 9.929535F, 19.769274F);
      localPath.cubicTo(16.292963F, 13.232457F, 25.185698F, 9.045682F, 34.97084F, 7.981845F);
      localPath.cubicTo(36.6528F, 7.798661F, 38.31125F, 7.7065797F, 39.903084F, 7.7065797F);
      localPath.cubicTo(41.573288F, 7.7065797F, 43.306187F, 7.8074775F, 45.05476F, 8.005355F);
      localPath.cubicTo(54.795822F, 9.113274F, 63.639576F, 13.3216F, 69.95696F, 19.854498F);
      localPath.cubicTo(72.45688F, 22.4416F, 74.493454F, 25.331396F, 76.007904F, 28.444538F);
      localPath.cubicTo(78.04447F, 32.630333F, 79.07794F, 37.067886F, 79.07794F, 41.632782F);
      localPath.lineTo(79.07794F, 41.632782F);
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-301824);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(78.2593F, 77.30012F);
      localPath.cubicTo(80.38697F, 79.42681F, 80.38697F, 82.87595F, 78.2593F, 85.003624F);
      localPath.cubicTo(76.13261F, 87.131294F, 72.683464F, 87.131294F, 70.555786F, 85.003624F);
      localPath.cubicTo(69.86126F, 84.3091F, 69.39497F, 83.4735F, 69.15399F, 82.58991F);
      localPath.cubicTo(69.10207F, 82.39987F, 69.06093F, 82.20787F, 69.03056F, 82.01489F);
      localPath.cubicTo(69.00215F, 81.83955F, 68.98257F, 81.663216F, 68.97179F, 81.48591F);
      localPath.cubicTo(68.34289F, 78.34142F, 66.81081F, 75.34093F, 64.372604F, 72.902725F);
      localPath.cubicTo(64.249176F, 72.7793F, 64.12281F, 72.65783F, 63.99644F, 72.538315F);
      localPath.cubicTo(63.932766F, 72.49424F, 63.87105F, 72.44526F, 63.814236F, 72.38844F);
      localPath.cubicTo(63.78093F, 72.35513F, 63.750565F, 72.32085F, 63.722157F, 72.28558F);
      localPath.cubicTo(63.30779F, 71.77424F, 63.338154F, 71.02191F, 63.814236F, 70.54681F);
      localPath.cubicTo(64.32265F, 70.03742F, 65.14746F, 70.03742F, 65.65587F, 70.54681F);
      localPath.cubicTo(65.82632F, 70.73195F, 66.00069F, 70.91514F, 66.18093F, 71.0944F);
      localPath.cubicTo(68.67399F, 73.58844F, 71.75579F, 75.13424F, 74.978645F, 75.734726F);
      localPath.cubicTo(75.08934F, 75.74648F, 75.19905F, 75.76215F, 75.307785F, 75.78077F);
      localPath.cubicTo(75.41652F, 75.7984F, 75.52525F, 75.819954F, 75.63301F, 75.844444F);
      localPath.cubicTo(76.59497F, 76.06583F, 77.50991F, 76.54974F, 78.2593F, 77.30012F);
      localPath.lineTo(78.2593F, 77.30012F);
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-16743697);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(93.66387F, 69.63853F);
      localPath.cubicTo(92.97032F, 70.332085F, 92.13473F, 70.79837F, 91.25015F, 71.039345F);
      localPath.cubicTo(91.06011F, 71.09126F, 90.86811F, 71.133385F, 90.67513F, 71.16376F);
      localPath.cubicTo(90.49979F, 71.19216F, 90.32346F, 71.211754F, 90.14616F, 71.222534F);
      localPath.cubicTo(87.00069F, 71.85045F, 84.001175F, 73.38253F, 81.56297F, 75.82073F);
      localPath.cubicTo(81.43856F, 75.945145F, 81.31808F, 76.07053F, 81.19954F, 76.197876F);
      localPath.cubicTo(81.15448F, 76.26155F, 81.1055F, 76.32229F, 81.04868F, 76.379105F);
      localPath.cubicTo(81.01538F, 76.41241F, 80.981094F, 76.44277F, 80.94681F, 76.47118F);
      localPath.cubicTo(80.43448F, 76.88555F, 79.68215F, 76.85519F, 79.207054F, 76.379105F);
      localPath.cubicTo(78.69766F, 75.8707F, 78.69766F, 75.045876F, 79.207054F, 74.53747F);
      localPath.cubicTo(79.39122F, 74.36702F, 79.57538F, 74.19265F, 79.75465F, 74.01339F);
      localPath.cubicTo(82.24869F, 71.51935F, 83.79448F, 68.43755F, 84.39497F, 65.21469F);
      localPath.cubicTo(84.40672F, 65.10498F, 84.4224F, 64.99526F, 84.44003F, 64.88555F);
      localPath.cubicTo(84.45865F, 64.77682F, 84.480194F, 64.66808F, 84.504684F, 64.560326F);
      localPath.cubicTo(84.726074F, 63.598366F, 85.20999F, 62.68441F, 85.95938F, 61.93404F);
      localPath.cubicTo(88.08705F, 59.806366F, 91.53718F, 59.806366F, 93.66387F, 61.93404F);
      localPath.cubicTo(95.79154F, 64.061714F, 95.79154F, 67.51086F, 93.66387F, 69.63853F);
      localPath.lineTo(93.66387F, 69.63853F);
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-13779968);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(78.298775F, 46.529667F);
      localPath.cubicTo(78.992325F, 47.224197F, 79.45861F, 48.059788F, 79.70057F, 48.94338F);
      localPath.cubicTo(79.75151F, 49.13342F, 79.79363F, 49.32542F, 79.824F, 49.5184F);
      localPath.cubicTo(79.85241F, 49.69375F, 79.872F, 49.870075F, 79.8818F, 50.04738F);
      localPath.cubicTo(80.5107F, 53.19285F, 82.04278F, 56.19236F, 84.48098F, 58.63056F);
      localPath.cubicTo(84.605385F, 58.75399F, 84.730774F, 58.87546F, 84.85812F, 58.994972F);
      localPath.cubicTo(84.9218F, 59.039055F, 84.98351F, 59.08803F, 85.04033F, 59.144848F);
      localPath.cubicTo(85.072655F, 59.178154F, 85.10302F, 59.21244F, 85.13143F, 59.247707F);
      localPath.cubicTo(85.5458F, 59.759052F, 85.51543F, 60.51138F, 85.04033F, 60.98746F);
      localPath.cubicTo(84.53094F, 61.49587F, 83.7071F, 61.49587F, 83.197716F, 60.98746F);
      localPath.cubicTo(83.02727F, 60.80232F, 82.8529F, 60.618156F, 82.67265F, 60.43889F);
      localPath.cubicTo(80.17959F, 57.944847F, 77.09878F, 56.39905F, 73.87494F, 55.798565F);
      localPath.cubicTo(73.76523F, 55.786808F, 73.65551F, 55.771133F, 73.5458F, 55.7535F);
      localPath.cubicTo(73.43706F, 55.73489F, 73.32832F, 55.713337F, 73.22057F, 55.68885F);
      localPath.cubicTo(72.25861F, 55.46746F, 71.34367F, 54.983543F, 70.594284F, 54.234154F);
      localPath.cubicTo(68.46759F, 52.106483F, 68.46759F, 48.657337F, 70.594284F, 46.529667F);
      localPath.cubicTo(72.72196F, 44.401993F, 76.171104F, 44.401993F, 78.298775F, 46.529667F);
      localPath.lineTo(78.298775F, 46.529667F);
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(52224);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(64.34978F, 66.97306F);
      ((Path)localObject).cubicTo(64.128395F, 67.93502F, 63.643494F, 68.84996F, 62.894108F, 69.59935F);
      ((Path)localObject).cubicTo(60.766434F, 71.72702F, 57.31729F, 71.72702F, 55.189617F, 69.59935F);
      ((Path)localObject).cubicTo(53.061943F, 67.47167F, 53.061943F, 64.02253F, 55.189617F, 61.894855F);
      ((Path)localObject).cubicTo(55.884148F, 61.201305F, 56.719738F, 60.73502F, 57.60431F, 60.49404F);
      ((Path)localObject).cubicTo(57.793373F, 60.442123F, 57.98537F, 60.4F, 58.178352F, 60.369633F);
      ((Path)localObject).cubicTo(58.35468F, 60.341225F, 58.531006F, 60.321632F, 58.70733F, 60.310856F);
      ((Path)localObject).cubicTo(61.8528F, 59.682938F, 64.85329F, 58.150856F, 67.29051F, 55.712654F);
      ((Path)localObject).cubicTo(67.414925F, 55.588245F, 67.535416F, 55.462856F, 67.65492F, 55.33551F);
      ((Path)localObject).cubicTo(67.699005F, 55.271835F, 67.74896F, 55.2111F, 67.80578F, 55.154285F);
      ((Path)localObject).cubicTo(67.838104F, 55.12098F, 67.87239F, 55.09061F, 67.90765F, 55.062202F);
      ((Path)localObject).cubicTo(68.41901F, 54.64784F, 69.17133F, 54.678204F, 69.647415F, 55.154285F);
      ((Path)localObject).cubicTo(70.15582F, 55.662693F, 70.15582F, 56.48751F, 69.647415F, 56.99592F);
      ((Path)localObject).cubicTo(69.46227F, 57.166367F, 69.27908F, 57.340736F, 69.09884F, 57.52F);
      ((Path)localObject).cubicTo(66.60578F, 60.01404F, 65.05998F, 63.095837F, 64.45851F, 66.318695F);
      ((Path)localObject).cubicTo(64.44676F, 66.428406F, 64.43207F, 66.538124F, 64.41345F, 66.647835F);
      ((Path)localObject).cubicTo(64.39582F, 66.75657F, 64.37427F, 66.8653F, 64.34978F, 66.97306F);
      ((Path)localObject).lineTo(64.34978F, 66.97306F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\hl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */