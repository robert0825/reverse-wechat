package com.tencent.mm.plugin.webview.wepkg.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.k;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

public final class f
{
  private String charset;
  public WepkgVersion rYm;
  private e rYw;
  public Map<String, WepkgPreloadFile> rYx;
  
  public f(WepkgVersion paramWepkgVersion, e parame, Map<String, WepkgPreloadFile> paramMap)
  {
    GMTrace.i(15192238850048L, 113191);
    this.charset = "UTF-8";
    this.rYm = paramWepkgVersion;
    this.rYw = parame;
    this.rYx = paramMap;
    if ((paramWepkgVersion != null) && (!bg.nm(paramWepkgVersion.charset))) {
      this.charset = paramWepkgVersion.charset;
    }
    GMTrace.o(15192238850048L, 113191);
  }
  
  public final k MS(String paramString)
  {
    GMTrace.i(19383590060032L, 144419);
    if (bg.nm(paramString))
    {
      GMTrace.o(19383590060032L, 144419);
      return null;
    }
    if ((this.rYx != null) && (this.rYx.get(paramString) != null))
    {
      Object localObject1 = (WepkgPreloadFile)this.rYx.get(paramString);
      if (!bg.nm(((WepkgPreloadFile)localObject1).filePath))
      {
        Object localObject2 = new File(((WepkgPreloadFile)localObject1).filePath);
        if ((((File)localObject2).exists()) && (((File)localObject2).isFile()) && (((File)localObject2).length() == ((WepkgPreloadFile)localObject1).size)) {
          try
          {
            w.i("MicroMsg.Wepkg.WepkgInterceptor", "rid hit preload file. rid:%s", new Object[] { paramString });
            localObject2 = new FileInputStream((File)localObject2);
            localObject1 = new k(((WepkgPreloadFile)localObject1).mimeType, this.charset, (InputStream)localObject2);
            GMTrace.o(19383590060032L, 144419);
            return (k)localObject1;
          }
          catch (FileNotFoundException localFileNotFoundException) {}
        }
      }
    }
    if (this.rYw != null)
    {
      paramString = this.rYw.eu(paramString, this.charset);
      GMTrace.o(19383590060032L, 144419);
      return paramString;
    }
    GMTrace.o(19383590060032L, 144419);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\model\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */