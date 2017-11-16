package org.a.c;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.a.b.b;
import org.a.d.i;
import org.a.g.c;
import org.a.g.d;

public final class g
  implements a, f
{
  private static final Pattern ytH = Pattern.compile("oauth_token=([^&]+)");
  private static final Pattern ytI = Pattern.compile("oauth_token_secret=([^&]*)");
  
  private static String b(String paramString, Pattern paramPattern)
  {
    paramPattern = paramPattern.matcher(paramString);
    if ((paramPattern.find()) && (paramPattern.groupCount() > 0)) {
      return c.decode(paramPattern.group(1));
    }
    throw new b("Response body is incorrect. Can't extract token and secret from this: '" + paramString + "'", null);
  }
  
  public final i Zl(String paramString)
  {
    d.fP(paramString, "Response body is incorrect. Can't extract a token from an empty string");
    return new i(b(paramString, ytH), b(paramString, ytI), paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\org\a\c\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */