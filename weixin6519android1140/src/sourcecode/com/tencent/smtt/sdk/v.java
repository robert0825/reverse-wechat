package com.tencent.smtt.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import android.net.Uri;
import android.widget.FrameLayout;
import android.widget.Toast;
import android.widget.VideoView;

final class v
  extends FrameLayout
  implements MediaPlayer.OnErrorListener
{
  Context mContext = null;
  String mUrl;
  Object xWO;
  y xWP;
  VideoView xWQ;
  
  public v(Context paramContext)
  {
    super(paramContext.getApplicationContext());
    this.mContext = paramContext;
  }
  
  public final boolean coP()
  {
    return (this.xWP != null) && (this.xWO != null);
  }
  
  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    try
    {
      if ((this.mContext instanceof Activity))
      {
        paramMediaPlayer = (Activity)this.mContext;
        if (!paramMediaPlayer.isFinishing()) {
          paramMediaPlayer.finish();
        }
      }
      paramMediaPlayer = getContext();
      if (paramMediaPlayer != null)
      {
        Toast.makeText(paramMediaPlayer, "播放失败，请选择其它播放器播放", 1).show();
        paramMediaPlayer = paramMediaPlayer.getApplicationContext();
        Intent localIntent = new Intent("android.intent.action.VIEW");
        localIntent.addFlags(268435456);
        localIntent.setDataAndType(Uri.parse(this.mUrl), "video/*");
        paramMediaPlayer.startActivity(localIntent);
      }
      return true;
    }
    catch (Throwable paramMediaPlayer) {}
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\sdk\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */