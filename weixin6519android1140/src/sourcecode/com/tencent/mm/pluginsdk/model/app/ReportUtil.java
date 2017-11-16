package com.tencent.mm.pluginsdk.model.app;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.channel.MMessageActV2.Args;
import com.tencent.mm.opensdk.modelmsg.SendAuth.Resp;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Resp;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.y.at;

public final class ReportUtil
{
  public static void a(Context paramContext, ReportArgs paramReportArgs)
  {
    GMTrace.i(827049639936L, 6162);
    if (paramReportArgs.nJ == 1)
    {
      localObject = new SendAuth.Resp();
      ((SendAuth.Resp)localObject).transaction = paramReportArgs.transaction;
      ((SendAuth.Resp)localObject).errCode = paramReportArgs.errCode;
      ((SendAuth.Resp)localObject).openId = paramReportArgs.openId;
      localBundle = new Bundle();
      ((SendAuth.Resp)localObject).toBundle(localBundle);
      p.ag(localBundle);
      localObject = new MMessageActV2.Args();
      ((MMessageActV2.Args)localObject).targetPkgName = paramReportArgs.tF;
      ((MMessageActV2.Args)localObject).bundle = localBundle;
      MMessageActV2.send(paramContext, (MMessageActV2.Args)localObject);
      GMTrace.o(827049639936L, 6162);
      return;
    }
    Object localObject = new SendMessageToWX.Resp();
    ((SendMessageToWX.Resp)localObject).errCode = paramReportArgs.errCode;
    ((SendMessageToWX.Resp)localObject).transaction = paramReportArgs.transaction;
    ((SendMessageToWX.Resp)localObject).openId = paramReportArgs.openId;
    Bundle localBundle = new Bundle();
    ((SendMessageToWX.Resp)localObject).toBundle(localBundle);
    p.ag(localBundle);
    localObject = new MMessageActV2.Args();
    ((MMessageActV2.Args)localObject).targetPkgName = paramReportArgs.tF;
    ((MMessageActV2.Args)localObject).bundle = localBundle;
    MMessageActV2.send(paramContext, (MMessageActV2.Args)localObject);
    GMTrace.o(827049639936L, 6162);
  }
  
  public static ReportArgs b(Bundle paramBundle, int paramInt)
  {
    GMTrace.i(827183857664L, 6163);
    Object localObject2 = paramBundle.getString("SendAppMessageWrapper_AppId");
    Object localObject1 = localObject2;
    Object localObject3;
    if (localObject2 == null)
    {
      localObject3 = paramBundle.getString("_mmessage_content");
      localObject1 = localObject2;
      if (localObject3 != null) {
        localObject1 = Uri.parse((String)localObject3).getQueryParameter("appid");
      }
    }
    localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject1 = s.i(paramBundle, "_wxapi_payreq_appid");
      localObject2 = localObject1;
      if (localObject1 == null)
      {
        GMTrace.o(827183857664L, 6163);
        return null;
      }
    }
    localObject1 = new f();
    ((f)localObject1).field_appId = ((String)localObject2);
    if ((at.AT()) && (at.AU())) {
      an.aWy().b((c)localObject1, new String[0]);
    }
    for (;;)
    {
      localObject2 = new ReportArgs();
      ((ReportArgs)localObject2).tF = ((f)localObject1).field_packageName;
      ((ReportArgs)localObject2).errCode = paramInt;
      localObject3 = new SendMessageToWX.Req();
      ((SendMessageToWX.Req)localObject3).fromBundle(paramBundle);
      ((ReportArgs)localObject2).transaction = ((SendMessageToWX.Req)localObject3).transaction;
      ((ReportArgs)localObject2).openId = ((f)localObject1).field_openId;
      ((ReportArgs)localObject2).nJ = paramBundle.getInt("_wxapi_command_type");
      GMTrace.o(827183857664L, 6163);
      return (ReportArgs)localObject2;
      ((f)localObject1).field_packageName = paramBundle.getString("_mmessage_appPackage");
    }
  }
  
  public static class ReportArgs
    implements Parcelable
  {
    public static final Parcelable.Creator<ReportArgs> CREATOR;
    public int errCode;
    public int nJ;
    public String openId;
    public String tF;
    public String transaction;
    
    static
    {
      GMTrace.i(789334458368L, 5881);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(789334458368L, 5881);
    }
    
    public ReportArgs()
    {
      GMTrace.i(788931805184L, 5878);
      GMTrace.o(788931805184L, 5878);
    }
    
    public ReportArgs(Parcel paramParcel)
    {
      GMTrace.i(789066022912L, 5879);
      this.tF = paramParcel.readString();
      this.errCode = paramParcel.readInt();
      this.transaction = paramParcel.readString();
      this.openId = paramParcel.readString();
      GMTrace.o(789066022912L, 5879);
    }
    
    public int describeContents()
    {
      GMTrace.i(788663369728L, 5876);
      GMTrace.o(788663369728L, 5876);
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(788797587456L, 5877);
      paramParcel.writeString(this.tF);
      paramParcel.writeInt(this.errCode);
      paramParcel.writeString(this.transaction);
      paramParcel.writeString(this.openId);
      GMTrace.o(788797587456L, 5877);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\ReportUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */