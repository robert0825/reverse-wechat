package com.tencent.smtt.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer.OnErrorListener;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.VideoView;

public class VideoActivity
  extends Activity
{
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    u.gZ(this);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    super.requestWindowFeature(1);
    super.getWindow().setFormat(-3);
    paramBundle = super.getIntent();
    Object localObject2;
    Object localObject1;
    if (paramBundle != null)
    {
      paramBundle = paramBundle.getBundleExtra("extraData");
      if (paramBundle != null)
      {
        paramBundle.putInt("callMode", 1);
        localObject2 = u.gZ(super.getApplicationContext());
        localObject1 = paramBundle;
        if (paramBundle == null) {
          localObject1 = new Bundle();
        }
        if (!TextUtils.isEmpty(null)) {
          ((Bundle)localObject1).putString("videoUrl", null);
        }
        ((Bundle)localObject1).putInt("callMode", 1);
        localObject2 = ((u)localObject2).xWN;
        ((v)localObject2).setBackgroundColor(-16777216);
        if (((v)localObject2).xWP == null)
        {
          d.mW(true).a(((v)localObject2).getContext().getApplicationContext(), null);
          paramBundle = d.mW(true).cnP();
          if (paramBundle == null) {
            break label379;
          }
        }
      }
    }
    label379:
    for (paramBundle = paramBundle.xWV;; paramBundle = null)
    {
      if ((paramBundle != null) && (QbSdk.canLoadVideo(((v)localObject2).getContext()))) {
        ((v)localObject2).xWP = new y(paramBundle);
      }
      if ((((v)localObject2).xWP != null) && (((v)localObject2).xWO == null)) {
        ((v)localObject2).xWO = ((v)localObject2).xWP.ha(((v)localObject2).getContext().getApplicationContext());
      }
      boolean bool = false;
      if (((v)localObject2).coP())
      {
        ((Bundle)localObject1).putInt("callMode", ((Bundle)localObject1).getInt("callMode"));
        bool = ((v)localObject2).xWP.a(((v)localObject2).xWO, (Bundle)localObject1, (FrameLayout)localObject2, null);
      }
      if (!bool)
      {
        if (((v)localObject2).xWQ != null) {
          ((v)localObject2).xWQ.stopPlayback();
        }
        if (((v)localObject2).xWQ == null) {
          ((v)localObject2).xWQ = new VideoView(((v)localObject2).getContext());
        }
        ((v)localObject2).mUrl = ((Bundle)localObject1).getString("videoUrl");
        ((v)localObject2).xWQ.setVideoURI(Uri.parse(((v)localObject2).mUrl));
        ((v)localObject2).xWQ.setOnErrorListener((MediaPlayer.OnErrorListener)localObject2);
        paramBundle = new Intent("com.tencent.smtt.tbs.video.PLAY");
        paramBundle.addFlags(268435456);
        localObject1 = ((v)localObject2).getContext().getApplicationContext();
        paramBundle.setPackage(((Context)localObject1).getPackageName());
        ((Context)localObject1).startActivity(paramBundle);
      }
      return;
      paramBundle = null;
      break;
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    u.gZ(this).l(this, 4);
  }
  
  protected void onPause()
  {
    super.onPause();
    u.gZ(this).l(this, 3);
  }
  
  protected void onResume()
  {
    super.onResume();
    u.gZ(this).l(this, 2);
  }
  
  protected void onStop()
  {
    super.onStop();
    u.gZ(this).l(this, 1);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\sdk\VideoActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */