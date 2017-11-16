package com.tencent.mm.plugin.webview.model;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;

public class WebViewJSSDKImageItem
  extends WebViewJSSDKFileItem
  implements Parcelable
{
  public static final Parcelable.Creator<WebViewJSSDKImageItem> CREATOR;
  
  static
  {
    GMTrace.i(16927271419904L, 126118);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(16927271419904L, 126118);
  }
  
  public WebViewJSSDKImageItem()
  {
    GMTrace.i(12012620873728L, 89501);
    this.eGK = 1;
    GMTrace.o(12012620873728L, 89501);
  }
  
  protected WebViewJSSDKImageItem(Parcel paramParcel)
  {
    super(paramParcel);
    GMTrace.i(16927137202176L, 126117);
    GMTrace.o(16927137202176L, 126117);
  }
  
  public final WebViewJSSDKFileItem bCk()
  {
    GMTrace.i(12012889309184L, 89503);
    this.eHy = ai.Ln(this.hOo);
    bCo();
    GMTrace.o(12012889309184L, 89503);
    return this;
  }
  
  public final String bCl()
  {
    GMTrace.i(12013023526912L, 89504);
    GMTrace.o(12013023526912L, 89504);
    return "jpeg";
  }
  
  public final String bCm()
  {
    GMTrace.i(12013157744640L, 89505);
    GMTrace.o(12013157744640L, 89505);
    return "image";
  }
  
  public final void bCo()
  {
    GMTrace.i(12012755091456L, 89502);
    if (!new File(this.hOo).exists())
    {
      w.i("MicroMsg.WebViewJSSDkImageItem", "Original file not existed");
      GMTrace.o(12012755091456L, 89502);
      return;
    }
    this.idL = ai.Ll(System.currentTimeMillis());
    Bitmap localBitmap = d.a(this.hOo, 640, 640, false, null, 0);
    if (localBitmap != null)
    {
      w.i("MicroMsg.WebViewJSSDkImageItem", "extract thumbnail bitmap");
      localBitmap = d.b(localBitmap, BackwardSupportUtil.ExifHelper.Rz(this.hOo));
      if (localBitmap == null) {}
    }
    try
    {
      d.a(localBitmap, 100, Bitmap.CompressFormat.JPEG, this.idL, true);
      w.i("MicroMsg.WebViewJSSDkImageItem", "Thumb Path: %s", new Object[] { this.idL });
      GMTrace.o(12012755091456L, 89502);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.WebViewJSSDkImageItem", "save bitmap to file failed : %s", new Object[] { localException.getMessage() });
      }
    }
  }
  
  public int describeContents()
  {
    GMTrace.i(16926868766720L, 126115);
    GMTrace.o(16926868766720L, 126115);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(16927002984448L, 126116);
    super.writeToParcel(paramParcel, paramInt);
    GMTrace.o(16927002984448L, 126116);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\WebViewJSSDKImageItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */