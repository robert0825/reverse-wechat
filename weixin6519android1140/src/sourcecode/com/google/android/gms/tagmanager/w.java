package com.google.android.gms.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

class w
{
  private static w ayL;
  volatile int ayM = a.ayP;
  volatile String ayN = null;
  private volatile String ayO = null;
  volatile String ayi = null;
  
  private static String ay(String paramString)
  {
    return paramString.split("&")[0].split("=")[1];
  }
  
  static w mJ()
  {
    try
    {
      if (ayL == null) {
        ayL = new w();
      }
      w localw = ayL;
      return localw;
    }
    finally {}
  }
  
  final boolean d(Uri paramUri)
  {
    boolean bool = true;
    String str;
    try
    {
      str = URLDecoder.decode(paramUri.toString(), "UTF-8");
      if (!str.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) {
        break label150;
      }
      new StringBuilder("Container preview url: ").append(str);
      m.ms();
      if (!str.matches(".*?&gtm_debug=x$")) {
        break label135;
      }
      this.ayM = a.ayR;
    }
    catch (UnsupportedEncodingException paramUri)
    {
      for (;;)
      {
        bool = false;
        continue;
        this.ayM = a.ayQ;
      }
    }
    finally {}
    this.ayO = paramUri.getQuery().replace("&gtm_debug=x", "");
    if ((this.ayM == a.ayQ) || (this.ayM == a.ayR)) {
      this.ayN = ("/r?" + this.ayO);
    }
    this.ayi = ay(this.ayO);
    for (;;)
    {
      return bool;
      label135:
      label150:
      if (str.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$"))
      {
        if (ay(paramUri.getQuery()).equals(this.ayi))
        {
          new StringBuilder("Exit preview mode for container: ").append(this.ayi);
          m.ms();
          this.ayM = a.ayP;
          this.ayN = null;
        }
      }
      else
      {
        new StringBuilder("Invalid preview uri: ").append(str);
        m.mq();
        bool = false;
        continue;
      }
      bool = false;
    }
  }
  
  static enum a
  {
    public static int[] mK()
    {
      return (int[])ayS.clone();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\tagmanager\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */