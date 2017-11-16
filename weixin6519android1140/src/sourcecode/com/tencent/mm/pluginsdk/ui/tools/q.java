package com.tencent.mm.pluginsdk.ui.tools;

import com.tencent.gmtrace.GMTrace;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class q
{
  static Pattern tIi;
  String aBm;
  String hYt;
  String tIf;
  String tIg;
  int tIh;
  
  static
  {
    GMTrace.i(1060320051200L, 7900);
    tIi = Pattern.compile("(?:(http|https|file)\\:\\/\\/)?(?:([-A-Za-z0-9$_.+!*'(),;?&=]+(?:\\:[-A-Za-z0-9$_.+!*'(),;?&=]+)?)@)?([a-zA-Z0-9 -퟿豈-﷏ﷰ-￯%_-][a-zA-Z0-9 -퟿豈-﷏ﷰ-￯%_\\.-]*|\\[[0-9a-fA-F:\\.]+\\])?(?:\\:([0-9]*))?(\\/?[^#]*)?.*", 2);
    GMTrace.o(1060320051200L, 7900);
  }
  
  public q(String paramString)
  {
    GMTrace.i(1060051615744L, 7898);
    if (paramString == null) {
      throw new NullPointerException();
    }
    this.tIf = "";
    this.tIg = "";
    this.tIh = -1;
    this.aBm = "/";
    this.hYt = "";
    paramString = tIi.matcher(paramString);
    String str;
    if (paramString.matches())
    {
      str = paramString.group(1);
      if (str != null) {
        this.tIf = str.toLowerCase();
      }
      str = paramString.group(2);
      if (str != null) {
        this.hYt = str;
      }
      str = paramString.group(3);
      if (str != null) {
        this.tIg = str;
      }
      str = paramString.group(4);
      if ((str == null) || (str.length() <= 0)) {}
    }
    for (;;)
    {
      try
      {
        this.tIh = Integer.parseInt(str);
        paramString = paramString.group(5);
        if ((paramString != null) && (paramString.length() > 0))
        {
          if (paramString.charAt(0) == '/') {
            this.aBm = paramString;
          }
        }
        else
        {
          if ((this.tIh != 443) || (!this.tIf.equals(""))) {
            break label274;
          }
          this.tIf = "https";
          if (this.tIf.equals("")) {
            this.tIf = "http";
          }
          GMTrace.o(1060051615744L, 7898);
          return;
        }
      }
      catch (NumberFormatException paramString)
      {
        throw new Exception("Bad port");
      }
      this.aBm = ("/" + paramString);
      continue;
      throw new Exception("Bad address");
      label274:
      if (this.tIh == -1) {
        if (this.tIf.equals("https")) {
          this.tIh = 443;
        } else {
          this.tIh = 80;
        }
      }
    }
  }
  
  public final String toString()
  {
    GMTrace.i(1060185833472L, 7899);
    String str2 = "";
    if ((this.tIh == 443) || (!this.tIf.equals("https")))
    {
      str1 = str2;
      if (this.tIh != 80)
      {
        str1 = str2;
        if (!this.tIf.equals("http")) {}
      }
    }
    else
    {
      str1 = ":" + Integer.toString(this.tIh);
    }
    str2 = "";
    if (this.hYt.length() > 0) {
      str2 = this.hYt + "@";
    }
    String str1 = this.tIf + "://" + str2 + this.tIg + str1 + this.aBm;
    GMTrace.o(1060185833472L, 7899);
    return str1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\tools\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */