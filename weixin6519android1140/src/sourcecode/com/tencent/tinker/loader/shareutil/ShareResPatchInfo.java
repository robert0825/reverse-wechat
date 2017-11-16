package com.tencent.tinker.loader.shareutil;

import com.tencent.tinker.loader.TinkerRuntimeException;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShareResPatchInfo
{
  public String yiL = null;
  public String yiM = null;
  public ArrayList<String> yiN = new ArrayList();
  public ArrayList<String> yiO = new ArrayList();
  public ArrayList<String> yiP = new ArrayList();
  public ArrayList<String> yiQ = new ArrayList();
  public HashMap<String, LargeModeInfo> yiR = new HashMap();
  public HashSet<Pattern> yiS = new HashSet();
  
  public static void a(String paramString, ShareResPatchInfo paramShareResPatchInfo)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return;
    }
    String[] arrayOfString = paramString.split("\n");
    int i = 0;
    label22:
    int j;
    if (i < arrayOfString.length)
    {
      paramString = arrayOfString[i];
      j = i;
      if (paramString != null)
      {
        j = i;
        if (paramString.length() > 0)
        {
          if (!paramString.startsWith("resources_out.zip")) {
            break label89;
          }
          paramString = paramString.split(",", 3);
          paramShareResPatchInfo.yiL = paramString[1];
          paramShareResPatchInfo.yiM = paramString[2];
          j = i;
        }
      }
    }
    label89:
    label223:
    do
    {
      Object localObject;
      String str;
      for (;;)
      {
        i = j + 1;
        break label22;
        break;
        if (!paramString.startsWith("pattern:")) {
          break label223;
        }
        j = Integer.parseInt(paramString.split(":", 2)[1]);
        while (j > 0)
        {
          localObject = paramShareResPatchInfo.yiS;
          str = arrayOfString[(i + 1)];
          paramString = str;
          if (str.contains(".")) {
            paramString = str.replaceAll("\\.", "\\\\.");
          }
          str = paramString;
          if (paramString.contains("?")) {
            str = paramString.replaceAll("\\?", "\\.");
          }
          paramString = str;
          if (str.contains("*")) {
            paramString = str.replace("*", ".*");
          }
          ((HashSet)localObject).add(Pattern.compile(paramString));
          i += 1;
          j -= 1;
        }
        j = i;
      }
      if (paramString.startsWith("add:"))
      {
        k = Integer.parseInt(paramString.split(":", 2)[1]);
        for (;;)
        {
          j = i;
          if (k <= 0) {
            break;
          }
          paramShareResPatchInfo.yiN.add(arrayOfString[(i + 1)]);
          k -= 1;
          i += 1;
        }
      }
      if (paramString.startsWith("modify:"))
      {
        k = Integer.parseInt(paramString.split(":", 2)[1]);
        for (;;)
        {
          j = i;
          if (k <= 0) {
            break;
          }
          paramShareResPatchInfo.yiP.add(arrayOfString[(i + 1)]);
          k -= 1;
          i += 1;
        }
      }
      if (paramString.startsWith("large modify:"))
      {
        k = Integer.parseInt(paramString.split(":", 2)[1]);
        for (;;)
        {
          j = i;
          if (k <= 0) {
            break;
          }
          paramString = arrayOfString[(i + 1)].split(",", 3);
          str = paramString[0];
          localObject = new LargeModeInfo();
          ((LargeModeInfo)localObject).eDW = paramString[1];
          ((LargeModeInfo)localObject).yiT = Long.parseLong(paramString[2]);
          paramShareResPatchInfo.yiQ.add(str);
          paramShareResPatchInfo.yiR.put(str, localObject);
          k -= 1;
          i += 1;
        }
      }
      j = i;
    } while (!paramString.startsWith("delete:"));
    int k = Integer.parseInt(paramString.split(":", 2)[1]);
    for (;;)
    {
      j = i;
      if (k <= 0) {
        break;
      }
      paramShareResPatchInfo.yiO.add(arrayOfString[(i + 1)]);
      k -= 1;
      i += 1;
    }
  }
  
  public static boolean a(ShareResPatchInfo paramShareResPatchInfo)
  {
    if (paramShareResPatchInfo == null) {}
    do
    {
      return false;
      paramShareResPatchInfo = paramShareResPatchInfo.yiM;
    } while ((paramShareResPatchInfo == null) || (paramShareResPatchInfo.length() != 32));
    return true;
  }
  
  public static boolean a(HashSet<Pattern> paramHashSet, String paramString)
  {
    if (!paramHashSet.isEmpty())
    {
      paramHashSet = paramHashSet.iterator();
      while (paramHashSet.hasNext()) {
        if (((Pattern)paramHashSet.next()).matcher(paramString).matches()) {
          return true;
        }
      }
    }
    return false;
  }
  
  public static void b(String paramString, ShareResPatchInfo paramShareResPatchInfo)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return;
    }
    String str = paramString.split("\n")[0];
    if ((str == null) || (str.length() <= 0)) {
      throw new TinkerRuntimeException("res meta Corrupted:" + paramString);
    }
    paramString = str.split(",", 3);
    paramShareResPatchInfo.yiL = paramString[1];
    paramShareResPatchInfo.yiM = paramString[2];
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("resArscMd5:" + this.yiM + "\n");
    localStringBuffer.append("arscBaseCrc:" + this.yiL + "\n");
    Iterator localIterator = this.yiS.iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (Pattern)localIterator.next();
      localStringBuffer.append("pattern:" + localObject + "\n");
    }
    localIterator = this.yiN.iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      localStringBuffer.append("addedSet:" + (String)localObject + "\n");
    }
    localIterator = this.yiP.iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      localStringBuffer.append("modifiedSet:" + (String)localObject + "\n");
    }
    localIterator = this.yiQ.iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      localStringBuffer.append("largeModifiedSet:" + (String)localObject + "\n");
    }
    localIterator = this.yiO.iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      localStringBuffer.append("deletedSet:" + (String)localObject + "\n");
    }
    return localStringBuffer.toString();
  }
  
  public static class LargeModeInfo
  {
    public String eDW = null;
    public File file = null;
    public long yiT;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\tinker\loader\shareutil\ShareResPatchInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */