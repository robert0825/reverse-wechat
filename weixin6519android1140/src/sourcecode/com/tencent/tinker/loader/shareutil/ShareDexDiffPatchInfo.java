package com.tencent.tinker.loader.shareutil;

import com.tencent.tinker.loader.TinkerRuntimeException;
import java.util.ArrayList;

public class ShareDexDiffPatchInfo
{
  public final String fTy;
  public final String path;
  public final String yhD;
  public final String yhE;
  public final String yhF;
  public final String yhG;
  public final String yhH;
  public final String yhI;
  public final String yhJ;
  public final boolean yhK;
  
  public ShareDexDiffPatchInfo(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    this.yhD = paramString1;
    this.path = paramString2;
    this.yhE = paramString3;
    this.yhF = paramString4;
    this.yhI = paramString5;
    this.yhG = paramString6;
    this.yhH = paramString7;
    this.yhJ = paramString8;
    if (paramString8.equals("jar"))
    {
      this.yhK = true;
      if (SharePatchFileUtil.YJ(paramString1))
      {
        this.fTy = (paramString1 + ".jar");
        return;
      }
      this.fTy = paramString1;
      return;
    }
    if (paramString8.equals("raw"))
    {
      this.yhK = false;
      this.fTy = paramString1;
      return;
    }
    throw new TinkerRuntimeException("can't recognize dex mode:" + paramString8);
  }
  
  public static boolean c(ShareDexDiffPatchInfo paramShareDexDiffPatchInfo)
  {
    if (paramShareDexDiffPatchInfo == null) {}
    for (;;)
    {
      return false;
      String str = paramShareDexDiffPatchInfo.yhD;
      if (ShareTinkerInternals.cqM()) {}
      for (paramShareDexDiffPatchInfo = paramShareDexDiffPatchInfo.yhF; (str != null) && (str.length() > 0) && (paramShareDexDiffPatchInfo != null) && (paramShareDexDiffPatchInfo.length() == 32); paramShareDexDiffPatchInfo = paramShareDexDiffPatchInfo.yhE) {
        return true;
      }
    }
  }
  
  public static void l(String paramString, ArrayList<ShareDexDiffPatchInfo> paramArrayList)
  {
    if ((paramString == null) || (paramString.length() == 0)) {}
    for (;;)
    {
      return;
      paramString = paramString.split("\n");
      int j = paramString.length;
      int i = 0;
      while (i < j)
      {
        String[] arrayOfString = paramString[i];
        if ((arrayOfString != null) && (arrayOfString.length() > 0))
        {
          arrayOfString = arrayOfString.split(",", 8);
          if ((arrayOfString != null) && (arrayOfString.length >= 8)) {
            paramArrayList.add(new ShareDexDiffPatchInfo(arrayOfString[0].trim(), arrayOfString[1].trim(), arrayOfString[2].trim(), arrayOfString[3].trim(), arrayOfString[4].trim(), arrayOfString[5].trim(), arrayOfString[6].trim(), arrayOfString[7].trim()));
          }
        }
        i += 1;
      }
    }
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(this.yhD);
    localStringBuffer.append(",");
    localStringBuffer.append(this.path);
    localStringBuffer.append(",");
    localStringBuffer.append(this.yhE);
    localStringBuffer.append(",");
    localStringBuffer.append(this.yhF);
    localStringBuffer.append(",");
    localStringBuffer.append(this.yhG);
    localStringBuffer.append(",");
    localStringBuffer.append(this.yhH);
    localStringBuffer.append(",");
    localStringBuffer.append(this.yhI);
    localStringBuffer.append(",");
    localStringBuffer.append(this.yhJ);
    return localStringBuffer.toString();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\tinker\loader\shareutil\ShareDexDiffPatchInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */