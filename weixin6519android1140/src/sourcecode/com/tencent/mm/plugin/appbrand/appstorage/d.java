package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.loader.stub.b;
import java.io.File;
import java.io.FileFilter;

public final class d
{
  public static final Runnable hJX;
  
  static
  {
    GMTrace.i(10637560250368L, 79256);
    hJX = new Runnable()
    {
      private void p(File paramAnonymousFile)
      {
        GMTrace.i(10632325758976L, 79217);
        if ((!paramAnonymousFile.exists()) || (!paramAnonymousFile.isDirectory()))
        {
          GMTrace.o(10632325758976L, 79217);
          return;
        }
        paramAnonymousFile = paramAnonymousFile.listFiles(new FileFilter()
        {
          public final boolean accept(File paramAnonymous2File)
          {
            GMTrace.i(10631386234880L, 79210);
            if ((!paramAnonymous2File.getName().endsWith(".dat")) && (!paramAnonymous2File.getName().startsWith("store_")) && (!paramAnonymous2File.getName().endsWith(".nomedia")))
            {
              GMTrace.o(10631386234880L, 79210);
              return true;
            }
            GMTrace.o(10631386234880L, 79210);
            return false;
          }
        });
        if ((paramAnonymousFile == null) || (paramAnonymousFile.length <= 0))
        {
          GMTrace.o(10632325758976L, 79217);
          return;
        }
        int j = paramAnonymousFile.length;
        int i = 0;
        while (i < j)
        {
          b.deleteFile(paramAnonymousFile[i].getAbsolutePath());
          i += 1;
        }
        GMTrace.o(10632325758976L, 79217);
      }
      
      public final void run()
      {
        GMTrace.i(10632191541248L, 79216);
        Object localObject = new File(c.hLB);
        if ((!((File)localObject).exists()) || (!((File)localObject).isDirectory()))
        {
          GMTrace.o(10632191541248L, 79216);
          return;
        }
        localObject = ((File)localObject).listFiles();
        if ((localObject == null) || (localObject.length <= 0))
        {
          GMTrace.o(10632191541248L, 79216);
          return;
        }
        int j = localObject.length;
        int i = 0;
        while (i < j)
        {
          p(localObject[i]);
          i += 1;
        }
        GMTrace.o(10632191541248L, 79216);
      }
    };
    GMTrace.o(10637560250368L, 79256);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\appstorage\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */