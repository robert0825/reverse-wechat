package com.tencent.qqmusic.mediaplayer;

import com.tencent.qqmusic.mediaplayer.util.Logger;

public class CacheBytesManager
{
  private static byte[] mCache1024 = null;
  private static byte[] mCache4096 = null;
  private static byte[] mCache8192 = null;
  
  public CacheBytesManager(int paramInt) {}
  
  public static CacheBytesManager getInstance()
  {
    return SingletonHolder.INSTANCE;
  }
  
  public static byte[] getStatic(int paramInt)
  {
    for (;;)
    {
      try
      {
        Logger.d("CBM", "cache get:" + paramInt);
        byte[] arrayOfByte1;
        if ((paramInt == 1024) && (mCache1024 != null))
        {
          arrayOfByte1 = mCache1024;
          mCache1024 = null;
          return arrayOfByte1;
        }
        if ((paramInt == 4096) && (mCache4096 != null))
        {
          arrayOfByte1 = mCache4096;
          mCache4096 = null;
          continue;
        }
        if (paramInt != 8192) {
          break label104;
        }
      }
      finally {}
      byte[] arrayOfByte2;
      if (mCache8192 != null)
      {
        arrayOfByte2 = mCache8192;
        mCache8192 = null;
      }
      else
      {
        label104:
        arrayOfByte2 = new byte[paramInt];
      }
    }
  }
  
  public static byte[] recycle(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {}
    for (;;)
    {
      return null;
      try
      {
        if ((paramArrayOfByte.length == 1024) && (mCache1024 == null))
        {
          mCache1024 = paramArrayOfByte;
          continue;
        }
      }
      finally {}
      if ((paramArrayOfByte.length == 4096) && (mCache4096 == null)) {
        mCache4096 = paramArrayOfByte;
      } else if ((paramArrayOfByte.length == 8192) && (mCache8192 == null)) {
        mCache8192 = paramArrayOfByte;
      }
    }
  }
  
  private static class SingletonHolder
  {
    public static final CacheBytesManager INSTANCE = new CacheBytesManager(262144);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\CacheBytesManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */