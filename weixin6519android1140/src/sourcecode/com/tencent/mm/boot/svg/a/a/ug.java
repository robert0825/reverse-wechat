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

public final class ug
  extends c
{
  private final int height;
  private final int width;
  
  public ug()
  {
    GMTrace.i(15749510856704L, 117343);
    this.width = 644;
    this.height = 476;
    GMTrace.o(15749510856704L, 117343);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15749645074432L, 117344);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15749645074432L, 117344);
      return 0;
      GMTrace.o(15749645074432L, 117344);
      return 644;
      GMTrace.o(15749645074432L, 117344);
      return 476;
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
      localCanvas.saveLayerAlpha(null, 12, 4);
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-16777216);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 28.0F, 0.0F, 1.0F, 19.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(499.3511F, 0.0F);
      ((Path)localObject2).cubicTo(224.00923F, 0.0F, 0.0F, 224.00923F, 0.0F, 499.3511F);
      ((Path)localObject2).cubicTo(0.0F, 774.693F, 224.00923F, 998.7022F, 499.3511F, 998.7022F);
      ((Path)localObject2).cubicTo(774.693F, 998.7022F, 998.7022F, 774.693F, 998.7022F, 499.3511F);
      ((Path)localObject2).cubicTo(998.7022F, 224.00923F, 774.693F, 0.0F, 499.3511F, 0.0F);
      ((Path)localObject2).lineTo(499.3511F, 0.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(508.9496F, 352.38882F);
      ((Path)localObject2).cubicTo(612.7859F, 351.70734F, 711.75574F, 340.0644F, 793.218F, 319.94598F);
      ((Path)localObject2).cubicTo(807.2702F, 372.60324F, 815.3137F, 429.83893F, 816.0912F, 489.75262F);
      ((Path)localObject2).lineTo(508.9496F, 489.75262F);
      ((Path)localObject2).lineTo(508.9496F, 352.38882F);
      ((Path)localObject2).lineTo(508.9496F, 352.38882F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(508.9496F, 333.1919F);
      ((Path)localObject2).lineTo(508.9496F, 168.65482F);
      ((Path)localObject2).cubicTo(580.5062F, 167.97333F, 649.3945F, 159.73784F, 712.658F, 144.56264F);
      ((Path)localObject2).cubicTo(744.333F, 188.3221F, 770.0665F, 241.70882F, 788.00604F, 301.5649F);
      ((Path)localObject2).cubicTo(708.3675F, 321.165F, 611.19257F, 332.52F, 508.9496F, 333.1919F);
      ((Path)localObject2).lineTo(508.9496F, 333.1919F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(508.9496F, 149.45787F);
      ((Path)localObject2).lineTo(508.9496F, 19.561693F);
      ((Path)localObject2).cubicTo(581.2549F, 22.844372F, 647.5516F, 62.879616F, 699.91125F, 127.89009F);
      ((Path)localObject2).cubicTo(640.4007F, 141.47194F, 575.88934F, 148.81477F, 508.9496F, 149.45787F);
      ((Path)localObject2).lineTo(508.9496F, 149.45787F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(489.75262F, 149.45787F);
      ((Path)localObject2).cubicTo(422.82245F, 148.81477F, 358.3111F, 141.47194F, 298.80054F, 127.89009F);
      ((Path)localObject2).cubicTo(351.16025F, 62.879616F, 417.4569F, 22.844372F, 489.75262F, 19.561693F);
      ((Path)localObject2).lineTo(489.75262F, 149.45787F);
      ((Path)localObject2).lineTo(489.75262F, 149.45787F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(489.75262F, 168.65482F);
      ((Path)localObject2).lineTo(489.75262F, 333.1919F);
      ((Path)localObject2).cubicTo(387.51926F, 332.52F, 290.3443F, 321.165F, 210.70573F, 301.5649F);
      ((Path)localObject2).cubicTo(228.6453F, 241.70882F, 254.3788F, 188.3221F, 286.05377F, 144.56264F);
      ((Path)localObject2).cubicTo(349.30774F, 159.73784F, 418.2056F, 167.97333F, 489.75262F, 168.65482F);
      ((Path)localObject2).lineTo(489.75262F, 168.65482F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(489.75262F, 352.38882F);
      ((Path)localObject2).lineTo(489.75262F, 489.75262F);
      ((Path)localObject2).lineTo(182.611F, 489.75262F);
      ((Path)localObject2).cubicTo(183.39807F, 429.83893F, 191.4416F, 372.60324F, 205.49376F, 319.94598F);
      ((Path)localObject2).cubicTo(286.95602F, 340.0644F, 385.91632F, 351.70734F, 489.75262F, 352.38882F);
      ((Path)localObject2).lineTo(489.75262F, 352.38882F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(163.42365F, 489.75262F);
      ((Path)localObject2).lineTo(19.446512F, 489.75262F);
      ((Path)localObject2).cubicTo(20.991867F, 411.40985F, 41.29264F, 337.5976F, 76.1927F, 272.7023F);
      ((Path)localObject2).cubicTo(106.10155F, 289.08688F, 143.71797F, 303.37903F, 187.0551F, 315.16595F);
      ((Path)localObject2).cubicTo(172.5134F, 369.37814F, 164.21072F, 428.20718F, 163.42365F, 489.75262F);
      ((Path)localObject2).lineTo(163.42365F, 489.75262F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(163.42365F, 508.9496F);
      ((Path)localObject2).cubicTo(164.20113F, 570.0055F, 172.38863F, 628.3834F, 186.70955F, 682.23083F);
      ((Path)localObject2).cubicTo(143.24765F, 694.0754F, 105.54484F, 708.4347F, 75.62639F, 724.89606F);
      ((Path)localObject2).cubicTo(41.091076F, 660.26953F, 20.982267F, 586.8508F, 19.446512F, 508.9496F);
      ((Path)localObject2).lineTo(163.42365F, 508.9496F);
      ((Path)localObject2).lineTo(163.42365F, 508.9496F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(182.611F, 508.9496F);
      ((Path)localObject2).lineTo(489.75262F, 508.9496F);
      ((Path)localObject2).lineTo(489.75262F, 644.912F);
      ((Path)localObject2).cubicTo(385.78192F, 645.59344F, 286.67767F, 657.27484F, 205.14822F, 677.4412F);
      ((Path)localObject2).cubicTo(191.30722F, 625.14874F, 183.38847F, 568.3737F, 182.611F, 508.9496F);
      ((Path)localObject2).lineTo(182.611F, 508.9496F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(489.75262F, 664.10895F);
      ((Path)localObject2).lineTo(489.75262F, 828.646F);
      ((Path)localObject2).cubicTo(417.89844F, 829.3275F, 348.72223F, 837.6302F, 285.21872F, 852.93976F);
      ((Path)localObject2).cubicTo(253.70691F, 809.0843F, 228.10777F, 755.6784F, 210.3122F, 695.8223F);
      ((Path)localObject2).cubicTo(290.02753F, 676.1646F, 387.35608F, 664.7808F, 489.75262F, 664.10895F);
      ((Path)localObject2).lineTo(489.75262F, 664.10895F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(489.75262F, 847.84296F);
      ((Path)localObject2).lineTo(489.75262F, 979.1309F);
      ((Path)localObject2).cubicTo(417.01538F, 975.82904F, 350.33478F, 935.35223F, 297.83112F, 869.6411F);
      ((Path)localObject2).cubicTo(357.62F, 855.9153F, 422.46732F, 848.49567F, 489.75262F, 847.84296F);
      ((Path)localObject2).lineTo(489.75262F, 847.84296F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(508.9496F, 847.84296F);
      ((Path)localObject2).cubicTo(576.2445F, 848.49567F, 641.0822F, 855.92487F, 700.8711F, 869.6507F);
      ((Path)localObject2).cubicTo(648.36743F, 935.3619F, 581.6868F, 975.82904F, 508.9496F, 979.1309F);
      ((Path)localObject2).lineTo(508.9496F, 847.84296F);
      ((Path)localObject2).lineTo(508.9496F, 847.84296F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(508.9496F, 828.6556F);
      ((Path)localObject2).lineTo(508.9496F, 664.10895F);
      ((Path)localObject2).cubicTo(611.3557F, 664.7808F, 708.68427F, 676.1742F, 788.39F, 695.8415F);
      ((Path)localObject2).cubicTo(770.5944F, 755.688F, 744.9953F, 809.09393F, 713.4835F, 852.94934F);
      ((Path)localObject2).cubicTo(649.98956F, 837.6398F, 580.8038F, 829.3371F, 508.9496F, 828.6556F);
      ((Path)localObject2).lineTo(508.9496F, 828.6556F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(508.9496F, 644.912F);
      ((Path)localObject2).lineTo(508.9496F, 508.9496F);
      ((Path)localObject2).lineTo(816.0912F, 508.9496F);
      ((Path)localObject2).cubicTo(815.3137F, 568.3737F, 807.39496F, 625.1583F, 793.55396F, 677.4508F);
      ((Path)localObject2).cubicTo(712.0341F, 657.27484F, 612.9299F, 645.59344F, 508.9496F, 644.912F);
      ((Path)localObject2).lineTo(508.9496F, 644.912F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(835.28815F, 508.9496F);
      ((Path)localObject2).lineTo(979.2557F, 508.9496F);
      ((Path)localObject2).cubicTo(977.7199F, 586.8604F, 957.61115F, 660.2791F, 923.0662F, 724.92487F);
      ((Path)localObject2).cubicTo(893.15735F, 708.4539F, 855.4545F, 694.08496F, 812.00226F, 682.2405F);
      ((Path)localObject2).cubicTo(826.3232F, 628.393F, 834.5011F, 570.0055F, 835.28815F, 508.9496F);
      ((Path)localObject2).lineTo(835.28815F, 508.9496F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(835.28815F, 489.75262F);
      ((Path)localObject2).cubicTo(834.5011F, 428.20718F, 826.1888F, 369.38773F, 811.6567F, 315.17554F);
      ((Path)localObject2).cubicTo(854.99384F, 303.3886F, 892.6102F, 289.0965F, 922.5095F, 272.71188F);
      ((Path)localObject2).cubicTo(957.40955F, 337.60718F, 977.7103F, 411.41946F, 979.2557F, 489.75262F);
      ((Path)localObject2).lineTo(835.28815F, 489.75262F);
      ((Path)localObject2).lineTo(835.28815F, 489.75262F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(913.0358F, 256.02014F);
      ((Path)localObject2).cubicTo(884.34595F, 271.72324F, 848.1789F, 285.43948F, 806.4447F, 296.78488F);
      ((Path)localObject2).cubicTo(788.6492F, 237.47589F, 763.3092F, 184.26193F, 732.2197F, 139.7922F);
      ((Path)localObject2).cubicTo(753.4324F, 134.1195F, 773.8579F, 127.554146F, 793.5348F, 120.278496F);
      ((Path)localObject2).cubicTo(841.4024F, 157.51099F, 882.0615F, 203.56447F, 913.0358F, 256.02014F);
      ((Path)localObject2).lineTo(913.0358F, 256.02014F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(774.87537F, 106.46629F);
      ((Path)localObject2).cubicTo(757.15656F, 112.62852F, 738.8907F, 118.22443F, 719.94324F, 123.09085F);
      ((Path)localObject2).cubicTo(691.65656F, 86.43427F, 659.2329F, 56.707794F, 623.8433F, 35.658337F);
      ((Path)localObject2).cubicTo(678.6698F, 50.392F, 729.60895F, 74.63775F, 774.87537F, 106.46629F);
      ((Path)localObject2).lineTo(774.87537F, 106.46629F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(278.75894F, 123.08125F);
      ((Path)localObject2).cubicTo(259.82114F, 118.21483F, 241.55524F, 112.61891F, 223.83646F, 106.46629F);
      ((Path)localObject2).cubicTo(269.10287F, 74.62815F, 320.04196F, 50.392F, 374.86847F, 35.658337F);
      ((Path)localObject2).cubicTo(339.47888F, 56.707794F, 307.05524F, 86.43427F, 278.75894F, 123.08125F);
      ((Path)localObject2).lineTo(278.75894F, 123.08125F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(205.17702F, 120.2689F);
      ((Path)localObject2).cubicTo(224.8443F, 127.554146F, 245.26985F, 134.1195F, 266.48248F, 139.8018F);
      ((Path)localObject2).cubicTo(235.40262F, 184.26193F, 210.06264F, 237.47589F, 192.26706F, 296.78488F);
      ((Path)localObject2).cubicTo(150.5329F, 285.43948F, 114.36584F, 271.72324F, 85.675995F, 256.01053F);
      ((Path)localObject2).cubicTo(116.650276F, 203.55487F, 157.30942F, 157.51099F, 205.17702F, 120.2689F);
      ((Path)localObject2).lineTo(205.17702F, 120.2689F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(85.06169F, 741.61664F);
      ((Path)localObject2).cubicTo(113.75153F, 725.8175F, 150.00497F, 712.02454F, 191.87354F, 700.6215F);
      ((Path)localObject2).cubicTo(209.52513F, 759.9401F, 234.72113F, 813.19244F, 265.6666F, 857.7486F);
      ((Path)localObject2).cubicTo(244.31F, 863.48846F, 223.72127F, 870.0922F, 203.93881F, 877.4542F);
      ((Path)localObject2).cubicTo(156.28238F, 840.1354F, 115.844F, 794.0627F, 85.06169F, 741.61664F);
      ((Path)localObject2).lineTo(85.06169F, 741.61664F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(222.51186F, 891.28564F);
      ((Path)localObject2).cubicTo(240.35542F, 885.04663F, 258.7557F, 879.3643F, 277.84708F, 874.4307F);
      ((Path)localObject2).cubicTo(306.34494F, 911.6344F, 339.09494F, 941.76404F, 374.86847F, 963.0439F);
      ((Path)localObject2).cubicTo(319.50446F, 948.1662F, 268.1046F, 923.58453F, 222.51186F, 891.28564F);
      ((Path)localObject2).lineTo(222.51186F, 891.28564F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(720.8551F, 874.4403F);
      ((Path)localObject2).cubicTo(739.9465F, 879.37396F, 758.33716F, 885.0563F, 776.1807F, 891.3049F);
      ((Path)localObject2).cubicTo(730.58795F, 923.5941F, 679.19775F, 948.1662F, 623.8433F, 963.0439F);
      ((Path)localObject2).cubicTo(659.6168F, 941.76404F, 692.35724F, 911.64404F, 720.8551F, 874.4403F);
      ((Path)localObject2).lineTo(720.8551F, 874.4403F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(794.7538F, 877.46387F);
      ((Path)localObject2).cubicTo(774.9713F, 870.1018F, 754.38257F, 863.49805F, 733.0356F, 857.7582F);
      ((Path)localObject2).cubicTo(763.9811F, 813.202F, 789.17706F, 759.9497F, 806.83826F, 700.6311F);
      ((Path)localObject2).cubicTo(848.6972F, 712.0437F, 884.94104F, 725.83673F, 913.6405F, 741.6358F);
      ((Path)localObject2).cubicTo(882.8486F, 794.0819F, 842.4102F, 840.1546F, 794.7538F, 877.46387F);
      ((Path)localObject2).lineTo(794.7538F, 877.46387F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ug.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */