package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;

public final class WXAppLaunchData
{
  public static final String ACTION_HANDLE_WXAPPLAUNCH = ".ACTION_HANDLE_WXAPPLAUNCH";
  public static final String ACTION_HANDLE_WXAPP_RESULT = ".ACTION_HANDLE_WXAPP_RESULT";
  public static final String ACTION_HANDLE_WXAPP_SHOW = ".ACTION_HANDLE_WXAPP_SHOW";
  public int launchType;
  public String message;
  
  public WXAppLaunchData()
  {
    GMTrace.i(32883343360L, 245);
    GMTrace.o(32883343360L, 245);
  }
  
  public static class Builder
  {
    public Builder()
    {
      GMTrace.i(32480690176L, 242);
      GMTrace.o(32480690176L, 242);
    }
    
    public static WXAppLaunchData fromBundle(Bundle paramBundle)
    {
      GMTrace.i(32614907904L, 243);
      WXAppLaunchData localWXAppLaunchData = new WXAppLaunchData();
      localWXAppLaunchData.launchType = paramBundle.getInt("_wxapplaunchdata_launchType");
      localWXAppLaunchData.message = paramBundle.getString("_wxapplaunchdata_message");
      GMTrace.o(32614907904L, 243);
      return localWXAppLaunchData;
    }
    
    public static Bundle toBundle(WXAppLaunchData paramWXAppLaunchData)
    {
      GMTrace.i(32749125632L, 244);
      Bundle localBundle = new Bundle();
      localBundle.putInt("_wxapplaunchdata_launchType", paramWXAppLaunchData.launchType);
      localBundle.putString("_wxapplaunchdata_message", paramWXAppLaunchData.message);
      GMTrace.o(32749125632L, 244);
      return localBundle;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\opensdk\modelmsg\WXAppLaunchData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */