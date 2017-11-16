package com.tencent.wework.api.model;

import android.os.Bundle;

public class WWMediaLink
  extends WWMediaMessage.WWMediaObject
{
  public String thumbUrl;
  public String webpageUrl;
  
  public final boolean checkArgs()
  {
    if (!super.checkArgs()) {}
    while ((this.webpageUrl == null) || (this.webpageUrl.length() == 0) || (this.webpageUrl.length() > 10240)) {
      return false;
    }
    return true;
  }
  
  public final void toBundle(Bundle paramBundle)
  {
    paramBundle.putString("_wwwebpageobject_thumbUrl", this.thumbUrl);
    paramBundle.putString("_wwwebpageobject_webpageUrl", this.webpageUrl);
    super.toBundle(paramBundle);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\wework\api\model\WWMediaLink.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */