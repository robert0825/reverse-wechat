package com.tencent.tinker.lib.b;

import com.tencent.tinker.lib.e.a;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class b
{
  public static int Gc(int paramInt)
  {
    if (paramInt == 3) {
      return -3;
    }
    if (paramInt == 5) {
      return -4;
    }
    if (paramInt == 6) {
      return -8;
    }
    return 0;
  }
  
  public static boolean a(ZipFile paramZipFile, ZipEntry paramZipEntry, File paramFile, String paramString, boolean paramBoolean)
  {
    boolean bool2 = false;
    int i = 0;
    if ((i < 2) && (!bool2))
    {
      int j = i + 1;
      BufferedInputStream localBufferedInputStream = new BufferedInputStream(paramZipFile.getInputStream(paramZipEntry));
      BufferedOutputStream localBufferedOutputStream = new BufferedOutputStream(new FileOutputStream(paramFile));
      a.i("Tinker.BasePatchInternal", "try Extracting " + paramFile.getPath(), new Object[0]);
      for (;;)
      {
        try
        {
          byte[] arrayOfByte = new byte['䀀'];
          i = localBufferedInputStream.read(arrayOfByte);
          if (i != -1)
          {
            localBufferedOutputStream.write(arrayOfByte, 0, i);
            i = localBufferedInputStream.read(arrayOfByte);
            continue;
          }
          SharePatchFileUtil.b(localBufferedOutputStream);
          SharePatchFileUtil.b(localBufferedInputStream);
          if (paramBoolean)
          {
            bool1 = SharePatchFileUtil.g(paramFile, paramString);
            a.i("Tinker.BasePatchInternal", "isExtractionSuccessful: %b", new Object[] { Boolean.valueOf(bool1) });
            bool2 = bool1;
            i = j;
            if (bool1) {
              break;
            }
            paramFile.delete();
            bool2 = bool1;
            i = j;
            if (!paramFile.exists()) {
              break;
            }
            a.e("Tinker.BasePatchInternal", "Failed to delete corrupted dex " + paramFile.getPath(), new Object[0]);
            bool2 = bool1;
            i = j;
            break;
          }
        }
        finally
        {
          SharePatchFileUtil.b(localBufferedOutputStream);
          SharePatchFileUtil.b(localBufferedInputStream);
        }
        boolean bool1 = SharePatchFileUtil.f(paramFile, paramString);
      }
    }
    return bool2;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tinker\lib\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */