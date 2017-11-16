package android.support.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

final class b
{
  private static Method mI;
  
  static
  {
    try
    {
      mI = SharedPreferences.Editor.class.getMethod("apply", new Class[0]);
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      mI = null;
    }
  }
  
  private static long a(File paramFile)
  {
    long l2 = paramFile.lastModified();
    long l1 = l2;
    if (l2 == -1L) {
      l1 = l2 - 1L;
    }
    return l1;
  }
  
  static List<File> a(Context paramContext, ApplicationInfo paramApplicationInfo, File paramFile, boolean paramBoolean)
  {
    int i = 0;
    new StringBuilder("MultiDexExtractor.load(").append(paramApplicationInfo.sourceDir).append(", ").append(paramBoolean).append(")");
    File localFile = new File(paramApplicationInfo.sourceDir);
    long l2 = c.c(localFile);
    long l1 = l2;
    if (l2 == -1L) {
      l1 = l2 - 1L;
    }
    if (!paramBoolean)
    {
      paramApplicationInfo = h(paramContext);
      if ((paramApplicationInfo.getLong("timestamp", -1L) != a(localFile)) || (paramApplicationInfo.getLong("crc", -1L) != l1)) {
        i = 1;
      }
      if (i != 0) {}
    }
    for (;;)
    {
      try
      {
        paramApplicationInfo = a(paramContext, localFile, paramFile);
        paramContext = paramApplicationInfo;
        new StringBuilder("load found ").append(paramContext.size()).append(" secondary dex files");
        return paramContext;
      }
      catch (IOException paramApplicationInfo) {}
      paramApplicationInfo = a(localFile, paramFile);
      l2 = a(localFile);
      i = paramApplicationInfo.size();
      paramContext = h(paramContext).edit();
      paramContext.putLong("timestamp", l2);
      paramContext.putLong("crc", l1);
      paramContext.putInt("dex.number", i + 1);
      if (mI != null) {}
      try
      {
        mI.invoke(paramContext, new Object[0]);
        paramContext = paramApplicationInfo;
      }
      catch (InvocationTargetException paramFile)
      {
        paramContext.commit();
        paramContext = paramApplicationInfo;
      }
      catch (IllegalAccessException paramFile)
      {
        for (;;) {}
      }
    }
  }
  
  private static List<File> a(Context paramContext, File paramFile1, File paramFile2)
  {
    paramFile1 = paramFile1.getName() + ".classes";
    int j = h(paramContext).getInt("dex.number", 1);
    paramContext = new ArrayList(j);
    int i = 2;
    while (i <= j)
    {
      File localFile = new File(paramFile2, paramFile1 + i + ".zip");
      if (localFile.isFile())
      {
        paramContext.add(localFile);
        if (!b(localFile))
        {
          new StringBuilder("Invalid zip file: ").append(localFile);
          throw new IOException("Invalid ZIP file.");
        }
      }
      else
      {
        throw new IOException("Missing extracted secondary dex file '" + localFile.getPath() + "'");
      }
      i += 1;
    }
    return paramContext;
  }
  
  private static List<File> a(File paramFile1, File paramFile2)
  {
    String str2 = paramFile1.getName() + ".classes";
    a(paramFile2, str2);
    localArrayList = new ArrayList();
    localZipFile = new ZipFile(paramFile1);
    try
    {
      paramFile1 = localZipFile.getEntry("classes2" + ".dex");
      j = 2;
    }
    finally
    {
      for (;;)
      {
        try
        {
          int j;
          File localFile;
          boolean bool;
          int i;
          localZipFile.close();
          throw paramFile1;
          j += 1;
          paramFile1 = localZipFile.getEntry("classes" + j + ".dex");
          continue;
          try
          {
            localZipFile.close();
            return localArrayList;
          }
          catch (IOException paramFile1)
          {
            return localArrayList;
          }
        }
        catch (IOException paramFile2)
        {
          continue;
        }
        continue;
        String str1 = "failed";
      }
    }
    if (paramFile1 != null)
    {
      localFile = new File(paramFile2, str2 + j + ".zip");
      localArrayList.add(localFile);
      new StringBuilder("Extraction is needed for file ").append(localFile);
      bool = false;
      i = 0;
      while ((i < 3) && (!bool))
      {
        i += 1;
        a(localZipFile, paramFile1, localFile, str2);
        bool = b(localFile);
        StringBuilder localStringBuilder = new StringBuilder("Extraction ");
        if (!bool) {
          break label380;
        }
        str1 = "success";
        localStringBuilder.append(str1).append(" - length ").append(localFile.getAbsolutePath()).append(": ").append(localFile.length());
        if (bool) {
          break label377;
        }
        localFile.delete();
        if (!localFile.exists()) {
          break label377;
        }
        new StringBuilder("Failed to delete corrupted secondary dex '").append(localFile.getPath()).append("'");
      }
      if (!bool) {
        throw new IOException("Could not create zip file " + localFile.getAbsolutePath() + " for secondary dex (" + j + ")");
      }
    }
  }
  
  private static void a(File paramFile, String paramString)
  {
    paramFile.mkdirs();
    if (!paramFile.isDirectory()) {
      throw new IOException("Failed to create dex directory " + paramFile.getPath());
    }
    paramString = paramFile.listFiles(new FileFilter()
    {
      public final boolean accept(File paramAnonymousFile)
      {
        return !paramAnonymousFile.getName().startsWith(this.mJ);
      }
    });
    if (paramString == null)
    {
      new StringBuilder("Failed to list secondary dex dir content (").append(paramFile.getPath()).append(").");
      return;
    }
    int j = paramString.length;
    int i = 0;
    label86:
    if (i < j)
    {
      paramFile = paramString[i];
      new StringBuilder("Trying to delete old file ").append(paramFile.getPath()).append(" of size ").append(paramFile.length());
      if (paramFile.delete()) {
        break label158;
      }
      new StringBuilder("Failed to delete old file ").append(paramFile.getPath());
    }
    for (;;)
    {
      i += 1;
      break label86;
      break;
      label158:
      new StringBuilder("Deleted old file ").append(paramFile.getPath());
    }
  }
  
  private static void a(ZipFile paramZipFile, ZipEntry paramZipEntry, File paramFile, String paramString)
  {
    paramZipFile = paramZipFile.getInputStream(paramZipEntry);
    paramString = File.createTempFile(paramString, ".zip", paramFile.getParentFile());
    new StringBuilder("Extracting ").append(paramString.getPath());
    try
    {
      ZipOutputStream localZipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(paramString)));
      ZipEntry localZipEntry;
      int i;
      b(paramZipFile);
    }
    finally
    {
      try
      {
        localZipEntry = new ZipEntry("classes.dex");
        localZipEntry.setTime(paramZipEntry.getTime());
        localZipOutputStream.putNextEntry(localZipEntry);
        paramZipEntry = new byte['䀀'];
        for (i = paramZipFile.read(paramZipEntry); i != -1; i = paramZipFile.read(paramZipEntry)) {
          localZipOutputStream.write(paramZipEntry, 0, i);
        }
        localZipOutputStream.closeEntry();
        localZipOutputStream.close();
        new StringBuilder("Renaming to ").append(paramFile.getPath());
        if (paramString.renameTo(paramFile)) {
          break label228;
        }
        throw new IOException("Failed to rename \"" + paramString.getAbsolutePath() + "\" to \"" + paramFile.getAbsolutePath() + "\"");
      }
      finally
      {
        localZipOutputStream.close();
      }
      paramZipEntry = finally;
      b(paramZipFile);
      paramString.delete();
    }
    label228:
    paramString.delete();
  }
  
  private static void b(Closeable paramCloseable)
  {
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable) {}
  }
  
  static boolean b(File paramFile)
  {
    try
    {
      ZipFile localZipFile = new ZipFile(paramFile);
      try
      {
        localZipFile.close();
        return true;
      }
      catch (IOException localIOException1)
      {
        new StringBuilder("Failed to close zip file: ").append(paramFile.getAbsolutePath());
      }
    }
    catch (ZipException localZipException)
    {
      for (;;)
      {
        new StringBuilder("File ").append(paramFile.getAbsolutePath()).append(" is not a valid zip file.");
      }
    }
    catch (IOException localIOException2)
    {
      for (;;)
      {
        new StringBuilder("Got an IOException trying to open zip file: ").append(paramFile.getAbsolutePath());
      }
    }
    return false;
  }
  
  private static SharedPreferences h(Context paramContext)
  {
    if (Build.VERSION.SDK_INT < 11) {}
    for (int i = 0;; i = 4) {
      return paramContext.getSharedPreferences("multidex.version", i);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\android\support\multidex\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */