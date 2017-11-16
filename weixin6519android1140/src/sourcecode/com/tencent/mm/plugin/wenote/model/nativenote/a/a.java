package com.tencent.mm.plugin.wenote.model.nativenote.a;

import android.text.Html;
import android.text.Spanned;
import android.text.style.ParagraphStyle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.f;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
{
  private static String TAG;
  public static Spanned sdA;
  private static f<String, Spanned> sdz;
  
  static
  {
    GMTrace.i(17217047494656L, 128277);
    TAG = "MicroMsg.ConvertHtmlToSpanned";
    sdz = new f(30);
    sdA = null;
    GMTrace.o(17217047494656L, 128277);
  }
  
  public static Spanned NF(String paramString)
  {
    GMTrace.i(17216913276928L, 128276);
    Object localObject = paramString;
    if (paramString == null) {
      localObject = "";
    }
    paramString = Pattern.compile("\n", 2).matcher((CharSequence)localObject).replaceAll("<br/>");
    localObject = fromHtml(paramString);
    sdz.put(paramString, localObject);
    GMTrace.o(17216913276928L, 128276);
    return (Spanned)localObject;
  }
  
  private static Spanned fromHtml(String paramString)
  {
    GMTrace.i(20621614383104L, 153643);
    String str = paramString;
    if (!paramString.startsWith("<html>")) {
      str = "<html>" + paramString;
    }
    paramString = str;
    if (!str.endsWith("</html>")) {
      paramString = str + "</html>";
    }
    try
    {
      sdA = null;
      paramString = Html.fromHtml(paramString, null, new c());
      if (paramString == null)
      {
        GMTrace.o(20621614383104L, 153643);
        return null;
      }
    }
    catch (Throwable paramString)
    {
      for (;;)
      {
        if (sdA != null)
        {
          paramString = sdA;
          continue;
          int i = paramString.toString().length();
          if ((i > 1) && (paramString.toString().endsWith("\n")))
          {
            if (paramString.getSpans(i, i, ParagraphStyle.class).length > 0)
            {
              paramString = (Spanned)paramString.subSequence(0, i - 1);
              GMTrace.o(20621614383104L, 153643);
              return paramString;
            }
            GMTrace.o(20621614383104L, 153643);
            return paramString;
          }
          GMTrace.o(20621614383104L, 153643);
          return paramString;
        }
        else
        {
          paramString = null;
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */