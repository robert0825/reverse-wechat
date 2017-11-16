package com.tencent.tinker.loader.shareutil;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class ShareFileLockHelper
  implements Closeable
{
  private final FileOutputStream yiw;
  private final FileLock yix;
  
  private ShareFileLockHelper(File paramFile)
  {
    this.yiw = new FileOutputStream(paramFile);
    Throwable localThrowable = null;
    Object localObject1 = null;
    int i = 0;
    Object localObject2;
    for (;;)
    {
      localObject2 = localObject1;
      if (i < 3)
      {
        i += 1;
        localObject2 = localObject1;
      }
      try
      {
        localObject1 = this.yiw.getChannel().lock();
        if (localObject1 != null) {}
        for (int j = 1; j != 0; j = 0)
        {
          localObject2 = localObject1;
          if (localObject2 != null) {
            break label129;
          }
          throw new IOException("Tinker Exception:FileLockHelper lock file failed: " + paramFile.getAbsolutePath(), localThrowable);
        }
        localObject2 = localObject1;
        Thread.sleep(10L);
      }
      catch (Exception localException)
      {
        localObject1 = localObject2;
      }
    }
    label129:
    this.yix = ((FileLock)localObject2);
  }
  
  public static ShareFileLockHelper Y(File paramFile)
  {
    return new ShareFileLockHelper(paramFile);
  }
  
  public void close()
  {
    try
    {
      if (this.yix != null) {
        this.yix.release();
      }
      return;
    }
    finally
    {
      if (this.yiw != null) {
        this.yiw.close();
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\tinker\loader\shareutil\ShareFileLockHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */