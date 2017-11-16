package com.tencent.mm.opensdk.openapi;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.channel.MMessageActV2.Args;
import com.tencent.mm.opensdk.channel.a.a;
import com.tencent.mm.opensdk.channel.a.a.a;
import com.tencent.mm.opensdk.channel.a.b;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelbiz.AddCardToWXCardPackage.Resp;
import com.tencent.mm.opensdk.modelbiz.ChooseCardFromWXCardPackage.Resp;
import com.tencent.mm.opensdk.modelbiz.ChooseInvoiceTitle.Req;
import com.tencent.mm.opensdk.modelbiz.CreateChatroom.Resp;
import com.tencent.mm.opensdk.modelbiz.HandleScanResult.Resp;
import com.tencent.mm.opensdk.modelbiz.JoinChatroom.Resp;
import com.tencent.mm.opensdk.modelbiz.OpenWebview.Resp;
import com.tencent.mm.opensdk.modelbiz.SubscribeMessage.Req;
import com.tencent.mm.opensdk.modelbiz.SubscribeMessage.Resp;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram.Req;
import com.tencent.mm.opensdk.modelmsg.GetMessageFromWX.Req;
import com.tencent.mm.opensdk.modelmsg.LaunchFromWX.Req;
import com.tencent.mm.opensdk.modelmsg.SendAuth.Resp;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Resp;
import com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.opensdk.modelpay.PayResp;
import com.tencent.mm.opensdk.utils.ILog;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.d;
import java.net.URLEncoder;

final class WXApiImplV10
  implements IWXAPI
{
  private static final String TAG = "MicroMsg.SDK.WXApiImplV10";
  private static String wxappPayEntryClassname;
  private String appId;
  private boolean checkSignature;
  private Context context;
  private boolean detached;
  
  static
  {
    GMTrace.i(56908316672L, 424);
    wxappPayEntryClassname = null;
    GMTrace.o(56908316672L, 424);
  }
  
  WXApiImplV10(Context paramContext, String paramString, boolean paramBoolean)
  {
    GMTrace.i(53552873472L, 399);
    this.checkSignature = false;
    this.detached = false;
    Log.d("MicroMsg.SDK.WXApiImplV10", "<init>, appId = " + paramString + ", checkSignature = " + paramBoolean);
    this.context = paramContext;
    this.appId = paramString;
    this.checkSignature = paramBoolean;
    GMTrace.o(53552873472L, 399);
  }
  
  private boolean checkSumConsistent(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    GMTrace.i(56774098944L, 423);
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte1.length == 0) || (paramArrayOfByte2 == null) || (paramArrayOfByte2.length == 0))
    {
      Log.e("MicroMsg.SDK.WXApiImplV10", "checkSumConsistent fail, invalid arguments");
      GMTrace.o(56774098944L, 423);
      return false;
    }
    if (paramArrayOfByte1.length != paramArrayOfByte2.length)
    {
      Log.e("MicroMsg.SDK.WXApiImplV10", "checkSumConsistent fail, length is different");
      GMTrace.o(56774098944L, 423);
      return false;
    }
    int i = 0;
    while (i < paramArrayOfByte1.length)
    {
      if (paramArrayOfByte1[i] != paramArrayOfByte2[i])
      {
        GMTrace.o(56774098944L, 423);
        return false;
      }
      i += 1;
    }
    GMTrace.o(56774098944L, 423);
    return true;
  }
  
  private boolean createChatroom(Context paramContext, Bundle paramBundle)
  {
    GMTrace.i(56103010304L, 418);
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/createChatroom"), null, null, new String[] { this.appId, paramBundle.getString("_wxapi_basereq_transaction", ""), paramBundle.getString("_wxapi_create_chatroom_group_id", ""), paramBundle.getString("_wxapi_create_chatroom_chatroom_name", ""), paramBundle.getString("_wxapi_create_chatroom_chatroom_nickname", ""), paramBundle.getString("_wxapi_create_chatroom_ext_msg", ""), paramBundle.getString("_wxapi_basereq_openid", "") }, null);
    if (paramContext != null) {
      paramContext.close();
    }
    GMTrace.o(56103010304L, 418);
    return true;
  }
  
  private boolean handleWxInternalRespType(String paramString, IWXAPIEventHandler paramIWXAPIEventHandler)
  {
    GMTrace.i(16293226872832L, 121394);
    Log.i("MicroMsg.SDK.WXApiImplV10", "handleWxInternalRespType, extInfo = " + paramString);
    paramString = "http://www.qq.com/s?" + paramString;
    try
    {
      paramString = Uri.parse(paramString);
      Object localObject = paramString.getQueryParameter("wx_internal_resptype");
      Log.i("MicroMsg.SDK.WXApiImplV10", "handleWxInternalRespType, respType = " + (String)localObject);
      if (d.a((String)localObject))
      {
        Log.e("MicroMsg.SDK.WXApiImplV10", "handleWxInternalRespType fail, respType is null");
        GMTrace.o(16293226872832L, 121394);
        return false;
      }
      if (((String)localObject).equals("subscribemessage"))
      {
        localObject = new SubscribeMessage.Resp();
        ((SubscribeMessage.Resp)localObject).openId = paramString.getQueryParameter("openid");
        ((SubscribeMessage.Resp)localObject).templateID = paramString.getQueryParameter("template_id");
        ((SubscribeMessage.Resp)localObject).scene = d.b(paramString.getQueryParameter("scene"));
        ((SubscribeMessage.Resp)localObject).action = paramString.getQueryParameter("action");
        ((SubscribeMessage.Resp)localObject).reserved = paramString.getQueryParameter("reserved");
        paramIWXAPIEventHandler.onResp((BaseResp)localObject);
        GMTrace.o(16293226872832L, 121394);
        return true;
      }
      Log.e("MicroMsg.SDK.WXApiImplV10", "handleWxInternalRespType fail, unknown resptype = " + (String)localObject);
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        Log.e("MicroMsg.SDK.WXApiImplV10", "handleWxInternalRespType fail, ex = " + paramString.getMessage());
      }
    }
    GMTrace.o(16293226872832L, 121394);
    return false;
  }
  
  private boolean joinChatroom(Context paramContext, Bundle paramBundle)
  {
    GMTrace.i(56237228032L, 419);
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/joinChatroom"), null, null, new String[] { this.appId, paramBundle.getString("_wxapi_basereq_transaction", ""), paramBundle.getString("_wxapi_join_chatroom_group_id", ""), paramBundle.getString("_wxapi_join_chatroom_chatroom_nickname", ""), paramBundle.getString("_wxapi_join_chatroom_ext_msg", ""), paramBundle.getString("_wxapi_basereq_openid", "") }, null);
    if (paramContext != null) {
      paramContext.close();
    }
    GMTrace.o(56237228032L, 419);
    return true;
  }
  
  private boolean sendAddCardToWX(Context paramContext, Bundle paramBundle)
  {
    GMTrace.i(55431921664L, 413);
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/addCardToWX"), null, null, new String[] { this.appId, paramBundle.getString("_wxapi_add_card_to_wx_card_list"), paramBundle.getString("_wxapi_basereq_transaction") }, null);
    if (paramContext != null) {
      paramContext.close();
    }
    GMTrace.o(55431921664L, 413);
    return true;
  }
  
  private boolean sendChooseCardFromWX(Context paramContext, Bundle paramBundle)
  {
    GMTrace.i(55566139392L, 414);
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/chooseCardFromWX"), null, null, new String[] { paramBundle.getString("_wxapi_choose_card_from_wx_card_app_id"), paramBundle.getString("_wxapi_choose_card_from_wx_card_location_id"), paramBundle.getString("_wxapi_choose_card_from_wx_card_sign_type"), paramBundle.getString("_wxapi_choose_card_from_wx_card_card_sign"), paramBundle.getString("_wxapi_choose_card_from_wx_card_time_stamp"), paramBundle.getString("_wxapi_choose_card_from_wx_card_nonce_str"), paramBundle.getString("_wxapi_choose_card_from_wx_card_card_id"), paramBundle.getString("_wxapi_choose_card_from_wx_card_card_type"), paramBundle.getString("_wxapi_choose_card_from_wx_card_can_multi_select"), paramBundle.getString("_wxapi_basereq_transaction") }, null);
    if (paramContext != null) {
      paramContext.close();
    }
    GMTrace.o(55566139392L, 414);
    return true;
  }
  
  private boolean sendChooseInvoiceTitle(Context paramContext, BaseReq paramBaseReq)
  {
    GMTrace.i(21035944509440L, 156730);
    paramBaseReq = (ChooseInvoiceTitle.Req)paramBaseReq;
    paramContext = paramContext.getContentResolver();
    Uri localUri = Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview");
    paramBaseReq = URLEncoder.encode(String.format("url=%s", new Object[] { URLEncoder.encode(paramBaseReq.url) }));
    paramContext = paramContext.query(localUri, null, null, new String[] { this.appId, "2", paramBaseReq }, null);
    if (paramContext != null) {
      paramContext.close();
    }
    GMTrace.o(21035944509440L, 156730);
    return true;
  }
  
  private boolean sendHandleScanResult(Context paramContext, Bundle paramBundle)
  {
    GMTrace.i(56371445760L, 420);
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/handleScanResult"), null, null, new String[] { this.appId, paramBundle.getString("_wxapi_scan_qrcode_result") }, null);
    if (paramContext != null) {
      paramContext.close();
    }
    GMTrace.o(56371445760L, 420);
    return true;
  }
  
  private boolean sendJumpToBizProfileReq(Context paramContext, Bundle paramBundle)
  {
    GMTrace.i(55029268480L, 410);
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/jumpToBizProfile"), null, null, new String[] { this.appId, paramBundle.getString("_wxapi_jump_to_biz_profile_req_to_user_name"), paramBundle.getString("_wxapi_jump_to_biz_profile_req_ext_msg"), paramBundle.getInt("_wxapi_jump_to_biz_profile_req_scene"), paramBundle.getInt("_wxapi_jump_to_biz_profile_req_profile_type") }, null);
    if (paramContext != null) {
      paramContext.close();
    }
    GMTrace.o(55029268480L, 410);
    return true;
  }
  
  private boolean sendJumpToBizTempSessionReq(Context paramContext, Bundle paramBundle)
  {
    GMTrace.i(55297703936L, 412);
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/jumpToBizTempSession"), null, null, new String[] { this.appId, paramBundle.getString("_wxapi_jump_to_biz_webview_req_to_user_name"), paramBundle.getString("_wxapi_jump_to_biz_webview_req_session_from"), paramBundle.getInt("_wxapi_jump_to_biz_webview_req_show_type") }, null);
    if (paramContext != null) {
      paramContext.close();
    }
    GMTrace.o(55297703936L, 412);
    return true;
  }
  
  private boolean sendJumpToBizWebviewReq(Context paramContext, Bundle paramBundle)
  {
    GMTrace.i(55163486208L, 411);
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/jumpToBizProfile"), null, null, new String[] { this.appId, paramBundle.getString("_wxapi_jump_to_biz_webview_req_to_user_name"), paramBundle.getString("_wxapi_jump_to_biz_webview_req_ext_msg"), paramBundle.getInt("_wxapi_jump_to_biz_webview_req_scene") }, null);
    if (paramContext != null) {
      paramContext.close();
    }
    GMTrace.o(55163486208L, 411);
    return true;
  }
  
  private boolean sendLaunchWXMiniprogram(Context paramContext, BaseReq paramBaseReq)
  {
    GMTrace.i(21036078727168L, 156731);
    paramBaseReq = (WXLaunchMiniProgram.Req)paramBaseReq;
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/launchWXMiniprogram"), null, null, new String[] { this.appId, paramBaseReq.userName, paramBaseReq.path, paramBaseReq.miniprogramType }, null);
    if (paramContext != null) {
      paramContext.close();
    }
    GMTrace.o(21036078727168L, 156731);
    return true;
  }
  
  private boolean sendOpenBusiLuckyMoney(Context paramContext, Bundle paramBundle)
  {
    GMTrace.i(55968792576L, 417);
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openBusiLuckyMoney"), null, null, new String[] { this.appId, paramBundle.getString("_wxapi_open_busi_lucky_money_timeStamp"), paramBundle.getString("_wxapi_open_busi_lucky_money_nonceStr"), paramBundle.getString("_wxapi_open_busi_lucky_money_signType"), paramBundle.getString("_wxapi_open_busi_lucky_money_signature"), paramBundle.getString("_wxapi_open_busi_lucky_money_package") }, null);
    if (paramContext != null) {
      paramContext.close();
    }
    GMTrace.o(55968792576L, 417);
    return true;
  }
  
  private boolean sendOpenRankListReq(Context paramContext, Bundle paramBundle)
  {
    GMTrace.i(55700357120L, 415);
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openRankList"), null, null, new String[0], null);
    if (paramContext != null) {
      paramContext.close();
    }
    GMTrace.o(55700357120L, 415);
    return true;
  }
  
  private boolean sendOpenWebview(Context paramContext, Bundle paramBundle)
  {
    GMTrace.i(55834574848L, 416);
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openWebview"), null, null, new String[] { this.appId, paramBundle.getString("_wxapi_jump_to_webview_url"), paramBundle.getString("_wxapi_basereq_transaction") }, null);
    if (paramContext != null) {
      paramContext.close();
    }
    GMTrace.o(55834574848L, 416);
    return true;
  }
  
  private boolean sendPayReq(Context paramContext, Bundle paramBundle)
  {
    GMTrace.i(54895050752L, 409);
    if (wxappPayEntryClassname == null)
    {
      wxappPayEntryClassname = new MMSharedPreferences(paramContext).getString("_wxapp_pay_entry_classname_", null);
      Log.d("MicroMsg.SDK.WXApiImplV10", "pay, set wxappPayEntryClassname = " + wxappPayEntryClassname);
      if (wxappPayEntryClassname == null) {}
      try
      {
        wxappPayEntryClassname = paramContext.getPackageManager().getApplicationInfo("com.tencent.mm", 128).metaData.getString("com.tencent.mm.BuildInfo.OPEN_SDK_PAY_ENTRY_CLASSNAME", null);
        if (wxappPayEntryClassname == null)
        {
          Log.e("MicroMsg.SDK.WXApiImplV10", "pay fail, wxappPayEntryClassname is null");
          GMTrace.o(54895050752L, 409);
          return false;
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Log.e("MicroMsg.SDK.WXApiImplV10", "get from metaData failed : " + localException.getMessage());
        }
      }
    }
    MMessageActV2.Args localArgs = new MMessageActV2.Args();
    localArgs.bundle = paramBundle;
    localArgs.targetPkgName = "com.tencent.mm";
    localArgs.targetClassName = wxappPayEntryClassname;
    boolean bool = MMessageActV2.send(paramContext, localArgs);
    GMTrace.o(54895050752L, 409);
    return bool;
  }
  
  private boolean sendSubscribeMessage(Context paramContext, BaseReq paramBaseReq)
  {
    GMTrace.i(16293361090560L, 121395);
    paramBaseReq = (SubscribeMessage.Req)paramBaseReq;
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, new String[] { this.appId, "1", String.valueOf(paramBaseReq.scene), paramBaseReq.templateID, paramBaseReq.reserved }, null);
    if (paramContext != null) {
      paramContext.close();
    }
    GMTrace.o(16293361090560L, 121395);
    return true;
  }
  
  public final void detach()
  {
    GMTrace.i(56639881216L, 422);
    Log.d("MicroMsg.SDK.WXApiImplV10", "detach");
    this.detached = true;
    this.context = null;
    GMTrace.o(56639881216L, 422);
  }
  
  public final int getWXAppSupportAPI()
  {
    GMTrace.i(54492397568L, 406);
    if (this.detached) {
      throw new IllegalStateException("getWXAppSupportAPI fail, WXMsgImpl has been detached");
    }
    if (!isWXAppInstalled())
    {
      Log.e("MicroMsg.SDK.WXApiImplV10", "open wx app failed, not installed or signature check failed");
      GMTrace.o(54492397568L, 406);
      return 0;
    }
    int j = new MMSharedPreferences(this.context).getInt("_build_info_sdk_int_", 0);
    int i = j;
    if (j == 0) {}
    try
    {
      i = this.context.getPackageManager().getApplicationInfo("com.tencent.mm", 128).metaData.getInt("com.tencent.mm.BuildInfo.OPEN_SDK_VERSION", 0);
      GMTrace.o(54492397568L, 406);
      return i;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Log.e("MicroMsg.SDK.WXApiImplV10", "get from metaData failed : " + localException.getMessage());
        i = j;
      }
    }
  }
  
  public final boolean handleIntent(Intent paramIntent, IWXAPIEventHandler paramIWXAPIEventHandler)
  {
    GMTrace.i(54089744384L, 403);
    try
    {
      if (!WXApiImplComm.isIntentFromWx(paramIntent, "com.tencent.mm.openapi.token"))
      {
        Log.i("MicroMsg.SDK.WXApiImplV10", "handleIntent fail, intent not from weixin msg");
        GMTrace.o(54089744384L, 403);
        return false;
      }
      if (!this.detached) {
        break label93;
      }
      throw new IllegalStateException("handleIntent fail, WXMsgImpl has been detached");
    }
    catch (Exception paramIntent)
    {
      Log.e("MicroMsg.SDK.WXApiImplV10", "handleIntent fail, ex = " + paramIntent.getMessage());
    }
    GMTrace.o(54089744384L, 403);
    return false;
    label93:
    String str1 = paramIntent.getStringExtra("_mmessage_content");
    int i = paramIntent.getIntExtra("_mmessage_sdkVersion", 0);
    String str2 = paramIntent.getStringExtra("_mmessage_appPackage");
    if ((str2 == null) || (str2.length() == 0))
    {
      Log.e("MicroMsg.SDK.WXApiImplV10", "invalid argument");
      GMTrace.o(54089744384L, 403);
      return false;
    }
    if (!checkSumConsistent(paramIntent.getByteArrayExtra("_mmessage_checksum"), b.a(str1, i, str2)))
    {
      Log.e("MicroMsg.SDK.WXApiImplV10", "checksum fail");
      GMTrace.o(54089744384L, 403);
      return false;
    }
    i = paramIntent.getIntExtra("_wxapi_command_type", 0);
    Log.i("MicroMsg.SDK.WXApiImplV10", "handleIntent, cmd = " + i);
    switch (i)
    {
    }
    for (;;)
    {
      Log.e("MicroMsg.SDK.WXApiImplV10", "unknown cmd = " + i);
      break;
      paramIWXAPIEventHandler.onResp(new SendAuth.Resp(paramIntent.getExtras()));
      GMTrace.o(54089744384L, 403);
      return true;
      paramIWXAPIEventHandler.onResp(new SendMessageToWX.Resp(paramIntent.getExtras()));
      GMTrace.o(54089744384L, 403);
      return true;
      paramIWXAPIEventHandler.onReq(new GetMessageFromWX.Req(paramIntent.getExtras()));
      GMTrace.o(54089744384L, 403);
      return true;
      paramIntent = new ShowMessageFromWX.Req(paramIntent.getExtras());
      str1 = paramIntent.message.messageExt;
      if ((str1 != null) && (str1.contains("wx_internal_resptype")))
      {
        boolean bool = handleWxInternalRespType(str1, paramIWXAPIEventHandler);
        Log.i("MicroMsg.SDK.WXApiImplV10", "handleIntent, extInfo contains wx_internal_resptype, ret = " + bool);
        GMTrace.o(54089744384L, 403);
        return bool;
      }
      paramIWXAPIEventHandler.onReq(paramIntent);
      GMTrace.o(54089744384L, 403);
      return true;
      paramIWXAPIEventHandler.onResp(new PayResp(paramIntent.getExtras()));
      GMTrace.o(54089744384L, 403);
      return true;
      paramIWXAPIEventHandler.onReq(new LaunchFromWX.Req(paramIntent.getExtras()));
      GMTrace.o(54089744384L, 403);
      return true;
      paramIWXAPIEventHandler.onResp(new AddCardToWXCardPackage.Resp(paramIntent.getExtras()));
      GMTrace.o(54089744384L, 403);
      return true;
      paramIWXAPIEventHandler.onResp(new ChooseCardFromWXCardPackage.Resp(paramIntent.getExtras()));
      GMTrace.o(54089744384L, 403);
      return true;
      paramIWXAPIEventHandler.onResp(new CreateChatroom.Resp(paramIntent.getExtras()));
      GMTrace.o(54089744384L, 403);
      return true;
      paramIWXAPIEventHandler.onResp(new JoinChatroom.Resp(paramIntent.getExtras()));
      GMTrace.o(54089744384L, 403);
      return true;
      paramIWXAPIEventHandler.onResp(new OpenWebview.Resp(paramIntent.getExtras()));
      GMTrace.o(54089744384L, 403);
      return true;
      paramIWXAPIEventHandler.onResp(new HandleScanResult.Resp(paramIntent.getExtras()));
      GMTrace.o(54089744384L, 403);
      return true;
    }
  }
  
  public final boolean isWXAppInstalled()
  {
    GMTrace.i(54223962112L, 404);
    if (this.detached) {
      throw new IllegalStateException("isWXAppInstalled fail, WXMsgImpl has been detached");
    }
    try
    {
      PackageInfo localPackageInfo = this.context.getPackageManager().getPackageInfo("com.tencent.mm", 64);
      if (localPackageInfo == null)
      {
        GMTrace.o(54223962112L, 404);
        return false;
      }
      boolean bool = WXApiImplComm.validateAppSignature(this.context, localPackageInfo.signatures, this.checkSignature);
      GMTrace.o(54223962112L, 404);
      return bool;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      GMTrace.o(54223962112L, 404);
    }
    return false;
  }
  
  public final boolean isWXAppSupportAPI()
  {
    GMTrace.i(54358179840L, 405);
    if (this.detached) {
      throw new IllegalStateException("isWXAppSupportAPI fail, WXMsgImpl has been detached");
    }
    if (getWXAppSupportAPI() >= 620822528)
    {
      GMTrace.o(54358179840L, 405);
      return true;
    }
    GMTrace.o(54358179840L, 405);
    return false;
  }
  
  public final boolean openWXApp()
  {
    GMTrace.i(54626615296L, 407);
    if (this.detached) {
      throw new IllegalStateException("openWXApp fail, WXMsgImpl has been detached");
    }
    if (!isWXAppInstalled())
    {
      Log.e("MicroMsg.SDK.WXApiImplV10", "open wx app failed, not installed or signature check failed");
      GMTrace.o(54626615296L, 407);
      return false;
    }
    try
    {
      this.context.startActivity(this.context.getPackageManager().getLaunchIntentForPackage("com.tencent.mm"));
      GMTrace.o(54626615296L, 407);
      return true;
    }
    catch (Exception localException)
    {
      Log.e("MicroMsg.SDK.WXApiImplV10", "startActivity fail, exception = " + localException.getMessage());
      GMTrace.o(54626615296L, 407);
    }
    return false;
  }
  
  public final boolean registerApp(String paramString)
  {
    GMTrace.i(53687091200L, 400);
    boolean bool = registerApp(paramString, 0L);
    GMTrace.o(53687091200L, 400);
    return bool;
  }
  
  public final boolean registerApp(String paramString, long paramLong)
  {
    GMTrace.i(53821308928L, 401);
    if (this.detached) {
      throw new IllegalStateException("registerApp fail, WXMsgImpl has been detached");
    }
    if (!WXApiImplComm.validateAppSignatureForPackage(this.context, "com.tencent.mm", this.checkSignature))
    {
      Log.e("MicroMsg.SDK.WXApiImplV10", "register app failed for wechat app signature check failed");
      GMTrace.o(53821308928L, 401);
      return false;
    }
    Log.d("MicroMsg.SDK.WXApiImplV10", "registerApp, appId = " + paramString);
    if (paramString != null) {
      this.appId = paramString;
    }
    Log.d("MicroMsg.SDK.WXApiImplV10", "registerApp, appId = " + paramString);
    if (paramString != null) {
      this.appId = paramString;
    }
    Log.d("MicroMsg.SDK.WXApiImplV10", "register app " + this.context.getPackageName());
    paramString = new a.a();
    paramString.a = "com.tencent.mm";
    paramString.action = "com.tencent.mm.plugin.openapi.Intent.ACTION_HANDLE_APP_REGISTER";
    paramString.content = ("weixin://registerapp?appid=" + this.appId);
    paramString.b = paramLong;
    boolean bool = a.a(this.context, paramString);
    GMTrace.o(53821308928L, 401);
    return bool;
  }
  
  public final boolean sendReq(BaseReq paramBaseReq)
  {
    GMTrace.i(54760833024L, 408);
    if (this.detached) {
      throw new IllegalStateException("sendReq fail, WXMsgImpl has been detached");
    }
    if (!WXApiImplComm.validateAppSignatureForPackage(this.context, "com.tencent.mm", this.checkSignature))
    {
      Log.e("MicroMsg.SDK.WXApiImplV10", "sendReq failed for wechat app signature check failed");
      GMTrace.o(54760833024L, 408);
      return false;
    }
    if (!paramBaseReq.checkArgs())
    {
      Log.e("MicroMsg.SDK.WXApiImplV10", "sendReq checkArgs fail");
      GMTrace.o(54760833024L, 408);
      return false;
    }
    Log.i("MicroMsg.SDK.WXApiImplV10", "sendReq, req type = " + paramBaseReq.getType());
    Bundle localBundle = new Bundle();
    paramBaseReq.toBundle(localBundle);
    boolean bool;
    if (paramBaseReq.getType() == 5)
    {
      bool = sendPayReq(this.context, localBundle);
      GMTrace.o(54760833024L, 408);
      return bool;
    }
    if (paramBaseReq.getType() == 7)
    {
      bool = sendJumpToBizProfileReq(this.context, localBundle);
      GMTrace.o(54760833024L, 408);
      return bool;
    }
    if (paramBaseReq.getType() == 8)
    {
      bool = sendJumpToBizWebviewReq(this.context, localBundle);
      GMTrace.o(54760833024L, 408);
      return bool;
    }
    if (paramBaseReq.getType() == 10)
    {
      bool = sendJumpToBizTempSessionReq(this.context, localBundle);
      GMTrace.o(54760833024L, 408);
      return bool;
    }
    if (paramBaseReq.getType() == 9)
    {
      bool = sendAddCardToWX(this.context, localBundle);
      GMTrace.o(54760833024L, 408);
      return bool;
    }
    if (paramBaseReq.getType() == 16)
    {
      bool = sendChooseCardFromWX(this.context, localBundle);
      GMTrace.o(54760833024L, 408);
      return bool;
    }
    if (paramBaseReq.getType() == 11)
    {
      bool = sendOpenRankListReq(this.context, localBundle);
      GMTrace.o(54760833024L, 408);
      return bool;
    }
    if (paramBaseReq.getType() == 12)
    {
      bool = sendOpenWebview(this.context, localBundle);
      GMTrace.o(54760833024L, 408);
      return bool;
    }
    if (paramBaseReq.getType() == 13)
    {
      bool = sendOpenBusiLuckyMoney(this.context, localBundle);
      GMTrace.o(54760833024L, 408);
      return bool;
    }
    if (paramBaseReq.getType() == 14)
    {
      bool = createChatroom(this.context, localBundle);
      GMTrace.o(54760833024L, 408);
      return bool;
    }
    if (paramBaseReq.getType() == 15)
    {
      bool = joinChatroom(this.context, localBundle);
      GMTrace.o(54760833024L, 408);
      return bool;
    }
    if (paramBaseReq.getType() == 17)
    {
      bool = sendHandleScanResult(this.context, localBundle);
      GMTrace.o(54760833024L, 408);
      return bool;
    }
    if (paramBaseReq.getType() == 18)
    {
      bool = sendSubscribeMessage(this.context, paramBaseReq);
      GMTrace.o(54760833024L, 408);
      return bool;
    }
    if (paramBaseReq.getType() == 19)
    {
      bool = sendLaunchWXMiniprogram(this.context, paramBaseReq);
      GMTrace.o(54760833024L, 408);
      return bool;
    }
    if (paramBaseReq.getType() == 20)
    {
      bool = sendChooseInvoiceTitle(this.context, paramBaseReq);
      GMTrace.o(54760833024L, 408);
      return bool;
    }
    SendMessageToWX.Req localReq;
    if ((paramBaseReq.getType() == 2) && (localBundle.getInt("_wxapi_sendmessagetowx_req_media_type") == 36))
    {
      localReq = (SendMessageToWX.Req)paramBaseReq;
      if (getWXAppSupportAPI() >= 620756993) {
        break label740;
      }
      localObject = new WXWebpageObject();
      ((WXWebpageObject)localObject).webpageUrl = localBundle.getString("_wxminiprogram_webpageurl");
      localReq.message.mediaObject = ((WXMediaMessage.IMediaObject)localObject);
    }
    label740:
    WXMiniProgramObject localWXMiniProgramObject;
    do
    {
      localReq.scene = 0;
      paramBaseReq.toBundle(localBundle);
      paramBaseReq = new MMessageActV2.Args();
      paramBaseReq.bundle = localBundle;
      paramBaseReq.content = ("weixin://sendreq?appid=" + this.appId);
      paramBaseReq.targetPkgName = "com.tencent.mm";
      paramBaseReq.targetClassName = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
      bool = MMessageActV2.send(this.context, paramBaseReq);
      GMTrace.o(54760833024L, 408);
      return bool;
      localWXMiniProgramObject = (WXMiniProgramObject)localReq.message.mediaObject;
      localWXMiniProgramObject.userName += "@app";
      localObject = localWXMiniProgramObject.path;
    } while (d.a((String)localObject));
    Object localObject = ((String)localObject).split("\\?");
    if (localObject.length > 1) {}
    for (localObject = localObject[0] + ".html?" + localObject[1];; localObject = localObject[0] + ".html")
    {
      localWXMiniProgramObject.path = ((String)localObject);
      break;
    }
  }
  
  public final boolean sendResp(BaseResp paramBaseResp)
  {
    GMTrace.i(56505663488L, 421);
    if (this.detached) {
      throw new IllegalStateException("sendResp fail, WXMsgImpl has been detached");
    }
    if (!WXApiImplComm.validateAppSignatureForPackage(this.context, "com.tencent.mm", this.checkSignature))
    {
      Log.e("MicroMsg.SDK.WXApiImplV10", "sendResp failed for wechat app signature check failed");
      GMTrace.o(56505663488L, 421);
      return false;
    }
    if (!paramBaseResp.checkArgs())
    {
      Log.e("MicroMsg.SDK.WXApiImplV10", "sendResp checkArgs fail");
      GMTrace.o(56505663488L, 421);
      return false;
    }
    Bundle localBundle = new Bundle();
    paramBaseResp.toBundle(localBundle);
    paramBaseResp = new MMessageActV2.Args();
    paramBaseResp.bundle = localBundle;
    paramBaseResp.content = ("weixin://sendresp?appid=" + this.appId);
    paramBaseResp.targetPkgName = "com.tencent.mm";
    paramBaseResp.targetClassName = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
    boolean bool = MMessageActV2.send(this.context, paramBaseResp);
    GMTrace.o(56505663488L, 421);
    return bool;
  }
  
  public final void setLogImpl(ILog paramILog)
  {
    GMTrace.i(14616713232384L, 108903);
    Log.setLogImpl(paramILog);
    GMTrace.o(14616713232384L, 108903);
  }
  
  public final void unregisterApp()
  {
    GMTrace.i(53955526656L, 402);
    if (this.detached) {
      throw new IllegalStateException("unregisterApp fail, WXMsgImpl has been detached");
    }
    if (!WXApiImplComm.validateAppSignatureForPackage(this.context, "com.tencent.mm", this.checkSignature))
    {
      Log.e("MicroMsg.SDK.WXApiImplV10", "unregister app failed for wechat app signature check failed");
      GMTrace.o(53955526656L, 402);
      return;
    }
    Log.d("MicroMsg.SDK.WXApiImplV10", "unregisterApp, appId = " + this.appId);
    if ((this.appId == null) || (this.appId.length() == 0))
    {
      Log.e("MicroMsg.SDK.WXApiImplV10", "unregisterApp fail, appId is empty");
      GMTrace.o(53955526656L, 402);
      return;
    }
    Log.d("MicroMsg.SDK.WXApiImplV10", "unregister app " + this.context.getPackageName());
    a.a locala = new a.a();
    locala.a = "com.tencent.mm";
    locala.action = "com.tencent.mm.plugin.openapi.Intent.ACTION_HANDLE_APP_UNREGISTER";
    locala.content = ("weixin://unregisterapp?appid=" + this.appId);
    a.a(this.context, locala);
    GMTrace.o(53955526656L, 402);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\opensdk\openapi\WXApiImplV10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */