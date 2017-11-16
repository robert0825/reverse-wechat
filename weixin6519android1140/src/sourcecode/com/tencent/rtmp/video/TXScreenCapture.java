package com.tencent.rtmp.video;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class TXScreenCapture
{
  public static class TXScreenCaptureAssistantActivity
    extends Activity
  {
    @TargetApi(21)
    public void Start()
    {
      Intent localIntent1 = (Intent)getIntent().getParcelableExtra("TXScreenCapture.ScreenCaptureIntent");
      try
      {
        startActivityForResult(localIntent1, 1001);
        return;
      }
      catch (Exception localException)
      {
        Intent localIntent2 = new Intent("TXScreenCapture.OnAssistantActivityResult");
        localIntent2.putExtra("TXScreenCapture.RequestCode", 1001);
        localIntent2.putExtra("TXScreenCapture.ResultCode", 20000002);
        sendBroadcast(localIntent2);
        finish();
      }
    }
    
    public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
    {
      Intent localIntent = new Intent("TXScreenCapture.OnAssistantActivityResult");
      localIntent.putExtra("TXScreenCapture.RequestCode", paramInt1);
      localIntent.putExtra("TXScreenCapture.ResultCode", paramInt2);
      localIntent.putExtra("TXScreenCapture.ResultData", paramIntent);
      sendBroadcast(localIntent);
      finish();
    }
    
    public void onCreate(Bundle paramBundle)
    {
      super.onCreate(paramBundle);
      requestWindowFeature(1);
      Start();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\rtmp\video\TXScreenCapture.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */