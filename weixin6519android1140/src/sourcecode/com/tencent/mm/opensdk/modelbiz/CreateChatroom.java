package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.utils.d;

public class CreateChatroom
{
  private CreateChatroom()
  {
    GMTrace.i(15300820992L, 114);
    GMTrace.o(15300820992L, 114);
  }
  
  public static class Req
    extends BaseReq
  {
    public String chatroomName;
    public String chatroomNickName;
    public String extMsg;
    public String groupId;
    
    public Req()
    {
      GMTrace.i(13958643712L, 104);
      this.groupId = "";
      GMTrace.o(13958643712L, 104);
    }
    
    public boolean checkArgs()
    {
      GMTrace.i(14227079168L, 106);
      if (d.a(this.groupId))
      {
        GMTrace.o(14227079168L, 106);
        return false;
      }
      GMTrace.o(14227079168L, 106);
      return true;
    }
    
    public int getType()
    {
      GMTrace.i(14092861440L, 105);
      GMTrace.o(14092861440L, 105);
      return 14;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      GMTrace.i(14361296896L, 107);
      super.toBundle(paramBundle);
      paramBundle.putString("_wxapi_create_chatroom_group_id", this.groupId);
      paramBundle.putString("_wxapi_create_chatroom_chatroom_name", this.chatroomName);
      paramBundle.putString("_wxapi_create_chatroom_chatroom_nickname", this.chatroomNickName);
      paramBundle.putString("_wxapi_create_chatroom_ext_msg", this.extMsg);
      paramBundle.putString("_wxapi_basereq_openid", this.openId);
      GMTrace.o(14361296896L, 107);
    }
  }
  
  public static class Resp
    extends BaseResp
  {
    public String extMsg;
    
    public Resp()
    {
      GMTrace.i(14495514624L, 108);
      GMTrace.o(14495514624L, 108);
    }
    
    public Resp(Bundle paramBundle)
    {
      GMTrace.i(14629732352L, 109);
      fromBundle(paramBundle);
      GMTrace.o(14629732352L, 109);
    }
    
    public boolean checkArgs()
    {
      GMTrace.i(15166603264L, 113);
      GMTrace.o(15166603264L, 113);
      return true;
    }
    
    public void fromBundle(Bundle paramBundle)
    {
      GMTrace.i(14898167808L, 111);
      super.fromBundle(paramBundle);
      this.extMsg = paramBundle.getString("_wxapi_create_chatroom_ext_msg");
      GMTrace.o(14898167808L, 111);
    }
    
    public int getType()
    {
      GMTrace.i(14763950080L, 110);
      GMTrace.o(14763950080L, 110);
      return 14;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      GMTrace.i(15032385536L, 112);
      super.toBundle(paramBundle);
      paramBundle.putString("_wxapi_create_chatroom_ext_msg", this.extMsg);
      GMTrace.o(15032385536L, 112);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\opensdk\modelbiz\CreateChatroom.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */