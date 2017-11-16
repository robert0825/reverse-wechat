package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.utils.Log;

public class JumpToBizProfile
{
  public static final int JUMP_TO_HARD_WARE_BIZ_PROFILE = 1;
  public static final int JUMP_TO_NORMAL_BIZ_PROFILE = 0;
  
  public JumpToBizProfile()
  {
    GMTrace.i(19058917376L, 142);
    GMTrace.o(19058917376L, 142);
  }
  
  public static class Req
    extends BaseReq
  {
    private static final int EXT_MSG_LENGTH = 1024;
    private static final String TAG = "MicroMsg.SDK.JumpToBizProfile.Req";
    public String extMsg;
    public int profileType;
    public String toUserName;
    
    public Req()
    {
      GMTrace.i(18387828736L, 137);
      this.profileType = 0;
      GMTrace.o(18387828736L, 137);
    }
    
    public boolean checkArgs()
    {
      GMTrace.i(18656264192L, 139);
      if ((this.toUserName == null) || (this.toUserName.length() == 0))
      {
        Log.e("MicroMsg.SDK.JumpToBizProfile.Req", "checkArgs fail, toUserName is invalid");
        GMTrace.o(18656264192L, 139);
        return false;
      }
      if ((this.extMsg != null) && (this.extMsg.length() > 1024))
      {
        Log.e("MicroMsg.SDK.JumpToBizProfile.Req", "ext msg is not null, while the length exceed 1024 bytes");
        GMTrace.o(18656264192L, 139);
        return false;
      }
      if ((this.profileType == 1) && ((this.extMsg == null) || (this.extMsg.length() == 0)))
      {
        Log.e("MicroMsg.SDK.JumpToBizProfile.Req", "scene is jump to hardware profile, while extmsg is null");
        GMTrace.o(18656264192L, 139);
        return false;
      }
      GMTrace.o(18656264192L, 139);
      return true;
    }
    
    public void fromBundle(Bundle paramBundle)
    {
      GMTrace.i(18924699648L, 141);
      super.fromBundle(paramBundle);
      this.toUserName = paramBundle.getString("_wxapi_jump_to_biz_profile_req_to_user_name");
      this.extMsg = paramBundle.getString("_wxapi_jump_to_biz_profile_req_ext_msg");
      GMTrace.o(18924699648L, 141);
    }
    
    public int getType()
    {
      GMTrace.i(18522046464L, 138);
      GMTrace.o(18522046464L, 138);
      return 7;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      GMTrace.i(18790481920L, 140);
      super.toBundle(paramBundle);
      paramBundle.putString("_wxapi_jump_to_biz_profile_req_to_user_name", this.toUserName);
      paramBundle.putString("_wxapi_jump_to_biz_profile_req_ext_msg", this.extMsg);
      paramBundle.putInt("_wxapi_jump_to_biz_profile_req_scene", 0);
      paramBundle.putInt("_wxapi_jump_to_biz_profile_req_profile_type", this.profileType);
      GMTrace.o(18790481920L, 140);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\opensdk\modelbiz\JumpToBizProfile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */