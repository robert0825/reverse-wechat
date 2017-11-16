package com.tencent.wework.api.model;

import android.os.Bundle;

public class WWMediaLocation
  extends WWMediaMessage.WWMediaObject
{
  public String gEy;
  public double latitude;
  public double longitude;
  public double ymF;
  
  public final boolean checkArgs()
  {
    if (!super.checkArgs()) {}
    while ((this.gEy == null) || (this.gEy.length() == 0) || (this.gEy.length() > 10240)) {
      return false;
    }
    return true;
  }
  
  public final void toBundle(Bundle paramBundle)
  {
    paramBundle.putString("_wwlocobject_address", this.gEy);
    paramBundle.putDouble("_wwlocobject_longitude", this.longitude);
    paramBundle.putDouble("_wwlocobject_latitude", this.latitude);
    paramBundle.putDouble("_wwlocobject_zoom", this.ymF);
    super.toBundle(paramBundle);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\wework\api\model\WWMediaLocation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */