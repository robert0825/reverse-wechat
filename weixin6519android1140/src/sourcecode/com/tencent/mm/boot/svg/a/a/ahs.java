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

public final class ahs
  extends c
{
  private final int height;
  private final int width;
  
  public ahs()
  {
    GMTrace.i(15922651725824L, 118633);
    this.width = 765;
    this.height = 429;
    GMTrace.o(15922651725824L, 118633);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15922785943552L, 118634);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15922785943552L, 118634);
      return 0;
      GMTrace.o(15922785943552L, 118634);
      return 765;
      GMTrace.o(15922785943552L, 118634);
      return 429;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      float[] arrayOfFloat = c.d(paramVarArgs);
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
      localPaint2 = c.a(localPaint2, paramVarArgs);
      localPaint2.setStrokeWidth(1.0F);
      localCanvas.save();
      Object localObject2 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject2).setColor(-1323621);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 91.0F);
      localPath.lineTo(765.0F, 91.0F);
      localPath.lineTo(765.0F, 337.0F);
      localPath.lineTo(0.0F, 337.0F);
      localPath.lineTo(0.0F, 91.0F);
      localPath.lineTo(0.0F, 91.0F);
      localPath.lineTo(0.0F, 91.0F);
      localPath.close();
      localPath.moveTo(0.0F, 337.0F);
      localPath.lineTo(48.0F, 337.0F);
      localPath.lineTo(0.0F, 289.0F);
      localPath.lineTo(0.0F, 337.0F);
      localPath.lineTo(0.0F, 337.0F);
      localPath.lineTo(0.0F, 337.0F);
      localPath.close();
      localPath.moveTo(765.0F, 337.0F);
      localPath.lineTo(717.0F, 337.0F);
      localPath.lineTo(765.0F, 289.0F);
      localPath.lineTo(765.0F, 337.0F);
      localPath.lineTo(765.0F, 337.0F);
      localPath.lineTo(765.0F, 337.0F);
      localPath.close();
      localPath.moveTo(0.0F, 91.0F);
      localPath.lineTo(48.0F, 91.0F);
      localPath.lineTo(0.0F, 139.0F);
      localPath.lineTo(0.0F, 91.0F);
      localPath.lineTo(0.0F, 91.0F);
      localPath.lineTo(0.0F, 91.0F);
      localPath.close();
      localPath.moveTo(765.0F, 91.0F);
      localPath.lineTo(717.0F, 91.0F);
      localPath.lineTo(765.0F, 139.0F);
      localPath.lineTo(765.0F, 91.0F);
      localPath.close();
      localPath.moveTo(762.0F, 140.5F);
      localPath.lineTo(762.0F, 287.5F);
      localPath.lineTo(715.5F, 334.0F);
      localPath.lineTo(49.5F, 334.0F);
      localPath.lineTo(3.0F, 287.5F);
      localPath.lineTo(3.0F, 140.5F);
      localPath.lineTo(49.5F, 94.0F);
      localPath.lineTo(715.5F, 94.0F);
      localPath.lineTo(762.0F, 140.5F);
      localPath.close();
      localPath.moveTo(0.0F, 185.5F);
      localPath.lineTo(3.0F, 185.5F);
      localPath.lineTo(3.0F, 200.5F);
      localPath.lineTo(0.0F, 200.5F);
      localPath.lineTo(0.0F, 185.5F);
      localPath.close();
      localPath.moveTo(189.0F, 334.0F);
      localPath.lineTo(202.5F, 334.0F);
      localPath.lineTo(202.5F, 337.0F);
      localPath.lineTo(189.0F, 337.0F);
      localPath.lineTo(189.0F, 334.0F);
      localPath.close();
      localPath.moveTo(169.5F, 334.0F);
      localPath.lineTo(183.0F, 334.0F);
      localPath.lineTo(183.0F, 337.0F);
      localPath.lineTo(169.5F, 337.0F);
      localPath.lineTo(169.5F, 334.0F);
      localPath.close();
      localPath.moveTo(550.5F, 91.0F);
      localPath.lineTo(564.0F, 91.0F);
      localPath.lineTo(564.0F, 94.0F);
      localPath.lineTo(550.5F, 94.0F);
      localPath.lineTo(550.5F, 91.0F);
      localPath.close();
      localPath.moveTo(574.5F, 91.0F);
      localPath.lineTo(588.0F, 91.0F);
      localPath.lineTo(588.0F, 94.0F);
      localPath.lineTo(574.5F, 94.0F);
      localPath.lineTo(574.5F, 91.0F);
      localPath.close();
      localPath.moveTo(322.5F, 91.0F);
      localPath.lineTo(442.5F, 91.0F);
      localPath.lineTo(442.5F, 94.0F);
      localPath.lineTo(322.5F, 94.0F);
      localPath.lineTo(322.5F, 91.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject2).setColor(-1323621);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(364.5F, 104.0F);
      localPath.lineTo(52.0F, 104.0F);
      localPath.lineTo(13.0F, 143.17809F);
      localPath.lineTo(13.0F, 284.82193F);
      localPath.lineTo(52.0F, 324.0F);
      localPath.lineTo(710.5F, 324.0F);
      localPath.lineTo(752.0F, 283.31506F);
      localPath.lineTo(752.0F, 144.68494F);
      localPath.lineTo(710.5F, 104.0F);
      localPath.lineTo(400.5F, 104.0F);
      localPath.lineTo(400.5F, 100.0F);
      localPath.lineTo(364.5F, 100.0F);
      localPath.lineTo(364.5F, 104.0F);
      localPath.close();
      localPath.moveTo(756.0F, 143.5F);
      localPath.lineTo(756.0F, 284.5F);
      localPath.lineTo(712.5F, 328.0F);
      localPath.lineTo(51.0F, 328.0F);
      localPath.lineTo(9.0F, 286.0F);
      localPath.lineTo(9.0F, 142.0F);
      localPath.lineTo(51.0F, 100.0F);
      localPath.lineTo(712.5F, 100.0F);
      localPath.lineTo(756.0F, 143.5F);
      localPath.lineTo(756.0F, 143.5F);
      localPath.close();
      localPath.moveTo(139.0F, 100.0F);
      localPath.lineTo(152.0F, 100.0F);
      localPath.lineTo(152.0F, 104.0F);
      localPath.lineTo(139.0F, 104.0F);
      localPath.lineTo(139.0F, 100.0F);
      localPath.close();
      localPath.moveTo(120.0F, 100.0F);
      localPath.lineTo(133.0F, 100.0F);
      localPath.lineTo(133.0F, 104.0F);
      localPath.lineTo(120.0F, 104.0F);
      localPath.lineTo(120.0F, 100.0F);
      localPath.close();
      localPath.moveTo(564.0F, 324.0F);
      localPath.lineTo(577.0F, 324.0F);
      localPath.lineTo(577.0F, 328.0F);
      localPath.lineTo(564.0F, 328.0F);
      localPath.lineTo(564.0F, 324.0F);
      localPath.close();
      localPath.moveTo(544.0F, 324.0F);
      localPath.lineTo(557.0F, 324.0F);
      localPath.lineTo(557.0F, 328.0F);
      localPath.lineTo(544.0F, 328.0F);
      localPath.lineTo(544.0F, 324.0F);
      localPath.close();
      localPath.moveTo(752.0F, 239.0F);
      localPath.lineTo(756.0F, 239.0F);
      localPath.lineTo(756.0F, 254.0F);
      localPath.lineTo(752.0F, 254.0F);
      localPath.lineTo(752.0F, 239.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject2).setColor(-1323621);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(120.0F, 213.0F);
      localPath.lineTo(186.0F, 213.0F);
      localPath.lineTo(186.0F, 216.0F);
      localPath.lineTo(120.0F, 216.0F);
      localPath.lineTo(120.0F, 213.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject2).setColor(-1323621);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(583.5F, 213.0F);
      localPath.lineTo(649.5F, 213.0F);
      localPath.lineTo(649.5F, 216.0F);
      localPath.lineTo(583.5F, 216.0F);
      localPath.lineTo(583.5F, 213.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramVarArgs);
      ((Paint)localObject2).setColor(-1323621);
      ((Paint)localObject2).setStrokeWidth(1.5F);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(84.433334F, 195.44902F);
      localPath.lineTo(84.433334F, 215.21373F);
      localPath.lineTo(95.02941F, 204.83725F);
      localPath.cubicTo(92.772064F, 200.68137F, 89.10724F, 197.32576F, 84.433334F, 195.44902F);
      localPath.close();
      localPath.moveTo(97.5F, 214.74706F);
      localPath.cubicTo(97.5F, 212.04877F, 96.94428F, 209.32896F, 96.0125F, 206.84117F);
      localPath.lineTo(81.63333F, 221.03334F);
      localPath.lineTo(96.50833F, 221.03334F);
      localPath.cubicTo(97.174095F, 219.18651F, 97.5F, 217.08041F, 97.5F, 214.74706F);
      localPath.close();
      localPath.moveTo(96.01765F, 222.9F);
      localPath.lineTo(76.252945F, 222.9F);
      localPath.lineTo(86.62941F, 233.02942F);
      localPath.cubicTo(90.79245F, 230.77333F, 94.144035F, 227.11316F, 96.01765F, 222.9F);
      localPath.close();
      localPath.moveTo(76.747055F, 235.5F);
      localPath.cubicTo(79.43855F, 235.5F, 82.162224F, 234.94542F, 84.65294F, 234.01765F);
      localPath.lineTo(70.433334F, 219.68823F);
      localPath.lineTo(70.433334F, 234.51176F);
      localPath.cubicTo(72.30428F, 235.177F, 74.40661F, 235.5F, 76.747055F, 235.5F);
      localPath.close();
      localPath.moveTo(68.566666F, 234.01765F);
      localPath.lineTo(68.566666F, 214.25294F);
      localPath.lineTo(57.97059F, 224.62941F);
      localPath.cubicTo(60.228127F, 228.79266F, 63.89169F, 232.14526F, 68.566666F, 234.01765F);
      localPath.close();
      localPath.moveTo(55.5F, 214.74706F);
      localPath.cubicTo(55.5F, 217.44179F, 56.05385F, 220.16377F, 56.9875F, 222.65294F);
      localPath.lineTo(71.36667F, 208.43333F);
      localPath.lineTo(56.491665F, 208.43333F);
      localPath.cubicTo(55.823597F, 210.3057F, 55.5F, 212.40973F, 55.5F, 214.74706F);
      localPath.close();
      localPath.moveTo(76.280396F, 193.5F);
      localPath.cubicTo(78.61068F, 193.5F, 80.71849F, 193.82425F, 82.566666F, 194.48824F);
      localPath.lineTo(82.566666F, 209.31177F);
      localPath.lineTo(68.37451F, 194.98235F);
      localPath.cubicTo(70.86068F, 194.05118F, 73.5788F, 193.5F, 76.280396F, 193.5F);
      localPath.close();
      localPath.moveTo(56.982353F, 206.56667F);
      localPath.lineTo(76.747055F, 206.56667F);
      localPath.lineTo(66.37059F, 195.97058F);
      localPath.cubicTo(62.21435F, 198.22873F, 58.857834F, 201.89587F, 56.982353F, 206.56667F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramVarArgs);
      localPaint2.setColor(-1323621);
      localPaint2.setStrokeWidth(1.5F);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(697.93335F, 195.44902F);
      ((Path)localObject2).lineTo(697.93335F, 215.21373F);
      ((Path)localObject2).lineTo(708.5294F, 204.83725F);
      ((Path)localObject2).cubicTo(706.27203F, 200.68137F, 702.60724F, 197.32576F, 697.93335F, 195.44902F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(711.0F, 214.74706F);
      ((Path)localObject2).cubicTo(711.0F, 212.04877F, 710.4443F, 209.32896F, 709.5125F, 206.84117F);
      ((Path)localObject2).lineTo(695.13336F, 221.03334F);
      ((Path)localObject2).lineTo(710.00836F, 221.03334F);
      ((Path)localObject2).cubicTo(710.6741F, 219.18651F, 711.0F, 217.08041F, 711.0F, 214.74706F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(709.51764F, 222.9F);
      ((Path)localObject2).lineTo(689.7529F, 222.9F);
      ((Path)localObject2).lineTo(700.1294F, 233.02942F);
      ((Path)localObject2).cubicTo(704.2924F, 230.77333F, 707.64404F, 227.11316F, 709.51764F, 222.9F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(690.2471F, 235.5F);
      ((Path)localObject2).cubicTo(692.93854F, 235.5F, 695.66223F, 234.94542F, 698.15295F, 234.01765F);
      ((Path)localObject2).lineTo(683.93335F, 219.68823F);
      ((Path)localObject2).lineTo(683.93335F, 234.51176F);
      ((Path)localObject2).cubicTo(685.80426F, 235.177F, 687.9066F, 235.5F, 690.2471F, 235.5F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(682.06665F, 234.01765F);
      ((Path)localObject2).lineTo(682.06665F, 214.25294F);
      ((Path)localObject2).lineTo(671.4706F, 224.62941F);
      ((Path)localObject2).cubicTo(673.72815F, 228.79266F, 677.39166F, 232.14526F, 682.06665F, 234.01765F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(669.0F, 214.74706F);
      ((Path)localObject2).cubicTo(669.0F, 217.44179F, 669.55383F, 220.16377F, 670.4875F, 222.65294F);
      ((Path)localObject2).lineTo(684.86664F, 208.43333F);
      ((Path)localObject2).lineTo(669.99164F, 208.43333F);
      ((Path)localObject2).cubicTo(669.3236F, 210.3057F, 669.0F, 212.40973F, 669.0F, 214.74706F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(689.7804F, 193.5F);
      ((Path)localObject2).cubicTo(692.11066F, 193.5F, 694.2185F, 193.82425F, 696.06665F, 194.48824F);
      ((Path)localObject2).lineTo(696.06665F, 209.31177F);
      ((Path)localObject2).lineTo(681.8745F, 194.98235F);
      ((Path)localObject2).cubicTo(684.36066F, 194.05118F, 687.0788F, 193.5F, 689.7804F, 193.5F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(670.48236F, 206.56667F);
      ((Path)localObject2).lineTo(690.2471F, 206.56667F);
      ((Path)localObject2).lineTo(679.8706F, 195.97058F);
      ((Path)localObject2).cubicTo(675.71436F, 198.22873F, 672.35785F, 201.89587F, 670.48236F, 206.56667F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramVarArgs);
      localPaint2.setColor(-1323621);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(354.50702F, 81.42295F);
      ((Path)localObject2).cubicTo(356.97653F, 78.70584F, 360.53906F, 77.0F, 364.5F, 77.0F);
      ((Path)localObject2).cubicTo(371.95584F, 77.0F, 378.0F, 83.04416F, 378.0F, 90.5F);
      ((Path)localObject2).cubicTo(378.0F, 97.95584F, 371.95584F, 104.0F, 364.5F, 104.0F);
      ((Path)localObject2).cubicTo(360.74567F, 104.0F, 357.34927F, 102.46747F, 354.90225F, 99.993866F);
      ((Path)localObject2).lineTo(363.65506F, 99.993866F);
      ((Path)localObject2).cubicTo(363.9445F, 100.02042F, 364.23764F, 100.03398F, 364.534F, 100.03398F);
      ((Path)localObject2).cubicTo(369.7807F, 100.03398F, 374.034F, 95.780685F, 374.034F, 90.53398F);
      ((Path)localObject2).cubicTo(374.034F, 85.28728F, 369.7807F, 81.03398F, 364.534F, 81.03398F);
      ((Path)localObject2).cubicTo(361.69394F, 81.03398F, 359.145F, 82.28022F, 357.4041F, 84.25567F);
      ((Path)localObject2).lineTo(354.50702F, 81.42295F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramVarArgs);
      localPaint2.setColor(-1323621);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(410.09167F, 100.0F);
      ((Path)localObject2).cubicTo(407.6451F, 102.47F, 404.25122F, 104.0F, 400.5F, 104.0F);
      ((Path)localObject2).cubicTo(393.04416F, 104.0F, 387.0F, 97.95584F, 387.0F, 90.5F);
      ((Path)localObject2).cubicTo(387.0F, 83.04416F, 393.04416F, 77.0F, 400.5F, 77.0F);
      ((Path)localObject2).cubicTo(404.37463F, 77.0F, 407.868F, 78.6323F, 410.33F, 81.246765F);
      ((Path)localObject2).lineTo(407.48987F, 84.06629F);
      ((Path)localObject2).cubicTo(405.75378F, 82.18111F, 403.26483F, 81.0F, 400.5F, 81.0F);
      ((Path)localObject2).cubicTo(395.2533F, 81.0F, 391.0F, 85.253296F, 391.0F, 90.5F);
      ((Path)localObject2).cubicTo(391.0F, 95.746704F, 395.2533F, 100.0F, 400.5F, 100.0F);
      ((Path)localObject2).lineTo(410.09167F, 100.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramVarArgs);
      localPaint2.setColor(-1323621);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 236.0F, 0.0F, 1.0F, 351.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(145.5F, 25.5F);
      localPath.cubicTo(145.5F, 24.671574F, 146.17157F, 24.0F, 147.0F, 24.0F);
      localPath.lineTo(147.0F, 24.0F);
      localPath.cubicTo(147.82843F, 24.0F, 148.5F, 24.671574F, 148.5F, 25.5F);
      localPath.lineTo(148.5F, 76.5F);
      localPath.cubicTo(148.5F, 77.32843F, 147.82843F, 78.0F, 147.0F, 78.0F);
      localPath.lineTo(147.0F, 78.0F);
      localPath.cubicTo(146.17157F, 78.0F, 145.5F, 77.32843F, 145.5F, 76.5F);
      localPath.lineTo(145.5F, 25.5F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramVarArgs);
      arrayOfFloat = c.a(arrayOfFloat, 0.9659258F, -0.25881904F, 13.933591F, 0.25881904F, 0.9659258F, -23.35969F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(94.18403F, 20.238226F);
      localPath.cubicTo(94.18403F, 19.4098F, 94.8556F, 18.738226F, 95.68403F, 18.738226F);
      localPath.lineTo(95.68403F, 18.738226F);
      localPath.cubicTo(96.51246F, 18.738226F, 97.18403F, 19.4098F, 97.18403F, 20.238226F);
      localPath.lineTo(97.18403F, 62.238228F);
      localPath.cubicTo(97.18403F, 63.066654F, 96.51246F, 63.738228F, 95.68403F, 63.738228F);
      localPath.lineTo(95.68403F, 63.738228F);
      localPath.cubicTo(94.8556F, 63.738228F, 94.18403F, 63.066654F, 94.18403F, 62.238228F);
      localPath.lineTo(94.18403F, 20.238226F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramVarArgs);
      arrayOfFloat = c.a(arrayOfFloat, 0.8660254F, -0.5F, 17.573086F, 0.5F, 0.8660254F, -20.102884F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(44.799038F, 9.240381F);
      localPath.cubicTo(44.799038F, 8.411954F, 45.47061F, 7.7403812F, 46.299038F, 7.7403812F);
      localPath.lineTo(46.299038F, 7.7403812F);
      localPath.cubicTo(47.127464F, 7.7403812F, 47.799038F, 8.411954F, 47.799038F, 9.240381F);
      localPath.lineTo(47.799038F, 36.24038F);
      localPath.cubicTo(47.799038F, 37.068806F, 47.127464F, 37.74038F, 46.299038F, 37.74038F);
      localPath.lineTo(46.299038F, 37.74038F);
      localPath.cubicTo(45.47061F, 37.74038F, 44.799038F, 37.068806F, 44.799038F, 36.24038F);
      localPath.lineTo(44.799038F, 9.240381F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramVarArgs);
      arrayOfFloat = c.a(arrayOfFloat, 0.70710677F, -0.70710677F, 9.015611F, 0.70710677F, 0.70710677F, -3.7343884F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(7.5156116F, -0.7343886F);
      localPath.cubicTo(7.5156116F, -1.5628158F, 8.187184F, -2.2343886F, 9.015612F, -2.2343886F);
      localPath.lineTo(9.015612F, -2.2343886F);
      localPath.cubicTo(9.844039F, -2.2343886F, 10.515612F, -1.5628158F, 10.515612F, -0.7343886F);
      localPath.lineTo(10.515612F, 18.765612F);
      localPath.cubicTo(10.515612F, 19.594038F, 9.844039F, 20.265612F, 9.015612F, 20.265612F);
      localPath.lineTo(9.015612F, 20.265612F);
      localPath.cubicTo(8.187184F, 20.265612F, 7.5156116F, 19.594038F, 7.5156116F, 18.765612F);
      localPath.lineTo(7.5156116F, -0.7343886F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramVarArgs);
      arrayOfFloat = c.a(arrayOfFloat, -0.9659258F, 0.25881904F, 385.099F, 0.25881904F, 0.9659258F, -50.699245F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(199.81596F, 20.238226F);
      localPath.cubicTo(199.81596F, 19.4098F, 200.48753F, 18.738226F, 201.31596F, 18.738226F);
      localPath.lineTo(201.31596F, 18.738226F);
      localPath.cubicTo(202.1444F, 18.738226F, 202.81596F, 19.4098F, 202.81596F, 20.238226F);
      localPath.lineTo(202.81596F, 62.238228F);
      localPath.cubicTo(202.81596F, 63.066654F, 202.1444F, 63.738228F, 201.31596F, 63.738228F);
      localPath.lineTo(201.31596F, 63.738228F);
      localPath.cubicTo(200.48753F, 63.738228F, 199.81596F, 63.066654F, 199.81596F, 62.238228F);
      localPath.lineTo(199.81596F, 20.238226F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramVarArgs);
      arrayOfFloat = c.a(arrayOfFloat, -0.8660254F, 0.5F, 456.44415F, 0.5F, 0.8660254F, -122.30385F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(249.20096F, 9.240381F);
      localPath.cubicTo(249.20096F, 8.411954F, 249.87253F, 7.7403812F, 250.70096F, 7.7403812F);
      localPath.lineTo(250.70096F, 7.7403812F);
      localPath.cubicTo(251.52939F, 7.7403812F, 252.20096F, 8.411954F, 252.20096F, 9.240381F);
      localPath.lineTo(252.20096F, 36.24038F);
      localPath.cubicTo(252.20096F, 37.068806F, 251.52939F, 37.74038F, 250.70096F, 37.74038F);
      localPath.lineTo(250.70096F, 37.74038F);
      localPath.cubicTo(249.87253F, 37.74038F, 249.20096F, 37.068806F, 249.20096F, 36.24038F);
      localPath.lineTo(249.20096F, 9.240381F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramVarArgs);
      arrayOfFloat = c.a(arrayOfFloat, -0.70710677F, 0.70710677F, 485.2451F, 0.70710677F, 0.70710677F, -200.99509F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(286.48438F, -0.7343886F);
      ((Path)localObject2).cubicTo(286.48438F, -1.5628158F, 287.15594F, -2.2343886F, 287.98438F, -2.2343886F);
      ((Path)localObject2).lineTo(287.98438F, -2.2343886F);
      ((Path)localObject2).cubicTo(288.8128F, -2.2343886F, 289.48438F, -1.5628158F, 289.48438F, -0.7343886F);
      ((Path)localObject2).lineTo(289.48438F, 18.765612F);
      ((Path)localObject2).cubicTo(289.48438F, 19.594038F, 288.8128F, 20.265612F, 287.98438F, 20.265612F);
      ((Path)localObject2).lineTo(287.98438F, 20.265612F);
      ((Path)localObject2).cubicTo(287.15594F, 20.265612F, 286.48438F, 19.594038F, 286.48438F, 18.765612F);
      ((Path)localObject2).lineTo(286.48438F, -0.7343886F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, localPaint2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1323621);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 235.5F, 0.0F, -1.0F, 78.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(145.5F, 25.5F);
      ((Path)localObject2).cubicTo(145.5F, 24.671574F, 146.17157F, 24.0F, 147.0F, 24.0F);
      ((Path)localObject2).lineTo(147.0F, 24.0F);
      ((Path)localObject2).cubicTo(147.82843F, 24.0F, 148.5F, 24.671574F, 148.5F, 25.5F);
      ((Path)localObject2).lineTo(148.5F, 76.5F);
      ((Path)localObject2).cubicTo(148.5F, 77.32843F, 147.82843F, 78.0F, 147.0F, 78.0F);
      ((Path)localObject2).lineTo(147.0F, 78.0F);
      ((Path)localObject2).cubicTo(146.17157F, 78.0F, 145.5F, 77.32843F, 145.5F, 76.5F);
      ((Path)localObject2).lineTo(145.5F, 25.5F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramVarArgs);
      arrayOfFloat = c.a(arrayOfFloat, 0.9659258F, -0.25881904F, 13.933591F, 0.25881904F, 0.9659258F, -23.35969F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(94.18403F, 20.238226F);
      ((Path)localObject2).cubicTo(94.18403F, 19.4098F, 94.8556F, 18.738226F, 95.68403F, 18.738226F);
      ((Path)localObject2).lineTo(95.68403F, 18.738226F);
      ((Path)localObject2).cubicTo(96.51246F, 18.738226F, 97.18403F, 19.4098F, 97.18403F, 20.238226F);
      ((Path)localObject2).lineTo(97.18403F, 62.238228F);
      ((Path)localObject2).cubicTo(97.18403F, 63.066654F, 96.51246F, 63.738228F, 95.68403F, 63.738228F);
      ((Path)localObject2).lineTo(95.68403F, 63.738228F);
      ((Path)localObject2).cubicTo(94.8556F, 63.738228F, 94.18403F, 63.066654F, 94.18403F, 62.238228F);
      ((Path)localObject2).lineTo(94.18403F, 20.238226F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramVarArgs);
      arrayOfFloat = c.a(arrayOfFloat, 0.8660254F, -0.5F, 17.573086F, 0.5F, 0.8660254F, -20.102884F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(44.799038F, 9.240381F);
      ((Path)localObject2).cubicTo(44.799038F, 8.411954F, 45.47061F, 7.7403812F, 46.299038F, 7.7403812F);
      ((Path)localObject2).lineTo(46.299038F, 7.7403812F);
      ((Path)localObject2).cubicTo(47.127464F, 7.7403812F, 47.799038F, 8.411954F, 47.799038F, 9.240381F);
      ((Path)localObject2).lineTo(47.799038F, 36.24038F);
      ((Path)localObject2).cubicTo(47.799038F, 37.068806F, 47.127464F, 37.74038F, 46.299038F, 37.74038F);
      ((Path)localObject2).lineTo(46.299038F, 37.74038F);
      ((Path)localObject2).cubicTo(45.47061F, 37.74038F, 44.799038F, 37.068806F, 44.799038F, 36.24038F);
      ((Path)localObject2).lineTo(44.799038F, 9.240381F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramVarArgs);
      arrayOfFloat = c.a(arrayOfFloat, 0.70710677F, -0.70710677F, 9.015611F, 0.70710677F, 0.70710677F, -3.7343884F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(7.5156116F, -0.7343886F);
      ((Path)localObject2).cubicTo(7.5156116F, -1.5628158F, 8.187184F, -2.2343886F, 9.015612F, -2.2343886F);
      ((Path)localObject2).lineTo(9.015612F, -2.2343886F);
      ((Path)localObject2).cubicTo(9.844039F, -2.2343886F, 10.515612F, -1.5628158F, 10.515612F, -0.7343886F);
      ((Path)localObject2).lineTo(10.515612F, 18.765612F);
      ((Path)localObject2).cubicTo(10.515612F, 19.594038F, 9.844039F, 20.265612F, 9.015612F, 20.265612F);
      ((Path)localObject2).lineTo(9.015612F, 20.265612F);
      ((Path)localObject2).cubicTo(8.187184F, 20.265612F, 7.5156116F, 19.594038F, 7.5156116F, 18.765612F);
      ((Path)localObject2).lineTo(7.5156116F, -0.7343886F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramVarArgs);
      arrayOfFloat = c.a(arrayOfFloat, -0.9659258F, 0.25881904F, 385.099F, 0.25881904F, 0.9659258F, -50.699245F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(199.81596F, 20.238226F);
      ((Path)localObject2).cubicTo(199.81596F, 19.4098F, 200.48753F, 18.738226F, 201.31596F, 18.738226F);
      ((Path)localObject2).lineTo(201.31596F, 18.738226F);
      ((Path)localObject2).cubicTo(202.1444F, 18.738226F, 202.81596F, 19.4098F, 202.81596F, 20.238226F);
      ((Path)localObject2).lineTo(202.81596F, 62.238228F);
      ((Path)localObject2).cubicTo(202.81596F, 63.066654F, 202.1444F, 63.738228F, 201.31596F, 63.738228F);
      ((Path)localObject2).lineTo(201.31596F, 63.738228F);
      ((Path)localObject2).cubicTo(200.48753F, 63.738228F, 199.81596F, 63.066654F, 199.81596F, 62.238228F);
      ((Path)localObject2).lineTo(199.81596F, 20.238226F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramVarArgs);
      arrayOfFloat = c.a(arrayOfFloat, -0.8660254F, 0.5F, 456.44415F, 0.5F, 0.8660254F, -122.30385F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(249.20096F, 9.240381F);
      ((Path)localObject2).cubicTo(249.20096F, 8.411954F, 249.87253F, 7.7403812F, 250.70096F, 7.7403812F);
      ((Path)localObject2).lineTo(250.70096F, 7.7403812F);
      ((Path)localObject2).cubicTo(251.52939F, 7.7403812F, 252.20096F, 8.411954F, 252.20096F, 9.240381F);
      ((Path)localObject2).lineTo(252.20096F, 36.24038F);
      ((Path)localObject2).cubicTo(252.20096F, 37.068806F, 251.52939F, 37.74038F, 250.70096F, 37.74038F);
      ((Path)localObject2).lineTo(250.70096F, 37.74038F);
      ((Path)localObject2).cubicTo(249.87253F, 37.74038F, 249.20096F, 37.068806F, 249.20096F, 36.24038F);
      ((Path)localObject2).lineTo(249.20096F, 9.240381F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      arrayOfFloat = c.a(arrayOfFloat, -0.70710677F, 0.70710677F, 485.2451F, 0.70710677F, 0.70710677F, -200.99509F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(286.48438F, -0.7343886F);
      ((Path)localObject1).cubicTo(286.48438F, -1.5628158F, 287.15594F, -2.2343886F, 287.98438F, -2.2343886F);
      ((Path)localObject1).lineTo(287.98438F, -2.2343886F);
      ((Path)localObject1).cubicTo(288.8128F, -2.2343886F, 289.48438F, -1.5628158F, 289.48438F, -0.7343886F);
      ((Path)localObject1).lineTo(289.48438F, 18.765612F);
      ((Path)localObject1).cubicTo(289.48438F, 19.594038F, 288.8128F, 20.265612F, 287.98438F, 20.265612F);
      ((Path)localObject1).lineTo(287.98438F, 20.265612F);
      ((Path)localObject1).cubicTo(287.15594F, 20.265612F, 286.48438F, 19.594038F, 286.48438F, 18.765612F);
      ((Path)localObject1).lineTo(286.48438F, -0.7343886F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ahs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */