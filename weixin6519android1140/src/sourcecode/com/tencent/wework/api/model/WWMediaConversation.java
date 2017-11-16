package com.tencent.wework.api.model;

import android.os.Bundle;

public class WWMediaConversation
  extends WWMediaMessage.WWMediaObject
{
  public long date;
  public String ljz;
  public String name;
  public byte[] ymD;
  public WWMediaMessage.WWMediaObject ymE;
  
  public final boolean checkArgs()
  {
    if (!super.checkArgs()) {}
    while (((this.ymD != null) && (this.ymD.length > 10485760)) || ((this.ljz != null) && (this.ljz.length() > 10240)) || ((this.ljz != null) && (getFileSize(this.ljz) > 10485760)) || (this.ymE == null) || (!this.ymE.checkArgs())) {
      return false;
    }
    return true;
  }
  
  public final void toBundle(Bundle paramBundle)
  {
    super.toBundle(paramBundle);
    paramBundle.putString("_wwconvobject_name", this.name);
    paramBundle.putLong("_wwconvobject_date", this.date);
    paramBundle.putByteArray("_wwconvobject_avatarData", this.ymD);
    paramBundle.putString("_wwconvobject_avatarPath", this.ljz);
    paramBundle.putBundle("_wwconvobject_message", BaseMessage.b(this.ymE));
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\wework\api\model\WWMediaConversation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */