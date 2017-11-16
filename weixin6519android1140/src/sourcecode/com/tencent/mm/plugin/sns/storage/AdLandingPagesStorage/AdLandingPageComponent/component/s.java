package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONException;
import org.json.JSONObject;

public final class s
  extends i
  implements SensorEventListener
{
  private SensorManager aDS;
  Sensor aHC;
  Sensor aHE;
  ImageView eId;
  ProgressBar jeL;
  int pHY;
  final float pHZ;
  final int pIa;
  HorizontalScrollView pIb;
  float[] pIc;
  float[] pId;
  private int pIe;
  boolean pIf;
  
  public s(Context paramContext, o paramo, ViewGroup paramViewGroup)
  {
    super(paramContext, paramo, paramViewGroup);
    GMTrace.i(8233318088704L, 61343);
    this.pHZ = 10.0F;
    this.pIa = 1;
    this.pIe = 0;
    this.pIf = true;
    GMTrace.o(8233318088704L, 61343);
  }
  
  public final boolean L(JSONObject paramJSONObject)
  {
    GMTrace.i(8234660265984L, 61353);
    if (!super.L(paramJSONObject))
    {
      GMTrace.o(8234660265984L, 61353);
      return false;
    }
    try
    {
      paramJSONObject.put("swipeCount", this.pIe);
      if (!this.pIf)
      {
        String str = aa.RP(((o)this.pGS).pEn);
        JSONObject localJSONObject = new JSONObject();
        localJSONObject.put("urlMd5", str);
        localJSONObject.put("needDownload", 1);
        paramJSONObject.put("imgUrlInfo", localJSONObject);
      }
      GMTrace.o(8234660265984L, 61353);
      return true;
    }
    catch (JSONException paramJSONObject)
    {
      w.printErrStackTrace("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", paramJSONObject, "", new Object[0]);
      GMTrace.o(8234660265984L, 61353);
    }
    return false;
  }
  
  protected final int aXW()
  {
    GMTrace.i(8233452306432L, 61344);
    int i = i.g.pfe;
    GMTrace.o(8233452306432L, 61344);
    return i;
  }
  
  public final View bkC()
  {
    GMTrace.i(8233586524160L, 61345);
    View localView = this.hqF;
    this.aDS = ((SensorManager)this.context.getSystemService("sensor"));
    this.aHC = this.aDS.getDefaultSensor(1);
    this.aHE = this.aDS.getDefaultSensor(2);
    this.pIb = ((HorizontalScrollView)localView.findViewById(i.f.oYG));
    this.eId = ((ImageView)localView.findViewById(i.f.oYH));
    this.jeL = ((ProgressBar)localView.findViewById(i.f.bUy));
    this.jeL.setVisibility(8);
    GMTrace.o(8233586524160L, 61345);
    return localView;
  }
  
  protected final void bkI()
  {
    GMTrace.i(8233720741888L, 61346);
    if (!e.aZ(d.dL("adId", ((o)this.pGS).pEn))) {
      this.pIf = false;
    }
    this.pIb.setLayoutParams(new RelativeLayout.LayoutParams(this.jsh, this.jsi));
    this.eId.setLayoutParams(new RelativeLayout.LayoutParams(this.jsh, this.jsi));
    this.hqF.setLayoutParams(new LinearLayout.LayoutParams(this.jsh, this.jsi));
    this.hqF.setPadding(this.hqF.getPaddingLeft(), (int)((o)this.pGS).pEB, this.hqF.getPaddingRight(), (int)((o)this.pGS).pEC);
    String str = ((o)this.pGS).pEn;
    Bitmap localBitmap = d.dN("adId", str);
    if (localBitmap != null)
    {
      w.i("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", "loaded cached image with  " + str);
      setImage(localBitmap);
      GMTrace.o(8233720741888L, 61346);
      return;
    }
    startLoading();
    d.a(str, ((o)this.pGS).pEA, new d.a()
    {
      public final void Ih(String paramAnonymousString)
      {
        GMTrace.i(8267677827072L, 61599);
        try
        {
          paramAnonymousString = BitmapFactory.decodeFile(paramAnonymousString);
          s.this.setImage(paramAnonymousString);
          GMTrace.o(8267677827072L, 61599);
          return;
        }
        catch (Exception paramAnonymousString)
        {
          w.e("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", "%s" + bg.f(paramAnonymousString));
          GMTrace.o(8267677827072L, 61599);
        }
      }
      
      public final void bkK()
      {
        GMTrace.i(8267409391616L, 61597);
        s.this.startLoading();
        GMTrace.o(8267409391616L, 61597);
      }
      
      public final void bkL()
      {
        GMTrace.i(8267543609344L, 61598);
        s.this.jeL.setVisibility(8);
        GMTrace.o(8267543609344L, 61598);
      }
    });
    GMTrace.o(8233720741888L, 61346);
  }
  
  public final void bkm()
  {
    GMTrace.i(8234391830528L, 61351);
    super.bkm();
    this.aDS.registerListener(this, this.aHC, 1);
    this.aDS.registerListener(this, this.aHE, 1);
    GMTrace.o(8234391830528L, 61351);
  }
  
  public final void bkn()
  {
    GMTrace.i(8234526048256L, 61352);
    super.bkn();
    this.aDS.unregisterListener(this);
    GMTrace.o(8234526048256L, 61352);
  }
  
  public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
    GMTrace.i(8234257612800L, 61350);
    GMTrace.o(8234257612800L, 61350);
  }
  
  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    float f2 = -10.0F;
    GMTrace.i(8234123395072L, 61349);
    if (paramSensorEvent.sensor.getType() == 1) {
      this.pIc = paramSensorEvent.values;
    }
    if (paramSensorEvent.sensor.getType() == 2) {
      this.pId = paramSensorEvent.values;
    }
    float f1;
    if ((this.pIc != null) && (this.pId != null))
    {
      paramSensorEvent = new float[9];
      if (SensorManager.getRotationMatrix(paramSensorEvent, new float[9], this.pIc, this.pId))
      {
        float[] arrayOfFloat = new float[3];
        SensorManager.getOrientation(paramSensorEvent, arrayOfFloat);
        float f3 = arrayOfFloat[2];
        if (this.pHY != 0)
        {
          f1 = f3;
          if (f3 > 10.0F) {
            f1 = 10.0F;
          }
          if (f1 >= -10.0F) {
            break label169;
          }
          f1 = f2;
        }
      }
    }
    label169:
    for (;;)
    {
      f1 = f1 * this.pHY / 10.0F;
      this.pIb.scrollBy((int)f1, 0);
      GMTrace.o(8234123395072L, 61349);
      return;
    }
  }
  
  public final void setImage(Bitmap paramBitmap)
  {
    GMTrace.i(8233989177344L, 61348);
    if (paramBitmap == null)
    {
      w.e("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", "when set image the bmp is null!");
      GMTrace.o(8233989177344L, 61348);
      return;
    }
    if (this.eId == null)
    {
      w.e("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", "when set image the imageView is null!");
      GMTrace.o(8233989177344L, 61348);
      return;
    }
    if (paramBitmap.getHeight() == 0)
    {
      w.e("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", "when set image the bmp.getHeight is 0!");
      GMTrace.o(8233989177344L, 61348);
      return;
    }
    this.jeL.setVisibility(8);
    this.eId.setImageBitmap(paramBitmap);
    this.eId.setLayoutParams(new RelativeLayout.LayoutParams(paramBitmap.getWidth() * this.jsi / paramBitmap.getHeight(), this.jsi));
    this.eId.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8265932996608L, 61586);
        int i = s.this.eId.getMeasuredWidth();
        if (i > s.this.jsh)
        {
          s.this.pHY = ((i - s.this.jsh) / 2);
          s.this.pIb.scrollBy(s.this.pHY, 0);
        }
        GMTrace.o(8265932996608L, 61586);
      }
    });
    if (paramBitmap.getHeight() != 0) {
      this.hqF.setLayoutParams(new LinearLayout.LayoutParams(paramBitmap.getWidth() * this.jsi / paramBitmap.getHeight(), this.jsi));
    }
    GMTrace.o(8233989177344L, 61348);
  }
  
  public final void startLoading()
  {
    GMTrace.i(8233854959616L, 61347);
    this.jeL.setVisibility(0);
    GMTrace.o(8233854959616L, 61347);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */