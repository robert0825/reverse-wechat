package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.Exif;
import com.tencent.mm.compatible.util.Exif.a;
import com.tencent.mm.modelsfs.FileOp;
import java.io.InputStream;

public final class BackwardSupportUtil
{
  public static final class ExifHelper
  {
    public static LatLongData RA(String paramString)
    {
      GMTrace.i(13772349505536L, 102612);
      if (bg.nm(paramString))
      {
        w.d("MicroMsg.SDK.BackwardSupportUtil", "filepath is null or nil");
        GMTrace.o(13772349505536L, 102612);
        return null;
      }
      if (!FileOp.aZ(paramString))
      {
        w.d("MicroMsg.SDK.BackwardSupportUtil", "file not exist:[%s]", new Object[] { paramString });
        GMTrace.o(13772349505536L, 102612);
        return null;
      }
      paramString = Exif.fromFile(paramString).getLocation();
      if (paramString != null)
      {
        LatLongData localLatLongData = new LatLongData();
        localLatLongData.eMl = ((float)paramString.latitude);
        localLatLongData.gIN = ((float)paramString.longitude);
        GMTrace.o(13772349505536L, 102612);
        return localLatLongData;
      }
      GMTrace.o(13772349505536L, 102612);
      return null;
    }
    
    public static int Rz(String paramString)
    {
      GMTrace.i(13772215287808L, 102611);
      if (bg.nm(paramString))
      {
        w.d("MicroMsg.SDK.BackwardSupportUtil", "filepath is null or nil");
        GMTrace.o(13772215287808L, 102611);
        return 0;
      }
      if (!FileOp.aZ(paramString))
      {
        w.d("MicroMsg.SDK.BackwardSupportUtil", "file not exist:[%s]", new Object[] { paramString });
        GMTrace.o(13772215287808L, 102611);
        return 0;
      }
      int i = Exif.fromFile(paramString).getOrientationInDegree();
      GMTrace.o(13772215287808L, 102611);
      return i;
    }
    
    public static class LatLongData
      implements Parcelable
    {
      public static final Parcelable.Creator<LatLongData> CREATOR;
      public float eMl;
      public float gIN;
      
      static
      {
        GMTrace.i(13770604675072L, 102599);
        CREATOR = new Parcelable.Creator() {};
        GMTrace.o(13770604675072L, 102599);
      }
      
      public LatLongData()
      {
        GMTrace.i(13769799368704L, 102593);
        this.eMl = 0.0F;
        this.gIN = 0.0F;
        GMTrace.o(13769799368704L, 102593);
      }
      
      public LatLongData(float paramFloat1, float paramFloat2)
      {
        GMTrace.i(13769933586432L, 102594);
        this.eMl = paramFloat1;
        this.gIN = paramFloat2;
        GMTrace.o(13769933586432L, 102594);
      }
      
      public int describeContents()
      {
        GMTrace.i(13770336239616L, 102597);
        GMTrace.o(13770336239616L, 102597);
        return 0;
      }
      
      public boolean equals(Object paramObject)
      {
        GMTrace.i(13770202021888L, 102596);
        if (!(paramObject instanceof LatLongData))
        {
          GMTrace.o(13770202021888L, 102596);
          return false;
        }
        paramObject = (LatLongData)paramObject;
        if ((Math.abs(this.eMl - ((LatLongData)paramObject).eMl) < 1.0E-6F) && (Math.abs(this.gIN - ((LatLongData)paramObject).gIN) < 1.0E-6F))
        {
          GMTrace.o(13770202021888L, 102596);
          return true;
        }
        GMTrace.o(13770202021888L, 102596);
        return false;
      }
      
      public int hashCode()
      {
        GMTrace.i(13770067804160L, 102595);
        int i = (int)(this.eMl * 10000.0F);
        int j = (int)(this.gIN * 10000.0F);
        GMTrace.o(13770067804160L, 102595);
        return i + j;
      }
      
      public void writeToParcel(Parcel paramParcel, int paramInt)
      {
        GMTrace.i(13770470457344L, 102598);
        paramParcel.writeFloat(this.eMl);
        paramParcel.writeFloat(this.gIN);
        GMTrace.o(13770470457344L, 102598);
      }
    }
  }
  
  public static final class a
  {
    public static void c(View paramView, Animation paramAnimation)
    {
      GMTrace.i(13743224258560L, 102395);
      if (Build.VERSION.SDK_INT >= 8)
      {
        new c();
        paramAnimation.cancel();
        GMTrace.o(13743224258560L, 102395);
        return;
      }
      new b();
      if (paramView != null) {
        paramView.setAnimation(null);
      }
      GMTrace.o(13743224258560L, 102395);
    }
  }
  
  public static final class b
  {
    public static int a(Context paramContext, float paramFloat)
    {
      GMTrace.i(13772752158720L, 102615);
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
      int i = Math.round(localDisplayMetrics.densityDpi * paramFloat / 160.0F);
      GMTrace.o(13772752158720L, 102615);
      return i;
    }
    
    public static Bitmap a(InputStream paramInputStream, float paramFloat)
    {
      GMTrace.i(13772886376448L, 102616);
      paramInputStream = d.a(paramInputStream, paramFloat, 0, 0);
      if (paramInputStream != null) {
        paramInputStream.setDensity((int)(160.0F * paramFloat));
      }
      GMTrace.o(13772886376448L, 102616);
      return paramInputStream;
    }
    
    public static Bitmap c(String paramString, float paramFloat)
    {
      GMTrace.i(13772617940992L, 102614);
      paramString = d.d(paramString, paramFloat);
      if (paramString != null) {
        paramString.setDensity((int)(160.0F * paramFloat));
      }
      GMTrace.o(13772617940992L, 102614);
      return paramString;
    }
    
    public static String el(Context paramContext)
    {
      GMTrace.i(13773020594176L, 102617);
      Object localObject = paramContext.getResources().getDisplayMetrics();
      Configuration localConfiguration = paramContext.getResources().getConfiguration();
      if (((DisplayMetrics)localObject).density < 1.0F)
      {
        paramContext = "" + "LDPI";
        localObject = new StringBuilder().append(paramContext);
        if (localConfiguration.orientation != 2) {
          break label154;
        }
      }
      label154:
      for (paramContext = "_L";; paramContext = "_P")
      {
        paramContext = paramContext;
        GMTrace.o(13773020594176L, 102617);
        return paramContext;
        if (((DisplayMetrics)localObject).density >= 1.5F)
        {
          paramContext = "" + "HDPI";
          break;
        }
        paramContext = "" + "MDPI";
        break;
      }
    }
  }
  
  public static final class c
  {
    public static void a(ListView paramListView)
    {
      GMTrace.i(13742687387648L, 102391);
      if (paramListView == null)
      {
        GMTrace.o(13742687387648L, 102391);
        return;
      }
      if (Build.VERSION.SDK_INT >= 8)
      {
        new ba();
        if (paramListView.getFirstVisiblePosition() > 10) {
          paramListView.setSelection(10);
        }
        if (Build.VERSION.SDK_INT >= 8) {
          paramListView.smoothScrollToPosition(0);
        }
        GMTrace.o(13742687387648L, 102391);
        return;
      }
      new az();
      paramListView.setSelection(0);
      GMTrace.o(13742687387648L, 102391);
    }
    
    public static void b(ListView paramListView, int paramInt)
    {
      GMTrace.i(13742821605376L, 102392);
      if (paramListView == null)
      {
        GMTrace.o(13742821605376L, 102392);
        return;
      }
      if (Build.VERSION.SDK_INT >= 8)
      {
        new ba();
        int i = paramListView.getFirstVisiblePosition();
        if ((i > paramInt) && (i - paramInt > 10)) {
          paramListView.setSelection(paramInt + 10);
        }
        for (;;)
        {
          if (Build.VERSION.SDK_INT >= 8) {
            paramListView.smoothScrollToPosition(paramInt);
          }
          GMTrace.o(13742821605376L, 102392);
          return;
          if ((i < paramInt) && (paramInt - i > 10)) {
            paramListView.setSelection(paramInt - 10);
          }
        }
      }
      new az();
      paramListView.setSelection(paramInt);
      GMTrace.o(13742821605376L, 102392);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\BackwardSupportUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */