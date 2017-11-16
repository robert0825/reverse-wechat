package com.tencent.smtt.sdk;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.MediaController;
import android.widget.VideoView;

final class u
{
  private static u xWM = null;
  Context sN;
  v xWN = null;
  
  private u(Context paramContext)
  {
    this.sN = paramContext.getApplicationContext();
    this.xWN = new v(this.sN);
  }
  
  public static u gZ(Context paramContext)
  {
    try
    {
      if (xWM == null) {
        xWM = new u(paramContext);
      }
      paramContext = xWM;
      return paramContext;
    }
    finally {}
  }
  
  final void l(Activity paramActivity, int paramInt)
  {
    v localv = this.xWN;
    if ((paramInt == 3) && (!localv.coP()) && (localv.xWQ != null)) {
      localv.xWQ.pause();
    }
    if (paramInt == 4)
    {
      localv.mContext = null;
      if ((!localv.coP()) && (localv.xWQ != null))
      {
        localv.xWQ.stopPlayback();
        localv.xWQ = null;
      }
    }
    if ((paramInt == 2) && (!localv.coP()))
    {
      localv.mContext = paramActivity;
      if ((!localv.coP()) && (localv.xWQ != null))
      {
        if (localv.xWQ.getParent() == null)
        {
          Object localObject = paramActivity.getWindow();
          FrameLayout localFrameLayout = (FrameLayout)((Window)localObject).getDecorView();
          ((Window)localObject).addFlags(1024);
          ((Window)localObject).addFlags(128);
          localFrameLayout.setBackgroundColor(-16777216);
          localObject = new MediaController(paramActivity);
          ((MediaController)localObject).setMediaPlayer(localv.xWQ);
          localv.xWQ.setMediaController((MediaController)localObject);
          localObject = new FrameLayout.LayoutParams(-1, -1);
          ((FrameLayout.LayoutParams)localObject).gravity = 17;
          localFrameLayout.addView(localv.xWQ, (ViewGroup.LayoutParams)localObject);
        }
        if (Build.VERSION.SDK_INT >= 8) {
          localv.xWQ.start();
        }
      }
    }
    if (localv.coP()) {
      localv.xWP.a(localv.xWO, paramActivity, paramInt);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\sdk\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */