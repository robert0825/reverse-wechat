package com.tencent.liteav;

import android.content.Context;

public abstract class TXPlayerFactory
{
  public static final int PLAY_TYPE_LIVE_FLV = 1;
  public static final int PLAY_TYPE_LIVE_RTMP = 0;
  public static final int PLAY_TYPE_LIVE_RTMP_ACC = 5;
  public static final int PLAY_TYPE_LOCAL_VIDEO = 6;
  public static final int PLAY_TYPE_VOD_FLV = 2;
  public static final int PLAY_TYPE_VOD_HLS = 3;
  public static final int PLAY_TYPE_VOD_MP4 = 4;
  
  public static TXIPlayer createPlayer(Context paramContext, int paramInt)
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (paramInt != 2)
    {
      localObject1 = localObject2;
      if (paramInt != 4)
      {
        localObject1 = localObject2;
        if (paramInt != 4)
        {
          localObject1 = localObject2;
          if (paramInt != 6)
          {
            localObject1 = localObject2;
            if (paramInt != 3) {
              localObject1 = new TXCLivePlayer(paramContext);
            }
          }
        }
      }
    }
    return (TXIPlayer)localObject1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\TXPlayerFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */