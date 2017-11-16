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

public final class of
  extends c
{
  private final int height;
  private final int width;
  
  public of()
  {
    GMTrace.i(15869233070080L, 118235);
    this.width = 79;
    this.height = 67;
    GMTrace.o(15869233070080L, 118235);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15869367287808L, 118236);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15869367287808L, 118236);
      return 0;
      GMTrace.o(15869367287808L, 118236);
      return 79;
      GMTrace.o(15869367287808L, 118236);
      return 67;
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
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-7368817);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.073193F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(62.633587F, 57.081173F);
      ((Path)localObject2).cubicTo(62.544353F, 57.06084F, 62.454308F, 57.04295F, 62.36426F, 57.02831F);
      ((Path)localObject2).cubicTo(62.274216F, 57.01286F, 62.183357F, 56.999847F, 62.09169F, 56.990086F);
      ((Path)localObject2).cubicTo(59.42276F, 56.49156F, 56.87065F, 55.20825F, 54.806084F, 53.137707F);
      ((Path)localObject2).cubicTo(54.65682F, 52.988884F, 54.51242F, 52.836803F, 54.372078F, 52.682285F);
      ((Path)localObject2).lineTo(54.371265F, 52.683098F);
      ((Path)localObject2).cubicTo(53.95024F, 52.26021F, 53.26719F, 52.26021F, 52.846165F, 52.683098F);
      ((Path)localObject2).cubicTo(52.45191F, 53.077526F, 52.42676F, 53.702106F, 52.76991F, 54.126625F);
      ((Path)localObject2).cubicTo(52.793434F, 54.1559F, 52.818584F, 54.184364F, 52.846165F, 54.212013F);
      ((Path)localObject2).cubicTo(52.893215F, 54.259182F, 52.944324F, 54.299847F, 52.99705F, 54.33644F);
      ((Path)localObject2).cubicTo(53.1017F, 54.43566F, 53.20635F, 54.536503F, 53.308563F, 54.638973F);
      ((Path)localObject2).cubicTo(55.3277F, 56.66316F, 56.596455F, 59.154152F, 57.11726F, 61.764694F);
      ((Path)localObject2).cubicTo(57.126186F, 61.911896F, 57.14241F, 62.05828F, 57.165936F, 62.203854F);
      ((Path)localObject2).cubicTo(57.191082F, 62.364063F, 57.225155F, 62.52346F, 57.26815F, 62.681232F);
      ((Path)localObject2).cubicTo(57.467712F, 63.414787F, 57.853855F, 64.10849F, 58.429012F, 64.68509F);
      ((Path)localObject2).cubicTo(60.19099F, 66.45147F, 63.047314F, 66.45147F, 64.80848F, 64.68509F);
      ((Path)localObject2).cubicTo(66.57046F, 62.9187F, 66.57046F, 60.055237F, 64.80848F, 58.289665F);
      ((Path)localObject2).cubicTo(64.1879F, 57.666714F, 63.43021F, 57.264965F, 62.633587F, 57.081173F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(77.56539F, 45.532818F);
      ((Path)localObject2).cubicTo(75.80422F, 43.76643F, 72.94709F, 43.76643F, 71.18511F, 45.532818F);
      ((Path)localObject2).cubicTo(70.56452F, 46.15577F, 70.16378F, 46.91453F, 69.980446F, 47.713146F);
      ((Path)localObject2).cubicTo(69.96016F, 47.802605F, 69.942314F, 47.892876F, 69.9269F, 47.983147F);
      ((Path)localObject2).cubicTo(69.9123F, 48.07423F, 69.89932F, 48.165318F, 69.88959F, 48.2564F);
      ((Path)localObject2).cubicTo(69.3923F, 50.932003F, 68.11219F, 53.490498F, 66.046814F, 55.56104F);
      ((Path)localObject2).cubicTo(65.89836F, 55.709866F, 65.74585F, 55.85462F, 65.59253F, 55.995316F);
      ((Path)localObject2).lineTo(65.59334F, 55.996128F);
      ((Path)localObject2).cubicTo(65.1715F, 56.41821F, 65.1715F, 57.102966F, 65.59334F, 57.525043F);
      ((Path)localObject2).cubicTo(65.986786F, 57.920284F, 66.6098F, 57.945496F, 67.03407F, 57.60149F);
      ((Path)localObject2).cubicTo(67.06247F, 57.577908F, 67.09086F, 57.552696F, 67.11845F, 57.525043F);
      ((Path)localObject2).cubicTo(67.1655F, 57.477875F, 67.206055F, 57.427456F, 67.24337F, 57.37459F);
      ((Path)localObject2).cubicTo(67.34153F, 57.26887F, 67.44131F, 57.164776F, 67.544334F, 57.06149F);
      ((Path)localObject2).cubicTo(69.56348F, 55.037304F, 72.04744F, 53.765377F, 74.65228F, 53.24408F);
      ((Path)localObject2).cubicTo(74.79912F, 53.235134F, 74.94514F, 53.218872F, 75.09035F, 53.195286F);
      ((Path)localObject2).cubicTo(75.25016F, 53.170074F, 75.40916F, 53.135105F, 75.566536F, 53.092003F);
      ((Path)localObject2).cubicTo(76.29907F, 52.89194F, 76.99104F, 52.504833F, 77.56539F, 51.92905F);
      ((Path)localObject2).cubicTo(79.32737F, 50.162666F, 79.32737F, 47.299202F, 77.56539F, 45.532818F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(58.46089F, 32.744167F);
      ((Path)localObject2).cubicTo(56.699726F, 34.510555F, 56.699726F, 37.37402F, 58.46089F, 39.140404F);
      ((Path)localObject2).cubicTo(59.08148F, 39.762543F, 59.839165F, 40.164288F, 60.635784F, 40.348083F);
      ((Path)localObject2).cubicTo(60.72502F, 40.368416F, 60.815067F, 40.386307F, 60.905113F, 40.40176F);
      ((Path)localObject2).cubicTo(60.995968F, 40.416397F, 61.086826F, 40.42941F, 61.177685F, 40.439167F);
      ((Path)localObject2).cubicTo(63.847424F, 40.937695F, 66.39873F, 42.221004F, 68.46329F, 44.29155F);
      ((Path)localObject2).cubicTo(68.61256F, 44.440372F, 68.75695F, 44.593266F, 68.89811F, 44.74697F);
      ((Path)localObject2).lineTo(68.89811F, 44.74697F);
      ((Path)localObject2).cubicTo(69.31995F, 45.16905F, 70.00218F, 45.16905F, 70.42402F, 44.74697F);
      ((Path)localObject2).cubicTo(70.81747F, 44.35173F, 70.84261F, 43.72715F, 70.499466F, 43.30263F);
      ((Path)localObject2).cubicTo(70.47594F, 43.273354F, 70.45079F, 43.244892F, 70.42402F, 43.21724F);
      ((Path)localObject2).cubicTo(70.37697F, 43.17007F, 70.32586F, 43.12941F, 70.27313F, 43.09281F);
      ((Path)localObject2).cubicTo(70.16767F, 42.993595F, 70.063835F, 42.892754F, 69.96081F, 42.790283F);
      ((Path)localObject2).cubicTo(67.94167F, 40.766098F, 66.67292F, 38.275917F, 66.152115F, 35.66456F);
      ((Path)localObject2).cubicTo(66.144F, 35.51736F, 66.12778F, 35.370975F, 66.10425F, 35.225403F);
      ((Path)localObject2).cubicTo(66.0791F, 35.065193F, 66.04422F, 34.905796F, 66.00204F, 34.748024F);
      ((Path)localObject2).cubicTo(65.80167F, 34.01447F, 65.41552F, 33.320766F, 64.84117F, 32.744167F);
      ((Path)localObject2).cubicTo(63.079193F, 30.977783F, 60.222874F, 30.977783F, 58.46089F, 32.744167F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(53.342392F, 49.44619F);
      ((Path)localObject2).cubicTo(53.357803F, 49.355106F, 53.369972F, 49.264023F, 53.379707F, 49.172935F);
      ((Path)localObject2).cubicTo(53.8778F, 46.497334F, 55.15791F, 43.93884F, 57.222477F, 41.868298F);
      ((Path)localObject2).cubicTo(57.371742F, 41.719475F, 57.52344F, 41.574715F, 57.677574F, 41.43402F);
      ((Path)localObject2).lineTo(57.67676F, 41.43321F);
      ((Path)localObject2).cubicTo(58.09779F, 41.01113F, 58.09779F, 40.32637F, 57.67676F, 39.904293F);
      ((Path)localObject2).cubicTo(57.28251F, 39.509052F, 56.65949F, 39.48384F, 56.236027F, 39.827847F);
      ((Path)localObject2).cubicTo(56.206825F, 39.85143F, 56.178432F, 39.87664F, 56.15166F, 39.904293F);
      ((Path)localObject2).cubicTo(56.10461F, 39.95146F, 56.063236F, 40.00188F, 56.026733F, 40.054745F);
      ((Path)localObject2).cubicTo(55.927765F, 40.160465F, 55.827984F, 40.264565F, 55.724957F, 40.367847F);
      ((Path)localObject2).cubicTo(53.70663F, 42.392033F, 51.22185F, 43.66396F, 48.61701F, 44.185257F);
      ((Path)localObject2).cubicTo(48.47099F, 44.194202F, 48.324966F, 44.21047F, 48.178947F, 44.23405F);
      ((Path)localObject2).cubicTo(48.019135F, 44.259262F, 47.860134F, 44.29423F, 47.703568F, 44.337334F);
      ((Path)localObject2).cubicTo(46.971035F, 44.537395F, 46.27906F, 44.924503F, 45.7039F, 45.500286F);
      ((Path)localObject2).cubicTo(43.94192F, 47.26667F, 43.94192F, 50.130135F, 45.7039F, 51.896523F);
      ((Path)localObject2).cubicTo(47.46588F, 53.662907F, 50.3222F, 53.662907F, 52.084183F, 51.896523F);
      ((Path)localObject2).cubicTo(52.70477F, 51.274384F, 53.106323F, 50.514805F, 53.28966F, 49.71619F);
      ((Path)localObject2).cubicTo(53.30994F, 49.62673F, 53.32779F, 49.53646F, 53.342392F, 49.44619F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(57.93311F, 10.598557F);
      ((Path)localObject1).cubicTo(52.701523F, 5.174973F, 45.37779F, 1.6812379F, 37.310974F, 0.7614488F);
      ((Path)localObject1).cubicTo(35.862938F, 0.59717166F, 34.42788F, 0.51340663F, 33.044743F, 0.51340663F);
      ((Path)localObject1).cubicTo(31.726503F, 0.51340663F, 30.3531F, 0.5898524F, 28.960228F, 0.7419307F);
      ((Path)localObject1).cubicTo(20.856907F, 1.6251235F, 13.49261F, 5.100967F, 8.222896F, 10.527804F);
      ((Path)localObject1).cubicTo(6.142916F, 12.670726F, 4.4482684F, 15.06413F, 3.1851919F, 17.642141F);
      ((Path)localObject1).cubicTo(1.4710745F, 21.139942F, 0.60144186F, 24.854069F, 0.60144186F, 28.678799F);
      ((Path)localObject1).cubicTo(0.60144186F, 33.60386F, 2.0965285F, 38.459793F, 4.925268F, 42.722866F);
      ((Path)localObject1).cubicTo(6.3578906F, 44.882866F, 8.700707F, 47.602383F, 10.856131F, 49.51922F);
      ((Path)localObject1).lineTo(9.882661F, 57.197956F);
      ((Path)localObject1).cubicTo(9.843722F, 57.302864F, 9.80235F, 57.406147F, 9.778013F, 57.51675F);
      ((Path)localObject1).cubicTo(9.75611F, 57.615967F, 9.748809F, 57.720062F, 9.739075F, 57.823345F);
      ((Path)localObject1).cubicTo(9.732585F, 57.90142F, 9.7155485F, 57.977863F, 9.7155485F, 58.058376F);
      ((Path)localObject1).cubicTo(9.7155485F, 58.14377F, 9.732585F, 58.225094F, 9.740697F, 58.309673F);
      ((Path)localObject1).cubicTo(9.868871F, 59.571842F, 10.919406F, 60.56157F, 12.212498F, 60.56157F);
      ((Path)localObject1).cubicTo(12.663539F, 60.56157F, 13.080508F, 60.432262F, 13.4455595F, 60.222443F);
      ((Path)localObject1).cubicTo(13.533982F, 60.17202F, 13.588335F, 60.14437F, 13.6394415F, 60.10859F);
      ((Path)localObject1).lineTo(15.966034F, 58.938316F);
      ((Path)localObject1).lineTo(22.899569F, 55.44946F);
      ((Path)localObject1).cubicTo(24.892748F, 56.022804F, 26.870514F, 56.388767F, 28.95536F, 56.61892F);
      ((Path)localObject1).cubicTo(30.310917F, 56.76856F, 31.686752F, 56.84419F, 33.044743F, 56.84419F);
      ((Path)localObject1).cubicTo(34.429504F, 56.84419F, 35.86537F, 56.760426F, 37.310974F, 56.59615F);
      ((Path)localObject1).cubicTo(40.155125F, 56.27166F, 42.890575F, 55.61455F, 45.487305F, 54.680122F);
      ((Path)localObject1).cubicTo(45.20662F, 54.5866F, 44.930805F, 54.46461F, 44.66391F, 54.31172F);
      ((Path)localObject1).cubicTo(43.074722F, 53.400875F, 42.252953F, 51.668648F, 42.416008F, 49.9535F);
      ((Path)localObject1).cubicTo(40.560738F, 50.54392F, 38.622723F, 50.967625F, 36.61981F, 51.196148F);
      ((Path)localObject1).cubicTo(35.40378F, 51.3344F, 34.20155F, 51.405155F, 33.044743F, 51.405155F);
      ((Path)localObject1).cubicTo(31.908216F, 51.405155F, 30.75709F, 51.34172F, 29.622187F, 51.21648F);
      ((Path)localObject1).cubicTo(29.38612F, 51.190456F, 29.150055F, 51.15386F, 28.913988F, 51.122143F);
      ((Path)localObject1).cubicTo(27.355625F, 50.913948F, 25.81511F, 50.595154F, 24.326513F, 50.158436F);
      ((Path)localObject1).cubicTo(24.023926F, 50.06166F, 23.70187F, 50.01205F, 23.373325F, 50.01205F);
      ((Path)localObject1).cubicTo(22.85982F, 50.01205F, 22.361727F, 50.148678F, 21.857145F, 50.410545F);
      ((Path)localObject1).cubicTo(21.791437F, 50.444702F, 21.72654F, 50.473167F, 21.66083F, 50.511387F);
      ((Path)localObject1).lineTo(15.966034F, 53.875816F);
      ((Path)localObject1).lineTo(15.719421F, 54.0222F);
      ((Path)localObject1).cubicTo(15.589625F, 54.097836F, 15.51986F, 54.124672F, 15.456585F, 54.124672F);
      ((Path)localObject1).cubicTo(15.247289F, 54.124672F, 15.077743F, 53.947384F, 15.077743F, 53.730244F);
      ((Path)localObject1).lineTo(15.297585F, 52.840546F);
      ((Path)localObject1).cubicTo(15.359238F, 52.605515F, 15.446039F, 52.275333F, 15.550687F, 51.87359F);
      ((Path)localObject1).cubicTo(15.673993F, 51.4019F, 15.819202F, 50.847263F, 15.966034F, 50.28856F);
      ((Path)localObject1).cubicTo(16.127468F, 49.670486F, 16.290524F, 49.047535F, 16.428432F, 48.518917F);
      ((Path)localObject1).cubicTo(16.486029F, 48.313168F, 16.544437F, 48.065937F, 16.544437F, 47.788616F);
      ((Path)localObject1).cubicTo(16.544437F, 47.02172F, 16.178574F, 46.29711F, 15.568534F, 45.85226F);
      ((Path)localObject1).cubicTo(15.258646F, 45.622112F, 14.948758F, 45.38139F, 14.623457F, 45.115456F);
      ((Path)localObject1).cubicTo(14.124554F, 44.708015F, 13.647554F, 44.28431F, 13.188401F, 43.847595F);
      ((Path)localObject1).cubicTo(11.898554F, 42.62121F, 10.766085F, 41.282593F, 9.814518F, 39.848015F);
      ((Path)localObject1).cubicTo(7.5747275F, 36.472202F, 6.39034F, 32.64178F, 6.39034F, 28.769882F);
      ((Path)localObject1).cubicTo(6.39034F, 25.764914F, 7.0758243F, 22.842896F, 8.427324F, 20.084341F);
      ((Path)localObject1).cubicTo(9.437299F, 18.02437F, 10.796911F, 16.105907F, 12.469656F, 14.382624F);
      ((Path)localObject1).cubicTo(16.801596F, 9.921118F, 22.89308F, 7.0600934F, 29.622187F, 6.3273525F);
      ((Path)localObject1).cubicTo(30.792784F, 6.1996717F, 31.944723F, 6.1346116F, 33.044743F, 6.1346116F);
      ((Path)localObject1).cubicTo(34.19993F, 6.1346116F, 35.402973F, 6.204551F, 36.61981F, 6.3436174F);
      ((Path)localObject1).cubicTo(43.31728F, 7.1064487F, 49.37307F, 9.982111F, 53.672558F, 14.439551F);
      ((Path)localObject1).cubicTo(55.338F, 16.1669F, 56.690315F, 18.08943F, 57.69299F, 20.15428F);
      ((Path)localObject1).cubicTo(59.022583F, 22.894943F, 59.696712F, 25.793377F, 59.696712F, 28.769882F);
      ((Path)localObject1).cubicTo(59.696712F, 29.078918F, 59.677242F, 29.387142F, 59.66264F, 29.696178F);
      ((Path)localObject1).cubicTo(61.39947F, 28.630003F, 63.695236F, 28.839008F, 65.20006F, 30.34678F);
      ((Path)localObject1).cubicTo(65.275505F, 30.423225F, 65.33959F, 30.506178F, 65.40855F, 30.586689F);
      ((Path)localObject1).cubicTo(65.45803F, 29.952353F, 65.48642F, 29.31639F, 65.48642F, 28.678799F);
      ((Path)localObject1).cubicTo(65.48642F, 24.88904F, 64.63058F, 21.205004F, 62.944042F, 17.729973F);
      ((Path)localObject1).cubicTo(61.68989F, 15.145454F, 60.003357F, 12.746359F, 57.93311F, 10.598557F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\of.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */