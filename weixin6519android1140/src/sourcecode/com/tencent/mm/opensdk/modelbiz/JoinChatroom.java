package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.utils.d;

public class JoinChatroom
{
  private JoinChatroom()
  {
    GMTrace.i(18253611008L, 136);
    GMTrace.o(18253611008L, 136);
  }
  
  public static class Req
    extends BaseReq
  {
    public String chatroomNickName;
    public String extMsg;
    public String groupId;
    
    public Req()
    {
      GMTrace.i(16911433728L, 126);
      this.groupId = "";
      GMTrace.o(16911433728L, 126);
    }
    
    public boolean checkArgs()
    {
      GMTrace.i(17179869184L, 128);
      if (d.a(this.groupId))
      {
        GMTrace.o(17179869184L, 128);
        return false;
      }
      GMTrace.o(17179869184L, 128);
      return true;
    }
    
    public int getType()
    {
      GMTrace.i(17045651456L, 127);
      GMTrace.o(17045651456L, 127);
      return 15;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      GMTrace.i(17314086912L, 129);
      super.toBundle(paramBundle);
      paramBundle.putString("_wxapi_join_chatroom_group_id", this.groupId);
      paramBundle.putString("_wxapi_join_chatroom_chatroom_nickname", this.chatroomNickName);
      paramBundle.putString("_wxapi_join_chatroom_ext_msg", this.extMsg);
      paramBundle.putString("_wxapi_basereq_openid", this.openId);
      GMTrace.o(17314086912L, 129);
    }
  }
  
  public static class Resp
    extends BaseResp
  {
    public String extMsg;
    
    public Resp()
    {
      GMTrace.i(17448304640L, 130);
      GMTrace.o(17448304640L, 130);
    }
    
    public Resp(Bundle paramBundle)
    {
      GMTrace.i(17582522368L, 131);
      fromBundle(paramBundle);
      GMTrace.o(17582522368L, 131);
    }
    
    public boolean checkArgs()
    {
      GMTrace.i(18119393280L, 135);
      GMTrace.o(18119393280L, 135);
      return true;
    }
    
    public void fromBundle(Bundle paramBundle)
    {
      GMTrace.i(17850957824L, 133);
      super.fromBundle(paramBundle);
      this.extMsg = paramBundle.getString("_wxapi_join_chatroom_ext_msg");
      GMTrace.o(17850957824L, 133);
    }
    
    public int getType()
    {
      GMTrace.i(17716740096L, 132);
      GMTrace.o(17716740096L, 132);
      return 15;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      GMTrace.i(17985175552L, 134);
      super.toBundle(paramBundle);
      paramBundle.putString("_wxapi_join_chatroom_ext_msg", this.extMsg);
      GMTrace.o(17985175552L, 134);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\opensdk\modelbiz\JoinChatroom.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */