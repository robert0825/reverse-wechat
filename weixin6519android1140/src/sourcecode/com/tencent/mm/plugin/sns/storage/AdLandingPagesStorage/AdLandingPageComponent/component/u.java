package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONException;
import org.json.JSONObject;

public final class u
  extends a
{
  private ImageView eId;
  ProgressBar jeL;
  private int jsh;
  private int jsi;
  boolean pEk;
  boolean pGL;
  private WindowManager pIk;
  
  public u(Context paramContext, p paramp, ViewGroup paramViewGroup)
  {
    super(paramContext, paramp, paramViewGroup);
    GMTrace.i(8229694210048L, 61316);
    this.pGL = true;
    GMTrace.o(8229694210048L, 61316);
  }
  
  public final boolean J(Bitmap paramBitmap)
  {
    GMTrace.i(8230365298688L, 61321);
    if (paramBitmap == null)
    {
      w.e("AdLandingPagePureImageComponet", "when set image the bmp is null!");
      GMTrace.o(8230365298688L, 61321);
      return false;
    }
    if (this.eId == null)
    {
      w.e("AdLandingPagePureImageComponet", "when set image the imageView is null!");
      GMTrace.o(8230365298688L, 61321);
      return false;
    }
    if (paramBitmap.getWidth() == 0)
    {
      w.e("AdLandingPagePureImageComponet", "when set image the bmp.getWidth is 0!");
      GMTrace.o(8230365298688L, 61321);
      return false;
    }
    this.eId.setImageBitmap(paramBitmap);
    this.jeL.setVisibility(8);
    GMTrace.o(8230365298688L, 61321);
    return true;
  }
  
  public final boolean L(JSONObject paramJSONObject)
  {
    GMTrace.i(8230499516416L, 61322);
    if (!super.L(paramJSONObject))
    {
      GMTrace.o(8230499516416L, 61322);
      return false;
    }
    try
    {
      if (!this.pGL)
      {
        String str = aa.RP(((p)this.pGS).pEn);
        JSONObject localJSONObject = new JSONObject();
        localJSONObject.put("urlMd5", str);
        localJSONObject.put("needDownload", 1);
        paramJSONObject.put("imgUrlInfo", localJSONObject);
      }
      GMTrace.o(8230499516416L, 61322);
      return true;
    }
    catch (JSONException paramJSONObject)
    {
      w.printErrStackTrace("AdLandingPagePureImageComponet", paramJSONObject, "", new Object[0]);
      GMTrace.o(8230499516416L, 61322);
    }
    return false;
  }
  
  protected final int aXW()
  {
    GMTrace.i(8229828427776L, 61317);
    int i = i.g.pfl;
    GMTrace.o(8229828427776L, 61317);
    return i;
  }
  
  public final View bkC()
  {
    GMTrace.i(8229962645504L, 61318);
    this.eId = ((ImageView)this.hqF.findViewById(i.f.pct));
    this.jeL = ((ProgressBar)this.hqF.findViewById(i.f.bUy));
    View localView = this.hqF;
    GMTrace.o(8229962645504L, 61318);
    return localView;
  }
  
  protected final void bkI()
  {
    GMTrace.i(8230096863232L, 61319);
    if ((this.hqF == null) || (this.eId == null) || (this.jeL == null))
    {
      GMTrace.o(8230096863232L, 61319);
      return;
    }
    if ((p)this.pGS == null)
    {
      GMTrace.o(8230096863232L, 61319);
      return;
    }
    if (this.pIk == null)
    {
      this.pIk = ((WindowManager)this.context.getSystemService("window"));
      this.jsh = this.pIk.getDefaultDisplay().getWidth();
      this.jsi = this.pIk.getDefaultDisplay().getHeight();
    }
    String str = ((p)this.pGS).pEn;
    Object localObject = ((p)this.pGS).pEo;
    float f1 = ((p)this.pGS).height;
    float f2 = ((p)this.pGS).width;
    this.pEk = ((p)this.pGS).pEk;
    if ((f1 != 0.0F) && (f2 != 0.0F) && (!this.pEk)) {
      this.eId.setLayoutParams(new RelativeLayout.LayoutParams((int)f2, (int)f1));
    }
    for (;;)
    {
      if ((localObject != null) && (((String)localObject).length() > 0)) {}
      try
      {
        this.eId.setBackgroundColor(Color.parseColor((String)localObject));
        if ((str == null) || (str.length() <= 0))
        {
          w.i("AdLandingPagePureImageComponet", "Pure image component fillItem without imageurl.");
          GMTrace.o(8230096863232L, 61319);
          return;
          if ((this.pEk) && (f1 != 0.0F) && (f2 != 0.0F))
          {
            this.eId.setLayoutParams(new RelativeLayout.LayoutParams(this.jsh, this.jsi));
            continue;
          }
          this.eId.setLayoutParams(new RelativeLayout.LayoutParams(this.jsh, this.jsi));
          continue;
        }
        localObject = d.dN("adId", str);
        if ((localObject != null) && (J((Bitmap)localObject)))
        {
          w.i("AdLandingPagePureImageComponet", "loaded cached image with  " + str);
          this.pGL = true;
          GMTrace.o(8230096863232L, 61319);
          return;
        }
        this.pGL = false;
        startLoading();
        d.a(str, ((p)this.pGS).pEA, new d.a()
        {
          public final void Ih(String paramAnonymousString)
          {
            GMTrace.i(8242847547392L, 61414);
            try
            {
              paramAnonymousString = BitmapFactory.decodeFile(paramAnonymousString);
              u.this.J(paramAnonymousString);
              GMTrace.o(8242847547392L, 61414);
              return;
            }
            catch (Exception paramAnonymousString)
            {
              w.e("AdLandingPagePureImageComponet", "%s" + bg.f(paramAnonymousString));
              GMTrace.o(8242847547392L, 61414);
            }
          }
          
          public final void bkK()
          {
            GMTrace.i(8242579111936L, 61412);
            u.this.startLoading();
            GMTrace.o(8242579111936L, 61412);
          }
          
          public final void bkL()
          {
            GMTrace.i(8242713329664L, 61413);
            u.this.jeL.setVisibility(8);
            GMTrace.o(8242713329664L, 61413);
          }
        });
        GMTrace.o(8230096863232L, 61319);
        return;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
  
  public final void startLoading()
  {
    GMTrace.i(8230231080960L, 61320);
    this.jeL.setVisibility(0);
    GMTrace.o(8230231080960L, 61320);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */